/*
 * Market Intelligence
 * Through the Market Intelligence API, stay up to date on the companies and sectors you care most about with ease. Request the templates you have made in Market Intelligence to receive news and data on your portfolio.
 *
 * The version of the OpenAPI document: 1.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.factset.sdk.MarketIntelligence.models;

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
import com.factset.sdk.MarketIntelligence.JSON;


/**
 * Response that a user will receive on successful report creation
 */
@ApiModel(description = "Response that a user will receive on successful report creation")
@JsonPropertyOrder({
  PostResponseInfo.JSON_PROPERTY_STATUS,
  PostResponseInfo.JSON_PROPERTY_REPORT_ID
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")

public class PostResponseInfo implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_STATUS = "status";
  private String status;

  public static final String JSON_PROPERTY_REPORT_ID = "report_id";
  private String reportId;

  public PostResponseInfo() { 
  }

  public PostResponseInfo status(String status) {
    this.status = status;
    return this;
  }

   /**
   * successful response status
   * @return status
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "200", value = "successful response status")
  @JsonProperty(JSON_PROPERTY_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getStatus() {
    return status;
  }


  @JsonProperty(JSON_PROPERTY_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setStatus(String status) {
    this.status = status;
  }


  public PostResponseInfo reportId(String reportId) {
    this.reportId = reportId;
    return this;
  }

   /**
   * Report ID
   * @return reportId
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "65ba6dd63fb366464646426d0b", value = "Report ID")
  @JsonProperty(JSON_PROPERTY_REPORT_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getReportId() {
    return reportId;
  }


  @JsonProperty(JSON_PROPERTY_REPORT_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setReportId(String reportId) {
    this.reportId = reportId;
  }


  /**
   * Return true if this Post_Response_info object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PostResponseInfo postResponseInfo = (PostResponseInfo) o;
    return Objects.equals(this.status, postResponseInfo.status) &&
        Objects.equals(this.reportId, postResponseInfo.reportId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(status, reportId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PostResponseInfo {\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    reportId: ").append(toIndentedString(reportId)).append("\n");
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

