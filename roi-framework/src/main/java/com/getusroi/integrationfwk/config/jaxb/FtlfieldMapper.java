//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.07.29 at 07:41:38 PM IST 
//


package com.getusroi.integrationfwk.config.jaxb;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;simpleContent>
 *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
 *       &lt;attribute name="msgXpath" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="ftlField" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/extension>
 *   &lt;/simpleContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "value"
})
public class FtlfieldMapper
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlValue
    protected String value;
    @XmlAttribute(name = "msgXpath", required = true)
    protected String msgXpath;
    @XmlAttribute(name = "ftlField", required = true)
    protected String ftlField;

    /**
     * Gets the value of the value property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValue(String value) {
        this.value = value;
    }

    /**
     * Gets the value of the msgXpath property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMsgXpath() {
        return msgXpath;
    }

    /**
     * Sets the value of the msgXpath property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMsgXpath(String value) {
        this.msgXpath = value;
    }

    /**
     * Gets the value of the ftlField property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFtlField() {
        return ftlField;
    }

    /**
     * Sets the value of the ftlField property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFtlField(String value) {
        this.ftlField = value;
    }

}
