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
 * CountryID
 */
@JsonPropertyOrder({
  CountryID.JSON_PROPERTY_I_S_O_A_L_P_H_A2
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")

public class CountryID implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_I_S_O_A_L_P_H_A2 = "ISOALPHA2";
  private String ISOALPHA2;

  public CountryID() { 
  }

  public CountryID ISOALPHA2(String ISOALPHA2) {
    this.ISOALPHA2 = ISOALPHA2;
    return this;
  }

   /**
   * Get ISOALPHA2
   * @return ISOALPHA2
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_I_S_O_A_L_P_H_A2)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getISOALPHA2() {
    return ISOALPHA2;
  }


  @JsonProperty(JSON_PROPERTY_I_S_O_A_L_P_H_A2)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setISOALPHA2(String ISOALPHA2) {
    this.ISOALPHA2 = ISOALPHA2;
  }


  /**
   * Return true if this CountryID object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CountryID countryID = (CountryID) o;
    return Objects.equals(this.ISOALPHA2, countryID.ISOALPHA2);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ISOALPHA2);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CountryID {\n");
    sb.append("    ISOALPHA2: ").append(toIndentedString(ISOALPHA2)).append("\n");
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

