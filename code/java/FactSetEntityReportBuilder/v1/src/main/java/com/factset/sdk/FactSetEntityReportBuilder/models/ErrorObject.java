/*
 * FactSet Entity Report Builder
 * License info
 *
 * The version of the OpenAPI document: 1.0.0
 * Contact: api@factset.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.factset.sdk.FactSetEntityReportBuilder.models;

import java.util.Objects;
import java.util.Arrays;
import java.util.Map;
import java.util.HashMap;
import com.factset.sdk.FactSetEntityReportBuilder.models.ErrorObjectLinks;
import com.factset.sdk.FactSetEntityReportBuilder.models.ErrorObjectSource;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.factset.sdk.FactSetEntityReportBuilder.JSON;


/**
 * Schema describing an API error
 */
@ApiModel(description = "Schema describing an API error")
@JsonPropertyOrder({
  ErrorObject.JSON_PROPERTY_CODE,
  ErrorObject.JSON_PROPERTY_DETAIL,
  ErrorObject.JSON_PROPERTY_ID,
  ErrorObject.JSON_PROPERTY_LINKS,
  ErrorObject.JSON_PROPERTY_SOURCE,
  ErrorObject.JSON_PROPERTY_TITLE
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")

public class ErrorObject implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_CODE = "code";
  private String code;

  public static final String JSON_PROPERTY_DETAIL = "detail";
  private String detail;

  public static final String JSON_PROPERTY_ID = "id";
  private String id;

  public static final String JSON_PROPERTY_LINKS = "links";
  private ErrorObjectLinks links;

  public static final String JSON_PROPERTY_SOURCE = "source";
  private ErrorObjectSource source;

  public static final String JSON_PROPERTY_TITLE = "title";
  private String title;

  public ErrorObject() { 
  }

  public ErrorObject code(String code) {
    this.code = code;
    return this;
  }

   /**
   * A common or API-specific error code.
   * @return code
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "A common or API-specific error code.")
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


  public ErrorObject detail(String detail) {
    this.detail = detail;
    return this;
  }

   /**
   * A human-readable explanation specific to the occurrence of the problem.
   * @return detail
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "A human-readable explanation specific to the occurrence of the problem.")
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


  public ErrorObject id(String id) {
    this.id = id;
    return this;
  }

   /**
   * A UUID for this particular ocurrence of the problem.  This will be logged for debugging.
   * @return id
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "A UUID for this particular ocurrence of the problem.  This will be logged for debugging.")
  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getId() {
    return id;
  }


  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setId(String id) {
    this.id = id;
  }


  public ErrorObject links(ErrorObjectLinks links) {
    this.links = links;
    return this;
  }

   /**
   * Get links
   * @return links
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_LINKS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public ErrorObjectLinks getLinks() {
    return links;
  }


  @JsonProperty(JSON_PROPERTY_LINKS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLinks(ErrorObjectLinks links) {
    this.links = links;
  }


  public ErrorObject source(ErrorObjectSource source) {
    this.source = source;
    return this;
  }

   /**
   * Get source
   * @return source
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_SOURCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public ErrorObjectSource getSource() {
    return source;
  }


  @JsonProperty(JSON_PROPERTY_SOURCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSource(ErrorObjectSource source) {
    this.source = source;
  }


  public ErrorObject title(String title) {
    this.title = title;
    return this;
  }

   /**
   * A short, human-readable summary of the problem.  This should not change from occurrence to occurrence of the problem
   * @return title
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "A short, human-readable summary of the problem.  This should not change from occurrence to occurrence of the problem")
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


  /**
   * Return true if this ErrorObject object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ErrorObject errorObject = (ErrorObject) o;
    return Objects.equals(this.code, errorObject.code) &&
        Objects.equals(this.detail, errorObject.detail) &&
        Objects.equals(this.id, errorObject.id) &&
        Objects.equals(this.links, errorObject.links) &&
        Objects.equals(this.source, errorObject.source) &&
        Objects.equals(this.title, errorObject.title);
  }

  @Override
  public int hashCode() {
    return Objects.hash(code, detail, id, links, source, title);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ErrorObject {\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    detail: ").append(toIndentedString(detail)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    links: ").append(toIndentedString(links)).append("\n");
    sb.append("    source: ").append(toIndentedString(source)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
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

