//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.10.28 at 12:43:02 PM IST 
//

package com.attunedlabs.datacontext.jaxb;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for anonymous complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="dbBeanRefName" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="dbType" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="dbHost" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="dbPort" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="dbSchema" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="dbUser" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="dbPassword" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
public class DataContext implements Serializable {

	@Override
	public String toString() {
		return "DataContext [dbBeanRefName=" + dbBeanRefName + ", dbType=" + dbType + ", dbHost=" + dbHost + ", dbPort="
				+ dbPort + ", dbSchema=" + dbSchema + ", dbUser=" + dbUser + ", dbPassword=" + dbPassword + ", dbUrl="
				+ dbUrl + ", dbDriver=" + dbDriver + "]";
	}

	private final static long serialVersionUID = 1L;
	@XmlAttribute(name = "dbBeanRefName")
	protected String dbBeanRefName;
	@XmlAttribute(name = "dbType", required = true)
	protected String dbType;
	@XmlAttribute(name = "dbHost")
	protected String dbHost;
	@XmlAttribute(name = "dbPort")
	protected String dbPort;
	@XmlAttribute(name = "dbSchema")
	protected String dbSchema;
	@XmlAttribute(name = "dbUser")
	protected String dbUser;
	@XmlAttribute(name = "dbPassword")
	protected String dbPassword;
	@XmlAttribute(name = "dbUrl")
	protected String dbUrl;
	@XmlAttribute(name = "dbDriver")
	protected String dbDriver;

	/**
	 * Gets the value of the dbBeanRefName property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getDbBeanRefName() {
		return dbBeanRefName;
	}

	/**
	 * Sets the value of the dbBeanRefName property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setDbBeanRefName(String value) {
		this.dbBeanRefName = value;
	}

	/**
	 * Gets the value of the dbType property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getDbType() {
		return dbType;
	}

	/**
	 * Sets the value of the dbType property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setDbType(String value) {
		this.dbType = value;
	}

	/**
	 * Gets the value of the dbHost property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getDbHost() {
		return dbHost;
	}

	/**
	 * Sets the value of the dbHost property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setDbHost(String value) {
		this.dbHost = value;
	}

	/**
	 * Gets the value of the dbPort property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getDbPort() {
		return dbPort;
	}

	/**
	 * Sets the value of the dbPort property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setDbPort(String value) {
		this.dbPort = value;
	}

	/**
	 * Gets the value of the dbSchema property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getDbSchema() {
		return dbSchema;
	}

	/**
	 * Sets the value of the dbSchema property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setDbSchema(String value) {
		this.dbSchema = value;
	}

	/**
	 * Gets the value of the dbUser property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getDbUser() {
		return dbUser;
	}

	/**
	 * Sets the value of the dbUser property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setDbUser(String value) {
		this.dbUser = value;
	}

	/**
	 * Gets the value of the dbPassword property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getDbPassword() {
		return dbPassword;
	}

	/**
	 * Sets the value of the dbPassword property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setDbPassword(String value) {
		this.dbPassword = value;
	}

	public String getDbUrl() {
		return dbUrl;
	}

	public void setDbUrl(String dbUrl) {
		this.dbUrl = dbUrl;
	}

	public String getDbDriver() {
		return dbDriver;
	}

	public void setDbDriver(String dbDriver) {
		this.dbDriver = dbDriver;
	}

}
