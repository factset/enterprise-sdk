/*
 * FactSet People API
 *
 * The FactSet People API exposes FactSet data for individuals and their jobs.<p>This API is rate-limited to 10 requests per second and 10 concurrent requests per user.</p> 
 *
 * The version of the OpenAPI document: 1.3.0
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
using OpenAPIDateConverter = FactSet.SDK.FactSetPeople.Client.OpenAPIDateConverter;

namespace FactSet.SDK.FactSetPeople.Model
{
    /// <summary>
    /// Select only Jobs of a certain type board member or employee.
    /// </summary>
    /// <value>Select only Jobs of a certain type board member or employee.</value>
    [JsonConverter(typeof(StringEnumConverter))]
    public enum Type
    {
        /// <summary>
        /// Enum ALL for value: ALL
        /// </summary>
        [EnumMember(Value = "ALL")]
        ALL = 1,

        /// <summary>
        /// Enum BRD for value: BRD
        /// </summary>
        [EnumMember(Value = "BRD")]
        BRD = 2,

        /// <summary>
        /// Enum EMP for value: EMP
        /// </summary>
        [EnumMember(Value = "EMP")]
        EMP = 3

    }

}
