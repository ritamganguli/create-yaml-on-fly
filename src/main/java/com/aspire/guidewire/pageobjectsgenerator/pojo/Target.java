
package com.aspire.guidewire.pageobjectsgenerator.pojo;

import com.fasterxml.jackson.annotation.*;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

import java.util.HashMap;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "modelName", "name" })
public class Target {

	@JsonProperty("modelName")
	private String modelName;
	@JsonProperty("name")
	private String name;
	@JsonIgnore
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();

	@JsonProperty("modelName")
	public String getModelName() {
		return modelName;
	}

	@JsonProperty("modelName")
	public void setModelName(String modelName) {
		this.modelName = modelName;
	}

	public Target withModelName(String modelName) {
		this.modelName = modelName;
		return this;
	}

	@JsonProperty("name")
	public String getName() {
		return name;
	}

	@JsonProperty("name")
	public void setName(String name) {
		this.name = name;
	}

	public Target withName(String name) {
		this.name = name;
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

	public Target withAdditionalProperty(String name, Object value) {
		this.additionalProperties.put(name, value);
		return this;
	}

	@Override
	public int hashCode() {
		return new HashCodeBuilder().append(modelName).append(name).append(additionalProperties).toHashCode();
	}

	@Override
	public boolean equals(Object other) {
		if (other == this) {
			return true;
		}
		if ((other instanceof Target) == false) {
			return false;
		}
		Target rhs = ((Target) other);
		return new EqualsBuilder().append(modelName, rhs.modelName).append(name, rhs.name)
				.append(additionalProperties, rhs.additionalProperties).isEquals();
	}

}
