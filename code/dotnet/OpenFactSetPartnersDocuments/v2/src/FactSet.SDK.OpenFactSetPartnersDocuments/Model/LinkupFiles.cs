/*
 * Open:FactSet - Partners
 *
 * This service provides the capability to search and download unstructured content provided by <a href=\"https://open.factset.com/catalog/en-us\">Open:FactSet Partners</a>.
 *
 * The version of the OpenAPI document: 2.0.0
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
using OpenAPIDateConverter = FactSet.SDK.OpenFactSetPartnersDocuments.Client.OpenAPIDateConverter;

namespace FactSet.SDK.OpenFactSetPartnersDocuments.Model
{
    /// <summary>
    ///  Returns LinkUp Response.
    /// </summary>
    [DataContract(Name = "LinkupFiles")]
    public partial class LinkupFiles : IEquatable<LinkupFiles>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="LinkupFiles" /> class.
        /// </summary>
        /// <param name="filename">The filename of the daily LinkUp file..</param>
        /// <param name="fileTimestamp">The timestamp when LinkUp provided the file to FactSet..</param>
        /// <param name="updateTimestamp">The timestamp when the file is last updated..</param>
        /// <param name="type">Used to provide the full job descriptions when value - full is used for this parameter..</param>
        /// <param name="url">Download link for daily file from LinkUp on various job postings..</param>
        public LinkupFiles(string filename = default(string), DateTime fileTimestamp = default(DateTime), DateTime updateTimestamp = default(DateTime), string type = default(string), string url = default(string))
        {
            this.Filename = filename;
            this.FileTimestamp = fileTimestamp;
            this.UpdateTimestamp = updateTimestamp;
            this.Type = type;
            this.Url = url;
        }

        /// <summary>
        /// The filename of the daily LinkUp file.
        /// </summary>
        /// <value>The filename of the daily LinkUp file.</value>
        [DataMember(Name = "filename", EmitDefaultValue = false)]
        public string Filename { get; set; }

        /// <summary>
        /// The timestamp when LinkUp provided the file to FactSet.
        /// </summary>
        /// <value>The timestamp when LinkUp provided the file to FactSet.</value>
        [DataMember(Name = "fileTimestamp", EmitDefaultValue = false)]
        public DateTime FileTimestamp { get; set; }

        /// <summary>
        /// The timestamp when the file is last updated.
        /// </summary>
        /// <value>The timestamp when the file is last updated.</value>
        [DataMember(Name = "updateTimestamp", EmitDefaultValue = false)]
        public DateTime UpdateTimestamp { get; set; }

        /// <summary>
        /// Used to provide the full job descriptions when value - full is used for this parameter.
        /// </summary>
        /// <value>Used to provide the full job descriptions when value - full is used for this parameter.</value>
        [DataMember(Name = "type", EmitDefaultValue = false)]
        public string Type { get; set; }

        /// <summary>
        /// Download link for daily file from LinkUp on various job postings.
        /// </summary>
        /// <value>Download link for daily file from LinkUp on various job postings.</value>
        [DataMember(Name = "url", EmitDefaultValue = false)]
        public string Url { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class LinkupFiles {\n");
            sb.Append("  Filename: ").Append(Filename).Append("\n");
            sb.Append("  FileTimestamp: ").Append(FileTimestamp).Append("\n");
            sb.Append("  UpdateTimestamp: ").Append(UpdateTimestamp).Append("\n");
            sb.Append("  Type: ").Append(Type).Append("\n");
            sb.Append("  Url: ").Append(Url).Append("\n");
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
            return this.Equals(input as LinkupFiles);
        }

        /// <summary>
        /// Returns true if LinkupFiles instances are equal
        /// </summary>
        /// <param name="input">Instance of LinkupFiles to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(LinkupFiles input)
        {
            if (input == null)
            {
                return false;
            }
            return 
                (
                    this.Filename == input.Filename ||
                    (this.Filename != null &&
                    this.Filename.Equals(input.Filename))
                ) && 
                (
                    this.FileTimestamp == input.FileTimestamp ||
                    (this.FileTimestamp != null &&
                    this.FileTimestamp.Equals(input.FileTimestamp))
                ) && 
                (
                    this.UpdateTimestamp == input.UpdateTimestamp ||
                    (this.UpdateTimestamp != null &&
                    this.UpdateTimestamp.Equals(input.UpdateTimestamp))
                ) && 
                (
                    this.Type == input.Type ||
                    (this.Type != null &&
                    this.Type.Equals(input.Type))
                ) && 
                (
                    this.Url == input.Url ||
                    (this.Url != null &&
                    this.Url.Equals(input.Url))
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
                if (this.Filename != null)
                {
                    hashCode = (hashCode * 59) + this.Filename.GetHashCode();
                }
                if (this.FileTimestamp != null)
                {
                    hashCode = (hashCode * 59) + this.FileTimestamp.GetHashCode();
                }
                if (this.UpdateTimestamp != null)
                {
                    hashCode = (hashCode * 59) + this.UpdateTimestamp.GetHashCode();
                }
                if (this.Type != null)
                {
                    hashCode = (hashCode * 59) + this.Type.GetHashCode();
                }
                if (this.Url != null)
                {
                    hashCode = (hashCode * 59) + this.Url.GetHashCode();
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