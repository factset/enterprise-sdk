/*
 * VRS API documentation
 *
 * Documentation on all available end points in the VRSAPI
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
using OpenAPIDateConverter = FactSet.SDK.Vermilion.Client.OpenAPIDateConverter;

namespace FactSet.SDK.Vermilion.Model
{
    /// <summary>
    /// Role details, defining permissions and access.
    /// </summary>
    [DataContract(Name = "ScimGroup")]
    public partial class ScimGroup : IEquatable<ScimGroup>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="ScimGroup" /> class.
        /// </summary>
        /// <param name="schemas">List of schema URIs for the group/role..</param>
        /// <param name="id">Unique identifier of the group/role..</param>
        /// <param name="displayName">The display name of the group/role..</param>
        /// <param name="members">A list of users assigned to the group/role..</param>
        /// <param name="tenant">Tenant associated with the group/role..</param>
        /// <param name="domainCode">Domain code for the group..</param>
        /// <param name="meta">meta.</param>
        public ScimGroup(List<string> schemas = default(List<string>), string id = default(string), string displayName = default(string), List<ScimGroupMember> members = default(List<ScimGroupMember>), string tenant = default(string), string domainCode = default(string), ScimMeta meta = default(ScimMeta))
        {
            this.Schemas = schemas;
            this.Id = id;
            this.DisplayName = displayName;
            this.Members = members;
            this.Tenant = tenant;
            this.DomainCode = domainCode;
            this.Meta = meta;
        }

        /// <summary>
        /// List of schema URIs for the group/role.
        /// </summary>
        /// <value>List of schema URIs for the group/role.</value>
        [DataMember(Name = "schemas", EmitDefaultValue = false)]
        public List<string> Schemas { get; set; }

        /// <summary>
        /// Unique identifier of the group/role.
        /// </summary>
        /// <value>Unique identifier of the group/role.</value>
        [DataMember(Name = "id", EmitDefaultValue = false)]
        public string Id { get; set; }

        /// <summary>
        /// The display name of the group/role.
        /// </summary>
        /// <value>The display name of the group/role.</value>
        [DataMember(Name = "displayName", EmitDefaultValue = false)]
        public string DisplayName { get; set; }

        /// <summary>
        /// A list of users assigned to the group/role.
        /// </summary>
        /// <value>A list of users assigned to the group/role.</value>
        [DataMember(Name = "members", EmitDefaultValue = false)]
        public List<ScimGroupMember> Members { get; set; }

        /// <summary>
        /// Tenant associated with the group/role.
        /// </summary>
        /// <value>Tenant associated with the group/role.</value>
        [DataMember(Name = "tenant", EmitDefaultValue = false)]
        public string Tenant { get; set; }

        /// <summary>
        /// Domain code for the group.
        /// </summary>
        /// <value>Domain code for the group.</value>
        [DataMember(Name = "domainCode", EmitDefaultValue = false)]
        public string DomainCode { get; set; }

        /// <summary>
        /// Gets or Sets Meta
        /// </summary>
        [DataMember(Name = "meta", EmitDefaultValue = false)]
        public ScimMeta Meta { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class ScimGroup {\n");
            sb.Append("  Schemas: ").Append(Schemas).Append("\n");
            sb.Append("  Id: ").Append(Id).Append("\n");
            sb.Append("  DisplayName: ").Append(DisplayName).Append("\n");
            sb.Append("  Members: ").Append(Members).Append("\n");
            sb.Append("  Tenant: ").Append(Tenant).Append("\n");
            sb.Append("  DomainCode: ").Append(DomainCode).Append("\n");
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
            return this.Equals(input as ScimGroup);
        }

        /// <summary>
        /// Returns true if ScimGroup instances are equal
        /// </summary>
        /// <param name="input">Instance of ScimGroup to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(ScimGroup input)
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
                    this.DisplayName == input.DisplayName ||
                    (this.DisplayName != null &&
                    this.DisplayName.Equals(input.DisplayName))
                ) && 
                (
                    this.Members == input.Members ||
                    this.Members != null &&
                    input.Members != null &&
                    this.Members.SequenceEqual(input.Members)
                ) && 
                (
                    this.Tenant == input.Tenant ||
                    (this.Tenant != null &&
                    this.Tenant.Equals(input.Tenant))
                ) && 
                (
                    this.DomainCode == input.DomainCode ||
                    (this.DomainCode != null &&
                    this.DomainCode.Equals(input.DomainCode))
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
                if (this.DisplayName != null)
                {
                    hashCode = (hashCode * 59) + this.DisplayName.GetHashCode();
                }
                if (this.Members != null)
                {
                    hashCode = (hashCode * 59) + this.Members.GetHashCode();
                }
                if (this.Tenant != null)
                {
                    hashCode = (hashCode * 59) + this.Tenant.GetHashCode();
                }
                if (this.DomainCode != null)
                {
                    hashCode = (hashCode * 59) + this.DomainCode.GetHashCode();
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
