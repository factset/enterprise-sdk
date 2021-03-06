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
using OpenAPIDateConverter = FactSet.SDK.StocksAPIforDigitalPortals.Client.OpenAPIDateConverter;

namespace FactSet.SDK.StocksAPIforDigitalPortals.Model
{
    /// <summary>
    /// Industry classification.
    /// </summary>
    [DataContract(Name = "inline_response_200_3_instrument_industryClassification")]
    public partial class InlineResponse2003InstrumentIndustryClassification : IEquatable<InlineResponse2003InstrumentIndustryClassification>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="InlineResponse2003InstrumentIndustryClassification" /> class.
        /// </summary>
        /// <param name="rbics">Classification based on FactSet Revere Business Industry Classification System (RBICS). The categories are arranged in a hierarchy, with level 1 representing the most coarse granularity and further levels successively refining the granularity. See endpoint &#x60;/category/listBySystem&#x60; for category system 48 for possible values..</param>
        public InlineResponse2003InstrumentIndustryClassification(List<InlineResponse2003InstrumentIndustryClassificationRbics> rbics = default(List<InlineResponse2003InstrumentIndustryClassificationRbics>))
        {
            this.Rbics = rbics;
        }

        /// <summary>
        /// Classification based on FactSet Revere Business Industry Classification System (RBICS). The categories are arranged in a hierarchy, with level 1 representing the most coarse granularity and further levels successively refining the granularity. See endpoint &#x60;/category/listBySystem&#x60; for category system 48 for possible values.
        /// </summary>
        /// <value>Classification based on FactSet Revere Business Industry Classification System (RBICS). The categories are arranged in a hierarchy, with level 1 representing the most coarse granularity and further levels successively refining the granularity. See endpoint &#x60;/category/listBySystem&#x60; for category system 48 for possible values.</value>
        [DataMember(Name = "rbics", EmitDefaultValue = false)]
        public List<InlineResponse2003InstrumentIndustryClassificationRbics> Rbics { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class InlineResponse2003InstrumentIndustryClassification {\n");
            sb.Append("  Rbics: ").Append(Rbics).Append("\n");
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
            return this.Equals(input as InlineResponse2003InstrumentIndustryClassification);
        }

        /// <summary>
        /// Returns true if InlineResponse2003InstrumentIndustryClassification instances are equal
        /// </summary>
        /// <param name="input">Instance of InlineResponse2003InstrumentIndustryClassification to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(InlineResponse2003InstrumentIndustryClassification input)
        {
            if (input == null)
            {
                return false;
            }
            return 
                (
                    this.Rbics == input.Rbics ||
                    this.Rbics != null &&
                    input.Rbics != null &&
                    this.Rbics.SequenceEqual(input.Rbics)
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
                if (this.Rbics != null)
                {
                    hashCode = (hashCode * 59) + this.Rbics.GetHashCode();
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
