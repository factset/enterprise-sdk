/*
 * FI API
 * Allow clients to fetch Analytics through APIs.
 *
 * The version of the OpenAPI document: 3.11.0
 * Contact: api@factset.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.factset.sdk.FixedIncomeCalculation.models;

import java.util.Objects;
import java.util.Arrays;
import java.util.Map;
import java.util.HashMap;
import com.factset.sdk.FixedIncomeCalculation.models.FIAttributionForSecurities;
import com.factset.sdk.FixedIncomeCalculation.models.FIBankLoans;
import com.factset.sdk.FixedIncomeCalculation.models.FILoss;
import com.factset.sdk.FixedIncomeCalculation.models.FIMunicipalBonds;
import com.factset.sdk.FixedIncomeCalculation.models.FIPrepay;
import com.factset.sdk.FixedIncomeCalculation.models.FIReferenceSecurity;
import com.factset.sdk.FixedIncomeCalculation.models.FIStructuredProductsForSecurities;
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
import com.factset.sdk.FixedIncomeCalculation.JSON;


/**
 * FISecurity
 */
@JsonPropertyOrder({
  FISecurity.JSON_PROPERTY_SETTLEMENT,
  FISecurity.JSON_PROPERTY_CALL_METHOD,
  FISecurity.JSON_PROPERTY_REFERENCE_SECURITY,
  FISecurity.JSON_PROPERTY_BANK_LOANS,
  FISecurity.JSON_PROPERTY_MUNICIPAL_BONDS,
  FISecurity.JSON_PROPERTY_LOSS,
  FISecurity.JSON_PROPERTY_PREPAY,
  FISecurity.JSON_PROPERTY_MATRIX_SPREAD_ADJUSTMENT,
  FISecurity.JSON_PROPERTY_MATRIX_MULTIPLIER,
  FISecurity.JSON_PROPERTY_STRUCTURED_PRODUCTS,
  FISecurity.JSON_PROPERTY_ATTRIBUTION,
  FISecurity.JSON_PROPERTY_CALC_FROM_METHOD,
  FISecurity.JSON_PROPERTY_CALC_FROM_VALUE,
  FISecurity.JSON_PROPERTY_FACE,
  FISecurity.JSON_PROPERTY_FACE_TYPE,
  FISecurity.JSON_PROPERTY_SYMBOL,
  FISecurity.JSON_PROPERTY_DISCOUNT_CURVE
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")

public class FISecurity implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_SETTLEMENT = "settlement";
  private JsonNullable<String> settlement = JsonNullable.<String>undefined();

  /**
   * Call Method
   */
  public enum CallMethodEnum {
    NO_CALL("No Call"),
    
    INTRINSIC_VALUE("Intrinsic Value"),
    
    FIRST_CALL("First Call"),
    
    FIRST_PAR("First Par");

    private String value;

    CallMethodEnum(String value) {
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
    public static CallMethodEnum fromValue(String value) {
      for (CallMethodEnum b : CallMethodEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      return null;
    }
  }

  public static final String JSON_PROPERTY_CALL_METHOD = "callMethod";
  private JsonNullable<CallMethodEnum> callMethod = JsonNullable.<CallMethodEnum>undefined();

  public static final String JSON_PROPERTY_REFERENCE_SECURITY = "referenceSecurity";
  private FIReferenceSecurity referenceSecurity;

  public static final String JSON_PROPERTY_BANK_LOANS = "bankLoans";
  private FIBankLoans bankLoans;

  public static final String JSON_PROPERTY_MUNICIPAL_BONDS = "municipalBonds";
  private FIMunicipalBonds municipalBonds;

  public static final String JSON_PROPERTY_LOSS = "loss";
  private FILoss loss;

  public static final String JSON_PROPERTY_PREPAY = "prepay";
  private FIPrepay prepay;

  public static final String JSON_PROPERTY_MATRIX_SPREAD_ADJUSTMENT = "matrixSpreadAdjustment";
  private JsonNullable<Double> matrixSpreadAdjustment = JsonNullable.<Double>undefined();

  public static final String JSON_PROPERTY_MATRIX_MULTIPLIER = "matrixMultiplier";
  private JsonNullable<Double> matrixMultiplier = JsonNullable.<Double>undefined();

  public static final String JSON_PROPERTY_STRUCTURED_PRODUCTS = "structuredProducts";
  private FIStructuredProductsForSecurities structuredProducts;

  public static final String JSON_PROPERTY_ATTRIBUTION = "attribution";
  private FIAttributionForSecurities attribution;

  public static final String JSON_PROPERTY_CALC_FROM_METHOD = "calcFromMethod";
  private JsonNullable<String> calcFromMethod = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_CALC_FROM_VALUE = "calcFromValue";
  private Double calcFromValue;

  public static final String JSON_PROPERTY_FACE = "face";
  private JsonNullable<Double> face = JsonNullable.<Double>of(1d);

  /**
   * Face type
   */
  public enum FaceTypeEnum {
    CURRENT("Current"),
    
    ORIGINAL("Original");

    private String value;

    FaceTypeEnum(String value) {
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
    public static FaceTypeEnum fromValue(String value) {
      for (FaceTypeEnum b : FaceTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      return null;
    }
  }

  public static final String JSON_PROPERTY_FACE_TYPE = "faceType";
  private JsonNullable<FaceTypeEnum> faceType = JsonNullable.<FaceTypeEnum>of(FaceTypeEnum.CURRENT);

  public static final String JSON_PROPERTY_SYMBOL = "symbol";
  private String symbol;

  public static final String JSON_PROPERTY_DISCOUNT_CURVE = "discountCurve";
  private JsonNullable<String> discountCurve = JsonNullable.<String>undefined();

  public FISecurity() { 
  }

  @JsonCreator
  public FISecurity(
    @JsonProperty(value=JSON_PROPERTY_CALC_FROM_VALUE, required=true) Double calcFromValue, 
    @JsonProperty(value=JSON_PROPERTY_SYMBOL, required=true) String symbol
  ) {
    this();
    this.calcFromValue = calcFromValue;
    this.symbol = symbol;
  }

  public FISecurity settlement(String settlement) {
    this.settlement = JsonNullable.<String>of(settlement);
    return this;
  }

   /**
   * Settlement date
   * @return settlement
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "Settlement date")
  @JsonIgnore

  public String getSettlement() {
        return settlement.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_SETTLEMENT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getSettlement_JsonNullable() {
    return settlement;
  }
  
  @JsonProperty(JSON_PROPERTY_SETTLEMENT)
  public void setSettlement_JsonNullable(JsonNullable<String> settlement) {
    this.settlement = settlement;
  }

  public void setSettlement(String settlement) {
    this.settlement = JsonNullable.<String>of(settlement);
  }


  public FISecurity callMethod(CallMethodEnum callMethod) {
    this.callMethod = JsonNullable.<CallMethodEnum>of(callMethod);
    return this;
  }

   /**
   * Call Method
   * @return callMethod
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "Call Method")
  @JsonIgnore

  public CallMethodEnum getCallMethod() {
        return callMethod.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_CALL_METHOD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<CallMethodEnum> getCallMethod_JsonNullable() {
    return callMethod;
  }
  
  @JsonProperty(JSON_PROPERTY_CALL_METHOD)
  public void setCallMethod_JsonNullable(JsonNullable<CallMethodEnum> callMethod) {
    this.callMethod = callMethod;
  }

  public void setCallMethod(CallMethodEnum callMethod) {
    this.callMethod = JsonNullable.<CallMethodEnum>of(callMethod);
  }


  public FISecurity referenceSecurity(FIReferenceSecurity referenceSecurity) {
    this.referenceSecurity = referenceSecurity;
    return this;
  }

   /**
   * Get referenceSecurity
   * @return referenceSecurity
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_REFERENCE_SECURITY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public FIReferenceSecurity getReferenceSecurity() {
    return referenceSecurity;
  }


  @JsonProperty(JSON_PROPERTY_REFERENCE_SECURITY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setReferenceSecurity(FIReferenceSecurity referenceSecurity) {
    this.referenceSecurity = referenceSecurity;
  }


  public FISecurity bankLoans(FIBankLoans bankLoans) {
    this.bankLoans = bankLoans;
    return this;
  }

   /**
   * Get bankLoans
   * @return bankLoans
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_BANK_LOANS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public FIBankLoans getBankLoans() {
    return bankLoans;
  }


  @JsonProperty(JSON_PROPERTY_BANK_LOANS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setBankLoans(FIBankLoans bankLoans) {
    this.bankLoans = bankLoans;
  }


  public FISecurity municipalBonds(FIMunicipalBonds municipalBonds) {
    this.municipalBonds = municipalBonds;
    return this;
  }

   /**
   * Get municipalBonds
   * @return municipalBonds
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_MUNICIPAL_BONDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public FIMunicipalBonds getMunicipalBonds() {
    return municipalBonds;
  }


  @JsonProperty(JSON_PROPERTY_MUNICIPAL_BONDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMunicipalBonds(FIMunicipalBonds municipalBonds) {
    this.municipalBonds = municipalBonds;
  }


  public FISecurity loss(FILoss loss) {
    this.loss = loss;
    return this;
  }

   /**
   * Get loss
   * @return loss
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_LOSS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public FILoss getLoss() {
    return loss;
  }


  @JsonProperty(JSON_PROPERTY_LOSS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLoss(FILoss loss) {
    this.loss = loss;
  }


  public FISecurity prepay(FIPrepay prepay) {
    this.prepay = prepay;
    return this;
  }

   /**
   * Get prepay
   * @return prepay
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_PREPAY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public FIPrepay getPrepay() {
    return prepay;
  }


  @JsonProperty(JSON_PROPERTY_PREPAY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPrepay(FIPrepay prepay) {
    this.prepay = prepay;
  }


  public FISecurity matrixSpreadAdjustment(Double matrixSpreadAdjustment) {
    this.matrixSpreadAdjustment = JsonNullable.<Double>of(matrixSpreadAdjustment);
    return this;
  }

   /**
   * Matrix Spread Adjustment
   * @return matrixSpreadAdjustment
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "Matrix Spread Adjustment")
  @JsonIgnore

  public Double getMatrixSpreadAdjustment() {
        return matrixSpreadAdjustment.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_MATRIX_SPREAD_ADJUSTMENT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Double> getMatrixSpreadAdjustment_JsonNullable() {
    return matrixSpreadAdjustment;
  }
  
  @JsonProperty(JSON_PROPERTY_MATRIX_SPREAD_ADJUSTMENT)
  public void setMatrixSpreadAdjustment_JsonNullable(JsonNullable<Double> matrixSpreadAdjustment) {
    this.matrixSpreadAdjustment = matrixSpreadAdjustment;
  }

  public void setMatrixSpreadAdjustment(Double matrixSpreadAdjustment) {
    this.matrixSpreadAdjustment = JsonNullable.<Double>of(matrixSpreadAdjustment);
  }


  public FISecurity matrixMultiplier(Double matrixMultiplier) {
    this.matrixMultiplier = JsonNullable.<Double>of(matrixMultiplier);
    return this;
  }

   /**
   * Matrix Multiplier
   * @return matrixMultiplier
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "Matrix Multiplier")
  @JsonIgnore

  public Double getMatrixMultiplier() {
        return matrixMultiplier.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_MATRIX_MULTIPLIER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Double> getMatrixMultiplier_JsonNullable() {
    return matrixMultiplier;
  }
  
  @JsonProperty(JSON_PROPERTY_MATRIX_MULTIPLIER)
  public void setMatrixMultiplier_JsonNullable(JsonNullable<Double> matrixMultiplier) {
    this.matrixMultiplier = matrixMultiplier;
  }

  public void setMatrixMultiplier(Double matrixMultiplier) {
    this.matrixMultiplier = JsonNullable.<Double>of(matrixMultiplier);
  }


  public FISecurity structuredProducts(FIStructuredProductsForSecurities structuredProducts) {
    this.structuredProducts = structuredProducts;
    return this;
  }

   /**
   * Get structuredProducts
   * @return structuredProducts
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_STRUCTURED_PRODUCTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public FIStructuredProductsForSecurities getStructuredProducts() {
    return structuredProducts;
  }


  @JsonProperty(JSON_PROPERTY_STRUCTURED_PRODUCTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setStructuredProducts(FIStructuredProductsForSecurities structuredProducts) {
    this.structuredProducts = structuredProducts;
  }


  public FISecurity attribution(FIAttributionForSecurities attribution) {
    this.attribution = attribution;
    return this;
  }

   /**
   * Get attribution
   * @return attribution
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_ATTRIBUTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public FIAttributionForSecurities getAttribution() {
    return attribution;
  }


  @JsonProperty(JSON_PROPERTY_ATTRIBUTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAttribution(FIAttributionForSecurities attribution) {
    this.attribution = attribution;
  }


  public FISecurity calcFromMethod(String calcFromMethod) {
    this.calcFromMethod = JsonNullable.<String>of(calcFromMethod);
    return this;
  }

   /**
   * Calculation Method.  Methods : Active Spread, Actual Spread, Actual Spread To Worst Call, OAS, Price, Yield, Yield To No Call, Act/Act Yield To No Call, Bond Equivalent Yield,  Yield To Worst Call, Discount Yield, Discount Margin, Implied Volatility, Bullet Spread, Bullet Spread To Worst Call, Pricing Matrix
   * @return calcFromMethod
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "Calculation Method.  Methods : Active Spread, Actual Spread, Actual Spread To Worst Call, OAS, Price, Yield, Yield To No Call, Act/Act Yield To No Call, Bond Equivalent Yield,  Yield To Worst Call, Discount Yield, Discount Margin, Implied Volatility, Bullet Spread, Bullet Spread To Worst Call, Pricing Matrix")
  @JsonIgnore

  public String getCalcFromMethod() {
        return calcFromMethod.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_CALC_FROM_METHOD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getCalcFromMethod_JsonNullable() {
    return calcFromMethod;
  }
  
  @JsonProperty(JSON_PROPERTY_CALC_FROM_METHOD)
  public void setCalcFromMethod_JsonNullable(JsonNullable<String> calcFromMethod) {
    this.calcFromMethod = calcFromMethod;
  }

  public void setCalcFromMethod(String calcFromMethod) {
    this.calcFromMethod = JsonNullable.<String>of(calcFromMethod);
  }


  public FISecurity calcFromValue(Double calcFromValue) {
    this.calcFromValue = calcFromValue;
    return this;
  }

   /**
   * Calculation from value
   * @return calcFromValue
  **/
  @jakarta.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Calculation from value")
  @JsonProperty(JSON_PROPERTY_CALC_FROM_VALUE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Double getCalcFromValue() {
    return calcFromValue;
  }


  @JsonProperty(JSON_PROPERTY_CALC_FROM_VALUE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setCalcFromValue(Double calcFromValue) {
    this.calcFromValue = calcFromValue;
  }


  public FISecurity face(Double face) {
    this.face = JsonNullable.<Double>of(face);
    return this;
  }

   /**
   * Face
   * @return face
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "Face")
  @JsonIgnore

  public Double getFace() {
        return face.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_FACE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Double> getFace_JsonNullable() {
    return face;
  }
  
  @JsonProperty(JSON_PROPERTY_FACE)
  public void setFace_JsonNullable(JsonNullable<Double> face) {
    this.face = face;
  }

  public void setFace(Double face) {
    this.face = JsonNullable.<Double>of(face);
  }


  public FISecurity faceType(FaceTypeEnum faceType) {
    this.faceType = JsonNullable.<FaceTypeEnum>of(faceType);
    return this;
  }

   /**
   * Face type
   * @return faceType
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "Face type")
  @JsonIgnore

  public FaceTypeEnum getFaceType() {
        return faceType.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_FACE_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<FaceTypeEnum> getFaceType_JsonNullable() {
    return faceType;
  }
  
  @JsonProperty(JSON_PROPERTY_FACE_TYPE)
  public void setFaceType_JsonNullable(JsonNullable<FaceTypeEnum> faceType) {
    this.faceType = faceType;
  }

  public void setFaceType(FaceTypeEnum faceType) {
    this.faceType = JsonNullable.<FaceTypeEnum>of(faceType);
  }


  public FISecurity symbol(String symbol) {
    this.symbol = symbol;
    return this;
  }

   /**
   * Symbol
   * @return symbol
  **/
  @jakarta.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Symbol")
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


  public FISecurity discountCurve(String discountCurve) {
    this.discountCurve = JsonNullable.<String>of(discountCurve);
    return this;
  }

   /**
   * Discount curve
   * @return discountCurve
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "Discount curve")
  @JsonIgnore

  public String getDiscountCurve() {
        return discountCurve.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_DISCOUNT_CURVE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getDiscountCurve_JsonNullable() {
    return discountCurve;
  }
  
  @JsonProperty(JSON_PROPERTY_DISCOUNT_CURVE)
  public void setDiscountCurve_JsonNullable(JsonNullable<String> discountCurve) {
    this.discountCurve = discountCurve;
  }

  public void setDiscountCurve(String discountCurve) {
    this.discountCurve = JsonNullable.<String>of(discountCurve);
  }


  /**
   * Return true if this FISecurity object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FISecurity fiSecurity = (FISecurity) o;
    return equalsNullable(this.settlement, fiSecurity.settlement) &&
        equalsNullable(this.callMethod, fiSecurity.callMethod) &&
        Objects.equals(this.referenceSecurity, fiSecurity.referenceSecurity) &&
        Objects.equals(this.bankLoans, fiSecurity.bankLoans) &&
        Objects.equals(this.municipalBonds, fiSecurity.municipalBonds) &&
        Objects.equals(this.loss, fiSecurity.loss) &&
        Objects.equals(this.prepay, fiSecurity.prepay) &&
        equalsNullable(this.matrixSpreadAdjustment, fiSecurity.matrixSpreadAdjustment) &&
        equalsNullable(this.matrixMultiplier, fiSecurity.matrixMultiplier) &&
        Objects.equals(this.structuredProducts, fiSecurity.structuredProducts) &&
        Objects.equals(this.attribution, fiSecurity.attribution) &&
        equalsNullable(this.calcFromMethod, fiSecurity.calcFromMethod) &&
        Objects.equals(this.calcFromValue, fiSecurity.calcFromValue) &&
        equalsNullable(this.face, fiSecurity.face) &&
        equalsNullable(this.faceType, fiSecurity.faceType) &&
        Objects.equals(this.symbol, fiSecurity.symbol) &&
        equalsNullable(this.discountCurve, fiSecurity.discountCurve);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(hashCodeNullable(settlement), hashCodeNullable(callMethod), referenceSecurity, bankLoans, municipalBonds, loss, prepay, hashCodeNullable(matrixSpreadAdjustment), hashCodeNullable(matrixMultiplier), structuredProducts, attribution, hashCodeNullable(calcFromMethod), calcFromValue, hashCodeNullable(face), hashCodeNullable(faceType), symbol, hashCodeNullable(discountCurve));
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
    sb.append("class FISecurity {\n");
    sb.append("    settlement: ").append(toIndentedString(settlement)).append("\n");
    sb.append("    callMethod: ").append(toIndentedString(callMethod)).append("\n");
    sb.append("    referenceSecurity: ").append(toIndentedString(referenceSecurity)).append("\n");
    sb.append("    bankLoans: ").append(toIndentedString(bankLoans)).append("\n");
    sb.append("    municipalBonds: ").append(toIndentedString(municipalBonds)).append("\n");
    sb.append("    loss: ").append(toIndentedString(loss)).append("\n");
    sb.append("    prepay: ").append(toIndentedString(prepay)).append("\n");
    sb.append("    matrixSpreadAdjustment: ").append(toIndentedString(matrixSpreadAdjustment)).append("\n");
    sb.append("    matrixMultiplier: ").append(toIndentedString(matrixMultiplier)).append("\n");
    sb.append("    structuredProducts: ").append(toIndentedString(structuredProducts)).append("\n");
    sb.append("    attribution: ").append(toIndentedString(attribution)).append("\n");
    sb.append("    calcFromMethod: ").append(toIndentedString(calcFromMethod)).append("\n");
    sb.append("    calcFromValue: ").append(toIndentedString(calcFromValue)).append("\n");
    sb.append("    face: ").append(toIndentedString(face)).append("\n");
    sb.append("    faceType: ").append(toIndentedString(faceType)).append("\n");
    sb.append("    symbol: ").append(toIndentedString(symbol)).append("\n");
    sb.append("    discountCurve: ").append(toIndentedString(discountCurve)).append("\n");
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

