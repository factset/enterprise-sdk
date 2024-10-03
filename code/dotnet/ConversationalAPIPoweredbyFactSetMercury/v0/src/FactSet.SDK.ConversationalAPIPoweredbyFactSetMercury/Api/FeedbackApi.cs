/*
 * Conversational API Powered by FactSet Mercury
 *
 * ### OVERVIEW  The FactSet Conversational API allows clients to white-label core FactSet Mercury capabilities in a client’s chatbot experience.  Request data from FactSet using natural language queries. Start the response generation using the `/query` endpoint, poll the status using `/status`. Once the result is ready, retrieve it using `/result`.  If your response contains a file ID, such as for an Excel chart or a FactSet ActiveGraph, retrieve it using the file ID at the `/download/file` endpoint.  We also encourage you to provide feedback on your responses using the `/feedback` endpoint!  **Please note:** \"Natural language\" in this documentation refers to modern conversational English. Support for other languages is currently unavailable.  **Try the Conversational API and view Available Content**  In the [Using the Conversational API Online Assistant](https://my.apps.factset.com/oa/pages/23209) you can find instructions on how to start using the Conversational API, and the full list of content available.  Some of the prompts supported are:  - What is Tesla's enterprise value? - Create a chart showing CME price relative to the S&P 500 - What were the highlights from Palantir's recent earnings call?  **Adaptive Card Format**  The Conversational API uses the Microsoft Adaptive Card format for response data surfaced from FactSet content sets. `Value` property of parent FederationData contains a JSON serialized presentation of a Microsoft Adaptive Card. See [Microsoft docs](https://learn.microsoft.com/en-us/adaptive-cards/) for Adaptive Card documentation, and the [Adaptive Card schema explorer](https://adaptivecards.io/explorer/) for schema details. **Please note**: \"The adaptive card may contain actions, which represent functionality within the card itself. In order to execute these actions, a handler must be implemented in your Adaptive Card rendering process. See [handling actions](https://learn.microsoft.com/en-us/adaptive-cards/sdk/rendering-cards/javascript/actions) for an example implementation.  **STACH Format**  The Conversational API may use Factset's STACH V3 format to represent tabular data in JSON. Please refer to the [STACH V3 documentation](https://factset.github.io/stachschema/#/v3/README) on column organized data for more information on how to process STACH-organized data. <details>   <summary><u>**STACH Example**</u></summary>   ```json   {     \"version\": \"3.1\",     \"table\": {       \"primaryKeys\": [         \"Insider Holders\",         \"MV (M,$)\",         \"% O/S\"       ],       \"totalNumRows\": 5     },     \"views\": [       {         \"name\": \"view\",         \"displayName\": \"who are the suppliers of nike\",         \"table\": {           \"columns\": [             \"Insider Holders\",             \"MV (M,$)\",             \"% O/S\"           ],           \"headers\": {             \"Insider Holders\": \"Insider Holders\",             \"MV (M,$)\": \"MV (M,$)\",             \"% O/S\": \"% O/S\"           }         }       }     ],     \"columns\": [       {         \"name\": \"Insider Holders\",         \"contextualType\": \"string\",         \"customMetadata\": {           \"relevancy\": {             \"contextualType\": \"int32\",             \"value\": 100           }         }       },       {         \"name\": \"MV (M,$)\",         \"contextualType\": \"real\",         \"customMetadata\": {           \"relevancy\": {             \"contextualType\": \"int32\",             \"value\": 67           }         }       },       {         \"name\": \"% O/S\",         \"contextualType\": \"real\",         \"customMetadata\": {           \"relevancy\": {             \"contextualType\": \"int32\",             \"value\": 34           }         }       }     ],     \"rows\": [       {         \"Insider Holders\": \"Knight Philip Hampson\",         \"MV (M,$)\": 3156.8,         \"% O/S\": 1.531       },       {         \"Insider Holders\": \"Knight Travis A\",         \"MV (M,$)\": 601.6,         \"% O/S\": 0.496       },       {         \"Insider Holders\": \"Wellcome Trust Ltd. (Direct Investments)\",         \"MV (M,$)\": 225.5,         \"% O/S\": 0.105       },       {         \"Insider Holders\": \"Parker Mark G\",         \"MV (M,$)\": 100.1,         \"% O/S\": 0.056       },       {         \"Insider Holders\": \"Donahoe John J Ii\",         \"MV (M,$)\": 19.8,         \"% O/S\": 0.018       }     ]   }   ``` </details>  **Citations**  Responses from the Conversational API may contain `citations` which provide references to the source of the data directly within the textual response. Phrases within the response text are mapped to a data item in the `citations` object via a bracketed ID (e.g. `[1]`). Citations may be used to provide additional context or to verify the source of the data; in some cases, a single phrase within the response may be supported by multiple data sources. **Please note**: Links to the source data are provided as links to FactSet's Document Viewer (see [Document Viewer OA page](https://my.apps.factset.com/oa/pages/17390)). The link will direct you to the entire document; you may need to search for the specific phrase within the document. We are currently working on providing direct links to the specific section or excerpt of the document. <details>   <summary><u>**Citation Example**</u></summary>   ```json   {     \"type\": \"string\",     \"value\": \"FactSet has expressed optimism about the potential of generative AI (GenAI) to enhance their product offerings and drive efficiency[1].\"     \"citations\": {       \"[1]\": [         \"phraseId\": \"aba1d533-08b3-4d3e-8961-5d37bb2caff6\",         \"content\": \"At the same time, expectations are high around the effect generative AI will have on our industry.\",         \"speakerInfo\": {           \"companyId\": \"0016YD-E\",           \"companyName\": \"FactSet Research Systems, Inc.\",           \"speakerId\": \"0DPHLH-E\",           \"speakerName\": \"Philip Snow\",           \"speakerTitle\": \"Chief Executive Officer & Director\"         },         \"sourceURL\": \"https://my.apps.factset.com/viewer-fusion/?_doc_id=2948302-t&_doc_date=20231219&_doc_product=FCST&_doc_docfn=/home/docs/fcst/8/302/2948302-t.pdf&e=false\"       ]     }   }   ``` </details> 
 *
 * The version of the OpenAPI document: 0.6.0
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
        /// Use this endpoint to provide feedback to FactSet regarding the response to a query. Feedback is used to help us identify areas for improvement in our responses. 
        /// </remarks>
        /// <exception cref="FactSet.SDK.ConversationalAPIPoweredbyFactSetMercury.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="feedbackRequest">ID represents the response ID received from the &#x60;/result&#x60; endpoint. Send this along with a boolean representing whether the response was helpful or not.  If you would like to provide additional natural language feedback, you can also include a string with your comments. Feedback will be accepted for 24 hours after the initial response.  **Note:** Feedback is optional, but we appreciate any input you can provide. </param>
        /// <returns>void</returns>
        void SendFeedback(FeedbackRequest feedbackRequest);

        /// <summary>
        /// Send feedback on the response to a query.
        /// </summary>
        /// <remarks>
        /// Use this endpoint to provide feedback to FactSet regarding the response to a query. Feedback is used to help us identify areas for improvement in our responses. 
        /// </remarks>
        /// <exception cref="FactSet.SDK.ConversationalAPIPoweredbyFactSetMercury.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="feedbackRequest">ID represents the response ID received from the &#x60;/result&#x60; endpoint. Send this along with a boolean representing whether the response was helpful or not.  If you would like to provide additional natural language feedback, you can also include a string with your comments. Feedback will be accepted for 24 hours after the initial response.  **Note:** Feedback is optional, but we appreciate any input you can provide. </param>
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
        /// Use this endpoint to provide feedback to FactSet regarding the response to a query. Feedback is used to help us identify areas for improvement in our responses. 
        /// </remarks>
        /// <exception cref="FactSet.SDK.ConversationalAPIPoweredbyFactSetMercury.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="feedbackRequest">ID represents the response ID received from the &#x60;/result&#x60; endpoint. Send this along with a boolean representing whether the response was helpful or not.  If you would like to provide additional natural language feedback, you can also include a string with your comments. Feedback will be accepted for 24 hours after the initial response.  **Note:** Feedback is optional, but we appreciate any input you can provide. </param>
        /// <param name="cancellationToken">Cancellation Token to cancel the request.</param>
        /// <returns>Task of void</returns>
        System.Threading.Tasks.Task SendFeedbackAsync(FeedbackRequest feedbackRequest, System.Threading.CancellationToken cancellationToken = default(System.Threading.CancellationToken));

        /// <summary>
        /// Send feedback on the response to a query.
        /// </summary>
        /// <remarks>
        /// Use this endpoint to provide feedback to FactSet regarding the response to a query. Feedback is used to help us identify areas for improvement in our responses. 
        /// </remarks>
        /// <exception cref="FactSet.SDK.ConversationalAPIPoweredbyFactSetMercury.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="feedbackRequest">ID represents the response ID received from the &#x60;/result&#x60; endpoint. Send this along with a boolean representing whether the response was helpful or not.  If you would like to provide additional natural language feedback, you can also include a string with your comments. Feedback will be accepted for 24 hours after the initial response.  **Note:** Feedback is optional, but we appreciate any input you can provide. </param>
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
        /// Send feedback on the response to a query. Use this endpoint to provide feedback to FactSet regarding the response to a query. Feedback is used to help us identify areas for improvement in our responses. 
        /// </summary>
        /// <exception cref="FactSet.SDK.ConversationalAPIPoweredbyFactSetMercury.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="feedbackRequest">ID represents the response ID received from the &#x60;/result&#x60; endpoint. Send this along with a boolean representing whether the response was helpful or not.  If you would like to provide additional natural language feedback, you can also include a string with your comments. Feedback will be accepted for 24 hours after the initial response.  **Note:** Feedback is optional, but we appreciate any input you can provide. </param>
        /// <returns>void</returns>
        public void SendFeedback(FeedbackRequest feedbackRequest)
        {
            SendFeedbackWithHttpInfo(feedbackRequest);
        }

        /// <summary>
        /// Send feedback on the response to a query. Use this endpoint to provide feedback to FactSet regarding the response to a query. Feedback is used to help us identify areas for improvement in our responses. 
        /// </summary>
        /// <exception cref="FactSet.SDK.ConversationalAPIPoweredbyFactSetMercury.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="feedbackRequest">ID represents the response ID received from the &#x60;/result&#x60; endpoint. Send this along with a boolean representing whether the response was helpful or not.  If you would like to provide additional natural language feedback, you can also include a string with your comments. Feedback will be accepted for 24 hours after the initial response.  **Note:** Feedback is optional, but we appreciate any input you can provide. </param>
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
        /// Send feedback on the response to a query. Use this endpoint to provide feedback to FactSet regarding the response to a query. Feedback is used to help us identify areas for improvement in our responses. 
        /// </summary>
        /// <exception cref="FactSet.SDK.ConversationalAPIPoweredbyFactSetMercury.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="feedbackRequest">ID represents the response ID received from the &#x60;/result&#x60; endpoint. Send this along with a boolean representing whether the response was helpful or not.  If you would like to provide additional natural language feedback, you can also include a string with your comments. Feedback will be accepted for 24 hours after the initial response.  **Note:** Feedback is optional, but we appreciate any input you can provide. </param>
        /// <param name="cancellationToken">Cancellation Token to cancel the request.</param>
        /// <returns>Task of void</returns>
        public async System.Threading.Tasks.Task SendFeedbackAsync(FeedbackRequest feedbackRequest, System.Threading.CancellationToken cancellationToken = default(System.Threading.CancellationToken))
        {
            await SendFeedbackWithHttpInfoAsync(feedbackRequest, cancellationToken).ConfigureAwait(false);
        }

        /// <summary>
        /// Send feedback on the response to a query. Use this endpoint to provide feedback to FactSet regarding the response to a query. Feedback is used to help us identify areas for improvement in our responses. 
        /// </summary>
        /// <exception cref="FactSet.SDK.ConversationalAPIPoweredbyFactSetMercury.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="feedbackRequest">ID represents the response ID received from the &#x60;/result&#x60; endpoint. Send this along with a boolean representing whether the response was helpful or not.  If you would like to provide additional natural language feedback, you can also include a string with your comments. Feedback will be accepted for 24 hours after the initial response.  **Note:** Feedback is optional, but we appreciate any input you can provide. </param>
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
