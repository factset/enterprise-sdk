/*
 * FactSet Private Company API
 *
 * FactSet Private Company API encompasses Private Company Financials and includes some Private Company non-periodic data. Additional Private Company firmographics can be found in the FactSet Entity API. <p><b>Rate limit is set to 10 requests per second and 10 concurrent requests per user</b>.</p> 
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
using OpenAPIDateConverter = FactSet.SDK.FactSetPrivateCompany.Client.OpenAPIDateConverter;

namespace FactSet.SDK.FactSetPrivateCompany.Model
{
    /// <summary>
    /// Financial Statement objects
    /// </summary>
    [DataContract(Name = "StatementItem")]
    public partial class StatementItem : IEquatable<StatementItem>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="StatementItem" /> class.
        /// </summary>
        /// <param name="name">Name of the metric.</param>
        /// <param name="metricName">FactSet Private Company metric representing the corresponding financial metric.</param>
        /// <param name="displayLevel">Describes the level of displaying the item.</param>
        /// <param name="displayOrder">Describes the order of displaying the item.</param>
        /// <param name="value">Array of values for the data metrics requested. Values correspond to the reportDate and fiscalYear based on their index (array position)..</param>
        public StatementItem(string name = default(string), string metricName = default(string), string displayLevel = default(string), int displayOrder = default(int), List<double?> value = default(List<double?>))
        {
            this.Name = name;
            this.MetricName = metricName;
            this.DisplayLevel = displayLevel;
            this.DisplayOrder = displayOrder;
            this.Value = value;
        }

        /// <summary>
        /// Name of the metric
        /// </summary>
        /// <value>Name of the metric</value>
        [DataMember(Name = "name", EmitDefaultValue = false)]
        public string Name { get; set; }

        /// <summary>
        /// FactSet Private Company metric representing the corresponding financial metric
        /// </summary>
        /// <value>FactSet Private Company metric representing the corresponding financial metric</value>
        [DataMember(Name = "metricName", EmitDefaultValue = false)]
        public string MetricName { get; set; }

        /// <summary>
        /// Describes the level of displaying the item
        /// </summary>
        /// <value>Describes the level of displaying the item</value>
        [DataMember(Name = "displayLevel", EmitDefaultValue = false)]
        public string DisplayLevel { get; set; }

        /// <summary>
        /// Describes the order of displaying the item
        /// </summary>
        /// <value>Describes the order of displaying the item</value>
        [DataMember(Name = "displayOrder", EmitDefaultValue = false)]
        public int DisplayOrder { get; set; }

        /// <summary>
        /// Array of values for the data metrics requested. Values correspond to the reportDate and fiscalYear based on their index (array position).
        /// </summary>
        /// <value>Array of values for the data metrics requested. Values correspond to the reportDate and fiscalYear based on their index (array position).</value>
        [DataMember(Name = "value", EmitDefaultValue = false)]
        public List<double?> Value { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class StatementItem {\n");
            sb.Append("  Name: ").Append(Name).Append("\n");
            sb.Append("  MetricName: ").Append(MetricName).Append("\n");
            sb.Append("  DisplayLevel: ").Append(DisplayLevel).Append("\n");
            sb.Append("  DisplayOrder: ").Append(DisplayOrder).Append("\n");
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
            return this.Equals(input as StatementItem);
        }

        /// <summary>
        /// Returns true if StatementItem instances are equal
        /// </summary>
        /// <param name="input">Instance of StatementItem to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(StatementItem input)
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
                    this.MetricName == input.MetricName ||
                    (this.MetricName != null &&
                    this.MetricName.Equals(input.MetricName))
                ) && 
                (
                    this.DisplayLevel == input.DisplayLevel ||
                    (this.DisplayLevel != null &&
                    this.DisplayLevel.Equals(input.DisplayLevel))
                ) && 
                (
                    this.DisplayOrder == input.DisplayOrder ||
                    this.DisplayOrder.Equals(input.DisplayOrder)
                ) && 
                (
                    this.Value == input.Value ||
                    this.Value != null &&
                    input.Value != null &&
                    this.Value.SequenceEqual(input.Value)
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
                if (this.MetricName != null)
                {
                    hashCode = (hashCode * 59) + this.MetricName.GetHashCode();
                }
                if (this.DisplayLevel != null)
                {
                    hashCode = (hashCode * 59) + this.DisplayLevel.GetHashCode();
                }
                hashCode = (hashCode * 59) + this.DisplayOrder.GetHashCode();
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
