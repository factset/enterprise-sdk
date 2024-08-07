/*
 * IRN API v1
 * Allows users to extract, create, update and configure IRN data.
 *
 * The version of the OpenAPI document: 1
 * Contact: api@factset.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.factset.sdk.IRNNotes.models;

import java.util.Objects;
import java.util.Arrays;
import java.util.Map;
import java.util.HashMap;
import com.factset.sdk.IRNNotes.models.CreateBodyDto;
import com.factset.sdk.IRNNotes.models.CreateCustomFieldValueDto;
import com.factset.sdk.IRNNotes.models.RelatedRecordsDto;
import com.factset.sdk.IRNNotes.models.UserSerialDto;
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
import com.factset.sdk.IRNNotes.JSON;


/**
 * CreateNoteDto
 */
@JsonPropertyOrder({
  CreateNoteDto.JSON_PROPERTY_AUTHOR,
  CreateNoteDto.JSON_PROPERTY_TITLE,
  CreateNoteDto.JSON_PROPERTY_IDENTIFIER,
  CreateNoteDto.JSON_PROPERTY_DATE,
  CreateNoteDto.JSON_PROPERTY_SUBJECT_ID,
  CreateNoteDto.JSON_PROPERTY_RECOMMENDATION_ID,
  CreateNoteDto.JSON_PROPERTY_SENTIMENT_ID,
  CreateNoteDto.JSON_PROPERTY_BODY,
  CreateNoteDto.JSON_PROPERTY_SOURCE,
  CreateNoteDto.JSON_PROPERTY_LINK,
  CreateNoteDto.JSON_PROPERTY_RELATED_SYMBOLS,
  CreateNoteDto.JSON_PROPERTY_RELATED_CONTACTS,
  CreateNoteDto.JSON_PROPERTY_RELATED_RECORDS,
  CreateNoteDto.JSON_PROPERTY_CUSTOM_FIELD_VALUES,
  CreateNoteDto.JSON_PROPERTY_IS_PERSONAL
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")

public class CreateNoteDto implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_AUTHOR = "author";
  private UserSerialDto author;

  public static final String JSON_PROPERTY_TITLE = "title";
  private JsonNullable<String> title = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_IDENTIFIER = "identifier";
  private JsonNullable<String> identifier = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_DATE = "date";
  private String date;

  public static final String JSON_PROPERTY_SUBJECT_ID = "subjectId";
  private JsonNullable<java.util.UUID> subjectId = JsonNullable.<java.util.UUID>undefined();

  public static final String JSON_PROPERTY_RECOMMENDATION_ID = "recommendationId";
  private JsonNullable<java.util.UUID> recommendationId = JsonNullable.<java.util.UUID>undefined();

  public static final String JSON_PROPERTY_SENTIMENT_ID = "sentimentId";
  private JsonNullable<java.util.UUID> sentimentId = JsonNullable.<java.util.UUID>undefined();

  public static final String JSON_PROPERTY_BODY = "body";
  private JsonNullable<CreateBodyDto> body = JsonNullable.<CreateBodyDto>undefined();

  public static final String JSON_PROPERTY_SOURCE = "source";
  private JsonNullable<String> source = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_LINK = "link";
  private JsonNullable<String> link = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_RELATED_SYMBOLS = "relatedSymbols";
  private JsonNullable<java.util.List<String>> relatedSymbols = JsonNullable.<java.util.List<String>>undefined();

  public static final String JSON_PROPERTY_RELATED_CONTACTS = "relatedContacts";
  private JsonNullable<java.util.List<java.util.UUID>> relatedContacts = JsonNullable.<java.util.List<java.util.UUID>>undefined();

  public static final String JSON_PROPERTY_RELATED_RECORDS = "relatedRecords";
  private JsonNullable<RelatedRecordsDto> relatedRecords = JsonNullable.<RelatedRecordsDto>undefined();

  public static final String JSON_PROPERTY_CUSTOM_FIELD_VALUES = "customFieldValues";
  private JsonNullable<java.util.List<CreateCustomFieldValueDto>> customFieldValues = JsonNullable.<java.util.List<CreateCustomFieldValueDto>>undefined();

  public static final String JSON_PROPERTY_IS_PERSONAL = "isPersonal";
  private Boolean isPersonal = false;

  public CreateNoteDto() { 
  }

  @JsonCreator
  public CreateNoteDto(
    @JsonProperty(value=JSON_PROPERTY_AUTHOR, required=true) UserSerialDto author, 
    @JsonProperty(value=JSON_PROPERTY_DATE, required=true) String date
  ) {
    this();
    this.author = author;
    this.date = date;
  }

  public CreateNoteDto author(UserSerialDto author) {
    this.author = author;
    return this;
  }

   /**
   * Get author
   * @return author
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_AUTHOR)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public UserSerialDto getAuthor() {
    return author;
  }


  @JsonProperty(JSON_PROPERTY_AUTHOR)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setAuthor(UserSerialDto author) {
    this.author = author;
  }


  public CreateNoteDto title(String title) {
    this.title = JsonNullable.<String>of(title);
    return this;
  }

   /**
   * Get title
   * @return title
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonIgnore

  public String getTitle() {
        return title.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_TITLE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getTitle_JsonNullable() {
    return title;
  }
  
  @JsonProperty(JSON_PROPERTY_TITLE)
  public void setTitle_JsonNullable(JsonNullable<String> title) {
    this.title = title;
  }

  public void setTitle(String title) {
    this.title = JsonNullable.<String>of(title);
  }


  public CreateNoteDto identifier(String identifier) {
    this.identifier = JsonNullable.<String>of(identifier);
    return this;
  }

   /**
   * Get identifier
   * @return identifier
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonIgnore

  public String getIdentifier() {
        return identifier.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_IDENTIFIER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getIdentifier_JsonNullable() {
    return identifier;
  }
  
  @JsonProperty(JSON_PROPERTY_IDENTIFIER)
  public void setIdentifier_JsonNullable(JsonNullable<String> identifier) {
    this.identifier = identifier;
  }

  public void setIdentifier(String identifier) {
    this.identifier = JsonNullable.<String>of(identifier);
  }


  public CreateNoteDto date(String date) {
    this.date = date;
    return this;
  }

   /**
   * Get date
   * @return date
  **/
  @jakarta.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_DATE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getDate() {
    return date;
  }


  @JsonProperty(JSON_PROPERTY_DATE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setDate(String date) {
    this.date = date;
  }


  public CreateNoteDto subjectId(java.util.UUID subjectId) {
    this.subjectId = JsonNullable.<java.util.UUID>of(subjectId);
    return this;
  }

   /**
   * Get subjectId
   * @return subjectId
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonIgnore

  public java.util.UUID getSubjectId() {
        return subjectId.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_SUBJECT_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<java.util.UUID> getSubjectId_JsonNullable() {
    return subjectId;
  }
  
  @JsonProperty(JSON_PROPERTY_SUBJECT_ID)
  public void setSubjectId_JsonNullable(JsonNullable<java.util.UUID> subjectId) {
    this.subjectId = subjectId;
  }

  public void setSubjectId(java.util.UUID subjectId) {
    this.subjectId = JsonNullable.<java.util.UUID>of(subjectId);
  }


  public CreateNoteDto recommendationId(java.util.UUID recommendationId) {
    this.recommendationId = JsonNullable.<java.util.UUID>of(recommendationId);
    return this;
  }

   /**
   * Get recommendationId
   * @return recommendationId
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonIgnore

  public java.util.UUID getRecommendationId() {
        return recommendationId.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_RECOMMENDATION_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<java.util.UUID> getRecommendationId_JsonNullable() {
    return recommendationId;
  }
  
  @JsonProperty(JSON_PROPERTY_RECOMMENDATION_ID)
  public void setRecommendationId_JsonNullable(JsonNullable<java.util.UUID> recommendationId) {
    this.recommendationId = recommendationId;
  }

  public void setRecommendationId(java.util.UUID recommendationId) {
    this.recommendationId = JsonNullable.<java.util.UUID>of(recommendationId);
  }


  public CreateNoteDto sentimentId(java.util.UUID sentimentId) {
    this.sentimentId = JsonNullable.<java.util.UUID>of(sentimentId);
    return this;
  }

   /**
   * Get sentimentId
   * @return sentimentId
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonIgnore

  public java.util.UUID getSentimentId() {
        return sentimentId.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_SENTIMENT_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<java.util.UUID> getSentimentId_JsonNullable() {
    return sentimentId;
  }
  
  @JsonProperty(JSON_PROPERTY_SENTIMENT_ID)
  public void setSentimentId_JsonNullable(JsonNullable<java.util.UUID> sentimentId) {
    this.sentimentId = sentimentId;
  }

  public void setSentimentId(java.util.UUID sentimentId) {
    this.sentimentId = JsonNullable.<java.util.UUID>of(sentimentId);
  }


  public CreateNoteDto body(CreateBodyDto body) {
    this.body = JsonNullable.<CreateBodyDto>of(body);
    return this;
  }

   /**
   * Get body
   * @return body
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonIgnore

  public CreateBodyDto getBody() {
        return body.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_BODY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<CreateBodyDto> getBody_JsonNullable() {
    return body;
  }
  
  @JsonProperty(JSON_PROPERTY_BODY)
  public void setBody_JsonNullable(JsonNullable<CreateBodyDto> body) {
    this.body = body;
  }

  public void setBody(CreateBodyDto body) {
    this.body = JsonNullable.<CreateBodyDto>of(body);
  }


  public CreateNoteDto source(String source) {
    this.source = JsonNullable.<String>of(source);
    return this;
  }

   /**
   * Get source
   * @return source
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonIgnore

  public String getSource() {
        return source.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_SOURCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getSource_JsonNullable() {
    return source;
  }
  
  @JsonProperty(JSON_PROPERTY_SOURCE)
  public void setSource_JsonNullable(JsonNullable<String> source) {
    this.source = source;
  }

  public void setSource(String source) {
    this.source = JsonNullable.<String>of(source);
  }


  public CreateNoteDto link(String link) {
    this.link = JsonNullable.<String>of(link);
    return this;
  }

   /**
   * Get link
   * @return link
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonIgnore

  public String getLink() {
        return link.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_LINK)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getLink_JsonNullable() {
    return link;
  }
  
  @JsonProperty(JSON_PROPERTY_LINK)
  public void setLink_JsonNullable(JsonNullable<String> link) {
    this.link = link;
  }

  public void setLink(String link) {
    this.link = JsonNullable.<String>of(link);
  }


  public CreateNoteDto relatedSymbols(java.util.List<String> relatedSymbols) {
    this.relatedSymbols = JsonNullable.<java.util.List<String>>of(relatedSymbols);
    return this;
  }

  public CreateNoteDto addRelatedSymbolsItem(String relatedSymbolsItem) {
    if (this.relatedSymbols == null || !this.relatedSymbols.isPresent()) {
      this.relatedSymbols = JsonNullable.<java.util.List<String>>of(new java.util.ArrayList<>());
    }
    try {
      this.relatedSymbols.get().add(relatedSymbolsItem);
    } catch (java.util.NoSuchElementException e) {
      // this can never happen, as we make sure above that the value is present
    }
    return this;
  }

   /**
   * Get relatedSymbols
   * @return relatedSymbols
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonIgnore

  public java.util.List<String> getRelatedSymbols() {
        return relatedSymbols.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_RELATED_SYMBOLS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<java.util.List<String>> getRelatedSymbols_JsonNullable() {
    return relatedSymbols;
  }
  
  @JsonProperty(JSON_PROPERTY_RELATED_SYMBOLS)
  public void setRelatedSymbols_JsonNullable(JsonNullable<java.util.List<String>> relatedSymbols) {
    this.relatedSymbols = relatedSymbols;
  }

  public void setRelatedSymbols(java.util.List<String> relatedSymbols) {
    this.relatedSymbols = JsonNullable.<java.util.List<String>>of(relatedSymbols);
  }


  public CreateNoteDto relatedContacts(java.util.List<java.util.UUID> relatedContacts) {
    this.relatedContacts = JsonNullable.<java.util.List<java.util.UUID>>of(relatedContacts);
    return this;
  }

  public CreateNoteDto addRelatedContactsItem(java.util.UUID relatedContactsItem) {
    if (this.relatedContacts == null || !this.relatedContacts.isPresent()) {
      this.relatedContacts = JsonNullable.<java.util.List<java.util.UUID>>of(new java.util.ArrayList<>());
    }
    try {
      this.relatedContacts.get().add(relatedContactsItem);
    } catch (java.util.NoSuchElementException e) {
      // this can never happen, as we make sure above that the value is present
    }
    return this;
  }

   /**
   * Get relatedContacts
   * @return relatedContacts
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonIgnore

  public java.util.List<java.util.UUID> getRelatedContacts() {
        return relatedContacts.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_RELATED_CONTACTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<java.util.List<java.util.UUID>> getRelatedContacts_JsonNullable() {
    return relatedContacts;
  }
  
  @JsonProperty(JSON_PROPERTY_RELATED_CONTACTS)
  public void setRelatedContacts_JsonNullable(JsonNullable<java.util.List<java.util.UUID>> relatedContacts) {
    this.relatedContacts = relatedContacts;
  }

  public void setRelatedContacts(java.util.List<java.util.UUID> relatedContacts) {
    this.relatedContacts = JsonNullable.<java.util.List<java.util.UUID>>of(relatedContacts);
  }


  public CreateNoteDto relatedRecords(RelatedRecordsDto relatedRecords) {
    this.relatedRecords = JsonNullable.<RelatedRecordsDto>of(relatedRecords);
    return this;
  }

   /**
   * Get relatedRecords
   * @return relatedRecords
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonIgnore

  public RelatedRecordsDto getRelatedRecords() {
        return relatedRecords.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_RELATED_RECORDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<RelatedRecordsDto> getRelatedRecords_JsonNullable() {
    return relatedRecords;
  }
  
  @JsonProperty(JSON_PROPERTY_RELATED_RECORDS)
  public void setRelatedRecords_JsonNullable(JsonNullable<RelatedRecordsDto> relatedRecords) {
    this.relatedRecords = relatedRecords;
  }

  public void setRelatedRecords(RelatedRecordsDto relatedRecords) {
    this.relatedRecords = JsonNullable.<RelatedRecordsDto>of(relatedRecords);
  }


  public CreateNoteDto customFieldValues(java.util.List<CreateCustomFieldValueDto> customFieldValues) {
    this.customFieldValues = JsonNullable.<java.util.List<CreateCustomFieldValueDto>>of(customFieldValues);
    return this;
  }

  public CreateNoteDto addCustomFieldValuesItem(CreateCustomFieldValueDto customFieldValuesItem) {
    if (this.customFieldValues == null || !this.customFieldValues.isPresent()) {
      this.customFieldValues = JsonNullable.<java.util.List<CreateCustomFieldValueDto>>of(new java.util.ArrayList<>());
    }
    try {
      this.customFieldValues.get().add(customFieldValuesItem);
    } catch (java.util.NoSuchElementException e) {
      // this can never happen, as we make sure above that the value is present
    }
    return this;
  }

   /**
   * Get customFieldValues
   * @return customFieldValues
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonIgnore

  public java.util.List<CreateCustomFieldValueDto> getCustomFieldValues() {
        return customFieldValues.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_CUSTOM_FIELD_VALUES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<java.util.List<CreateCustomFieldValueDto>> getCustomFieldValues_JsonNullable() {
    return customFieldValues;
  }
  
  @JsonProperty(JSON_PROPERTY_CUSTOM_FIELD_VALUES)
  public void setCustomFieldValues_JsonNullable(JsonNullable<java.util.List<CreateCustomFieldValueDto>> customFieldValues) {
    this.customFieldValues = customFieldValues;
  }

  public void setCustomFieldValues(java.util.List<CreateCustomFieldValueDto> customFieldValues) {
    this.customFieldValues = JsonNullable.<java.util.List<CreateCustomFieldValueDto>>of(customFieldValues);
  }


  public CreateNoteDto isPersonal(Boolean isPersonal) {
    this.isPersonal = isPersonal;
    return this;
  }

   /**
   * Get isPersonal
   * @return isPersonal
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_IS_PERSONAL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getIsPersonal() {
    return isPersonal;
  }


  @JsonProperty(JSON_PROPERTY_IS_PERSONAL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIsPersonal(Boolean isPersonal) {
    this.isPersonal = isPersonal;
  }


  /**
   * Return true if this CreateNoteDto object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateNoteDto createNoteDto = (CreateNoteDto) o;
    return Objects.equals(this.author, createNoteDto.author) &&
        equalsNullable(this.title, createNoteDto.title) &&
        equalsNullable(this.identifier, createNoteDto.identifier) &&
        Objects.equals(this.date, createNoteDto.date) &&
        equalsNullable(this.subjectId, createNoteDto.subjectId) &&
        equalsNullable(this.recommendationId, createNoteDto.recommendationId) &&
        equalsNullable(this.sentimentId, createNoteDto.sentimentId) &&
        equalsNullable(this.body, createNoteDto.body) &&
        equalsNullable(this.source, createNoteDto.source) &&
        equalsNullable(this.link, createNoteDto.link) &&
        equalsNullable(this.relatedSymbols, createNoteDto.relatedSymbols) &&
        equalsNullable(this.relatedContacts, createNoteDto.relatedContacts) &&
        equalsNullable(this.relatedRecords, createNoteDto.relatedRecords) &&
        equalsNullable(this.customFieldValues, createNoteDto.customFieldValues) &&
        Objects.equals(this.isPersonal, createNoteDto.isPersonal);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(author, hashCodeNullable(title), hashCodeNullable(identifier), date, hashCodeNullable(subjectId), hashCodeNullable(recommendationId), hashCodeNullable(sentimentId), hashCodeNullable(body), hashCodeNullable(source), hashCodeNullable(link), hashCodeNullable(relatedSymbols), hashCodeNullable(relatedContacts), hashCodeNullable(relatedRecords), hashCodeNullable(customFieldValues), isPersonal);
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
    sb.append("class CreateNoteDto {\n");
    sb.append("    author: ").append(toIndentedString(author)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    identifier: ").append(toIndentedString(identifier)).append("\n");
    sb.append("    date: ").append(toIndentedString(date)).append("\n");
    sb.append("    subjectId: ").append(toIndentedString(subjectId)).append("\n");
    sb.append("    recommendationId: ").append(toIndentedString(recommendationId)).append("\n");
    sb.append("    sentimentId: ").append(toIndentedString(sentimentId)).append("\n");
    sb.append("    body: ").append(toIndentedString(body)).append("\n");
    sb.append("    source: ").append(toIndentedString(source)).append("\n");
    sb.append("    link: ").append(toIndentedString(link)).append("\n");
    sb.append("    relatedSymbols: ").append(toIndentedString(relatedSymbols)).append("\n");
    sb.append("    relatedContacts: ").append(toIndentedString(relatedContacts)).append("\n");
    sb.append("    relatedRecords: ").append(toIndentedString(relatedRecords)).append("\n");
    sb.append("    customFieldValues: ").append(toIndentedString(customFieldValues)).append("\n");
    sb.append("    isPersonal: ").append(toIndentedString(isPersonal)).append("\n");
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

