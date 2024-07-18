/*
 * FactSet Fundamentals API
 *
 * Gain access to current, comprehensive, and comparative information on securities in worldwide developed and emerging markets. Composed of annual and interim/quarterly data, detailed historical financial statement content, per-share data, and calculated ratios, FactSet Fundamentals provides you with the information you need for a global investment perspective.<p>This API is rate-limited to 10 requests per second and 10 concurrent requests per user.</p> 
 *
 * The version of the OpenAPI document: 2.2.0
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
using OpenAPIDateConverter = FactSet.SDK.FactSetFundamentals.Client.OpenAPIDateConverter;

namespace FactSet.SDK.FactSetFundamentals.Model
{
    /// <summary>
    /// Periodicity or frequency of the fiscal periods, where   * **ANN** &#x3D; Annual Original,   * **ANN_R** &#x3D; Annual Latest - *Includes Restatements*,   * **QTR** &#x3D; Quarterly,   * **QTR_R** &#x3D; Quarterly Latest - *Includes Restatements*,   * **SEMI** &#x3D; Semi-Annual,   * **SEMI_R** &#x3D; Semi-Annual Latest - *Includes Restatements*,   * **LTM** &#x3D; Last Twelve Months,   * **LTM_R** &#x3D; Last Twelve Months Latest - *Includes Restatements*,   * **LTM_SEMI** &#x3D; Last Twelve Months - Semi-Annually Reported Data,   * **LTMSG** &#x3D; Last Twelve Months Global [OA17959](https://my.apps.factset.com/oa/pages/17959) and   * **YTD** &#x3D; Year-to-date &lt;br&gt;&lt;br&gt; Please note that the coverage for SEMI_R and LTM_R may be limited as fewer companies report with these periodicities. 
    /// </summary>
    /// <value>Periodicity or frequency of the fiscal periods, where   * **ANN** &#x3D; Annual Original,   * **ANN_R** &#x3D; Annual Latest - *Includes Restatements*,   * **QTR** &#x3D; Quarterly,   * **QTR_R** &#x3D; Quarterly Latest - *Includes Restatements*,   * **SEMI** &#x3D; Semi-Annual,   * **SEMI_R** &#x3D; Semi-Annual Latest - *Includes Restatements*,   * **LTM** &#x3D; Last Twelve Months,   * **LTM_R** &#x3D; Last Twelve Months Latest - *Includes Restatements*,   * **LTM_SEMI** &#x3D; Last Twelve Months - Semi-Annually Reported Data,   * **LTMSG** &#x3D; Last Twelve Months Global [OA17959](https://my.apps.factset.com/oa/pages/17959) and   * **YTD** &#x3D; Year-to-date &lt;br&gt;&lt;br&gt; Please note that the coverage for SEMI_R and LTM_R may be limited as fewer companies report with these periodicities. </value>
    [JsonConverter(typeof(StringEnumConverter))]
    public enum Periodicity
    {
        /// <summary>
        /// Enum ANN for value: ANN
        /// </summary>
        [EnumMember(Value = "ANN")]
        ANN = 1,

        /// <summary>
        /// Enum ANNR for value: ANN_R
        /// </summary>
        [EnumMember(Value = "ANN_R")]
        ANNR = 2,

        /// <summary>
        /// Enum QTR for value: QTR
        /// </summary>
        [EnumMember(Value = "QTR")]
        QTR = 3,

        /// <summary>
        /// Enum QTRR for value: QTR_R
        /// </summary>
        [EnumMember(Value = "QTR_R")]
        QTRR = 4,

        /// <summary>
        /// Enum SEMI for value: SEMI
        /// </summary>
        [EnumMember(Value = "SEMI")]
        SEMI = 5,

        /// <summary>
        /// Enum SEMIR for value: SEMI_R
        /// </summary>
        [EnumMember(Value = "SEMI_R")]
        SEMIR = 6,

        /// <summary>
        /// Enum LTM for value: LTM
        /// </summary>
        [EnumMember(Value = "LTM")]
        LTM = 7,

        /// <summary>
        /// Enum LTMR for value: LTM_R
        /// </summary>
        [EnumMember(Value = "LTM_R")]
        LTMR = 8,

        /// <summary>
        /// Enum LTMSG for value: LTMSG
        /// </summary>
        [EnumMember(Value = "LTMSG")]
        LTMSG = 9,

        /// <summary>
        /// Enum LTMSEMI for value: LTM_SEMI
        /// </summary>
        [EnumMember(Value = "LTM_SEMI")]
        LTMSEMI = 10,

        /// <summary>
        /// Enum YTD for value: YTD
        /// </summary>
        [EnumMember(Value = "YTD")]
        YTD = 11

    }

}
