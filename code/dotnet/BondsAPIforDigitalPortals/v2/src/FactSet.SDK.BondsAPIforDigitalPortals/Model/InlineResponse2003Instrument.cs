/*
 * Bonds API For Digital Portals
 *
 * Search for fixed income instruments, using a criteria-based screener. The API provides also fundamental data and key figures, basic interest rate information and derived coupon lists.  Available search criteria include:  * validation: filter for only active listings, by price quality and latest/previous available price dates * traded markets: filter and indicate a market priority for the validation * important dates in and features of the life cycle of the fixed income instruments * filter by issuer, its country of registration and the issued volume * coupon data: occurrence and frequency of coupon payments, current interest rate range * yield and yield to maturity range, spread * Macaulay duration * sensitivity ranges: base point value, modified duration, elasticity, convexity * cash flow for all transactions over a certain time range: sum or average * country-specific attributes: for Germany: is eligible for trustees        The key figures are calculated using delayed prices with an additional delay of 10 minutes after an update of the debt instrument's price. Special product features such as the right to a maturity extension, an attached option, or convertibility are not considered for the key figure calculation. Further, a calculation is not performed for perpetual products and for products with variable interest rate.  This API is fully integrated with the corresponding Quotes API, allowing access to detailed price and performance information of instruments, as well as basic security identifier cross-reference. For direct access to price histories, please refer to the Time Series API for Digital Portals.  Similar criteria based screener APIs exist for equity instruments and securitized derivatives: See the Stocks API and the Securitized Derivatives API for details.
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
using OpenAPIDateConverter = FactSet.SDK.BondsAPIforDigitalPortals.Client.OpenAPIDateConverter;

namespace FactSet.SDK.BondsAPIforDigitalPortals.Model
{
    /// <summary>
    /// Instrument data of the notation.
    /// </summary>
    [DataContract(Name = "inline_response_200_3_instrument")]
    public partial class InlineResponse2003Instrument : IEquatable<InlineResponse2003Instrument>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="InlineResponse2003Instrument" /> class.
        /// </summary>
        /// <param name="id">Identifier of the instrument..</param>
        /// <param name="name">Name of the instrument..</param>
        /// <param name="shortName">Short name of the instrument..</param>
        /// <param name="isin">The International Securities Identification Number (ISIN) of the instrument. The ISIN is a 12-character code of digits and upper-case letters that uniquely identifies an instrument..</param>
        /// <param name="nsin">nsin.</param>
        /// <param name="fsym">fsym.</param>
        /// <param name="categorization">categorization.</param>
        /// <param name="lifeCycle">lifeCycle.</param>
        /// <param name="subordinated">If &#x60;true&#x60;, the debt instrument is subordinated..</param>
        /// <param name="ratingSystem1">ratingSystem1.</param>
        /// <param name="ratingSystem2">ratingSystem2.</param>
        /// <param name="issuer">issuer.</param>
        /// <param name="issue">issue.</param>
        /// <param name="tradingVolume">tradingVolume.</param>
        /// <param name="compliance">compliance.</param>
        /// <param name="coupon">coupon.</param>
        public InlineResponse2003Instrument(string id = default(string), string name = default(string), string shortName = default(string), string isin = default(string), InlineResponse2003InstrumentNsin nsin = default(InlineResponse2003InstrumentNsin), InlineResponse2003InstrumentFsym fsym = default(InlineResponse2003InstrumentFsym), InlineResponse2003InstrumentCategorization categorization = default(InlineResponse2003InstrumentCategorization), InlineResponse2003InstrumentLifeCycle lifeCycle = default(InlineResponse2003InstrumentLifeCycle), bool subordinated = default(bool), InlineResponse2003InstrumentRatingSystem1 ratingSystem1 = default(InlineResponse2003InstrumentRatingSystem1), InlineResponse2003InstrumentRatingSystem2 ratingSystem2 = default(InlineResponse2003InstrumentRatingSystem2), InlineResponse2003InstrumentIssuer issuer = default(InlineResponse2003InstrumentIssuer), InlineResponse2003InstrumentIssue issue = default(InlineResponse2003InstrumentIssue), InlineResponse2003InstrumentTradingVolume tradingVolume = default(InlineResponse2003InstrumentTradingVolume), InlineResponse2003InstrumentCompliance compliance = default(InlineResponse2003InstrumentCompliance), InlineResponse2003InstrumentCoupon coupon = default(InlineResponse2003InstrumentCoupon))
        {
            this.Id = id;
            this.Name = name;
            this.ShortName = shortName;
            this.Isin = isin;
            this.Nsin = nsin;
            this.Fsym = fsym;
            this.Categorization = categorization;
            this.LifeCycle = lifeCycle;
            this.Subordinated = subordinated;
            this.RatingSystem1 = ratingSystem1;
            this.RatingSystem2 = ratingSystem2;
            this.Issuer = issuer;
            this.Issue = issue;
            this.TradingVolume = tradingVolume;
            this.Compliance = compliance;
            this.Coupon = coupon;
        }

        /// <summary>
        /// Identifier of the instrument.
        /// </summary>
        /// <value>Identifier of the instrument.</value>
        [DataMember(Name = "id", EmitDefaultValue = false)]
        public string Id { get; set; }

        /// <summary>
        /// Name of the instrument.
        /// </summary>
        /// <value>Name of the instrument.</value>
        [DataMember(Name = "name", EmitDefaultValue = false)]
        public string Name { get; set; }

        /// <summary>
        /// Short name of the instrument.
        /// </summary>
        /// <value>Short name of the instrument.</value>
        [DataMember(Name = "shortName", EmitDefaultValue = false)]
        public string ShortName { get; set; }

        /// <summary>
        /// The International Securities Identification Number (ISIN) of the instrument. The ISIN is a 12-character code of digits and upper-case letters that uniquely identifies an instrument.
        /// </summary>
        /// <value>The International Securities Identification Number (ISIN) of the instrument. The ISIN is a 12-character code of digits and upper-case letters that uniquely identifies an instrument.</value>
        [DataMember(Name = "isin", EmitDefaultValue = false)]
        public string Isin { get; set; }

        /// <summary>
        /// Gets or Sets Nsin
        /// </summary>
        [DataMember(Name = "nsin", EmitDefaultValue = false)]
        public InlineResponse2003InstrumentNsin Nsin { get; set; }

        /// <summary>
        /// Gets or Sets Fsym
        /// </summary>
        [DataMember(Name = "fsym", EmitDefaultValue = false)]
        public InlineResponse2003InstrumentFsym Fsym { get; set; }

        /// <summary>
        /// Gets or Sets Categorization
        /// </summary>
        [DataMember(Name = "categorization", EmitDefaultValue = false)]
        public InlineResponse2003InstrumentCategorization Categorization { get; set; }

        /// <summary>
        /// Gets or Sets LifeCycle
        /// </summary>
        [DataMember(Name = "lifeCycle", EmitDefaultValue = false)]
        public InlineResponse2003InstrumentLifeCycle LifeCycle { get; set; }

        /// <summary>
        /// If &#x60;true&#x60;, the debt instrument is subordinated.
        /// </summary>
        /// <value>If &#x60;true&#x60;, the debt instrument is subordinated.</value>
        [DataMember(Name = "subordinated", EmitDefaultValue = true)]
        public bool Subordinated { get; set; }

        /// <summary>
        /// Gets or Sets RatingSystem1
        /// </summary>
        [DataMember(Name = "ratingSystem1", EmitDefaultValue = false)]
        public InlineResponse2003InstrumentRatingSystem1 RatingSystem1 { get; set; }

        /// <summary>
        /// Gets or Sets RatingSystem2
        /// </summary>
        [DataMember(Name = "ratingSystem2", EmitDefaultValue = false)]
        public InlineResponse2003InstrumentRatingSystem2 RatingSystem2 { get; set; }

        /// <summary>
        /// Gets or Sets Issuer
        /// </summary>
        [DataMember(Name = "issuer", EmitDefaultValue = false)]
        public InlineResponse2003InstrumentIssuer Issuer { get; set; }

        /// <summary>
        /// Gets or Sets Issue
        /// </summary>
        [DataMember(Name = "issue", EmitDefaultValue = false)]
        public InlineResponse2003InstrumentIssue Issue { get; set; }

        /// <summary>
        /// Gets or Sets TradingVolume
        /// </summary>
        [DataMember(Name = "tradingVolume", EmitDefaultValue = false)]
        public InlineResponse2003InstrumentTradingVolume TradingVolume { get; set; }

        /// <summary>
        /// Gets or Sets Compliance
        /// </summary>
        [DataMember(Name = "compliance", EmitDefaultValue = false)]
        public InlineResponse2003InstrumentCompliance Compliance { get; set; }

        /// <summary>
        /// Gets or Sets Coupon
        /// </summary>
        [DataMember(Name = "coupon", EmitDefaultValue = false)]
        public InlineResponse2003InstrumentCoupon Coupon { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class InlineResponse2003Instrument {\n");
            sb.Append("  Id: ").Append(Id).Append("\n");
            sb.Append("  Name: ").Append(Name).Append("\n");
            sb.Append("  ShortName: ").Append(ShortName).Append("\n");
            sb.Append("  Isin: ").Append(Isin).Append("\n");
            sb.Append("  Nsin: ").Append(Nsin).Append("\n");
            sb.Append("  Fsym: ").Append(Fsym).Append("\n");
            sb.Append("  Categorization: ").Append(Categorization).Append("\n");
            sb.Append("  LifeCycle: ").Append(LifeCycle).Append("\n");
            sb.Append("  Subordinated: ").Append(Subordinated).Append("\n");
            sb.Append("  RatingSystem1: ").Append(RatingSystem1).Append("\n");
            sb.Append("  RatingSystem2: ").Append(RatingSystem2).Append("\n");
            sb.Append("  Issuer: ").Append(Issuer).Append("\n");
            sb.Append("  Issue: ").Append(Issue).Append("\n");
            sb.Append("  TradingVolume: ").Append(TradingVolume).Append("\n");
            sb.Append("  Compliance: ").Append(Compliance).Append("\n");
            sb.Append("  Coupon: ").Append(Coupon).Append("\n");
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
            return this.Equals(input as InlineResponse2003Instrument);
        }

        /// <summary>
        /// Returns true if InlineResponse2003Instrument instances are equal
        /// </summary>
        /// <param name="input">Instance of InlineResponse2003Instrument to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(InlineResponse2003Instrument input)
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
                    this.ShortName == input.ShortName ||
                    (this.ShortName != null &&
                    this.ShortName.Equals(input.ShortName))
                ) && 
                (
                    this.Isin == input.Isin ||
                    (this.Isin != null &&
                    this.Isin.Equals(input.Isin))
                ) && 
                (
                    this.Nsin == input.Nsin ||
                    (this.Nsin != null &&
                    this.Nsin.Equals(input.Nsin))
                ) && 
                (
                    this.Fsym == input.Fsym ||
                    (this.Fsym != null &&
                    this.Fsym.Equals(input.Fsym))
                ) && 
                (
                    this.Categorization == input.Categorization ||
                    (this.Categorization != null &&
                    this.Categorization.Equals(input.Categorization))
                ) && 
                (
                    this.LifeCycle == input.LifeCycle ||
                    (this.LifeCycle != null &&
                    this.LifeCycle.Equals(input.LifeCycle))
                ) && 
                (
                    this.Subordinated == input.Subordinated ||
                    this.Subordinated.Equals(input.Subordinated)
                ) && 
                (
                    this.RatingSystem1 == input.RatingSystem1 ||
                    (this.RatingSystem1 != null &&
                    this.RatingSystem1.Equals(input.RatingSystem1))
                ) && 
                (
                    this.RatingSystem2 == input.RatingSystem2 ||
                    (this.RatingSystem2 != null &&
                    this.RatingSystem2.Equals(input.RatingSystem2))
                ) && 
                (
                    this.Issuer == input.Issuer ||
                    (this.Issuer != null &&
                    this.Issuer.Equals(input.Issuer))
                ) && 
                (
                    this.Issue == input.Issue ||
                    (this.Issue != null &&
                    this.Issue.Equals(input.Issue))
                ) && 
                (
                    this.TradingVolume == input.TradingVolume ||
                    (this.TradingVolume != null &&
                    this.TradingVolume.Equals(input.TradingVolume))
                ) && 
                (
                    this.Compliance == input.Compliance ||
                    (this.Compliance != null &&
                    this.Compliance.Equals(input.Compliance))
                ) && 
                (
                    this.Coupon == input.Coupon ||
                    (this.Coupon != null &&
                    this.Coupon.Equals(input.Coupon))
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
                if (this.ShortName != null)
                {
                    hashCode = (hashCode * 59) + this.ShortName.GetHashCode();
                }
                if (this.Isin != null)
                {
                    hashCode = (hashCode * 59) + this.Isin.GetHashCode();
                }
                if (this.Nsin != null)
                {
                    hashCode = (hashCode * 59) + this.Nsin.GetHashCode();
                }
                if (this.Fsym != null)
                {
                    hashCode = (hashCode * 59) + this.Fsym.GetHashCode();
                }
                if (this.Categorization != null)
                {
                    hashCode = (hashCode * 59) + this.Categorization.GetHashCode();
                }
                if (this.LifeCycle != null)
                {
                    hashCode = (hashCode * 59) + this.LifeCycle.GetHashCode();
                }
                hashCode = (hashCode * 59) + this.Subordinated.GetHashCode();
                if (this.RatingSystem1 != null)
                {
                    hashCode = (hashCode * 59) + this.RatingSystem1.GetHashCode();
                }
                if (this.RatingSystem2 != null)
                {
                    hashCode = (hashCode * 59) + this.RatingSystem2.GetHashCode();
                }
                if (this.Issuer != null)
                {
                    hashCode = (hashCode * 59) + this.Issuer.GetHashCode();
                }
                if (this.Issue != null)
                {
                    hashCode = (hashCode * 59) + this.Issue.GetHashCode();
                }
                if (this.TradingVolume != null)
                {
                    hashCode = (hashCode * 59) + this.TradingVolume.GetHashCode();
                }
                if (this.Compliance != null)
                {
                    hashCode = (hashCode * 59) + this.Compliance.GetHashCode();
                }
                if (this.Coupon != null)
                {
                    hashCode = (hashCode * 59) + this.Coupon.GetHashCode();
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
