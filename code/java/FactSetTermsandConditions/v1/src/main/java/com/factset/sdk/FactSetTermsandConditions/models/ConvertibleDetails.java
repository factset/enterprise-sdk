/*
 * FactSet Terms & Conditions API
 * The FactSet Terms & Conditions API exposes Terms & Conditions data for Fixed Income Corporate, Governement & Agency securities. The FactSet Corporate Government & Agency Terms & Conditions library provides descriptive data on the issue level, such as offering details, redemption information, and coupon schedules. Issuer level data is also available. Coverage is global and includes corporate, sovereign, and agency issues. 
 *
 * The version of the OpenAPI document: 1.0.0
 * Contact: api@factset.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.factset.sdk.FactSetTermsandConditions.models;

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
import com.factset.sdk.FactSetTermsandConditions.JSON;


/**
 * Convertible Details for a Fixed Income security.
 */
@ApiModel(description = "Convertible Details for a Fixed Income security.")
@JsonPropertyOrder({
  ConvertibleDetails.JSON_PROPERTY_REQUEST_ID,
  ConvertibleDetails.JSON_PROPERTY_FSYM_ID,
  ConvertibleDetails.JSON_PROPERTY_CONV_CURR,
  ConvertibleDetails.JSON_PROPERTY_CONV_EFF_DATE,
  ConvertibleDetails.JSON_PROPERTY_CONV_END_DATE,
  ConvertibleDetails.JSON_PROPERTY_CONV_FREQUENCY,
  ConvertibleDetails.JSON_PROPERTY_CONV_ID,
  ConvertibleDetails.JSON_PROPERTY_CONV_IDENTIFICATION,
  ConvertibleDetails.JSON_PROPERTY_CONV_NOTICE_DAYS_MAX,
  ConvertibleDetails.JSON_PROPERTY_CONV_NOTICE_DAYS_MIN,
  ConvertibleDetails.JSON_PROPERTY_CONV_PAY_FORM,
  ConvertibleDetails.JSON_PROPERTY_CONV_PAY_FORM_DET,
  ConvertibleDetails.JSON_PROPERTY_CONV_PAY_FORM_ELECT,
  ConvertibleDetails.JSON_PROPERTY_CONV_PREM_CHG_CONTROL,
  ConvertibleDetails.JSON_PROPERTY_CONV_PRICE_METHOD,
  ConvertibleDetails.JSON_PROPERTY_CONV_RATIO,
  ConvertibleDetails.JSON_PROPERTY_CONV_RATIO_DESC,
  ConvertibleDetails.JSON_PROPERTY_CONV_TYPE
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")

public class ConvertibleDetails implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_REQUEST_ID = "requestId";
  private String requestId;

  public static final String JSON_PROPERTY_FSYM_ID = "fsymId";
  private String fsymId;

  public static final String JSON_PROPERTY_CONV_CURR = "convCurr";
  private String convCurr;

  public static final String JSON_PROPERTY_CONV_EFF_DATE = "convEffDate";
  private LocalDate convEffDate;

  public static final String JSON_PROPERTY_CONV_END_DATE = "convEndDate";
  private LocalDate convEndDate;

  public static final String JSON_PROPERTY_CONV_FREQUENCY = "convFrequency";
  private String convFrequency;

  public static final String JSON_PROPERTY_CONV_ID = "convId";
  private Integer convId;

  public static final String JSON_PROPERTY_CONV_IDENTIFICATION = "convIdentification";
  private String convIdentification;

  public static final String JSON_PROPERTY_CONV_NOTICE_DAYS_MAX = "convNoticeDaysMax";
  private Integer convNoticeDaysMax;

  public static final String JSON_PROPERTY_CONV_NOTICE_DAYS_MIN = "convNoticeDaysMin";
  private Integer convNoticeDaysMin;

  public static final String JSON_PROPERTY_CONV_PAY_FORM = "convPayForm";
  private String convPayForm;

  public static final String JSON_PROPERTY_CONV_PAY_FORM_DET = "convPayFormDet";
  private String convPayFormDet;

  public static final String JSON_PROPERTY_CONV_PAY_FORM_ELECT = "convPayFormElect";
  private String convPayFormElect;

  public static final String JSON_PROPERTY_CONV_PREM_CHG_CONTROL = "convPremChgControl";
  private Double convPremChgControl;

  public static final String JSON_PROPERTY_CONV_PRICE_METHOD = "convPriceMethod";
  private String convPriceMethod;

  public static final String JSON_PROPERTY_CONV_RATIO = "convRatio";
  private Double convRatio;

  public static final String JSON_PROPERTY_CONV_RATIO_DESC = "convRatioDesc";
  private String convRatioDesc;

  public static final String JSON_PROPERTY_CONV_TYPE = "convType";
  private String convType;

  public ConvertibleDetails() { 
  }

  public ConvertibleDetails requestId(String requestId) {
    this.requestId = requestId;
    return this;
  }

   /**
   * Security identifier used in the request.
   * @return requestId
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "Security identifier used in the request.")
  @JsonProperty(JSON_PROPERTY_REQUEST_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getRequestId() {
    return requestId;
  }


  @JsonProperty(JSON_PROPERTY_REQUEST_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRequestId(String requestId) {
    this.requestId = requestId;
  }


  public ConvertibleDetails fsymId(String fsymId) {
    this.fsymId = fsymId;
    return this;
  }

   /**
   * FactSet Permanent Security Identifier.
   * @return fsymId
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "FactSet Permanent Security Identifier.")
  @JsonProperty(JSON_PROPERTY_FSYM_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getFsymId() {
    return fsymId;
  }


  @JsonProperty(JSON_PROPERTY_FSYM_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFsymId(String fsymId) {
    this.fsymId = fsymId;
  }


  public ConvertibleDetails convCurr(String convCurr) {
    this.convCurr = convCurr;
    return this;
  }

   /**
   * Convertible Currency
   * @return convCurr
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "Convertible Currency")
  @JsonProperty(JSON_PROPERTY_CONV_CURR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getConvCurr() {
    return convCurr;
  }


  @JsonProperty(JSON_PROPERTY_CONV_CURR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setConvCurr(String convCurr) {
    this.convCurr = convCurr;
  }


  public ConvertibleDetails convEffDate(LocalDate convEffDate) {
    this.convEffDate = convEffDate;
    return this;
  }

   /**
   * Convertible Effective Date
   * @return convEffDate
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "Convertible Effective Date")
  @JsonProperty(JSON_PROPERTY_CONV_EFF_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public LocalDate getConvEffDate() {
    return convEffDate;
  }


  @JsonProperty(JSON_PROPERTY_CONV_EFF_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setConvEffDate(LocalDate convEffDate) {
    this.convEffDate = convEffDate;
  }


  public ConvertibleDetails convEndDate(LocalDate convEndDate) {
    this.convEndDate = convEndDate;
    return this;
  }

   /**
   * Convertible End Date
   * @return convEndDate
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "Convertible End Date")
  @JsonProperty(JSON_PROPERTY_CONV_END_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public LocalDate getConvEndDate() {
    return convEndDate;
  }


  @JsonProperty(JSON_PROPERTY_CONV_END_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setConvEndDate(LocalDate convEndDate) {
    this.convEndDate = convEndDate;
  }


  public ConvertibleDetails convFrequency(String convFrequency) {
    this.convFrequency = convFrequency;
    return this;
  }

   /**
   * Convertible Frequency
   * @return convFrequency
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "Convertible Frequency")
  @JsonProperty(JSON_PROPERTY_CONV_FREQUENCY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getConvFrequency() {
    return convFrequency;
  }


  @JsonProperty(JSON_PROPERTY_CONV_FREQUENCY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setConvFrequency(String convFrequency) {
    this.convFrequency = convFrequency;
  }


  public ConvertibleDetails convId(Integer convId) {
    this.convId = convId;
    return this;
  }

   /**
   * Convertible Type Id
   * @return convId
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "Convertible Type Id")
  @JsonProperty(JSON_PROPERTY_CONV_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getConvId() {
    return convId;
  }


  @JsonProperty(JSON_PROPERTY_CONV_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setConvId(Integer convId) {
    this.convId = convId;
  }


  public ConvertibleDetails convIdentification(String convIdentification) {
    this.convIdentification = convIdentification;
    return this;
  }

   /**
   * Convertible Identification
   * @return convIdentification
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "Convertible Identification")
  @JsonProperty(JSON_PROPERTY_CONV_IDENTIFICATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getConvIdentification() {
    return convIdentification;
  }


  @JsonProperty(JSON_PROPERTY_CONV_IDENTIFICATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setConvIdentification(String convIdentification) {
    this.convIdentification = convIdentification;
  }


  public ConvertibleDetails convNoticeDaysMax(Integer convNoticeDaysMax) {
    this.convNoticeDaysMax = convNoticeDaysMax;
    return this;
  }

   /**
   * Convertible Notice Max
   * @return convNoticeDaysMax
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "Convertible Notice Max")
  @JsonProperty(JSON_PROPERTY_CONV_NOTICE_DAYS_MAX)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getConvNoticeDaysMax() {
    return convNoticeDaysMax;
  }


  @JsonProperty(JSON_PROPERTY_CONV_NOTICE_DAYS_MAX)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setConvNoticeDaysMax(Integer convNoticeDaysMax) {
    this.convNoticeDaysMax = convNoticeDaysMax;
  }


  public ConvertibleDetails convNoticeDaysMin(Integer convNoticeDaysMin) {
    this.convNoticeDaysMin = convNoticeDaysMin;
    return this;
  }

   /**
   * Convertible Notice Min
   * @return convNoticeDaysMin
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "Convertible Notice Min")
  @JsonProperty(JSON_PROPERTY_CONV_NOTICE_DAYS_MIN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getConvNoticeDaysMin() {
    return convNoticeDaysMin;
  }


  @JsonProperty(JSON_PROPERTY_CONV_NOTICE_DAYS_MIN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setConvNoticeDaysMin(Integer convNoticeDaysMin) {
    this.convNoticeDaysMin = convNoticeDaysMin;
  }


  public ConvertibleDetails convPayForm(String convPayForm) {
    this.convPayForm = convPayForm;
    return this;
  }

   /**
   * Convertible Payment Form
   * @return convPayForm
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "Convertible Payment Form")
  @JsonProperty(JSON_PROPERTY_CONV_PAY_FORM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getConvPayForm() {
    return convPayForm;
  }


  @JsonProperty(JSON_PROPERTY_CONV_PAY_FORM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setConvPayForm(String convPayForm) {
    this.convPayForm = convPayForm;
  }


  public ConvertibleDetails convPayFormDet(String convPayFormDet) {
    this.convPayFormDet = convPayFormDet;
    return this;
  }

   /**
   * Convertible Payment Form Detail
   * @return convPayFormDet
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "Convertible Payment Form Detail")
  @JsonProperty(JSON_PROPERTY_CONV_PAY_FORM_DET)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getConvPayFormDet() {
    return convPayFormDet;
  }


  @JsonProperty(JSON_PROPERTY_CONV_PAY_FORM_DET)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setConvPayFormDet(String convPayFormDet) {
    this.convPayFormDet = convPayFormDet;
  }


  public ConvertibleDetails convPayFormElect(String convPayFormElect) {
    this.convPayFormElect = convPayFormElect;
    return this;
  }

   /**
   * Convertible Payment Form Election
   * @return convPayFormElect
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "Convertible Payment Form Election")
  @JsonProperty(JSON_PROPERTY_CONV_PAY_FORM_ELECT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getConvPayFormElect() {
    return convPayFormElect;
  }


  @JsonProperty(JSON_PROPERTY_CONV_PAY_FORM_ELECT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setConvPayFormElect(String convPayFormElect) {
    this.convPayFormElect = convPayFormElect;
  }


  public ConvertibleDetails convPremChgControl(Double convPremChgControl) {
    this.convPremChgControl = convPremChgControl;
    return this;
  }

   /**
   * Convertible Premium Change Control
   * @return convPremChgControl
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "Convertible Premium Change Control")
  @JsonProperty(JSON_PROPERTY_CONV_PREM_CHG_CONTROL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Double getConvPremChgControl() {
    return convPremChgControl;
  }


  @JsonProperty(JSON_PROPERTY_CONV_PREM_CHG_CONTROL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setConvPremChgControl(Double convPremChgControl) {
    this.convPremChgControl = convPremChgControl;
  }


  public ConvertibleDetails convPriceMethod(String convPriceMethod) {
    this.convPriceMethod = convPriceMethod;
    return this;
  }

   /**
   * Convertible Price Method
   * @return convPriceMethod
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "Convertible Price Method")
  @JsonProperty(JSON_PROPERTY_CONV_PRICE_METHOD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getConvPriceMethod() {
    return convPriceMethod;
  }


  @JsonProperty(JSON_PROPERTY_CONV_PRICE_METHOD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setConvPriceMethod(String convPriceMethod) {
    this.convPriceMethod = convPriceMethod;
  }


  public ConvertibleDetails convRatio(Double convRatio) {
    this.convRatio = convRatio;
    return this;
  }

   /**
   * Convertibles Ratio
   * @return convRatio
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "Convertibles Ratio")
  @JsonProperty(JSON_PROPERTY_CONV_RATIO)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Double getConvRatio() {
    return convRatio;
  }


  @JsonProperty(JSON_PROPERTY_CONV_RATIO)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setConvRatio(Double convRatio) {
    this.convRatio = convRatio;
  }


  public ConvertibleDetails convRatioDesc(String convRatioDesc) {
    this.convRatioDesc = convRatioDesc;
    return this;
  }

   /**
   * Convertible Ratio Form Description
   * @return convRatioDesc
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "Convertible Ratio Form Description")
  @JsonProperty(JSON_PROPERTY_CONV_RATIO_DESC)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getConvRatioDesc() {
    return convRatioDesc;
  }


  @JsonProperty(JSON_PROPERTY_CONV_RATIO_DESC)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setConvRatioDesc(String convRatioDesc) {
    this.convRatioDesc = convRatioDesc;
  }


  public ConvertibleDetails convType(String convType) {
    this.convType = convType;
    return this;
  }

   /**
   * Convertible Type
   * @return convType
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "Convertible Type")
  @JsonProperty(JSON_PROPERTY_CONV_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getConvType() {
    return convType;
  }


  @JsonProperty(JSON_PROPERTY_CONV_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setConvType(String convType) {
    this.convType = convType;
  }


  /**
   * Return true if this convertibleDetails object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConvertibleDetails convertibleDetails = (ConvertibleDetails) o;
    return Objects.equals(this.requestId, convertibleDetails.requestId) &&
        Objects.equals(this.fsymId, convertibleDetails.fsymId) &&
        Objects.equals(this.convCurr, convertibleDetails.convCurr) &&
        Objects.equals(this.convEffDate, convertibleDetails.convEffDate) &&
        Objects.equals(this.convEndDate, convertibleDetails.convEndDate) &&
        Objects.equals(this.convFrequency, convertibleDetails.convFrequency) &&
        Objects.equals(this.convId, convertibleDetails.convId) &&
        Objects.equals(this.convIdentification, convertibleDetails.convIdentification) &&
        Objects.equals(this.convNoticeDaysMax, convertibleDetails.convNoticeDaysMax) &&
        Objects.equals(this.convNoticeDaysMin, convertibleDetails.convNoticeDaysMin) &&
        Objects.equals(this.convPayForm, convertibleDetails.convPayForm) &&
        Objects.equals(this.convPayFormDet, convertibleDetails.convPayFormDet) &&
        Objects.equals(this.convPayFormElect, convertibleDetails.convPayFormElect) &&
        Objects.equals(this.convPremChgControl, convertibleDetails.convPremChgControl) &&
        Objects.equals(this.convPriceMethod, convertibleDetails.convPriceMethod) &&
        Objects.equals(this.convRatio, convertibleDetails.convRatio) &&
        Objects.equals(this.convRatioDesc, convertibleDetails.convRatioDesc) &&
        Objects.equals(this.convType, convertibleDetails.convType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(requestId, fsymId, convCurr, convEffDate, convEndDate, convFrequency, convId, convIdentification, convNoticeDaysMax, convNoticeDaysMin, convPayForm, convPayFormDet, convPayFormElect, convPremChgControl, convPriceMethod, convRatio, convRatioDesc, convType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConvertibleDetails {\n");
    sb.append("    requestId: ").append(toIndentedString(requestId)).append("\n");
    sb.append("    fsymId: ").append(toIndentedString(fsymId)).append("\n");
    sb.append("    convCurr: ").append(toIndentedString(convCurr)).append("\n");
    sb.append("    convEffDate: ").append(toIndentedString(convEffDate)).append("\n");
    sb.append("    convEndDate: ").append(toIndentedString(convEndDate)).append("\n");
    sb.append("    convFrequency: ").append(toIndentedString(convFrequency)).append("\n");
    sb.append("    convId: ").append(toIndentedString(convId)).append("\n");
    sb.append("    convIdentification: ").append(toIndentedString(convIdentification)).append("\n");
    sb.append("    convNoticeDaysMax: ").append(toIndentedString(convNoticeDaysMax)).append("\n");
    sb.append("    convNoticeDaysMin: ").append(toIndentedString(convNoticeDaysMin)).append("\n");
    sb.append("    convPayForm: ").append(toIndentedString(convPayForm)).append("\n");
    sb.append("    convPayFormDet: ").append(toIndentedString(convPayFormDet)).append("\n");
    sb.append("    convPayFormElect: ").append(toIndentedString(convPayFormElect)).append("\n");
    sb.append("    convPremChgControl: ").append(toIndentedString(convPremChgControl)).append("\n");
    sb.append("    convPriceMethod: ").append(toIndentedString(convPriceMethod)).append("\n");
    sb.append("    convRatio: ").append(toIndentedString(convRatio)).append("\n");
    sb.append("    convRatioDesc: ").append(toIndentedString(convRatioDesc)).append("\n");
    sb.append("    convType: ").append(toIndentedString(convType)).append("\n");
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

