/*
 * Prime Developer Trial
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: v1
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.factset.sdk.QuotesAPIforDigitalPortals.models;

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
import com.factset.sdk.QuotesAPIforDigitalPortals.JSON;


/**
 * Synthetic risk and reward indicator (SRRI).
 */
@ApiModel(description = "Synthetic risk and reward indicator (SRRI).")
@JsonPropertyOrder({
  InlineResponse20062DataTargetMarketRiskToleranceSrri.JSON_PROPERTY_ID,
  InlineResponse20062DataTargetMarketRiskToleranceSrri.JSON_PROPERTY_RANK,
  InlineResponse20062DataTargetMarketRiskToleranceSrri.JSON_PROPERTY_DESCRIPTION
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class InlineResponse20062DataTargetMarketRiskToleranceSrri implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_ID = "id";
  private BigDecimal id;

  public static final String JSON_PROPERTY_RANK = "rank";
  private String rank;

  public static final String JSON_PROPERTY_DESCRIPTION = "description";
  private String description;

  public InlineResponse20062DataTargetMarketRiskToleranceSrri() { 
  }

  public InlineResponse20062DataTargetMarketRiskToleranceSrri id(BigDecimal id) {
    this.id = id;
    return this;
  }

   /**
   * Identifier of rating grade.
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Identifier of rating grade.")
  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BigDecimal getId() {
    return id;
  }


  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setId(BigDecimal id) {
    this.id = id;
  }


  public InlineResponse20062DataTargetMarketRiskToleranceSrri rank(String rank) {
    this.rank = rank;
    return this;
  }

   /**
   * Rating grade.
   * @return rank
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Rating grade.")
  @JsonProperty(JSON_PROPERTY_RANK)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getRank() {
    return rank;
  }


  @JsonProperty(JSON_PROPERTY_RANK)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRank(String rank) {
    this.rank = rank;
  }


  public InlineResponse20062DataTargetMarketRiskToleranceSrri description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Description of the rating grade.
   * @return description
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Description of the rating grade.")
  @JsonProperty(JSON_PROPERTY_DESCRIPTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getDescription() {
    return description;
  }


  @JsonProperty(JSON_PROPERTY_DESCRIPTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDescription(String description) {
    this.description = description;
  }


  /**
   * Return true if this inline_response_200_62_data_targetMarket_riskTolerance_srri object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse20062DataTargetMarketRiskToleranceSrri inlineResponse20062DataTargetMarketRiskToleranceSrri = (InlineResponse20062DataTargetMarketRiskToleranceSrri) o;
    return Objects.equals(this.id, inlineResponse20062DataTargetMarketRiskToleranceSrri.id) &&
        Objects.equals(this.rank, inlineResponse20062DataTargetMarketRiskToleranceSrri.rank) &&
        Objects.equals(this.description, inlineResponse20062DataTargetMarketRiskToleranceSrri.description);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, rank, description);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse20062DataTargetMarketRiskToleranceSrri {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    rank: ").append(toIndentedString(rank)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
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

