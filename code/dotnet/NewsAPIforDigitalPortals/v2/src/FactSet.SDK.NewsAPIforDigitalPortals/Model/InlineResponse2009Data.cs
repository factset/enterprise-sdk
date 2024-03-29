/*
 * News API For Digital Portals
 *
 * Consume FactSet’s StreetAccount news and 3rd party content through an API that seamlessly integrates with [quotes](https://developer.factset.com/api-catalog/quotes-api-digital-portals), [time series](https://developer.factset.com/api-catalog/time-series-api-digital-portals), [watchlists](https://developer.factset.com/api-catalog/watchlist-api-digital-portals), and other Functional APIs.  Search for news articles from various news distributors and publishers. Incorporate a multitude of search parameters such as region, category, source, article type and provider-specific meta data, to easily filter out the noise.  All search and list endpoints can be subscribed to receive streamed updates.  News providers include:  * APA * AWP  * Businesswire * Cercle Finance * Direkt News SE * Dow Jones News * dpa * dpa-AFX  * EUWAX * GlobenewsWire * Kauppalehti * Midnight Trader * MoneyAM * newsaktuell * OMX * PR Newswire  * Ritzau Finans * StreetAccount News * TDN News        See the [Quotes API for Digital Portals](https://developer.factset.com/api-catalog/quotes-api-digital-portals) for access to detailed price and performance information, plus basic support for security identifier cross-reference. 
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
using OpenAPIDateConverter = FactSet.SDK.NewsAPIforDigitalPortals.Client.OpenAPIDateConverter;

namespace FactSet.SDK.NewsAPIforDigitalPortals.Model
{
    /// <summary>
    /// Details of the publisher.
    /// </summary>
    [DataContract(Name = "inline_response_200_9_data")]
    public partial class InlineResponse2009Data : IEquatable<InlineResponse2009Data>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="InlineResponse2009Data" /> class.
        /// </summary>
        /// <param name="name">Name of the publisher..</param>
        /// <param name="distributor">distributor.</param>
        public InlineResponse2009Data(string name = default(string), InlineResponse2009DataDistributor distributor = default(InlineResponse2009DataDistributor))
        {
            this.Name = name;
            this.Distributor = distributor;
        }

        /// <summary>
        /// Name of the publisher.
        /// </summary>
        /// <value>Name of the publisher.</value>
        [DataMember(Name = "name", EmitDefaultValue = true)]
        public string Name { get; set; }

        /// <summary>
        /// Gets or Sets Distributor
        /// </summary>
        [DataMember(Name = "distributor", EmitDefaultValue = false)]
        public InlineResponse2009DataDistributor Distributor { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class InlineResponse2009Data {\n");
            sb.Append("  Name: ").Append(Name).Append("\n");
            sb.Append("  Distributor: ").Append(Distributor).Append("\n");
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
            return this.Equals(input as InlineResponse2009Data);
        }

        /// <summary>
        /// Returns true if InlineResponse2009Data instances are equal
        /// </summary>
        /// <param name="input">Instance of InlineResponse2009Data to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(InlineResponse2009Data input)
        {
            if (input == null)
            {
                return false;
            }
            return 
                (
                    this.Name == input.Name ||
                    (this.Name != null &&
                    this.Name.Equals(input.Name))
                ) && 
                (
                    this.Distributor == input.Distributor ||
                    (this.Distributor != null &&
                    this.Distributor.Equals(input.Distributor))
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
                if (this.Name != null)
                {
                    hashCode = (hashCode * 59) + this.Name.GetHashCode();
                }
                if (this.Distributor != null)
                {
                    hashCode = (hashCode * 59) + this.Distributor.GetHashCode();
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
