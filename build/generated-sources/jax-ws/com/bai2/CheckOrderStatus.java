
package com.bai2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for checkOrderStatus complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="checkOrderStatus">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ordNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="comId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "checkOrderStatus", propOrder = {
    "ordNo",
    "comId"
})
public class CheckOrderStatus {

    protected String ordNo;
    protected String comId;

    /**
     * Gets the value of the ordNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrdNo() {
        return ordNo;
    }

    /**
     * Sets the value of the ordNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrdNo(String value) {
        this.ordNo = value;
    }

    /**
     * Gets the value of the comId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getComId() {
        return comId;
    }

    /**
     * Sets the value of the comId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setComId(String value) {
        this.comId = value;
    }

}
