/*
 * BookBuilder
 *
 * The BookBuilder API is a powerful tool that combines detailed reports for companies of interest. Save time by using a single source of knowledge instead of relying on multiple APIs to create a presentation ready PDF, also known as a Public Information Book(PIB). </br></br> Consistently create books with the same content/reports for different companies by defining templates with the set of reports saved for re-use. Or, use templates that are created by FactSet for quick use. </br></br> With our powerful API endpoints, you can get the information on companies of interest quickly where and when you need it. </br></br> 
 *
 * The version of the OpenAPI document: 1.13.0
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
using OpenAPIDateConverter = FactSet.SDK.BookBuilder.Client.OpenAPIDateConverter;

namespace FactSet.SDK.BookBuilder.Model
{
    /// <summary>
    /// Request to enable template list information for the client.
    /// </summary>
    [DataContract(Name = "Enable_Template_Info_Post")]
    public partial class EnableTemplateInfoPost : IEquatable<EnableTemplateInfoPost>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="EnableTemplateInfoPost" /> class.
        /// </summary>
        /// <param name="tmplId">Template ID.</param>
        /// <param name="tmplName">Template name.</param>
        public EnableTemplateInfoPost(string tmplId = default(string), string tmplName = default(string))
        {
            this.TmplId = tmplId;
            this.TmplName = tmplName;
        }

        /// <summary>
        /// Template ID
        /// </summary>
        /// <value>Template ID</value>
        [DataMember(Name = "tmpl_id", EmitDefaultValue = false)]
        public string TmplId { get; set; }

        /// <summary>
        /// Template name
        /// </summary>
        /// <value>Template name</value>
        [DataMember(Name = "tmpl_name", EmitDefaultValue = false)]
        public string TmplName { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class EnableTemplateInfoPost {\n");
            sb.Append("  TmplId: ").Append(TmplId).Append("\n");
            sb.Append("  TmplName: ").Append(TmplName).Append("\n");
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
            return this.Equals(input as EnableTemplateInfoPost);
        }

        /// <summary>
        /// Returns true if EnableTemplateInfoPost instances are equal
        /// </summary>
        /// <param name="input">Instance of EnableTemplateInfoPost to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(EnableTemplateInfoPost input)
        {
            if (input == null)
            {
                return false;
            }
            return 
                (
                    this.TmplId == input.TmplId ||
                    (this.TmplId != null &&
                    this.TmplId.Equals(input.TmplId))
                ) && 
                (
                    this.TmplName == input.TmplName ||
                    (this.TmplName != null &&
                    this.TmplName.Equals(input.TmplName))
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
                if (this.TmplId != null)
                {
                    hashCode = (hashCode * 59) + this.TmplId.GetHashCode();
                }
                if (this.TmplName != null)
                {
                    hashCode = (hashCode * 59) + this.TmplName.GetHashCode();
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
