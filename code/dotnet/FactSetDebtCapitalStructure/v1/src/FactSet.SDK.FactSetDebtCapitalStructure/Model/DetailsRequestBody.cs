/*
 * FactSet Debt Capital Structure API
 *
 * The FactSet Debt Capital Structure API offers insights into public and private company debt financing for 69,000+ entities globally. Analyze at the individual-instrument level through summary and detailed information of the debt structure with history available back through 2006. Instrument types covered include Revolving Credit, Term Loans, Notes, and Bonds.   **How to Programmatically Download API Specification file:**  Please use the below link to download the FactSet Debt Capital Structure API Specification file in .yaml. You must be authorized for this API to extract. This specification can then be used for Codegen to create your own SDKs. You can also access by selecting the \"Download Spec\" button to the right of the version below.  [https://api.factset.com/content/factset-dcs/v1/spec/swagger.yaml](https://api.factset.com/content/factset-dcs/v1/spec/swagger.yaml)  This API is rate-limited to 10 requests per second and 10 concurrent requests per user. 
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
using OpenAPIDateConverter = FactSet.SDK.FactSetDebtCapitalStructure.Client.OpenAPIDateConverter;

namespace FactSet.SDK.FactSetDebtCapitalStructure.Model
{
    /// <summary>
    /// Details Request Body
    /// </summary>
    [DataContract(Name = "DetailsRequestBody")]
    public partial class DetailsRequestBody : IEquatable<DetailsRequestBody>, IValidatableObject
    {

        /// <summary>
        /// Gets or Sets Periodicity
        /// </summary>
        [DataMember(Name = "periodicity", EmitDefaultValue = false)]
        public Periodicity? Periodicity { get; set; }
        /// <summary>
        /// Initializes a new instance of the <see cref="DetailsRequestBody" /> class.
        /// </summary>
        [JsonConstructorAttribute]
        protected DetailsRequestBody() { }
        /// <summary>
        /// Initializes a new instance of the <see cref="DetailsRequestBody" /> class.
        /// </summary>
        /// <param name="ids">The requested list of security identifiers. Accepted ID types include Market Tickers, SEDOL, ISINs, CUSIPs, or FactSet Permanent Ids. Maximum of 25 IDs are supported.  (required).</param>
        /// <param name="periodicity">periodicity.</param>
        /// <param name="date">The date of the period requested in **YYYY-MM-DD** format. Future dates (T+1) are not accepted in this endpoint. .</param>
        public DetailsRequestBody(List<string> ids,Periodicity periodicity = default(Periodicity), DateTime date = default(DateTime))
        {
            // to ensure "ids" is required (not null)
            if (ids == null) {
                throw new ArgumentNullException("ids is a required property for DetailsRequestBody and cannot be null");
            }
            this.Ids = ids;
            this.Periodicity = periodicity;
            this.Date = date;
        }

        /// <summary>
        /// The requested list of security identifiers. Accepted ID types include Market Tickers, SEDOL, ISINs, CUSIPs, or FactSet Permanent Ids. Maximum of 25 IDs are supported. 
        /// </summary>
        /// <value>The requested list of security identifiers. Accepted ID types include Market Tickers, SEDOL, ISINs, CUSIPs, or FactSet Permanent Ids. Maximum of 25 IDs are supported. </value>
        [DataMember(Name = "ids", IsRequired = true, EmitDefaultValue = false)]
        public List<string> Ids { get; set; }

        /// <summary>
        /// The date of the period requested in **YYYY-MM-DD** format. Future dates (T+1) are not accepted in this endpoint. 
        /// </summary>
        /// <value>The date of the period requested in **YYYY-MM-DD** format. Future dates (T+1) are not accepted in this endpoint. </value>
        [DataMember(Name = "date", EmitDefaultValue = false)]
        [JsonConverter(typeof(OpenAPIDateConverter))]
        public DateTime Date { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class DetailsRequestBody {\n");
            sb.Append("  Ids: ").Append(Ids).Append("\n");
            sb.Append("  Periodicity: ").Append(Periodicity).Append("\n");
            sb.Append("  Date: ").Append(Date).Append("\n");
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
            return this.Equals(input as DetailsRequestBody);
        }

        /// <summary>
        /// Returns true if DetailsRequestBody instances are equal
        /// </summary>
        /// <param name="input">Instance of DetailsRequestBody to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(DetailsRequestBody input)
        {
            if (input == null)
            {
                return false;
            }
            return 
                (
                    this.Ids == input.Ids ||
                    this.Ids != null &&
                    input.Ids != null &&
                    this.Ids.SequenceEqual(input.Ids)
                ) && 
                (
                    this.Periodicity == input.Periodicity ||
                    this.Periodicity.Equals(input.Periodicity)
                ) && 
                (
                    this.Date == input.Date ||
                    (this.Date != null &&
                    this.Date.Equals(input.Date))
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
                if (this.Ids != null)
                {
                    hashCode = (hashCode * 59) + this.Ids.GetHashCode();
                }
                hashCode = (hashCode * 59) + this.Periodicity.GetHashCode();
                if (this.Date != null)
                {
                    hashCode = (hashCode * 59) + this.Date.GetHashCode();
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
