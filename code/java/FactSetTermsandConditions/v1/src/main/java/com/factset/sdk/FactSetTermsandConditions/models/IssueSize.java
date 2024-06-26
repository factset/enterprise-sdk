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
 * Issue Size Data Items for a Fixed Income security.
 */
@ApiModel(description = "Issue Size Data Items for a Fixed Income security.")
@JsonPropertyOrder({
  IssueSize.JSON_PROPERTY_REQUEST_ID,
  IssueSize.JSON_PROPERTY_FSYM_ID,
  IssueSize.JSON_PROPERTY_OUT_AMT_EFF_DATE,
  IssueSize.JSON_PROPERTY_OUT_AMT_CURRENCY,
  IssueSize.JSON_PROPERTY_OUT_AMT,
  IssueSize.JSON_PROPERTY_OUT_AMT_CHANGE,
  IssueSize.JSON_PROPERTY_OUT_AMT_CHANGE_PRICE,
  IssueSize.JSON_PROPERTY_OUT_AMT_CHANGE_TYPE
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")

public class IssueSize implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_REQUEST_ID = "requestId";
  private String requestId;

  public static final String JSON_PROPERTY_FSYM_ID = "fsymId";
  private String fsymId;

  public static final String JSON_PROPERTY_OUT_AMT_EFF_DATE = "outAmtEffDate";
  private LocalDate outAmtEffDate;

  public static final String JSON_PROPERTY_OUT_AMT_CURRENCY = "outAmtCurrency";
  private String outAmtCurrency;

  public static final String JSON_PROPERTY_OUT_AMT = "outAmt";
  private Double outAmt;

  public static final String JSON_PROPERTY_OUT_AMT_CHANGE = "outAmtChange";
  private Double outAmtChange;

  public static final String JSON_PROPERTY_OUT_AMT_CHANGE_PRICE = "outAmtChangePrice";
  private Double outAmtChangePrice;

  public static final String JSON_PROPERTY_OUT_AMT_CHANGE_TYPE = "outAmtChangeType";
  private String outAmtChangeType;

  public IssueSize() { 
  }

  @JsonCreator
  public IssueSize(
    @JsonProperty(value=JSON_PROPERTY_REQUEST_ID, required=true) String requestId, 
    @JsonProperty(value=JSON_PROPERTY_FSYM_ID, required=true) String fsymId
  ) {
    this();
    this.requestId = requestId;
    this.fsymId = fsymId;
  }

  public IssueSize requestId(String requestId) {
    this.requestId = requestId;
    return this;
  }

   /**
   * Security identifier used in the request.
   * @return requestId
  **/
  @jakarta.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Security identifier used in the request.")
  @JsonProperty(JSON_PROPERTY_REQUEST_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getRequestId() {
    return requestId;
  }


  @JsonProperty(JSON_PROPERTY_REQUEST_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setRequestId(String requestId) {
    this.requestId = requestId;
  }


  public IssueSize fsymId(String fsymId) {
    this.fsymId = fsymId;
    return this;
  }

   /**
   * FactSet Permanent Security Identifier.
   * @return fsymId
  **/
  @jakarta.annotation.Nonnull
  @ApiModelProperty(required = true, value = "FactSet Permanent Security Identifier.")
  @JsonProperty(JSON_PROPERTY_FSYM_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getFsymId() {
    return fsymId;
  }


  @JsonProperty(JSON_PROPERTY_FSYM_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setFsymId(String fsymId) {
    this.fsymId = fsymId;
  }


  public IssueSize outAmtEffDate(LocalDate outAmtEffDate) {
    this.outAmtEffDate = outAmtEffDate;
    return this;
  }

   /**
   * Amount Outstanding Effective Date (out_amt_eff_date)
   * @return outAmtEffDate
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "Amount Outstanding Effective Date (out_amt_eff_date)")
  @JsonProperty(JSON_PROPERTY_OUT_AMT_EFF_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public LocalDate getOutAmtEffDate() {
    return outAmtEffDate;
  }


  @JsonProperty(JSON_PROPERTY_OUT_AMT_EFF_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setOutAmtEffDate(LocalDate outAmtEffDate) {
    this.outAmtEffDate = outAmtEffDate;
  }


  public IssueSize outAmtCurrency(String outAmtCurrency) {
    this.outAmtCurrency = outAmtCurrency;
    return this;
  }

   /**
   * Amount Outstanding Currency
   * @return outAmtCurrency
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "Amount Outstanding Currency")
  @JsonProperty(JSON_PROPERTY_OUT_AMT_CURRENCY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getOutAmtCurrency() {
    return outAmtCurrency;
  }


  @JsonProperty(JSON_PROPERTY_OUT_AMT_CURRENCY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setOutAmtCurrency(String outAmtCurrency) {
    this.outAmtCurrency = outAmtCurrency;
  }


  public IssueSize outAmt(Double outAmt) {
    this.outAmt = outAmt;
    return this;
  }

   /**
   * Amount Outstanding
   * @return outAmt
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "Amount Outstanding")
  @JsonProperty(JSON_PROPERTY_OUT_AMT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Double getOutAmt() {
    return outAmt;
  }


  @JsonProperty(JSON_PROPERTY_OUT_AMT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setOutAmt(Double outAmt) {
    this.outAmt = outAmt;
  }


  public IssueSize outAmtChange(Double outAmtChange) {
    this.outAmtChange = outAmtChange;
    return this;
  }

   /**
   * Amount Outstanding Action Amount
   * @return outAmtChange
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "Amount Outstanding Action Amount")
  @JsonProperty(JSON_PROPERTY_OUT_AMT_CHANGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Double getOutAmtChange() {
    return outAmtChange;
  }


  @JsonProperty(JSON_PROPERTY_OUT_AMT_CHANGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setOutAmtChange(Double outAmtChange) {
    this.outAmtChange = outAmtChange;
  }


  public IssueSize outAmtChangePrice(Double outAmtChangePrice) {
    this.outAmtChangePrice = outAmtChangePrice;
    return this;
  }

   /**
   * Price - Amount Outstanding Action
   * @return outAmtChangePrice
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "Price - Amount Outstanding Action")
  @JsonProperty(JSON_PROPERTY_OUT_AMT_CHANGE_PRICE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Double getOutAmtChangePrice() {
    return outAmtChangePrice;
  }


  @JsonProperty(JSON_PROPERTY_OUT_AMT_CHANGE_PRICE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setOutAmtChangePrice(Double outAmtChangePrice) {
    this.outAmtChangePrice = outAmtChangePrice;
  }


  public IssueSize outAmtChangeType(String outAmtChangeType) {
    this.outAmtChangeType = outAmtChangeType;
    return this;
  }

   /**
   * Amount Outstanding Action Type
   * @return outAmtChangeType
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "Amount Outstanding Action Type")
  @JsonProperty(JSON_PROPERTY_OUT_AMT_CHANGE_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getOutAmtChangeType() {
    return outAmtChangeType;
  }


  @JsonProperty(JSON_PROPERTY_OUT_AMT_CHANGE_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setOutAmtChangeType(String outAmtChangeType) {
    this.outAmtChangeType = outAmtChangeType;
  }


  /**
   * Return true if this issueSize object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IssueSize issueSize = (IssueSize) o;
    return Objects.equals(this.requestId, issueSize.requestId) &&
        Objects.equals(this.fsymId, issueSize.fsymId) &&
        Objects.equals(this.outAmtEffDate, issueSize.outAmtEffDate) &&
        Objects.equals(this.outAmtCurrency, issueSize.outAmtCurrency) &&
        Objects.equals(this.outAmt, issueSize.outAmt) &&
        Objects.equals(this.outAmtChange, issueSize.outAmtChange) &&
        Objects.equals(this.outAmtChangePrice, issueSize.outAmtChangePrice) &&
        Objects.equals(this.outAmtChangeType, issueSize.outAmtChangeType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(requestId, fsymId, outAmtEffDate, outAmtCurrency, outAmt, outAmtChange, outAmtChangePrice, outAmtChangeType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IssueSize {\n");
    sb.append("    requestId: ").append(toIndentedString(requestId)).append("\n");
    sb.append("    fsymId: ").append(toIndentedString(fsymId)).append("\n");
    sb.append("    outAmtEffDate: ").append(toIndentedString(outAmtEffDate)).append("\n");
    sb.append("    outAmtCurrency: ").append(toIndentedString(outAmtCurrency)).append("\n");
    sb.append("    outAmt: ").append(toIndentedString(outAmt)).append("\n");
    sb.append("    outAmtChange: ").append(toIndentedString(outAmtChange)).append("\n");
    sb.append("    outAmtChangePrice: ").append(toIndentedString(outAmtChangePrice)).append("\n");
    sb.append("    outAmtChangeType: ").append(toIndentedString(outAmtChangeType)).append("\n");
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

