//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.05.27 at 03:34:18 PM IST 
//


package com.telefonica.pwdweb.wsdlimported;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="operationResponse" type="{http://telefonica.com/pwd.mgmt.webservice}operationResponse"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "operationResponse"
})
@XmlRootElement(name = "generateNewPwdResponse")
public class GenerateNewPwdResponse {

    @XmlElement(required = true)
    protected OperationResponse operationResponse;

    /**
     * Gets the value of the operationResponse property.
     * 
     * @return
     *     possible object is
     *     {@link OperationResponse }
     *     
     */
    public OperationResponse getOperationResponse() {
        return operationResponse;
    }

    /**
     * Sets the value of the operationResponse property.
     * 
     * @param value
     *     allowed object is
     *     {@link OperationResponse }
     *     
     */
    public void setOperationResponse(OperationResponse value) {
        this.operationResponse = value;
    }

}
