/*
 * FactSet Funds API
 *
 * FactSet Mutual Funds data offers over 50 fund- and share class-specific data points for mutual funds listed in the United States. <p>FactSet Mutual Funds Reference provides fund-specific reference information as well as FactSet's proprietary classification system. It includes but is not limited to the following coverage    * Fund descriptions    * A seven-tier classification system   * Leverage information   * Fees and expenses    * Portfolio managers       FactSet Mutual Funds Time Series provides quantitative data items on a historical basis. It includes but is not limited to the following coverage    * Net asset value   * Fund flows    * Assets under management   * Total return  <p>This API is rate-limited to 10 requests per second and 10 concurrent requests per user.</p> 
 *
 * The version of the OpenAPI document: 1.1.0
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
using OpenAPIDateConverter = FactSet.SDK.FactSetFunds.Client.OpenAPIDateConverter;

namespace FactSet.SDK.FactSetFunds.Model
{
    /// <summary>
    /// Controls the dividend inclusion for the NAV returns calculations, where -  * DIV &#x3D; Include Dividends, Total Return * NO_DIV &#x3D; Exclude Dividends, Simple Return 
    /// </summary>
    /// <value>Controls the dividend inclusion for the NAV returns calculations, where -  * DIV &#x3D; Include Dividends, Total Return * NO_DIV &#x3D; Exclude Dividends, Simple Return </value>
    [JsonConverter(typeof(StringEnumConverter))]
    public enum DividendAdjust
    {
        /// <summary>
        /// Enum DIV for value: DIV
        /// </summary>
        [EnumMember(Value = "DIV")]
        DIV = 1,

        /// <summary>
        /// Enum NODIV for value: NO_DIV
        /// </summary>
        [EnumMember(Value = "NO_DIV")]
        NODIV = 2

    }

}
