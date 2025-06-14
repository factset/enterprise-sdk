/*
 * VRS API documentation
 *
 * Documentation on all available end points in the VRSAPI
 *
 * The version of the OpenAPI document: 1.0.0
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
using OpenAPIDateConverter = FactSet.SDK.Vermilion.Client.OpenAPIDateConverter;

namespace FactSet.SDK.Vermilion.Model
{
    /// <summary>
    /// List of Schedule Definition.
    /// </summary>
    [DataContract(Name = "ScheduleDefinition")]
    public partial class ScheduleDefinition : IEquatable<ScheduleDefinition>, IValidatableObject
    {
        /// <summary>
        /// Type of Schedule Definition.
        /// </summary>
        /// <value>Type of Schedule Definition.</value>
        [JsonConverter(typeof(StringEnumConverter))]
        public enum ScheduleTypeEnum
        {
            /// <summary>
            /// Enum MANUAL for value: MANUAL
            /// </summary>
            [EnumMember(Value = "MANUAL")]
            MANUAL = 1,

            /// <summary>
            /// Enum REPEATING for value: REPEATING
            /// </summary>
            [EnumMember(Value = "REPEATING")]
            REPEATING = 2

        }


        /// <summary>
        /// Type of Schedule Definition.
        /// </summary>
        /// <value>Type of Schedule Definition.</value>
        [DataMember(Name = "scheduleType", EmitDefaultValue = false)]
        public ScheduleTypeEnum? ScheduleType { get; set; }
        /// <summary>
        /// Report Date of the Schedule Definition.
        /// </summary>
        /// <value>Report Date of the Schedule Definition.</value>
        [JsonConverter(typeof(StringEnumConverter))]
        public enum ReportDateEnum
        {
            /// <summary>
            /// Enum LASTDAYOFPREVMONTH for value: LAST_DAY_OF_PREV_MONTH
            /// </summary>
            [EnumMember(Value = "LAST_DAY_OF_PREV_MONTH")]
            LASTDAYOFPREVMONTH = 1,

            /// <summary>
            /// Enum LASTBUSINESSDAYOFPREVMONTH for value: LAST_BUSINESS_DAY_OF_PREV_MONTH
            /// </summary>
            [EnumMember(Value = "LAST_BUSINESS_DAY_OF_PREV_MONTH")]
            LASTBUSINESSDAYOFPREVMONTH = 2,

            /// <summary>
            /// Enum CREATIONDATE for value: CREATION_DATE
            /// </summary>
            [EnumMember(Value = "CREATION_DATE")]
            CREATIONDATE = 3,

            /// <summary>
            /// Enum DAYBEFORECREATIONDATE for value: DAY_BEFORE_CREATION_DATE
            /// </summary>
            [EnumMember(Value = "DAY_BEFORE_CREATION_DATE")]
            DAYBEFORECREATIONDATE = 4,

            /// <summary>
            /// Enum BUSINESSDAYBEFORECREATIONDATE for value: BUSINESS_DAY_BEFORE_CREATION_DATE
            /// </summary>
            [EnumMember(Value = "BUSINESS_DAY_BEFORE_CREATION_DATE")]
            BUSINESSDAYBEFORECREATIONDATE = 5,

            /// <summary>
            /// Enum LASTDAYOFMONTHSCHEDULECREATED for value: LAST_DAY_OF_MONTH_SCHEDULE_CREATED
            /// </summary>
            [EnumMember(Value = "LAST_DAY_OF_MONTH_SCHEDULE_CREATED")]
            LASTDAYOFMONTHSCHEDULECREATED = 6,

            /// <summary>
            /// Enum LASTBUSINESSDAYOFMONTHSCHEDULECREATED for value: LAST_BUSINESS_DAY_OF_MONTH_SCHEDULE_CREATED
            /// </summary>
            [EnumMember(Value = "LAST_BUSINESS_DAY_OF_MONTH_SCHEDULE_CREATED")]
            LASTBUSINESSDAYOFMONTHSCHEDULECREATED = 7,

            /// <summary>
            /// Enum LASTBUSINESSDAYOFPREVIOUSWEEKSCHEDULECREATED for value: LAST_BUSINESS_DAY_OF_PREVIOUS_WEEK_SCHEDULE_CREATED
            /// </summary>
            [EnumMember(Value = "LAST_BUSINESS_DAY_OF_PREVIOUS_WEEK_SCHEDULE_CREATED")]
            LASTBUSINESSDAYOFPREVIOUSWEEKSCHEDULECREATED = 8,

            /// <summary>
            /// Enum LASTBUSINESSDAYOFWEEKSCHEDULECREATED for value: LAST_BUSINESS_DAY_OF_WEEK_SCHEDULE_CREATED
            /// </summary>
            [EnumMember(Value = "LAST_BUSINESS_DAY_OF_WEEK_SCHEDULE_CREATED")]
            LASTBUSINESSDAYOFWEEKSCHEDULECREATED = 9,

            /// <summary>
            /// Enum TWOBUSINESSDAYSBEFORESCHEDULECREATED for value: TWO_BUSINESS_DAYS_BEFORE_SCHEDULE_CREATED
            /// </summary>
            [EnumMember(Value = "TWO_BUSINESS_DAYS_BEFORE_SCHEDULE_CREATED")]
            TWOBUSINESSDAYSBEFORESCHEDULECREATED = 10

        }


        /// <summary>
        /// Report Date of the Schedule Definition.
        /// </summary>
        /// <value>Report Date of the Schedule Definition.</value>
        [DataMember(Name = "reportDate", EmitDefaultValue = false)]
        public ReportDateEnum? ReportDate { get; set; }
        /// <summary>
        /// Initializes a new instance of the <see cref="ScheduleDefinition" /> class.
        /// </summary>
        /// <param name="scheduleDefinitionId">Unique Identifier for the Schedule Definition..</param>
        /// <param name="name">Name of the Schedule Definition..</param>
        /// <param name="code">Code of the Schedule Definition..</param>
        /// <param name="scheduleType">Type of Schedule Definition..</param>
        /// <param name="scheduleGroup">Group of the Schedule Definition..</param>
        /// <param name="reportDate">Report Date of the Schedule Definition..</param>
        /// <param name="numberOfObligations">Number of obligations used in the Schedule Definition..</param>
        /// <param name="businessCalendar">Calender name used in the Schedule Definition..</param>
        /// <param name="deleteScheduleAfterDays">Indicates after how many days the Schedule should be deleted..</param>
        /// <param name="numberOfPackages">Indicates number of packages involved in the Schedule Definition..</param>
        /// <param name="entities">A set of entities used in Schedule Definition..</param>
        /// <param name="ownerRole">ownerRole.</param>
        /// <param name="notes">Notes of the Schedule Definition..</param>
        /// <param name="lastUpdatedBy">Indicates the username of the person who last updated the Data Source..</param>
        /// <param name="lastUpdated">The timestamp of the most recent update in epoch format for a specific Schedule Definition.</param>
        public ScheduleDefinition(int scheduleDefinitionId = default(int), string name = default(string), string code = default(string), ScheduleTypeEnum? scheduleType = default(ScheduleTypeEnum?), string scheduleGroup = default(string), ReportDateEnum? reportDate = default(ReportDateEnum?), int numberOfObligations = default(int), string businessCalendar = default(string), int deleteScheduleAfterDays = default(int), int numberOfPackages = default(int), List<EntityDTO> entities = default(List<EntityDTO>), ScheduleDefinitionOwnerRole ownerRole = default(ScheduleDefinitionOwnerRole), string notes = default(string), string lastUpdatedBy = default(string), string lastUpdated = default(string))
        {
            this.ScheduleDefinitionId = scheduleDefinitionId;
            this.Name = name;
            this.Code = code;
            this.ScheduleType = scheduleType;
            this.ScheduleGroup = scheduleGroup;
            this.ReportDate = reportDate;
            this.NumberOfObligations = numberOfObligations;
            this.BusinessCalendar = businessCalendar;
            this.DeleteScheduleAfterDays = deleteScheduleAfterDays;
            this.NumberOfPackages = numberOfPackages;
            this.Entities = entities;
            this.OwnerRole = ownerRole;
            this.Notes = notes;
            this.LastUpdatedBy = lastUpdatedBy;
            this.LastUpdated = lastUpdated;
        }

        /// <summary>
        /// Unique Identifier for the Schedule Definition.
        /// </summary>
        /// <value>Unique Identifier for the Schedule Definition.</value>
        [DataMember(Name = "scheduleDefinitionId", EmitDefaultValue = false)]
        public int ScheduleDefinitionId { get; set; }

        /// <summary>
        /// Name of the Schedule Definition.
        /// </summary>
        /// <value>Name of the Schedule Definition.</value>
        [DataMember(Name = "name", EmitDefaultValue = false)]
        public string Name { get; set; }

        /// <summary>
        /// Code of the Schedule Definition.
        /// </summary>
        /// <value>Code of the Schedule Definition.</value>
        [DataMember(Name = "code", EmitDefaultValue = false)]
        public string Code { get; set; }

        /// <summary>
        /// Group of the Schedule Definition.
        /// </summary>
        /// <value>Group of the Schedule Definition.</value>
        [DataMember(Name = "scheduleGroup", EmitDefaultValue = false)]
        public string ScheduleGroup { get; set; }

        /// <summary>
        /// Number of obligations used in the Schedule Definition.
        /// </summary>
        /// <value>Number of obligations used in the Schedule Definition.</value>
        [DataMember(Name = "numberOfObligations", EmitDefaultValue = false)]
        public int NumberOfObligations { get; set; }

        /// <summary>
        /// Calender name used in the Schedule Definition.
        /// </summary>
        /// <value>Calender name used in the Schedule Definition.</value>
        [DataMember(Name = "businessCalendar", EmitDefaultValue = false)]
        public string BusinessCalendar { get; set; }

        /// <summary>
        /// Indicates after how many days the Schedule should be deleted.
        /// </summary>
        /// <value>Indicates after how many days the Schedule should be deleted.</value>
        [DataMember(Name = "deleteScheduleAfterDays", EmitDefaultValue = false)]
        public int DeleteScheduleAfterDays { get; set; }

        /// <summary>
        /// Indicates number of packages involved in the Schedule Definition.
        /// </summary>
        /// <value>Indicates number of packages involved in the Schedule Definition.</value>
        [DataMember(Name = "numberOfPackages", EmitDefaultValue = false)]
        public int NumberOfPackages { get; set; }

        /// <summary>
        /// A set of entities used in Schedule Definition.
        /// </summary>
        /// <value>A set of entities used in Schedule Definition.</value>
        [DataMember(Name = "entities", EmitDefaultValue = false)]
        public List<EntityDTO> Entities { get; set; }

        /// <summary>
        /// Gets or Sets OwnerRole
        /// </summary>
        [DataMember(Name = "ownerRole", EmitDefaultValue = false)]
        public ScheduleDefinitionOwnerRole OwnerRole { get; set; }

        /// <summary>
        /// Notes of the Schedule Definition.
        /// </summary>
        /// <value>Notes of the Schedule Definition.</value>
        [DataMember(Name = "notes", EmitDefaultValue = false)]
        public string Notes { get; set; }

        /// <summary>
        /// Indicates the username of the person who last updated the Data Source.
        /// </summary>
        /// <value>Indicates the username of the person who last updated the Data Source.</value>
        [DataMember(Name = "lastUpdatedBy", EmitDefaultValue = false)]
        public string LastUpdatedBy { get; set; }

        /// <summary>
        /// The timestamp of the most recent update in epoch format for a specific Schedule Definition
        /// </summary>
        /// <value>The timestamp of the most recent update in epoch format for a specific Schedule Definition</value>
        [DataMember(Name = "lastUpdated", EmitDefaultValue = false)]
        public string LastUpdated { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class ScheduleDefinition {\n");
            sb.Append("  ScheduleDefinitionId: ").Append(ScheduleDefinitionId).Append("\n");
            sb.Append("  Name: ").Append(Name).Append("\n");
            sb.Append("  Code: ").Append(Code).Append("\n");
            sb.Append("  ScheduleType: ").Append(ScheduleType).Append("\n");
            sb.Append("  ScheduleGroup: ").Append(ScheduleGroup).Append("\n");
            sb.Append("  ReportDate: ").Append(ReportDate).Append("\n");
            sb.Append("  NumberOfObligations: ").Append(NumberOfObligations).Append("\n");
            sb.Append("  BusinessCalendar: ").Append(BusinessCalendar).Append("\n");
            sb.Append("  DeleteScheduleAfterDays: ").Append(DeleteScheduleAfterDays).Append("\n");
            sb.Append("  NumberOfPackages: ").Append(NumberOfPackages).Append("\n");
            sb.Append("  Entities: ").Append(Entities).Append("\n");
            sb.Append("  OwnerRole: ").Append(OwnerRole).Append("\n");
            sb.Append("  Notes: ").Append(Notes).Append("\n");
            sb.Append("  LastUpdatedBy: ").Append(LastUpdatedBy).Append("\n");
            sb.Append("  LastUpdated: ").Append(LastUpdated).Append("\n");
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
            return this.Equals(input as ScheduleDefinition);
        }

        /// <summary>
        /// Returns true if ScheduleDefinition instances are equal
        /// </summary>
        /// <param name="input">Instance of ScheduleDefinition to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(ScheduleDefinition input)
        {
            if (input == null)
            {
                return false;
            }
            return 
                (
                    this.ScheduleDefinitionId == input.ScheduleDefinitionId ||
                    this.ScheduleDefinitionId.Equals(input.ScheduleDefinitionId)
                ) && 
                (
                    this.Name == input.Name ||
                    (this.Name != null &&
                    this.Name.Equals(input.Name))
                ) && 
                (
                    this.Code == input.Code ||
                    (this.Code != null &&
                    this.Code.Equals(input.Code))
                ) && 
                (
                    this.ScheduleType == input.ScheduleType ||
                    this.ScheduleType.Equals(input.ScheduleType)
                ) && 
                (
                    this.ScheduleGroup == input.ScheduleGroup ||
                    (this.ScheduleGroup != null &&
                    this.ScheduleGroup.Equals(input.ScheduleGroup))
                ) && 
                (
                    this.ReportDate == input.ReportDate ||
                    this.ReportDate.Equals(input.ReportDate)
                ) && 
                (
                    this.NumberOfObligations == input.NumberOfObligations ||
                    this.NumberOfObligations.Equals(input.NumberOfObligations)
                ) && 
                (
                    this.BusinessCalendar == input.BusinessCalendar ||
                    (this.BusinessCalendar != null &&
                    this.BusinessCalendar.Equals(input.BusinessCalendar))
                ) && 
                (
                    this.DeleteScheduleAfterDays == input.DeleteScheduleAfterDays ||
                    this.DeleteScheduleAfterDays.Equals(input.DeleteScheduleAfterDays)
                ) && 
                (
                    this.NumberOfPackages == input.NumberOfPackages ||
                    this.NumberOfPackages.Equals(input.NumberOfPackages)
                ) && 
                (
                    this.Entities == input.Entities ||
                    this.Entities != null &&
                    input.Entities != null &&
                    this.Entities.SequenceEqual(input.Entities)
                ) && 
                (
                    this.OwnerRole == input.OwnerRole ||
                    (this.OwnerRole != null &&
                    this.OwnerRole.Equals(input.OwnerRole))
                ) && 
                (
                    this.Notes == input.Notes ||
                    (this.Notes != null &&
                    this.Notes.Equals(input.Notes))
                ) && 
                (
                    this.LastUpdatedBy == input.LastUpdatedBy ||
                    (this.LastUpdatedBy != null &&
                    this.LastUpdatedBy.Equals(input.LastUpdatedBy))
                ) && 
                (
                    this.LastUpdated == input.LastUpdated ||
                    (this.LastUpdated != null &&
                    this.LastUpdated.Equals(input.LastUpdated))
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
                hashCode = (hashCode * 59) + this.ScheduleDefinitionId.GetHashCode();
                if (this.Name != null)
                {
                    hashCode = (hashCode * 59) + this.Name.GetHashCode();
                }
                if (this.Code != null)
                {
                    hashCode = (hashCode * 59) + this.Code.GetHashCode();
                }
                hashCode = (hashCode * 59) + this.ScheduleType.GetHashCode();
                if (this.ScheduleGroup != null)
                {
                    hashCode = (hashCode * 59) + this.ScheduleGroup.GetHashCode();
                }
                hashCode = (hashCode * 59) + this.ReportDate.GetHashCode();
                hashCode = (hashCode * 59) + this.NumberOfObligations.GetHashCode();
                if (this.BusinessCalendar != null)
                {
                    hashCode = (hashCode * 59) + this.BusinessCalendar.GetHashCode();
                }
                hashCode = (hashCode * 59) + this.DeleteScheduleAfterDays.GetHashCode();
                hashCode = (hashCode * 59) + this.NumberOfPackages.GetHashCode();
                if (this.Entities != null)
                {
                    hashCode = (hashCode * 59) + this.Entities.GetHashCode();
                }
                if (this.OwnerRole != null)
                {
                    hashCode = (hashCode * 59) + this.OwnerRole.GetHashCode();
                }
                if (this.Notes != null)
                {
                    hashCode = (hashCode * 59) + this.Notes.GetHashCode();
                }
                if (this.LastUpdatedBy != null)
                {
                    hashCode = (hashCode * 59) + this.LastUpdatedBy.GetHashCode();
                }
                if (this.LastUpdated != null)
                {
                    hashCode = (hashCode * 59) + this.LastUpdated.GetHashCode();
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
