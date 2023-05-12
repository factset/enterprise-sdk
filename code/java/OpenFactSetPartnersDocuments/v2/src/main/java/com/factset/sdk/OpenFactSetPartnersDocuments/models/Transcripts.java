/*
 * Open:FactSet - Partners
 * This service provides the capability to search and download unstructured content provided by <a href=\"https://open.factset.com/catalog/en-us\">Open:FactSet Partners</a>.
 *
 * The version of the OpenAPI document: 2.0.0
 * Contact: api@factset.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.factset.sdk.OpenFactSetPartnersDocuments.models;

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
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.factset.sdk.OpenFactSetPartnersDocuments.JSON;


/**
 * Returns Transcripts Response
 */
@ApiModel(description = "Returns Transcripts Response")
@JsonPropertyOrder({
  Transcripts.JSON_PROPERTY_TYPE,
  Transcripts.JSON_PROPERTY_LANGUAGE_TYPE,
  Transcripts.JSON_PROPERTY_DATE,
  Transcripts.JSON_PROPERTY_FILE_NAME,
  Transcripts.JSON_PROPERTY_TRACKING_ID,
  Transcripts.JSON_PROPERTY_EVENT_TYPE,
  Transcripts.JSON_PROPERTY_COMPANY_NAME,
  Transcripts.JSON_PROPERTY_LANGUAGE,
  Transcripts.JSON_PROPERTY_SA_ID,
  Transcripts.JSON_PROPERTY_URL
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class Transcripts implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_TYPE = "type";
  private String type;

  public static final String JSON_PROPERTY_LANGUAGE_TYPE = "languageType";
  private String languageType;

  public static final String JSON_PROPERTY_DATE = "date";
  private LocalDate date;

  public static final String JSON_PROPERTY_FILE_NAME = "fileName";
  private String fileName;

  public static final String JSON_PROPERTY_TRACKING_ID = "trackingId";
  private String trackingId;

  public static final String JSON_PROPERTY_EVENT_TYPE = "eventType";
  private String eventType;

  public static final String JSON_PROPERTY_COMPANY_NAME = "companyName";
  private String companyName;

  public static final String JSON_PROPERTY_LANGUAGE = "language";
  private String language;

  public static final String JSON_PROPERTY_SA_ID = "saId";
  private String saId;

  public static final String JSON_PROPERTY_URL = "url";
  private String url;

  public Transcripts() { 
  }

  public Transcripts type(String type) {
    this.type = type;
    return this;
  }

   /**
   * Specifies the type of the record.
   * @return type
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "delta", value = "Specifies the type of the record.")
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getType() {
    return type;
  }


  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setType(String type) {
    this.type = type;
  }


  public Transcripts languageType(String languageType) {
    this.languageType = languageType;
    return this;
  }

   /**
   *  Defines the language type(either local or english)of the XML file.
   * @return languageType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "eng", value = " Defines the language type(either local or english)of the XML file.")
  @JsonProperty(JSON_PROPERTY_LANGUAGE_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getLanguageType() {
    return languageType;
  }


  @JsonProperty(JSON_PROPERTY_LANGUAGE_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLanguageType(String languageType) {
    this.languageType = languageType;
  }


  public Transcripts date(LocalDate date) {
    this.date = date;
    return this;
  }

   /**
   * Specifies the date of the XML file.
   * @return date
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Wed Mar 01 00:00:00 UTC 2023", value = "Specifies the date of the XML file.")
  @JsonProperty(JSON_PROPERTY_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public LocalDate getDate() {
    return date;
  }


  @JsonProperty(JSON_PROPERTY_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDate(LocalDate date) {
    this.date = date;
  }


  public Transcripts fileName(String fileName) {
    this.fileName = fileName;
    return this;
  }

   /**
   * Defines the name of the record.
   * @return fileName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "SA002591_2023Mar01_a_03_xml_eng.xml.", value = "Defines the name of the record.")
  @JsonProperty(JSON_PROPERTY_FILE_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getFileName() {
    return fileName;
  }


  @JsonProperty(JSON_PROPERTY_FILE_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFileName(String fileName) {
    this.fileName = fileName;
  }


  public Transcripts trackingId(String trackingId) {
    this.trackingId = trackingId;
    return this;
  }

   /**
   * Defines an identifier assigned to an event.
   * @return trackingId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "059180b0-b728-11ed-89e6-1b2cff4f6d2b", value = "Defines an identifier assigned to an event.")
  @JsonProperty(JSON_PROPERTY_TRACKING_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getTrackingId() {
    return trackingId;
  }


  @JsonProperty(JSON_PROPERTY_TRACKING_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTrackingId(String trackingId) {
    this.trackingId = trackingId;
  }


  public Transcripts eventType(String eventType) {
    this.eventType = eventType;
    return this;
  }

   /**
   *  Defines Code of the event type.
   * @return eventType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "03", value = " Defines Code of the event type.")
  @JsonProperty(JSON_PROPERTY_EVENT_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getEventType() {
    return eventType;
  }


  @JsonProperty(JSON_PROPERTY_EVENT_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEventType(String eventType) {
    this.eventType = eventType;
  }


  public Transcripts companyName(String companyName) {
    this.companyName = companyName;
    return this;
  }

   /**
   * Specifies the name of the company of the event.
   * @return companyName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Ajinomoto Co., Inc.", value = "Specifies the name of the company of the event.")
  @JsonProperty(JSON_PROPERTY_COMPANY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCompanyName() {
    return companyName;
  }


  @JsonProperty(JSON_PROPERTY_COMPANY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCompanyName(String companyName) {
    this.companyName = companyName;
  }


  public Transcripts language(String language) {
    this.language = language;
    return this;
  }

   /**
   * Defines the language of the XML file.
   * @return language
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "JPN", value = "Defines the language of the XML file.")
  @JsonProperty(JSON_PROPERTY_LANGUAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getLanguage() {
    return language;
  }


  @JsonProperty(JSON_PROPERTY_LANGUAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLanguage(String language) {
    this.language = language;
  }


  public Transcripts saId(String saId) {
    this.saId = saId;
    return this;
  }

   /**
   * Specifies the name of the company of the event.
   * @return saId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "SA002591_2023Mar01_a_03", value = "Specifies the name of the company of the event.")
  @JsonProperty(JSON_PROPERTY_SA_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getSaId() {
    return saId;
  }


  @JsonProperty(JSON_PROPERTY_SA_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSaId(String saId) {
    this.saId = saId;
  }


  public Transcripts url(String url) {
    this.url = url;
    return this;
  }

   /**
   * Download link for the Scripts Asia API provided by the Scripts Asia.
   * @return url
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "https://fdss3-scripts-asia.s3.amazonaws.com/scripts_asia_processed_data/scra_events/xml_files/059180b0-b728-11ed-89e6-1b2cff4f6d2b/SA002591_2023Mar01_a_03_xml_eng.xml?X-Amz-Algorithm=AWS4-HMAC-SHA256&X-Amz-Credential=ASIA4NAFRGHDIIPCUVPG%2F20230301%2Fus-east-1%2Fs3%2Faws4_request&X-Amz-Date=20230301T100743Z&X-Amz-Expires=28800&X-Amz-SignedHeaders=host&X-Amz-Security-Token=IQoJb3JpZ2luX2VjEOL%2F%2F%2F%2F%2F%2F%2F%2F%2F%2FwEaCXVzLWVhc3QtMSJIMEYCIQCvZLHP1v0WWI3ii6DEK9fVvGfi%2BfCxexxx%2B6mzcWcHLwIhAPTldtEfTdZYezHAO92eK8%2B6Yu6DYBV2KVd5HLDQzo4PKvcCCIv%2F%2F%2F%2F%2F%2F%2F%2F%2F%2FwEQAhoMODUyNTYyNjIwODcwIgxJYY0THhy%2FGYck2aQqywLfzjVGrxormOYhOXiSObA%2FTJSYcNtawuzKczgrcaIvQw5pXTp0Ea%2BFsxbFd9K8Dnx5gA%2Ft7bQdCiZrF4qEss2l2SClG9WW5IMf1E5OEFup%2FIVmkZrANZrA0nOg8i9oFe4cBJZpqcBt04AVzA%2F%2BKiDSxSLECParvdQ%2FNNbX79c%2F2pj4zR%2BPt93HgMrPwgFrarpZwd6RtrX6BLJ2GGfNPePyT2Uk7Z4mJERzls7v6I9izlSm%2FbbMRHgq4a8wPGxvwuDcZtb4qBiYHoxcVBL5Z9iwF7H4HlUiPdtQpTjLfaVh9PEUoPu%2FlpCqxVBtQ0Ub9Fv%2FXM4vufl04hdJXvZKqjgqtzi7tp3KsdUNeE7%2BwOEWHiuDoXwna2Aou92%2BjHK9XS8VwXHGqrLA%2Bj%2B%2Bq7I35pJe4ZJ6UzVcsy3w1qUfDIM5EQGCIhK9Am4pA0SNMKzF%2FJ8GOp0B5bmv%2B3S4%2B60Hxgv%2BucGDuYbSO9K19C0UVmHqmvmFiVnNU%2FnDU%2FSfyUpWFz5c0eMH1ctrD1Tn68ObDXflcgMYTS6VeDbqqFBlzE6hYw7JPO2WUeEtbmAvwAx1yyqS1o0FtPvN3mHdcbsGZKYUZsudouMLd0KxvlViIfTUp8Uj%2Bx18vf9sWpHpEIkt3%2Bo4wkOO5XyH3KeFfXKuJWDOrw%3D%3D&X-Amz-Signature=5110653d7932edcf295bac211e88498319fe493cd2bb2b2af776d775a4fe71f1", value = "Download link for the Scripts Asia API provided by the Scripts Asia.")
  @JsonProperty(JSON_PROPERTY_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getUrl() {
    return url;
  }


  @JsonProperty(JSON_PROPERTY_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setUrl(String url) {
    this.url = url;
  }


  /**
   * Return true if this transcripts object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Transcripts transcripts = (Transcripts) o;
    return Objects.equals(this.type, transcripts.type) &&
        Objects.equals(this.languageType, transcripts.languageType) &&
        Objects.equals(this.date, transcripts.date) &&
        Objects.equals(this.fileName, transcripts.fileName) &&
        Objects.equals(this.trackingId, transcripts.trackingId) &&
        Objects.equals(this.eventType, transcripts.eventType) &&
        Objects.equals(this.companyName, transcripts.companyName) &&
        Objects.equals(this.language, transcripts.language) &&
        Objects.equals(this.saId, transcripts.saId) &&
        Objects.equals(this.url, transcripts.url);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, languageType, date, fileName, trackingId, eventType, companyName, language, saId, url);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Transcripts {\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    languageType: ").append(toIndentedString(languageType)).append("\n");
    sb.append("    date: ").append(toIndentedString(date)).append("\n");
    sb.append("    fileName: ").append(toIndentedString(fileName)).append("\n");
    sb.append("    trackingId: ").append(toIndentedString(trackingId)).append("\n");
    sb.append("    eventType: ").append(toIndentedString(eventType)).append("\n");
    sb.append("    companyName: ").append(toIndentedString(companyName)).append("\n");
    sb.append("    language: ").append(toIndentedString(language)).append("\n");
    sb.append("    saId: ").append(toIndentedString(saId)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
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
