//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.02.19 at 05:01:20 PM IST 
//


package com.attunedlabs.integrationfwk.config.jaxb;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="FeatureContext" minOccurs="0">
 *           &lt;complexType>
 *             &lt;simpleContent>
 *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
 *                 &lt;attribute name="FeatureGroup" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="FeatureName" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="VendorName" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="Version" type="{http://www.w3.org/2001/XMLSchema}string" />
 *               &lt;/extension>
 *             &lt;/simpleContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="ServiceName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ExecutionRoute" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *       &lt;attribute name="isSameFeature" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "featureContext",
    "serviceName",
    "executionRoute"
})
public class CamelRoute
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "FeatureContext")
    protected FeatureContext featureContext;
    @XmlElement(name = "ServiceName", required = true)
    protected String serviceName;
    @XmlElement(name = "ExecutionRoute", required = true)
    protected String executionRoute;
    @XmlAttribute(name = "isSameFeature")
    protected Boolean isSameFeature;

    /**
     * Gets the value of the featureContext property.
     * 
     * @return
     *     possible object is
     *     {@link FeatureContext }
     *     
     */
    public FeatureContext getFeatureContext() {
        return featureContext;
    }

    /**
     * Sets the value of the featureContext property.
     * 
     * @param value
     *     allowed object is
     *     {@link FeatureContext }
     *     
     */
    public void setFeatureContext(FeatureContext value) {
        this.featureContext = value;
    }

    /**
     * Gets the value of the serviceName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServiceName() {
        return serviceName;
    }

    /**
     * Sets the value of the serviceName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServiceName(String value) {
        this.serviceName = value;
    }

    /**
     * Gets the value of the executionRoute property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExecutionRoute() {
        return executionRoute;
    }

    /**
     * Sets the value of the executionRoute property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExecutionRoute(String value) {
        this.executionRoute = value;
    }

    /**
     * Gets the value of the isSameFeature property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsSameFeature() {
        return isSameFeature;
    }

    /**
     * Sets the value of the isSameFeature property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsSameFeature(Boolean value) {
        this.isSameFeature = value;
    }

}
