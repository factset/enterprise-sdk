/*
 * FactSet Fundamentals API
 *
 * Gain access to current, comprehensive, and comparative information on securities in worldwide developed and emerging markets. Composed of annual and interim/quarterly data, detailed historical financial statement content, per-share data, and calculated ratios, FactSet Fundamentals provides you with the information you need for a global investment perspective.<p>This API is rate-limited to 10 requests per second and 10 concurrent requests per user.</p> 
 *
 * The version of the OpenAPI document: 2.2.0
 * Contact: api@factset.com
 * Generated by: https://github.com/openapitools/openapi-generator.git
 */


using System;
using System.Collections.Generic;
using System.Collections.ObjectModel;
using System.Linq;
using System.Net;
using System.Net.Mime;
using FactSet.SDK.FactSetFundamentals.Client;
using FactSet.SDK.FactSetFundamentals.Model;
using FactSet.SDK.Utils.Authentication;

namespace FactSet.SDK.FactSetFundamentals.Api
{

    /// <summary>
    /// Represents a collection of functions to interact with the API endpoints
    /// </summary>
    public interface IBatchProcessingApiSync : IApiAccessor
    {
        #region Synchronous Operations
        /// <summary>
        /// Returns the response for a Batch Request 
        /// </summary>
        /// <remarks>
        /// Returns the response data for the underlying batch request that is specified by the id.  By default, this endpoint will return data as JSON. If you wish to receive your data in CSV format, you can edit the header to have the \&quot;accept\&quot; parameter as \&quot;text/csv\&quot; instead of \&quot;application/json\&quot;. 
        /// </remarks>
        /// <exception cref="FactSet.SDK.FactSetFundamentals.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="id">Batch Request identifier.</param>
        /// <returns>BatchProcessingApi.GetBatchDataResponseWrapper</returns>
        BatchProcessingApi.GetBatchDataResponseWrapper GetBatchData(Guid id);

        /// <summary>
        /// Returns the response for a Batch Request 
        /// </summary>
        /// <remarks>
        /// Returns the response data for the underlying batch request that is specified by the id.  By default, this endpoint will return data as JSON. If you wish to receive your data in CSV format, you can edit the header to have the \&quot;accept\&quot; parameter as \&quot;text/csv\&quot; instead of \&quot;application/json\&quot;. 
        /// </remarks>
        /// <exception cref="FactSet.SDK.FactSetFundamentals.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="id">Batch Request identifier.</param>
        /// <returns>ApiResponse of BatchProcessingApi.GetBatchDataResponseWrapper</returns>
        ApiResponse<BatchProcessingApi.GetBatchDataResponseWrapper> GetBatchDataWithHttpInfo(Guid id);
        /// <summary>
        /// Returns the status for a Batch Request 
        /// </summary>
        /// <remarks>
        /// Return the status for the underlying batch request that is specified by the id.
        /// </remarks>
        /// <exception cref="FactSet.SDK.FactSetFundamentals.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="id">Batch Request identifier.</param>
        /// <returns>BatchStatusResponse</returns>
        BatchStatusResponse GetBatchStatus(Guid id);

        /// <summary>
        /// Returns the status for a Batch Request 
        /// </summary>
        /// <remarks>
        /// Return the status for the underlying batch request that is specified by the id.
        /// </remarks>
        /// <exception cref="FactSet.SDK.FactSetFundamentals.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="id">Batch Request identifier.</param>
        /// <returns>ApiResponse of BatchStatusResponse</returns>
        ApiResponse<BatchStatusResponse> GetBatchStatusWithHttpInfo(Guid id);
        #endregion Synchronous Operations
    }

    /// <summary>
    /// Represents a collection of functions to interact with the API endpoints
    /// </summary>
    public interface IBatchProcessingApiAsync : IApiAccessor
    {
        #region Asynchronous Operations
        /// <summary>
        /// Returns the response for a Batch Request 
        /// </summary>
        /// <remarks>
        /// Returns the response data for the underlying batch request that is specified by the id.  By default, this endpoint will return data as JSON. If you wish to receive your data in CSV format, you can edit the header to have the \&quot;accept\&quot; parameter as \&quot;text/csv\&quot; instead of \&quot;application/json\&quot;. 
        /// </remarks>
        /// <exception cref="FactSet.SDK.FactSetFundamentals.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="id">Batch Request identifier.</param>
        /// <param name="cancellationToken">Cancellation Token to cancel the request.</param>
        /// <returns>Task of BatchResultResponse</returns>
        System.Threading.Tasks.Task<BatchProcessingApi.GetBatchDataResponseWrapper> GetBatchDataAsync(Guid id, System.Threading.CancellationToken cancellationToken = default(System.Threading.CancellationToken));

        /// <summary>
        /// Returns the response for a Batch Request 
        /// </summary>
        /// <remarks>
        /// Returns the response data for the underlying batch request that is specified by the id.  By default, this endpoint will return data as JSON. If you wish to receive your data in CSV format, you can edit the header to have the \&quot;accept\&quot; parameter as \&quot;text/csv\&quot; instead of \&quot;application/json\&quot;. 
        /// </remarks>
        /// <exception cref="FactSet.SDK.FactSetFundamentals.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="id">Batch Request identifier.</param>
        /// <param name="cancellationToken">Cancellation Token to cancel the request.</param>
        /// <returns>Task of ApiResponse (BatchProcessingApi.GetBatchDataResponseWrapper)</returns>
        System.Threading.Tasks.Task<ApiResponse<BatchProcessingApi.GetBatchDataResponseWrapper>> GetBatchDataWithHttpInfoAsync(Guid id, System.Threading.CancellationToken cancellationToken = default(System.Threading.CancellationToken));
        /// <summary>
        /// Returns the status for a Batch Request 
        /// </summary>
        /// <remarks>
        /// Return the status for the underlying batch request that is specified by the id.
        /// </remarks>
        /// <exception cref="FactSet.SDK.FactSetFundamentals.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="id">Batch Request identifier.</param>
        /// <param name="cancellationToken">Cancellation Token to cancel the request.</param>
        /// <returns>Task of BatchStatusResponse</returns>
        System.Threading.Tasks.Task<BatchStatusResponse> GetBatchStatusAsync(Guid id, System.Threading.CancellationToken cancellationToken = default(System.Threading.CancellationToken));

        /// <summary>
        /// Returns the status for a Batch Request 
        /// </summary>
        /// <remarks>
        /// Return the status for the underlying batch request that is specified by the id.
        /// </remarks>
        /// <exception cref="FactSet.SDK.FactSetFundamentals.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="id">Batch Request identifier.</param>
        /// <param name="cancellationToken">Cancellation Token to cancel the request.</param>
        /// <returns>Task of ApiResponse (BatchStatusResponse)</returns>
        System.Threading.Tasks.Task<ApiResponse<BatchStatusResponse>> GetBatchStatusWithHttpInfoAsync(Guid id, System.Threading.CancellationToken cancellationToken = default(System.Threading.CancellationToken));
        #endregion Asynchronous Operations
    }

    /// <summary>
    /// Represents a collection of functions to interact with the API endpoints
    /// </summary>
    public interface IBatchProcessingApi : IBatchProcessingApiSync, IBatchProcessingApiAsync
    {

    }

    /// <summary>
    /// Represents a collection of functions to interact with the API endpoints
    /// </summary>
    public partial class BatchProcessingApi : IBatchProcessingApi
    {
        private FactSet.SDK.FactSetFundamentals.Client.ExceptionFactory _exceptionFactory = (name, response) => null;

        # region Response Type Disctionaries
        
        private static readonly Dictionary<HttpStatusCode, System.Type> GetBatchDataResponseTypeDictionary = new Dictionary<HttpStatusCode, System.Type>
        {
            { (HttpStatusCode)200, typeof(BatchResultResponse) },
            { (HttpStatusCode)202, typeof(BatchStatusResponse) },
            { (HttpStatusCode)404, typeof(ErrorResponse) },
        };

        private static readonly Dictionary<HttpStatusCode, System.Type> GetBatchStatusResponseTypeDictionary = new Dictionary<HttpStatusCode, System.Type>
        {
            { (HttpStatusCode)201, typeof(BatchStatusResponse) },
            { (HttpStatusCode)202, typeof(BatchStatusResponse) },
            { (HttpStatusCode)404, typeof(ErrorResponse) },
        };

        # endregion Response Type Disctionaries

        # region Api Response Objects
        
        /// <summary>
        /// Wrapper to support GET /batch-result returning different types
        /// per status code.
        ///
        /// <list>
        /// <item>
        /// <description>
        /// 200 : BatchResultResponse<br />
        /// Request Response Object when the batch request has been completed and the response is created
        /// </description>
        /// </item>
        /// 
        /// <item>
        /// <description>
        /// 202 : BatchStatusResponse<br />
        /// The batch Request has not finished and the result has NOT been created.
        /// </description>
        /// </item>
        /// </list>
        ///
        /// <example>
        /// <code>
        /// GetBatchDataResponseWrapper response = ...;
        /// switch (response.statusCode)
        /// {
        ///   case 200:
        ///     BatchResultResponse data200 = response.getResponse200();
        ///     break;
        ///   case 202:
        ///     BatchStatusResponse data202 = response.getResponse202();
        ///     break;
        ///  }
        /// </code>
        /// </example>
        /// </summary>
        public class GetBatchDataResponseWrapper {

            /// <summary>This constructor initializes the new GetBatchDataResponseWrapper to
            /// (<paramref name="statusCode"/>,<paramref name="response"/>).
            /// </summary>
            /// <param name="statusCode">Http status code of the response</param>
            /// <param name="response">Raw response</param>
            public GetBatchDataResponseWrapper(HttpStatusCode statusCode, object response)
            {
                StatusCode = statusCode;
                Response = response;
            }

            /// <summary>
            /// Http status code of the response
            /// </summary>
            public HttpStatusCode StatusCode { get; }

            /// <summary>
            /// Raw Object response
            /// </summary>
            public object Response { get; }

            
            /// <summary>
            /// Request Response Object when the batch request has been completed and the response is created
            /// </summary>
            public BatchResultResponse Response200
            {
                get
                {
                    if (StatusCode != (HttpStatusCode) 200)
                    {
                        throw new FactSet.SDK.FactSetFundamentals.Client.ApiException(500, "Invalid response getter called. Response200 can't return a " + StatusCode + " response");
                    }
                    return (BatchResultResponse) Response;
                }
            }
            
            /// <summary>
            /// The batch Request has not finished and the result has NOT been created.
            /// </summary>
            public BatchStatusResponse Response202
            {
                get
                {
                    if (StatusCode != (HttpStatusCode) 202)
                    {
                        throw new FactSet.SDK.FactSetFundamentals.Client.ApiException(500, "Invalid response getter called. Response202 can't return a " + StatusCode + " response");
                    }
                    return (BatchStatusResponse) Response;
                }
            }
            
        }



        # endregion Api Response Objects

        /// <summary>
        /// Initializes a new instance of the <see cref="BatchProcessingApi"/> class.
        /// </summary>
        /// <returns></returns>
        public BatchProcessingApi() : this((string)null)
        {
        }

        /// <summary>
        /// Initializes a new instance of the <see cref="BatchProcessingApi"/> class.
        /// </summary>
        /// <returns></returns>
        public BatchProcessingApi(string basePath)
        {
            this.Configuration = FactSet.SDK.FactSetFundamentals.Client.Configuration.MergeConfigurations(
                FactSet.SDK.FactSetFundamentals.Client.GlobalConfiguration.Instance,
                new FactSet.SDK.FactSetFundamentals.Client.Configuration { BasePath = basePath }
            );
            this.Client = new FactSet.SDK.FactSetFundamentals.Client.ApiClient(this.Configuration.BasePath);
            this.AsynchronousClient = new FactSet.SDK.FactSetFundamentals.Client.ApiClient(this.Configuration.BasePath);
            this.ExceptionFactory = FactSet.SDK.FactSetFundamentals.Client.Configuration.DefaultExceptionFactory;
        }

        /// <summary>
        /// Initializes a new instance of the <see cref="BatchProcessingApi"/> class
        /// using Configuration object
        /// </summary>
        /// <param name="configuration">An instance of Configuration</param>
        /// <returns></returns>
        public BatchProcessingApi(FactSet.SDK.FactSetFundamentals.Client.Configuration configuration)
        {
            if (configuration == null) throw new ArgumentNullException("configuration");

            this.Configuration = FactSet.SDK.FactSetFundamentals.Client.Configuration.MergeConfigurations(
                FactSet.SDK.FactSetFundamentals.Client.GlobalConfiguration.Instance,
                configuration
            );
            this.Client = new FactSet.SDK.FactSetFundamentals.Client.ApiClient(this.Configuration.BasePath);
            this.AsynchronousClient = new FactSet.SDK.FactSetFundamentals.Client.ApiClient(this.Configuration.BasePath);
            ExceptionFactory = FactSet.SDK.FactSetFundamentals.Client.Configuration.DefaultExceptionFactory;
        }

        /// <summary>
        /// Initializes a new instance of the <see cref="BatchProcessingApi"/> class
        /// using a Configuration object and client instance.
        /// </summary>
        /// <param name="client">The client interface for synchronous API access.</param>
        /// <param name="asyncClient">The client interface for asynchronous API access.</param>
        /// <param name="configuration">The configuration object.</param>
        public BatchProcessingApi(FactSet.SDK.FactSetFundamentals.Client.ISynchronousClient client, FactSet.SDK.FactSetFundamentals.Client.IAsynchronousClient asyncClient, FactSet.SDK.FactSetFundamentals.Client.IReadableConfiguration configuration)
        {
            if (client == null) throw new ArgumentNullException("client");
            if (asyncClient == null) throw new ArgumentNullException("asyncClient");
            if (configuration == null) throw new ArgumentNullException("configuration");

            this.Client = client;
            this.AsynchronousClient = asyncClient;
            this.Configuration = configuration;
            this.ExceptionFactory = FactSet.SDK.FactSetFundamentals.Client.Configuration.DefaultExceptionFactory;
        }

        /// <summary>
        /// The client for accessing this underlying API asynchronously.
        /// </summary>
        public FactSet.SDK.FactSetFundamentals.Client.IAsynchronousClient AsynchronousClient { get; set; }

        /// <summary>
        /// The client for accessing this underlying API synchronously.
        /// </summary>
        public FactSet.SDK.FactSetFundamentals.Client.ISynchronousClient Client { get; set; }

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
        public FactSet.SDK.FactSetFundamentals.Client.IReadableConfiguration Configuration { get; set; }

        /// <summary>
        /// Provides a factory method hook for the creation of exceptions.
        /// </summary>
        public FactSet.SDK.FactSetFundamentals.Client.ExceptionFactory ExceptionFactory
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
        /// Returns the response for a Batch Request  Returns the response data for the underlying batch request that is specified by the id.  By default, this endpoint will return data as JSON. If you wish to receive your data in CSV format, you can edit the header to have the \&quot;accept\&quot; parameter as \&quot;text/csv\&quot; instead of \&quot;application/json\&quot;. 
        /// </summary>
        /// <exception cref="FactSet.SDK.FactSetFundamentals.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="id">Batch Request identifier.</param>
        /// <returns>BatchProcessingApi.GetBatchDataResponseWrapper</returns>
        public BatchProcessingApi.GetBatchDataResponseWrapper GetBatchData(Guid id)
        {
            var localVarResponse = GetBatchDataWithHttpInfo(id);
            return localVarResponse.Data;
        }

        /// <summary>
        /// Returns the response for a Batch Request  Returns the response data for the underlying batch request that is specified by the id.  By default, this endpoint will return data as JSON. If you wish to receive your data in CSV format, you can edit the header to have the \&quot;accept\&quot; parameter as \&quot;text/csv\&quot; instead of \&quot;application/json\&quot;. 
        /// </summary>
        /// <exception cref="FactSet.SDK.FactSetFundamentals.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="id">Batch Request identifier.</param>
        /// <returns>ApiResponse of BatchResultResponse</returns>
        public ApiResponse<BatchProcessingApi.GetBatchDataResponseWrapper> GetBatchDataWithHttpInfo(Guid id)
        {
            FactSet.SDK.FactSetFundamentals.Client.RequestOptions localVarRequestOptions = new FactSet.SDK.FactSetFundamentals.Client.RequestOptions();

            string[] _contentTypes = new string[] {
            };

            // to determine the Accept header
            string[] _accepts = new string[] {
                "application/json"
            };

            var localVarContentType = FactSet.SDK.FactSetFundamentals.Client.ClientUtils.SelectHeaderContentType(_contentTypes);
            if (localVarContentType != null)
            {
                localVarRequestOptions.HeaderParameters.Add("Content-Type", localVarContentType);
            }

            var localVarAccept = FactSet.SDK.FactSetFundamentals.Client.ClientUtils.SelectHeaderAccept(_accepts);
            if (localVarAccept != null)
            {
                localVarRequestOptions.HeaderParameters.Add("Accept", localVarAccept);
            }

            localVarRequestOptions.QueryParameters.Add(FactSet.SDK.FactSetFundamentals.Client.ClientUtils.ParameterToMultiMap("", "id", id));

            // authentication (FactSetApiKey) required
            // http basic authentication required
            if (!string.IsNullOrEmpty(this.Configuration.Username) || !string.IsNullOrEmpty(this.Configuration.Password) && !localVarRequestOptions.HeaderParameters.ContainsKey("Authorization"))
            {
                localVarRequestOptions.HeaderParameters.Add("Authorization", "Basic " + FactSet.SDK.FactSetFundamentals.Client.ClientUtils.Base64Encode(this.Configuration.Username + ":" + this.Configuration.Password));
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

            localVarRequestOptions.ResponseTypeDictionary = GetBatchDataResponseTypeDictionary;

            // make the HTTP request
            var localVarResponse = this.Client.Get<
            Object>("/batch-result", localVarRequestOptions, this.Configuration);
            if (this.ExceptionFactory != null)
            {
                Exception _exception = this.ExceptionFactory("GetBatchData", localVarResponse);
                if (_exception != null)
                {
                    throw _exception;
                }
            }
            var getbatchdataResponse = new GetBatchDataResponseWrapper(localVarResponse.StatusCode, localVarResponse.Data);
            return new ApiResponse<GetBatchDataResponseWrapper>(localVarResponse.StatusCode, getbatchdataResponse);
        }

        /// <summary>
        /// Returns the response for a Batch Request  Returns the response data for the underlying batch request that is specified by the id.  By default, this endpoint will return data as JSON. If you wish to receive your data in CSV format, you can edit the header to have the \&quot;accept\&quot; parameter as \&quot;text/csv\&quot; instead of \&quot;application/json\&quot;. 
        /// </summary>
        /// <exception cref="FactSet.SDK.FactSetFundamentals.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="id">Batch Request identifier.</param>
        /// <param name="cancellationToken">Cancellation Token to cancel the request.</param>
        /// <returns>Task of BatchResultResponse</returns>
        public async System.Threading.Tasks.Task<BatchProcessingApi.GetBatchDataResponseWrapper>GetBatchDataAsync(Guid id, System.Threading.CancellationToken cancellationToken = default(System.Threading.CancellationToken))
        {
            var localVarResponse = await GetBatchDataWithHttpInfoAsync(id, cancellationToken).ConfigureAwait(false);
            return localVarResponse.Data;
        }

        /// <summary>
        /// Returns the response for a Batch Request  Returns the response data for the underlying batch request that is specified by the id.  By default, this endpoint will return data as JSON. If you wish to receive your data in CSV format, you can edit the header to have the \&quot;accept\&quot; parameter as \&quot;text/csv\&quot; instead of \&quot;application/json\&quot;. 
        /// </summary>
        /// <exception cref="FactSet.SDK.FactSetFundamentals.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="id">Batch Request identifier.</param>
        /// <param name="cancellationToken">Cancellation Token to cancel the request.</param>
        /// <returns>Task of ApiResponse (BatchResultResponse)</returns>

        public async System.Threading.Tasks.Task<ApiResponse<BatchProcessingApi.GetBatchDataResponseWrapper>> GetBatchDataWithHttpInfoAsync(Guid id, System.Threading.CancellationToken cancellationToken = default(System.Threading.CancellationToken))
        {

            FactSet.SDK.FactSetFundamentals.Client.RequestOptions localVarRequestOptions = new FactSet.SDK.FactSetFundamentals.Client.RequestOptions();

            string[] _contentTypes = new string[] {
            };

            // to determine the Accept header
            string[] _accepts = new string[] {
                "application/json"
            };

            var localVarContentType = FactSet.SDK.FactSetFundamentals.Client.ClientUtils.SelectHeaderContentType(_contentTypes);
            if (localVarContentType != null)
            {
                localVarRequestOptions.HeaderParameters.Add("Content-Type", localVarContentType);
            }

            var localVarAccept = FactSet.SDK.FactSetFundamentals.Client.ClientUtils.SelectHeaderAccept(_accepts);
            if (localVarAccept != null)
            {
                localVarRequestOptions.HeaderParameters.Add("Accept", localVarAccept);
            }

            localVarRequestOptions.QueryParameters.Add(FactSet.SDK.FactSetFundamentals.Client.ClientUtils.ParameterToMultiMap("", "id", id));

            // authentication (FactSetApiKey) required
            // http basic authentication required
            if (!string.IsNullOrEmpty(this.Configuration.Username) || !string.IsNullOrEmpty(this.Configuration.Password) && !localVarRequestOptions.HeaderParameters.ContainsKey("Authorization"))
            {
                localVarRequestOptions.HeaderParameters.Add("Authorization", "Basic " + FactSet.SDK.FactSetFundamentals.Client.ClientUtils.Base64Encode(this.Configuration.Username + ":" + this.Configuration.Password));
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


            localVarRequestOptions.ResponseTypeDictionary = GetBatchDataResponseTypeDictionary;

            // make the HTTP request
            var localVarResponse = await this.AsynchronousClient.GetAsync<Object>("/batch-result", localVarRequestOptions, this.Configuration, cancellationToken).ConfigureAwait(false);

            if (this.ExceptionFactory != null)
            {
                Exception _exception = this.ExceptionFactory("GetBatchData", localVarResponse);
                if (_exception != null)
                {
                    throw _exception;
                }
            }

            var getbatchdataResponse = new GetBatchDataResponseWrapper(localVarResponse.StatusCode, localVarResponse.Data);
            return new ApiResponse<GetBatchDataResponseWrapper>(localVarResponse.StatusCode, getbatchdataResponse);
        }

        /// <summary>
        /// Returns the status for a Batch Request  Return the status for the underlying batch request that is specified by the id.
        /// </summary>
        /// <exception cref="FactSet.SDK.FactSetFundamentals.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="id">Batch Request identifier.</param>
        /// <returns>BatchStatusResponse</returns>
        public BatchStatusResponse GetBatchStatus(Guid id)
        {
            var localVarResponse = GetBatchStatusWithHttpInfo(id);
            return localVarResponse.Data;
        }

        /// <summary>
        /// Returns the status for a Batch Request  Return the status for the underlying batch request that is specified by the id.
        /// </summary>
        /// <exception cref="FactSet.SDK.FactSetFundamentals.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="id">Batch Request identifier.</param>
        /// <returns>ApiResponse of BatchStatusResponse</returns>
        public ApiResponse<BatchStatusResponse> GetBatchStatusWithHttpInfo(Guid id)
        {
            FactSet.SDK.FactSetFundamentals.Client.RequestOptions localVarRequestOptions = new FactSet.SDK.FactSetFundamentals.Client.RequestOptions();

            string[] _contentTypes = new string[] {
            };

            // to determine the Accept header
            string[] _accepts = new string[] {
                "application/json"
            };

            var localVarContentType = FactSet.SDK.FactSetFundamentals.Client.ClientUtils.SelectHeaderContentType(_contentTypes);
            if (localVarContentType != null)
            {
                localVarRequestOptions.HeaderParameters.Add("Content-Type", localVarContentType);
            }

            var localVarAccept = FactSet.SDK.FactSetFundamentals.Client.ClientUtils.SelectHeaderAccept(_accepts);
            if (localVarAccept != null)
            {
                localVarRequestOptions.HeaderParameters.Add("Accept", localVarAccept);
            }

            localVarRequestOptions.QueryParameters.Add(FactSet.SDK.FactSetFundamentals.Client.ClientUtils.ParameterToMultiMap("", "id", id));

            // authentication (FactSetApiKey) required
            // http basic authentication required
            if (!string.IsNullOrEmpty(this.Configuration.Username) || !string.IsNullOrEmpty(this.Configuration.Password) && !localVarRequestOptions.HeaderParameters.ContainsKey("Authorization"))
            {
                localVarRequestOptions.HeaderParameters.Add("Authorization", "Basic " + FactSet.SDK.FactSetFundamentals.Client.ClientUtils.Base64Encode(this.Configuration.Username + ":" + this.Configuration.Password));
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

            localVarRequestOptions.ResponseTypeDictionary = GetBatchStatusResponseTypeDictionary;

            // make the HTTP request
            var localVarResponse = this.Client.Get<
            BatchStatusResponse>("/batch-status", localVarRequestOptions, this.Configuration);
            if (this.ExceptionFactory != null)
            {
                Exception _exception = this.ExceptionFactory("GetBatchStatus", localVarResponse);
                if (_exception != null)
                {
                    throw _exception;
                }
            }
            return localVarResponse;
        }

        /// <summary>
        /// Returns the status for a Batch Request  Return the status for the underlying batch request that is specified by the id.
        /// </summary>
        /// <exception cref="FactSet.SDK.FactSetFundamentals.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="id">Batch Request identifier.</param>
        /// <param name="cancellationToken">Cancellation Token to cancel the request.</param>
        /// <returns>Task of BatchStatusResponse</returns>
        public async System.Threading.Tasks.Task<BatchStatusResponse>GetBatchStatusAsync(Guid id, System.Threading.CancellationToken cancellationToken = default(System.Threading.CancellationToken))
        {
            var localVarResponse = await GetBatchStatusWithHttpInfoAsync(id, cancellationToken).ConfigureAwait(false);
            return localVarResponse.Data;
        }

        /// <summary>
        /// Returns the status for a Batch Request  Return the status for the underlying batch request that is specified by the id.
        /// </summary>
        /// <exception cref="FactSet.SDK.FactSetFundamentals.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="id">Batch Request identifier.</param>
        /// <param name="cancellationToken">Cancellation Token to cancel the request.</param>
        /// <returns>Task of ApiResponse (BatchStatusResponse)</returns>

        public async System.Threading.Tasks.Task<ApiResponse<BatchStatusResponse>> GetBatchStatusWithHttpInfoAsync(Guid id, System.Threading.CancellationToken cancellationToken = default(System.Threading.CancellationToken))
        {

            FactSet.SDK.FactSetFundamentals.Client.RequestOptions localVarRequestOptions = new FactSet.SDK.FactSetFundamentals.Client.RequestOptions();

            string[] _contentTypes = new string[] {
            };

            // to determine the Accept header
            string[] _accepts = new string[] {
                "application/json"
            };

            var localVarContentType = FactSet.SDK.FactSetFundamentals.Client.ClientUtils.SelectHeaderContentType(_contentTypes);
            if (localVarContentType != null)
            {
                localVarRequestOptions.HeaderParameters.Add("Content-Type", localVarContentType);
            }

            var localVarAccept = FactSet.SDK.FactSetFundamentals.Client.ClientUtils.SelectHeaderAccept(_accepts);
            if (localVarAccept != null)
            {
                localVarRequestOptions.HeaderParameters.Add("Accept", localVarAccept);
            }

            localVarRequestOptions.QueryParameters.Add(FactSet.SDK.FactSetFundamentals.Client.ClientUtils.ParameterToMultiMap("", "id", id));

            // authentication (FactSetApiKey) required
            // http basic authentication required
            if (!string.IsNullOrEmpty(this.Configuration.Username) || !string.IsNullOrEmpty(this.Configuration.Password) && !localVarRequestOptions.HeaderParameters.ContainsKey("Authorization"))
            {
                localVarRequestOptions.HeaderParameters.Add("Authorization", "Basic " + FactSet.SDK.FactSetFundamentals.Client.ClientUtils.Base64Encode(this.Configuration.Username + ":" + this.Configuration.Password));
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


            localVarRequestOptions.ResponseTypeDictionary = GetBatchStatusResponseTypeDictionary;

            // make the HTTP request
            var localVarResponse = await this.AsynchronousClient.GetAsync<BatchStatusResponse>("/batch-status", localVarRequestOptions, this.Configuration, cancellationToken).ConfigureAwait(false);

            if (this.ExceptionFactory != null)
            {
                Exception _exception = this.ExceptionFactory("GetBatchStatus", localVarResponse);
                if (_exception != null)
                {
                    throw _exception;
                }
            }

            return localVarResponse;
        }

    }
}
