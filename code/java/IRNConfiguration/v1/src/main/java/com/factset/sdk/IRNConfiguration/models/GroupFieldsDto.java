/*
 * IRN API v1
 * Allows users to extract, create, update and configure IRN data.
 *
 * The version of the OpenAPI document: 1
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.factset.sdk.IRNConfiguration.models;

import java.util.Objects;
import java.util.Arrays;
import java.util.Map;
import java.util.HashMap;
import com.factset.sdk.IRNConfiguration.models.DateSettingsDto;
import com.factset.sdk.IRNConfiguration.models.IdentifierSettingsDto;
import com.factset.sdk.IRNConfiguration.models.LinkSettingsDto;
import com.factset.sdk.IRNConfiguration.models.NoteSettingsDto;
import com.factset.sdk.IRNConfiguration.models.OrganizerSettingsDto;
import com.factset.sdk.IRNConfiguration.models.RecommendationSettingsDto;
import com.factset.sdk.IRNConfiguration.models.RelatedContactsSettingsDto;
import com.factset.sdk.IRNConfiguration.models.RelatedResearchSettingsDto;
import com.factset.sdk.IRNConfiguration.models.RelatedSymbolsSettingsDto;
import com.factset.sdk.IRNConfiguration.models.SentimentSettingsDto;
import com.factset.sdk.IRNConfiguration.models.SourceSettingsDto;
import com.factset.sdk.IRNConfiguration.models.SubjectSettingsDto;
import com.factset.sdk.IRNConfiguration.models.TeamSettingsDto;
import com.factset.sdk.IRNConfiguration.models.TitleSettingsDto;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.factset.sdk.IRNConfiguration.JSON;


/**
 * GroupFieldsDto
 */
@JsonPropertyOrder({
  GroupFieldsDto.JSON_PROPERTY_TITLE,
  GroupFieldsDto.JSON_PROPERTY_DATE,
  GroupFieldsDto.JSON_PROPERTY_IDENTIFIER,
  GroupFieldsDto.JSON_PROPERTY_SUBJECT,
  GroupFieldsDto.JSON_PROPERTY_RECOMMENDATION,
  GroupFieldsDto.JSON_PROPERTY_SENTIMENT,
  GroupFieldsDto.JSON_PROPERTY_LINK,
  GroupFieldsDto.JSON_PROPERTY_NOTE,
  GroupFieldsDto.JSON_PROPERTY_SOURCE,
  GroupFieldsDto.JSON_PROPERTY_RELATED_SYMBOLS,
  GroupFieldsDto.JSON_PROPERTY_RELATED_RESEARCH,
  GroupFieldsDto.JSON_PROPERTY_RELATED_CONTACTS,
  GroupFieldsDto.JSON_PROPERTY_TEAM,
  GroupFieldsDto.JSON_PROPERTY_ORGANIZER
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")

public class GroupFieldsDto implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_TITLE = "title";
  private TitleSettingsDto title;

  public static final String JSON_PROPERTY_DATE = "date";
  private DateSettingsDto date;

  public static final String JSON_PROPERTY_IDENTIFIER = "identifier";
  private IdentifierSettingsDto identifier;

  public static final String JSON_PROPERTY_SUBJECT = "subject";
  private SubjectSettingsDto subject;

  public static final String JSON_PROPERTY_RECOMMENDATION = "recommendation";
  private RecommendationSettingsDto recommendation;

  public static final String JSON_PROPERTY_SENTIMENT = "sentiment";
  private SentimentSettingsDto sentiment;

  public static final String JSON_PROPERTY_LINK = "link";
  private LinkSettingsDto link;

  public static final String JSON_PROPERTY_NOTE = "note";
  private NoteSettingsDto note;

  public static final String JSON_PROPERTY_SOURCE = "source";
  private SourceSettingsDto source;

  public static final String JSON_PROPERTY_RELATED_SYMBOLS = "relatedSymbols";
  private RelatedSymbolsSettingsDto relatedSymbols;

  public static final String JSON_PROPERTY_RELATED_RESEARCH = "relatedResearch";
  private RelatedResearchSettingsDto relatedResearch;

  public static final String JSON_PROPERTY_RELATED_CONTACTS = "relatedContacts";
  private RelatedContactsSettingsDto relatedContacts;

  public static final String JSON_PROPERTY_TEAM = "team";
  private TeamSettingsDto team;

  public static final String JSON_PROPERTY_ORGANIZER = "organizer";
  private OrganizerSettingsDto organizer;

  public GroupFieldsDto() { 
  }

  public GroupFieldsDto title(TitleSettingsDto title) {
    this.title = title;
    return this;
  }

   /**
   * Get title
   * @return title
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_TITLE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public TitleSettingsDto getTitle() {
    return title;
  }


  @JsonProperty(JSON_PROPERTY_TITLE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTitle(TitleSettingsDto title) {
    this.title = title;
  }


  public GroupFieldsDto date(DateSettingsDto date) {
    this.date = date;
    return this;
  }

   /**
   * Get date
   * @return date
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public DateSettingsDto getDate() {
    return date;
  }


  @JsonProperty(JSON_PROPERTY_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDate(DateSettingsDto date) {
    this.date = date;
  }


  public GroupFieldsDto identifier(IdentifierSettingsDto identifier) {
    this.identifier = identifier;
    return this;
  }

   /**
   * Get identifier
   * @return identifier
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_IDENTIFIER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public IdentifierSettingsDto getIdentifier() {
    return identifier;
  }


  @JsonProperty(JSON_PROPERTY_IDENTIFIER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIdentifier(IdentifierSettingsDto identifier) {
    this.identifier = identifier;
  }


  public GroupFieldsDto subject(SubjectSettingsDto subject) {
    this.subject = subject;
    return this;
  }

   /**
   * Get subject
   * @return subject
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_SUBJECT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public SubjectSettingsDto getSubject() {
    return subject;
  }


  @JsonProperty(JSON_PROPERTY_SUBJECT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSubject(SubjectSettingsDto subject) {
    this.subject = subject;
  }


  public GroupFieldsDto recommendation(RecommendationSettingsDto recommendation) {
    this.recommendation = recommendation;
    return this;
  }

   /**
   * Get recommendation
   * @return recommendation
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_RECOMMENDATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public RecommendationSettingsDto getRecommendation() {
    return recommendation;
  }


  @JsonProperty(JSON_PROPERTY_RECOMMENDATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRecommendation(RecommendationSettingsDto recommendation) {
    this.recommendation = recommendation;
  }


  public GroupFieldsDto sentiment(SentimentSettingsDto sentiment) {
    this.sentiment = sentiment;
    return this;
  }

   /**
   * Get sentiment
   * @return sentiment
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_SENTIMENT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public SentimentSettingsDto getSentiment() {
    return sentiment;
  }


  @JsonProperty(JSON_PROPERTY_SENTIMENT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSentiment(SentimentSettingsDto sentiment) {
    this.sentiment = sentiment;
  }


  public GroupFieldsDto link(LinkSettingsDto link) {
    this.link = link;
    return this;
  }

   /**
   * Get link
   * @return link
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_LINK)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public LinkSettingsDto getLink() {
    return link;
  }


  @JsonProperty(JSON_PROPERTY_LINK)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLink(LinkSettingsDto link) {
    this.link = link;
  }


  public GroupFieldsDto note(NoteSettingsDto note) {
    this.note = note;
    return this;
  }

   /**
   * Get note
   * @return note
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_NOTE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public NoteSettingsDto getNote() {
    return note;
  }


  @JsonProperty(JSON_PROPERTY_NOTE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setNote(NoteSettingsDto note) {
    this.note = note;
  }


  public GroupFieldsDto source(SourceSettingsDto source) {
    this.source = source;
    return this;
  }

   /**
   * Get source
   * @return source
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_SOURCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public SourceSettingsDto getSource() {
    return source;
  }


  @JsonProperty(JSON_PROPERTY_SOURCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSource(SourceSettingsDto source) {
    this.source = source;
  }


  public GroupFieldsDto relatedSymbols(RelatedSymbolsSettingsDto relatedSymbols) {
    this.relatedSymbols = relatedSymbols;
    return this;
  }

   /**
   * Get relatedSymbols
   * @return relatedSymbols
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_RELATED_SYMBOLS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public RelatedSymbolsSettingsDto getRelatedSymbols() {
    return relatedSymbols;
  }


  @JsonProperty(JSON_PROPERTY_RELATED_SYMBOLS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRelatedSymbols(RelatedSymbolsSettingsDto relatedSymbols) {
    this.relatedSymbols = relatedSymbols;
  }


  public GroupFieldsDto relatedResearch(RelatedResearchSettingsDto relatedResearch) {
    this.relatedResearch = relatedResearch;
    return this;
  }

   /**
   * Get relatedResearch
   * @return relatedResearch
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_RELATED_RESEARCH)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public RelatedResearchSettingsDto getRelatedResearch() {
    return relatedResearch;
  }


  @JsonProperty(JSON_PROPERTY_RELATED_RESEARCH)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRelatedResearch(RelatedResearchSettingsDto relatedResearch) {
    this.relatedResearch = relatedResearch;
  }


  public GroupFieldsDto relatedContacts(RelatedContactsSettingsDto relatedContacts) {
    this.relatedContacts = relatedContacts;
    return this;
  }

   /**
   * Get relatedContacts
   * @return relatedContacts
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_RELATED_CONTACTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public RelatedContactsSettingsDto getRelatedContacts() {
    return relatedContacts;
  }


  @JsonProperty(JSON_PROPERTY_RELATED_CONTACTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRelatedContacts(RelatedContactsSettingsDto relatedContacts) {
    this.relatedContacts = relatedContacts;
  }


  public GroupFieldsDto team(TeamSettingsDto team) {
    this.team = team;
    return this;
  }

   /**
   * Get team
   * @return team
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_TEAM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public TeamSettingsDto getTeam() {
    return team;
  }


  @JsonProperty(JSON_PROPERTY_TEAM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTeam(TeamSettingsDto team) {
    this.team = team;
  }


  public GroupFieldsDto organizer(OrganizerSettingsDto organizer) {
    this.organizer = organizer;
    return this;
  }

   /**
   * Get organizer
   * @return organizer
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_ORGANIZER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OrganizerSettingsDto getOrganizer() {
    return organizer;
  }


  @JsonProperty(JSON_PROPERTY_ORGANIZER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setOrganizer(OrganizerSettingsDto organizer) {
    this.organizer = organizer;
  }


  /**
   * Return true if this GroupFieldsDto object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GroupFieldsDto groupFieldsDto = (GroupFieldsDto) o;
    return Objects.equals(this.title, groupFieldsDto.title) &&
        Objects.equals(this.date, groupFieldsDto.date) &&
        Objects.equals(this.identifier, groupFieldsDto.identifier) &&
        Objects.equals(this.subject, groupFieldsDto.subject) &&
        Objects.equals(this.recommendation, groupFieldsDto.recommendation) &&
        Objects.equals(this.sentiment, groupFieldsDto.sentiment) &&
        Objects.equals(this.link, groupFieldsDto.link) &&
        Objects.equals(this.note, groupFieldsDto.note) &&
        Objects.equals(this.source, groupFieldsDto.source) &&
        Objects.equals(this.relatedSymbols, groupFieldsDto.relatedSymbols) &&
        Objects.equals(this.relatedResearch, groupFieldsDto.relatedResearch) &&
        Objects.equals(this.relatedContacts, groupFieldsDto.relatedContacts) &&
        Objects.equals(this.team, groupFieldsDto.team) &&
        Objects.equals(this.organizer, groupFieldsDto.organizer);
  }

  @Override
  public int hashCode() {
    return Objects.hash(title, date, identifier, subject, recommendation, sentiment, link, note, source, relatedSymbols, relatedResearch, relatedContacts, team, organizer);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GroupFieldsDto {\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    date: ").append(toIndentedString(date)).append("\n");
    sb.append("    identifier: ").append(toIndentedString(identifier)).append("\n");
    sb.append("    subject: ").append(toIndentedString(subject)).append("\n");
    sb.append("    recommendation: ").append(toIndentedString(recommendation)).append("\n");
    sb.append("    sentiment: ").append(toIndentedString(sentiment)).append("\n");
    sb.append("    link: ").append(toIndentedString(link)).append("\n");
    sb.append("    note: ").append(toIndentedString(note)).append("\n");
    sb.append("    source: ").append(toIndentedString(source)).append("\n");
    sb.append("    relatedSymbols: ").append(toIndentedString(relatedSymbols)).append("\n");
    sb.append("    relatedResearch: ").append(toIndentedString(relatedResearch)).append("\n");
    sb.append("    relatedContacts: ").append(toIndentedString(relatedContacts)).append("\n");
    sb.append("    team: ").append(toIndentedString(team)).append("\n");
    sb.append("    organizer: ").append(toIndentedString(organizer)).append("\n");
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

