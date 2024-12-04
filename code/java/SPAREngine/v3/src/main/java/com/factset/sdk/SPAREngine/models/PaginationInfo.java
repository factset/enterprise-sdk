/*
 * Style Performance and Risk Analysis (SPAR) Engine API
 * Allow clients to fetch Analytics through APIs.
 *
 * The version of the OpenAPI document: 3.14.0
 * Contact: api@factset.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.factset.sdk.SPAREngine.models;

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
import com.factset.sdk.SPAREngine.JSON;


/**
 * PaginationInfo
 */
@JsonPropertyOrder({
  PaginationInfo.JSON_PROPERTY_PAGE_NUMBER,
  PaginationInfo.JSON_PROPERTY_PAGE_SIZE,
  PaginationInfo.JSON_PROPERTY_TOTAL_PAGES,
  PaginationInfo.JSON_PROPERTY_TOTAL_CALCULATIONS,
  PaginationInfo.JSON_PROPERTY_NEXT_PAGE,
  PaginationInfo.JSON_PROPERTY_PREVIOUS_PAGE
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")

public class PaginationInfo implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_PAGE_NUMBER = "pageNumber";
  private Integer pageNumber;

  public static final String JSON_PROPERTY_PAGE_SIZE = "pageSize";
  private Integer pageSize;

  public static final String JSON_PROPERTY_TOTAL_PAGES = "totalPages";
  private Integer totalPages;

  public static final String JSON_PROPERTY_TOTAL_CALCULATIONS = "totalCalculations";
  private Integer totalCalculations;

  public static final String JSON_PROPERTY_NEXT_PAGE = "nextPage";
  private JsonNullable<String> nextPage = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_PREVIOUS_PAGE = "previousPage";
  private JsonNullable<String> previousPage = JsonNullable.<String>undefined();

  public PaginationInfo() { 
  }

  public PaginationInfo pageNumber(Integer pageNumber) {
    this.pageNumber = pageNumber;
    return this;
  }

   /**
   * Get pageNumber
   * @return pageNumber
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_PAGE_NUMBER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getPageNumber() {
    return pageNumber;
  }


  @JsonProperty(JSON_PROPERTY_PAGE_NUMBER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPageNumber(Integer pageNumber) {
    this.pageNumber = pageNumber;
  }


  public PaginationInfo pageSize(Integer pageSize) {
    this.pageSize = pageSize;
    return this;
  }

   /**
   * Get pageSize
   * @return pageSize
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_PAGE_SIZE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getPageSize() {
    return pageSize;
  }


  @JsonProperty(JSON_PROPERTY_PAGE_SIZE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPageSize(Integer pageSize) {
    this.pageSize = pageSize;
  }


  public PaginationInfo totalPages(Integer totalPages) {
    this.totalPages = totalPages;
    return this;
  }

   /**
   * Get totalPages
   * @return totalPages
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_TOTAL_PAGES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getTotalPages() {
    return totalPages;
  }


  @JsonProperty(JSON_PROPERTY_TOTAL_PAGES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTotalPages(Integer totalPages) {
    this.totalPages = totalPages;
  }


  public PaginationInfo totalCalculations(Integer totalCalculations) {
    this.totalCalculations = totalCalculations;
    return this;
  }

   /**
   * Get totalCalculations
   * @return totalCalculations
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_TOTAL_CALCULATIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getTotalCalculations() {
    return totalCalculations;
  }


  @JsonProperty(JSON_PROPERTY_TOTAL_CALCULATIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTotalCalculations(Integer totalCalculations) {
    this.totalCalculations = totalCalculations;
  }


  public PaginationInfo nextPage(String nextPage) {
    this.nextPage = JsonNullable.<String>of(nextPage);
    return this;
  }

   /**
   * Get nextPage
   * @return nextPage
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonIgnore

  public String getNextPage() {
        return nextPage.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_NEXT_PAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getNextPage_JsonNullable() {
    return nextPage;
  }
  
  @JsonProperty(JSON_PROPERTY_NEXT_PAGE)
  public void setNextPage_JsonNullable(JsonNullable<String> nextPage) {
    this.nextPage = nextPage;
  }

  public void setNextPage(String nextPage) {
    this.nextPage = JsonNullable.<String>of(nextPage);
  }


  public PaginationInfo previousPage(String previousPage) {
    this.previousPage = JsonNullable.<String>of(previousPage);
    return this;
  }

   /**
   * Get previousPage
   * @return previousPage
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonIgnore

  public String getPreviousPage() {
        return previousPage.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_PREVIOUS_PAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getPreviousPage_JsonNullable() {
    return previousPage;
  }
  
  @JsonProperty(JSON_PROPERTY_PREVIOUS_PAGE)
  public void setPreviousPage_JsonNullable(JsonNullable<String> previousPage) {
    this.previousPage = previousPage;
  }

  public void setPreviousPage(String previousPage) {
    this.previousPage = JsonNullable.<String>of(previousPage);
  }


  /**
   * Return true if this PaginationInfo object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PaginationInfo paginationInfo = (PaginationInfo) o;
    return Objects.equals(this.pageNumber, paginationInfo.pageNumber) &&
        Objects.equals(this.pageSize, paginationInfo.pageSize) &&
        Objects.equals(this.totalPages, paginationInfo.totalPages) &&
        Objects.equals(this.totalCalculations, paginationInfo.totalCalculations) &&
        equalsNullable(this.nextPage, paginationInfo.nextPage) &&
        equalsNullable(this.previousPage, paginationInfo.previousPage);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(pageNumber, pageSize, totalPages, totalCalculations, hashCodeNullable(nextPage), hashCodeNullable(previousPage));
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
    sb.append("class PaginationInfo {\n");
    sb.append("    pageNumber: ").append(toIndentedString(pageNumber)).append("\n");
    sb.append("    pageSize: ").append(toIndentedString(pageSize)).append("\n");
    sb.append("    totalPages: ").append(toIndentedString(totalPages)).append("\n");
    sb.append("    totalCalculations: ").append(toIndentedString(totalCalculations)).append("\n");
    sb.append("    nextPage: ").append(toIndentedString(nextPage)).append("\n");
    sb.append("    previousPage: ").append(toIndentedString(previousPage)).append("\n");
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

