/*
 * Quotes API For Digital Portals
 *
 * The Quotes API combines endpoints for retrieving security end-of-day, delayed, and realtime prices with performance key figures and basic reference data on the security and market level.  The API supports over 20 different price types for each quote and comes with basic search endpoints based on security identifiers and instrument names. Market coverage is included in the *Sample Use Cases* section below.  The Digital Portal use case is focused on high-performance applications that are  * serving millions of end-users, * accessible by client browsers via the internet, * supporting subscriptions for streamed updates out-of-the-box, * typically combining a wide variety of *for Digital Portals*-APIs into a highly use-case specific solution for customers, * integrated into complex infrastructures such as existing frontend frameworks, authentication services.  All APIs labelled *for Digital Portals* have been designed for direct use by client web applications and feature extreme low latency: The average response time across all endpoints is 30 ms whereas 99% of all requests are answered in close to under 300ms.  See the [Time Series API for Digital Portals](https://developer.factset.com/api-catalog/time-series-api-digital-portals) for direct access to price histories, and the [News API for Digital Portals](https://developer.factset.com/api-catalog/news-api-digital-portals) for searching and fetching related news. 
 *
 * The version of the OpenAPI document: 2
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
using OpenAPIDateConverter = FactSet.SDK.QuotesAPIforDigitalPortals.Client.OpenAPIDateConverter;

namespace FactSet.SDK.QuotesAPIforDigitalPortals.Model
{
    /// <summary>
    /// MiFID II data.
    /// </summary>
    [DataContract(Name = "inline_response_200_62_data")]
    public partial class InlineResponse20062Data : IEquatable<InlineResponse20062Data>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="InlineResponse20062Data" /> class.
        /// </summary>
        /// <param name="general">general.</param>
        /// <param name="targetMarket">targetMarket.</param>
        /// <param name="distributionChannel">distributionChannel.</param>
        /// <param name="costsAndCharges">costsAndCharges.</param>
        public InlineResponse20062Data(InlineResponse20062DataGeneral general = default(InlineResponse20062DataGeneral), InlineResponse20062DataTargetMarket targetMarket = default(InlineResponse20062DataTargetMarket), InlineResponse20062DataDistributionChannel distributionChannel = default(InlineResponse20062DataDistributionChannel), InlineResponse20062DataCostsAndCharges costsAndCharges = default(InlineResponse20062DataCostsAndCharges))
        {
            this.General = general;
            this.TargetMarket = targetMarket;
            this.DistributionChannel = distributionChannel;
            this.CostsAndCharges = costsAndCharges;
        }

        /// <summary>
        /// Gets or Sets General
        /// </summary>
        [DataMember(Name = "general", EmitDefaultValue = false)]
        public InlineResponse20062DataGeneral General { get; set; }

        /// <summary>
        /// Gets or Sets TargetMarket
        /// </summary>
        [DataMember(Name = "targetMarket", EmitDefaultValue = false)]
        public InlineResponse20062DataTargetMarket TargetMarket { get; set; }

        /// <summary>
        /// Gets or Sets DistributionChannel
        /// </summary>
        [DataMember(Name = "distributionChannel", EmitDefaultValue = false)]
        public InlineResponse20062DataDistributionChannel DistributionChannel { get; set; }

        /// <summary>
        /// Gets or Sets CostsAndCharges
        /// </summary>
        [DataMember(Name = "costsAndCharges", EmitDefaultValue = false)]
        public InlineResponse20062DataCostsAndCharges CostsAndCharges { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class InlineResponse20062Data {\n");
            sb.Append("  General: ").Append(General).Append("\n");
            sb.Append("  TargetMarket: ").Append(TargetMarket).Append("\n");
            sb.Append("  DistributionChannel: ").Append(DistributionChannel).Append("\n");
            sb.Append("  CostsAndCharges: ").Append(CostsAndCharges).Append("\n");
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
            return this.Equals(input as InlineResponse20062Data);
        }

        /// <summary>
        /// Returns true if InlineResponse20062Data instances are equal
        /// </summary>
        /// <param name="input">Instance of InlineResponse20062Data to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(InlineResponse20062Data input)
        {
            if (input == null)
            {
                return false;
            }
            return 
                (
                    this.General == input.General ||
                    (this.General != null &&
                    this.General.Equals(input.General))
                ) && 
                (
                    this.TargetMarket == input.TargetMarket ||
                    (this.TargetMarket != null &&
                    this.TargetMarket.Equals(input.TargetMarket))
                ) && 
                (
                    this.DistributionChannel == input.DistributionChannel ||
                    (this.DistributionChannel != null &&
                    this.DistributionChannel.Equals(input.DistributionChannel))
                ) && 
                (
                    this.CostsAndCharges == input.CostsAndCharges ||
                    (this.CostsAndCharges != null &&
                    this.CostsAndCharges.Equals(input.CostsAndCharges))
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
                if (this.General != null)
                {
                    hashCode = (hashCode * 59) + this.General.GetHashCode();
                }
                if (this.TargetMarket != null)
                {
                    hashCode = (hashCode * 59) + this.TargetMarket.GetHashCode();
                }
                if (this.DistributionChannel != null)
                {
                    hashCode = (hashCode * 59) + this.DistributionChannel.GetHashCode();
                }
                if (this.CostsAndCharges != null)
                {
                    hashCode = (hashCode * 59) + this.CostsAndCharges.GetHashCode();
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
