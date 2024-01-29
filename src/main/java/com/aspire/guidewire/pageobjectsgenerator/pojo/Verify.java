
package com.aspire.guidewire.pageobjectsgenerator.pojo;

import com.fasterxml.jackson.annotation.*;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

import java.util.HashMap;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "loaded", "url" })
public class Verify {

	@JsonProperty("loaded")
	private Integer loaded;
	@JsonProperty("url")
	private Integer url;
	@JsonIgnore
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();

	@JsonProperty("loaded")
	public Integer getLoaded() {
		return loaded;
	}

	@JsonProperty("loaded")
	public void setLoaded(Integer loaded) {
		this.loaded = loaded;
	}

	public Verify withLoaded(Integer loaded) {
		this.loaded = loaded;
		return this;
	}

	@JsonProperty("url")
	public Integer getUrl() {
		return url;
	}

	@JsonProperty("url")
	public void setUrl(Integer url) {
		this.url = url;
	}

	public Verify withUrl(Integer url) {
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

	public Verify withAdditionalProperty(String name, Object value) {
		this.additionalProperties.put(name, value);
		return this;
	}

	@Override
	public int hashCode() {
		return new HashCodeBuilder().append(loaded).append(url).append(additionalProperties).toHashCode();
	}

	@Override
	public boolean equals(Object other) {
		if (other == this) {
			return true;
		}
		if ((other instanceof Verify) == false) {
			return false;
		}
		Verify rhs = ((Verify) other);
		return new EqualsBuilder().append(loaded, rhs.loaded).append(url, rhs.url)
				.append(additionalProperties, rhs.additionalProperties).isEquals();
	}

}
