
package com.aspire.guidewire.pageobjectsgenerator.pojo;

import com.fasterxml.jackson.annotation.*;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "copyright", "nodes", "operations", "attributes", "model", "fill", "definitions", "timeout",
		"url" })
public class Input {

	@JsonProperty("copyright")
	public Copyright copyright;
	@JsonProperty("nodes")
	public Nodes nodes;
	@JsonProperty("operations")
	public Operations operations;
	@JsonProperty("attributes")
	public Attributes attributes;
	@JsonProperty("model")
	public Model model;
	@JsonProperty("fill")
	public Fill fill;
	@JsonProperty("definitions")
	public List<Definition> definitions = new ArrayList<Definition>();
	@JsonProperty("timeout")
	public Integer timeout;
	@JsonProperty("url")
	public String url;
	@JsonIgnore
	public Map<String, Object> additionalProperties = new HashMap<String, Object>();

	@JsonProperty("copyright")
	public Copyright getCopyright() {
		return copyright;
	}

	@JsonProperty("copyright")
	public void setCopyright(Copyright copyright) {
		this.copyright = copyright;
	}

	public Input withCopyright(Copyright copyright) {
		this.copyright = copyright;
		return this;
	}

	@JsonProperty("nodes")
	public Nodes getNodes() {
		return nodes;
	}

	@JsonProperty("nodes")
	public void setNodes(Nodes nodes) {
		this.nodes = nodes;
	}

	public Input withNodes(Nodes nodes) {
		this.nodes = nodes;
		return this;
	}

	@JsonProperty("operations")
	public Operations getOperations() {
		return operations;
	}

	@JsonProperty("operations")
	public void setOperations(Operations operations) {
		this.operations = operations;
	}

	public Input withOperations(Operations operations) {
		this.operations = operations;
		return this;
	}

	@JsonProperty("attributes")
	public Attributes getAttributes() {
		return attributes;
	}

	@JsonProperty("attributes")
	public void setAttributes(Attributes attributes) {
		this.attributes = attributes;
	}

	public Input withAttributes(Attributes attributes) {
		this.attributes = attributes;
		return this;
	}

	@JsonProperty("model")
	public Model getModel() {
		return model;
	}

	@JsonProperty("model")
	public void setModel(Model model) {
		this.model = model;
	}

	public Input withModel(Model model) {
		this.model = model;
		return this;
	}

	@JsonProperty("fill")
	public Fill getFill() {
		return fill;
	}

	@JsonProperty("fill")
	public void setFill(Fill fill) {
		this.fill = fill;
	}

	public Input withFill(Fill fill) {
		this.fill = fill;
		return this;
	}

	@JsonProperty("definitions")
	public List<Definition> getDefinitions() {
		return definitions;
	}

	@JsonProperty("definitions")
	public void setDefinitions(List<Definition> definitions) {
		this.definitions = definitions;
	}

	public Input withDefinitions(List<Definition> definitions) {
		this.definitions = definitions;
		return this;
	}

	@JsonProperty("timeout")
	public Integer getTimeout() {
		return timeout;
	}

	@JsonProperty("timeout")
	public void setTimeout(Integer timeout) {
		this.timeout = timeout;
	}

	public Input withTimeout(Integer timeout) {
		this.timeout = timeout;
		return this;
	}

	@JsonProperty("url")
	public String getUrl() {
		return url;
	}

	@JsonProperty("url")
	public void setUrl(String url) {
		this.url = url;
	}

	public Input withUrl(String url) {
		this.url = url;
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

	public Input withAdditionalProperty(String name, Object value) {
		this.additionalProperties.put(name, value);
		return this;
	}

	@Override
	public int hashCode() {
		return new HashCodeBuilder().append(copyright).append(nodes).append(operations).append(attributes).append(model)
				.append(fill).append(definitions).append(timeout).append(url).append(additionalProperties).toHashCode();
	}

	@Override
	public boolean equals(Object other) {
		if (other == this) {
			return true;
		}
		if ((other instanceof Input) == false) {
			return false;
		}
		Input rhs = ((Input) other);
		return new EqualsBuilder().append(copyright, rhs.copyright).append(nodes, rhs.nodes)
				.append(operations, rhs.operations).append(attributes, rhs.attributes).append(model, rhs.model)
				.append(fill, rhs.fill).append(definitions, rhs.definitions).append(timeout, rhs.timeout)
				.append(url, rhs.url).append(additionalProperties, rhs.additionalProperties).isEquals();
	}

}
