
package com.aspire.guidewire.pageobjectsgenerator.pojo;

import com.fasterxml.jackson.annotation.*;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

import java.util.HashMap;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "name", "strategy", "value" })
public class Attribute {

	@JsonProperty("name")
	public String name;
	@JsonProperty("strategy")
	public String strategy;
	@JsonProperty("value")
	public String value;
	@JsonIgnore
	public Map<String, Object> additionalProperties = new HashMap<String, Object>();

	@JsonProperty("name")
	public String getName() {
		return name;
	}

	@JsonProperty("name")
	public void setName(String name) {
		this.name = name;
	}

	public Attribute withName(String name) {
		this.name = name;
		return this;
	}

	@JsonProperty("strategy")
	public String getStrategy() {
		return strategy;
	}

	@JsonProperty("strategy")
	public void setStrategy(String strategy) {
		this.strategy = strategy;
	}

	public Attribute withStrategy(String strategy) {
		this.strategy = strategy;
		return this;
	}

	@JsonProperty("value")
	public String getValue() {
		return value;
	}

	@JsonProperty("value")
	public void setValue(String value) {
		this.value = value;
	}

	public Attribute withValue(String value) {
		this.value = value;
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

	public Attribute withAdditionalProperty(String name, Object value) {
		this.additionalProperties.put(name, value);
		return this;
	}

	@Override
	public int hashCode() {
		return new HashCodeBuilder().append(name).append(strategy).append(value).append(additionalProperties)
				.toHashCode();
	}

	@Override
	public boolean equals(Object other) {
		if (other == this) {
			return true;
		}
		if ((other instanceof Attribute) == false) {
			return false;
		}
		Attribute rhs = ((Attribute) other);
		return new EqualsBuilder().append(name, rhs.name).append(strategy, rhs.strategy).append(value, rhs.value)
				.append(additionalProperties, rhs.additionalProperties).isEquals();
	}

}
