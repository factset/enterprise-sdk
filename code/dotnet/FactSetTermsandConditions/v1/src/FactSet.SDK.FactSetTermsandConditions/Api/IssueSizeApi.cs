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
    public interface IIssueSizeApiSync : IApiAccessor
    {
        #region Synchronous Operations
        /// <summary>
        /// Return Issue Size data for a list of Fixed Income securities.
        /// </summary>
        /// <remarks>
        /// Returns Issue Size data for the Fixed Income security. 
        /// </remarks>
        /// <exception cref="FactSet.SDK.FactSetTermsandConditions.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="ids">List of Fixed Income Security identifiers. Supported symbol types include CUSIP, SEDOL, ISIN, and FactSet Security Permanent Identifier (-S).  **ID LIMIT &#x3D; 250** *per request*. </param>
        /// <returns>IssueSizeResponse</returns>
        IssueSizeResponse GetIssueSize(List<string> ids);

        /// <summary>
        /// Return Issue Size data for a list of Fixed Income securities.
        /// </summary>
        /// <remarks>
        /// Returns Issue Size data for the Fixed Income security. 
        /// </remarks>
        /// <exception cref="FactSet.SDK.FactSetTermsandConditions.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="ids">List of Fixed Income Security identifiers. Supported symbol types include CUSIP, SEDOL, ISIN, and FactSet Security Permanent Identifier (-S).  **ID LIMIT &#x3D; 250** *per request*. </param>
        /// <returns>ApiResponse of IssueSizeResponse</returns>
        ApiResponse<IssueSizeResponse> GetIssueSizeWithHttpInfo(List<string> ids);
        /// <summary>
        /// Return Issue Size data for a large list of Fixed Income securities.
        /// </summary>
        /// <remarks>
        /// Returns Issue Size data for a list of Fixed Income securities. 
        /// </remarks>
        /// <exception cref="FactSet.SDK.FactSetTermsandConditions.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="termsAndConditionsScalarRequest">Request object for Fixed Income Issue Size.</param>
        /// <returns>IssueSizeResponse</returns>
        IssueSizeResponse GetIssueSizeForList(TermsAndConditionsScalarRequest termsAndConditionsScalarRequest);

        /// <summary>
        /// Return Issue Size data for a large list of Fixed Income securities.
        /// </summary>
        /// <remarks>
        /// Returns Issue Size data for a list of Fixed Income securities. 
        /// </remarks>
        /// <exception cref="FactSet.SDK.FactSetTermsandConditions.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="termsAndConditionsScalarRequest">Request object for Fixed Income Issue Size.</param>
        /// <returns>ApiResponse of IssueSizeResponse</returns>
        ApiResponse<IssueSizeResponse> GetIssueSizeForListWithHttpInfo(TermsAndConditionsScalarRequest termsAndConditionsScalarRequest);
        #endregion Synchronous Operations
    }

    /// <summary>
    /// Represents a collection of functions to interact with the API endpoints
    /// </summary>
    public interface IIssueSizeApiAsync : IApiAccessor
    {
        #region Asynchronous Operations
        /// <summary>
        /// Return Issue Size data for a list of Fixed Income securities.
        /// </summary>
        /// <remarks>
        /// Returns Issue Size data for the Fixed Income security. 
        /// </remarks>
        /// <exception cref="FactSet.SDK.FactSetTermsandConditions.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="ids">List of Fixed Income Security identifiers. Supported symbol types include CUSIP, SEDOL, ISIN, and FactSet Security Permanent Identifier (-S).  **ID LIMIT &#x3D; 250** *per request*. </param>
        /// <param name="cancellationToken">Cancellation Token to cancel the request.</param>
        /// <returns>Task of IssueSizeResponse</returns>
        System.Threading.Tasks.Task<IssueSizeResponse> GetIssueSizeAsync(List<string> ids, System.Threading.CancellationToken cancellationToken = default(System.Threading.CancellationToken));

        /// <summary>
        /// Return Issue Size data for a list of Fixed Income securities.
        /// </summary>
        /// <remarks>
        /// Returns Issue Size data for the Fixed Income security. 
        /// </remarks>
        /// <exception cref="FactSet.SDK.FactSetTermsandConditions.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="ids">List of Fixed Income Security identifiers. Supported symbol types include CUSIP, SEDOL, ISIN, and FactSet Security Permanent Identifier (-S).  **ID LIMIT &#x3D; 250** *per request*. </param>
        /// <param name="cancellationToken">Cancellation Token to cancel the request.</param>
        /// <returns>Task of ApiResponse (IssueSizeResponse)</returns>
        System.Threading.Tasks.Task<ApiResponse<IssueSizeResponse>> GetIssueSizeWithHttpInfoAsync(List<string> ids, System.Threading.CancellationToken cancellationToken = default(System.Threading.CancellationToken));
        /// <summary>
        /// Return Issue Size data for a large list of Fixed Income securities.
        /// </summary>
        /// <remarks>
        /// Returns Issue Size data for a list of Fixed Income securities. 
        /// </remarks>
        /// <exception cref="FactSet.SDK.FactSetTermsandConditions.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="termsAndConditionsScalarRequest">Request object for Fixed Income Issue Size.</param>
        /// <param name="cancellationToken">Cancellation Token to cancel the request.</param>
        /// <returns>Task of IssueSizeResponse</returns>
        System.Threading.Tasks.Task<IssueSizeResponse> GetIssueSizeForListAsync(TermsAndConditionsScalarRequest termsAndConditionsScalarRequest, System.Threading.CancellationToken cancellationToken = default(System.Threading.CancellationToken));

        /// <summary>
        /// Return Issue Size data for a large list of Fixed Income securities.
        /// </summary>
        /// <remarks>
        /// Returns Issue Size data for a list of Fixed Income securities. 
        /// </remarks>
        /// <exception cref="FactSet.SDK.FactSetTermsandConditions.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="termsAndConditionsScalarRequest">Request object for Fixed Income Issue Size.</param>
        /// <param name="cancellationToken">Cancellation Token to cancel the request.</param>
        /// <returns>Task of ApiResponse (IssueSizeResponse)</returns>
        System.Threading.Tasks.Task<ApiResponse<IssueSizeResponse>> GetIssueSizeForListWithHttpInfoAsync(TermsAndConditionsScalarRequest termsAndConditionsScalarRequest, System.Threading.CancellationToken cancellationToken = default(System.Threading.CancellationToken));
        #endregion Asynchronous Operations
    }

    /// <summary>
    /// Represents a collection of functions to interact with the API endpoints
    /// </summary>
    public interface IIssueSizeApi : IIssueSizeApiSync, IIssueSizeApiAsync
    {

    }

    /// <summary>
    /// Represents a collection of functions to interact with the API endpoints
    /// </summary>
    public partial class IssueSizeApi : IIssueSizeApi
    {
        private FactSet.SDK.FactSetTermsandConditions.Client.ExceptionFactory _exceptionFactory = (name, response) => null;

        # region Response Type Disctionaries
        
        private static readonly Dictionary<HttpStatusCode, System.Type> GetIssueSizeResponseTypeDictionary = new Dictionary<HttpStatusCode, System.Type>
        {
            { (HttpStatusCode)200, typeof(IssueSizeResponse) },
            { (HttpStatusCode)400, typeof(ErrorResponse) },
            { (HttpStatusCode)401, typeof(ErrorResponse) },
            { (HttpStatusCode)403, typeof(ErrorResponse) },
            { (HttpStatusCode)415, typeof(ErrorResponse) },
            { (HttpStatusCode)500, typeof(ErrorResponse) },
        };

        private static readonly Dictionary<HttpStatusCode, System.Type> GetIssueSizeForListResponseTypeDictionary = new Dictionary<HttpStatusCode, System.Type>
        {
            { (HttpStatusCode)200, typeof(IssueSizeResponse) },
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
        /// Initializes a new instance of the <see cref="IssueSizeApi"/> class.
        /// </summary>
        /// <returns></returns>
        public IssueSizeApi() : this((string)null)
        {
        }

        /// <summary>
        /// Initializes a new instance of the <see cref="IssueSizeApi"/> class.
        /// </summary>
        /// <returns></returns>
        public IssueSizeApi(string basePath)
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
        /// Initializes a new instance of the <see cref="IssueSizeApi"/> class
        /// using Configuration object
        /// </summary>
        /// <param name="configuration">An instance of Configuration</param>
        /// <returns></returns>
        public IssueSizeApi(FactSet.SDK.FactSetTermsandConditions.Client.Configuration configuration)
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
        /// Initializes a new instance of the <see cref="IssueSizeApi"/> class
        /// using a Configuration object and client instance.
        /// </summary>
        /// <param name="client">The client interface for synchronous API access.</param>
        /// <param name="asyncClient">The client interface for asynchronous API access.</param>
        /// <param name="configuration">The configuration object.</param>
        public IssueSizeApi(FactSet.SDK.FactSetTermsandConditions.Client.ISynchronousClient client, FactSet.SDK.FactSetTermsandConditions.Client.IAsynchronousClient asyncClient, FactSet.SDK.FactSetTermsandConditions.Client.IReadableConfiguration configuration)
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
        /// Return Issue Size data for a list of Fixed Income securities. Returns Issue Size data for the Fixed Income security. 
        /// </summary>
        /// <exception cref="FactSet.SDK.FactSetTermsandConditions.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="ids">List of Fixed Income Security identifiers. Supported symbol types include CUSIP, SEDOL, ISIN, and FactSet Security Permanent Identifier (-S).  **ID LIMIT &#x3D; 250** *per request*. </param>
        /// <returns>IssueSizeResponse</returns>
        public IssueSizeResponse GetIssueSize(List<string> ids)
        {
            var localVarResponse = GetIssueSizeWithHttpInfo(ids);
            return localVarResponse.Data;
        }

        /// <summary>
        /// Return Issue Size data for a list of Fixed Income securities. Returns Issue Size data for the Fixed Income security. 
        /// </summary>
        /// <exception cref="FactSet.SDK.FactSetTermsandConditions.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="ids">List of Fixed Income Security identifiers. Supported symbol types include CUSIP, SEDOL, ISIN, and FactSet Security Permanent Identifier (-S).  **ID LIMIT &#x3D; 250** *per request*. </param>
        /// <returns>ApiResponse of IssueSizeResponse</returns>
        public ApiResponse<IssueSizeResponse> GetIssueSizeWithHttpInfo(List<string> ids)
        {
            // verify the required parameter 'ids' is set
            if (ids == null)
            {
                throw new FactSet.SDK.FactSetTermsandConditions.Client.ApiException(400, "Missing required parameter 'ids' when calling IssueSizeApi->GetIssueSize");
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

            localVarRequestOptions.ResponseTypeDictionary = GetIssueSizeResponseTypeDictionary;

            // make the HTTP request
            var localVarResponse = this.Client.Get<
            IssueSizeResponse>("/factset-terms-and-conditions/v1/issue-size", localVarRequestOptions, this.Configuration);
            if (this.ExceptionFactory != null)
            {
                Exception _exception = this.ExceptionFactory("GetIssueSize", localVarResponse);
                if (_exception != null)
                {
                    throw _exception;
                }
            }
            return localVarResponse;
        }

        /// <summary>
        /// Return Issue Size data for a list of Fixed Income securities. Returns Issue Size data for the Fixed Income security. 
        /// </summary>
        /// <exception cref="FactSet.SDK.FactSetTermsandConditions.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="ids">List of Fixed Income Security identifiers. Supported symbol types include CUSIP, SEDOL, ISIN, and FactSet Security Permanent Identifier (-S).  **ID LIMIT &#x3D; 250** *per request*. </param>
        /// <param name="cancellationToken">Cancellation Token to cancel the request.</param>
        /// <returns>Task of IssueSizeResponse</returns>
        public async System.Threading.Tasks.Task<IssueSizeResponse>GetIssueSizeAsync(List<string> ids, System.Threading.CancellationToken cancellationToken = default(System.Threading.CancellationToken))
        {
            var localVarResponse = await GetIssueSizeWithHttpInfoAsync(ids, cancellationToken).ConfigureAwait(false);
            return localVarResponse.Data;
        }

        /// <summary>
        /// Return Issue Size data for a list of Fixed Income securities. Returns Issue Size data for the Fixed Income security. 
        /// </summary>
        /// <exception cref="FactSet.SDK.FactSetTermsandConditions.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="ids">List of Fixed Income Security identifiers. Supported symbol types include CUSIP, SEDOL, ISIN, and FactSet Security Permanent Identifier (-S).  **ID LIMIT &#x3D; 250** *per request*. </param>
        /// <param name="cancellationToken">Cancellation Token to cancel the request.</param>
        /// <returns>Task of ApiResponse (IssueSizeResponse)</returns>

        public async System.Threading.Tasks.Task<ApiResponse<IssueSizeResponse>> GetIssueSizeWithHttpInfoAsync(List<string> ids, System.Threading.CancellationToken cancellationToken = default(System.Threading.CancellationToken))
        {
            // verify the required parameter 'ids' is set
            if (ids == null)
            {
                throw new FactSet.SDK.FactSetTermsandConditions.Client.ApiException(400, "Missing required parameter 'ids' when calling IssueSizeApi->GetIssueSize");
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


            localVarRequestOptions.ResponseTypeDictionary = GetIssueSizeResponseTypeDictionary;

            // make the HTTP request
            var localVarResponse = await this.AsynchronousClient.GetAsync<IssueSizeResponse>("/factset-terms-and-conditions/v1/issue-size", localVarRequestOptions, this.Configuration, cancellationToken).ConfigureAwait(false);

            if (this.ExceptionFactory != null)
            {
                Exception _exception = this.ExceptionFactory("GetIssueSize", localVarResponse);
                if (_exception != null)
                {
                    throw _exception;
                }
            }

            return localVarResponse;
        }

        /// <summary>
        /// Return Issue Size data for a large list of Fixed Income securities. Returns Issue Size data for a list of Fixed Income securities. 
        /// </summary>
        /// <exception cref="FactSet.SDK.FactSetTermsandConditions.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="termsAndConditionsScalarRequest">Request object for Fixed Income Issue Size.</param>
        /// <returns>IssueSizeResponse</returns>
        public IssueSizeResponse GetIssueSizeForList(TermsAndConditionsScalarRequest termsAndConditionsScalarRequest)
        {
            var localVarResponse = GetIssueSizeForListWithHttpInfo(termsAndConditionsScalarRequest);
            return localVarResponse.Data;
        }

        /// <summary>
        /// Return Issue Size data for a large list of Fixed Income securities. Returns Issue Size data for a list of Fixed Income securities. 
        /// </summary>
        /// <exception cref="FactSet.SDK.FactSetTermsandConditions.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="termsAndConditionsScalarRequest">Request object for Fixed Income Issue Size.</param>
        /// <returns>ApiResponse of IssueSizeResponse</returns>
        public ApiResponse<IssueSizeResponse> GetIssueSizeForListWithHttpInfo(TermsAndConditionsScalarRequest termsAndConditionsScalarRequest)
        {
            // verify the required parameter 'termsAndConditionsScalarRequest' is set
            if (termsAndConditionsScalarRequest == null)
            {
                throw new FactSet.SDK.FactSetTermsandConditions.Client.ApiException(400, "Missing required parameter 'termsAndConditionsScalarRequest' when calling IssueSizeApi->GetIssueSizeForList");
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

            localVarRequestOptions.ResponseTypeDictionary = GetIssueSizeForListResponseTypeDictionary;

            // make the HTTP request
            var localVarResponse = this.Client.Post<
            IssueSizeResponse>("/factset-terms-and-conditions/v1/issue-size", localVarRequestOptions, this.Configuration);
            if (this.ExceptionFactory != null)
            {
                Exception _exception = this.ExceptionFactory("GetIssueSizeForList", localVarResponse);
                if (_exception != null)
                {
                    throw _exception;
                }
            }
            return localVarResponse;
        }

        /// <summary>
        /// Return Issue Size data for a large list of Fixed Income securities. Returns Issue Size data for a list of Fixed Income securities. 
        /// </summary>
        /// <exception cref="FactSet.SDK.FactSetTermsandConditions.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="termsAndConditionsScalarRequest">Request object for Fixed Income Issue Size.</param>
        /// <param name="cancellationToken">Cancellation Token to cancel the request.</param>
        /// <returns>Task of IssueSizeResponse</returns>
        public async System.Threading.Tasks.Task<IssueSizeResponse>GetIssueSizeForListAsync(TermsAndConditionsScalarRequest termsAndConditionsScalarRequest, System.Threading.CancellationToken cancellationToken = default(System.Threading.CancellationToken))
        {
            var localVarResponse = await GetIssueSizeForListWithHttpInfoAsync(termsAndConditionsScalarRequest, cancellationToken).ConfigureAwait(false);
            return localVarResponse.Data;
        }

        /// <summary>
        /// Return Issue Size data for a large list of Fixed Income securities. Returns Issue Size data for a list of Fixed Income securities. 
        /// </summary>
        /// <exception cref="FactSet.SDK.FactSetTermsandConditions.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="termsAndConditionsScalarRequest">Request object for Fixed Income Issue Size.</param>
        /// <param name="cancellationToken">Cancellation Token to cancel the request.</param>
        /// <returns>Task of ApiResponse (IssueSizeResponse)</returns>

        public async System.Threading.Tasks.Task<ApiResponse<IssueSizeResponse>> GetIssueSizeForListWithHttpInfoAsync(TermsAndConditionsScalarRequest termsAndConditionsScalarRequest, System.Threading.CancellationToken cancellationToken = default(System.Threading.CancellationToken))
        {
            // verify the required parameter 'termsAndConditionsScalarRequest' is set
            if (termsAndConditionsScalarRequest == null)
            {
                throw new FactSet.SDK.FactSetTermsandConditions.Client.ApiException(400, "Missing required parameter 'termsAndConditionsScalarRequest' when calling IssueSizeApi->GetIssueSizeForList");
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


            localVarRequestOptions.ResponseTypeDictionary = GetIssueSizeForListResponseTypeDictionary;

            // make the HTTP request
            var localVarResponse = await this.AsynchronousClient.PostAsync<IssueSizeResponse>("/factset-terms-and-conditions/v1/issue-size", localVarRequestOptions, this.Configuration, cancellationToken).ConfigureAwait(false);

            if (this.ExceptionFactory != null)
            {
                Exception _exception = this.ExceptionFactory("GetIssueSizeForList", localVarResponse);
                if (_exception != null)
                {
                    throw _exception;
                }
            }

            return localVarResponse;
        }

    }
}
