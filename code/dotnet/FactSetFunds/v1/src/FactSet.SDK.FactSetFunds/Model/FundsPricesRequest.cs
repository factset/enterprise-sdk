/*
 * FactSet Funds API
 *
 * FactSet Mutual Funds data offers over 50 fund- and share class-specific data points for mutual funds listed in the United States. <p>FactSet Mutual Funds Reference provides fund-specific reference information as well as FactSet's proprietary classification system. It includes but is not limited to the following coverage    * Fund descriptions    * A seven-tier classification system   * Leverage information   * Fees and expenses    * Portfolio managers       FactSet Mutual Funds Time Series provides quantitative data items on a historical basis. It includes but is not limited to the following coverage    * Net asset value   * Fund flows    * Assets under management   * Total return  <p>This API is rate-limited to 10 requests per second and 10 concurrent requests per user.</p> 
 *
 * The version of the OpenAPI document: 1.1.0
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
using OpenAPIDateConverter = FactSet.SDK.FactSetFunds.Client.OpenAPIDateConverter;

namespace FactSet.SDK.FactSetFunds.Model
{
    /// <summary>
    /// Prices Request Body
    /// </summary>
    [DataContract(Name = "fundsPricesRequest")]
    public partial class FundsPricesRequest : IEquatable<FundsPricesRequest>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="FundsPricesRequest" /> class.
        /// </summary>
        [JsonConstructorAttribute]
        protected FundsPricesRequest() { }
        /// <summary>
        /// Initializes a new instance of the <see cref="FundsPricesRequest" /> class.
        /// </summary>
        /// <param name="ids">The requested Fund Identifier. FactSet Identifiers, tickers, CUSIP and SEDOL are accepted input. &lt;p&gt;***ids limit** &#x3D;  1000 per request*&lt;/p&gt;  (required).</param>
        /// <param name="startDate">The start date requested for a given date range in **YYYY-MM-DD** format. If left blank, the API will default to previous close. Future dates (T+1) are not accepted in this endpoint. .</param>
        /// <param name="endDate">The end date requested for a given date range in **YYYY-MM-DD** format. If left blank, the API will default to previous close. Future dates (T+1) are not accepted in this endpoint. .</param>
        /// <param name="frequency">frequency.</param>
        /// <param name="currency">The ISO3 currency control for the requested fund. (default to &quot;LOCAL&quot;).</param>
        /// <param name="dataType">dataType.</param>
        /// <param name="splitAdjust">splitAdjust.</param>
        public FundsPricesRequest(List<string> ids,string startDate = default(string), string endDate = default(string), Frequency frequency = default(Frequency), string currency = "LOCAL", DataType dataType = default(DataType), SplitAdjust splitAdjust = default(SplitAdjust))
        {
            // to ensure "ids" is required (not null)
            if (ids == null) {
                throw new ArgumentNullException("ids is a required property for FundsPricesRequest and cannot be null");
            }
            this.Ids = ids;
            this.StartDate = startDate;
            this.EndDate = endDate;
            this.Frequency = frequency;
            // use default value if no "currency" provided
            this.Currency = currency ?? "LOCAL";
            this.DataType = dataType;
            this.SplitAdjust = splitAdjust;
        }

        /// <summary>
        /// The requested Fund Identifier. FactSet Identifiers, tickers, CUSIP and SEDOL are accepted input. &lt;p&gt;***ids limit** &#x3D;  1000 per request*&lt;/p&gt; 
        /// </summary>
        /// <value>The requested Fund Identifier. FactSet Identifiers, tickers, CUSIP and SEDOL are accepted input. &lt;p&gt;***ids limit** &#x3D;  1000 per request*&lt;/p&gt; </value>
        [DataMember(Name = "ids", IsRequired = true, EmitDefaultValue = false)]
        public List<string> Ids { get; set; }

        /// <summary>
        /// The start date requested for a given date range in **YYYY-MM-DD** format. If left blank, the API will default to previous close. Future dates (T+1) are not accepted in this endpoint. 
        /// </summary>
        /// <value>The start date requested for a given date range in **YYYY-MM-DD** format. If left blank, the API will default to previous close. Future dates (T+1) are not accepted in this endpoint. </value>
        [DataMember(Name = "startDate", EmitDefaultValue = false)]
        public string StartDate { get; set; }

        /// <summary>
        /// The end date requested for a given date range in **YYYY-MM-DD** format. If left blank, the API will default to previous close. Future dates (T+1) are not accepted in this endpoint. 
        /// </summary>
        /// <value>The end date requested for a given date range in **YYYY-MM-DD** format. If left blank, the API will default to previous close. Future dates (T+1) are not accepted in this endpoint. </value>
        [DataMember(Name = "endDate", EmitDefaultValue = false)]
        public string EndDate { get; set; }

        /// <summary>
        /// Gets or Sets Frequency
        /// </summary>
        [DataMember(Name = "frequency", EmitDefaultValue = false)]
        public Frequency Frequency { get; set; }

        /// <summary>
        /// The ISO3 currency control for the requested fund.
        /// </summary>
        /// <value>The ISO3 currency control for the requested fund.</value>
        [DataMember(Name = "currency", EmitDefaultValue = false)]
        public string Currency { get; set; }

        /// <summary>
        /// Gets or Sets DataType
        /// </summary>
        [DataMember(Name = "dataType", EmitDefaultValue = false)]
        public DataType DataType { get; set; }

        /// <summary>
        /// Gets or Sets SplitAdjust
        /// </summary>
        [DataMember(Name = "splitAdjust", EmitDefaultValue = false)]
        public SplitAdjust SplitAdjust { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class FundsPricesRequest {\n");
            sb.Append("  Ids: ").Append(Ids).Append("\n");
            sb.Append("  StartDate: ").Append(StartDate).Append("\n");
            sb.Append("  EndDate: ").Append(EndDate).Append("\n");
            sb.Append("  Frequency: ").Append(Frequency).Append("\n");
            sb.Append("  Currency: ").Append(Currency).Append("\n");
            sb.Append("  DataType: ").Append(DataType).Append("\n");
            sb.Append("  SplitAdjust: ").Append(SplitAdjust).Append("\n");
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
            return this.Equals(input as FundsPricesRequest);
        }

        /// <summary>
        /// Returns true if FundsPricesRequest instances are equal
        /// </summary>
        /// <param name="input">Instance of FundsPricesRequest to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(FundsPricesRequest input)
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
                    this.StartDate == input.StartDate ||
                    (this.StartDate != null &&
                    this.StartDate.Equals(input.StartDate))
                ) && 
                (
                    this.EndDate == input.EndDate ||
                    (this.EndDate != null &&
                    this.EndDate.Equals(input.EndDate))
                ) && 
                (
                    this.Frequency == input.Frequency ||
                    (this.Frequency != null &&
                    this.Frequency.Equals(input.Frequency))
                ) && 
                (
                    this.Currency == input.Currency ||
                    (this.Currency != null &&
                    this.Currency.Equals(input.Currency))
                ) && 
                (
                    this.DataType == input.DataType ||
                    (this.DataType != null &&
                    this.DataType.Equals(input.DataType))
                ) && 
                (
                    this.SplitAdjust == input.SplitAdjust ||
                    (this.SplitAdjust != null &&
                    this.SplitAdjust.Equals(input.SplitAdjust))
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
                if (this.StartDate != null)
                {
                    hashCode = (hashCode * 59) + this.StartDate.GetHashCode();
                }
                if (this.EndDate != null)
                {
                    hashCode = (hashCode * 59) + this.EndDate.GetHashCode();
                }
                if (this.Frequency != null)
                {
                    hashCode = (hashCode * 59) + this.Frequency.GetHashCode();
                }
                if (this.Currency != null)
                {
                    hashCode = (hashCode * 59) + this.Currency.GetHashCode();
                }
                if (this.DataType != null)
                {
                    hashCode = (hashCode * 59) + this.DataType.GetHashCode();
                }
                if (this.SplitAdjust != null)
                {
                    hashCode = (hashCode * 59) + this.SplitAdjust.GetHashCode();
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
