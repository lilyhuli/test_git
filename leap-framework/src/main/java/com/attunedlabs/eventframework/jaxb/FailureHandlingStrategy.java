//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.02.07 at 05:55:29 PM IST 
//


package com.attunedlabs.eventframework.jaxb;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
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
 *         &lt;element name="FailureStrategyName"&gt;
 *           &lt;complexType&gt;
 *             &lt;simpleContent&gt;
 *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;string"&gt;
 *                 &lt;attribute name="handlerQualifiedClass"&gt;
 *                   &lt;simpleType&gt;
 *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                       &lt;minLength value="1"/&gt;
 *                       &lt;pattern value=".*[^\s].*"/&gt;
 *                     &lt;/restriction&gt;
 *                   &lt;/simpleType&gt;
 *                 &lt;/attribute&gt;
 *               &lt;/extension&gt;
 *             &lt;/simpleContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="FailureStrategyConfig" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
    "failureStrategyName",
    "failureStrategyConfig"
})
public class FailureHandlingStrategy
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "FailureStrategyName", required = true)
    protected FailureStrategyName failureStrategyName;
    @XmlElement(name = "FailureStrategyConfig")
    protected String failureStrategyConfig;

    /**
     * Gets the value of the failureStrategyName property.
     * 
     * @return
     *     possible object is
     *     {@link FailureStrategyName }
     *     
     */
    public FailureStrategyName getFailureStrategyName() {
        return failureStrategyName;
    }

    /**
     * Sets the value of the failureStrategyName property.
     * 
     * @param value
     *     allowed object is
     *     {@link FailureStrategyName }
     *     
     */
    public void setFailureStrategyName(FailureStrategyName value) {
        this.failureStrategyName = value;
    }

    /**
     * Gets the value of the failureStrategyConfig property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFailureStrategyConfig() {
        return failureStrategyConfig;
    }

    /**
     * Sets the value of the failureStrategyConfig property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFailureStrategyConfig(String value) {
        this.failureStrategyConfig = value;
    }

}