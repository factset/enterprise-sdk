/*
 * Open:FactSet Marketplace API
 *
 * This API provides read-only access to marketplace products and partners.
 *
 * The version of the OpenAPI document: 3.0.0
 * Contact: api@factset.com
 * Generated by: https://github.com/openapitools/openapi-generator.git
 */


using System;
using System.Collections.Generic;
using System.Collections.ObjectModel;
using System.Linq;
using System.Net;
using System.Net.Mime;
using FactSet.SDK.OpenFactSetMarketplace.Client;
using FactSet.SDK.OpenFactSetMarketplace.Model;
using FactSet.SDK.Utils.Authentication;

namespace FactSet.SDK.OpenFactSetMarketplace.Api
{

    /// <summary>
    /// Represents a collection of functions to interact with the API endpoints
    /// </summary>
    public interface IPartnersApiSync : IApiAccessor
    {
        #region Synchronous Operations
        /// <summary>
        /// 
        /// </summary>
        /// <remarks>
        /// Get a single FactSet Partner by ID.
        /// </remarks>
        /// <exception cref="FactSet.SDK.OpenFactSetMarketplace.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="id">ID of the product or partner</param>
        /// <returns>PartnerSuccessResponse</returns>
        PartnerSuccessResponse GetPartnerById(string id);

        /// <summary>
        /// 
        /// </summary>
        /// <remarks>
        /// Get a single FactSet Partner by ID.
        /// </remarks>
        /// <exception cref="FactSet.SDK.OpenFactSetMarketplace.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="id">ID of the product or partner</param>
        /// <returns>ApiResponse of PartnerSuccessResponse</returns>
        ApiResponse<PartnerSuccessResponse> GetPartnerByIdWithHttpInfo(string id);
        /// <summary>
        /// 
        /// </summary>
        /// <remarks>
        /// Get all partners published on FactSet&#39;s Partner Catalog.
        /// </remarks>
        /// <exception cref="FactSet.SDK.OpenFactSetMarketplace.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="paginationLimit">Limit for number of records returned per page (optional, default to 10)</param>
        /// <param name="paginationOffset">Specifies the starting point for pagination. This parameter is used to identify the beginning of next set of results. (optional, default to 0)</param>
        /// <returns>PartnersSuccessResponse</returns>
        PartnersSuccessResponse GetPartners(int? paginationLimit = default(int?), int? paginationOffset = default(int?));

        /// <summary>
        /// 
        /// </summary>
        /// <remarks>
        /// Get all partners published on FactSet&#39;s Partner Catalog.
        /// </remarks>
        /// <exception cref="FactSet.SDK.OpenFactSetMarketplace.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="paginationLimit">Limit for number of records returned per page (optional, default to 10)</param>
        /// <param name="paginationOffset">Specifies the starting point for pagination. This parameter is used to identify the beginning of next set of results. (optional, default to 0)</param>
        /// <returns>ApiResponse of PartnersSuccessResponse</returns>
        ApiResponse<PartnersSuccessResponse> GetPartnersWithHttpInfo(int? paginationLimit = default(int?), int? paginationOffset = default(int?));
        #endregion Synchronous Operations
    }

    /// <summary>
    /// Represents a collection of functions to interact with the API endpoints
    /// </summary>
    public interface IPartnersApiAsync : IApiAccessor
    {
        #region Asynchronous Operations
        /// <summary>
        /// 
        /// </summary>
        /// <remarks>
        /// Get a single FactSet Partner by ID.
        /// </remarks>
        /// <exception cref="FactSet.SDK.OpenFactSetMarketplace.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="id">ID of the product or partner</param>
        /// <param name="cancellationToken">Cancellation Token to cancel the request.</param>
        /// <returns>Task of PartnerSuccessResponse</returns>
        System.Threading.Tasks.Task<PartnerSuccessResponse> GetPartnerByIdAsync(string id, System.Threading.CancellationToken cancellationToken = default(System.Threading.CancellationToken));

        /// <summary>
        /// 
        /// </summary>
        /// <remarks>
        /// Get a single FactSet Partner by ID.
        /// </remarks>
        /// <exception cref="FactSet.SDK.OpenFactSetMarketplace.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="id">ID of the product or partner</param>
        /// <param name="cancellationToken">Cancellation Token to cancel the request.</param>
        /// <returns>Task of ApiResponse (PartnerSuccessResponse)</returns>
        System.Threading.Tasks.Task<ApiResponse<PartnerSuccessResponse>> GetPartnerByIdWithHttpInfoAsync(string id, System.Threading.CancellationToken cancellationToken = default(System.Threading.CancellationToken));
        /// <summary>
        /// 
        /// </summary>
        /// <remarks>
        /// Get all partners published on FactSet&#39;s Partner Catalog.
        /// </remarks>
        /// <exception cref="FactSet.SDK.OpenFactSetMarketplace.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="paginationLimit">Limit for number of records returned per page (optional, default to 10)</param>
        /// <param name="paginationOffset">Specifies the starting point for pagination. This parameter is used to identify the beginning of next set of results. (optional, default to 0)</param>
        /// <param name="cancellationToken">Cancellation Token to cancel the request.</param>
        /// <returns>Task of PartnersSuccessResponse</returns>
        System.Threading.Tasks.Task<PartnersSuccessResponse> GetPartnersAsync(int? paginationLimit = default(int?), int? paginationOffset = default(int?), System.Threading.CancellationToken cancellationToken = default(System.Threading.CancellationToken));

        /// <summary>
        /// 
        /// </summary>
        /// <remarks>
        /// Get all partners published on FactSet&#39;s Partner Catalog.
        /// </remarks>
        /// <exception cref="FactSet.SDK.OpenFactSetMarketplace.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="paginationLimit">Limit for number of records returned per page (optional, default to 10)</param>
        /// <param name="paginationOffset">Specifies the starting point for pagination. This parameter is used to identify the beginning of next set of results. (optional, default to 0)</param>
        /// <param name="cancellationToken">Cancellation Token to cancel the request.</param>
        /// <returns>Task of ApiResponse (PartnersSuccessResponse)</returns>
        System.Threading.Tasks.Task<ApiResponse<PartnersSuccessResponse>> GetPartnersWithHttpInfoAsync(int? paginationLimit = default(int?), int? paginationOffset = default(int?), System.Threading.CancellationToken cancellationToken = default(System.Threading.CancellationToken));
        #endregion Asynchronous Operations
    }

    /// <summary>
    /// Represents a collection of functions to interact with the API endpoints
    /// </summary>
    public interface IPartnersApi : IPartnersApiSync, IPartnersApiAsync
    {

    }

    /// <summary>
    /// Represents a collection of functions to interact with the API endpoints
    /// </summary>
    public partial class PartnersApi : IPartnersApi
    {
        private FactSet.SDK.OpenFactSetMarketplace.Client.ExceptionFactory _exceptionFactory = (name, response) => null;

        # region Response Type Disctionaries
        
        private static readonly Dictionary<HttpStatusCode, System.Type> GetPartnerByIdResponseTypeDictionary = new Dictionary<HttpStatusCode, System.Type>
        {
            { (HttpStatusCode)200, typeof(PartnerSuccessResponse) },
            { (HttpStatusCode)401, typeof(string) },
            { (HttpStatusCode)403, typeof(string) },
            { (HttpStatusCode)404, typeof(ErrorResponse) },
            { (HttpStatusCode)429, typeof(string) },
            { (HttpStatusCode)500, typeof(ErrorResponse) },
        };

        private static readonly Dictionary<HttpStatusCode, System.Type> GetPartnersResponseTypeDictionary = new Dictionary<HttpStatusCode, System.Type>
        {
            { (HttpStatusCode)200, typeof(PartnersSuccessResponse) },
            { (HttpStatusCode)401, typeof(string) },
            { (HttpStatusCode)403, typeof(string) },
            { (HttpStatusCode)429, typeof(string) },
            { (HttpStatusCode)500, typeof(ErrorResponse) },
        };

        # endregion Response Type Disctionaries

        # region Api Response Objects
        

        # endregion Api Response Objects

        /// <summary>
        /// Initializes a new instance of the <see cref="PartnersApi"/> class.
        /// </summary>
        /// <returns></returns>
        public PartnersApi() : this((string)null)
        {
        }

        /// <summary>
        /// Initializes a new instance of the <see cref="PartnersApi"/> class.
        /// </summary>
        /// <returns></returns>
        public PartnersApi(string basePath)
        {
            this.Configuration = FactSet.SDK.OpenFactSetMarketplace.Client.Configuration.MergeConfigurations(
                FactSet.SDK.OpenFactSetMarketplace.Client.GlobalConfiguration.Instance,
                new FactSet.SDK.OpenFactSetMarketplace.Client.Configuration { BasePath = basePath }
            );
            this.Client = new FactSet.SDK.OpenFactSetMarketplace.Client.ApiClient(this.Configuration.BasePath);
            this.AsynchronousClient = new FactSet.SDK.OpenFactSetMarketplace.Client.ApiClient(this.Configuration.BasePath);
            this.ExceptionFactory = FactSet.SDK.OpenFactSetMarketplace.Client.Configuration.DefaultExceptionFactory;
        }

        /// <summary>
        /// Initializes a new instance of the <see cref="PartnersApi"/> class
        /// using Configuration object
        /// </summary>
        /// <param name="configuration">An instance of Configuration</param>
        /// <returns></returns>
        public PartnersApi(FactSet.SDK.OpenFactSetMarketplace.Client.Configuration configuration)
        {
            if (configuration == null) throw new ArgumentNullException("configuration");

            this.Configuration = FactSet.SDK.OpenFactSetMarketplace.Client.Configuration.MergeConfigurations(
                FactSet.SDK.OpenFactSetMarketplace.Client.GlobalConfiguration.Instance,
                configuration
            );
            this.Client = new FactSet.SDK.OpenFactSetMarketplace.Client.ApiClient(this.Configuration.BasePath);
            this.AsynchronousClient = new FactSet.SDK.OpenFactSetMarketplace.Client.ApiClient(this.Configuration.BasePath);
            ExceptionFactory = FactSet.SDK.OpenFactSetMarketplace.Client.Configuration.DefaultExceptionFactory;
        }

        /// <summary>
        /// Initializes a new instance of the <see cref="PartnersApi"/> class
        /// using a Configuration object and client instance.
        /// </summary>
        /// <param name="client">The client interface for synchronous API access.</param>
        /// <param name="asyncClient">The client interface for asynchronous API access.</param>
        /// <param name="configuration">The configuration object.</param>
        public PartnersApi(FactSet.SDK.OpenFactSetMarketplace.Client.ISynchronousClient client, FactSet.SDK.OpenFactSetMarketplace.Client.IAsynchronousClient asyncClient, FactSet.SDK.OpenFactSetMarketplace.Client.IReadableConfiguration configuration)
        {
            if (client == null) throw new ArgumentNullException("client");
            if (asyncClient == null) throw new ArgumentNullException("asyncClient");
            if (configuration == null) throw new ArgumentNullException("configuration");

            this.Client = client;
            this.AsynchronousClient = asyncClient;
            this.Configuration = configuration;
            this.ExceptionFactory = FactSet.SDK.OpenFactSetMarketplace.Client.Configuration.DefaultExceptionFactory;
        }

        /// <summary>
        /// The client for accessing this underlying API asynchronously.
        /// </summary>
        public FactSet.SDK.OpenFactSetMarketplace.Client.IAsynchronousClient AsynchronousClient { get; set; }

        /// <summary>
        /// The client for accessing this underlying API synchronously.
        /// </summary>
        public FactSet.SDK.OpenFactSetMarketplace.Client.ISynchronousClient Client { get; set; }

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
        public FactSet.SDK.OpenFactSetMarketplace.Client.IReadableConfiguration Configuration { get; set; }

        /// <summary>
        /// Provides a factory method hook for the creation of exceptions.
        /// </summary>
        public FactSet.SDK.OpenFactSetMarketplace.Client.ExceptionFactory ExceptionFactory
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
        ///  Get a single FactSet Partner by ID.
        /// </summary>
        /// <exception cref="FactSet.SDK.OpenFactSetMarketplace.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="id">ID of the product or partner</param>
        /// <returns>PartnerSuccessResponse</returns>
        public PartnerSuccessResponse GetPartnerById(string id)
        {
            var localVarResponse = GetPartnerByIdWithHttpInfo(id);
            return localVarResponse.Data;
        }

        /// <summary>
        ///  Get a single FactSet Partner by ID.
        /// </summary>
        /// <exception cref="FactSet.SDK.OpenFactSetMarketplace.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="id">ID of the product or partner</param>
        /// <returns>ApiResponse of PartnerSuccessResponse</returns>
        public ApiResponse<PartnerSuccessResponse> GetPartnerByIdWithHttpInfo(string id)
        {
            // verify the required parameter 'id' is set
            if (id == null)
            {
                throw new FactSet.SDK.OpenFactSetMarketplace.Client.ApiException(400, "Missing required parameter 'id' when calling PartnersApi->GetPartnerById");
            }

            FactSet.SDK.OpenFactSetMarketplace.Client.RequestOptions localVarRequestOptions = new FactSet.SDK.OpenFactSetMarketplace.Client.RequestOptions();

            string[] _contentTypes = new string[] {
            };

            // to determine the Accept header
            string[] _accepts = new string[] {
                "application/json",
                "text/plain"
            };

            var localVarContentType = FactSet.SDK.OpenFactSetMarketplace.Client.ClientUtils.SelectHeaderContentType(_contentTypes);
            if (localVarContentType != null)
            {
                localVarRequestOptions.HeaderParameters.Add("Content-Type", localVarContentType);
            }

            var localVarAccept = FactSet.SDK.OpenFactSetMarketplace.Client.ClientUtils.SelectHeaderAccept(_accepts);
            if (localVarAccept != null)
            {
                localVarRequestOptions.HeaderParameters.Add("Accept", localVarAccept);
            }

            localVarRequestOptions.PathParameters.Add("id", FactSet.SDK.OpenFactSetMarketplace.Client.ClientUtils.ParameterToString(id)); // path parameter

            // authentication (FactSetApiKey) required
            // http basic authentication required
            if (!string.IsNullOrEmpty(this.Configuration.Username) || !string.IsNullOrEmpty(this.Configuration.Password) && !localVarRequestOptions.HeaderParameters.ContainsKey("Authorization"))
            {
                localVarRequestOptions.HeaderParameters.Add("Authorization", "Basic " + FactSet.SDK.OpenFactSetMarketplace.Client.ClientUtils.Base64Encode(this.Configuration.Username + ":" + this.Configuration.Password));
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

            localVarRequestOptions.ResponseTypeDictionary = GetPartnerByIdResponseTypeDictionary;

            // make the HTTP request
            var localVarResponse = this.Client.Get<
            PartnerSuccessResponse>("/partner/{id}", localVarRequestOptions, this.Configuration);
            if (this.ExceptionFactory != null)
            {
                Exception _exception = this.ExceptionFactory("GetPartnerById", localVarResponse);
                if (_exception != null)
                {
                    throw _exception;
                }
            }
            return localVarResponse;
        }

        /// <summary>
        ///  Get a single FactSet Partner by ID.
        /// </summary>
        /// <exception cref="FactSet.SDK.OpenFactSetMarketplace.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="id">ID of the product or partner</param>
        /// <param name="cancellationToken">Cancellation Token to cancel the request.</param>
        /// <returns>Task of PartnerSuccessResponse</returns>
        public async System.Threading.Tasks.Task<PartnerSuccessResponse>GetPartnerByIdAsync(string id, System.Threading.CancellationToken cancellationToken = default(System.Threading.CancellationToken))
        {
            var localVarResponse = await GetPartnerByIdWithHttpInfoAsync(id, cancellationToken).ConfigureAwait(false);
            return localVarResponse.Data;
        }

        /// <summary>
        ///  Get a single FactSet Partner by ID.
        /// </summary>
        /// <exception cref="FactSet.SDK.OpenFactSetMarketplace.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="id">ID of the product or partner</param>
        /// <param name="cancellationToken">Cancellation Token to cancel the request.</param>
        /// <returns>Task of ApiResponse (PartnerSuccessResponse)</returns>

        public async System.Threading.Tasks.Task<ApiResponse<PartnerSuccessResponse>> GetPartnerByIdWithHttpInfoAsync(string id, System.Threading.CancellationToken cancellationToken = default(System.Threading.CancellationToken))
        {
            // verify the required parameter 'id' is set
            if (id == null)
            {
                throw new FactSet.SDK.OpenFactSetMarketplace.Client.ApiException(400, "Missing required parameter 'id' when calling PartnersApi->GetPartnerById");
            }


            FactSet.SDK.OpenFactSetMarketplace.Client.RequestOptions localVarRequestOptions = new FactSet.SDK.OpenFactSetMarketplace.Client.RequestOptions();

            string[] _contentTypes = new string[] {
            };

            // to determine the Accept header
            string[] _accepts = new string[] {
                "application/json",
                "text/plain"
            };

            var localVarContentType = FactSet.SDK.OpenFactSetMarketplace.Client.ClientUtils.SelectHeaderContentType(_contentTypes);
            if (localVarContentType != null)
            {
                localVarRequestOptions.HeaderParameters.Add("Content-Type", localVarContentType);
            }

            var localVarAccept = FactSet.SDK.OpenFactSetMarketplace.Client.ClientUtils.SelectHeaderAccept(_accepts);
            if (localVarAccept != null)
            {
                localVarRequestOptions.HeaderParameters.Add("Accept", localVarAccept);
            }

            localVarRequestOptions.PathParameters.Add("id", FactSet.SDK.OpenFactSetMarketplace.Client.ClientUtils.ParameterToString(id)); // path parameter

            // authentication (FactSetApiKey) required
            // http basic authentication required
            if (!string.IsNullOrEmpty(this.Configuration.Username) || !string.IsNullOrEmpty(this.Configuration.Password) && !localVarRequestOptions.HeaderParameters.ContainsKey("Authorization"))
            {
                localVarRequestOptions.HeaderParameters.Add("Authorization", "Basic " + FactSet.SDK.OpenFactSetMarketplace.Client.ClientUtils.Base64Encode(this.Configuration.Username + ":" + this.Configuration.Password));
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


            localVarRequestOptions.ResponseTypeDictionary = GetPartnerByIdResponseTypeDictionary;

            // make the HTTP request
            var localVarResponse = await this.AsynchronousClient.GetAsync<PartnerSuccessResponse>("/partner/{id}", localVarRequestOptions, this.Configuration, cancellationToken).ConfigureAwait(false);

            if (this.ExceptionFactory != null)
            {
                Exception _exception = this.ExceptionFactory("GetPartnerById", localVarResponse);
                if (_exception != null)
                {
                    throw _exception;
                }
            }

            return localVarResponse;
        }

        /// <summary>
        ///  Get all partners published on FactSet&#39;s Partner Catalog.
        /// </summary>
        /// <exception cref="FactSet.SDK.OpenFactSetMarketplace.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="paginationLimit">Limit for number of records returned per page (optional, default to 10)</param>
        /// <param name="paginationOffset">Specifies the starting point for pagination. This parameter is used to identify the beginning of next set of results. (optional, default to 0)</param>
        /// <returns>PartnersSuccessResponse</returns>
        public PartnersSuccessResponse GetPartners(int? paginationLimit = default(int?), int? paginationOffset = default(int?))
        {
            var localVarResponse = GetPartnersWithHttpInfo(paginationLimit, paginationOffset);
            return localVarResponse.Data;
        }

        /// <summary>
        ///  Get all partners published on FactSet&#39;s Partner Catalog.
        /// </summary>
        /// <exception cref="FactSet.SDK.OpenFactSetMarketplace.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="paginationLimit">Limit for number of records returned per page (optional, default to 10)</param>
        /// <param name="paginationOffset">Specifies the starting point for pagination. This parameter is used to identify the beginning of next set of results. (optional, default to 0)</param>
        /// <returns>ApiResponse of PartnersSuccessResponse</returns>
        public ApiResponse<PartnersSuccessResponse> GetPartnersWithHttpInfo(int? paginationLimit = default(int?), int? paginationOffset = default(int?))
        {
            FactSet.SDK.OpenFactSetMarketplace.Client.RequestOptions localVarRequestOptions = new FactSet.SDK.OpenFactSetMarketplace.Client.RequestOptions();

            string[] _contentTypes = new string[] {
            };

            // to determine the Accept header
            string[] _accepts = new string[] {
                "application/json",
                "text/plain"
            };

            var localVarContentType = FactSet.SDK.OpenFactSetMarketplace.Client.ClientUtils.SelectHeaderContentType(_contentTypes);
            if (localVarContentType != null)
            {
                localVarRequestOptions.HeaderParameters.Add("Content-Type", localVarContentType);
            }

            var localVarAccept = FactSet.SDK.OpenFactSetMarketplace.Client.ClientUtils.SelectHeaderAccept(_accepts);
            if (localVarAccept != null)
            {
                localVarRequestOptions.HeaderParameters.Add("Accept", localVarAccept);
            }

            if (paginationLimit != null)
            {
                localVarRequestOptions.QueryParameters.Add(FactSet.SDK.OpenFactSetMarketplace.Client.ClientUtils.ParameterToMultiMap("", "_paginationLimit", paginationLimit));
            }
            if (paginationOffset != null)
            {
                localVarRequestOptions.QueryParameters.Add(FactSet.SDK.OpenFactSetMarketplace.Client.ClientUtils.ParameterToMultiMap("", "_paginationOffset", paginationOffset));
            }

            // authentication (FactSetApiKey) required
            // http basic authentication required
            if (!string.IsNullOrEmpty(this.Configuration.Username) || !string.IsNullOrEmpty(this.Configuration.Password) && !localVarRequestOptions.HeaderParameters.ContainsKey("Authorization"))
            {
                localVarRequestOptions.HeaderParameters.Add("Authorization", "Basic " + FactSet.SDK.OpenFactSetMarketplace.Client.ClientUtils.Base64Encode(this.Configuration.Username + ":" + this.Configuration.Password));
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

            localVarRequestOptions.ResponseTypeDictionary = GetPartnersResponseTypeDictionary;

            // make the HTTP request
            var localVarResponse = this.Client.Get<
            PartnersSuccessResponse>("/partners", localVarRequestOptions, this.Configuration);
            if (this.ExceptionFactory != null)
            {
                Exception _exception = this.ExceptionFactory("GetPartners", localVarResponse);
                if (_exception != null)
                {
                    throw _exception;
                }
            }
            return localVarResponse;
        }

        /// <summary>
        ///  Get all partners published on FactSet&#39;s Partner Catalog.
        /// </summary>
        /// <exception cref="FactSet.SDK.OpenFactSetMarketplace.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="paginationLimit">Limit for number of records returned per page (optional, default to 10)</param>
        /// <param name="paginationOffset">Specifies the starting point for pagination. This parameter is used to identify the beginning of next set of results. (optional, default to 0)</param>
        /// <param name="cancellationToken">Cancellation Token to cancel the request.</param>
        /// <returns>Task of PartnersSuccessResponse</returns>
        public async System.Threading.Tasks.Task<PartnersSuccessResponse>GetPartnersAsync(int? paginationLimit = default(int?), int? paginationOffset = default(int?), System.Threading.CancellationToken cancellationToken = default(System.Threading.CancellationToken))
        {
            var localVarResponse = await GetPartnersWithHttpInfoAsync(paginationLimit, paginationOffset, cancellationToken).ConfigureAwait(false);
            return localVarResponse.Data;
        }

        /// <summary>
        ///  Get all partners published on FactSet&#39;s Partner Catalog.
        /// </summary>
        /// <exception cref="FactSet.SDK.OpenFactSetMarketplace.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="paginationLimit">Limit for number of records returned per page (optional, default to 10)</param>
        /// <param name="paginationOffset">Specifies the starting point for pagination. This parameter is used to identify the beginning of next set of results. (optional, default to 0)</param>
        /// <param name="cancellationToken">Cancellation Token to cancel the request.</param>
        /// <returns>Task of ApiResponse (PartnersSuccessResponse)</returns>

        public async System.Threading.Tasks.Task<ApiResponse<PartnersSuccessResponse>> GetPartnersWithHttpInfoAsync(int? paginationLimit = default(int?), int? paginationOffset = default(int?), System.Threading.CancellationToken cancellationToken = default(System.Threading.CancellationToken))
        {

            FactSet.SDK.OpenFactSetMarketplace.Client.RequestOptions localVarRequestOptions = new FactSet.SDK.OpenFactSetMarketplace.Client.RequestOptions();

            string[] _contentTypes = new string[] {
            };

            // to determine the Accept header
            string[] _accepts = new string[] {
                "application/json",
                "text/plain"
            };

            var localVarContentType = FactSet.SDK.OpenFactSetMarketplace.Client.ClientUtils.SelectHeaderContentType(_contentTypes);
            if (localVarContentType != null)
            {
                localVarRequestOptions.HeaderParameters.Add("Content-Type", localVarContentType);
            }

            var localVarAccept = FactSet.SDK.OpenFactSetMarketplace.Client.ClientUtils.SelectHeaderAccept(_accepts);
            if (localVarAccept != null)
            {
                localVarRequestOptions.HeaderParameters.Add("Accept", localVarAccept);
            }

            if (paginationLimit != null)
            {
                localVarRequestOptions.QueryParameters.Add(FactSet.SDK.OpenFactSetMarketplace.Client.ClientUtils.ParameterToMultiMap("", "_paginationLimit", paginationLimit));
            }
            if (paginationOffset != null)
            {
                localVarRequestOptions.QueryParameters.Add(FactSet.SDK.OpenFactSetMarketplace.Client.ClientUtils.ParameterToMultiMap("", "_paginationOffset", paginationOffset));
            }

            // authentication (FactSetApiKey) required
            // http basic authentication required
            if (!string.IsNullOrEmpty(this.Configuration.Username) || !string.IsNullOrEmpty(this.Configuration.Password) && !localVarRequestOptions.HeaderParameters.ContainsKey("Authorization"))
            {
                localVarRequestOptions.HeaderParameters.Add("Authorization", "Basic " + FactSet.SDK.OpenFactSetMarketplace.Client.ClientUtils.Base64Encode(this.Configuration.Username + ":" + this.Configuration.Password));
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


            localVarRequestOptions.ResponseTypeDictionary = GetPartnersResponseTypeDictionary;

            // make the HTTP request
            var localVarResponse = await this.AsynchronousClient.GetAsync<PartnersSuccessResponse>("/partners", localVarRequestOptions, this.Configuration, cancellationToken).ConfigureAwait(false);

            if (this.ExceptionFactory != null)
            {
                Exception _exception = this.ExceptionFactory("GetPartners", localVarResponse);
                if (_exception != null)
                {
                    throw _exception;
                }
            }

            return localVarResponse;
        }

    }
}
