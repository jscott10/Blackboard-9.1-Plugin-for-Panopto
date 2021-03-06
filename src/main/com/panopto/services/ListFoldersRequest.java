/**
 * ListFoldersRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.panopto.services;

public class ListFoldersRequest  implements java.io.Serializable {
    private com.panopto.services.Pagination pagination;

    private java.lang.String parentFolderId;

    private java.lang.Boolean publicOnly;

    private com.panopto.services.FolderSortField sortBy;

    private java.lang.Boolean sortIncreasing;

    public ListFoldersRequest() {
    }

    public ListFoldersRequest(
           com.panopto.services.Pagination pagination,
           java.lang.String parentFolderId,
           java.lang.Boolean publicOnly,
           com.panopto.services.FolderSortField sortBy,
           java.lang.Boolean sortIncreasing) {
           this.pagination = pagination;
           this.parentFolderId = parentFolderId;
           this.publicOnly = publicOnly;
           this.sortBy = sortBy;
           this.sortIncreasing = sortIncreasing;
    }


    /**
     * Gets the pagination value for this ListFoldersRequest.
     * 
     * @return pagination
     */
    public com.panopto.services.Pagination getPagination() {
        return pagination;
    }


    /**
     * Sets the pagination value for this ListFoldersRequest.
     * 
     * @param pagination
     */
    public void setPagination(com.panopto.services.Pagination pagination) {
        this.pagination = pagination;
    }


    /**
     * Gets the parentFolderId value for this ListFoldersRequest.
     * 
     * @return parentFolderId
     */
    public java.lang.String getParentFolderId() {
        return parentFolderId;
    }


    /**
     * Sets the parentFolderId value for this ListFoldersRequest.
     * 
     * @param parentFolderId
     */
    public void setParentFolderId(java.lang.String parentFolderId) {
        this.parentFolderId = parentFolderId;
    }


    /**
     * Gets the publicOnly value for this ListFoldersRequest.
     * 
     * @return publicOnly
     */
    public java.lang.Boolean getPublicOnly() {
        return publicOnly;
    }


    /**
     * Sets the publicOnly value for this ListFoldersRequest.
     * 
     * @param publicOnly
     */
    public void setPublicOnly(java.lang.Boolean publicOnly) {
        this.publicOnly = publicOnly;
    }


    /**
     * Gets the sortBy value for this ListFoldersRequest.
     * 
     * @return sortBy
     */
    public com.panopto.services.FolderSortField getSortBy() {
        return sortBy;
    }


    /**
     * Sets the sortBy value for this ListFoldersRequest.
     * 
     * @param sortBy
     */
    public void setSortBy(com.panopto.services.FolderSortField sortBy) {
        this.sortBy = sortBy;
    }


    /**
     * Gets the sortIncreasing value for this ListFoldersRequest.
     * 
     * @return sortIncreasing
     */
    public java.lang.Boolean getSortIncreasing() {
        return sortIncreasing;
    }


    /**
     * Sets the sortIncreasing value for this ListFoldersRequest.
     * 
     * @param sortIncreasing
     */
    public void setSortIncreasing(java.lang.Boolean sortIncreasing) {
        this.sortIncreasing = sortIncreasing;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ListFoldersRequest)) return false;
        ListFoldersRequest other = (ListFoldersRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.pagination==null && other.getPagination()==null) || 
             (this.pagination!=null &&
              this.pagination.equals(other.getPagination()))) &&
            ((this.parentFolderId==null && other.getParentFolderId()==null) || 
             (this.parentFolderId!=null &&
              this.parentFolderId.equals(other.getParentFolderId()))) &&
            ((this.publicOnly==null && other.getPublicOnly()==null) || 
             (this.publicOnly!=null &&
              this.publicOnly.equals(other.getPublicOnly()))) &&
            ((this.sortBy==null && other.getSortBy()==null) || 
             (this.sortBy!=null &&
              this.sortBy.equals(other.getSortBy()))) &&
            ((this.sortIncreasing==null && other.getSortIncreasing()==null) || 
             (this.sortIncreasing!=null &&
              this.sortIncreasing.equals(other.getSortIncreasing())));
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
        if (getPagination() != null) {
            _hashCode += getPagination().hashCode();
        }
        if (getParentFolderId() != null) {
            _hashCode += getParentFolderId().hashCode();
        }
        if (getPublicOnly() != null) {
            _hashCode += getPublicOnly().hashCode();
        }
        if (getSortBy() != null) {
            _hashCode += getSortBy().hashCode();
        }
        if (getSortIncreasing() != null) {
            _hashCode += getSortIncreasing().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ListFoldersRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Panopto.Server.Services.PublicAPI.V40", "ListFoldersRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pagination");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Panopto.Server.Services.PublicAPI.V40", "Pagination"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Panopto.Server.Services.PublicAPI.V40", "Pagination"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("parentFolderId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Panopto.Server.Services.PublicAPI.V40", "ParentFolderId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("publicOnly");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Panopto.Server.Services.PublicAPI.V40", "PublicOnly"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sortBy");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Panopto.Server.Services.PublicAPI.V40", "SortBy"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Panopto.Server.Services.PublicAPI.V40", "FolderSortField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sortIncreasing");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Panopto.Server.Services.PublicAPI.V40", "SortIncreasing"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
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
