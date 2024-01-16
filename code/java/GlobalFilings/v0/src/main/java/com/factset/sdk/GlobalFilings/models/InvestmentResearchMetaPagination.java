/*
 * Global Filings API
 * The Filings API provides a comprehensive set of functionalities for searching and retrieving filing documents from various sources.  This API is designed to expose document search and document retrieval functionality. A document search will allow a request to query FactSet’s document databases based on certain search criteria specified in the request.  In addition, a document count request will provide information on the number of stories available for a particular security.  Helper endpoint will provide dynamic information on the parameters of a document request. .
 *
 * The version of the OpenAPI document: 0.0.0
 * Contact: api@factset.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.factset.sdk.GlobalFilings.models;

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
import com.factset.sdk.GlobalFilings.JSON;


/**
 * Pagination Object
 */
@ApiModel(description = "Pagination Object")
@JsonPropertyOrder({
  InvestmentResearchMetaPagination.JSON_PROPERTY_IS_ESTIMATED_TOTAL
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class InvestmentResearchMetaPagination implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_IS_ESTIMATED_TOTAL = "isEstimatedTotal";
  private Boolean isEstimatedTotal;

  public InvestmentResearchMetaPagination() { 
  }

  public InvestmentResearchMetaPagination isEstimatedTotal(Boolean isEstimatedTotal) {
    this.isEstimatedTotal = isEstimatedTotal;
    return this;
  }

   /**
   * This field acts as a flag for the exact count of results and is defaulted to false as the API should always return the exact count of results.
   * @return isEstimatedTotal
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "This field acts as a flag for the exact count of results and is defaulted to false as the API should always return the exact count of results.")
  @JsonProperty(JSON_PROPERTY_IS_ESTIMATED_TOTAL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getIsEstimatedTotal() {
    return isEstimatedTotal;
  }


  @JsonProperty(JSON_PROPERTY_IS_ESTIMATED_TOTAL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIsEstimatedTotal(Boolean isEstimatedTotal) {
    this.isEstimatedTotal = isEstimatedTotal;
  }


  /**
   * Return true if this InvestmentResearch_meta_pagination object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InvestmentResearchMetaPagination investmentResearchMetaPagination = (InvestmentResearchMetaPagination) o;
    return Objects.equals(this.isEstimatedTotal, investmentResearchMetaPagination.isEstimatedTotal);
  }

  @Override
  public int hashCode() {
    return Objects.hash(isEstimatedTotal);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InvestmentResearchMetaPagination {\n");
    sb.append("    isEstimatedTotal: ").append(toIndentedString(isEstimatedTotal)).append("\n");
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

