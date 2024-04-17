/*
 * Foreign Exchange Rates API
 * Foreign Exchange Rates API in which retrieves Spots and Forwards for a given currency pair and date range. <p>*Spots and Forwards rates are sourced from W/M Reuters.The WM Company calculates daily standardized spot rates for global foreign exchange transactions, using rates provided by Reuters. These rates are recognized globally as the standard by banks, fund managers, and index compilers; increasingly these rates are also being used for benchmark currency trading. In 1994, WM Company began calculating closing spot rates. Closing spot rates provide a standard set of currency rates so that portfolio valuations can be compared to each other and their performances measured against benchmarks, without having discrepancies caused by exchange rates. Closing spot rates are recorded at 16:00 GMT.*</p> 
 *
 * The version of the OpenAPI document: 1.0.0
 * Contact: api@factset.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.factset.sdk.ForeignExchangeRate.models;

import java.util.Objects;
import java.util.Arrays;
import java.util.Map;
import java.util.HashMap;
import com.factset.sdk.ForeignExchangeRate.models.ForwardPeriod;
import com.factset.sdk.ForeignExchangeRate.models.Frequency;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.factset.sdk.ForeignExchangeRate.JSON;


/**
 * Forwards Request Body
 */
@ApiModel(description = "Forwards Request Body")
@JsonPropertyOrder({
  ForwardsRequest.JSON_PROPERTY_IDS,
  ForwardsRequest.JSON_PROPERTY_FORWARD_PERIOD,
  ForwardsRequest.JSON_PROPERTY_START_DATE,
  ForwardsRequest.JSON_PROPERTY_END_DATE,
  ForwardsRequest.JSON_PROPERTY_FREQUENCY
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")

public class ForwardsRequest implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_IDS = "ids";
  private java.util.List<String> ids = new java.util.ArrayList<>();

  public static final String JSON_PROPERTY_FORWARD_PERIOD = "forwardPeriod";
  private ForwardPeriod forwardPeriod = ForwardPeriod._1M;

  public static final String JSON_PROPERTY_START_DATE = "startDate";
  private String startDate;

  public static final String JSON_PROPERTY_END_DATE = "endDate";
  private String endDate;

  public static final String JSON_PROPERTY_FREQUENCY = "frequency";
  private Frequency frequency = Frequency.D;

  public ForwardsRequest() { 
  }

  @JsonCreator
  public ForwardsRequest(
    @JsonProperty(value=JSON_PROPERTY_IDS, required=true) java.util.List<String> ids
  ) {
    this();
    this.ids = ids;
  }

  public ForwardsRequest ids(java.util.List<String> ids) {
    this.ids = ids;
    return this;
  }

  public ForwardsRequest addIdsItem(String idsItem) {
    this.ids.add(idsItem);
    return this;
  }

   /**
   * The currency pair requested in the format of a ISO {source}{target}. For a complete list of ISO currencies, please visit [OA 1470](https://my.apps.factset.com/oa/pages/1470)
   * @return ids
  **/
  @jakarta.annotation.Nonnull
  @ApiModelProperty(example = "[\"USDGBP\",\"USDEUR\"]", required = true, value = "The currency pair requested in the format of a ISO {source}{target}. For a complete list of ISO currencies, please visit [OA 1470](https://my.apps.factset.com/oa/pages/1470)")
  @JsonProperty(JSON_PROPERTY_IDS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public java.util.List<String> getIds() {
    return ids;
  }


  @JsonProperty(JSON_PROPERTY_IDS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setIds(java.util.List<String> ids) {
    this.ids = ids;
  }


  public ForwardsRequest forwardPeriod(ForwardPeriod forwardPeriod) {
    this.forwardPeriod = forwardPeriod;
    return this;
  }

   /**
   * Get forwardPeriod
   * @return forwardPeriod
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_FORWARD_PERIOD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public ForwardPeriod getForwardPeriod() {
    return forwardPeriod;
  }


  @JsonProperty(JSON_PROPERTY_FORWARD_PERIOD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setForwardPeriod(ForwardPeriod forwardPeriod) {
    this.forwardPeriod = forwardPeriod;
  }


  public ForwardsRequest startDate(String startDate) {
    this.startDate = startDate;
    return this;
  }

   /**
   * The start date requested for a given date range in **YYYY-MM-DD** format. If left blank, the API will default to latest available. 
   * @return startDate
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "2019-01-01", value = "The start date requested for a given date range in **YYYY-MM-DD** format. If left blank, the API will default to latest available. ")
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


  public ForwardsRequest endDate(String endDate) {
    this.endDate = endDate;
    return this;
  }

   /**
   * The end date requested for a given date range in **YYYY-MM-DD** format. If left blank, the API will default to latest available. 
   * @return endDate
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "2019-12-31", value = "The end date requested for a given date range in **YYYY-MM-DD** format. If left blank, the API will default to latest available. ")
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


  public ForwardsRequest frequency(Frequency frequency) {
    this.frequency = frequency;
    return this;
  }

   /**
   * Get frequency
   * @return frequency
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_FREQUENCY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Frequency getFrequency() {
    return frequency;
  }


  @JsonProperty(JSON_PROPERTY_FREQUENCY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFrequency(Frequency frequency) {
    this.frequency = frequency;
  }


  /**
   * Return true if this forwardsRequest object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ForwardsRequest forwardsRequest = (ForwardsRequest) o;
    return Objects.equals(this.ids, forwardsRequest.ids) &&
        Objects.equals(this.forwardPeriod, forwardsRequest.forwardPeriod) &&
        Objects.equals(this.startDate, forwardsRequest.startDate) &&
        Objects.equals(this.endDate, forwardsRequest.endDate) &&
        Objects.equals(this.frequency, forwardsRequest.frequency);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ids, forwardPeriod, startDate, endDate, frequency);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ForwardsRequest {\n");
    sb.append("    ids: ").append(toIndentedString(ids)).append("\n");
    sb.append("    forwardPeriod: ").append(toIndentedString(forwardPeriod)).append("\n");
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
    sb.append("    endDate: ").append(toIndentedString(endDate)).append("\n");
    sb.append("    frequency: ").append(toIndentedString(frequency)).append("\n");
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

