/*
 * EVENTS AND TRANSCRIPTS API
 *
 * <p>The Calendar Events API provides access to FactSetâ€™s Event Calendar data alongside business logic that allows users to replicate views and functionality consistent with the experience provided by the Workstation. This API provides the ability to pull Event Calendar data based on specific filters.</p> <p>Events Audio API provides access to historical as well as the latest audio recordings of various company events covered by FactSet. The events include, but are not limited to: earnings calls, conferences, and investor days. This API also provides relevant metadata such as timestamps and identifiers around each audio file.</p> <p>The  Near Real-time Transcripts API enables access to Near Real-time Transcripts provided by CallStreet to time-sensitive clients. This API also provides the relevant speaker metadata along with their confidence scores. This data caters to quant clients interested in building machine learning models. Clients can leverage this API to perform sentiment analysis through natural language processing or machine learning. It can also be used to complement analysis using FactSet's transcripts service.</p> <p>Transcripts API provides conference call transcripts for companies' publicly held conference calls and a wealth of information regarding upcoming corporate events, such as conference call date and time, phone number and password, type of conference call, and important company investor relations contact information.</p>  
 *
 * The version of the OpenAPI document: 1.2.0
 * Contact: api@factset.com
 * Generated by: https://github.com/openapitools/openapi-generator.git
 */


using System;
using System.Collections;
using System.Collections.Generic;
using System.Collections.ObjectModel;
using System.Linq;
using System.IO;
using System.Runtime.Serialization;
using System.Text;
using System.Text.RegularExpressions;
using Newtonsoft.Json;
using Newtonsoft.Json.Converters;
using Newtonsoft.Json.Linq;
using System.ComponentModel.DataAnnotations;
using OpenAPIDateConverter = FactSet.SDK.EventsandTranscripts.Client.OpenAPIDateConverter;

namespace FactSet.SDK.EventsandTranscripts.Model
{
    /// <summary>
    /// CompanyEventResponseObject
    /// </summary>
    [DataContract(Name = "CompanyEventResponseObject")]
    public partial class CompanyEventResponseObject : IEquatable<CompanyEventResponseObject>, IValidatableObject
    {
        /// <summary>
        /// Type/Category of the event based on a predefined list.
        /// </summary>
        /// <value>Type/Category of the event based on a predefined list.</value>
        [JsonConverter(typeof(StringEnumConverter))]
        public enum EventTypeEnum
        {
            /// <summary>
            /// Enum Earnings for value: Earnings
            /// </summary>
            [EnumMember(Value = "Earnings")]
            Earnings = 1,

            /// <summary>
            /// Enum SalesRevenueCall for value: SalesRevenueCall
            /// </summary>
            [EnumMember(Value = "SalesRevenueCall")]
            SalesRevenueCall = 2,

            /// <summary>
            /// Enum GuidanceCall for value: GuidanceCall
            /// </summary>
            [EnumMember(Value = "GuidanceCall")]
            GuidanceCall = 3,

            /// <summary>
            /// Enum AnalystsInvestorsMeeting for value: AnalystsInvestorsMeeting
            /// </summary>
            [EnumMember(Value = "AnalystsInvestorsMeeting")]
            AnalystsInvestorsMeeting = 4,

            /// <summary>
            /// Enum ShareholdersMeeting for value: ShareholdersMeeting
            /// </summary>
            [EnumMember(Value = "ShareholdersMeeting")]
            ShareholdersMeeting = 5,

            /// <summary>
            /// Enum SpecialSituation for value: SpecialSituation
            /// </summary>
            [EnumMember(Value = "SpecialSituation")]
            SpecialSituation = 6,

            /// <summary>
            /// Enum Conference for value: Conference
            /// </summary>
            [EnumMember(Value = "Conference")]
            Conference = 7,

            /// <summary>
            /// Enum ConfirmedEarningsRelease for value: ConfirmedEarningsRelease
            /// </summary>
            [EnumMember(Value = "ConfirmedEarningsRelease")]
            ConfirmedEarningsRelease = 8,

            /// <summary>
            /// Enum SalesRevenueRelease for value: SalesRevenueRelease
            /// </summary>
            [EnumMember(Value = "SalesRevenueRelease")]
            SalesRevenueRelease = 9,

            /// <summary>
            /// Enum ProjectedEarningsRelease for value: ProjectedEarningsRelease
            /// </summary>
            [EnumMember(Value = "ProjectedEarningsRelease")]
            ProjectedEarningsRelease = 10,

            /// <summary>
            /// Enum Split for value: Split
            /// </summary>
            [EnumMember(Value = "Split")]
            Split = 11,

            /// <summary>
            /// Enum Dividend for value: Dividend
            /// </summary>
            [EnumMember(Value = "Dividend")]
            Dividend = 12

        }


        /// <summary>
        /// Type/Category of the event based on a predefined list.
        /// </summary>
        /// <value>Type/Category of the event based on a predefined list.</value>
        [DataMember(Name = "eventType", EmitDefaultValue = false)]
        public EventTypeEnum? EventType { get; set; }
        /// <summary>
        /// Initializes a new instance of the <see cref="CompanyEventResponseObject" /> class.
        /// </summary>
        /// <param name="ticker">Ticker-region identifier for the company hosting the event..</param>
        /// <param name="companyName">The official name of the company..</param>
        /// <param name="description">Brief description of the event..</param>
        /// <param name="eventDateTime">Event start time as date/time string according to ISO 8601..</param>
        /// <param name="marketTimeCode">Timing code related to opening or closing of market..</param>
        /// <param name="eventType">Type/Category of the event based on a predefined list..</param>
        /// <param name="eventId">Unique identifier for the event..</param>
        /// <param name="webcastLink">Link to the webcast of the event..</param>
        /// <param name="irLink">Link to the ir page of the company..</param>
        /// <param name="fiscalYear">The fiscal year of the company to which the event pertains..</param>
        /// <param name="fiscalPeriod">The fiscal period of the company to which the event pertains..</param>
        /// <param name="contactEmail">Contact email for inquiries related to the event..</param>
        /// <param name="contactPhone">Contact phone number for inquiries related to the event..</param>
        /// <param name="contactName">Name of the contact person for queries related to the event..</param>
        /// <param name="reportId">Unique identifier for the report.    **Note:** We do not have a reportId for split and dividend event types. .</param>
        /// <param name="lastModifiedDate">The date and time when the event was last modified..</param>
        public CompanyEventResponseObject(string ticker = default(string), string companyName = default(string), string description = default(string), DateTime eventDateTime = default(DateTime), string marketTimeCode = default(string), EventTypeEnum? eventType = default(EventTypeEnum?), string eventId = default(string), string webcastLink = default(string), string irLink = default(string), string fiscalYear = default(string), string fiscalPeriod = default(string), string contactEmail = default(string), string contactPhone = default(string), string contactName = default(string), string reportId = default(string), DateTime lastModifiedDate = default(DateTime))
        {
            this.Ticker = ticker;
            this.CompanyName = companyName;
            this.Description = description;
            this.EventDateTime = eventDateTime;
            this.MarketTimeCode = marketTimeCode;
            this.EventType = eventType;
            this.EventId = eventId;
            this.WebcastLink = webcastLink;
            this.IrLink = irLink;
            this.FiscalYear = fiscalYear;
            this.FiscalPeriod = fiscalPeriod;
            this.ContactEmail = contactEmail;
            this.ContactPhone = contactPhone;
            this.ContactName = contactName;
            this.ReportId = reportId;
            this.LastModifiedDate = lastModifiedDate;
        }

        /// <summary>
        /// Ticker-region identifier for the company hosting the event.
        /// </summary>
        /// <value>Ticker-region identifier for the company hosting the event.</value>
        [DataMember(Name = "ticker", EmitDefaultValue = false)]
        public string Ticker { get; set; }

        /// <summary>
        /// The official name of the company.
        /// </summary>
        /// <value>The official name of the company.</value>
        [DataMember(Name = "companyName", EmitDefaultValue = false)]
        public string CompanyName { get; set; }

        /// <summary>
        /// Brief description of the event.
        /// </summary>
        /// <value>Brief description of the event.</value>
        [DataMember(Name = "description", EmitDefaultValue = false)]
        public string Description { get; set; }

        /// <summary>
        /// Event start time as date/time string according to ISO 8601.
        /// </summary>
        /// <value>Event start time as date/time string according to ISO 8601.</value>
        [DataMember(Name = "eventDateTime", EmitDefaultValue = false)]
        public DateTime EventDateTime { get; set; }

        /// <summary>
        /// Timing code related to opening or closing of market.
        /// </summary>
        /// <value>Timing code related to opening or closing of market.</value>
        [DataMember(Name = "marketTimeCode", EmitDefaultValue = false)]
        public string MarketTimeCode { get; set; }

        /// <summary>
        /// Unique identifier for the event.
        /// </summary>
        /// <value>Unique identifier for the event.</value>
        [DataMember(Name = "eventId", EmitDefaultValue = false)]
        public string EventId { get; set; }

        /// <summary>
        /// Link to the webcast of the event.
        /// </summary>
        /// <value>Link to the webcast of the event.</value>
        [DataMember(Name = "webcastLink", EmitDefaultValue = false)]
        public string WebcastLink { get; set; }

        /// <summary>
        /// Link to the ir page of the company.
        /// </summary>
        /// <value>Link to the ir page of the company.</value>
        [DataMember(Name = "irLink", EmitDefaultValue = false)]
        public string IrLink { get; set; }

        /// <summary>
        /// The fiscal year of the company to which the event pertains.
        /// </summary>
        /// <value>The fiscal year of the company to which the event pertains.</value>
        [DataMember(Name = "fiscalYear", EmitDefaultValue = false)]
        public string FiscalYear { get; set; }

        /// <summary>
        /// The fiscal period of the company to which the event pertains.
        /// </summary>
        /// <value>The fiscal period of the company to which the event pertains.</value>
        [DataMember(Name = "fiscalPeriod", EmitDefaultValue = false)]
        public string FiscalPeriod { get; set; }

        /// <summary>
        /// Contact email for inquiries related to the event.
        /// </summary>
        /// <value>Contact email for inquiries related to the event.</value>
        [DataMember(Name = "contactEmail", EmitDefaultValue = false)]
        public string ContactEmail { get; set; }

        /// <summary>
        /// Contact phone number for inquiries related to the event.
        /// </summary>
        /// <value>Contact phone number for inquiries related to the event.</value>
        [DataMember(Name = "contactPhone", EmitDefaultValue = false)]
        public string ContactPhone { get; set; }

        /// <summary>
        /// Name of the contact person for queries related to the event.
        /// </summary>
        /// <value>Name of the contact person for queries related to the event.</value>
        [DataMember(Name = "contactName", EmitDefaultValue = false)]
        public string ContactName { get; set; }

        /// <summary>
        /// Unique identifier for the report.    **Note:** We do not have a reportId for split and dividend event types. 
        /// </summary>
        /// <value>Unique identifier for the report.    **Note:** We do not have a reportId for split and dividend event types. </value>
        [DataMember(Name = "reportId", EmitDefaultValue = false)]
        public string ReportId { get; set; }

        /// <summary>
        /// The date and time when the event was last modified.
        /// </summary>
        /// <value>The date and time when the event was last modified.</value>
        [DataMember(Name = "lastModifiedDate", EmitDefaultValue = false)]
        public DateTime LastModifiedDate { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class CompanyEventResponseObject {\n");
            sb.Append("  Ticker: ").Append(Ticker).Append("\n");
            sb.Append("  CompanyName: ").Append(CompanyName).Append("\n");
            sb.Append("  Description: ").Append(Description).Append("\n");
            sb.Append("  EventDateTime: ").Append(EventDateTime).Append("\n");
            sb.Append("  MarketTimeCode: ").Append(MarketTimeCode).Append("\n");
            sb.Append("  EventType: ").Append(EventType).Append("\n");
            sb.Append("  EventId: ").Append(EventId).Append("\n");
            sb.Append("  WebcastLink: ").Append(WebcastLink).Append("\n");
            sb.Append("  IrLink: ").Append(IrLink).Append("\n");
            sb.Append("  FiscalYear: ").Append(FiscalYear).Append("\n");
            sb.Append("  FiscalPeriod: ").Append(FiscalPeriod).Append("\n");
            sb.Append("  ContactEmail: ").Append(ContactEmail).Append("\n");
            sb.Append("  ContactPhone: ").Append(ContactPhone).Append("\n");
            sb.Append("  ContactName: ").Append(ContactName).Append("\n");
            sb.Append("  ReportId: ").Append(ReportId).Append("\n");
            sb.Append("  LastModifiedDate: ").Append(LastModifiedDate).Append("\n");
            sb.Append("}\n");
            return sb.ToString();
        }

        /// <summary>
        /// Returns the JSON string presentation of the object
        /// </summary>
        /// <returns>JSON string presentation of the object</returns>
        public virtual string ToJson()
        {
            return Newtonsoft.Json.JsonConvert.SerializeObject(this, Newtonsoft.Json.Formatting.Indented);
        }

        /// <summary>
        /// Returns true if objects are equal
        /// </summary>
        /// <param name="input">Object to be compared</param>
        /// <returns>Boolean</returns>
        public override bool Equals(object input)
        {
            return this.Equals(input as CompanyEventResponseObject);
        }

        /// <summary>
        /// Returns true if CompanyEventResponseObject instances are equal
        /// </summary>
        /// <param name="input">Instance of CompanyEventResponseObject to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(CompanyEventResponseObject input)
        {
            if (input == null)
            {
                return false;
            }
            return 
                (
                    this.Ticker == input.Ticker ||
                    (this.Ticker != null &&
                    this.Ticker.Equals(input.Ticker))
                ) && 
                (
                    this.CompanyName == input.CompanyName ||
                    (this.CompanyName != null &&
                    this.CompanyName.Equals(input.CompanyName))
                ) && 
                (
                    this.Description == input.Description ||
                    (this.Description != null &&
                    this.Description.Equals(input.Description))
                ) && 
                (
                    this.EventDateTime == input.EventDateTime ||
                    (this.EventDateTime != null &&
                    this.EventDateTime.Equals(input.EventDateTime))
                ) && 
                (
                    this.MarketTimeCode == input.MarketTimeCode ||
                    (this.MarketTimeCode != null &&
                    this.MarketTimeCode.Equals(input.MarketTimeCode))
                ) && 
                (
                    this.EventType == input.EventType ||
                    this.EventType.Equals(input.EventType)
                ) && 
                (
                    this.EventId == input.EventId ||
                    (this.EventId != null &&
                    this.EventId.Equals(input.EventId))
                ) && 
                (
                    this.WebcastLink == input.WebcastLink ||
                    (this.WebcastLink != null &&
                    this.WebcastLink.Equals(input.WebcastLink))
                ) && 
                (
                    this.IrLink == input.IrLink ||
                    (this.IrLink != null &&
                    this.IrLink.Equals(input.IrLink))
                ) && 
                (
                    this.FiscalYear == input.FiscalYear ||
                    (this.FiscalYear != null &&
                    this.FiscalYear.Equals(input.FiscalYear))
                ) && 
                (
                    this.FiscalPeriod == input.FiscalPeriod ||
                    (this.FiscalPeriod != null &&
                    this.FiscalPeriod.Equals(input.FiscalPeriod))
                ) && 
                (
                    this.ContactEmail == input.ContactEmail ||
                    (this.ContactEmail != null &&
                    this.ContactEmail.Equals(input.ContactEmail))
                ) && 
                (
                    this.ContactPhone == input.ContactPhone ||
                    (this.ContactPhone != null &&
                    this.ContactPhone.Equals(input.ContactPhone))
                ) && 
                (
                    this.ContactName == input.ContactName ||
                    (this.ContactName != null &&
                    this.ContactName.Equals(input.ContactName))
                ) && 
                (
                    this.ReportId == input.ReportId ||
                    (this.ReportId != null &&
                    this.ReportId.Equals(input.ReportId))
                ) && 
                (
                    this.LastModifiedDate == input.LastModifiedDate ||
                    (this.LastModifiedDate != null &&
                    this.LastModifiedDate.Equals(input.LastModifiedDate))
                );
        }

        /// <summary>
        /// Gets the hash code
        /// </summary>
        /// <returns>Hash code</returns>
        public override int GetHashCode()
        {
            unchecked // Overflow is fine, just wrap
            {
                int hashCode = 41;
                if (this.Ticker != null)
                {
                    hashCode = (hashCode * 59) + this.Ticker.GetHashCode();
                }
                if (this.CompanyName != null)
                {
                    hashCode = (hashCode * 59) + this.CompanyName.GetHashCode();
                }
                if (this.Description != null)
                {
                    hashCode = (hashCode * 59) + this.Description.GetHashCode();
                }
                if (this.EventDateTime != null)
                {
                    hashCode = (hashCode * 59) + this.EventDateTime.GetHashCode();
                }
                if (this.MarketTimeCode != null)
                {
                    hashCode = (hashCode * 59) + this.MarketTimeCode.GetHashCode();
                }
                hashCode = (hashCode * 59) + this.EventType.GetHashCode();
                if (this.EventId != null)
                {
                    hashCode = (hashCode * 59) + this.EventId.GetHashCode();
                }
                if (this.WebcastLink != null)
                {
                    hashCode = (hashCode * 59) + this.WebcastLink.GetHashCode();
                }
                if (this.IrLink != null)
                {
                    hashCode = (hashCode * 59) + this.IrLink.GetHashCode();
                }
                if (this.FiscalYear != null)
                {
                    hashCode = (hashCode * 59) + this.FiscalYear.GetHashCode();
                }
                if (this.FiscalPeriod != null)
                {
                    hashCode = (hashCode * 59) + this.FiscalPeriod.GetHashCode();
                }
                if (this.ContactEmail != null)
                {
                    hashCode = (hashCode * 59) + this.ContactEmail.GetHashCode();
                }
                if (this.ContactPhone != null)
                {
                    hashCode = (hashCode * 59) + this.ContactPhone.GetHashCode();
                }
                if (this.ContactName != null)
                {
                    hashCode = (hashCode * 59) + this.ContactName.GetHashCode();
                }
                if (this.ReportId != null)
                {
                    hashCode = (hashCode * 59) + this.ReportId.GetHashCode();
                }
                if (this.LastModifiedDate != null)
                {
                    hashCode = (hashCode * 59) + this.LastModifiedDate.GetHashCode();
                }
                return hashCode;
            }
        }

        /// <summary>
        /// To validate all properties of the instance
        /// </summary>
        /// <param name="validationContext">Validation context</param>
        /// <returns>Validation Result</returns>
        public IEnumerable<System.ComponentModel.DataAnnotations.ValidationResult> Validate(ValidationContext validationContext)
        {
            yield break;
        }
    }

}
