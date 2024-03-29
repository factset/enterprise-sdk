/*
 * FactSet Terms & Conditions API
 *
 * The FactSet Terms & Conditions API exposes Terms & Conditions data for Fixed Income Corporate, Governement & Agency securities. The FactSet Corporate Government & Agency Terms & Conditions library provides descriptive data on the issue level, such as offering details, redemption information, and coupon schedules. Issuer level data is also available. Coverage is global and includes corporate, sovereign, and agency issues. 
 *
 * The version of the OpenAPI document: 1.0.0
 * Contact: api@factset.com
 * Generated by: https://github.com/openapitools/openapi-generator.git
 */


using System;
using System.Collections.Generic;
using System.Collections.ObjectModel;
using System.Linq;
using System.Net;
using System.Net.Mime;
using FactSet.SDK.FactSetTermsandConditions.Client;
using FactSet.SDK.FactSetTermsandConditions.Model;
using FactSet.SDK.Utils.Authentication;

namespace FactSet.SDK.FactSetTermsandConditions.Api
{

    /// <summary>
    /// Represents a collection of functions to interact with the API endpoints
    /// </summary>
    public interface IAgentsApiSync : IApiAccessor
    {
        #region Synchronous Operations
        /// <summary>
        /// Return Agents items for a Fixed Income security.
        /// </summary>
        /// <remarks>
        /// Returns Agents data items for the Fixed Income security. 
        /// </remarks>
        /// <exception cref="FactSet.SDK.FactSetTermsandConditions.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="ids">List of Fixed Income Security identifiers. Supported symbol types include CUSIP, SEDOL, ISIN, and FactSet Security Permanent Identifier (-S).  **ID LIMIT &#x3D; 250** *per request*. </param>
        /// <returns>AgentsResponse</returns>
        AgentsResponse GetAgents(List<string> ids);

        /// <summary>
        /// Return Agents items for a Fixed Income security.
        /// </summary>
        /// <remarks>
        /// Returns Agents data items for the Fixed Income security. 
        /// </remarks>
        /// <exception cref="FactSet.SDK.FactSetTermsandConditions.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="ids">List of Fixed Income Security identifiers. Supported symbol types include CUSIP, SEDOL, ISIN, and FactSet Security Permanent Identifier (-S).  **ID LIMIT &#x3D; 250** *per request*. </param>
        /// <returns>ApiResponse of AgentsResponse</returns>
        ApiResponse<AgentsResponse> GetAgentsWithHttpInfo(List<string> ids);
        /// <summary>
        /// Return Agents items for a list of Fixed Income securities.
        /// </summary>
        /// <remarks>
        /// Returns Agents data items for a list of Fixed Income securities. 
        /// </remarks>
        /// <exception cref="FactSet.SDK.FactSetTermsandConditions.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="termsAndConditionsScalarRequest">Request object for Fixed Income Agents.</param>
        /// <returns>AgentsResponse</returns>
        AgentsResponse GetAgentsForList(TermsAndConditionsScalarRequest termsAndConditionsScalarRequest);

        /// <summary>
        /// Return Agents items for a list of Fixed Income securities.
        /// </summary>
        /// <remarks>
        /// Returns Agents data items for a list of Fixed Income securities. 
        /// </remarks>
        /// <exception cref="FactSet.SDK.FactSetTermsandConditions.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="termsAndConditionsScalarRequest">Request object for Fixed Income Agents.</param>
        /// <returns>ApiResponse of AgentsResponse</returns>
        ApiResponse<AgentsResponse> GetAgentsForListWithHttpInfo(TermsAndConditionsScalarRequest termsAndConditionsScalarRequest);
        #endregion Synchronous Operations
    }

    /// <summary>
    /// Represents a collection of functions to interact with the API endpoints
    /// </summary>
    public interface IAgentsApiAsync : IApiAccessor
    {
        #region Asynchronous Operations
        /// <summary>
        /// Return Agents items for a Fixed Income security.
        /// </summary>
        /// <remarks>
        /// Returns Agents data items for the Fixed Income security. 
        /// </remarks>
        /// <exception cref="FactSet.SDK.FactSetTermsandConditions.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="ids">List of Fixed Income Security identifiers. Supported symbol types include CUSIP, SEDOL, ISIN, and FactSet Security Permanent Identifier (-S).  **ID LIMIT &#x3D; 250** *per request*. </param>
        /// <param name="cancellationToken">Cancellation Token to cancel the request.</param>
        /// <returns>Task of AgentsResponse</returns>
        System.Threading.Tasks.Task<AgentsResponse> GetAgentsAsync(List<string> ids, System.Threading.CancellationToken cancellationToken = default(System.Threading.CancellationToken));

        /// <summary>
        /// Return Agents items for a Fixed Income security.
        /// </summary>
        /// <remarks>
        /// Returns Agents data items for the Fixed Income security. 
        /// </remarks>
        /// <exception cref="FactSet.SDK.FactSetTermsandConditions.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="ids">List of Fixed Income Security identifiers. Supported symbol types include CUSIP, SEDOL, ISIN, and FactSet Security Permanent Identifier (-S).  **ID LIMIT &#x3D; 250** *per request*. </param>
        /// <param name="cancellationToken">Cancellation Token to cancel the request.</param>
        /// <returns>Task of ApiResponse (AgentsResponse)</returns>
        System.Threading.Tasks.Task<ApiResponse<AgentsResponse>> GetAgentsWithHttpInfoAsync(List<string> ids, System.Threading.CancellationToken cancellationToken = default(System.Threading.CancellationToken));
        /// <summary>
        /// Return Agents items for a list of Fixed Income securities.
        /// </summary>
        /// <remarks>
        /// Returns Agents data items for a list of Fixed Income securities. 
        /// </remarks>
        /// <exception cref="FactSet.SDK.FactSetTermsandConditions.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="termsAndConditionsScalarRequest">Request object for Fixed Income Agents.</param>
        /// <param name="cancellationToken">Cancellation Token to cancel the request.</param>
        /// <returns>Task of AgentsResponse</returns>
        System.Threading.Tasks.Task<AgentsResponse> GetAgentsForListAsync(TermsAndConditionsScalarRequest termsAndConditionsScalarRequest, System.Threading.CancellationToken cancellationToken = default(System.Threading.CancellationToken));

        /// <summary>
        /// Return Agents items for a list of Fixed Income securities.
        /// </summary>
        /// <remarks>
        /// Returns Agents data items for a list of Fixed Income securities. 
        /// </remarks>
        /// <exception cref="FactSet.SDK.FactSetTermsandConditions.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="termsAndConditionsScalarRequest">Request object for Fixed Income Agents.</param>
        /// <param name="cancellationToken">Cancellation Token to cancel the request.</param>
        /// <returns>Task of ApiResponse (AgentsResponse)</returns>
        System.Threading.Tasks.Task<ApiResponse<AgentsResponse>> GetAgentsForListWithHttpInfoAsync(TermsAndConditionsScalarRequest termsAndConditionsScalarRequest, System.Threading.CancellationToken cancellationToken = default(System.Threading.CancellationToken));
        #endregion Asynchronous Operations
    }

    /// <summary>
    /// Represents a collection of functions to interact with the API endpoints
    /// </summary>
    public interface IAgentsApi : IAgentsApiSync, IAgentsApiAsync
    {

    }

    /// <summary>
    /// Represents a collection of functions to interact with the API endpoints
    /// </summary>
    public partial class AgentsApi : IAgentsApi
    {
        private FactSet.SDK.FactSetTermsandConditions.Client.ExceptionFactory _exceptionFactory = (name, response) => null;

        # region Response Type Disctionaries
        
        private static readonly Dictionary<HttpStatusCode, System.Type> GetAgentsResponseTypeDictionary = new Dictionary<HttpStatusCode, System.Type>
        {
            { (HttpStatusCode)200, typeof(AgentsResponse) },
            { (HttpStatusCode)400, typeof(ErrorResponse) },
            { (HttpStatusCode)401, typeof(ErrorResponse) },
            { (HttpStatusCode)403, typeof(ErrorResponse) },
            { (HttpStatusCode)415, typeof(ErrorResponse) },
            { (HttpStatusCode)500, typeof(ErrorResponse) },
        };

        private static readonly Dictionary<HttpStatusCode, System.Type> GetAgentsForListResponseTypeDictionary = new Dictionary<HttpStatusCode, System.Type>
        {
            { (HttpStatusCode)200, typeof(AgentsResponse) },
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
        /// Initializes a new instance of the <see cref="AgentsApi"/> class.
        /// </summary>
        /// <returns></returns>
        public AgentsApi() : this((string)null)
        {
        }

        /// <summary>
        /// Initializes a new instance of the <see cref="AgentsApi"/> class.
        /// </summary>
        /// <returns></returns>
        public AgentsApi(string basePath)
        {
            this.Configuration = FactSet.SDK.FactSetTermsandConditions.Client.Configuration.MergeConfigurations(
                FactSet.SDK.FactSetTermsandConditions.Client.GlobalConfiguration.Instance,
                new FactSet.SDK.FactSetTermsandConditions.Client.Configuration { BasePath = basePath }
            );
            this.Client = new FactSet.SDK.FactSetTermsandConditions.Client.ApiClient(this.Configuration.BasePath);
            this.AsynchronousClient = new FactSet.SDK.FactSetTermsandConditions.Client.ApiClient(this.Configuration.BasePath);
            this.ExceptionFactory = FactSet.SDK.FactSetTermsandConditions.Client.Configuration.DefaultExceptionFactory;
        }

        /// <summary>
        /// Initializes a new instance of the <see cref="AgentsApi"/> class
        /// using Configuration object
        /// </summary>
        /// <param name="configuration">An instance of Configuration</param>
        /// <returns></returns>
        public AgentsApi(FactSet.SDK.FactSetTermsandConditions.Client.Configuration configuration)
        {
            if (configuration == null) throw new ArgumentNullException("configuration");

            this.Configuration = FactSet.SDK.FactSetTermsandConditions.Client.Configuration.MergeConfigurations(
                FactSet.SDK.FactSetTermsandConditions.Client.GlobalConfiguration.Instance,
                configuration
            );
            this.Client = new FactSet.SDK.FactSetTermsandConditions.Client.ApiClient(this.Configuration.BasePath);
            this.AsynchronousClient = new FactSet.SDK.FactSetTermsandConditions.Client.ApiClient(this.Configuration.BasePath);
            ExceptionFactory = FactSet.SDK.FactSetTermsandConditions.Client.Configuration.DefaultExceptionFactory;
        }

        /// <summary>
        /// Initializes a new instance of the <see cref="AgentsApi"/> class
        /// using a Configuration object and client instance.
        /// </summary>
        /// <param name="client">The client interface for synchronous API access.</param>
        /// <param name="asyncClient">The client interface for asynchronous API access.</param>
        /// <param name="configuration">The configuration object.</param>
        public AgentsApi(FactSet.SDK.FactSetTermsandConditions.Client.ISynchronousClient client, FactSet.SDK.FactSetTermsandConditions.Client.IAsynchronousClient asyncClient, FactSet.SDK.FactSetTermsandConditions.Client.IReadableConfiguration configuration)
        {
            if (client == null) throw new ArgumentNullException("client");
            if (asyncClient == null) throw new ArgumentNullException("asyncClient");
            if (configuration == null) throw new ArgumentNullException("configuration");

            this.Client = client;
            this.AsynchronousClient = asyncClient;
            this.Configuration = configuration;
            this.ExceptionFactory = FactSet.SDK.FactSetTermsandConditions.Client.Configuration.DefaultExceptionFactory;
        }

        /// <summary>
        /// The client for accessing this underlying API asynchronously.
        /// </summary>
        public FactSet.SDK.FactSetTermsandConditions.Client.IAsynchronousClient AsynchronousClient { get; set; }

        /// <summary>
        /// The client for accessing this underlying API synchronously.
        /// </summary>
        public FactSet.SDK.FactSetTermsandConditions.Client.ISynchronousClient Client { get; set; }

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
        public FactSet.SDK.FactSetTermsandConditions.Client.IReadableConfiguration Configuration { get; set; }

        /// <summary>
        /// Provides a factory method hook for the creation of exceptions.
        /// </summary>
        public FactSet.SDK.FactSetTermsandConditions.Client.ExceptionFactory ExceptionFactory
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
        /// Return Agents items for a Fixed Income security. Returns Agents data items for the Fixed Income security. 
        /// </summary>
        /// <exception cref="FactSet.SDK.FactSetTermsandConditions.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="ids">List of Fixed Income Security identifiers. Supported symbol types include CUSIP, SEDOL, ISIN, and FactSet Security Permanent Identifier (-S).  **ID LIMIT &#x3D; 250** *per request*. </param>
        /// <returns>AgentsResponse</returns>
        public AgentsResponse GetAgents(List<string> ids)
        {
            var localVarResponse = GetAgentsWithHttpInfo(ids);
            return localVarResponse.Data;
        }

        /// <summary>
        /// Return Agents items for a Fixed Income security. Returns Agents data items for the Fixed Income security. 
        /// </summary>
        /// <exception cref="FactSet.SDK.FactSetTermsandConditions.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="ids">List of Fixed Income Security identifiers. Supported symbol types include CUSIP, SEDOL, ISIN, and FactSet Security Permanent Identifier (-S).  **ID LIMIT &#x3D; 250** *per request*. </param>
        /// <returns>ApiResponse of AgentsResponse</returns>
        public ApiResponse<AgentsResponse> GetAgentsWithHttpInfo(List<string> ids)
        {
            // verify the required parameter 'ids' is set
            if (ids == null)
            {
                throw new FactSet.SDK.FactSetTermsandConditions.Client.ApiException(400, "Missing required parameter 'ids' when calling AgentsApi->GetAgents");
            }

            FactSet.SDK.FactSetTermsandConditions.Client.RequestOptions localVarRequestOptions = new FactSet.SDK.FactSetTermsandConditions.Client.RequestOptions();

            string[] _contentTypes = new string[] {
            };

            // to determine the Accept header
            string[] _accepts = new string[] {
                "application/json"
            };

            var localVarContentType = FactSet.SDK.FactSetTermsandConditions.Client.ClientUtils.SelectHeaderContentType(_contentTypes);
            if (localVarContentType != null)
            {
                localVarRequestOptions.HeaderParameters.Add("Content-Type", localVarContentType);
            }

            var localVarAccept = FactSet.SDK.FactSetTermsandConditions.Client.ClientUtils.SelectHeaderAccept(_accepts);
            if (localVarAccept != null)
            {
                localVarRequestOptions.HeaderParameters.Add("Accept", localVarAccept);
            }

            localVarRequestOptions.QueryParameters.Add(FactSet.SDK.FactSetTermsandConditions.Client.ClientUtils.ParameterToMultiMap("csv", "ids", ids));

            // authentication (FactSetApiKey) required
            // http basic authentication required
            if (!string.IsNullOrEmpty(this.Configuration.Username) || !string.IsNullOrEmpty(this.Configuration.Password) && !localVarRequestOptions.HeaderParameters.ContainsKey("Authorization"))
            {
                localVarRequestOptions.HeaderParameters.Add("Authorization", "Basic " + FactSet.SDK.FactSetTermsandConditions.Client.ClientUtils.Base64Encode(this.Configuration.Username + ":" + this.Configuration.Password));
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

            localVarRequestOptions.ResponseTypeDictionary = GetAgentsResponseTypeDictionary;

            // make the HTTP request
            var localVarResponse = this.Client.Get<
            AgentsResponse>("/factset-terms-and-conditions/v1/agents", localVarRequestOptions, this.Configuration);
            if (this.ExceptionFactory != null)
            {
                Exception _exception = this.ExceptionFactory("GetAgents", localVarResponse);
                if (_exception != null)
                {
                    throw _exception;
                }
            }
            return localVarResponse;
        }

        /// <summary>
        /// Return Agents items for a Fixed Income security. Returns Agents data items for the Fixed Income security. 
        /// </summary>
        /// <exception cref="FactSet.SDK.FactSetTermsandConditions.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="ids">List of Fixed Income Security identifiers. Supported symbol types include CUSIP, SEDOL, ISIN, and FactSet Security Permanent Identifier (-S).  **ID LIMIT &#x3D; 250** *per request*. </param>
        /// <param name="cancellationToken">Cancellation Token to cancel the request.</param>
        /// <returns>Task of AgentsResponse</returns>
        public async System.Threading.Tasks.Task<AgentsResponse>GetAgentsAsync(List<string> ids, System.Threading.CancellationToken cancellationToken = default(System.Threading.CancellationToken))
        {
            var localVarResponse = await GetAgentsWithHttpInfoAsync(ids, cancellationToken).ConfigureAwait(false);
            return localVarResponse.Data;
        }

        /// <summary>
        /// Return Agents items for a Fixed Income security. Returns Agents data items for the Fixed Income security. 
        /// </summary>
        /// <exception cref="FactSet.SDK.FactSetTermsandConditions.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="ids">List of Fixed Income Security identifiers. Supported symbol types include CUSIP, SEDOL, ISIN, and FactSet Security Permanent Identifier (-S).  **ID LIMIT &#x3D; 250** *per request*. </param>
        /// <param name="cancellationToken">Cancellation Token to cancel the request.</param>
        /// <returns>Task of ApiResponse (AgentsResponse)</returns>

        public async System.Threading.Tasks.Task<ApiResponse<AgentsResponse>> GetAgentsWithHttpInfoAsync(List<string> ids, System.Threading.CancellationToken cancellationToken = default(System.Threading.CancellationToken))
        {
            // verify the required parameter 'ids' is set
            if (ids == null)
            {
                throw new FactSet.SDK.FactSetTermsandConditions.Client.ApiException(400, "Missing required parameter 'ids' when calling AgentsApi->GetAgents");
            }


            FactSet.SDK.FactSetTermsandConditions.Client.RequestOptions localVarRequestOptions = new FactSet.SDK.FactSetTermsandConditions.Client.RequestOptions();

            string[] _contentTypes = new string[] {
            };

            // to determine the Accept header
            string[] _accepts = new string[] {
                "application/json"
            };

            var localVarContentType = FactSet.SDK.FactSetTermsandConditions.Client.ClientUtils.SelectHeaderContentType(_contentTypes);
            if (localVarContentType != null)
            {
                localVarRequestOptions.HeaderParameters.Add("Content-Type", localVarContentType);
            }

            var localVarAccept = FactSet.SDK.FactSetTermsandConditions.Client.ClientUtils.SelectHeaderAccept(_accepts);
            if (localVarAccept != null)
            {
                localVarRequestOptions.HeaderParameters.Add("Accept", localVarAccept);
            }

            localVarRequestOptions.QueryParameters.Add(FactSet.SDK.FactSetTermsandConditions.Client.ClientUtils.ParameterToMultiMap("csv", "ids", ids));

            // authentication (FactSetApiKey) required
            // http basic authentication required
            if (!string.IsNullOrEmpty(this.Configuration.Username) || !string.IsNullOrEmpty(this.Configuration.Password) && !localVarRequestOptions.HeaderParameters.ContainsKey("Authorization"))
            {
                localVarRequestOptions.HeaderParameters.Add("Authorization", "Basic " + FactSet.SDK.FactSetTermsandConditions.Client.ClientUtils.Base64Encode(this.Configuration.Username + ":" + this.Configuration.Password));
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


            localVarRequestOptions.ResponseTypeDictionary = GetAgentsResponseTypeDictionary;

            // make the HTTP request
            var localVarResponse = await this.AsynchronousClient.GetAsync<AgentsResponse>("/factset-terms-and-conditions/v1/agents", localVarRequestOptions, this.Configuration, cancellationToken).ConfigureAwait(false);

            if (this.ExceptionFactory != null)
            {
                Exception _exception = this.ExceptionFactory("GetAgents", localVarResponse);
                if (_exception != null)
                {
                    throw _exception;
                }
            }

            return localVarResponse;
        }

        /// <summary>
        /// Return Agents items for a list of Fixed Income securities. Returns Agents data items for a list of Fixed Income securities. 
        /// </summary>
        /// <exception cref="FactSet.SDK.FactSetTermsandConditions.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="termsAndConditionsScalarRequest">Request object for Fixed Income Agents.</param>
        /// <returns>AgentsResponse</returns>
        public AgentsResponse GetAgentsForList(TermsAndConditionsScalarRequest termsAndConditionsScalarRequest)
        {
            var localVarResponse = GetAgentsForListWithHttpInfo(termsAndConditionsScalarRequest);
            return localVarResponse.Data;
        }

        /// <summary>
        /// Return Agents items for a list of Fixed Income securities. Returns Agents data items for a list of Fixed Income securities. 
        /// </summary>
        /// <exception cref="FactSet.SDK.FactSetTermsandConditions.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="termsAndConditionsScalarRequest">Request object for Fixed Income Agents.</param>
        /// <returns>ApiResponse of AgentsResponse</returns>
        public ApiResponse<AgentsResponse> GetAgentsForListWithHttpInfo(TermsAndConditionsScalarRequest termsAndConditionsScalarRequest)
        {
            // verify the required parameter 'termsAndConditionsScalarRequest' is set
            if (termsAndConditionsScalarRequest == null)
            {
                throw new FactSet.SDK.FactSetTermsandConditions.Client.ApiException(400, "Missing required parameter 'termsAndConditionsScalarRequest' when calling AgentsApi->GetAgentsForList");
            }

            FactSet.SDK.FactSetTermsandConditions.Client.RequestOptions localVarRequestOptions = new FactSet.SDK.FactSetTermsandConditions.Client.RequestOptions();

            string[] _contentTypes = new string[] {
                "application/json"
            };

            // to determine the Accept header
            string[] _accepts = new string[] {
                "application/json"
            };

            var localVarContentType = FactSet.SDK.FactSetTermsandConditions.Client.ClientUtils.SelectHeaderContentType(_contentTypes);
            if (localVarContentType != null)
            {
                localVarRequestOptions.HeaderParameters.Add("Content-Type", localVarContentType);
            }

            var localVarAccept = FactSet.SDK.FactSetTermsandConditions.Client.ClientUtils.SelectHeaderAccept(_accepts);
            if (localVarAccept != null)
            {
                localVarRequestOptions.HeaderParameters.Add("Accept", localVarAccept);
            }

            localVarRequestOptions.Data = termsAndConditionsScalarRequest;

            // authentication (FactSetApiKey) required
            // http basic authentication required
            if (!string.IsNullOrEmpty(this.Configuration.Username) || !string.IsNullOrEmpty(this.Configuration.Password) && !localVarRequestOptions.HeaderParameters.ContainsKey("Authorization"))
            {
                localVarRequestOptions.HeaderParameters.Add("Authorization", "Basic " + FactSet.SDK.FactSetTermsandConditions.Client.ClientUtils.Base64Encode(this.Configuration.Username + ":" + this.Configuration.Password));
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

            localVarRequestOptions.ResponseTypeDictionary = GetAgentsForListResponseTypeDictionary;

            // make the HTTP request
            var localVarResponse = this.Client.Post<
            AgentsResponse>("/factset-terms-and-conditions/v1/agents", localVarRequestOptions, this.Configuration);
            if (this.ExceptionFactory != null)
            {
                Exception _exception = this.ExceptionFactory("GetAgentsForList", localVarResponse);
                if (_exception != null)
                {
                    throw _exception;
                }
            }
            return localVarResponse;
        }

        /// <summary>
        /// Return Agents items for a list of Fixed Income securities. Returns Agents data items for a list of Fixed Income securities. 
        /// </summary>
        /// <exception cref="FactSet.SDK.FactSetTermsandConditions.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="termsAndConditionsScalarRequest">Request object for Fixed Income Agents.</param>
        /// <param name="cancellationToken">Cancellation Token to cancel the request.</param>
        /// <returns>Task of AgentsResponse</returns>
        public async System.Threading.Tasks.Task<AgentsResponse>GetAgentsForListAsync(TermsAndConditionsScalarRequest termsAndConditionsScalarRequest, System.Threading.CancellationToken cancellationToken = default(System.Threading.CancellationToken))
        {
            var localVarResponse = await GetAgentsForListWithHttpInfoAsync(termsAndConditionsScalarRequest, cancellationToken).ConfigureAwait(false);
            return localVarResponse.Data;
        }

        /// <summary>
        /// Return Agents items for a list of Fixed Income securities. Returns Agents data items for a list of Fixed Income securities. 
        /// </summary>
        /// <exception cref="FactSet.SDK.FactSetTermsandConditions.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="termsAndConditionsScalarRequest">Request object for Fixed Income Agents.</param>
        /// <param name="cancellationToken">Cancellation Token to cancel the request.</param>
        /// <returns>Task of ApiResponse (AgentsResponse)</returns>

        public async System.Threading.Tasks.Task<ApiResponse<AgentsResponse>> GetAgentsForListWithHttpInfoAsync(TermsAndConditionsScalarRequest termsAndConditionsScalarRequest, System.Threading.CancellationToken cancellationToken = default(System.Threading.CancellationToken))
        {
            // verify the required parameter 'termsAndConditionsScalarRequest' is set
            if (termsAndConditionsScalarRequest == null)
            {
                throw new FactSet.SDK.FactSetTermsandConditions.Client.ApiException(400, "Missing required parameter 'termsAndConditionsScalarRequest' when calling AgentsApi->GetAgentsForList");
            }


            FactSet.SDK.FactSetTermsandConditions.Client.RequestOptions localVarRequestOptions = new FactSet.SDK.FactSetTermsandConditions.Client.RequestOptions();

            string[] _contentTypes = new string[] {
                "application/json"
            };

            // to determine the Accept header
            string[] _accepts = new string[] {
                "application/json"
            };

            var localVarContentType = FactSet.SDK.FactSetTermsandConditions.Client.ClientUtils.SelectHeaderContentType(_contentTypes);
            if (localVarContentType != null)
            {
                localVarRequestOptions.HeaderParameters.Add("Content-Type", localVarContentType);
            }

            var localVarAccept = FactSet.SDK.FactSetTermsandConditions.Client.ClientUtils.SelectHeaderAccept(_accepts);
            if (localVarAccept != null)
            {
                localVarRequestOptions.HeaderParameters.Add("Accept", localVarAccept);
            }

            localVarRequestOptions.Data = termsAndConditionsScalarRequest;

            // authentication (FactSetApiKey) required
            // http basic authentication required
            if (!string.IsNullOrEmpty(this.Configuration.Username) || !string.IsNullOrEmpty(this.Configuration.Password) && !localVarRequestOptions.HeaderParameters.ContainsKey("Authorization"))
            {
                localVarRequestOptions.HeaderParameters.Add("Authorization", "Basic " + FactSet.SDK.FactSetTermsandConditions.Client.ClientUtils.Base64Encode(this.Configuration.Username + ":" + this.Configuration.Password));
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


            localVarRequestOptions.ResponseTypeDictionary = GetAgentsForListResponseTypeDictionary;

            // make the HTTP request
            var localVarResponse = await this.AsynchronousClient.PostAsync<AgentsResponse>("/factset-terms-and-conditions/v1/agents", localVarRequestOptions, this.Configuration, cancellationToken).ConfigureAwait(false);

            if (this.ExceptionFactory != null)
            {
                Exception _exception = this.ExceptionFactory("GetAgentsForList", localVarResponse);
                if (_exception != null)
                {
                    throw _exception;
                }
            }

            return localVarResponse;
        }

    }
}
