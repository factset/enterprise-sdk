/*
 * Open:Risk API
 *
 * Service to calculate parametric linear risk statistics and generate risk model asset identifier mappings.
 *
 * The version of the OpenAPI document: 1.24.0
 * Contact: api@factset.com
 * Generated by: https://github.com/openapitools/openapi-generator.git
 */


using System;
using System.Collections.Generic;
using System.Collections.ObjectModel;
using System.Linq;
using System.Net;
using System.Net.Mime;
using FactSet.SDK.OpenRisk.Client;
using FactSet.SDK.OpenRisk.Model;
using FactSet.SDK.Utils.Authentication;

namespace FactSet.SDK.OpenRisk.Api
{

    /// <summary>
    /// Represents a collection of functions to interact with the API endpoints
    /// </summary>
    public interface IOperationsApiSync : IApiAccessor
    {
        #region Synchronous Operations
        /// <summary>
        /// Calculate risk statistics
        /// </summary>
        /// <remarks>
        /// Calculate predicted risk statistics for provided holdings using risk model data. Asset symbols and market values/weights are required.
        /// </remarks>
        /// <exception cref="FactSet.SDK.OpenRisk.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="version">Semantic version number. See [this link here](https://regexr.com/47b7t) to test validate patterns.</param>
        /// <param name="calculateFromHoldingsRequestBody"></param>
        /// <returns>InlineResponse2003</returns>
        InlineResponse2003 CalculateFromHoldings(string version, CalculateFromHoldingsRequestBody calculateFromHoldingsRequestBody);

        /// <summary>
        /// Calculate risk statistics
        /// </summary>
        /// <remarks>
        /// Calculate predicted risk statistics for provided holdings using risk model data. Asset symbols and market values/weights are required.
        /// </remarks>
        /// <exception cref="FactSet.SDK.OpenRisk.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="version">Semantic version number. See [this link here](https://regexr.com/47b7t) to test validate patterns.</param>
        /// <param name="calculateFromHoldingsRequestBody"></param>
        /// <returns>ApiResponse of InlineResponse2003</returns>
        ApiResponse<InlineResponse2003> CalculateFromHoldingsWithHttpInfo(string version, CalculateFromHoldingsRequestBody calculateFromHoldingsRequestBody);
        /// <summary>
        /// Generate risk model ID mapping
        /// </summary>
        /// <remarks>
        /// Resolve all input holdings IDs against a risk model for coverage and provide a mapping to security indices in the model or the reason for exclusion
        /// </remarks>
        /// <exception cref="FactSet.SDK.OpenRisk.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="version">Semantic version number. See [this link here](https://regexr.com/47b7t) to test validate patterns.</param>
        /// <param name="generateIdMappingRequestBody"></param>
        /// <returns>InlineResponse2004</returns>
        InlineResponse2004 GenerateIdMapping(string version, GenerateIdMappingRequestBody generateIdMappingRequestBody);

        /// <summary>
        /// Generate risk model ID mapping
        /// </summary>
        /// <remarks>
        /// Resolve all input holdings IDs against a risk model for coverage and provide a mapping to security indices in the model or the reason for exclusion
        /// </remarks>
        /// <exception cref="FactSet.SDK.OpenRisk.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="version">Semantic version number. See [this link here](https://regexr.com/47b7t) to test validate patterns.</param>
        /// <param name="generateIdMappingRequestBody"></param>
        /// <returns>ApiResponse of InlineResponse2004</returns>
        ApiResponse<InlineResponse2004> GenerateIdMappingWithHttpInfo(string version, GenerateIdMappingRequestBody generateIdMappingRequestBody);
        #endregion Synchronous Operations
    }

    /// <summary>
    /// Represents a collection of functions to interact with the API endpoints
    /// </summary>
    public interface IOperationsApiAsync : IApiAccessor
    {
        #region Asynchronous Operations
        /// <summary>
        /// Calculate risk statistics
        /// </summary>
        /// <remarks>
        /// Calculate predicted risk statistics for provided holdings using risk model data. Asset symbols and market values/weights are required.
        /// </remarks>
        /// <exception cref="FactSet.SDK.OpenRisk.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="version">Semantic version number. See [this link here](https://regexr.com/47b7t) to test validate patterns.</param>
        /// <param name="calculateFromHoldingsRequestBody"></param>
        /// <param name="cancellationToken">Cancellation Token to cancel the request.</param>
        /// <returns>Task of InlineResponse2003</returns>
        System.Threading.Tasks.Task<InlineResponse2003> CalculateFromHoldingsAsync(string version, CalculateFromHoldingsRequestBody calculateFromHoldingsRequestBody, System.Threading.CancellationToken cancellationToken = default(System.Threading.CancellationToken));

        /// <summary>
        /// Calculate risk statistics
        /// </summary>
        /// <remarks>
        /// Calculate predicted risk statistics for provided holdings using risk model data. Asset symbols and market values/weights are required.
        /// </remarks>
        /// <exception cref="FactSet.SDK.OpenRisk.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="version">Semantic version number. See [this link here](https://regexr.com/47b7t) to test validate patterns.</param>
        /// <param name="calculateFromHoldingsRequestBody"></param>
        /// <param name="cancellationToken">Cancellation Token to cancel the request.</param>
        /// <returns>Task of ApiResponse (InlineResponse2003)</returns>
        System.Threading.Tasks.Task<ApiResponse<InlineResponse2003>> CalculateFromHoldingsWithHttpInfoAsync(string version, CalculateFromHoldingsRequestBody calculateFromHoldingsRequestBody, System.Threading.CancellationToken cancellationToken = default(System.Threading.CancellationToken));
        /// <summary>
        /// Generate risk model ID mapping
        /// </summary>
        /// <remarks>
        /// Resolve all input holdings IDs against a risk model for coverage and provide a mapping to security indices in the model or the reason for exclusion
        /// </remarks>
        /// <exception cref="FactSet.SDK.OpenRisk.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="version">Semantic version number. See [this link here](https://regexr.com/47b7t) to test validate patterns.</param>
        /// <param name="generateIdMappingRequestBody"></param>
        /// <param name="cancellationToken">Cancellation Token to cancel the request.</param>
        /// <returns>Task of InlineResponse2004</returns>
        System.Threading.Tasks.Task<InlineResponse2004> GenerateIdMappingAsync(string version, GenerateIdMappingRequestBody generateIdMappingRequestBody, System.Threading.CancellationToken cancellationToken = default(System.Threading.CancellationToken));

        /// <summary>
        /// Generate risk model ID mapping
        /// </summary>
        /// <remarks>
        /// Resolve all input holdings IDs against a risk model for coverage and provide a mapping to security indices in the model or the reason for exclusion
        /// </remarks>
        /// <exception cref="FactSet.SDK.OpenRisk.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="version">Semantic version number. See [this link here](https://regexr.com/47b7t) to test validate patterns.</param>
        /// <param name="generateIdMappingRequestBody"></param>
        /// <param name="cancellationToken">Cancellation Token to cancel the request.</param>
        /// <returns>Task of ApiResponse (InlineResponse2004)</returns>
        System.Threading.Tasks.Task<ApiResponse<InlineResponse2004>> GenerateIdMappingWithHttpInfoAsync(string version, GenerateIdMappingRequestBody generateIdMappingRequestBody, System.Threading.CancellationToken cancellationToken = default(System.Threading.CancellationToken));
        #endregion Asynchronous Operations
    }

    /// <summary>
    /// Represents a collection of functions to interact with the API endpoints
    /// </summary>
    public interface IOperationsApi : IOperationsApiSync, IOperationsApiAsync
    {

    }

    /// <summary>
    /// Represents a collection of functions to interact with the API endpoints
    /// </summary>
    public partial class OperationsApi : IOperationsApi
    {
        private FactSet.SDK.OpenRisk.Client.ExceptionFactory _exceptionFactory = (name, response) => null;

        # region Response Type Disctionaries
        
        private static readonly Dictionary<HttpStatusCode, System.Type> CalculateFromHoldingsResponseTypeDictionary = new Dictionary<HttpStatusCode, System.Type>
        {
            { (HttpStatusCode)200, typeof(InlineResponse2003) },
            { (HttpStatusCode)400, typeof(ErrorResponse) },
            { (HttpStatusCode)401, typeof(string) },
            { (HttpStatusCode)403, typeof(ErrorResponse) },
            { (HttpStatusCode)404, typeof(ErrorResponse) },
            { (HttpStatusCode)500, typeof(ErrorResponse) },
        };

        private static readonly Dictionary<HttpStatusCode, System.Type> GenerateIdMappingResponseTypeDictionary = new Dictionary<HttpStatusCode, System.Type>
        {
            { (HttpStatusCode)200, typeof(InlineResponse2004) },
            { (HttpStatusCode)400, typeof(ErrorResponse) },
            { (HttpStatusCode)401, typeof(string) },
            { (HttpStatusCode)403, typeof(ErrorResponse) },
            { (HttpStatusCode)404, typeof(ErrorResponse) },
            { (HttpStatusCode)500, typeof(ErrorResponse) },
        };

        # endregion Response Type Disctionaries

        # region Api Response Objects
        

        # endregion Api Response Objects

        /// <summary>
        /// Initializes a new instance of the <see cref="OperationsApi"/> class.
        /// </summary>
        /// <returns></returns>
        public OperationsApi() : this((string)null)
        {
        }

        /// <summary>
        /// Initializes a new instance of the <see cref="OperationsApi"/> class.
        /// </summary>
        /// <returns></returns>
        public OperationsApi(string basePath)
        {
            this.Configuration = FactSet.SDK.OpenRisk.Client.Configuration.MergeConfigurations(
                FactSet.SDK.OpenRisk.Client.GlobalConfiguration.Instance,
                new FactSet.SDK.OpenRisk.Client.Configuration { BasePath = basePath }
            );
            this.Client = new FactSet.SDK.OpenRisk.Client.ApiClient(this.Configuration.BasePath);
            this.AsynchronousClient = new FactSet.SDK.OpenRisk.Client.ApiClient(this.Configuration.BasePath);
            this.ExceptionFactory = FactSet.SDK.OpenRisk.Client.Configuration.DefaultExceptionFactory;
        }

        /// <summary>
        /// Initializes a new instance of the <see cref="OperationsApi"/> class
        /// using Configuration object
        /// </summary>
        /// <param name="configuration">An instance of Configuration</param>
        /// <returns></returns>
        public OperationsApi(FactSet.SDK.OpenRisk.Client.Configuration configuration)
        {
            if (configuration == null) throw new ArgumentNullException("configuration");

            this.Configuration = FactSet.SDK.OpenRisk.Client.Configuration.MergeConfigurations(
                FactSet.SDK.OpenRisk.Client.GlobalConfiguration.Instance,
                configuration
            );
            this.Client = new FactSet.SDK.OpenRisk.Client.ApiClient(this.Configuration.BasePath);
            this.AsynchronousClient = new FactSet.SDK.OpenRisk.Client.ApiClient(this.Configuration.BasePath);
            ExceptionFactory = FactSet.SDK.OpenRisk.Client.Configuration.DefaultExceptionFactory;
        }

        /// <summary>
        /// Initializes a new instance of the <see cref="OperationsApi"/> class
        /// using a Configuration object and client instance.
        /// </summary>
        /// <param name="client">The client interface for synchronous API access.</param>
        /// <param name="asyncClient">The client interface for asynchronous API access.</param>
        /// <param name="configuration">The configuration object.</param>
        public OperationsApi(FactSet.SDK.OpenRisk.Client.ISynchronousClient client, FactSet.SDK.OpenRisk.Client.IAsynchronousClient asyncClient, FactSet.SDK.OpenRisk.Client.IReadableConfiguration configuration)
        {
            if (client == null) throw new ArgumentNullException("client");
            if (asyncClient == null) throw new ArgumentNullException("asyncClient");
            if (configuration == null) throw new ArgumentNullException("configuration");

            this.Client = client;
            this.AsynchronousClient = asyncClient;
            this.Configuration = configuration;
            this.ExceptionFactory = FactSet.SDK.OpenRisk.Client.Configuration.DefaultExceptionFactory;
        }

        /// <summary>
        /// The client for accessing this underlying API asynchronously.
        /// </summary>
        public FactSet.SDK.OpenRisk.Client.IAsynchronousClient AsynchronousClient { get; set; }

        /// <summary>
        /// The client for accessing this underlying API synchronously.
        /// </summary>
        public FactSet.SDK.OpenRisk.Client.ISynchronousClient Client { get; set; }

        /// <summary>
        /// Gets the base path of the API client.
        /// </summary>
        /// <value>The base path</value>
        public string GetBasePath()
        {
            return this.Configuration.BasePath;
        }

        /// <summary>
        /// Gets or sets the configuration object
        /// </summary>
        /// <value>An instance of the Configuration</value>
        public FactSet.SDK.OpenRisk.Client.IReadableConfiguration Configuration { get; set; }

        /// <summary>
        /// Provides a factory method hook for the creation of exceptions.
        /// </summary>
        public FactSet.SDK.OpenRisk.Client.ExceptionFactory ExceptionFactory
        {
            get
            {
                if (_exceptionFactory != null && _exceptionFactory.GetInvocationList().Length > 1)
                {
                    throw new InvalidOperationException("Multicast delegate for ExceptionFactory is unsupported.");
                }
                return _exceptionFactory;
            }
            set { _exceptionFactory = value; }
        }

        /// <summary>
        /// Calculate risk statistics Calculate predicted risk statistics for provided holdings using risk model data. Asset symbols and market values/weights are required.
        /// </summary>
        /// <exception cref="FactSet.SDK.OpenRisk.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="version">Semantic version number. See [this link here](https://regexr.com/47b7t) to test validate patterns.</param>
        /// <param name="calculateFromHoldingsRequestBody"></param>
        /// <returns>InlineResponse2003</returns>
        public InlineResponse2003 CalculateFromHoldings(string version, CalculateFromHoldingsRequestBody calculateFromHoldingsRequestBody)
        {
            var localVarResponse = CalculateFromHoldingsWithHttpInfo(version, calculateFromHoldingsRequestBody);
            return localVarResponse.Data;
        }

        /// <summary>
        /// Calculate risk statistics Calculate predicted risk statistics for provided holdings using risk model data. Asset symbols and market values/weights are required.
        /// </summary>
        /// <exception cref="FactSet.SDK.OpenRisk.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="version">Semantic version number. See [this link here](https://regexr.com/47b7t) to test validate patterns.</param>
        /// <param name="calculateFromHoldingsRequestBody"></param>
        /// <returns>ApiResponse of InlineResponse2003</returns>
        public ApiResponse<InlineResponse2003> CalculateFromHoldingsWithHttpInfo(string version, CalculateFromHoldingsRequestBody calculateFromHoldingsRequestBody)
        {
            // verify the required parameter 'version' is set
            if (version == null)
            {
                throw new FactSet.SDK.OpenRisk.Client.ApiException(400, "Missing required parameter 'version' when calling OperationsApi->CalculateFromHoldings");
            }

            // verify the required parameter 'calculateFromHoldingsRequestBody' is set
            if (calculateFromHoldingsRequestBody == null)
            {
                throw new FactSet.SDK.OpenRisk.Client.ApiException(400, "Missing required parameter 'calculateFromHoldingsRequestBody' when calling OperationsApi->CalculateFromHoldings");
            }

            FactSet.SDK.OpenRisk.Client.RequestOptions localVarRequestOptions = new FactSet.SDK.OpenRisk.Client.RequestOptions();

            string[] _contentTypes = new string[] {
                "application/json"
            };

            // to determine the Accept header
            string[] _accepts = new string[] {
                "application/json",
                "text/plain"
            };

            var localVarContentType = FactSet.SDK.OpenRisk.Client.ClientUtils.SelectHeaderContentType(_contentTypes);
            if (localVarContentType != null)
            {
                localVarRequestOptions.HeaderParameters.Add("Content-Type", localVarContentType);
            }

            var localVarAccept = FactSet.SDK.OpenRisk.Client.ClientUtils.SelectHeaderAccept(_accepts);
            if (localVarAccept != null)
            {
                localVarRequestOptions.HeaderParameters.Add("Accept", localVarAccept);
            }

            localVarRequestOptions.PathParameters.Add("version", FactSet.SDK.OpenRisk.Client.ClientUtils.ParameterToString(version)); // path parameter
            localVarRequestOptions.Data = calculateFromHoldingsRequestBody;

            // authentication (FactSetApiKey) required
            // http basic authentication required
            if (!string.IsNullOrEmpty(this.Configuration.Username) || !string.IsNullOrEmpty(this.Configuration.Password) && !localVarRequestOptions.HeaderParameters.ContainsKey("Authorization"))
            {
                localVarRequestOptions.HeaderParameters.Add("Authorization", "Basic " + FactSet.SDK.OpenRisk.Client.ClientUtils.Base64Encode(this.Configuration.Username + ":" + this.Configuration.Password));
            }
            // authentication (FactSetOAuth2) required
            // oauth required
            if (!string.IsNullOrEmpty(this.Configuration.AccessToken) && !localVarRequestOptions.HeaderParameters.ContainsKey("Authorization"))
            {
                localVarRequestOptions.HeaderParameters.Add("Authorization", "Bearer " + this.Configuration.AccessToken);
            }

            // FactSet Authentication Client required
            if (this.Configuration.OAuth2Client != null)
            {
                var token = this.Configuration.OAuth2Client.GetAccessTokenAsync().Result;
                localVarRequestOptions.HeaderParameters.Add("Authorization", "Bearer " + token);
            }

            localVarRequestOptions.ResponseTypeDictionary = CalculateFromHoldingsResponseTypeDictionary;

            // make the HTTP request
            var localVarResponse = this.Client.Post<
            InlineResponse2003>("/linear/{version}/calculate/from-holdings", localVarRequestOptions, this.Configuration);
            if (this.ExceptionFactory != null)
            {
                Exception _exception = this.ExceptionFactory("CalculateFromHoldings", localVarResponse);
                if (_exception != null)
                {
                    throw _exception;
                }
            }
            return localVarResponse;
        }

        /// <summary>
        /// Calculate risk statistics Calculate predicted risk statistics for provided holdings using risk model data. Asset symbols and market values/weights are required.
        /// </summary>
        /// <exception cref="FactSet.SDK.OpenRisk.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="version">Semantic version number. See [this link here](https://regexr.com/47b7t) to test validate patterns.</param>
        /// <param name="calculateFromHoldingsRequestBody"></param>
        /// <param name="cancellationToken">Cancellation Token to cancel the request.</param>
        /// <returns>Task of InlineResponse2003</returns>
        public async System.Threading.Tasks.Task<InlineResponse2003>CalculateFromHoldingsAsync(string version, CalculateFromHoldingsRequestBody calculateFromHoldingsRequestBody, System.Threading.CancellationToken cancellationToken = default(System.Threading.CancellationToken))
        {
            var localVarResponse = await CalculateFromHoldingsWithHttpInfoAsync(version, calculateFromHoldingsRequestBody, cancellationToken).ConfigureAwait(false);
            return localVarResponse.Data;
        }

        /// <summary>
        /// Calculate risk statistics Calculate predicted risk statistics for provided holdings using risk model data. Asset symbols and market values/weights are required.
        /// </summary>
        /// <exception cref="FactSet.SDK.OpenRisk.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="version">Semantic version number. See [this link here](https://regexr.com/47b7t) to test validate patterns.</param>
        /// <param name="calculateFromHoldingsRequestBody"></param>
        /// <param name="cancellationToken">Cancellation Token to cancel the request.</param>
        /// <returns>Task of ApiResponse (InlineResponse2003)</returns>

        public async System.Threading.Tasks.Task<ApiResponse<InlineResponse2003>> CalculateFromHoldingsWithHttpInfoAsync(string version, CalculateFromHoldingsRequestBody calculateFromHoldingsRequestBody, System.Threading.CancellationToken cancellationToken = default(System.Threading.CancellationToken))
        {
            // verify the required parameter 'version' is set
            if (version == null)
            {
                throw new FactSet.SDK.OpenRisk.Client.ApiException(400, "Missing required parameter 'version' when calling OperationsApi->CalculateFromHoldings");
            }

            // verify the required parameter 'calculateFromHoldingsRequestBody' is set
            if (calculateFromHoldingsRequestBody == null)
            {
                throw new FactSet.SDK.OpenRisk.Client.ApiException(400, "Missing required parameter 'calculateFromHoldingsRequestBody' when calling OperationsApi->CalculateFromHoldings");
            }


            FactSet.SDK.OpenRisk.Client.RequestOptions localVarRequestOptions = new FactSet.SDK.OpenRisk.Client.RequestOptions();

            string[] _contentTypes = new string[] {
                "application/json"
            };

            // to determine the Accept header
            string[] _accepts = new string[] {
                "application/json",
                "text/plain"
            };

            var localVarContentType = FactSet.SDK.OpenRisk.Client.ClientUtils.SelectHeaderContentType(_contentTypes);
            if (localVarContentType != null)
            {
                localVarRequestOptions.HeaderParameters.Add("Content-Type", localVarContentType);
            }

            var localVarAccept = FactSet.SDK.OpenRisk.Client.ClientUtils.SelectHeaderAccept(_accepts);
            if (localVarAccept != null)
            {
                localVarRequestOptions.HeaderParameters.Add("Accept", localVarAccept);
            }

            localVarRequestOptions.PathParameters.Add("version", FactSet.SDK.OpenRisk.Client.ClientUtils.ParameterToString(version)); // path parameter
            localVarRequestOptions.Data = calculateFromHoldingsRequestBody;

            // authentication (FactSetApiKey) required
            // http basic authentication required
            if (!string.IsNullOrEmpty(this.Configuration.Username) || !string.IsNullOrEmpty(this.Configuration.Password) && !localVarRequestOptions.HeaderParameters.ContainsKey("Authorization"))
            {
                localVarRequestOptions.HeaderParameters.Add("Authorization", "Basic " + FactSet.SDK.OpenRisk.Client.ClientUtils.Base64Encode(this.Configuration.Username + ":" + this.Configuration.Password));
            }
            // authentication (FactSetOAuth2) required
            // oauth required
            if (!string.IsNullOrEmpty(this.Configuration.AccessToken) && !localVarRequestOptions.HeaderParameters.ContainsKey("Authorization"))
            {
                localVarRequestOptions.HeaderParameters.Add("Authorization", "Bearer " + this.Configuration.AccessToken);
            }

            // FactSet Authentication Client required
            if (this.Configuration.OAuth2Client != null) {
                var token = await this.Configuration.OAuth2Client.GetAccessTokenAsync();
                localVarRequestOptions.HeaderParameters.Add("Authorization", "Bearer " + token);
            }


            localVarRequestOptions.ResponseTypeDictionary = CalculateFromHoldingsResponseTypeDictionary;

            // make the HTTP request
            var localVarResponse = await this.AsynchronousClient.PostAsync<InlineResponse2003>("/linear/{version}/calculate/from-holdings", localVarRequestOptions, this.Configuration, cancellationToken).ConfigureAwait(false);

            if (this.ExceptionFactory != null)
            {
                Exception _exception = this.ExceptionFactory("CalculateFromHoldings", localVarResponse);
                if (_exception != null)
                {
                    throw _exception;
                }
            }

            return localVarResponse;
        }

        /// <summary>
        /// Generate risk model ID mapping Resolve all input holdings IDs against a risk model for coverage and provide a mapping to security indices in the model or the reason for exclusion
        /// </summary>
        /// <exception cref="FactSet.SDK.OpenRisk.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="version">Semantic version number. See [this link here](https://regexr.com/47b7t) to test validate patterns.</param>
        /// <param name="generateIdMappingRequestBody"></param>
        /// <returns>InlineResponse2004</returns>
        public InlineResponse2004 GenerateIdMapping(string version, GenerateIdMappingRequestBody generateIdMappingRequestBody)
        {
            var localVarResponse = GenerateIdMappingWithHttpInfo(version, generateIdMappingRequestBody);
            return localVarResponse.Data;
        }

        /// <summary>
        /// Generate risk model ID mapping Resolve all input holdings IDs against a risk model for coverage and provide a mapping to security indices in the model or the reason for exclusion
        /// </summary>
        /// <exception cref="FactSet.SDK.OpenRisk.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="version">Semantic version number. See [this link here](https://regexr.com/47b7t) to test validate patterns.</param>
        /// <param name="generateIdMappingRequestBody"></param>
        /// <returns>ApiResponse of InlineResponse2004</returns>
        public ApiResponse<InlineResponse2004> GenerateIdMappingWithHttpInfo(string version, GenerateIdMappingRequestBody generateIdMappingRequestBody)
        {
            // verify the required parameter 'version' is set
            if (version == null)
            {
                throw new FactSet.SDK.OpenRisk.Client.ApiException(400, "Missing required parameter 'version' when calling OperationsApi->GenerateIdMapping");
            }

            // verify the required parameter 'generateIdMappingRequestBody' is set
            if (generateIdMappingRequestBody == null)
            {
                throw new FactSet.SDK.OpenRisk.Client.ApiException(400, "Missing required parameter 'generateIdMappingRequestBody' when calling OperationsApi->GenerateIdMapping");
            }

            FactSet.SDK.OpenRisk.Client.RequestOptions localVarRequestOptions = new FactSet.SDK.OpenRisk.Client.RequestOptions();

            string[] _contentTypes = new string[] {
                "application/json"
            };

            // to determine the Accept header
            string[] _accepts = new string[] {
                "application/json",
                "text/plain"
            };

            var localVarContentType = FactSet.SDK.OpenRisk.Client.ClientUtils.SelectHeaderContentType(_contentTypes);
            if (localVarContentType != null)
            {
                localVarRequestOptions.HeaderParameters.Add("Content-Type", localVarContentType);
            }

            var localVarAccept = FactSet.SDK.OpenRisk.Client.ClientUtils.SelectHeaderAccept(_accepts);
            if (localVarAccept != null)
            {
                localVarRequestOptions.HeaderParameters.Add("Accept", localVarAccept);
            }

            localVarRequestOptions.PathParameters.Add("version", FactSet.SDK.OpenRisk.Client.ClientUtils.ParameterToString(version)); // path parameter
            localVarRequestOptions.Data = generateIdMappingRequestBody;

            // authentication (FactSetApiKey) required
            // http basic authentication required
            if (!string.IsNullOrEmpty(this.Configuration.Username) || !string.IsNullOrEmpty(this.Configuration.Password) && !localVarRequestOptions.HeaderParameters.ContainsKey("Authorization"))
            {
                localVarRequestOptions.HeaderParameters.Add("Authorization", "Basic " + FactSet.SDK.OpenRisk.Client.ClientUtils.Base64Encode(this.Configuration.Username + ":" + this.Configuration.Password));
            }
            // authentication (FactSetOAuth2) required
            // oauth required
            if (!string.IsNullOrEmpty(this.Configuration.AccessToken) && !localVarRequestOptions.HeaderParameters.ContainsKey("Authorization"))
            {
                localVarRequestOptions.HeaderParameters.Add("Authorization", "Bearer " + this.Configuration.AccessToken);
            }

            // FactSet Authentication Client required
            if (this.Configuration.OAuth2Client != null)
            {
                var token = this.Configuration.OAuth2Client.GetAccessTokenAsync().Result;
                localVarRequestOptions.HeaderParameters.Add("Authorization", "Bearer " + token);
            }

            localVarRequestOptions.ResponseTypeDictionary = GenerateIdMappingResponseTypeDictionary;

            // make the HTTP request
            var localVarResponse = this.Client.Post<
            InlineResponse2004>("/linear/{version}/generate/id-mapping", localVarRequestOptions, this.Configuration);
            if (this.ExceptionFactory != null)
            {
                Exception _exception = this.ExceptionFactory("GenerateIdMapping", localVarResponse);
                if (_exception != null)
                {
                    throw _exception;
                }
            }
            return localVarResponse;
        }

        /// <summary>
        /// Generate risk model ID mapping Resolve all input holdings IDs against a risk model for coverage and provide a mapping to security indices in the model or the reason for exclusion
        /// </summary>
        /// <exception cref="FactSet.SDK.OpenRisk.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="version">Semantic version number. See [this link here](https://regexr.com/47b7t) to test validate patterns.</param>
        /// <param name="generateIdMappingRequestBody"></param>
        /// <param name="cancellationToken">Cancellation Token to cancel the request.</param>
        /// <returns>Task of InlineResponse2004</returns>
        public async System.Threading.Tasks.Task<InlineResponse2004>GenerateIdMappingAsync(string version, GenerateIdMappingRequestBody generateIdMappingRequestBody, System.Threading.CancellationToken cancellationToken = default(System.Threading.CancellationToken))
        {
            var localVarResponse = await GenerateIdMappingWithHttpInfoAsync(version, generateIdMappingRequestBody, cancellationToken).ConfigureAwait(false);
            return localVarResponse.Data;
        }

        /// <summary>
        /// Generate risk model ID mapping Resolve all input holdings IDs against a risk model for coverage and provide a mapping to security indices in the model or the reason for exclusion
        /// </summary>
        /// <exception cref="FactSet.SDK.OpenRisk.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="version">Semantic version number. See [this link here](https://regexr.com/47b7t) to test validate patterns.</param>
        /// <param name="generateIdMappingRequestBody"></param>
        /// <param name="cancellationToken">Cancellation Token to cancel the request.</param>
        /// <returns>Task of ApiResponse (InlineResponse2004)</returns>

        public async System.Threading.Tasks.Task<ApiResponse<InlineResponse2004>> GenerateIdMappingWithHttpInfoAsync(string version, GenerateIdMappingRequestBody generateIdMappingRequestBody, System.Threading.CancellationToken cancellationToken = default(System.Threading.CancellationToken))
        {
            // verify the required parameter 'version' is set
            if (version == null)
            {
                throw new FactSet.SDK.OpenRisk.Client.ApiException(400, "Missing required parameter 'version' when calling OperationsApi->GenerateIdMapping");
            }

            // verify the required parameter 'generateIdMappingRequestBody' is set
            if (generateIdMappingRequestBody == null)
            {
                throw new FactSet.SDK.OpenRisk.Client.ApiException(400, "Missing required parameter 'generateIdMappingRequestBody' when calling OperationsApi->GenerateIdMapping");
            }


            FactSet.SDK.OpenRisk.Client.RequestOptions localVarRequestOptions = new FactSet.SDK.OpenRisk.Client.RequestOptions();

            string[] _contentTypes = new string[] {
                "application/json"
            };

            // to determine the Accept header
            string[] _accepts = new string[] {
                "application/json",
                "text/plain"
            };

            var localVarContentType = FactSet.SDK.OpenRisk.Client.ClientUtils.SelectHeaderContentType(_contentTypes);
            if (localVarContentType != null)
            {
                localVarRequestOptions.HeaderParameters.Add("Content-Type", localVarContentType);
            }

            var localVarAccept = FactSet.SDK.OpenRisk.Client.ClientUtils.SelectHeaderAccept(_accepts);
            if (localVarAccept != null)
            {
                localVarRequestOptions.HeaderParameters.Add("Accept", localVarAccept);
            }

            localVarRequestOptions.PathParameters.Add("version", FactSet.SDK.OpenRisk.Client.ClientUtils.ParameterToString(version)); // path parameter
            localVarRequestOptions.Data = generateIdMappingRequestBody;

            // authentication (FactSetApiKey) required
            // http basic authentication required
            if (!string.IsNullOrEmpty(this.Configuration.Username) || !string.IsNullOrEmpty(this.Configuration.Password) && !localVarRequestOptions.HeaderParameters.ContainsKey("Authorization"))
            {
                localVarRequestOptions.HeaderParameters.Add("Authorization", "Basic " + FactSet.SDK.OpenRisk.Client.ClientUtils.Base64Encode(this.Configuration.Username + ":" + this.Configuration.Password));
            }
            // authentication (FactSetOAuth2) required
            // oauth required
            if (!string.IsNullOrEmpty(this.Configuration.AccessToken) && !localVarRequestOptions.HeaderParameters.ContainsKey("Authorization"))
            {
                localVarRequestOptions.HeaderParameters.Add("Authorization", "Bearer " + this.Configuration.AccessToken);
            }

            // FactSet Authentication Client required
            if (this.Configuration.OAuth2Client != null) {
                var token = await this.Configuration.OAuth2Client.GetAccessTokenAsync();
                localVarRequestOptions.HeaderParameters.Add("Authorization", "Bearer " + token);
            }


            localVarRequestOptions.ResponseTypeDictionary = GenerateIdMappingResponseTypeDictionary;

            // make the HTTP request
            var localVarResponse = await this.AsynchronousClient.PostAsync<InlineResponse2004>("/linear/{version}/generate/id-mapping", localVarRequestOptions, this.Configuration, cancellationToken).ConfigureAwait(false);

            if (this.ExceptionFactory != null)
            {
                Exception _exception = this.ExceptionFactory("GenerateIdMapping", localVarResponse);
                if (_exception != null)
                {
                    throw _exception;
                }
            }

            return localVarResponse;
        }

    }
}
