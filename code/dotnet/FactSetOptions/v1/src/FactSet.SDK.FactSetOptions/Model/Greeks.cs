/*
 * FactSet Options API
 *
 * The Option Prices database provides pricing data such as mid bid-ask price, reference data (e.g., strike price), and risk measures (e.g., Greeks and implied volatility). Visit [Options Overview OA Page # 14925](https://my.apps.factset.com/oa/pages/14925) for details on database coverage. U.S. exchange-traded option bid and ask quotes are continuously updated throughout the day even when no trades have occurred on the option (zero volume). The end-of-day closing bid and ask quotes are always in line with the underlying closing price.  **Note** * Currently in Beta only **OPRA** exchanges are supported. 
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
using OpenAPIDateConverter = FactSet.SDK.FactSetOptions.Client.OpenAPIDateConverter;

namespace FactSet.SDK.FactSetOptions.Model
{
    /// <summary>
    /// Greeks Response fields
    /// </summary>
    [DataContract(Name = "greeks")]
    public partial class Greeks : IEquatable<Greeks>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="Greeks" /> class.
        /// </summary>
        /// <param name="delta">The delta value of the option. Refer to the &#x60;greeks&#x60; endpoint description for more details.</param>
        /// <param name="fsymId">FactSet&#39;s Option Symbol. For more detail, visit [OA 12636](https://my.apps.factset.com/oa/pages/12636#options).</param>
        /// <param name="gamma">The gamma value of the option. Refer to the &#x60;greeks&#x60; endpoint description for more details.</param>
        /// <param name="requestId">The requested identifier submitted in the query..</param>
        /// <param name="rho">The rho value of the option. Refer to the &#x60;greeks&#x60; endpoint description for more details.</param>
        /// <param name="theta">The theta value of the option. Refer to the &#x60;greeks&#x60; endpoint description for more details.</param>
        /// <param name="vega">The vega value of the option. Refer to the &#x60;greeks&#x60; endpoint description for more details.</param>
        /// <param name="date">The date the data is as of in YYYY-MM-DD format..</param>
        public Greeks(double? delta = default(double?), string fsymId = default(string), double? gamma = default(double?), string requestId = default(string), double? rho = default(double?), double? theta = default(double?), double? vega = default(double?), DateTime? date = default(DateTime?))
        {
            this.Delta = delta;
            this.FsymId = fsymId;
            this.Gamma = gamma;
            this.RequestId = requestId;
            this.Rho = rho;
            this.Theta = theta;
            this.Vega = vega;
            this.Date = date;
        }

        /// <summary>
        /// The delta value of the option. Refer to the &#x60;greeks&#x60; endpoint description for more details
        /// </summary>
        /// <value>The delta value of the option. Refer to the &#x60;greeks&#x60; endpoint description for more details</value>
        [DataMember(Name = "delta", EmitDefaultValue = true)]
        public double? Delta { get; set; }

        /// <summary>
        /// FactSet&#39;s Option Symbol. For more detail, visit [OA 12636](https://my.apps.factset.com/oa/pages/12636#options)
        /// </summary>
        /// <value>FactSet&#39;s Option Symbol. For more detail, visit [OA 12636](https://my.apps.factset.com/oa/pages/12636#options)</value>
        [DataMember(Name = "fsymId", EmitDefaultValue = true)]
        public string FsymId { get; set; }

        /// <summary>
        /// The gamma value of the option. Refer to the &#x60;greeks&#x60; endpoint description for more details
        /// </summary>
        /// <value>The gamma value of the option. Refer to the &#x60;greeks&#x60; endpoint description for more details</value>
        [DataMember(Name = "gamma", EmitDefaultValue = true)]
        public double? Gamma { get; set; }

        /// <summary>
        /// The requested identifier submitted in the query.
        /// </summary>
        /// <value>The requested identifier submitted in the query.</value>
        [DataMember(Name = "requestId", EmitDefaultValue = false)]
        public string RequestId { get; set; }

        /// <summary>
        /// The rho value of the option. Refer to the &#x60;greeks&#x60; endpoint description for more details
        /// </summary>
        /// <value>The rho value of the option. Refer to the &#x60;greeks&#x60; endpoint description for more details</value>
        [DataMember(Name = "rho", EmitDefaultValue = true)]
        public double? Rho { get; set; }

        /// <summary>
        /// The theta value of the option. Refer to the &#x60;greeks&#x60; endpoint description for more details
        /// </summary>
        /// <value>The theta value of the option. Refer to the &#x60;greeks&#x60; endpoint description for more details</value>
        [DataMember(Name = "theta", EmitDefaultValue = true)]
        public double? Theta { get; set; }

        /// <summary>
        /// The vega value of the option. Refer to the &#x60;greeks&#x60; endpoint description for more details
        /// </summary>
        /// <value>The vega value of the option. Refer to the &#x60;greeks&#x60; endpoint description for more details</value>
        [DataMember(Name = "vega", EmitDefaultValue = true)]
        public double? Vega { get; set; }

        /// <summary>
        /// The date the data is as of in YYYY-MM-DD format.
        /// </summary>
        /// <value>The date the data is as of in YYYY-MM-DD format.</value>
        [DataMember(Name = "date", EmitDefaultValue = true)]
        [JsonConverter(typeof(OpenAPIDateConverter))]
        public DateTime? Date { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class Greeks {\n");
            sb.Append("  Delta: ").Append(Delta).Append("\n");
            sb.Append("  FsymId: ").Append(FsymId).Append("\n");
            sb.Append("  Gamma: ").Append(Gamma).Append("\n");
            sb.Append("  RequestId: ").Append(RequestId).Append("\n");
            sb.Append("  Rho: ").Append(Rho).Append("\n");
            sb.Append("  Theta: ").Append(Theta).Append("\n");
            sb.Append("  Vega: ").Append(Vega).Append("\n");
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
            return this.Equals(input as Greeks);
        }

        /// <summary>
        /// Returns true if Greeks instances are equal
        /// </summary>
        /// <param name="input">Instance of Greeks to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(Greeks input)
        {
            if (input == null)
            {
                return false;
            }
            return 
                (
                    this.Delta == input.Delta ||
                    (this.Delta != null &&
                    this.Delta.Equals(input.Delta))
                ) && 
                (
                    this.FsymId == input.FsymId ||
                    (this.FsymId != null &&
                    this.FsymId.Equals(input.FsymId))
                ) && 
                (
                    this.Gamma == input.Gamma ||
                    (this.Gamma != null &&
                    this.Gamma.Equals(input.Gamma))
                ) && 
                (
                    this.RequestId == input.RequestId ||
                    (this.RequestId != null &&
                    this.RequestId.Equals(input.RequestId))
                ) && 
                (
                    this.Rho == input.Rho ||
                    (this.Rho != null &&
                    this.Rho.Equals(input.Rho))
                ) && 
                (
                    this.Theta == input.Theta ||
                    (this.Theta != null &&
                    this.Theta.Equals(input.Theta))
                ) && 
                (
                    this.Vega == input.Vega ||
                    (this.Vega != null &&
                    this.Vega.Equals(input.Vega))
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
                if (this.Delta != null)
                {
                    hashCode = (hashCode * 59) + this.Delta.GetHashCode();
                }
                if (this.FsymId != null)
                {
                    hashCode = (hashCode * 59) + this.FsymId.GetHashCode();
                }
                if (this.Gamma != null)
                {
                    hashCode = (hashCode * 59) + this.Gamma.GetHashCode();
                }
                if (this.RequestId != null)
                {
                    hashCode = (hashCode * 59) + this.RequestId.GetHashCode();
                }
                if (this.Rho != null)
                {
                    hashCode = (hashCode * 59) + this.Rho.GetHashCode();
                }
                if (this.Theta != null)
                {
                    hashCode = (hashCode * 59) + this.Theta.GetHashCode();
                }
                if (this.Vega != null)
                {
                    hashCode = (hashCode * 59) + this.Vega.GetHashCode();
                }
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
