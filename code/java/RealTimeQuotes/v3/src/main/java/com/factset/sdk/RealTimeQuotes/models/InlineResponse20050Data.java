/*
 * Quotes API For Digital Portals
 * The Quotes API combines endpoints for retrieving security end-of-day, delayed, and realtime prices with performance key figures and basic reference data on the security and market level.  The API supports over 20 different price types for each quote and comes with basic search endpoints based on security identifiers and instrument names. Market coverage is included in the *Sample Use Cases* section below.  The Digital Portal use case is focused on high-performance applications that are  * serving millions of end-users, * accessible by client browsers via the internet, * supporting subscriptions for streamed updates out-of-the-box, * typically combining a wide variety of *for Digital Portals*-APIs into a highly use-case specific solution for customers, * integrated into complex infrastructures such as existing frontend frameworks, authentication services.  All APIs labelled *for Digital Portals* have been designed for direct use by client web applications and feature extreme low latency: The average response time across all endpoints is 30 ms whereas 99% of all requests are answered in close to under 300ms.  See the [Time Series API for Digital Portals](https://developer.factset.com/api-catalog/time-series-api-digital-portals) for direct access to price histories, and the [News API for Digital Portals](https://developer.factset.com/api-catalog/news-api-digital-portals) for searching and fetching related news. 
 *
 * The version of the OpenAPI document: 3.0.0
 * Contact: api@factset.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.factset.sdk.RealTimeQuotes.models;

import java.util.Objects;
import java.util.Arrays;
import java.util.Map;
import java.util.HashMap;
import com.factset.sdk.RealTimeQuotes.models.InlineResponse20050DataComponents;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
import org.openapitools.jackson.nullable.JsonNullable;
import com.fasterxml.jackson.annotation.JsonIgnore;
import org.openapitools.jackson.nullable.JsonNullable;
import java.util.NoSuchElementException;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.factset.sdk.RealTimeQuotes.JSON;


/**
 * Composite instrument and its components.
 */
@ApiModel(description = "Composite instrument and its components.")
@JsonPropertyOrder({
  InlineResponse20050Data.JSON_PROPERTY_ID_INSTRUMENT,
  InlineResponse20050Data.JSON_PROPERTY_SOURCE_IDENTIFIER,
  InlineResponse20050Data.JSON_PROPERTY_TYPE_COMPOSITE,
  InlineResponse20050Data.JSON_PROPERTY_ACTIVE_MANAGEMENT,
  InlineResponse20050Data.JSON_PROPERTY_MANAGEMENT_FEE,
  InlineResponse20050Data.JSON_PROPERTY_COMPONENTS
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")

public class InlineResponse20050Data implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_ID_INSTRUMENT = "idInstrument";
  private JsonNullable<String> idInstrument = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_SOURCE_IDENTIFIER = "sourceIdentifier";
  private JsonNullable<String> sourceIdentifier = JsonNullable.<String>undefined();

  /**
   * Type of the composite instrument.
   */
  public enum TypeCompositeEnum {
    BASKET("basket"),
    
    ALPHASTRUCTURE("alphaStructure"),
    
    FUTURESSPREAD("futuresSpread"),
    
    FACTORINDEX("factorIndex");

    private String value;

    TypeCompositeEnum(String value) {
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
    public static TypeCompositeEnum fromValue(String value) {
      for (TypeCompositeEnum b : TypeCompositeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      return null;
    }
  }

  public static final String JSON_PROPERTY_TYPE_COMPOSITE = "typeComposite";
  private JsonNullable<TypeCompositeEnum> typeComposite = JsonNullable.<TypeCompositeEnum>undefined();

  public static final String JSON_PROPERTY_ACTIVE_MANAGEMENT = "activeManagement";
  private JsonNullable<Boolean> activeManagement = JsonNullable.<Boolean>undefined();

  public static final String JSON_PROPERTY_MANAGEMENT_FEE = "managementFee";
  private JsonNullable<BigDecimal> managementFee = JsonNullable.<BigDecimal>undefined();

  public static final String JSON_PROPERTY_COMPONENTS = "components";
  private java.util.List<InlineResponse20050DataComponents> components = null;

  public InlineResponse20050Data() { 
  }

  public InlineResponse20050Data idInstrument(String idInstrument) {
    this.idInstrument = JsonNullable.<String>of(idInstrument);
    return this;
  }

   /**
   * MDG identifier of the instrument.
   * @return idInstrument
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "MDG identifier of the instrument.")
  @JsonIgnore

  public String getIdInstrument() {
        return idInstrument.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_ID_INSTRUMENT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getIdInstrument_JsonNullable() {
    return idInstrument;
  }
  
  @JsonProperty(JSON_PROPERTY_ID_INSTRUMENT)
  public void setIdInstrument_JsonNullable(JsonNullable<String> idInstrument) {
    this.idInstrument = idInstrument;
  }

  public void setIdInstrument(String idInstrument) {
    this.idInstrument = JsonNullable.<String>of(idInstrument);
  }


  public InlineResponse20050Data sourceIdentifier(String sourceIdentifier) {
    this.sourceIdentifier = JsonNullable.<String>of(sourceIdentifier);
    return this;
  }

   /**
   * Identifier used in the request.
   * @return sourceIdentifier
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "Identifier used in the request.")
  @JsonIgnore

  public String getSourceIdentifier() {
        return sourceIdentifier.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_SOURCE_IDENTIFIER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getSourceIdentifier_JsonNullable() {
    return sourceIdentifier;
  }
  
  @JsonProperty(JSON_PROPERTY_SOURCE_IDENTIFIER)
  public void setSourceIdentifier_JsonNullable(JsonNullable<String> sourceIdentifier) {
    this.sourceIdentifier = sourceIdentifier;
  }

  public void setSourceIdentifier(String sourceIdentifier) {
    this.sourceIdentifier = JsonNullable.<String>of(sourceIdentifier);
  }


  public InlineResponse20050Data typeComposite(TypeCompositeEnum typeComposite) {
    this.typeComposite = JsonNullable.<TypeCompositeEnum>of(typeComposite);
    return this;
  }

   /**
   * Type of the composite instrument.
   * @return typeComposite
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "Type of the composite instrument.")
  @JsonIgnore

  public TypeCompositeEnum getTypeComposite() {
        return typeComposite.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_TYPE_COMPOSITE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<TypeCompositeEnum> getTypeComposite_JsonNullable() {
    return typeComposite;
  }
  
  @JsonProperty(JSON_PROPERTY_TYPE_COMPOSITE)
  public void setTypeComposite_JsonNullable(JsonNullable<TypeCompositeEnum> typeComposite) {
    this.typeComposite = typeComposite;
  }

  public void setTypeComposite(TypeCompositeEnum typeComposite) {
    this.typeComposite = JsonNullable.<TypeCompositeEnum>of(typeComposite);
  }


  public InlineResponse20050Data activeManagement(Boolean activeManagement) {
    this.activeManagement = JsonNullable.<Boolean>of(activeManagement);
    return this;
  }

   /**
   * If set to true, the composite instrument is actively managed.
   * @return activeManagement
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "If set to true, the composite instrument is actively managed.")
  @JsonIgnore

  public Boolean getActiveManagement() {
        return activeManagement.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_ACTIVE_MANAGEMENT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Boolean> getActiveManagement_JsonNullable() {
    return activeManagement;
  }
  
  @JsonProperty(JSON_PROPERTY_ACTIVE_MANAGEMENT)
  public void setActiveManagement_JsonNullable(JsonNullable<Boolean> activeManagement) {
    this.activeManagement = activeManagement;
  }

  public void setActiveManagement(Boolean activeManagement) {
    this.activeManagement = JsonNullable.<Boolean>of(activeManagement);
  }


  public InlineResponse20050Data managementFee(BigDecimal managementFee) {
    this.managementFee = JsonNullable.<BigDecimal>of(managementFee);
    return this;
  }

   /**
   * Management fee p.a. of the composite instrument.
   * @return managementFee
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "Management fee p.a. of the composite instrument.")
  @JsonIgnore

  public BigDecimal getManagementFee() {
        return managementFee.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_MANAGEMENT_FEE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<BigDecimal> getManagementFee_JsonNullable() {
    return managementFee;
  }
  
  @JsonProperty(JSON_PROPERTY_MANAGEMENT_FEE)
  public void setManagementFee_JsonNullable(JsonNullable<BigDecimal> managementFee) {
    this.managementFee = managementFee;
  }

  public void setManagementFee(BigDecimal managementFee) {
    this.managementFee = JsonNullable.<BigDecimal>of(managementFee);
  }


  public InlineResponse20050Data components(java.util.List<InlineResponse20050DataComponents> components) {
    this.components = components;
    return this;
  }

  public InlineResponse20050Data addComponentsItem(InlineResponse20050DataComponents componentsItem) {
    if (this.components == null) {
      this.components = new java.util.ArrayList<>();
    }
    this.components.add(componentsItem);
    return this;
  }

   /**
   * Information regarding the components of the composite instrument.
   * @return components
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "Information regarding the components of the composite instrument.")
  @JsonProperty(JSON_PROPERTY_COMPONENTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public java.util.List<InlineResponse20050DataComponents> getComponents() {
    return components;
  }


  @JsonProperty(JSON_PROPERTY_COMPONENTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setComponents(java.util.List<InlineResponse20050DataComponents> components) {
    this.components = components;
  }


  /**
   * Return true if this inline_response_200_50_data object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse20050Data inlineResponse20050Data = (InlineResponse20050Data) o;
    return equalsNullable(this.idInstrument, inlineResponse20050Data.idInstrument) &&
        equalsNullable(this.sourceIdentifier, inlineResponse20050Data.sourceIdentifier) &&
        equalsNullable(this.typeComposite, inlineResponse20050Data.typeComposite) &&
        equalsNullable(this.activeManagement, inlineResponse20050Data.activeManagement) &&
        equalsNullable(this.managementFee, inlineResponse20050Data.managementFee) &&
        Objects.equals(this.components, inlineResponse20050Data.components);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(hashCodeNullable(idInstrument), hashCodeNullable(sourceIdentifier), hashCodeNullable(typeComposite), hashCodeNullable(activeManagement), hashCodeNullable(managementFee), components);
  }

  private static <T> int hashCodeNullable(JsonNullable<T> a) {
    if (a == null) {
      return 1;
    }
    return a.isPresent() ? Arrays.deepHashCode(new Object[]{a.get()}) : 31;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse20050Data {\n");
    sb.append("    idInstrument: ").append(toIndentedString(idInstrument)).append("\n");
    sb.append("    sourceIdentifier: ").append(toIndentedString(sourceIdentifier)).append("\n");
    sb.append("    typeComposite: ").append(toIndentedString(typeComposite)).append("\n");
    sb.append("    activeManagement: ").append(toIndentedString(activeManagement)).append("\n");
    sb.append("    managementFee: ").append(toIndentedString(managementFee)).append("\n");
    sb.append("    components: ").append(toIndentedString(components)).append("\n");
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

