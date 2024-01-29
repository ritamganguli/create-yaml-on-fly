
package com.aspire.guidewire.pageobjectsgenerator.pojo;

import com.fasterxml.jackson.annotation.*;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

import java.util.HashMap;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "letter", "extras", "separator" })
public class Operations {

	@JsonProperty("letter")
	private Integer letter;
	@JsonProperty("extras")
	private Extras extras;
	@JsonProperty("separator")
	private String separator;
	@JsonIgnore
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();

	@JsonProperty("letter")
	public Integer getLetter() {
		return letter;
	}

	@JsonProperty("letter")
	public void setLetter(Integer letter) {
		this.letter = letter;
	}

	public Operations withLetter(Integer letter) {
		this.letter = letter;
		return this;
	}

	@JsonProperty("extras")
	public Extras getExtras() {
		return extras;
	}

	@JsonProperty("extras")
	public void setExtras(Extras extras) {
		this.extras = extras;
	}

	public Operations withExtras(Extras extras) {
		this.extras = extras;
		return this;
	}

	@JsonProperty("separator")
	public String getSeparator() {
		return separator;
	}

	@JsonProperty("separator")
	public void setSeparator(String separator) {
		this.separator = separator;
	}

	public Operations withSeparator(String separator) {
		this.separator = separator;
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

	public Operations withAdditionalProperty(String name, Object value) {
		this.additionalProperties.put(name, value);
		return this;
	}

	@Override
	public int hashCode() {
		return new HashCodeBuilder().append(letter).append(extras).append(separator).append(additionalProperties)
				.toHashCode();
	}

	@Override
	public boolean equals(Object other) {
		if (other == this) {
			return true;
		}
		if ((other instanceof Operations) == false) {
			return false;
		}
		Operations rhs = ((Operations) other);
		return new EqualsBuilder().append(letter, rhs.letter).append(extras, rhs.extras)
				.append(separator, rhs.separator).append(additionalProperties, rhs.additionalProperties).isEquals();
	}

}
