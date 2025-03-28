/*
 * FactSet People API
 * The FactSet People API exposes FactSet data for individuals and their jobs.<p>This API is rate-limited to 10 requests per second and 10 concurrent requests per user.</p> 
 *
 * The version of the OpenAPI document: 1.3.0
 * Contact: api@factset.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.factset.sdk.FactSetPeople.models;

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
import org.openapitools.jackson.nullable.JsonNullable;
import com.fasterxml.jackson.annotation.JsonIgnore;
import org.openapitools.jackson.nullable.JsonNullable;
import java.util.NoSuchElementException;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.factset.sdk.FactSetPeople.JSON;


/**
 * List of the statistics such as the average age, tenure, compensation of leadership, the number of executives, and the gender diversity of leadership for the requested identifier.
 */
@ApiModel(description = "List of the statistics such as the average age, tenure, compensation of leadership, the number of executives, and the gender diversity of leadership for the requested identifier.")
@JsonPropertyOrder({
  CompanyStats.JSON_PROPERTY_FSYM_ID,
  CompanyStats.JSON_PROPERTY_AVERAGE_MGMT_COMPENSATION,
  CompanyStats.JSON_PROPERTY_AVERAGE_TENURE,
  CompanyStats.JSON_PROPERTY_MEDIAN_TENURE,
  CompanyStats.JSON_PROPERTY_AVERAGE_AGE,
  CompanyStats.JSON_PROPERTY_MAX_AGE,
  CompanyStats.JSON_PROPERTY_MINIMUM_AGE,
  CompanyStats.JSON_PROPERTY_MEDIAN_AGE,
  CompanyStats.JSON_PROPERTY_BOARD_INDEPENDENT_DIRECTORS,
  CompanyStats.JSON_PROPERTY_FEMALE_BOARD_MEMBERS,
  CompanyStats.JSON_PROPERTY_FEMALE_BOARD_MEMBERS_PERCENT,
  CompanyStats.JSON_PROPERTY_NUMBER_OF_MEMBERS,
  CompanyStats.JSON_PROPERTY_ON_OTHER_BOARDS_ALL,
  CompanyStats.JSON_PROPERTY_ON_OTHER_BOARDS_CORPORATE,
  CompanyStats.JSON_PROPERTY_MB_TYPE,
  CompanyStats.JSON_PROPERTY_REQUEST_ID
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")

public class CompanyStats implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_FSYM_ID = "fsymId";
  private JsonNullable<String> fsymId = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_AVERAGE_MGMT_COMPENSATION = "averageMgmtCompensation";
  private JsonNullable<BigDecimal> averageMgmtCompensation = JsonNullable.<BigDecimal>undefined();

  public static final String JSON_PROPERTY_AVERAGE_TENURE = "averageTenure";
  private JsonNullable<Double> averageTenure = JsonNullable.<Double>undefined();

  public static final String JSON_PROPERTY_MEDIAN_TENURE = "medianTenure";
  private JsonNullable<Double> medianTenure = JsonNullable.<Double>undefined();

  public static final String JSON_PROPERTY_AVERAGE_AGE = "averageAge";
  private JsonNullable<Double> averageAge = JsonNullable.<Double>undefined();

  public static final String JSON_PROPERTY_MAX_AGE = "maxAge";
  private JsonNullable<BigDecimal> maxAge = JsonNullable.<BigDecimal>undefined();

  public static final String JSON_PROPERTY_MINIMUM_AGE = "minimumAge";
  private JsonNullable<BigDecimal> minimumAge = JsonNullable.<BigDecimal>undefined();

  public static final String JSON_PROPERTY_MEDIAN_AGE = "medianAge";
  private JsonNullable<BigDecimal> medianAge = JsonNullable.<BigDecimal>undefined();

  public static final String JSON_PROPERTY_BOARD_INDEPENDENT_DIRECTORS = "boardIndependentDirectors";
  private JsonNullable<BigDecimal> boardIndependentDirectors = JsonNullable.<BigDecimal>undefined();

  public static final String JSON_PROPERTY_FEMALE_BOARD_MEMBERS = "femaleBoardMembers";
  private JsonNullable<BigDecimal> femaleBoardMembers = JsonNullable.<BigDecimal>undefined();

  public static final String JSON_PROPERTY_FEMALE_BOARD_MEMBERS_PERCENT = "femaleBoardMembersPercent";
  private JsonNullable<Double> femaleBoardMembersPercent = JsonNullable.<Double>undefined();

  public static final String JSON_PROPERTY_NUMBER_OF_MEMBERS = "numberOfMembers";
  private JsonNullable<BigDecimal> numberOfMembers = JsonNullable.<BigDecimal>undefined();

  public static final String JSON_PROPERTY_ON_OTHER_BOARDS_ALL = "onOtherBoardsAll";
  private JsonNullable<BigDecimal> onOtherBoardsAll = JsonNullable.<BigDecimal>undefined();

  public static final String JSON_PROPERTY_ON_OTHER_BOARDS_CORPORATE = "onOtherBoardsCorporate";
  private JsonNullable<BigDecimal> onOtherBoardsCorporate = JsonNullable.<BigDecimal>undefined();

  public static final String JSON_PROPERTY_MB_TYPE = "mbType";
  private JsonNullable<String> mbType = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_REQUEST_ID = "requestId";
  private String requestId;

  public CompanyStats() { 
  }

  public CompanyStats fsymId(String fsymId) {
    this.fsymId = JsonNullable.<String>of(fsymId);
    return this;
  }

   /**
   * FactSet Identifier for the company.
   * @return fsymId
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "0016YD-E", value = "FactSet Identifier for the company.")
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


  public CompanyStats averageMgmtCompensation(BigDecimal averageMgmtCompensation) {
    this.averageMgmtCompensation = JsonNullable.<BigDecimal>of(averageMgmtCompensation);
    return this;
  }

   /**
   * Average compensation for the executives
   * @return averageMgmtCompensation
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "2267284", value = "Average compensation for the executives")
  @JsonIgnore

  public BigDecimal getAverageMgmtCompensation() {
        return averageMgmtCompensation.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_AVERAGE_MGMT_COMPENSATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<BigDecimal> getAverageMgmtCompensation_JsonNullable() {
    return averageMgmtCompensation;
  }
  
  @JsonProperty(JSON_PROPERTY_AVERAGE_MGMT_COMPENSATION)
  public void setAverageMgmtCompensation_JsonNullable(JsonNullable<BigDecimal> averageMgmtCompensation) {
    this.averageMgmtCompensation = averageMgmtCompensation;
  }

  public void setAverageMgmtCompensation(BigDecimal averageMgmtCompensation) {
    this.averageMgmtCompensation = JsonNullable.<BigDecimal>of(averageMgmtCompensation);
  }


  public CompanyStats averageTenure(Double averageTenure) {
    this.averageTenure = JsonNullable.<Double>of(averageTenure);
    return this;
  }

   /**
   * Avergae tenure of the people
   * @return averageTenure
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "12.19", value = "Avergae tenure of the people")
  @JsonIgnore

  public Double getAverageTenure() {
        return averageTenure.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_AVERAGE_TENURE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Double> getAverageTenure_JsonNullable() {
    return averageTenure;
  }
  
  @JsonProperty(JSON_PROPERTY_AVERAGE_TENURE)
  public void setAverageTenure_JsonNullable(JsonNullable<Double> averageTenure) {
    this.averageTenure = averageTenure;
  }

  public void setAverageTenure(Double averageTenure) {
    this.averageTenure = JsonNullable.<Double>of(averageTenure);
  }


  public CompanyStats medianTenure(Double medianTenure) {
    this.medianTenure = JsonNullable.<Double>of(medianTenure);
    return this;
  }

   /**
   * Median tenure
   * @return medianTenure
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "0.2", value = "Median tenure")
  @JsonIgnore

  public Double getMedianTenure() {
        return medianTenure.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_MEDIAN_TENURE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Double> getMedianTenure_JsonNullable() {
    return medianTenure;
  }
  
  @JsonProperty(JSON_PROPERTY_MEDIAN_TENURE)
  public void setMedianTenure_JsonNullable(JsonNullable<Double> medianTenure) {
    this.medianTenure = medianTenure;
  }

  public void setMedianTenure(Double medianTenure) {
    this.medianTenure = JsonNullable.<Double>of(medianTenure);
  }


  public CompanyStats averageAge(Double averageAge) {
    this.averageAge = JsonNullable.<Double>of(averageAge);
    return this;
  }

   /**
   * Average of the executives on the management and board
   * @return averageAge
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "58.17", value = "Average of the executives on the management and board")
  @JsonIgnore

  public Double getAverageAge() {
        return averageAge.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_AVERAGE_AGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Double> getAverageAge_JsonNullable() {
    return averageAge;
  }
  
  @JsonProperty(JSON_PROPERTY_AVERAGE_AGE)
  public void setAverageAge_JsonNullable(JsonNullable<Double> averageAge) {
    this.averageAge = averageAge;
  }

  public void setAverageAge(Double averageAge) {
    this.averageAge = JsonNullable.<Double>of(averageAge);
  }


  public CompanyStats maxAge(BigDecimal maxAge) {
    this.maxAge = JsonNullable.<BigDecimal>of(maxAge);
    return this;
  }

   /**
   * Maximum age of the people on Management &amp; Board
   * @return maxAge
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "68", value = "Maximum age of the people on Management & Board")
  @JsonIgnore

  public BigDecimal getMaxAge() {
        return maxAge.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_MAX_AGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<BigDecimal> getMaxAge_JsonNullable() {
    return maxAge;
  }
  
  @JsonProperty(JSON_PROPERTY_MAX_AGE)
  public void setMaxAge_JsonNullable(JsonNullable<BigDecimal> maxAge) {
    this.maxAge = maxAge;
  }

  public void setMaxAge(BigDecimal maxAge) {
    this.maxAge = JsonNullable.<BigDecimal>of(maxAge);
  }


  public CompanyStats minimumAge(BigDecimal minimumAge) {
    this.minimumAge = JsonNullable.<BigDecimal>of(minimumAge);
    return this;
  }

   /**
   * Minimum age of the person on board
   * @return minimumAge
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "53", value = "Minimum age of the person on board")
  @JsonIgnore

  public BigDecimal getMinimumAge() {
        return minimumAge.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_MINIMUM_AGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<BigDecimal> getMinimumAge_JsonNullable() {
    return minimumAge;
  }
  
  @JsonProperty(JSON_PROPERTY_MINIMUM_AGE)
  public void setMinimumAge_JsonNullable(JsonNullable<BigDecimal> minimumAge) {
    this.minimumAge = minimumAge;
  }

  public void setMinimumAge(BigDecimal minimumAge) {
    this.minimumAge = JsonNullable.<BigDecimal>of(minimumAge);
  }


  public CompanyStats medianAge(BigDecimal medianAge) {
    this.medianAge = JsonNullable.<BigDecimal>of(medianAge);
    return this;
  }

   /**
   * Median age of the people on board
   * @return medianAge
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "56", value = "Median age of the people on board")
  @JsonIgnore

  public BigDecimal getMedianAge() {
        return medianAge.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_MEDIAN_AGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<BigDecimal> getMedianAge_JsonNullable() {
    return medianAge;
  }
  
  @JsonProperty(JSON_PROPERTY_MEDIAN_AGE)
  public void setMedianAge_JsonNullable(JsonNullable<BigDecimal> medianAge) {
    this.medianAge = medianAge;
  }

  public void setMedianAge(BigDecimal medianAge) {
    this.medianAge = JsonNullable.<BigDecimal>of(medianAge);
  }


  public CompanyStats boardIndependentDirectors(BigDecimal boardIndependentDirectors) {
    this.boardIndependentDirectors = JsonNullable.<BigDecimal>of(boardIndependentDirectors);
    return this;
  }

   /**
   * Independent directors on the board
   * @return boardIndependentDirectors
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "7", value = "Independent directors on the board")
  @JsonIgnore

  public BigDecimal getBoardIndependentDirectors() {
        return boardIndependentDirectors.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_BOARD_INDEPENDENT_DIRECTORS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<BigDecimal> getBoardIndependentDirectors_JsonNullable() {
    return boardIndependentDirectors;
  }
  
  @JsonProperty(JSON_PROPERTY_BOARD_INDEPENDENT_DIRECTORS)
  public void setBoardIndependentDirectors_JsonNullable(JsonNullable<BigDecimal> boardIndependentDirectors) {
    this.boardIndependentDirectors = boardIndependentDirectors;
  }

  public void setBoardIndependentDirectors(BigDecimal boardIndependentDirectors) {
    this.boardIndependentDirectors = JsonNullable.<BigDecimal>of(boardIndependentDirectors);
  }


  public CompanyStats femaleBoardMembers(BigDecimal femaleBoardMembers) {
    this.femaleBoardMembers = JsonNullable.<BigDecimal>of(femaleBoardMembers);
    return this;
  }

   /**
   * Number of female members on the board
   * @return femaleBoardMembers
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "3", value = "Number of female members on the board")
  @JsonIgnore

  public BigDecimal getFemaleBoardMembers() {
        return femaleBoardMembers.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_FEMALE_BOARD_MEMBERS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<BigDecimal> getFemaleBoardMembers_JsonNullable() {
    return femaleBoardMembers;
  }
  
  @JsonProperty(JSON_PROPERTY_FEMALE_BOARD_MEMBERS)
  public void setFemaleBoardMembers_JsonNullable(JsonNullable<BigDecimal> femaleBoardMembers) {
    this.femaleBoardMembers = femaleBoardMembers;
  }

  public void setFemaleBoardMembers(BigDecimal femaleBoardMembers) {
    this.femaleBoardMembers = JsonNullable.<BigDecimal>of(femaleBoardMembers);
  }


  public CompanyStats femaleBoardMembersPercent(Double femaleBoardMembersPercent) {
    this.femaleBoardMembersPercent = JsonNullable.<Double>of(femaleBoardMembersPercent);
    return this;
  }

   /**
   * Percentage of female members on the board
   * @return femaleBoardMembersPercent
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "37.33", value = "Percentage of female members on the board")
  @JsonIgnore

  public Double getFemaleBoardMembersPercent() {
        return femaleBoardMembersPercent.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_FEMALE_BOARD_MEMBERS_PERCENT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Double> getFemaleBoardMembersPercent_JsonNullable() {
    return femaleBoardMembersPercent;
  }
  
  @JsonProperty(JSON_PROPERTY_FEMALE_BOARD_MEMBERS_PERCENT)
  public void setFemaleBoardMembersPercent_JsonNullable(JsonNullable<Double> femaleBoardMembersPercent) {
    this.femaleBoardMembersPercent = femaleBoardMembersPercent;
  }

  public void setFemaleBoardMembersPercent(Double femaleBoardMembersPercent) {
    this.femaleBoardMembersPercent = JsonNullable.<Double>of(femaleBoardMembersPercent);
  }


  public CompanyStats numberOfMembers(BigDecimal numberOfMembers) {
    this.numberOfMembers = JsonNullable.<BigDecimal>of(numberOfMembers);
    return this;
  }

   /**
   * Number of people on board.
   * @return numberOfMembers
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "25", value = "Number of people on board.")
  @JsonIgnore

  public BigDecimal getNumberOfMembers() {
        return numberOfMembers.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_NUMBER_OF_MEMBERS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<BigDecimal> getNumberOfMembers_JsonNullable() {
    return numberOfMembers;
  }
  
  @JsonProperty(JSON_PROPERTY_NUMBER_OF_MEMBERS)
  public void setNumberOfMembers_JsonNullable(JsonNullable<BigDecimal> numberOfMembers) {
    this.numberOfMembers = numberOfMembers;
  }

  public void setNumberOfMembers(BigDecimal numberOfMembers) {
    this.numberOfMembers = JsonNullable.<BigDecimal>of(numberOfMembers);
  }


  public CompanyStats onOtherBoardsAll(BigDecimal onOtherBoardsAll) {
    this.onOtherBoardsAll = JsonNullable.<BigDecimal>of(onOtherBoardsAll);
    return this;
  }

   /**
   * On Other Boards All
   * @return onOtherBoardsAll
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "7", value = "On Other Boards All")
  @JsonIgnore

  public BigDecimal getOnOtherBoardsAll() {
        return onOtherBoardsAll.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_ON_OTHER_BOARDS_ALL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<BigDecimal> getOnOtherBoardsAll_JsonNullable() {
    return onOtherBoardsAll;
  }
  
  @JsonProperty(JSON_PROPERTY_ON_OTHER_BOARDS_ALL)
  public void setOnOtherBoardsAll_JsonNullable(JsonNullable<BigDecimal> onOtherBoardsAll) {
    this.onOtherBoardsAll = onOtherBoardsAll;
  }

  public void setOnOtherBoardsAll(BigDecimal onOtherBoardsAll) {
    this.onOtherBoardsAll = JsonNullable.<BigDecimal>of(onOtherBoardsAll);
  }


  public CompanyStats onOtherBoardsCorporate(BigDecimal onOtherBoardsCorporate) {
    this.onOtherBoardsCorporate = JsonNullable.<BigDecimal>of(onOtherBoardsCorporate);
    return this;
  }

   /**
   * On Other Boards Corporate
   * @return onOtherBoardsCorporate
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "6", value = "On Other Boards Corporate")
  @JsonIgnore

  public BigDecimal getOnOtherBoardsCorporate() {
        return onOtherBoardsCorporate.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_ON_OTHER_BOARDS_CORPORATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<BigDecimal> getOnOtherBoardsCorporate_JsonNullable() {
    return onOtherBoardsCorporate;
  }
  
  @JsonProperty(JSON_PROPERTY_ON_OTHER_BOARDS_CORPORATE)
  public void setOnOtherBoardsCorporate_JsonNullable(JsonNullable<BigDecimal> onOtherBoardsCorporate) {
    this.onOtherBoardsCorporate = onOtherBoardsCorporate;
  }

  public void setOnOtherBoardsCorporate(BigDecimal onOtherBoardsCorporate) {
    this.onOtherBoardsCorporate = JsonNullable.<BigDecimal>of(onOtherBoardsCorporate);
  }


  public CompanyStats mbType(String mbType) {
    this.mbType = JsonNullable.<String>of(mbType);
    return this;
  }

   /**
   * Management and Board type, where MB &#x3D; Management &amp; Board, MGMT &#x3D; Management, and BRD &#x3D; Board. This is a pass-through value from the input used in the &#x60;mbType&#x60; query parameter.
   * @return mbType
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "MB", value = "Management and Board type, where MB = Management & Board, MGMT = Management, and BRD = Board. This is a pass-through value from the input used in the `mbType` query parameter.")
  @JsonIgnore

  public String getMbType() {
        return mbType.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_MB_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getMbType_JsonNullable() {
    return mbType;
  }
  
  @JsonProperty(JSON_PROPERTY_MB_TYPE)
  public void setMbType_JsonNullable(JsonNullable<String> mbType) {
    this.mbType = mbType;
  }

  public void setMbType(String mbType) {
    this.mbType = JsonNullable.<String>of(mbType);
  }


  public CompanyStats requestId(String requestId) {
    this.requestId = requestId;
    return this;
  }

   /**
   * Original identifier used for the request.
   * @return requestId
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "FDS", value = "Original identifier used for the request.")
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
   * Return true if this companyStats object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CompanyStats companyStats = (CompanyStats) o;
    return equalsNullable(this.fsymId, companyStats.fsymId) &&
        equalsNullable(this.averageMgmtCompensation, companyStats.averageMgmtCompensation) &&
        equalsNullable(this.averageTenure, companyStats.averageTenure) &&
        equalsNullable(this.medianTenure, companyStats.medianTenure) &&
        equalsNullable(this.averageAge, companyStats.averageAge) &&
        equalsNullable(this.maxAge, companyStats.maxAge) &&
        equalsNullable(this.minimumAge, companyStats.minimumAge) &&
        equalsNullable(this.medianAge, companyStats.medianAge) &&
        equalsNullable(this.boardIndependentDirectors, companyStats.boardIndependentDirectors) &&
        equalsNullable(this.femaleBoardMembers, companyStats.femaleBoardMembers) &&
        equalsNullable(this.femaleBoardMembersPercent, companyStats.femaleBoardMembersPercent) &&
        equalsNullable(this.numberOfMembers, companyStats.numberOfMembers) &&
        equalsNullable(this.onOtherBoardsAll, companyStats.onOtherBoardsAll) &&
        equalsNullable(this.onOtherBoardsCorporate, companyStats.onOtherBoardsCorporate) &&
        equalsNullable(this.mbType, companyStats.mbType) &&
        Objects.equals(this.requestId, companyStats.requestId);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(hashCodeNullable(fsymId), hashCodeNullable(averageMgmtCompensation), hashCodeNullable(averageTenure), hashCodeNullable(medianTenure), hashCodeNullable(averageAge), hashCodeNullable(maxAge), hashCodeNullable(minimumAge), hashCodeNullable(medianAge), hashCodeNullable(boardIndependentDirectors), hashCodeNullable(femaleBoardMembers), hashCodeNullable(femaleBoardMembersPercent), hashCodeNullable(numberOfMembers), hashCodeNullable(onOtherBoardsAll), hashCodeNullable(onOtherBoardsCorporate), hashCodeNullable(mbType), requestId);
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
    sb.append("class CompanyStats {\n");
    sb.append("    fsymId: ").append(toIndentedString(fsymId)).append("\n");
    sb.append("    averageMgmtCompensation: ").append(toIndentedString(averageMgmtCompensation)).append("\n");
    sb.append("    averageTenure: ").append(toIndentedString(averageTenure)).append("\n");
    sb.append("    medianTenure: ").append(toIndentedString(medianTenure)).append("\n");
    sb.append("    averageAge: ").append(toIndentedString(averageAge)).append("\n");
    sb.append("    maxAge: ").append(toIndentedString(maxAge)).append("\n");
    sb.append("    minimumAge: ").append(toIndentedString(minimumAge)).append("\n");
    sb.append("    medianAge: ").append(toIndentedString(medianAge)).append("\n");
    sb.append("    boardIndependentDirectors: ").append(toIndentedString(boardIndependentDirectors)).append("\n");
    sb.append("    femaleBoardMembers: ").append(toIndentedString(femaleBoardMembers)).append("\n");
    sb.append("    femaleBoardMembersPercent: ").append(toIndentedString(femaleBoardMembersPercent)).append("\n");
    sb.append("    numberOfMembers: ").append(toIndentedString(numberOfMembers)).append("\n");
    sb.append("    onOtherBoardsAll: ").append(toIndentedString(onOtherBoardsAll)).append("\n");
    sb.append("    onOtherBoardsCorporate: ").append(toIndentedString(onOtherBoardsCorporate)).append("\n");
    sb.append("    mbType: ").append(toIndentedString(mbType)).append("\n");
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

