/*
 * Events and Transcripts API
 * <p>The Calendar Events API provides access to FactSetâ€™s Event Calendar data alongside business logic that allows users to replicate views and functionality consistent with the experience provided by the Workstation. This API provides the ability to pull Event Calendar data based on specific filters.</p> <p>Events Audio API provides access to historical as well as the latest audio recordings of various company events covered by FactSet. The events include, but are not limited to: earnings calls, conferences, and investor days. This API also provides relevant metadata such as timestamps and identifiers around each audio file.</p> <p>The  Near Real-time Transcripts API enables access to Near Real-time Transcripts provided by CallStreet to time-sensitive clients. This API also provides the relevant speaker metadata along with their confidence scores. This data caters to quant clients interested in building machine learning models. Clients can leverage this API to perform sentiment analysis through natural language processing or machine learning. It can also be used to complement analysis using FactSet's transcripts service.</p> <p>Transcripts API provides conference call transcripts for companies' publicly held conference calls and a wealth of information regarding upcoming corporate events, such as conference call date and time, phone number and password, type of conference call, and important company investor relations contact information.</p> 
 *
 * The version of the OpenAPI document: 2.0.0
 * Contact: api@factset.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.factset.sdk.EventsandTranscripts.models;

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
import java.time.OffsetDateTime;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.factset.sdk.EventsandTranscripts.JSON;


/**
 * CompanyEventResponseData
 */
@JsonPropertyOrder({
  CompanyEventResponseData.JSON_PROPERTY_IDENTIFIER,
  CompanyEventResponseData.JSON_PROPERTY_ENTITY_NAME,
  CompanyEventResponseData.JSON_PROPERTY_DESCRIPTION,
  CompanyEventResponseData.JSON_PROPERTY_EVENT_DATE_TIME,
  CompanyEventResponseData.JSON_PROPERTY_MARKET_TIME_CODE,
  CompanyEventResponseData.JSON_PROPERTY_EVENT_TYPE,
  CompanyEventResponseData.JSON_PROPERTY_EVENT_ID,
  CompanyEventResponseData.JSON_PROPERTY_WEBCAST_LINK,
  CompanyEventResponseData.JSON_PROPERTY_IR_LINK,
  CompanyEventResponseData.JSON_PROPERTY_FISCAL_YEAR,
  CompanyEventResponseData.JSON_PROPERTY_FISCAL_PERIOD,
  CompanyEventResponseData.JSON_PROPERTY_CONTACT_EMAIL,
  CompanyEventResponseData.JSON_PROPERTY_CONTACT_PHONE,
  CompanyEventResponseData.JSON_PROPERTY_CONTACT_NAME,
  CompanyEventResponseData.JSON_PROPERTY_REPORT_ID,
  CompanyEventResponseData.JSON_PROPERTY_LAST_MODIFIED_DATE
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")

public class CompanyEventResponseData implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_IDENTIFIER = "identifier";
  private String identifier;

  public static final String JSON_PROPERTY_ENTITY_NAME = "entityName";
  private String entityName;

  public static final String JSON_PROPERTY_DESCRIPTION = "description";
  private String description;

  public static final String JSON_PROPERTY_EVENT_DATE_TIME = "eventDateTime";
  private OffsetDateTime eventDateTime;

  public static final String JSON_PROPERTY_MARKET_TIME_CODE = "marketTimeCode";
  private String marketTimeCode;

  /**
   * Refers to the various event types returned in the response:    * Earnings: Regular quarterly calls where companies provide insights into their latest earnings, sharing details on their financial performance, including revenue, profits, and earnings per share.    * SalesRevenueCall: Conference calls focused on discussing comprehensive sales activity and revenue figures, typically held monthly or quarterly.    * GuidanceCall: Calls where companies offer estimated financial information about future earnings or outline business outlooks before official earnings are released.    * AnalystsInvestorsMeeting: A company-hosted gathering for analysts and investors to discuss strategic updates and financial health.    * ShareholdersMeeting: A meeting where shareholders convene to discuss corporate developments and vote on important matters.    * SpecialSituation: Conference calls addressing situations that do not fit into standard categories, often concerning mergers, acquisitions, joint ventures, or significant business updates.    * Conference: An event where individuals gather to discuss and share ideas on common interests, often including various formats such as panel discussions, workshops, and keynote presentations.    * ConfirmedEarningsRelease: Officially announced date when a company will publish its actual earnings results.    * ProjectedEarningsRelease:  Scheduled release date of a company’s estimated or forecasted earnings before actual results.    * SalesRevenueRelease: Disclosure of a company’s revenue figures, usually as part of earnings or performance updates.    * Split: Corporate action that multiplies share count and reduces share price proportionally, without affecting market cap.    * Dividend: Cash or stock distribution paid to shareholders, reflecting a share of company profits.
   */
  public enum EventTypeEnum {
    EARNINGS("Earnings"),
    
    SALESREVENUECALL("SalesRevenueCall"),
    
    GUIDANCECALL("GuidanceCall"),
    
    ANALYSTSINVESTORSMEETING("AnalystsInvestorsMeeting"),
    
    SHAREHOLDERSMEETING("ShareholdersMeeting"),
    
    SPECIALSITUATION("SpecialSituation"),
    
    CONFERENCE("Conference"),
    
    CONFIRMEDEARNINGSRELEASE("ConfirmedEarningsRelease"),
    
    SALESREVENUERELEASE("SalesRevenueRelease"),
    
    PROJECTEDEARNINGSRELEASE("ProjectedEarningsRelease"),
    
    SPLIT("Split"),
    
    DIVIDEND("Dividend");

    private String value;

    EventTypeEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static EventTypeEnum fromValue(String value) {
      for (EventTypeEnum b : EventTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_EVENT_TYPE = "eventType";
  private EventTypeEnum eventType;

  public static final String JSON_PROPERTY_EVENT_ID = "eventId";
  private String eventId;

  public static final String JSON_PROPERTY_WEBCAST_LINK = "webcastLink";
  private String webcastLink;

  public static final String JSON_PROPERTY_IR_LINK = "irLink";
  private String irLink;

  public static final String JSON_PROPERTY_FISCAL_YEAR = "fiscalYear";
  private String fiscalYear;

  public static final String JSON_PROPERTY_FISCAL_PERIOD = "fiscalPeriod";
  private String fiscalPeriod;

  public static final String JSON_PROPERTY_CONTACT_EMAIL = "contactEmail";
  private String contactEmail;

  public static final String JSON_PROPERTY_CONTACT_PHONE = "contactPhone";
  private String contactPhone;

  public static final String JSON_PROPERTY_CONTACT_NAME = "contactName";
  private String contactName;

  public static final String JSON_PROPERTY_REPORT_ID = "reportId";
  private String reportId;

  public static final String JSON_PROPERTY_LAST_MODIFIED_DATE = "lastModifiedDate";
  private OffsetDateTime lastModifiedDate;

  public CompanyEventResponseData() { 
  }

  public CompanyEventResponseData identifier(String identifier) {
    this.identifier = identifier;
    return this;
  }

   /**
   * Ticker-region identifier of the entity hosting the event.
   * @return identifier
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "AAPL-US", value = "Ticker-region identifier of the entity hosting the event.")
  @JsonProperty(JSON_PROPERTY_IDENTIFIER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getIdentifier() {
    return identifier;
  }


  @JsonProperty(JSON_PROPERTY_IDENTIFIER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIdentifier(String identifier) {
    this.identifier = identifier;
  }


  public CompanyEventResponseData entityName(String entityName) {
    this.entityName = entityName;
    return this;
  }

   /**
   * The official name of the entity.
   * @return entityName
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "Apple, Inc.", value = "The official name of the entity.")
  @JsonProperty(JSON_PROPERTY_ENTITY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getEntityName() {
    return entityName;
  }


  @JsonProperty(JSON_PROPERTY_ENTITY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEntityName(String entityName) {
    this.entityName = entityName;
  }


  public CompanyEventResponseData description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Brief description of the event.
   * @return description
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "Q2 2023 Earnings Release (Projected)", value = "Brief description of the event.")
  @JsonProperty(JSON_PROPERTY_DESCRIPTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getDescription() {
    return description;
  }


  @JsonProperty(JSON_PROPERTY_DESCRIPTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDescription(String description) {
    this.description = description;
  }


  public CompanyEventResponseData eventDateTime(OffsetDateTime eventDateTime) {
    this.eventDateTime = eventDateTime;
    return this;
  }

   /**
   * Event start time as date/time string according to ISO 8601.
   * @return eventDateTime
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "2023-01-01T00:00Z", value = "Event start time as date/time string according to ISO 8601.")
  @JsonProperty(JSON_PROPERTY_EVENT_DATE_TIME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OffsetDateTime getEventDateTime() {
    return eventDateTime;
  }


  @JsonProperty(JSON_PROPERTY_EVENT_DATE_TIME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEventDateTime(OffsetDateTime eventDateTime) {
    this.eventDateTime = eventDateTime;
  }


  public CompanyEventResponseData marketTimeCode(String marketTimeCode) {
    this.marketTimeCode = marketTimeCode;
    return this;
  }

   /**
   * Timing code related to opening or closing of market.
   * @return marketTimeCode
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "Unspecified", value = "Timing code related to opening or closing of market.")
  @JsonProperty(JSON_PROPERTY_MARKET_TIME_CODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getMarketTimeCode() {
    return marketTimeCode;
  }


  @JsonProperty(JSON_PROPERTY_MARKET_TIME_CODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMarketTimeCode(String marketTimeCode) {
    this.marketTimeCode = marketTimeCode;
  }


  public CompanyEventResponseData eventType(EventTypeEnum eventType) {
    this.eventType = eventType;
    return this;
  }

   /**
   * Refers to the various event types returned in the response:    * Earnings: Regular quarterly calls where companies provide insights into their latest earnings, sharing details on their financial performance, including revenue, profits, and earnings per share.    * SalesRevenueCall: Conference calls focused on discussing comprehensive sales activity and revenue figures, typically held monthly or quarterly.    * GuidanceCall: Calls where companies offer estimated financial information about future earnings or outline business outlooks before official earnings are released.    * AnalystsInvestorsMeeting: A company-hosted gathering for analysts and investors to discuss strategic updates and financial health.    * ShareholdersMeeting: A meeting where shareholders convene to discuss corporate developments and vote on important matters.    * SpecialSituation: Conference calls addressing situations that do not fit into standard categories, often concerning mergers, acquisitions, joint ventures, or significant business updates.    * Conference: An event where individuals gather to discuss and share ideas on common interests, often including various formats such as panel discussions, workshops, and keynote presentations.    * ConfirmedEarningsRelease: Officially announced date when a company will publish its actual earnings results.    * ProjectedEarningsRelease:  Scheduled release date of a company’s estimated or forecasted earnings before actual results.    * SalesRevenueRelease: Disclosure of a company’s revenue figures, usually as part of earnings or performance updates.    * Split: Corporate action that multiplies share count and reduces share price proportionally, without affecting market cap.    * Dividend: Cash or stock distribution paid to shareholders, reflecting a share of company profits.
   * @return eventType
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "Earnings", value = "Refers to the various event types returned in the response:    * Earnings: Regular quarterly calls where companies provide insights into their latest earnings, sharing details on their financial performance, including revenue, profits, and earnings per share.    * SalesRevenueCall: Conference calls focused on discussing comprehensive sales activity and revenue figures, typically held monthly or quarterly.    * GuidanceCall: Calls where companies offer estimated financial information about future earnings or outline business outlooks before official earnings are released.    * AnalystsInvestorsMeeting: A company-hosted gathering for analysts and investors to discuss strategic updates and financial health.    * ShareholdersMeeting: A meeting where shareholders convene to discuss corporate developments and vote on important matters.    * SpecialSituation: Conference calls addressing situations that do not fit into standard categories, often concerning mergers, acquisitions, joint ventures, or significant business updates.    * Conference: An event where individuals gather to discuss and share ideas on common interests, often including various formats such as panel discussions, workshops, and keynote presentations.    * ConfirmedEarningsRelease: Officially announced date when a company will publish its actual earnings results.    * ProjectedEarningsRelease:  Scheduled release date of a company’s estimated or forecasted earnings before actual results.    * SalesRevenueRelease: Disclosure of a company’s revenue figures, usually as part of earnings or performance updates.    * Split: Corporate action that multiplies share count and reduces share price proportionally, without affecting market cap.    * Dividend: Cash or stock distribution paid to shareholders, reflecting a share of company profits.")
  @JsonProperty(JSON_PROPERTY_EVENT_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public EventTypeEnum getEventType() {
    return eventType;
  }


  @JsonProperty(JSON_PROPERTY_EVENT_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEventType(EventTypeEnum eventType) {
    this.eventType = eventType;
  }


  public CompanyEventResponseData eventId(String eventId) {
    this.eventId = eventId;
    return this;
  }

   /**
   * Unique identifier for the event.
   * @return eventId
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "1200867930", value = "Unique identifier for the event.")
  @JsonProperty(JSON_PROPERTY_EVENT_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getEventId() {
    return eventId;
  }


  @JsonProperty(JSON_PROPERTY_EVENT_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEventId(String eventId) {
    this.eventId = eventId;
  }


  public CompanyEventResponseData webcastLink(String webcastLink) {
    this.webcastLink = webcastLink;
    return this;
  }

   /**
   * Link to the webcast of the event.
   * @return webcastLink
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "", value = "Link to the webcast of the event.")
  @JsonProperty(JSON_PROPERTY_WEBCAST_LINK)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getWebcastLink() {
    return webcastLink;
  }


  @JsonProperty(JSON_PROPERTY_WEBCAST_LINK)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setWebcastLink(String webcastLink) {
    this.webcastLink = webcastLink;
  }


  public CompanyEventResponseData irLink(String irLink) {
    this.irLink = irLink;
    return this;
  }

   /**
   * Link to the ir page of the company.
   * @return irLink
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "investor.apple.com/investor-relations/default.aspx", value = "Link to the ir page of the company.")
  @JsonProperty(JSON_PROPERTY_IR_LINK)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getIrLink() {
    return irLink;
  }


  @JsonProperty(JSON_PROPERTY_IR_LINK)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIrLink(String irLink) {
    this.irLink = irLink;
  }


  public CompanyEventResponseData fiscalYear(String fiscalYear) {
    this.fiscalYear = fiscalYear;
    return this;
  }

   /**
   * The fiscal year of the company to which the event pertains.
   * @return fiscalYear
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "2023", value = "The fiscal year of the company to which the event pertains.")
  @JsonProperty(JSON_PROPERTY_FISCAL_YEAR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getFiscalYear() {
    return fiscalYear;
  }


  @JsonProperty(JSON_PROPERTY_FISCAL_YEAR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFiscalYear(String fiscalYear) {
    this.fiscalYear = fiscalYear;
  }


  public CompanyEventResponseData fiscalPeriod(String fiscalPeriod) {
    this.fiscalPeriod = fiscalPeriod;
    return this;
  }

   /**
   * The fiscal period of the company to which the event pertains.
   * @return fiscalPeriod
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "1", value = "The fiscal period of the company to which the event pertains.")
  @JsonProperty(JSON_PROPERTY_FISCAL_PERIOD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getFiscalPeriod() {
    return fiscalPeriod;
  }


  @JsonProperty(JSON_PROPERTY_FISCAL_PERIOD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFiscalPeriod(String fiscalPeriod) {
    this.fiscalPeriod = fiscalPeriod;
  }


  public CompanyEventResponseData contactEmail(String contactEmail) {
    this.contactEmail = contactEmail;
    return this;
  }

   /**
   * Contact email for inquiries related to the event.
   * @return contactEmail
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "jdoe@apple.com", value = "Contact email for inquiries related to the event.")
  @JsonProperty(JSON_PROPERTY_CONTACT_EMAIL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getContactEmail() {
    return contactEmail;
  }


  @JsonProperty(JSON_PROPERTY_CONTACT_EMAIL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setContactEmail(String contactEmail) {
    this.contactEmail = contactEmail;
  }


  public CompanyEventResponseData contactPhone(String contactPhone) {
    this.contactPhone = contactPhone;
    return this;
  }

   /**
   * Contact phone number for inquiries related to the event.
   * @return contactPhone
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "1(888)227.0303", value = "Contact phone number for inquiries related to the event.")
  @JsonProperty(JSON_PROPERTY_CONTACT_PHONE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getContactPhone() {
    return contactPhone;
  }


  @JsonProperty(JSON_PROPERTY_CONTACT_PHONE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setContactPhone(String contactPhone) {
    this.contactPhone = contactPhone;
  }


  public CompanyEventResponseData contactName(String contactName) {
    this.contactName = contactName;
    return this;
  }

   /**
   * Name of the contact person for queries related to the event.
   * @return contactName
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "John Doe", value = "Name of the contact person for queries related to the event.")
  @JsonProperty(JSON_PROPERTY_CONTACT_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getContactName() {
    return contactName;
  }


  @JsonProperty(JSON_PROPERTY_CONTACT_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setContactName(String contactName) {
    this.contactName = contactName;
  }


  public CompanyEventResponseData reportId(String reportId) {
    this.reportId = reportId;
    return this;
  }

   /**
   * Unique identifier for the report.    **Note:** We do not have a reportId for split and dividend event types. 
   * @return reportId
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "2750388", value = "Unique identifier for the report.    **Note:** We do not have a reportId for split and dividend event types. ")
  @JsonProperty(JSON_PROPERTY_REPORT_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getReportId() {
    return reportId;
  }


  @JsonProperty(JSON_PROPERTY_REPORT_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setReportId(String reportId) {
    this.reportId = reportId;
  }


  public CompanyEventResponseData lastModifiedDate(OffsetDateTime lastModifiedDate) {
    this.lastModifiedDate = lastModifiedDate;
    return this;
  }

   /**
   * The date and time when the event was last modified.
   * @return lastModifiedDate
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "2023-01-01T12:00Z", value = "The date and time when the event was last modified.")
  @JsonProperty(JSON_PROPERTY_LAST_MODIFIED_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OffsetDateTime getLastModifiedDate() {
    return lastModifiedDate;
  }


  @JsonProperty(JSON_PROPERTY_LAST_MODIFIED_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLastModifiedDate(OffsetDateTime lastModifiedDate) {
    this.lastModifiedDate = lastModifiedDate;
  }


  /**
   * Return true if this CompanyEventResponseData object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CompanyEventResponseData companyEventResponseData = (CompanyEventResponseData) o;
    return Objects.equals(this.identifier, companyEventResponseData.identifier) &&
        Objects.equals(this.entityName, companyEventResponseData.entityName) &&
        Objects.equals(this.description, companyEventResponseData.description) &&
        Objects.equals(this.eventDateTime, companyEventResponseData.eventDateTime) &&
        Objects.equals(this.marketTimeCode, companyEventResponseData.marketTimeCode) &&
        Objects.equals(this.eventType, companyEventResponseData.eventType) &&
        Objects.equals(this.eventId, companyEventResponseData.eventId) &&
        Objects.equals(this.webcastLink, companyEventResponseData.webcastLink) &&
        Objects.equals(this.irLink, companyEventResponseData.irLink) &&
        Objects.equals(this.fiscalYear, companyEventResponseData.fiscalYear) &&
        Objects.equals(this.fiscalPeriod, companyEventResponseData.fiscalPeriod) &&
        Objects.equals(this.contactEmail, companyEventResponseData.contactEmail) &&
        Objects.equals(this.contactPhone, companyEventResponseData.contactPhone) &&
        Objects.equals(this.contactName, companyEventResponseData.contactName) &&
        Objects.equals(this.reportId, companyEventResponseData.reportId) &&
        Objects.equals(this.lastModifiedDate, companyEventResponseData.lastModifiedDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(identifier, entityName, description, eventDateTime, marketTimeCode, eventType, eventId, webcastLink, irLink, fiscalYear, fiscalPeriod, contactEmail, contactPhone, contactName, reportId, lastModifiedDate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CompanyEventResponseData {\n");
    sb.append("    identifier: ").append(toIndentedString(identifier)).append("\n");
    sb.append("    entityName: ").append(toIndentedString(entityName)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    eventDateTime: ").append(toIndentedString(eventDateTime)).append("\n");
    sb.append("    marketTimeCode: ").append(toIndentedString(marketTimeCode)).append("\n");
    sb.append("    eventType: ").append(toIndentedString(eventType)).append("\n");
    sb.append("    eventId: ").append(toIndentedString(eventId)).append("\n");
    sb.append("    webcastLink: ").append(toIndentedString(webcastLink)).append("\n");
    sb.append("    irLink: ").append(toIndentedString(irLink)).append("\n");
    sb.append("    fiscalYear: ").append(toIndentedString(fiscalYear)).append("\n");
    sb.append("    fiscalPeriod: ").append(toIndentedString(fiscalPeriod)).append("\n");
    sb.append("    contactEmail: ").append(toIndentedString(contactEmail)).append("\n");
    sb.append("    contactPhone: ").append(toIndentedString(contactPhone)).append("\n");
    sb.append("    contactName: ").append(toIndentedString(contactName)).append("\n");
    sb.append("    reportId: ").append(toIndentedString(reportId)).append("\n");
    sb.append("    lastModifiedDate: ").append(toIndentedString(lastModifiedDate)).append("\n");
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

