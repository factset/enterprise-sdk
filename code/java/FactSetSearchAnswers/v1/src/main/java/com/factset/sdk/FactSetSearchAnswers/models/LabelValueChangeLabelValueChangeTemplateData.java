/*
 * FactSet Search Answers API
 * The FactSet Search Answers API provides answers to search queries, reflecting the data shown within FactSet Search Answers, and allowing you to easily add financial data to your widgets, lookups, bots, and assistants. The API understands a fixed amount of search terms and returns structured data from FactSet’s many data sources. Possible answers include Price of a Company, Top 10 Year-to-Date Gainers, Revenue per Passenger Mile, and many more.
 *
 * The version of the OpenAPI document: 1.1.0
 * Contact: FactSearch.Team@factset.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.factset.sdk.FactSetSearchAnswers.models;

import java.util.Objects;
import java.util.Arrays;
import java.util.Map;
import java.util.HashMap;
import com.factset.sdk.FactSetSearchAnswers.models.ApplicationLink;
import com.factset.sdk.FactSetSearchAnswers.models.Fdc3Context;
import com.factset.sdk.FactSetSearchAnswers.models.LabelValueChangeLabelValueChangeTemplateDataAllOf;
import com.factset.sdk.FactSetSearchAnswers.models.TemplateWithLinks;
import com.factset.sdk.FactSetSearchAnswers.models.ValueChange;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.factset.sdk.FactSetSearchAnswers.JSON;


/**
 * LabelValueChangeLabelValueChangeTemplateData
 */
@JsonPropertyOrder({
  LabelValueChangeLabelValueChangeTemplateData.JSON_PROPERTY_HEADLINE,
  LabelValueChangeLabelValueChangeTemplateData.JSON_PROPERTY_FOOTER,
  LabelValueChangeLabelValueChangeTemplateData.JSON_PROPERTY_FDC3_CONTEXT,
  LabelValueChangeLabelValueChangeTemplateData.JSON_PROPERTY_APPLICATION_LINKS,
  LabelValueChangeLabelValueChangeTemplateData.JSON_PROPERTY_VALUE,
  LabelValueChangeLabelValueChangeTemplateData.JSON_PROPERTY_LABEL,
  LabelValueChangeLabelValueChangeTemplateData.JSON_PROPERTY_VALUE_CHANGE,
  LabelValueChangeLabelValueChangeTemplateData.JSON_PROPERTY_VALUE2,
  LabelValueChangeLabelValueChangeTemplateData.JSON_PROPERTY_LABEL2
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class LabelValueChangeLabelValueChangeTemplateData implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_HEADLINE = "headline";
  private String headline;

  public static final String JSON_PROPERTY_FOOTER = "footer";
  private String footer;

  public static final String JSON_PROPERTY_FDC3_CONTEXT = "fdc3Context";
  private Fdc3Context fdc3Context;

  public static final String JSON_PROPERTY_APPLICATION_LINKS = "applicationLinks";
  private java.util.List<ApplicationLink> applicationLinks = null;

  public static final String JSON_PROPERTY_VALUE = "value";
  private String value;

  public static final String JSON_PROPERTY_LABEL = "label";
  private String label;

  public static final String JSON_PROPERTY_VALUE_CHANGE = "valueChange";
  private ValueChange valueChange;

  public static final String JSON_PROPERTY_VALUE2 = "value2";
  private String value2;

  public static final String JSON_PROPERTY_LABEL2 = "label2";
  private String label2;

  public LabelValueChangeLabelValueChangeTemplateData() { 
  }

  @JsonCreator
  public LabelValueChangeLabelValueChangeTemplateData(
    @JsonProperty(value=JSON_PROPERTY_HEADLINE, required=true) String headline
  ) {
    this();
    this.headline = headline;
  }

  public LabelValueChangeLabelValueChangeTemplateData headline(String headline) {
    this.headline = headline;
    return this;
  }

   /**
   * Get headline
   * @return headline
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_HEADLINE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getHeadline() {
    return headline;
  }


  @JsonProperty(JSON_PROPERTY_HEADLINE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setHeadline(String headline) {
    this.headline = headline;
  }


  public LabelValueChangeLabelValueChangeTemplateData footer(String footer) {
    this.footer = footer;
    return this;
  }

   /**
   * Get footer
   * @return footer
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_FOOTER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getFooter() {
    return footer;
  }


  @JsonProperty(JSON_PROPERTY_FOOTER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFooter(String footer) {
    this.footer = footer;
  }


  public LabelValueChangeLabelValueChangeTemplateData fdc3Context(Fdc3Context fdc3Context) {
    this.fdc3Context = fdc3Context;
    return this;
  }

   /**
   * Get fdc3Context
   * @return fdc3Context
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_FDC3_CONTEXT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Fdc3Context getFdc3Context() {
    return fdc3Context;
  }


  @JsonProperty(JSON_PROPERTY_FDC3_CONTEXT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFdc3Context(Fdc3Context fdc3Context) {
    this.fdc3Context = fdc3Context;
  }


  public LabelValueChangeLabelValueChangeTemplateData applicationLinks(java.util.List<ApplicationLink> applicationLinks) {
    this.applicationLinks = applicationLinks;
    return this;
  }

  public LabelValueChangeLabelValueChangeTemplateData addApplicationLinksItem(ApplicationLink applicationLinksItem) {
    if (this.applicationLinks == null) {
      this.applicationLinks = new java.util.ArrayList<>();
    }
    this.applicationLinks.add(applicationLinksItem);
    return this;
  }

   /**
   * Get applicationLinks
   * @return applicationLinks
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_APPLICATION_LINKS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public java.util.List<ApplicationLink> getApplicationLinks() {
    return applicationLinks;
  }


  @JsonProperty(JSON_PROPERTY_APPLICATION_LINKS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setApplicationLinks(java.util.List<ApplicationLink> applicationLinks) {
    this.applicationLinks = applicationLinks;
  }


  public LabelValueChangeLabelValueChangeTemplateData value(String value) {
    this.value = value;
    return this;
  }

   /**
   * Get value
   * @return value
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_VALUE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getValue() {
    return value;
  }


  @JsonProperty(JSON_PROPERTY_VALUE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setValue(String value) {
    this.value = value;
  }


  public LabelValueChangeLabelValueChangeTemplateData label(String label) {
    this.label = label;
    return this;
  }

   /**
   * Get label
   * @return label
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_LABEL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getLabel() {
    return label;
  }


  @JsonProperty(JSON_PROPERTY_LABEL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLabel(String label) {
    this.label = label;
  }


  public LabelValueChangeLabelValueChangeTemplateData valueChange(ValueChange valueChange) {
    this.valueChange = valueChange;
    return this;
  }

   /**
   * Get valueChange
   * @return valueChange
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_VALUE_CHANGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public ValueChange getValueChange() {
    return valueChange;
  }


  @JsonProperty(JSON_PROPERTY_VALUE_CHANGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setValueChange(ValueChange valueChange) {
    this.valueChange = valueChange;
  }


  public LabelValueChangeLabelValueChangeTemplateData value2(String value2) {
    this.value2 = value2;
    return this;
  }

   /**
   * Get value2
   * @return value2
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_VALUE2)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getValue2() {
    return value2;
  }


  @JsonProperty(JSON_PROPERTY_VALUE2)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setValue2(String value2) {
    this.value2 = value2;
  }


  public LabelValueChangeLabelValueChangeTemplateData label2(String label2) {
    this.label2 = label2;
    return this;
  }

   /**
   * Get label2
   * @return label2
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_LABEL2)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getLabel2() {
    return label2;
  }


  @JsonProperty(JSON_PROPERTY_LABEL2)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLabel2(String label2) {
    this.label2 = label2;
  }


  /**
   * Return true if this LabelValueChangeLabelValueChangeTemplateData object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LabelValueChangeLabelValueChangeTemplateData labelValueChangeLabelValueChangeTemplateData = (LabelValueChangeLabelValueChangeTemplateData) o;
    return Objects.equals(this.headline, labelValueChangeLabelValueChangeTemplateData.headline) &&
        Objects.equals(this.footer, labelValueChangeLabelValueChangeTemplateData.footer) &&
        Objects.equals(this.fdc3Context, labelValueChangeLabelValueChangeTemplateData.fdc3Context) &&
        Objects.equals(this.applicationLinks, labelValueChangeLabelValueChangeTemplateData.applicationLinks) &&
        Objects.equals(this.value, labelValueChangeLabelValueChangeTemplateData.value) &&
        Objects.equals(this.label, labelValueChangeLabelValueChangeTemplateData.label) &&
        Objects.equals(this.valueChange, labelValueChangeLabelValueChangeTemplateData.valueChange) &&
        Objects.equals(this.value2, labelValueChangeLabelValueChangeTemplateData.value2) &&
        Objects.equals(this.label2, labelValueChangeLabelValueChangeTemplateData.label2);
  }

  @Override
  public int hashCode() {
    return Objects.hash(headline, footer, fdc3Context, applicationLinks, value, label, valueChange, value2, label2);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LabelValueChangeLabelValueChangeTemplateData {\n");
    sb.append("    headline: ").append(toIndentedString(headline)).append("\n");
    sb.append("    footer: ").append(toIndentedString(footer)).append("\n");
    sb.append("    fdc3Context: ").append(toIndentedString(fdc3Context)).append("\n");
    sb.append("    applicationLinks: ").append(toIndentedString(applicationLinks)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("    label: ").append(toIndentedString(label)).append("\n");
    sb.append("    valueChange: ").append(toIndentedString(valueChange)).append("\n");
    sb.append("    value2: ").append(toIndentedString(value2)).append("\n");
    sb.append("    label2: ").append(toIndentedString(label2)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

