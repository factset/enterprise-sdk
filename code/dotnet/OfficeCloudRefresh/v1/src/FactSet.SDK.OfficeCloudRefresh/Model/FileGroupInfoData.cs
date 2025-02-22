/*
 * Office Cloud Refresh API
 *
 * Service for refreshing models with refreshable FactSet objects (e.g., =FDS codes)
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
using OpenAPIDateConverter = FactSet.SDK.OfficeCloudRefresh.Client.OpenAPIDateConverter;

namespace FactSet.SDK.OfficeCloudRefresh.Model
{
    /// <summary>
    /// FileGroupInfoData
    /// </summary>
    [DataContract(Name = "FileGroupInfo_data")]
    public partial class FileGroupInfoData : IEquatable<FileGroupInfoData>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="FileGroupInfoData" /> class.
        /// </summary>
        [JsonConstructorAttribute]
        protected FileGroupInfoData() { }
        /// <summary>
        /// Initializes a new instance of the <see cref="FileGroupInfoData" /> class.
        /// </summary>
        /// <param name="fileGroupId">Unique identifier for the file group stored by FactSet (required).</param>
        public FileGroupInfoData(string fileGroupId)
        {
            // to ensure "fileGroupId" is required (not null)
            if (fileGroupId == null) {
                throw new ArgumentNullException("fileGroupId is a required property for FileGroupInfoData and cannot be null");
            }
            this.FileGroupId = fileGroupId;
        }

        /// <summary>
        /// Unique identifier for the file group stored by FactSet
        /// </summary>
        /// <value>Unique identifier for the file group stored by FactSet</value>
        [DataMember(Name = "fileGroupId", IsRequired = true, EmitDefaultValue = false)]
        public string FileGroupId { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class FileGroupInfoData {\n");
            sb.Append("  FileGroupId: ").Append(FileGroupId).Append("\n");
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
            return this.Equals(input as FileGroupInfoData);
        }

        /// <summary>
        /// Returns true if FileGroupInfoData instances are equal
        /// </summary>
        /// <param name="input">Instance of FileGroupInfoData to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(FileGroupInfoData input)
        {
            if (input == null)
            {
                return false;
            }
            return 
                (
                    this.FileGroupId == input.FileGroupId ||
                    (this.FileGroupId != null &&
                    this.FileGroupId.Equals(input.FileGroupId))
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
                if (this.FileGroupId != null)
                {
                    hashCode = (hashCode * 59) + this.FileGroupId.GetHashCode();
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
