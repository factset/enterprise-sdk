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
    /// Controls the display frequency of the data returned.   * **MTD** &#x3D; Month-To-Date   * **M** &#x3D; Monthly, based on the last trading day of the month.   * **CQTD** &#x3D; Calendar Quarter-to-Date   * **CQ** &#x3D; Calendar Quarterly   * **CYTD** &#x3D; Calendar Year-to-Date   * **CY** &#x3D; Calendar Yearly 
    /// </summary>
    /// <value>Controls the display frequency of the data returned.   * **MTD** &#x3D; Month-To-Date   * **M** &#x3D; Monthly, based on the last trading day of the month.   * **CQTD** &#x3D; Calendar Quarter-to-Date   * **CQ** &#x3D; Calendar Quarterly   * **CYTD** &#x3D; Calendar Year-to-Date   * **CY** &#x3D; Calendar Yearly </value>
    [JsonConverter(typeof(StringEnumConverter))]
    public enum FrequencyAum
    {
        /// <summary>
        /// Enum MTD for value: MTD
        /// </summary>
        [EnumMember(Value = "MTD")]
        MTD = 1,

        /// <summary>
        /// Enum M for value: M
        /// </summary>
        [EnumMember(Value = "M")]
        M = 2,

        /// <summary>
        /// Enum CQTD for value: CQTD
        /// </summary>
        [EnumMember(Value = "CQTD")]
        CQTD = 3,

        /// <summary>
        /// Enum CQ for value: CQ
        /// </summary>
        [EnumMember(Value = "CQ")]
        CQ = 4,

        /// <summary>
        /// Enum CYTD for value: CYTD
        /// </summary>
        [EnumMember(Value = "CYTD")]
        CYTD = 5,

        /// <summary>
        /// Enum CY for value: CY
        /// </summary>
        [EnumMember(Value = "CY")]
        CY = 6

    }

}
