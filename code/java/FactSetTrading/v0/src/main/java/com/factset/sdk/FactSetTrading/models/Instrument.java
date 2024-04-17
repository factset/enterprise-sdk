/*
 * EMS API
 * Allow clients to trade orders.
 *
 * The version of the OpenAPI document: 0.3.0
 * Contact: api@factset.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.factset.sdk.FactSetTrading.models;

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
import org.openapitools.jackson.nullable.JsonNullable;
import com.fasterxml.jackson.annotation.JsonIgnore;
import org.openapitools.jackson.nullable.JsonNullable;
import java.util.NoSuchElementException;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.factset.sdk.FactSetTrading.JSON;


/**
 * Instrument
 */
@ApiModel(description = "Instrument")
@JsonPropertyOrder({
  Instrument.JSON_PROPERTY_SYMBOL,
  Instrument.JSON_PROPERTY_SECURITY_TYPE,
  Instrument.JSON_PROPERTY_CFI_CODE,
  Instrument.JSON_PROPERTY_SECURITY_EXCHANGE,
  Instrument.JSON_PROPERTY_ISSUER,
  Instrument.JSON_PROPERTY_SECURITY_DESCRIPTION,
  Instrument.JSON_PROPERTY_MATURITY_MONTH_YEAR,
  Instrument.JSON_PROPERTY_MATURITY_DAY,
  Instrument.JSON_PROPERTY_PUT_OR_CALL,
  Instrument.JSON_PROPERTY_UNDERLYING_SECURITY_TYPE
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")

public class Instrument implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_SYMBOL = "symbol";
  private String symbol;

  public static final String JSON_PROPERTY_SECURITY_TYPE = "securityType";
  private JsonNullable<String> securityType = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_CFI_CODE = "cfiCode";
  private JsonNullable<String> cfiCode = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_SECURITY_EXCHANGE = "securityExchange";
  private JsonNullable<String> securityExchange = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_ISSUER = "issuer";
  private JsonNullable<String> issuer = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_SECURITY_DESCRIPTION = "securityDescription";
  private JsonNullable<String> securityDescription = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_MATURITY_MONTH_YEAR = "maturityMonthYear";
  private JsonNullable<String> maturityMonthYear = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_MATURITY_DAY = "maturityDay";
  private JsonNullable<String> maturityDay = JsonNullable.<String>undefined();

  /**
   * Indicates whether an Option is for a put or call.
   */
  public enum PutOrCallEnum {
    PUT("put"),
    
    CALL("call");

    private String value;

    PutOrCallEnum(String value) {
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
    public static PutOrCallEnum fromValue(String value) {
      for (PutOrCallEnum b : PutOrCallEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      return null;
    }
  }

  public static final String JSON_PROPERTY_PUT_OR_CALL = "putOrCall";
  private JsonNullable<PutOrCallEnum> putOrCall = JsonNullable.<PutOrCallEnum>undefined();

  public static final String JSON_PROPERTY_UNDERLYING_SECURITY_TYPE = "underlyingSecurityType";
  private JsonNullable<String> underlyingSecurityType = JsonNullable.<String>undefined();

  public Instrument() { 
  }

  @JsonCreator
  public Instrument(
    @JsonProperty(value=JSON_PROPERTY_SYMBOL, required=true) String symbol
  ) {
    this();
    this.symbol = symbol;
  }

  public Instrument symbol(String symbol) {
    this.symbol = symbol;
    return this;
  }

   /**
   * Ticker symbol
   * @return symbol
  **/
  @jakarta.annotation.Nonnull
  @ApiModelProperty(example = "TATAMOTORS", required = true, value = "Ticker symbol")
  @JsonProperty(JSON_PROPERTY_SYMBOL)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getSymbol() {
    return symbol;
  }


  @JsonProperty(JSON_PROPERTY_SYMBOL)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setSymbol(String symbol) {
    this.symbol = symbol;
  }


  public Instrument securityType(String securityType) {
    this.securityType = JsonNullable.<String>of(securityType);
    return this;
  }

   /**
   * Indicates type of security.
   * @return securityType
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "Indicates type of security.")
  @JsonIgnore

  public String getSecurityType() {
        return securityType.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_SECURITY_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getSecurityType_JsonNullable() {
    return securityType;
  }
  
  @JsonProperty(JSON_PROPERTY_SECURITY_TYPE)
  public void setSecurityType_JsonNullable(JsonNullable<String> securityType) {
    this.securityType = securityType;
  }

  public void setSecurityType(String securityType) {
    this.securityType = JsonNullable.<String>of(securityType);
  }


  public Instrument cfiCode(String cfiCode) {
    this.cfiCode = JsonNullable.<String>of(cfiCode);
    return this;
  }

   /**
   * Classification of Financial Instruments. Indicates the type of security using ISO 0962 standard.
   * @return cfiCode
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "Classification of Financial Instruments. Indicates the type of security using ISO 0962 standard.")
  @JsonIgnore

  public String getCfiCode() {
        return cfiCode.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_CFI_CODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getCfiCode_JsonNullable() {
    return cfiCode;
  }
  
  @JsonProperty(JSON_PROPERTY_CFI_CODE)
  public void setCfiCode_JsonNullable(JsonNullable<String> cfiCode) {
    this.cfiCode = cfiCode;
  }

  public void setCfiCode(String cfiCode) {
    this.cfiCode = JsonNullable.<String>of(cfiCode);
  }


  public Instrument securityExchange(String securityExchange) {
    this.securityExchange = JsonNullable.<String>of(securityExchange);
    return this;
  }

   /**
   * Market used to help identify a security.
   * @return securityExchange
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "Market used to help identify a security.")
  @JsonIgnore

  public String getSecurityExchange() {
        return securityExchange.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_SECURITY_EXCHANGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getSecurityExchange_JsonNullable() {
    return securityExchange;
  }
  
  @JsonProperty(JSON_PROPERTY_SECURITY_EXCHANGE)
  public void setSecurityExchange_JsonNullable(JsonNullable<String> securityExchange) {
    this.securityExchange = securityExchange;
  }

  public void setSecurityExchange(String securityExchange) {
    this.securityExchange = JsonNullable.<String>of(securityExchange);
  }


  public Instrument issuer(String issuer) {
    this.issuer = JsonNullable.<String>of(issuer);
    return this;
  }

   /**
   * Company name of security issuer.
   * @return issuer
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "Company name of security issuer.")
  @JsonIgnore

  public String getIssuer() {
        return issuer.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_ISSUER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getIssuer_JsonNullable() {
    return issuer;
  }
  
  @JsonProperty(JSON_PROPERTY_ISSUER)
  public void setIssuer_JsonNullable(JsonNullable<String> issuer) {
    this.issuer = issuer;
  }

  public void setIssuer(String issuer) {
    this.issuer = JsonNullable.<String>of(issuer);
  }


  public Instrument securityDescription(String securityDescription) {
    this.securityDescription = JsonNullable.<String>of(securityDescription);
    return this;
  }

   /**
   * Security Description
   * @return securityDescription
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "Security Description")
  @JsonIgnore

  public String getSecurityDescription() {
        return securityDescription.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_SECURITY_DESCRIPTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getSecurityDescription_JsonNullable() {
    return securityDescription;
  }
  
  @JsonProperty(JSON_PROPERTY_SECURITY_DESCRIPTION)
  public void setSecurityDescription_JsonNullable(JsonNullable<String> securityDescription) {
    this.securityDescription = securityDescription;
  }

  public void setSecurityDescription(String securityDescription) {
    this.securityDescription = JsonNullable.<String>of(securityDescription);
  }


  public Instrument maturityMonthYear(String maturityMonthYear) {
    this.maturityMonthYear = JsonNullable.<String>of(maturityMonthYear);
    return this;
  }

   /**
   * Month and Year of the maturity.
   * @return maturityMonthYear
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "Month and Year of the maturity.")
  @JsonIgnore

  public String getMaturityMonthYear() {
        return maturityMonthYear.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_MATURITY_MONTH_YEAR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getMaturityMonthYear_JsonNullable() {
    return maturityMonthYear;
  }
  
  @JsonProperty(JSON_PROPERTY_MATURITY_MONTH_YEAR)
  public void setMaturityMonthYear_JsonNullable(JsonNullable<String> maturityMonthYear) {
    this.maturityMonthYear = maturityMonthYear;
  }

  public void setMaturityMonthYear(String maturityMonthYear) {
    this.maturityMonthYear = JsonNullable.<String>of(maturityMonthYear);
  }


  public Instrument maturityDay(String maturityDay) {
    this.maturityDay = JsonNullable.<String>of(maturityDay);
    return this;
  }

   /**
   * Day of month used in conjunction with maturityMonthYear to specify the maturity date
   * @return maturityDay
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "Day of month used in conjunction with maturityMonthYear to specify the maturity date")
  @JsonIgnore

  public String getMaturityDay() {
        return maturityDay.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_MATURITY_DAY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getMaturityDay_JsonNullable() {
    return maturityDay;
  }
  
  @JsonProperty(JSON_PROPERTY_MATURITY_DAY)
  public void setMaturityDay_JsonNullable(JsonNullable<String> maturityDay) {
    this.maturityDay = maturityDay;
  }

  public void setMaturityDay(String maturityDay) {
    this.maturityDay = JsonNullable.<String>of(maturityDay);
  }


  public Instrument putOrCall(PutOrCallEnum putOrCall) {
    this.putOrCall = JsonNullable.<PutOrCallEnum>of(putOrCall);
    return this;
  }

   /**
   * Indicates whether an Option is for a put or call.
   * @return putOrCall
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "Indicates whether an Option is for a put or call.")
  @JsonIgnore

  public PutOrCallEnum getPutOrCall() {
        return putOrCall.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_PUT_OR_CALL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<PutOrCallEnum> getPutOrCall_JsonNullable() {
    return putOrCall;
  }
  
  @JsonProperty(JSON_PROPERTY_PUT_OR_CALL)
  public void setPutOrCall_JsonNullable(JsonNullable<PutOrCallEnum> putOrCall) {
    this.putOrCall = putOrCall;
  }

  public void setPutOrCall(PutOrCallEnum putOrCall) {
    this.putOrCall = JsonNullable.<PutOrCallEnum>of(putOrCall);
  }


  public Instrument underlyingSecurityType(String underlyingSecurityType) {
    this.underlyingSecurityType = JsonNullable.<String>of(underlyingSecurityType);
    return this;
  }

   /**
   * Underlying security’s SecurityType.
   * @return underlyingSecurityType
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "Underlying security’s SecurityType.")
  @JsonIgnore

  public String getUnderlyingSecurityType() {
        return underlyingSecurityType.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_UNDERLYING_SECURITY_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getUnderlyingSecurityType_JsonNullable() {
    return underlyingSecurityType;
  }
  
  @JsonProperty(JSON_PROPERTY_UNDERLYING_SECURITY_TYPE)
  public void setUnderlyingSecurityType_JsonNullable(JsonNullable<String> underlyingSecurityType) {
    this.underlyingSecurityType = underlyingSecurityType;
  }

  public void setUnderlyingSecurityType(String underlyingSecurityType) {
    this.underlyingSecurityType = JsonNullable.<String>of(underlyingSecurityType);
  }


  /**
   * Return true if this Instrument object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Instrument instrument = (Instrument) o;
    return Objects.equals(this.symbol, instrument.symbol) &&
        equalsNullable(this.securityType, instrument.securityType) &&
        equalsNullable(this.cfiCode, instrument.cfiCode) &&
        equalsNullable(this.securityExchange, instrument.securityExchange) &&
        equalsNullable(this.issuer, instrument.issuer) &&
        equalsNullable(this.securityDescription, instrument.securityDescription) &&
        equalsNullable(this.maturityMonthYear, instrument.maturityMonthYear) &&
        equalsNullable(this.maturityDay, instrument.maturityDay) &&
        equalsNullable(this.putOrCall, instrument.putOrCall) &&
        equalsNullable(this.underlyingSecurityType, instrument.underlyingSecurityType);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(symbol, hashCodeNullable(securityType), hashCodeNullable(cfiCode), hashCodeNullable(securityExchange), hashCodeNullable(issuer), hashCodeNullable(securityDescription), hashCodeNullable(maturityMonthYear), hashCodeNullable(maturityDay), hashCodeNullable(putOrCall), hashCodeNullable(underlyingSecurityType));
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
    sb.append("class Instrument {\n");
    sb.append("    symbol: ").append(toIndentedString(symbol)).append("\n");
    sb.append("    securityType: ").append(toIndentedString(securityType)).append("\n");
    sb.append("    cfiCode: ").append(toIndentedString(cfiCode)).append("\n");
    sb.append("    securityExchange: ").append(toIndentedString(securityExchange)).append("\n");
    sb.append("    issuer: ").append(toIndentedString(issuer)).append("\n");
    sb.append("    securityDescription: ").append(toIndentedString(securityDescription)).append("\n");
    sb.append("    maturityMonthYear: ").append(toIndentedString(maturityMonthYear)).append("\n");
    sb.append("    maturityDay: ").append(toIndentedString(maturityDay)).append("\n");
    sb.append("    putOrCall: ").append(toIndentedString(putOrCall)).append("\n");
    sb.append("    underlyingSecurityType: ").append(toIndentedString(underlyingSecurityType)).append("\n");
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

