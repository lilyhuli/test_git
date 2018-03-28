//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.12.12 at 01:54:48 PM IST 
//


package com.attunedlabs.policy.jaxb;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for policyResponseType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="policyResponseType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="policyDefinedFact"/>
 *     &lt;enumeration value="mappedFact"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "policyResponseType")
@XmlEnum
public enum PolicyResponseType {

    @XmlEnumValue("policyDefinedFact")
    POLICY_DEFINED_FACT("policyDefinedFact"),
    @XmlEnumValue("mappedFact")
    MAPPED_FACT("mappedFact");
    private final String value;

    PolicyResponseType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static PolicyResponseType fromValue(String v) {
        for (PolicyResponseType c: PolicyResponseType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
