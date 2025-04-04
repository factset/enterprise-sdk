/*
 * FactSet Quant Factor Library API
 *
 * The FactSet FactSet Quant Factor Library (QFL) API helps to detect investment themes across global equity markets, incorporate ideas into your portfolio construction process, and transform raw data into actionable intelligence. Over 2000+ items spanning Factor Groups in-   * Classification and Reference Data - Asset Data, Country, Industry, and Size   * Market - Liquidity, Market Sensitivity, Momentum, Technical, Volatility   * Core Fundamentals - Efficiency, Growth, Management, Profitability, Quality, Solvency, Value   * Macro and Cross Asset - Commodity, FX Sensitivity, Debt, Economic   * Alternative - Analyst Sentiment, Corporate Governance, Crowding, Insider Activity. 
 *
 * The version of the OpenAPI document: 1.0.2
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
using OpenAPIDateConverter = FactSet.SDK.FactSetQuantFactorLibrary.Client.OpenAPIDateConverter;

namespace FactSet.SDK.FactSetQuantFactorLibrary.Model
{
    /// <summary>
    /// Controls the display frequency of the data returned.   * **D** &#x3D; Daily   * **W** &#x3D; Weekly, based on the last day of the week of the start date.   * **M** &#x3D; Monthly, based on the last trading day of the month.   * **AM** &#x3D; Monthly, based on the start date (e.g., if the start date is June 16, data is displayed for June 16, May 16, April 16 etc.).   * **CQ** &#x3D; Quarterly based on the last trading day of the calendar quarter (March, June, September, or December).   * **AY** &#x3D; Actual Annual, based on the start date.   * **CY** &#x3D; Calendar Annual, based on the last trading day of the calendar year. 
    /// </summary>
    /// <value>Controls the display frequency of the data returned.   * **D** &#x3D; Daily   * **W** &#x3D; Weekly, based on the last day of the week of the start date.   * **M** &#x3D; Monthly, based on the last trading day of the month.   * **AM** &#x3D; Monthly, based on the start date (e.g., if the start date is June 16, data is displayed for June 16, May 16, April 16 etc.).   * **CQ** &#x3D; Quarterly based on the last trading day of the calendar quarter (March, June, September, or December).   * **AY** &#x3D; Actual Annual, based on the start date.   * **CY** &#x3D; Calendar Annual, based on the last trading day of the calendar year. </value>
    [JsonConverter(typeof(StringEnumConverter))]
    public enum Frequency
    {
        /// <summary>
        /// Enum D for value: D
        /// </summary>
        [EnumMember(Value = "D")]
        D = 1,

        /// <summary>
        /// Enum W for value: W
        /// </summary>
        [EnumMember(Value = "W")]
        W = 2,

        /// <summary>
        /// Enum M for value: M
        /// </summary>
        [EnumMember(Value = "M")]
        M = 3,

        /// <summary>
        /// Enum AM for value: AM
        /// </summary>
        [EnumMember(Value = "AM")]
        AM = 4,

        /// <summary>
        /// Enum CQ for value: CQ
        /// </summary>
        [EnumMember(Value = "CQ")]
        CQ = 5,

        /// <summary>
        /// Enum AY for value: AY
        /// </summary>
        [EnumMember(Value = "AY")]
        AY = 6,

        /// <summary>
        /// Enum CY for value: CY
        /// </summary>
        [EnumMember(Value = "CY")]
        CY = 7,

        /// <summary>
        /// Enum Empty for value: 
        /// </summary>
        [EnumMember(Value = "")]
        Empty = 8

    }

}
