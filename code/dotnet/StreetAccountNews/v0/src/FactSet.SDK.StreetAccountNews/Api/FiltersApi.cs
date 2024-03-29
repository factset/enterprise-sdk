/*
 * StreetAccount News API
 *
 * The StreetAccount News API provides access to FactSet's proprietary news provider, StreetAccount. StreetAccount, is a premium real-time market intelligence news service that delivers comprehensive U.S., Canadian, and European coverage (and expanding Asia coverage). All possible sources for corporate news are scanned and key story facts are highlighted and presented in an easy-to-read format.  **StreetAccount Filters, Headlines, and Views:**  These endpoints allow for the retrieval of news headlines using filters such as Watchlists/Indices/Tickers, Company Filters, Market Topics, Regions, and Sectors.  Headlines can also be retrieved based on saved views within the Workstation.  **StreetAccount Historical Stories:**  These endpoints provide access to historical StreetAccount (SA) news. The API delivers SA stories in XML format based on user-specified date input parameters. Output files are securely available to users through a URL. This API has three endpoints: Request Files, Check Status, and Get Files.  Please note that this API only supports adhoc requests for historical files and does not support real-time files. If real-time push is required, consider using other methods such as SFTP, QNT account, or Azure Storage. Both historical and real-time Street Account news can be delivered via SFTP, QNT account, or Azure Storage.  The files delivered contain both metadata and content body, eliminating the need for multiple requests through multiple services to retrieve all the information.
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
    public interface IFiltersApiSync : IApiAccessor
    {
        #region Synchronous Operations
        /// <summary>
        /// Retrieve all StreetAccount filters
        /// </summary>
        /// <remarks>
        /// Add StreetAccount filters (watchlists, company filters, market topics, regions and sectors) to filter down StreetAccount headlines by the relevant categories. Set the structured and/or flattened flag. If structured flag is set, parent and child filter information will be returned. If flattened flag is set, flattened filters will be returned which can be used with the headlines and createView endpoints. Both flags can be set to return both sets of filters.  If no params are provided it will return both
        /// </remarks>
        /// <exception cref="FactSet.SDK.StreetAccountNews.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="structured">Pass structured to generate a structured view of the available filters. (optional)</param>
        /// <param name="flattened">Pass flattened to generate a structured view of the available filters. (optional)</param>
        /// <returns>FilterResponse</returns>
        FilterResponse GetStreetAccountFilters(bool? structured = default(bool?), bool? flattened = default(bool?));

        /// <summary>
        /// Retrieve all StreetAccount filters
        /// </summary>
        /// <remarks>
        /// Add StreetAccount filters (watchlists, company filters, market topics, regions and sectors) to filter down StreetAccount headlines by the relevant categories. Set the structured and/or flattened flag. If structured flag is set, parent and child filter information will be returned. If flattened flag is set, flattened filters will be returned which can be used with the headlines and createView endpoints. Both flags can be set to return both sets of filters.  If no params are provided it will return both
        /// </remarks>
        /// <exception cref="FactSet.SDK.StreetAccountNews.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="structured">Pass structured to generate a structured view of the available filters. (optional)</param>
        /// <param name="flattened">Pass flattened to generate a structured view of the available filters. (optional)</param>
        /// <returns>ApiResponse of FilterResponse</returns>
        ApiResponse<FilterResponse> GetStreetAccountFiltersWithHttpInfo(bool? structured = default(bool?), bool? flattened = default(bool?));
        #endregion Synchronous Operations
    }

    /// <summary>
    /// Represents a collection of functions to interact with the API endpoints
    /// </summary>
    public interface IFiltersApiAsync : IApiAccessor
    {
        #region Asynchronous Operations
        /// <summary>
        /// Retrieve all StreetAccount filters
        /// </summary>
        /// <remarks>
        /// Add StreetAccount filters (watchlists, company filters, market topics, regions and sectors) to filter down StreetAccount headlines by the relevant categories. Set the structured and/or flattened flag. If structured flag is set, parent and child filter information will be returned. If flattened flag is set, flattened filters will be returned which can be used with the headlines and createView endpoints. Both flags can be set to return both sets of filters.  If no params are provided it will return both
        /// </remarks>
        /// <exception cref="FactSet.SDK.StreetAccountNews.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="structured">Pass structured to generate a structured view of the available filters. (optional)</param>
        /// <param name="flattened">Pass flattened to generate a structured view of the available filters. (optional)</param>
        /// <param name="cancellationToken">Cancellation Token to cancel the request.</param>
        /// <returns>Task of FilterResponse</returns>
        System.Threading.Tasks.Task<FilterResponse> GetStreetAccountFiltersAsync(bool? structured = default(bool?), bool? flattened = default(bool?), System.Threading.CancellationToken cancellationToken = default(System.Threading.CancellationToken));

        /// <summary>
        /// Retrieve all StreetAccount filters
        /// </summary>
        /// <remarks>
        /// Add StreetAccount filters (watchlists, company filters, market topics, regions and sectors) to filter down StreetAccount headlines by the relevant categories. Set the structured and/or flattened flag. If structured flag is set, parent and child filter information will be returned. If flattened flag is set, flattened filters will be returned which can be used with the headlines and createView endpoints. Both flags can be set to return both sets of filters.  If no params are provided it will return both
        /// </remarks>
        /// <exception cref="FactSet.SDK.StreetAccountNews.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="structured">Pass structured to generate a structured view of the available filters. (optional)</param>
        /// <param name="flattened">Pass flattened to generate a structured view of the available filters. (optional)</param>
        /// <param name="cancellationToken">Cancellation Token to cancel the request.</param>
        /// <returns>Task of ApiResponse (FilterResponse)</returns>
        System.Threading.Tasks.Task<ApiResponse<FilterResponse>> GetStreetAccountFiltersWithHttpInfoAsync(bool? structured = default(bool?), bool? flattened = default(bool?), System.Threading.CancellationToken cancellationToken = default(System.Threading.CancellationToken));
        #endregion Asynchronous Operations
    }

    /// <summary>
    /// Represents a collection of functions to interact with the API endpoints
    /// </summary>
    public interface IFiltersApi : IFiltersApiSync, IFiltersApiAsync
    {

    }

    /// <summary>
    /// Represents a collection of functions to interact with the API endpoints
    /// </summary>
    public partial class FiltersApi : IFiltersApi
    {
        private FactSet.SDK.StreetAccountNews.Client.ExceptionFactory _exceptionFactory = (name, response) => null;

        # region Response Type Disctionaries
        
        private static readonly Dictionary<HttpStatusCode, System.Type> GetStreetAccountFiltersResponseTypeDictionary = new Dictionary<HttpStatusCode, System.Type>
        {
            { (HttpStatusCode)200, typeof(FilterResponse) },
            { (HttpStatusCode)400, typeof(Error) },
            { (HttpStatusCode)401, typeof(Error) },
            { (HttpStatusCode)404, typeof(Error) },
        };

        # endregion Response Type Disctionaries

        # region Api Response Objects
        

        # endregion Api Response Objects

        /// <summary>
        /// Initializes a new instance of the <see cref="FiltersApi"/> class.
        /// </summary>
        /// <returns></returns>
        public FiltersApi() : this((string)null)
        {
        }

        /// <summary>
        /// Initializes a new instance of the <see cref="FiltersApi"/> class.
        /// </summary>
        /// <returns></returns>
        public FiltersApi(string basePath)
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
        /// Initializes a new instance of the <see cref="FiltersApi"/> class
        /// using Configuration object
        /// </summary>
        /// <param name="configuration">An instance of Configuration</param>
        /// <returns></returns>
        public FiltersApi(FactSet.SDK.StreetAccountNews.Client.Configuration configuration)
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
        /// Initializes a new instance of the <see cref="FiltersApi"/> class
        /// using a Configuration object and client instance.
        /// </summary>
        /// <param name="client">The client interface for synchronous API access.</param>
        /// <param name="asyncClient">The client interface for asynchronous API access.</param>
        /// <param name="configuration">The configuration object.</param>
        public FiltersApi(FactSet.SDK.StreetAccountNews.Client.ISynchronousClient client, FactSet.SDK.StreetAccountNews.Client.IAsynchronousClient asyncClient, FactSet.SDK.StreetAccountNews.Client.IReadableConfiguration configuration)
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
        /// Retrieve all StreetAccount filters Add StreetAccount filters (watchlists, company filters, market topics, regions and sectors) to filter down StreetAccount headlines by the relevant categories. Set the structured and/or flattened flag. If structured flag is set, parent and child filter information will be returned. If flattened flag is set, flattened filters will be returned which can be used with the headlines and createView endpoints. Both flags can be set to return both sets of filters.  If no params are provided it will return both
        /// </summary>
        /// <exception cref="FactSet.SDK.StreetAccountNews.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="structured">Pass structured to generate a structured view of the available filters. (optional)</param>
        /// <param name="flattened">Pass flattened to generate a structured view of the available filters. (optional)</param>
        /// <returns>FilterResponse</returns>
        public FilterResponse GetStreetAccountFilters(bool? structured = default(bool?), bool? flattened = default(bool?))
        {
            var localVarResponse = GetStreetAccountFiltersWithHttpInfo(structured, flattened);
            return localVarResponse.Data;
        }

        /// <summary>
        /// Retrieve all StreetAccount filters Add StreetAccount filters (watchlists, company filters, market topics, regions and sectors) to filter down StreetAccount headlines by the relevant categories. Set the structured and/or flattened flag. If structured flag is set, parent and child filter information will be returned. If flattened flag is set, flattened filters will be returned which can be used with the headlines and createView endpoints. Both flags can be set to return both sets of filters.  If no params are provided it will return both
        /// </summary>
        /// <exception cref="FactSet.SDK.StreetAccountNews.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="structured">Pass structured to generate a structured view of the available filters. (optional)</param>
        /// <param name="flattened">Pass flattened to generate a structured view of the available filters. (optional)</param>
        /// <returns>ApiResponse of FilterResponse</returns>
        public ApiResponse<FilterResponse> GetStreetAccountFiltersWithHttpInfo(bool? structured = default(bool?), bool? flattened = default(bool?))
        {
            FactSet.SDK.StreetAccountNews.Client.RequestOptions localVarRequestOptions = new FactSet.SDK.StreetAccountNews.Client.RequestOptions();

            string[] _contentTypes = new string[] {
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

            if (structured != null)
            {
                localVarRequestOptions.QueryParameters.Add(FactSet.SDK.StreetAccountNews.Client.ClientUtils.ParameterToMultiMap("", "structured", structured));
            }
            if (flattened != null)
            {
                localVarRequestOptions.QueryParameters.Add(FactSet.SDK.StreetAccountNews.Client.ClientUtils.ParameterToMultiMap("", "flattened", flattened));
            }

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

            localVarRequestOptions.ResponseTypeDictionary = GetStreetAccountFiltersResponseTypeDictionary;

            // make the HTTP request
            var localVarResponse = this.Client.Get<
            FilterResponse>("/streetaccount/filters", localVarRequestOptions, this.Configuration);
            if (this.ExceptionFactory != null)
            {
                Exception _exception = this.ExceptionFactory("GetStreetAccountFilters", localVarResponse);
                if (_exception != null)
                {
                    throw _exception;
                }
            }
            return localVarResponse;
        }

        /// <summary>
        /// Retrieve all StreetAccount filters Add StreetAccount filters (watchlists, company filters, market topics, regions and sectors) to filter down StreetAccount headlines by the relevant categories. Set the structured and/or flattened flag. If structured flag is set, parent and child filter information will be returned. If flattened flag is set, flattened filters will be returned which can be used with the headlines and createView endpoints. Both flags can be set to return both sets of filters.  If no params are provided it will return both
        /// </summary>
        /// <exception cref="FactSet.SDK.StreetAccountNews.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="structured">Pass structured to generate a structured view of the available filters. (optional)</param>
        /// <param name="flattened">Pass flattened to generate a structured view of the available filters. (optional)</param>
        /// <param name="cancellationToken">Cancellation Token to cancel the request.</param>
        /// <returns>Task of FilterResponse</returns>
        public async System.Threading.Tasks.Task<FilterResponse>GetStreetAccountFiltersAsync(bool? structured = default(bool?), bool? flattened = default(bool?), System.Threading.CancellationToken cancellationToken = default(System.Threading.CancellationToken))
        {
            var localVarResponse = await GetStreetAccountFiltersWithHttpInfoAsync(structured, flattened, cancellationToken).ConfigureAwait(false);
            return localVarResponse.Data;
        }

        /// <summary>
        /// Retrieve all StreetAccount filters Add StreetAccount filters (watchlists, company filters, market topics, regions and sectors) to filter down StreetAccount headlines by the relevant categories. Set the structured and/or flattened flag. If structured flag is set, parent and child filter information will be returned. If flattened flag is set, flattened filters will be returned which can be used with the headlines and createView endpoints. Both flags can be set to return both sets of filters.  If no params are provided it will return both
        /// </summary>
        /// <exception cref="FactSet.SDK.StreetAccountNews.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="structured">Pass structured to generate a structured view of the available filters. (optional)</param>
        /// <param name="flattened">Pass flattened to generate a structured view of the available filters. (optional)</param>
        /// <param name="cancellationToken">Cancellation Token to cancel the request.</param>
        /// <returns>Task of ApiResponse (FilterResponse)</returns>

        public async System.Threading.Tasks.Task<ApiResponse<FilterResponse>> GetStreetAccountFiltersWithHttpInfoAsync(bool? structured = default(bool?), bool? flattened = default(bool?), System.Threading.CancellationToken cancellationToken = default(System.Threading.CancellationToken))
        {

            FactSet.SDK.StreetAccountNews.Client.RequestOptions localVarRequestOptions = new FactSet.SDK.StreetAccountNews.Client.RequestOptions();

            string[] _contentTypes = new string[] {
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

            if (structured != null)
            {
                localVarRequestOptions.QueryParameters.Add(FactSet.SDK.StreetAccountNews.Client.ClientUtils.ParameterToMultiMap("", "structured", structured));
            }
            if (flattened != null)
            {
                localVarRequestOptions.QueryParameters.Add(FactSet.SDK.StreetAccountNews.Client.ClientUtils.ParameterToMultiMap("", "flattened", flattened));
            }

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


            localVarRequestOptions.ResponseTypeDictionary = GetStreetAccountFiltersResponseTypeDictionary;

            // make the HTTP request
            var localVarResponse = await this.AsynchronousClient.GetAsync<FilterResponse>("/streetaccount/filters", localVarRequestOptions, this.Configuration, cancellationToken).ConfigureAwait(false);

            if (this.ExceptionFactory != null)
            {
                Exception _exception = this.ExceptionFactory("GetStreetAccountFilters", localVarResponse);
                if (_exception != null)
                {
                    throw _exception;
                }
            }

            return localVarResponse;
        }

    }
}
