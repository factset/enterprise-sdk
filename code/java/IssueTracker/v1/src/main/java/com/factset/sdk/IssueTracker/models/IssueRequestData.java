/*
 * Issue Tracker API
 * This API is used to file issues
 *
 * The version of the OpenAPI document: 1.0.0
 * Contact: api@factset.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.factset.sdk.IssueTracker.models;

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
import com.factset.sdk.IssueTracker.JSON;


/**
 * IssueRequestData
 */
@JsonPropertyOrder({
  IssueRequestData.JSON_PROPERTY_SUBJECT,
  IssueRequestData.JSON_PROPERTY_DESCRIPTION,
  IssueRequestData.JSON_PROPERTY_PRODUCT_ID,
  IssueRequestData.JSON_PROPERTY_CATEGORY_ID
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")

public class IssueRequestData implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_SUBJECT = "subject";
  private String subject;

  public static final String JSON_PROPERTY_DESCRIPTION = "description";
  private String description;

  public static final String JSON_PROPERTY_PRODUCT_ID = "productId";
  private String productId;

  public static final String JSON_PROPERTY_CATEGORY_ID = "categoryId";
  private String categoryId;

  public IssueRequestData() { 
  }

  @JsonCreator
  public IssueRequestData(
    @JsonProperty(value=JSON_PROPERTY_SUBJECT, required=true) String subject, 
    @JsonProperty(value=JSON_PROPERTY_DESCRIPTION, required=true) String description, 
    @JsonProperty(value=JSON_PROPERTY_PRODUCT_ID, required=true) String productId
  ) {
    this();
    this.subject = subject;
    this.description = description;
    this.productId = productId;
  }

  public IssueRequestData subject(String subject) {
    this.subject = subject;
    return this;
  }

   /**
   * subject for new Issue Tracker issue
   * @return subject
  **/
  @jakarta.annotation.Nonnull
  @ApiModelProperty(required = true, value = "subject for new Issue Tracker issue")
  @JsonProperty(JSON_PROPERTY_SUBJECT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getSubject() {
    return subject;
  }


  @JsonProperty(JSON_PROPERTY_SUBJECT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setSubject(String subject) {
    this.subject = subject;
  }


  public IssueRequestData description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Comprehensive description of the issue, including any problems you&#39;ve observed or any specific changes you&#39;d like to request.
   * @return description
  **/
  @jakarta.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Comprehensive description of the issue, including any problems you've observed or any specific changes you'd like to request.")
  @JsonProperty(JSON_PROPERTY_DESCRIPTION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getDescription() {
    return description;
  }


  @JsonProperty(JSON_PROPERTY_DESCRIPTION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setDescription(String description) {
    this.description = description;
  }


  public IssueRequestData productId(String productId) {
    this.productId = productId;
    return this;
  }

   /**
   * Issue Tracker product 
   * @return productId
  **/
  @jakarta.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Issue Tracker product ")
  @JsonProperty(JSON_PROPERTY_PRODUCT_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getProductId() {
    return productId;
  }


  @JsonProperty(JSON_PROPERTY_PRODUCT_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setProductId(String productId) {
    this.productId = productId;
  }


  public IssueRequestData categoryId(String categoryId) {
    this.categoryId = categoryId;
    return this;
  }

   /**
   * category of Factset Product. 
   * @return categoryId
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "category of Factset Product. ")
  @JsonProperty(JSON_PROPERTY_CATEGORY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCategoryId() {
    return categoryId;
  }


  @JsonProperty(JSON_PROPERTY_CATEGORY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCategoryId(String categoryId) {
    this.categoryId = categoryId;
  }


  /**
   * Return true if this issueRequest_data object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IssueRequestData issueRequestData = (IssueRequestData) o;
    return Objects.equals(this.subject, issueRequestData.subject) &&
        Objects.equals(this.description, issueRequestData.description) &&
        Objects.equals(this.productId, issueRequestData.productId) &&
        Objects.equals(this.categoryId, issueRequestData.categoryId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(subject, description, productId, categoryId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IssueRequestData {\n");
    sb.append("    subject: ").append(toIndentedString(subject)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    productId: ").append(toIndentedString(productId)).append("\n");
    sb.append("    categoryId: ").append(toIndentedString(categoryId)).append("\n");
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

