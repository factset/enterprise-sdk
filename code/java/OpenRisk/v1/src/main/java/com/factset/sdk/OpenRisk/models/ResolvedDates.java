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
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.time.LocalDate;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.factset.sdk.OpenRisk.JSON;


/**
 * **(since 1.11.0)** Absolute actual dates used adjusted according to calendar and lagging
 */
@ApiModel(description = "**(since 1.11.0)** Absolute actual dates used adjusted according to calendar and lagging")
@JsonPropertyOrder({
  ResolvedDates.JSON_PROPERTY_UNIVERSE_DATE,
  ResolvedDates.JSON_PROPERTY_COVARIANCE_DATE,
  ResolvedDates.JSON_PROPERTY_SSR_DATE
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class ResolvedDates implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_UNIVERSE_DATE = "universeDate";
  private LocalDate universeDate;

  public static final String JSON_PROPERTY_COVARIANCE_DATE = "covarianceDate";
  private LocalDate covarianceDate;

  public static final String JSON_PROPERTY_SSR_DATE = "ssrDate";
  private LocalDate ssrDate;

  public ResolvedDates() { 
  }

  @JsonCreator
  public ResolvedDates(
    @JsonProperty(value=JSON_PROPERTY_UNIVERSE_DATE, required=true) LocalDate universeDate, 
    @JsonProperty(value=JSON_PROPERTY_COVARIANCE_DATE, required=true) LocalDate covarianceDate, 
    @JsonProperty(value=JSON_PROPERTY_SSR_DATE, required=true) LocalDate ssrDate
  ) {
    this();
    this.universeDate = universeDate;
    this.covarianceDate = covarianceDate;
    this.ssrDate = ssrDate;
  }

  public ResolvedDates universeDate(LocalDate universeDate) {
    this.universeDate = universeDate;
    return this;
  }

   /**
   * **(since 1.12.0)**  Date format YYYY-MM-DD.
   * @return universeDate
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "Sat Jan 26 00:00:00 UTC 2019", required = true, value = "**(since 1.12.0)**  Date format YYYY-MM-DD.")
  @JsonProperty(JSON_PROPERTY_UNIVERSE_DATE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public LocalDate getUniverseDate() {
    return universeDate;
  }


  @JsonProperty(JSON_PROPERTY_UNIVERSE_DATE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setUniverseDate(LocalDate universeDate) {
    this.universeDate = universeDate;
  }


  public ResolvedDates covarianceDate(LocalDate covarianceDate) {
    this.covarianceDate = covarianceDate;
    return this;
  }

   /**
   * **(since 1.12.0)**  Date format YYYY-MM-DD.
   * @return covarianceDate
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "Sat Jan 26 00:00:00 UTC 2019", required = true, value = "**(since 1.12.0)**  Date format YYYY-MM-DD.")
  @JsonProperty(JSON_PROPERTY_COVARIANCE_DATE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public LocalDate getCovarianceDate() {
    return covarianceDate;
  }


  @JsonProperty(JSON_PROPERTY_COVARIANCE_DATE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setCovarianceDate(LocalDate covarianceDate) {
    this.covarianceDate = covarianceDate;
  }


  public ResolvedDates ssrDate(LocalDate ssrDate) {
    this.ssrDate = ssrDate;
    return this;
  }

   /**
   * **(since 1.12.0)**  Date format YYYY-MM-DD.
   * @return ssrDate
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "Sat Jan 26 00:00:00 UTC 2019", required = true, value = "**(since 1.12.0)**  Date format YYYY-MM-DD.")
  @JsonProperty(JSON_PROPERTY_SSR_DATE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public LocalDate getSsrDate() {
    return ssrDate;
  }


  @JsonProperty(JSON_PROPERTY_SSR_DATE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setSsrDate(LocalDate ssrDate) {
    this.ssrDate = ssrDate;
  }


  /**
   * Return true if this ResolvedDates object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ResolvedDates resolvedDates = (ResolvedDates) o;
    return Objects.equals(this.universeDate, resolvedDates.universeDate) &&
        Objects.equals(this.covarianceDate, resolvedDates.covarianceDate) &&
        Objects.equals(this.ssrDate, resolvedDates.ssrDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(universeDate, covarianceDate, ssrDate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ResolvedDates {\n");
    sb.append("    universeDate: ").append(toIndentedString(universeDate)).append("\n");
    sb.append("    covarianceDate: ").append(toIndentedString(covarianceDate)).append("\n");
    sb.append("    ssrDate: ").append(toIndentedString(ssrDate)).append("\n");
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

