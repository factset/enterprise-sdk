/*
 * FactSet People API
 *
 * The FactSet People API exposes FactSet data for individuals and their jobs.<p>This API is rate-limited to 10 requests per second and 10 concurrent requests per user.</p> 
 *
 * The version of the OpenAPI document: 1.3.0
 * Contact: api@factset.com
 * Generated by: https://github.com/openapitools/openapi-generator.git
 */


using System;
using System.Collections.Generic;
using System.Collections.ObjectModel;
using System.Linq;
using System.Net;
using System.Net.Mime;
using FactSet.SDK.FactSetPeople.Client;
using FactSet.SDK.FactSetPeople.Model;
using FactSet.SDK.Utils.Authentication;

namespace FactSet.SDK.FactSetPeople.Api
{

    /// <summary>
    /// Represents a collection of functions to interact with the API endpoints
    /// </summary>
    public interface IProfilesApiSync : IApiAccessor
    {
        #region Synchronous Operations
        /// <summary>
        /// Return information about the person with the specified entity ID.
        /// </summary>
        /// <remarks>
        /// Returns a summary of basic information about the person referenced by the entityId specified in the URI. 
        /// </remarks>
        /// <exception cref="FactSet.SDK.FactSetPeople.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="ids">List of FactSet Person Entity identifier.</param>
        /// <returns>PeopleProfilesResponse</returns>
        PeopleProfilesResponse GetPeopleProfiles(List<string> ids);

        /// <summary>
        /// Return information about the person with the specified entity ID.
        /// </summary>
        /// <remarks>
        /// Returns a summary of basic information about the person referenced by the entityId specified in the URI. 
        /// </remarks>
        /// <exception cref="FactSet.SDK.FactSetPeople.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="ids">List of FactSet Person Entity identifier.</param>
        /// <returns>ApiResponse of PeopleProfilesResponse</returns>
        ApiResponse<PeopleProfilesResponse> GetPeopleProfilesWithHttpInfo(List<string> ids);
        /// <summary>
        /// Returns profile information for a large list of people.
        /// </summary>
        /// <exception cref="FactSet.SDK.FactSetPeople.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="peopleProfilesRequest"></param>
        /// <returns>PeopleProfilesResponse</returns>
        PeopleProfilesResponse GetPeopleProfilesForList(PeopleProfilesRequest peopleProfilesRequest);

        /// <summary>
        /// Returns profile information for a large list of people.
        /// </summary>
        /// <remarks>
        /// 
        /// </remarks>
        /// <exception cref="FactSet.SDK.FactSetPeople.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="peopleProfilesRequest"></param>
        /// <returns>ApiResponse of PeopleProfilesResponse</returns>
        ApiResponse<PeopleProfilesResponse> GetPeopleProfilesForListWithHttpInfo(PeopleProfilesRequest peopleProfilesRequest);
        #endregion Synchronous Operations
    }

    /// <summary>
    /// Represents a collection of functions to interact with the API endpoints
    /// </summary>
    public interface IProfilesApiAsync : IApiAccessor
    {
        #region Asynchronous Operations
        /// <summary>
        /// Return information about the person with the specified entity ID.
        /// </summary>
        /// <remarks>
        /// Returns a summary of basic information about the person referenced by the entityId specified in the URI. 
        /// </remarks>
        /// <exception cref="FactSet.SDK.FactSetPeople.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="ids">List of FactSet Person Entity identifier.</param>
        /// <param name="cancellationToken">Cancellation Token to cancel the request.</param>
        /// <returns>Task of PeopleProfilesResponse</returns>
        System.Threading.Tasks.Task<PeopleProfilesResponse> GetPeopleProfilesAsync(List<string> ids, System.Threading.CancellationToken cancellationToken = default(System.Threading.CancellationToken));

        /// <summary>
        /// Return information about the person with the specified entity ID.
        /// </summary>
        /// <remarks>
        /// Returns a summary of basic information about the person referenced by the entityId specified in the URI. 
        /// </remarks>
        /// <exception cref="FactSet.SDK.FactSetPeople.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="ids">List of FactSet Person Entity identifier.</param>
        /// <param name="cancellationToken">Cancellation Token to cancel the request.</param>
        /// <returns>Task of ApiResponse (PeopleProfilesResponse)</returns>
        System.Threading.Tasks.Task<ApiResponse<PeopleProfilesResponse>> GetPeopleProfilesWithHttpInfoAsync(List<string> ids, System.Threading.CancellationToken cancellationToken = default(System.Threading.CancellationToken));
        /// <summary>
        /// Returns profile information for a large list of people.
        /// </summary>
        /// <remarks>
        /// 
        /// </remarks>
        /// <exception cref="FactSet.SDK.FactSetPeople.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="peopleProfilesRequest"></param>
        /// <param name="cancellationToken">Cancellation Token to cancel the request.</param>
        /// <returns>Task of PeopleProfilesResponse</returns>
        System.Threading.Tasks.Task<PeopleProfilesResponse> GetPeopleProfilesForListAsync(PeopleProfilesRequest peopleProfilesRequest, System.Threading.CancellationToken cancellationToken = default(System.Threading.CancellationToken));

        /// <summary>
        /// Returns profile information for a large list of people.
        /// </summary>
        /// <remarks>
        /// 
        /// </remarks>
        /// <exception cref="FactSet.SDK.FactSetPeople.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="peopleProfilesRequest"></param>
        /// <param name="cancellationToken">Cancellation Token to cancel the request.</param>
        /// <returns>Task of ApiResponse (PeopleProfilesResponse)</returns>
        System.Threading.Tasks.Task<ApiResponse<PeopleProfilesResponse>> GetPeopleProfilesForListWithHttpInfoAsync(PeopleProfilesRequest peopleProfilesRequest, System.Threading.CancellationToken cancellationToken = default(System.Threading.CancellationToken));
        #endregion Asynchronous Operations
    }

    /// <summary>
    /// Represents a collection of functions to interact with the API endpoints
    /// </summary>
    public interface IProfilesApi : IProfilesApiSync, IProfilesApiAsync
    {

    }

    /// <summary>
    /// Represents a collection of functions to interact with the API endpoints
    /// </summary>
    public partial class ProfilesApi : IProfilesApi
    {
        private FactSet.SDK.FactSetPeople.Client.ExceptionFactory _exceptionFactory = (name, response) => null;

        # region Response Type Disctionaries
        
        private static readonly Dictionary<HttpStatusCode, System.Type> GetPeopleProfilesResponseTypeDictionary = new Dictionary<HttpStatusCode, System.Type>
        {
            { (HttpStatusCode)200, typeof(PeopleProfilesResponse) },
            { (HttpStatusCode)400, typeof(ErrorResponse) },
            { (HttpStatusCode)401, typeof(ErrorResponse) },
            { (HttpStatusCode)403, typeof(ErrorResponse) },
            { (HttpStatusCode)415, typeof(ErrorResponse) },
            { (HttpStatusCode)500, typeof(ErrorResponse) },
        };

        private static readonly Dictionary<HttpStatusCode, System.Type> GetPeopleProfilesForListResponseTypeDictionary = new Dictionary<HttpStatusCode, System.Type>
        {
            { (HttpStatusCode)200, typeof(PeopleProfilesResponse) },
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
        /// Initializes a new instance of the <see cref="ProfilesApi"/> class.
        /// </summary>
        /// <returns></returns>
        public ProfilesApi() : this((string)null)
        {
        }

        /// <summary>
        /// Initializes a new instance of the <see cref="ProfilesApi"/> class.
        /// </summary>
        /// <returns></returns>
        public ProfilesApi(string basePath)
        {
            this.Configuration = FactSet.SDK.FactSetPeople.Client.Configuration.MergeConfigurations(
                FactSet.SDK.FactSetPeople.Client.GlobalConfiguration.Instance,
                new FactSet.SDK.FactSetPeople.Client.Configuration { BasePath = basePath }
            );
            this.Client = new FactSet.SDK.FactSetPeople.Client.ApiClient(this.Configuration.BasePath);
            this.AsynchronousClient = new FactSet.SDK.FactSetPeople.Client.ApiClient(this.Configuration.BasePath);
            this.ExceptionFactory = FactSet.SDK.FactSetPeople.Client.Configuration.DefaultExceptionFactory;
        }

        /// <summary>
        /// Initializes a new instance of the <see cref="ProfilesApi"/> class
        /// using Configuration object
        /// </summary>
        /// <param name="configuration">An instance of Configuration</param>
        /// <returns></returns>
        public ProfilesApi(FactSet.SDK.FactSetPeople.Client.Configuration configuration)
        {
            if (configuration == null) throw new ArgumentNullException("configuration");

            this.Configuration = FactSet.SDK.FactSetPeople.Client.Configuration.MergeConfigurations(
                FactSet.SDK.FactSetPeople.Client.GlobalConfiguration.Instance,
                configuration
            );
            this.Client = new FactSet.SDK.FactSetPeople.Client.ApiClient(this.Configuration.BasePath);
            this.AsynchronousClient = new FactSet.SDK.FactSetPeople.Client.ApiClient(this.Configuration.BasePath);
            ExceptionFactory = FactSet.SDK.FactSetPeople.Client.Configuration.DefaultExceptionFactory;
        }

        /// <summary>
        /// Initializes a new instance of the <see cref="ProfilesApi"/> class
        /// using a Configuration object and client instance.
        /// </summary>
        /// <param name="client">The client interface for synchronous API access.</param>
        /// <param name="asyncClient">The client interface for asynchronous API access.</param>
        /// <param name="configuration">The configuration object.</param>
        public ProfilesApi(FactSet.SDK.FactSetPeople.Client.ISynchronousClient client, FactSet.SDK.FactSetPeople.Client.IAsynchronousClient asyncClient, FactSet.SDK.FactSetPeople.Client.IReadableConfiguration configuration)
        {
            if (client == null) throw new ArgumentNullException("client");
            if (asyncClient == null) throw new ArgumentNullException("asyncClient");
            if (configuration == null) throw new ArgumentNullException("configuration");

            this.Client = client;
            this.AsynchronousClient = asyncClient;
            this.Configuration = configuration;
            this.ExceptionFactory = FactSet.SDK.FactSetPeople.Client.Configuration.DefaultExceptionFactory;
        }

        /// <summary>
        /// The client for accessing this underlying API asynchronously.
        /// </summary>
        public FactSet.SDK.FactSetPeople.Client.IAsynchronousClient AsynchronousClient { get; set; }

        /// <summary>
        /// The client for accessing this underlying API synchronously.
        /// </summary>
        public FactSet.SDK.FactSetPeople.Client.ISynchronousClient Client { get; set; }

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
        public FactSet.SDK.FactSetPeople.Client.IReadableConfiguration Configuration { get; set; }

        /// <summary>
        /// Provides a factory method hook for the creation of exceptions.
        /// </summary>
        public FactSet.SDK.FactSetPeople.Client.ExceptionFactory ExceptionFactory
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
        /// Return information about the person with the specified entity ID. Returns a summary of basic information about the person referenced by the entityId specified in the URI. 
        /// </summary>
        /// <exception cref="FactSet.SDK.FactSetPeople.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="ids">List of FactSet Person Entity identifier.</param>
        /// <returns>PeopleProfilesResponse</returns>
        public PeopleProfilesResponse GetPeopleProfiles(List<string> ids)
        {
            var localVarResponse = GetPeopleProfilesWithHttpInfo(ids);
            return localVarResponse.Data;
        }

        /// <summary>
        /// Return information about the person with the specified entity ID. Returns a summary of basic information about the person referenced by the entityId specified in the URI. 
        /// </summary>
        /// <exception cref="FactSet.SDK.FactSetPeople.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="ids">List of FactSet Person Entity identifier.</param>
        /// <returns>ApiResponse of PeopleProfilesResponse</returns>
        public ApiResponse<PeopleProfilesResponse> GetPeopleProfilesWithHttpInfo(List<string> ids)
        {
            // verify the required parameter 'ids' is set
            if (ids == null)
            {
                throw new FactSet.SDK.FactSetPeople.Client.ApiException(400, "Missing required parameter 'ids' when calling ProfilesApi->GetPeopleProfiles");
            }

            FactSet.SDK.FactSetPeople.Client.RequestOptions localVarRequestOptions = new FactSet.SDK.FactSetPeople.Client.RequestOptions();

            string[] _contentTypes = new string[] {
            };

            // to determine the Accept header
            string[] _accepts = new string[] {
                "application/json"
            };

            var localVarContentType = FactSet.SDK.FactSetPeople.Client.ClientUtils.SelectHeaderContentType(_contentTypes);
            if (localVarContentType != null)
            {
                localVarRequestOptions.HeaderParameters.Add("Content-Type", localVarContentType);
            }

            var localVarAccept = FactSet.SDK.FactSetPeople.Client.ClientUtils.SelectHeaderAccept(_accepts);
            if (localVarAccept != null)
            {
                localVarRequestOptions.HeaderParameters.Add("Accept", localVarAccept);
            }

            localVarRequestOptions.QueryParameters.Add(FactSet.SDK.FactSetPeople.Client.ClientUtils.ParameterToMultiMap("csv", "ids", ids));

            // authentication (FactSetApiKey) required
            // http basic authentication required
            if (!string.IsNullOrEmpty(this.Configuration.Username) || !string.IsNullOrEmpty(this.Configuration.Password) && !localVarRequestOptions.HeaderParameters.ContainsKey("Authorization"))
            {
                localVarRequestOptions.HeaderParameters.Add("Authorization", "Basic " + FactSet.SDK.FactSetPeople.Client.ClientUtils.Base64Encode(this.Configuration.Username + ":" + this.Configuration.Password));
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

            localVarRequestOptions.ResponseTypeDictionary = GetPeopleProfilesResponseTypeDictionary;

            // make the HTTP request
            var localVarResponse = this.Client.Get<
            PeopleProfilesResponse>("/factset-people/v1/profiles", localVarRequestOptions, this.Configuration);
            if (this.ExceptionFactory != null)
            {
                Exception _exception = this.ExceptionFactory("GetPeopleProfiles", localVarResponse);
                if (_exception != null)
                {
                    throw _exception;
                }
            }
            return localVarResponse;
        }

        /// <summary>
        /// Return information about the person with the specified entity ID. Returns a summary of basic information about the person referenced by the entityId specified in the URI. 
        /// </summary>
        /// <exception cref="FactSet.SDK.FactSetPeople.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="ids">List of FactSet Person Entity identifier.</param>
        /// <param name="cancellationToken">Cancellation Token to cancel the request.</param>
        /// <returns>Task of PeopleProfilesResponse</returns>
        public async System.Threading.Tasks.Task<PeopleProfilesResponse>GetPeopleProfilesAsync(List<string> ids, System.Threading.CancellationToken cancellationToken = default(System.Threading.CancellationToken))
        {
            var localVarResponse = await GetPeopleProfilesWithHttpInfoAsync(ids, cancellationToken).ConfigureAwait(false);
            return localVarResponse.Data;
        }

        /// <summary>
        /// Return information about the person with the specified entity ID. Returns a summary of basic information about the person referenced by the entityId specified in the URI. 
        /// </summary>
        /// <exception cref="FactSet.SDK.FactSetPeople.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="ids">List of FactSet Person Entity identifier.</param>
        /// <param name="cancellationToken">Cancellation Token to cancel the request.</param>
        /// <returns>Task of ApiResponse (PeopleProfilesResponse)</returns>

        public async System.Threading.Tasks.Task<ApiResponse<PeopleProfilesResponse>> GetPeopleProfilesWithHttpInfoAsync(List<string> ids, System.Threading.CancellationToken cancellationToken = default(System.Threading.CancellationToken))
        {
            // verify the required parameter 'ids' is set
            if (ids == null)
            {
                throw new FactSet.SDK.FactSetPeople.Client.ApiException(400, "Missing required parameter 'ids' when calling ProfilesApi->GetPeopleProfiles");
            }


            FactSet.SDK.FactSetPeople.Client.RequestOptions localVarRequestOptions = new FactSet.SDK.FactSetPeople.Client.RequestOptions();

            string[] _contentTypes = new string[] {
            };

            // to determine the Accept header
            string[] _accepts = new string[] {
                "application/json"
            };

            var localVarContentType = FactSet.SDK.FactSetPeople.Client.ClientUtils.SelectHeaderContentType(_contentTypes);
            if (localVarContentType != null)
            {
                localVarRequestOptions.HeaderParameters.Add("Content-Type", localVarContentType);
            }

            var localVarAccept = FactSet.SDK.FactSetPeople.Client.ClientUtils.SelectHeaderAccept(_accepts);
            if (localVarAccept != null)
            {
                localVarRequestOptions.HeaderParameters.Add("Accept", localVarAccept);
            }

            localVarRequestOptions.QueryParameters.Add(FactSet.SDK.FactSetPeople.Client.ClientUtils.ParameterToMultiMap("csv", "ids", ids));

            // authentication (FactSetApiKey) required
            // http basic authentication required
            if (!string.IsNullOrEmpty(this.Configuration.Username) || !string.IsNullOrEmpty(this.Configuration.Password) && !localVarRequestOptions.HeaderParameters.ContainsKey("Authorization"))
            {
                localVarRequestOptions.HeaderParameters.Add("Authorization", "Basic " + FactSet.SDK.FactSetPeople.Client.ClientUtils.Base64Encode(this.Configuration.Username + ":" + this.Configuration.Password));
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


            localVarRequestOptions.ResponseTypeDictionary = GetPeopleProfilesResponseTypeDictionary;

            // make the HTTP request
            var localVarResponse = await this.AsynchronousClient.GetAsync<PeopleProfilesResponse>("/factset-people/v1/profiles", localVarRequestOptions, this.Configuration, cancellationToken).ConfigureAwait(false);

            if (this.ExceptionFactory != null)
            {
                Exception _exception = this.ExceptionFactory("GetPeopleProfiles", localVarResponse);
                if (_exception != null)
                {
                    throw _exception;
                }
            }

            return localVarResponse;
        }

        /// <summary>
        /// Returns profile information for a large list of people. 
        /// </summary>
        /// <exception cref="FactSet.SDK.FactSetPeople.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="peopleProfilesRequest"></param>
        /// <returns>PeopleProfilesResponse</returns>
        public PeopleProfilesResponse GetPeopleProfilesForList(PeopleProfilesRequest peopleProfilesRequest)
        {
            var localVarResponse = GetPeopleProfilesForListWithHttpInfo(peopleProfilesRequest);
            return localVarResponse.Data;
        }

        /// <summary>
        /// Returns profile information for a large list of people. 
        /// </summary>
        /// <exception cref="FactSet.SDK.FactSetPeople.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="peopleProfilesRequest"></param>
        /// <returns>ApiResponse of PeopleProfilesResponse</returns>
        public ApiResponse<PeopleProfilesResponse> GetPeopleProfilesForListWithHttpInfo(PeopleProfilesRequest peopleProfilesRequest)
        {
            // verify the required parameter 'peopleProfilesRequest' is set
            if (peopleProfilesRequest == null)
            {
                throw new FactSet.SDK.FactSetPeople.Client.ApiException(400, "Missing required parameter 'peopleProfilesRequest' when calling ProfilesApi->GetPeopleProfilesForList");
            }

            FactSet.SDK.FactSetPeople.Client.RequestOptions localVarRequestOptions = new FactSet.SDK.FactSetPeople.Client.RequestOptions();

            string[] _contentTypes = new string[] {
                "application/json"
            };

            // to determine the Accept header
            string[] _accepts = new string[] {
                "application/json"
            };

            var localVarContentType = FactSet.SDK.FactSetPeople.Client.ClientUtils.SelectHeaderContentType(_contentTypes);
            if (localVarContentType != null)
            {
                localVarRequestOptions.HeaderParameters.Add("Content-Type", localVarContentType);
            }

            var localVarAccept = FactSet.SDK.FactSetPeople.Client.ClientUtils.SelectHeaderAccept(_accepts);
            if (localVarAccept != null)
            {
                localVarRequestOptions.HeaderParameters.Add("Accept", localVarAccept);
            }

            localVarRequestOptions.Data = peopleProfilesRequest;

            // authentication (FactSetApiKey) required
            // http basic authentication required
            if (!string.IsNullOrEmpty(this.Configuration.Username) || !string.IsNullOrEmpty(this.Configuration.Password) && !localVarRequestOptions.HeaderParameters.ContainsKey("Authorization"))
            {
                localVarRequestOptions.HeaderParameters.Add("Authorization", "Basic " + FactSet.SDK.FactSetPeople.Client.ClientUtils.Base64Encode(this.Configuration.Username + ":" + this.Configuration.Password));
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

            localVarRequestOptions.ResponseTypeDictionary = GetPeopleProfilesForListResponseTypeDictionary;

            // make the HTTP request
            var localVarResponse = this.Client.Post<
            PeopleProfilesResponse>("/factset-people/v1/profiles", localVarRequestOptions, this.Configuration);
            if (this.ExceptionFactory != null)
            {
                Exception _exception = this.ExceptionFactory("GetPeopleProfilesForList", localVarResponse);
                if (_exception != null)
                {
                    throw _exception;
                }
            }
            return localVarResponse;
        }

        /// <summary>
        /// Returns profile information for a large list of people. 
        /// </summary>
        /// <exception cref="FactSet.SDK.FactSetPeople.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="peopleProfilesRequest"></param>
        /// <param name="cancellationToken">Cancellation Token to cancel the request.</param>
        /// <returns>Task of PeopleProfilesResponse</returns>
        public async System.Threading.Tasks.Task<PeopleProfilesResponse>GetPeopleProfilesForListAsync(PeopleProfilesRequest peopleProfilesRequest, System.Threading.CancellationToken cancellationToken = default(System.Threading.CancellationToken))
        {
            var localVarResponse = await GetPeopleProfilesForListWithHttpInfoAsync(peopleProfilesRequest, cancellationToken).ConfigureAwait(false);
            return localVarResponse.Data;
        }

        /// <summary>
        /// Returns profile information for a large list of people. 
        /// </summary>
        /// <exception cref="FactSet.SDK.FactSetPeople.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="peopleProfilesRequest"></param>
        /// <param name="cancellationToken">Cancellation Token to cancel the request.</param>
        /// <returns>Task of ApiResponse (PeopleProfilesResponse)</returns>

        public async System.Threading.Tasks.Task<ApiResponse<PeopleProfilesResponse>> GetPeopleProfilesForListWithHttpInfoAsync(PeopleProfilesRequest peopleProfilesRequest, System.Threading.CancellationToken cancellationToken = default(System.Threading.CancellationToken))
        {
            // verify the required parameter 'peopleProfilesRequest' is set
            if (peopleProfilesRequest == null)
            {
                throw new FactSet.SDK.FactSetPeople.Client.ApiException(400, "Missing required parameter 'peopleProfilesRequest' when calling ProfilesApi->GetPeopleProfilesForList");
            }


            FactSet.SDK.FactSetPeople.Client.RequestOptions localVarRequestOptions = new FactSet.SDK.FactSetPeople.Client.RequestOptions();

            string[] _contentTypes = new string[] {
                "application/json"
            };

            // to determine the Accept header
            string[] _accepts = new string[] {
                "application/json"
            };

            var localVarContentType = FactSet.SDK.FactSetPeople.Client.ClientUtils.SelectHeaderContentType(_contentTypes);
            if (localVarContentType != null)
            {
                localVarRequestOptions.HeaderParameters.Add("Content-Type", localVarContentType);
            }

            var localVarAccept = FactSet.SDK.FactSetPeople.Client.ClientUtils.SelectHeaderAccept(_accepts);
            if (localVarAccept != null)
            {
                localVarRequestOptions.HeaderParameters.Add("Accept", localVarAccept);
            }

            localVarRequestOptions.Data = peopleProfilesRequest;

            // authentication (FactSetApiKey) required
            // http basic authentication required
            if (!string.IsNullOrEmpty(this.Configuration.Username) || !string.IsNullOrEmpty(this.Configuration.Password) && !localVarRequestOptions.HeaderParameters.ContainsKey("Authorization"))
            {
                localVarRequestOptions.HeaderParameters.Add("Authorization", "Basic " + FactSet.SDK.FactSetPeople.Client.ClientUtils.Base64Encode(this.Configuration.Username + ":" + this.Configuration.Password));
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


            localVarRequestOptions.ResponseTypeDictionary = GetPeopleProfilesForListResponseTypeDictionary;

            // make the HTTP request
            var localVarResponse = await this.AsynchronousClient.PostAsync<PeopleProfilesResponse>("/factset-people/v1/profiles", localVarRequestOptions, this.Configuration, cancellationToken).ConfigureAwait(false);

            if (this.ExceptionFactory != null)
            {
                Exception _exception = this.ExceptionFactory("GetPeopleProfilesForList", localVarResponse);
                if (_exception != null)
                {
                    throw _exception;
                }
            }

            return localVarResponse;
        }

    }
}
