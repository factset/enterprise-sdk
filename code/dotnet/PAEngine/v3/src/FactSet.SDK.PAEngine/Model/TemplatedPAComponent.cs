/*
 * PA Engine API
 *
 * Allow clients to fetch Analytics through APIs.
 *
 * The version of the OpenAPI document: 3
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
using OpenAPIDateConverter = FactSet.SDK.PAEngine.Client.OpenAPIDateConverter;

namespace FactSet.SDK.PAEngine.Model
{
    /// <summary>
    /// TemplatedPAComponent
    /// </summary>
    [DataContract(Name = "TemplatedPAComponent")]
    public partial class TemplatedPAComponent : IEquatable<TemplatedPAComponent>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="TemplatedPAComponent" /> class.
        /// </summary>
        /// <param name="id">id.</param>
        /// <param name="directory">directory.</param>
        /// <param name="snapshot">snapshot.</param>
        /// <param name="componentData">componentData.</param>
        /// <param name="description">description.</param>
        /// <param name="name">name.</param>
        /// <param name="parentTemplateId">parentTemplateId.</param>
        /// <param name="type">type.</param>
        public TemplatedPAComponent(string id = default(string), string directory = default(string), bool snapshot = default(bool), PAComponentData componentData = default(PAComponentData), string description = default(string), string name = default(string), string parentTemplateId = default(string), string type = default(string))
        {
            this.Id = id;
            this.Directory = directory;
            this.Snapshot = snapshot;
            this.ComponentData = componentData;
            this.Description = description;
            this.Name = name;
            this.ParentTemplateId = parentTemplateId;
            this.Type = type;
        }

        /// <summary>
        /// Gets or Sets Id
        /// </summary>
        [DataMember(Name = "id", EmitDefaultValue = true)]
        public string Id { get; set; }

        /// <summary>
        /// Gets or Sets Directory
        /// </summary>
        [DataMember(Name = "directory", EmitDefaultValue = true)]
        public string Directory { get; set; }

        /// <summary>
        /// Gets or Sets Snapshot
        /// </summary>
        [DataMember(Name = "snapshot", EmitDefaultValue = true)]
        public bool Snapshot { get; set; }

        /// <summary>
        /// Gets or Sets ComponentData
        /// </summary>
        [DataMember(Name = "componentData", EmitDefaultValue = false)]
        public PAComponentData ComponentData { get; set; }

        /// <summary>
        /// Gets or Sets Description
        /// </summary>
        [DataMember(Name = "description", EmitDefaultValue = true)]
        public string Description { get; set; }

        /// <summary>
        /// Gets or Sets Name
        /// </summary>
        [DataMember(Name = "name", EmitDefaultValue = true)]
        public string Name { get; set; }

        /// <summary>
        /// Gets or Sets ParentTemplateId
        /// </summary>
        [DataMember(Name = "parentTemplateId", EmitDefaultValue = true)]
        public string ParentTemplateId { get; set; }

        /// <summary>
        /// Gets or Sets Type
        /// </summary>
        [DataMember(Name = "type", EmitDefaultValue = true)]
        public string Type { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class TemplatedPAComponent {\n");
            sb.Append("  Id: ").Append(Id).Append("\n");
            sb.Append("  Directory: ").Append(Directory).Append("\n");
            sb.Append("  Snapshot: ").Append(Snapshot).Append("\n");
            sb.Append("  ComponentData: ").Append(ComponentData).Append("\n");
            sb.Append("  Description: ").Append(Description).Append("\n");
            sb.Append("  Name: ").Append(Name).Append("\n");
            sb.Append("  ParentTemplateId: ").Append(ParentTemplateId).Append("\n");
            sb.Append("  Type: ").Append(Type).Append("\n");
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
            return this.Equals(input as TemplatedPAComponent);
        }

        /// <summary>
        /// Returns true if TemplatedPAComponent instances are equal
        /// </summary>
        /// <param name="input">Instance of TemplatedPAComponent to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(TemplatedPAComponent input)
        {
            if (input == null)
            {
                return false;
            }
            return 
                (
                    this.Id == input.Id ||
                    (this.Id != null &&
                    this.Id.Equals(input.Id))
                ) && 
                (
                    this.Directory == input.Directory ||
                    (this.Directory != null &&
                    this.Directory.Equals(input.Directory))
                ) && 
                (
                    this.Snapshot == input.Snapshot ||
                    this.Snapshot.Equals(input.Snapshot)
                ) && 
                (
                    this.ComponentData == input.ComponentData ||
                    (this.ComponentData != null &&
                    this.ComponentData.Equals(input.ComponentData))
                ) && 
                (
                    this.Description == input.Description ||
                    (this.Description != null &&
                    this.Description.Equals(input.Description))
                ) && 
                (
                    this.Name == input.Name ||
                    (this.Name != null &&
                    this.Name.Equals(input.Name))
                ) && 
                (
                    this.ParentTemplateId == input.ParentTemplateId ||
                    (this.ParentTemplateId != null &&
                    this.ParentTemplateId.Equals(input.ParentTemplateId))
                ) && 
                (
                    this.Type == input.Type ||
                    (this.Type != null &&
                    this.Type.Equals(input.Type))
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
                if (this.Id != null)
                {
                    hashCode = (hashCode * 59) + this.Id.GetHashCode();
                }
                if (this.Directory != null)
                {
                    hashCode = (hashCode * 59) + this.Directory.GetHashCode();
                }
                hashCode = (hashCode * 59) + this.Snapshot.GetHashCode();
                if (this.ComponentData != null)
                {
                    hashCode = (hashCode * 59) + this.ComponentData.GetHashCode();
                }
                if (this.Description != null)
                {
                    hashCode = (hashCode * 59) + this.Description.GetHashCode();
                }
                if (this.Name != null)
                {
                    hashCode = (hashCode * 59) + this.Name.GetHashCode();
                }
                if (this.ParentTemplateId != null)
                {
                    hashCode = (hashCode * 59) + this.ParentTemplateId.GetHashCode();
                }
                if (this.Type != null)
                {
                    hashCode = (hashCode * 59) + this.Type.GetHashCode();
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
