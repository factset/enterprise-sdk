/*
 * Cabot Models API
 *
 * Cabot Models API
 *
 * The version of the OpenAPI document: 0.3.0
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
using OpenAPIDateConverter = FactSet.SDK.Cabot.Client.OpenAPIDateConverter;

namespace FactSet.SDK.Cabot.Model
{
    /// <summary>
    /// If set, the API will add holding-level details for all or only the selected analytic (if available for your portfolio).
    /// </summary>
    /// <value>If set, the API will add holding-level details for all or only the selected analytic (if available for your portfolio).</value>
    [JsonConverter(typeof(StringEnumConverter))]
    public enum AddTrimHoldings
    {
        /// <summary>
        /// Enum All for value: all
        /// </summary>
        [EnumMember(Value = "all")]
        All = 1,

        /// <summary>
        /// Enum AddDown for value: addDown
        /// </summary>
        [EnumMember(Value = "addDown")]
        AddDown = 2,

        /// <summary>
        /// Enum AddUp for value: addUp
        /// </summary>
        [EnumMember(Value = "addUp")]
        AddUp = 3,

        /// <summary>
        /// Enum TrimDown for value: trimDown
        /// </summary>
        [EnumMember(Value = "trimDown")]
        TrimDown = 4,

        /// <summary>
        /// Enum TrimUp for value: trimUp
        /// </summary>
        [EnumMember(Value = "trimUp")]
        TrimUp = 5

    }

}
