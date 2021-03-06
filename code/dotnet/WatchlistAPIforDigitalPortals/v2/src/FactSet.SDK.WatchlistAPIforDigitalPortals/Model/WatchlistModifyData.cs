/*
 * Prime Developer Trial
 *
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: v1
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
using OpenAPIDateConverter = FactSet.SDK.WatchlistAPIforDigitalPortals.Client.OpenAPIDateConverter;

namespace FactSet.SDK.WatchlistAPIforDigitalPortals.Model
{
    /// <summary>
    /// The data member contains the request&#39;s primary data.
    /// </summary>
    [DataContract(Name = "_watchlist_modify_data")]
    public partial class WatchlistModifyData : IEquatable<WatchlistModifyData>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="WatchlistModifyData" /> class.
        /// </summary>
        [JsonConstructorAttribute]
        protected WatchlistModifyData() { }
        /// <summary>
        /// Initializes a new instance of the <see cref="WatchlistModifyData" /> class.
        /// </summary>
        /// <param name="name">Name of watchlist (required).</param>
        /// <param name="nameNew">New name of watchlist (required).</param>
        public WatchlistModifyData(string name, string nameNew)
        {
            // to ensure "name" is required (not null)
            if (name == null) {
                throw new ArgumentNullException("name is a required property for WatchlistModifyData and cannot be null");
            }
            this.Name = name;
            // to ensure "nameNew" is required (not null)
            if (nameNew == null) {
                throw new ArgumentNullException("nameNew is a required property for WatchlistModifyData and cannot be null");
            }
            this.NameNew = nameNew;
        }

        /// <summary>
        /// Name of watchlist
        /// </summary>
        /// <value>Name of watchlist</value>
        [DataMember(Name = "name", IsRequired = true, EmitDefaultValue = false)]
        public string Name { get; set; }

        /// <summary>
        /// New name of watchlist
        /// </summary>
        /// <value>New name of watchlist</value>
        [DataMember(Name = "nameNew", IsRequired = true, EmitDefaultValue = false)]
        public string NameNew { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class WatchlistModifyData {\n");
            sb.Append("  Name: ").Append(Name).Append("\n");
            sb.Append("  NameNew: ").Append(NameNew).Append("\n");
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
            return this.Equals(input as WatchlistModifyData);
        }

        /// <summary>
        /// Returns true if WatchlistModifyData instances are equal
        /// </summary>
        /// <param name="input">Instance of WatchlistModifyData to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(WatchlistModifyData input)
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
                    this.NameNew == input.NameNew ||
                    (this.NameNew != null &&
                    this.NameNew.Equals(input.NameNew))
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
                if (this.NameNew != null)
                {
                    hashCode = (hashCode * 59) + this.NameNew.GetHashCode();
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
            // Name (string) maxLength
            if (this.Name != null && this.Name.Length > 100)
            {
                yield return new System.ComponentModel.DataAnnotations.ValidationResult("Invalid value for Name, length must be less than 100.", new [] { "Name" });
            }

            // Name (string) minLength
            if (this.Name != null && this.Name.Length < 1)
            {
                yield return new System.ComponentModel.DataAnnotations.ValidationResult("Invalid value for Name, length must be greater than 1.", new [] { "Name" });
            }

            // NameNew (string) maxLength
            if (this.NameNew != null && this.NameNew.Length > 100)
            {
                yield return new System.ComponentModel.DataAnnotations.ValidationResult("Invalid value for NameNew, length must be less than 100.", new [] { "NameNew" });
            }

            // NameNew (string) minLength
            if (this.NameNew != null && this.NameNew.Length < 1)
            {
                yield return new System.ComponentModel.DataAnnotations.ValidationResult("Invalid value for NameNew, length must be greater than 1.", new [] { "NameNew" });
            }

            yield break;
        }
    }

}
