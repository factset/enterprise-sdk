/*
 * Conversational API Powered by FactSet Mercury
 * ### OVERVIEW  The FactSet Conversational API allows clients to integrate core FactSet Mercury capabilities in chatbot experiences.  The Conversational API is powered by FactSet Mercury, FactSet's Generative Artificial Intelligence (GenAI) large language model. The Conversational API provides a variety of content and capabilities, including FactSet’s Federation layer (FactSet’s core GenAI-based technology), as well as more specific content and functionality tailored for financial services workflows.  The Conversational API provides answers to hundreds of natural language search queries and allows you to easily ask questions related to companies and markets research.  Some example supported prompts:  - Nintendo's highest closing stock price over the last 3 months - Has Yelp issued any guidance? - What are the key trends impacting costs for DaVita?  **For Information on Access to and Content Available via the Conversational API**  Please see the [Conversational API Online Assistant Page](https://my.apps.factset.com/oa/pages/23209). Here you can find instructions on how to set up access to the Conversational API, and the full list of content available.  #### Conversational API Consumer Workflow  The Conversational API is an asynchronous API that utilizes status polling to inform the consumer when a query response is complete. Please see the technical OpenAPI documentation below for specific information regarding consuming the API programmatically.  At a high level, the API consumer workflow is as follows:  1) Send a natural language query to the `/query` endpoint and start the response generation process. 2) Poll the status of the response generation process using the `/status` endpoint. 3) Once the status indicates a ready response, retrieve it using the `/result` endpoint.  - If your response contains a file ID, such as for an Excel chart or a [FactSet ActiveGraph](https://my.apps.factset.com/oa/pages/20355), retrieve it using the file ID at the `/download/file` endpoint. - To provide feedback on your response and help the Conversational API better serve you content, we encourage you to use the `/feedback` endpoint.   #### Receive updates on changes to the Conversational API Subscribe to our FactSet Notify by clicking \"Subscribe to notifications\" in the upper right above the API overview. You will receive email updates when any updates occur to the API  #### FAQ & Troubleshooting Please find FAQs and troubleshooting tips in the [FAQs section](https://my.apps.factset.com/oa/pages/23440) of the Conversational API OA page  ##### Current Limitations  - \"Natural language\" in this documentation refers to modern conversational English. Support for other languages is currently unavailable. - The Conversational API is currently limited to accept 10 natural language queries per minute and 200 per hour for an individual consumer. If you anticipate your needs to be greater than these limits, please reach out to FactSet Support. 
 *
 * The version of the OpenAPI document: 1.1.1
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
 * &#x60;Value&#x60; field contains tabular FactSet data surfaced from FactSet content sets.   The Conversational API uses Factset&#39;s STACH V3 format to represent tabular data in JSON. Please refer to the [STACH V3 documentation](https://factset.github.io/stachschema/#/v3/README) on column organized data for more information on how to process STACH-organized data.  Data represented as a STACH table may also be available for download as an Excel file; the &#x60;fileId&#x60; will be located in the &#x60;NextStep&#x60; array, as an &#x60;Download&#x60; action with the name &#x60;InteractiveTable&#x60;.  Please see an example response containing a STACH Table in the example section labeled as &#x60;TableResponseExample&#x60;.  
 */
@ApiModel(description = "`Value` field contains tabular FactSet data surfaced from FactSet content sets.   The Conversational API uses Factset's STACH V3 format to represent tabular data in JSON. Please refer to the [STACH V3 documentation](https://factset.github.io/stachschema/#/v3/README) on column organized data for more information on how to process STACH-organized data.  Data represented as a STACH table may also be available for download as an Excel file; the `fileId` will be located in the `NextStep` array, as an `Download` action with the name `InteractiveTable`.  Please see an example response containing a STACH Table in the example section labeled as `TableResponseExample`.  ")
@JsonPropertyOrder({
  Table.JSON_PROPERTY_TYPE,
  Table.JSON_PROPERTY_VALUE
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")

public class Table implements Serializable {
  private static final long serialVersionUID = 1L;

  /**
   * Datatype contained in this data object
   */
  public enum TypeEnum {
    TABLE("Table");

    private String value;

    TypeEnum(String value) {
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
    public static TypeEnum fromValue(String value) {
      for (TypeEnum b : TypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_TYPE = "type";
  private TypeEnum type;

  public static final String JSON_PROPERTY_VALUE = "value";
  private Object value;

  public Table() { 
  }

  @JsonCreator
  public Table(
    @JsonProperty(value=JSON_PROPERTY_TYPE, required=true) TypeEnum type, 
    @JsonProperty(value=JSON_PROPERTY_VALUE, required=true) Object value
  ) {
    this();
    this.type = type;
    this.value = value;
  }

  public Table type(TypeEnum type) {
    this.type = type;
    return this;
  }

   /**
   * Datatype contained in this data object
   * @return type
  **/
  @jakarta.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Datatype contained in this data object")
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public TypeEnum getType() {
    return type;
  }


  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setType(TypeEnum type) {
    this.type = type;
  }


  public Table value(Object value) {
    this.value = value;
    return this;
  }

   /**
   * Data table represented in [FactSet STACH V3](https://factset.github.io/stachschema/#/v3/README) format
   * @return value
  **/
  @jakarta.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Data table represented in [FactSet STACH V3](https://factset.github.io/stachschema/#/v3/README) format")
  @JsonProperty(JSON_PROPERTY_VALUE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Object getValue() {
    return value;
  }


  @JsonProperty(JSON_PROPERTY_VALUE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setValue(Object value) {
    this.value = value;
  }


  /**
   * Return true if this Table object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Table table = (Table) o;
    return Objects.equals(this.type, table.type) &&
        Objects.equals(this.value, table.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, value);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Table {\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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

