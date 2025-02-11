/*
 * Conversational API Powered by FactSet Mercury
 *
 * ### OVERVIEW  The FactSet Conversational API allows clients to integrate core FactSet Mercury capabilities in chatbot experiences.  The Conversational API is powered by FactSet Mercury, FactSet's Generative Artificial Intelligence (GenAI) large language model. The Conversational API provides a variety of content and capabilities, including FactSet’s Federation layer (FactSet’s core GenAI-based technology), as well as more specific content and functionality tailored for financial services workflows.  The Conversational API provides answers to hundreds of natural language search queries and allows you to easily ask questions related to companies and markets research.  Some example supported prompts:  - Nintendo's highest closing stock price over the last 3 months - Has Yelp issued any guidance? - What are the key trends impacting costs for DaVita?  **For Information on Access to and Content Available via the Conversational API**  Please see the [Conversational API Online Assistant Page](https://my.apps.factset.com/oa/pages/23209). Here you can find instructions on how to set up access to the Conversational API, and the full list of content available.  #### Conversational API Consumer Workflow  The Conversational API is an asynchronous API that utilizes status polling to inform the consumer when a query response is complete. Please see the technical OpenAPI documentation below for specific information regarding consuming the API programmatically.  At a high level, the API consumer workflow is as follows:  1) Send a natural language query to the `/query` endpoint and start the response generation process. 2) Poll the status of the response generation process using the `/status` endpoint. 3) Once the status indicates a ready response, retrieve it using the `/result` endpoint.  - If your response contains a file ID, such as for an Excel chart or a [FactSet ActiveGraph](https://my.apps.factset.com/oa/pages/20355), retrieve it using the file ID at the `/download/file` endpoint. - To provide feedback on your response and help the Conversational API better serve you content, we encourage you to use the `/feedback` endpoint.   #### Receive updates on changes to the Conversational API Subscribe to our FactSet Notify by clicking \"Subscribe to notifications\" in the upper right above the API overview. You will receive email updates when any updates occur to the API  #### FAQ & Troubleshooting Please find FAQs and troubleshooting tips in the [FAQs section](https://my.apps.factset.com/oa/pages/23440) of the Conversational API OA page  ##### Current Limitations  - \"Natural language\" in this documentation refers to modern conversational English. Support for other languages is currently unavailable. - The Conversational API is currently limited to accept 10 natural language queries per minute and 200 per hour for an individual consumer. If you anticipate your needs to be greater than these limits, please reach out to FactSet Support. 
 *
 * The version of the OpenAPI document: 1.0.8
 * Contact: api@factset.com
 * Generated by: https://github.com/openapitools/openapi-generator.git
 */


using System;
using System.Collections.Generic;
using System.Collections.ObjectModel;
using System.Linq;
using System.Net;
using System.Net.Mime;
using FactSet.SDK.ConversationalAPIPoweredbyFactSetMercury.Client;
using FactSet.SDK.ConversationalAPIPoweredbyFactSetMercury.Model;
using FactSet.SDK.Utils.Authentication;

namespace FactSet.SDK.ConversationalAPIPoweredbyFactSetMercury.Api
{

    /// <summary>
    /// Represents a collection of functions to interact with the API endpoints
    /// </summary>
    public interface IDownloadApiSync : IApiAccessor
    {
        #region Synchronous Operations
        /// <summary>
        /// Retrieve data file based on file ID.
        /// </summary>
        /// <remarks>
        /// If your response from the &#x60;/result&#x60; endpoint contains a file ID within a NextStep Download action, you can retrieve the file using this endpoint.  Files are available for download for 24 hours after generation.  Returns a downloadable Excel .xlsx file referenced in the NextStep action returned from the &#x60;/result&#x60; endpoint.  Any of the following content can be embedded into a downloadable Excel file: * ActiveGraph * ExcelChart * STACH Table (as Excel) 
        /// </remarks>
        /// <exception cref="FactSet.SDK.ConversationalAPIPoweredbyFactSetMercury.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="fileDownloadRequest">ID refers to the file ID in the NextStep action returned from the &#x60;/result&#x60; endpoint</param>
        /// <returns>System.IO.Stream</returns>
        System.IO.Stream DownloadFile(FileDownloadRequest fileDownloadRequest);

        /// <summary>
        /// Retrieve data file based on file ID.
        /// </summary>
        /// <remarks>
        /// If your response from the &#x60;/result&#x60; endpoint contains a file ID within a NextStep Download action, you can retrieve the file using this endpoint.  Files are available for download for 24 hours after generation.  Returns a downloadable Excel .xlsx file referenced in the NextStep action returned from the &#x60;/result&#x60; endpoint.  Any of the following content can be embedded into a downloadable Excel file: * ActiveGraph * ExcelChart * STACH Table (as Excel) 
        /// </remarks>
        /// <exception cref="FactSet.SDK.ConversationalAPIPoweredbyFactSetMercury.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="fileDownloadRequest">ID refers to the file ID in the NextStep action returned from the &#x60;/result&#x60; endpoint</param>
        /// <returns>ApiResponse of System.IO.Stream</returns>
        ApiResponse<System.IO.Stream> DownloadFileWithHttpInfo(FileDownloadRequest fileDownloadRequest);
        #endregion Synchronous Operations
    }

    /// <summary>
    /// Represents a collection of functions to interact with the API endpoints
    /// </summary>
    public interface IDownloadApiAsync : IApiAccessor
    {
        #region Asynchronous Operations
        /// <summary>
        /// Retrieve data file based on file ID.
        /// </summary>
        /// <remarks>
        /// If your response from the &#x60;/result&#x60; endpoint contains a file ID within a NextStep Download action, you can retrieve the file using this endpoint.  Files are available for download for 24 hours after generation.  Returns a downloadable Excel .xlsx file referenced in the NextStep action returned from the &#x60;/result&#x60; endpoint.  Any of the following content can be embedded into a downloadable Excel file: * ActiveGraph * ExcelChart * STACH Table (as Excel) 
        /// </remarks>
        /// <exception cref="FactSet.SDK.ConversationalAPIPoweredbyFactSetMercury.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="fileDownloadRequest">ID refers to the file ID in the NextStep action returned from the &#x60;/result&#x60; endpoint</param>
        /// <param name="cancellationToken">Cancellation Token to cancel the request.</param>
        /// <returns>Task of System.IO.Stream</returns>
        System.Threading.Tasks.Task<System.IO.Stream> DownloadFileAsync(FileDownloadRequest fileDownloadRequest, System.Threading.CancellationToken cancellationToken = default(System.Threading.CancellationToken));

        /// <summary>
        /// Retrieve data file based on file ID.
        /// </summary>
        /// <remarks>
        /// If your response from the &#x60;/result&#x60; endpoint contains a file ID within a NextStep Download action, you can retrieve the file using this endpoint.  Files are available for download for 24 hours after generation.  Returns a downloadable Excel .xlsx file referenced in the NextStep action returned from the &#x60;/result&#x60; endpoint.  Any of the following content can be embedded into a downloadable Excel file: * ActiveGraph * ExcelChart * STACH Table (as Excel) 
        /// </remarks>
        /// <exception cref="FactSet.SDK.ConversationalAPIPoweredbyFactSetMercury.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="fileDownloadRequest">ID refers to the file ID in the NextStep action returned from the &#x60;/result&#x60; endpoint</param>
        /// <param name="cancellationToken">Cancellation Token to cancel the request.</param>
        /// <returns>Task of ApiResponse (System.IO.Stream)</returns>
        System.Threading.Tasks.Task<ApiResponse<System.IO.Stream>> DownloadFileWithHttpInfoAsync(FileDownloadRequest fileDownloadRequest, System.Threading.CancellationToken cancellationToken = default(System.Threading.CancellationToken));
        #endregion Asynchronous Operations
    }

    /// <summary>
    /// Represents a collection of functions to interact with the API endpoints
    /// </summary>
    public interface IDownloadApi : IDownloadApiSync, IDownloadApiAsync
    {

    }

    /// <summary>
    /// Represents a collection of functions to interact with the API endpoints
    /// </summary>
    public partial class DownloadApi : IDownloadApi
    {
        private FactSet.SDK.ConversationalAPIPoweredbyFactSetMercury.Client.ExceptionFactory _exceptionFactory = (name, response) => null;

        # region Response Type Disctionaries
        
        private static readonly Dictionary<HttpStatusCode, System.Type> DownloadFileResponseTypeDictionary = new Dictionary<HttpStatusCode, System.Type>
        {
            { (HttpStatusCode)200, typeof(System.IO.Stream) },
            { (HttpStatusCode)400, typeof(BadRequestError) },
            { (HttpStatusCode)401, typeof(string) },
            { (HttpStatusCode)403, typeof(string) },
            { (HttpStatusCode)404, typeof(ResourceNotFoundError) },
            { (HttpStatusCode)405, typeof(string) },
            { (HttpStatusCode)500, typeof(InternalServerError) },
        };

        # endregion Response Type Disctionaries

        # region Api Response Objects
        

        # endregion Api Response Objects

        /// <summary>
        /// Initializes a new instance of the <see cref="DownloadApi"/> class.
        /// </summary>
        /// <returns></returns>
        public DownloadApi() : this((string)null)
        {
        }

        /// <summary>
        /// Initializes a new instance of the <see cref="DownloadApi"/> class.
        /// </summary>
        /// <returns></returns>
        public DownloadApi(string basePath)
        {
            this.Configuration = FactSet.SDK.ConversationalAPIPoweredbyFactSetMercury.Client.Configuration.MergeConfigurations(
                FactSet.SDK.ConversationalAPIPoweredbyFactSetMercury.Client.GlobalConfiguration.Instance,
                new FactSet.SDK.ConversationalAPIPoweredbyFactSetMercury.Client.Configuration { BasePath = basePath }
            );
            this.Client = new FactSet.SDK.ConversationalAPIPoweredbyFactSetMercury.Client.ApiClient(this.Configuration.BasePath);
            this.AsynchronousClient = new FactSet.SDK.ConversationalAPIPoweredbyFactSetMercury.Client.ApiClient(this.Configuration.BasePath);
            this.ExceptionFactory = FactSet.SDK.ConversationalAPIPoweredbyFactSetMercury.Client.Configuration.DefaultExceptionFactory;
        }

        /// <summary>
        /// Initializes a new instance of the <see cref="DownloadApi"/> class
        /// using Configuration object
        /// </summary>
        /// <param name="configuration">An instance of Configuration</param>
        /// <returns></returns>
        public DownloadApi(FactSet.SDK.ConversationalAPIPoweredbyFactSetMercury.Client.Configuration configuration)
        {
            if (configuration == null) throw new ArgumentNullException("configuration");

            this.Configuration = FactSet.SDK.ConversationalAPIPoweredbyFactSetMercury.Client.Configuration.MergeConfigurations(
                FactSet.SDK.ConversationalAPIPoweredbyFactSetMercury.Client.GlobalConfiguration.Instance,
                configuration
            );
            this.Client = new FactSet.SDK.ConversationalAPIPoweredbyFactSetMercury.Client.ApiClient(this.Configuration.BasePath);
            this.AsynchronousClient = new FactSet.SDK.ConversationalAPIPoweredbyFactSetMercury.Client.ApiClient(this.Configuration.BasePath);
            ExceptionFactory = FactSet.SDK.ConversationalAPIPoweredbyFactSetMercury.Client.Configuration.DefaultExceptionFactory;
        }

        /// <summary>
        /// Initializes a new instance of the <see cref="DownloadApi"/> class
        /// using a Configuration object and client instance.
        /// </summary>
        /// <param name="client">The client interface for synchronous API access.</param>
        /// <param name="asyncClient">The client interface for asynchronous API access.</param>
        /// <param name="configuration">The configuration object.</param>
        public DownloadApi(FactSet.SDK.ConversationalAPIPoweredbyFactSetMercury.Client.ISynchronousClient client, FactSet.SDK.ConversationalAPIPoweredbyFactSetMercury.Client.IAsynchronousClient asyncClient, FactSet.SDK.ConversationalAPIPoweredbyFactSetMercury.Client.IReadableConfiguration configuration)
        {
            if (client == null) throw new ArgumentNullException("client");
            if (asyncClient == null) throw new ArgumentNullException("asyncClient");
            if (configuration == null) throw new ArgumentNullException("configuration");

            this.Client = client;
            this.AsynchronousClient = asyncClient;
            this.Configuration = configuration;
            this.ExceptionFactory = FactSet.SDK.ConversationalAPIPoweredbyFactSetMercury.Client.Configuration.DefaultExceptionFactory;
        }

        /// <summary>
        /// The client for accessing this underlying API asynchronously.
        /// </summary>
        public FactSet.SDK.ConversationalAPIPoweredbyFactSetMercury.Client.IAsynchronousClient AsynchronousClient { get; set; }

        /// <summary>
        /// The client for accessing this underlying API synchronously.
        /// </summary>
        public FactSet.SDK.ConversationalAPIPoweredbyFactSetMercury.Client.ISynchronousClient Client { get; set; }

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
        public FactSet.SDK.ConversationalAPIPoweredbyFactSetMercury.Client.IReadableConfiguration Configuration { get; set; }

        /// <summary>
        /// Provides a factory method hook for the creation of exceptions.
        /// </summary>
        public FactSet.SDK.ConversationalAPIPoweredbyFactSetMercury.Client.ExceptionFactory ExceptionFactory
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
        /// Retrieve data file based on file ID. If your response from the &#x60;/result&#x60; endpoint contains a file ID within a NextStep Download action, you can retrieve the file using this endpoint.  Files are available for download for 24 hours after generation.  Returns a downloadable Excel .xlsx file referenced in the NextStep action returned from the &#x60;/result&#x60; endpoint.  Any of the following content can be embedded into a downloadable Excel file: * ActiveGraph * ExcelChart * STACH Table (as Excel) 
        /// </summary>
        /// <exception cref="FactSet.SDK.ConversationalAPIPoweredbyFactSetMercury.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="fileDownloadRequest">ID refers to the file ID in the NextStep action returned from the &#x60;/result&#x60; endpoint</param>
        /// <returns>System.IO.Stream</returns>
        public System.IO.Stream DownloadFile(FileDownloadRequest fileDownloadRequest)
        {
            var localVarResponse = DownloadFileWithHttpInfo(fileDownloadRequest);
            return localVarResponse.Data;
        }

        /// <summary>
        /// Retrieve data file based on file ID. If your response from the &#x60;/result&#x60; endpoint contains a file ID within a NextStep Download action, you can retrieve the file using this endpoint.  Files are available for download for 24 hours after generation.  Returns a downloadable Excel .xlsx file referenced in the NextStep action returned from the &#x60;/result&#x60; endpoint.  Any of the following content can be embedded into a downloadable Excel file: * ActiveGraph * ExcelChart * STACH Table (as Excel) 
        /// </summary>
        /// <exception cref="FactSet.SDK.ConversationalAPIPoweredbyFactSetMercury.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="fileDownloadRequest">ID refers to the file ID in the NextStep action returned from the &#x60;/result&#x60; endpoint</param>
        /// <returns>ApiResponse of System.IO.Stream</returns>
        public ApiResponse<System.IO.Stream> DownloadFileWithHttpInfo(FileDownloadRequest fileDownloadRequest)
        {
            // verify the required parameter 'fileDownloadRequest' is set
            if (fileDownloadRequest == null)
            {
                throw new FactSet.SDK.ConversationalAPIPoweredbyFactSetMercury.Client.ApiException(400, "Missing required parameter 'fileDownloadRequest' when calling DownloadApi->DownloadFile");
            }

            FactSet.SDK.ConversationalAPIPoweredbyFactSetMercury.Client.RequestOptions localVarRequestOptions = new FactSet.SDK.ConversationalAPIPoweredbyFactSetMercury.Client.RequestOptions();

            string[] _contentTypes = new string[] {
                "application/json"
            };

            // to determine the Accept header
            string[] _accepts = new string[] {
                "application/vnd.openxmlformats-officedocument.spreadsheetml.sheet",
                "application/json",
                "text/plain"
            };

            var localVarContentType = FactSet.SDK.ConversationalAPIPoweredbyFactSetMercury.Client.ClientUtils.SelectHeaderContentType(_contentTypes);
            if (localVarContentType != null)
            {
                localVarRequestOptions.HeaderParameters.Add("Content-Type", localVarContentType);
            }

            var localVarAccept = FactSet.SDK.ConversationalAPIPoweredbyFactSetMercury.Client.ClientUtils.SelectHeaderAccept(_accepts);
            if (localVarAccept != null)
            {
                localVarRequestOptions.HeaderParameters.Add("Accept", localVarAccept);
            }

            localVarRequestOptions.Data = fileDownloadRequest;

            // authentication (FactSetApiKey) required
            // http basic authentication required
            if (!string.IsNullOrEmpty(this.Configuration.Username) || !string.IsNullOrEmpty(this.Configuration.Password) && !localVarRequestOptions.HeaderParameters.ContainsKey("Authorization"))
            {
                localVarRequestOptions.HeaderParameters.Add("Authorization", "Basic " + FactSet.SDK.ConversationalAPIPoweredbyFactSetMercury.Client.ClientUtils.Base64Encode(this.Configuration.Username + ":" + this.Configuration.Password));
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

            localVarRequestOptions.ResponseTypeDictionary = DownloadFileResponseTypeDictionary;

            // make the HTTP request
            var localVarResponse = this.Client.Post<
            System.IO.Stream>("/download/file", localVarRequestOptions, this.Configuration);
            if (this.ExceptionFactory != null)
            {
                Exception _exception = this.ExceptionFactory("DownloadFile", localVarResponse);
                if (_exception != null)
                {
                    throw _exception;
                }
            }
            return localVarResponse;
        }

        /// <summary>
        /// Retrieve data file based on file ID. If your response from the &#x60;/result&#x60; endpoint contains a file ID within a NextStep Download action, you can retrieve the file using this endpoint.  Files are available for download for 24 hours after generation.  Returns a downloadable Excel .xlsx file referenced in the NextStep action returned from the &#x60;/result&#x60; endpoint.  Any of the following content can be embedded into a downloadable Excel file: * ActiveGraph * ExcelChart * STACH Table (as Excel) 
        /// </summary>
        /// <exception cref="FactSet.SDK.ConversationalAPIPoweredbyFactSetMercury.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="fileDownloadRequest">ID refers to the file ID in the NextStep action returned from the &#x60;/result&#x60; endpoint</param>
        /// <param name="cancellationToken">Cancellation Token to cancel the request.</param>
        /// <returns>Task of System.IO.Stream</returns>
        public async System.Threading.Tasks.Task<System.IO.Stream>DownloadFileAsync(FileDownloadRequest fileDownloadRequest, System.Threading.CancellationToken cancellationToken = default(System.Threading.CancellationToken))
        {
            var localVarResponse = await DownloadFileWithHttpInfoAsync(fileDownloadRequest, cancellationToken).ConfigureAwait(false);
            return localVarResponse.Data;
        }

        /// <summary>
        /// Retrieve data file based on file ID. If your response from the &#x60;/result&#x60; endpoint contains a file ID within a NextStep Download action, you can retrieve the file using this endpoint.  Files are available for download for 24 hours after generation.  Returns a downloadable Excel .xlsx file referenced in the NextStep action returned from the &#x60;/result&#x60; endpoint.  Any of the following content can be embedded into a downloadable Excel file: * ActiveGraph * ExcelChart * STACH Table (as Excel) 
        /// </summary>
        /// <exception cref="FactSet.SDK.ConversationalAPIPoweredbyFactSetMercury.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="fileDownloadRequest">ID refers to the file ID in the NextStep action returned from the &#x60;/result&#x60; endpoint</param>
        /// <param name="cancellationToken">Cancellation Token to cancel the request.</param>
        /// <returns>Task of ApiResponse (System.IO.Stream)</returns>

        public async System.Threading.Tasks.Task<ApiResponse<System.IO.Stream>> DownloadFileWithHttpInfoAsync(FileDownloadRequest fileDownloadRequest, System.Threading.CancellationToken cancellationToken = default(System.Threading.CancellationToken))
        {
            // verify the required parameter 'fileDownloadRequest' is set
            if (fileDownloadRequest == null)
            {
                throw new FactSet.SDK.ConversationalAPIPoweredbyFactSetMercury.Client.ApiException(400, "Missing required parameter 'fileDownloadRequest' when calling DownloadApi->DownloadFile");
            }


            FactSet.SDK.ConversationalAPIPoweredbyFactSetMercury.Client.RequestOptions localVarRequestOptions = new FactSet.SDK.ConversationalAPIPoweredbyFactSetMercury.Client.RequestOptions();

            string[] _contentTypes = new string[] {
                "application/json"
            };

            // to determine the Accept header
            string[] _accepts = new string[] {
                "application/vnd.openxmlformats-officedocument.spreadsheetml.sheet",
                "application/json",
                "text/plain"
            };

            var localVarContentType = FactSet.SDK.ConversationalAPIPoweredbyFactSetMercury.Client.ClientUtils.SelectHeaderContentType(_contentTypes);
            if (localVarContentType != null)
            {
                localVarRequestOptions.HeaderParameters.Add("Content-Type", localVarContentType);
            }

            var localVarAccept = FactSet.SDK.ConversationalAPIPoweredbyFactSetMercury.Client.ClientUtils.SelectHeaderAccept(_accepts);
            if (localVarAccept != null)
            {
                localVarRequestOptions.HeaderParameters.Add("Accept", localVarAccept);
            }

            localVarRequestOptions.Data = fileDownloadRequest;

            // authentication (FactSetApiKey) required
            // http basic authentication required
            if (!string.IsNullOrEmpty(this.Configuration.Username) || !string.IsNullOrEmpty(this.Configuration.Password) && !localVarRequestOptions.HeaderParameters.ContainsKey("Authorization"))
            {
                localVarRequestOptions.HeaderParameters.Add("Authorization", "Basic " + FactSet.SDK.ConversationalAPIPoweredbyFactSetMercury.Client.ClientUtils.Base64Encode(this.Configuration.Username + ":" + this.Configuration.Password));
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


            localVarRequestOptions.ResponseTypeDictionary = DownloadFileResponseTypeDictionary;

            // make the HTTP request
            var localVarResponse = await this.AsynchronousClient.PostAsync<System.IO.Stream>("/download/file", localVarRequestOptions, this.Configuration, cancellationToken).ConfigureAwait(false);

            if (this.ExceptionFactory != null)
            {
                Exception _exception = this.ExceptionFactory("DownloadFile", localVarResponse);
                if (_exception != null)
                {
                    throw _exception;
                }
            }

            return localVarResponse;
        }

    }
}
