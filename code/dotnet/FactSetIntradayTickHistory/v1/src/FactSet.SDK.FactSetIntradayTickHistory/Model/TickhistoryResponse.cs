/*
 * Tick History
 *
 * <p>FactSet’s Tick History provides cost-effective access to real-time and delayed global exchange data. Proprietary technology normalizes over 200 global exchanges and 19 tick history fields. Asset types integrated include equities, futures, options, fixed income, mutual funds, ETFs, indices, commodities, and FX rates.</p><p>Tick History provides dynamic access to tick data for a specific security intra-day or historically via standard HTTPS protocol. History is available for all quotes and trades for a trailing 6 months or 1-year, respectively. Quotes and trade data for Options is available for 30 days. Tick History data is also available in a separate end-of-day feed.</p>   
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
using OpenAPIDateConverter = FactSet.SDK.FactSetIntradayTickHistory.Client.OpenAPIDateConverter;

namespace FactSet.SDK.FactSetIntradayTickHistory.Model
{
    /// <summary>
    /// response for tick history
    /// </summary>
    [DataContract(Name = "tickhistory_response")]
    public partial class TickhistoryResponse : IEquatable<TickhistoryResponse>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="TickhistoryResponse" /> class.
        /// </summary>
        /// <param name="requestedID">Request Identification String..</param>
        /// <param name="requestedSymbol">Single Requested Symbol or Security..</param>
        /// <param name="requestedFields">Array of requested fields .</param>
        /// <param name="requestKey">requestKey.</param>
        /// <param name="errorCode">errorCode.</param>
        /// <param name="errorDescription">Brief description of error response. Blank if successful..</param>
        /// <param name="fieldNames">Requested Field Names.</param>
        /// <param name="fieldIDs">Requested Field ID numbers &#39;FID&#39;. Found in Data Service Manual..</param>
        /// <param name="key">Requested Symbol Key, where :D represented delayed data..</param>
        /// <param name="values">Array of field values. Each value is returned for requested interval query..</param>
        public TickhistoryResponse(string requestedID = default(string), string requestedSymbol = default(string), List<Fields> requestedFields = default(List<Fields>), string requestKey = default(string), string errorCode = default(string), string errorDescription = default(string), string fieldNames = default(string), decimal fieldIDs = default(decimal), string key = default(string), decimal values = default(decimal))
        {
            this.RequestedID = requestedID;
            this.RequestedSymbol = requestedSymbol;
            this.RequestedFields = requestedFields;
            this.RequestKey = requestKey;
            this.ErrorCode = errorCode;
            this.ErrorDescription = errorDescription;
            this.FieldNames = fieldNames;
            this.FieldIDs = fieldIDs;
            this.Key = key;
            this.Values = values;
        }

        /// <summary>
        /// Request Identification String.
        /// </summary>
        /// <value>Request Identification String.</value>
        [DataMember(Name = "Requested ID", EmitDefaultValue = false)]
        public string RequestedID { get; set; }

        /// <summary>
        /// Single Requested Symbol or Security.
        /// </summary>
        /// <value>Single Requested Symbol or Security.</value>
        [DataMember(Name = "Requested Symbol", EmitDefaultValue = false)]
        public string RequestedSymbol { get; set; }

        /// <summary>
        /// Array of requested fields 
        /// </summary>
        /// <value>Array of requested fields </value>
        [DataMember(Name = "Requested Fields", EmitDefaultValue = false)]
        public List<Fields> RequestedFields { get; set; }

        /// <summary>
        /// Gets or Sets RequestKey
        /// </summary>
        [DataMember(Name = "Request Key", EmitDefaultValue = false)]
        public string RequestKey { get; set; }

        /// <summary>
        /// Gets or Sets ErrorCode
        /// </summary>
        [DataMember(Name = "Error Code", EmitDefaultValue = false)]
        public string ErrorCode { get; set; }

        /// <summary>
        /// Brief description of error response. Blank if successful.
        /// </summary>
        /// <value>Brief description of error response. Blank if successful.</value>
        [DataMember(Name = "Error Description", EmitDefaultValue = false)]
        public string ErrorDescription { get; set; }

        /// <summary>
        /// Requested Field Names
        /// </summary>
        /// <value>Requested Field Names</value>
        [DataMember(Name = "Field Names", EmitDefaultValue = false)]
        public string FieldNames { get; set; }

        /// <summary>
        /// Requested Field ID numbers &#39;FID&#39;. Found in Data Service Manual.
        /// </summary>
        /// <value>Requested Field ID numbers &#39;FID&#39;. Found in Data Service Manual.</value>
        [DataMember(Name = "Field IDs", EmitDefaultValue = false)]
        public decimal FieldIDs { get; set; }

        /// <summary>
        /// Requested Symbol Key, where :D represented delayed data.
        /// </summary>
        /// <value>Requested Symbol Key, where :D represented delayed data.</value>
        [DataMember(Name = "Key", EmitDefaultValue = false)]
        public string Key { get; set; }

        /// <summary>
        /// Array of field values. Each value is returned for requested interval query.
        /// </summary>
        /// <value>Array of field values. Each value is returned for requested interval query.</value>
        [DataMember(Name = "Values", EmitDefaultValue = false)]
        public decimal Values { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class TickhistoryResponse {\n");
            sb.Append("  RequestedID: ").Append(RequestedID).Append("\n");
            sb.Append("  RequestedSymbol: ").Append(RequestedSymbol).Append("\n");
            sb.Append("  RequestedFields: ").Append(RequestedFields).Append("\n");
            sb.Append("  RequestKey: ").Append(RequestKey).Append("\n");
            sb.Append("  ErrorCode: ").Append(ErrorCode).Append("\n");
            sb.Append("  ErrorDescription: ").Append(ErrorDescription).Append("\n");
            sb.Append("  FieldNames: ").Append(FieldNames).Append("\n");
            sb.Append("  FieldIDs: ").Append(FieldIDs).Append("\n");
            sb.Append("  Key: ").Append(Key).Append("\n");
            sb.Append("  Values: ").Append(Values).Append("\n");
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
            return this.Equals(input as TickhistoryResponse);
        }

        /// <summary>
        /// Returns true if TickhistoryResponse instances are equal
        /// </summary>
        /// <param name="input">Instance of TickhistoryResponse to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(TickhistoryResponse input)
        {
            if (input == null)
            {
                return false;
            }
            return 
                (
                    this.RequestedID == input.RequestedID ||
                    (this.RequestedID != null &&
                    this.RequestedID.Equals(input.RequestedID))
                ) && 
                (
                    this.RequestedSymbol == input.RequestedSymbol ||
                    (this.RequestedSymbol != null &&
                    this.RequestedSymbol.Equals(input.RequestedSymbol))
                ) && 
                (
                    this.RequestedFields == input.RequestedFields ||
                    this.RequestedFields != null &&
                    input.RequestedFields != null &&
                    this.RequestedFields.SequenceEqual(input.RequestedFields)
                ) && 
                (
                    this.RequestKey == input.RequestKey ||
                    (this.RequestKey != null &&
                    this.RequestKey.Equals(input.RequestKey))
                ) && 
                (
                    this.ErrorCode == input.ErrorCode ||
                    (this.ErrorCode != null &&
                    this.ErrorCode.Equals(input.ErrorCode))
                ) && 
                (
                    this.ErrorDescription == input.ErrorDescription ||
                    (this.ErrorDescription != null &&
                    this.ErrorDescription.Equals(input.ErrorDescription))
                ) && 
                (
                    this.FieldNames == input.FieldNames ||
                    (this.FieldNames != null &&
                    this.FieldNames.Equals(input.FieldNames))
                ) && 
                (
                    this.FieldIDs == input.FieldIDs ||
                    this.FieldIDs.Equals(input.FieldIDs)
                ) && 
                (
                    this.Key == input.Key ||
                    (this.Key != null &&
                    this.Key.Equals(input.Key))
                ) && 
                (
                    this.Values == input.Values ||
                    this.Values.Equals(input.Values)
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
                if (this.RequestedID != null)
                {
                    hashCode = (hashCode * 59) + this.RequestedID.GetHashCode();
                }
                if (this.RequestedSymbol != null)
                {
                    hashCode = (hashCode * 59) + this.RequestedSymbol.GetHashCode();
                }
                if (this.RequestedFields != null)
                {
                    hashCode = (hashCode * 59) + this.RequestedFields.GetHashCode();
                }
                if (this.RequestKey != null)
                {
                    hashCode = (hashCode * 59) + this.RequestKey.GetHashCode();
                }
                if (this.ErrorCode != null)
                {
                    hashCode = (hashCode * 59) + this.ErrorCode.GetHashCode();
                }
                if (this.ErrorDescription != null)
                {
                    hashCode = (hashCode * 59) + this.ErrorDescription.GetHashCode();
                }
                if (this.FieldNames != null)
                {
                    hashCode = (hashCode * 59) + this.FieldNames.GetHashCode();
                }
                hashCode = (hashCode * 59) + this.FieldIDs.GetHashCode();
                if (this.Key != null)
                {
                    hashCode = (hashCode * 59) + this.Key.GetHashCode();
                }
                hashCode = (hashCode * 59) + this.Values.GetHashCode();
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
