
package com.aspire.guidewire.pageobjectsgenerator.pojo;

import com.fasterxml.jackson.annotation.*;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

import java.util.HashMap;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "angular", "visibility", "root", "selector" })
public class Nodes {

	@JsonProperty("angular")
	private Boolean angular;
	@JsonProperty("visibility")
	private Integer visibility;
	@JsonProperty("root")
	private String root;
	@JsonProperty("selector")
	private String selector;
	@JsonIgnore
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();

	@JsonProperty("angular")
	public Boolean getAngular() {
		return angular;
	}

	@JsonProperty("angular")
	public void setAngular(Boolean angular) {
		this.angular = angular;
	}

	public Nodes withAngular(Boolean angular) {
		this.angular = angular;
		return this;
	}

	@JsonProperty("visibility")
	public Integer getVisibility() {
		return visibility;
	}

	@JsonProperty("visibility")
	public void setVisibility(Integer visibility) {
		this.visibility = visibility;
	}

	public Nodes withVisibility(Integer visibility) {
		this.visibility = visibility;
		return this;
	}

	@JsonProperty("root")
	public String getRoot() {
		return root;
	}

	@JsonProperty("root")
	public void setRoot(String root) {
		this.root = root;
	}

	public Nodes withRoot(String root) {
		this.root = root;
		return this;
	}

	@JsonProperty("selector")
	public String getSelector() {
		return selector;
	}

	@JsonProperty("selector")
	public void setSelector(String selector) {
		this.selector = selector;
	}

	public Nodes withSelector(String selector) {
		this.selector = selector;
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

	public Nodes withAdditionalProperty(String name, Object value) {
		this.additionalProperties.put(name, value);
		return this;
	}

	@Override
	public int hashCode() {
		return new HashCodeBuilder().append(angular).append(visibility).append(root).append(selector)
				.append(additionalProperties).toHashCode();
	}

	@Override
	public boolean equals(Object other) {
		if (other == this) {
			return true;
		}
		if ((other instanceof Nodes) == false) {
			return false;
		}
		Nodes rhs = ((Nodes) other);
		return new EqualsBuilder().append(angular, rhs.angular).append(visibility, rhs.visibility)
				.append(root, rhs.root).append(selector, rhs.selector)
				.append(additionalProperties, rhs.additionalProperties).isEquals();
	}

}
