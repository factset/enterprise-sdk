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
    /// Classification based on FactSet Revere Business Industry Classification System (RBICS).
    /// </summary>
    [DataContract(Name = "inline_response_200_4_instrument_industryClassification_rbics")]
    public partial class InlineResponse2004InstrumentIndustryClassificationRbics : IEquatable<InlineResponse2004InstrumentIndustryClassificationRbics>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="InlineResponse2004InstrumentIndustryClassificationRbics" /> class.
        /// </summary>
        /// <param name="level1">level1.</param>
        /// <param name="level2">level2.</param>
        /// <param name="level3">level3.</param>
        /// <param name="level4">level4.</param>
        /// <param name="level5">level5.</param>
        /// <param name="level6">level6.</param>
        public InlineResponse2004InstrumentIndustryClassificationRbics(InlineResponse2004InstrumentIndustryClassificationRbicsLevel1 level1 = default(InlineResponse2004InstrumentIndustryClassificationRbicsLevel1), InlineResponse2004InstrumentIndustryClassificationRbicsLevel2 level2 = default(InlineResponse2004InstrumentIndustryClassificationRbicsLevel2), InlineResponse2004InstrumentIndustryClassificationRbicsLevel3 level3 = default(InlineResponse2004InstrumentIndustryClassificationRbicsLevel3), InlineResponse2004InstrumentIndustryClassificationRbicsLevel4 level4 = default(InlineResponse2004InstrumentIndustryClassificationRbicsLevel4), InlineResponse2004InstrumentIndustryClassificationRbicsLevel5 level5 = default(InlineResponse2004InstrumentIndustryClassificationRbicsLevel5), InlineResponse2004InstrumentIndustryClassificationRbicsLevel6 level6 = default(InlineResponse2004InstrumentIndustryClassificationRbicsLevel6))
        {
            this.Level1 = level1;
            this.Level2 = level2;
            this.Level3 = level3;
            this.Level4 = level4;
            this.Level5 = level5;
            this.Level6 = level6;
        }

        /// <summary>
        /// Gets or Sets Level1
        /// </summary>
        [DataMember(Name = "level1", EmitDefaultValue = false)]
        public InlineResponse2004InstrumentIndustryClassificationRbicsLevel1 Level1 { get; set; }

        /// <summary>
        /// Gets or Sets Level2
        /// </summary>
        [DataMember(Name = "level2", EmitDefaultValue = false)]
        public InlineResponse2004InstrumentIndustryClassificationRbicsLevel2 Level2 { get; set; }

        /// <summary>
        /// Gets or Sets Level3
        /// </summary>
        [DataMember(Name = "level3", EmitDefaultValue = false)]
        public InlineResponse2004InstrumentIndustryClassificationRbicsLevel3 Level3 { get; set; }

        /// <summary>
        /// Gets or Sets Level4
        /// </summary>
        [DataMember(Name = "level4", EmitDefaultValue = false)]
        public InlineResponse2004InstrumentIndustryClassificationRbicsLevel4 Level4 { get; set; }

        /// <summary>
        /// Gets or Sets Level5
        /// </summary>
        [DataMember(Name = "level5", EmitDefaultValue = false)]
        public InlineResponse2004InstrumentIndustryClassificationRbicsLevel5 Level5 { get; set; }

        /// <summary>
        /// Gets or Sets Level6
        /// </summary>
        [DataMember(Name = "level6", EmitDefaultValue = false)]
        public InlineResponse2004InstrumentIndustryClassificationRbicsLevel6 Level6 { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class InlineResponse2004InstrumentIndustryClassificationRbics {\n");
            sb.Append("  Level1: ").Append(Level1).Append("\n");
            sb.Append("  Level2: ").Append(Level2).Append("\n");
            sb.Append("  Level3: ").Append(Level3).Append("\n");
            sb.Append("  Level4: ").Append(Level4).Append("\n");
            sb.Append("  Level5: ").Append(Level5).Append("\n");
            sb.Append("  Level6: ").Append(Level6).Append("\n");
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
            return this.Equals(input as InlineResponse2004InstrumentIndustryClassificationRbics);
        }

        /// <summary>
        /// Returns true if InlineResponse2004InstrumentIndustryClassificationRbics instances are equal
        /// </summary>
        /// <param name="input">Instance of InlineResponse2004InstrumentIndustryClassificationRbics to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(InlineResponse2004InstrumentIndustryClassificationRbics input)
        {
            if (input == null)
            {
                return false;
            }
            return 
                (
                    this.Level1 == input.Level1 ||
                    (this.Level1 != null &&
                    this.Level1.Equals(input.Level1))
                ) && 
                (
                    this.Level2 == input.Level2 ||
                    (this.Level2 != null &&
                    this.Level2.Equals(input.Level2))
                ) && 
                (
                    this.Level3 == input.Level3 ||
                    (this.Level3 != null &&
                    this.Level3.Equals(input.Level3))
                ) && 
                (
                    this.Level4 == input.Level4 ||
                    (this.Level4 != null &&
                    this.Level4.Equals(input.Level4))
                ) && 
                (
                    this.Level5 == input.Level5 ||
                    (this.Level5 != null &&
                    this.Level5.Equals(input.Level5))
                ) && 
                (
                    this.Level6 == input.Level6 ||
                    (this.Level6 != null &&
                    this.Level6.Equals(input.Level6))
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
                if (this.Level1 != null)
                {
                    hashCode = (hashCode * 59) + this.Level1.GetHashCode();
                }
                if (this.Level2 != null)
                {
                    hashCode = (hashCode * 59) + this.Level2.GetHashCode();
                }
                if (this.Level3 != null)
                {
                    hashCode = (hashCode * 59) + this.Level3.GetHashCode();
                }
                if (this.Level4 != null)
                {
                    hashCode = (hashCode * 59) + this.Level4.GetHashCode();
                }
                if (this.Level5 != null)
                {
                    hashCode = (hashCode * 59) + this.Level5.GetHashCode();
                }
                if (this.Level6 != null)
                {
                    hashCode = (hashCode * 59) + this.Level6.GetHashCode();
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
