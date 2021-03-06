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


package com.factset.sdk.VirtualPortfolioAPIforDigitalPortals.models;

import java.util.Objects;
import java.util.Arrays;
import java.util.Map;
import java.util.HashMap;
import com.factset.sdk.VirtualPortfolioAPIforDigitalPortals.models.PortfolioEvaluationListDataRange;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.factset.sdk.VirtualPortfolioAPIforDigitalPortals.JSON;


/**
 * The data member contains the request&#39;s primary data.
 */
@ApiModel(description = "The data member contains the request's primary data.")
@JsonPropertyOrder({
  PortfolioEvaluationListData.JSON_PROPERTY_ID,
  PortfolioEvaluationListData.JSON_PROPERTY_RANGE,
  PortfolioEvaluationListData.JSON_PROPERTY_RESOLUTION
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class PortfolioEvaluationListData implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_ID = "id";
  private String id;

  public static final String JSON_PROPERTY_RANGE = "range";
  private PortfolioEvaluationListDataRange range;

  /**
   * Gets or Sets resolution
   */
  public enum ResolutionEnum {
    DAILY("daily"),
    
    WEEKLY("weekly"),
    
    MONTHLY("monthly");

    private String value;

    ResolutionEnum(String value) {
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
    public static ResolutionEnum fromValue(String value) {
      for (ResolutionEnum b : ResolutionEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_RESOLUTION = "resolution";
  private ResolutionEnum resolution = ResolutionEnum.DAILY;

  public PortfolioEvaluationListData() { 
  }

  @JsonCreator
  public PortfolioEvaluationListData(
    @JsonProperty(value=JSON_PROPERTY_ID, required=true) String id, 
    @JsonProperty(value=JSON_PROPERTY_RANGE, required=true) PortfolioEvaluationListDataRange range
  ) {
    this();
    this.id = id;
    this.range = range;
  }

  public PortfolioEvaluationListData id(String id) {
    this.id = id;
    return this;
  }

   /**
   * Identifier of the portfolio.
   * @return id
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Identifier of the portfolio.")
  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getId() {
    return id;
  }


  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setId(String id) {
    this.id = id;
  }


  public PortfolioEvaluationListData range(PortfolioEvaluationListDataRange range) {
    this.range = range;
    return this;
  }

   /**
   * Get range
   * @return range
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_RANGE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public PortfolioEvaluationListDataRange getRange() {
    return range;
  }


  @JsonProperty(JSON_PROPERTY_RANGE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setRange(PortfolioEvaluationListDataRange range) {
    this.range = range;
  }


  public PortfolioEvaluationListData resolution(ResolutionEnum resolution) {
    this.resolution = resolution;
    return this;
  }

   /**
   * Get resolution
   * @return resolution
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_RESOLUTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public ResolutionEnum getResolution() {
    return resolution;
  }


  @JsonProperty(JSON_PROPERTY_RESOLUTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setResolution(ResolutionEnum resolution) {
    this.resolution = resolution;
  }


  /**
   * Return true if this _portfolio_evaluation_list_data object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PortfolioEvaluationListData portfolioEvaluationListData = (PortfolioEvaluationListData) o;
    return Objects.equals(this.id, portfolioEvaluationListData.id) &&
        Objects.equals(this.range, portfolioEvaluationListData.range) &&
        Objects.equals(this.resolution, portfolioEvaluationListData.resolution);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, range, resolution);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PortfolioEvaluationListData {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    range: ").append(toIndentedString(range)).append("\n");
    sb.append("    resolution: ").append(toIndentedString(resolution)).append("\n");
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

