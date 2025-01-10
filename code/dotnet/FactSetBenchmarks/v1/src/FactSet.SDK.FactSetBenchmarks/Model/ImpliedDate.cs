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
    /// This parameter controls the **date** returned in the date field. The default value is **N**. By default, the date field returns the actual date of the observation. This means it will repeat values for weekends and holidays. If  set to **Y**, the date field will return the implied date of the observation, making all the dates unique.
    /// </summary>
    /// <value>This parameter controls the **date** returned in the date field. The default value is **N**. By default, the date field returns the actual date of the observation. This means it will repeat values for weekends and holidays. If  set to **Y**, the date field will return the implied date of the observation, making all the dates unique.</value>
    [JsonConverter(typeof(StringEnumConverter))]
    public enum ImpliedDate
    {
        /// <summary>
        /// Enum Y for value: Y
        /// </summary>
        [EnumMember(Value = "Y")]
        Y = 1,

        /// <summary>
        /// Enum N for value: N
        /// </summary>
        [EnumMember(Value = "N")]
        N = 2

    }

}
