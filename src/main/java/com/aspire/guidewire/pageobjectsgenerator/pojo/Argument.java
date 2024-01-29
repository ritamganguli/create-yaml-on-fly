
package com.aspire.guidewire.pageobjectsgenerator.pojo;

import com.fasterxml.jackson.annotation.*;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

import java.util.HashMap;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "documentation", "name", "key" })
public class Argument {

	@JsonProperty("documentation")
	private String documentation;
	@JsonProperty("name")
	private String name;
	@JsonProperty("key")
	private String key;
	@JsonIgnore
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();

	@JsonProperty("documentation")
	public String getDocumentation() {
		return documentation;
	}

	@JsonProperty("documentation")
	public void setDocumentation(String documentation) {
		this.documentation = documentation;
	}

	public Argument withDocumentation(String documentation) {
		this.documentation = documentation;
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

	public Argument withName(String name) {
		this.name = name;
		return this;
	}

	@JsonProperty("key")
	public String getKey() {
		return key;
	}

	@JsonProperty("key")
	public void setKey(String key) {
		this.key = key;
	}

	public Argument withKey(String key) {
		this.key = key;
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

	public Argument withAdditionalProperty(String name, Object value) {
		this.additionalProperties.put(name, value);
		return this;
	}

	@Override
	public int hashCode() {
		return new HashCodeBuilder().append(documentation).append(name).append(key).append(additionalProperties)
				.toHashCode();
	}

	@Override
	public boolean equals(Object other) {
		if (other == this) {
			return true;
		}
		if ((other instanceof Argument) == false) {
			return false;
		}
		Argument rhs = ((Argument) other);
		return new EqualsBuilder().append(documentation, rhs.documentation).append(name, rhs.name).append(key, rhs.key)
				.append(additionalProperties, rhs.additionalProperties).isEquals();
	}

}
