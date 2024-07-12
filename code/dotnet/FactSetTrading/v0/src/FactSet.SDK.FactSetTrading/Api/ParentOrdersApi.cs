/*
 * Trading API
 *
 * Allow clients to trade orders.
 *
 * The version of the OpenAPI document: 0.5.0
 * Contact: api@factset.com
 * Generated by: https://github.com/openapitools/openapi-generator.git
 */


using System;
using System.Collections.Generic;
using System.Collections.ObjectModel;
using System.Linq;
using System.Net;
using System.Net.Mime;
using FactSet.SDK.FactSetTrading.Client;
using FactSet.SDK.FactSetTrading.Model;
using FactSet.SDK.Utils.Authentication;

namespace FactSet.SDK.FactSetTrading.Api
{

    /// <summary>
    /// Represents a collection of functions to interact with the API endpoints
    /// </summary>
    public interface IParentOrdersApiSync : IApiAccessor
    {
        #region Synchronous Operations
        /// <summary>
        /// Update Parent Orders
        /// </summary>
        /// <remarks>
        /// This endpoint allows the user to update parent orders which are already present in Trading system.
        /// </remarks>
        /// <exception cref="FactSet.SDK.FactSetTrading.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="parentOrdersUpdateRoot"> (optional)</param>
        /// <returns>ParentOrdersUpdateResponseRoot</returns>
        ParentOrdersUpdateResponseRoot UpdateParentOrder(ParentOrdersUpdateRoot parentOrdersUpdateRoot = default(ParentOrdersUpdateRoot));

        /// <summary>
        /// Update Parent Orders
        /// </summary>
        /// <remarks>
        /// This endpoint allows the user to update parent orders which are already present in Trading system.
        /// </remarks>
        /// <exception cref="FactSet.SDK.FactSetTrading.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="parentOrdersUpdateRoot"> (optional)</param>
        /// <returns>ApiResponse of ParentOrdersUpdateResponseRoot</returns>
        ApiResponse<ParentOrdersUpdateResponseRoot> UpdateParentOrderWithHttpInfo(ParentOrdersUpdateRoot parentOrdersUpdateRoot = default(ParentOrdersUpdateRoot));
        #endregion Synchronous Operations
    }

    /// <summary>
    /// Represents a collection of functions to interact with the API endpoints
    /// </summary>
    public interface IParentOrdersApiAsync : IApiAccessor
    {
        #region Asynchronous Operations
        /// <summary>
        /// Update Parent Orders
        /// </summary>
        /// <remarks>
        /// This endpoint allows the user to update parent orders which are already present in Trading system.
        /// </remarks>
        /// <exception cref="FactSet.SDK.FactSetTrading.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="parentOrdersUpdateRoot"> (optional)</param>
        /// <param name="cancellationToken">Cancellation Token to cancel the request.</param>
        /// <returns>Task of ParentOrdersUpdateResponseRoot</returns>
        System.Threading.Tasks.Task<ParentOrdersUpdateResponseRoot> UpdateParentOrderAsync(ParentOrdersUpdateRoot parentOrdersUpdateRoot = default(ParentOrdersUpdateRoot), System.Threading.CancellationToken cancellationToken = default(System.Threading.CancellationToken));

        /// <summary>
        /// Update Parent Orders
        /// </summary>
        /// <remarks>
        /// This endpoint allows the user to update parent orders which are already present in Trading system.
        /// </remarks>
        /// <exception cref="FactSet.SDK.FactSetTrading.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="parentOrdersUpdateRoot"> (optional)</param>
        /// <param name="cancellationToken">Cancellation Token to cancel the request.</param>
        /// <returns>Task of ApiResponse (ParentOrdersUpdateResponseRoot)</returns>
        System.Threading.Tasks.Task<ApiResponse<ParentOrdersUpdateResponseRoot>> UpdateParentOrderWithHttpInfoAsync(ParentOrdersUpdateRoot parentOrdersUpdateRoot = default(ParentOrdersUpdateRoot), System.Threading.CancellationToken cancellationToken = default(System.Threading.CancellationToken));
        #endregion Asynchronous Operations
    }

    /// <summary>
    /// Represents a collection of functions to interact with the API endpoints
    /// </summary>
    public interface IParentOrdersApi : IParentOrdersApiSync, IParentOrdersApiAsync
    {

    }

    /// <summary>
    /// Represents a collection of functions to interact with the API endpoints
    /// </summary>
    public partial class ParentOrdersApi : IParentOrdersApi
    {
        private FactSet.SDK.FactSetTrading.Client.ExceptionFactory _exceptionFactory = (name, response) => null;

        # region Response Type Disctionaries
        
        private static readonly Dictionary<HttpStatusCode, System.Type> UpdateParentOrderResponseTypeDictionary = new Dictionary<HttpStatusCode, System.Type>
        {
            { (HttpStatusCode)200, typeof(ParentOrdersUpdateResponseRoot) },
            { (HttpStatusCode)400, typeof(ClientErrorResponse) },
        };

        # endregion Response Type Disctionaries

        # region Api Response Objects
        

        # endregion Api Response Objects

        /// <summary>
        /// Initializes a new instance of the <see cref="ParentOrdersApi"/> class.
        /// </summary>
        /// <returns></returns>
        public ParentOrdersApi() : this((string)null)
        {
        }

        /// <summary>
        /// Initializes a new instance of the <see cref="ParentOrdersApi"/> class.
        /// </summary>
        /// <returns></returns>
        public ParentOrdersApi(string basePath)
        {
            this.Configuration = FactSet.SDK.FactSetTrading.Client.Configuration.MergeConfigurations(
                FactSet.SDK.FactSetTrading.Client.GlobalConfiguration.Instance,
                new FactSet.SDK.FactSetTrading.Client.Configuration { BasePath = basePath }
            );
            this.Client = new FactSet.SDK.FactSetTrading.Client.ApiClient(this.Configuration.BasePath);
            this.AsynchronousClient = new FactSet.SDK.FactSetTrading.Client.ApiClient(this.Configuration.BasePath);
            this.ExceptionFactory = FactSet.SDK.FactSetTrading.Client.Configuration.DefaultExceptionFactory;
        }

        /// <summary>
        /// Initializes a new instance of the <see cref="ParentOrdersApi"/> class
        /// using Configuration object
        /// </summary>
        /// <param name="configuration">An instance of Configuration</param>
        /// <returns></returns>
        public ParentOrdersApi(FactSet.SDK.FactSetTrading.Client.Configuration configuration)
        {
            if (configuration == null) throw new ArgumentNullException("configuration");

            this.Configuration = FactSet.SDK.FactSetTrading.Client.Configuration.MergeConfigurations(
                FactSet.SDK.FactSetTrading.Client.GlobalConfiguration.Instance,
                configuration
            );
            this.Client = new FactSet.SDK.FactSetTrading.Client.ApiClient(this.Configuration.BasePath);
            this.AsynchronousClient = new FactSet.SDK.FactSetTrading.Client.ApiClient(this.Configuration.BasePath);
            ExceptionFactory = FactSet.SDK.FactSetTrading.Client.Configuration.DefaultExceptionFactory;
        }

        /// <summary>
        /// Initializes a new instance of the <see cref="ParentOrdersApi"/> class
        /// using a Configuration object and client instance.
        /// </summary>
        /// <param name="client">The client interface for synchronous API access.</param>
        /// <param name="asyncClient">The client interface for asynchronous API access.</param>
        /// <param name="configuration">The configuration object.</param>
        public ParentOrdersApi(FactSet.SDK.FactSetTrading.Client.ISynchronousClient client, FactSet.SDK.FactSetTrading.Client.IAsynchronousClient asyncClient, FactSet.SDK.FactSetTrading.Client.IReadableConfiguration configuration)
        {
            if (client == null) throw new ArgumentNullException("client");
            if (asyncClient == null) throw new ArgumentNullException("asyncClient");
            if (configuration == null) throw new ArgumentNullException("configuration");

            this.Client = client;
            this.AsynchronousClient = asyncClient;
            this.Configuration = configuration;
            this.ExceptionFactory = FactSet.SDK.FactSetTrading.Client.Configuration.DefaultExceptionFactory;
        }

        /// <summary>
        /// The client for accessing this underlying API asynchronously.
        /// </summary>
        public FactSet.SDK.FactSetTrading.Client.IAsynchronousClient AsynchronousClient { get; set; }

        /// <summary>
        /// The client for accessing this underlying API synchronously.
        /// </summary>
        public FactSet.SDK.FactSetTrading.Client.ISynchronousClient Client { get; set; }

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
        public FactSet.SDK.FactSetTrading.Client.IReadableConfiguration Configuration { get; set; }

        /// <summary>
        /// Provides a factory method hook for the creation of exceptions.
        /// </summary>
        public FactSet.SDK.FactSetTrading.Client.ExceptionFactory ExceptionFactory
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
        /// Update Parent Orders This endpoint allows the user to update parent orders which are already present in Trading system.
        /// </summary>
        /// <exception cref="FactSet.SDK.FactSetTrading.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="parentOrdersUpdateRoot"> (optional)</param>
        /// <returns>ParentOrdersUpdateResponseRoot</returns>
        public ParentOrdersUpdateResponseRoot UpdateParentOrder(ParentOrdersUpdateRoot parentOrdersUpdateRoot = default(ParentOrdersUpdateRoot))
        {
            var localVarResponse = UpdateParentOrderWithHttpInfo(parentOrdersUpdateRoot);
            return localVarResponse.Data;
        }

        /// <summary>
        /// Update Parent Orders This endpoint allows the user to update parent orders which are already present in Trading system.
        /// </summary>
        /// <exception cref="FactSet.SDK.FactSetTrading.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="parentOrdersUpdateRoot"> (optional)</param>
        /// <returns>ApiResponse of ParentOrdersUpdateResponseRoot</returns>
        public ApiResponse<ParentOrdersUpdateResponseRoot> UpdateParentOrderWithHttpInfo(ParentOrdersUpdateRoot parentOrdersUpdateRoot = default(ParentOrdersUpdateRoot))
        {
            FactSet.SDK.FactSetTrading.Client.RequestOptions localVarRequestOptions = new FactSet.SDK.FactSetTrading.Client.RequestOptions();

            string[] _contentTypes = new string[] {
                "application/json"
            };

            // to determine the Accept header
            string[] _accepts = new string[] {
                "application/json"
            };

            var localVarContentType = FactSet.SDK.FactSetTrading.Client.ClientUtils.SelectHeaderContentType(_contentTypes);
            if (localVarContentType != null)
            {
                localVarRequestOptions.HeaderParameters.Add("Content-Type", localVarContentType);
            }

            var localVarAccept = FactSet.SDK.FactSetTrading.Client.ClientUtils.SelectHeaderAccept(_accepts);
            if (localVarAccept != null)
            {
                localVarRequestOptions.HeaderParameters.Add("Accept", localVarAccept);
            }

            localVarRequestOptions.Data = parentOrdersUpdateRoot;

            // authentication (FactSetApiKey) required
            // http basic authentication required
            if (!string.IsNullOrEmpty(this.Configuration.Username) || !string.IsNullOrEmpty(this.Configuration.Password) && !localVarRequestOptions.HeaderParameters.ContainsKey("Authorization"))
            {
                localVarRequestOptions.HeaderParameters.Add("Authorization", "Basic " + FactSet.SDK.FactSetTrading.Client.ClientUtils.Base64Encode(this.Configuration.Username + ":" + this.Configuration.Password));
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

            localVarRequestOptions.ResponseTypeDictionary = UpdateParentOrderResponseTypeDictionary;

            // make the HTTP request
            var localVarResponse = this.Client.Put<
            ParentOrdersUpdateResponseRoot>("/parent-orders/update", localVarRequestOptions, this.Configuration);
            if (this.ExceptionFactory != null)
            {
                Exception _exception = this.ExceptionFactory("UpdateParentOrder", localVarResponse);
                if (_exception != null)
                {
                    throw _exception;
                }
            }
            return localVarResponse;
        }

        /// <summary>
        /// Update Parent Orders This endpoint allows the user to update parent orders which are already present in Trading system.
        /// </summary>
        /// <exception cref="FactSet.SDK.FactSetTrading.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="parentOrdersUpdateRoot"> (optional)</param>
        /// <param name="cancellationToken">Cancellation Token to cancel the request.</param>
        /// <returns>Task of ParentOrdersUpdateResponseRoot</returns>
        public async System.Threading.Tasks.Task<ParentOrdersUpdateResponseRoot>UpdateParentOrderAsync(ParentOrdersUpdateRoot parentOrdersUpdateRoot = default(ParentOrdersUpdateRoot), System.Threading.CancellationToken cancellationToken = default(System.Threading.CancellationToken))
        {
            var localVarResponse = await UpdateParentOrderWithHttpInfoAsync(parentOrdersUpdateRoot, cancellationToken).ConfigureAwait(false);
            return localVarResponse.Data;
        }

        /// <summary>
        /// Update Parent Orders This endpoint allows the user to update parent orders which are already present in Trading system.
        /// </summary>
        /// <exception cref="FactSet.SDK.FactSetTrading.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="parentOrdersUpdateRoot"> (optional)</param>
        /// <param name="cancellationToken">Cancellation Token to cancel the request.</param>
        /// <returns>Task of ApiResponse (ParentOrdersUpdateResponseRoot)</returns>

        public async System.Threading.Tasks.Task<ApiResponse<ParentOrdersUpdateResponseRoot>> UpdateParentOrderWithHttpInfoAsync(ParentOrdersUpdateRoot parentOrdersUpdateRoot = default(ParentOrdersUpdateRoot), System.Threading.CancellationToken cancellationToken = default(System.Threading.CancellationToken))
        {

            FactSet.SDK.FactSetTrading.Client.RequestOptions localVarRequestOptions = new FactSet.SDK.FactSetTrading.Client.RequestOptions();

            string[] _contentTypes = new string[] {
                "application/json"
            };

            // to determine the Accept header
            string[] _accepts = new string[] {
                "application/json"
            };

            var localVarContentType = FactSet.SDK.FactSetTrading.Client.ClientUtils.SelectHeaderContentType(_contentTypes);
            if (localVarContentType != null)
            {
                localVarRequestOptions.HeaderParameters.Add("Content-Type", localVarContentType);
            }

            var localVarAccept = FactSet.SDK.FactSetTrading.Client.ClientUtils.SelectHeaderAccept(_accepts);
            if (localVarAccept != null)
            {
                localVarRequestOptions.HeaderParameters.Add("Accept", localVarAccept);
            }

            localVarRequestOptions.Data = parentOrdersUpdateRoot;

            // authentication (FactSetApiKey) required
            // http basic authentication required
            if (!string.IsNullOrEmpty(this.Configuration.Username) || !string.IsNullOrEmpty(this.Configuration.Password) && !localVarRequestOptions.HeaderParameters.ContainsKey("Authorization"))
            {
                localVarRequestOptions.HeaderParameters.Add("Authorization", "Basic " + FactSet.SDK.FactSetTrading.Client.ClientUtils.Base64Encode(this.Configuration.Username + ":" + this.Configuration.Password));
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


            localVarRequestOptions.ResponseTypeDictionary = UpdateParentOrderResponseTypeDictionary;

            // make the HTTP request
            var localVarResponse = await this.AsynchronousClient.PutAsync<ParentOrdersUpdateResponseRoot>("/parent-orders/update", localVarRequestOptions, this.Configuration, cancellationToken).ConfigureAwait(false);

            if (this.ExceptionFactory != null)
            {
                Exception _exception = this.ExceptionFactory("UpdateParentOrder", localVarResponse);
                if (_exception != null)
                {
                    throw _exception;
                }
            }

            return localVarResponse;
        }

    }
}
