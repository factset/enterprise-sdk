/*
 * FactSet Funds API
 * FactSet Mutual Funds data offers over 50 fund- and share class-specific data points for mutual funds listed in the United States. <p>FactSet Mutual Funds Reference provides fund-specific reference information as well as FactSet's proprietary classification system. It includes but is not limited to the following coverage    * Fund descriptions    * A seven-tier classification system   * Leverage information   * Fees and expenses    * Portfolio managers       FactSet Mutual Funds Time Series provides quantitative data items on a historical basis. It includes but is not limited to the following coverage    * Net asset value   * Fund flows    * Assets under management   * Total return  <p>This API is rate-limited to 10 requests per second and 10 concurrent requests per user.</p> 
 *
 * The version of the OpenAPI document: 1.4.0
 * Contact: api@factset.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.factset.sdk.FactSetFunds.models;

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
import com.factset.sdk.FactSetFunds.JSON;


/**
 * Managers
 */
@JsonPropertyOrder({
  Managers.JSON_PROPERTY_FSYM_ID,
  Managers.JSON_PROPERTY_MANAGER_NAME,
  Managers.JSON_PROPERTY_MANAGER_TITLE,
  Managers.JSON_PROPERTY_MANAGER_PHONE,
  Managers.JSON_PROPERTY_MANAGER_INCEPTION_DATE,
  Managers.JSON_PROPERTY_MANAGER_JOB_ID,
  Managers.JSON_PROPERTY_REQUEST_ID
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")

public class Managers implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_FSYM_ID = "fsymId";
  private JsonNullable<String> fsymId = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_MANAGER_NAME = "managerName";
  private JsonNullable<String> managerName = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_MANAGER_TITLE = "managerTitle";
  private JsonNullable<String> managerTitle = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_MANAGER_PHONE = "managerPhone";
  private JsonNullable<String> managerPhone = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_MANAGER_INCEPTION_DATE = "managerInceptionDate";
  private JsonNullable<LocalDate> managerInceptionDate = JsonNullable.<LocalDate>undefined();

  public static final String JSON_PROPERTY_MANAGER_JOB_ID = "managerJobId";
  private JsonNullable<Integer> managerJobId = JsonNullable.<Integer>undefined();

  public static final String JSON_PROPERTY_REQUEST_ID = "requestId";
  private String requestId;

  public Managers() { 
  }

  public Managers fsymId(String fsymId) {
    this.fsymId = JsonNullable.<String>of(fsymId);
    return this;
  }

   /**
   * FactSet Security Identifier. Six alpha-numeric characters, excluding vowels, with a -S suffix (XXXXXX-S), resolved from the requestId of the Fund requested.
   * @return fsymId
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "FNK7XP-S", value = "FactSet Security Identifier. Six alpha-numeric characters, excluding vowels, with a -S suffix (XXXXXX-S), resolved from the requestId of the Fund requested.")
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


  public Managers managerName(String managerName) {
    this.managerName = JsonNullable.<String>of(managerName);
    return this;
  }

   /**
   * Proper Name of the Fund Manager
   * @return managerName
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "Mr. Antonio DeSpirito III", value = "Proper Name of the Fund Manager")
  @JsonIgnore

  public String getManagerName() {
        return managerName.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_MANAGER_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getManagerName_JsonNullable() {
    return managerName;
  }
  
  @JsonProperty(JSON_PROPERTY_MANAGER_NAME)
  public void setManagerName_JsonNullable(JsonNullable<String> managerName) {
    this.managerName = managerName;
  }

  public void setManagerName(String managerName) {
    this.managerName = JsonNullable.<String>of(managerName);
  }


  public Managers managerTitle(String managerTitle) {
    this.managerTitle = JsonNullable.<String>of(managerTitle);
    return this;
  }

   /**
   * Proper Title of the Fund Manager
   * @return managerTitle
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "Managing Director", value = "Proper Title of the Fund Manager")
  @JsonIgnore

  public String getManagerTitle() {
        return managerTitle.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_MANAGER_TITLE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getManagerTitle_JsonNullable() {
    return managerTitle;
  }
  
  @JsonProperty(JSON_PROPERTY_MANAGER_TITLE)
  public void setManagerTitle_JsonNullable(JsonNullable<String> managerTitle) {
    this.managerTitle = managerTitle;
  }

  public void setManagerTitle(String managerTitle) {
    this.managerTitle = JsonNullable.<String>of(managerTitle);
  }


  public Managers managerPhone(String managerPhone) {
    this.managerPhone = JsonNullable.<String>of(managerPhone);
    return this;
  }

   /**
   * Phone Number of the Fund Manager
   * @return managerPhone
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "1.212.810.5300", value = "Phone Number of the Fund Manager")
  @JsonIgnore

  public String getManagerPhone() {
        return managerPhone.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_MANAGER_PHONE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getManagerPhone_JsonNullable() {
    return managerPhone;
  }
  
  @JsonProperty(JSON_PROPERTY_MANAGER_PHONE)
  public void setManagerPhone_JsonNullable(JsonNullable<String> managerPhone) {
    this.managerPhone = managerPhone;
  }

  public void setManagerPhone(String managerPhone) {
    this.managerPhone = JsonNullable.<String>of(managerPhone);
  }


  public Managers managerInceptionDate(LocalDate managerInceptionDate) {
    this.managerInceptionDate = JsonNullable.<LocalDate>of(managerInceptionDate);
    return this;
  }

   /**
   * Inception Date of the Fund Manager
   * @return managerInceptionDate
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "Wed Jan 01 00:00:00 UTC 2014", value = "Inception Date of the Fund Manager")
  @JsonIgnore

  public LocalDate getManagerInceptionDate() {
        return managerInceptionDate.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_MANAGER_INCEPTION_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<LocalDate> getManagerInceptionDate_JsonNullable() {
    return managerInceptionDate;
  }
  
  @JsonProperty(JSON_PROPERTY_MANAGER_INCEPTION_DATE)
  public void setManagerInceptionDate_JsonNullable(JsonNullable<LocalDate> managerInceptionDate) {
    this.managerInceptionDate = managerInceptionDate;
  }

  public void setManagerInceptionDate(LocalDate managerInceptionDate) {
    this.managerInceptionDate = JsonNullable.<LocalDate>of(managerInceptionDate);
  }


  public Managers managerJobId(Integer managerJobId) {
    this.managerJobId = JsonNullable.<Integer>of(managerJobId);
    return this;
  }

   /**
   * Job Identifier for the Fund Manager
   * @return managerJobId
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "6721381", value = "Job Identifier for the Fund Manager")
  @JsonIgnore

  public Integer getManagerJobId() {
        return managerJobId.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_MANAGER_JOB_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Integer> getManagerJobId_JsonNullable() {
    return managerJobId;
  }
  
  @JsonProperty(JSON_PROPERTY_MANAGER_JOB_ID)
  public void setManagerJobId_JsonNullable(JsonNullable<Integer> managerJobId) {
    this.managerJobId = managerJobId;
  }

  public void setManagerJobId(Integer managerJobId) {
    this.managerJobId = JsonNullable.<Integer>of(managerJobId);
  }


  public Managers requestId(String requestId) {
    this.requestId = requestId;
    return this;
  }

   /**
   * The requested Id sent as input.
   * @return requestId
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "MABAX", value = "The requested Id sent as input.")
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
   * Return true if this managers object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Managers managers = (Managers) o;
    return equalsNullable(this.fsymId, managers.fsymId) &&
        equalsNullable(this.managerName, managers.managerName) &&
        equalsNullable(this.managerTitle, managers.managerTitle) &&
        equalsNullable(this.managerPhone, managers.managerPhone) &&
        equalsNullable(this.managerInceptionDate, managers.managerInceptionDate) &&
        equalsNullable(this.managerJobId, managers.managerJobId) &&
        Objects.equals(this.requestId, managers.requestId);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(hashCodeNullable(fsymId), hashCodeNullable(managerName), hashCodeNullable(managerTitle), hashCodeNullable(managerPhone), hashCodeNullable(managerInceptionDate), hashCodeNullable(managerJobId), requestId);
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
    sb.append("class Managers {\n");
    sb.append("    fsymId: ").append(toIndentedString(fsymId)).append("\n");
    sb.append("    managerName: ").append(toIndentedString(managerName)).append("\n");
    sb.append("    managerTitle: ").append(toIndentedString(managerTitle)).append("\n");
    sb.append("    managerPhone: ").append(toIndentedString(managerPhone)).append("\n");
    sb.append("    managerInceptionDate: ").append(toIndentedString(managerInceptionDate)).append("\n");
    sb.append("    managerJobId: ").append(toIndentedString(managerJobId)).append("\n");
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

