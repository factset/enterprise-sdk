/*
 * Funds API For Digital Portals
 *
 * Search for mutual funds and ETFs using one single consolidated API, including a criteria-based screener. The API provides also base data, key figures, and holdings.  A separate endpoint returns the possible values and value range for the parameters that the endpoint /fund/notation/screener/search accepts: Application developers can request the values and value range only for a restricted set of notations that match predefined parameters. This functionality may be used to pre-fill the values and value ranges of the parameters of the /fund/notation/screener/search endpoint so that performing a search always leads to a non-empty set of notations.  This API is fully integrated with the corresponding Quotes API, allowing access to detailed price and performance information of instruments, as well as basic security identifier cross-reference. For direct access to price histories, please refer to the Time Series API for Digital Portals.  Similar criteria based screener APIs exist for equity instruments and securitized derivatives: See the Stocks API and the Securitized Derivatives API for details.
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
using OpenAPIDateConverter = FactSet.SDK.FundsAPIforDigitalPortals.Client.OpenAPIDateConverter;

namespace FactSet.SDK.FundsAPIforDigitalPortals.Model
{
    /// <summary>
    /// The meta member contains the meta information of the request.
    /// </summary>
    [DataContract(Name = "_fund_notation_screener_search_meta")]
    public partial class FundNotationScreenerSearchMeta : IEquatable<FundNotationScreenerSearchMeta>, IValidatableObject
    {
        /// <summary>
        /// Defines Sort
        /// </summary>
        [JsonConverter(typeof(StringEnumConverter))]
        public enum SortEnum
        {
            /// <summary>
            /// Enum CurrencyCode for value: currency.code
            /// </summary>
            [EnumMember(Value = "currency.code")]
            CurrencyCode = 1,

            /// <summary>
            /// Enum MINUS_CurrencyCode for value: -currency.code
            /// </summary>
            [EnumMember(Value = "-currency.code")]
            MINUS_CurrencyCode = 2,

            /// <summary>
            /// Enum InstrumentName for value: instrument.name
            /// </summary>
            [EnumMember(Value = "instrument.name")]
            InstrumentName = 3,

            /// <summary>
            /// Enum MINUS_InstrumentName for value: -instrument.name
            /// </summary>
            [EnumMember(Value = "-instrument.name")]
            MINUS_InstrumentName = 4,

            /// <summary>
            /// Enum InstrumentShortName for value: instrument.shortName
            /// </summary>
            [EnumMember(Value = "instrument.shortName")]
            InstrumentShortName = 5,

            /// <summary>
            /// Enum MINUS_InstrumentShortName for value: -instrument.shortName
            /// </summary>
            [EnumMember(Value = "-instrument.shortName")]
            MINUS_InstrumentShortName = 6,

            /// <summary>
            /// Enum FundEtf for value: fund.etf
            /// </summary>
            [EnumMember(Value = "fund.etf")]
            FundEtf = 7,

            /// <summary>
            /// Enum MINUS_FundEtf for value: -fund.etf
            /// </summary>
            [EnumMember(Value = "-fund.etf")]
            MINUS_FundEtf = 8,

            /// <summary>
            /// Enum FundCurrencyIsoCode for value: fund.currency.isoCode
            /// </summary>
            [EnumMember(Value = "fund.currency.isoCode")]
            FundCurrencyIsoCode = 9,

            /// <summary>
            /// Enum MINUS_FundCurrencyIsoCode for value: -fund.currency.isoCode
            /// </summary>
            [EnumMember(Value = "-fund.currency.isoCode")]
            MINUS_FundCurrencyIsoCode = 10,

            /// <summary>
            /// Enum FundDomicileName for value: fund.domicile.name
            /// </summary>
            [EnumMember(Value = "fund.domicile.name")]
            FundDomicileName = 11,

            /// <summary>
            /// Enum MINUS_FundDomicileName for value: -fund.domicile.name
            /// </summary>
            [EnumMember(Value = "-fund.domicile.name")]
            MINUS_FundDomicileName = 12,

            /// <summary>
            /// Enum FundHoldingTypeName for value: fund.holdingType.name
            /// </summary>
            [EnumMember(Value = "fund.holdingType.name")]
            FundHoldingTypeName = 13,

            /// <summary>
            /// Enum MINUS_FundHoldingTypeName for value: -fund.holdingType.name
            /// </summary>
            [EnumMember(Value = "-fund.holdingType.name")]
            MINUS_FundHoldingTypeName = 14,

            /// <summary>
            /// Enum FundCountryDevelopmentName for value: fund.countryDevelopment.name
            /// </summary>
            [EnumMember(Value = "fund.countryDevelopment.name")]
            FundCountryDevelopmentName = 15,

            /// <summary>
            /// Enum MINUS_FundCountryDevelopmentName for value: -fund.countryDevelopment.name
            /// </summary>
            [EnumMember(Value = "-fund.countryDevelopment.name")]
            MINUS_FundCountryDevelopmentName = 16,

            /// <summary>
            /// Enum FundRegionalExposureBroadName for value: fund.regionalExposure.broad.name
            /// </summary>
            [EnumMember(Value = "fund.regionalExposure.broad.name")]
            FundRegionalExposureBroadName = 17,

            /// <summary>
            /// Enum MINUS_FundRegionalExposureBroadName for value: -fund.regionalExposure.broad.name
            /// </summary>
            [EnumMember(Value = "-fund.regionalExposure.broad.name")]
            MINUS_FundRegionalExposureBroadName = 18,

            /// <summary>
            /// Enum FundRegionalExposureSpecificName for value: fund.regionalExposure.specific.name
            /// </summary>
            [EnumMember(Value = "fund.regionalExposure.specific.name")]
            FundRegionalExposureSpecificName = 19,

            /// <summary>
            /// Enum MINUS_FundRegionalExposureSpecificName for value: -fund.regionalExposure.specific.name
            /// </summary>
            [EnumMember(Value = "-fund.regionalExposure.specific.name")]
            MINUS_FundRegionalExposureSpecificName = 20,

            /// <summary>
            /// Enum FundStrategyLevel1Name for value: fund.strategy.level1.name
            /// </summary>
            [EnumMember(Value = "fund.strategy.level1.name")]
            FundStrategyLevel1Name = 21,

            /// <summary>
            /// Enum MINUS_FundStrategyLevel1Name for value: -fund.strategy.level1.name
            /// </summary>
            [EnumMember(Value = "-fund.strategy.level1.name")]
            MINUS_FundStrategyLevel1Name = 22,

            /// <summary>
            /// Enum FundStrategyLevel2Name for value: fund.strategy.level2.name
            /// </summary>
            [EnumMember(Value = "fund.strategy.level2.name")]
            FundStrategyLevel2Name = 23,

            /// <summary>
            /// Enum MINUS_FundStrategyLevel2Name for value: -fund.strategy.level2.name
            /// </summary>
            [EnumMember(Value = "-fund.strategy.level2.name")]
            MINUS_FundStrategyLevel2Name = 24,

            /// <summary>
            /// Enum FundStrategyLevel3Name for value: fund.strategy.level3.name
            /// </summary>
            [EnumMember(Value = "fund.strategy.level3.name")]
            FundStrategyLevel3Name = 25,

            /// <summary>
            /// Enum MINUS_FundStrategyLevel3Name for value: -fund.strategy.level3.name
            /// </summary>
            [EnumMember(Value = "-fund.strategy.level3.name")]
            MINUS_FundStrategyLevel3Name = 26,

            /// <summary>
            /// Enum FundIndustryName for value: fund.industry.name
            /// </summary>
            [EnumMember(Value = "fund.industry.name")]
            FundIndustryName = 27,

            /// <summary>
            /// Enum MINUS_FundIndustryName for value: -fund.industry.name
            /// </summary>
            [EnumMember(Value = "-fund.industry.name")]
            MINUS_FundIndustryName = 28,

            /// <summary>
            /// Enum FundSrriGrade for value: fund.srri.grade
            /// </summary>
            [EnumMember(Value = "fund.srri.grade")]
            FundSrriGrade = 29,

            /// <summary>
            /// Enum MINUS_FundSrriGrade for value: -fund.srri.grade
            /// </summary>
            [EnumMember(Value = "-fund.srri.grade")]
            MINUS_FundSrriGrade = 30,

            /// <summary>
            /// Enum FundIssuerName for value: fund.issuer.name
            /// </summary>
            [EnumMember(Value = "fund.issuer.name")]
            FundIssuerName = 31,

            /// <summary>
            /// Enum MINUS_FundIssuerName for value: -fund.issuer.name
            /// </summary>
            [EnumMember(Value = "-fund.issuer.name")]
            MINUS_FundIssuerName = 32,

            /// <summary>
            /// Enum FundIssuerCountryName for value: fund.issuer.country.name
            /// </summary>
            [EnumMember(Value = "fund.issuer.country.name")]
            FundIssuerCountryName = 33,

            /// <summary>
            /// Enum MINUS_FundIssuerCountryName for value: -fund.issuer.country.name
            /// </summary>
            [EnumMember(Value = "-fund.issuer.country.name")]
            MINUS_FundIssuerCountryName = 34,

            /// <summary>
            /// Enum FundAssetsUnderManagement for value: fund.assetsUnderManagement
            /// </summary>
            [EnumMember(Value = "fund.assetsUnderManagement")]
            FundAssetsUnderManagement = 35,

            /// <summary>
            /// Enum MINUS_FundAssetsUnderManagement for value: -fund.assetsUnderManagement
            /// </summary>
            [EnumMember(Value = "-fund.assetsUnderManagement")]
            MINUS_FundAssetsUnderManagement = 36,

            /// <summary>
            /// Enum ShareClassLifeCycleIssue for value: shareClass.lifeCycle.issue
            /// </summary>
            [EnumMember(Value = "shareClass.lifeCycle.issue")]
            ShareClassLifeCycleIssue = 37,

            /// <summary>
            /// Enum MINUS_ShareClassLifeCycleIssue for value: -shareClass.lifeCycle.issue
            /// </summary>
            [EnumMember(Value = "-shareClass.lifeCycle.issue")]
            MINUS_ShareClassLifeCycleIssue = 38,

            /// <summary>
            /// Enum ShareClassMinimumInvestmentInitial for value: shareClass.minimumInvestment.initial
            /// </summary>
            [EnumMember(Value = "shareClass.minimumInvestment.initial")]
            ShareClassMinimumInvestmentInitial = 39,

            /// <summary>
            /// Enum MINUS_ShareClassMinimumInvestmentInitial for value: -shareClass.minimumInvestment.initial
            /// </summary>
            [EnumMember(Value = "-shareClass.minimumInvestment.initial")]
            MINUS_ShareClassMinimumInvestmentInitial = 40,

            /// <summary>
            /// Enum ShareClassMinimumInvestmentSubsequent for value: shareClass.minimumInvestment.subsequent
            /// </summary>
            [EnumMember(Value = "shareClass.minimumInvestment.subsequent")]
            ShareClassMinimumInvestmentSubsequent = 41,

            /// <summary>
            /// Enum MINUS_ShareClassMinimumInvestmentSubsequent for value: -shareClass.minimumInvestment.subsequent
            /// </summary>
            [EnumMember(Value = "-shareClass.minimumInvestment.subsequent")]
            MINUS_ShareClassMinimumInvestmentSubsequent = 42,

            /// <summary>
            /// Enum ShareClassAssetsUnderManagement for value: shareClass.assetsUnderManagement
            /// </summary>
            [EnumMember(Value = "shareClass.assetsUnderManagement")]
            ShareClassAssetsUnderManagement = 43,

            /// <summary>
            /// Enum MINUS_ShareClassAssetsUnderManagement for value: -shareClass.assetsUnderManagement
            /// </summary>
            [EnumMember(Value = "-shareClass.assetsUnderManagement")]
            MINUS_ShareClassAssetsUnderManagement = 44,

            /// <summary>
            /// Enum ShareClassFeeOngoingCurrent for value: shareClass.fee.ongoing.current
            /// </summary>
            [EnumMember(Value = "shareClass.fee.ongoing.current")]
            ShareClassFeeOngoingCurrent = 45,

            /// <summary>
            /// Enum MINUS_ShareClassFeeOngoingCurrent for value: -shareClass.fee.ongoing.current
            /// </summary>
            [EnumMember(Value = "-shareClass.fee.ongoing.current")]
            MINUS_ShareClassFeeOngoingCurrent = 46,

            /// <summary>
            /// Enum ShareClassFeeAllInCurrent for value: shareClass.fee.allIn.current
            /// </summary>
            [EnumMember(Value = "shareClass.fee.allIn.current")]
            ShareClassFeeAllInCurrent = 47,

            /// <summary>
            /// Enum MINUS_ShareClassFeeAllInCurrent for value: -shareClass.fee.allIn.current
            /// </summary>
            [EnumMember(Value = "-shareClass.fee.allIn.current")]
            MINUS_ShareClassFeeAllInCurrent = 48,

            /// <summary>
            /// Enum ShareClassFeePerformanceCurrent for value: shareClass.fee.performance.current
            /// </summary>
            [EnumMember(Value = "shareClass.fee.performance.current")]
            ShareClassFeePerformanceCurrent = 49,

            /// <summary>
            /// Enum MINUS_ShareClassFeePerformanceCurrent for value: -shareClass.fee.performance.current
            /// </summary>
            [EnumMember(Value = "-shareClass.fee.performance.current")]
            MINUS_ShareClassFeePerformanceCurrent = 50,

            /// <summary>
            /// Enum ShareClassFeeManagementCurrent for value: shareClass.fee.management.current
            /// </summary>
            [EnumMember(Value = "shareClass.fee.management.current")]
            ShareClassFeeManagementCurrent = 51,

            /// <summary>
            /// Enum MINUS_ShareClassFeeManagementCurrent for value: -shareClass.fee.management.current
            /// </summary>
            [EnumMember(Value = "-shareClass.fee.management.current")]
            MINUS_ShareClassFeeManagementCurrent = 52,

            /// <summary>
            /// Enum ShareClassFeeInitialMinimum for value: shareClass.fee.initial.minimum
            /// </summary>
            [EnumMember(Value = "shareClass.fee.initial.minimum")]
            ShareClassFeeInitialMinimum = 53,

            /// <summary>
            /// Enum MINUS_ShareClassFeeInitialMinimum for value: -shareClass.fee.initial.minimum
            /// </summary>
            [EnumMember(Value = "-shareClass.fee.initial.minimum")]
            MINUS_ShareClassFeeInitialMinimum = 54,

            /// <summary>
            /// Enum ShareClassFeeInitialCurrent for value: shareClass.fee.initial.current
            /// </summary>
            [EnumMember(Value = "shareClass.fee.initial.current")]
            ShareClassFeeInitialCurrent = 55,

            /// <summary>
            /// Enum MINUS_ShareClassFeeInitialCurrent for value: -shareClass.fee.initial.current
            /// </summary>
            [EnumMember(Value = "-shareClass.fee.initial.current")]
            MINUS_ShareClassFeeInitialCurrent = 56,

            /// <summary>
            /// Enum ShareClassFeeInitialMaximum for value: shareClass.fee.initial.maximum
            /// </summary>
            [EnumMember(Value = "shareClass.fee.initial.maximum")]
            ShareClassFeeInitialMaximum = 57,

            /// <summary>
            /// Enum MINUS_ShareClassFeeInitialMaximum for value: -shareClass.fee.initial.maximum
            /// </summary>
            [EnumMember(Value = "-shareClass.fee.initial.maximum")]
            MINUS_ShareClassFeeInitialMaximum = 58,

            /// <summary>
            /// Enum ShareClassFeeDistributionMaximum for value: shareClass.fee.distribution.maximum
            /// </summary>
            [EnumMember(Value = "shareClass.fee.distribution.maximum")]
            ShareClassFeeDistributionMaximum = 59,

            /// <summary>
            /// Enum MINUS_ShareClassFeeDistributionMaximum for value: -shareClass.fee.distribution.maximum
            /// </summary>
            [EnumMember(Value = "-shareClass.fee.distribution.maximum")]
            MINUS_ShareClassFeeDistributionMaximum = 60,

            /// <summary>
            /// Enum ShareClassFeeHandlingMaximum for value: shareClass.fee.handling.maximum
            /// </summary>
            [EnumMember(Value = "shareClass.fee.handling.maximum")]
            ShareClassFeeHandlingMaximum = 61,

            /// <summary>
            /// Enum MINUS_ShareClassFeeHandlingMaximum for value: -shareClass.fee.handling.maximum
            /// </summary>
            [EnumMember(Value = "-shareClass.fee.handling.maximum")]
            MINUS_ShareClassFeeHandlingMaximum = 62,

            /// <summary>
            /// Enum ShareClassFeeRedemptionCurrent for value: shareClass.fee.redemption.current
            /// </summary>
            [EnumMember(Value = "shareClass.fee.redemption.current")]
            ShareClassFeeRedemptionCurrent = 63,

            /// <summary>
            /// Enum MINUS_ShareClassFeeRedemptionCurrent for value: -shareClass.fee.redemption.current
            /// </summary>
            [EnumMember(Value = "-shareClass.fee.redemption.current")]
            MINUS_ShareClassFeeRedemptionCurrent = 64,

            /// <summary>
            /// Enum ShareClassFeeRedemptionMaximum for value: shareClass.fee.redemption.maximum
            /// </summary>
            [EnumMember(Value = "shareClass.fee.redemption.maximum")]
            ShareClassFeeRedemptionMaximum = 65,

            /// <summary>
            /// Enum MINUS_ShareClassFeeRedemptionMaximum for value: -shareClass.fee.redemption.maximum
            /// </summary>
            [EnumMember(Value = "-shareClass.fee.redemption.maximum")]
            MINUS_ShareClassFeeRedemptionMaximum = 66,

            /// <summary>
            /// Enum ShareClassFeeCustodianBankCurrent for value: shareClass.fee.custodianBank.current
            /// </summary>
            [EnumMember(Value = "shareClass.fee.custodianBank.current")]
            ShareClassFeeCustodianBankCurrent = 67,

            /// <summary>
            /// Enum MINUS_ShareClassFeeCustodianBankCurrent for value: -shareClass.fee.custodianBank.current
            /// </summary>
            [EnumMember(Value = "-shareClass.fee.custodianBank.current")]
            MINUS_ShareClassFeeCustodianBankCurrent = 68,

            /// <summary>
            /// Enum ShareClassFee12bCurrent for value: shareClass.fee.12b.current
            /// </summary>
            [EnumMember(Value = "shareClass.fee.12b.current")]
            ShareClassFee12bCurrent = 69,

            /// <summary>
            /// Enum MINUS_ShareClassFee12bCurrent for value: -shareClass.fee.12b.current
            /// </summary>
            [EnumMember(Value = "-shareClass.fee.12b.current")]
            MINUS_ShareClassFee12bCurrent = 70,

            /// <summary>
            /// Enum ShareClassFeeSwitchingCurrent for value: shareClass.fee.switching.current
            /// </summary>
            [EnumMember(Value = "shareClass.fee.switching.current")]
            ShareClassFeeSwitchingCurrent = 71,

            /// <summary>
            /// Enum MINUS_ShareClassFeeSwitchingCurrent for value: -shareClass.fee.switching.current
            /// </summary>
            [EnumMember(Value = "-shareClass.fee.switching.current")]
            MINUS_ShareClassFeeSwitchingCurrent = 72,

            /// <summary>
            /// Enum PerformanceEndOfDayDay1 for value: performance.endOfDay.day1
            /// </summary>
            [EnumMember(Value = "performance.endOfDay.day1")]
            PerformanceEndOfDayDay1 = 73,

            /// <summary>
            /// Enum MINUS_PerformanceEndOfDayDay1 for value: -performance.endOfDay.day1
            /// </summary>
            [EnumMember(Value = "-performance.endOfDay.day1")]
            MINUS_PerformanceEndOfDayDay1 = 74,

            /// <summary>
            /// Enum PerformanceEndOfDayWeek1 for value: performance.endOfDay.week1
            /// </summary>
            [EnumMember(Value = "performance.endOfDay.week1")]
            PerformanceEndOfDayWeek1 = 75,

            /// <summary>
            /// Enum MINUS_PerformanceEndOfDayWeek1 for value: -performance.endOfDay.week1
            /// </summary>
            [EnumMember(Value = "-performance.endOfDay.week1")]
            MINUS_PerformanceEndOfDayWeek1 = 76,

            /// <summary>
            /// Enum PerformanceEndOfDayMonth1 for value: performance.endOfDay.month1
            /// </summary>
            [EnumMember(Value = "performance.endOfDay.month1")]
            PerformanceEndOfDayMonth1 = 77,

            /// <summary>
            /// Enum MINUS_PerformanceEndOfDayMonth1 for value: -performance.endOfDay.month1
            /// </summary>
            [EnumMember(Value = "-performance.endOfDay.month1")]
            MINUS_PerformanceEndOfDayMonth1 = 78,

            /// <summary>
            /// Enum PerformanceEndOfDayMonths3 for value: performance.endOfDay.months3
            /// </summary>
            [EnumMember(Value = "performance.endOfDay.months3")]
            PerformanceEndOfDayMonths3 = 79,

            /// <summary>
            /// Enum MINUS_PerformanceEndOfDayMonths3 for value: -performance.endOfDay.months3
            /// </summary>
            [EnumMember(Value = "-performance.endOfDay.months3")]
            MINUS_PerformanceEndOfDayMonths3 = 80,

            /// <summary>
            /// Enum PerformanceEndOfDayMonths6 for value: performance.endOfDay.months6
            /// </summary>
            [EnumMember(Value = "performance.endOfDay.months6")]
            PerformanceEndOfDayMonths6 = 81,

            /// <summary>
            /// Enum MINUS_PerformanceEndOfDayMonths6 for value: -performance.endOfDay.months6
            /// </summary>
            [EnumMember(Value = "-performance.endOfDay.months6")]
            MINUS_PerformanceEndOfDayMonths6 = 82,

            /// <summary>
            /// Enum PerformanceEndOfDayYear1 for value: performance.endOfDay.year1
            /// </summary>
            [EnumMember(Value = "performance.endOfDay.year1")]
            PerformanceEndOfDayYear1 = 83,

            /// <summary>
            /// Enum MINUS_PerformanceEndOfDayYear1 for value: -performance.endOfDay.year1
            /// </summary>
            [EnumMember(Value = "-performance.endOfDay.year1")]
            MINUS_PerformanceEndOfDayYear1 = 84,

            /// <summary>
            /// Enum PerformanceEndOfDayYears3 for value: performance.endOfDay.years3
            /// </summary>
            [EnumMember(Value = "performance.endOfDay.years3")]
            PerformanceEndOfDayYears3 = 85,

            /// <summary>
            /// Enum MINUS_PerformanceEndOfDayYears3 for value: -performance.endOfDay.years3
            /// </summary>
            [EnumMember(Value = "-performance.endOfDay.years3")]
            MINUS_PerformanceEndOfDayYears3 = 86,

            /// <summary>
            /// Enum PerformanceEndOfDayYears5 for value: performance.endOfDay.years5
            /// </summary>
            [EnumMember(Value = "performance.endOfDay.years5")]
            PerformanceEndOfDayYears5 = 87,

            /// <summary>
            /// Enum MINUS_PerformanceEndOfDayYears5 for value: -performance.endOfDay.years5
            /// </summary>
            [EnumMember(Value = "-performance.endOfDay.years5")]
            MINUS_PerformanceEndOfDayYears5 = 88,

            /// <summary>
            /// Enum PerformanceEndOfDayYearToDate for value: performance.endOfDay.yearToDate
            /// </summary>
            [EnumMember(Value = "performance.endOfDay.yearToDate")]
            PerformanceEndOfDayYearToDate = 89,

            /// <summary>
            /// Enum MINUS_PerformanceEndOfDayYearToDate for value: -performance.endOfDay.yearToDate
            /// </summary>
            [EnumMember(Value = "-performance.endOfDay.yearToDate")]
            MINUS_PerformanceEndOfDayYearToDate = 90

        }



        /// <summary>
        /// Sortable attributes. The sort order is ascending unless it is prefixed with a minus sign, in which case it is descending. A list of at most 10 (possibly prefixed) attribute name(s) is allowed.
        /// </summary>
        /// <value>Sortable attributes. The sort order is ascending unless it is prefixed with a minus sign, in which case it is descending. A list of at most 10 (possibly prefixed) attribute name(s) is allowed.</value>
        [DataMember(Name = "sort", EmitDefaultValue = false)]
        public List<SortEnum> Sort { get; set; }
        /// <summary>
        /// Initializes a new instance of the <see cref="FundNotationScreenerSearchMeta" /> class.
        /// </summary>
        /// <param name="attributes">Limit the attributes returned in the response to the specified set..</param>
        /// <param name="language">ISO 639-1 code of the language..</param>
        /// <param name="sort">Sortable attributes. The sort order is ascending unless it is prefixed with a minus sign, in which case it is descending. A list of at most 10 (possibly prefixed) attribute name(s) is allowed..</param>
        /// <param name="pagination">pagination.</param>
        public FundNotationScreenerSearchMeta(List<string> attributes = default(List<string>), string language = default(string), List<SortEnum> sort = default(List<SortEnum>), FundNotationScreenerSearchMetaPagination pagination = default(FundNotationScreenerSearchMetaPagination))
        {
            this.Attributes = attributes;
            this.Language = language;
            this.Sort = sort;
            this.Pagination = pagination;
        }

        /// <summary>
        /// Limit the attributes returned in the response to the specified set.
        /// </summary>
        /// <value>Limit the attributes returned in the response to the specified set.</value>
        [DataMember(Name = "attributes", EmitDefaultValue = false)]
        public List<string> Attributes { get; set; }

        /// <summary>
        /// ISO 639-1 code of the language.
        /// </summary>
        /// <value>ISO 639-1 code of the language.</value>
        [DataMember(Name = "language", EmitDefaultValue = false)]
        public string Language { get; set; }

        /// <summary>
        /// Gets or Sets Pagination
        /// </summary>
        [DataMember(Name = "pagination", EmitDefaultValue = false)]
        public FundNotationScreenerSearchMetaPagination Pagination { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class FundNotationScreenerSearchMeta {\n");
            sb.Append("  Attributes: ").Append(Attributes).Append("\n");
            sb.Append("  Language: ").Append(Language).Append("\n");
            sb.Append("  Sort: ").Append(Sort).Append("\n");
            sb.Append("  Pagination: ").Append(Pagination).Append("\n");
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
            return this.Equals(input as FundNotationScreenerSearchMeta);
        }

        /// <summary>
        /// Returns true if FundNotationScreenerSearchMeta instances are equal
        /// </summary>
        /// <param name="input">Instance of FundNotationScreenerSearchMeta to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(FundNotationScreenerSearchMeta input)
        {
            if (input == null)
            {
                return false;
            }
            return 
                (
                    this.Attributes == input.Attributes ||
                    this.Attributes != null &&
                    input.Attributes != null &&
                    this.Attributes.SequenceEqual(input.Attributes)
                ) && 
                (
                    this.Language == input.Language ||
                    (this.Language != null &&
                    this.Language.Equals(input.Language))
                ) && 
                (
                    this.Sort == input.Sort ||
                    this.Sort.SequenceEqual(input.Sort)
                ) && 
                (
                    this.Pagination == input.Pagination ||
                    (this.Pagination != null &&
                    this.Pagination.Equals(input.Pagination))
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
                if (this.Attributes != null)
                {
                    hashCode = (hashCode * 59) + this.Attributes.GetHashCode();
                }
                if (this.Language != null)
                {
                    hashCode = (hashCode * 59) + this.Language.GetHashCode();
                }
                hashCode = (hashCode * 59) + this.Sort.GetHashCode();
                if (this.Pagination != null)
                {
                    hashCode = (hashCode * 59) + this.Pagination.GetHashCode();
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
            // Language (string) maxLength
            if (this.Language != null && this.Language.Length > 2)
            {
                yield return new System.ComponentModel.DataAnnotations.ValidationResult("Invalid value for Language, length must be less than 2.", new [] { "Language" });
            }

            // Language (string) minLength
            if (this.Language != null && this.Language.Length < 2)
            {
                yield return new System.ComponentModel.DataAnnotations.ValidationResult("Invalid value for Language, length must be greater than 2.", new [] { "Language" });
            }

            yield break;
        }
    }

}
