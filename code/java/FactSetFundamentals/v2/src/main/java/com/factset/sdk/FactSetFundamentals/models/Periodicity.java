/*
 * FactSet Fundamentals API
 * Gain access to current, comprehensive, and comparative information on securities in worldwide developed and emerging markets. Composed of annual and interim/quarterly data, detailed historical financial statement content, per-share data, and calculated ratios, FactSet Fundamentals provides you with the information you need for a global investment perspective.<p>This API is rate-limited to 10 requests per second and 10 concurrent requests per user.</p> 
 *
 * The version of the OpenAPI document: 2.4.1
 * Contact: api@factset.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.factset.sdk.FactSetFundamentals.models;

import java.util.Objects;
import java.util.Arrays;
import java.util.Map;
import java.util.HashMap;
import io.swagger.annotations.ApiModel;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.factset.sdk.FactSetFundamentals.JSON;


import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Periodicity or frequency of the fiscal periods, where   * **ANN** &#x3D; Annual Original,   * **ANN_R** &#x3D; Annual Latest - *Includes Restatements*,   * **QTR** &#x3D; Quarterly,   * **QTR_R** &#x3D; Quarterly Latest - *Includes Restatements*,   * **SEMI** &#x3D; Semi-Annual,   * **SEMI_R** &#x3D; Semi-Annual Latest - *Includes Restatements*,   * **LTM** &#x3D; Last Twelve Months,   * **LTM_R** &#x3D; Last Twelve Months Latest - *Includes Restatements*,   * **LTM_SEMI** &#x3D; Last Twelve Months - Semi-Annually Reported Data,   * **LTM_SEMI_R** &#x3D; Last Twelve Months - Semi-Annual Latest - *Includes Restatements*,   * **LTMSG** &#x3D; Last Twelve Months Global [OA17959](https://my.apps.factset.com/oa/pages/17959) and   * **YTD** &#x3D; Year-to-date &lt;br&gt;&lt;br&gt; Please note that the coverage for SEMI_R and LTM_R may be limited as fewer companies report with these periodicities. 
 */
public enum Periodicity {
  
  ANN("ANN"),
  
  ANN_R("ANN_R"),
  
  QTR("QTR"),
  
  QTR_R("QTR_R"),
  
  SEMI("SEMI"),
  
  SEMI_R("SEMI_R"),
  
  LTM("LTM"),
  
  LTM_R("LTM_R"),
  
  LTMSG("LTMSG"),
  
  LTM_SEMI("LTM_SEMI"),
  
  LTM_SEMI_R("LTM_SEMI_R"),
  
  YTD("YTD");

  private String value;

  Periodicity(String value) {
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
  public static Periodicity fromValue(String value) {
    for (Periodicity b : Periodicity.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}

