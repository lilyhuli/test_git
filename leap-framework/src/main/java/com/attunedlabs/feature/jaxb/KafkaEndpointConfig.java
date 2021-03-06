//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.09.19 at 05:34:04 PM IST 
//


package com.attunedlabs.feature.jaxb;

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
 *       &lt;attribute name="brokerHostPort" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="topicName" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="groupId" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="clientId" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="sslTruststoreLocation" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="sslTruststorePassword" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
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
public class KafkaEndpointConfig
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlValue
    protected String value;
    @XmlAttribute(name = "brokerHostPort", required = true)
    protected String brokerHostPort;
    @XmlAttribute(name = "topicName", required = true)
    protected String topicName;
    @XmlAttribute(name = "groupId", required = true)
    protected String groupId;
    @XmlAttribute(name = "clientId", required = true)
    protected String clientId;
    @XmlAttribute(name = "sslTruststoreLocation", required = true)
    protected String sslTruststoreLocation;
    @XmlAttribute(name = "sslTruststorePassword", required = true)
    protected String sslTruststorePassword;

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
     * Gets the value of the brokerHostPort property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBrokerHostPort() {
        return brokerHostPort;
    }

    /**
     * Sets the value of the brokerHostPort property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBrokerHostPort(String value) {
        this.brokerHostPort = value;
    }

    /**
     * Gets the value of the topicName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTopicName() {
        return topicName;
    }

    /**
     * Sets the value of the topicName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTopicName(String value) {
        this.topicName = value;
    }

    /**
     * Gets the value of the groupId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGroupId() {
        return groupId;
    }

    /**
     * Sets the value of the groupId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGroupId(String value) {
        this.groupId = value;
    }

    /**
     * Gets the value of the clientId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClientId() {
        return clientId;
    }

    /**
     * Sets the value of the clientId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClientId(String value) {
        this.clientId = value;
    }

    /**
     * Gets the value of the sslTruststoreLocation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSslTruststoreLocation() {
        return sslTruststoreLocation;
    }

    /**
     * Sets the value of the sslTruststoreLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSslTruststoreLocation(String value) {
        this.sslTruststoreLocation = value;
    }

    /**
     * Gets the value of the sslTruststorePassword property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSslTruststorePassword() {
        return sslTruststorePassword;
    }

    /**
     * Sets the value of the sslTruststorePassword property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSslTruststorePassword(String value) {
        this.sslTruststorePassword = value;
    }

}
