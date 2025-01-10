/*
 * FactSet Benchmarks API
 *
 * FactSet Benchmarks API gives access to Index Constituents, Prices, Returns, and Ratios. For a sample list of identifiers, use the /metrics endpoint. Equity Only - Fixed Income Benchmark support coming soon. 
 *
 * The version of the OpenAPI document: 1.9.0
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
    /// Calendar of data returned. SEVENDAY includes weekends.
    /// </summary>
    /// <value>Calendar of data returned. SEVENDAY includes weekends.</value>
    [JsonConverter(typeof(StringEnumConverter))]
    public enum Calendar
    {
        /// <summary>
        /// Enum FIVEDAY for value: FIVEDAY
        /// </summary>
        [EnumMember(Value = "FIVEDAY")]
        FIVEDAY = 1,

        /// <summary>
        /// Enum SEVENDAY for value: SEVENDAY
        /// </summary>
        [EnumMember(Value = "SEVENDAY")]
        SEVENDAY = 2

    }

}
