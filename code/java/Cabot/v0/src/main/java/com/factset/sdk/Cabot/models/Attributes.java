/*
 * Cabot Models API
 * Cabot Models API
 *
 * The version of the OpenAPI document: 0.4.0
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
import io.swagger.annotations.ApiModel;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.factset.sdk.Cabot.JSON;


import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * All currently available attributes.&lt;br/&gt;&lt;br/&gt;QFL_EY : EPS for the most recent 12-month period/Share price&lt;br/&gt;QFL_PEG : Price to Earnings/Growth rate&lt;br/&gt;QFL_OCFY : Operating cash flow (FF_OPER_CF)/Market value&lt;br/&gt;QFL_BP : Price/book value per share ratio&lt;br/&gt;QFL_SP : Sales to Price (SP) Net sales/Market value&lt;br/&gt;QFL_OCF_EARNINGS_VAR : Differences of earnings per share in both positive and negative directions&lt;br/&gt;QFL_DY : Indicated annual dividend/Latest close price&lt;br/&gt;QFL_NET_MGN : Net profit/Net sales * 100&lt;br/&gt;QFL_OPER_MGN : Operating Income/Net Sales * 100&lt;br/&gt;QFL_ROE : Net income/Total shareholders&#39; equity&lt;br/&gt;QFL_CFROE : Net cash provided by/used in operating activities /Total shareholders&#39; equity&lt;br/&gt;QFL_EPS_GR_5Y : Compounded annual growth rate (CAGR) of EPS over the previous 5 financial years&lt;br/&gt;QFL_OCF_GR_5Y : Compounded annual growth rate (CAGR) of CFO over the previous 5 financial years&lt;br/&gt;QFL_SALES_GR_5Y : Compounded annual growth rate (CAGR) of Revenue over the previous 5 financial years&lt;br/&gt;QFL_DPS_GR_5Y : Compounded annual growth rate (CAGR) of Dividend over the previous 5 financial years&lt;br/&gt;QFL_EPS_GR_1Y : 1Y EPS Growth,Growth rate of EPS over the previous financial years&lt;br/&gt;QFL_OCF_GR_1Y : Growth rate of CFO over the previous financial years&lt;br/&gt;QFL_SALES_GR_1Y : Growth rate of Revenue over the previous financial years&lt;br/&gt;QFL_LT_DEBT_EQUITY : Long-term debt/Shareholders&#39; Equity&lt;br/&gt;QFL_DEBT_ASSETS : Long-term debt/total assets&lt;br/&gt;QFL_EBITDAEV : Represents unreported fiscal year (F1) Enterprise Value to EBITDA&lt;br/&gt;QFL_REVEV : Represents Enterprise Value to Revenue&lt;br/&gt;QFL_ROIC : Net Income/Two fiscal period average of Total Invested Capital * 100&lt;br/&gt;QFL_CFROIC : Net cash provided by/used in operating activities divided by the sum of the company&#39;s total shareholders&#39; equity and its long-term liabilities&lt;br/&gt;
 */
public enum Attributes {
  
  EY("QFL_EY"),
  
  PEG("QFL_PEG"),
  
  OCFY("QFL_OCFY"),
  
  BP("QFL_BP"),
  
  SP("QFL_SP"),
  
  OCF_EARNINGS_VAR("QFL_OCF_EARNINGS_VAR"),
  
  DY("QFL_DY"),
  
  NET_MGN("QFL_NET_MGN"),
  
  OPER_MGN("QFL_OPER_MGN"),
  
  ROE("QFL_ROE"),
  
  CFROE("QFL_CFROE"),
  
  EPS_GR_5Y("QFL_EPS_GR_5Y"),
  
  OCF_GR_5Y("QFL_OCF_GR_5Y"),
  
  SALES_GR_5Y("QFL_SALES_GR_5Y"),
  
  DPS_GR_5Y("QFL_DPS_GR_5Y"),
  
  EPS_GR_1Y("QFL_EPS_GR_1Y"),
  
  OCF_GR_1Y("QFL_OCF_GR_1Y"),
  
  SALES_GR_1Y("QFL_SALES_GR_1Y"),
  
  LT_DEBT_EQUITY("QFL_LT_DEBT_EQUITY"),
  
  DEBT_ASSETS("QFL_DEBT_ASSETS"),
  
  EBITDAEV("QFL_EBITDAEV"),
  
  REVEV("QFL_REVEV"),
  
  ROIC("QFL_ROIC"),
  
  CFROIC("QFL_CFROIC");

  private String value;

  Attributes(String value) {
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
  public static Attributes fromValue(String value) {
    for (Attributes b : Attributes.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}

