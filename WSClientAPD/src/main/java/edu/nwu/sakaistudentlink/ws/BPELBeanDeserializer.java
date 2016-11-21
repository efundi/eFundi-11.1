package edu.nwu.sakaistudentlink.ws;

import java.util.Calendar;

import javax.xml.namespace.QName;

import org.apache.axis.description.TypeDesc;
import org.apache.axis.encoding.DeserializationContext;
import org.apache.axis.encoding.Deserializer;
import org.apache.axis.encoding.DeserializerImpl;
import org.apache.axis.encoding.TypeMapping;
import org.apache.axis.encoding.ser.BeanDeserializer;
import org.apache.axis.encoding.ser.SimpleDeserializer;

@SuppressWarnings("serial")
public class BPELBeanDeserializer extends BeanDeserializer {

    @SuppressWarnings("unchecked")
    public BPELBeanDeserializer(Class javaType, QName xmlType, TypeDesc typeDesc) {
        super(javaType, xmlType, typeDesc);
    }

    @SuppressWarnings("unchecked")
    protected Deserializer getDeserializer(QName xmlType, Class javaType, String href,
            DeserializationContext context) {
        if (javaType.isArray()) {
            context.setDestinationClass(javaType);
        }
        // See if we have a cached deserializer
        if (cacheStringDSer != null) {
            if (String.class.equals(javaType)
                    && href == null
                    && (cacheXMLType == null && xmlType == null || cacheXMLType != null
                            && cacheXMLType.equals(xmlType))) {
                cacheStringDSer.reset();
                return cacheStringDSer;
            }
        }
        Deserializer dSer = null;
        if (xmlType != null && href == null) {
            // Use the xmlType to get the deserializer.
            dSer = context.getDeserializerForType(xmlType);
        }
        else {
            // If the xmlType is not set, get a default xmlType
            TypeMapping tm = context.getTypeMapping();
            QName defaultXMLType = tm.getTypeQName(javaType);
            // If there is not href, then get the deserializer
            // using the javaType and default XMLType,
            // If there is an href, the create the generic
            // DeserializerImpl and set its default type (the
            // default type is used if the href'd element does 
            // not have an xsi:type.
            if (href == null) {
                dSer = context.getDeserializer(javaType, defaultXMLType);
            }
            else {
                dSer = new DeserializerImpl();
                context.setDestinationClass(javaType);
                dSer.setDefaultType(defaultXMLType);
            }
        }
        if (javaType.equals(String.class) && dSer instanceof SimpleDeserializer) {
            cacheStringDSer = (SimpleDeserializer) dSer;
            cacheXMLType = xmlType;
        }
        if (javaType.equals(Calendar.class)) {
            dSer = new BPELDateDeserializer(javaType, xmlType);
        }
        return dSer;
    }
}
