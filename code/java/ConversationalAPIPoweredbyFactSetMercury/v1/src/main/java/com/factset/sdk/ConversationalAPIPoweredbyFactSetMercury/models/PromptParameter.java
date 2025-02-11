/*
 * Conversational API Powered by FactSet Mercury
 * ### OVERVIEW  The FactSet Conversational API allows clients to integrate core FactSet Mercury capabilities in chatbot experiences.  The Conversational API is powered by FactSet Mercury, FactSet's Generative Artificial Intelligence (GenAI) large language model. The Conversational API provides a variety of content and capabilities, including FactSet’s Federation layer (FactSet’s core GenAI-based technology), as well as more specific content and functionality tailored for financial services workflows.  The Conversational API provides answers to hundreds of natural language search queries and allows you to easily ask questions related to companies and markets research.  Some example supported prompts:  - Nintendo's highest closing stock price over the last 3 months - Has Yelp issued any guidance? - What are the key trends impacting costs for DaVita?  **For Information on Access to and Content Available via the Conversational API**  Please see the [Conversational API Online Assistant Page](https://my.apps.factset.com/oa/pages/23209). Here you can find instructions on how to set up access to the Conversational API, and the full list of content available.  #### Conversational API Consumer Workflow  The Conversational API is an asynchronous API that utilizes status polling to inform the consumer when a query response is complete. Please see the technical OpenAPI documentation below for specific information regarding consuming the API programmatically.  At a high level, the API consumer workflow is as follows:  1) Send a natural language query to the `/query` endpoint and start the response generation process. 2) Poll the status of the response generation process using the `/status` endpoint. 3) Once the status indicates a ready response, retrieve it using the `/result` endpoint.  - If your response contains a file ID, such as for an Excel chart or a [FactSet ActiveGraph](https://my.apps.factset.com/oa/pages/20355), retrieve it using the file ID at the `/download/file` endpoint. - To provide feedback on your response and help the Conversational API better serve you content, we encourage you to use the `/feedback` endpoint.   #### Receive updates on changes to the Conversational API Subscribe to our FactSet Notify by clicking \"Subscribe to notifications\" in the upper right above the API overview. You will receive email updates when any updates occur to the API  #### FAQ & Troubleshooting Please find FAQs and troubleshooting tips in the [FAQs section](https://my.apps.factset.com/oa/pages/23440) of the Conversational API OA page  ##### Current Limitations  - \"Natural language\" in this documentation refers to modern conversational English. Support for other languages is currently unavailable. - The Conversational API is currently limited to accept 10 natural language queries per minute and 200 per hour for an individual consumer. If you anticipate your needs to be greater than these limits, please reach out to FactSet Support. 
 *
 * The version of the OpenAPI document: 1.0.8
 * Contact: api@factset.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.factset.sdk.ConversationalAPIPoweredbyFactSetMercury.models;

import java.util.Objects;
import java.util.Arrays;
import java.util.Map;
import java.util.HashMap;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.factset.sdk.ConversationalAPIPoweredbyFactSetMercury.JSON;


/**
 * prompt parameter object
 */
@ApiModel(description = "prompt parameter object")
@JsonPropertyOrder({
  PromptParameter.JSON_PROPERTY_SELECTION_TYPE,
  PromptParameter.JSON_PROPERTY_PLACE_HOLDER,
  PromptParameter.JSON_PROPERTY_VALUE
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")

public class PromptParameter implements Serializable {
  private static final long serialVersionUID = 1L;

  /**
   * Selection type, currently only support single selection
   */
  public enum SelectionTypeEnum {
    SINGLE("single");

    private String value;

    SelectionTypeEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static SelectionTypeEnum fromValue(String value) {
      for (SelectionTypeEnum b : SelectionTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_SELECTION_TYPE = "selectionType";
  private SelectionTypeEnum selectionType;

  public static final String JSON_PROPERTY_PLACE_HOLDER = "placeHolder";
  private String placeHolder;

  public static final String JSON_PROPERTY_VALUE = "value";
  private java.util.List<String> value = new java.util.ArrayList<>();

  public PromptParameter() { 
  }

  @JsonCreator
  public PromptParameter(
    @JsonProperty(value=JSON_PROPERTY_SELECTION_TYPE, required=true) SelectionTypeEnum selectionType, 
    @JsonProperty(value=JSON_PROPERTY_PLACE_HOLDER, required=true) String placeHolder, 
    @JsonProperty(value=JSON_PROPERTY_VALUE, required=true) java.util.List<String> value
  ) {
    this();
    this.selectionType = selectionType;
    this.placeHolder = placeHolder;
    this.value = value;
  }

  public PromptParameter selectionType(SelectionTypeEnum selectionType) {
    this.selectionType = selectionType;
    return this;
  }

   /**
   * Selection type, currently only support single selection
   * @return selectionType
  **/
  @jakarta.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Selection type, currently only support single selection")
  @JsonProperty(JSON_PROPERTY_SELECTION_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public SelectionTypeEnum getSelectionType() {
    return selectionType;
  }


  @JsonProperty(JSON_PROPERTY_SELECTION_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setSelectionType(SelectionTypeEnum selectionType) {
    this.selectionType = selectionType;
  }


  public PromptParameter placeHolder(String placeHolder) {
    this.placeHolder = placeHolder;
    return this;
  }

   /**
   * PlaceHolder value used in the prompt template
   * @return placeHolder
  **/
  @jakarta.annotation.Nonnull
  @ApiModelProperty(required = true, value = "PlaceHolder value used in the prompt template")
  @JsonProperty(JSON_PROPERTY_PLACE_HOLDER)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getPlaceHolder() {
    return placeHolder;
  }


  @JsonProperty(JSON_PROPERTY_PLACE_HOLDER)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setPlaceHolder(String placeHolder) {
    this.placeHolder = placeHolder;
  }


  public PromptParameter value(java.util.List<String> value) {
    this.value = value;
    return this;
  }

  public PromptParameter addValueItem(String valueItem) {
    this.value.add(valueItem);
    return this;
  }

   /**
   * Selection option values can be used to replace the placeHolder in the prompt template
   * @return value
  **/
  @jakarta.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Selection option values can be used to replace the placeHolder in the prompt template")
  @JsonProperty(JSON_PROPERTY_VALUE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public java.util.List<String> getValue() {
    return value;
  }


  @JsonProperty(JSON_PROPERTY_VALUE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setValue(java.util.List<String> value) {
    this.value = value;
  }


  /**
   * Return true if this PromptParameter object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PromptParameter promptParameter = (PromptParameter) o;
    return Objects.equals(this.selectionType, promptParameter.selectionType) &&
        Objects.equals(this.placeHolder, promptParameter.placeHolder) &&
        Objects.equals(this.value, promptParameter.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(selectionType, placeHolder, value);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PromptParameter {\n");
    sb.append("    selectionType: ").append(toIndentedString(selectionType)).append("\n");
    sb.append("    placeHolder: ").append(toIndentedString(placeHolder)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
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

