/**
 * WebserviceError.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package za.ac.nwu.www.itcentral.bsi.vss.APDFindSearchModuleWS.types;

public class WebserviceError  implements java.io.Serializable {
    private java.lang.String errorCategory;

    private java.lang.String errorKey;

    private java.lang.String errorMessage;

    private java.lang.String[] parameters;

    public WebserviceError() {
    }

    public WebserviceError(
           java.lang.String errorCategory,
           java.lang.String errorKey,
           java.lang.String errorMessage,
           java.lang.String[] parameters) {
           this.errorCategory = errorCategory;
           this.errorKey = errorKey;
           this.errorMessage = errorMessage;
           this.parameters = parameters;
    }


    /**
     * Gets the errorCategory value for this WebserviceError.
     * 
     * @return errorCategory
     */
    public java.lang.String getErrorCategory() {
        return errorCategory;
    }


    /**
     * Sets the errorCategory value for this WebserviceError.
     * 
     * @param errorCategory
     */
    public void setErrorCategory(java.lang.String errorCategory) {
        this.errorCategory = errorCategory;
    }


    /**
     * Gets the errorKey value for this WebserviceError.
     * 
     * @return errorKey
     */
    public java.lang.String getErrorKey() {
        return errorKey;
    }


    /**
     * Sets the errorKey value for this WebserviceError.
     * 
     * @param errorKey
     */
    public void setErrorKey(java.lang.String errorKey) {
        this.errorKey = errorKey;
    }


    /**
     * Gets the errorMessage value for this WebserviceError.
     * 
     * @return errorMessage
     */
    public java.lang.String getErrorMessage() {
        return errorMessage;
    }


    /**
     * Sets the errorMessage value for this WebserviceError.
     * 
     * @param errorMessage
     */
    public void setErrorMessage(java.lang.String errorMessage) {
        this.errorMessage = errorMessage;
    }


    /**
     * Gets the parameters value for this WebserviceError.
     * 
     * @return parameters
     */
    public java.lang.String[] getParameters() {
        return parameters;
    }


    /**
     * Sets the parameters value for this WebserviceError.
     * 
     * @param parameters
     */
    public void setParameters(java.lang.String[] parameters) {
        this.parameters = parameters;
    }

    public java.lang.String getParameters(int i) {
        return this.parameters[i];
    }

    public void setParameters(int i, java.lang.String _value) {
        this.parameters[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof WebserviceError)) return false;
        WebserviceError other = (WebserviceError) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.errorCategory==null && other.getErrorCategory()==null) || 
             (this.errorCategory!=null &&
              this.errorCategory.equals(other.getErrorCategory()))) &&
            ((this.errorKey==null && other.getErrorKey()==null) || 
             (this.errorKey!=null &&
              this.errorKey.equals(other.getErrorKey()))) &&
            ((this.errorMessage==null && other.getErrorMessage()==null) || 
             (this.errorMessage!=null &&
              this.errorMessage.equals(other.getErrorMessage()))) &&
            ((this.parameters==null && other.getParameters()==null) || 
             (this.parameters!=null &&
              java.util.Arrays.equals(this.parameters, other.getParameters())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getErrorCategory() != null) {
            _hashCode += getErrorCategory().hashCode();
        }
        if (getErrorKey() != null) {
            _hashCode += getErrorKey().hashCode();
        }
        if (getErrorMessage() != null) {
            _hashCode += getErrorMessage().hashCode();
        }
        if (getParameters() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getParameters());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getParameters(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(WebserviceError.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.nwu.ac.za/itcentral/bsi/vss/APDFindSearchModuleWS/types/", "WebserviceError"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("errorCategory");
        elemField.setXmlName(new javax.xml.namespace.QName("", "errorCategory"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("errorKey");
        elemField.setXmlName(new javax.xml.namespace.QName("", "errorKey"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("errorMessage");
        elemField.setXmlName(new javax.xml.namespace.QName("", "errorMessage"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("parameters");
        elemField.setXmlName(new javax.xml.namespace.QName("", "parameters"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
