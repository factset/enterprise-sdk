/*
 * FactSet Estimates
 *
 * With global coverage since 1999, the FactSet Estimates API provides you with comprehensive estimates and statistics on a wide variety of financial statement items as well as industry-specific metrics. The universe is comprised of over 19,000 active companies across 90+ countries with the following types of data included:   - **Consensus** - **Detail** - **Ratings** - **Surprise** - **Segments** - **Actuals** - **New Estimates and Ratings Reports Endpoints**  For clients seeking  curated and relevant financial data, the FactSet Estimates API now includes Estimates and Ratings Reports endpoints. These powerful endpoints are designed for easy integration and consumption, delivering a wide array of financial metrics, estimates, and critical statistics in a highly accessible format suitable for both mobile and web applications.   Whether you are an analyst, investor, or financial professional, the Estimates and Ratings Reports endpoints offer detailed and actionable financial insights that can support thorough analyses and strategic decision-making processes.   The Estimates and Ratings Reports endpoints are especially valuable for B2B2C  applications, empowering financial services firms, investment companies, and corporate finance teams to:   - **Elevate Client Engagement:** Enrich user experiences in client-facing applications with comprehensive and up-to-date financial metrics.  - **Build Custom Reporting Tools:** Create tailored dashboards and analytics tools that provide deep insights and foster better financial understanding.  By adopting the FactSet Estimates API with its enriched Estimates and Ratings Reports endpoints, businesses can streamline their financial data integration process, improve operational efficiency, and deliver superior financial insights to their clients and end-users.     <p>This API is rate-limited to 10 requests per second and 10 concurrent requests per user.</p>  **Download API Specification**        To programmatically download the FactSet Estimates API Specification file in .yaml format, utilize the link below. You must be authorized for this API to extract the specification. This specification can then be used for Codegen to create your own SDKs. You can also access it by selecting the \"Download Spec\" button beside the version information.      [https://api.factset.com/content/factset-estimates/v2/spec/swagger.yaml](https://api.factset.com/content/factset-estimates/v2/spec/swagger.yaml) 
 *
 * The version of the OpenAPI document: 2.6.1
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
using OpenAPIDateConverter = FactSet.SDK.FactSetEstimates.Client.OpenAPIDateConverter;

namespace FactSet.SDK.FactSetEstimates.Model
{
    /// <summary>
    /// RatingsCount
    /// </summary>
    [DataContract(Name = "RatingsCount")]
    public partial class RatingsCount : IEquatable<RatingsCount>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="RatingsCount" /> class.
        /// </summary>
        /// <param name="buy">Specifies the number of buy ratings received for a given security identifier. Details on the date of validity for this data are provided in the &#x60;asOfMonth&#x60; field..</param>
        /// <param name="overWeight">Specifies the number of overWeight ratings received for a given security identifier. Details on the date of validity for this data are provided in the &#x60;asOfMonth&#x60; field..</param>
        /// <param name="hold">Specifies the number of hold ratings received for a given security identifier. Details on the date of validity for this data are provided in the &#x60;asOfMonth&#x60; field..</param>
        /// <param name="underWeight">Specifies the number of underWeight ratings received for a given security identifier. Details on the date of validity for this data are provided in the &#x60;asOfMonth&#x60; field..</param>
        /// <param name="sell">Specifies the number of sell ratings received for a given security identifier. Details on the date of validity for this data are provided in the &#x60;asOfMonth&#x60; field..</param>
        /// <param name="total">Specifies the total number of ratings received across all categories for a given security identifier. Details on the date of validity for this data are provided in the &#x60;asOfMonth&#x60; field..</param>
        public RatingsCount(int buy = default(int), int overWeight = default(int), int hold = default(int), int underWeight = default(int), int sell = default(int), int total = default(int))
        {
            this.Buy = buy;
            this.OverWeight = overWeight;
            this.Hold = hold;
            this.UnderWeight = underWeight;
            this.Sell = sell;
            this.Total = total;
        }

        /// <summary>
        /// Specifies the number of buy ratings received for a given security identifier. Details on the date of validity for this data are provided in the &#x60;asOfMonth&#x60; field.
        /// </summary>
        /// <value>Specifies the number of buy ratings received for a given security identifier. Details on the date of validity for this data are provided in the &#x60;asOfMonth&#x60; field.</value>
        [DataMember(Name = "buy", EmitDefaultValue = false)]
        public int Buy { get; set; }

        /// <summary>
        /// Specifies the number of overWeight ratings received for a given security identifier. Details on the date of validity for this data are provided in the &#x60;asOfMonth&#x60; field.
        /// </summary>
        /// <value>Specifies the number of overWeight ratings received for a given security identifier. Details on the date of validity for this data are provided in the &#x60;asOfMonth&#x60; field.</value>
        [DataMember(Name = "overWeight", EmitDefaultValue = false)]
        public int OverWeight { get; set; }

        /// <summary>
        /// Specifies the number of hold ratings received for a given security identifier. Details on the date of validity for this data are provided in the &#x60;asOfMonth&#x60; field.
        /// </summary>
        /// <value>Specifies the number of hold ratings received for a given security identifier. Details on the date of validity for this data are provided in the &#x60;asOfMonth&#x60; field.</value>
        [DataMember(Name = "hold", EmitDefaultValue = false)]
        public int Hold { get; set; }

        /// <summary>
        /// Specifies the number of underWeight ratings received for a given security identifier. Details on the date of validity for this data are provided in the &#x60;asOfMonth&#x60; field.
        /// </summary>
        /// <value>Specifies the number of underWeight ratings received for a given security identifier. Details on the date of validity for this data are provided in the &#x60;asOfMonth&#x60; field.</value>
        [DataMember(Name = "underWeight", EmitDefaultValue = false)]
        public int UnderWeight { get; set; }

        /// <summary>
        /// Specifies the number of sell ratings received for a given security identifier. Details on the date of validity for this data are provided in the &#x60;asOfMonth&#x60; field.
        /// </summary>
        /// <value>Specifies the number of sell ratings received for a given security identifier. Details on the date of validity for this data are provided in the &#x60;asOfMonth&#x60; field.</value>
        [DataMember(Name = "sell", EmitDefaultValue = false)]
        public int Sell { get; set; }

        /// <summary>
        /// Specifies the total number of ratings received across all categories for a given security identifier. Details on the date of validity for this data are provided in the &#x60;asOfMonth&#x60; field.
        /// </summary>
        /// <value>Specifies the total number of ratings received across all categories for a given security identifier. Details on the date of validity for this data are provided in the &#x60;asOfMonth&#x60; field.</value>
        [DataMember(Name = "total", EmitDefaultValue = false)]
        public int Total { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class RatingsCount {\n");
            sb.Append("  Buy: ").Append(Buy).Append("\n");
            sb.Append("  OverWeight: ").Append(OverWeight).Append("\n");
            sb.Append("  Hold: ").Append(Hold).Append("\n");
            sb.Append("  UnderWeight: ").Append(UnderWeight).Append("\n");
            sb.Append("  Sell: ").Append(Sell).Append("\n");
            sb.Append("  Total: ").Append(Total).Append("\n");
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
            return this.Equals(input as RatingsCount);
        }

        /// <summary>
        /// Returns true if RatingsCount instances are equal
        /// </summary>
        /// <param name="input">Instance of RatingsCount to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(RatingsCount input)
        {
            if (input == null)
            {
                return false;
            }
            return 
                (
                    this.Buy == input.Buy ||
                    this.Buy.Equals(input.Buy)
                ) && 
                (
                    this.OverWeight == input.OverWeight ||
                    this.OverWeight.Equals(input.OverWeight)
                ) && 
                (
                    this.Hold == input.Hold ||
                    this.Hold.Equals(input.Hold)
                ) && 
                (
                    this.UnderWeight == input.UnderWeight ||
                    this.UnderWeight.Equals(input.UnderWeight)
                ) && 
                (
                    this.Sell == input.Sell ||
                    this.Sell.Equals(input.Sell)
                ) && 
                (
                    this.Total == input.Total ||
                    this.Total.Equals(input.Total)
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
                hashCode = (hashCode * 59) + this.Buy.GetHashCode();
                hashCode = (hashCode * 59) + this.OverWeight.GetHashCode();
                hashCode = (hashCode * 59) + this.Hold.GetHashCode();
                hashCode = (hashCode * 59) + this.UnderWeight.GetHashCode();
                hashCode = (hashCode * 59) + this.Sell.GetHashCode();
                hashCode = (hashCode * 59) + this.Total.GetHashCode();
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
