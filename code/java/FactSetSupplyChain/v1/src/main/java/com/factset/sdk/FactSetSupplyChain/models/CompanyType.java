/*
 * FactSet Supply Chain API
 * Access the complex networks of key customer, suppliers, competitors and partners so that you can make insightful investment decisions. Relationship information is sourced from trusted primary sources and reverse-linked to non-disclosing parties, creating a comprehensive and consistent relationship graph. <p>This API is rate-limited to 10 requests per second and 10 concurrent requests per user.</p> 
 *
 * The version of the OpenAPI document: 1.0.0
 * Contact: api@factset.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.factset.sdk.FactSetSupplyChain.models;

import java.util.Objects;
import java.util.Arrays;
import java.util.Map;
import java.util.HashMap;
import io.swagger.annotations.ApiModel;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.factset.sdk.FactSetSupplyChain.JSON;


import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Specifies the category of companies to include when filtering results:   * **PUBLIC_COMPANIES_ONLY**: Include only relationships involving companies that are publicly traded.            * **PRIVATE_COMPANIES_ONLY**: Include only relationships involving companies that are privately held (not publicly traded).            * **ALL**: Include relationships involving both public and private companies. 
 */
public enum CompanyType {
  
  PUBLIC_COMPANIES_ONLY("PUBLIC_COMPANIES_ONLY"),
  
  PRIVATE_COMPANIES_ONLY("PRIVATE_COMPANIES_ONLY"),
  
  ALL("ALL");

  private String value;

  CompanyType(String value) {
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
  public static CompanyType fromValue(String value) {
    for (CompanyType b : CompanyType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}

