package com.paypal.bfs.test.employeeserv.api.model;

import javax.persistence.Embeddable;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "line1",
    "city",
    "state",
    "country",
    "zip_code"
})
@Embeddable
public class Address {
	
	@JsonProperty("line1")
    @JsonPropertyDescription("line1")
    private	String line1;
	
	
	@JsonProperty("line2")
    @JsonPropertyDescription("line2")
    private	String line2;
	
	@JsonProperty("city")
    @JsonPropertyDescription("city")
    private	String city;
	
	@JsonProperty("state")
    @JsonPropertyDescription("state")
	private	String state;
	
	@JsonProperty("country")
    @JsonPropertyDescription("country")
	private	String country;
	
	@JsonProperty("zip_code")
    @JsonPropertyDescription("zip code")
private	String zip_code;

public Address() {}

public Address(String line1, String line2, String city, String state, String country, String zip_code) {
	super();
	this.line1 = line1;
	this.line2 = line2;
	this.city = city;
	this.state = state;
	this.country = country;
	this.zip_code = zip_code;
}
@JsonProperty("line1")
public String getLine1() {
	return line1;
}
@JsonProperty("line1")
public void setLine1(String line1) {
	this.line1 = line1;
}
@JsonProperty("line2")
public String getLine2() {
	return line2;
}
@JsonProperty("line2")
public void setLine2(String line2) {
	this.line2 = line2;
}
@JsonProperty("city")
public String getCity() {
	return city;
}
@JsonProperty("city")
public void setCity(String city) {
	this.city = city;
}
@JsonProperty("state")
public String getState() {
	return state;
}
@JsonProperty("state")
public void setState(String state) {
	this.state = state;
}
@JsonProperty("country")
public String getCountry() {
	return country;
}
@JsonProperty("country")
public void setCountry(String country) {
	this.country = country;
}
@JsonProperty("zip_code")
public String getZip_code() {
	return zip_code;
}
@JsonProperty("zip_code")
public void setZip_code(String zip_code) {
	this.zip_code = zip_code;
}


@Override
public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append(Address.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
    sb.append("line1");
    sb.append('=');
    sb.append(((this.line1 == null)?"<null>":this.line1));
    sb.append(',');
    sb.append("line2");
    sb.append('=');
    sb.append(((this.line2 == null)?"<null>":this.line2));
    sb.append(',');
    sb.append("city");
    sb.append('=');
    sb.append(((this.city == null)?"<null>":this.city));
    sb.append(',');
    sb.append("state");
    sb.append('=');
    sb.append(((this.state == null)?"<null>":this.state));
    sb.append(',');
    sb.append("country");
    sb.append('=');
    sb.append(((this.country == null)?"<null>":this.country));
    sb.append(',');
    sb.append("zip_code");
    sb.append('=');
    sb.append(((this.zip_code == null)?"<null>":this.zip_code));
    sb.append(',');
    if (sb.charAt((sb.length()- 1)) == ',') {
        sb.setCharAt((sb.length()- 1), ']');
    } else {
        sb.append(']');
    }
    return sb.toString();
}
	

}
