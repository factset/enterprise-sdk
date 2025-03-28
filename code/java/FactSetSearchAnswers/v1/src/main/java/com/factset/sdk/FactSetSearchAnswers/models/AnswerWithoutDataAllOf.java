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
import com.factset.sdk.FactSetSearchAnswers.models.AnswerWithoutDataAllOfTemplateData;
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
 * AnswerWithoutDataAllOf
 */
@JsonPropertyOrder({
  AnswerWithoutDataAllOf.JSON_PROPERTY_TITLE,
  AnswerWithoutDataAllOf.JSON_PROPERTY_TEMPLATE_DATA
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")

public class AnswerWithoutDataAllOf implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_TITLE = "title";
  private String title;

  public static final String JSON_PROPERTY_TEMPLATE_DATA = "templateData";
  private AnswerWithoutDataAllOfTemplateData templateData;

  public AnswerWithoutDataAllOf() { 
  }

  @JsonCreator
  public AnswerWithoutDataAllOf(
    @JsonProperty(value=JSON_PROPERTY_TITLE, required=true) String title, 
    @JsonProperty(value=JSON_PROPERTY_TEMPLATE_DATA, required=true) AnswerWithoutDataAllOfTemplateData templateData
  ) {
    this();
    this.title = title;
    this.templateData = templateData;
  }

  public AnswerWithoutDataAllOf title(String title) {
    this.title = title;
    return this;
  }

   /**
   * Get title
   * @return title
  **/
  @jakarta.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_TITLE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getTitle() {
    return title;
  }


  @JsonProperty(JSON_PROPERTY_TITLE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setTitle(String title) {
    this.title = title;
  }


  public AnswerWithoutDataAllOf templateData(AnswerWithoutDataAllOfTemplateData templateData) {
    this.templateData = templateData;
    return this;
  }

   /**
   * Get templateData
   * @return templateData
  **/
  @jakarta.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_TEMPLATE_DATA)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public AnswerWithoutDataAllOfTemplateData getTemplateData() {
    return templateData;
  }


  @JsonProperty(JSON_PROPERTY_TEMPLATE_DATA)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setTemplateData(AnswerWithoutDataAllOfTemplateData templateData) {
    this.templateData = templateData;
  }


  /**
   * Return true if this AnswerWithoutData_allOf object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AnswerWithoutDataAllOf answerWithoutDataAllOf = (AnswerWithoutDataAllOf) o;
    return Objects.equals(this.title, answerWithoutDataAllOf.title) &&
        Objects.equals(this.templateData, answerWithoutDataAllOf.templateData);
  }

  @Override
  public int hashCode() {
    return Objects.hash(title, templateData);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AnswerWithoutDataAllOf {\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    templateData: ").append(toIndentedString(templateData)).append("\n");
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

