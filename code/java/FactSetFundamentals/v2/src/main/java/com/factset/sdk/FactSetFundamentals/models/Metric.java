/*
 * FactSet Fundamentals API
 * Gain access to current, comprehensive, and comparative information on securities in worldwide developed and emerging markets. Composed of annual and interim/quarterly data, detailed historical financial statement content, per-share data, and calculated ratios, FactSet Fundamentals provides you with the information you need for a global investment perspective.<p>This API is rate-limited to 10 requests per second and 10 concurrent requests per user.</p> 
 *
 * The version of the OpenAPI document: 2.2.0
 * Contact: api@factset.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.factset.sdk.FactSetFundamentals.models;

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
import com.factset.sdk.FactSetFundamentals.JSON;


/**
 * Metric
 */
@JsonPropertyOrder({
  Metric.JSON_PROPERTY_METRIC,
  Metric.JSON_PROPERTY_NAME,
  Metric.JSON_PROPERTY_CATEGORY,
  Metric.JSON_PROPERTY_SUBCATEGORY,
  Metric.JSON_PROPERTY_OA_PAGE_ID,
  Metric.JSON_PROPERTY_DESCRIPTION,
  Metric.JSON_PROPERTY_OA_URL,
  Metric.JSON_PROPERTY_FACTOR,
  Metric.JSON_PROPERTY_SDF_PACKAGE,
  Metric.JSON_PROPERTY_DATA_TYPE
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

  public static final String JSON_PROPERTY_OA_PAGE_ID = "oaPageId";
  private JsonNullable<String> oaPageId = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_DESCRIPTION = "description";
  private JsonNullable<String> description = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_OA_URL = "oaUrl";
  private JsonNullable<String> oaUrl = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_FACTOR = "factor";
  private JsonNullable<Integer> factor = JsonNullable.<Integer>undefined();

  /**
   * An indicator for which Standard Data Feed (SDF) package the item is available in - BASIC or ADVANCED. A null value represents items available only in API.
   */
  public enum SdfPackageEnum {
    BASIC("BASIC"),
    
    ADVANCED("ADVANCED");

    private String value;

    SdfPackageEnum(String value) {
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
    public static SdfPackageEnum fromValue(String value) {
      for (SdfPackageEnum b : SdfPackageEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      return null;
    }
  }

  public static final String JSON_PROPERTY_SDF_PACKAGE = "sdfPackage";
  private JsonNullable<SdfPackageEnum> sdfPackage = JsonNullable.<SdfPackageEnum>undefined();

  public static final String JSON_PROPERTY_DATA_TYPE = "dataType";
  private JsonNullable<String> dataType = JsonNullable.<String>undefined();

  public Metric() { 
  }

  public Metric metric(String metric) {
    this.metric = JsonNullable.<String>of(metric);
    return this;
  }

   /**
   * Metric identifier to be used as &#x60;metrics&#x60; input in &#x60;/fundamentals/v#/fundamentals&#x60; endpoint.
   * @return metric
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "FF_ASSETS", value = "Metric identifier to be used as `metrics` input in `/fundamentals/v#/fundamentals` endpoint.")
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
   * Primary Category of metric item, such as, INCOME_STATEMENT, BALANCE_SHEET, CASH_FLOW, or RATIOS.
   * @return category
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "BALANCE_SHEET", value = "Primary Category of metric item, such as, INCOME_STATEMENT, BALANCE_SHEET, CASH_FLOW, or RATIOS.")
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
   * Sub-category of metric item, such as ASSETS, SUPPLEMENTAL, SHAREHOLDERS_EQUITY, VALUATION, PROFITABILITY, etc.
   * @return subcategory
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "ASSETS", value = "Sub-category of metric item, such as ASSETS, SUPPLEMENTAL, SHAREHOLDERS_EQUITY, VALUATION, PROFITABILITY, etc.")
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


  public Metric oaPageId(String oaPageId) {
    this.oaPageId = JsonNullable.<String>of(oaPageId);
    return this;
  }

   /**
   * The Online Assistant Page ID in D***** format, used to look up the definition and methodology of the requested item. Visit my.apps.factset.com/oa/pages/[D*****] for details. For example, https://my.apps.factset.com/oa/pages/D10585 will give you the definition for FF_SALES.
   * @return oaPageId
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "D10585", value = "The Online Assistant Page ID in D***** format, used to look up the definition and methodology of the requested item. Visit my.apps.factset.com/oa/pages/[D*****] for details. For example, https://my.apps.factset.com/oa/pages/D10585 will give you the definition for FF_SALES.")
  @JsonIgnore

  public String getOaPageId() {
        return oaPageId.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_OA_PAGE_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getOaPageId_JsonNullable() {
    return oaPageId;
  }
  
  @JsonProperty(JSON_PROPERTY_OA_PAGE_ID)
  public void setOaPageId_JsonNullable(JsonNullable<String> oaPageId) {
    this.oaPageId = oaPageId;
  }

  public void setOaPageId(String oaPageId) {
    this.oaPageId = JsonNullable.<String>of(oaPageId);
  }


  public Metric description(String description) {
    this.description = JsonNullable.<String>of(description);
    return this;
  }

   /**
   * Description of the metric item.
   * @return description
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "Total Assets  Total Assets  Page: D10585Library: FactSet Fundamentals  Category: Balance Sheet/Assets  Units:Millions  Annual and Interim items - All Industries  Represents as reported total value of resources the company is using for its operations. Company assets are expected to provide future economic benefits in the entire course of business. Most of these are convertible into cash which can be used to cover any obligations. Thus, this is equal to the company&rsquo;s liabilities and total equity.  It includes: -  Negative Goodwill  -  Goodwill (reported as part of Liabilities)  -  Due to associated companies  -  Subscription receivable  -  Deferred tax assets  -  Advances on export contracts (reported as deduction within Receivables by Brazilian companies)  It excludes: -  Own shares  -  Unrealized foreign exchange loss  -  Retained losses (reported as part of Assets)  -  Uncalled capital  This will be equal to the as reported total assets value if the items stated above are not reported.", value = "Description of the metric item.")
  @JsonIgnore

  public String getDescription() {
        return description.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_DESCRIPTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getDescription_JsonNullable() {
    return description;
  }
  
  @JsonProperty(JSON_PROPERTY_DESCRIPTION)
  public void setDescription_JsonNullable(JsonNullable<String> description) {
    this.description = description;
  }

  public void setDescription(String description) {
    this.description = JsonNullable.<String>of(description);
  }


  public Metric oaUrl(String oaUrl) {
    this.oaUrl = JsonNullable.<String>of(oaUrl);
    return this;
  }

   /**
   * The Online Assistant Page URL, is used to look up the definition and methodology of the requested item. For example, https://my.apps.factset.com/oa/pages/D10585 will give you the definition for FF_SALES.
   * @return oaUrl
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "https://my.apps.factset.com/oa/pages/D10585", value = "The Online Assistant Page URL, is used to look up the definition and methodology of the requested item. For example, https://my.apps.factset.com/oa/pages/D10585 will give you the definition for FF_SALES.")
  @JsonIgnore

  public String getOaUrl() {
        return oaUrl.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_OA_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getOaUrl_JsonNullable() {
    return oaUrl;
  }
  
  @JsonProperty(JSON_PROPERTY_OA_URL)
  public void setOaUrl_JsonNullable(JsonNullable<String> oaUrl) {
    this.oaUrl = oaUrl;
  }

  public void setOaUrl(String oaUrl) {
    this.oaUrl = JsonNullable.<String>of(oaUrl);
  }


  public Metric factor(Integer factor) {
    this.factor = JsonNullable.<Integer>of(factor);
    return this;
  }

   /**
   * The factor for the metric (e.g. 1000 &#x3D; thousands).
   * @return factor
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "1000000", value = "The factor for the metric (e.g. 1000 = thousands).")
  @JsonIgnore

  public Integer getFactor() {
        return factor.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_FACTOR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Integer> getFactor_JsonNullable() {
    return factor;
  }
  
  @JsonProperty(JSON_PROPERTY_FACTOR)
  public void setFactor_JsonNullable(JsonNullable<Integer> factor) {
    this.factor = factor;
  }

  public void setFactor(Integer factor) {
    this.factor = JsonNullable.<Integer>of(factor);
  }


  public Metric sdfPackage(SdfPackageEnum sdfPackage) {
    this.sdfPackage = JsonNullable.<SdfPackageEnum>of(sdfPackage);
    return this;
  }

   /**
   * An indicator for which Standard Data Feed (SDF) package the item is available in - BASIC or ADVANCED. A null value represents items available only in API.
   * @return sdfPackage
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "BASIC", value = "An indicator for which Standard Data Feed (SDF) package the item is available in - BASIC or ADVANCED. A null value represents items available only in API.")
  @JsonIgnore

  public SdfPackageEnum getSdfPackage() {
        return sdfPackage.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_SDF_PACKAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<SdfPackageEnum> getSdfPackage_JsonNullable() {
    return sdfPackage;
  }
  
  @JsonProperty(JSON_PROPERTY_SDF_PACKAGE)
  public void setSdfPackage_JsonNullable(JsonNullable<SdfPackageEnum> sdfPackage) {
    this.sdfPackage = sdfPackage;
  }

  public void setSdfPackage(SdfPackageEnum sdfPackage) {
    this.sdfPackage = JsonNullable.<SdfPackageEnum>of(sdfPackage);
  }


  public Metric dataType(String dataType) {
    this.dataType = JsonNullable.<String>of(dataType);
    return this;
  }

   /**
   * The data type for the metric. Make note, mixing data types within a single /fundamentals API is not supported. Each dataType is defined below -   * **date** - date format expressed in YYYY-MM-DD.   * **doubleArray** - A double is a FactSet data type, similar to a float or an integer. A double represents numeric data but provides a greater amount of decimal precision than the float data type. Double values have up to 15 digits of precision, while float values have up to 7 digits (integers have up to 10 digits).   * **float** - A float value is a real number (i.e., a number that can contain a fractional part/decimals). A float value has a precision of up to seven digits and accurately represents numbers whose absolute value is less than 16,277,216 (224). An example metric includes   * **floatArray** - Function will hold data for multiple periods, as well as for many companies (i.e., two-dimensional value). The FLOATARRAY function returns data using a vertical orientation (e.g., down a column). The difference between FLOAT and FLOATARRAY is that FLOAT can only go across a row (one-dimension; horizontal orientation; vertical length&#x3D;1) whereas FLOATARRAY will return data both across a row and down a column (two-dimensions; vertical orientation). With FLOATARRAY, the number of data points across a row will correspond to the number of companies queried; the number of data points down a column will correspond to the length of the time series.   * **intArray** - An integer is a whole number or zero (i.e., integers do not include decimals). Integers can be positive or negative.   * **string** - A string value is an ASCII character. A string is a sequence of ASCII characters. String value and text value are synonymous. The function will hold data for multiple time periods, as well as for many companies (i.e., two-dimensional value). The STRING_ARRAY function returns data using a vertical orientation (e.g., down a column)   * **stringArray** - The difference between STRING and STRINGARRAY is that STRING can only go across a row (one-dimension; horizontal orientation; vertical length&#x3D;1) whereas STRINGARRAY will return data both across a row and down a column (two-dimensions; vertical orientation). With STRINGARRAY, the number of data points across a row will correspond to the number of companies queried; the number of data points down a column will correspond to the length of the time series. 
   * @return dataType
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "doubleArray", value = "The data type for the metric. Make note, mixing data types within a single /fundamentals API is not supported. Each dataType is defined below -   * **date** - date format expressed in YYYY-MM-DD.   * **doubleArray** - A double is a FactSet data type, similar to a float or an integer. A double represents numeric data but provides a greater amount of decimal precision than the float data type. Double values have up to 15 digits of precision, while float values have up to 7 digits (integers have up to 10 digits).   * **float** - A float value is a real number (i.e., a number that can contain a fractional part/decimals). A float value has a precision of up to seven digits and accurately represents numbers whose absolute value is less than 16,277,216 (224). An example metric includes   * **floatArray** - Function will hold data for multiple periods, as well as for many companies (i.e., two-dimensional value). The FLOATARRAY function returns data using a vertical orientation (e.g., down a column). The difference between FLOAT and FLOATARRAY is that FLOAT can only go across a row (one-dimension; horizontal orientation; vertical length=1) whereas FLOATARRAY will return data both across a row and down a column (two-dimensions; vertical orientation). With FLOATARRAY, the number of data points across a row will correspond to the number of companies queried; the number of data points down a column will correspond to the length of the time series.   * **intArray** - An integer is a whole number or zero (i.e., integers do not include decimals). Integers can be positive or negative.   * **string** - A string value is an ASCII character. A string is a sequence of ASCII characters. String value and text value are synonymous. The function will hold data for multiple time periods, as well as for many companies (i.e., two-dimensional value). The STRING_ARRAY function returns data using a vertical orientation (e.g., down a column)   * **stringArray** - The difference between STRING and STRINGARRAY is that STRING can only go across a row (one-dimension; horizontal orientation; vertical length=1) whereas STRINGARRAY will return data both across a row and down a column (two-dimensions; vertical orientation). With STRINGARRAY, the number of data points across a row will correspond to the number of companies queried; the number of data points down a column will correspond to the length of the time series. ")
  @JsonIgnore

  public String getDataType() {
        return dataType.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_DATA_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getDataType_JsonNullable() {
    return dataType;
  }
  
  @JsonProperty(JSON_PROPERTY_DATA_TYPE)
  public void setDataType_JsonNullable(JsonNullable<String> dataType) {
    this.dataType = dataType;
  }

  public void setDataType(String dataType) {
    this.dataType = JsonNullable.<String>of(dataType);
  }


  /**
   * Return true if this Metric object is equal to o.
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
        equalsNullable(this.oaPageId, metric.oaPageId) &&
        equalsNullable(this.description, metric.description) &&
        equalsNullable(this.oaUrl, metric.oaUrl) &&
        equalsNullable(this.factor, metric.factor) &&
        equalsNullable(this.sdfPackage, metric.sdfPackage) &&
        equalsNullable(this.dataType, metric.dataType);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(hashCodeNullable(metric), hashCodeNullable(name), hashCodeNullable(category), hashCodeNullable(subcategory), hashCodeNullable(oaPageId), hashCodeNullable(description), hashCodeNullable(oaUrl), hashCodeNullable(factor), hashCodeNullable(sdfPackage), hashCodeNullable(dataType));
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
    sb.append("    oaPageId: ").append(toIndentedString(oaPageId)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    oaUrl: ").append(toIndentedString(oaUrl)).append("\n");
    sb.append("    factor: ").append(toIndentedString(factor)).append("\n");
    sb.append("    sdfPackage: ").append(toIndentedString(sdfPackage)).append("\n");
    sb.append("    dataType: ").append(toIndentedString(dataType)).append("\n");
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

