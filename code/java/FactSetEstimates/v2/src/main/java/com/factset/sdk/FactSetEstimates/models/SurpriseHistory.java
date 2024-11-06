/*
 * FactSet Estimates
 * With global coverage since 1999, the FactSet Estimates API provides you with comprehensive estimates and statistics on a wide variety of financial statement items as well as industry-specific metrics. The universe is comprised of over 19,000 active companies across 90+ countries with the following types of data included:   - **Consensus** - **Detail** - **Ratings** - **Surprise** - **Segments** - **New Estimates and Ratings Reports Endpoints**  For clients seeking  curated and relevant financial data, the FactSet Estimates API now includes Estimates and Ratings Reports endpoints. These powerful endpoints are designed for easy integration and consumption, delivering a wide array of financial metrics, estimates, and critical statistics in a highly accessible format suitable for both mobile and web applications.   Whether you are an analyst, investor, or financial professional, the Estimates and Ratings Reports endpoints offer detailed and actionable financial insights that can support thorough analyses and strategic decision-making processes.   The Estimates and Ratings Reports endpoints are especially valuable for B2B2C  applications, empowering financial services firms, investment companies, and corporate finance teams to:   - **Elevate Client Engagement:** Enrich user experiences in client-facing applications with comprehensive and up-to-date financial metrics.  - **Build Custom Reporting Tools:** Create tailored dashboards and analytics tools that provide deep insights and foster better financial understanding.  By adopting the FactSet Estimates API with its enriched Estimates and Ratings Reports endpoints, businesses can streamline their financial data integration process, improve operational efficiency, and deliver superior financial insights to their clients and end-users.     <p>This API is rate-limited to 10 requests per second and 10 concurrent requests per user.</p>  **Download API Specification**        To programmatically download the FactSet Estimates API Specification file in .yaml format, utilize the link below. You must be authorized for this API to extract the specification. This specification can then be used for Codegen to create your own SDKs. You can also access it by selecting the \"Download Spec\" button beside the version information.      [https://api.factset.com/content/factset-estimates/v2/spec/swagger.yaml](https://api.factset.com/content/factset-estimates/v2/spec/swagger.yaml) 
 *
 * The version of the OpenAPI document: 2.6.0
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
import java.time.LocalDate;
import org.openapitools.jackson.nullable.JsonNullable;
import com.fasterxml.jackson.annotation.JsonIgnore;
import org.openapitools.jackson.nullable.JsonNullable;
import java.util.NoSuchElementException;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.factset.sdk.FactSetEstimates.JSON;


/**
 * SurpriseHistory
 */
@JsonPropertyOrder({
  SurpriseHistory.JSON_PROPERTY_END_DATE,
  SurpriseHistory.JSON_PROPERTY_CURRENCY,
  SurpriseHistory.JSON_PROPERTY_HIGH,
  SurpriseHistory.JSON_PROPERTY_LOW,
  SurpriseHistory.JSON_PROPERTY_UP,
  SurpriseHistory.JSON_PROPERTY_DOWN,
  SurpriseHistory.JSON_PROPERTY_ANALYST_COUNT,
  SurpriseHistory.JSON_PROPERTY_MEAN,
  SurpriseHistory.JSON_PROPERTY_MEDIAN,
  SurpriseHistory.JSON_PROPERTY_STANDARD_DEVIATION,
  SurpriseHistory.JSON_PROPERTY_ACTUAL,
  SurpriseHistory.JSON_PROPERTY_SURPRISE_PERCENT
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")

public class SurpriseHistory implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_END_DATE = "endDate";
  private JsonNullable<LocalDate> endDate = JsonNullable.<LocalDate>undefined();

  public static final String JSON_PROPERTY_CURRENCY = "currency";
  private JsonNullable<String> currency = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_HIGH = "high";
  private JsonNullable<Double> high = JsonNullable.<Double>undefined();

  public static final String JSON_PROPERTY_LOW = "low";
  private JsonNullable<Double> low = JsonNullable.<Double>undefined();

  public static final String JSON_PROPERTY_UP = "up";
  private JsonNullable<Integer> up = JsonNullable.<Integer>undefined();

  public static final String JSON_PROPERTY_DOWN = "down";
  private JsonNullable<Integer> down = JsonNullable.<Integer>undefined();

  public static final String JSON_PROPERTY_ANALYST_COUNT = "analystCount";
  private JsonNullable<Integer> analystCount = JsonNullable.<Integer>undefined();

  public static final String JSON_PROPERTY_MEAN = "mean";
  private JsonNullable<Double> mean = JsonNullable.<Double>undefined();

  public static final String JSON_PROPERTY_MEDIAN = "median";
  private JsonNullable<Double> median = JsonNullable.<Double>undefined();

  public static final String JSON_PROPERTY_STANDARD_DEVIATION = "standardDeviation";
  private JsonNullable<Double> standardDeviation = JsonNullable.<Double>undefined();

  public static final String JSON_PROPERTY_ACTUAL = "actual";
  private JsonNullable<Double> actual = JsonNullable.<Double>undefined();

  public static final String JSON_PROPERTY_SURPRISE_PERCENT = "surprisePercent";
  private JsonNullable<Double> surprisePercent = JsonNullable.<Double>undefined();

  public SurpriseHistory() { 
  }

  public SurpriseHistory endDate(LocalDate endDate) {
    this.endDate = JsonNullable.<LocalDate>of(endDate);
    return this;
  }

   /**
   * Fiscal period end date for which the consensus estimate is being forecasted.
   * @return endDate
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "Sat Jan 01 00:00:00 UTC 2022", value = "Fiscal period end date for which the consensus estimate is being forecasted.")
  @JsonIgnore

  public LocalDate getEndDate() {
        return endDate.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_END_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<LocalDate> getEndDate_JsonNullable() {
    return endDate;
  }
  
  @JsonProperty(JSON_PROPERTY_END_DATE)
  public void setEndDate_JsonNullable(JsonNullable<LocalDate> endDate) {
    this.endDate = endDate;
  }

  public void setEndDate(LocalDate endDate) {
    this.endDate = JsonNullable.<LocalDate>of(endDate);
  }


  public SurpriseHistory currency(String currency) {
    this.currency = JsonNullable.<String>of(currency);
    return this;
  }

   /**
   * Currency used for calculations, majority currency in which the analysts are contributing their estimates. For a list of supported ISO currency codes, visit [Online Assistant Page #1470](https://oa.apps.factset.com/pages/1470).
   * @return currency
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "USD", value = "Currency used for calculations, majority currency in which the analysts are contributing their estimates. For a list of supported ISO currency codes, visit [Online Assistant Page #1470](https://oa.apps.factset.com/pages/1470).")
  @JsonIgnore

  public String getCurrency() {
        return currency.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_CURRENCY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getCurrency_JsonNullable() {
    return currency;
  }
  
  @JsonProperty(JSON_PROPERTY_CURRENCY)
  public void setCurrency_JsonNullable(JsonNullable<String> currency) {
    this.currency = currency;
  }

  public void setCurrency(String currency) {
    this.currency = JsonNullable.<String>of(currency);
  }


  public SurpriseHistory high(Double high) {
    this.high = JsonNullable.<Double>of(high);
    return this;
  }

   /**
   * The highest estimate provided by the analysts for the specified period.
   * @return high
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "5.1", value = "The highest estimate provided by the analysts for the specified period.")
  @JsonIgnore

  public Double getHigh() {
        return high.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_HIGH)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Double> getHigh_JsonNullable() {
    return high;
  }
  
  @JsonProperty(JSON_PROPERTY_HIGH)
  public void setHigh_JsonNullable(JsonNullable<Double> high) {
    this.high = high;
  }

  public void setHigh(Double high) {
    this.high = JsonNullable.<Double>of(high);
  }


  public SurpriseHistory low(Double low) {
    this.low = JsonNullable.<Double>of(low);
    return this;
  }

   /**
   * The lowest estimate provided by the analysts for the specified period.
   * @return low
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "0.7", value = "The lowest estimate provided by the analysts for the specified period.")
  @JsonIgnore

  public Double getLow() {
        return low.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_LOW)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Double> getLow_JsonNullable() {
    return low;
  }
  
  @JsonProperty(JSON_PROPERTY_LOW)
  public void setLow_JsonNullable(JsonNullable<Double> low) {
    this.low = low;
  }

  public void setLow(Double low) {
    this.low = JsonNullable.<Double>of(low);
  }


  public SurpriseHistory up(Integer up) {
    this.up = JsonNullable.<Integer>of(up);
    return this;
  }

   /**
   * Number of estimates revised upwards.
   * @return up
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "1", value = "Number of estimates revised upwards.")
  @JsonIgnore

  public Integer getUp() {
        return up.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_UP)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Integer> getUp_JsonNullable() {
    return up;
  }
  
  @JsonProperty(JSON_PROPERTY_UP)
  public void setUp_JsonNullable(JsonNullable<Integer> up) {
    this.up = up;
  }

  public void setUp(Integer up) {
    this.up = JsonNullable.<Integer>of(up);
  }


  public SurpriseHistory down(Integer down) {
    this.down = JsonNullable.<Integer>of(down);
    return this;
  }

   /**
   * Number of estimates revised downwards.
   * @return down
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "1", value = "Number of estimates revised downwards.")
  @JsonIgnore

  public Integer getDown() {
        return down.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_DOWN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Integer> getDown_JsonNullable() {
    return down;
  }
  
  @JsonProperty(JSON_PROPERTY_DOWN)
  public void setDown_JsonNullable(JsonNullable<Integer> down) {
    this.down = down;
  }

  public void setDown(Integer down) {
    this.down = JsonNullable.<Integer>of(down);
  }


  public SurpriseHistory analystCount(Integer analystCount) {
    this.analystCount = JsonNullable.<Integer>of(analystCount);
    return this;
  }

   /**
   * The number of analysts who provided estimates for the given period.
   * @return analystCount
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "10", value = "The number of analysts who provided estimates for the given period.")
  @JsonIgnore

  public Integer getAnalystCount() {
        return analystCount.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_ANALYST_COUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Integer> getAnalystCount_JsonNullable() {
    return analystCount;
  }
  
  @JsonProperty(JSON_PROPERTY_ANALYST_COUNT)
  public void setAnalystCount_JsonNullable(JsonNullable<Integer> analystCount) {
    this.analystCount = analystCount;
  }

  public void setAnalystCount(Integer analystCount) {
    this.analystCount = JsonNullable.<Integer>of(analystCount);
  }


  public SurpriseHistory mean(Double mean) {
    this.mean = JsonNullable.<Double>of(mean);
    return this;
  }

   /**
   * The average of all estimates provided by the analysts for the specified period.
   * @return mean
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "3.12", value = "The average of all estimates provided by the analysts for the specified period.")
  @JsonIgnore

  public Double getMean() {
        return mean.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_MEAN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Double> getMean_JsonNullable() {
    return mean;
  }
  
  @JsonProperty(JSON_PROPERTY_MEAN)
  public void setMean_JsonNullable(JsonNullable<Double> mean) {
    this.mean = mean;
  }

  public void setMean(Double mean) {
    this.mean = JsonNullable.<Double>of(mean);
  }


  public SurpriseHistory median(Double median) {
    this.median = JsonNullable.<Double>of(median);
    return this;
  }

   /**
   * The median of all estimates provided by the analysts for the specified period.
   * @return median
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "2.5", value = "The median of all estimates provided by the analysts for the specified period.")
  @JsonIgnore

  public Double getMedian() {
        return median.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_MEDIAN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Double> getMedian_JsonNullable() {
    return median;
  }
  
  @JsonProperty(JSON_PROPERTY_MEDIAN)
  public void setMedian_JsonNullable(JsonNullable<Double> median) {
    this.median = median;
  }

  public void setMedian(Double median) {
    this.median = JsonNullable.<Double>of(median);
  }


  public SurpriseHistory standardDeviation(Double standardDeviation) {
    this.standardDeviation = JsonNullable.<Double>of(standardDeviation);
    return this;
  }

   /**
   * Measure of the dispersion of estimates around the consensus value.
   * @return standardDeviation
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "0.5", value = "Measure of the dispersion of estimates around the consensus value.")
  @JsonIgnore

  public Double getStandardDeviation() {
        return standardDeviation.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_STANDARD_DEVIATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Double> getStandardDeviation_JsonNullable() {
    return standardDeviation;
  }
  
  @JsonProperty(JSON_PROPERTY_STANDARD_DEVIATION)
  public void setStandardDeviation_JsonNullable(JsonNullable<Double> standardDeviation) {
    this.standardDeviation = standardDeviation;
  }

  public void setStandardDeviation(Double standardDeviation) {
    this.standardDeviation = JsonNullable.<Double>of(standardDeviation);
  }


  public SurpriseHistory actual(Double actual) {
    this.actual = JsonNullable.<Double>of(actual);
    return this;
  }

   /**
   * Get actual
   * @return actual
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "0.6", value = "")
  @JsonIgnore

  public Double getActual() {
        return actual.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_ACTUAL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Double> getActual_JsonNullable() {
    return actual;
  }
  
  @JsonProperty(JSON_PROPERTY_ACTUAL)
  public void setActual_JsonNullable(JsonNullable<Double> actual) {
    this.actual = actual;
  }

  public void setActual(Double actual) {
    this.actual = JsonNullable.<Double>of(actual);
  }


  public SurpriseHistory surprisePercent(Double surprisePercent) {
    this.surprisePercent = JsonNullable.<Double>of(surprisePercent);
    return this;
  }

   /**
   * Percent difference between last consensus and actual. For more details, visit [Online Assistant Page #16145](https://oa.apps.factset.com/pages/16145).
   * @return surprisePercent
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "0.6", value = "Percent difference between last consensus and actual. For more details, visit [Online Assistant Page #16145](https://oa.apps.factset.com/pages/16145).")
  @JsonIgnore

  public Double getSurprisePercent() {
        return surprisePercent.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_SURPRISE_PERCENT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Double> getSurprisePercent_JsonNullable() {
    return surprisePercent;
  }
  
  @JsonProperty(JSON_PROPERTY_SURPRISE_PERCENT)
  public void setSurprisePercent_JsonNullable(JsonNullable<Double> surprisePercent) {
    this.surprisePercent = surprisePercent;
  }

  public void setSurprisePercent(Double surprisePercent) {
    this.surprisePercent = JsonNullable.<Double>of(surprisePercent);
  }


  /**
   * Return true if this SurpriseHistory object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SurpriseHistory surpriseHistory = (SurpriseHistory) o;
    return equalsNullable(this.endDate, surpriseHistory.endDate) &&
        equalsNullable(this.currency, surpriseHistory.currency) &&
        equalsNullable(this.high, surpriseHistory.high) &&
        equalsNullable(this.low, surpriseHistory.low) &&
        equalsNullable(this.up, surpriseHistory.up) &&
        equalsNullable(this.down, surpriseHistory.down) &&
        equalsNullable(this.analystCount, surpriseHistory.analystCount) &&
        equalsNullable(this.mean, surpriseHistory.mean) &&
        equalsNullable(this.median, surpriseHistory.median) &&
        equalsNullable(this.standardDeviation, surpriseHistory.standardDeviation) &&
        equalsNullable(this.actual, surpriseHistory.actual) &&
        equalsNullable(this.surprisePercent, surpriseHistory.surprisePercent);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(hashCodeNullable(endDate), hashCodeNullable(currency), hashCodeNullable(high), hashCodeNullable(low), hashCodeNullable(up), hashCodeNullable(down), hashCodeNullable(analystCount), hashCodeNullable(mean), hashCodeNullable(median), hashCodeNullable(standardDeviation), hashCodeNullable(actual), hashCodeNullable(surprisePercent));
  }

  private static <T> int hashCodeNullable(JsonNullable<T> a) {
    if (a == null) {
      return 1;
    }
    return a.isPresent() ? Arrays.deepHashCode(new Object[]{a.get()}) : 31;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SurpriseHistory {\n");
    sb.append("    endDate: ").append(toIndentedString(endDate)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("    high: ").append(toIndentedString(high)).append("\n");
    sb.append("    low: ").append(toIndentedString(low)).append("\n");
    sb.append("    up: ").append(toIndentedString(up)).append("\n");
    sb.append("    down: ").append(toIndentedString(down)).append("\n");
    sb.append("    analystCount: ").append(toIndentedString(analystCount)).append("\n");
    sb.append("    mean: ").append(toIndentedString(mean)).append("\n");
    sb.append("    median: ").append(toIndentedString(median)).append("\n");
    sb.append("    standardDeviation: ").append(toIndentedString(standardDeviation)).append("\n");
    sb.append("    actual: ").append(toIndentedString(actual)).append("\n");
    sb.append("    surprisePercent: ").append(toIndentedString(surprisePercent)).append("\n");
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

