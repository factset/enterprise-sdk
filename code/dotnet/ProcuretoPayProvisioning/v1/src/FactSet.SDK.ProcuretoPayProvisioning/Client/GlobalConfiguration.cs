/*
 * FactSet Procure to Pay API
 *
 * Allows for Provisioning and Entitlement of FactSet accounts.     Authentication is provided via FactSet's [API Key System](https://developer.factset.com/authentication)    Please note that the on-page \"Try it out\" features do not function. You must authorize against our API and make requests directly againt the endpoints.    
 *
 * The version of the OpenAPI document: 1S
 * Generated by: https://github.com/openapitools/openapi-generator.git
 */


using System.Collections.Generic;

namespace FactSet.SDK.ProcuretoPayProvisioning.Client
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