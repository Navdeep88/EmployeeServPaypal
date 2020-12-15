
package com.paypal.bfs.test.employeeserv.api.model;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * Employee resource
 * <p>
 * Employee resource object
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "id", "first_name", "last_name","date_of_birth","address" })
@Entity
@Table
public class Employee {

	/**
	 * employee id
	 * 
	 */
	@JsonProperty("id")
	@JsonPropertyDescription("employee id")
	@Id
    private Integer id;
	/**
	 * first name (Required)
	 * 
	 */
	@JsonProperty("first_name")
	@JsonPropertyDescription("first name")
	@Column
	private String firstName;
	/**
	 * last name (Required)
	 * 
	 */
	@JsonProperty("last_name")
	@JsonPropertyDescription("last name")
	@Column
	private String lastName;
	/**
	 * date of birth (Required)
	 * 
	 */
	@JsonProperty("date_of_birth")
	@JsonPropertyDescription("date of birth")
	@Column
	private LocalDate dateOfBirth;
	/**
	 * address (Required)
	 * 
	 */
	@JsonProperty("address")
	@JsonPropertyDescription("address")
	@Embedded
    private Address address;

	/**@JsonIgnore
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();

	
	 * employee id
	 * 
	 */
	@JsonProperty("id")
	public Integer getId() {
		return id;
	}

	/**
	 * employee id
	 * 
	 */
	@JsonProperty("id")
	public void setId(Integer id) {
		this.id = id;
	}

	/**
	 * first name (Required)
	 * 
	 */
	@JsonProperty("first_name")
	public String getFirstName() {
		return firstName;
	}

	/**
	 * first name (Required)
	 * 
	 */
	@JsonProperty("first_name")
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	/**
	 * last name (Required)
	 * 
	 */
	@JsonProperty("last_name")
	public String getLastName() {
		return lastName;
	}

	/**
	 * last name (Required)
	 * 
	 */
	@JsonProperty("last_name")
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	/**
	 * dateOfBirth (Required)
	 * 
	 */
	@JsonProperty("date_of_birth")
	public LocalDate getDateOfBirth() {
		return dateOfBirth;
	}

	/**
	 * dateOfBirth (Required)
	 * 
	 */
	@JsonProperty("date_of_birth")
	public void setDateOfBirth(LocalDate dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	/**
	 * address (Required)
	 * 
	 */
	@JsonProperty("address")
	public Address getAddress() {
		return address;
	}

	/**
	 * address (Required)
	 * 
	 */
	@JsonProperty("address")
	public void setAddress(Address address) {
		this.address = address;
	}

	/**@JsonAnyGetter
	public Map<String, Object> getAdditionalProperties() {
		return this.additionalProperties;
	}

	@JsonAnySetter
	public void setAdditionalProperty(String name, Object value) {
		this.additionalProperties.put(name, value);
	}*/

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(Employee.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this)))
				.append('[');
		sb.append("id");
		sb.append('=');
		sb.append(((this.id == null) ? "<null>" : this.id));
		sb.append(',');
		sb.append("firstName");
		sb.append('=');
		sb.append(((this.firstName == null) ? "<null>" : this.firstName));
		sb.append(',');
		sb.append("lastName");
		sb.append('=');
		sb.append(((this.lastName == null) ? "<null>" : this.lastName));
		sb.append(',');
		sb.append("dateOfBirth");
		sb.append('=');
		sb.append(((this.dateOfBirth == null) ? "<null>" : this.dateOfBirth));
		sb.append(',');
		sb.append("address");
		sb.append('=');
		sb.append(((this.address == null) ? "<null>" : this.address));
		sb.append(',');
		/*sb.append("additionalProperties");
		sb.append('=');
		sb.append(((this.additionalProperties == null) ? "<null>" : this.additionalProperties));
		sb.append(',');*/
		if (sb.charAt((sb.length() - 1)) == ',') {
			sb.setCharAt((sb.length() - 1), ']');
		} else {
			sb.append(']');
		}
		return sb.toString();
	}

}
