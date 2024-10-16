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
    /// Controls the types of people returned based on high-level job functions. Filter by -    |function|description|   |- --|- --|   |PEOPLE|Retrieve **ALL** Executives of a requested company|   |OFFICER|Retrieve only the Officers of a requested company|   |DIRECTOR|Retrieve only the Directors of a requested company| 
    /// </summary>
    /// <value>Controls the types of people returned based on high-level job functions. Filter by -    |function|description|   |- --|- --|   |PEOPLE|Retrieve **ALL** Executives of a requested company|   |OFFICER|Retrieve only the Officers of a requested company|   |DIRECTOR|Retrieve only the Directors of a requested company| </value>
    [JsonConverter(typeof(StringEnumConverter))]
    public enum Function
    {
        /// <summary>
        /// Enum PEOPLE for value: PEOPLE
        /// </summary>
        [EnumMember(Value = "PEOPLE")]
        PEOPLE = 1,

        /// <summary>
        /// Enum OFFICER for value: OFFICER
        /// </summary>
        [EnumMember(Value = "OFFICER")]
        OFFICER = 2,

        /// <summary>
        /// Enum DIRECTOR for value: DIRECTOR
        /// </summary>
        [EnumMember(Value = "DIRECTOR")]
        DIRECTOR = 3

    }

}
