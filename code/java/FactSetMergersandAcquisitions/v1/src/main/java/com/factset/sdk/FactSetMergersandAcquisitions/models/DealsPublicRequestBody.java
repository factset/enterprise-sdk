/*
 * FactSet Mergers and Acquisitions API
 * The FactSet Mergers and Acquisitions API provides access to key transactions and pricing metrics on over 60,000 globally traded deals. Reference a Global Universe of Mergers and Acquisitions (M&A) transactions where the target of the deal is a Publicly traded Company. Review premiums, multiples and fundamental data to gather insights on deals and create predictive models based on different deal characteristics.    Monetary values returned by this API are converted and represented in USD.    This API is allows a limit of 10 requests per second and a maximum of 10 concurrent requests. 
 *
 * The version of the OpenAPI document: 1.1.0
 * Contact: api@factset.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.factset.sdk.FactSetMergersandAcquisitions.models;

import java.util.Objects;
import java.util.Arrays;
import java.util.Map;
import java.util.HashMap;
import com.factset.sdk.FactSetMergersandAcquisitions.models.Status;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.factset.sdk.FactSetMergersandAcquisitions.JSON;


/**
 * Deals Request Body
 */
@ApiModel(description = "Deals Request Body")
@JsonPropertyOrder({
  DealsPublicRequestBody.JSON_PROPERTY_START_DATE,
  DealsPublicRequestBody.JSON_PROPERTY_END_DATE,
  DealsPublicRequestBody.JSON_PROPERTY_STATUS
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")

public class DealsPublicRequestBody implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_START_DATE = "startDate";
  private String startDate;

  public static final String JSON_PROPERTY_END_DATE = "endDate";
  private String endDate;

  public static final String JSON_PROPERTY_STATUS = "status";
  private Status status = Status.ALL;

  public DealsPublicRequestBody() { 
  }

  public DealsPublicRequestBody startDate(String startDate) {
    this.startDate = startDate;
    return this;
  }

   /**
   * The start date requested for a given date range in **YYYY-MM-DD** format. Future dates (T+1) are not accepted in this endpoint. 
   * @return startDate
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "2017-12-01", value = "The start date requested for a given date range in **YYYY-MM-DD** format. Future dates (T+1) are not accepted in this endpoint. ")
  @JsonProperty(JSON_PROPERTY_START_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getStartDate() {
    return startDate;
  }


  @JsonProperty(JSON_PROPERTY_START_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setStartDate(String startDate) {
    this.startDate = startDate;
  }


  public DealsPublicRequestBody endDate(String endDate) {
    this.endDate = endDate;
    return this;
  }

   /**
   * The end date requested for a given date range in **YYYY-MM-DD** format. Future dates (T+1) are not accepted in this endpoint. 
   * @return endDate
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "2017-12-31", value = "The end date requested for a given date range in **YYYY-MM-DD** format. Future dates (T+1) are not accepted in this endpoint. ")
  @JsonProperty(JSON_PROPERTY_END_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getEndDate() {
    return endDate;
  }


  @JsonProperty(JSON_PROPERTY_END_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEndDate(String endDate) {
    this.endDate = endDate;
  }


  public DealsPublicRequestBody status(Status status) {
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Status getStatus() {
    return status;
  }


  @JsonProperty(JSON_PROPERTY_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setStatus(Status status) {
    this.status = status;
  }


  /**
   * Return true if this DealsPublicRequestBody object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DealsPublicRequestBody dealsPublicRequestBody = (DealsPublicRequestBody) o;
    return Objects.equals(this.startDate, dealsPublicRequestBody.startDate) &&
        Objects.equals(this.endDate, dealsPublicRequestBody.endDate) &&
        Objects.equals(this.status, dealsPublicRequestBody.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(startDate, endDate, status);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DealsPublicRequestBody {\n");
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
    sb.append("    endDate: ").append(toIndentedString(endDate)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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

