/*
 * FactSet SCIM API
 *
 * FactSet's SCIM API implementation.
 *
 * The version of the OpenAPI document: 2.4.0
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
    /// UserPositionResource
    /// </summary>
    [DataContract(Name = "UserPositionResource")]
    public partial class UserPositionResource : IEquatable<UserPositionResource>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="UserPositionResource" /> class.
        /// </summary>
        [JsonConstructorAttribute]
        protected UserPositionResource() { }
        /// <summary>
        /// Initializes a new instance of the <see cref="UserPositionResource" /> class.
        /// </summary>
        /// <param name="schemas">schemas.</param>
        /// <param name="meta">meta.</param>
        public UserPositionResource(string name,List<string> schemas = default(List<string>), string id = default(string), UserPositionResourceMeta meta = default(UserPositionResourceMeta))
        {
            this.Schemas = schemas;
            this.Meta = meta;
        }

        /// <summary>
        /// Gets or Sets Schemas
        /// </summary>
        [DataMember(Name = "schemas", EmitDefaultValue = false)]
        public List<string> Schemas { get; set; }

        /// <summary>
        /// Gets or Sets Id
        /// </summary>
        [DataMember(Name = "id", EmitDefaultValue = false)]
        public string Id { get; private set; }

        /// <summary>
        /// Returns false as Id should not be serialized given that it's read-only.
        /// </summary>
        /// <returns>false (boolean)</returns>
        public bool ShouldSerializeId()
        {
            return false;
        }
        /// <summary>
        /// Name of the user position.
        /// </summary>
        /// <value>Name of the user position.</value>
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
        /// Gets or Sets Meta
        /// </summary>
        [DataMember(Name = "meta", EmitDefaultValue = false)]
        public UserPositionResourceMeta Meta { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class UserPositionResource {\n");
            sb.Append("  Schemas: ").Append(Schemas).Append("\n");
            sb.Append("  Id: ").Append(Id).Append("\n");
            sb.Append("  Name: ").Append(Name).Append("\n");
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
            return this.Equals(input as UserPositionResource);
        }

        /// <summary>
        /// Returns true if UserPositionResource instances are equal
        /// </summary>
        /// <param name="input">Instance of UserPositionResource to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(UserPositionResource input)
        {
            if (input == null)
            {
                return false;
            }
            return 
                (
                    this.Schemas == input.Schemas ||
                    this.Schemas != null &&
                    input.Schemas != null &&
                    this.Schemas.SequenceEqual(input.Schemas)
                ) && 
                (
                    this.Id == input.Id ||
                    (this.Id != null &&
                    this.Id.Equals(input.Id))
                ) && 
                (
                    this.Name == input.Name ||
                    (this.Name != null &&
                    this.Name.Equals(input.Name))
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
                if (this.Schemas != null)
                {
                    hashCode = (hashCode * 59) + this.Schemas.GetHashCode();
                }
                if (this.Id != null)
                {
                    hashCode = (hashCode * 59) + this.Id.GetHashCode();
                }
                if (this.Name != null)
                {
                    hashCode = (hashCode * 59) + this.Name.GetHashCode();
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
