/*
 * FactSet Benchmarks API
 *
 * FactSet Benchmarks API gives access to Index Constituents, Prices, Returns, and Ratios. For a sample list of identifiers, use the /metrics endpoint. Equity Only - Fixed Income Benchmark support coming soon. 
 *
 * The version of the OpenAPI document: 1.8.0
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
using OpenAPIDateConverter = FactSet.SDK.FactSetBenchmarks.Client.OpenAPIDateConverter;

namespace FactSet.SDK.FactSetBenchmarks.Model
{
    /// <summary>
    /// Highest Level Filter to search by common Benchmark Families, such as S&amp;P, MSCI, or Russell. This will retrieve all related benchmark ids. For further filtering, use the response items such as the categoryDescription field. Leave blank if you wish to see a full sample list of ids. requested- * **CHINA &amp; HK INDICES** - Major Hong Kong and China Indices, such as Hang Seng Index (HSI-HKX) * **DOW JONES** - Dow Jones Global, Regions, Countries, Titans * **FACTSET MARKET INDICES** - Regional and Country Indices defined by FactSet * **FTSE** - FTSE Global, UK, Global All Cap, World, Xinhua, European, GWA, JSE, Multinationals, and Style indices * **GLOBAL INDICES** - A mix of major indices across the globe * **MSCI** - MSCI All Country, Asia Pacific, Thematic &amp; Strategy, Emerging, Developed, US * **RUSSELL** - US, Global, and Nomura * **S&amp;P** - US, ASX, Select Industry, BMI, Global, Thematic, Emerging, TSX * **STOXX** - Total Market, Europe, and Nordic * **TOPIX** - Topix Indices, such as TOPIX 500 (182301) * **MORNINGSTAR** - Global, Regional, Country, and Sector indicies 
    /// </summary>
    /// <value>Highest Level Filter to search by common Benchmark Families, such as S&amp;P, MSCI, or Russell. This will retrieve all related benchmark ids. For further filtering, use the response items such as the categoryDescription field. Leave blank if you wish to see a full sample list of ids. requested- * **CHINA &amp; HK INDICES** - Major Hong Kong and China Indices, such as Hang Seng Index (HSI-HKX) * **DOW JONES** - Dow Jones Global, Regions, Countries, Titans * **FACTSET MARKET INDICES** - Regional and Country Indices defined by FactSet * **FTSE** - FTSE Global, UK, Global All Cap, World, Xinhua, European, GWA, JSE, Multinationals, and Style indices * **GLOBAL INDICES** - A mix of major indices across the globe * **MSCI** - MSCI All Country, Asia Pacific, Thematic &amp; Strategy, Emerging, Developed, US * **RUSSELL** - US, Global, and Nomura * **S&amp;P** - US, ASX, Select Industry, BMI, Global, Thematic, Emerging, TSX * **STOXX** - Total Market, Europe, and Nordic * **TOPIX** - Topix Indices, such as TOPIX 500 (182301) * **MORNINGSTAR** - Global, Regional, Country, and Sector indicies </value>
    [JsonConverter(typeof(StringEnumConverter))]
    public enum FamilyFilter
    {
        /// <summary>
        /// Enum CHINAHKINDICES for value: CHINA_HK_INDICES
        /// </summary>
        [EnumMember(Value = "CHINA_HK_INDICES")]
        CHINAHKINDICES = 1,

        /// <summary>
        /// Enum DOWJONES for value: DOW_JONES
        /// </summary>
        [EnumMember(Value = "DOW_JONES")]
        DOWJONES = 2,

        /// <summary>
        /// Enum FACTSETMARKETINDICES for value: FACTSET_MARKET_INDICES
        /// </summary>
        [EnumMember(Value = "FACTSET_MARKET_INDICES")]
        FACTSETMARKETINDICES = 3,

        /// <summary>
        /// Enum FTSE for value: FTSE
        /// </summary>
        [EnumMember(Value = "FTSE")]
        FTSE = 4,

        /// <summary>
        /// Enum GLOBALINDICES for value: GLOBAL_INDICES
        /// </summary>
        [EnumMember(Value = "GLOBAL_INDICES")]
        GLOBALINDICES = 5,

        /// <summary>
        /// Enum MSCI for value: MSCI
        /// </summary>
        [EnumMember(Value = "MSCI")]
        MSCI = 6,

        /// <summary>
        /// Enum RUSSELL for value: RUSSELL
        /// </summary>
        [EnumMember(Value = "RUSSELL")]
        RUSSELL = 7,

        /// <summary>
        /// Enum SP for value: SP
        /// </summary>
        [EnumMember(Value = "SP")]
        SP = 8,

        /// <summary>
        /// Enum STOXX for value: STOXX
        /// </summary>
        [EnumMember(Value = "STOXX")]
        STOXX = 9,

        /// <summary>
        /// Enum TOPIX for value: TOPIX
        /// </summary>
        [EnumMember(Value = "TOPIX")]
        TOPIX = 10,

        /// <summary>
        /// Enum MORNINGSTAR for value: MORNINGSTAR
        /// </summary>
        [EnumMember(Value = "MORNINGSTAR")]
        MORNINGSTAR = 11

    }

}
