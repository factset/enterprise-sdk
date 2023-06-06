/*
 * Open:Risk API
 * Service to calculate parametric linear risk statistics and generate risk model asset identifier mappings.
 *
 * The version of the OpenAPI document: 1.24.0
 * Contact: api@factset.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.factset.sdk.OpenRisk.models;

import java.util.Objects;
import java.util.Arrays;
import java.util.Map;
import java.util.HashMap;
import com.factset.sdk.OpenRisk.models.SecurityGroup;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.factset.sdk.OpenRisk.JSON;


/**
 * HoldingAllOf
 */
@JsonPropertyOrder({
  HoldingAllOf.JSON_PROPERTY_GROUPING,
  HoldingAllOf.JSON_PROPERTY_UNCOVERED_ASSETS
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class HoldingAllOf implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_GROUPING = "grouping";
  private SecurityGroup grouping;

  /**
   * Uncovered asset weight handling. Default values: &#39;portfolio&#39; -&gt; ExcludeToGlobalCash, &#39;benchmark&#39; -&gt; Normalize, &#39;market&#39; -&gt; Normalize. See also [OA:21737](https://my.apps.factset.com/oa/pages/21737#group_normal_mix)
   */
  public enum UncoveredAssetsEnum {
    NORMALIZE("Normalize"),
    
    EXCLUDETOGLOBALCASH("ExcludeToGlobalCash"),
    
    NORMALIZEWITHGROUPCASH("NormalizeWithGroupCash"),
    
    EXCLUDETOCASHWITHINGROUP("ExcludeToCashWithinGroup"),
    
    NORMALIZEWITHINGROUP("NormalizeWithinGroup");

    private String value;

    UncoveredAssetsEnum(String value) {
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
    public static UncoveredAssetsEnum fromValue(String value) {
      for (UncoveredAssetsEnum b : UncoveredAssetsEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_UNCOVERED_ASSETS = "uncoveredAssets";
  private UncoveredAssetsEnum uncoveredAssets;

  public HoldingAllOf() { 
  }

  public HoldingAllOf grouping(SecurityGroup grouping) {
    this.grouping = grouping;
    return this;
  }

   /**
   * Get grouping
   * @return grouping
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_GROUPING)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public SecurityGroup getGrouping() {
    return grouping;
  }


  @JsonProperty(JSON_PROPERTY_GROUPING)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setGrouping(SecurityGroup grouping) {
    this.grouping = grouping;
  }


  public HoldingAllOf uncoveredAssets(UncoveredAssetsEnum uncoveredAssets) {
    this.uncoveredAssets = uncoveredAssets;
    return this;
  }

   /**
   * Uncovered asset weight handling. Default values: &#39;portfolio&#39; -&gt; ExcludeToGlobalCash, &#39;benchmark&#39; -&gt; Normalize, &#39;market&#39; -&gt; Normalize. See also [OA:21737](https://my.apps.factset.com/oa/pages/21737#group_normal_mix)
   * @return uncoveredAssets
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Uncovered asset weight handling. Default values: 'portfolio' -> ExcludeToGlobalCash, 'benchmark' -> Normalize, 'market' -> Normalize. See also [OA:21737](https://my.apps.factset.com/oa/pages/21737#group_normal_mix)")
  @JsonProperty(JSON_PROPERTY_UNCOVERED_ASSETS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public UncoveredAssetsEnum getUncoveredAssets() {
    return uncoveredAssets;
  }


  @JsonProperty(JSON_PROPERTY_UNCOVERED_ASSETS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setUncoveredAssets(UncoveredAssetsEnum uncoveredAssets) {
    this.uncoveredAssets = uncoveredAssets;
  }


  /**
   * Return true if this Holding_allOf object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    HoldingAllOf holdingAllOf = (HoldingAllOf) o;
    return Objects.equals(this.grouping, holdingAllOf.grouping) &&
        Objects.equals(this.uncoveredAssets, holdingAllOf.uncoveredAssets);
  }

  @Override
  public int hashCode() {
    return Objects.hash(grouping, uncoveredAssets);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HoldingAllOf {\n");
    sb.append("    grouping: ").append(toIndentedString(grouping)).append("\n");
    sb.append("    uncoveredAssets: ").append(toIndentedString(uncoveredAssets)).append("\n");
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

