
package com.bug.iwinner.ws.impl;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getInsertEmployeeOps complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getInsertEmployeeOps">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="bugDTO" type="{http://impl.ws.iwinner.bug.com/}bugDTO" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getInsertEmployeeOps", propOrder = {
    "bugDTO"
})
public class GetInsertEmployeeOps {

    protected BugDTO bugDTO;

    /**
     * Gets the value of the bugDTO property.
     * 
     * @return
     *     possible object is
     *     {@link BugDTO }
     *     
     */
    public BugDTO getBugDTO() {
        return bugDTO;
    }

    /**
     * Sets the value of the bugDTO property.
     * 
     * @param value
     *     allowed object is
     *     {@link BugDTO }
     *     
     */
    public void setBugDTO(BugDTO value) {
        this.bugDTO = value;
    }

}
