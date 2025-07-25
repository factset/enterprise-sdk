/*
 * Open:FactSet Marketplace API
 * This API provides read-only access to marketplace products and partners.
 *
 * The version of the OpenAPI document: 3.0.0
 * Contact: api@factset.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.factset.sdk.OpenFactSetMarketplace.models;

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
import com.factset.sdk.OpenFactSetMarketplace.JSON;


/**
 * Partner social media URLs
 */
@ApiModel(description = "Partner social media URLs")
@JsonPropertyOrder({
  PartnerSocialMedia.JSON_PROPERTY_LINKEDIN,
  PartnerSocialMedia.JSON_PROPERTY_X,
  PartnerSocialMedia.JSON_PROPERTY_FACEBOOK
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")

public class PartnerSocialMedia implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_LINKEDIN = "linkedin";
  private String linkedin;

  public static final String JSON_PROPERTY_X = "x";
  private String x;

  public static final String JSON_PROPERTY_FACEBOOK = "facebook";
  private String facebook;

  public PartnerSocialMedia() { 
  }

  public PartnerSocialMedia linkedin(String linkedin) {
    this.linkedin = linkedin;
    return this;
  }

   /**
   * Partner LinkedIn URL
   * @return linkedin
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "https://www.linkedin.com/company/factset", value = "Partner LinkedIn URL")
  @JsonProperty(JSON_PROPERTY_LINKEDIN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getLinkedin() {
    return linkedin;
  }


  @JsonProperty(JSON_PROPERTY_LINKEDIN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLinkedin(String linkedin) {
    this.linkedin = linkedin;
  }


  public PartnerSocialMedia x(String x) {
    this.x = x;
    return this;
  }

   /**
   * Partner X URL
   * @return x
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "https://x.com/factset", value = "Partner X URL")
  @JsonProperty(JSON_PROPERTY_X)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getX() {
    return x;
  }


  @JsonProperty(JSON_PROPERTY_X)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setX(String x) {
    this.x = x;
  }


  public PartnerSocialMedia facebook(String facebook) {
    this.facebook = facebook;
    return this;
  }

   /**
   * Partner Facebook URL
   * @return facebook
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "https://www.facebook.com/factset", value = "Partner Facebook URL")
  @JsonProperty(JSON_PROPERTY_FACEBOOK)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getFacebook() {
    return facebook;
  }


  @JsonProperty(JSON_PROPERTY_FACEBOOK)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFacebook(String facebook) {
    this.facebook = facebook;
  }


  /**
   * Return true if this Partner_socialMedia object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PartnerSocialMedia partnerSocialMedia = (PartnerSocialMedia) o;
    return Objects.equals(this.linkedin, partnerSocialMedia.linkedin) &&
        Objects.equals(this.x, partnerSocialMedia.x) &&
        Objects.equals(this.facebook, partnerSocialMedia.facebook);
  }

  @Override
  public int hashCode() {
    return Objects.hash(linkedin, x, facebook);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PartnerSocialMedia {\n");
    sb.append("    linkedin: ").append(toIndentedString(linkedin)).append("\n");
    sb.append("    x: ").append(toIndentedString(x)).append("\n");
    sb.append("    facebook: ").append(toIndentedString(facebook)).append("\n");
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

