/*
 * FactSet Estimates
 * With global coverage since 1999, the FactSet Estimates API provides you with comprehensive estimates and statistics on a wide variety of financial statement items as well as industry-specific metrics. The universe is comprised of over 19,000 active companies across 90+ countries with the following types of data included:   - **Consensus** - **Detail** - **Ratings** - **Surprise** - **Segments** - **Actuals** - **New Estimates and Ratings Reports Endpoints**  For clients seeking  curated and relevant financial data, the FactSet Estimates API now includes Estimates and Ratings Reports endpoints. These powerful endpoints are designed for easy integration and consumption, delivering a wide array of financial metrics, estimates, and critical statistics in a highly accessible format suitable for both mobile and web applications.   Whether you are an analyst, investor, or financial professional, the Estimates and Ratings Reports endpoints offer detailed and actionable financial insights that can support thorough analyses and strategic decision-making processes.   The Estimates and Ratings Reports endpoints are especially valuable for B2B2C  applications, empowering financial services firms, investment companies, and corporate finance teams to:   - **Elevate Client Engagement:** Enrich user experiences in client-facing applications with comprehensive and up-to-date financial metrics.  - **Build Custom Reporting Tools:** Create tailored dashboards and analytics tools that provide deep insights and foster better financial understanding.  By adopting the FactSet Estimates API with its enriched Estimates and Ratings Reports endpoints, businesses can streamline their financial data integration process, improve operational efficiency, and deliver superior financial insights to their clients and end-users.     <p>This API is rate-limited to 10 requests per second and 10 concurrent requests per user.</p>  **Download API Specification**        To programmatically download the FactSet Estimates API Specification file in .yaml format, utilize the link below. You must be authorized for this API to extract the specification. This specification can then be used for Codegen to create your own SDKs. You can also access it by selecting the \"Download Spec\" button beside the version information.      [https://api.factset.com/content/factset-estimates/v2/spec/swagger.yaml](https://api.factset.com/content/factset-estimates/v2/spec/swagger.yaml) 
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
import org.openapitools.jackson.nullable.JsonNullable;
import com.fasterxml.jackson.annotation.JsonIgnore;
import org.openapitools.jackson.nullable.JsonNullable;
import java.util.NoSuchElementException;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.factset.sdk.FactSetEstimates.JSON;


/**
 * Metric
 */
@JsonPropertyOrder({
  Metric.JSON_PROPERTY_METRIC,
  Metric.JSON_PROPERTY_NAME,
  Metric.JSON_PROPERTY_CATEGORY,
  Metric.JSON_PROPERTY_SUBCATEGORY,
  Metric.JSON_PROPERTY_OAURL
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")

public class Metric implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_METRIC = "metric";
  private JsonNullable<String> metric = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_NAME = "name";
  private JsonNullable<String> name = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_CATEGORY = "category";
  private JsonNullable<String> category = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_SUBCATEGORY = "subcategory";
  private JsonNullable<String> subcategory = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_OAURL = "OAurl";
  private JsonNullable<String> oaurl = JsonNullable.<String>undefined();

  public Metric() { 
  }

  public Metric metric(String metric) {
    this.metric = JsonNullable.<String>of(metric);
    return this;
  }

   /**
   * Metric identifier to be used as &#x60;metrics&#x60; input in the FactSet Estimate endpoints.
   * @return metric
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "ASSETS", value = "Metric identifier to be used as `metrics` input in the FactSet Estimate endpoints.")
  @JsonIgnore

  public String getMetric() {
        return metric.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_METRIC)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getMetric_JsonNullable() {
    return metric;
  }
  
  @JsonProperty(JSON_PROPERTY_METRIC)
  public void setMetric_JsonNullable(JsonNullable<String> metric) {
    this.metric = metric;
  }

  public void setMetric(String metric) {
    this.metric = JsonNullable.<String>of(metric);
  }


  public Metric name(String name) {
    this.name = JsonNullable.<String>of(name);
    return this;
  }

   /**
   * Plain text name of the metric.
   * @return name
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "Total Assets", value = "Plain text name of the metric.")
  @JsonIgnore

  public String getName() {
        return name.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getName_JsonNullable() {
    return name;
  }
  
  @JsonProperty(JSON_PROPERTY_NAME)
  public void setName_JsonNullable(JsonNullable<String> name) {
    this.name = name;
  }

  public void setName(String name) {
    this.name = JsonNullable.<String>of(name);
  }


  public Metric category(String category) {
    this.category = JsonNullable.<String>of(category);
    return this;
  }

   /**
   * Primary Category of metric item, such as, FINANCIAL_STATEMENT or INDUSTRY_METRIC
   * @return category
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "FINANCIAL_STATEMENT", value = "Primary Category of metric item, such as, FINANCIAL_STATEMENT or INDUSTRY_METRIC")
  @JsonIgnore

  public String getCategory() {
        return category.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_CATEGORY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getCategory_JsonNullable() {
    return category;
  }
  
  @JsonProperty(JSON_PROPERTY_CATEGORY)
  public void setCategory_JsonNullable(JsonNullable<String> category) {
    this.category = category;
  }

  public void setCategory(String category) {
    this.category = JsonNullable.<String>of(category);
  }


  public Metric subcategory(String subcategory) {
    this.subcategory = JsonNullable.<String>of(subcategory);
    return this;
  }

   /**
   * Sub-category of metric items, such as the INCOME_STATEMENT or AIRLINES.
   * @return subcategory
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "BALANCE_SHEET", value = "Sub-category of metric items, such as the INCOME_STATEMENT or AIRLINES.")
  @JsonIgnore

  public String getSubcategory() {
        return subcategory.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_SUBCATEGORY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getSubcategory_JsonNullable() {
    return subcategory;
  }
  
  @JsonProperty(JSON_PROPERTY_SUBCATEGORY)
  public void setSubcategory_JsonNullable(JsonNullable<String> subcategory) {
    this.subcategory = subcategory;
  }

  public void setSubcategory(String subcategory) {
    this.subcategory = JsonNullable.<String>of(subcategory);
  }


  public Metric oaurl(String oaurl) {
    this.oaurl = JsonNullable.<String>of(oaurl);
    return this;
  }

   /**
   * The Online Assistant Page URL, used to lookup the definition and methodology of the requested item.
   * @return oaurl
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "https://my.apps.factset.com/oa/pages/16283", value = "The Online Assistant Page URL, used to lookup the definition and methodology of the requested item.")
  @JsonIgnore

  public String getOaurl() {
        return oaurl.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_OAURL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getOaurl_JsonNullable() {
    return oaurl;
  }
  
  @JsonProperty(JSON_PROPERTY_OAURL)
  public void setOaurl_JsonNullable(JsonNullable<String> oaurl) {
    this.oaurl = oaurl;
  }

  public void setOaurl(String oaurl) {
    this.oaurl = JsonNullable.<String>of(oaurl);
  }


  /**
   * Return true if this metric object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Metric metric = (Metric) o;
    return equalsNullable(this.metric, metric.metric) &&
        equalsNullable(this.name, metric.name) &&
        equalsNullable(this.category, metric.category) &&
        equalsNullable(this.subcategory, metric.subcategory) &&
        equalsNullable(this.oaurl, metric.oaurl);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(hashCodeNullable(metric), hashCodeNullable(name), hashCodeNullable(category), hashCodeNullable(subcategory), hashCodeNullable(oaurl));
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
    sb.append("class Metric {\n");
    sb.append("    metric: ").append(toIndentedString(metric)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    category: ").append(toIndentedString(category)).append("\n");
    sb.append("    subcategory: ").append(toIndentedString(subcategory)).append("\n");
    sb.append("    oaurl: ").append(toIndentedString(oaurl)).append("\n");
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

