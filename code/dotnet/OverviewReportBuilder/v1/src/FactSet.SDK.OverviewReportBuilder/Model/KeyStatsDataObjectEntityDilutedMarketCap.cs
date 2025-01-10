/*
 * FactSet Overview Report Builder API
 *
 * Get relevant industry-specific data for high level analysis of public and private companies
 *
 * The version of the OpenAPI document: 1.1.0
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
using OpenAPIDateConverter = FactSet.SDK.OverviewReportBuilder.Client.OpenAPIDateConverter;

namespace FactSet.SDK.OverviewReportBuilder.Model
{
    /// <summary>
    /// The total theoretical market value of a company, including all shares that could potentially be converted into common shares, such as outstanding shares, stock options, warrants, and convertible securities
    /// </summary>
    [DataContract(Name = "KeyStatsDataObjectEntity_dilutedMarketCap")]
    public partial class KeyStatsDataObjectEntityDilutedMarketCap : IEquatable<KeyStatsDataObjectEntityDilutedMarketCap>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="KeyStatsDataObjectEntityDilutedMarketCap" /> class.
        /// </summary>
        [JsonConstructorAttribute]
        protected KeyStatsDataObjectEntityDilutedMarketCap() { }
        /// <summary>
        /// Initializes a new instance of the <see cref="KeyStatsDataObjectEntityDilutedMarketCap" /> class.
        /// </summary>
        /// <param name="label">label (required).</param>
        /// <param name="meta">meta.</param>
        /// <param name="value">value (required).</param>
        public KeyStatsDataObjectEntityDilutedMarketCap(KeyStatsAttributeLabel label, KeyStatsAttributeValueNumber value,KeyStatsAttributeMeta meta = default(KeyStatsAttributeMeta))
        {
            // to ensure "label" is required (not null)
            if (label == null) {
                throw new ArgumentNullException("label is a required property for KeyStatsDataObjectEntityDilutedMarketCap and cannot be null");
            }
            this.Label = label;
            // to ensure "value" is required (not null)
            if (value == null) {
                throw new ArgumentNullException("value is a required property for KeyStatsDataObjectEntityDilutedMarketCap and cannot be null");
            }
            this.Value = value;
            this.Meta = meta;
        }

        /// <summary>
        /// Gets or Sets Label
        /// </summary>
        [DataMember(Name = "label", IsRequired = true, EmitDefaultValue = false)]
        public KeyStatsAttributeLabel Label { get; set; }

        /// <summary>
        /// Gets or Sets Meta
        /// </summary>
        [DataMember(Name = "meta", EmitDefaultValue = false)]
        public KeyStatsAttributeMeta Meta { get; set; }

        /// <summary>
        /// Gets or Sets Value
        /// </summary>
        [DataMember(Name = "value", IsRequired = true, EmitDefaultValue = false)]
        public KeyStatsAttributeValueNumber Value { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class KeyStatsDataObjectEntityDilutedMarketCap {\n");
            sb.Append("  Label: ").Append(Label).Append("\n");
            sb.Append("  Meta: ").Append(Meta).Append("\n");
            sb.Append("  Value: ").Append(Value).Append("\n");
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
            return this.Equals(input as KeyStatsDataObjectEntityDilutedMarketCap);
        }

        /// <summary>
        /// Returns true if KeyStatsDataObjectEntityDilutedMarketCap instances are equal
        /// </summary>
        /// <param name="input">Instance of KeyStatsDataObjectEntityDilutedMarketCap to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(KeyStatsDataObjectEntityDilutedMarketCap input)
        {
            if (input == null)
            {
                return false;
            }
            return 
                (
                    this.Label == input.Label ||
                    (this.Label != null &&
                    this.Label.Equals(input.Label))
                ) && 
                (
                    this.Meta == input.Meta ||
                    (this.Meta != null &&
                    this.Meta.Equals(input.Meta))
                ) && 
                (
                    this.Value == input.Value ||
                    (this.Value != null &&
                    this.Value.Equals(input.Value))
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
                if (this.Label != null)
                {
                    hashCode = (hashCode * 59) + this.Label.GetHashCode();
                }
                if (this.Meta != null)
                {
                    hashCode = (hashCode * 59) + this.Meta.GetHashCode();
                }
                if (this.Value != null)
                {
                    hashCode = (hashCode * 59) + this.Value.GetHashCode();
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
