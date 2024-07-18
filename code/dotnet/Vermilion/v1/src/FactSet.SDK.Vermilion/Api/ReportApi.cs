/*
 * VRS API documentation
 *
 * Documentation on all available end points in the VRSAPI
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
using FactSet.SDK.Vermilion.Client;
using FactSet.SDK.Vermilion.Model;
using FactSet.SDK.Utils.Authentication;

namespace FactSet.SDK.Vermilion.Api
{

    /// <summary>
    /// Represents a collection of functions to interact with the API endpoints
    /// </summary>
    public interface IReportApiSync : IApiAccessor
    {
        #region Synchronous Operations
        /// <summary>
        /// Gets all report definitions
        /// </summary>
        /// <remarks>
        /// Gets all report definitions the user has permissions for
        /// </remarks>
        /// <exception cref="FactSet.SDK.Vermilion.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="tenant">The code of the tenancy</param>
        /// <param name="sort">The column to sort on. Can add - to sort (optional)</param>
        /// <param name="paginationLimit">Non-negative maximum number of entries to return (optional, default to 25)</param>
        /// <param name="paginationOffset">Non-negative number of entries to skip (optional, default to 0)</param>
        /// <returns>ReportDefinitionList</returns>
        ReportDefinitionList GetAllReportDefinitions(string tenant, List<string> sort = default(List<string>), int? paginationLimit = default(int?), int? paginationOffset = default(int?));

        /// <summary>
        /// Gets all report definitions
        /// </summary>
        /// <remarks>
        /// Gets all report definitions the user has permissions for
        /// </remarks>
        /// <exception cref="FactSet.SDK.Vermilion.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="tenant">The code of the tenancy</param>
        /// <param name="sort">The column to sort on. Can add - to sort (optional)</param>
        /// <param name="paginationLimit">Non-negative maximum number of entries to return (optional, default to 25)</param>
        /// <param name="paginationOffset">Non-negative number of entries to skip (optional, default to 0)</param>
        /// <returns>ApiResponse of ReportDefinitionList</returns>
        ApiResponse<ReportDefinitionList> GetAllReportDefinitionsWithHttpInfo(string tenant, List<string> sort = default(List<string>), int? paginationLimit = default(int?), int? paginationOffset = default(int?));
        /// <summary>
        /// Gets a report definition
        /// </summary>
        /// <remarks>
        /// Gets a report defintion based on the code specified
        /// </remarks>
        /// <exception cref="FactSet.SDK.Vermilion.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="tenant">The code of the tenancy</param>
        /// <param name="reportDefinitionCode">The code of the report definition</param>
        /// <returns>ReportDefinitionData</returns>
        ReportDefinitionData GetReportDefinitionByCode(string tenant, string reportDefinitionCode);

        /// <summary>
        /// Gets a report definition
        /// </summary>
        /// <remarks>
        /// Gets a report defintion based on the code specified
        /// </remarks>
        /// <exception cref="FactSet.SDK.Vermilion.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="tenant">The code of the tenancy</param>
        /// <param name="reportDefinitionCode">The code of the report definition</param>
        /// <returns>ApiResponse of ReportDefinitionData</returns>
        ApiResponse<ReportDefinitionData> GetReportDefinitionByCodeWithHttpInfo(string tenant, string reportDefinitionCode);
        #endregion Synchronous Operations
    }

    /// <summary>
    /// Represents a collection of functions to interact with the API endpoints
    /// </summary>
    public interface IReportApiAsync : IApiAccessor
    {
        #region Asynchronous Operations
        /// <summary>
        /// Gets all report definitions
        /// </summary>
        /// <remarks>
        /// Gets all report definitions the user has permissions for
        /// </remarks>
        /// <exception cref="FactSet.SDK.Vermilion.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="tenant">The code of the tenancy</param>
        /// <param name="sort">The column to sort on. Can add - to sort (optional)</param>
        /// <param name="paginationLimit">Non-negative maximum number of entries to return (optional, default to 25)</param>
        /// <param name="paginationOffset">Non-negative number of entries to skip (optional, default to 0)</param>
        /// <param name="cancellationToken">Cancellation Token to cancel the request.</param>
        /// <returns>Task of ReportDefinitionList</returns>
        System.Threading.Tasks.Task<ReportDefinitionList> GetAllReportDefinitionsAsync(string tenant, List<string> sort = default(List<string>), int? paginationLimit = default(int?), int? paginationOffset = default(int?), System.Threading.CancellationToken cancellationToken = default(System.Threading.CancellationToken));

        /// <summary>
        /// Gets all report definitions
        /// </summary>
        /// <remarks>
        /// Gets all report definitions the user has permissions for
        /// </remarks>
        /// <exception cref="FactSet.SDK.Vermilion.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="tenant">The code of the tenancy</param>
        /// <param name="sort">The column to sort on. Can add - to sort (optional)</param>
        /// <param name="paginationLimit">Non-negative maximum number of entries to return (optional, default to 25)</param>
        /// <param name="paginationOffset">Non-negative number of entries to skip (optional, default to 0)</param>
        /// <param name="cancellationToken">Cancellation Token to cancel the request.</param>
        /// <returns>Task of ApiResponse (ReportDefinitionList)</returns>
        System.Threading.Tasks.Task<ApiResponse<ReportDefinitionList>> GetAllReportDefinitionsWithHttpInfoAsync(string tenant, List<string> sort = default(List<string>), int? paginationLimit = default(int?), int? paginationOffset = default(int?), System.Threading.CancellationToken cancellationToken = default(System.Threading.CancellationToken));
        /// <summary>
        /// Gets a report definition
        /// </summary>
        /// <remarks>
        /// Gets a report defintion based on the code specified
        /// </remarks>
        /// <exception cref="FactSet.SDK.Vermilion.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="tenant">The code of the tenancy</param>
        /// <param name="reportDefinitionCode">The code of the report definition</param>
        /// <param name="cancellationToken">Cancellation Token to cancel the request.</param>
        /// <returns>Task of ReportDefinitionData</returns>
        System.Threading.Tasks.Task<ReportDefinitionData> GetReportDefinitionByCodeAsync(string tenant, string reportDefinitionCode, System.Threading.CancellationToken cancellationToken = default(System.Threading.CancellationToken));

        /// <summary>
        /// Gets a report definition
        /// </summary>
        /// <remarks>
        /// Gets a report defintion based on the code specified
        /// </remarks>
        /// <exception cref="FactSet.SDK.Vermilion.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="tenant">The code of the tenancy</param>
        /// <param name="reportDefinitionCode">The code of the report definition</param>
        /// <param name="cancellationToken">Cancellation Token to cancel the request.</param>
        /// <returns>Task of ApiResponse (ReportDefinitionData)</returns>
        System.Threading.Tasks.Task<ApiResponse<ReportDefinitionData>> GetReportDefinitionByCodeWithHttpInfoAsync(string tenant, string reportDefinitionCode, System.Threading.CancellationToken cancellationToken = default(System.Threading.CancellationToken));
        #endregion Asynchronous Operations
    }

    /// <summary>
    /// Represents a collection of functions to interact with the API endpoints
    /// </summary>
    public interface IReportApi : IReportApiSync, IReportApiAsync
    {

    }

    /// <summary>
    /// Represents a collection of functions to interact with the API endpoints
    /// </summary>
    public partial class ReportApi : IReportApi
    {
        private FactSet.SDK.Vermilion.Client.ExceptionFactory _exceptionFactory = (name, response) => null;

        # region Response Type Disctionaries
        
        private static readonly Dictionary<HttpStatusCode, System.Type> GetAllReportDefinitionsResponseTypeDictionary = new Dictionary<HttpStatusCode, System.Type>
        {
            { (HttpStatusCode)200, typeof(ReportDefinitionList) },
            { (HttpStatusCode)400, typeof(ErrorList) },
            { (HttpStatusCode)401, typeof(ErrorList) },
            { (HttpStatusCode)403, typeof(ErrorList) },
            { (HttpStatusCode)406, typeof(ErrorList) },
        };

        private static readonly Dictionary<HttpStatusCode, System.Type> GetReportDefinitionByCodeResponseTypeDictionary = new Dictionary<HttpStatusCode, System.Type>
        {
            { (HttpStatusCode)200, typeof(ReportDefinitionData) },
            { (HttpStatusCode)400, typeof(ErrorList) },
            { (HttpStatusCode)401, typeof(ErrorList) },
            { (HttpStatusCode)403, typeof(ErrorList) },
            { (HttpStatusCode)404, typeof(ErrorList) },
            { (HttpStatusCode)406, typeof(ErrorList) },
        };

        # endregion Response Type Disctionaries

        # region Api Response Objects
        

        # endregion Api Response Objects

        /// <summary>
        /// Initializes a new instance of the <see cref="ReportApi"/> class.
        /// </summary>
        /// <returns></returns>
        public ReportApi() : this((string)null)
        {
        }

        /// <summary>
        /// Initializes a new instance of the <see cref="ReportApi"/> class.
        /// </summary>
        /// <returns></returns>
        public ReportApi(string basePath)
        {
            this.Configuration = FactSet.SDK.Vermilion.Client.Configuration.MergeConfigurations(
                FactSet.SDK.Vermilion.Client.GlobalConfiguration.Instance,
                new FactSet.SDK.Vermilion.Client.Configuration { BasePath = basePath }
            );
            this.Client = new FactSet.SDK.Vermilion.Client.ApiClient(this.Configuration.BasePath);
            this.AsynchronousClient = new FactSet.SDK.Vermilion.Client.ApiClient(this.Configuration.BasePath);
            this.ExceptionFactory = FactSet.SDK.Vermilion.Client.Configuration.DefaultExceptionFactory;
        }

        /// <summary>
        /// Initializes a new instance of the <see cref="ReportApi"/> class
        /// using Configuration object
        /// </summary>
        /// <param name="configuration">An instance of Configuration</param>
        /// <returns></returns>
        public ReportApi(FactSet.SDK.Vermilion.Client.Configuration configuration)
        {
            if (configuration == null) throw new ArgumentNullException("configuration");

            this.Configuration = FactSet.SDK.Vermilion.Client.Configuration.MergeConfigurations(
                FactSet.SDK.Vermilion.Client.GlobalConfiguration.Instance,
                configuration
            );
            this.Client = new FactSet.SDK.Vermilion.Client.ApiClient(this.Configuration.BasePath);
            this.AsynchronousClient = new FactSet.SDK.Vermilion.Client.ApiClient(this.Configuration.BasePath);
            ExceptionFactory = FactSet.SDK.Vermilion.Client.Configuration.DefaultExceptionFactory;
        }

        /// <summary>
        /// Initializes a new instance of the <see cref="ReportApi"/> class
        /// using a Configuration object and client instance.
        /// </summary>
        /// <param name="client">The client interface for synchronous API access.</param>
        /// <param name="asyncClient">The client interface for asynchronous API access.</param>
        /// <param name="configuration">The configuration object.</param>
        public ReportApi(FactSet.SDK.Vermilion.Client.ISynchronousClient client, FactSet.SDK.Vermilion.Client.IAsynchronousClient asyncClient, FactSet.SDK.Vermilion.Client.IReadableConfiguration configuration)
        {
            if (client == null) throw new ArgumentNullException("client");
            if (asyncClient == null) throw new ArgumentNullException("asyncClient");
            if (configuration == null) throw new ArgumentNullException("configuration");

            this.Client = client;
            this.AsynchronousClient = asyncClient;
            this.Configuration = configuration;
            this.ExceptionFactory = FactSet.SDK.Vermilion.Client.Configuration.DefaultExceptionFactory;
        }

        /// <summary>
        /// The client for accessing this underlying API asynchronously.
        /// </summary>
        public FactSet.SDK.Vermilion.Client.IAsynchronousClient AsynchronousClient { get; set; }

        /// <summary>
        /// The client for accessing this underlying API synchronously.
        /// </summary>
        public FactSet.SDK.Vermilion.Client.ISynchronousClient Client { get; set; }

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
        public FactSet.SDK.Vermilion.Client.IReadableConfiguration Configuration { get; set; }

        /// <summary>
        /// Provides a factory method hook for the creation of exceptions.
        /// </summary>
        public FactSet.SDK.Vermilion.Client.ExceptionFactory ExceptionFactory
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
        /// Gets all report definitions Gets all report definitions the user has permissions for
        /// </summary>
        /// <exception cref="FactSet.SDK.Vermilion.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="tenant">The code of the tenancy</param>
        /// <param name="sort">The column to sort on. Can add - to sort (optional)</param>
        /// <param name="paginationLimit">Non-negative maximum number of entries to return (optional, default to 25)</param>
        /// <param name="paginationOffset">Non-negative number of entries to skip (optional, default to 0)</param>
        /// <returns>ReportDefinitionList</returns>
        public ReportDefinitionList GetAllReportDefinitions(string tenant, List<string> sort = default(List<string>), int? paginationLimit = default(int?), int? paginationOffset = default(int?))
        {
            var localVarResponse = GetAllReportDefinitionsWithHttpInfo(tenant, sort, paginationLimit, paginationOffset);
            return localVarResponse.Data;
        }

        /// <summary>
        /// Gets all report definitions Gets all report definitions the user has permissions for
        /// </summary>
        /// <exception cref="FactSet.SDK.Vermilion.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="tenant">The code of the tenancy</param>
        /// <param name="sort">The column to sort on. Can add - to sort (optional)</param>
        /// <param name="paginationLimit">Non-negative maximum number of entries to return (optional, default to 25)</param>
        /// <param name="paginationOffset">Non-negative number of entries to skip (optional, default to 0)</param>
        /// <returns>ApiResponse of ReportDefinitionList</returns>
        public ApiResponse<ReportDefinitionList> GetAllReportDefinitionsWithHttpInfo(string tenant, List<string> sort = default(List<string>), int? paginationLimit = default(int?), int? paginationOffset = default(int?))
        {
            // verify the required parameter 'tenant' is set
            if (tenant == null)
            {
                throw new FactSet.SDK.Vermilion.Client.ApiException(400, "Missing required parameter 'tenant' when calling ReportApi->GetAllReportDefinitions");
            }

            FactSet.SDK.Vermilion.Client.RequestOptions localVarRequestOptions = new FactSet.SDK.Vermilion.Client.RequestOptions();

            string[] _contentTypes = new string[] {
            };

            // to determine the Accept header
            string[] _accepts = new string[] {
                "application/json"
            };

            var localVarContentType = FactSet.SDK.Vermilion.Client.ClientUtils.SelectHeaderContentType(_contentTypes);
            if (localVarContentType != null)
            {
                localVarRequestOptions.HeaderParameters.Add("Content-Type", localVarContentType);
            }

            var localVarAccept = FactSet.SDK.Vermilion.Client.ClientUtils.SelectHeaderAccept(_accepts);
            if (localVarAccept != null)
            {
                localVarRequestOptions.HeaderParameters.Add("Accept", localVarAccept);
            }

            localVarRequestOptions.PathParameters.Add("tenant", FactSet.SDK.Vermilion.Client.ClientUtils.ParameterToString(tenant)); // path parameter
            if (sort != null)
            {
                localVarRequestOptions.QueryParameters.Add(FactSet.SDK.Vermilion.Client.ClientUtils.ParameterToMultiMap("csv", "_sort", sort));
            }
            if (paginationLimit != null)
            {
                localVarRequestOptions.QueryParameters.Add(FactSet.SDK.Vermilion.Client.ClientUtils.ParameterToMultiMap("", "_paginationLimit", paginationLimit));
            }
            if (paginationOffset != null)
            {
                localVarRequestOptions.QueryParameters.Add(FactSet.SDK.Vermilion.Client.ClientUtils.ParameterToMultiMap("", "_paginationOffset", paginationOffset));
            }

            // authentication (FactSetApiKey) required
            // http basic authentication required
            if (!string.IsNullOrEmpty(this.Configuration.Username) || !string.IsNullOrEmpty(this.Configuration.Password) && !localVarRequestOptions.HeaderParameters.ContainsKey("Authorization"))
            {
                localVarRequestOptions.HeaderParameters.Add("Authorization", "Basic " + FactSet.SDK.Vermilion.Client.ClientUtils.Base64Encode(this.Configuration.Username + ":" + this.Configuration.Password));
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

            localVarRequestOptions.ResponseTypeDictionary = GetAllReportDefinitionsResponseTypeDictionary;

            // make the HTTP request
            var localVarResponse = this.Client.Get<
            ReportDefinitionList>("/v1/{tenant}/reports", localVarRequestOptions, this.Configuration);
            if (this.ExceptionFactory != null)
            {
                Exception _exception = this.ExceptionFactory("GetAllReportDefinitions", localVarResponse);
                if (_exception != null)
                {
                    throw _exception;
                }
            }
            return localVarResponse;
        }

        /// <summary>
        /// Gets all report definitions Gets all report definitions the user has permissions for
        /// </summary>
        /// <exception cref="FactSet.SDK.Vermilion.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="tenant">The code of the tenancy</param>
        /// <param name="sort">The column to sort on. Can add - to sort (optional)</param>
        /// <param name="paginationLimit">Non-negative maximum number of entries to return (optional, default to 25)</param>
        /// <param name="paginationOffset">Non-negative number of entries to skip (optional, default to 0)</param>
        /// <param name="cancellationToken">Cancellation Token to cancel the request.</param>
        /// <returns>Task of ReportDefinitionList</returns>
        public async System.Threading.Tasks.Task<ReportDefinitionList>GetAllReportDefinitionsAsync(string tenant, List<string> sort = default(List<string>), int? paginationLimit = default(int?), int? paginationOffset = default(int?), System.Threading.CancellationToken cancellationToken = default(System.Threading.CancellationToken))
        {
            var localVarResponse = await GetAllReportDefinitionsWithHttpInfoAsync(tenant, sort, paginationLimit, paginationOffset, cancellationToken).ConfigureAwait(false);
            return localVarResponse.Data;
        }

        /// <summary>
        /// Gets all report definitions Gets all report definitions the user has permissions for
        /// </summary>
        /// <exception cref="FactSet.SDK.Vermilion.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="tenant">The code of the tenancy</param>
        /// <param name="sort">The column to sort on. Can add - to sort (optional)</param>
        /// <param name="paginationLimit">Non-negative maximum number of entries to return (optional, default to 25)</param>
        /// <param name="paginationOffset">Non-negative number of entries to skip (optional, default to 0)</param>
        /// <param name="cancellationToken">Cancellation Token to cancel the request.</param>
        /// <returns>Task of ApiResponse (ReportDefinitionList)</returns>

        public async System.Threading.Tasks.Task<ApiResponse<ReportDefinitionList>> GetAllReportDefinitionsWithHttpInfoAsync(string tenant, List<string> sort = default(List<string>), int? paginationLimit = default(int?), int? paginationOffset = default(int?), System.Threading.CancellationToken cancellationToken = default(System.Threading.CancellationToken))
        {
            // verify the required parameter 'tenant' is set
            if (tenant == null)
            {
                throw new FactSet.SDK.Vermilion.Client.ApiException(400, "Missing required parameter 'tenant' when calling ReportApi->GetAllReportDefinitions");
            }


            FactSet.SDK.Vermilion.Client.RequestOptions localVarRequestOptions = new FactSet.SDK.Vermilion.Client.RequestOptions();

            string[] _contentTypes = new string[] {
            };

            // to determine the Accept header
            string[] _accepts = new string[] {
                "application/json"
            };

            var localVarContentType = FactSet.SDK.Vermilion.Client.ClientUtils.SelectHeaderContentType(_contentTypes);
            if (localVarContentType != null)
            {
                localVarRequestOptions.HeaderParameters.Add("Content-Type", localVarContentType);
            }

            var localVarAccept = FactSet.SDK.Vermilion.Client.ClientUtils.SelectHeaderAccept(_accepts);
            if (localVarAccept != null)
            {
                localVarRequestOptions.HeaderParameters.Add("Accept", localVarAccept);
            }

            localVarRequestOptions.PathParameters.Add("tenant", FactSet.SDK.Vermilion.Client.ClientUtils.ParameterToString(tenant)); // path parameter
            if (sort != null)
            {
                localVarRequestOptions.QueryParameters.Add(FactSet.SDK.Vermilion.Client.ClientUtils.ParameterToMultiMap("csv", "_sort", sort));
            }
            if (paginationLimit != null)
            {
                localVarRequestOptions.QueryParameters.Add(FactSet.SDK.Vermilion.Client.ClientUtils.ParameterToMultiMap("", "_paginationLimit", paginationLimit));
            }
            if (paginationOffset != null)
            {
                localVarRequestOptions.QueryParameters.Add(FactSet.SDK.Vermilion.Client.ClientUtils.ParameterToMultiMap("", "_paginationOffset", paginationOffset));
            }

            // authentication (FactSetApiKey) required
            // http basic authentication required
            if (!string.IsNullOrEmpty(this.Configuration.Username) || !string.IsNullOrEmpty(this.Configuration.Password) && !localVarRequestOptions.HeaderParameters.ContainsKey("Authorization"))
            {
                localVarRequestOptions.HeaderParameters.Add("Authorization", "Basic " + FactSet.SDK.Vermilion.Client.ClientUtils.Base64Encode(this.Configuration.Username + ":" + this.Configuration.Password));
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


            localVarRequestOptions.ResponseTypeDictionary = GetAllReportDefinitionsResponseTypeDictionary;

            // make the HTTP request
            var localVarResponse = await this.AsynchronousClient.GetAsync<ReportDefinitionList>("/v1/{tenant}/reports", localVarRequestOptions, this.Configuration, cancellationToken).ConfigureAwait(false);

            if (this.ExceptionFactory != null)
            {
                Exception _exception = this.ExceptionFactory("GetAllReportDefinitions", localVarResponse);
                if (_exception != null)
                {
                    throw _exception;
                }
            }

            return localVarResponse;
        }

        /// <summary>
        /// Gets a report definition Gets a report defintion based on the code specified
        /// </summary>
        /// <exception cref="FactSet.SDK.Vermilion.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="tenant">The code of the tenancy</param>
        /// <param name="reportDefinitionCode">The code of the report definition</param>
        /// <returns>ReportDefinitionData</returns>
        public ReportDefinitionData GetReportDefinitionByCode(string tenant, string reportDefinitionCode)
        {
            var localVarResponse = GetReportDefinitionByCodeWithHttpInfo(tenant, reportDefinitionCode);
            return localVarResponse.Data;
        }

        /// <summary>
        /// Gets a report definition Gets a report defintion based on the code specified
        /// </summary>
        /// <exception cref="FactSet.SDK.Vermilion.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="tenant">The code of the tenancy</param>
        /// <param name="reportDefinitionCode">The code of the report definition</param>
        /// <returns>ApiResponse of ReportDefinitionData</returns>
        public ApiResponse<ReportDefinitionData> GetReportDefinitionByCodeWithHttpInfo(string tenant, string reportDefinitionCode)
        {
            // verify the required parameter 'tenant' is set
            if (tenant == null)
            {
                throw new FactSet.SDK.Vermilion.Client.ApiException(400, "Missing required parameter 'tenant' when calling ReportApi->GetReportDefinitionByCode");
            }

            // verify the required parameter 'reportDefinitionCode' is set
            if (reportDefinitionCode == null)
            {
                throw new FactSet.SDK.Vermilion.Client.ApiException(400, "Missing required parameter 'reportDefinitionCode' when calling ReportApi->GetReportDefinitionByCode");
            }

            FactSet.SDK.Vermilion.Client.RequestOptions localVarRequestOptions = new FactSet.SDK.Vermilion.Client.RequestOptions();

            string[] _contentTypes = new string[] {
            };

            // to determine the Accept header
            string[] _accepts = new string[] {
                "application/json"
            };

            var localVarContentType = FactSet.SDK.Vermilion.Client.ClientUtils.SelectHeaderContentType(_contentTypes);
            if (localVarContentType != null)
            {
                localVarRequestOptions.HeaderParameters.Add("Content-Type", localVarContentType);
            }

            var localVarAccept = FactSet.SDK.Vermilion.Client.ClientUtils.SelectHeaderAccept(_accepts);
            if (localVarAccept != null)
            {
                localVarRequestOptions.HeaderParameters.Add("Accept", localVarAccept);
            }

            localVarRequestOptions.PathParameters.Add("tenant", FactSet.SDK.Vermilion.Client.ClientUtils.ParameterToString(tenant)); // path parameter
            localVarRequestOptions.PathParameters.Add("reportDefinitionCode", FactSet.SDK.Vermilion.Client.ClientUtils.ParameterToString(reportDefinitionCode)); // path parameter

            // authentication (FactSetApiKey) required
            // http basic authentication required
            if (!string.IsNullOrEmpty(this.Configuration.Username) || !string.IsNullOrEmpty(this.Configuration.Password) && !localVarRequestOptions.HeaderParameters.ContainsKey("Authorization"))
            {
                localVarRequestOptions.HeaderParameters.Add("Authorization", "Basic " + FactSet.SDK.Vermilion.Client.ClientUtils.Base64Encode(this.Configuration.Username + ":" + this.Configuration.Password));
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

            localVarRequestOptions.ResponseTypeDictionary = GetReportDefinitionByCodeResponseTypeDictionary;

            // make the HTTP request
            var localVarResponse = this.Client.Get<
            ReportDefinitionData>("/v1/{tenant}/reports/{reportDefinitionCode}", localVarRequestOptions, this.Configuration);
            if (this.ExceptionFactory != null)
            {
                Exception _exception = this.ExceptionFactory("GetReportDefinitionByCode", localVarResponse);
                if (_exception != null)
                {
                    throw _exception;
                }
            }
            return localVarResponse;
        }

        /// <summary>
        /// Gets a report definition Gets a report defintion based on the code specified
        /// </summary>
        /// <exception cref="FactSet.SDK.Vermilion.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="tenant">The code of the tenancy</param>
        /// <param name="reportDefinitionCode">The code of the report definition</param>
        /// <param name="cancellationToken">Cancellation Token to cancel the request.</param>
        /// <returns>Task of ReportDefinitionData</returns>
        public async System.Threading.Tasks.Task<ReportDefinitionData>GetReportDefinitionByCodeAsync(string tenant, string reportDefinitionCode, System.Threading.CancellationToken cancellationToken = default(System.Threading.CancellationToken))
        {
            var localVarResponse = await GetReportDefinitionByCodeWithHttpInfoAsync(tenant, reportDefinitionCode, cancellationToken).ConfigureAwait(false);
            return localVarResponse.Data;
        }

        /// <summary>
        /// Gets a report definition Gets a report defintion based on the code specified
        /// </summary>
        /// <exception cref="FactSet.SDK.Vermilion.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="tenant">The code of the tenancy</param>
        /// <param name="reportDefinitionCode">The code of the report definition</param>
        /// <param name="cancellationToken">Cancellation Token to cancel the request.</param>
        /// <returns>Task of ApiResponse (ReportDefinitionData)</returns>

        public async System.Threading.Tasks.Task<ApiResponse<ReportDefinitionData>> GetReportDefinitionByCodeWithHttpInfoAsync(string tenant, string reportDefinitionCode, System.Threading.CancellationToken cancellationToken = default(System.Threading.CancellationToken))
        {
            // verify the required parameter 'tenant' is set
            if (tenant == null)
            {
                throw new FactSet.SDK.Vermilion.Client.ApiException(400, "Missing required parameter 'tenant' when calling ReportApi->GetReportDefinitionByCode");
            }

            // verify the required parameter 'reportDefinitionCode' is set
            if (reportDefinitionCode == null)
            {
                throw new FactSet.SDK.Vermilion.Client.ApiException(400, "Missing required parameter 'reportDefinitionCode' when calling ReportApi->GetReportDefinitionByCode");
            }


            FactSet.SDK.Vermilion.Client.RequestOptions localVarRequestOptions = new FactSet.SDK.Vermilion.Client.RequestOptions();

            string[] _contentTypes = new string[] {
            };

            // to determine the Accept header
            string[] _accepts = new string[] {
                "application/json"
            };

            var localVarContentType = FactSet.SDK.Vermilion.Client.ClientUtils.SelectHeaderContentType(_contentTypes);
            if (localVarContentType != null)
            {
                localVarRequestOptions.HeaderParameters.Add("Content-Type", localVarContentType);
            }

            var localVarAccept = FactSet.SDK.Vermilion.Client.ClientUtils.SelectHeaderAccept(_accepts);
            if (localVarAccept != null)
            {
                localVarRequestOptions.HeaderParameters.Add("Accept", localVarAccept);
            }

            localVarRequestOptions.PathParameters.Add("tenant", FactSet.SDK.Vermilion.Client.ClientUtils.ParameterToString(tenant)); // path parameter
            localVarRequestOptions.PathParameters.Add("reportDefinitionCode", FactSet.SDK.Vermilion.Client.ClientUtils.ParameterToString(reportDefinitionCode)); // path parameter

            // authentication (FactSetApiKey) required
            // http basic authentication required
            if (!string.IsNullOrEmpty(this.Configuration.Username) || !string.IsNullOrEmpty(this.Configuration.Password) && !localVarRequestOptions.HeaderParameters.ContainsKey("Authorization"))
            {
                localVarRequestOptions.HeaderParameters.Add("Authorization", "Basic " + FactSet.SDK.Vermilion.Client.ClientUtils.Base64Encode(this.Configuration.Username + ":" + this.Configuration.Password));
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


            localVarRequestOptions.ResponseTypeDictionary = GetReportDefinitionByCodeResponseTypeDictionary;

            // make the HTTP request
            var localVarResponse = await this.AsynchronousClient.GetAsync<ReportDefinitionData>("/v1/{tenant}/reports/{reportDefinitionCode}", localVarRequestOptions, this.Configuration, cancellationToken).ConfigureAwait(false);

            if (this.ExceptionFactory != null)
            {
                Exception _exception = this.ExceptionFactory("GetReportDefinitionByCode", localVarResponse);
                if (_exception != null)
                {
                    throw _exception;
                }
            }

            return localVarResponse;
        }

    }
}
