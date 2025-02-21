/*
 * Conversational API Powered by FactSet Mercury
 * ### OVERVIEW  The FactSet Conversational API allows clients to integrate core FactSet Mercury capabilities in chatbot experiences.  The Conversational API is powered by FactSet Mercury, FactSet's Generative Artificial Intelligence (GenAI) large language model. The Conversational API provides a variety of content and capabilities, including FactSet’s Federation layer (FactSet’s core GenAI-based technology), as well as more specific content and functionality tailored for financial services workflows.  The Conversational API provides answers to hundreds of natural language search queries and allows you to easily ask questions related to companies and markets research.  Some example supported prompts:  - Nintendo's highest closing stock price over the last 3 months - Has Yelp issued any guidance? - What are the key trends impacting costs for DaVita?  **For Information on Access to and Content Available via the Conversational API**  Please see the [Conversational API Online Assistant Page](https://my.apps.factset.com/oa/pages/23209). Here you can find instructions on how to set up access to the Conversational API, and the full list of content available.  #### Conversational API Consumer Workflow  The Conversational API is an asynchronous API that utilizes status polling to inform the consumer when a query response is complete. Please see the technical OpenAPI documentation below for specific information regarding consuming the API programmatically.  At a high level, the API consumer workflow is as follows:  1) Send a natural language query to the `/query` endpoint and start the response generation process. 2) Poll the status of the response generation process using the `/status` endpoint. 3) Once the status indicates a ready response, retrieve it using the `/result` endpoint.  - If your response contains a file ID, such as for an Excel chart or a [FactSet ActiveGraph](https://my.apps.factset.com/oa/pages/20355), retrieve it using the file ID at the `/download/file` endpoint. - To provide feedback on your response and help the Conversational API better serve you content, we encourage you to use the `/feedback` endpoint.   #### Receive updates on changes to the Conversational API Subscribe to our FactSet Notify by clicking \"Subscribe to notifications\" in the upper right above the API overview. You will receive email updates when any updates occur to the API  #### FAQ & Troubleshooting Please find FAQs and troubleshooting tips in the [FAQs section](https://my.apps.factset.com/oa/pages/23440) of the Conversational API OA page  ##### Current Limitations  - \"Natural language\" in this documentation refers to modern conversational English. Support for other languages is currently unavailable. - The Conversational API is currently limited to accept 10 natural language queries per minute and 200 per hour for an individual consumer. If you anticipate your needs to be greater than these limits, please reach out to FactSet Support. 
 *
 * The version of the OpenAPI document: 1.1.0
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
import com.factset.sdk.ConversationalAPIPoweredbyFactSetMercury.models.PromptParameter;
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
 * Object containing prompt parameters
 */
@ApiModel(description = "Object containing prompt parameters")
@JsonPropertyOrder({
  PromptParameters.JSON_PROPERTY_TEMPLATE,
  PromptParameters.JSON_PROPERTY_PARAMS
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")

public class PromptParameters implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_TEMPLATE = "template";
  private String template;

  public static final String JSON_PROPERTY_PARAMS = "params";
  private java.util.List<PromptParameter> params = new java.util.ArrayList<>();

  public PromptParameters() { 
  }

  @JsonCreator
  public PromptParameters(
    @JsonProperty(value=JSON_PROPERTY_TEMPLATE, required=true) String template, 
    @JsonProperty(value=JSON_PROPERTY_PARAMS, required=true) java.util.List<PromptParameter> params
  ) {
    this();
    this.template = template;
    this.params = params;
  }

  public PromptParameters template(String template) {
    this.template = template;
    return this;
  }

   /**
   * Prompt template used to build a follow up prompt to send to FactSet Mercury
   * @return template
  **/
  @jakarta.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Prompt template used to build a follow up prompt to send to FactSet Mercury")
  @JsonProperty(JSON_PROPERTY_TEMPLATE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getTemplate() {
    return template;
  }


  @JsonProperty(JSON_PROPERTY_TEMPLATE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setTemplate(String template) {
    this.template = template;
  }


  public PromptParameters params(java.util.List<PromptParameter> params) {
    this.params = params;
    return this;
  }

  public PromptParameters addParamsItem(PromptParameter paramsItem) {
    this.params.add(paramsItem);
    return this;
  }

   /**
   * List of prompt parameters
   * @return params
  **/
  @jakarta.annotation.Nonnull
  @ApiModelProperty(required = true, value = "List of prompt parameters")
  @JsonProperty(JSON_PROPERTY_PARAMS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public java.util.List<PromptParameter> getParams() {
    return params;
  }


  @JsonProperty(JSON_PROPERTY_PARAMS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setParams(java.util.List<PromptParameter> params) {
    this.params = params;
  }


  /**
   * Return true if this PromptParameters object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PromptParameters promptParameters = (PromptParameters) o;
    return Objects.equals(this.template, promptParameters.template) &&
        Objects.equals(this.params, promptParameters.params);
  }

  @Override
  public int hashCode() {
    return Objects.hash(template, params);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PromptParameters {\n");
    sb.append("    template: ").append(toIndentedString(template)).append("\n");
    sb.append("    params: ").append(toIndentedString(params)).append("\n");
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

