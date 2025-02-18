/*
 * BookBuilder
 * The BookBuilder API is a powerful tool that combines detailed reports for companies of interest. Save time by using a single source of knowledge instead of relying on multiple APIs to create a presentation ready PDF, also known as a Public Information Book(PIB). </br></br> Consistently create books with the same content/reports for different companies by defining templates with the set of reports saved for re-use. Or, use templates that are created by FactSet for quick use. </br></br> With our powerful API endpoints, you can get the information on companies of interest quickly where and when you need it. </br></br> 
 *
 * The version of the OpenAPI document: 1.13.0
 * Contact: api@factset.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.factset.sdk.BookBuilder.models;

import java.util.Objects;
import java.util.Arrays;
import java.util.Map;
import java.util.HashMap;
import com.factset.sdk.BookBuilder.models.ContentSection;
import com.factset.sdk.BookBuilder.models.PaginationOptions;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.factset.sdk.BookBuilder.JSON;


/**
 * The request body allows users to input the name of the book, ticker
 */
@ApiModel(description = "The request body allows users to input the name of the book, ticker")
@JsonPropertyOrder({
  CreateBookPostRequest.JSON_PROPERTY_BOOK_NAME,
  CreateBookPostRequest.JSON_PROPERTY_TICKER,
  CreateBookPostRequest.JSON_PROPERTY_PAGINATION,
  CreateBookPostRequest.JSON_PROPERTY_CONTENT
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")

public class CreateBookPostRequest implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_BOOK_NAME = "book_name";
  private String bookName;

  public static final String JSON_PROPERTY_TICKER = "ticker";
  private String ticker;

  public static final String JSON_PROPERTY_PAGINATION = "pagination";
  private PaginationOptions pagination;

  public static final String JSON_PROPERTY_CONTENT = "content";
  private java.util.List<ContentSection> content = null;

  public CreateBookPostRequest() { 
  }

  public CreateBookPostRequest bookName(String bookName) {
    this.bookName = bookName;
    return this;
  }

   /**
   * name of the book
   * @return bookName
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "Company Book for FDS", value = "name of the book")
  @JsonProperty(JSON_PROPERTY_BOOK_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getBookName() {
    return bookName;
  }


  @JsonProperty(JSON_PROPERTY_BOOK_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setBookName(String bookName) {
    this.bookName = bookName;
  }


  public CreateBookPostRequest ticker(String ticker) {
    this.ticker = ticker;
    return this;
  }

   /**
   * Identifier.
   * @return ticker
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "FDS-US", value = "Identifier.")
  @JsonProperty(JSON_PROPERTY_TICKER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getTicker() {
    return ticker;
  }


  @JsonProperty(JSON_PROPERTY_TICKER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTicker(String ticker) {
    this.ticker = ticker;
  }


  public CreateBookPostRequest pagination(PaginationOptions pagination) {
    this.pagination = pagination;
    return this;
  }

   /**
   * Get pagination
   * @return pagination
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_PAGINATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public PaginationOptions getPagination() {
    return pagination;
  }


  @JsonProperty(JSON_PROPERTY_PAGINATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPagination(PaginationOptions pagination) {
    this.pagination = pagination;
  }


  public CreateBookPostRequest content(java.util.List<ContentSection> content) {
    this.content = content;
    return this;
  }

  public CreateBookPostRequest addContentItem(ContentSection contentItem) {
    if (this.content == null) {
      this.content = new java.util.ArrayList<>();
    }
    this.content.add(contentItem);
    return this;
  }

   /**
   * Content sections.
   * @return content
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "Content sections.")
  @JsonProperty(JSON_PROPERTY_CONTENT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public java.util.List<ContentSection> getContent() {
    return content;
  }


  @JsonProperty(JSON_PROPERTY_CONTENT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setContent(java.util.List<ContentSection> content) {
    this.content = content;
  }


  /**
   * Return true if this createBookPostRequest object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateBookPostRequest createBookPostRequest = (CreateBookPostRequest) o;
    return Objects.equals(this.bookName, createBookPostRequest.bookName) &&
        Objects.equals(this.ticker, createBookPostRequest.ticker) &&
        Objects.equals(this.pagination, createBookPostRequest.pagination) &&
        Objects.equals(this.content, createBookPostRequest.content);
  }

  @Override
  public int hashCode() {
    return Objects.hash(bookName, ticker, pagination, content);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateBookPostRequest {\n");
    sb.append("    bookName: ").append(toIndentedString(bookName)).append("\n");
    sb.append("    ticker: ").append(toIndentedString(ticker)).append("\n");
    sb.append("    pagination: ").append(toIndentedString(pagination)).append("\n");
    sb.append("    content: ").append(toIndentedString(content)).append("\n");
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

