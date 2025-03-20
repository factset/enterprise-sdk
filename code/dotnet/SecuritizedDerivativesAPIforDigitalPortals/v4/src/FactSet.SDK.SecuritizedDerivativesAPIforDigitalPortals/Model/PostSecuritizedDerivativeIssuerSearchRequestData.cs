/*
 * Securitized Derivatives API For Digital Portals
 *
 * Search for securitized derivative instruments, using a criteria-based screener. The API provides also fundamental data, notation-based key figures, list of barrier types, and details regarding the underlyings, their respective barriers and related cash flows, coupon lists and derived basic interest rate information.  The screener is based on securitized derivatives-specific parameters. The result is limited to the notations that satisfy all the selected filters. If more than one notation of an instrument matches the parameters, and no market priority has been specified, only the notation with the highest trading volume, averaged over one month, is considered. All identifier types used as parameters must be valid and application must have permissions for them.  Available search criteria include:  * validation: filter for only active listings, by price quality and latest/previous available price dates * traded markets: filter and indicate a market priority for the validation * life cycle: important dates in and features of the life cycle of the securitized derivatives instruments * filter by issuer, country of registration of the securitized derivatives * underlying and related barriers, including level and distance, and resulting cash flows * coupon data: where applicable, occurrence and frequency of coupon payments, current interest rate range * performance and volatility * product-specific ask-based key figures (not all key figures are available for all product types):     * bonus yield, sideways yield, maximum yield based on the ask price     * agio, discount     * spread     * break even, outperformance point, parity     * delta, weekly theta, vega, implied volatility     * leverage, omega     * intrinsic value, time value         Since some underlyings, e.g. an index or a performance difference of a stock and an index (alpha structure), do not represent a directly tradable asset, they do not have a price in the classical sense. Therefore, the term *level* is used instead of *price*, e.g. underlying level instead of underlying price. The endpoint does not support the search for securitized derivatives with multiple underlyings, thus only securitized derivatives with a single underlying are returned in the result.  The search can be restricted to a specific set of products by using customer-specific instrument or notation lists. Such restriction lists are set up by FactSet upon request.  This API is fully integrated with the corresponding [Quotes API](https://developer.factset.com/api-catalog/quotes-api-digital-portals), allowing access to detailed price and performance information of instruments, as well as basic security identifier cross-reference. For direct access to price histories, please refer to the [Time Series API for Digital Portals](https://developer.factset.com/api-catalog/time-series-api-digital-portals).  Similar criteria based screener APIs exist for equity and fixed income instruments: See the [Stocks API](https://developer.factset.com/api-catalog/stocks-api-digital-portals) and the [Bonds API](https://developer.factset.com/api-catalog/bonds-api-digital-portals) for details.  
 *
 * The version of the OpenAPI document: 4.0.0
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
using OpenAPIDateConverter = FactSet.SDK.SecuritizedDerivativesAPIforDigitalPortals.Client.OpenAPIDateConverter;

namespace FactSet.SDK.SecuritizedDerivativesAPIforDigitalPortals.Model
{
    /// <summary>
    /// The data member contains the request&#39;s primary data.
    /// </summary>
    [DataContract(Name = "PostSecuritizedDerivativeIssuerSearchRequest_data")]
    public partial class PostSecuritizedDerivativeIssuerSearchRequestData : IEquatable<PostSecuritizedDerivativeIssuerSearchRequestData>, IValidatableObject
    {
        /// <summary>
        /// Specify whether legal entities in the role of an issuer or in the role of an issuer group are returned. | Value | Description | | - -- | - -- | | issuerGroup | Legal entities defined by FactSet and thus not representing an actual juristic person. | | issuer | Legal entities in the role of an issuer representing an actual juristic person. |  
        /// </summary>
        /// <value>Specify whether legal entities in the role of an issuer or in the role of an issuer group are returned. | Value | Description | | - -- | - -- | | issuerGroup | Legal entities defined by FactSet and thus not representing an actual juristic person. | | issuer | Legal entities in the role of an issuer representing an actual juristic person. |  </value>
        [JsonConverter(typeof(StringEnumConverter))]
        public enum RoleEnum
        {
            /// <summary>
            /// Enum IssuerGroup for value: issuerGroup
            /// </summary>
            [EnumMember(Value = "issuerGroup")]
            IssuerGroup = 1,

            /// <summary>
            /// Enum Issuer for value: issuer
            /// </summary>
            [EnumMember(Value = "issuer")]
            Issuer = 2

        }


        /// <summary>
        /// Specify whether legal entities in the role of an issuer or in the role of an issuer group are returned. | Value | Description | | - -- | - -- | | issuerGroup | Legal entities defined by FactSet and thus not representing an actual juristic person. | | issuer | Legal entities in the role of an issuer representing an actual juristic person. |  
        /// </summary>
        /// <value>Specify whether legal entities in the role of an issuer or in the role of an issuer group are returned. | Value | Description | | - -- | - -- | | issuerGroup | Legal entities defined by FactSet and thus not representing an actual juristic person. | | issuer | Legal entities in the role of an issuer representing an actual juristic person. |  </value>
        [DataMember(Name = "role", EmitDefaultValue = false)]
        public RoleEnum? Role { get; set; }
        /// <summary>
        /// Initializes a new instance of the <see cref="PostSecuritizedDerivativeIssuerSearchRequestData" /> class.
        /// </summary>
        [JsonConstructorAttribute]
        protected PostSecuritizedDerivativeIssuerSearchRequestData() { }
        /// <summary>
        /// Initializes a new instance of the <see cref="PostSecuritizedDerivativeIssuerSearchRequestData" /> class.
        /// </summary>
        /// <param name="role">Specify whether legal entities in the role of an issuer or in the role of an issuer group are returned. | Value | Description | | - -- | - -- | | issuerGroup | Legal entities defined by FactSet and thus not representing an actual juristic person. | | issuer | Legal entities in the role of an issuer representing an actual juristic person. |   (default to RoleEnum.IssuerGroup).</param>
        /// <param name="name">name (required).</param>
        /// <param name="withPriceEntitlement">If set to &#x60;true&#x60;, only issuers of securitized derivatives are considered for which there is at least one entitled notation. (default to true).</param>
        /// <param name="category">category.</param>
        /// <param name="underlying">underlying.</param>
        /// <param name="factorCertificates">factorCertificates.</param>
        /// <param name="registrationCountry">registrationCountry.</param>
        /// <param name="market">market.</param>
        public PostSecuritizedDerivativeIssuerSearchRequestData(PostSecuritizedDerivativeIssuerSearchRequestDataName name,RoleEnum? role = RoleEnum.IssuerGroup, bool withPriceEntitlement = true, PostSecuritizedDerivativeIssuerSearchRequestDataCategory category = default(PostSecuritizedDerivativeIssuerSearchRequestDataCategory), PostSecuritizedDerivativeIssuerSearchRequestDataUnderlying underlying = default(PostSecuritizedDerivativeIssuerSearchRequestDataUnderlying), PostSecuritizedDerivativeIssuerSearchRequestDataFactorCertificates factorCertificates = default(PostSecuritizedDerivativeIssuerSearchRequestDataFactorCertificates), PostSecuritizedDerivativeIssuerSearchRequestDataRegistrationCountry registrationCountry = default(PostSecuritizedDerivativeIssuerSearchRequestDataRegistrationCountry), PostSecuritizedDerivativeIssuerSearchRequestDataMarket market = default(PostSecuritizedDerivativeIssuerSearchRequestDataMarket))
        {
            // to ensure "name" is required (not null)
            if (name == null) {
                throw new ArgumentNullException("name is a required property for PostSecuritizedDerivativeIssuerSearchRequestData and cannot be null");
            }
            this.Name = name;
            this.Role = role;
            this.WithPriceEntitlement = withPriceEntitlement;
            this.Category = category;
            this.Underlying = underlying;
            this.FactorCertificates = factorCertificates;
            this.RegistrationCountry = registrationCountry;
            this.Market = market;
        }

        /// <summary>
        /// Gets or Sets Name
        /// </summary>
        [DataMember(Name = "name", IsRequired = true, EmitDefaultValue = false)]
        public PostSecuritizedDerivativeIssuerSearchRequestDataName Name { get; set; }

        /// <summary>
        /// If set to &#x60;true&#x60;, only issuers of securitized derivatives are considered for which there is at least one entitled notation.
        /// </summary>
        /// <value>If set to &#x60;true&#x60;, only issuers of securitized derivatives are considered for which there is at least one entitled notation.</value>
        [DataMember(Name = "withPriceEntitlement", EmitDefaultValue = true)]
        public bool WithPriceEntitlement { get; set; }

        /// <summary>
        /// Gets or Sets Category
        /// </summary>
        [DataMember(Name = "category", EmitDefaultValue = false)]
        public PostSecuritizedDerivativeIssuerSearchRequestDataCategory Category { get; set; }

        /// <summary>
        /// Gets or Sets Underlying
        /// </summary>
        [DataMember(Name = "underlying", EmitDefaultValue = false)]
        public PostSecuritizedDerivativeIssuerSearchRequestDataUnderlying Underlying { get; set; }

        /// <summary>
        /// Gets or Sets FactorCertificates
        /// </summary>
        [DataMember(Name = "factorCertificates", EmitDefaultValue = false)]
        public PostSecuritizedDerivativeIssuerSearchRequestDataFactorCertificates FactorCertificates { get; set; }

        /// <summary>
        /// Gets or Sets RegistrationCountry
        /// </summary>
        [DataMember(Name = "registrationCountry", EmitDefaultValue = false)]
        public PostSecuritizedDerivativeIssuerSearchRequestDataRegistrationCountry RegistrationCountry { get; set; }

        /// <summary>
        /// Gets or Sets Market
        /// </summary>
        [DataMember(Name = "market", EmitDefaultValue = false)]
        public PostSecuritizedDerivativeIssuerSearchRequestDataMarket Market { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class PostSecuritizedDerivativeIssuerSearchRequestData {\n");
            sb.Append("  Role: ").Append(Role).Append("\n");
            sb.Append("  Name: ").Append(Name).Append("\n");
            sb.Append("  WithPriceEntitlement: ").Append(WithPriceEntitlement).Append("\n");
            sb.Append("  Category: ").Append(Category).Append("\n");
            sb.Append("  Underlying: ").Append(Underlying).Append("\n");
            sb.Append("  FactorCertificates: ").Append(FactorCertificates).Append("\n");
            sb.Append("  RegistrationCountry: ").Append(RegistrationCountry).Append("\n");
            sb.Append("  Market: ").Append(Market).Append("\n");
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
            return this.Equals(input as PostSecuritizedDerivativeIssuerSearchRequestData);
        }

        /// <summary>
        /// Returns true if PostSecuritizedDerivativeIssuerSearchRequestData instances are equal
        /// </summary>
        /// <param name="input">Instance of PostSecuritizedDerivativeIssuerSearchRequestData to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(PostSecuritizedDerivativeIssuerSearchRequestData input)
        {
            if (input == null)
            {
                return false;
            }
            return 
                (
                    this.Role == input.Role ||
                    this.Role.Equals(input.Role)
                ) && 
                (
                    this.Name == input.Name ||
                    (this.Name != null &&
                    this.Name.Equals(input.Name))
                ) && 
                (
                    this.WithPriceEntitlement == input.WithPriceEntitlement ||
                    this.WithPriceEntitlement.Equals(input.WithPriceEntitlement)
                ) && 
                (
                    this.Category == input.Category ||
                    (this.Category != null &&
                    this.Category.Equals(input.Category))
                ) && 
                (
                    this.Underlying == input.Underlying ||
                    (this.Underlying != null &&
                    this.Underlying.Equals(input.Underlying))
                ) && 
                (
                    this.FactorCertificates == input.FactorCertificates ||
                    (this.FactorCertificates != null &&
                    this.FactorCertificates.Equals(input.FactorCertificates))
                ) && 
                (
                    this.RegistrationCountry == input.RegistrationCountry ||
                    (this.RegistrationCountry != null &&
                    this.RegistrationCountry.Equals(input.RegistrationCountry))
                ) && 
                (
                    this.Market == input.Market ||
                    (this.Market != null &&
                    this.Market.Equals(input.Market))
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
                hashCode = (hashCode * 59) + this.Role.GetHashCode();
                if (this.Name != null)
                {
                    hashCode = (hashCode * 59) + this.Name.GetHashCode();
                }
                hashCode = (hashCode * 59) + this.WithPriceEntitlement.GetHashCode();
                if (this.Category != null)
                {
                    hashCode = (hashCode * 59) + this.Category.GetHashCode();
                }
                if (this.Underlying != null)
                {
                    hashCode = (hashCode * 59) + this.Underlying.GetHashCode();
                }
                if (this.FactorCertificates != null)
                {
                    hashCode = (hashCode * 59) + this.FactorCertificates.GetHashCode();
                }
                if (this.RegistrationCountry != null)
                {
                    hashCode = (hashCode * 59) + this.RegistrationCountry.GetHashCode();
                }
                if (this.Market != null)
                {
                    hashCode = (hashCode * 59) + this.Market.GetHashCode();
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
