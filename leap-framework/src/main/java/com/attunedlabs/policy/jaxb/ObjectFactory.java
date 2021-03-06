//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.12.12 at 01:54:48 PM IST 
//


package com.attunedlabs.policy.jaxb;

import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.attunedlabs.policy.jaxb package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {


    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.attunedlabs.policy.jaxb
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Policies }
     * 
     */
    public Policies createPolicies() {
        return new Policies();
    }

    /**
     * Create an instance of {@link Policy }
     * 
     */
    public Policy createPolicy() {
        return new Policy();
    }

    /**
     * Create an instance of {@link Feature }
     * 
     */
    public Feature createFeature() {
        return new Feature();
    }

    /**
     * Create an instance of {@link Fact }
     * 
     */
    public Fact createFact() {
        return new Fact();
    }

    /**
     * Create an instance of {@link PolicyEvaluation }
     * 
     */
    public PolicyEvaluation createPolicyEvaluation() {
        return new PolicyEvaluation();
    }

    /**
     * Create an instance of {@link PolicyResponse }
     * 
     */
    public PolicyResponse createPolicyResponse() {
        return new PolicyResponse();
    }

    /**
     * Create an instance of {@link PolicyDefinedFact }
     * 
     */
    public PolicyDefinedFact createPolicyDefinedFact() {
        return new PolicyDefinedFact();
    }

    /**
     * Create an instance of {@link FactDescription }
     * 
     */
    public FactDescription createFactDescription() {
        return new FactDescription();
    }

    /**
     * Create an instance of {@link FactAttribute }
     * 
     */
    public FactAttribute createFactAttribute() {
        return new FactAttribute();
    }

    /**
     * Create an instance of {@link Evaluation }
     * 
     */
    public Evaluation createEvaluation() {
        return new Evaluation();
    }

    /**
     * Create an instance of {@link Expression }
     * 
     */
    public Expression createExpression() {
        return new Expression();
    }

}
