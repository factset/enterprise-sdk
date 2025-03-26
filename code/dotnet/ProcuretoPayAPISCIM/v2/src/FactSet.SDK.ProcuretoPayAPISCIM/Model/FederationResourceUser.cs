/*
 * FactSet SCIM API
 *
 * FactSet's SCIM API implementation.
 *
 * The version of the OpenAPI document: 2.3.0
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
using OpenAPIDateConverter = FactSet.SDK.ProcuretoPayAPISCIM.Client.OpenAPIDateConverter;

namespace FactSet.SDK.ProcuretoPayAPISCIM.Model
{
    /// <summary>
    /// A reference to a User resource that is associated with a federation.
    /// </summary>
    [DataContract(Name = "FederationResourceUser")]
    public partial class FederationResourceUser : IEquatable<FederationResourceUser>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="FederationResourceUser" /> class.
        /// </summary>
        [JsonConstructorAttribute]
        protected FederationResourceUser() { }
        /// <summary>
        /// Initializes a new instance of the <see cref="FederationResourceUser" /> class.
        /// </summary>
        /// <param name="value">Identifier of the User..</param>
        /// <param name="_ref">The URI corresponding to a SCIM resource that is this User..</param>
        /// <param name="display">A human-readable name, primarily used for display purposes..</param>
        /// <param name="assertionValues">A list of assertion value(s) provided by this identity provider. (required).</param>
        public FederationResourceUser(List<FederationResourceUserAssertionValue> assertionValues,string value = default(string), string _ref = default(string), string display = default(string))
        {
            // to ensure "assertionValues" is required (not null)
            if (assertionValues == null) {
                throw new ArgumentNullException("assertionValues is a required property for FederationResourceUser and cannot be null");
            }
            this.AssertionValues = assertionValues;
            this.Value = value;
            this.Ref = _ref;
            this.Display = display;
        }

        /// <summary>
        /// Identifier of the User.
        /// </summary>
        /// <value>Identifier of the User.</value>
        [DataMember(Name = "value", EmitDefaultValue = false)]
        public string Value { get; set; }

        /// <summary>
        /// The URI corresponding to a SCIM resource that is this User.
        /// </summary>
        /// <value>The URI corresponding to a SCIM resource that is this User.</value>
        [DataMember(Name = "$ref", EmitDefaultValue = false)]
        public string Ref { get; set; }

        /// <summary>
        /// A human-readable name, primarily used for display purposes.
        /// </summary>
        /// <value>A human-readable name, primarily used for display purposes.</value>
        [DataMember(Name = "display", EmitDefaultValue = false)]
        public string Display { get; set; }

        /// <summary>
        /// A list of assertion value(s) provided by this identity provider.
        /// </summary>
        /// <value>A list of assertion value(s) provided by this identity provider.</value>
        [DataMember(Name = "assertionValues", IsRequired = true, EmitDefaultValue = false)]
        public List<FederationResourceUserAssertionValue> AssertionValues { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class FederationResourceUser {\n");
            sb.Append("  Value: ").Append(Value).Append("\n");
            sb.Append("  Ref: ").Append(Ref).Append("\n");
            sb.Append("  Display: ").Append(Display).Append("\n");
            sb.Append("  AssertionValues: ").Append(AssertionValues).Append("\n");
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
            return this.Equals(input as FederationResourceUser);
        }

        /// <summary>
        /// Returns true if FederationResourceUser instances are equal
        /// </summary>
        /// <param name="input">Instance of FederationResourceUser to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(FederationResourceUser input)
        {
            if (input == null)
            {
                return false;
            }
            return 
                (
                    this.Value == input.Value ||
                    (this.Value != null &&
                    this.Value.Equals(input.Value))
                ) && 
                (
                    this.Ref == input.Ref ||
                    (this.Ref != null &&
                    this.Ref.Equals(input.Ref))
                ) && 
                (
                    this.Display == input.Display ||
                    (this.Display != null &&
                    this.Display.Equals(input.Display))
                ) && 
                (
                    this.AssertionValues == input.AssertionValues ||
                    this.AssertionValues != null &&
                    input.AssertionValues != null &&
                    this.AssertionValues.SequenceEqual(input.AssertionValues)
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
                if (this.Value != null)
                {
                    hashCode = (hashCode * 59) + this.Value.GetHashCode();
                }
                if (this.Ref != null)
                {
                    hashCode = (hashCode * 59) + this.Ref.GetHashCode();
                }
                if (this.Display != null)
                {
                    hashCode = (hashCode * 59) + this.Display.GetHashCode();
                }
                if (this.AssertionValues != null)
                {
                    hashCode = (hashCode * 59) + this.AssertionValues.GetHashCode();
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
