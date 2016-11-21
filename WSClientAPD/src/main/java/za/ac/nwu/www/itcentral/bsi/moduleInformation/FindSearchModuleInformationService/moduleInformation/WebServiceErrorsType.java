/**
 * WebServiceErrorsType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package za.ac.nwu.www.itcentral.bsi.moduleInformation.FindSearchModuleInformationService.moduleInformation;

public class WebServiceErrorsType  implements java.io.Serializable {
    private java.lang.String errorCategory;

    private java.lang.String errorMessage;

    public WebServiceErrorsType() {
    }

    public WebServiceErrorsType(
           java.lang.String errorCategory,
           java.lang.String errorMessage) {
           this.errorCategory = errorCategory;
           this.errorMessage = errorMessage;
    }


    /**
     * Gets the errorCategory value for this WebServiceErrorsType.
     * 
     * @return errorCategory
     */
    public java.lang.String getErrorCategory() {
        return errorCategory;
    }


    /**
     * Sets the errorCategory value for this WebServiceErrorsType.
     * 
     * @param errorCategory
     */
    public void setErrorCategory(java.lang.String errorCategory) {
        this.errorCategory = errorCategory;
    }


    /**
     * Gets the errorMessage value for this WebServiceErrorsType.
     * 
     * @return errorMessage
     */
    public java.lang.String getErrorMessage() {
        return errorMessage;
    }


    /**
     * Sets the errorMessage value for this WebServiceErrorsType.
     * 
     * @param errorMessage
     */
    public void setErrorMessage(java.lang.String errorMessage) {
        this.errorMessage = errorMessage;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof WebServiceErrorsType)) return false;
        WebServiceErrorsType other = (WebServiceErrorsType) obj;
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
            ((this.errorMessage==null && other.getErrorMessage()==null) || 
             (this.errorMessage!=null &&
              this.errorMessage.equals(other.getErrorMessage())));
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
        if (getErrorMessage() != null) {
            _hashCode += getErrorMessage().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(WebServiceErrorsType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.nwu.ac.za/itcentral/bsi/moduleInformation/FindSearchModuleInformationService/moduleInformation", "WebServiceErrorsType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("errorCategory");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.nwu.ac.za/itcentral/bsi/moduleInformation/FindSearchModuleInformationService/moduleInformation", "errorCategory"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("errorMessage");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.nwu.ac.za/itcentral/bsi/moduleInformation/FindSearchModuleInformationService/moduleInformation", "errorMessage"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
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
