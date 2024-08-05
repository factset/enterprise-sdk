/*
 * Open:Risk API
 *
 * Service to calculate parametric linear risk statistics and generate risk model asset identifier mappings.
 *
 * The version of the OpenAPI document: 1.26.0
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
using OpenAPIDateConverter = FactSet.SDK.OpenRisk.Client.OpenAPIDateConverter;

namespace FactSet.SDK.OpenRisk.Model
{
    /// <summary>
    /// Risk model lagging dates for data items to fetch and use. This field can be utilized to isolate each data item&#39;s impact on risk calculation. A typical use case is to analyze the risk change from one day to the other by fixing the risk model data date to one date while moving the portfolio holdings data.
    /// </summary>
    [DataContract(Name = "LaggingDates")]
    public partial class LaggingDates : IEquatable<LaggingDates>, IValidatableObject
    {
        /// <summary>
        /// Stock specific risk (SSR) date can take one of the other lagging dates
        /// </summary>
        /// <value>Stock specific risk (SSR) date can take one of the other lagging dates</value>
        [JsonConverter(typeof(StringEnumConverter))]
        public enum SsrDateIsEnum
        {
            /// <summary>
            /// Enum ExposureDate for value: ExposureDate
            /// </summary>
            [EnumMember(Value = "ExposureDate")]
            ExposureDate = 1,

            /// <summary>
            /// Enum CovarianceDate for value: CovarianceDate
            /// </summary>
            [EnumMember(Value = "CovarianceDate")]
            CovarianceDate = 2

        }


        /// <summary>
        /// Stock specific risk (SSR) date can take one of the other lagging dates
        /// </summary>
        /// <value>Stock specific risk (SSR) date can take one of the other lagging dates</value>
        [DataMember(Name = "ssrDateIs", EmitDefaultValue = false)]
        public SsrDateIsEnum? SsrDateIs { get; set; }
        /// <summary>
        /// Initializes a new instance of the <see cref="LaggingDates" /> class.
        /// </summary>
        /// <param name="exposureDate">exposureDate.</param>
        /// <param name="covarianceDate">covarianceDate.</param>
        /// <param name="ssrDateIs">Stock specific risk (SSR) date can take one of the other lagging dates.</param>
        public LaggingDates(ExposureDateFormatConvention exposureDate = default(ExposureDateFormatConvention), CovarianceDateFormatConvention covarianceDate = default(CovarianceDateFormatConvention), SsrDateIsEnum? ssrDateIs = default(SsrDateIsEnum?))
        {
            this.ExposureDate = exposureDate;
            this.CovarianceDate = covarianceDate;
            this.SsrDateIs = ssrDateIs;
        }

        /// <summary>
        /// Gets or Sets ExposureDate
        /// </summary>
        [DataMember(Name = "exposureDate", EmitDefaultValue = false)]
        public ExposureDateFormatConvention ExposureDate { get; set; }

        /// <summary>
        /// Gets or Sets CovarianceDate
        /// </summary>
        [DataMember(Name = "covarianceDate", EmitDefaultValue = false)]
        public CovarianceDateFormatConvention CovarianceDate { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class LaggingDates {\n");
            sb.Append("  ExposureDate: ").Append(ExposureDate).Append("\n");
            sb.Append("  CovarianceDate: ").Append(CovarianceDate).Append("\n");
            sb.Append("  SsrDateIs: ").Append(SsrDateIs).Append("\n");
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
            return this.Equals(input as LaggingDates);
        }

        /// <summary>
        /// Returns true if LaggingDates instances are equal
        /// </summary>
        /// <param name="input">Instance of LaggingDates to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(LaggingDates input)
        {
            if (input == null)
            {
                return false;
            }
            return 
                (
                    this.ExposureDate == input.ExposureDate ||
                    (this.ExposureDate != null &&
                    this.ExposureDate.Equals(input.ExposureDate))
                ) && 
                (
                    this.CovarianceDate == input.CovarianceDate ||
                    (this.CovarianceDate != null &&
                    this.CovarianceDate.Equals(input.CovarianceDate))
                ) && 
                (
                    this.SsrDateIs == input.SsrDateIs ||
                    this.SsrDateIs.Equals(input.SsrDateIs)
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
                if (this.ExposureDate != null)
                {
                    hashCode = (hashCode * 59) + this.ExposureDate.GetHashCode();
                }
                if (this.CovarianceDate != null)
                {
                    hashCode = (hashCode * 59) + this.CovarianceDate.GetHashCode();
                }
                hashCode = (hashCode * 59) + this.SsrDateIs.GetHashCode();
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
