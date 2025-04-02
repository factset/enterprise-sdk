/*
 * FactSet Ownership API
 * FactSet's Fund Ownership API gives access to both **Holdings**, **Holders**, and **Transactions** data.<p> Factset's Holdings endpoints gives access to all the underlying securities and their position details held within a given fund. Fund Types supported include Open-End Mutual Funds, Closed-end Mutual Funds, and Exchange Traded Funds. Security Holders information retrieves all \"holder types\" and their positions across institutions, funds, insiders, and stakeholders. FactSet also provides extensive insider and institutional transactions data for multiple countries including the United States, China, and Canada.</p><p>The FactSet Ownership and Mutual Funds database collects global equity ownership data for approximately 50,000 institutions, 60,000 unique Mutual Fund portfolios, and 400,000 Insider/Stakeholders from around 110 countries. For more details review our [Data Collection](https://my.apps.factset.com/oa/cms/oaAttachment/87e162be-f2d1-4f40-a85b-bfb1b020d270/20079) methodology. </p> 
 *
 * The version of the OpenAPI document: 1.2.0
 * Contact: api@factset.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.factset.sdk.FactSetOwnership.models;

import java.util.Objects;
import java.util.Arrays;
import java.util.Map;
import java.util.HashMap;
import com.factset.sdk.FactSetOwnership.models.Frequency;
import com.factset.sdk.FactSetOwnership.models.HolderType;
import com.factset.sdk.FactSetOwnership.models.TopNHolders;
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
import com.factset.sdk.FactSetOwnership.JSON;


/**
 * Institutional Transactions Request
 */
@ApiModel(description = "Institutional Transactions Request")
@JsonPropertyOrder({
  InstitutionalTransactionsRequest.JSON_PROPERTY_IDS,
  InstitutionalTransactionsRequest.JSON_PROPERTY_START_DATE,
  InstitutionalTransactionsRequest.JSON_PROPERTY_END_DATE,
  InstitutionalTransactionsRequest.JSON_PROPERTY_TOP_N_HOLDERS,
  InstitutionalTransactionsRequest.JSON_PROPERTY_HOLDER_TYPE,
  InstitutionalTransactionsRequest.JSON_PROPERTY_CURRENCY,
  InstitutionalTransactionsRequest.JSON_PROPERTY_FREQUENCY
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")

public class InstitutionalTransactionsRequest implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_IDS = "ids";
  private java.util.List<String> ids = new java.util.ArrayList<>();

  public static final String JSON_PROPERTY_START_DATE = "startDate";
  private LocalDate startDate;

  public static final String JSON_PROPERTY_END_DATE = "endDate";
  private LocalDate endDate;

  public static final String JSON_PROPERTY_TOP_N_HOLDERS = "topNHolders";
  private TopNHolders topNHolders = TopNHolders._25;

  public static final String JSON_PROPERTY_HOLDER_TYPE = "holderType";
  private HolderType holderType = HolderType.F;

  public static final String JSON_PROPERTY_CURRENCY = "currency";
  private String currency;

  public static final String JSON_PROPERTY_FREQUENCY = "frequency";
  private Frequency frequency = Frequency.M;

  public InstitutionalTransactionsRequest() { 
  }

  @JsonCreator
  public InstitutionalTransactionsRequest(
    @JsonProperty(value=JSON_PROPERTY_IDS, required=true) java.util.List<String> ids, 
    @JsonProperty(value=JSON_PROPERTY_START_DATE, required=true) LocalDate startDate, 
    @JsonProperty(value=JSON_PROPERTY_END_DATE, required=true) LocalDate endDate
  ) {
    this();
    this.ids = ids;
    this.startDate = startDate;
    this.endDate = endDate;
  }

  public InstitutionalTransactionsRequest ids(java.util.List<String> ids) {
    this.ids = ids;
    return this;
  }

  public InstitutionalTransactionsRequest addIdsItem(String idsItem) {
    this.ids.add(idsItem);
    return this;
  }

   /**
   * List of identifiers.
   * @return ids
  **/
  @jakarta.annotation.Nonnull
  @ApiModelProperty(example = "[\"FDS-US\"]", required = true, value = "List of identifiers.")
  @JsonProperty(JSON_PROPERTY_IDS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public java.util.List<String> getIds() {
    return ids;
  }


  @JsonProperty(JSON_PROPERTY_IDS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setIds(java.util.List<String> ids) {
    this.ids = ids;
  }


  public InstitutionalTransactionsRequest startDate(LocalDate startDate) {
    this.startDate = startDate;
    return this;
  }

   /**
   * The start date requested for a given date range in **YYYY-MM-DD** format. Future dates (T+1) are not accepted in this endpoint. 
   * @return startDate
  **/
  @jakarta.annotation.Nonnull
  @ApiModelProperty(example = "Tue Jun 30 00:00:00 UTC 2020", required = true, value = "The start date requested for a given date range in **YYYY-MM-DD** format. Future dates (T+1) are not accepted in this endpoint. ")
  @JsonProperty(JSON_PROPERTY_START_DATE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public LocalDate getStartDate() {
    return startDate;
  }


  @JsonProperty(JSON_PROPERTY_START_DATE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setStartDate(LocalDate startDate) {
    this.startDate = startDate;
  }


  public InstitutionalTransactionsRequest endDate(LocalDate endDate) {
    this.endDate = endDate;
    return this;
  }

   /**
   * The end date requested for a given date range in **YYYY-MM-DD** format. Future dates (T+1) are not accepted in this endpoint. 
   * @return endDate
  **/
  @jakarta.annotation.Nonnull
  @ApiModelProperty(example = "Wed Jun 30 00:00:00 UTC 2021", required = true, value = "The end date requested for a given date range in **YYYY-MM-DD** format. Future dates (T+1) are not accepted in this endpoint. ")
  @JsonProperty(JSON_PROPERTY_END_DATE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public LocalDate getEndDate() {
    return endDate;
  }


  @JsonProperty(JSON_PROPERTY_END_DATE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setEndDate(LocalDate endDate) {
    this.endDate = endDate;
  }


  public InstitutionalTransactionsRequest topNHolders(TopNHolders topNHolders) {
    this.topNHolders = topNHolders;
    return this;
  }

   /**
   * Get topNHolders
   * @return topNHolders
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_TOP_N_HOLDERS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public TopNHolders getTopNHolders() {
    return topNHolders;
  }


  @JsonProperty(JSON_PROPERTY_TOP_N_HOLDERS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTopNHolders(TopNHolders topNHolders) {
    this.topNHolders = topNHolders;
  }


  public InstitutionalTransactionsRequest holderType(HolderType holderType) {
    this.holderType = holderType;
    return this;
  }

   /**
   * Get holderType
   * @return holderType
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_HOLDER_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public HolderType getHolderType() {
    return holderType;
  }


  @JsonProperty(JSON_PROPERTY_HOLDER_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setHolderType(HolderType holderType) {
    this.holderType = holderType;
  }


  public InstitutionalTransactionsRequest currency(String currency) {
    this.currency = currency;
    return this;
  }

   /**
   * Currency code for adjusting prices. Default is Local. For a list of currency ISO codes, visit [Online Assistant Page 1470](https://oa.apps.factset.com/pages/1470).
   * @return currency
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "USD", value = "Currency code for adjusting prices. Default is Local. For a list of currency ISO codes, visit [Online Assistant Page 1470](https://oa.apps.factset.com/pages/1470).")
  @JsonProperty(JSON_PROPERTY_CURRENCY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCurrency() {
    return currency;
  }


  @JsonProperty(JSON_PROPERTY_CURRENCY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCurrency(String currency) {
    this.currency = currency;
  }


  public InstitutionalTransactionsRequest frequency(Frequency frequency) {
    this.frequency = frequency;
    return this;
  }

   /**
   * Get frequency
   * @return frequency
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_FREQUENCY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Frequency getFrequency() {
    return frequency;
  }


  @JsonProperty(JSON_PROPERTY_FREQUENCY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFrequency(Frequency frequency) {
    this.frequency = frequency;
  }


  /**
   * Return true if this institutionalTransactionsRequest object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InstitutionalTransactionsRequest institutionalTransactionsRequest = (InstitutionalTransactionsRequest) o;
    return Objects.equals(this.ids, institutionalTransactionsRequest.ids) &&
        Objects.equals(this.startDate, institutionalTransactionsRequest.startDate) &&
        Objects.equals(this.endDate, institutionalTransactionsRequest.endDate) &&
        Objects.equals(this.topNHolders, institutionalTransactionsRequest.topNHolders) &&
        Objects.equals(this.holderType, institutionalTransactionsRequest.holderType) &&
        Objects.equals(this.currency, institutionalTransactionsRequest.currency) &&
        Objects.equals(this.frequency, institutionalTransactionsRequest.frequency);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ids, startDate, endDate, topNHolders, holderType, currency, frequency);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InstitutionalTransactionsRequest {\n");
    sb.append("    ids: ").append(toIndentedString(ids)).append("\n");
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
    sb.append("    endDate: ").append(toIndentedString(endDate)).append("\n");
    sb.append("    topNHolders: ").append(toIndentedString(topNHolders)).append("\n");
    sb.append("    holderType: ").append(toIndentedString(holderType)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("    frequency: ").append(toIndentedString(frequency)).append("\n");
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

