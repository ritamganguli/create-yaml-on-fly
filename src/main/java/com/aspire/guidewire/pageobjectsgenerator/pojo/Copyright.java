
package com.aspire.guidewire.pageobjectsgenerator.pojo;

import com.fasterxml.jackson.annotation.*;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

import java.util.HashMap;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "year", "claimant" })
public class Copyright {

	@JsonProperty("year")
	private String year;
	@JsonProperty("claimant")
	private String claimant;
	@JsonIgnore
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();

	@JsonProperty("year")
	public String getYear() {
		return year;
	}

	@JsonProperty("year")
	public void setYear(String year) {
		this.year = year;
	}

	public Copyright withYear(String year) {
		this.year = year;
		return this;
	}

	@JsonProperty("claimant")
	public String getClaimant() {
		return claimant;
	}

	@JsonProperty("claimant")
	public void setClaimant(String claimant) {
		this.claimant = claimant;
	}

	public Copyright withClaimant(String claimant) {
		this.claimant = claimant;
		return this;
	}

	@Override
	public String toString() {
		return ToStringBuilder.reflectionToString(this);
	}

	@JsonAnyGetter
	public Map<String, Object> getAdditionalProperties() {
		return this.additionalProperties;
	}

	@JsonAnySetter
	public void setAdditionalProperty(String name, Object value) {
		this.additionalProperties.put(name, value);
	}

	public Copyright withAdditionalProperty(String name, Object value) {
		this.additionalProperties.put(name, value);
		return this;
	}

	@Override
	public int hashCode() {
		return new HashCodeBuilder().append(year).append(claimant).append(additionalProperties).toHashCode();
	}

	@Override
	public boolean equals(Object other) {
		if (other == this) {
			return true;
		}
		if ((other instanceof Copyright) == false) {
			return false;
		}
		Copyright rhs = ((Copyright) other);
		return new EqualsBuilder().append(year, rhs.year).append(claimant, rhs.claimant)
				.append(additionalProperties, rhs.additionalProperties).isEquals();
	}

}
