/**
 * WSModuleDetailResult.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package za.ac.nwu.www.itcentral.bsi.vss.APDFindSearchModuleWS.types;

public class WSModuleDetailResult  implements java.io.Serializable {
    private boolean error;

    private za.ac.nwu.www.itcentral.bsi.vss.APDFindSearchModuleWS.types.WebserviceError[] webServiceErrors;

    private za.ac.nwu.www.itcentral.bsi.vss.APDFindSearchModuleWS.types.WSModuleDetail[] results;

    public WSModuleDetailResult() {
    }

    public WSModuleDetailResult(
           boolean error,
           za.ac.nwu.www.itcentral.bsi.vss.APDFindSearchModuleWS.types.WebserviceError[] webServiceErrors,
           za.ac.nwu.www.itcentral.bsi.vss.APDFindSearchModuleWS.types.WSModuleDetail[] results) {
           this.error = error;
           this.webServiceErrors = webServiceErrors;
           this.results = results;
    }


    /**
     * Gets the error value for this WSModuleDetailResult.
     * 
     * @return error
     */
    public boolean isError() {
        return error;
    }


    /**
     * Sets the error value for this WSModuleDetailResult.
     * 
     * @param error
     */
    public void setError(boolean error) {
        this.error = error;
    }


    /**
     * Gets the webServiceErrors value for this WSModuleDetailResult.
     * 
     * @return webServiceErrors
     */
    public za.ac.nwu.www.itcentral.bsi.vss.APDFindSearchModuleWS.types.WebserviceError[] getWebServiceErrors() {
        return webServiceErrors;
    }


    /**
     * Sets the webServiceErrors value for this WSModuleDetailResult.
     * 
     * @param webServiceErrors
     */
    public void setWebServiceErrors(za.ac.nwu.www.itcentral.bsi.vss.APDFindSearchModuleWS.types.WebserviceError[] webServiceErrors) {
        this.webServiceErrors = webServiceErrors;
    }

    public za.ac.nwu.www.itcentral.bsi.vss.APDFindSearchModuleWS.types.WebserviceError getWebServiceErrors(int i) {
        return this.webServiceErrors[i];
    }

    public void setWebServiceErrors(int i, za.ac.nwu.www.itcentral.bsi.vss.APDFindSearchModuleWS.types.WebserviceError _value) {
        this.webServiceErrors[i] = _value;
    }


    /**
     * Gets the results value for this WSModuleDetailResult.
     * 
     * @return results
     */
    public za.ac.nwu.www.itcentral.bsi.vss.APDFindSearchModuleWS.types.WSModuleDetail[] getResults() {
        return results;
    }


    /**
     * Sets the results value for this WSModuleDetailResult.
     * 
     * @param results
     */
    public void setResults(za.ac.nwu.www.itcentral.bsi.vss.APDFindSearchModuleWS.types.WSModuleDetail[] results) {
        this.results = results;
    }

    public za.ac.nwu.www.itcentral.bsi.vss.APDFindSearchModuleWS.types.WSModuleDetail getResults(int i) {
        return this.results[i];
    }

    public void setResults(int i, za.ac.nwu.www.itcentral.bsi.vss.APDFindSearchModuleWS.types.WSModuleDetail _value) {
        this.results[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof WSModuleDetailResult)) return false;
        WSModuleDetailResult other = (WSModuleDetailResult) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.error == other.isError() &&
            ((this.webServiceErrors==null && other.getWebServiceErrors()==null) || 
             (this.webServiceErrors!=null &&
              java.util.Arrays.equals(this.webServiceErrors, other.getWebServiceErrors()))) &&
            ((this.results==null && other.getResults()==null) || 
             (this.results!=null &&
              java.util.Arrays.equals(this.results, other.getResults())));
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
        _hashCode += (isError() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getWebServiceErrors() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getWebServiceErrors());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getWebServiceErrors(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getResults() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getResults());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getResults(), i);
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
        new org.apache.axis.description.TypeDesc(WSModuleDetailResult.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.nwu.ac.za/itcentral/bsi/vss/APDFindSearchModuleWS/types/", "WSModuleDetailResult"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("error");
        elemField.setXmlName(new javax.xml.namespace.QName("", "error"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("webServiceErrors");
        elemField.setXmlName(new javax.xml.namespace.QName("", "webServiceErrors"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.nwu.ac.za/itcentral/bsi/vss/APDFindSearchModuleWS/types/", "WebserviceError"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("results");
        elemField.setXmlName(new javax.xml.namespace.QName("", "results"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.nwu.ac.za/itcentral/bsi/vss/APDFindSearchModuleWS/types/", "WSModuleDetail"));
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
