/*
 * FactSet Global Prices API
 *
 * The FactSet Global Prices API provides end of day market pricing content using cloud and microservices technology, encompassing both pricing as well as corporate actions and events data.</p> 
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
using OpenAPIDateConverter = FactSet.SDK.FactSetGlobalPrices.Client.OpenAPIDateConverter;

namespace FactSet.SDK.FactSetGlobalPrices.Model
{
    /// <summary>
    /// Controls the dividend reinvestment for the returns calculation.   * **PRICE** &#x3D; Price Change - Dividends Excluded.   * **EXDATE** &#x3D; Simple Return - Dividends Received on exdate but not reinvested.   * **PAYDATE** &#x3D; Simple Return - Dividends Received on paydate but not reinvested.   * **EXDATE_C** &#x3D; Compound Return - Dividends reinvested on exdate.   * **PAYDATE_C** &#x3D; Compound Return - Dividends reinvested on paydate. 
    /// </summary>
    /// <value>Controls the dividend reinvestment for the returns calculation.   * **PRICE** &#x3D; Price Change - Dividends Excluded.   * **EXDATE** &#x3D; Simple Return - Dividends Received on exdate but not reinvested.   * **PAYDATE** &#x3D; Simple Return - Dividends Received on paydate but not reinvested.   * **EXDATE_C** &#x3D; Compound Return - Dividends reinvested on exdate.   * **PAYDATE_C** &#x3D; Compound Return - Dividends reinvested on paydate. </value>
    [JsonConverter(typeof(StringEnumConverter))]
    public enum DividendAdjust
    {
        /// <summary>
        /// Enum PRICE for value: PRICE
        /// </summary>
        [EnumMember(Value = "PRICE")]
        PRICE = 1,

        /// <summary>
        /// Enum EXDATE for value: EXDATE
        /// </summary>
        [EnumMember(Value = "EXDATE")]
        EXDATE = 2,

        /// <summary>
        /// Enum PAYDATE for value: PAYDATE
        /// </summary>
        [EnumMember(Value = "PAYDATE")]
        PAYDATE = 3,

        /// <summary>
        /// Enum EXDATEC for value: EXDATE_C
        /// </summary>
        [EnumMember(Value = "EXDATE_C")]
        EXDATEC = 4,

        /// <summary>
        /// Enum PAYDATEC for value: PAYDATE_C
        /// </summary>
        [EnumMember(Value = "PAYDATE_C")]
        PAYDATEC = 5

    }

}
