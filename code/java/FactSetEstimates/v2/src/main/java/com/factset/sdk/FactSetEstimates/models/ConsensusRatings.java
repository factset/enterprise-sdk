/*
 * FactSet Estimates
 * Gain access to 20+ years of comprehensive estimates and statistics of over 250+ estimated metrics, including financial statement items, product segments, geosegments, and industry metrics. FactSet's consensus estimates are aggregated from a wide base of over 800+ contributors and cover over 19,000 active companies across 90+ countries. Data returned can be accessed on the data frequencies based on quarterly, fiscal years, and calendar years. FactSet Estimates updates on a real time basis intraday (every 5 minutes). Updating times vary based on earning season vs. non-earning season but the goal is to have the data available to the client within a few hours that FactSet receives updated information. Often times updates times can be much faster as FactSet has always been known as one of the fastest estimate providers in the market. 
 *
 * The version of the OpenAPI document: 2.5.0
 * Contact: api@factset.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.factset.sdk.FactSetEstimates.models;

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
import java.time.LocalDate;
import org.openapitools.jackson.nullable.JsonNullable;
import com.fasterxml.jackson.annotation.JsonIgnore;
import org.openapitools.jackson.nullable.JsonNullable;
import java.util.NoSuchElementException;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.factset.sdk.FactSetEstimates.JSON;


/**
 * ConsensusRatings
 */
@JsonPropertyOrder({
  ConsensusRatings.JSON_PROPERTY_FSYM_ID,
  ConsensusRatings.JSON_PROPERTY_ESTIMATE_DATE,
  ConsensusRatings.JSON_PROPERTY_BUY_COUNT,
  ConsensusRatings.JSON_PROPERTY_OVERWEIGHT_COUNT,
  ConsensusRatings.JSON_PROPERTY_HOLD_COUNT,
  ConsensusRatings.JSON_PROPERTY_UNDERWEIGHT_COUNT,
  ConsensusRatings.JSON_PROPERTY_SELL_COUNT,
  ConsensusRatings.JSON_PROPERTY_RATINGS_NEST_TOTAL,
  ConsensusRatings.JSON_PROPERTY_RATINGS_NOTE,
  ConsensusRatings.JSON_PROPERTY_RATINGS_NOTE_TEXT,
  ConsensusRatings.JSON_PROPERTY_REQUEST_ID
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")

public class ConsensusRatings implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_FSYM_ID = "fsymId";
  private JsonNullable<String> fsymId = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_ESTIMATE_DATE = "estimateDate";
  private JsonNullable<LocalDate> estimateDate = JsonNullable.<LocalDate>undefined();

  public static final String JSON_PROPERTY_BUY_COUNT = "buyCount";
  private JsonNullable<Integer> buyCount = JsonNullable.<Integer>undefined();

  public static final String JSON_PROPERTY_OVERWEIGHT_COUNT = "overweightCount";
  private JsonNullable<Integer> overweightCount = JsonNullable.<Integer>undefined();

  public static final String JSON_PROPERTY_HOLD_COUNT = "holdCount";
  private JsonNullable<Integer> holdCount = JsonNullable.<Integer>undefined();

  public static final String JSON_PROPERTY_UNDERWEIGHT_COUNT = "underweightCount";
  private JsonNullable<Integer> underweightCount = JsonNullable.<Integer>undefined();

  public static final String JSON_PROPERTY_SELL_COUNT = "sellCount";
  private JsonNullable<Integer> sellCount = JsonNullable.<Integer>undefined();

  public static final String JSON_PROPERTY_RATINGS_NEST_TOTAL = "ratingsNestTotal";
  private JsonNullable<Integer> ratingsNestTotal = JsonNullable.<Integer>undefined();

  public static final String JSON_PROPERTY_RATINGS_NOTE = "ratingsNote";
  private JsonNullable<Double> ratingsNote = JsonNullable.<Double>undefined();

  public static final String JSON_PROPERTY_RATINGS_NOTE_TEXT = "ratingsNoteText";
  private JsonNullable<String> ratingsNoteText = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_REQUEST_ID = "requestId";
  private String requestId;

  public ConsensusRatings() { 
  }

  public ConsensusRatings fsymId(String fsymId) {
    this.fsymId = JsonNullable.<String>of(fsymId);
    return this;
  }

   /**
   * Get fsymId
   * @return fsymId
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "SJY281-R", value = "")
  @JsonIgnore

  public String getFsymId() {
        return fsymId.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_FSYM_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getFsymId_JsonNullable() {
    return fsymId;
  }
  
  @JsonProperty(JSON_PROPERTY_FSYM_ID)
  public void setFsymId_JsonNullable(JsonNullable<String> fsymId) {
    this.fsymId = fsymId;
  }

  public void setFsymId(String fsymId) {
    this.fsymId = JsonNullable.<String>of(fsymId);
  }


  public ConsensusRatings estimateDate(LocalDate estimateDate) {
    this.estimateDate = JsonNullable.<LocalDate>of(estimateDate);
    return this;
  }

   /**
   * Date of estimate expressed in YYYY-MM-DD format. For more details, visit [Online Assistant Page #16598](https://oa.apps.factset.com/pages/16598)
   * @return estimateDate
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "Mon Jul 24 00:00:00 UTC 2017", value = "Date of estimate expressed in YYYY-MM-DD format. For more details, visit [Online Assistant Page #16598](https://oa.apps.factset.com/pages/16598)")
  @JsonIgnore

  public LocalDate getEstimateDate() {
        return estimateDate.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_ESTIMATE_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<LocalDate> getEstimateDate_JsonNullable() {
    return estimateDate;
  }
  
  @JsonProperty(JSON_PROPERTY_ESTIMATE_DATE)
  public void setEstimateDate_JsonNullable(JsonNullable<LocalDate> estimateDate) {
    this.estimateDate = estimateDate;
  }

  public void setEstimateDate(LocalDate estimateDate) {
    this.estimateDate = JsonNullable.<LocalDate>of(estimateDate);
  }


  public ConsensusRatings buyCount(Integer buyCount) {
    this.buyCount = JsonNullable.<Integer>of(buyCount);
    return this;
  }

   /**
   * The number of Buy ratings taken into account in the calculation of a consensus. This information is shown only for a 100-day consensus.
   * @return buyCount
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "5", value = "The number of Buy ratings taken into account in the calculation of a consensus. This information is shown only for a 100-day consensus.")
  @JsonIgnore

  public Integer getBuyCount() {
        return buyCount.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_BUY_COUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Integer> getBuyCount_JsonNullable() {
    return buyCount;
  }
  
  @JsonProperty(JSON_PROPERTY_BUY_COUNT)
  public void setBuyCount_JsonNullable(JsonNullable<Integer> buyCount) {
    this.buyCount = buyCount;
  }

  public void setBuyCount(Integer buyCount) {
    this.buyCount = JsonNullable.<Integer>of(buyCount);
  }


  public ConsensusRatings overweightCount(Integer overweightCount) {
    this.overweightCount = JsonNullable.<Integer>of(overweightCount);
    return this;
  }

   /**
   * The number of Overweight ratings taken into account in the calculation of a consensus. This information is shown only for a 100-day consensus.
   * @return overweightCount
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "1", value = "The number of Overweight ratings taken into account in the calculation of a consensus. This information is shown only for a 100-day consensus.")
  @JsonIgnore

  public Integer getOverweightCount() {
        return overweightCount.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_OVERWEIGHT_COUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Integer> getOverweightCount_JsonNullable() {
    return overweightCount;
  }
  
  @JsonProperty(JSON_PROPERTY_OVERWEIGHT_COUNT)
  public void setOverweightCount_JsonNullable(JsonNullable<Integer> overweightCount) {
    this.overweightCount = overweightCount;
  }

  public void setOverweightCount(Integer overweightCount) {
    this.overweightCount = JsonNullable.<Integer>of(overweightCount);
  }


  public ConsensusRatings holdCount(Integer holdCount) {
    this.holdCount = JsonNullable.<Integer>of(holdCount);
    return this;
  }

   /**
   * The number of Hold ratings taken into account in the calculation of a consensus. This information is shown only for a 100-day consensus.
   * @return holdCount
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "1", value = "The number of Hold ratings taken into account in the calculation of a consensus. This information is shown only for a 100-day consensus.")
  @JsonIgnore

  public Integer getHoldCount() {
        return holdCount.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_HOLD_COUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Integer> getHoldCount_JsonNullable() {
    return holdCount;
  }
  
  @JsonProperty(JSON_PROPERTY_HOLD_COUNT)
  public void setHoldCount_JsonNullable(JsonNullable<Integer> holdCount) {
    this.holdCount = holdCount;
  }

  public void setHoldCount(Integer holdCount) {
    this.holdCount = JsonNullable.<Integer>of(holdCount);
  }


  public ConsensusRatings underweightCount(Integer underweightCount) {
    this.underweightCount = JsonNullable.<Integer>of(underweightCount);
    return this;
  }

   /**
   * The number of Underweight ratings taken into account in the calculation of a consensus. This information is shown only for a 100-day consensus.
   * @return underweightCount
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "1", value = "The number of Underweight ratings taken into account in the calculation of a consensus. This information is shown only for a 100-day consensus.")
  @JsonIgnore

  public Integer getUnderweightCount() {
        return underweightCount.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_UNDERWEIGHT_COUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Integer> getUnderweightCount_JsonNullable() {
    return underweightCount;
  }
  
  @JsonProperty(JSON_PROPERTY_UNDERWEIGHT_COUNT)
  public void setUnderweightCount_JsonNullable(JsonNullable<Integer> underweightCount) {
    this.underweightCount = underweightCount;
  }

  public void setUnderweightCount(Integer underweightCount) {
    this.underweightCount = JsonNullable.<Integer>of(underweightCount);
  }


  public ConsensusRatings sellCount(Integer sellCount) {
    this.sellCount = JsonNullable.<Integer>of(sellCount);
    return this;
  }

   /**
   * The number of Sell ratings taken into account in the calculation of a consensus. This information is shown only for a 100-day consensus.
   * @return sellCount
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "1", value = "The number of Sell ratings taken into account in the calculation of a consensus. This information is shown only for a 100-day consensus.")
  @JsonIgnore

  public Integer getSellCount() {
        return sellCount.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_SELL_COUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Integer> getSellCount_JsonNullable() {
    return sellCount;
  }
  
  @JsonProperty(JSON_PROPERTY_SELL_COUNT)
  public void setSellCount_JsonNullable(JsonNullable<Integer> sellCount) {
    this.sellCount = sellCount;
  }

  public void setSellCount(Integer sellCount) {
    this.sellCount = JsonNullable.<Integer>of(sellCount);
  }


  public ConsensusRatings ratingsNestTotal(Integer ratingsNestTotal) {
    this.ratingsNestTotal = JsonNullable.<Integer>of(ratingsNestTotal);
    return this;
  }

   /**
   * The total number of ratings taken into account in the calculation of a consensus. This information is shown only for a 100-day consensus.
   * @return ratingsNestTotal
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "1", value = "The total number of ratings taken into account in the calculation of a consensus. This information is shown only for a 100-day consensus.")
  @JsonIgnore

  public Integer getRatingsNestTotal() {
        return ratingsNestTotal.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_RATINGS_NEST_TOTAL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Integer> getRatingsNestTotal_JsonNullable() {
    return ratingsNestTotal;
  }
  
  @JsonProperty(JSON_PROPERTY_RATINGS_NEST_TOTAL)
  public void setRatingsNestTotal_JsonNullable(JsonNullable<Integer> ratingsNestTotal) {
    this.ratingsNestTotal = ratingsNestTotal;
  }

  public void setRatingsNestTotal(Integer ratingsNestTotal) {
    this.ratingsNestTotal = JsonNullable.<Integer>of(ratingsNestTotal);
  }


  public ConsensusRatings ratingsNote(Double ratingsNote) {
    this.ratingsNote = JsonNullable.<Double>of(ratingsNote);
    return this;
  }

   /**
   * The mean average of ratings for the fiscal dates indicated, where each underlying rating is given a numerical score and then aggregated to a mean consensus - __*Individual Ratings Scores*__ |Value|Rating Description| |---|---| |1|Buy| |1.5|Overweight| |2|Hold| |2.5|Underweight| |3|Sell| 
   * @return ratingsNote
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "1.85555", value = "The mean average of ratings for the fiscal dates indicated, where each underlying rating is given a numerical score and then aggregated to a mean consensus - __*Individual Ratings Scores*__ |Value|Rating Description| |---|---| |1|Buy| |1.5|Overweight| |2|Hold| |2.5|Underweight| |3|Sell| ")
  @JsonIgnore

  public Double getRatingsNote() {
        return ratingsNote.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_RATINGS_NOTE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Double> getRatingsNote_JsonNullable() {
    return ratingsNote;
  }
  
  @JsonProperty(JSON_PROPERTY_RATINGS_NOTE)
  public void setRatingsNote_JsonNullable(JsonNullable<Double> ratingsNote) {
    this.ratingsNote = ratingsNote;
  }

  public void setRatingsNote(Double ratingsNote) {
    this.ratingsNote = JsonNullable.<Double>of(ratingsNote);
  }


  public ConsensusRatings ratingsNoteText(String ratingsNoteText) {
    this.ratingsNoteText = JsonNullable.<String>of(ratingsNoteText);
    return this;
  }

   /**
   * The mean textual rating for the fiscal dates indicated. The text rating is assigned by falling within the below defined ranges -  __*Textual Ranges for Average*__ |Value|Rating Description| |---|---| |&lt; 1.25|Buy| |&lt; 1.75|Overweight| |&lt; 2.25|Hold| |&lt; 2.75|Underweight| |&lt;&#x3D; 3|Sell| 
   * @return ratingsNoteText
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "Hold", value = "The mean textual rating for the fiscal dates indicated. The text rating is assigned by falling within the below defined ranges -  __*Textual Ranges for Average*__ |Value|Rating Description| |---|---| |< 1.25|Buy| |< 1.75|Overweight| |< 2.25|Hold| |< 2.75|Underweight| |<= 3|Sell| ")
  @JsonIgnore

  public String getRatingsNoteText() {
        return ratingsNoteText.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_RATINGS_NOTE_TEXT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getRatingsNoteText_JsonNullable() {
    return ratingsNoteText;
  }
  
  @JsonProperty(JSON_PROPERTY_RATINGS_NOTE_TEXT)
  public void setRatingsNoteText_JsonNullable(JsonNullable<String> ratingsNoteText) {
    this.ratingsNoteText = ratingsNoteText;
  }

  public void setRatingsNoteText(String ratingsNoteText) {
    this.ratingsNoteText = JsonNullable.<String>of(ratingsNoteText);
  }


  public ConsensusRatings requestId(String requestId) {
    this.requestId = requestId;
    return this;
  }

   /**
   * Identifier that was used for the request.
   * @return requestId
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "IBM-US", value = "Identifier that was used for the request.")
  @JsonProperty(JSON_PROPERTY_REQUEST_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getRequestId() {
    return requestId;
  }


  @JsonProperty(JSON_PROPERTY_REQUEST_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRequestId(String requestId) {
    this.requestId = requestId;
  }


  /**
   * Return true if this consensusRatings object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConsensusRatings consensusRatings = (ConsensusRatings) o;
    return equalsNullable(this.fsymId, consensusRatings.fsymId) &&
        equalsNullable(this.estimateDate, consensusRatings.estimateDate) &&
        equalsNullable(this.buyCount, consensusRatings.buyCount) &&
        equalsNullable(this.overweightCount, consensusRatings.overweightCount) &&
        equalsNullable(this.holdCount, consensusRatings.holdCount) &&
        equalsNullable(this.underweightCount, consensusRatings.underweightCount) &&
        equalsNullable(this.sellCount, consensusRatings.sellCount) &&
        equalsNullable(this.ratingsNestTotal, consensusRatings.ratingsNestTotal) &&
        equalsNullable(this.ratingsNote, consensusRatings.ratingsNote) &&
        equalsNullable(this.ratingsNoteText, consensusRatings.ratingsNoteText) &&
        Objects.equals(this.requestId, consensusRatings.requestId);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(hashCodeNullable(fsymId), hashCodeNullable(estimateDate), hashCodeNullable(buyCount), hashCodeNullable(overweightCount), hashCodeNullable(holdCount), hashCodeNullable(underweightCount), hashCodeNullable(sellCount), hashCodeNullable(ratingsNestTotal), hashCodeNullable(ratingsNote), hashCodeNullable(ratingsNoteText), requestId);
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
    sb.append("class ConsensusRatings {\n");
    sb.append("    fsymId: ").append(toIndentedString(fsymId)).append("\n");
    sb.append("    estimateDate: ").append(toIndentedString(estimateDate)).append("\n");
    sb.append("    buyCount: ").append(toIndentedString(buyCount)).append("\n");
    sb.append("    overweightCount: ").append(toIndentedString(overweightCount)).append("\n");
    sb.append("    holdCount: ").append(toIndentedString(holdCount)).append("\n");
    sb.append("    underweightCount: ").append(toIndentedString(underweightCount)).append("\n");
    sb.append("    sellCount: ").append(toIndentedString(sellCount)).append("\n");
    sb.append("    ratingsNestTotal: ").append(toIndentedString(ratingsNestTotal)).append("\n");
    sb.append("    ratingsNote: ").append(toIndentedString(ratingsNote)).append("\n");
    sb.append("    ratingsNoteText: ").append(toIndentedString(ratingsNoteText)).append("\n");
    sb.append("    requestId: ").append(toIndentedString(requestId)).append("\n");
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

