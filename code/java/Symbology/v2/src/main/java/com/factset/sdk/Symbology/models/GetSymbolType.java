/*
 * FactSet Symbology API
 * The FactSet Symbology API provides symbol resolution services, allowing clients to translate market identifiers into various symbology types such as, FactSet Permanent Identifiers, CUSIP, ISIN, SEDOL, Tickers, and Bloomberg FIGIs. <p>Factset's Symbology API sits at the center of its hub-and-spoke data model, enabling you to quickly harmonize the expanding catalog of Content APIs. Translate market IDs into CUSIP, SEDOL, ISIN, Tickers as of a point in time or for the entire history of the requested id allowing Data Management workflows to normalize ids over time.</p> 
 *
 * The version of the OpenAPI document: 2.1.3
 * Contact: api@factset.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.factset.sdk.Symbology.models;

import java.util.Objects;
import java.util.Arrays;
import java.util.Map;
import java.util.HashMap;
import io.swagger.annotations.ApiModel;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.factset.sdk.Symbology.JSON;


import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Specifies the type of symbol being requested in the ids parameter. **This is only required when requesting to translate from the symbolTypes in the list below to a FactSet Permanent Identifier.  Only one symbolType is permitted per request, and all ids passed in request must be of the same type.**   |symbolType|Description|   |---|---|   |BIC|Bank Identification Codes|   |CIK|Edgar Central Index Key|   |CRD|Central Registration Depository|   |EIN|Employer Identification Number|   |FITCH|Fitch Ratings Identifier|   |LEI|Legal Entity Identifier|   |MD|Moody&#39;s Ratings Identifier|   |SPR|S&amp;P Ratings Identifier|   |VALOREN|Valoren (\&quot;Valor\&quot;) Identification|   |WKN|German Securities Identification (\&quot;Wert\&quot;)|   |UKCH|UK Company House Identifier|Entity(-E)|   |RSSD|Federal Reserve RSSD Identifier|Entity(-E)| 
 */
public enum GetSymbolType {
  
  BIC("BIC"),
  
  CIK("CIK"),
  
  CRD("CRD"),
  
  EIN("EIN"),
  
  FITCH("FITCH"),
  
  LEI("LEI"),
  
  MD("MD"),
  
  SPR("SPR"),
  
  VALOREN("VALOREN"),
  
  WKN("WKN"),
  
  JCN("JCN"),
  
  UKCH("UKCH"),
  
  RSSD("RSSD"),
  
  EMPTY("");

  private String value;

  GetSymbolType(String value) {
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
  public static GetSymbolType fromValue(String value) {
    for (GetSymbolType b : GetSymbolType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}

