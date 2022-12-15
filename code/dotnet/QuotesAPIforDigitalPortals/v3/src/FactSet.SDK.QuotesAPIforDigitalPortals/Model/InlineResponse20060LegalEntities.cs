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
    /// Legal entities and their respective background texts with regard to the role.
    /// </summary>
    [DataContract(Name = "inline_response_200_60_legalEntities")]
    public partial class InlineResponse20060LegalEntities : IEquatable<InlineResponse20060LegalEntities>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="InlineResponse20060LegalEntities" /> class.
        /// </summary>
        /// <param name="id">Identifier of a legal entity..</param>
        /// <param name="name">Name of the legal entity..</param>
        /// <param name="backgroundTexts">backgroundTexts.</param>
        public InlineResponse20060LegalEntities(decimal? id = default(decimal?), string name = default(string), InlineResponse20060LegalEntitiesBackgroundTexts backgroundTexts = default(InlineResponse20060LegalEntitiesBackgroundTexts))
        {
            this.Id = id;
            this.Name = name;
            this.BackgroundTexts = backgroundTexts;
        }

        /// <summary>
        /// Identifier of a legal entity.
        /// </summary>
        /// <value>Identifier of a legal entity.</value>
        [DataMember(Name = "id", EmitDefaultValue = true)]
        public decimal? Id { get; set; }

        /// <summary>
        /// Name of the legal entity.
        /// </summary>
        /// <value>Name of the legal entity.</value>
        [DataMember(Name = "name", EmitDefaultValue = true)]
        public string Name { get; set; }

        /// <summary>
        /// Gets or Sets BackgroundTexts
        /// </summary>
        [DataMember(Name = "backgroundTexts", EmitDefaultValue = false)]
        public InlineResponse20060LegalEntitiesBackgroundTexts BackgroundTexts { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class InlineResponse20060LegalEntities {\n");
            sb.Append("  Id: ").Append(Id).Append("\n");
            sb.Append("  Name: ").Append(Name).Append("\n");
            sb.Append("  BackgroundTexts: ").Append(BackgroundTexts).Append("\n");
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
            return this.Equals(input as InlineResponse20060LegalEntities);
        }

        /// <summary>
        /// Returns true if InlineResponse20060LegalEntities instances are equal
        /// </summary>
        /// <param name="input">Instance of InlineResponse20060LegalEntities to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(InlineResponse20060LegalEntities input)
        {
            if (input == null)
            {
                return false;
            }
            return 
                (
                    this.Id == input.Id ||
                    (this.Id != null &&
                    this.Id.Equals(input.Id))
                ) && 
                (
                    this.Name == input.Name ||
                    (this.Name != null &&
                    this.Name.Equals(input.Name))
                ) && 
                (
                    this.BackgroundTexts == input.BackgroundTexts ||
                    (this.BackgroundTexts != null &&
                    this.BackgroundTexts.Equals(input.BackgroundTexts))
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
                if (this.Id != null)
                {
                    hashCode = (hashCode * 59) + this.Id.GetHashCode();
                }
                if (this.Name != null)
                {
                    hashCode = (hashCode * 59) + this.Name.GetHashCode();
                }
                if (this.BackgroundTexts != null)
                {
                    hashCode = (hashCode * 59) + this.BackgroundTexts.GetHashCode();
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
