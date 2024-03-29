/*
 * FactSet SCIM API
 *
 * FactSet's SCIM API implementation.
 *
 * The version of the OpenAPI document: 2.0.0
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
    /// SchemaSubAttributes
    /// </summary>
    [DataContract(Name = "Schema_subAttributes")]
    public partial class SchemaSubAttributes : IEquatable<SchemaSubAttributes>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="SchemaSubAttributes" /> class.
        /// </summary>
        [JsonConstructorAttribute]
        public SchemaSubAttributes(string name, string type, bool multiValued,string description = default(string), bool required = default(bool), List<string> canonicalValues = default(List<string>), bool caseExact = default(bool), string mutability = default(string), string returned = default(string), string uniqueness = default(string), List<string> referenceTypes = default(List<string>))
        {
        }

        /// <summary>
        /// The attribute&#39;s name.
        /// </summary>
        /// <value>The attribute&#39;s name.</value>
        [DataMember(Name = "name", IsRequired = true, EmitDefaultValue = false)]
        public string Name { get; private set; }

        /// <summary>
        /// Returns false as Name should not be serialized given that it's read-only.
        /// </summary>
        /// <returns>false (boolean)</returns>
        public bool ShouldSerializeName()
        {
            return false;
        }
        /// <summary>
        /// The attribute&#39;s data type. Valid values include &#39;string&#39;, &#39;complex&#39;, &#39;boolean&#39;, &#39;decimal&#39;, &#39;integer&#39;, &#39;dateTime&#39;, &#39;reference&#39;.
        /// </summary>
        /// <value>The attribute&#39;s data type. Valid values include &#39;string&#39;, &#39;complex&#39;, &#39;boolean&#39;, &#39;decimal&#39;, &#39;integer&#39;, &#39;dateTime&#39;, &#39;reference&#39;.</value>
        [DataMember(Name = "type", IsRequired = true, EmitDefaultValue = false)]
        public string Type { get; private set; }

        /// <summary>
        /// Returns false as Type should not be serialized given that it's read-only.
        /// </summary>
        /// <returns>false (boolean)</returns>
        public bool ShouldSerializeType()
        {
            return false;
        }
        /// <summary>
        /// A Boolean value indicating an attribute&#39;s plurality.
        /// </summary>
        /// <value>A Boolean value indicating an attribute&#39;s plurality.</value>
        [DataMember(Name = "multiValued", IsRequired = true, EmitDefaultValue = true)]
        public bool MultiValued { get; private set; }

        /// <summary>
        /// Returns false as MultiValued should not be serialized given that it's read-only.
        /// </summary>
        /// <returns>false (boolean)</returns>
        public bool ShouldSerializeMultiValued()
        {
            return false;
        }
        /// <summary>
        /// A human-readable description of the attribute.
        /// </summary>
        /// <value>A human-readable description of the attribute.</value>
        [DataMember(Name = "description", EmitDefaultValue = false)]
        public string Description { get; private set; }

        /// <summary>
        /// Returns false as Description should not be serialized given that it's read-only.
        /// </summary>
        /// <returns>false (boolean)</returns>
        public bool ShouldSerializeDescription()
        {
            return false;
        }
        /// <summary>
        /// A boolean value indicating whether or not the attribute is required.
        /// </summary>
        /// <value>A boolean value indicating whether or not the attribute is required.</value>
        [DataMember(Name = "required", EmitDefaultValue = true)]
        public bool Required { get; private set; }

        /// <summary>
        /// Returns false as Required should not be serialized given that it's read-only.
        /// </summary>
        /// <returns>false (boolean)</returns>
        public bool ShouldSerializeRequired()
        {
            return false;
        }
        /// <summary>
        /// A collection of canonical values.  When applicable, service providers MUST specify the canonical types, e.g.,  &#39;work&#39;, &#39;home&#39;.
        /// </summary>
        /// <value>A collection of canonical values.  When applicable, service providers MUST specify the canonical types, e.g.,  &#39;work&#39;, &#39;home&#39;.</value>
        [DataMember(Name = "canonicalValues", EmitDefaultValue = false)]
        public List<string> CanonicalValues { get; private set; }

        /// <summary>
        /// Returns false as CanonicalValues should not be serialized given that it's read-only.
        /// </summary>
        /// <returns>false (boolean)</returns>
        public bool ShouldSerializeCanonicalValues()
        {
            return false;
        }
        /// <summary>
        /// A Boolean value indicating whether or not a string attribute is case sensitive.
        /// </summary>
        /// <value>A Boolean value indicating whether or not a string attribute is case sensitive.</value>
        [DataMember(Name = "caseExact", EmitDefaultValue = true)]
        public bool CaseExact { get; private set; }

        /// <summary>
        /// Returns false as CaseExact should not be serialized given that it's read-only.
        /// </summary>
        /// <returns>false (boolean)</returns>
        public bool ShouldSerializeCaseExact()
        {
            return false;
        }
        /// <summary>
        /// Indicates whether or not an attribute is modifiable.
        /// </summary>
        /// <value>Indicates whether or not an attribute is modifiable.</value>
        [DataMember(Name = "mutability", EmitDefaultValue = false)]
        public string Mutability { get; private set; }

        /// <summary>
        /// Returns false as Mutability should not be serialized given that it's read-only.
        /// </summary>
        /// <returns>false (boolean)</returns>
        public bool ShouldSerializeMutability()
        {
            return false;
        }
        /// <summary>
        /// Indicates when an attribute is returned in a response (e.g., to a query).
        /// </summary>
        /// <value>Indicates when an attribute is returned in a response (e.g., to a query).</value>
        [DataMember(Name = "returned", EmitDefaultValue = false)]
        public string Returned { get; private set; }

        /// <summary>
        /// Returns false as Returned should not be serialized given that it's read-only.
        /// </summary>
        /// <returns>false (boolean)</returns>
        public bool ShouldSerializeReturned()
        {
            return false;
        }
        /// <summary>
        /// Indicates how unique a value must be.
        /// </summary>
        /// <value>Indicates how unique a value must be.</value>
        [DataMember(Name = "uniqueness", EmitDefaultValue = false)]
        public string Uniqueness { get; private set; }

        /// <summary>
        /// Returns false as Uniqueness should not be serialized given that it's read-only.
        /// </summary>
        /// <returns>false (boolean)</returns>
        public bool ShouldSerializeUniqueness()
        {
            return false;
        }
        /// <summary>
        /// Used only with an attribute of type &#39;reference&#39;.  Specifies a SCIM resourceType that a reference attribute MAY refer to, e.g., &#39;User&#39;.
        /// </summary>
        /// <value>Used only with an attribute of type &#39;reference&#39;.  Specifies a SCIM resourceType that a reference attribute MAY refer to, e.g., &#39;User&#39;.</value>
        [DataMember(Name = "referenceTypes", EmitDefaultValue = false)]
        public List<string> ReferenceTypes { get; private set; }

        /// <summary>
        /// Returns false as ReferenceTypes should not be serialized given that it's read-only.
        /// </summary>
        /// <returns>false (boolean)</returns>
        public bool ShouldSerializeReferenceTypes()
        {
            return false;
        }
        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class SchemaSubAttributes {\n");
            sb.Append("  Name: ").Append(Name).Append("\n");
            sb.Append("  Type: ").Append(Type).Append("\n");
            sb.Append("  MultiValued: ").Append(MultiValued).Append("\n");
            sb.Append("  Description: ").Append(Description).Append("\n");
            sb.Append("  Required: ").Append(Required).Append("\n");
            sb.Append("  CanonicalValues: ").Append(CanonicalValues).Append("\n");
            sb.Append("  CaseExact: ").Append(CaseExact).Append("\n");
            sb.Append("  Mutability: ").Append(Mutability).Append("\n");
            sb.Append("  Returned: ").Append(Returned).Append("\n");
            sb.Append("  Uniqueness: ").Append(Uniqueness).Append("\n");
            sb.Append("  ReferenceTypes: ").Append(ReferenceTypes).Append("\n");
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
            return this.Equals(input as SchemaSubAttributes);
        }

        /// <summary>
        /// Returns true if SchemaSubAttributes instances are equal
        /// </summary>
        /// <param name="input">Instance of SchemaSubAttributes to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(SchemaSubAttributes input)
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
                    this.Type == input.Type ||
                    (this.Type != null &&
                    this.Type.Equals(input.Type))
                ) && 
                (
                    this.MultiValued == input.MultiValued ||
                    this.MultiValued.Equals(input.MultiValued)
                ) && 
                (
                    this.Description == input.Description ||
                    (this.Description != null &&
                    this.Description.Equals(input.Description))
                ) && 
                (
                    this.Required == input.Required ||
                    this.Required.Equals(input.Required)
                ) && 
                (
                    this.CanonicalValues == input.CanonicalValues ||
                    this.CanonicalValues != null &&
                    input.CanonicalValues != null &&
                    this.CanonicalValues.SequenceEqual(input.CanonicalValues)
                ) && 
                (
                    this.CaseExact == input.CaseExact ||
                    this.CaseExact.Equals(input.CaseExact)
                ) && 
                (
                    this.Mutability == input.Mutability ||
                    (this.Mutability != null &&
                    this.Mutability.Equals(input.Mutability))
                ) && 
                (
                    this.Returned == input.Returned ||
                    (this.Returned != null &&
                    this.Returned.Equals(input.Returned))
                ) && 
                (
                    this.Uniqueness == input.Uniqueness ||
                    (this.Uniqueness != null &&
                    this.Uniqueness.Equals(input.Uniqueness))
                ) && 
                (
                    this.ReferenceTypes == input.ReferenceTypes ||
                    this.ReferenceTypes != null &&
                    input.ReferenceTypes != null &&
                    this.ReferenceTypes.SequenceEqual(input.ReferenceTypes)
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
                if (this.Type != null)
                {
                    hashCode = (hashCode * 59) + this.Type.GetHashCode();
                }
                hashCode = (hashCode * 59) + this.MultiValued.GetHashCode();
                if (this.Description != null)
                {
                    hashCode = (hashCode * 59) + this.Description.GetHashCode();
                }
                hashCode = (hashCode * 59) + this.Required.GetHashCode();
                if (this.CanonicalValues != null)
                {
                    hashCode = (hashCode * 59) + this.CanonicalValues.GetHashCode();
                }
                hashCode = (hashCode * 59) + this.CaseExact.GetHashCode();
                if (this.Mutability != null)
                {
                    hashCode = (hashCode * 59) + this.Mutability.GetHashCode();
                }
                if (this.Returned != null)
                {
                    hashCode = (hashCode * 59) + this.Returned.GetHashCode();
                }
                if (this.Uniqueness != null)
                {
                    hashCode = (hashCode * 59) + this.Uniqueness.GetHashCode();
                }
                if (this.ReferenceTypes != null)
                {
                    hashCode = (hashCode * 59) + this.ReferenceTypes.GetHashCode();
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
