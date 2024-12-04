/*
 * Conversational API Powered by FactSet Mercury
 * ### OVERVIEW  The FactSet Conversational API allows clients to integrate core FactSet Mercury capabilities in chatbot experiences.  The Conversational API is powered by FactSet Mercury, FactSet's Generative Artificial Intelligence (GenAI) large language model. The Conversational API provides a variety of content and capabilities, including FactSet’s Federation layer (FactSet’s core GenAI-based technology), as well as more specific content and functionality tailored for financial services workflows.  The Conversational API provides answers to hundreds of natural language search queries and allows you to easily ask questions related to companies and markets research.  Some example supported prompts:  - Nintendo's highest closing stock price over the last 3 months - Has Yelp issued any guidance? - What are the key trends impacting costs for DaVita?  **For Information on Access to and Content Available via the Conversational API**  Please see the [Conversational API Online Assistant Page](https://my.apps.factset.com/oa/pages/23209). Here you can find instructions on how to set up access to the Conversational API, and the full list of content available.  #### Conversational API Consumer Workflow  The Conversational API is an asynchronous API that utilizes status polling to inform the consumer when a query response is complete. Please see the technical OpenAPI documentation below for specific information regarding consuming the API programmatically.  At a high level, the API consumer workflow is as follows:  1) Send a natural language query to the `/query` endpoint and start the response generation process. 2) Poll the status of the response generation process using the `/status` endpoint. 3) Once the status indicates a ready response, retrieve it using the `/result` endpoint.  - If your response contains a file ID, such as for an Excel chart or a [FactSet ActiveGraph](https://my.apps.factset.com/oa/pages/20355), retrieve it using the file ID at the `/download/file` endpoint. - To provide feedback on your response and help the Conversational API better serve you content, we encourage you to use the `/feedback` endpoint.   ##### Current Limitations  - \"Natural language\" in this documentation refers to modern conversational English. Support for other languages is currently unavailable. - The Conversational API is currently limited to accept 10 natural language queries per minute and 200 per hour for an individual consumer. If you anticipate your needs to be greater than these limits, please reach out to FactSet Support.  #### FAQ   **How can I receive updates on changes to the Conversational API?** - Please subscribe to our FactSet Notify by clicking \"Subscribe to notifications\" in the upper right above the API overview. You will receive email updates when any updates occur to the API. **Why am I receiving a 403 error with a valid API key?** - Please ensure that your current public IP is within the IP range allocated to the API key you are using to authenticate API requests. You can update your API key's allowable IP range via the [FactSet Developer Portal API Authentication page](https://developer.factset.com/api-authentication). If this does not resolve the issue, please reach out to FactSet Support to ensure you are appropriately authorized to access the Conversational API. 
 *
 * The version of the OpenAPI document: 1.0.5
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
import com.factset.sdk.ConversationalAPIPoweredbyFactSetMercury.models.PromptParameters;
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
 * A single suggested prompt data item
 */
@ApiModel(description = "A single suggested prompt data item")
@JsonPropertyOrder({
  PromptItem.JSON_PROPERTY_PROMPT,
  PromptItem.JSON_PROPERTY_PROMPT_PARAMETERS
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")

public class PromptItem implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_PROMPT = "prompt";
  private String prompt;

  public static final String JSON_PROPERTY_PROMPT_PARAMETERS = "promptParameters";
  private PromptParameters promptParameters;

  public PromptItem() { 
  }

  @JsonCreator
  public PromptItem(
    @JsonProperty(value=JSON_PROPERTY_PROMPT, required=true) String prompt
  ) {
    this();
    this.prompt = prompt;
  }

  public PromptItem prompt(String prompt) {
    this.prompt = prompt;
    return this;
  }

   /**
   * Follow-up prompt generated by FactSet Mercury
   * @return prompt
  **/
  @jakarta.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Follow-up prompt generated by FactSet Mercury")
  @JsonProperty(JSON_PROPERTY_PROMPT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getPrompt() {
    return prompt;
  }


  @JsonProperty(JSON_PROPERTY_PROMPT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setPrompt(String prompt) {
    this.prompt = prompt;
  }


  public PromptItem promptParameters(PromptParameters promptParameters) {
    this.promptParameters = promptParameters;
    return this;
  }

   /**
   * Get promptParameters
   * @return promptParameters
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_PROMPT_PARAMETERS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public PromptParameters getPromptParameters() {
    return promptParameters;
  }


  @JsonProperty(JSON_PROPERTY_PROMPT_PARAMETERS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPromptParameters(PromptParameters promptParameters) {
    this.promptParameters = promptParameters;
  }


  /**
   * Return true if this PromptItem object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PromptItem promptItem = (PromptItem) o;
    return Objects.equals(this.prompt, promptItem.prompt) &&
        Objects.equals(this.promptParameters, promptItem.promptParameters);
  }

  @Override
  public int hashCode() {
    return Objects.hash(prompt, promptParameters);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PromptItem {\n");
    sb.append("    prompt: ").append(toIndentedString(prompt)).append("\n");
    sb.append("    promptParameters: ").append(toIndentedString(promptParameters)).append("\n");
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

