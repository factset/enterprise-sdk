/*
 * Tick History Level 2 (Beta)
 *
 * Tick History **Level 2** provides dynamic access to the historical tick data up to 10 levels of depth for a specific security for specific dates or date range. The API generates output files with data based on client-specified input parameters. The input parameters include universe specification and date ranges for which the data will be generated. When the API request with specified input parameters has been completed, the output files will be made available back to the users through a secure URL to the location where the files are stored. Therefore, this API has two APIs (i) Request files API (ii) Get Files API.
 *
 * The version of the OpenAPI document: 0.0.0
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
using OpenAPIDateConverter = FactSet.SDK.FactSetTickHistory.Client.OpenAPIDateConverter;

namespace FactSet.SDK.FactSetTickHistory.Model
{
    /// <summary>
    /// Specifies the fields in the error message
    /// </summary>
    [DataContract(Name = "errorExample")]
    public partial class ErrorExample : IEquatable<ErrorExample>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="ErrorExample" /> class.
        /// </summary>
        /// <param name="code">It specifies the unique code.</param>
        /// <param name="title"> Specifies the error message.</param>
        /// <param name="id">Specifies the id.</param>
        public ErrorExample(string code = default(string), string title = default(string), string id = default(string))
        {
            this.Code = code;
            this.Title = title;
            this.Id = id;
        }

        /// <summary>
        /// It specifies the unique code
        /// </summary>
        /// <value>It specifies the unique code</value>
        [DataMember(Name = "code", EmitDefaultValue = false)]
        public string Code { get; set; }

        /// <summary>
        ///  Specifies the error message
        /// </summary>
        /// <value> Specifies the error message</value>
        [DataMember(Name = "title", EmitDefaultValue = false)]
        public string Title { get; set; }

        /// <summary>
        /// Specifies the id
        /// </summary>
        /// <value>Specifies the id</value>
        [DataMember(Name = "id", EmitDefaultValue = false)]
        public string Id { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class ErrorExample {\n");
            sb.Append("  Code: ").Append(Code).Append("\n");
            sb.Append("  Title: ").Append(Title).Append("\n");
            sb.Append("  Id: ").Append(Id).Append("\n");
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
            return this.Equals(input as ErrorExample);
        }

        /// <summary>
        /// Returns true if ErrorExample instances are equal
        /// </summary>
        /// <param name="input">Instance of ErrorExample to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(ErrorExample input)
        {
            if (input == null)
            {
                return false;
            }
            return 
                (
                    this.Code == input.Code ||
                    (this.Code != null &&
                    this.Code.Equals(input.Code))
                ) && 
                (
                    this.Title == input.Title ||
                    (this.Title != null &&
                    this.Title.Equals(input.Title))
                ) && 
                (
                    this.Id == input.Id ||
                    (this.Id != null &&
                    this.Id.Equals(input.Id))
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
                if (this.Code != null)
                {
                    hashCode = (hashCode * 59) + this.Code.GetHashCode();
                }
                if (this.Title != null)
                {
                    hashCode = (hashCode * 59) + this.Title.GetHashCode();
                }
                if (this.Id != null)
                {
                    hashCode = (hashCode * 59) + this.Id.GetHashCode();
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
