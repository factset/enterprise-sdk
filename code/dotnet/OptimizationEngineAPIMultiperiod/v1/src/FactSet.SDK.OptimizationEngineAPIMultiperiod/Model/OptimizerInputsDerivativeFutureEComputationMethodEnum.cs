/*
 * fpo_mp_input
 *
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: 1
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
using OpenAPIDateConverter = FactSet.SDK.OptimizationEngineAPIMultiperiod.Client.OpenAPIDateConverter;

namespace FactSet.SDK.OptimizationEngineAPIMultiperiod.Model
{
    /// <summary>
    /// 0 - eCost  1 - eTotalCost  2 - eMarkToMarket 
    /// </summary>
    /// <value>0 - eCost  1 - eTotalCost  2 - eMarkToMarket </value>
    [JsonConverter(typeof(StringEnumConverter))]
    public enum OptimizerInputsDerivativeFutureEComputationMethodEnum
    {
        /// <summary>
        /// Enum _0 for value: 0
        /// </summary>
        [EnumMember(Value = "0")]
        _0 = 1,

        /// <summary>
        /// Enum _1 for value: 1
        /// </summary>
        [EnumMember(Value = "1")]
        _1 = 2,

        /// <summary>
        /// Enum _2 for value: 2
        /// </summary>
        [EnumMember(Value = "2")]
        _2 = 3

    }

}