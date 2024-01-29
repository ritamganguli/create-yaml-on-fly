
package com.aspire.guidewire.pageobjectsgenerator.pojo;

import com.fasterxml.jackson.annotation.*;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

import java.util.HashMap;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "attribute", "sourceIndex", "type", "operation", "argument", "negate", "target" })
public class Definition {

	@JsonProperty("attribute")
	public Attribute attribute;
	@JsonProperty("sourceIndex")
	public Integer sourceIndex;
	@JsonProperty("type")
	public String type;
	@JsonProperty("operation")
	public Operation operation;
	@JsonProperty("argument")
	public Argument argument;
	@JsonProperty("negate")
	public Boolean negate;
	@JsonProperty("target")
	public Target target;
	@JsonIgnore
	public Map<String, Object> additionalProperties = new HashMap<String, Object>();

	@JsonProperty("attribute")
	public Attribute getAttribute() {
		return attribute;
	}

	@JsonProperty("attribute")
	public void setAttribute(Attribute attribute) {
		this.attribute = attribute;
	}

	public Definition withAttribute(Attribute attribute) {
		this.attribute = attribute;
		return this;
	}

	@JsonProperty("sourceIndex")
	public Integer getSourceIndex() {
		return sourceIndex;
	}

	@JsonProperty("sourceIndex")
	public void setSourceIndex(Integer sourceIndex) {
		this.sourceIndex = sourceIndex;
	}

	public Definition withSourceIndex(Integer sourceIndex) {
		this.sourceIndex = sourceIndex;
		return this;
	}

	@JsonProperty("type")
	public String getType() {
		return type;
	}

	@JsonProperty("type")
	public void setType(String type) {
		this.type = type;
	}

	public Definition withType(String type) {
		this.type = type;
		return this;
	}

	@JsonProperty("operation")
	public Operation getOperation() {
		return operation;
	}

	@JsonProperty("operation")
	public void setOperation(Operation operation) {
		this.operation = operation;
	}

	public Definition withOperation(Operation operation) {
		this.operation = operation;
		return this;
	}

	@JsonProperty("argument")
	public Argument getArgument() {
		return argument;
	}

	@JsonProperty("argument")
	public void setArgument(Argument argument) {
		this.argument = argument;
	}

	public Definition withArgument(Argument argument) {
		this.argument = argument;
		return this;
	}

	@JsonProperty("negate")
	public Boolean getNegate() {
		return negate;
	}

	@JsonProperty("negate")
	public void setNegate(Boolean negate) {
		this.negate = negate;
	}

	public Definition withNegate(Boolean negate) {
		this.negate = negate;
		return this;
	}

	@JsonProperty("target")
	public Target getTarget() {
		return target;
	}

	@JsonProperty("target")
	public void setTarget(Target target) {
		this.target = target;
	}

	public Definition withTarget(Target target) {
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

	public Definition withAdditionalProperty(String name, Object value) {
		this.additionalProperties.put(name, value);
		return this;
	}

	@Override
	public int hashCode() {
		return new HashCodeBuilder().append(attribute).append(sourceIndex).append(type).append(operation)
				.append(argument).append(negate).append(target).append(additionalProperties).toHashCode();
	}

	@Override
	public boolean equals(Object other) {
		if (other == this) {
			return true;
		}
		if ((other instanceof Definition) == false) {
			return false;
		}
		Definition rhs = ((Definition) other);
		return new EqualsBuilder().append(attribute, rhs.attribute).append(sourceIndex, rhs.sourceIndex)
				.append(type, rhs.type).append(operation, rhs.operation).append(argument, rhs.argument)
				.append(negate, rhs.negate).append(target, rhs.target)
				.append(additionalProperties, rhs.additionalProperties).isEquals();
	}

}
