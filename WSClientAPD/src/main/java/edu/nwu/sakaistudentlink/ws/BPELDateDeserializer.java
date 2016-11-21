package edu.nwu.sakaistudentlink.ws;

import javax.xml.namespace.QName;

import org.apache.axis.encoding.ser.DateDeserializer;

/**
 * This deserializer will not fail on empty dates returned from bpel.
 * @author pctjs
 *
 */
public class BPELDateDeserializer extends DateDeserializer {

    private static final long serialVersionUID = -86975773076293691L;

    public BPELDateDeserializer(Class<?> javaType, QName xmlType) {
        super(javaType, xmlType);
    }

    @Override
    public Object makeValue(String source) {
        if (source == null || source.trim().length() == 0) {
            return null;
        }
        return super.makeValue(source);
    }
}
