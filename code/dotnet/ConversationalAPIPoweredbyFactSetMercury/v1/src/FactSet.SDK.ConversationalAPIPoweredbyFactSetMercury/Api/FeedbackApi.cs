/*
 * Conversational API Powered by FactSet Mercury
 *
 * ### OVERVIEW  The FactSet Conversational API allows clients to white-label core FactSet Mercury capabilities in a client's chatbot experience.  The Conversational API is powered by FactSet Mercury, FactSet's Generative Artificial Intelligence (GenAI) large language model. The Conversational API provides a variety of content and capabilities, including FactSet’s Federation layer (FactSet’s core GenAI-based technology), as well as more specific content and functionality tailored for financial services workflows.  The Conversational API provides answers to hundreds of natural language search queries and allows you to easily ask questions related to companies and markets research.  Some example supported prompts:  - Nintendo's highest closing stock price over the last 3 months - Has Yelp issued any guidance? - What are the key trends impacting costs for DaVita?  **For Information on Access to and Content Available via the Conversational API**  Please see the [Conversational API Online Assistant Page](https://my.apps.factset.com/oa/pages/23209). Here you can find instructions on how to set up access to the Conversational API, and the full list of content available.  #### Conversational API Consumer Workflow  The Conversational API is an asynchronous API that utilizes status polling to inform the consumer when a query response is complete. Please see the technical OpenAPI documentation below for specific information regarding consuming the API programmatically.  At a high level, the API consumer workflow is as follows:  1) Send a natural language query to the `/query` endpoint and start the response generation process. 2) Poll the status of the response generation process using the `/status` endpoint. 3) Once the status indicates a ready response, retrieve it using the `/result` endpoint.  - If your response contains a file ID, such as for an Excel chart or a [FactSet ActiveGraph](https://my.apps.factset.com/oa/pages/20355), retrieve it using the file ID at the `/download/file` endpoint. - To provide feedback on your response and help the Conversational API better serve you content, we encourage you to use the `/feedback` endpoint.   ##### Current Limitations  - \"Natural language\" in this documentation refers to modern conversational English. Support for other languages is currently unavailable. - The Conversational API is currently limited to accept 10 natural language queries per minute and 200 per hour for an individual consumer. If you anticipate your needs to be greater than these limits, please reach out to FatSet Support.  #### FAQ   **How can I receive updates on changes to the Conversational API?** - Please subscribe to our FactSet Notify by clicking \"Subscribe to notifications\" in the upper right above the API overview. You will receive email updates when any updates occur to the API. **Why am I receiving a 403 error with a valid API key?** - Please ensure that your current public IP is within the IP range allocated to the API key you are using to authenticate API requests. You can update your API key's allowable IP range via the [FactSet Developer Portal API Authentication page](https://developer.factset.com/api-authentication). If this does not resolve the issue, please reach out to FactSet Support to ensure you are appropriately authorized to access the Conversational API. 
 *
 * The version of the OpenAPI document: 1.0.3
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
    public interface IFeedbackApiSync : IApiAccessor
    {
        #region Synchronous Operations
        /// <summary>
        /// Send feedback on the response to a query.
        /// </summary>
        /// <remarks>
        /// Use this endpoint to provide feedback to FactSet regarding the response to a query. Feedback is used to help us identify areas for improvement in our responses.  Feedback will only be accepted within 24 hours of the original response, and only once for each response ID. If you would like to provide additional feedback, please reach out to your FactSet Support Team representative. 
        /// </remarks>
        /// <exception cref="FactSet.SDK.ConversationalAPIPoweredbyFactSetMercury.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="feedbackRequest">Body containing the ID of the response from FactSet Mercury as well as the feedback on that response.  The responseId field must be populated with the ID received from the &#x60;/result&#x60; endpoint. Send this along with a boolean representing whether the response was helpful or not. </param>
        /// <returns>void</returns>
        void SendFeedback(FeedbackRequest feedbackRequest);

        /// <summary>
        /// Send feedback on the response to a query.
        /// </summary>
        /// <remarks>
        /// Use this endpoint to provide feedback to FactSet regarding the response to a query. Feedback is used to help us identify areas for improvement in our responses.  Feedback will only be accepted within 24 hours of the original response, and only once for each response ID. If you would like to provide additional feedback, please reach out to your FactSet Support Team representative. 
        /// </remarks>
        /// <exception cref="FactSet.SDK.ConversationalAPIPoweredbyFactSetMercury.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="feedbackRequest">Body containing the ID of the response from FactSet Mercury as well as the feedback on that response.  The responseId field must be populated with the ID received from the &#x60;/result&#x60; endpoint. Send this along with a boolean representing whether the response was helpful or not. </param>
        /// <returns>ApiResponse of Object(void)</returns>
        ApiResponse<Object> SendFeedbackWithHttpInfo(FeedbackRequest feedbackRequest);
        #endregion Synchronous Operations
    }

    /// <summary>
    /// Represents a collection of functions to interact with the API endpoints
    /// </summary>
    public interface IFeedbackApiAsync : IApiAccessor
    {
        #region Asynchronous Operations
        /// <summary>
        /// Send feedback on the response to a query.
        /// </summary>
        /// <remarks>
        /// Use this endpoint to provide feedback to FactSet regarding the response to a query. Feedback is used to help us identify areas for improvement in our responses.  Feedback will only be accepted within 24 hours of the original response, and only once for each response ID. If you would like to provide additional feedback, please reach out to your FactSet Support Team representative. 
        /// </remarks>
        /// <exception cref="FactSet.SDK.ConversationalAPIPoweredbyFactSetMercury.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="feedbackRequest">Body containing the ID of the response from FactSet Mercury as well as the feedback on that response.  The responseId field must be populated with the ID received from the &#x60;/result&#x60; endpoint. Send this along with a boolean representing whether the response was helpful or not. </param>
        /// <param name="cancellationToken">Cancellation Token to cancel the request.</param>
        /// <returns>Task of void</returns>
        System.Threading.Tasks.Task SendFeedbackAsync(FeedbackRequest feedbackRequest, System.Threading.CancellationToken cancellationToken = default(System.Threading.CancellationToken));

        /// <summary>
        /// Send feedback on the response to a query.
        /// </summary>
        /// <remarks>
        /// Use this endpoint to provide feedback to FactSet regarding the response to a query. Feedback is used to help us identify areas for improvement in our responses.  Feedback will only be accepted within 24 hours of the original response, and only once for each response ID. If you would like to provide additional feedback, please reach out to your FactSet Support Team representative. 
        /// </remarks>
        /// <exception cref="FactSet.SDK.ConversationalAPIPoweredbyFactSetMercury.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="feedbackRequest">Body containing the ID of the response from FactSet Mercury as well as the feedback on that response.  The responseId field must be populated with the ID received from the &#x60;/result&#x60; endpoint. Send this along with a boolean representing whether the response was helpful or not. </param>
        /// <param name="cancellationToken">Cancellation Token to cancel the request.</param>
        /// <returns>Task of ApiResponse</returns>
        System.Threading.Tasks.Task<ApiResponse<Object>> SendFeedbackWithHttpInfoAsync(FeedbackRequest feedbackRequest, System.Threading.CancellationToken cancellationToken = default(System.Threading.CancellationToken));
        #endregion Asynchronous Operations
    }

    /// <summary>
    /// Represents a collection of functions to interact with the API endpoints
    /// </summary>
    public interface IFeedbackApi : IFeedbackApiSync, IFeedbackApiAsync
    {

    }

    /// <summary>
    /// Represents a collection of functions to interact with the API endpoints
    /// </summary>
    public partial class FeedbackApi : IFeedbackApi
    {
        private FactSet.SDK.ConversationalAPIPoweredbyFactSetMercury.Client.ExceptionFactory _exceptionFactory = (name, response) => null;

        # region Response Type Disctionaries
        
        private static readonly Dictionary<HttpStatusCode, System.Type> SendFeedbackResponseTypeDictionary = new Dictionary<HttpStatusCode, System.Type>
        {
        };

        # endregion Response Type Disctionaries

        # region Api Response Objects
        

        # endregion Api Response Objects

        /// <summary>
        /// Initializes a new instance of the <see cref="FeedbackApi"/> class.
        /// </summary>
        /// <returns></returns>
        public FeedbackApi() : this((string)null)
        {
        }

        /// <summary>
        /// Initializes a new instance of the <see cref="FeedbackApi"/> class.
        /// </summary>
        /// <returns></returns>
        public FeedbackApi(string basePath)
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
        /// Initializes a new instance of the <see cref="FeedbackApi"/> class
        /// using Configuration object
        /// </summary>
        /// <param name="configuration">An instance of Configuration</param>
        /// <returns></returns>
        public FeedbackApi(FactSet.SDK.ConversationalAPIPoweredbyFactSetMercury.Client.Configuration configuration)
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
        /// Initializes a new instance of the <see cref="FeedbackApi"/> class
        /// using a Configuration object and client instance.
        /// </summary>
        /// <param name="client">The client interface for synchronous API access.</param>
        /// <param name="asyncClient">The client interface for asynchronous API access.</param>
        /// <param name="configuration">The configuration object.</param>
        public FeedbackApi(FactSet.SDK.ConversationalAPIPoweredbyFactSetMercury.Client.ISynchronousClient client, FactSet.SDK.ConversationalAPIPoweredbyFactSetMercury.Client.IAsynchronousClient asyncClient, FactSet.SDK.ConversationalAPIPoweredbyFactSetMercury.Client.IReadableConfiguration configuration)
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
        /// Send feedback on the response to a query. Use this endpoint to provide feedback to FactSet regarding the response to a query. Feedback is used to help us identify areas for improvement in our responses.  Feedback will only be accepted within 24 hours of the original response, and only once for each response ID. If you would like to provide additional feedback, please reach out to your FactSet Support Team representative. 
        /// </summary>
        /// <exception cref="FactSet.SDK.ConversationalAPIPoweredbyFactSetMercury.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="feedbackRequest">Body containing the ID of the response from FactSet Mercury as well as the feedback on that response.  The responseId field must be populated with the ID received from the &#x60;/result&#x60; endpoint. Send this along with a boolean representing whether the response was helpful or not. </param>
        /// <returns>void</returns>
        public void SendFeedback(FeedbackRequest feedbackRequest)
        {
            SendFeedbackWithHttpInfo(feedbackRequest);
        }

        /// <summary>
        /// Send feedback on the response to a query. Use this endpoint to provide feedback to FactSet regarding the response to a query. Feedback is used to help us identify areas for improvement in our responses.  Feedback will only be accepted within 24 hours of the original response, and only once for each response ID. If you would like to provide additional feedback, please reach out to your FactSet Support Team representative. 
        /// </summary>
        /// <exception cref="FactSet.SDK.ConversationalAPIPoweredbyFactSetMercury.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="feedbackRequest">Body containing the ID of the response from FactSet Mercury as well as the feedback on that response.  The responseId field must be populated with the ID received from the &#x60;/result&#x60; endpoint. Send this along with a boolean representing whether the response was helpful or not. </param>
        /// <returns>ApiResponse of Object(void)</returns>
        public ApiResponse<Object> SendFeedbackWithHttpInfo(FeedbackRequest feedbackRequest)
        {
            // verify the required parameter 'feedbackRequest' is set
            if (feedbackRequest == null)
            {
                throw new FactSet.SDK.ConversationalAPIPoweredbyFactSetMercury.Client.ApiException(400, "Missing required parameter 'feedbackRequest' when calling FeedbackApi->SendFeedback");
            }

            FactSet.SDK.ConversationalAPIPoweredbyFactSetMercury.Client.RequestOptions localVarRequestOptions = new FactSet.SDK.ConversationalAPIPoweredbyFactSetMercury.Client.RequestOptions();

            string[] _contentTypes = new string[] {
                "application/json"
            };

            // to determine the Accept header
            string[] _accepts = new string[] {
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

            localVarRequestOptions.Data = feedbackRequest;

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

            localVarRequestOptions.ResponseTypeDictionary = SendFeedbackResponseTypeDictionary;

            // make the HTTP request
            var localVarResponse = this.Client.Post<
            Object>("/feedback", localVarRequestOptions, this.Configuration);
            if (this.ExceptionFactory != null)
            {
                Exception _exception = this.ExceptionFactory("SendFeedback", localVarResponse);
                if (_exception != null)
                {
                    throw _exception;
                }
            }
            return localVarResponse;
        }

        /// <summary>
        /// Send feedback on the response to a query. Use this endpoint to provide feedback to FactSet regarding the response to a query. Feedback is used to help us identify areas for improvement in our responses.  Feedback will only be accepted within 24 hours of the original response, and only once for each response ID. If you would like to provide additional feedback, please reach out to your FactSet Support Team representative. 
        /// </summary>
        /// <exception cref="FactSet.SDK.ConversationalAPIPoweredbyFactSetMercury.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="feedbackRequest">Body containing the ID of the response from FactSet Mercury as well as the feedback on that response.  The responseId field must be populated with the ID received from the &#x60;/result&#x60; endpoint. Send this along with a boolean representing whether the response was helpful or not. </param>
        /// <param name="cancellationToken">Cancellation Token to cancel the request.</param>
        /// <returns>Task of void</returns>
        public async System.Threading.Tasks.Task SendFeedbackAsync(FeedbackRequest feedbackRequest, System.Threading.CancellationToken cancellationToken = default(System.Threading.CancellationToken))
        {
            await SendFeedbackWithHttpInfoAsync(feedbackRequest, cancellationToken).ConfigureAwait(false);
        }

        /// <summary>
        /// Send feedback on the response to a query. Use this endpoint to provide feedback to FactSet regarding the response to a query. Feedback is used to help us identify areas for improvement in our responses.  Feedback will only be accepted within 24 hours of the original response, and only once for each response ID. If you would like to provide additional feedback, please reach out to your FactSet Support Team representative. 
        /// </summary>
        /// <exception cref="FactSet.SDK.ConversationalAPIPoweredbyFactSetMercury.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="feedbackRequest">Body containing the ID of the response from FactSet Mercury as well as the feedback on that response.  The responseId field must be populated with the ID received from the &#x60;/result&#x60; endpoint. Send this along with a boolean representing whether the response was helpful or not. </param>
        /// <param name="cancellationToken">Cancellation Token to cancel the request.</param>
        /// <returns>Task of ApiResponse</returns>

        public async System.Threading.Tasks.Task<ApiResponse<Object>> SendFeedbackWithHttpInfoAsync(FeedbackRequest feedbackRequest, System.Threading.CancellationToken cancellationToken = default(System.Threading.CancellationToken))
        {
            // verify the required parameter 'feedbackRequest' is set
            if (feedbackRequest == null)
            {
                throw new FactSet.SDK.ConversationalAPIPoweredbyFactSetMercury.Client.ApiException(400, "Missing required parameter 'feedbackRequest' when calling FeedbackApi->SendFeedback");
            }


            FactSet.SDK.ConversationalAPIPoweredbyFactSetMercury.Client.RequestOptions localVarRequestOptions = new FactSet.SDK.ConversationalAPIPoweredbyFactSetMercury.Client.RequestOptions();

            string[] _contentTypes = new string[] {
                "application/json"
            };

            // to determine the Accept header
            string[] _accepts = new string[] {
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

            localVarRequestOptions.Data = feedbackRequest;

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


            localVarRequestOptions.ResponseTypeDictionary = SendFeedbackResponseTypeDictionary;

            // make the HTTP request
            var localVarResponse = await this.AsynchronousClient.PostAsync<Object>("/feedback", localVarRequestOptions, this.Configuration, cancellationToken).ConfigureAwait(false);

            if (this.ExceptionFactory != null)
            {
                Exception _exception = this.ExceptionFactory("SendFeedback", localVarResponse);
                if (_exception != null)
                {
                    throw _exception;
                }
            }

            return localVarResponse;
        }

    }
}
