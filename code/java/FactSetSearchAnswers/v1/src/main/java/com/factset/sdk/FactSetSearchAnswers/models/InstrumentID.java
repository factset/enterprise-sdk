/*
 * FactSet Search Answers API
 * The FactSet Search Answers API provides answers to search queries, reflecting the data shown within FactSet Search Answers, and allowing you to easily add financial data to your widgets, lookups, bots, and assistants. The API understands a fixed amount of search terms and returns structured data from FactSet’s many data sources. Possible answers include Price of a Company, Top 10 Year-to-Date Gainers, Revenue per Passenger Mile, and many more.
 *
 * The version of the OpenAPI document: 1.1.0
 * Contact: api@factset.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.factset.sdk.FactSetSearchAnswers.models;

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
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.factset.sdk.FactSetSearchAnswers.JSON;


/**
 * InstrumentID
 */
@JsonPropertyOrder({
  InstrumentID.JSON_PROPERTY_B_B_G,
  InstrumentID.JSON_PROPERTY_C_U_S_I_P,
  InstrumentID.JSON_PROPERTY_F_D_S_I_D,
  InstrumentID.JSON_PROPERTY_F_D_S_T_I_C_K_E_R_R_E_G_I_O_N,
  InstrumentID.JSON_PROPERTY_F_D_S_T_I_C_K_E_R_E_X_C_H_A_N_G_E,
  InstrumentID.JSON_PROPERTY_F_I_G_I,
  InstrumentID.JSON_PROPERTY_I_S_I_N,
  InstrumentID.JSON_PROPERTY_P_E_R_M_I_D,
  InstrumentID.JSON_PROPERTY_R_I_C,
  InstrumentID.JSON_PROPERTY_S_E_D_O_L,
  InstrumentID.JSON_PROPERTY_TICKER
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")

public class InstrumentID implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_B_B_G = "BBG";
  private String BBG;

  public static final String JSON_PROPERTY_C_U_S_I_P = "CUSIP";
  private String CUSIP;

  public static final String JSON_PROPERTY_F_D_S_I_D = "FDS_ID";
  private String FDS_ID;

  public static final String JSON_PROPERTY_F_D_S_T_I_C_K_E_R_R_E_G_I_O_N = "FDS_TICKER_REGION";
  private String FDS_TICKER_REGION;

  public static final String JSON_PROPERTY_F_D_S_T_I_C_K_E_R_E_X_C_H_A_N_G_E = "FDS_TICKER_EXCHANGE";
  private String FDS_TICKER_EXCHANGE;

  public static final String JSON_PROPERTY_F_I_G_I = "FIGI";
  private String FIGI;

  public static final String JSON_PROPERTY_I_S_I_N = "ISIN";
  private String ISIN;

  public static final String JSON_PROPERTY_P_E_R_M_I_D = "PERMID";
  private String PERMID;

  public static final String JSON_PROPERTY_R_I_C = "RIC";
  private String RIC;

  public static final String JSON_PROPERTY_S_E_D_O_L = "SEDOL";
  private String SEDOL;

  public static final String JSON_PROPERTY_TICKER = "ticker";
  private String ticker;

  public InstrumentID() { 
  }

  public InstrumentID BBG(String BBG) {
    this.BBG = BBG;
    return this;
  }

   /**
   * Get BBG
   * @return BBG
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_B_B_G)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getBBG() {
    return BBG;
  }


  @JsonProperty(JSON_PROPERTY_B_B_G)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setBBG(String BBG) {
    this.BBG = BBG;
  }


  public InstrumentID CUSIP(String CUSIP) {
    this.CUSIP = CUSIP;
    return this;
  }

   /**
   * Get CUSIP
   * @return CUSIP
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_C_U_S_I_P)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCUSIP() {
    return CUSIP;
  }


  @JsonProperty(JSON_PROPERTY_C_U_S_I_P)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCUSIP(String CUSIP) {
    this.CUSIP = CUSIP;
  }


  public InstrumentID FDS_ID(String FDS_ID) {
    this.FDS_ID = FDS_ID;
    return this;
  }

   /**
   * Get FDS_ID
   * @return FDS_ID
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_F_D_S_I_D)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getFDSID() {
    return FDS_ID;
  }


  @JsonProperty(JSON_PROPERTY_F_D_S_I_D)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFDSID(String FDS_ID) {
    this.FDS_ID = FDS_ID;
  }


  public InstrumentID FDS_TICKER_REGION(String FDS_TICKER_REGION) {
    this.FDS_TICKER_REGION = FDS_TICKER_REGION;
    return this;
  }

   /**
   * Get FDS_TICKER_REGION
   * @return FDS_TICKER_REGION
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_F_D_S_T_I_C_K_E_R_R_E_G_I_O_N)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getFDSTICKERREGION() {
    return FDS_TICKER_REGION;
  }


  @JsonProperty(JSON_PROPERTY_F_D_S_T_I_C_K_E_R_R_E_G_I_O_N)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFDSTICKERREGION(String FDS_TICKER_REGION) {
    this.FDS_TICKER_REGION = FDS_TICKER_REGION;
  }


  public InstrumentID FDS_TICKER_EXCHANGE(String FDS_TICKER_EXCHANGE) {
    this.FDS_TICKER_EXCHANGE = FDS_TICKER_EXCHANGE;
    return this;
  }

   /**
   * Get FDS_TICKER_EXCHANGE
   * @return FDS_TICKER_EXCHANGE
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_F_D_S_T_I_C_K_E_R_E_X_C_H_A_N_G_E)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getFDSTICKEREXCHANGE() {
    return FDS_TICKER_EXCHANGE;
  }


  @JsonProperty(JSON_PROPERTY_F_D_S_T_I_C_K_E_R_E_X_C_H_A_N_G_E)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFDSTICKEREXCHANGE(String FDS_TICKER_EXCHANGE) {
    this.FDS_TICKER_EXCHANGE = FDS_TICKER_EXCHANGE;
  }


  public InstrumentID FIGI(String FIGI) {
    this.FIGI = FIGI;
    return this;
  }

   /**
   * Get FIGI
   * @return FIGI
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_F_I_G_I)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getFIGI() {
    return FIGI;
  }


  @JsonProperty(JSON_PROPERTY_F_I_G_I)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFIGI(String FIGI) {
    this.FIGI = FIGI;
  }


  public InstrumentID ISIN(String ISIN) {
    this.ISIN = ISIN;
    return this;
  }

   /**
   * Get ISIN
   * @return ISIN
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_I_S_I_N)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getISIN() {
    return ISIN;
  }


  @JsonProperty(JSON_PROPERTY_I_S_I_N)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setISIN(String ISIN) {
    this.ISIN = ISIN;
  }


  public InstrumentID PERMID(String PERMID) {
    this.PERMID = PERMID;
    return this;
  }

   /**
   * Get PERMID
   * @return PERMID
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_P_E_R_M_I_D)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getPERMID() {
    return PERMID;
  }


  @JsonProperty(JSON_PROPERTY_P_E_R_M_I_D)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPERMID(String PERMID) {
    this.PERMID = PERMID;
  }


  public InstrumentID RIC(String RIC) {
    this.RIC = RIC;
    return this;
  }

   /**
   * Get RIC
   * @return RIC
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_R_I_C)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getRIC() {
    return RIC;
  }


  @JsonProperty(JSON_PROPERTY_R_I_C)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRIC(String RIC) {
    this.RIC = RIC;
  }


  public InstrumentID SEDOL(String SEDOL) {
    this.SEDOL = SEDOL;
    return this;
  }

   /**
   * Get SEDOL
   * @return SEDOL
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_S_E_D_O_L)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getSEDOL() {
    return SEDOL;
  }


  @JsonProperty(JSON_PROPERTY_S_E_D_O_L)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSEDOL(String SEDOL) {
    this.SEDOL = SEDOL;
  }


  public InstrumentID ticker(String ticker) {
    this.ticker = ticker;
    return this;
  }

   /**
   * Get ticker
   * @return ticker
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_TICKER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getTicker() {
    return ticker;
  }


  @JsonProperty(JSON_PROPERTY_TICKER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTicker(String ticker) {
    this.ticker = ticker;
  }


  /**
   * Return true if this InstrumentID object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InstrumentID instrumentID = (InstrumentID) o;
    return Objects.equals(this.BBG, instrumentID.BBG) &&
        Objects.equals(this.CUSIP, instrumentID.CUSIP) &&
        Objects.equals(this.FDS_ID, instrumentID.FDS_ID) &&
        Objects.equals(this.FDS_TICKER_REGION, instrumentID.FDS_TICKER_REGION) &&
        Objects.equals(this.FDS_TICKER_EXCHANGE, instrumentID.FDS_TICKER_EXCHANGE) &&
        Objects.equals(this.FIGI, instrumentID.FIGI) &&
        Objects.equals(this.ISIN, instrumentID.ISIN) &&
        Objects.equals(this.PERMID, instrumentID.PERMID) &&
        Objects.equals(this.RIC, instrumentID.RIC) &&
        Objects.equals(this.SEDOL, instrumentID.SEDOL) &&
        Objects.equals(this.ticker, instrumentID.ticker);
  }

  @Override
  public int hashCode() {
    return Objects.hash(BBG, CUSIP, FDS_ID, FDS_TICKER_REGION, FDS_TICKER_EXCHANGE, FIGI, ISIN, PERMID, RIC, SEDOL, ticker);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InstrumentID {\n");
    sb.append("    BBG: ").append(toIndentedString(BBG)).append("\n");
    sb.append("    CUSIP: ").append(toIndentedString(CUSIP)).append("\n");
    sb.append("    FDS_ID: ").append(toIndentedString(FDS_ID)).append("\n");
    sb.append("    FDS_TICKER_REGION: ").append(toIndentedString(FDS_TICKER_REGION)).append("\n");
    sb.append("    FDS_TICKER_EXCHANGE: ").append(toIndentedString(FDS_TICKER_EXCHANGE)).append("\n");
    sb.append("    FIGI: ").append(toIndentedString(FIGI)).append("\n");
    sb.append("    ISIN: ").append(toIndentedString(ISIN)).append("\n");
    sb.append("    PERMID: ").append(toIndentedString(PERMID)).append("\n");
    sb.append("    RIC: ").append(toIndentedString(RIC)).append("\n");
    sb.append("    SEDOL: ").append(toIndentedString(SEDOL)).append("\n");
    sb.append("    ticker: ").append(toIndentedString(ticker)).append("\n");
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

