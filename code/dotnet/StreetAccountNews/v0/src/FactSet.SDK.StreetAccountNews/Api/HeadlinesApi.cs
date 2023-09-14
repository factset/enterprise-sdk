/*
 * StreetAccount API
 *
 * Collection of endpoints for retrieving StreetAccount headlines and filters
 *
 * The version of the OpenAPI document: 0.1.0
 * Contact: api@factset.com
 * Generated by: https://github.com/openapitools/openapi-generator.git
 */


using System;
using System.Collections.Generic;
using System.Collections.ObjectModel;
using System.Linq;
using System.Net;
using System.Net.Mime;
using FactSet.SDK.StreetAccountNews.Client;
using FactSet.SDK.StreetAccountNews.Model;
using FactSet.SDK.Utils.Authentication;

namespace FactSet.SDK.StreetAccountNews.Api
{

    /// <summary>
    /// Represents a collection of functions to interact with the API endpoints
    /// </summary>
    public interface IHeadlinesApiSync : IApiAccessor
    {
        #region Synchronous Operations
        /// <summary>
        /// Retrieve StreetAccount headlines for given filters
        /// </summary>
        /// <remarks>
        /// This endpoint will pull all headlines produced by StreetAccount and the full story body will be returned by the data set. Filters can be specified via the endpoint below.
        /// </remarks>
        /// <exception cref="FactSet.SDK.StreetAccountNews.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="saHeadlinesRequest">Filter Body which needs to be sent with request (optional)</param>
        /// <returns>SearchResponse</returns>
        SearchResponse GetStreetAccountHeadlines(SaHeadlinesRequest saHeadlinesRequest = default(SaHeadlinesRequest));

        /// <summary>
        /// Retrieve StreetAccount headlines for given filters
        /// </summary>
        /// <remarks>
        /// This endpoint will pull all headlines produced by StreetAccount and the full story body will be returned by the data set. Filters can be specified via the endpoint below.
        /// </remarks>
        /// <exception cref="FactSet.SDK.StreetAccountNews.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="saHeadlinesRequest">Filter Body which needs to be sent with request (optional)</param>
        /// <returns>ApiResponse of SearchResponse</returns>
        ApiResponse<SearchResponse> GetStreetAccountHeadlinesWithHttpInfo(SaHeadlinesRequest saHeadlinesRequest = default(SaHeadlinesRequest));
        /// <summary>
        /// Retrieve StreetAccount headlines for given view
        /// </summary>
        /// <remarks>
        /// This endpoint allows you to pull all headlines produced by StreetAccount for a saved view. The full story body will be returned by the data set. Views can be created via the ‘Create Views’ endpoint.
        /// </remarks>
        /// <exception cref="FactSet.SDK.StreetAccountNews.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="id">view id of the view to return headlines for</param>
        /// <param name="saHeadlinesRequestByView">View body which needs to be sent with request (optional)</param>
        /// <returns>SearchResponse</returns>
        SearchResponse GetStreetAccountHeadlinesByView(string id, SaHeadlinesRequestByView saHeadlinesRequestByView = default(SaHeadlinesRequestByView));

        /// <summary>
        /// Retrieve StreetAccount headlines for given view
        /// </summary>
        /// <remarks>
        /// This endpoint allows you to pull all headlines produced by StreetAccount for a saved view. The full story body will be returned by the data set. Views can be created via the ‘Create Views’ endpoint.
        /// </remarks>
        /// <exception cref="FactSet.SDK.StreetAccountNews.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="id">view id of the view to return headlines for</param>
        /// <param name="saHeadlinesRequestByView">View body which needs to be sent with request (optional)</param>
        /// <returns>ApiResponse of SearchResponse</returns>
        ApiResponse<SearchResponse> GetStreetAccountHeadlinesByViewWithHttpInfo(string id, SaHeadlinesRequestByView saHeadlinesRequestByView = default(SaHeadlinesRequestByView));
        #endregion Synchronous Operations
    }

    /// <summary>
    /// Represents a collection of functions to interact with the API endpoints
    /// </summary>
    public interface IHeadlinesApiAsync : IApiAccessor
    {
        #region Asynchronous Operations
        /// <summary>
        /// Retrieve StreetAccount headlines for given filters
        /// </summary>
        /// <remarks>
        /// This endpoint will pull all headlines produced by StreetAccount and the full story body will be returned by the data set. Filters can be specified via the endpoint below.
        /// </remarks>
        /// <exception cref="FactSet.SDK.StreetAccountNews.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="saHeadlinesRequest">Filter Body which needs to be sent with request (optional)</param>
        /// <param name="cancellationToken">Cancellation Token to cancel the request.</param>
        /// <returns>Task of SearchResponse</returns>
        System.Threading.Tasks.Task<SearchResponse> GetStreetAccountHeadlinesAsync(SaHeadlinesRequest saHeadlinesRequest = default(SaHeadlinesRequest), System.Threading.CancellationToken cancellationToken = default(System.Threading.CancellationToken));

        /// <summary>
        /// Retrieve StreetAccount headlines for given filters
        /// </summary>
        /// <remarks>
        /// This endpoint will pull all headlines produced by StreetAccount and the full story body will be returned by the data set. Filters can be specified via the endpoint below.
        /// </remarks>
        /// <exception cref="FactSet.SDK.StreetAccountNews.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="saHeadlinesRequest">Filter Body which needs to be sent with request (optional)</param>
        /// <param name="cancellationToken">Cancellation Token to cancel the request.</param>
        /// <returns>Task of ApiResponse (SearchResponse)</returns>
        System.Threading.Tasks.Task<ApiResponse<SearchResponse>> GetStreetAccountHeadlinesWithHttpInfoAsync(SaHeadlinesRequest saHeadlinesRequest = default(SaHeadlinesRequest), System.Threading.CancellationToken cancellationToken = default(System.Threading.CancellationToken));
        /// <summary>
        /// Retrieve StreetAccount headlines for given view
        /// </summary>
        /// <remarks>
        /// This endpoint allows you to pull all headlines produced by StreetAccount for a saved view. The full story body will be returned by the data set. Views can be created via the ‘Create Views’ endpoint.
        /// </remarks>
        /// <exception cref="FactSet.SDK.StreetAccountNews.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="id">view id of the view to return headlines for</param>
        /// <param name="saHeadlinesRequestByView">View body which needs to be sent with request (optional)</param>
        /// <param name="cancellationToken">Cancellation Token to cancel the request.</param>
        /// <returns>Task of SearchResponse</returns>
        System.Threading.Tasks.Task<SearchResponse> GetStreetAccountHeadlinesByViewAsync(string id, SaHeadlinesRequestByView saHeadlinesRequestByView = default(SaHeadlinesRequestByView), System.Threading.CancellationToken cancellationToken = default(System.Threading.CancellationToken));

        /// <summary>
        /// Retrieve StreetAccount headlines for given view
        /// </summary>
        /// <remarks>
        /// This endpoint allows you to pull all headlines produced by StreetAccount for a saved view. The full story body will be returned by the data set. Views can be created via the ‘Create Views’ endpoint.
        /// </remarks>
        /// <exception cref="FactSet.SDK.StreetAccountNews.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="id">view id of the view to return headlines for</param>
        /// <param name="saHeadlinesRequestByView">View body which needs to be sent with request (optional)</param>
        /// <param name="cancellationToken">Cancellation Token to cancel the request.</param>
        /// <returns>Task of ApiResponse (SearchResponse)</returns>
        System.Threading.Tasks.Task<ApiResponse<SearchResponse>> GetStreetAccountHeadlinesByViewWithHttpInfoAsync(string id, SaHeadlinesRequestByView saHeadlinesRequestByView = default(SaHeadlinesRequestByView), System.Threading.CancellationToken cancellationToken = default(System.Threading.CancellationToken));
        #endregion Asynchronous Operations
    }

    /// <summary>
    /// Represents a collection of functions to interact with the API endpoints
    /// </summary>
    public interface IHeadlinesApi : IHeadlinesApiSync, IHeadlinesApiAsync
    {

    }

    /// <summary>
    /// Represents a collection of functions to interact with the API endpoints
    /// </summary>
    public partial class HeadlinesApi : IHeadlinesApi
    {
        private FactSet.SDK.StreetAccountNews.Client.ExceptionFactory _exceptionFactory = (name, response) => null;

        # region Response Type Disctionaries
        
        private static readonly Dictionary<HttpStatusCode, System.Type> GetStreetAccountHeadlinesResponseTypeDictionary = new Dictionary<HttpStatusCode, System.Type>
        {
            { (HttpStatusCode)200, typeof(SearchResponse) },
            { (HttpStatusCode)400, typeof(Error) },
            { (HttpStatusCode)401, typeof(Error) },
            { (HttpStatusCode)404, typeof(Error) },
        };

        private static readonly Dictionary<HttpStatusCode, System.Type> GetStreetAccountHeadlinesByViewResponseTypeDictionary = new Dictionary<HttpStatusCode, System.Type>
        {
            { (HttpStatusCode)200, typeof(SearchResponse) },
            { (HttpStatusCode)400, typeof(Error) },
            { (HttpStatusCode)401, typeof(Error) },
            { (HttpStatusCode)404, typeof(Error) },
        };

        # endregion Response Type Disctionaries

        # region Api Response Objects
        

        # endregion Api Response Objects

        /// <summary>
        /// Initializes a new instance of the <see cref="HeadlinesApi"/> class.
        /// </summary>
        /// <returns></returns>
        public HeadlinesApi() : this((string)null)
        {
        }

        /// <summary>
        /// Initializes a new instance of the <see cref="HeadlinesApi"/> class.
        /// </summary>
        /// <returns></returns>
        public HeadlinesApi(string basePath)
        {
            this.Configuration = FactSet.SDK.StreetAccountNews.Client.Configuration.MergeConfigurations(
                FactSet.SDK.StreetAccountNews.Client.GlobalConfiguration.Instance,
                new FactSet.SDK.StreetAccountNews.Client.Configuration { BasePath = basePath }
            );
            this.Client = new FactSet.SDK.StreetAccountNews.Client.ApiClient(this.Configuration.BasePath);
            this.AsynchronousClient = new FactSet.SDK.StreetAccountNews.Client.ApiClient(this.Configuration.BasePath);
            this.ExceptionFactory = FactSet.SDK.StreetAccountNews.Client.Configuration.DefaultExceptionFactory;
        }

        /// <summary>
        /// Initializes a new instance of the <see cref="HeadlinesApi"/> class
        /// using Configuration object
        /// </summary>
        /// <param name="configuration">An instance of Configuration</param>
        /// <returns></returns>
        public HeadlinesApi(FactSet.SDK.StreetAccountNews.Client.Configuration configuration)
        {
            if (configuration == null) throw new ArgumentNullException("configuration");

            this.Configuration = FactSet.SDK.StreetAccountNews.Client.Configuration.MergeConfigurations(
                FactSet.SDK.StreetAccountNews.Client.GlobalConfiguration.Instance,
                configuration
            );
            this.Client = new FactSet.SDK.StreetAccountNews.Client.ApiClient(this.Configuration.BasePath);
            this.AsynchronousClient = new FactSet.SDK.StreetAccountNews.Client.ApiClient(this.Configuration.BasePath);
            ExceptionFactory = FactSet.SDK.StreetAccountNews.Client.Configuration.DefaultExceptionFactory;
        }

        /// <summary>
        /// Initializes a new instance of the <see cref="HeadlinesApi"/> class
        /// using a Configuration object and client instance.
        /// </summary>
        /// <param name="client">The client interface for synchronous API access.</param>
        /// <param name="asyncClient">The client interface for asynchronous API access.</param>
        /// <param name="configuration">The configuration object.</param>
        public HeadlinesApi(FactSet.SDK.StreetAccountNews.Client.ISynchronousClient client, FactSet.SDK.StreetAccountNews.Client.IAsynchronousClient asyncClient, FactSet.SDK.StreetAccountNews.Client.IReadableConfiguration configuration)
        {
            if (client == null) throw new ArgumentNullException("client");
            if (asyncClient == null) throw new ArgumentNullException("asyncClient");
            if (configuration == null) throw new ArgumentNullException("configuration");

            this.Client = client;
            this.AsynchronousClient = asyncClient;
            this.Configuration = configuration;
            this.ExceptionFactory = FactSet.SDK.StreetAccountNews.Client.Configuration.DefaultExceptionFactory;
        }

        /// <summary>
        /// The client for accessing this underlying API asynchronously.
        /// </summary>
        public FactSet.SDK.StreetAccountNews.Client.IAsynchronousClient AsynchronousClient { get; set; }

        /// <summary>
        /// The client for accessing this underlying API synchronously.
        /// </summary>
        public FactSet.SDK.StreetAccountNews.Client.ISynchronousClient Client { get; set; }

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
        public FactSet.SDK.StreetAccountNews.Client.IReadableConfiguration Configuration { get; set; }

        /// <summary>
        /// Provides a factory method hook for the creation of exceptions.
        /// </summary>
        public FactSet.SDK.StreetAccountNews.Client.ExceptionFactory ExceptionFactory
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
        /// Retrieve StreetAccount headlines for given filters This endpoint will pull all headlines produced by StreetAccount and the full story body will be returned by the data set. Filters can be specified via the endpoint below.
        /// </summary>
        /// <exception cref="FactSet.SDK.StreetAccountNews.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="saHeadlinesRequest">Filter Body which needs to be sent with request (optional)</param>
        /// <returns>SearchResponse</returns>
        public SearchResponse GetStreetAccountHeadlines(SaHeadlinesRequest saHeadlinesRequest = default(SaHeadlinesRequest))
        {
            var localVarResponse = GetStreetAccountHeadlinesWithHttpInfo(saHeadlinesRequest);
            return localVarResponse.Data;
        }

        /// <summary>
        /// Retrieve StreetAccount headlines for given filters This endpoint will pull all headlines produced by StreetAccount and the full story body will be returned by the data set. Filters can be specified via the endpoint below.
        /// </summary>
        /// <exception cref="FactSet.SDK.StreetAccountNews.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="saHeadlinesRequest">Filter Body which needs to be sent with request (optional)</param>
        /// <returns>ApiResponse of SearchResponse</returns>
        public ApiResponse<SearchResponse> GetStreetAccountHeadlinesWithHttpInfo(SaHeadlinesRequest saHeadlinesRequest = default(SaHeadlinesRequest))
        {
            FactSet.SDK.StreetAccountNews.Client.RequestOptions localVarRequestOptions = new FactSet.SDK.StreetAccountNews.Client.RequestOptions();

            string[] _contentTypes = new string[] {
                "application/json"
            };

            // to determine the Accept header
            string[] _accepts = new string[] {
                "application/json"
            };

            var localVarContentType = FactSet.SDK.StreetAccountNews.Client.ClientUtils.SelectHeaderContentType(_contentTypes);
            if (localVarContentType != null)
            {
                localVarRequestOptions.HeaderParameters.Add("Content-Type", localVarContentType);
            }

            var localVarAccept = FactSet.SDK.StreetAccountNews.Client.ClientUtils.SelectHeaderAccept(_accepts);
            if (localVarAccept != null)
            {
                localVarRequestOptions.HeaderParameters.Add("Accept", localVarAccept);
            }

            localVarRequestOptions.Data = saHeadlinesRequest;

            // authentication (FactSetApiKey) required
            // http basic authentication required
            if (!string.IsNullOrEmpty(this.Configuration.Username) || !string.IsNullOrEmpty(this.Configuration.Password) && !localVarRequestOptions.HeaderParameters.ContainsKey("Authorization"))
            {
                localVarRequestOptions.HeaderParameters.Add("Authorization", "Basic " + FactSet.SDK.StreetAccountNews.Client.ClientUtils.Base64Encode(this.Configuration.Username + ":" + this.Configuration.Password));
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

            localVarRequestOptions.ResponseTypeDictionary = GetStreetAccountHeadlinesResponseTypeDictionary;

            // make the HTTP request
            var localVarResponse = this.Client.Post<
            SearchResponse>("/streetaccount/headlines", localVarRequestOptions, this.Configuration);
            if (this.ExceptionFactory != null)
            {
                Exception _exception = this.ExceptionFactory("GetStreetAccountHeadlines", localVarResponse);
                if (_exception != null)
                {
                    throw _exception;
                }
            }
            return localVarResponse;
        }

        /// <summary>
        /// Retrieve StreetAccount headlines for given filters This endpoint will pull all headlines produced by StreetAccount and the full story body will be returned by the data set. Filters can be specified via the endpoint below.
        /// </summary>
        /// <exception cref="FactSet.SDK.StreetAccountNews.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="saHeadlinesRequest">Filter Body which needs to be sent with request (optional)</param>
        /// <param name="cancellationToken">Cancellation Token to cancel the request.</param>
        /// <returns>Task of SearchResponse</returns>
        public async System.Threading.Tasks.Task<SearchResponse>GetStreetAccountHeadlinesAsync(SaHeadlinesRequest saHeadlinesRequest = default(SaHeadlinesRequest), System.Threading.CancellationToken cancellationToken = default(System.Threading.CancellationToken))
        {
            var localVarResponse = await GetStreetAccountHeadlinesWithHttpInfoAsync(saHeadlinesRequest, cancellationToken).ConfigureAwait(false);
            return localVarResponse.Data;
        }

        /// <summary>
        /// Retrieve StreetAccount headlines for given filters This endpoint will pull all headlines produced by StreetAccount and the full story body will be returned by the data set. Filters can be specified via the endpoint below.
        /// </summary>
        /// <exception cref="FactSet.SDK.StreetAccountNews.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="saHeadlinesRequest">Filter Body which needs to be sent with request (optional)</param>
        /// <param name="cancellationToken">Cancellation Token to cancel the request.</param>
        /// <returns>Task of ApiResponse (SearchResponse)</returns>

        public async System.Threading.Tasks.Task<ApiResponse<SearchResponse>> GetStreetAccountHeadlinesWithHttpInfoAsync(SaHeadlinesRequest saHeadlinesRequest = default(SaHeadlinesRequest), System.Threading.CancellationToken cancellationToken = default(System.Threading.CancellationToken))
        {

            FactSet.SDK.StreetAccountNews.Client.RequestOptions localVarRequestOptions = new FactSet.SDK.StreetAccountNews.Client.RequestOptions();

            string[] _contentTypes = new string[] {
                "application/json"
            };

            // to determine the Accept header
            string[] _accepts = new string[] {
                "application/json"
            };

            var localVarContentType = FactSet.SDK.StreetAccountNews.Client.ClientUtils.SelectHeaderContentType(_contentTypes);
            if (localVarContentType != null)
            {
                localVarRequestOptions.HeaderParameters.Add("Content-Type", localVarContentType);
            }

            var localVarAccept = FactSet.SDK.StreetAccountNews.Client.ClientUtils.SelectHeaderAccept(_accepts);
            if (localVarAccept != null)
            {
                localVarRequestOptions.HeaderParameters.Add("Accept", localVarAccept);
            }

            localVarRequestOptions.Data = saHeadlinesRequest;

            // authentication (FactSetApiKey) required
            // http basic authentication required
            if (!string.IsNullOrEmpty(this.Configuration.Username) || !string.IsNullOrEmpty(this.Configuration.Password) && !localVarRequestOptions.HeaderParameters.ContainsKey("Authorization"))
            {
                localVarRequestOptions.HeaderParameters.Add("Authorization", "Basic " + FactSet.SDK.StreetAccountNews.Client.ClientUtils.Base64Encode(this.Configuration.Username + ":" + this.Configuration.Password));
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


            localVarRequestOptions.ResponseTypeDictionary = GetStreetAccountHeadlinesResponseTypeDictionary;

            // make the HTTP request
            var localVarResponse = await this.AsynchronousClient.PostAsync<SearchResponse>("/streetaccount/headlines", localVarRequestOptions, this.Configuration, cancellationToken).ConfigureAwait(false);

            if (this.ExceptionFactory != null)
            {
                Exception _exception = this.ExceptionFactory("GetStreetAccountHeadlines", localVarResponse);
                if (_exception != null)
                {
                    throw _exception;
                }
            }

            return localVarResponse;
        }

        /// <summary>
        /// Retrieve StreetAccount headlines for given view This endpoint allows you to pull all headlines produced by StreetAccount for a saved view. The full story body will be returned by the data set. Views can be created via the ‘Create Views’ endpoint.
        /// </summary>
        /// <exception cref="FactSet.SDK.StreetAccountNews.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="id">view id of the view to return headlines for</param>
        /// <param name="saHeadlinesRequestByView">View body which needs to be sent with request (optional)</param>
        /// <returns>SearchResponse</returns>
        public SearchResponse GetStreetAccountHeadlinesByView(string id, SaHeadlinesRequestByView saHeadlinesRequestByView = default(SaHeadlinesRequestByView))
        {
            var localVarResponse = GetStreetAccountHeadlinesByViewWithHttpInfo(id, saHeadlinesRequestByView);
            return localVarResponse.Data;
        }

        /// <summary>
        /// Retrieve StreetAccount headlines for given view This endpoint allows you to pull all headlines produced by StreetAccount for a saved view. The full story body will be returned by the data set. Views can be created via the ‘Create Views’ endpoint.
        /// </summary>
        /// <exception cref="FactSet.SDK.StreetAccountNews.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="id">view id of the view to return headlines for</param>
        /// <param name="saHeadlinesRequestByView">View body which needs to be sent with request (optional)</param>
        /// <returns>ApiResponse of SearchResponse</returns>
        public ApiResponse<SearchResponse> GetStreetAccountHeadlinesByViewWithHttpInfo(string id, SaHeadlinesRequestByView saHeadlinesRequestByView = default(SaHeadlinesRequestByView))
        {
            // verify the required parameter 'id' is set
            if (id == null)
            {
                throw new FactSet.SDK.StreetAccountNews.Client.ApiException(400, "Missing required parameter 'id' when calling HeadlinesApi->GetStreetAccountHeadlinesByView");
            }

            FactSet.SDK.StreetAccountNews.Client.RequestOptions localVarRequestOptions = new FactSet.SDK.StreetAccountNews.Client.RequestOptions();

            string[] _contentTypes = new string[] {
                "application/json"
            };

            // to determine the Accept header
            string[] _accepts = new string[] {
                "application/json"
            };

            var localVarContentType = FactSet.SDK.StreetAccountNews.Client.ClientUtils.SelectHeaderContentType(_contentTypes);
            if (localVarContentType != null)
            {
                localVarRequestOptions.HeaderParameters.Add("Content-Type", localVarContentType);
            }

            var localVarAccept = FactSet.SDK.StreetAccountNews.Client.ClientUtils.SelectHeaderAccept(_accepts);
            if (localVarAccept != null)
            {
                localVarRequestOptions.HeaderParameters.Add("Accept", localVarAccept);
            }

            localVarRequestOptions.PathParameters.Add("id", FactSet.SDK.StreetAccountNews.Client.ClientUtils.ParameterToString(id)); // path parameter
            localVarRequestOptions.Data = saHeadlinesRequestByView;

            // authentication (FactSetApiKey) required
            // http basic authentication required
            if (!string.IsNullOrEmpty(this.Configuration.Username) || !string.IsNullOrEmpty(this.Configuration.Password) && !localVarRequestOptions.HeaderParameters.ContainsKey("Authorization"))
            {
                localVarRequestOptions.HeaderParameters.Add("Authorization", "Basic " + FactSet.SDK.StreetAccountNews.Client.ClientUtils.Base64Encode(this.Configuration.Username + ":" + this.Configuration.Password));
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

            localVarRequestOptions.ResponseTypeDictionary = GetStreetAccountHeadlinesByViewResponseTypeDictionary;

            // make the HTTP request
            var localVarResponse = this.Client.Post<
            SearchResponse>("/streetaccount/views/{id}/headlines", localVarRequestOptions, this.Configuration);
            if (this.ExceptionFactory != null)
            {
                Exception _exception = this.ExceptionFactory("GetStreetAccountHeadlinesByView", localVarResponse);
                if (_exception != null)
                {
                    throw _exception;
                }
            }
            return localVarResponse;
        }

        /// <summary>
        /// Retrieve StreetAccount headlines for given view This endpoint allows you to pull all headlines produced by StreetAccount for a saved view. The full story body will be returned by the data set. Views can be created via the ‘Create Views’ endpoint.
        /// </summary>
        /// <exception cref="FactSet.SDK.StreetAccountNews.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="id">view id of the view to return headlines for</param>
        /// <param name="saHeadlinesRequestByView">View body which needs to be sent with request (optional)</param>
        /// <param name="cancellationToken">Cancellation Token to cancel the request.</param>
        /// <returns>Task of SearchResponse</returns>
        public async System.Threading.Tasks.Task<SearchResponse>GetStreetAccountHeadlinesByViewAsync(string id, SaHeadlinesRequestByView saHeadlinesRequestByView = default(SaHeadlinesRequestByView), System.Threading.CancellationToken cancellationToken = default(System.Threading.CancellationToken))
        {
            var localVarResponse = await GetStreetAccountHeadlinesByViewWithHttpInfoAsync(id, saHeadlinesRequestByView, cancellationToken).ConfigureAwait(false);
            return localVarResponse.Data;
        }

        /// <summary>
        /// Retrieve StreetAccount headlines for given view This endpoint allows you to pull all headlines produced by StreetAccount for a saved view. The full story body will be returned by the data set. Views can be created via the ‘Create Views’ endpoint.
        /// </summary>
        /// <exception cref="FactSet.SDK.StreetAccountNews.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="id">view id of the view to return headlines for</param>
        /// <param name="saHeadlinesRequestByView">View body which needs to be sent with request (optional)</param>
        /// <param name="cancellationToken">Cancellation Token to cancel the request.</param>
        /// <returns>Task of ApiResponse (SearchResponse)</returns>

        public async System.Threading.Tasks.Task<ApiResponse<SearchResponse>> GetStreetAccountHeadlinesByViewWithHttpInfoAsync(string id, SaHeadlinesRequestByView saHeadlinesRequestByView = default(SaHeadlinesRequestByView), System.Threading.CancellationToken cancellationToken = default(System.Threading.CancellationToken))
        {
            // verify the required parameter 'id' is set
            if (id == null)
            {
                throw new FactSet.SDK.StreetAccountNews.Client.ApiException(400, "Missing required parameter 'id' when calling HeadlinesApi->GetStreetAccountHeadlinesByView");
            }


            FactSet.SDK.StreetAccountNews.Client.RequestOptions localVarRequestOptions = new FactSet.SDK.StreetAccountNews.Client.RequestOptions();

            string[] _contentTypes = new string[] {
                "application/json"
            };

            // to determine the Accept header
            string[] _accepts = new string[] {
                "application/json"
            };

            var localVarContentType = FactSet.SDK.StreetAccountNews.Client.ClientUtils.SelectHeaderContentType(_contentTypes);
            if (localVarContentType != null)
            {
                localVarRequestOptions.HeaderParameters.Add("Content-Type", localVarContentType);
            }

            var localVarAccept = FactSet.SDK.StreetAccountNews.Client.ClientUtils.SelectHeaderAccept(_accepts);
            if (localVarAccept != null)
            {
                localVarRequestOptions.HeaderParameters.Add("Accept", localVarAccept);
            }

            localVarRequestOptions.PathParameters.Add("id", FactSet.SDK.StreetAccountNews.Client.ClientUtils.ParameterToString(id)); // path parameter
            localVarRequestOptions.Data = saHeadlinesRequestByView;

            // authentication (FactSetApiKey) required
            // http basic authentication required
            if (!string.IsNullOrEmpty(this.Configuration.Username) || !string.IsNullOrEmpty(this.Configuration.Password) && !localVarRequestOptions.HeaderParameters.ContainsKey("Authorization"))
            {
                localVarRequestOptions.HeaderParameters.Add("Authorization", "Basic " + FactSet.SDK.StreetAccountNews.Client.ClientUtils.Base64Encode(this.Configuration.Username + ":" + this.Configuration.Password));
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


            localVarRequestOptions.ResponseTypeDictionary = GetStreetAccountHeadlinesByViewResponseTypeDictionary;

            // make the HTTP request
            var localVarResponse = await this.AsynchronousClient.PostAsync<SearchResponse>("/streetaccount/views/{id}/headlines", localVarRequestOptions, this.Configuration, cancellationToken).ConfigureAwait(false);

            if (this.ExceptionFactory != null)
            {
                Exception _exception = this.ExceptionFactory("GetStreetAccountHeadlinesByView", localVarResponse);
                if (_exception != null)
                {
                    throw _exception;
                }
            }

            return localVarResponse;
        }

    }
}