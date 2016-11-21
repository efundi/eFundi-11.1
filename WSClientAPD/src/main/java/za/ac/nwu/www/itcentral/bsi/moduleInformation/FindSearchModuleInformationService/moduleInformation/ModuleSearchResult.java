/**
 * ModuleSearchResult.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package za.ac.nwu.www.itcentral.bsi.moduleInformation.FindSearchModuleInformationService.moduleInformation;

public class ModuleSearchResult  implements java.io.Serializable {
    private boolean error;

    private za.ac.nwu.www.itcentral.bsi.moduleInformation.FindSearchModuleInformationService.moduleInformation.WebServiceErrorsType[] webServiceErrors;

    private za.ac.nwu.www.itcentral.bsi.moduleInformation.FindSearchModuleInformationService.moduleInformation.ModuleResultType[] individuals;

    public ModuleSearchResult() {
    }

    public ModuleSearchResult(
           boolean error,
           za.ac.nwu.www.itcentral.bsi.moduleInformation.FindSearchModuleInformationService.moduleInformation.WebServiceErrorsType[] webServiceErrors,
           za.ac.nwu.www.itcentral.bsi.moduleInformation.FindSearchModuleInformationService.moduleInformation.ModuleResultType[] individuals) {
           this.error = error;
           this.webServiceErrors = webServiceErrors;
           this.individuals = individuals;
    }


    /**
     * Gets the error value for this ModuleSearchResult.
     * 
     * @return error
     */
    public boolean isError() {
        return error;
    }


    /**
     * Sets the error value for this ModuleSearchResult.
     * 
     * @param error
     */
    public void setError(boolean error) {
        this.error = error;
    }


    /**
     * Gets the webServiceErrors value for this ModuleSearchResult.
     * 
     * @return webServiceErrors
     */
    public za.ac.nwu.www.itcentral.bsi.moduleInformation.FindSearchModuleInformationService.moduleInformation.WebServiceErrorsType[] getWebServiceErrors() {
        return webServiceErrors;
    }


    /**
     * Sets the webServiceErrors value for this ModuleSearchResult.
     * 
     * @param webServiceErrors
     */
    public void setWebServiceErrors(za.ac.nwu.www.itcentral.bsi.moduleInformation.FindSearchModuleInformationService.moduleInformation.WebServiceErrorsType[] webServiceErrors) {
        this.webServiceErrors = webServiceErrors;
    }

    public za.ac.nwu.www.itcentral.bsi.moduleInformation.FindSearchModuleInformationService.moduleInformation.WebServiceErrorsType getWebServiceErrors(int i) {
        return this.webServiceErrors[i];
    }

    public void setWebServiceErrors(int i, za.ac.nwu.www.itcentral.bsi.moduleInformation.FindSearchModuleInformationService.moduleInformation.WebServiceErrorsType _value) {
        this.webServiceErrors[i] = _value;
    }


    /**
     * Gets the individuals value for this ModuleSearchResult.
     * 
     * @return individuals
     */
    public za.ac.nwu.www.itcentral.bsi.moduleInformation.FindSearchModuleInformationService.moduleInformation.ModuleResultType[] getIndividuals() {
        return individuals;
    }


    /**
     * Sets the individuals value for this ModuleSearchResult.
     * 
     * @param individuals
     */
    public void setIndividuals(za.ac.nwu.www.itcentral.bsi.moduleInformation.FindSearchModuleInformationService.moduleInformation.ModuleResultType[] individuals) {
        this.individuals = individuals;
    }

    public za.ac.nwu.www.itcentral.bsi.moduleInformation.FindSearchModuleInformationService.moduleInformation.ModuleResultType getIndividuals(int i) {
        return this.individuals[i];
    }

    public void setIndividuals(int i, za.ac.nwu.www.itcentral.bsi.moduleInformation.FindSearchModuleInformationService.moduleInformation.ModuleResultType _value) {
        this.individuals[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ModuleSearchResult)) return false;
        ModuleSearchResult other = (ModuleSearchResult) obj;
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
            ((this.individuals==null && other.getIndividuals()==null) || 
             (this.individuals!=null &&
              java.util.Arrays.equals(this.individuals, other.getIndividuals())));
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
        if (getIndividuals() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getIndividuals());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getIndividuals(), i);
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
        new org.apache.axis.description.TypeDesc(ModuleSearchResult.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.nwu.ac.za/itcentral/bsi/moduleInformation/FindSearchModuleInformationService/moduleInformation", ">ModuleSearchResult"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("error");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.nwu.ac.za/itcentral/bsi/moduleInformation/FindSearchModuleInformationService/moduleInformation", "error"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("webServiceErrors");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.nwu.ac.za/itcentral/bsi/moduleInformation/FindSearchModuleInformationService/moduleInformation", "webServiceErrors"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.nwu.ac.za/itcentral/bsi/moduleInformation/FindSearchModuleInformationService/moduleInformation", "WebServiceErrorsType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("individuals");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.nwu.ac.za/itcentral/bsi/moduleInformation/FindSearchModuleInformationService/moduleInformation", "individuals"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.nwu.ac.za/itcentral/bsi/moduleInformation/FindSearchModuleInformationService/moduleInformation", "ModuleResultType"));
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
