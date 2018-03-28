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
 *         &lt;element name="DispatchChanelId" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="EventTransformation"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="XSLTName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="CustomTransformer" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;simpleContent&gt;
 *                         &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;string"&gt;
 *                           &lt;attribute name="fqcn" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                         &lt;/extension&gt;
 *                       &lt;/simpleContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                 &lt;/sequence&gt;
 *                 &lt;attribute name="Type" use="required"&gt;
 *                   &lt;simpleType&gt;
 *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                       &lt;enumeration value="XML-XSLT"/&gt;
 *                       &lt;enumeration value="JSON"/&gt;
 *                       &lt;enumeration value="CUSTOM"/&gt;
 *                     &lt;/restriction&gt;
 *                   &lt;/simpleType&gt;
 *                 &lt;/attribute&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
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
    "dispatchChanelId",
    "eventTransformation"
})
public class EventDispatcher
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "DispatchChanelId", namespace = "http://attunedlabs.com/internalevents/Dispatcher", required = true)
    protected String dispatchChanelId;
    @XmlElement(name = "EventTransformation", namespace = "http://attunedlabs.com/internalevents/Dispatcher", required = true)
    protected EventTransformation eventTransformation;

    /**
     * Gets the value of the dispatchChanelId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDispatchChanelId() {
        return dispatchChanelId;
    }

    /**
     * Sets the value of the dispatchChanelId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDispatchChanelId(String value) {
        this.dispatchChanelId = value;
    }

    /**
     * Gets the value of the eventTransformation property.
     * 
     * @return
     *     possible object is
     *     {@link EventTransformation }
     *     
     */
    public EventTransformation getEventTransformation() {
        return eventTransformation;
    }

    /**
     * Sets the value of the eventTransformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link EventTransformation }
     *     
     */
    public void setEventTransformation(EventTransformation value) {
        this.eventTransformation = value;
    }

}