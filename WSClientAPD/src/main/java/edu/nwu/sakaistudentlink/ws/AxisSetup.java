package edu.nwu.sakaistudentlink.ws;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.concurrent.atomic.AtomicBoolean;

import javax.xml.namespace.QName;

import org.apache.axis.Constants;
import org.apache.axis.encoding.DefaultJAXRPC11TypeMappingImpl;
import org.apache.axis.encoding.DefaultSOAPEncodingTypeMappingImpl;
import org.apache.axis.encoding.DeserializerFactory;
import org.apache.axis.encoding.SerializerFactory;
import org.apache.axis.encoding.ser.DateSerializerFactory;

/**
 * A utility setup class for Axis
 * 
 *
 */
public class AxisSetup {

    private static AtomicBoolean isSetup = new AtomicBoolean(false);

    private AxisSetup() {
    }

    /**
     * Call this method to do the general setup.
     * You can call this method as many times as you like. The setup
     * will only be done once.
     *
     */
    public static void setup() {
        if (isSetup.compareAndSet(false, true)) {
            registerCustomDateDeserialization(Date.class, Calendar.class, GregorianCalendar.class);
        }
    }

    private static void registerCustomDateDeserialization(Class<?>... classes) {
        if (Constants.XSD_DATE.getNamespaceURI().equals(Constants.URI_DEFAULT_SCHEMA_XSD)) {
            for (int i = 0; i < Constants.URIS_SCHEMA_XSD.length; i++) {
                QName qName = new QName(Constants.URIS_SCHEMA_XSD[i], Constants.XSD_DATE
                        .getLocalPart());
                registerCustomDateDeserialization(qName, classes);
            }
        }
        else if (Constants.XSD_DATE.getNamespaceURI().equals(Constants.URI_DEFAULT_SOAP_ENC)) {
            for (int i = 0; i < Constants.URIS_SOAP_ENC.length; i++) {
                QName qName = new QName(Constants.URIS_SOAP_ENC[i], Constants.XSD_DATE
                        .getLocalPart());
                registerCustomDateDeserialization(qName, classes);
            }
        }
        else {
            registerCustomDateDeserialization(Constants.XSD_DATE, classes);
        }
        //        if (Constants.XSD_DATETIME.getNamespaceURI().equals(Constants.URI_DEFAULT_SCHEMA_XSD)) {
        //            for (int i = 0; i < Constants.URIS_SCHEMA_XSD.length; i++) {
        //                QName qName = new QName(Constants.URIS_SCHEMA_XSD[i], Constants.XSD_DATETIME
        //                        .getLocalPart());
        //                registerCustomDateDeserialization(qName, classes);
        //            }
        //        }
        //        else if (Constants.XSD_DATETIME.getNamespaceURI().equals(Constants.URI_DEFAULT_SOAP_ENC)) {
        //            for (int i = 0; i < Constants.URIS_SOAP_ENC.length; i++) {
        //                QName qName = new QName(Constants.URIS_SOAP_ENC[i], Constants.XSD_DATETIME
        //                        .getLocalPart());
        //                registerCustomDateDeserialization(qName, classes);
        //            }
        //        }
        //        else {
        //            registerCustomDateDeserialization(Constants.XSD_DATETIME, classes);
        //        }
    }

    private static void registerCustomDateDeserialization(QName qName, Class<?>... classes) {
        for (Class<?> clazz : classes) {
            SerializerFactory sf = new DateSerializerFactory(clazz, qName);
            DeserializerFactory df = new BPELDateDeserializerFactory(clazz, qName);
            //cover all the bases
            DefaultJAXRPC11TypeMappingImpl.getSingleton().register(clazz, qName,
                DefaultJAXRPC11TypeMappingImpl.getSingleton().getSerializer(clazz, qName), df);
            DefaultJAXRPC11TypeMappingImpl.getSingletonDelegate().register(clazz, qName,
                DefaultJAXRPC11TypeMappingImpl.getSingletonDelegate().getSerializer(clazz, qName),
                df);
            DefaultSOAPEncodingTypeMappingImpl.getSingleton().register(clazz, qName,
                DefaultSOAPEncodingTypeMappingImpl.getSingleton().getSerializer(clazz, qName), df);
            DefaultSOAPEncodingTypeMappingImpl.getSingletonDelegate().register(
                clazz,
                qName,
                DefaultSOAPEncodingTypeMappingImpl.getSingletonDelegate().getSerializer(clazz,
                    qName), df);
            //            DefaultTypeMappingImpl.getSingletonDelegate().register(clazz, qName, sf, df);
        }
    }
}
