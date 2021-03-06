/*
 * Funds API For Digital Portals
 * Search for mutual funds and ETFs using one single consolidated API, including a criteria-based screener. The API provides also base data, key figures, and holdings.  A separate endpoint returns the possible values and value range for the parameters that the endpoint /fund/notation/screener/search accepts: Application developers can request the values and value range only for a restricted set of notations that match predefined parameters. This functionality may be used to pre-fill the values and value ranges of the parameters of the /fund/notation/screener/search endpoint so that performing a search always leads to a non-empty set of notations.  This API is fully integrated with the corresponding Quotes API, allowing access to detailed price and performance information of instruments, as well as basic security identifier cross-reference. For direct access to price histories, please refer to the Time Series API for Digital Portals.  Similar criteria based screener APIs exist for equity instruments and securitized derivatives: See the Stocks API and the Securitized Derivatives API for details.
 *
 * The version of the OpenAPI document: 2
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.factset.sdk.FundsAPIforDigitalPortals.models;

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
import java.math.BigDecimal;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.factset.sdk.FundsAPIforDigitalPortals.JSON;


/**
 * InlineResponse2006DataLegalEntitiesManagement
 */
@JsonPropertyOrder({
  InlineResponse2006DataLegalEntitiesManagement.JSON_PROPERTY_ID,
  InlineResponse2006DataLegalEntitiesManagement.JSON_PROPERTY_NAME,
  InlineResponse2006DataLegalEntitiesManagement.JSON_PROPERTY_IS_LEAD
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class InlineResponse2006DataLegalEntitiesManagement implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_ID = "id";
  private BigDecimal id;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_IS_LEAD = "isLead";
  private Boolean isLead;

  public InlineResponse2006DataLegalEntitiesManagement() { 
  }

  public InlineResponse2006DataLegalEntitiesManagement id(BigDecimal id) {
    this.id = id;
    return this;
  }

   /**
   * Identifier of a manager. 
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Identifier of a manager. ")
  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BigDecimal getId() {
    return id;
  }


  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setId(BigDecimal id) {
    this.id = id;
  }


  public InlineResponse2006DataLegalEntitiesManagement name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Name of the manager.
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Name of the manager.")
  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getName() {
    return name;
  }


  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setName(String name) {
    this.name = name;
  }


  public InlineResponse2006DataLegalEntitiesManagement isLead(Boolean isLead) {
    this.isLead = isLead;
    return this;
  }

   /**
   * If true, the manager is a lead manager of the fund. There is no limitation to the number of lead managers per fund.
   * @return isLead
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "If true, the manager is a lead manager of the fund. There is no limitation to the number of lead managers per fund.")
  @JsonProperty(JSON_PROPERTY_IS_LEAD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getIsLead() {
    return isLead;
  }


  @JsonProperty(JSON_PROPERTY_IS_LEAD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIsLead(Boolean isLead) {
    this.isLead = isLead;
  }


  /**
   * Return true if this inline_response_200_6_data_legalEntities_management object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse2006DataLegalEntitiesManagement inlineResponse2006DataLegalEntitiesManagement = (InlineResponse2006DataLegalEntitiesManagement) o;
    return Objects.equals(this.id, inlineResponse2006DataLegalEntitiesManagement.id) &&
        Objects.equals(this.name, inlineResponse2006DataLegalEntitiesManagement.name) &&
        Objects.equals(this.isLead, inlineResponse2006DataLegalEntitiesManagement.isLead);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, isLead);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse2006DataLegalEntitiesManagement {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    isLead: ").append(toIndentedString(isLead)).append("\n");
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

