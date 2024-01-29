
package com.aspire.guidewire.pageobjectsgenerator.pojo;

import com.fasterxml.jackson.annotation.*;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

import java.util.HashMap;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "indent", "letter", "longestName", "separator" })
public class Attributes {

	@JsonProperty("indent")
	private Boolean indent;
	@JsonProperty("letter")
	private Integer letter;
	@JsonProperty("longestName")
	private Integer longestName;
	@JsonProperty("separator")
	private String separator;
	@JsonIgnore
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();

	@JsonProperty("indent")
	public Boolean getIndent() {
		return indent;
	}

	@JsonProperty("indent")
	public void setIndent(Boolean indent) {
		this.indent = indent;
	}

	public Attributes withIndent(Boolean indent) {
		this.indent = indent;
		return this;
	}

	@JsonProperty("letter")
	public Integer getLetter() {
		return letter;
	}

	@JsonProperty("letter")
	public void setLetter(Integer letter) {
		this.letter = letter;
	}

	public Attributes withLetter(Integer letter) {
		this.letter = letter;
		return this;
	}

	@JsonProperty("longestName")
	public Integer getLongestName() {
		return longestName;
	}

	@JsonProperty("longestName")
	public void setLongestName(Integer longestName) {
		this.longestName = longestName;
	}

	public Attributes withLongestName(Integer longestName) {
		this.longestName = longestName;
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

	public Attributes withSeparator(String separator) {
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

	public Attributes withAdditionalProperty(String name, Object value) {
		this.additionalProperties.put(name, value);
		return this;
	}

	@Override
	public int hashCode() {
		return new HashCodeBuilder().append(indent).append(letter).append(longestName).append(separator)
				.append(additionalProperties).toHashCode();
	}

	@Override
	public boolean equals(Object other) {
		if (other == this) {
			return true;
		}
		if ((other instanceof Attributes) == false) {
			return false;
		}
		Attributes rhs = ((Attributes) other);
		return new EqualsBuilder().append(indent, rhs.indent).append(letter, rhs.letter)
				.append(longestName, rhs.longestName).append(separator, rhs.separator)
				.append(additionalProperties, rhs.additionalProperties).isEquals();
	}

}
