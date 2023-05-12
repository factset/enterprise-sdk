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
    /// Returns History Response
    /// </summary>
    [DataContract(Name = "OrbitHistoryFiles")]
    public partial class OrbitHistoryFiles : IEquatable<OrbitHistoryFiles>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="OrbitHistoryFiles" /> class.
        /// </summary>
        /// <param name="fileSize">Defines the size of the file..</param>
        /// <param name="fileName">The filename of the folder..</param>
        /// <param name="url">Download link for the transcripts provided by the Orbit feed..</param>
        public OrbitHistoryFiles(int fileSize = default(int), string fileName = default(string), string url = default(string))
        {
            this.FileSize = fileSize;
            this.FileName = fileName;
            this.Url = url;
        }

        /// <summary>
        /// Defines the size of the file.
        /// </summary>
        /// <value>Defines the size of the file.</value>
        [DataMember(Name = "fileSize", EmitDefaultValue = false)]
        public int FileSize { get; set; }

        /// <summary>
        /// The filename of the folder.
        /// </summary>
        /// <value>The filename of the folder.</value>
        [DataMember(Name = "fileName", EmitDefaultValue = false)]
        public string FileName { get; set; }

        /// <summary>
        /// Download link for the transcripts provided by the Orbit feed.
        /// </summary>
        /// <value>Download link for the transcripts provided by the Orbit feed.</value>
        [DataMember(Name = "url", EmitDefaultValue = false)]
        public string Url { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class OrbitHistoryFiles {\n");
            sb.Append("  FileSize: ").Append(FileSize).Append("\n");
            sb.Append("  FileName: ").Append(FileName).Append("\n");
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
            return this.Equals(input as OrbitHistoryFiles);
        }

        /// <summary>
        /// Returns true if OrbitHistoryFiles instances are equal
        /// </summary>
        /// <param name="input">Instance of OrbitHistoryFiles to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(OrbitHistoryFiles input)
        {
            if (input == null)
            {
                return false;
            }
            return 
                (
                    this.FileSize == input.FileSize ||
                    this.FileSize.Equals(input.FileSize)
                ) && 
                (
                    this.FileName == input.FileName ||
                    (this.FileName != null &&
                    this.FileName.Equals(input.FileName))
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
                hashCode = (hashCode * 59) + this.FileSize.GetHashCode();
                if (this.FileName != null)
                {
                    hashCode = (hashCode * 59) + this.FileName.GetHashCode();
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