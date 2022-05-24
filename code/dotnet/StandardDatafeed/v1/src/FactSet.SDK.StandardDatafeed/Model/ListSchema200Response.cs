/*
 * SDF_API
 *
 * The Standard Datafeed (SDF) API provides an alternative method for users to request and retrieve SDF packages (schemas & bundles). This service is not a direct replacement and does not have 100% feature parity with the Loader. This API provides an alternative for users who are unable to utilize the Loader due to:  Unable to install 3rd party executables due to Corporate Security policies Unable to utilize the Loader due to limitations or restrictions with the environment used to consume Standard Datafeed Clients who are utilizing existing delivery method like FTP, who may want to use a more secured & modern solution This API allows users to retrieve SDF packages they have subscriptions for, going back to August 31, 2021. Additional parameters are available to filter requests to get the exact files users are looking for. 
 *
 * The version of the OpenAPI document: 1.0
 * Contact: teammustang@factset.com
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
using OpenAPIDateConverter = FactSet.SDK.StandardDatafeed.Client.OpenAPIDateConverter;

namespace FactSet.SDK.StandardDatafeed.Model
{
    /// <summary>
    /// ListSchema200Response
    /// </summary>
    [DataContract(Name = "list-schema_200Response")]
    public partial class ListSchema200Response : IEquatable<ListSchema200Response>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="ListSchema200Response" /> class.
        /// </summary>
        /// <param name="schema">schema name.</param>
        /// <param name="sequence">version number of the schema.</param>
        /// <param name="url">pre-signed downloadable url of the schema &amp; sequence.</param>
        /// <param name="timestamp">time stamp of when the schema-sequence was last updated.</param>
        public ListSchema200Response(string schema = default(string), int sequence = default(int), string url = default(string), string timestamp = default(string))
        {
            this.Schema = schema;
            this.Sequence = sequence;
            this.Url = url;
            this.Timestamp = timestamp;
        }

        /// <summary>
        /// schema name
        /// </summary>
        /// <value>schema name</value>
        [DataMember(Name = "schema", EmitDefaultValue = false)]
        public string Schema { get; set; }

        /// <summary>
        /// version number of the schema
        /// </summary>
        /// <value>version number of the schema</value>
        [DataMember(Name = "sequence", EmitDefaultValue = false)]
        public int Sequence { get; set; }

        /// <summary>
        /// pre-signed downloadable url of the schema &amp; sequence
        /// </summary>
        /// <value>pre-signed downloadable url of the schema &amp; sequence</value>
        [DataMember(Name = "url", EmitDefaultValue = false)]
        public string Url { get; set; }

        /// <summary>
        /// time stamp of when the schema-sequence was last updated
        /// </summary>
        /// <value>time stamp of when the schema-sequence was last updated</value>
        [DataMember(Name = "timestamp", EmitDefaultValue = false)]
        public string Timestamp { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class ListSchema200Response {\n");
            sb.Append("  Schema: ").Append(Schema).Append("\n");
            sb.Append("  Sequence: ").Append(Sequence).Append("\n");
            sb.Append("  Url: ").Append(Url).Append("\n");
            sb.Append("  Timestamp: ").Append(Timestamp).Append("\n");
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
            return this.Equals(input as ListSchema200Response);
        }

        /// <summary>
        /// Returns true if ListSchema200Response instances are equal
        /// </summary>
        /// <param name="input">Instance of ListSchema200Response to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(ListSchema200Response input)
        {
            if (input == null)
            {
                return false;
            }
            return 
                (
                    this.Schema == input.Schema ||
                    (this.Schema != null &&
                    this.Schema.Equals(input.Schema))
                ) && 
                (
                    this.Sequence == input.Sequence ||
                    this.Sequence.Equals(input.Sequence)
                ) && 
                (
                    this.Url == input.Url ||
                    (this.Url != null &&
                    this.Url.Equals(input.Url))
                ) && 
                (
                    this.Timestamp == input.Timestamp ||
                    (this.Timestamp != null &&
                    this.Timestamp.Equals(input.Timestamp))
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
                if (this.Schema != null)
                {
                    hashCode = (hashCode * 59) + this.Schema.GetHashCode();
                }
                hashCode = (hashCode * 59) + this.Sequence.GetHashCode();
                if (this.Url != null)
                {
                    hashCode = (hashCode * 59) + this.Url.GetHashCode();
                }
                if (this.Timestamp != null)
                {
                    hashCode = (hashCode * 59) + this.Timestamp.GetHashCode();
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