package edu.nwu.sakaistudentlink.ws;

import javax.xml.namespace.QName;

import org.apache.axis.encoding.ser.BaseDeserializerFactory;

public class BPELDateDeserializerFactory extends BaseDeserializerFactory {

    private static final long serialVersionUID = 4177456628496352463L;

    public BPELDateDeserializerFactory(Class<?> javaType, QName xmlType) {
        super(BPELDateDeserializer.class, xmlType, javaType);
    }
}
