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
 * Basic information about a person entity.
 */
@ApiModel(description = "Basic information about a person entity.")
@JsonPropertyOrder({
  Profile.JSON_PROPERTY_REQUEST_ID,
  Profile.JSON_PROPERTY_PERSON_ID,
  Profile.JSON_PROPERTY_LAST_NAME,
  Profile.JSON_PROPERTY_FACTSET_NAME,
  Profile.JSON_PROPERTY_FIRST_NAME,
  Profile.JSON_PROPERTY_MIDDLE_NAME,
  Profile.JSON_PROPERTY_FORMAL_NAME,
  Profile.JSON_PROPERTY_PROPER_NAME,
  Profile.JSON_PROPERTY_SALUTATION,
  Profile.JSON_PROPERTY_HIGHEST_DEGREE,
  Profile.JSON_PROPERTY_HIGHEST_DEGREE_INST,
  Profile.JSON_PROPERTY_SUFFIX,
  Profile.JSON_PROPERTY_AGE,
  Profile.JSON_PROPERTY_GENDER,
  Profile.JSON_PROPERTY_SALARY,
  Profile.JSON_PROPERTY_TOTAL_COMPENSATION,
  Profile.JSON_PROPERTY_PRIMARY_COMPANY_ID,
  Profile.JSON_PROPERTY_PRIMARY_COMPANY_NAME,
  Profile.JSON_PROPERTY_PRIMARY_TITLE,
  Profile.JSON_PROPERTY_BIOGRAPHY
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")

public class Profile implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_REQUEST_ID = "requestId";
  private String requestId;

  public static final String JSON_PROPERTY_PERSON_ID = "personId";
  private JsonNullable<String> personId = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_LAST_NAME = "lastName";
  private JsonNullable<String> lastName = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_FACTSET_NAME = "factsetName";
  private JsonNullable<String> factsetName = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_FIRST_NAME = "firstName";
  private JsonNullable<String> firstName = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_MIDDLE_NAME = "middleName";
  private JsonNullable<String> middleName = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_FORMAL_NAME = "formalName";
  private JsonNullable<String> formalName = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_PROPER_NAME = "properName";
  private JsonNullable<String> properName = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_SALUTATION = "salutation";
  private JsonNullable<String> salutation = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_HIGHEST_DEGREE = "highestDegree";
  private JsonNullable<String> highestDegree = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_HIGHEST_DEGREE_INST = "highestDegreeInst";
  private JsonNullable<String> highestDegreeInst = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_SUFFIX = "suffix";
  private JsonNullable<String> suffix = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_AGE = "age";
  private JsonNullable<BigDecimal> age = JsonNullable.<BigDecimal>undefined();

  public static final String JSON_PROPERTY_GENDER = "gender";
  private JsonNullable<String> gender = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_SALARY = "salary";
  private JsonNullable<BigDecimal> salary = JsonNullable.<BigDecimal>undefined();

  public static final String JSON_PROPERTY_TOTAL_COMPENSATION = "totalCompensation";
  private JsonNullable<BigDecimal> totalCompensation = JsonNullable.<BigDecimal>undefined();

  public static final String JSON_PROPERTY_PRIMARY_COMPANY_ID = "primaryCompanyId";
  private JsonNullable<String> primaryCompanyId = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_PRIMARY_COMPANY_NAME = "primaryCompanyName";
  private JsonNullable<String> primaryCompanyName = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_PRIMARY_TITLE = "primaryTitle";
  private JsonNullable<String> primaryTitle = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_BIOGRAPHY = "biography";
  private JsonNullable<String> biography = JsonNullable.<String>undefined();

  public Profile() { 
  }

  public Profile requestId(String requestId) {
    this.requestId = requestId;
    return this;
  }

   /**
   * Person identifier used in the request.
   * @return requestId
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "0DPHLH-E", value = "Person identifier used in the request.")
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


  public Profile personId(String personId) {
    this.personId = JsonNullable.<String>of(personId);
    return this;
  }

   /**
   * FactSet Entity Identifier for the Person
   * @return personId
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "0DPHLH-E", value = "FactSet Entity Identifier for the Person")
  @JsonIgnore

  public String getPersonId() {
        return personId.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_PERSON_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getPersonId_JsonNullable() {
    return personId;
  }
  
  @JsonProperty(JSON_PROPERTY_PERSON_ID)
  public void setPersonId_JsonNullable(JsonNullable<String> personId) {
    this.personId = personId;
  }

  public void setPersonId(String personId) {
    this.personId = JsonNullable.<String>of(personId);
  }


  public Profile lastName(String lastName) {
    this.lastName = JsonNullable.<String>of(lastName);
    return this;
  }

   /**
   * Last Name
   * @return lastName
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "Snow", value = "Last Name")
  @JsonIgnore

  public String getLastName() {
        return lastName.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_LAST_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getLastName_JsonNullable() {
    return lastName;
  }
  
  @JsonProperty(JSON_PROPERTY_LAST_NAME)
  public void setLastName_JsonNullable(JsonNullable<String> lastName) {
    this.lastName = lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = JsonNullable.<String>of(lastName);
  }


  public Profile factsetName(String factsetName) {
    this.factsetName = JsonNullable.<String>of(factsetName);
    return this;
  }

   /**
   * Name
   * @return factsetName
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "Philip Snow", value = "Name")
  @JsonIgnore

  public String getFactsetName() {
        return factsetName.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_FACTSET_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getFactsetName_JsonNullable() {
    return factsetName;
  }
  
  @JsonProperty(JSON_PROPERTY_FACTSET_NAME)
  public void setFactsetName_JsonNullable(JsonNullable<String> factsetName) {
    this.factsetName = factsetName;
  }

  public void setFactsetName(String factsetName) {
    this.factsetName = JsonNullable.<String>of(factsetName);
  }


  public Profile firstName(String firstName) {
    this.firstName = JsonNullable.<String>of(firstName);
    return this;
  }

   /**
   * First Name
   * @return firstName
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "Frederick", value = "First Name")
  @JsonIgnore

  public String getFirstName() {
        return firstName.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_FIRST_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getFirstName_JsonNullable() {
    return firstName;
  }
  
  @JsonProperty(JSON_PROPERTY_FIRST_NAME)
  public void setFirstName_JsonNullable(JsonNullable<String> firstName) {
    this.firstName = firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = JsonNullable.<String>of(firstName);
  }


  public Profile middleName(String middleName) {
    this.middleName = JsonNullable.<String>of(middleName);
    return this;
  }

   /**
   * Middle Name
   * @return middleName
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "Philip", value = "Middle Name")
  @JsonIgnore

  public String getMiddleName() {
        return middleName.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_MIDDLE_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getMiddleName_JsonNullable() {
    return middleName;
  }
  
  @JsonProperty(JSON_PROPERTY_MIDDLE_NAME)
  public void setMiddleName_JsonNullable(JsonNullable<String> middleName) {
    this.middleName = middleName;
  }

  public void setMiddleName(String middleName) {
    this.middleName = JsonNullable.<String>of(middleName);
  }


  public Profile formalName(String formalName) {
    this.formalName = JsonNullable.<String>of(formalName);
    return this;
  }

   /**
   * Formal Name
   * @return formalName
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "Frederick Philip Snow", value = "Formal Name")
  @JsonIgnore

  public String getFormalName() {
        return formalName.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_FORMAL_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getFormalName_JsonNullable() {
    return formalName;
  }
  
  @JsonProperty(JSON_PROPERTY_FORMAL_NAME)
  public void setFormalName_JsonNullable(JsonNullable<String> formalName) {
    this.formalName = formalName;
  }

  public void setFormalName(String formalName) {
    this.formalName = JsonNullable.<String>of(formalName);
  }


  public Profile properName(String properName) {
    this.properName = JsonNullable.<String>of(properName);
    return this;
  }

   /**
   * Proper Name
   * @return properName
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "Snow Frederick Philip CFA", value = "Proper Name")
  @JsonIgnore

  public String getProperName() {
        return properName.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_PROPER_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getProperName_JsonNullable() {
    return properName;
  }
  
  @JsonProperty(JSON_PROPERTY_PROPER_NAME)
  public void setProperName_JsonNullable(JsonNullable<String> properName) {
    this.properName = properName;
  }

  public void setProperName(String properName) {
    this.properName = JsonNullable.<String>of(properName);
  }


  public Profile salutation(String salutation) {
    this.salutation = JsonNullable.<String>of(salutation);
    return this;
  }

   /**
   * Primary Salutation of Name
   * @return salutation
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "Mr.", value = "Primary Salutation of Name")
  @JsonIgnore

  public String getSalutation() {
        return salutation.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_SALUTATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getSalutation_JsonNullable() {
    return salutation;
  }
  
  @JsonProperty(JSON_PROPERTY_SALUTATION)
  public void setSalutation_JsonNullable(JsonNullable<String> salutation) {
    this.salutation = salutation;
  }

  public void setSalutation(String salutation) {
    this.salutation = JsonNullable.<String>of(salutation);
  }


  public Profile highestDegree(String highestDegree) {
    this.highestDegree = JsonNullable.<String>of(highestDegree);
    return this;
  }

   /**
   * The Highest Held Degree Code.
   * @return highestDegree
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "GRD", value = "The Highest Held Degree Code.")
  @JsonIgnore

  public String getHighestDegree() {
        return highestDegree.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_HIGHEST_DEGREE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getHighestDegree_JsonNullable() {
    return highestDegree;
  }
  
  @JsonProperty(JSON_PROPERTY_HIGHEST_DEGREE)
  public void setHighestDegree_JsonNullable(JsonNullable<String> highestDegree) {
    this.highestDegree = highestDegree;
  }

  public void setHighestDegree(String highestDegree) {
    this.highestDegree = JsonNullable.<String>of(highestDegree);
  }


  public Profile highestDegreeInst(String highestDegreeInst) {
    this.highestDegreeInst = JsonNullable.<String>of(highestDegreeInst);
    return this;
  }

   /**
   * The Highest Degree Institution Name.
   * @return highestDegreeInst
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "Thunderbird School of Global Management", value = "The Highest Degree Institution Name.")
  @JsonIgnore

  public String getHighestDegreeInst() {
        return highestDegreeInst.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_HIGHEST_DEGREE_INST)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getHighestDegreeInst_JsonNullable() {
    return highestDegreeInst;
  }
  
  @JsonProperty(JSON_PROPERTY_HIGHEST_DEGREE_INST)
  public void setHighestDegreeInst_JsonNullable(JsonNullable<String> highestDegreeInst) {
    this.highestDegreeInst = highestDegreeInst;
  }

  public void setHighestDegreeInst(String highestDegreeInst) {
    this.highestDegreeInst = JsonNullable.<String>of(highestDegreeInst);
  }


  public Profile suffix(String suffix) {
    this.suffix = JsonNullable.<String>of(suffix);
    return this;
  }

   /**
   * Suffix of Name
   * @return suffix
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "CFA", value = "Suffix of Name")
  @JsonIgnore

  public String getSuffix() {
        return suffix.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_SUFFIX)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getSuffix_JsonNullable() {
    return suffix;
  }
  
  @JsonProperty(JSON_PROPERTY_SUFFIX)
  public void setSuffix_JsonNullable(JsonNullable<String> suffix) {
    this.suffix = suffix;
  }

  public void setSuffix(String suffix) {
    this.suffix = JsonNullable.<String>of(suffix);
  }


  public Profile age(BigDecimal age) {
    this.age = JsonNullable.<BigDecimal>of(age);
    return this;
  }

   /**
   * Person&#39;s age in years.
   * @return age
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "57", value = "Person's age in years.")
  @JsonIgnore

  public BigDecimal getAge() {
        return age.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_AGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<BigDecimal> getAge_JsonNullable() {
    return age;
  }
  
  @JsonProperty(JSON_PROPERTY_AGE)
  public void setAge_JsonNullable(JsonNullable<BigDecimal> age) {
    this.age = age;
  }

  public void setAge(BigDecimal age) {
    this.age = JsonNullable.<BigDecimal>of(age);
  }


  public Profile gender(String gender) {
    this.gender = JsonNullable.<String>of(gender);
    return this;
  }

   /**
   * Person&#39;s Gender.
   * @return gender
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "Male", value = "Person's Gender.")
  @JsonIgnore

  public String getGender() {
        return gender.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_GENDER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getGender_JsonNullable() {
    return gender;
  }
  
  @JsonProperty(JSON_PROPERTY_GENDER)
  public void setGender_JsonNullable(JsonNullable<String> gender) {
    this.gender = gender;
  }

  public void setGender(String gender) {
    this.gender = JsonNullable.<String>of(gender);
  }


  public Profile salary(BigDecimal salary) {
    this.salary = JsonNullable.<BigDecimal>of(salary);
    return this;
  }

   /**
   * Most Recent Salary
   * @return salary
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "525846", value = "Most Recent Salary")
  @JsonIgnore

  public BigDecimal getSalary() {
        return salary.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_SALARY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<BigDecimal> getSalary_JsonNullable() {
    return salary;
  }
  
  @JsonProperty(JSON_PROPERTY_SALARY)
  public void setSalary_JsonNullable(JsonNullable<BigDecimal> salary) {
    this.salary = salary;
  }

  public void setSalary(BigDecimal salary) {
    this.salary = JsonNullable.<BigDecimal>of(salary);
  }


  public Profile totalCompensation(BigDecimal totalCompensation) {
    this.totalCompensation = JsonNullable.<BigDecimal>of(totalCompensation);
    return this;
  }

   /**
   * Most Recent Total Compensation
   * @return totalCompensation
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "4719062", value = "Most Recent Total Compensation")
  @JsonIgnore

  public BigDecimal getTotalCompensation() {
        return totalCompensation.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_TOTAL_COMPENSATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<BigDecimal> getTotalCompensation_JsonNullable() {
    return totalCompensation;
  }
  
  @JsonProperty(JSON_PROPERTY_TOTAL_COMPENSATION)
  public void setTotalCompensation_JsonNullable(JsonNullable<BigDecimal> totalCompensation) {
    this.totalCompensation = totalCompensation;
  }

  public void setTotalCompensation(BigDecimal totalCompensation) {
    this.totalCompensation = JsonNullable.<BigDecimal>of(totalCompensation);
  }


  public Profile primaryCompanyId(String primaryCompanyId) {
    this.primaryCompanyId = JsonNullable.<String>of(primaryCompanyId);
    return this;
  }

   /**
   * Entity identifier of primary &#x60;Company&#x60; of employment.
   * @return primaryCompanyId
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "0016YD-E", value = "Entity identifier of primary `Company` of employment.")
  @JsonIgnore

  public String getPrimaryCompanyId() {
        return primaryCompanyId.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_PRIMARY_COMPANY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getPrimaryCompanyId_JsonNullable() {
    return primaryCompanyId;
  }
  
  @JsonProperty(JSON_PROPERTY_PRIMARY_COMPANY_ID)
  public void setPrimaryCompanyId_JsonNullable(JsonNullable<String> primaryCompanyId) {
    this.primaryCompanyId = primaryCompanyId;
  }

  public void setPrimaryCompanyId(String primaryCompanyId) {
    this.primaryCompanyId = JsonNullable.<String>of(primaryCompanyId);
  }


  public Profile primaryCompanyName(String primaryCompanyName) {
    this.primaryCompanyName = JsonNullable.<String>of(primaryCompanyName);
    return this;
  }

   /**
   * Name of primary company of employment
   * @return primaryCompanyName
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "FactSet Research Systems, Inc.", value = "Name of primary company of employment")
  @JsonIgnore

  public String getPrimaryCompanyName() {
        return primaryCompanyName.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_PRIMARY_COMPANY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getPrimaryCompanyName_JsonNullable() {
    return primaryCompanyName;
  }
  
  @JsonProperty(JSON_PROPERTY_PRIMARY_COMPANY_NAME)
  public void setPrimaryCompanyName_JsonNullable(JsonNullable<String> primaryCompanyName) {
    this.primaryCompanyName = primaryCompanyName;
  }

  public void setPrimaryCompanyName(String primaryCompanyName) {
    this.primaryCompanyName = JsonNullable.<String>of(primaryCompanyName);
  }


  public Profile primaryTitle(String primaryTitle) {
    this.primaryTitle = JsonNullable.<String>of(primaryTitle);
    return this;
  }

   /**
   * Title at primary &#x60;Company&#x60; of employment
   * @return primaryTitle
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "Chief Executive Officer & Director", value = "Title at primary `Company` of employment")
  @JsonIgnore

  public String getPrimaryTitle() {
        return primaryTitle.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_PRIMARY_TITLE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getPrimaryTitle_JsonNullable() {
    return primaryTitle;
  }
  
  @JsonProperty(JSON_PROPERTY_PRIMARY_TITLE)
  public void setPrimaryTitle_JsonNullable(JsonNullable<String> primaryTitle) {
    this.primaryTitle = primaryTitle;
  }

  public void setPrimaryTitle(String primaryTitle) {
    this.primaryTitle = JsonNullable.<String>of(primaryTitle);
  }


  public Profile biography(String biography) {
    this.biography = JsonNullable.<String>of(biography);
    return this;
  }

   /**
   * Brief biography of the person requested.
   * @return biography
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "Frederick Philip Snow is Chief Executive Officer & Director at FactSet Research Systems, Inc. He is also on the board of FactSet Systems India Pvt Ltd., Quantopian, Inc. and Vermilion Holdings Ltd. and Member of CFA Institute. Mr. Snow received an undergraduate degree from the University of California, Berkeley and a graduate degree from Thunderbird School of Global Management.", value = "Brief biography of the person requested.")
  @JsonIgnore

  public String getBiography() {
        return biography.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_BIOGRAPHY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getBiography_JsonNullable() {
    return biography;
  }
  
  @JsonProperty(JSON_PROPERTY_BIOGRAPHY)
  public void setBiography_JsonNullable(JsonNullable<String> biography) {
    this.biography = biography;
  }

  public void setBiography(String biography) {
    this.biography = JsonNullable.<String>of(biography);
  }


  /**
   * Return true if this profile object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Profile profile = (Profile) o;
    return Objects.equals(this.requestId, profile.requestId) &&
        equalsNullable(this.personId, profile.personId) &&
        equalsNullable(this.lastName, profile.lastName) &&
        equalsNullable(this.factsetName, profile.factsetName) &&
        equalsNullable(this.firstName, profile.firstName) &&
        equalsNullable(this.middleName, profile.middleName) &&
        equalsNullable(this.formalName, profile.formalName) &&
        equalsNullable(this.properName, profile.properName) &&
        equalsNullable(this.salutation, profile.salutation) &&
        equalsNullable(this.highestDegree, profile.highestDegree) &&
        equalsNullable(this.highestDegreeInst, profile.highestDegreeInst) &&
        equalsNullable(this.suffix, profile.suffix) &&
        equalsNullable(this.age, profile.age) &&
        equalsNullable(this.gender, profile.gender) &&
        equalsNullable(this.salary, profile.salary) &&
        equalsNullable(this.totalCompensation, profile.totalCompensation) &&
        equalsNullable(this.primaryCompanyId, profile.primaryCompanyId) &&
        equalsNullable(this.primaryCompanyName, profile.primaryCompanyName) &&
        equalsNullable(this.primaryTitle, profile.primaryTitle) &&
        equalsNullable(this.biography, profile.biography);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(requestId, hashCodeNullable(personId), hashCodeNullable(lastName), hashCodeNullable(factsetName), hashCodeNullable(firstName), hashCodeNullable(middleName), hashCodeNullable(formalName), hashCodeNullable(properName), hashCodeNullable(salutation), hashCodeNullable(highestDegree), hashCodeNullable(highestDegreeInst), hashCodeNullable(suffix), hashCodeNullable(age), hashCodeNullable(gender), hashCodeNullable(salary), hashCodeNullable(totalCompensation), hashCodeNullable(primaryCompanyId), hashCodeNullable(primaryCompanyName), hashCodeNullable(primaryTitle), hashCodeNullable(biography));
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
    sb.append("class Profile {\n");
    sb.append("    requestId: ").append(toIndentedString(requestId)).append("\n");
    sb.append("    personId: ").append(toIndentedString(personId)).append("\n");
    sb.append("    lastName: ").append(toIndentedString(lastName)).append("\n");
    sb.append("    factsetName: ").append(toIndentedString(factsetName)).append("\n");
    sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
    sb.append("    middleName: ").append(toIndentedString(middleName)).append("\n");
    sb.append("    formalName: ").append(toIndentedString(formalName)).append("\n");
    sb.append("    properName: ").append(toIndentedString(properName)).append("\n");
    sb.append("    salutation: ").append(toIndentedString(salutation)).append("\n");
    sb.append("    highestDegree: ").append(toIndentedString(highestDegree)).append("\n");
    sb.append("    highestDegreeInst: ").append(toIndentedString(highestDegreeInst)).append("\n");
    sb.append("    suffix: ").append(toIndentedString(suffix)).append("\n");
    sb.append("    age: ").append(toIndentedString(age)).append("\n");
    sb.append("    gender: ").append(toIndentedString(gender)).append("\n");
    sb.append("    salary: ").append(toIndentedString(salary)).append("\n");
    sb.append("    totalCompensation: ").append(toIndentedString(totalCompensation)).append("\n");
    sb.append("    primaryCompanyId: ").append(toIndentedString(primaryCompanyId)).append("\n");
    sb.append("    primaryCompanyName: ").append(toIndentedString(primaryCompanyName)).append("\n");
    sb.append("    primaryTitle: ").append(toIndentedString(primaryTitle)).append("\n");
    sb.append("    biography: ").append(toIndentedString(biography)).append("\n");
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

