/*
 * IRN API v1
 *
 * Allows users to extract, create, update and configure IRN data.
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
using OpenAPIDateConverter = FactSet.SDK.IRNCustomSymbols.Client.OpenAPIDateConverter;

namespace FactSet.SDK.IRNCustomSymbols.Model
{
    /// <summary>
    /// Defines SymbolsRelationshipType
    /// </summary>
    [JsonConverter(typeof(StringEnumConverter))]
    public enum SymbolsRelationshipType
    {
        /// <summary>
        /// Enum PARENTCHILD for value: PARENTCHILD
        /// </summary>
        [EnumMember(Value = "PARENTCHILD")]
        PARENTCHILD = 1,

        /// <summary>
        /// Enum PEER for value: PEER
        /// </summary>
        [EnumMember(Value = "PEER")]
        PEER = 2

    }

}
