/*
 * FactSet Estimates
 * With global coverage since 1999, the FactSet Estimates API provides you with comprehensive estimates and statistics on a wide variety of financial statement items as well as industry-specific metrics. The universe is comprised of over 19,000 active companies across 90+ countries with the following types of data included:   - **Consensus** - **Detail** - **Ratings** - **Surprise** - **Segments** - **Actuals** - **New Estimates and Ratings Reports Endpoints**  For clients seeking  curated and relevant financial data, the FactSet Estimates API now includes Estimates and Ratings Reports endpoints. These powerful endpoints are designed for easy integration and consumption, delivering a wide array of financial metrics, estimates, and critical statistics in a highly accessible format suitable for both mobile and web applications.   Whether you are an analyst, investor, or financial professional, the Estimates and Ratings Reports endpoints offer detailed and actionable financial insights that can support thorough analyses and strategic decision-making processes.   The Estimates and Ratings Reports endpoints are especially valuable for B2B2C  applications, empowering financial services firms, investment companies, and corporate finance teams to:   - **Elevate Client Engagement:** Enrich user experiences in client-facing applications with comprehensive and up-to-date financial metrics.  - **Build Custom Reporting Tools:** Create tailored dashboards and analytics tools that provide deep insights and foster better financial understanding.  By adopting the FactSet Estimates API with its enriched Estimates and Ratings Reports endpoints, businesses can streamline their financial data integration process, improve operational efficiency, and deliver superior financial insights to their clients and end-users.     <p>This API is rate-limited to 10 requests per second and 10 concurrent requests per user.</p>  **Download API Specification**        To programmatically download the FactSet Estimates API Specification file in .yaml format, utilize the link below. You must be authorized for this API to extract the specification. This specification can then be used for Codegen to create your own SDKs. You can also access it by selecting the \"Download Spec\" button beside the version information.      [https://api.factset.com/content/factset-estimates/v2/spec/swagger.yaml](https://api.factset.com/content/factset-estimates/v2/spec/swagger.yaml) 
 *
 * The version of the OpenAPI document: 2.7.0
 * Contact: api@factset.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.factset.sdk.FactSetEstimates.models;

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
import com.factset.sdk.FactSetEstimates.JSON;


/**
 * TargetPrice
 */
@JsonPropertyOrder({
  TargetPrice.JSON_PROPERTY_HIGH,
  TargetPrice.JSON_PROPERTY_LOW,
  TargetPrice.JSON_PROPERTY_ANALYSTS_COUNT,
  TargetPrice.JSON_PROPERTY_MEAN,
  TargetPrice.JSON_PROPERTY_MEDIAN
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")

public class TargetPrice implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_HIGH = "high";
  private Double high;

  public static final String JSON_PROPERTY_LOW = "low";
  private Double low;

  public static final String JSON_PROPERTY_ANALYSTS_COUNT = "analystsCount";
  private Integer analystsCount;

  public static final String JSON_PROPERTY_MEAN = "mean";
  private Double mean;

  public static final String JSON_PROPERTY_MEDIAN = "median";
  private Double median;

  public TargetPrice() { 
  }

  public TargetPrice high(Double high) {
    this.high = high;
    return this;
  }

   /**
   * Specifies the highest target price estimated for a given security identifier. Details on the validity of this data are provided in the &#x60;asOfMonth&#x60; field.
   * @return high
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "210.01", value = "Specifies the highest target price estimated for a given security identifier. Details on the validity of this data are provided in the `asOfMonth` field.")
  @JsonProperty(JSON_PROPERTY_HIGH)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Double getHigh() {
    return high;
  }


  @JsonProperty(JSON_PROPERTY_HIGH)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setHigh(Double high) {
    this.high = high;
  }


  public TargetPrice low(Double low) {
    this.low = low;
    return this;
  }

   /**
   * Specifies the lowest target price estimated for a given security identifier. Details on the validity of this data are provided in the &#x60;asOfMonth&#x60; field.
   * @return low
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "110.01", value = "Specifies the lowest target price estimated for a given security identifier. Details on the validity of this data are provided in the `asOfMonth` field.")
  @JsonProperty(JSON_PROPERTY_LOW)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Double getLow() {
    return low;
  }


  @JsonProperty(JSON_PROPERTY_LOW)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLow(Double low) {
    this.low = low;
  }


  public TargetPrice analystsCount(Integer analystsCount) {
    this.analystsCount = analystsCount;
    return this;
  }

   /**
   * The number of analysts providing target price estimates for a given security identifier. Details on the validity of this data are provided in the &#x60;asOfMonth&#x60; field.
   * @return analystsCount
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "15", value = "The number of analysts providing target price estimates for a given security identifier. Details on the validity of this data are provided in the `asOfMonth` field.")
  @JsonProperty(JSON_PROPERTY_ANALYSTS_COUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getAnalystsCount() {
    return analystsCount;
  }


  @JsonProperty(JSON_PROPERTY_ANALYSTS_COUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAnalystsCount(Integer analystsCount) {
    this.analystsCount = analystsCount;
  }


  public TargetPrice mean(Double mean) {
    this.mean = mean;
    return this;
  }

   /**
   * Specifies the mean target price estimated by analysts for a given security identifier. Details on the validity of this data are provided in the &#x60;asOfMonth&#x60; field.
   * @return mean
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "151.933333", value = "Specifies the mean target price estimated by analysts for a given security identifier. Details on the validity of this data are provided in the `asOfMonth` field.")
  @JsonProperty(JSON_PROPERTY_MEAN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Double getMean() {
    return mean;
  }


  @JsonProperty(JSON_PROPERTY_MEAN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMean(Double mean) {
    this.mean = mean;
  }


  public TargetPrice median(Double median) {
    this.median = median;
    return this;
  }

   /**
   * Specifies the median target price estimated by analysts for a given security identifier. Details on the validity of this data are provided in the &#x60;asOfMonth&#x60; field.
   * @return median
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "146.01", value = "Specifies the median target price estimated by analysts for a given security identifier. Details on the validity of this data are provided in the `asOfMonth` field.")
  @JsonProperty(JSON_PROPERTY_MEDIAN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Double getMedian() {
    return median;
  }


  @JsonProperty(JSON_PROPERTY_MEDIAN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMedian(Double median) {
    this.median = median;
  }


  /**
   * Return true if this TargetPrice object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TargetPrice targetPrice = (TargetPrice) o;
    return Objects.equals(this.high, targetPrice.high) &&
        Objects.equals(this.low, targetPrice.low) &&
        Objects.equals(this.analystsCount, targetPrice.analystsCount) &&
        Objects.equals(this.mean, targetPrice.mean) &&
        Objects.equals(this.median, targetPrice.median);
  }

  @Override
  public int hashCode() {
    return Objects.hash(high, low, analystsCount, mean, median);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TargetPrice {\n");
    sb.append("    high: ").append(toIndentedString(high)).append("\n");
    sb.append("    low: ").append(toIndentedString(low)).append("\n");
    sb.append("    analystsCount: ").append(toIndentedString(analystsCount)).append("\n");
    sb.append("    mean: ").append(toIndentedString(mean)).append("\n");
    sb.append("    median: ").append(toIndentedString(median)).append("\n");
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

