/*
 * Events and Transcripts API
 * <p>The Calendar Events API provides access to FactSetâ€™s Event Calendar data alongside business logic that allows users to replicate views and functionality consistent with the experience provided by the Workstation. This API provides the ability to pull Event Calendar data based on specific filters.</p> <p>Events Audio API provides access to historical as well as the latest audio recordings of various company events covered by FactSet. The events include, but are not limited to: earnings calls, conferences, and investor days. This API also provides relevant metadata such as timestamps and identifiers around each audio file.</p> <p>The  Near Real-time Transcripts API enables access to Near Real-time Transcripts provided by CallStreet to time-sensitive clients. This API also provides the relevant speaker metadata along with their confidence scores. This data caters to quant clients interested in building machine learning models. Clients can leverage this API to perform sentiment analysis through natural language processing or machine learning. It can also be used to complement analysis using FactSet's transcripts service.</p> <p>Transcripts API provides conference call transcripts for companies' publicly held conference calls and a wealth of information regarding upcoming corporate events, such as conference call date and time, phone number and password, type of conference call, and important company investor relations contact information.</p> 
 *
 * The version of the OpenAPI document: 2.0.0
 * Contact: api@factset.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.factset.sdk.EventsandTranscripts.models;

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
import com.factset.sdk.EventsandTranscripts.JSON;


/**
 * error
 */
@ApiModel(description = "error")
@JsonPropertyOrder({
  InvalidIdErrorData.JSON_PROPERTY_CODE,
  InvalidIdErrorData.JSON_PROPERTY_TITLE,
  InvalidIdErrorData.JSON_PROPERTY_DETAIL
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")

public class InvalidIdErrorData implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_CODE = "code";
  private String code;

  public static final String JSON_PROPERTY_TITLE = "title";
  private String title;

  public static final String JSON_PROPERTY_DETAIL = "detail";
  private String detail;

  public InvalidIdErrorData() { 
  }

  public InvalidIdErrorData code(String code) {
    this.code = code;
    return this;
  }

   /**
   * status
   * @return code
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "GenericError", value = "status")
  @JsonProperty(JSON_PROPERTY_CODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCode() {
    return code;
  }


  @JsonProperty(JSON_PROPERTY_CODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCode(String code) {
    this.code = code;
  }


  public InvalidIdErrorData title(String title) {
    this.title = title;
    return this;
  }

   /**
   * The plain text error message
   * @return title
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "Validation Error", value = "The plain text error message")
  @JsonProperty(JSON_PROPERTY_TITLE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getTitle() {
    return title;
  }


  @JsonProperty(JSON_PROPERTY_TITLE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTitle(String title) {
    this.title = title;
  }


  public InvalidIdErrorData detail(String detail) {
    this.detail = detail;
    return this;
  }

   /**
   * Error details explanation
   * @return detail
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "Validation Error", value = "Error details explanation")
  @JsonProperty(JSON_PROPERTY_DETAIL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getDetail() {
    return detail;
  }


  @JsonProperty(JSON_PROPERTY_DETAIL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDetail(String detail) {
    this.detail = detail;
  }


  /**
   * Return true if this InvalidIdErrorData object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InvalidIdErrorData invalidIdErrorData = (InvalidIdErrorData) o;
    return Objects.equals(this.code, invalidIdErrorData.code) &&
        Objects.equals(this.title, invalidIdErrorData.title) &&
        Objects.equals(this.detail, invalidIdErrorData.detail);
  }

  @Override
  public int hashCode() {
    return Objects.hash(code, title, detail);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InvalidIdErrorData {\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    detail: ").append(toIndentedString(detail)).append("\n");
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

