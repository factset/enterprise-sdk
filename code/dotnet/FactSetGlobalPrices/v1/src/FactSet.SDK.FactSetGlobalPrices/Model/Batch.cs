/*
 * FactSet Global Prices API
 *
 * The FactSet Global Prices API provides end of day market pricing content using cloud and microservices technology, encompassing both pricing as well as corporate actions and events data.</p> 
 *
 * The version of the OpenAPI document: 1.8.0
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
using OpenAPIDateConverter = FactSet.SDK.FactSetGlobalPrices.Client.OpenAPIDateConverter;

namespace FactSet.SDK.FactSetGlobalPrices.Model
{
    /// <summary>
    /// Enables asynchronous \&quot;batch\&quot; processing for long-running requests, supporting durations up to 20 minutes. When batch&#x3D;Y is specified, the service responds with HTTP Status Code 202 (Accepted) indicating that the request has been received and is being processed. Use the batch status endpoint to check job progress, and retrieve results using the batch-result endpoint once processing is complete. Request Limits:   - Non-batch (real-time) requests:       * Single day: up to 500 IDs per request       * Multi-day: up to 50 IDs per request    - Batch requests:       * Single day: up to 2000 IDs per request       * Multi-day: up to 50 IDs per request  When using batch mode, the number of unique currencies present in the requested IDs is limited to 50 per request. It is recommended to use the POST method for large ID lists, as GET requests are still subject to URL query string length limits. 
    /// </summary>
    /// <value>Enables asynchronous \&quot;batch\&quot; processing for long-running requests, supporting durations up to 20 minutes. When batch&#x3D;Y is specified, the service responds with HTTP Status Code 202 (Accepted) indicating that the request has been received and is being processed. Use the batch status endpoint to check job progress, and retrieve results using the batch-result endpoint once processing is complete. Request Limits:   - Non-batch (real-time) requests:       * Single day: up to 500 IDs per request       * Multi-day: up to 50 IDs per request    - Batch requests:       * Single day: up to 2000 IDs per request       * Multi-day: up to 50 IDs per request  When using batch mode, the number of unique currencies present in the requested IDs is limited to 50 per request. It is recommended to use the POST method for large ID lists, as GET requests are still subject to URL query string length limits. </value>
    [JsonConverter(typeof(StringEnumConverter))]
    public enum Batch
    {
        /// <summary>
        /// Enum Y for value: Y
        /// </summary>
        [EnumMember(Value = "Y")]
        Y = 1,

        /// <summary>
        /// Enum N for value: N
        /// </summary>
        [EnumMember(Value = "N")]
        N = 2

    }

}
