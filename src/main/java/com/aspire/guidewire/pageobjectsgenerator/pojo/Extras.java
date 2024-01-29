
package com.aspire.guidewire.pageobjectsgenerator.pojo;

import com.fasterxml.jackson.annotation.*;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

import java.util.HashMap;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "submit", "verify", "fill" })
public class Extras {

	@JsonProperty("submit")
	private Integer submit;
	@JsonProperty("verify")
	private Verify verify;
	@JsonProperty("fill")
	private Integer fill;
	@JsonIgnore
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();

	@JsonProperty("submit")
	public Integer getSubmit() {
		return submit;
	}

	@JsonProperty("submit")
	public void setSubmit(Integer submit) {
		this.submit = submit;
	}

	public Extras withSubmit(Integer submit) {
		this.submit = submit;
		return this;
	}

	@JsonProperty("verify")
	public Verify getVerify() {
		return verify;
	}

	@JsonProperty("verify")
	public void setVerify(Verify verify) {
		this.verify = verify;
	}

	public Extras withVerify(Verify verify) {
		this.verify = verify;
		return this;
	}

	@JsonProperty("fill")
	public Integer getFill() {
		return fill;
	}

	@JsonProperty("fill")
	public void setFill(Integer fill) {
		this.fill = fill;
	}

	public Extras withFill(Integer fill) {
		this.fill = fill;
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

	public Extras withAdditionalProperty(String name, Object value) {
		this.additionalProperties.put(name, value);
		return this;
	}

	@Override
	public int hashCode() {
		return new HashCodeBuilder().append(submit).append(verify).append(fill).append(additionalProperties)
				.toHashCode();
	}

	@Override
	public boolean equals(Object other) {
		if (other == this) {
			return true;
		}
		if ((other instanceof Extras) == false) {
			return false;
		}
		Extras rhs = ((Extras) other);
		return new EqualsBuilder().append(submit, rhs.submit).append(verify, rhs.verify).append(fill, rhs.fill)
				.append(additionalProperties, rhs.additionalProperties).isEquals();
	}

}
