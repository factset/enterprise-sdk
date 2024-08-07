/*
 * Universal Screening API
 *
 * Through the Universal Screening API, you can access the power of FactSet's Universal Screening Application. Calculate and return the results of your saved Universal Screens.
 *
 * The version of the OpenAPI document: 2.0.2
 * Contact: api@factset.com
 * Generated by: https://github.com/openapitools/openapi-generator.git
 */


using System;
using System.Collections.Generic;
using System.Collections.ObjectModel;
using System.Linq;
using System.Net;
using System.Net.Mime;
using FactSet.SDK.UniversalScreening.Client;
using FactSet.SDK.UniversalScreening.Model;
using FactSet.SDK.Utils.Authentication;

namespace FactSet.SDK.UniversalScreening.Api
{

    /// <summary>
    /// Represents a collection of functions to interact with the API endpoints
    /// </summary>
    public interface IJobManagementApiSync : IApiAccessor
    {
        #region Synchronous Operations
        /// <summary>
        /// 
        /// </summary>
        /// <remarks>
        /// Delete a specified job started by the requester&#39;s username-serial
        /// </remarks>
        /// <exception cref="FactSet.SDK.UniversalScreening.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="id">Unique identifier for a job. \&quot;Job\&quot; refers to a screen calculation or archival.</param>
        /// <returns>void</returns>
        void DeleteActiveJob(Guid id);

        /// <summary>
        /// 
        /// </summary>
        /// <remarks>
        /// Delete a specified job started by the requester&#39;s username-serial
        /// </remarks>
        /// <exception cref="FactSet.SDK.UniversalScreening.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="id">Unique identifier for a job. \&quot;Job\&quot; refers to a screen calculation or archival.</param>
        /// <returns>ApiResponse of Object(void)</returns>
        ApiResponse<Object> DeleteActiveJobWithHttpInfo(Guid id);
        /// <summary>
        /// 
        /// </summary>
        /// <remarks>
        /// Delete all active jobs started by the requester&#39;s username-serial
        /// </remarks>
        /// <exception cref="FactSet.SDK.UniversalScreening.Client.ApiException">Thrown when fails to make API call</exception>
        /// <returns>void</returns>
        void DeleteAllActiveJobs();

        /// <summary>
        /// 
        /// </summary>
        /// <remarks>
        /// Delete all active jobs started by the requester&#39;s username-serial
        /// </remarks>
        /// <exception cref="FactSet.SDK.UniversalScreening.Client.ApiException">Thrown when fails to make API call</exception>
        /// <returns>ApiResponse of Object(void)</returns>
        ApiResponse<Object> DeleteAllActiveJobsWithHttpInfo();
        /// <summary>
        /// 
        /// </summary>
        /// <remarks>
        /// Retrieve list of all active job ids started by requester&#39;s username-serial
        /// </remarks>
        /// <exception cref="FactSet.SDK.UniversalScreening.Client.ApiException">Thrown when fails to make API call</exception>
        /// <returns>ActiveJobsData</returns>
        ActiveJobsData GetAllActiveJobs();

        /// <summary>
        /// 
        /// </summary>
        /// <remarks>
        /// Retrieve list of all active job ids started by requester&#39;s username-serial
        /// </remarks>
        /// <exception cref="FactSet.SDK.UniversalScreening.Client.ApiException">Thrown when fails to make API call</exception>
        /// <returns>ApiResponse of ActiveJobsData</returns>
        ApiResponse<ActiveJobsData> GetAllActiveJobsWithHttpInfo();
        #endregion Synchronous Operations
    }

    /// <summary>
    /// Represents a collection of functions to interact with the API endpoints
    /// </summary>
    public interface IJobManagementApiAsync : IApiAccessor
    {
        #region Asynchronous Operations
        /// <summary>
        /// 
        /// </summary>
        /// <remarks>
        /// Delete a specified job started by the requester&#39;s username-serial
        /// </remarks>
        /// <exception cref="FactSet.SDK.UniversalScreening.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="id">Unique identifier for a job. \&quot;Job\&quot; refers to a screen calculation or archival.</param>
        /// <param name="cancellationToken">Cancellation Token to cancel the request.</param>
        /// <returns>Task of void</returns>
        System.Threading.Tasks.Task DeleteActiveJobAsync(Guid id, System.Threading.CancellationToken cancellationToken = default(System.Threading.CancellationToken));

        /// <summary>
        /// 
        /// </summary>
        /// <remarks>
        /// Delete a specified job started by the requester&#39;s username-serial
        /// </remarks>
        /// <exception cref="FactSet.SDK.UniversalScreening.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="id">Unique identifier for a job. \&quot;Job\&quot; refers to a screen calculation or archival.</param>
        /// <param name="cancellationToken">Cancellation Token to cancel the request.</param>
        /// <returns>Task of ApiResponse</returns>
        System.Threading.Tasks.Task<ApiResponse<Object>> DeleteActiveJobWithHttpInfoAsync(Guid id, System.Threading.CancellationToken cancellationToken = default(System.Threading.CancellationToken));
        /// <summary>
        /// 
        /// </summary>
        /// <remarks>
        /// Delete all active jobs started by the requester&#39;s username-serial
        /// </remarks>
        /// <exception cref="FactSet.SDK.UniversalScreening.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="cancellationToken">Cancellation Token to cancel the request.</param>
        /// <returns>Task of void</returns>
        System.Threading.Tasks.Task DeleteAllActiveJobsAsync(System.Threading.CancellationToken cancellationToken = default(System.Threading.CancellationToken));

        /// <summary>
        /// 
        /// </summary>
        /// <remarks>
        /// Delete all active jobs started by the requester&#39;s username-serial
        /// </remarks>
        /// <exception cref="FactSet.SDK.UniversalScreening.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="cancellationToken">Cancellation Token to cancel the request.</param>
        /// <returns>Task of ApiResponse</returns>
        System.Threading.Tasks.Task<ApiResponse<Object>> DeleteAllActiveJobsWithHttpInfoAsync(System.Threading.CancellationToken cancellationToken = default(System.Threading.CancellationToken));
        /// <summary>
        /// 
        /// </summary>
        /// <remarks>
        /// Retrieve list of all active job ids started by requester&#39;s username-serial
        /// </remarks>
        /// <exception cref="FactSet.SDK.UniversalScreening.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="cancellationToken">Cancellation Token to cancel the request.</param>
        /// <returns>Task of ActiveJobsData</returns>
        System.Threading.Tasks.Task<ActiveJobsData> GetAllActiveJobsAsync(System.Threading.CancellationToken cancellationToken = default(System.Threading.CancellationToken));

        /// <summary>
        /// 
        /// </summary>
        /// <remarks>
        /// Retrieve list of all active job ids started by requester&#39;s username-serial
        /// </remarks>
        /// <exception cref="FactSet.SDK.UniversalScreening.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="cancellationToken">Cancellation Token to cancel the request.</param>
        /// <returns>Task of ApiResponse (ActiveJobsData)</returns>
        System.Threading.Tasks.Task<ApiResponse<ActiveJobsData>> GetAllActiveJobsWithHttpInfoAsync(System.Threading.CancellationToken cancellationToken = default(System.Threading.CancellationToken));
        #endregion Asynchronous Operations
    }

    /// <summary>
    /// Represents a collection of functions to interact with the API endpoints
    /// </summary>
    public interface IJobManagementApi : IJobManagementApiSync, IJobManagementApiAsync
    {

    }

    /// <summary>
    /// Represents a collection of functions to interact with the API endpoints
    /// </summary>
    public partial class JobManagementApi : IJobManagementApi
    {
        private FactSet.SDK.UniversalScreening.Client.ExceptionFactory _exceptionFactory = (name, response) => null;

        # region Response Type Disctionaries
        
        private static readonly Dictionary<HttpStatusCode, System.Type> DeleteActiveJobResponseTypeDictionary = new Dictionary<HttpStatusCode, System.Type>
        {
        };

        private static readonly Dictionary<HttpStatusCode, System.Type> DeleteAllActiveJobsResponseTypeDictionary = new Dictionary<HttpStatusCode, System.Type>
        {
        };

        private static readonly Dictionary<HttpStatusCode, System.Type> GetAllActiveJobsResponseTypeDictionary = new Dictionary<HttpStatusCode, System.Type>
        {
            { (HttpStatusCode)200, typeof(ActiveJobsData) },
            { (HttpStatusCode)401, typeof(ErrorArray) },
            { (HttpStatusCode)404, typeof(ErrorArray) },
            { (HttpStatusCode)429, typeof(ErrorArray) },
        };

        # endregion Response Type Disctionaries

        # region Api Response Objects
        

        # endregion Api Response Objects

        /// <summary>
        /// Initializes a new instance of the <see cref="JobManagementApi"/> class.
        /// </summary>
        /// <returns></returns>
        public JobManagementApi() : this((string)null)
        {
        }

        /// <summary>
        /// Initializes a new instance of the <see cref="JobManagementApi"/> class.
        /// </summary>
        /// <returns></returns>
        public JobManagementApi(string basePath)
        {
            this.Configuration = FactSet.SDK.UniversalScreening.Client.Configuration.MergeConfigurations(
                FactSet.SDK.UniversalScreening.Client.GlobalConfiguration.Instance,
                new FactSet.SDK.UniversalScreening.Client.Configuration { BasePath = basePath }
            );
            this.Client = new FactSet.SDK.UniversalScreening.Client.ApiClient(this.Configuration.BasePath);
            this.AsynchronousClient = new FactSet.SDK.UniversalScreening.Client.ApiClient(this.Configuration.BasePath);
            this.ExceptionFactory = FactSet.SDK.UniversalScreening.Client.Configuration.DefaultExceptionFactory;
        }

        /// <summary>
        /// Initializes a new instance of the <see cref="JobManagementApi"/> class
        /// using Configuration object
        /// </summary>
        /// <param name="configuration">An instance of Configuration</param>
        /// <returns></returns>
        public JobManagementApi(FactSet.SDK.UniversalScreening.Client.Configuration configuration)
        {
            if (configuration == null) throw new ArgumentNullException("configuration");

            this.Configuration = FactSet.SDK.UniversalScreening.Client.Configuration.MergeConfigurations(
                FactSet.SDK.UniversalScreening.Client.GlobalConfiguration.Instance,
                configuration
            );
            this.Client = new FactSet.SDK.UniversalScreening.Client.ApiClient(this.Configuration.BasePath);
            this.AsynchronousClient = new FactSet.SDK.UniversalScreening.Client.ApiClient(this.Configuration.BasePath);
            ExceptionFactory = FactSet.SDK.UniversalScreening.Client.Configuration.DefaultExceptionFactory;
        }

        /// <summary>
        /// Initializes a new instance of the <see cref="JobManagementApi"/> class
        /// using a Configuration object and client instance.
        /// </summary>
        /// <param name="client">The client interface for synchronous API access.</param>
        /// <param name="asyncClient">The client interface for asynchronous API access.</param>
        /// <param name="configuration">The configuration object.</param>
        public JobManagementApi(FactSet.SDK.UniversalScreening.Client.ISynchronousClient client, FactSet.SDK.UniversalScreening.Client.IAsynchronousClient asyncClient, FactSet.SDK.UniversalScreening.Client.IReadableConfiguration configuration)
        {
            if (client == null) throw new ArgumentNullException("client");
            if (asyncClient == null) throw new ArgumentNullException("asyncClient");
            if (configuration == null) throw new ArgumentNullException("configuration");

            this.Client = client;
            this.AsynchronousClient = asyncClient;
            this.Configuration = configuration;
            this.ExceptionFactory = FactSet.SDK.UniversalScreening.Client.Configuration.DefaultExceptionFactory;
        }

        /// <summary>
        /// The client for accessing this underlying API asynchronously.
        /// </summary>
        public FactSet.SDK.UniversalScreening.Client.IAsynchronousClient AsynchronousClient { get; set; }

        /// <summary>
        /// The client for accessing this underlying API synchronously.
        /// </summary>
        public FactSet.SDK.UniversalScreening.Client.ISynchronousClient Client { get; set; }

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
        public FactSet.SDK.UniversalScreening.Client.IReadableConfiguration Configuration { get; set; }

        /// <summary>
        /// Provides a factory method hook for the creation of exceptions.
        /// </summary>
        public FactSet.SDK.UniversalScreening.Client.ExceptionFactory ExceptionFactory
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
        ///  Delete a specified job started by the requester&#39;s username-serial
        /// </summary>
        /// <exception cref="FactSet.SDK.UniversalScreening.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="id">Unique identifier for a job. \&quot;Job\&quot; refers to a screen calculation or archival.</param>
        /// <returns>void</returns>
        public void DeleteActiveJob(Guid id)
        {
            DeleteActiveJobWithHttpInfo(id);
        }

        /// <summary>
        ///  Delete a specified job started by the requester&#39;s username-serial
        /// </summary>
        /// <exception cref="FactSet.SDK.UniversalScreening.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="id">Unique identifier for a job. \&quot;Job\&quot; refers to a screen calculation or archival.</param>
        /// <returns>ApiResponse of Object(void)</returns>
        public ApiResponse<Object> DeleteActiveJobWithHttpInfo(Guid id)
        {
            FactSet.SDK.UniversalScreening.Client.RequestOptions localVarRequestOptions = new FactSet.SDK.UniversalScreening.Client.RequestOptions();

            string[] _contentTypes = new string[] {
            };

            // to determine the Accept header
            string[] _accepts = new string[] {
                "application/json"
            };

            var localVarContentType = FactSet.SDK.UniversalScreening.Client.ClientUtils.SelectHeaderContentType(_contentTypes);
            if (localVarContentType != null)
            {
                localVarRequestOptions.HeaderParameters.Add("Content-Type", localVarContentType);
            }

            var localVarAccept = FactSet.SDK.UniversalScreening.Client.ClientUtils.SelectHeaderAccept(_accepts);
            if (localVarAccept != null)
            {
                localVarRequestOptions.HeaderParameters.Add("Accept", localVarAccept);
            }

            localVarRequestOptions.PathParameters.Add("id", FactSet.SDK.UniversalScreening.Client.ClientUtils.ParameterToString(id)); // path parameter

            // authentication (FactSetApiKey) required
            // http basic authentication required
            if (!string.IsNullOrEmpty(this.Configuration.Username) || !string.IsNullOrEmpty(this.Configuration.Password) && !localVarRequestOptions.HeaderParameters.ContainsKey("Authorization"))
            {
                localVarRequestOptions.HeaderParameters.Add("Authorization", "Basic " + FactSet.SDK.UniversalScreening.Client.ClientUtils.Base64Encode(this.Configuration.Username + ":" + this.Configuration.Password));
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

            localVarRequestOptions.ResponseTypeDictionary = DeleteActiveJobResponseTypeDictionary;

            // make the HTTP request
            var localVarResponse = this.Client.Delete<
            Object>("/job/{id}", localVarRequestOptions, this.Configuration);
            if (this.ExceptionFactory != null)
            {
                Exception _exception = this.ExceptionFactory("DeleteActiveJob", localVarResponse);
                if (_exception != null)
                {
                    throw _exception;
                }
            }
            return localVarResponse;
        }

        /// <summary>
        ///  Delete a specified job started by the requester&#39;s username-serial
        /// </summary>
        /// <exception cref="FactSet.SDK.UniversalScreening.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="id">Unique identifier for a job. \&quot;Job\&quot; refers to a screen calculation or archival.</param>
        /// <param name="cancellationToken">Cancellation Token to cancel the request.</param>
        /// <returns>Task of void</returns>
        public async System.Threading.Tasks.Task DeleteActiveJobAsync(Guid id, System.Threading.CancellationToken cancellationToken = default(System.Threading.CancellationToken))
        {
            await DeleteActiveJobWithHttpInfoAsync(id, cancellationToken).ConfigureAwait(false);
        }

        /// <summary>
        ///  Delete a specified job started by the requester&#39;s username-serial
        /// </summary>
        /// <exception cref="FactSet.SDK.UniversalScreening.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="id">Unique identifier for a job. \&quot;Job\&quot; refers to a screen calculation or archival.</param>
        /// <param name="cancellationToken">Cancellation Token to cancel the request.</param>
        /// <returns>Task of ApiResponse</returns>

        public async System.Threading.Tasks.Task<ApiResponse<Object>> DeleteActiveJobWithHttpInfoAsync(Guid id, System.Threading.CancellationToken cancellationToken = default(System.Threading.CancellationToken))
        {

            FactSet.SDK.UniversalScreening.Client.RequestOptions localVarRequestOptions = new FactSet.SDK.UniversalScreening.Client.RequestOptions();

            string[] _contentTypes = new string[] {
            };

            // to determine the Accept header
            string[] _accepts = new string[] {
                "application/json"
            };

            var localVarContentType = FactSet.SDK.UniversalScreening.Client.ClientUtils.SelectHeaderContentType(_contentTypes);
            if (localVarContentType != null)
            {
                localVarRequestOptions.HeaderParameters.Add("Content-Type", localVarContentType);
            }

            var localVarAccept = FactSet.SDK.UniversalScreening.Client.ClientUtils.SelectHeaderAccept(_accepts);
            if (localVarAccept != null)
            {
                localVarRequestOptions.HeaderParameters.Add("Accept", localVarAccept);
            }

            localVarRequestOptions.PathParameters.Add("id", FactSet.SDK.UniversalScreening.Client.ClientUtils.ParameterToString(id)); // path parameter

            // authentication (FactSetApiKey) required
            // http basic authentication required
            if (!string.IsNullOrEmpty(this.Configuration.Username) || !string.IsNullOrEmpty(this.Configuration.Password) && !localVarRequestOptions.HeaderParameters.ContainsKey("Authorization"))
            {
                localVarRequestOptions.HeaderParameters.Add("Authorization", "Basic " + FactSet.SDK.UniversalScreening.Client.ClientUtils.Base64Encode(this.Configuration.Username + ":" + this.Configuration.Password));
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


            localVarRequestOptions.ResponseTypeDictionary = DeleteActiveJobResponseTypeDictionary;

            // make the HTTP request
            var localVarResponse = await this.AsynchronousClient.DeleteAsync<Object>("/job/{id}", localVarRequestOptions, this.Configuration, cancellationToken).ConfigureAwait(false);

            if (this.ExceptionFactory != null)
            {
                Exception _exception = this.ExceptionFactory("DeleteActiveJob", localVarResponse);
                if (_exception != null)
                {
                    throw _exception;
                }
            }

            return localVarResponse;
        }

        /// <summary>
        ///  Delete all active jobs started by the requester&#39;s username-serial
        /// </summary>
        /// <exception cref="FactSet.SDK.UniversalScreening.Client.ApiException">Thrown when fails to make API call</exception>
        /// <returns>void</returns>
        public void DeleteAllActiveJobs()
        {
            DeleteAllActiveJobsWithHttpInfo();
        }

        /// <summary>
        ///  Delete all active jobs started by the requester&#39;s username-serial
        /// </summary>
        /// <exception cref="FactSet.SDK.UniversalScreening.Client.ApiException">Thrown when fails to make API call</exception>
        /// <returns>ApiResponse of Object(void)</returns>
        public ApiResponse<Object> DeleteAllActiveJobsWithHttpInfo()
        {
            FactSet.SDK.UniversalScreening.Client.RequestOptions localVarRequestOptions = new FactSet.SDK.UniversalScreening.Client.RequestOptions();

            string[] _contentTypes = new string[] {
            };

            // to determine the Accept header
            string[] _accepts = new string[] {
                "application/json"
            };

            var localVarContentType = FactSet.SDK.UniversalScreening.Client.ClientUtils.SelectHeaderContentType(_contentTypes);
            if (localVarContentType != null)
            {
                localVarRequestOptions.HeaderParameters.Add("Content-Type", localVarContentType);
            }

            var localVarAccept = FactSet.SDK.UniversalScreening.Client.ClientUtils.SelectHeaderAccept(_accepts);
            if (localVarAccept != null)
            {
                localVarRequestOptions.HeaderParameters.Add("Accept", localVarAccept);
            }


            // authentication (FactSetApiKey) required
            // http basic authentication required
            if (!string.IsNullOrEmpty(this.Configuration.Username) || !string.IsNullOrEmpty(this.Configuration.Password) && !localVarRequestOptions.HeaderParameters.ContainsKey("Authorization"))
            {
                localVarRequestOptions.HeaderParameters.Add("Authorization", "Basic " + FactSet.SDK.UniversalScreening.Client.ClientUtils.Base64Encode(this.Configuration.Username + ":" + this.Configuration.Password));
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

            localVarRequestOptions.ResponseTypeDictionary = DeleteAllActiveJobsResponseTypeDictionary;

            // make the HTTP request
            var localVarResponse = this.Client.Delete<
            Object>("/jobs", localVarRequestOptions, this.Configuration);
            if (this.ExceptionFactory != null)
            {
                Exception _exception = this.ExceptionFactory("DeleteAllActiveJobs", localVarResponse);
                if (_exception != null)
                {
                    throw _exception;
                }
            }
            return localVarResponse;
        }

        /// <summary>
        ///  Delete all active jobs started by the requester&#39;s username-serial
        /// </summary>
        /// <exception cref="FactSet.SDK.UniversalScreening.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="cancellationToken">Cancellation Token to cancel the request.</param>
        /// <returns>Task of void</returns>
        public async System.Threading.Tasks.Task DeleteAllActiveJobsAsync(System.Threading.CancellationToken cancellationToken = default(System.Threading.CancellationToken))
        {
            await DeleteAllActiveJobsWithHttpInfoAsync(cancellationToken).ConfigureAwait(false);
        }

        /// <summary>
        ///  Delete all active jobs started by the requester&#39;s username-serial
        /// </summary>
        /// <exception cref="FactSet.SDK.UniversalScreening.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="cancellationToken">Cancellation Token to cancel the request.</param>
        /// <returns>Task of ApiResponse</returns>

        public async System.Threading.Tasks.Task<ApiResponse<Object>> DeleteAllActiveJobsWithHttpInfoAsync(System.Threading.CancellationToken cancellationToken = default(System.Threading.CancellationToken))
        {

            FactSet.SDK.UniversalScreening.Client.RequestOptions localVarRequestOptions = new FactSet.SDK.UniversalScreening.Client.RequestOptions();

            string[] _contentTypes = new string[] {
            };

            // to determine the Accept header
            string[] _accepts = new string[] {
                "application/json"
            };

            var localVarContentType = FactSet.SDK.UniversalScreening.Client.ClientUtils.SelectHeaderContentType(_contentTypes);
            if (localVarContentType != null)
            {
                localVarRequestOptions.HeaderParameters.Add("Content-Type", localVarContentType);
            }

            var localVarAccept = FactSet.SDK.UniversalScreening.Client.ClientUtils.SelectHeaderAccept(_accepts);
            if (localVarAccept != null)
            {
                localVarRequestOptions.HeaderParameters.Add("Accept", localVarAccept);
            }


            // authentication (FactSetApiKey) required
            // http basic authentication required
            if (!string.IsNullOrEmpty(this.Configuration.Username) || !string.IsNullOrEmpty(this.Configuration.Password) && !localVarRequestOptions.HeaderParameters.ContainsKey("Authorization"))
            {
                localVarRequestOptions.HeaderParameters.Add("Authorization", "Basic " + FactSet.SDK.UniversalScreening.Client.ClientUtils.Base64Encode(this.Configuration.Username + ":" + this.Configuration.Password));
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


            localVarRequestOptions.ResponseTypeDictionary = DeleteAllActiveJobsResponseTypeDictionary;

            // make the HTTP request
            var localVarResponse = await this.AsynchronousClient.DeleteAsync<Object>("/jobs", localVarRequestOptions, this.Configuration, cancellationToken).ConfigureAwait(false);

            if (this.ExceptionFactory != null)
            {
                Exception _exception = this.ExceptionFactory("DeleteAllActiveJobs", localVarResponse);
                if (_exception != null)
                {
                    throw _exception;
                }
            }

            return localVarResponse;
        }

        /// <summary>
        ///  Retrieve list of all active job ids started by requester&#39;s username-serial
        /// </summary>
        /// <exception cref="FactSet.SDK.UniversalScreening.Client.ApiException">Thrown when fails to make API call</exception>
        /// <returns>ActiveJobsData</returns>
        public ActiveJobsData GetAllActiveJobs()
        {
            var localVarResponse = GetAllActiveJobsWithHttpInfo();
            return localVarResponse.Data;
        }

        /// <summary>
        ///  Retrieve list of all active job ids started by requester&#39;s username-serial
        /// </summary>
        /// <exception cref="FactSet.SDK.UniversalScreening.Client.ApiException">Thrown when fails to make API call</exception>
        /// <returns>ApiResponse of ActiveJobsData</returns>
        public ApiResponse<ActiveJobsData> GetAllActiveJobsWithHttpInfo()
        {
            FactSet.SDK.UniversalScreening.Client.RequestOptions localVarRequestOptions = new FactSet.SDK.UniversalScreening.Client.RequestOptions();

            string[] _contentTypes = new string[] {
            };

            // to determine the Accept header
            string[] _accepts = new string[] {
                "application/json"
            };

            var localVarContentType = FactSet.SDK.UniversalScreening.Client.ClientUtils.SelectHeaderContentType(_contentTypes);
            if (localVarContentType != null)
            {
                localVarRequestOptions.HeaderParameters.Add("Content-Type", localVarContentType);
            }

            var localVarAccept = FactSet.SDK.UniversalScreening.Client.ClientUtils.SelectHeaderAccept(_accepts);
            if (localVarAccept != null)
            {
                localVarRequestOptions.HeaderParameters.Add("Accept", localVarAccept);
            }


            // authentication (FactSetApiKey) required
            // http basic authentication required
            if (!string.IsNullOrEmpty(this.Configuration.Username) || !string.IsNullOrEmpty(this.Configuration.Password) && !localVarRequestOptions.HeaderParameters.ContainsKey("Authorization"))
            {
                localVarRequestOptions.HeaderParameters.Add("Authorization", "Basic " + FactSet.SDK.UniversalScreening.Client.ClientUtils.Base64Encode(this.Configuration.Username + ":" + this.Configuration.Password));
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

            localVarRequestOptions.ResponseTypeDictionary = GetAllActiveJobsResponseTypeDictionary;

            // make the HTTP request
            var localVarResponse = this.Client.Get<
            ActiveJobsData>("/jobs", localVarRequestOptions, this.Configuration);
            if (this.ExceptionFactory != null)
            {
                Exception _exception = this.ExceptionFactory("GetAllActiveJobs", localVarResponse);
                if (_exception != null)
                {
                    throw _exception;
                }
            }
            return localVarResponse;
        }

        /// <summary>
        ///  Retrieve list of all active job ids started by requester&#39;s username-serial
        /// </summary>
        /// <exception cref="FactSet.SDK.UniversalScreening.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="cancellationToken">Cancellation Token to cancel the request.</param>
        /// <returns>Task of ActiveJobsData</returns>
        public async System.Threading.Tasks.Task<ActiveJobsData>GetAllActiveJobsAsync(System.Threading.CancellationToken cancellationToken = default(System.Threading.CancellationToken))
        {
            var localVarResponse = await GetAllActiveJobsWithHttpInfoAsync(cancellationToken).ConfigureAwait(false);
            return localVarResponse.Data;
        }

        /// <summary>
        ///  Retrieve list of all active job ids started by requester&#39;s username-serial
        /// </summary>
        /// <exception cref="FactSet.SDK.UniversalScreening.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="cancellationToken">Cancellation Token to cancel the request.</param>
        /// <returns>Task of ApiResponse (ActiveJobsData)</returns>

        public async System.Threading.Tasks.Task<ApiResponse<ActiveJobsData>> GetAllActiveJobsWithHttpInfoAsync(System.Threading.CancellationToken cancellationToken = default(System.Threading.CancellationToken))
        {

            FactSet.SDK.UniversalScreening.Client.RequestOptions localVarRequestOptions = new FactSet.SDK.UniversalScreening.Client.RequestOptions();

            string[] _contentTypes = new string[] {
            };

            // to determine the Accept header
            string[] _accepts = new string[] {
                "application/json"
            };

            var localVarContentType = FactSet.SDK.UniversalScreening.Client.ClientUtils.SelectHeaderContentType(_contentTypes);
            if (localVarContentType != null)
            {
                localVarRequestOptions.HeaderParameters.Add("Content-Type", localVarContentType);
            }

            var localVarAccept = FactSet.SDK.UniversalScreening.Client.ClientUtils.SelectHeaderAccept(_accepts);
            if (localVarAccept != null)
            {
                localVarRequestOptions.HeaderParameters.Add("Accept", localVarAccept);
            }


            // authentication (FactSetApiKey) required
            // http basic authentication required
            if (!string.IsNullOrEmpty(this.Configuration.Username) || !string.IsNullOrEmpty(this.Configuration.Password) && !localVarRequestOptions.HeaderParameters.ContainsKey("Authorization"))
            {
                localVarRequestOptions.HeaderParameters.Add("Authorization", "Basic " + FactSet.SDK.UniversalScreening.Client.ClientUtils.Base64Encode(this.Configuration.Username + ":" + this.Configuration.Password));
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


            localVarRequestOptions.ResponseTypeDictionary = GetAllActiveJobsResponseTypeDictionary;

            // make the HTTP request
            var localVarResponse = await this.AsynchronousClient.GetAsync<ActiveJobsData>("/jobs", localVarRequestOptions, this.Configuration, cancellationToken).ConfigureAwait(false);

            if (this.ExceptionFactory != null)
            {
                Exception _exception = this.ExceptionFactory("GetAllActiveJobs", localVarResponse);
                if (_exception != null)
                {
                    throw _exception;
                }
            }

            return localVarResponse;
        }

    }
}
