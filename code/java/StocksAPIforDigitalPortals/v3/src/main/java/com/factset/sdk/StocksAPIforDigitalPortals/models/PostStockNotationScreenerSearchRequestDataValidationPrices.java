/*
 * Stocks API For Digital Portals
 * The Stocks API features a screener to search for equity instruments based on stock-specific parameters.  Parameters for up to three fiscal years might now be used in one request; data is available for the ten most recent completed fiscal years. Estimates are available for the current and two consecutive fiscal years. Search criteria also include benchmark-related attributes (beta, correlation, outperformance), and ESG parameters, based on FactSet’s Truvalue ESG scores.  A separate endpoint returns the possible values and value ranges for the parameters that the endpoint /stock/notation/screener/search accepts Application developers can request the values and value ranges only for a restricted set of notations that match predefined parameters. This functionality may be used to pre-fill the values and value ranges of the parameters of the /stock/notation/screener/search endpoint so that performing a search always leads to a non-empty set of notations.  The endpoint /stock/notation/ranking/intraday/list ranks stocks notations using intraday figures, for example to build a gainers/losers list.   Additional endpoints include end-of-day benchmark key figures, and selected fundamentals (as of end of fiscal year and with daily updates).  This API is fully integrated with the corresponding [Quotes API](https://developer.factset.com/api-catalog/quotes-api-digital-portals), allowing access to detailed price and performance information of instruments, as well as basic security identifier cross-reference. For direct access to price histories, please refer to the [Time Series API for Digital Portals](https://developer.factset.com/api-catalog/time-series-api-digital-portals).  Similar criteria based screener APIs exist for fixed income instruments and securitized derivatives: See the [Bonds API](https://developer.factset.com/api-catalog/bonds-api-digital-portals) and the [Securitized Derivatives API](https://developer.factset.com/api-catalog/securitized-derivatives-api-digital-portals) for details.  See also the recipe [\"Enrich Your Digital Portal with Flexible Equity Screening\"](https://developer.factset.com/recipe-catalog/enrich-your-digital-portal-flexible-equity-screening). 
 *
 * The version of the OpenAPI document: 2
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.factset.sdk.StocksAPIforDigitalPortals.models;

import java.util.Objects;
import java.util.Arrays;
import java.util.Map;
import java.util.HashMap;
import com.factset.sdk.StocksAPIforDigitalPortals.models.PostStockNotationScreenerSearchRequestDataValidationPricesLatest;
import com.factset.sdk.StocksAPIforDigitalPortals.models.PostStockNotationScreenerSearchRequestDataValidationPricesPrevious;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.factset.sdk.StocksAPIforDigitalPortals.JSON;


/**
 * Price-related parameters.
 */
@ApiModel(description = "Price-related parameters.")
@JsonPropertyOrder({
  PostStockNotationScreenerSearchRequestDataValidationPrices.JSON_PROPERTY_QUALITY,
  PostStockNotationScreenerSearchRequestDataValidationPrices.JSON_PROPERTY_LATEST,
  PostStockNotationScreenerSearchRequestDataValidationPrices.JSON_PROPERTY_PREVIOUS
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")

public class PostStockNotationScreenerSearchRequestDataValidationPrices implements Serializable {
  private static final long serialVersionUID = 1L;

  /**
   * Quality of the price.
   */
  public enum QualityEnum {
    DLY("DLY"),
    
    EOD("EOD");

    private String value;

    QualityEnum(String value) {
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
    public static QualityEnum fromValue(String value) {
      for (QualityEnum b : QualityEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_QUALITY = "quality";
  private QualityEnum quality = QualityEnum.DLY;

  public static final String JSON_PROPERTY_LATEST = "latest";
  private PostStockNotationScreenerSearchRequestDataValidationPricesLatest latest;

  public static final String JSON_PROPERTY_PREVIOUS = "previous";
  private PostStockNotationScreenerSearchRequestDataValidationPricesPrevious previous;

  public PostStockNotationScreenerSearchRequestDataValidationPrices() { 
  }

  public PostStockNotationScreenerSearchRequestDataValidationPrices quality(QualityEnum quality) {
    this.quality = quality;
    return this;
  }

   /**
   * Quality of the price.
   * @return quality
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "Quality of the price.")
  @JsonProperty(JSON_PROPERTY_QUALITY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public QualityEnum getQuality() {
    return quality;
  }


  @JsonProperty(JSON_PROPERTY_QUALITY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setQuality(QualityEnum quality) {
    this.quality = quality;
  }


  public PostStockNotationScreenerSearchRequestDataValidationPrices latest(PostStockNotationScreenerSearchRequestDataValidationPricesLatest latest) {
    this.latest = latest;
    return this;
  }

   /**
   * Get latest
   * @return latest
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_LATEST)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public PostStockNotationScreenerSearchRequestDataValidationPricesLatest getLatest() {
    return latest;
  }


  @JsonProperty(JSON_PROPERTY_LATEST)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLatest(PostStockNotationScreenerSearchRequestDataValidationPricesLatest latest) {
    this.latest = latest;
  }


  public PostStockNotationScreenerSearchRequestDataValidationPrices previous(PostStockNotationScreenerSearchRequestDataValidationPricesPrevious previous) {
    this.previous = previous;
    return this;
  }

   /**
   * Get previous
   * @return previous
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_PREVIOUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public PostStockNotationScreenerSearchRequestDataValidationPricesPrevious getPrevious() {
    return previous;
  }


  @JsonProperty(JSON_PROPERTY_PREVIOUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPrevious(PostStockNotationScreenerSearchRequestDataValidationPricesPrevious previous) {
    this.previous = previous;
  }


  /**
   * Return true if this PostStockNotationScreenerSearchRequest_data_validation_prices object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PostStockNotationScreenerSearchRequestDataValidationPrices postStockNotationScreenerSearchRequestDataValidationPrices = (PostStockNotationScreenerSearchRequestDataValidationPrices) o;
    return Objects.equals(this.quality, postStockNotationScreenerSearchRequestDataValidationPrices.quality) &&
        Objects.equals(this.latest, postStockNotationScreenerSearchRequestDataValidationPrices.latest) &&
        Objects.equals(this.previous, postStockNotationScreenerSearchRequestDataValidationPrices.previous);
  }

  @Override
  public int hashCode() {
    return Objects.hash(quality, latest, previous);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PostStockNotationScreenerSearchRequestDataValidationPrices {\n");
    sb.append("    quality: ").append(toIndentedString(quality)).append("\n");
    sb.append("    latest: ").append(toIndentedString(latest)).append("\n");
    sb.append("    previous: ").append(toIndentedString(previous)).append("\n");
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

