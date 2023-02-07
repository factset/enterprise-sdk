/*
 * TickHistory
 *
 * TickHistory provides dynamic access to historical tick data for a specific security for specific dates or date range.
 *
 * The version of the OpenAPI document: 1.1.0
 * Generated by: https://github.com/openapitools/openapi-generator.git
 */


using System;
using System.Collections.Generic;
using System.Collections.ObjectModel;
using System.Linq;
using System.Net;
using System.Net.Mime;
using FactSet.SDK.FactSetTickHistory.Client;
using FactSet.SDK.FactSetTickHistory.Model;
using FactSet.SDK.Utils.Authentication;

namespace FactSet.SDK.FactSetTickHistory.Api
{

    /// <summary>
    /// Represents a collection of functions to interact with the API endpoints
    /// </summary>
    public interface IGetFilesApiSync : IApiAccessor
    {
        #region Synchronous Operations
        /// <summary>
        /// Returns the files from tickhistory endpoint for the specified date range
        /// </summary>
        /// <exception cref="FactSet.SDK.FactSetTickHistory.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="requestId">RequestId returned by request-files endpoint to poll and collect results of the query</param>
        /// <param name="paginationLimit">Specifies the maximum number of results to return per response page (optional, default to 20)</param>
        /// <param name="paginationOffset">Specifies the starting point for pagination. This parameter is used to identify the beginning of next set of results (optional, default to 0)</param>
        /// <returns>GetFilesResponse</returns>
        GetFilesResponse V1GetFilesGet(string requestId, int? paginationLimit = default(int?), int? paginationOffset = default(int?));

        /// <summary>
        /// Returns the files from tickhistory endpoint for the specified date range
        /// </summary>
        /// <remarks>
        /// 
        /// </remarks>
        /// <exception cref="FactSet.SDK.FactSetTickHistory.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="requestId">RequestId returned by request-files endpoint to poll and collect results of the query</param>
        /// <param name="paginationLimit">Specifies the maximum number of results to return per response page (optional, default to 20)</param>
        /// <param name="paginationOffset">Specifies the starting point for pagination. This parameter is used to identify the beginning of next set of results (optional, default to 0)</param>
        /// <returns>ApiResponse of GetFilesResponse</returns>
        ApiResponse<GetFilesResponse> V1GetFilesGetWithHttpInfo(string requestId, int? paginationLimit = default(int?), int? paginationOffset = default(int?));
        #endregion Synchronous Operations
    }

    /// <summary>
    /// Represents a collection of functions to interact with the API endpoints
    /// </summary>
    public interface IGetFilesApiAsync : IApiAccessor
    {
        #region Asynchronous Operations
        /// <summary>
        /// Returns the files from tickhistory endpoint for the specified date range
        /// </summary>
        /// <remarks>
        /// 
        /// </remarks>
        /// <exception cref="FactSet.SDK.FactSetTickHistory.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="requestId">RequestId returned by request-files endpoint to poll and collect results of the query</param>
        /// <param name="paginationLimit">Specifies the maximum number of results to return per response page (optional, default to 20)</param>
        /// <param name="paginationOffset">Specifies the starting point for pagination. This parameter is used to identify the beginning of next set of results (optional, default to 0)</param>
        /// <param name="cancellationToken">Cancellation Token to cancel the request.</param>
        /// <returns>Task of GetFilesResponse</returns>
        System.Threading.Tasks.Task<GetFilesResponse> V1GetFilesGetAsync(string requestId, int? paginationLimit = default(int?), int? paginationOffset = default(int?), System.Threading.CancellationToken cancellationToken = default(System.Threading.CancellationToken));

        /// <summary>
        /// Returns the files from tickhistory endpoint for the specified date range
        /// </summary>
        /// <remarks>
        /// 
        /// </remarks>
        /// <exception cref="FactSet.SDK.FactSetTickHistory.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="requestId">RequestId returned by request-files endpoint to poll and collect results of the query</param>
        /// <param name="paginationLimit">Specifies the maximum number of results to return per response page (optional, default to 20)</param>
        /// <param name="paginationOffset">Specifies the starting point for pagination. This parameter is used to identify the beginning of next set of results (optional, default to 0)</param>
        /// <param name="cancellationToken">Cancellation Token to cancel the request.</param>
        /// <returns>Task of ApiResponse (GetFilesResponse)</returns>
        System.Threading.Tasks.Task<ApiResponse<GetFilesResponse>> V1GetFilesGetWithHttpInfoAsync(string requestId, int? paginationLimit = default(int?), int? paginationOffset = default(int?), System.Threading.CancellationToken cancellationToken = default(System.Threading.CancellationToken));
        #endregion Asynchronous Operations
    }

    /// <summary>
    /// Represents a collection of functions to interact with the API endpoints
    /// </summary>
    public interface IGetFilesApi : IGetFilesApiSync, IGetFilesApiAsync
    {

    }

    /// <summary>
    /// Represents a collection of functions to interact with the API endpoints
    /// </summary>
    public partial class GetFilesApi : IGetFilesApi
    {
        private FactSet.SDK.FactSetTickHistory.Client.ExceptionFactory _exceptionFactory = (name, response) => null;

        # region Response Type Disctionaries
                private static readonly Dictionary<HttpStatusCode, System.Type> V1GetFilesGetResponseTypeDictionary = new Dictionary<HttpStatusCode, System.Type>
        {
            { (HttpStatusCode)200, typeof(GetFilesResponse) },
            { (HttpStatusCode)400, typeof(GetFilesStatus) },
        };

        # endregion Response Type Disctionaries

        # region Api Response Objects
         

        # endregion Api Response Objects

        /// <summary>
        /// Initializes a new instance of the <see cref="GetFilesApi"/> class.
        /// </summary>
        /// <returns></returns>
        public GetFilesApi() : this((string)null)
        {
        }

        /// <summary>
        /// Initializes a new instance of the <see cref="GetFilesApi"/> class.
        /// </summary>
        /// <returns></returns>
        public GetFilesApi(string basePath)
        {
            this.Configuration = FactSet.SDK.FactSetTickHistory.Client.Configuration.MergeConfigurations(
                FactSet.SDK.FactSetTickHistory.Client.GlobalConfiguration.Instance,
                new FactSet.SDK.FactSetTickHistory.Client.Configuration { BasePath = basePath }
            );
            this.Client = new FactSet.SDK.FactSetTickHistory.Client.ApiClient(this.Configuration.BasePath);
            this.AsynchronousClient = new FactSet.SDK.FactSetTickHistory.Client.ApiClient(this.Configuration.BasePath);
            this.ExceptionFactory = FactSet.SDK.FactSetTickHistory.Client.Configuration.DefaultExceptionFactory;
        }

        /// <summary>
        /// Initializes a new instance of the <see cref="GetFilesApi"/> class
        /// using Configuration object
        /// </summary>
        /// <param name="configuration">An instance of Configuration</param>
        /// <returns></returns>
        public GetFilesApi(FactSet.SDK.FactSetTickHistory.Client.Configuration configuration)
        {
            if (configuration == null) throw new ArgumentNullException("configuration");

            this.Configuration = FactSet.SDK.FactSetTickHistory.Client.Configuration.MergeConfigurations(
                FactSet.SDK.FactSetTickHistory.Client.GlobalConfiguration.Instance,
                configuration
            );
            this.Client = new FactSet.SDK.FactSetTickHistory.Client.ApiClient(this.Configuration.BasePath);
            this.AsynchronousClient = new FactSet.SDK.FactSetTickHistory.Client.ApiClient(this.Configuration.BasePath);
            ExceptionFactory = FactSet.SDK.FactSetTickHistory.Client.Configuration.DefaultExceptionFactory;
        }

        /// <summary>
        /// Initializes a new instance of the <see cref="GetFilesApi"/> class
        /// using a Configuration object and client instance.
        /// </summary>
        /// <param name="client">The client interface for synchronous API access.</param>
        /// <param name="asyncClient">The client interface for asynchronous API access.</param>
        /// <param name="configuration">The configuration object.</param>
        public GetFilesApi(FactSet.SDK.FactSetTickHistory.Client.ISynchronousClient client, FactSet.SDK.FactSetTickHistory.Client.IAsynchronousClient asyncClient, FactSet.SDK.FactSetTickHistory.Client.IReadableConfiguration configuration)
        {
            if (client == null) throw new ArgumentNullException("client");
            if (asyncClient == null) throw new ArgumentNullException("asyncClient");
            if (configuration == null) throw new ArgumentNullException("configuration");

            this.Client = client;
            this.AsynchronousClient = asyncClient;
            this.Configuration = configuration;
            this.ExceptionFactory = FactSet.SDK.FactSetTickHistory.Client.Configuration.DefaultExceptionFactory;
        }

        /// <summary>
        /// The client for accessing this underlying API asynchronously.
        /// </summary>
        public FactSet.SDK.FactSetTickHistory.Client.IAsynchronousClient AsynchronousClient { get; set; }

        /// <summary>
        /// The client for accessing this underlying API synchronously.
        /// </summary>
        public FactSet.SDK.FactSetTickHistory.Client.ISynchronousClient Client { get; set; }

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
        public FactSet.SDK.FactSetTickHistory.Client.IReadableConfiguration Configuration { get; set; }

        /// <summary>
        /// Provides a factory method hook for the creation of exceptions.
        /// </summary>
        public FactSet.SDK.FactSetTickHistory.Client.ExceptionFactory ExceptionFactory
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
        /// Returns the files from tickhistory endpoint for the specified date range 
        /// </summary>
        /// <exception cref="FactSet.SDK.FactSetTickHistory.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="requestId">RequestId returned by request-files endpoint to poll and collect results of the query</param>
        /// <param name="paginationLimit">Specifies the maximum number of results to return per response page (optional, default to 20)</param>
        /// <param name="paginationOffset">Specifies the starting point for pagination. This parameter is used to identify the beginning of next set of results (optional, default to 0)</param>
        /// <returns>GetFilesResponse</returns>
        public GetFilesResponse V1GetFilesGet(string requestId, int? paginationLimit = default(int?), int? paginationOffset = default(int?))
        {
            var localVarResponse = V1GetFilesGetWithHttpInfo(requestId, paginationLimit, paginationOffset);
            return localVarResponse.Data;
        }

        /// <summary>
        /// Returns the files from tickhistory endpoint for the specified date range 
        /// </summary>
        /// <exception cref="FactSet.SDK.FactSetTickHistory.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="requestId">RequestId returned by request-files endpoint to poll and collect results of the query</param>
        /// <param name="paginationLimit">Specifies the maximum number of results to return per response page (optional, default to 20)</param>
        /// <param name="paginationOffset">Specifies the starting point for pagination. This parameter is used to identify the beginning of next set of results (optional, default to 0)</param>
        /// <returns>ApiResponse of GetFilesResponse</returns>
        public ApiResponse<GetFilesResponse> V1GetFilesGetWithHttpInfo(string requestId, int? paginationLimit = default(int?), int? paginationOffset = default(int?))
        {
            // verify the required parameter 'requestId' is set
            if (requestId == null)
            {
                throw new FactSet.SDK.FactSetTickHistory.Client.ApiException(400, "Missing required parameter 'requestId' when calling GetFilesApi->V1GetFilesGet");
            }

            FactSet.SDK.FactSetTickHistory.Client.RequestOptions localVarRequestOptions = new FactSet.SDK.FactSetTickHistory.Client.RequestOptions();

            string[] _contentTypes = new string[] {
            };

            // to determine the Accept header
            string[] _accepts = new string[] {
                "application/json"
            };

            var localVarContentType = FactSet.SDK.FactSetTickHistory.Client.ClientUtils.SelectHeaderContentType(_contentTypes);
            if (localVarContentType != null)
            {
                localVarRequestOptions.HeaderParameters.Add("Content-Type", localVarContentType);
            }

            var localVarAccept = FactSet.SDK.FactSetTickHistory.Client.ClientUtils.SelectHeaderAccept(_accepts);
            if (localVarAccept != null)
            {
                localVarRequestOptions.HeaderParameters.Add("Accept", localVarAccept);
            }

            localVarRequestOptions.QueryParameters.Add(FactSet.SDK.FactSetTickHistory.Client.ClientUtils.ParameterToMultiMap("", "requestId", requestId));
            if (paginationLimit != null)
            {
                localVarRequestOptions.QueryParameters.Add(FactSet.SDK.FactSetTickHistory.Client.ClientUtils.ParameterToMultiMap("", "_paginationLimit", paginationLimit));
            }
            if (paginationOffset != null)
            {
                localVarRequestOptions.QueryParameters.Add(FactSet.SDK.FactSetTickHistory.Client.ClientUtils.ParameterToMultiMap("", "_paginationOffset", paginationOffset));
            }

            // authentication (FactSetApiKey) required
            // http basic authentication required
            if (!string.IsNullOrEmpty(this.Configuration.Username) || !string.IsNullOrEmpty(this.Configuration.Password) && !localVarRequestOptions.HeaderParameters.ContainsKey("Authorization"))
            {
                localVarRequestOptions.HeaderParameters.Add("Authorization", "Basic " + FactSet.SDK.FactSetTickHistory.Client.ClientUtils.Base64Encode(this.Configuration.Username + ":" + this.Configuration.Password));
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

            localVarRequestOptions.ResponseTypeDictionary = V1GetFilesGetResponseTypeDictionary;

            // make the HTTP request
            var localVarResponse = this.Client.Get<
            GetFilesResponse>("/v1/get-files", localVarRequestOptions, this.Configuration);
            if (this.ExceptionFactory != null)
            {
                Exception _exception = this.ExceptionFactory("V1GetFilesGet", localVarResponse);
                if (_exception != null)
                {
                    throw _exception;
                }
            }
            return localVarResponse;
        }

        /// <summary>
        /// Returns the files from tickhistory endpoint for the specified date range 
        /// </summary>
        /// <exception cref="FactSet.SDK.FactSetTickHistory.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="requestId">RequestId returned by request-files endpoint to poll and collect results of the query</param>
        /// <param name="paginationLimit">Specifies the maximum number of results to return per response page (optional, default to 20)</param>
        /// <param name="paginationOffset">Specifies the starting point for pagination. This parameter is used to identify the beginning of next set of results (optional, default to 0)</param>
        /// <param name="cancellationToken">Cancellation Token to cancel the request.</param>
        /// <returns>Task of GetFilesResponse</returns>
        public async System.Threading.Tasks.Task<GetFilesResponse>V1GetFilesGetAsync(string requestId, int? paginationLimit = default(int?), int? paginationOffset = default(int?), System.Threading.CancellationToken cancellationToken = default(System.Threading.CancellationToken))
        {
            var localVarResponse = await V1GetFilesGetWithHttpInfoAsync(requestId, paginationLimit, paginationOffset, cancellationToken).ConfigureAwait(false);
            return localVarResponse.Data;
        }

        /// <summary>
        /// Returns the files from tickhistory endpoint for the specified date range 
        /// </summary>
        /// <exception cref="FactSet.SDK.FactSetTickHistory.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="requestId">RequestId returned by request-files endpoint to poll and collect results of the query</param>
        /// <param name="paginationLimit">Specifies the maximum number of results to return per response page (optional, default to 20)</param>
        /// <param name="paginationOffset">Specifies the starting point for pagination. This parameter is used to identify the beginning of next set of results (optional, default to 0)</param>
        /// <param name="cancellationToken">Cancellation Token to cancel the request.</param>
        /// <returns>Task of ApiResponse (GetFilesResponse)</returns>

        public async System.Threading.Tasks.Task<ApiResponse<GetFilesResponse>> V1GetFilesGetWithHttpInfoAsync(string requestId, int? paginationLimit = default(int?), int? paginationOffset = default(int?), System.Threading.CancellationToken cancellationToken = default(System.Threading.CancellationToken))
        {
            // verify the required parameter 'requestId' is set
            if (requestId == null)
            {
                throw new FactSet.SDK.FactSetTickHistory.Client.ApiException(400, "Missing required parameter 'requestId' when calling GetFilesApi->V1GetFilesGet");
            }


            FactSet.SDK.FactSetTickHistory.Client.RequestOptions localVarRequestOptions = new FactSet.SDK.FactSetTickHistory.Client.RequestOptions();

            string[] _contentTypes = new string[] {
            };

            // to determine the Accept header
            string[] _accepts = new string[] {
                "application/json"
            };

            var localVarContentType = FactSet.SDK.FactSetTickHistory.Client.ClientUtils.SelectHeaderContentType(_contentTypes);
            if (localVarContentType != null)
            {
                localVarRequestOptions.HeaderParameters.Add("Content-Type", localVarContentType);
            }

            var localVarAccept = FactSet.SDK.FactSetTickHistory.Client.ClientUtils.SelectHeaderAccept(_accepts);
            if (localVarAccept != null)
            {
                localVarRequestOptions.HeaderParameters.Add("Accept", localVarAccept);
            }

            localVarRequestOptions.QueryParameters.Add(FactSet.SDK.FactSetTickHistory.Client.ClientUtils.ParameterToMultiMap("", "requestId", requestId));
            if (paginationLimit != null)
            {
                localVarRequestOptions.QueryParameters.Add(FactSet.SDK.FactSetTickHistory.Client.ClientUtils.ParameterToMultiMap("", "_paginationLimit", paginationLimit));
            }
            if (paginationOffset != null)
            {
                localVarRequestOptions.QueryParameters.Add(FactSet.SDK.FactSetTickHistory.Client.ClientUtils.ParameterToMultiMap("", "_paginationOffset", paginationOffset));
            }

            // authentication (FactSetApiKey) required
            // http basic authentication required
            if (!string.IsNullOrEmpty(this.Configuration.Username) || !string.IsNullOrEmpty(this.Configuration.Password) && !localVarRequestOptions.HeaderParameters.ContainsKey("Authorization"))
            {
                localVarRequestOptions.HeaderParameters.Add("Authorization", "Basic " + FactSet.SDK.FactSetTickHistory.Client.ClientUtils.Base64Encode(this.Configuration.Username + ":" + this.Configuration.Password));
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


            localVarRequestOptions.ResponseTypeDictionary = V1GetFilesGetResponseTypeDictionary;

            // make the HTTP request
            var localVarResponse = await this.AsynchronousClient.GetAsync<GetFilesResponse>("/v1/get-files", localVarRequestOptions, this.Configuration, cancellationToken).ConfigureAwait(false);

            if (this.ExceptionFactory != null)
            {
                Exception _exception = this.ExceptionFactory("V1GetFilesGet", localVarResponse);
                if (_exception != null)
                {
                    throw _exception;
                }
            }

            return localVarResponse;
        }

    }
}
