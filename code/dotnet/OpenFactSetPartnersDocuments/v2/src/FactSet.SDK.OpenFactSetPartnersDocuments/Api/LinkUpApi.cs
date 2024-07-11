/*
 * Open:FactSet - Partners
 *
 * This service provides the capability to search and download unstructured content provided by <a href=\"https://open.factset.com/catalog/en-us\">Open:FactSet Partners</a>.
 *
 * The version of the OpenAPI document: 2.0.0
 * Contact: api@factset.com
 * Generated by: https://github.com/openapitools/openapi-generator.git
 */


using System;
using System.Collections.Generic;
using System.Collections.ObjectModel;
using System.Linq;
using System.Net;
using System.Net.Mime;
using FactSet.SDK.OpenFactSetPartnersDocuments.Client;
using FactSet.SDK.OpenFactSetPartnersDocuments.Model;
using FactSet.SDK.Utils.Authentication;

namespace FactSet.SDK.OpenFactSetPartnersDocuments.Api
{

    /// <summary>
    /// Represents a collection of functions to interact with the API endpoints
    /// </summary>
    public interface ILinkUpApiSync : IApiAccessor
    {
        #region Synchronous Operations
        /// <summary>
        /// Returns the  daily files from Open:FactSet Partner - LinkUp. The LinkUp API provides access to job listings dataset that is sourced directly from employer webistes globally delivered daily.
        /// </summary>
        /// <remarks>
        /// Returns the  daily files from Open:FactSet Partner - LinkUp. The LinkUp API provides access to job listings dataset that is sourced directly from employer webistes globally delivered daily. **This API is no longer being sold for new clients.**
        /// </remarks>
        /// <exception cref="FactSet.SDK.OpenFactSetPartnersDocuments.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="sort">Enables to get the data in ascending or descending order based on startTime. Results are in reverse chronological order if this parameter is not used. (optional, default to -startDate)</param>
        /// <param name="paginationLimit">Specifies the maximum number of results to return per result. (optional, default to 20)</param>
        /// <param name="paginationOffset">Specifies the starting point for pagination. This parameter is used to identify the beginning of next set of results. Using this parameter can fetch maximum of first 10000 records. (optional, default to 0)</param>
        /// <param name="startDate">The earliest date of the LinkUp file the API should fetching for based on fileTimestamp. (optional)</param>
        /// <param name="endDate">The latest date of the LinkUp file the API should fetching for based on fileTimestamp. (optional)</param>
        /// <param name="type">Used to provide the full job descriptions when value \&quot;full\&quot; is used for this parameter. (optional, default to delta)</param>
        /// <returns>LinkUpResponse</returns>
        LinkUpResponse GetLinkUpJobListings(string sort = default(string), int? paginationLimit = default(int?), int? paginationOffset = default(int?), DateTime? startDate = default(DateTime?), DateTime? endDate = default(DateTime?), string type = default(string));

        /// <summary>
        /// Returns the  daily files from Open:FactSet Partner - LinkUp. The LinkUp API provides access to job listings dataset that is sourced directly from employer webistes globally delivered daily.
        /// </summary>
        /// <remarks>
        /// Returns the  daily files from Open:FactSet Partner - LinkUp. The LinkUp API provides access to job listings dataset that is sourced directly from employer webistes globally delivered daily. **This API is no longer being sold for new clients.**
        /// </remarks>
        /// <exception cref="FactSet.SDK.OpenFactSetPartnersDocuments.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="sort">Enables to get the data in ascending or descending order based on startTime. Results are in reverse chronological order if this parameter is not used. (optional, default to -startDate)</param>
        /// <param name="paginationLimit">Specifies the maximum number of results to return per result. (optional, default to 20)</param>
        /// <param name="paginationOffset">Specifies the starting point for pagination. This parameter is used to identify the beginning of next set of results. Using this parameter can fetch maximum of first 10000 records. (optional, default to 0)</param>
        /// <param name="startDate">The earliest date of the LinkUp file the API should fetching for based on fileTimestamp. (optional)</param>
        /// <param name="endDate">The latest date of the LinkUp file the API should fetching for based on fileTimestamp. (optional)</param>
        /// <param name="type">Used to provide the full job descriptions when value \&quot;full\&quot; is used for this parameter. (optional, default to delta)</param>
        /// <returns>ApiResponse of LinkUpResponse</returns>
        ApiResponse<LinkUpResponse> GetLinkUpJobListingsWithHttpInfo(string sort = default(string), int? paginationLimit = default(int?), int? paginationOffset = default(int?), DateTime? startDate = default(DateTime?), DateTime? endDate = default(DateTime?), string type = default(string));
        #endregion Synchronous Operations
    }

    /// <summary>
    /// Represents a collection of functions to interact with the API endpoints
    /// </summary>
    public interface ILinkUpApiAsync : IApiAccessor
    {
        #region Asynchronous Operations
        /// <summary>
        /// Returns the  daily files from Open:FactSet Partner - LinkUp. The LinkUp API provides access to job listings dataset that is sourced directly from employer webistes globally delivered daily.
        /// </summary>
        /// <remarks>
        /// Returns the  daily files from Open:FactSet Partner - LinkUp. The LinkUp API provides access to job listings dataset that is sourced directly from employer webistes globally delivered daily. **This API is no longer being sold for new clients.**
        /// </remarks>
        /// <exception cref="FactSet.SDK.OpenFactSetPartnersDocuments.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="sort">Enables to get the data in ascending or descending order based on startTime. Results are in reverse chronological order if this parameter is not used. (optional, default to -startDate)</param>
        /// <param name="paginationLimit">Specifies the maximum number of results to return per result. (optional, default to 20)</param>
        /// <param name="paginationOffset">Specifies the starting point for pagination. This parameter is used to identify the beginning of next set of results. Using this parameter can fetch maximum of first 10000 records. (optional, default to 0)</param>
        /// <param name="startDate">The earliest date of the LinkUp file the API should fetching for based on fileTimestamp. (optional)</param>
        /// <param name="endDate">The latest date of the LinkUp file the API should fetching for based on fileTimestamp. (optional)</param>
        /// <param name="type">Used to provide the full job descriptions when value \&quot;full\&quot; is used for this parameter. (optional, default to delta)</param>
        /// <param name="cancellationToken">Cancellation Token to cancel the request.</param>
        /// <returns>Task of LinkUpResponse</returns>
        System.Threading.Tasks.Task<LinkUpResponse> GetLinkUpJobListingsAsync(string sort = default(string), int? paginationLimit = default(int?), int? paginationOffset = default(int?), DateTime? startDate = default(DateTime?), DateTime? endDate = default(DateTime?), string type = default(string), System.Threading.CancellationToken cancellationToken = default(System.Threading.CancellationToken));

        /// <summary>
        /// Returns the  daily files from Open:FactSet Partner - LinkUp. The LinkUp API provides access to job listings dataset that is sourced directly from employer webistes globally delivered daily.
        /// </summary>
        /// <remarks>
        /// Returns the  daily files from Open:FactSet Partner - LinkUp. The LinkUp API provides access to job listings dataset that is sourced directly from employer webistes globally delivered daily. **This API is no longer being sold for new clients.**
        /// </remarks>
        /// <exception cref="FactSet.SDK.OpenFactSetPartnersDocuments.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="sort">Enables to get the data in ascending or descending order based on startTime. Results are in reverse chronological order if this parameter is not used. (optional, default to -startDate)</param>
        /// <param name="paginationLimit">Specifies the maximum number of results to return per result. (optional, default to 20)</param>
        /// <param name="paginationOffset">Specifies the starting point for pagination. This parameter is used to identify the beginning of next set of results. Using this parameter can fetch maximum of first 10000 records. (optional, default to 0)</param>
        /// <param name="startDate">The earliest date of the LinkUp file the API should fetching for based on fileTimestamp. (optional)</param>
        /// <param name="endDate">The latest date of the LinkUp file the API should fetching for based on fileTimestamp. (optional)</param>
        /// <param name="type">Used to provide the full job descriptions when value \&quot;full\&quot; is used for this parameter. (optional, default to delta)</param>
        /// <param name="cancellationToken">Cancellation Token to cancel the request.</param>
        /// <returns>Task of ApiResponse (LinkUpResponse)</returns>
        System.Threading.Tasks.Task<ApiResponse<LinkUpResponse>> GetLinkUpJobListingsWithHttpInfoAsync(string sort = default(string), int? paginationLimit = default(int?), int? paginationOffset = default(int?), DateTime? startDate = default(DateTime?), DateTime? endDate = default(DateTime?), string type = default(string), System.Threading.CancellationToken cancellationToken = default(System.Threading.CancellationToken));
        #endregion Asynchronous Operations
    }

    /// <summary>
    /// Represents a collection of functions to interact with the API endpoints
    /// </summary>
    public interface ILinkUpApi : ILinkUpApiSync, ILinkUpApiAsync
    {

    }

    /// <summary>
    /// Represents a collection of functions to interact with the API endpoints
    /// </summary>
    public partial class LinkUpApi : ILinkUpApi
    {
        private FactSet.SDK.OpenFactSetPartnersDocuments.Client.ExceptionFactory _exceptionFactory = (name, response) => null;

        # region Response Type Disctionaries
        
        private static readonly Dictionary<HttpStatusCode, System.Type> GetLinkUpJobListingsResponseTypeDictionary = new Dictionary<HttpStatusCode, System.Type>
        {
            { (HttpStatusCode)200, typeof(LinkUpResponse) },
            { (HttpStatusCode)400, typeof(AuthStatus) },
            { (HttpStatusCode)401, typeof(AuthStatus) },
            { (HttpStatusCode)403, typeof(AuthStatus) },
            { (HttpStatusCode)500, typeof(AuthStatus) },
        };

        # endregion Response Type Disctionaries

        # region Api Response Objects
        

        # endregion Api Response Objects

        /// <summary>
        /// Initializes a new instance of the <see cref="LinkUpApi"/> class.
        /// </summary>
        /// <returns></returns>
        public LinkUpApi() : this((string)null)
        {
        }

        /// <summary>
        /// Initializes a new instance of the <see cref="LinkUpApi"/> class.
        /// </summary>
        /// <returns></returns>
        public LinkUpApi(string basePath)
        {
            this.Configuration = FactSet.SDK.OpenFactSetPartnersDocuments.Client.Configuration.MergeConfigurations(
                FactSet.SDK.OpenFactSetPartnersDocuments.Client.GlobalConfiguration.Instance,
                new FactSet.SDK.OpenFactSetPartnersDocuments.Client.Configuration { BasePath = basePath }
            );
            this.Client = new FactSet.SDK.OpenFactSetPartnersDocuments.Client.ApiClient(this.Configuration.BasePath);
            this.AsynchronousClient = new FactSet.SDK.OpenFactSetPartnersDocuments.Client.ApiClient(this.Configuration.BasePath);
            this.ExceptionFactory = FactSet.SDK.OpenFactSetPartnersDocuments.Client.Configuration.DefaultExceptionFactory;
        }

        /// <summary>
        /// Initializes a new instance of the <see cref="LinkUpApi"/> class
        /// using Configuration object
        /// </summary>
        /// <param name="configuration">An instance of Configuration</param>
        /// <returns></returns>
        public LinkUpApi(FactSet.SDK.OpenFactSetPartnersDocuments.Client.Configuration configuration)
        {
            if (configuration == null) throw new ArgumentNullException("configuration");

            this.Configuration = FactSet.SDK.OpenFactSetPartnersDocuments.Client.Configuration.MergeConfigurations(
                FactSet.SDK.OpenFactSetPartnersDocuments.Client.GlobalConfiguration.Instance,
                configuration
            );
            this.Client = new FactSet.SDK.OpenFactSetPartnersDocuments.Client.ApiClient(this.Configuration.BasePath);
            this.AsynchronousClient = new FactSet.SDK.OpenFactSetPartnersDocuments.Client.ApiClient(this.Configuration.BasePath);
            ExceptionFactory = FactSet.SDK.OpenFactSetPartnersDocuments.Client.Configuration.DefaultExceptionFactory;
        }

        /// <summary>
        /// Initializes a new instance of the <see cref="LinkUpApi"/> class
        /// using a Configuration object and client instance.
        /// </summary>
        /// <param name="client">The client interface for synchronous API access.</param>
        /// <param name="asyncClient">The client interface for asynchronous API access.</param>
        /// <param name="configuration">The configuration object.</param>
        public LinkUpApi(FactSet.SDK.OpenFactSetPartnersDocuments.Client.ISynchronousClient client, FactSet.SDK.OpenFactSetPartnersDocuments.Client.IAsynchronousClient asyncClient, FactSet.SDK.OpenFactSetPartnersDocuments.Client.IReadableConfiguration configuration)
        {
            if (client == null) throw new ArgumentNullException("client");
            if (asyncClient == null) throw new ArgumentNullException("asyncClient");
            if (configuration == null) throw new ArgumentNullException("configuration");

            this.Client = client;
            this.AsynchronousClient = asyncClient;
            this.Configuration = configuration;
            this.ExceptionFactory = FactSet.SDK.OpenFactSetPartnersDocuments.Client.Configuration.DefaultExceptionFactory;
        }

        /// <summary>
        /// The client for accessing this underlying API asynchronously.
        /// </summary>
        public FactSet.SDK.OpenFactSetPartnersDocuments.Client.IAsynchronousClient AsynchronousClient { get; set; }

        /// <summary>
        /// The client for accessing this underlying API synchronously.
        /// </summary>
        public FactSet.SDK.OpenFactSetPartnersDocuments.Client.ISynchronousClient Client { get; set; }

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
        public FactSet.SDK.OpenFactSetPartnersDocuments.Client.IReadableConfiguration Configuration { get; set; }

        /// <summary>
        /// Provides a factory method hook for the creation of exceptions.
        /// </summary>
        public FactSet.SDK.OpenFactSetPartnersDocuments.Client.ExceptionFactory ExceptionFactory
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
        /// Returns the  daily files from Open:FactSet Partner - LinkUp. The LinkUp API provides access to job listings dataset that is sourced directly from employer webistes globally delivered daily. Returns the  daily files from Open:FactSet Partner - LinkUp. The LinkUp API provides access to job listings dataset that is sourced directly from employer webistes globally delivered daily. **This API is no longer being sold for new clients.**
        /// </summary>
        /// <exception cref="FactSet.SDK.OpenFactSetPartnersDocuments.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="sort">Enables to get the data in ascending or descending order based on startTime. Results are in reverse chronological order if this parameter is not used. (optional, default to -startDate)</param>
        /// <param name="paginationLimit">Specifies the maximum number of results to return per result. (optional, default to 20)</param>
        /// <param name="paginationOffset">Specifies the starting point for pagination. This parameter is used to identify the beginning of next set of results. Using this parameter can fetch maximum of first 10000 records. (optional, default to 0)</param>
        /// <param name="startDate">The earliest date of the LinkUp file the API should fetching for based on fileTimestamp. (optional)</param>
        /// <param name="endDate">The latest date of the LinkUp file the API should fetching for based on fileTimestamp. (optional)</param>
        /// <param name="type">Used to provide the full job descriptions when value \&quot;full\&quot; is used for this parameter. (optional, default to delta)</param>
        /// <returns>LinkUpResponse</returns>
        public LinkUpResponse GetLinkUpJobListings(string sort = default(string), int? paginationLimit = default(int?), int? paginationOffset = default(int?), DateTime? startDate = default(DateTime?), DateTime? endDate = default(DateTime?), string type = default(string))
        {
            var localVarResponse = GetLinkUpJobListingsWithHttpInfo(sort, paginationLimit, paginationOffset, startDate, endDate, type);
            return localVarResponse.Data;
        }

        /// <summary>
        /// Returns the  daily files from Open:FactSet Partner - LinkUp. The LinkUp API provides access to job listings dataset that is sourced directly from employer webistes globally delivered daily. Returns the  daily files from Open:FactSet Partner - LinkUp. The LinkUp API provides access to job listings dataset that is sourced directly from employer webistes globally delivered daily. **This API is no longer being sold for new clients.**
        /// </summary>
        /// <exception cref="FactSet.SDK.OpenFactSetPartnersDocuments.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="sort">Enables to get the data in ascending or descending order based on startTime. Results are in reverse chronological order if this parameter is not used. (optional, default to -startDate)</param>
        /// <param name="paginationLimit">Specifies the maximum number of results to return per result. (optional, default to 20)</param>
        /// <param name="paginationOffset">Specifies the starting point for pagination. This parameter is used to identify the beginning of next set of results. Using this parameter can fetch maximum of first 10000 records. (optional, default to 0)</param>
        /// <param name="startDate">The earliest date of the LinkUp file the API should fetching for based on fileTimestamp. (optional)</param>
        /// <param name="endDate">The latest date of the LinkUp file the API should fetching for based on fileTimestamp. (optional)</param>
        /// <param name="type">Used to provide the full job descriptions when value \&quot;full\&quot; is used for this parameter. (optional, default to delta)</param>
        /// <returns>ApiResponse of LinkUpResponse</returns>
        public ApiResponse<LinkUpResponse> GetLinkUpJobListingsWithHttpInfo(string sort = default(string), int? paginationLimit = default(int?), int? paginationOffset = default(int?), DateTime? startDate = default(DateTime?), DateTime? endDate = default(DateTime?), string type = default(string))
        {
            FactSet.SDK.OpenFactSetPartnersDocuments.Client.RequestOptions localVarRequestOptions = new FactSet.SDK.OpenFactSetPartnersDocuments.Client.RequestOptions();

            string[] _contentTypes = new string[] {
            };

            // to determine the Accept header
            string[] _accepts = new string[] {
                "application/json"
            };

            var localVarContentType = FactSet.SDK.OpenFactSetPartnersDocuments.Client.ClientUtils.SelectHeaderContentType(_contentTypes);
            if (localVarContentType != null)
            {
                localVarRequestOptions.HeaderParameters.Add("Content-Type", localVarContentType);
            }

            var localVarAccept = FactSet.SDK.OpenFactSetPartnersDocuments.Client.ClientUtils.SelectHeaderAccept(_accepts);
            if (localVarAccept != null)
            {
                localVarRequestOptions.HeaderParameters.Add("Accept", localVarAccept);
            }

            if (sort != null)
            {
                localVarRequestOptions.QueryParameters.Add(FactSet.SDK.OpenFactSetPartnersDocuments.Client.ClientUtils.ParameterToMultiMap("", "_sort", sort));
            }
            if (paginationLimit != null)
            {
                localVarRequestOptions.QueryParameters.Add(FactSet.SDK.OpenFactSetPartnersDocuments.Client.ClientUtils.ParameterToMultiMap("", "_paginationLimit", paginationLimit));
            }
            if (paginationOffset != null)
            {
                localVarRequestOptions.QueryParameters.Add(FactSet.SDK.OpenFactSetPartnersDocuments.Client.ClientUtils.ParameterToMultiMap("", "_paginationOffset", paginationOffset));
            }
            if (startDate != null)
            {
                localVarRequestOptions.QueryParameters.Add(FactSet.SDK.OpenFactSetPartnersDocuments.Client.ClientUtils.ParameterToMultiMap("", "startDate", new DateOnlyParameter(startDate.Value)));
            }
            if (endDate != null)
            {
                localVarRequestOptions.QueryParameters.Add(FactSet.SDK.OpenFactSetPartnersDocuments.Client.ClientUtils.ParameterToMultiMap("", "endDate", new DateOnlyParameter(endDate.Value)));
            }
            if (type != null)
            {
                localVarRequestOptions.QueryParameters.Add(FactSet.SDK.OpenFactSetPartnersDocuments.Client.ClientUtils.ParameterToMultiMap("", "type", type));
            }

            // authentication (FactSetApiKey) required
            // http basic authentication required
            if (!string.IsNullOrEmpty(this.Configuration.Username) || !string.IsNullOrEmpty(this.Configuration.Password) && !localVarRequestOptions.HeaderParameters.ContainsKey("Authorization"))
            {
                localVarRequestOptions.HeaderParameters.Add("Authorization", "Basic " + FactSet.SDK.OpenFactSetPartnersDocuments.Client.ClientUtils.Base64Encode(this.Configuration.Username + ":" + this.Configuration.Password));
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

            localVarRequestOptions.ResponseTypeDictionary = GetLinkUpJobListingsResponseTypeDictionary;

            // make the HTTP request
            var localVarResponse = this.Client.Get<
            LinkUpResponse>("/linkup/job-listings", localVarRequestOptions, this.Configuration);
            if (this.ExceptionFactory != null)
            {
                Exception _exception = this.ExceptionFactory("GetLinkUpJobListings", localVarResponse);
                if (_exception != null)
                {
                    throw _exception;
                }
            }
            return localVarResponse;
        }

        /// <summary>
        /// Returns the  daily files from Open:FactSet Partner - LinkUp. The LinkUp API provides access to job listings dataset that is sourced directly from employer webistes globally delivered daily. Returns the  daily files from Open:FactSet Partner - LinkUp. The LinkUp API provides access to job listings dataset that is sourced directly from employer webistes globally delivered daily. **This API is no longer being sold for new clients.**
        /// </summary>
        /// <exception cref="FactSet.SDK.OpenFactSetPartnersDocuments.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="sort">Enables to get the data in ascending or descending order based on startTime. Results are in reverse chronological order if this parameter is not used. (optional, default to -startDate)</param>
        /// <param name="paginationLimit">Specifies the maximum number of results to return per result. (optional, default to 20)</param>
        /// <param name="paginationOffset">Specifies the starting point for pagination. This parameter is used to identify the beginning of next set of results. Using this parameter can fetch maximum of first 10000 records. (optional, default to 0)</param>
        /// <param name="startDate">The earliest date of the LinkUp file the API should fetching for based on fileTimestamp. (optional)</param>
        /// <param name="endDate">The latest date of the LinkUp file the API should fetching for based on fileTimestamp. (optional)</param>
        /// <param name="type">Used to provide the full job descriptions when value \&quot;full\&quot; is used for this parameter. (optional, default to delta)</param>
        /// <param name="cancellationToken">Cancellation Token to cancel the request.</param>
        /// <returns>Task of LinkUpResponse</returns>
        public async System.Threading.Tasks.Task<LinkUpResponse>GetLinkUpJobListingsAsync(string sort = default(string), int? paginationLimit = default(int?), int? paginationOffset = default(int?), DateTime? startDate = default(DateTime?), DateTime? endDate = default(DateTime?), string type = default(string), System.Threading.CancellationToken cancellationToken = default(System.Threading.CancellationToken))
        {
            var localVarResponse = await GetLinkUpJobListingsWithHttpInfoAsync(sort, paginationLimit, paginationOffset, startDate, endDate, type, cancellationToken).ConfigureAwait(false);
            return localVarResponse.Data;
        }

        /// <summary>
        /// Returns the  daily files from Open:FactSet Partner - LinkUp. The LinkUp API provides access to job listings dataset that is sourced directly from employer webistes globally delivered daily. Returns the  daily files from Open:FactSet Partner - LinkUp. The LinkUp API provides access to job listings dataset that is sourced directly from employer webistes globally delivered daily. **This API is no longer being sold for new clients.**
        /// </summary>
        /// <exception cref="FactSet.SDK.OpenFactSetPartnersDocuments.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="sort">Enables to get the data in ascending or descending order based on startTime. Results are in reverse chronological order if this parameter is not used. (optional, default to -startDate)</param>
        /// <param name="paginationLimit">Specifies the maximum number of results to return per result. (optional, default to 20)</param>
        /// <param name="paginationOffset">Specifies the starting point for pagination. This parameter is used to identify the beginning of next set of results. Using this parameter can fetch maximum of first 10000 records. (optional, default to 0)</param>
        /// <param name="startDate">The earliest date of the LinkUp file the API should fetching for based on fileTimestamp. (optional)</param>
        /// <param name="endDate">The latest date of the LinkUp file the API should fetching for based on fileTimestamp. (optional)</param>
        /// <param name="type">Used to provide the full job descriptions when value \&quot;full\&quot; is used for this parameter. (optional, default to delta)</param>
        /// <param name="cancellationToken">Cancellation Token to cancel the request.</param>
        /// <returns>Task of ApiResponse (LinkUpResponse)</returns>

        public async System.Threading.Tasks.Task<ApiResponse<LinkUpResponse>> GetLinkUpJobListingsWithHttpInfoAsync(string sort = default(string), int? paginationLimit = default(int?), int? paginationOffset = default(int?), DateTime? startDate = default(DateTime?), DateTime? endDate = default(DateTime?), string type = default(string), System.Threading.CancellationToken cancellationToken = default(System.Threading.CancellationToken))
        {

            FactSet.SDK.OpenFactSetPartnersDocuments.Client.RequestOptions localVarRequestOptions = new FactSet.SDK.OpenFactSetPartnersDocuments.Client.RequestOptions();

            string[] _contentTypes = new string[] {
            };

            // to determine the Accept header
            string[] _accepts = new string[] {
                "application/json"
            };

            var localVarContentType = FactSet.SDK.OpenFactSetPartnersDocuments.Client.ClientUtils.SelectHeaderContentType(_contentTypes);
            if (localVarContentType != null)
            {
                localVarRequestOptions.HeaderParameters.Add("Content-Type", localVarContentType);
            }

            var localVarAccept = FactSet.SDK.OpenFactSetPartnersDocuments.Client.ClientUtils.SelectHeaderAccept(_accepts);
            if (localVarAccept != null)
            {
                localVarRequestOptions.HeaderParameters.Add("Accept", localVarAccept);
            }

            if (sort != null)
            {
                localVarRequestOptions.QueryParameters.Add(FactSet.SDK.OpenFactSetPartnersDocuments.Client.ClientUtils.ParameterToMultiMap("", "_sort", sort));
            }
            if (paginationLimit != null)
            {
                localVarRequestOptions.QueryParameters.Add(FactSet.SDK.OpenFactSetPartnersDocuments.Client.ClientUtils.ParameterToMultiMap("", "_paginationLimit", paginationLimit));
            }
            if (paginationOffset != null)
            {
                localVarRequestOptions.QueryParameters.Add(FactSet.SDK.OpenFactSetPartnersDocuments.Client.ClientUtils.ParameterToMultiMap("", "_paginationOffset", paginationOffset));
            }
            if (startDate != null)
            {
                localVarRequestOptions.QueryParameters.Add(FactSet.SDK.OpenFactSetPartnersDocuments.Client.ClientUtils.ParameterToMultiMap("", "startDate", new DateOnlyParameter(startDate.Value)));
            }
            if (endDate != null)
            {
                localVarRequestOptions.QueryParameters.Add(FactSet.SDK.OpenFactSetPartnersDocuments.Client.ClientUtils.ParameterToMultiMap("", "endDate", new DateOnlyParameter(endDate.Value)));
            }
            if (type != null)
            {
                localVarRequestOptions.QueryParameters.Add(FactSet.SDK.OpenFactSetPartnersDocuments.Client.ClientUtils.ParameterToMultiMap("", "type", type));
            }

            // authentication (FactSetApiKey) required
            // http basic authentication required
            if (!string.IsNullOrEmpty(this.Configuration.Username) || !string.IsNullOrEmpty(this.Configuration.Password) && !localVarRequestOptions.HeaderParameters.ContainsKey("Authorization"))
            {
                localVarRequestOptions.HeaderParameters.Add("Authorization", "Basic " + FactSet.SDK.OpenFactSetPartnersDocuments.Client.ClientUtils.Base64Encode(this.Configuration.Username + ":" + this.Configuration.Password));
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


            localVarRequestOptions.ResponseTypeDictionary = GetLinkUpJobListingsResponseTypeDictionary;

            // make the HTTP request
            var localVarResponse = await this.AsynchronousClient.GetAsync<LinkUpResponse>("/linkup/job-listings", localVarRequestOptions, this.Configuration, cancellationToken).ConfigureAwait(false);

            if (this.ExceptionFactory != null)
            {
                Exception _exception = this.ExceptionFactory("GetLinkUpJobListings", localVarResponse);
                if (_exception != null)
                {
                    throw _exception;
                }
            }

            return localVarResponse;
        }

    }
}
