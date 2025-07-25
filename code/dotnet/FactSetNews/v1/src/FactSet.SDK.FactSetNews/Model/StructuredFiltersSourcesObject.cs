/*
 * News API
 *
 *  The FactSet News API provides access to FactSet’s news alongside business logic that allows users to replicate views and functionality consistent with the experience provided by the Workstation. This API provides the ability to create views and pull news headlines based on specific filters. There are the filters available for News:  * Watchlists/Indices/Tickers * Sources * Company Filters * Market Topics * Countries * Regions      
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
using OpenAPIDateConverter = FactSet.SDK.FactSetNews.Client.OpenAPIDateConverter;

namespace FactSet.SDK.FactSetNews.Model
{
    /// <summary>
    /// StructuredFiltersSourcesObject
    /// </summary>
    [DataContract(Name = "StructuredFiltersSourcesObject")]
    public partial class StructuredFiltersSourcesObject : IEquatable<StructuredFiltersSourcesObject>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="StructuredFiltersSourcesObject" /> class.
        /// </summary>
        [JsonConstructorAttribute]
        protected StructuredFiltersSourcesObject() { }
        /// <summary>
        /// Initializes a new instance of the <see cref="StructuredFiltersSourcesObject" /> class.
        /// </summary>
        /// <param name="name">The name of the source. (required).</param>
        /// <param name="topLevel">Indicates if its a toplevel value or not..</param>
        /// <param name="value">The value associated with the source..</param>
        /// <param name="children">children.</param>
        /// <param name="criteriaLabel">The criteria label associated with the source..</param>
        /// <param name="topLevelCriteria">Indicates if its the toplevelCriteria value or not..</param>
        public StructuredFiltersSourcesObject(string name,bool topLevel = default(bool), List<string> value = default(List<string>), List<StructuredFiltersSourcesChildrenObject> children = default(List<StructuredFiltersSourcesChildrenObject>), string criteriaLabel = default(string), bool topLevelCriteria = default(bool))
        {
            // to ensure "name" is required (not null)
            if (name == null) {
                throw new ArgumentNullException("name is a required property for StructuredFiltersSourcesObject and cannot be null");
            }
            this.Name = name;
            this.TopLevel = topLevel;
            this.Value = value;
            this.Children = children;
            this.CriteriaLabel = criteriaLabel;
            this.TopLevelCriteria = topLevelCriteria;
        }

        /// <summary>
        /// The name of the source.
        /// </summary>
        /// <value>The name of the source.</value>
        [DataMember(Name = "name", IsRequired = true, EmitDefaultValue = false)]
        public string Name { get; set; }

        /// <summary>
        /// Indicates if its a toplevel value or not.
        /// </summary>
        /// <value>Indicates if its a toplevel value or not.</value>
        [DataMember(Name = "topLevel", EmitDefaultValue = true)]
        public bool TopLevel { get; set; }

        /// <summary>
        /// The value associated with the source.
        /// </summary>
        /// <value>The value associated with the source.</value>
        [DataMember(Name = "value", EmitDefaultValue = false)]
        public List<string> Value { get; set; }

        /// <summary>
        /// Gets or Sets Children
        /// </summary>
        [DataMember(Name = "children", EmitDefaultValue = false)]
        public List<StructuredFiltersSourcesChildrenObject> Children { get; set; }

        /// <summary>
        /// The criteria label associated with the source.
        /// </summary>
        /// <value>The criteria label associated with the source.</value>
        [DataMember(Name = "criteriaLabel", EmitDefaultValue = false)]
        public string CriteriaLabel { get; set; }

        /// <summary>
        /// Indicates if its the toplevelCriteria value or not.
        /// </summary>
        /// <value>Indicates if its the toplevelCriteria value or not.</value>
        [DataMember(Name = "topLevelCriteria", EmitDefaultValue = true)]
        public bool TopLevelCriteria { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class StructuredFiltersSourcesObject {\n");
            sb.Append("  Name: ").Append(Name).Append("\n");
            sb.Append("  TopLevel: ").Append(TopLevel).Append("\n");
            sb.Append("  Value: ").Append(Value).Append("\n");
            sb.Append("  Children: ").Append(Children).Append("\n");
            sb.Append("  CriteriaLabel: ").Append(CriteriaLabel).Append("\n");
            sb.Append("  TopLevelCriteria: ").Append(TopLevelCriteria).Append("\n");
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
            return this.Equals(input as StructuredFiltersSourcesObject);
        }

        /// <summary>
        /// Returns true if StructuredFiltersSourcesObject instances are equal
        /// </summary>
        /// <param name="input">Instance of StructuredFiltersSourcesObject to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(StructuredFiltersSourcesObject input)
        {
            if (input == null)
            {
                return false;
            }
            return 
                (
                    this.Name == input.Name ||
                    (this.Name != null &&
                    this.Name.Equals(input.Name))
                ) && 
                (
                    this.TopLevel == input.TopLevel ||
                    this.TopLevel.Equals(input.TopLevel)
                ) && 
                (
                    this.Value == input.Value ||
                    this.Value != null &&
                    input.Value != null &&
                    this.Value.SequenceEqual(input.Value)
                ) && 
                (
                    this.Children == input.Children ||
                    this.Children != null &&
                    input.Children != null &&
                    this.Children.SequenceEqual(input.Children)
                ) && 
                (
                    this.CriteriaLabel == input.CriteriaLabel ||
                    (this.CriteriaLabel != null &&
                    this.CriteriaLabel.Equals(input.CriteriaLabel))
                ) && 
                (
                    this.TopLevelCriteria == input.TopLevelCriteria ||
                    this.TopLevelCriteria.Equals(input.TopLevelCriteria)
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
                if (this.Name != null)
                {
                    hashCode = (hashCode * 59) + this.Name.GetHashCode();
                }
                hashCode = (hashCode * 59) + this.TopLevel.GetHashCode();
                if (this.Value != null)
                {
                    hashCode = (hashCode * 59) + this.Value.GetHashCode();
                }
                if (this.Children != null)
                {
                    hashCode = (hashCode * 59) + this.Children.GetHashCode();
                }
                if (this.CriteriaLabel != null)
                {
                    hashCode = (hashCode * 59) + this.CriteriaLabel.GetHashCode();
                }
                hashCode = (hashCode * 59) + this.TopLevelCriteria.GetHashCode();
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
