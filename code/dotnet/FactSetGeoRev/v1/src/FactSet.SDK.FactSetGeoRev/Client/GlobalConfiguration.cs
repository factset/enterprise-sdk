/*
 * FactSet GeoRev API
 *
 * FactSet Revere Geographic Revenue (\"GeoRev\") Exposure data provides a highly structured and normalized display of companies' revenues by geography. Using a four level taxonomy structure, understand the companies' Super-Region- ->Region- ->Area- ->Country revenue breakdowns. Quickly understand a company's revenue exposure in countries impacted by geopolitical, macroeconomic, and market risk. Understand the geographic footprint of a company based on sources of revenue versus country of domicile, and analyze global revenue exposures at the company, index, or portfolio level.<p> Geographic revenue has historically been difficult to analyze due to companies' non-standard and incomplete reporting. Investors relying solely on this as-reported data are limited in their ability to compare, aggregate or screen exposures across a universe or portfolio of companies. To achieve normalization, FactSet GeoRev captures data through a proprietary four-level geographic classification structure. An estimation algorithm based on GDP weighting and accounting logic is then applied to solve for any non-explicit disclosures. The result is a consistent, accurate, and flexible dataset that can take a company's revenues and break them down into any geographic country or region categories.</p><p>As markets become more integrated and companies expand operations beyond their domestic markets, GeoRev provides a new and valuable country factor to help investors discover alpha, model risk exposure, optimize portfolio weighting, and improve fund administration and reporting.</p><p>Data Frequency -  Annual; Update Frequency - Daily. 49,000+ Publically Listed Companies. All Russell 3000 and MSCI ACWI Index Consituents. U.S. Data is available from 2003, with Non-US data from 2007. For more details, visit [OA 17555](https://my.apps.factset.com/oa/pages/17555)</p><p><b>Rate limit is set to 10 requests per second</b>.</p> 
 *
 * The version of the OpenAPI document: 1.0.1
 * Contact: api@factset.com
 * Generated by: https://github.com/openapitools/openapi-generator.git
 */


using System.Collections.Generic;

namespace FactSet.SDK.FactSetGeoRev.Client
{
    /// <summary>
    /// <see cref="GlobalConfiguration"/> provides a compile-time extension point for globally configuring
    /// API Clients.
    /// </summary>
    /// <remarks>
    /// A customized implementation via partial class may reside in another file and may
    /// be excluded from automatic generation via a .openapi-generator-ignore file.
    /// </remarks>
    public partial class GlobalConfiguration : Configuration
    {
        #region Private Members

        private static readonly object GlobalConfigSync = new { };
        private static IReadableConfiguration _globalConfiguration;

        #endregion Private Members

        #region Constructors

        /// <inheritdoc />
        private GlobalConfiguration()
        {
        }

        /// <inheritdoc />
        public GlobalConfiguration(IDictionary<string, string> defaultHeader, IDictionary<string, string> apiKey, IDictionary<string, string> apiKeyPrefix, string basePath = "http://localhost:3000/api") : base(defaultHeader, apiKey, apiKeyPrefix, basePath)
        {
        }

        static GlobalConfiguration()
        {
            Instance = new GlobalConfiguration();
        }

        #endregion Constructors

        /// <summary>
        /// Gets or sets the default Configuration.
        /// </summary>
        /// <value>Configuration.</value>
        public static IReadableConfiguration Instance
        {
            get { return _globalConfiguration; }
            set
            {
                lock (GlobalConfigSync)
                {
                    _globalConfiguration = value;
                }
            }
        }
    }
}
