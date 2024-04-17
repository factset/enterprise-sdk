/*
 * Exchange DataFeed Data Model API
 * FactSet’s Exchange DataFeed products provide access to consolidated real-time and delayed global exchange data. Proprietary technology normalizes over 250 global venues, 18+ million instruments, and 150+ data fields. Asset types integrated include equities, futures, options, warrants, fixed income, mutual funds, ETFs, indices, commodities, and FX rates. Innovative technology ensures reliability and provides scalability that allows clients to make requests based on a symbol list or an exchange. Reduce development time by powering proprietary and third-party applications with exchange data from a unified data model. <p>The Exchange DataFeed Data Model API provides mappings for enumerations used in our Real-Time DataFeed products and should be used in conjunction with the DataFeed Data Model documentation available for each product. <p>The initial beta version of this API is limited to include mapping tables for the product codes only.
 *
 * The version of the OpenAPI document: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.factset.sdk.ExchangeDataFeedDataModel.models;

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
import com.factset.sdk.ExchangeDataFeedDataModel.JSON;


/**
 * sample response
 */
@ApiModel(description = "sample response")
@JsonPropertyOrder({
  RTDataModelProducts.JSON_PROPERTY_PRODUCT_CODE,
  RTDataModelProducts.JSON_PROPERTY_DESCRIPTION
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")

public class RTDataModelProducts implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_PRODUCT_CODE = "product_code";
  private Integer productCode;

  public static final String JSON_PROPERTY_DESCRIPTION = "description";
  private String description;

  public RTDataModelProducts() { 
  }

  public RTDataModelProducts productCode(Integer productCode) {
    this.productCode = productCode;
    return this;
  }

   /**
   * FactSet product code
   * @return productCode
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "9001", value = "FactSet product code")
  @JsonProperty(JSON_PROPERTY_PRODUCT_CODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getProductCode() {
    return productCode;
  }


  @JsonProperty(JSON_PROPERTY_PRODUCT_CODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setProductCode(Integer productCode) {
    this.productCode = productCode;
  }


  public RTDataModelProducts description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Product description
   * @return description
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "New York Stock Exchange Level 1", value = "Product description")
  @JsonProperty(JSON_PROPERTY_DESCRIPTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getDescription() {
    return description;
  }


  @JsonProperty(JSON_PROPERTY_DESCRIPTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDescription(String description) {
    this.description = description;
  }


  /**
   * Return true if this RTDataModel_Products object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RTDataModelProducts rtDataModelProducts = (RTDataModelProducts) o;
    return Objects.equals(this.productCode, rtDataModelProducts.productCode) &&
        Objects.equals(this.description, rtDataModelProducts.description);
  }

  @Override
  public int hashCode() {
    return Objects.hash(productCode, description);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RTDataModelProducts {\n");
    sb.append("    productCode: ").append(toIndentedString(productCode)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
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

