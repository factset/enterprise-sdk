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
import com.factset.sdk.OpenRisk.models.CovarianceDateFormatConvention;
import com.factset.sdk.OpenRisk.models.ExposureDateFormatConvention;
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
 * Risk model lagging dates for data items to fetch and use. This field can be utilized to isolate each data item&#39;s impact on risk calculation. A typical use case is to analyze the risk change from one day to the other by fixing the risk model data date to one date while moving the portfolio holdings data.
 */
@ApiModel(description = "Risk model lagging dates for data items to fetch and use. This field can be utilized to isolate each data item's impact on risk calculation. A typical use case is to analyze the risk change from one day to the other by fixing the risk model data date to one date while moving the portfolio holdings data.")
@JsonPropertyOrder({
  LaggingDates.JSON_PROPERTY_EXPOSURE_DATE,
  LaggingDates.JSON_PROPERTY_COVARIANCE_DATE,
  LaggingDates.JSON_PROPERTY_SSR_DATE_IS
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")

public class LaggingDates implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_EXPOSURE_DATE = "exposureDate";
  private ExposureDateFormatConvention exposureDate;

  public static final String JSON_PROPERTY_COVARIANCE_DATE = "covarianceDate";
  private CovarianceDateFormatConvention covarianceDate;

  /**
   * Stock specific risk (SSR) date can take one of the other lagging dates
   */
  public enum SsrDateIsEnum {
    EXPOSUREDATE("ExposureDate"),
    
    COVARIANCEDATE("CovarianceDate");

    private String value;

    SsrDateIsEnum(String value) {
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
    public static SsrDateIsEnum fromValue(String value) {
      for (SsrDateIsEnum b : SsrDateIsEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_SSR_DATE_IS = "ssrDateIs";
  private SsrDateIsEnum ssrDateIs;

  public LaggingDates() { 
  }

  public LaggingDates exposureDate(ExposureDateFormatConvention exposureDate) {
    this.exposureDate = exposureDate;
    return this;
  }

   /**
   * Get exposureDate
   * @return exposureDate
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_EXPOSURE_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public ExposureDateFormatConvention getExposureDate() {
    return exposureDate;
  }


  @JsonProperty(JSON_PROPERTY_EXPOSURE_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setExposureDate(ExposureDateFormatConvention exposureDate) {
    this.exposureDate = exposureDate;
  }


  public LaggingDates covarianceDate(CovarianceDateFormatConvention covarianceDate) {
    this.covarianceDate = covarianceDate;
    return this;
  }

   /**
   * Get covarianceDate
   * @return covarianceDate
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_COVARIANCE_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public CovarianceDateFormatConvention getCovarianceDate() {
    return covarianceDate;
  }


  @JsonProperty(JSON_PROPERTY_COVARIANCE_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCovarianceDate(CovarianceDateFormatConvention covarianceDate) {
    this.covarianceDate = covarianceDate;
  }


  public LaggingDates ssrDateIs(SsrDateIsEnum ssrDateIs) {
    this.ssrDateIs = ssrDateIs;
    return this;
  }

   /**
   * Stock specific risk (SSR) date can take one of the other lagging dates
   * @return ssrDateIs
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "Stock specific risk (SSR) date can take one of the other lagging dates")
  @JsonProperty(JSON_PROPERTY_SSR_DATE_IS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public SsrDateIsEnum getSsrDateIs() {
    return ssrDateIs;
  }


  @JsonProperty(JSON_PROPERTY_SSR_DATE_IS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSsrDateIs(SsrDateIsEnum ssrDateIs) {
    this.ssrDateIs = ssrDateIs;
  }


  /**
   * Return true if this LaggingDates object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LaggingDates laggingDates = (LaggingDates) o;
    return Objects.equals(this.exposureDate, laggingDates.exposureDate) &&
        Objects.equals(this.covarianceDate, laggingDates.covarianceDate) &&
        Objects.equals(this.ssrDateIs, laggingDates.ssrDateIs);
  }

  @Override
  public int hashCode() {
    return Objects.hash(exposureDate, covarianceDate, ssrDateIs);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LaggingDates {\n");
    sb.append("    exposureDate: ").append(toIndentedString(exposureDate)).append("\n");
    sb.append("    covarianceDate: ").append(toIndentedString(covarianceDate)).append("\n");
    sb.append("    ssrDateIs: ").append(toIndentedString(ssrDateIs)).append("\n");
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

