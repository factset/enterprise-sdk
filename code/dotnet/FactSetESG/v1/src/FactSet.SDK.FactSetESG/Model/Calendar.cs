/*
 * FactSet ESG API
 *
 * FactSet ESG (powered by FactSet Truvalue Labs) applies machine learning to uncover risks and opportunities from companies' Environmental, Social and Governance (ESG) behavior, which are aggregated and categorized into continuously updated, material ESG scores. The service focuses on company ESG behavior from external sources and includes both positive and negative events that go beyond traditional sources of ESG risk data.<p> FactSet ESG extracts, analyzes, and generates scores from millions of documents each month collected from more than 100,000 data sources in over 30 languages. Sources include news, trade journals, NGOs, watchdog groups, trade blogs, industry reports and social media. Products deliver investable insights by revealing value and risk factors from unstructured data at the speed of current events.</p> 
 *
 * The version of the OpenAPI document: 1.7.0
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
using OpenAPIDateConverter = FactSet.SDK.FactSetESG.Client.OpenAPIDateConverter;

namespace FactSet.SDK.FactSetESG.Model
{
    /// <summary>
    /// Calendar of data returned. SEVENDAY includes weekends. LOCAL calendar will default to the securities&#39; trading calendar which excludes date records for respective holiday periods.
    /// </summary>
    /// <value>Calendar of data returned. SEVENDAY includes weekends. LOCAL calendar will default to the securities&#39; trading calendar which excludes date records for respective holiday periods.</value>
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
        SEVENDAY = 2,

        /// <summary>
        /// Enum LOCAL for value: LOCAL
        /// </summary>
        [EnumMember(Value = "LOCAL")]
        LOCAL = 3

    }

}
