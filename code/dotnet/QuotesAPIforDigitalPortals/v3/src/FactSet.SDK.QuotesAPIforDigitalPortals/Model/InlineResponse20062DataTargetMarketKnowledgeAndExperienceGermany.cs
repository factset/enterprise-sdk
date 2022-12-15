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
    /// Specific indicators for Germany.
    /// </summary>
    [DataContract(Name = "inline_response_200_62_data_targetMarket_knowledgeAndExperience_germany")]
    public partial class InlineResponse20062DataTargetMarketKnowledgeAndExperienceGermany : IEquatable<InlineResponse20062DataTargetMarketKnowledgeAndExperienceGermany>, IValidatableObject
    {
        /// <summary>
        /// Indicates whether the investment product is suitable for investors with an expert level of knowledge and experience. This regulatory requirement is available only in Germany, e.g. for investment in a contract for difference (CFD).
        /// </summary>
        /// <value>Indicates whether the investment product is suitable for investors with an expert level of knowledge and experience. This regulatory requirement is available only in Germany, e.g. for investment in a contract for difference (CFD).</value>
        [JsonConverter(typeof(StringEnumConverter))]
        public enum ExpertInvestorEnum
        {
            /// <summary>
            /// Enum Yes for value: yes
            /// </summary>
            [EnumMember(Value = "yes")]
            Yes = 1,

            /// <summary>
            /// Enum No for value: no
            /// </summary>
            [EnumMember(Value = "no")]
            No = 2,

            /// <summary>
            /// Enum Neutral for value: neutral
            /// </summary>
            [EnumMember(Value = "neutral")]
            Neutral = 3,

            /// <summary>
            /// Enum Feedback for value: feedback
            /// </summary>
            [EnumMember(Value = "feedback")]
            Feedback = 4

        }


        /// <summary>
        /// Indicates whether the investment product is suitable for investors with an expert level of knowledge and experience. This regulatory requirement is available only in Germany, e.g. for investment in a contract for difference (CFD).
        /// </summary>
        /// <value>Indicates whether the investment product is suitable for investors with an expert level of knowledge and experience. This regulatory requirement is available only in Germany, e.g. for investment in a contract for difference (CFD).</value>
        [DataMember(Name = "expertInvestor", EmitDefaultValue = true)]
        public ExpertInvestorEnum? ExpertInvestor { get; set; }
        /// <summary>
        /// Initializes a new instance of the <see cref="InlineResponse20062DataTargetMarketKnowledgeAndExperienceGermany" /> class.
        /// </summary>
        /// <param name="expertInvestor">Indicates whether the investment product is suitable for investors with an expert level of knowledge and experience. This regulatory requirement is available only in Germany, e.g. for investment in a contract for difference (CFD)..</param>
        public InlineResponse20062DataTargetMarketKnowledgeAndExperienceGermany(ExpertInvestorEnum? expertInvestor = default(ExpertInvestorEnum?))
        {
            this.ExpertInvestor = expertInvestor;
        }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class InlineResponse20062DataTargetMarketKnowledgeAndExperienceGermany {\n");
            sb.Append("  ExpertInvestor: ").Append(ExpertInvestor).Append("\n");
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
            return this.Equals(input as InlineResponse20062DataTargetMarketKnowledgeAndExperienceGermany);
        }

        /// <summary>
        /// Returns true if InlineResponse20062DataTargetMarketKnowledgeAndExperienceGermany instances are equal
        /// </summary>
        /// <param name="input">Instance of InlineResponse20062DataTargetMarketKnowledgeAndExperienceGermany to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(InlineResponse20062DataTargetMarketKnowledgeAndExperienceGermany input)
        {
            if (input == null)
            {
                return false;
            }
            return 
                (
                    this.ExpertInvestor == input.ExpertInvestor ||
                    this.ExpertInvestor.Equals(input.ExpertInvestor)
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
                hashCode = (hashCode * 59) + this.ExpertInvestor.GetHashCode();
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
