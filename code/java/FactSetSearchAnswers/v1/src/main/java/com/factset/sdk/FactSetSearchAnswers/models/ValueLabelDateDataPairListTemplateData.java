/*
 * FactSet Search Answers API
 * The FactSet Search Answers API provides answers to search queries, reflecting the data shown within FactSet Search Answers, and allowing you to easily add financial data to your widgets, lookups, bots, and assistants. The API understands a fixed amount of search terms and returns structured data from FactSet’s many data sources. Possible answers include Price of a Company, Top 10 Year-to-Date Gainers, Revenue per Passenger Mile, and many more.
 *
 * The version of the OpenAPI document: 1.1.0
 * Contact: api@factset.com
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
import com.factset.sdk.FactSetSearchAnswers.models.DataPair;
import com.factset.sdk.FactSetSearchAnswers.models.Fdc3Context;
import com.factset.sdk.FactSetSearchAnswers.models.TemplateWithLinks;
import com.factset.sdk.FactSetSearchAnswers.models.ValueLabelDateDataPairListTemplateDataAllOf;
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
 * ValueLabelDateDataPairListTemplateData
 */
@JsonPropertyOrder({
  ValueLabelDateDataPairListTemplateData.JSON_PROPERTY_HEADLINE,
  ValueLabelDateDataPairListTemplateData.JSON_PROPERTY_FOOTER,
  ValueLabelDateDataPairListTemplateData.JSON_PROPERTY_FDC3_CONTEXT,
  ValueLabelDateDataPairListTemplateData.JSON_PROPERTY_APPLICATION_LINKS,
  ValueLabelDateDataPairListTemplateData.JSON_PROPERTY_VALUE,
  ValueLabelDateDataPairListTemplateData.JSON_PROPERTY_LABEL,
  ValueLabelDateDataPairListTemplateData.JSON_PROPERTY_DATE,
  ValueLabelDateDataPairListTemplateData.JSON_PROPERTY_LIST
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")

public class ValueLabelDateDataPairListTemplateData implements Serializable {
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

  public static final String JSON_PROPERTY_DATE = "date";
  private String date;

  public static final String JSON_PROPERTY_LIST = "list";
  private java.util.List<DataPair> _list = null;

  public ValueLabelDateDataPairListTemplateData() { 
  }

  @JsonCreator
  public ValueLabelDateDataPairListTemplateData(
    @JsonProperty(value=JSON_PROPERTY_HEADLINE, required=true) String headline
  ) {
    this();
    this.headline = headline;
  }

  public ValueLabelDateDataPairListTemplateData headline(String headline) {
    this.headline = headline;
    return this;
  }

   /**
   * Get headline
   * @return headline
  **/
  @jakarta.annotation.Nonnull
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


  public ValueLabelDateDataPairListTemplateData footer(String footer) {
    this.footer = footer;
    return this;
  }

   /**
   * Get footer
   * @return footer
  **/
  @jakarta.annotation.Nullable
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


  public ValueLabelDateDataPairListTemplateData fdc3Context(Fdc3Context fdc3Context) {
    this.fdc3Context = fdc3Context;
    return this;
  }

   /**
   * Get fdc3Context
   * @return fdc3Context
  **/
  @jakarta.annotation.Nullable
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


  public ValueLabelDateDataPairListTemplateData applicationLinks(java.util.List<ApplicationLink> applicationLinks) {
    this.applicationLinks = applicationLinks;
    return this;
  }

  public ValueLabelDateDataPairListTemplateData addApplicationLinksItem(ApplicationLink applicationLinksItem) {
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
  @jakarta.annotation.Nullable
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


  public ValueLabelDateDataPairListTemplateData value(String value) {
    this.value = value;
    return this;
  }

   /**
   * Get value
   * @return value
  **/
  @jakarta.annotation.Nullable
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


  public ValueLabelDateDataPairListTemplateData label(String label) {
    this.label = label;
    return this;
  }

   /**
   * Get label
   * @return label
  **/
  @jakarta.annotation.Nullable
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


  public ValueLabelDateDataPairListTemplateData date(String date) {
    this.date = date;
    return this;
  }

   /**
   * Get date
   * @return date
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getDate() {
    return date;
  }


  @JsonProperty(JSON_PROPERTY_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDate(String date) {
    this.date = date;
  }


  public ValueLabelDateDataPairListTemplateData _list(java.util.List<DataPair> _list) {
    this._list = _list;
    return this;
  }

  public ValueLabelDateDataPairListTemplateData addListItem(DataPair _listItem) {
    if (this._list == null) {
      this._list = new java.util.ArrayList<>();
    }
    this._list.add(_listItem);
    return this;
  }

   /**
   * Get _list
   * @return _list
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_LIST)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public java.util.List<DataPair> getList() {
    return _list;
  }


  @JsonProperty(JSON_PROPERTY_LIST)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setList(java.util.List<DataPair> _list) {
    this._list = _list;
  }


  /**
   * Return true if this ValueLabelDateDataPairListTemplateData object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ValueLabelDateDataPairListTemplateData valueLabelDateDataPairListTemplateData = (ValueLabelDateDataPairListTemplateData) o;
    return Objects.equals(this.headline, valueLabelDateDataPairListTemplateData.headline) &&
        Objects.equals(this.footer, valueLabelDateDataPairListTemplateData.footer) &&
        Objects.equals(this.fdc3Context, valueLabelDateDataPairListTemplateData.fdc3Context) &&
        Objects.equals(this.applicationLinks, valueLabelDateDataPairListTemplateData.applicationLinks) &&
        Objects.equals(this.value, valueLabelDateDataPairListTemplateData.value) &&
        Objects.equals(this.label, valueLabelDateDataPairListTemplateData.label) &&
        Objects.equals(this.date, valueLabelDateDataPairListTemplateData.date) &&
        Objects.equals(this._list, valueLabelDateDataPairListTemplateData._list);
  }

  @Override
  public int hashCode() {
    return Objects.hash(headline, footer, fdc3Context, applicationLinks, value, label, date, _list);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ValueLabelDateDataPairListTemplateData {\n");
    sb.append("    headline: ").append(toIndentedString(headline)).append("\n");
    sb.append("    footer: ").append(toIndentedString(footer)).append("\n");
    sb.append("    fdc3Context: ").append(toIndentedString(fdc3Context)).append("\n");
    sb.append("    applicationLinks: ").append(toIndentedString(applicationLinks)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("    label: ").append(toIndentedString(label)).append("\n");
    sb.append("    date: ").append(toIndentedString(date)).append("\n");
    sb.append("    _list: ").append(toIndentedString(_list)).append("\n");
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

