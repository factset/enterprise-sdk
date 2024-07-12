/*
 * Cabot Models API
 *
 * Cabot Models API
 *
 * The version of the OpenAPI document: 0.1.0
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
    /// All currently available regions.
    /// </summary>
    /// <value>All currently available regions.</value>
    [JsonConverter(typeof(StringEnumConverter))]
    public enum Regions
    {
        /// <summary>
        /// Enum Africa for value: africa
        /// </summary>
        [EnumMember(Value = "africa")]
        Africa = 1,

        /// <summary>
        /// Enum CentralAsia for value: centralAsia
        /// </summary>
        [EnumMember(Value = "centralAsia")]
        CentralAsia = 2,

        /// <summary>
        /// Enum EasternEurope for value: easternEurope
        /// </summary>
        [EnumMember(Value = "easternEurope")]
        EasternEurope = 3,

        /// <summary>
        /// Enum MiddleEast for value: middleEast
        /// </summary>
        [EnumMember(Value = "middleEast")]
        MiddleEast = 4,

        /// <summary>
        /// Enum NorthAmerica for value: northAmerica
        /// </summary>
        [EnumMember(Value = "northAmerica")]
        NorthAmerica = 5,

        /// <summary>
        /// Enum PacificRim for value: pacificRim
        /// </summary>
        [EnumMember(Value = "pacificRim")]
        PacificRim = 6,

        /// <summary>
        /// Enum SouthAmerica for value: southAmerica
        /// </summary>
        [EnumMember(Value = "southAmerica")]
        SouthAmerica = 7,

        /// <summary>
        /// Enum WesternEurope for value: westernEurope
        /// </summary>
        [EnumMember(Value = "westernEurope")]
        WesternEurope = 8

    }

}
