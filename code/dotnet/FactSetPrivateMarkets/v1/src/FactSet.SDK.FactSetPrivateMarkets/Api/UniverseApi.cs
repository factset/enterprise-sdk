/*
 * FactSet Private Markets API
 *
 * FactSet Private Markets API encompasses Private Company Financials data to start. Private Company firmographics can be found in the FactSet Entity API. The future plans of this service will include additional Private Markets data, such as Private Equity/Venture Capital.<p><b>Rate limit is set to 10 requests per second</b>.</p> 
 *
 * The version of the OpenAPI document: 1.2.0
 * Contact: api@factset.com
 * Generated by: https://github.com/openapitools/openapi-generator.git
 */


using System;
using System.Collections.Generic;
using System.Collections.ObjectModel;
using System.Linq;
using System.Net;
using System.Net.Mime;
using FactSet.SDK.FactSetPrivateMarkets.Client;
using FactSet.SDK.FactSetPrivateMarkets.Model;
using FactSet.SDK.Utils.Authentication;

namespace FactSet.SDK.FactSetPrivateMarkets.Api
{

    /// <summary>
    /// Represents a collection of functions to interact with the API endpoints
    /// </summary>
    public interface IUniverseApiSync : IApiAccessor
    {
        #region Synchronous Operations
        /// <summary>
        /// Get Entity Candidates and Matches for a single name and attributes.
        /// </summary>
        /// <remarks>
        /// Finds the best candidate entities matching the given entity name. Country code can also be supplied to narrow the search. &lt;p&gt;**Max of 1 Name permitted in a single GET request.** Use the POST method for /entity-match to fetch up to 25 names.&lt;/p&gt;&lt;p&gt; 
        /// </remarks>
        /// <exception cref="FactSet.SDK.FactSetPrivateMarkets.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="name">Name of Entity to match.</param>
        /// <param name="country">ISO2 country code corresponding to the entity name that is used when evaluating candidates for a match. For a list of ISO2 Country codes, visit [OA 8754](https://my.apps.factset.com/oa/pages/8754). (optional)</param>
        /// <returns>EntityMatchesResponse</returns>
        EntityMatchesResponse GetUniverse(string name, string country = default(string));

        /// <summary>
        /// Get Entity Candidates and Matches for a single name and attributes.
        /// </summary>
        /// <remarks>
        /// Finds the best candidate entities matching the given entity name. Country code can also be supplied to narrow the search. &lt;p&gt;**Max of 1 Name permitted in a single GET request.** Use the POST method for /entity-match to fetch up to 25 names.&lt;/p&gt;&lt;p&gt; 
        /// </remarks>
        /// <exception cref="FactSet.SDK.FactSetPrivateMarkets.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="name">Name of Entity to match.</param>
        /// <param name="country">ISO2 country code corresponding to the entity name that is used when evaluating candidates for a match. For a list of ISO2 Country codes, visit [OA 8754](https://my.apps.factset.com/oa/pages/8754). (optional)</param>
        /// <returns>ApiResponse of EntityMatchesResponse</returns>
        ApiResponse<EntityMatchesResponse> GetUniverseWithHttpInfo(string name, string country = default(string));
        /// <summary>
        /// Get a list of Entity Candidates and Matches for a requested list of up to 25 names and attributes.
        /// </summary>
        /// <remarks>
        /// Finds the best candidate entities matching the given entity name. Country code can also be supplied to narrow the search. Finds the best candidate entities matching the given company name. &lt;p&gt;**Max of 25 Names inputted.**&lt;/p&gt;&lt;p&gt; 
        /// </remarks>
        /// <exception cref="FactSet.SDK.FactSetPrivateMarkets.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="entityMatchRequest">A request to match an Entity.</param>
        /// <returns>EntityMatchesResponse</returns>
        EntityMatchesResponse GetUniverseForList(EntityMatchRequest entityMatchRequest);

        /// <summary>
        /// Get a list of Entity Candidates and Matches for a requested list of up to 25 names and attributes.
        /// </summary>
        /// <remarks>
        /// Finds the best candidate entities matching the given entity name. Country code can also be supplied to narrow the search. Finds the best candidate entities matching the given company name. &lt;p&gt;**Max of 25 Names inputted.**&lt;/p&gt;&lt;p&gt; 
        /// </remarks>
        /// <exception cref="FactSet.SDK.FactSetPrivateMarkets.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="entityMatchRequest">A request to match an Entity.</param>
        /// <returns>ApiResponse of EntityMatchesResponse</returns>
        ApiResponse<EntityMatchesResponse> GetUniverseForListWithHttpInfo(EntityMatchRequest entityMatchRequest);
        #endregion Synchronous Operations
    }

    /// <summary>
    /// Represents a collection of functions to interact with the API endpoints
    /// </summary>
    public interface IUniverseApiAsync : IApiAccessor
    {
        #region Asynchronous Operations
        /// <summary>
        /// Get Entity Candidates and Matches for a single name and attributes.
        /// </summary>
        /// <remarks>
        /// Finds the best candidate entities matching the given entity name. Country code can also be supplied to narrow the search. &lt;p&gt;**Max of 1 Name permitted in a single GET request.** Use the POST method for /entity-match to fetch up to 25 names.&lt;/p&gt;&lt;p&gt; 
        /// </remarks>
        /// <exception cref="FactSet.SDK.FactSetPrivateMarkets.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="name">Name of Entity to match.</param>
        /// <param name="country">ISO2 country code corresponding to the entity name that is used when evaluating candidates for a match. For a list of ISO2 Country codes, visit [OA 8754](https://my.apps.factset.com/oa/pages/8754). (optional)</param>
        /// <param name="cancellationToken">Cancellation Token to cancel the request.</param>
        /// <returns>Task of EntityMatchesResponse</returns>
        System.Threading.Tasks.Task<EntityMatchesResponse> GetUniverseAsync(string name, string country = default(string), System.Threading.CancellationToken cancellationToken = default(System.Threading.CancellationToken));

        /// <summary>
        /// Get Entity Candidates and Matches for a single name and attributes.
        /// </summary>
        /// <remarks>
        /// Finds the best candidate entities matching the given entity name. Country code can also be supplied to narrow the search. &lt;p&gt;**Max of 1 Name permitted in a single GET request.** Use the POST method for /entity-match to fetch up to 25 names.&lt;/p&gt;&lt;p&gt; 
        /// </remarks>
        /// <exception cref="FactSet.SDK.FactSetPrivateMarkets.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="name">Name of Entity to match.</param>
        /// <param name="country">ISO2 country code corresponding to the entity name that is used when evaluating candidates for a match. For a list of ISO2 Country codes, visit [OA 8754](https://my.apps.factset.com/oa/pages/8754). (optional)</param>
        /// <param name="cancellationToken">Cancellation Token to cancel the request.</param>
        /// <returns>Task of ApiResponse (EntityMatchesResponse)</returns>
        System.Threading.Tasks.Task<ApiResponse<EntityMatchesResponse>> GetUniverseWithHttpInfoAsync(string name, string country = default(string), System.Threading.CancellationToken cancellationToken = default(System.Threading.CancellationToken));
        /// <summary>
        /// Get a list of Entity Candidates and Matches for a requested list of up to 25 names and attributes.
        /// </summary>
        /// <remarks>
        /// Finds the best candidate entities matching the given entity name. Country code can also be supplied to narrow the search. Finds the best candidate entities matching the given company name. &lt;p&gt;**Max of 25 Names inputted.**&lt;/p&gt;&lt;p&gt; 
        /// </remarks>
        /// <exception cref="FactSet.SDK.FactSetPrivateMarkets.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="entityMatchRequest">A request to match an Entity.</param>
        /// <param name="cancellationToken">Cancellation Token to cancel the request.</param>
        /// <returns>Task of EntityMatchesResponse</returns>
        System.Threading.Tasks.Task<EntityMatchesResponse> GetUniverseForListAsync(EntityMatchRequest entityMatchRequest, System.Threading.CancellationToken cancellationToken = default(System.Threading.CancellationToken));

        /// <summary>
        /// Get a list of Entity Candidates and Matches for a requested list of up to 25 names and attributes.
        /// </summary>
        /// <remarks>
        /// Finds the best candidate entities matching the given entity name. Country code can also be supplied to narrow the search. Finds the best candidate entities matching the given company name. &lt;p&gt;**Max of 25 Names inputted.**&lt;/p&gt;&lt;p&gt; 
        /// </remarks>
        /// <exception cref="FactSet.SDK.FactSetPrivateMarkets.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="entityMatchRequest">A request to match an Entity.</param>
        /// <param name="cancellationToken">Cancellation Token to cancel the request.</param>
        /// <returns>Task of ApiResponse (EntityMatchesResponse)</returns>
        System.Threading.Tasks.Task<ApiResponse<EntityMatchesResponse>> GetUniverseForListWithHttpInfoAsync(EntityMatchRequest entityMatchRequest, System.Threading.CancellationToken cancellationToken = default(System.Threading.CancellationToken));
        #endregion Asynchronous Operations
    }

    /// <summary>
    /// Represents a collection of functions to interact with the API endpoints
    /// </summary>
    public interface IUniverseApi : IUniverseApiSync, IUniverseApiAsync
    {

    }

    /// <summary>
    /// Represents a collection of functions to interact with the API endpoints
    /// </summary>
    public partial class UniverseApi : IUniverseApi
    {
        private FactSet.SDK.FactSetPrivateMarkets.Client.ExceptionFactory _exceptionFactory = (name, response) => null;

        # region Response Type Disctionaries
        
        private static readonly Dictionary<HttpStatusCode, System.Type> GetUniverseResponseTypeDictionary = new Dictionary<HttpStatusCode, System.Type>
        {
            { (HttpStatusCode)200, typeof(EntityMatchesResponse) },
            { (HttpStatusCode)400, typeof(ErrorResponse) },
            { (HttpStatusCode)401, typeof(ErrorResponse) },
            { (HttpStatusCode)403, typeof(ErrorResponse) },
            { (HttpStatusCode)415, typeof(ErrorResponse) },
            { (HttpStatusCode)500, typeof(ErrorResponse) },
        };

        private static readonly Dictionary<HttpStatusCode, System.Type> GetUniverseForListResponseTypeDictionary = new Dictionary<HttpStatusCode, System.Type>
        {
            { (HttpStatusCode)200, typeof(EntityMatchesResponse) },
            { (HttpStatusCode)400, typeof(ErrorResponse) },
            { (HttpStatusCode)401, typeof(ErrorResponse) },
            { (HttpStatusCode)403, typeof(ErrorResponse) },
            { (HttpStatusCode)415, typeof(ErrorResponse) },
            { (HttpStatusCode)500, typeof(ErrorResponse) },
        };

        # endregion Response Type Disctionaries

        # region Api Response Objects
        

        # endregion Api Response Objects

        /// <summary>
        /// Initializes a new instance of the <see cref="UniverseApi"/> class.
        /// </summary>
        /// <returns></returns>
        public UniverseApi() : this((string)null)
        {
        }

        /// <summary>
        /// Initializes a new instance of the <see cref="UniverseApi"/> class.
        /// </summary>
        /// <returns></returns>
        public UniverseApi(string basePath)
        {
            this.Configuration = FactSet.SDK.FactSetPrivateMarkets.Client.Configuration.MergeConfigurations(
                FactSet.SDK.FactSetPrivateMarkets.Client.GlobalConfiguration.Instance,
                new FactSet.SDK.FactSetPrivateMarkets.Client.Configuration { BasePath = basePath }
            );
            this.Client = new FactSet.SDK.FactSetPrivateMarkets.Client.ApiClient(this.Configuration.BasePath);
            this.AsynchronousClient = new FactSet.SDK.FactSetPrivateMarkets.Client.ApiClient(this.Configuration.BasePath);
            this.ExceptionFactory = FactSet.SDK.FactSetPrivateMarkets.Client.Configuration.DefaultExceptionFactory;
        }

        /// <summary>
        /// Initializes a new instance of the <see cref="UniverseApi"/> class
        /// using Configuration object
        /// </summary>
        /// <param name="configuration">An instance of Configuration</param>
        /// <returns></returns>
        public UniverseApi(FactSet.SDK.FactSetPrivateMarkets.Client.Configuration configuration)
        {
            if (configuration == null) throw new ArgumentNullException("configuration");

            this.Configuration = FactSet.SDK.FactSetPrivateMarkets.Client.Configuration.MergeConfigurations(
                FactSet.SDK.FactSetPrivateMarkets.Client.GlobalConfiguration.Instance,
                configuration
            );
            this.Client = new FactSet.SDK.FactSetPrivateMarkets.Client.ApiClient(this.Configuration.BasePath);
            this.AsynchronousClient = new FactSet.SDK.FactSetPrivateMarkets.Client.ApiClient(this.Configuration.BasePath);
            ExceptionFactory = FactSet.SDK.FactSetPrivateMarkets.Client.Configuration.DefaultExceptionFactory;
        }

        /// <summary>
        /// Initializes a new instance of the <see cref="UniverseApi"/> class
        /// using a Configuration object and client instance.
        /// </summary>
        /// <param name="client">The client interface for synchronous API access.</param>
        /// <param name="asyncClient">The client interface for asynchronous API access.</param>
        /// <param name="configuration">The configuration object.</param>
        public UniverseApi(FactSet.SDK.FactSetPrivateMarkets.Client.ISynchronousClient client, FactSet.SDK.FactSetPrivateMarkets.Client.IAsynchronousClient asyncClient, FactSet.SDK.FactSetPrivateMarkets.Client.IReadableConfiguration configuration)
        {
            if (client == null) throw new ArgumentNullException("client");
            if (asyncClient == null) throw new ArgumentNullException("asyncClient");
            if (configuration == null) throw new ArgumentNullException("configuration");

            this.Client = client;
            this.AsynchronousClient = asyncClient;
            this.Configuration = configuration;
            this.ExceptionFactory = FactSet.SDK.FactSetPrivateMarkets.Client.Configuration.DefaultExceptionFactory;
        }

        /// <summary>
        /// The client for accessing this underlying API asynchronously.
        /// </summary>
        public FactSet.SDK.FactSetPrivateMarkets.Client.IAsynchronousClient AsynchronousClient { get; set; }

        /// <summary>
        /// The client for accessing this underlying API synchronously.
        /// </summary>
        public FactSet.SDK.FactSetPrivateMarkets.Client.ISynchronousClient Client { get; set; }

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
        public FactSet.SDK.FactSetPrivateMarkets.Client.IReadableConfiguration Configuration { get; set; }

        /// <summary>
        /// Provides a factory method hook for the creation of exceptions.
        /// </summary>
        public FactSet.SDK.FactSetPrivateMarkets.Client.ExceptionFactory ExceptionFactory
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
        /// Get Entity Candidates and Matches for a single name and attributes. Finds the best candidate entities matching the given entity name. Country code can also be supplied to narrow the search. &lt;p&gt;**Max of 1 Name permitted in a single GET request.** Use the POST method for /entity-match to fetch up to 25 names.&lt;/p&gt;&lt;p&gt; 
        /// </summary>
        /// <exception cref="FactSet.SDK.FactSetPrivateMarkets.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="name">Name of Entity to match.</param>
        /// <param name="country">ISO2 country code corresponding to the entity name that is used when evaluating candidates for a match. For a list of ISO2 Country codes, visit [OA 8754](https://my.apps.factset.com/oa/pages/8754). (optional)</param>
        /// <returns>EntityMatchesResponse</returns>
        public EntityMatchesResponse GetUniverse(string name, string country = default(string))
        {
            var localVarResponse = GetUniverseWithHttpInfo(name, country);
            return localVarResponse.Data;
        }

        /// <summary>
        /// Get Entity Candidates and Matches for a single name and attributes. Finds the best candidate entities matching the given entity name. Country code can also be supplied to narrow the search. &lt;p&gt;**Max of 1 Name permitted in a single GET request.** Use the POST method for /entity-match to fetch up to 25 names.&lt;/p&gt;&lt;p&gt; 
        /// </summary>
        /// <exception cref="FactSet.SDK.FactSetPrivateMarkets.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="name">Name of Entity to match.</param>
        /// <param name="country">ISO2 country code corresponding to the entity name that is used when evaluating candidates for a match. For a list of ISO2 Country codes, visit [OA 8754](https://my.apps.factset.com/oa/pages/8754). (optional)</param>
        /// <returns>ApiResponse of EntityMatchesResponse</returns>
        public ApiResponse<EntityMatchesResponse> GetUniverseWithHttpInfo(string name, string country = default(string))
        {
            // verify the required parameter 'name' is set
            if (name == null)
            {
                throw new FactSet.SDK.FactSetPrivateMarkets.Client.ApiException(400, "Missing required parameter 'name' when calling UniverseApi->GetUniverse");
            }

            FactSet.SDK.FactSetPrivateMarkets.Client.RequestOptions localVarRequestOptions = new FactSet.SDK.FactSetPrivateMarkets.Client.RequestOptions();

            string[] _contentTypes = new string[] {
            };

            // to determine the Accept header
            string[] _accepts = new string[] {
                "application/json;charset=utf-8",
                "application/json"
            };

            var localVarContentType = FactSet.SDK.FactSetPrivateMarkets.Client.ClientUtils.SelectHeaderContentType(_contentTypes);
            if (localVarContentType != null)
            {
                localVarRequestOptions.HeaderParameters.Add("Content-Type", localVarContentType);
            }

            var localVarAccept = FactSet.SDK.FactSetPrivateMarkets.Client.ClientUtils.SelectHeaderAccept(_accepts);
            if (localVarAccept != null)
            {
                localVarRequestOptions.HeaderParameters.Add("Accept", localVarAccept);
            }

            localVarRequestOptions.QueryParameters.Add(FactSet.SDK.FactSetPrivateMarkets.Client.ClientUtils.ParameterToMultiMap("", "name", name));
            if (country != null)
            {
                localVarRequestOptions.QueryParameters.Add(FactSet.SDK.FactSetPrivateMarkets.Client.ClientUtils.ParameterToMultiMap("", "country", country));
            }

            // authentication (FactSetApiKey) required
            // http basic authentication required
            if (!string.IsNullOrEmpty(this.Configuration.Username) || !string.IsNullOrEmpty(this.Configuration.Password) && !localVarRequestOptions.HeaderParameters.ContainsKey("Authorization"))
            {
                localVarRequestOptions.HeaderParameters.Add("Authorization", "Basic " + FactSet.SDK.FactSetPrivateMarkets.Client.ClientUtils.Base64Encode(this.Configuration.Username + ":" + this.Configuration.Password));
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

            localVarRequestOptions.ResponseTypeDictionary = GetUniverseResponseTypeDictionary;

            // make the HTTP request
            var localVarResponse = this.Client.Get<
            EntityMatchesResponse>("/factset-private-markets/v1/universe", localVarRequestOptions, this.Configuration);
            if (this.ExceptionFactory != null)
            {
                Exception _exception = this.ExceptionFactory("GetUniverse", localVarResponse);
                if (_exception != null)
                {
                    throw _exception;
                }
            }
            return localVarResponse;
        }

        /// <summary>
        /// Get Entity Candidates and Matches for a single name and attributes. Finds the best candidate entities matching the given entity name. Country code can also be supplied to narrow the search. &lt;p&gt;**Max of 1 Name permitted in a single GET request.** Use the POST method for /entity-match to fetch up to 25 names.&lt;/p&gt;&lt;p&gt; 
        /// </summary>
        /// <exception cref="FactSet.SDK.FactSetPrivateMarkets.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="name">Name of Entity to match.</param>
        /// <param name="country">ISO2 country code corresponding to the entity name that is used when evaluating candidates for a match. For a list of ISO2 Country codes, visit [OA 8754](https://my.apps.factset.com/oa/pages/8754). (optional)</param>
        /// <param name="cancellationToken">Cancellation Token to cancel the request.</param>
        /// <returns>Task of EntityMatchesResponse</returns>
        public async System.Threading.Tasks.Task<EntityMatchesResponse>GetUniverseAsync(string name, string country = default(string), System.Threading.CancellationToken cancellationToken = default(System.Threading.CancellationToken))
        {
            var localVarResponse = await GetUniverseWithHttpInfoAsync(name, country, cancellationToken).ConfigureAwait(false);
            return localVarResponse.Data;
        }

        /// <summary>
        /// Get Entity Candidates and Matches for a single name and attributes. Finds the best candidate entities matching the given entity name. Country code can also be supplied to narrow the search. &lt;p&gt;**Max of 1 Name permitted in a single GET request.** Use the POST method for /entity-match to fetch up to 25 names.&lt;/p&gt;&lt;p&gt; 
        /// </summary>
        /// <exception cref="FactSet.SDK.FactSetPrivateMarkets.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="name">Name of Entity to match.</param>
        /// <param name="country">ISO2 country code corresponding to the entity name that is used when evaluating candidates for a match. For a list of ISO2 Country codes, visit [OA 8754](https://my.apps.factset.com/oa/pages/8754). (optional)</param>
        /// <param name="cancellationToken">Cancellation Token to cancel the request.</param>
        /// <returns>Task of ApiResponse (EntityMatchesResponse)</returns>

        public async System.Threading.Tasks.Task<ApiResponse<EntityMatchesResponse>> GetUniverseWithHttpInfoAsync(string name, string country = default(string), System.Threading.CancellationToken cancellationToken = default(System.Threading.CancellationToken))
        {
            // verify the required parameter 'name' is set
            if (name == null)
            {
                throw new FactSet.SDK.FactSetPrivateMarkets.Client.ApiException(400, "Missing required parameter 'name' when calling UniverseApi->GetUniverse");
            }


            FactSet.SDK.FactSetPrivateMarkets.Client.RequestOptions localVarRequestOptions = new FactSet.SDK.FactSetPrivateMarkets.Client.RequestOptions();

            string[] _contentTypes = new string[] {
            };

            // to determine the Accept header
            string[] _accepts = new string[] {
                "application/json;charset=utf-8",
                "application/json"
            };

            var localVarContentType = FactSet.SDK.FactSetPrivateMarkets.Client.ClientUtils.SelectHeaderContentType(_contentTypes);
            if (localVarContentType != null)
            {
                localVarRequestOptions.HeaderParameters.Add("Content-Type", localVarContentType);
            }

            var localVarAccept = FactSet.SDK.FactSetPrivateMarkets.Client.ClientUtils.SelectHeaderAccept(_accepts);
            if (localVarAccept != null)
            {
                localVarRequestOptions.HeaderParameters.Add("Accept", localVarAccept);
            }

            localVarRequestOptions.QueryParameters.Add(FactSet.SDK.FactSetPrivateMarkets.Client.ClientUtils.ParameterToMultiMap("", "name", name));
            if (country != null)
            {
                localVarRequestOptions.QueryParameters.Add(FactSet.SDK.FactSetPrivateMarkets.Client.ClientUtils.ParameterToMultiMap("", "country", country));
            }

            // authentication (FactSetApiKey) required
            // http basic authentication required
            if (!string.IsNullOrEmpty(this.Configuration.Username) || !string.IsNullOrEmpty(this.Configuration.Password) && !localVarRequestOptions.HeaderParameters.ContainsKey("Authorization"))
            {
                localVarRequestOptions.HeaderParameters.Add("Authorization", "Basic " + FactSet.SDK.FactSetPrivateMarkets.Client.ClientUtils.Base64Encode(this.Configuration.Username + ":" + this.Configuration.Password));
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


            localVarRequestOptions.ResponseTypeDictionary = GetUniverseResponseTypeDictionary;

            // make the HTTP request
            var localVarResponse = await this.AsynchronousClient.GetAsync<EntityMatchesResponse>("/factset-private-markets/v1/universe", localVarRequestOptions, this.Configuration, cancellationToken).ConfigureAwait(false);

            if (this.ExceptionFactory != null)
            {
                Exception _exception = this.ExceptionFactory("GetUniverse", localVarResponse);
                if (_exception != null)
                {
                    throw _exception;
                }
            }

            return localVarResponse;
        }

        /// <summary>
        /// Get a list of Entity Candidates and Matches for a requested list of up to 25 names and attributes. Finds the best candidate entities matching the given entity name. Country code can also be supplied to narrow the search. Finds the best candidate entities matching the given company name. &lt;p&gt;**Max of 25 Names inputted.**&lt;/p&gt;&lt;p&gt; 
        /// </summary>
        /// <exception cref="FactSet.SDK.FactSetPrivateMarkets.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="entityMatchRequest">A request to match an Entity.</param>
        /// <returns>EntityMatchesResponse</returns>
        public EntityMatchesResponse GetUniverseForList(EntityMatchRequest entityMatchRequest)
        {
            var localVarResponse = GetUniverseForListWithHttpInfo(entityMatchRequest);
            return localVarResponse.Data;
        }

        /// <summary>
        /// Get a list of Entity Candidates and Matches for a requested list of up to 25 names and attributes. Finds the best candidate entities matching the given entity name. Country code can also be supplied to narrow the search. Finds the best candidate entities matching the given company name. &lt;p&gt;**Max of 25 Names inputted.**&lt;/p&gt;&lt;p&gt; 
        /// </summary>
        /// <exception cref="FactSet.SDK.FactSetPrivateMarkets.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="entityMatchRequest">A request to match an Entity.</param>
        /// <returns>ApiResponse of EntityMatchesResponse</returns>
        public ApiResponse<EntityMatchesResponse> GetUniverseForListWithHttpInfo(EntityMatchRequest entityMatchRequest)
        {
            // verify the required parameter 'entityMatchRequest' is set
            if (entityMatchRequest == null)
            {
                throw new FactSet.SDK.FactSetPrivateMarkets.Client.ApiException(400, "Missing required parameter 'entityMatchRequest' when calling UniverseApi->GetUniverseForList");
            }

            FactSet.SDK.FactSetPrivateMarkets.Client.RequestOptions localVarRequestOptions = new FactSet.SDK.FactSetPrivateMarkets.Client.RequestOptions();

            string[] _contentTypes = new string[] {
                "application/json"
            };

            // to determine the Accept header
            string[] _accepts = new string[] {
                "application/json;charset=utf-8",
                "application/json"
            };

            var localVarContentType = FactSet.SDK.FactSetPrivateMarkets.Client.ClientUtils.SelectHeaderContentType(_contentTypes);
            if (localVarContentType != null)
            {
                localVarRequestOptions.HeaderParameters.Add("Content-Type", localVarContentType);
            }

            var localVarAccept = FactSet.SDK.FactSetPrivateMarkets.Client.ClientUtils.SelectHeaderAccept(_accepts);
            if (localVarAccept != null)
            {
                localVarRequestOptions.HeaderParameters.Add("Accept", localVarAccept);
            }

            localVarRequestOptions.Data = entityMatchRequest;

            // authentication (FactSetApiKey) required
            // http basic authentication required
            if (!string.IsNullOrEmpty(this.Configuration.Username) || !string.IsNullOrEmpty(this.Configuration.Password) && !localVarRequestOptions.HeaderParameters.ContainsKey("Authorization"))
            {
                localVarRequestOptions.HeaderParameters.Add("Authorization", "Basic " + FactSet.SDK.FactSetPrivateMarkets.Client.ClientUtils.Base64Encode(this.Configuration.Username + ":" + this.Configuration.Password));
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

            localVarRequestOptions.ResponseTypeDictionary = GetUniverseForListResponseTypeDictionary;

            // make the HTTP request
            var localVarResponse = this.Client.Post<
            EntityMatchesResponse>("/factset-private-markets/v1/universe", localVarRequestOptions, this.Configuration);
            if (this.ExceptionFactory != null)
            {
                Exception _exception = this.ExceptionFactory("GetUniverseForList", localVarResponse);
                if (_exception != null)
                {
                    throw _exception;
                }
            }
            return localVarResponse;
        }

        /// <summary>
        /// Get a list of Entity Candidates and Matches for a requested list of up to 25 names and attributes. Finds the best candidate entities matching the given entity name. Country code can also be supplied to narrow the search. Finds the best candidate entities matching the given company name. &lt;p&gt;**Max of 25 Names inputted.**&lt;/p&gt;&lt;p&gt; 
        /// </summary>
        /// <exception cref="FactSet.SDK.FactSetPrivateMarkets.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="entityMatchRequest">A request to match an Entity.</param>
        /// <param name="cancellationToken">Cancellation Token to cancel the request.</param>
        /// <returns>Task of EntityMatchesResponse</returns>
        public async System.Threading.Tasks.Task<EntityMatchesResponse>GetUniverseForListAsync(EntityMatchRequest entityMatchRequest, System.Threading.CancellationToken cancellationToken = default(System.Threading.CancellationToken))
        {
            var localVarResponse = await GetUniverseForListWithHttpInfoAsync(entityMatchRequest, cancellationToken).ConfigureAwait(false);
            return localVarResponse.Data;
        }

        /// <summary>
        /// Get a list of Entity Candidates and Matches for a requested list of up to 25 names and attributes. Finds the best candidate entities matching the given entity name. Country code can also be supplied to narrow the search. Finds the best candidate entities matching the given company name. &lt;p&gt;**Max of 25 Names inputted.**&lt;/p&gt;&lt;p&gt; 
        /// </summary>
        /// <exception cref="FactSet.SDK.FactSetPrivateMarkets.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="entityMatchRequest">A request to match an Entity.</param>
        /// <param name="cancellationToken">Cancellation Token to cancel the request.</param>
        /// <returns>Task of ApiResponse (EntityMatchesResponse)</returns>

        public async System.Threading.Tasks.Task<ApiResponse<EntityMatchesResponse>> GetUniverseForListWithHttpInfoAsync(EntityMatchRequest entityMatchRequest, System.Threading.CancellationToken cancellationToken = default(System.Threading.CancellationToken))
        {
            // verify the required parameter 'entityMatchRequest' is set
            if (entityMatchRequest == null)
            {
                throw new FactSet.SDK.FactSetPrivateMarkets.Client.ApiException(400, "Missing required parameter 'entityMatchRequest' when calling UniverseApi->GetUniverseForList");
            }


            FactSet.SDK.FactSetPrivateMarkets.Client.RequestOptions localVarRequestOptions = new FactSet.SDK.FactSetPrivateMarkets.Client.RequestOptions();

            string[] _contentTypes = new string[] {
                "application/json"
            };

            // to determine the Accept header
            string[] _accepts = new string[] {
                "application/json;charset=utf-8",
                "application/json"
            };

            var localVarContentType = FactSet.SDK.FactSetPrivateMarkets.Client.ClientUtils.SelectHeaderContentType(_contentTypes);
            if (localVarContentType != null)
            {
                localVarRequestOptions.HeaderParameters.Add("Content-Type", localVarContentType);
            }

            var localVarAccept = FactSet.SDK.FactSetPrivateMarkets.Client.ClientUtils.SelectHeaderAccept(_accepts);
            if (localVarAccept != null)
            {
                localVarRequestOptions.HeaderParameters.Add("Accept", localVarAccept);
            }

            localVarRequestOptions.Data = entityMatchRequest;

            // authentication (FactSetApiKey) required
            // http basic authentication required
            if (!string.IsNullOrEmpty(this.Configuration.Username) || !string.IsNullOrEmpty(this.Configuration.Password) && !localVarRequestOptions.HeaderParameters.ContainsKey("Authorization"))
            {
                localVarRequestOptions.HeaderParameters.Add("Authorization", "Basic " + FactSet.SDK.FactSetPrivateMarkets.Client.ClientUtils.Base64Encode(this.Configuration.Username + ":" + this.Configuration.Password));
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


            localVarRequestOptions.ResponseTypeDictionary = GetUniverseForListResponseTypeDictionary;

            // make the HTTP request
            var localVarResponse = await this.AsynchronousClient.PostAsync<EntityMatchesResponse>("/factset-private-markets/v1/universe", localVarRequestOptions, this.Configuration, cancellationToken).ConfigureAwait(false);

            if (this.ExceptionFactory != null)
            {
                Exception _exception = this.ExceptionFactory("GetUniverseForList", localVarResponse);
                if (_exception != null)
                {
                    throw _exception;
                }
            }

            return localVarResponse;
        }

    }
}
