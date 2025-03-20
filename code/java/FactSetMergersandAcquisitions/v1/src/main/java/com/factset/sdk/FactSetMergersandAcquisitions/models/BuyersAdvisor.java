/*
 * FactSet Mergers and Acquisitions API
 * The FactSet Mergers and Acquisitions API provides access to key transactions and pricing metrics on over 60,000 globally traded deals. Reference a Global Universe of Mergers and Acquisitions (M&A) transactions where the target of the deal is a Publicly traded Company. Review premiums, multiples and fundamental data to gather insights on deals and create predictive models based on different deal characteristics.    Monetary values returned by this API are converted and represented in USD.    This API is allows a limit of 10 requests per second and a maximum of 10 concurrent requests. 
 *
 * The version of the OpenAPI document: 1.1.0
 * Contact: api@factset.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.factset.sdk.FactSetMergersandAcquisitions.models;

import java.util.Objects;
import java.util.Arrays;
import java.util.Map;
import java.util.HashMap;
import com.factset.sdk.FactSetMergersandAcquisitions.models.AdvisorParticipant;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.factset.sdk.FactSetMergersandAcquisitions.JSON;


/**
 * Buyers Advisor Object
 */
@ApiModel(description = "Buyers Advisor Object")
@JsonPropertyOrder({
  BuyersAdvisor.JSON_PROPERTY_FINANCIAL,
  BuyersAdvisor.JSON_PROPERTY_LEGAL
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")

public class BuyersAdvisor implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_FINANCIAL = "financial";
  private java.util.List<AdvisorParticipant> financial = null;

  public static final String JSON_PROPERTY_LEGAL = "legal";
  private java.util.List<AdvisorParticipant> legal = null;

  public BuyersAdvisor() { 
  }

  public BuyersAdvisor financial(java.util.List<AdvisorParticipant> financial) {
    this.financial = financial;
    return this;
  }

  public BuyersAdvisor addFinancialItem(AdvisorParticipant financialItem) {
    if (this.financial == null) {
      this.financial = new java.util.ArrayList<>();
    }
    this.financial.add(financialItem);
    return this;
  }

   /**
   * Get financial
   * @return financial
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_FINANCIAL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public java.util.List<AdvisorParticipant> getFinancial() {
    return financial;
  }


  @JsonProperty(JSON_PROPERTY_FINANCIAL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFinancial(java.util.List<AdvisorParticipant> financial) {
    this.financial = financial;
  }


  public BuyersAdvisor legal(java.util.List<AdvisorParticipant> legal) {
    this.legal = legal;
    return this;
  }

  public BuyersAdvisor addLegalItem(AdvisorParticipant legalItem) {
    if (this.legal == null) {
      this.legal = new java.util.ArrayList<>();
    }
    this.legal.add(legalItem);
    return this;
  }

   /**
   * Get legal
   * @return legal
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_LEGAL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public java.util.List<AdvisorParticipant> getLegal() {
    return legal;
  }


  @JsonProperty(JSON_PROPERTY_LEGAL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLegal(java.util.List<AdvisorParticipant> legal) {
    this.legal = legal;
  }


  /**
   * Return true if this BuyersAdvisor object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BuyersAdvisor buyersAdvisor = (BuyersAdvisor) o;
    return Objects.equals(this.financial, buyersAdvisor.financial) &&
        Objects.equals(this.legal, buyersAdvisor.legal);
  }

  @Override
  public int hashCode() {
    return Objects.hash(financial, legal);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BuyersAdvisor {\n");
    sb.append("    financial: ").append(toIndentedString(financial)).append("\n");
    sb.append("    legal: ").append(toIndentedString(legal)).append("\n");
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

