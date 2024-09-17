/*
 * Cabot Models API
 *
 * Cabot Models API
 *
 * The version of the OpenAPI document: 0.2.0
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
using OpenAPIDateConverter = FactSet.SDK.Cabot.Client.OpenAPIDateConverter;

namespace FactSet.SDK.Cabot.Model
{
    /// <summary>
    /// ResultsModelAnalyticsStatistics
    /// </summary>
    [DataContract(Name = "ResultsModelAnalytics_statistics")]
    public partial class ResultsModelAnalyticsStatistics : IEquatable<ResultsModelAnalyticsStatistics>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="ResultsModelAnalyticsStatistics" /> class.
        /// </summary>
        /// <param name="drawdown">Drawdown quantifies the portfolio’s maximum peak to trough decline experienced over the time period under consideration. It is expressed as the total percent drop between the peak portfolio value and the subsequent deepest trough..</param>
        /// <param name="modiglianiReturn">Also known as M2, this is a measure of the risk adjusted returns of an investment portfolio. It measures the returns of the portfolio, adjusted for the risk of the portfolio relative to that of some benchmark. Derived from the Sharpe ratio, Modigliani return has the advantage of being represented in units of percent return, making the measure more intuitive to interpret..</param>
        /// <param name="standardDeviation">Standard deviation expresses the historical volatility of portfolio monthly returns, over the specified time period..</param>
        /// <param name="trackingError">Also referred to as active risk, this value provides a measure of the deviation between portfolio returns and the returns of the benchmark resulting from portfolio systematic risk and active share. In general, the higher the active share the greater will be the tracking error. Tracking error is calculated as the standard deviation of the difference between the portfolio and benchmark returns and is displayed as a percentage..</param>
        public ResultsModelAnalyticsStatistics(decimal drawdown = default(decimal), decimal modiglianiReturn = default(decimal), decimal standardDeviation = default(decimal), decimal trackingError = default(decimal))
        {
            this.Drawdown = drawdown;
            this.ModiglianiReturn = modiglianiReturn;
            this.StandardDeviation = standardDeviation;
            this.TrackingError = trackingError;
        }

        /// <summary>
        /// Drawdown quantifies the portfolio’s maximum peak to trough decline experienced over the time period under consideration. It is expressed as the total percent drop between the peak portfolio value and the subsequent deepest trough.
        /// </summary>
        /// <value>Drawdown quantifies the portfolio’s maximum peak to trough decline experienced over the time period under consideration. It is expressed as the total percent drop between the peak portfolio value and the subsequent deepest trough.</value>
        [DataMember(Name = "drawdown", EmitDefaultValue = false)]
        public decimal Drawdown { get; set; }

        /// <summary>
        /// Also known as M2, this is a measure of the risk adjusted returns of an investment portfolio. It measures the returns of the portfolio, adjusted for the risk of the portfolio relative to that of some benchmark. Derived from the Sharpe ratio, Modigliani return has the advantage of being represented in units of percent return, making the measure more intuitive to interpret.
        /// </summary>
        /// <value>Also known as M2, this is a measure of the risk adjusted returns of an investment portfolio. It measures the returns of the portfolio, adjusted for the risk of the portfolio relative to that of some benchmark. Derived from the Sharpe ratio, Modigliani return has the advantage of being represented in units of percent return, making the measure more intuitive to interpret.</value>
        [DataMember(Name = "modiglianiReturn", EmitDefaultValue = false)]
        public decimal ModiglianiReturn { get; set; }

        /// <summary>
        /// Standard deviation expresses the historical volatility of portfolio monthly returns, over the specified time period.
        /// </summary>
        /// <value>Standard deviation expresses the historical volatility of portfolio monthly returns, over the specified time period.</value>
        [DataMember(Name = "standardDeviation", EmitDefaultValue = false)]
        public decimal StandardDeviation { get; set; }

        /// <summary>
        /// Also referred to as active risk, this value provides a measure of the deviation between portfolio returns and the returns of the benchmark resulting from portfolio systematic risk and active share. In general, the higher the active share the greater will be the tracking error. Tracking error is calculated as the standard deviation of the difference between the portfolio and benchmark returns and is displayed as a percentage.
        /// </summary>
        /// <value>Also referred to as active risk, this value provides a measure of the deviation between portfolio returns and the returns of the benchmark resulting from portfolio systematic risk and active share. In general, the higher the active share the greater will be the tracking error. Tracking error is calculated as the standard deviation of the difference between the portfolio and benchmark returns and is displayed as a percentage.</value>
        [DataMember(Name = "trackingError", EmitDefaultValue = false)]
        public decimal TrackingError { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class ResultsModelAnalyticsStatistics {\n");
            sb.Append("  Drawdown: ").Append(Drawdown).Append("\n");
            sb.Append("  ModiglianiReturn: ").Append(ModiglianiReturn).Append("\n");
            sb.Append("  StandardDeviation: ").Append(StandardDeviation).Append("\n");
            sb.Append("  TrackingError: ").Append(TrackingError).Append("\n");
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
            return this.Equals(input as ResultsModelAnalyticsStatistics);
        }

        /// <summary>
        /// Returns true if ResultsModelAnalyticsStatistics instances are equal
        /// </summary>
        /// <param name="input">Instance of ResultsModelAnalyticsStatistics to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(ResultsModelAnalyticsStatistics input)
        {
            if (input == null)
            {
                return false;
            }
            return 
                (
                    this.Drawdown == input.Drawdown ||
                    this.Drawdown.Equals(input.Drawdown)
                ) && 
                (
                    this.ModiglianiReturn == input.ModiglianiReturn ||
                    this.ModiglianiReturn.Equals(input.ModiglianiReturn)
                ) && 
                (
                    this.StandardDeviation == input.StandardDeviation ||
                    this.StandardDeviation.Equals(input.StandardDeviation)
                ) && 
                (
                    this.TrackingError == input.TrackingError ||
                    this.TrackingError.Equals(input.TrackingError)
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
                hashCode = (hashCode * 59) + this.Drawdown.GetHashCode();
                hashCode = (hashCode * 59) + this.ModiglianiReturn.GetHashCode();
                hashCode = (hashCode * 59) + this.StandardDeviation.GetHashCode();
                hashCode = (hashCode * 59) + this.TrackingError.GetHashCode();
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
