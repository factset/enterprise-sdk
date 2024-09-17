/*
 * Cabot Models API
 * Cabot Models API
 *
 * The version of the OpenAPI document: 0.2.0
 * Contact: api@factset.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.factset.sdk.Cabot.models;

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
import java.math.BigDecimal;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.factset.sdk.Cabot.JSON;


/**
 * SellTimingModelAnalytics
 */
@JsonPropertyOrder({
  SellTimingModelAnalytics.JSON_PROPERTY_OLDER_LOSER,
  SellTimingModelAnalytics.JSON_PROPERTY_OLDER_WINNER,
  SellTimingModelAnalytics.JSON_PROPERTY_YOUNGER_LOSER,
  SellTimingModelAnalytics.JSON_PROPERTY_YOUNGER_WINNER
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")

public class SellTimingModelAnalytics implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_OLDER_LOSER = "olderLoser";
  private BigDecimal olderLoser;

  public static final String JSON_PROPERTY_OLDER_WINNER = "olderWinner";
  private BigDecimal olderWinner;

  public static final String JSON_PROPERTY_YOUNGER_LOSER = "youngerLoser";
  private BigDecimal youngerLoser;

  public static final String JSON_PROPERTY_YOUNGER_WINNER = "youngerWinner";
  private BigDecimal youngerWinner;

  public SellTimingModelAnalytics() { 
  }

  public SellTimingModelAnalytics olderLoser(BigDecimal olderLoser) {
    this.olderLoser = olderLoser;
    return this;
  }

   /**
   * Benefit of harvesting older, losing positions.
   * @return olderLoser
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "Benefit of harvesting older, losing positions.")
  @JsonProperty(JSON_PROPERTY_OLDER_LOSER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BigDecimal getOlderLoser() {
    return olderLoser;
  }


  @JsonProperty(JSON_PROPERTY_OLDER_LOSER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setOlderLoser(BigDecimal olderLoser) {
    this.olderLoser = olderLoser;
  }


  public SellTimingModelAnalytics olderWinner(BigDecimal olderWinner) {
    this.olderWinner = olderWinner;
    return this;
  }

   /**
   * Benefit of harvesting older, winning positions
   * @return olderWinner
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "Benefit of harvesting older, winning positions")
  @JsonProperty(JSON_PROPERTY_OLDER_WINNER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BigDecimal getOlderWinner() {
    return olderWinner;
  }


  @JsonProperty(JSON_PROPERTY_OLDER_WINNER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setOlderWinner(BigDecimal olderWinner) {
    this.olderWinner = olderWinner;
  }


  public SellTimingModelAnalytics youngerLoser(BigDecimal youngerLoser) {
    this.youngerLoser = youngerLoser;
    return this;
  }

   /**
   * Benefit of harvesting younger, losing positions.
   * @return youngerLoser
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "Benefit of harvesting younger, losing positions.")
  @JsonProperty(JSON_PROPERTY_YOUNGER_LOSER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BigDecimal getYoungerLoser() {
    return youngerLoser;
  }


  @JsonProperty(JSON_PROPERTY_YOUNGER_LOSER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setYoungerLoser(BigDecimal youngerLoser) {
    this.youngerLoser = youngerLoser;
  }


  public SellTimingModelAnalytics youngerWinner(BigDecimal youngerWinner) {
    this.youngerWinner = youngerWinner;
    return this;
  }

   /**
   * Benefit of harvesting younger, winning positions.
   * @return youngerWinner
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "Benefit of harvesting younger, winning positions.")
  @JsonProperty(JSON_PROPERTY_YOUNGER_WINNER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BigDecimal getYoungerWinner() {
    return youngerWinner;
  }


  @JsonProperty(JSON_PROPERTY_YOUNGER_WINNER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setYoungerWinner(BigDecimal youngerWinner) {
    this.youngerWinner = youngerWinner;
  }


  /**
   * Return true if this SellTimingModelAnalytics object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SellTimingModelAnalytics sellTimingModelAnalytics = (SellTimingModelAnalytics) o;
    return Objects.equals(this.olderLoser, sellTimingModelAnalytics.olderLoser) &&
        Objects.equals(this.olderWinner, sellTimingModelAnalytics.olderWinner) &&
        Objects.equals(this.youngerLoser, sellTimingModelAnalytics.youngerLoser) &&
        Objects.equals(this.youngerWinner, sellTimingModelAnalytics.youngerWinner);
  }

  @Override
  public int hashCode() {
    return Objects.hash(olderLoser, olderWinner, youngerLoser, youngerWinner);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SellTimingModelAnalytics {\n");
    sb.append("    olderLoser: ").append(toIndentedString(olderLoser)).append("\n");
    sb.append("    olderWinner: ").append(toIndentedString(olderWinner)).append("\n");
    sb.append("    youngerLoser: ").append(toIndentedString(youngerLoser)).append("\n");
    sb.append("    youngerWinner: ").append(toIndentedString(youngerWinner)).append("\n");
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

