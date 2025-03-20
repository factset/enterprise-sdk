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
    /// Instrument data of the securitized derivative.
    /// </summary>
    [DataContract(Name = "inline_response_200_data")]
    public partial class InlineResponse200Data : IEquatable<InlineResponse200Data>, IValidatableObject
    {
        /// <summary>
        /// Settlement is the fulfillment of the issuer&#39;s contractual obligations arising from the securitized derivative. Depending on the terms, the underlying asset may be delivered physically or its equivalent monetary value may be payed out. | Value | Description | | - -- | - -- | | cash | Transfer of a cash amount. | | physical | Physical delivery of the underlying asset. | | either | Cash or physical, at the discretion of the issuer. |  
        /// </summary>
        /// <value>Settlement is the fulfillment of the issuer&#39;s contractual obligations arising from the securitized derivative. Depending on the terms, the underlying asset may be delivered physically or its equivalent monetary value may be payed out. | Value | Description | | - -- | - -- | | cash | Transfer of a cash amount. | | physical | Physical delivery of the underlying asset. | | either | Cash or physical, at the discretion of the issuer. |  </value>
        [JsonConverter(typeof(StringEnumConverter))]
        public enum SettlementEnum
        {
            /// <summary>
            /// Enum Cash for value: cash
            /// </summary>
            [EnumMember(Value = "cash")]
            Cash = 1,

            /// <summary>
            /// Enum Physical for value: physical
            /// </summary>
            [EnumMember(Value = "physical")]
            Physical = 2,

            /// <summary>
            /// Enum Either for value: either
            /// </summary>
            [EnumMember(Value = "either")]
            Either = 3

        }


        /// <summary>
        /// Settlement is the fulfillment of the issuer&#39;s contractual obligations arising from the securitized derivative. Depending on the terms, the underlying asset may be delivered physically or its equivalent monetary value may be payed out. | Value | Description | | - -- | - -- | | cash | Transfer of a cash amount. | | physical | Physical delivery of the underlying asset. | | either | Cash or physical, at the discretion of the issuer. |  
        /// </summary>
        /// <value>Settlement is the fulfillment of the issuer&#39;s contractual obligations arising from the securitized derivative. Depending on the terms, the underlying asset may be delivered physically or its equivalent monetary value may be payed out. | Value | Description | | - -- | - -- | | cash | Transfer of a cash amount. | | physical | Physical delivery of the underlying asset. | | either | Cash or physical, at the discretion of the issuer. |  </value>
        [DataMember(Name = "settlement", EmitDefaultValue = true)]
        public SettlementEnum? Settlement { get; set; }
        /// <summary>
        /// Initializes a new instance of the <see cref="InlineResponse200Data" /> class.
        /// </summary>
        /// <param name="isin">The International Securities Identification Number (ISIN) of the instrument. The ISIN is a 12-character code of digits and upper-case letters that uniquely identifies an instrument..</param>
        /// <param name="idInstrument">MDG identifier of the instrument..</param>
        /// <param name="sourceIdentifier">Identifier used in the request..</param>
        /// <param name="nsin">nsin.</param>
        /// <param name="isPrivatePlacement">If true, the instrument is part of a private placement and therefore not publicly traded..</param>
        /// <param name="name">Name of the instrument..</param>
        /// <param name="shortName">Short name of the instrument..</param>
        /// <param name="type">Instrument type as defined by FactSet Digital Solutions. Instrument types are arranged in a hierarchy, with the first level representing the most coarse granularity and further levels successively refining the granularity (see MDG category system 18). Please refer to endpoint &#x60;/category/get&#x60; for possible values..</param>
        /// <param name="isIncomplete">If true, the data supplier has marked the data for this instrument as incomplete..</param>
        /// <param name="lifeCycle">lifeCycle.</param>
        /// <param name="countrySecurityRegistration">List of countries where the instrument is registered. See endpoint &#x60;/basic/region/country/list&#x60; for possible values..</param>
        /// <param name="referenceDebtor">referenceDebtor.</param>
        /// <param name="isCollateralized">If true, this instrument is protected against an issuer default by collateral (e.g. COSI collateralization by SIX Swiss Exchange)..</param>
        /// <param name="isQuanto">If true, the risk of exchange rate fluctuations between the value unit of the underlying (all of them, in case of multiple underlyings) and the value unit of the redemption is hedged..</param>
        /// <param name="capitalProtection">Proportion of the nominal amount protected against loss, usually 100%..</param>
        /// <param name="hasCatchUp">If true, the instrument has a so-called \&quot;memory feature\&quot; (also called \&quot;catch up\&quot;). This means that a conditional payment that has not been paid out could be paid on a subsequent payment date if the condition is then satisfied..</param>
        /// <param name="hasAutomaticExercise">If true, the instrument will be automatically exercised at termination (such as maturity, premature call, or premature payout). It prevents such products from becoming worthless, meaning the investor does not have to undertake any steps in order to receive the payable amount..</param>
        /// <param name="orderVolume">orderVolume.</param>
        /// <param name="redemptionAmount">Actual redemption amount after expiry (e.g. knock out, maturity etc) for securitized derivatives with a so-called knock-out feature. The currency of the redemption amount is given by &#x60;issue.valueUnit&#x60; and is always a main currency for securitized derivatives with that feature. .</param>
        /// <param name="managementFee">Management fee paid annually by the investor to the issuer of the securitized derivative instrument..</param>
        /// <param name="nominal">nominal.</param>
        /// <param name="issuer">issuer.</param>
        /// <param name="issue">issue.</param>
        /// <param name="exercise">exercise.</param>
        /// <param name="settlement">Settlement is the fulfillment of the issuer&#39;s contractual obligations arising from the securitized derivative. Depending on the terms, the underlying asset may be delivered physically or its equivalent monetary value may be payed out. | Value | Description | | - -- | - -- | | cash | Transfer of a cash amount. | | physical | Physical delivery of the underlying asset. | | either | Cash or physical, at the discretion of the issuer. |  .</param>
        public InlineResponse200Data(string isin = default(string), string idInstrument = default(string), string sourceIdentifier = default(string), InlineResponse200DataNsin nsin = default(InlineResponse200DataNsin), bool? isPrivatePlacement = default(bool?), string name = default(string), string shortName = default(string), List<GetSecuritizedDerivativeGetDataTypeItems> type = default(List<GetSecuritizedDerivativeGetDataTypeItems>), bool? isIncomplete = default(bool?), InlineResponse200DataLifeCycle lifeCycle = default(InlineResponse200DataLifeCycle), List<GetSecuritizedDerivativeGetDataCountrySecurityRegistrationItems> countrySecurityRegistration = default(List<GetSecuritizedDerivativeGetDataCountrySecurityRegistrationItems>), InlineResponse200DataReferenceDebtor referenceDebtor = default(InlineResponse200DataReferenceDebtor), bool? isCollateralized = default(bool?), bool? isQuanto = default(bool?), decimal? capitalProtection = default(decimal?), bool? hasCatchUp = default(bool?), bool? hasAutomaticExercise = default(bool?), InlineResponse200DataOrderVolume orderVolume = default(InlineResponse200DataOrderVolume), decimal? redemptionAmount = default(decimal?), decimal? managementFee = default(decimal?), InlineResponse200DataNominal nominal = default(InlineResponse200DataNominal), InlineResponse200DataIssuer issuer = default(InlineResponse200DataIssuer), InlineResponse200DataIssue issue = default(InlineResponse200DataIssue), InlineResponse200DataExercise exercise = default(InlineResponse200DataExercise), SettlementEnum? settlement = default(SettlementEnum?))
        {
            this.Isin = isin;
            this.IdInstrument = idInstrument;
            this.SourceIdentifier = sourceIdentifier;
            this.Nsin = nsin;
            this.IsPrivatePlacement = isPrivatePlacement;
            this.Name = name;
            this.ShortName = shortName;
            this.Type = type;
            this.IsIncomplete = isIncomplete;
            this.LifeCycle = lifeCycle;
            this.CountrySecurityRegistration = countrySecurityRegistration;
            this.ReferenceDebtor = referenceDebtor;
            this.IsCollateralized = isCollateralized;
            this.IsQuanto = isQuanto;
            this.CapitalProtection = capitalProtection;
            this.HasCatchUp = hasCatchUp;
            this.HasAutomaticExercise = hasAutomaticExercise;
            this.OrderVolume = orderVolume;
            this.RedemptionAmount = redemptionAmount;
            this.ManagementFee = managementFee;
            this.Nominal = nominal;
            this.Issuer = issuer;
            this.Issue = issue;
            this.Exercise = exercise;
            this.Settlement = settlement;
        }

        /// <summary>
        /// The International Securities Identification Number (ISIN) of the instrument. The ISIN is a 12-character code of digits and upper-case letters that uniquely identifies an instrument.
        /// </summary>
        /// <value>The International Securities Identification Number (ISIN) of the instrument. The ISIN is a 12-character code of digits and upper-case letters that uniquely identifies an instrument.</value>
        [DataMember(Name = "isin", EmitDefaultValue = true)]
        public string Isin { get; set; }

        /// <summary>
        /// MDG identifier of the instrument.
        /// </summary>
        /// <value>MDG identifier of the instrument.</value>
        [DataMember(Name = "idInstrument", EmitDefaultValue = true)]
        public string IdInstrument { get; set; }

        /// <summary>
        /// Identifier used in the request.
        /// </summary>
        /// <value>Identifier used in the request.</value>
        [DataMember(Name = "sourceIdentifier", EmitDefaultValue = true)]
        public string SourceIdentifier { get; set; }

        /// <summary>
        /// Gets or Sets Nsin
        /// </summary>
        [DataMember(Name = "nsin", EmitDefaultValue = false)]
        public InlineResponse200DataNsin Nsin { get; set; }

        /// <summary>
        /// If true, the instrument is part of a private placement and therefore not publicly traded.
        /// </summary>
        /// <value>If true, the instrument is part of a private placement and therefore not publicly traded.</value>
        [DataMember(Name = "isPrivatePlacement", EmitDefaultValue = true)]
        public bool? IsPrivatePlacement { get; set; }

        /// <summary>
        /// Name of the instrument.
        /// </summary>
        /// <value>Name of the instrument.</value>
        [DataMember(Name = "name", EmitDefaultValue = true)]
        public string Name { get; set; }

        /// <summary>
        /// Short name of the instrument.
        /// </summary>
        /// <value>Short name of the instrument.</value>
        [DataMember(Name = "shortName", EmitDefaultValue = true)]
        public string ShortName { get; set; }

        /// <summary>
        /// Instrument type as defined by FactSet Digital Solutions. Instrument types are arranged in a hierarchy, with the first level representing the most coarse granularity and further levels successively refining the granularity (see MDG category system 18). Please refer to endpoint &#x60;/category/get&#x60; for possible values.
        /// </summary>
        /// <value>Instrument type as defined by FactSet Digital Solutions. Instrument types are arranged in a hierarchy, with the first level representing the most coarse granularity and further levels successively refining the granularity (see MDG category system 18). Please refer to endpoint &#x60;/category/get&#x60; for possible values.</value>
        [DataMember(Name = "type", EmitDefaultValue = false)]
        public List<GetSecuritizedDerivativeGetDataTypeItems> Type { get; set; }

        /// <summary>
        /// If true, the data supplier has marked the data for this instrument as incomplete.
        /// </summary>
        /// <value>If true, the data supplier has marked the data for this instrument as incomplete.</value>
        [DataMember(Name = "isIncomplete", EmitDefaultValue = true)]
        public bool? IsIncomplete { get; set; }

        /// <summary>
        /// Gets or Sets LifeCycle
        /// </summary>
        [DataMember(Name = "lifeCycle", EmitDefaultValue = false)]
        public InlineResponse200DataLifeCycle LifeCycle { get; set; }

        /// <summary>
        /// List of countries where the instrument is registered. See endpoint &#x60;/basic/region/country/list&#x60; for possible values.
        /// </summary>
        /// <value>List of countries where the instrument is registered. See endpoint &#x60;/basic/region/country/list&#x60; for possible values.</value>
        [DataMember(Name = "countrySecurityRegistration", EmitDefaultValue = false)]
        public List<GetSecuritizedDerivativeGetDataCountrySecurityRegistrationItems> CountrySecurityRegistration { get; set; }

        /// <summary>
        /// Gets or Sets ReferenceDebtor
        /// </summary>
        [DataMember(Name = "referenceDebtor", EmitDefaultValue = false)]
        public InlineResponse200DataReferenceDebtor ReferenceDebtor { get; set; }

        /// <summary>
        /// If true, this instrument is protected against an issuer default by collateral (e.g. COSI collateralization by SIX Swiss Exchange).
        /// </summary>
        /// <value>If true, this instrument is protected against an issuer default by collateral (e.g. COSI collateralization by SIX Swiss Exchange).</value>
        [DataMember(Name = "isCollateralized", EmitDefaultValue = true)]
        public bool? IsCollateralized { get; set; }

        /// <summary>
        /// If true, the risk of exchange rate fluctuations between the value unit of the underlying (all of them, in case of multiple underlyings) and the value unit of the redemption is hedged.
        /// </summary>
        /// <value>If true, the risk of exchange rate fluctuations between the value unit of the underlying (all of them, in case of multiple underlyings) and the value unit of the redemption is hedged.</value>
        [DataMember(Name = "isQuanto", EmitDefaultValue = true)]
        public bool? IsQuanto { get; set; }

        /// <summary>
        /// Proportion of the nominal amount protected against loss, usually 100%.
        /// </summary>
        /// <value>Proportion of the nominal amount protected against loss, usually 100%.</value>
        [DataMember(Name = "capitalProtection", EmitDefaultValue = true)]
        public decimal? CapitalProtection { get; set; }

        /// <summary>
        /// If true, the instrument has a so-called \&quot;memory feature\&quot; (also called \&quot;catch up\&quot;). This means that a conditional payment that has not been paid out could be paid on a subsequent payment date if the condition is then satisfied.
        /// </summary>
        /// <value>If true, the instrument has a so-called \&quot;memory feature\&quot; (also called \&quot;catch up\&quot;). This means that a conditional payment that has not been paid out could be paid on a subsequent payment date if the condition is then satisfied.</value>
        [DataMember(Name = "hasCatchUp", EmitDefaultValue = true)]
        public bool? HasCatchUp { get; set; }

        /// <summary>
        /// If true, the instrument will be automatically exercised at termination (such as maturity, premature call, or premature payout). It prevents such products from becoming worthless, meaning the investor does not have to undertake any steps in order to receive the payable amount.
        /// </summary>
        /// <value>If true, the instrument will be automatically exercised at termination (such as maturity, premature call, or premature payout). It prevents such products from becoming worthless, meaning the investor does not have to undertake any steps in order to receive the payable amount.</value>
        [DataMember(Name = "hasAutomaticExercise", EmitDefaultValue = true)]
        public bool? HasAutomaticExercise { get; set; }

        /// <summary>
        /// Gets or Sets OrderVolume
        /// </summary>
        [DataMember(Name = "orderVolume", EmitDefaultValue = false)]
        public InlineResponse200DataOrderVolume OrderVolume { get; set; }

        /// <summary>
        /// Actual redemption amount after expiry (e.g. knock out, maturity etc) for securitized derivatives with a so-called knock-out feature. The currency of the redemption amount is given by &#x60;issue.valueUnit&#x60; and is always a main currency for securitized derivatives with that feature. 
        /// </summary>
        /// <value>Actual redemption amount after expiry (e.g. knock out, maturity etc) for securitized derivatives with a so-called knock-out feature. The currency of the redemption amount is given by &#x60;issue.valueUnit&#x60; and is always a main currency for securitized derivatives with that feature. </value>
        [DataMember(Name = "redemptionAmount", EmitDefaultValue = true)]
        public decimal? RedemptionAmount { get; set; }

        /// <summary>
        /// Management fee paid annually by the investor to the issuer of the securitized derivative instrument.
        /// </summary>
        /// <value>Management fee paid annually by the investor to the issuer of the securitized derivative instrument.</value>
        [DataMember(Name = "managementFee", EmitDefaultValue = true)]
        public decimal? ManagementFee { get; set; }

        /// <summary>
        /// Gets or Sets Nominal
        /// </summary>
        [DataMember(Name = "nominal", EmitDefaultValue = false)]
        public InlineResponse200DataNominal Nominal { get; set; }

        /// <summary>
        /// Gets or Sets Issuer
        /// </summary>
        [DataMember(Name = "issuer", EmitDefaultValue = false)]
        public InlineResponse200DataIssuer Issuer { get; set; }

        /// <summary>
        /// Gets or Sets Issue
        /// </summary>
        [DataMember(Name = "issue", EmitDefaultValue = false)]
        public InlineResponse200DataIssue Issue { get; set; }

        /// <summary>
        /// Gets or Sets Exercise
        /// </summary>
        [DataMember(Name = "exercise", EmitDefaultValue = false)]
        public InlineResponse200DataExercise Exercise { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class InlineResponse200Data {\n");
            sb.Append("  Isin: ").Append(Isin).Append("\n");
            sb.Append("  IdInstrument: ").Append(IdInstrument).Append("\n");
            sb.Append("  SourceIdentifier: ").Append(SourceIdentifier).Append("\n");
            sb.Append("  Nsin: ").Append(Nsin).Append("\n");
            sb.Append("  IsPrivatePlacement: ").Append(IsPrivatePlacement).Append("\n");
            sb.Append("  Name: ").Append(Name).Append("\n");
            sb.Append("  ShortName: ").Append(ShortName).Append("\n");
            sb.Append("  Type: ").Append(Type).Append("\n");
            sb.Append("  IsIncomplete: ").Append(IsIncomplete).Append("\n");
            sb.Append("  LifeCycle: ").Append(LifeCycle).Append("\n");
            sb.Append("  CountrySecurityRegistration: ").Append(CountrySecurityRegistration).Append("\n");
            sb.Append("  ReferenceDebtor: ").Append(ReferenceDebtor).Append("\n");
            sb.Append("  IsCollateralized: ").Append(IsCollateralized).Append("\n");
            sb.Append("  IsQuanto: ").Append(IsQuanto).Append("\n");
            sb.Append("  CapitalProtection: ").Append(CapitalProtection).Append("\n");
            sb.Append("  HasCatchUp: ").Append(HasCatchUp).Append("\n");
            sb.Append("  HasAutomaticExercise: ").Append(HasAutomaticExercise).Append("\n");
            sb.Append("  OrderVolume: ").Append(OrderVolume).Append("\n");
            sb.Append("  RedemptionAmount: ").Append(RedemptionAmount).Append("\n");
            sb.Append("  ManagementFee: ").Append(ManagementFee).Append("\n");
            sb.Append("  Nominal: ").Append(Nominal).Append("\n");
            sb.Append("  Issuer: ").Append(Issuer).Append("\n");
            sb.Append("  Issue: ").Append(Issue).Append("\n");
            sb.Append("  Exercise: ").Append(Exercise).Append("\n");
            sb.Append("  Settlement: ").Append(Settlement).Append("\n");
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
            return this.Equals(input as InlineResponse200Data);
        }

        /// <summary>
        /// Returns true if InlineResponse200Data instances are equal
        /// </summary>
        /// <param name="input">Instance of InlineResponse200Data to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(InlineResponse200Data input)
        {
            if (input == null)
            {
                return false;
            }
            return 
                (
                    this.Isin == input.Isin ||
                    (this.Isin != null &&
                    this.Isin.Equals(input.Isin))
                ) && 
                (
                    this.IdInstrument == input.IdInstrument ||
                    (this.IdInstrument != null &&
                    this.IdInstrument.Equals(input.IdInstrument))
                ) && 
                (
                    this.SourceIdentifier == input.SourceIdentifier ||
                    (this.SourceIdentifier != null &&
                    this.SourceIdentifier.Equals(input.SourceIdentifier))
                ) && 
                (
                    this.Nsin == input.Nsin ||
                    (this.Nsin != null &&
                    this.Nsin.Equals(input.Nsin))
                ) && 
                (
                    this.IsPrivatePlacement == input.IsPrivatePlacement ||
                    (this.IsPrivatePlacement != null &&
                    this.IsPrivatePlacement.Equals(input.IsPrivatePlacement))
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
                    this.Type == input.Type ||
                    this.Type != null &&
                    input.Type != null &&
                    this.Type.SequenceEqual(input.Type)
                ) && 
                (
                    this.IsIncomplete == input.IsIncomplete ||
                    (this.IsIncomplete != null &&
                    this.IsIncomplete.Equals(input.IsIncomplete))
                ) && 
                (
                    this.LifeCycle == input.LifeCycle ||
                    (this.LifeCycle != null &&
                    this.LifeCycle.Equals(input.LifeCycle))
                ) && 
                (
                    this.CountrySecurityRegistration == input.CountrySecurityRegistration ||
                    this.CountrySecurityRegistration != null &&
                    input.CountrySecurityRegistration != null &&
                    this.CountrySecurityRegistration.SequenceEqual(input.CountrySecurityRegistration)
                ) && 
                (
                    this.ReferenceDebtor == input.ReferenceDebtor ||
                    (this.ReferenceDebtor != null &&
                    this.ReferenceDebtor.Equals(input.ReferenceDebtor))
                ) && 
                (
                    this.IsCollateralized == input.IsCollateralized ||
                    (this.IsCollateralized != null &&
                    this.IsCollateralized.Equals(input.IsCollateralized))
                ) && 
                (
                    this.IsQuanto == input.IsQuanto ||
                    (this.IsQuanto != null &&
                    this.IsQuanto.Equals(input.IsQuanto))
                ) && 
                (
                    this.CapitalProtection == input.CapitalProtection ||
                    (this.CapitalProtection != null &&
                    this.CapitalProtection.Equals(input.CapitalProtection))
                ) && 
                (
                    this.HasCatchUp == input.HasCatchUp ||
                    (this.HasCatchUp != null &&
                    this.HasCatchUp.Equals(input.HasCatchUp))
                ) && 
                (
                    this.HasAutomaticExercise == input.HasAutomaticExercise ||
                    (this.HasAutomaticExercise != null &&
                    this.HasAutomaticExercise.Equals(input.HasAutomaticExercise))
                ) && 
                (
                    this.OrderVolume == input.OrderVolume ||
                    (this.OrderVolume != null &&
                    this.OrderVolume.Equals(input.OrderVolume))
                ) && 
                (
                    this.RedemptionAmount == input.RedemptionAmount ||
                    (this.RedemptionAmount != null &&
                    this.RedemptionAmount.Equals(input.RedemptionAmount))
                ) && 
                (
                    this.ManagementFee == input.ManagementFee ||
                    (this.ManagementFee != null &&
                    this.ManagementFee.Equals(input.ManagementFee))
                ) && 
                (
                    this.Nominal == input.Nominal ||
                    (this.Nominal != null &&
                    this.Nominal.Equals(input.Nominal))
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
                    this.Exercise == input.Exercise ||
                    (this.Exercise != null &&
                    this.Exercise.Equals(input.Exercise))
                ) && 
                (
                    this.Settlement == input.Settlement ||
                    this.Settlement.Equals(input.Settlement)
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
                if (this.Isin != null)
                {
                    hashCode = (hashCode * 59) + this.Isin.GetHashCode();
                }
                if (this.IdInstrument != null)
                {
                    hashCode = (hashCode * 59) + this.IdInstrument.GetHashCode();
                }
                if (this.SourceIdentifier != null)
                {
                    hashCode = (hashCode * 59) + this.SourceIdentifier.GetHashCode();
                }
                if (this.Nsin != null)
                {
                    hashCode = (hashCode * 59) + this.Nsin.GetHashCode();
                }
                if (this.IsPrivatePlacement != null)
                {
                    hashCode = (hashCode * 59) + this.IsPrivatePlacement.GetHashCode();
                }
                if (this.Name != null)
                {
                    hashCode = (hashCode * 59) + this.Name.GetHashCode();
                }
                if (this.ShortName != null)
                {
                    hashCode = (hashCode * 59) + this.ShortName.GetHashCode();
                }
                if (this.Type != null)
                {
                    hashCode = (hashCode * 59) + this.Type.GetHashCode();
                }
                if (this.IsIncomplete != null)
                {
                    hashCode = (hashCode * 59) + this.IsIncomplete.GetHashCode();
                }
                if (this.LifeCycle != null)
                {
                    hashCode = (hashCode * 59) + this.LifeCycle.GetHashCode();
                }
                if (this.CountrySecurityRegistration != null)
                {
                    hashCode = (hashCode * 59) + this.CountrySecurityRegistration.GetHashCode();
                }
                if (this.ReferenceDebtor != null)
                {
                    hashCode = (hashCode * 59) + this.ReferenceDebtor.GetHashCode();
                }
                if (this.IsCollateralized != null)
                {
                    hashCode = (hashCode * 59) + this.IsCollateralized.GetHashCode();
                }
                if (this.IsQuanto != null)
                {
                    hashCode = (hashCode * 59) + this.IsQuanto.GetHashCode();
                }
                if (this.CapitalProtection != null)
                {
                    hashCode = (hashCode * 59) + this.CapitalProtection.GetHashCode();
                }
                if (this.HasCatchUp != null)
                {
                    hashCode = (hashCode * 59) + this.HasCatchUp.GetHashCode();
                }
                if (this.HasAutomaticExercise != null)
                {
                    hashCode = (hashCode * 59) + this.HasAutomaticExercise.GetHashCode();
                }
                if (this.OrderVolume != null)
                {
                    hashCode = (hashCode * 59) + this.OrderVolume.GetHashCode();
                }
                if (this.RedemptionAmount != null)
                {
                    hashCode = (hashCode * 59) + this.RedemptionAmount.GetHashCode();
                }
                if (this.ManagementFee != null)
                {
                    hashCode = (hashCode * 59) + this.ManagementFee.GetHashCode();
                }
                if (this.Nominal != null)
                {
                    hashCode = (hashCode * 59) + this.Nominal.GetHashCode();
                }
                if (this.Issuer != null)
                {
                    hashCode = (hashCode * 59) + this.Issuer.GetHashCode();
                }
                if (this.Issue != null)
                {
                    hashCode = (hashCode * 59) + this.Issue.GetHashCode();
                }
                if (this.Exercise != null)
                {
                    hashCode = (hashCode * 59) + this.Exercise.GetHashCode();
                }
                hashCode = (hashCode * 59) + this.Settlement.GetHashCode();
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
