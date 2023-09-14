/*
 * Portfolio Reporting Batcher
 *
 * The Portfolio Reporting Batcher (PRB) API allows clients to systematically leverage functionalities of the PRB application. With the initial release, clients can - trigger existing jobs - check status of running jobs - get various details of existing jobs
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
using OpenAPIDateConverter = FactSet.SDK.PortfolioReportingBatcher.Client.OpenAPIDateConverter;

namespace FactSet.SDK.PortfolioReportingBatcher.Model
{
    /// <summary>
    /// PA - Portfolio Analysis, PUB - Publisher, ADF - Analytics DataFeed, PI - Portfolio Insight, PD - Portfolio Dashboard, Portfolio Vault - Vault
    /// </summary>
    /// <value>PA - Portfolio Analysis, PUB - Publisher, ADF - Analytics DataFeed, PI - Portfolio Insight, PD - Portfolio Dashboard, Portfolio Vault - Vault</value>
    [JsonConverter(typeof(StringEnumConverter))]
    public enum JobTypes
    {
        /// <summary>
        /// Enum ADF for value: ADF
        /// </summary>
        [EnumMember(Value = "ADF")]
        ADF = 1,

        /// <summary>
        /// Enum PA for value: PA
        /// </summary>
        [EnumMember(Value = "PA")]
        PA = 2,

        /// <summary>
        /// Enum PD for value: PD
        /// </summary>
        [EnumMember(Value = "PD")]
        PD = 3,

        /// <summary>
        /// Enum PI for value: PI
        /// </summary>
        [EnumMember(Value = "PI")]
        PI = 4,

        /// <summary>
        /// Enum PUB for value: PUB
        /// </summary>
        [EnumMember(Value = "PUB")]
        PUB = 5,

        /// <summary>
        /// Enum Vault for value: vault
        /// </summary>
        [EnumMember(Value = "vault")]
        Vault = 6

    }

}