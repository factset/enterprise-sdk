/*
 * Foreign Exchange Rates API
 *
 * Foreign Exchange Rates API in which retrieves Spots and Forwards for a given currency pair and date range. <p>*Spots and Forwards rates are sourced from W/M Reuters.The WM Company calculates daily standardized spot rates for global foreign exchange transactions, using rates provided by Reuters. These rates are recognized globally as the standard by banks, fund managers, and index compilers; increasingly these rates are also being used for benchmark currency trading. In 1994, WM Company began calculating closing spot rates. Closing spot rates provide a standard set of currency rates so that portfolio valuations can be compared to each other and their performances measured against benchmarks, without having discrepancies caused by exchange rates. Closing spot rates are recorded at 16:00 GMT.*</p> 
 *
 * The version of the OpenAPI document: 1.0.0
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
using OpenAPIDateConverter = FactSet.SDK.ForeignExchangeRate.Client.OpenAPIDateConverter;

namespace FactSet.SDK.ForeignExchangeRate.Model
{
    /// <summary>
    /// Controls the display frequency of the data returned.   * **D** &#x3D; Daily   * **W** &#x3D; Weekly, based on the last day of the week of the start date.   * **M** &#x3D; Monthly, based on the last trading day of the month.   * **AM** &#x3D; Monthly, based on the start date (e.g., if the start date is June 16, data is displayed for June 16, May 16, April 16 etc.).    * **CQ** &#x3D; Quarterly based on the last trading day of the calendar quarter (March, June, September, or December).   * **AY** &#x3D; Actual Annual, based on the start date.   * **CY** &#x3D; Calendar Annual, based on the last trading day of the calendar year. 
    /// </summary>
    /// <value>Controls the display frequency of the data returned.   * **D** &#x3D; Daily   * **W** &#x3D; Weekly, based on the last day of the week of the start date.   * **M** &#x3D; Monthly, based on the last trading day of the month.   * **AM** &#x3D; Monthly, based on the start date (e.g., if the start date is June 16, data is displayed for June 16, May 16, April 16 etc.).    * **CQ** &#x3D; Quarterly based on the last trading day of the calendar quarter (March, June, September, or December).   * **AY** &#x3D; Actual Annual, based on the start date.   * **CY** &#x3D; Calendar Annual, based on the last trading day of the calendar year. </value>
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
        CY = 7

    }

}
