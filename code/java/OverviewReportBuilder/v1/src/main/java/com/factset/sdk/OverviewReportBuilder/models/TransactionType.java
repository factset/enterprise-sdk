/*
 * FactSet Overview Report Builder API
 * Get relevant industry-specific data for high level analysis of public and private companies
 *
 * The version of the OpenAPI document: 1.2.0
 * Contact: api@factset.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.factset.sdk.OverviewReportBuilder.models;

import java.util.Objects;
import java.util.Arrays;
import java.util.Map;
import java.util.HashMap;
import com.factset.sdk.OverviewReportBuilder.models.TransactionTypeTransactionType;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.factset.sdk.OverviewReportBuilder.JSON;


/**
 * TransactionType
 */
@JsonPropertyOrder({
  TransactionType.JSON_PROPERTY_TRANSACTION_TYPE
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")

public class TransactionType implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_TRANSACTION_TYPE = "transactionType";
  private TransactionTypeTransactionType transactionType;

  public TransactionType() { 
  }

  public TransactionType transactionType(TransactionTypeTransactionType transactionType) {
    this.transactionType = transactionType;
    return this;
  }

   /**
   * Get transactionType
   * @return transactionType
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_TRANSACTION_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public TransactionTypeTransactionType getTransactionType() {
    return transactionType;
  }


  @JsonProperty(JSON_PROPERTY_TRANSACTION_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTransactionType(TransactionTypeTransactionType transactionType) {
    this.transactionType = transactionType;
  }


  /**
   * Return true if this transactionType object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TransactionType transactionType = (TransactionType) o;
    return Objects.equals(this.transactionType, transactionType.transactionType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(transactionType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TransactionType {\n");
    sb.append("    transactionType: ").append(toIndentedString(transactionType)).append("\n");
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

