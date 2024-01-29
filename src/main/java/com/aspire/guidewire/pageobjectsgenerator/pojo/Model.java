
package com.aspire.guidewire.pageobjectsgenerator.pojo;

import com.fasterxml.jackson.annotation.*;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

import java.util.HashMap;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "include", "name", "namespace", "target" })
public class Model {

	@JsonProperty("include")
	private Boolean include;
	@JsonProperty("name")
	private String name;
	@JsonProperty("namespace")
	private String namespace;
	@JsonProperty("target")
	private String target;
	@JsonIgnore
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();

	@JsonProperty("include")
	public Boolean getInclude() {
		return include;
	}

	@JsonProperty("include")
	public void setInclude(Boolean include) {
		this.include = include;
	}

	public Model withInclude(Boolean include) {
		this.include = include;
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

	public Model withName(String name) {
		this.name = name;
		return this;
	}

	@JsonProperty("namespace")
	public String getNamespace() {
		return namespace;
	}

	@JsonProperty("namespace")
	public void setNamespace(String namespace) {
		this.namespace = namespace;
	}

	public Model withNamespace(String namespace) {
		this.namespace = namespace;
		return this;
	}

	@JsonProperty("target")
	public String getTarget() {
		return target;
	}

	@JsonProperty("target")
	public void setTarget(String target) {
		this.target = target;
	}

	public Model withTarget(String target) {
		this.target = target;
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

	public Model withAdditionalProperty(String name, Object value) {
		this.additionalProperties.put(name, value);
		return this;
	}

	@Override
	public int hashCode() {
		return new HashCodeBuilder().append(include).append(name).append(namespace).append(target)
				.append(additionalProperties).toHashCode();
	}

	@Override
	public boolean equals(Object other) {
		if (other == this) {
			return true;
		}
		if ((other instanceof Model) == false) {
			return false;
		}
		Model rhs = ((Model) other);
		return new EqualsBuilder().append(include, rhs.include).append(name, rhs.name).append(namespace, rhs.namespace)
				.append(target, rhs.target).append(additionalProperties, rhs.additionalProperties).isEquals();
	}

}
