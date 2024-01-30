/*
 * Analytics Datastore API
 *
 * Allow clients to fetch precalculated Analytics through predeterministic URLs.
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
using OpenAPIDateConverter = FactSet.SDK.AnalyticsDatastore.Client.OpenAPIDateConverter;

namespace FactSet.SDK.AnalyticsDatastore.Model
{
    /// <summary>
    /// Response object for a list of tags
    /// </summary>
    [DataContract(Name = "TagListResponse")]
    public partial class TagListResponse : IEquatable<TagListResponse>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="TagListResponse" /> class.
        /// </summary>
        /// <param name="meta">meta.</param>
        /// <param name="data">Array of tags.</param>
        public TagListResponse(MetaModel meta = default(MetaModel), List<TagModel> data = default(List<TagModel>))
        {
            this.Meta = meta;
            this.Data = data;
        }

        /// <summary>
        /// Gets or Sets Meta
        /// </summary>
        [DataMember(Name = "meta", EmitDefaultValue = false)]
        public MetaModel Meta { get; set; }

        /// <summary>
        /// Array of tags
        /// </summary>
        /// <value>Array of tags</value>
        [DataMember(Name = "data", EmitDefaultValue = false)]
        public List<TagModel> Data { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class TagListResponse {\n");
            sb.Append("  Meta: ").Append(Meta).Append("\n");
            sb.Append("  Data: ").Append(Data).Append("\n");
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
            return this.Equals(input as TagListResponse);
        }

        /// <summary>
        /// Returns true if TagListResponse instances are equal
        /// </summary>
        /// <param name="input">Instance of TagListResponse to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(TagListResponse input)
        {
            if (input == null)
            {
                return false;
            }
            return 
                (
                    this.Meta == input.Meta ||
                    (this.Meta != null &&
                    this.Meta.Equals(input.Meta))
                ) && 
                (
                    this.Data == input.Data ||
                    this.Data != null &&
                    input.Data != null &&
                    this.Data.SequenceEqual(input.Data)
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
                if (this.Meta != null)
                {
                    hashCode = (hashCode * 59) + this.Meta.GetHashCode();
                }
                if (this.Data != null)
                {
                    hashCode = (hashCode * 59) + this.Data.GetHashCode();
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
