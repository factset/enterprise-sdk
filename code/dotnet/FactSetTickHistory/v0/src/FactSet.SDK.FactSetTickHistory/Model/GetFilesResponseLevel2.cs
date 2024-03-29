/*
 * Tick History Level 2 (Beta)
 *
 * Tick History **Level 2** provides dynamic access to the historical tick data up to 10 levels of depth for a specific security for specific dates or date range. The API generates output files with data based on client-specified input parameters. The input parameters include universe specification and date ranges for which the data will be generated. When the API request with specified input parameters has been completed, the output files will be made available back to the users through a secure URL to the location where the files are stored. Therefore, this API has two APIs (i) Request files API (ii) Get Files API.
 *
 * The version of the OpenAPI document: 0.0.0
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
using OpenAPIDateConverter = FactSet.SDK.FactSetTickHistory.Client.OpenAPIDateConverter;

namespace FactSet.SDK.FactSetTickHistory.Model
{
    /// <summary>
    /// Returns Tick History Files
    /// </summary>
    [DataContract(Name = "Get-FilesResponseLevel2")]
    public partial class GetFilesResponseLevel2 : IEquatable<GetFilesResponseLevel2>, IValidatableObject
    {
        /// <summary>
        /// The status of the request
        /// </summary>
        /// <value>The status of the request</value>
        [JsonConverter(typeof(StringEnumConverter))]
        public enum StatusEnum
        {
            /// <summary>
            /// Enum Starting for value: Starting
            /// </summary>
            [EnumMember(Value = "Starting")]
            Starting = 1,

            /// <summary>
            /// Enum Running for value: Running
            /// </summary>
            [EnumMember(Value = "Running")]
            Running = 2,

            /// <summary>
            /// Enum Completed for value: Completed
            /// </summary>
            [EnumMember(Value = "Completed")]
            Completed = 3,

            /// <summary>
            /// Enum Error for value: Error
            /// </summary>
            [EnumMember(Value = "Error")]
            Error = 4,

            /// <summary>
            /// Enum Failed for value: Failed
            /// </summary>
            [EnumMember(Value = "Failed")]
            Failed = 5,

            /// <summary>
            /// Enum Stopped for value: Stopped
            /// </summary>
            [EnumMember(Value = "Stopped")]
            Stopped = 6

        }


        /// <summary>
        /// The status of the request
        /// </summary>
        /// <value>The status of the request</value>
        [DataMember(Name = "status", EmitDefaultValue = false)]
        public StatusEnum? Status { get; set; }
        /// <summary>
        /// Initializes a new instance of the <see cref="GetFilesResponseLevel2" /> class.
        /// </summary>
        /// <param name="status">The status of the request.</param>
        /// <param name="requestTimestamp">Timestamp of when request was made.</param>
        /// <param name="updateTimestamp">Timestamp when the file was last updated.</param>
        /// <param name="data">Data Object.</param>
        /// <param name="meta">meta.</param>
        public GetFilesResponseLevel2(StatusEnum? status = default(StatusEnum?), DateTime requestTimestamp = default(DateTime), DateTime updateTimestamp = default(DateTime), List<Files> data = default(List<Files>), Meta meta = default(Meta))
        {
            this.Status = status;
            this.RequestTimestamp = requestTimestamp;
            this.UpdateTimestamp = updateTimestamp;
            this.Data = data;
            this.Meta = meta;
        }

        /// <summary>
        /// Timestamp of when request was made
        /// </summary>
        /// <value>Timestamp of when request was made</value>
        [DataMember(Name = "requestTimestamp", EmitDefaultValue = false)]
        public DateTime RequestTimestamp { get; set; }

        /// <summary>
        /// Timestamp when the file was last updated
        /// </summary>
        /// <value>Timestamp when the file was last updated</value>
        [DataMember(Name = "updateTimestamp", EmitDefaultValue = false)]
        public DateTime UpdateTimestamp { get; set; }

        /// <summary>
        /// Data Object
        /// </summary>
        /// <value>Data Object</value>
        [DataMember(Name = "data", EmitDefaultValue = false)]
        public List<Files> Data { get; set; }

        /// <summary>
        /// Gets or Sets Meta
        /// </summary>
        [DataMember(Name = "meta", EmitDefaultValue = false)]
        public Meta Meta { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class GetFilesResponseLevel2 {\n");
            sb.Append("  Status: ").Append(Status).Append("\n");
            sb.Append("  RequestTimestamp: ").Append(RequestTimestamp).Append("\n");
            sb.Append("  UpdateTimestamp: ").Append(UpdateTimestamp).Append("\n");
            sb.Append("  Data: ").Append(Data).Append("\n");
            sb.Append("  Meta: ").Append(Meta).Append("\n");
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
            return this.Equals(input as GetFilesResponseLevel2);
        }

        /// <summary>
        /// Returns true if GetFilesResponseLevel2 instances are equal
        /// </summary>
        /// <param name="input">Instance of GetFilesResponseLevel2 to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(GetFilesResponseLevel2 input)
        {
            if (input == null)
            {
                return false;
            }
            return 
                (
                    this.Status == input.Status ||
                    this.Status.Equals(input.Status)
                ) && 
                (
                    this.RequestTimestamp == input.RequestTimestamp ||
                    (this.RequestTimestamp != null &&
                    this.RequestTimestamp.Equals(input.RequestTimestamp))
                ) && 
                (
                    this.UpdateTimestamp == input.UpdateTimestamp ||
                    (this.UpdateTimestamp != null &&
                    this.UpdateTimestamp.Equals(input.UpdateTimestamp))
                ) && 
                (
                    this.Data == input.Data ||
                    this.Data != null &&
                    input.Data != null &&
                    this.Data.SequenceEqual(input.Data)
                ) && 
                (
                    this.Meta == input.Meta ||
                    (this.Meta != null &&
                    this.Meta.Equals(input.Meta))
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
                hashCode = (hashCode * 59) + this.Status.GetHashCode();
                if (this.RequestTimestamp != null)
                {
                    hashCode = (hashCode * 59) + this.RequestTimestamp.GetHashCode();
                }
                if (this.UpdateTimestamp != null)
                {
                    hashCode = (hashCode * 59) + this.UpdateTimestamp.GetHashCode();
                }
                if (this.Data != null)
                {
                    hashCode = (hashCode * 59) + this.Data.GetHashCode();
                }
                if (this.Meta != null)
                {
                    hashCode = (hashCode * 59) + this.Meta.GetHashCode();
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
