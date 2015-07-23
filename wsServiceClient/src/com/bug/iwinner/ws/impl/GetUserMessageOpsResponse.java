
package com.bug.iwinner.ws.impl;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getUserMessageOpsResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getUserMessageOpsResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="getUserMessageRespone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getUserMessageOpsResponse", propOrder = {
    "getUserMessageRespone"
})
public class GetUserMessageOpsResponse {

    protected String getUserMessageRespone;

    /**
     * Gets the value of the getUserMessageRespone property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGetUserMessageRespone() {
        return getUserMessageRespone;
    }

    /**
     * Sets the value of the getUserMessageRespone property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGetUserMessageRespone(String value) {
        this.getUserMessageRespone = value;
    }

}
