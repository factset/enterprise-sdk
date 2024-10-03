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
    public interface IMultipleQuestionChatApiSync : IApiAccessor
    {
        #region Synchronous Operations
        /// <summary>
        /// Retrieve the completed response for your query.
        /// </summary>
        /// <remarks>
        /// Returns FactSet content and data in response to the query provided to the &#x60;/query&#x60; endpoint. This endpoint is the final step in the query request process. Responses contain a combination of Microsoft Adaptive Cards for data/tables and markdown for text. 
        /// </remarks>
        /// <exception cref="FactSet.SDK.ConversationalAPIPoweredbyFactSetMercury.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="chatPollingRequest">ID representing the chat process for your query</param>
        /// <returns>QueryResponse</returns>
        QueryResponse GetChatResult(ChatPollingRequest chatPollingRequest);

        /// <summary>
        /// Retrieve the completed response for your query.
        /// </summary>
        /// <remarks>
        /// Returns FactSet content and data in response to the query provided to the &#x60;/query&#x60; endpoint. This endpoint is the final step in the query request process. Responses contain a combination of Microsoft Adaptive Cards for data/tables and markdown for text. 
        /// </remarks>
        /// <exception cref="FactSet.SDK.ConversationalAPIPoweredbyFactSetMercury.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="chatPollingRequest">ID representing the chat process for your query</param>
        /// <returns>ApiResponse of QueryResponse</returns>
        ApiResponse<QueryResponse> GetChatResultWithHttpInfo(ChatPollingRequest chatPollingRequest);
        /// <summary>
        /// Retrieve the status of a chat response process.
        /// </summary>
        /// <remarks>
        /// Returns the status of a chat response for a given chat job ID (recevied from the &#x60;/query&#x60; endpoint). Poll the &#x60;/status&#x60; endpoint with your job ID to confirm when your data is ready. Answers may take minutes to generate, depending on the complexity of the query. 
        /// </remarks>
        /// <exception cref="FactSet.SDK.ConversationalAPIPoweredbyFactSetMercury.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="chatPollingRequest">ID representing the chat process for your query</param>
        /// <returns>StatusPollResponse</returns>
        StatusPollResponse GetChatStatus(ChatPollingRequest chatPollingRequest);

        /// <summary>
        /// Retrieve the status of a chat response process.
        /// </summary>
        /// <remarks>
        /// Returns the status of a chat response for a given chat job ID (recevied from the &#x60;/query&#x60; endpoint). Poll the &#x60;/status&#x60; endpoint with your job ID to confirm when your data is ready. Answers may take minutes to generate, depending on the complexity of the query. 
        /// </remarks>
        /// <exception cref="FactSet.SDK.ConversationalAPIPoweredbyFactSetMercury.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="chatPollingRequest">ID representing the chat process for your query</param>
        /// <returns>ApiResponse of StatusPollResponse</returns>
        ApiResponse<StatusPollResponse> GetChatStatusWithHttpInfo(ChatPollingRequest chatPollingRequest);
        /// <summary>
        /// Create a query request for a given natural language query.
        /// </summary>
        /// <remarks>
        /// Returns a job ID for polling the response to a natural language query for financial data as well as a chat ID to continue asking questions in the same conversational context. This endpoint is an interface for initiating responses from FactSet Mercury, our large language model for surfacing FactSet datasets through conversational natural language queries. Use the &#x60;/query&#x60; endpoint to generate responses for questions in or out of a conversational message chain context. Responses contain a job ID, used to request the status and result of the current question, and a chat ID, used to ask further questions in the same conversation message chain. Requests to &#x60;/query&#x60; without a chat ID will initialize a conversation, while requests with a chat ID will continue the conversation in the context of all previous sent and received messages in that conversation. 
        /// </remarks>
        /// <exception cref="FactSet.SDK.ConversationalAPIPoweredbyFactSetMercury.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="queryChatRequest">Natural language query for FactSet data</param>
        /// <returns>QueryChatResponse</returns>
        QueryChatResponse QueryChat(QueryChatRequest queryChatRequest);

        /// <summary>
        /// Create a query request for a given natural language query.
        /// </summary>
        /// <remarks>
        /// Returns a job ID for polling the response to a natural language query for financial data as well as a chat ID to continue asking questions in the same conversational context. This endpoint is an interface for initiating responses from FactSet Mercury, our large language model for surfacing FactSet datasets through conversational natural language queries. Use the &#x60;/query&#x60; endpoint to generate responses for questions in or out of a conversational message chain context. Responses contain a job ID, used to request the status and result of the current question, and a chat ID, used to ask further questions in the same conversation message chain. Requests to &#x60;/query&#x60; without a chat ID will initialize a conversation, while requests with a chat ID will continue the conversation in the context of all previous sent and received messages in that conversation. 
        /// </remarks>
        /// <exception cref="FactSet.SDK.ConversationalAPIPoweredbyFactSetMercury.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="queryChatRequest">Natural language query for FactSet data</param>
        /// <returns>ApiResponse of QueryChatResponse</returns>
        ApiResponse<QueryChatResponse> QueryChatWithHttpInfo(QueryChatRequest queryChatRequest);
        #endregion Synchronous Operations
    }

    /// <summary>
    /// Represents a collection of functions to interact with the API endpoints
    /// </summary>
    public interface IMultipleQuestionChatApiAsync : IApiAccessor
    {
        #region Asynchronous Operations
        /// <summary>
        /// Retrieve the completed response for your query.
        /// </summary>
        /// <remarks>
        /// Returns FactSet content and data in response to the query provided to the &#x60;/query&#x60; endpoint. This endpoint is the final step in the query request process. Responses contain a combination of Microsoft Adaptive Cards for data/tables and markdown for text. 
        /// </remarks>
        /// <exception cref="FactSet.SDK.ConversationalAPIPoweredbyFactSetMercury.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="chatPollingRequest">ID representing the chat process for your query</param>
        /// <param name="cancellationToken">Cancellation Token to cancel the request.</param>
        /// <returns>Task of QueryResponse</returns>
        System.Threading.Tasks.Task<QueryResponse> GetChatResultAsync(ChatPollingRequest chatPollingRequest, System.Threading.CancellationToken cancellationToken = default(System.Threading.CancellationToken));

        /// <summary>
        /// Retrieve the completed response for your query.
        /// </summary>
        /// <remarks>
        /// Returns FactSet content and data in response to the query provided to the &#x60;/query&#x60; endpoint. This endpoint is the final step in the query request process. Responses contain a combination of Microsoft Adaptive Cards for data/tables and markdown for text. 
        /// </remarks>
        /// <exception cref="FactSet.SDK.ConversationalAPIPoweredbyFactSetMercury.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="chatPollingRequest">ID representing the chat process for your query</param>
        /// <param name="cancellationToken">Cancellation Token to cancel the request.</param>
        /// <returns>Task of ApiResponse (QueryResponse)</returns>
        System.Threading.Tasks.Task<ApiResponse<QueryResponse>> GetChatResultWithHttpInfoAsync(ChatPollingRequest chatPollingRequest, System.Threading.CancellationToken cancellationToken = default(System.Threading.CancellationToken));
        /// <summary>
        /// Retrieve the status of a chat response process.
        /// </summary>
        /// <remarks>
        /// Returns the status of a chat response for a given chat job ID (recevied from the &#x60;/query&#x60; endpoint). Poll the &#x60;/status&#x60; endpoint with your job ID to confirm when your data is ready. Answers may take minutes to generate, depending on the complexity of the query. 
        /// </remarks>
        /// <exception cref="FactSet.SDK.ConversationalAPIPoweredbyFactSetMercury.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="chatPollingRequest">ID representing the chat process for your query</param>
        /// <param name="cancellationToken">Cancellation Token to cancel the request.</param>
        /// <returns>Task of StatusPollResponse</returns>
        System.Threading.Tasks.Task<StatusPollResponse> GetChatStatusAsync(ChatPollingRequest chatPollingRequest, System.Threading.CancellationToken cancellationToken = default(System.Threading.CancellationToken));

        /// <summary>
        /// Retrieve the status of a chat response process.
        /// </summary>
        /// <remarks>
        /// Returns the status of a chat response for a given chat job ID (recevied from the &#x60;/query&#x60; endpoint). Poll the &#x60;/status&#x60; endpoint with your job ID to confirm when your data is ready. Answers may take minutes to generate, depending on the complexity of the query. 
        /// </remarks>
        /// <exception cref="FactSet.SDK.ConversationalAPIPoweredbyFactSetMercury.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="chatPollingRequest">ID representing the chat process for your query</param>
        /// <param name="cancellationToken">Cancellation Token to cancel the request.</param>
        /// <returns>Task of ApiResponse (StatusPollResponse)</returns>
        System.Threading.Tasks.Task<ApiResponse<StatusPollResponse>> GetChatStatusWithHttpInfoAsync(ChatPollingRequest chatPollingRequest, System.Threading.CancellationToken cancellationToken = default(System.Threading.CancellationToken));
        /// <summary>
        /// Create a query request for a given natural language query.
        /// </summary>
        /// <remarks>
        /// Returns a job ID for polling the response to a natural language query for financial data as well as a chat ID to continue asking questions in the same conversational context. This endpoint is an interface for initiating responses from FactSet Mercury, our large language model for surfacing FactSet datasets through conversational natural language queries. Use the &#x60;/query&#x60; endpoint to generate responses for questions in or out of a conversational message chain context. Responses contain a job ID, used to request the status and result of the current question, and a chat ID, used to ask further questions in the same conversation message chain. Requests to &#x60;/query&#x60; without a chat ID will initialize a conversation, while requests with a chat ID will continue the conversation in the context of all previous sent and received messages in that conversation. 
        /// </remarks>
        /// <exception cref="FactSet.SDK.ConversationalAPIPoweredbyFactSetMercury.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="queryChatRequest">Natural language query for FactSet data</param>
        /// <param name="cancellationToken">Cancellation Token to cancel the request.</param>
        /// <returns>Task of QueryChatResponse</returns>
        System.Threading.Tasks.Task<QueryChatResponse> QueryChatAsync(QueryChatRequest queryChatRequest, System.Threading.CancellationToken cancellationToken = default(System.Threading.CancellationToken));

        /// <summary>
        /// Create a query request for a given natural language query.
        /// </summary>
        /// <remarks>
        /// Returns a job ID for polling the response to a natural language query for financial data as well as a chat ID to continue asking questions in the same conversational context. This endpoint is an interface for initiating responses from FactSet Mercury, our large language model for surfacing FactSet datasets through conversational natural language queries. Use the &#x60;/query&#x60; endpoint to generate responses for questions in or out of a conversational message chain context. Responses contain a job ID, used to request the status and result of the current question, and a chat ID, used to ask further questions in the same conversation message chain. Requests to &#x60;/query&#x60; without a chat ID will initialize a conversation, while requests with a chat ID will continue the conversation in the context of all previous sent and received messages in that conversation. 
        /// </remarks>
        /// <exception cref="FactSet.SDK.ConversationalAPIPoweredbyFactSetMercury.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="queryChatRequest">Natural language query for FactSet data</param>
        /// <param name="cancellationToken">Cancellation Token to cancel the request.</param>
        /// <returns>Task of ApiResponse (QueryChatResponse)</returns>
        System.Threading.Tasks.Task<ApiResponse<QueryChatResponse>> QueryChatWithHttpInfoAsync(QueryChatRequest queryChatRequest, System.Threading.CancellationToken cancellationToken = default(System.Threading.CancellationToken));
        #endregion Asynchronous Operations
    }

    /// <summary>
    /// Represents a collection of functions to interact with the API endpoints
    /// </summary>
    public interface IMultipleQuestionChatApi : IMultipleQuestionChatApiSync, IMultipleQuestionChatApiAsync
    {

    }

    /// <summary>
    /// Represents a collection of functions to interact with the API endpoints
    /// </summary>
    public partial class MultipleQuestionChatApi : IMultipleQuestionChatApi
    {
        private FactSet.SDK.ConversationalAPIPoweredbyFactSetMercury.Client.ExceptionFactory _exceptionFactory = (name, response) => null;

        # region Response Type Disctionaries
        
        private static readonly Dictionary<HttpStatusCode, System.Type> GetChatResultResponseTypeDictionary = new Dictionary<HttpStatusCode, System.Type>
        {
            { (HttpStatusCode)200, typeof(QueryResponse) },
            { (HttpStatusCode)400, typeof(Error) },
            { (HttpStatusCode)401, typeof(string) },
            { (HttpStatusCode)403, typeof(string) },
            { (HttpStatusCode)405, typeof(string) },
            { (HttpStatusCode)429, typeof(RateLimitExceededError) },
            { (HttpStatusCode)500, typeof(Error) },
        };

        private static readonly Dictionary<HttpStatusCode, System.Type> GetChatStatusResponseTypeDictionary = new Dictionary<HttpStatusCode, System.Type>
        {
            { (HttpStatusCode)201, typeof(StatusPollResponse) },
            { (HttpStatusCode)202, typeof(StatusPollResponse) },
            { (HttpStatusCode)400, typeof(Error) },
            { (HttpStatusCode)401, typeof(string) },
            { (HttpStatusCode)403, typeof(string) },
            { (HttpStatusCode)405, typeof(string) },
            { (HttpStatusCode)429, typeof(RateLimitExceededError) },
            { (HttpStatusCode)500, typeof(Error) },
        };

        private static readonly Dictionary<HttpStatusCode, System.Type> QueryChatResponseTypeDictionary = new Dictionary<HttpStatusCode, System.Type>
        {
            { (HttpStatusCode)202, typeof(QueryChatResponse) },
            { (HttpStatusCode)400, typeof(Error) },
            { (HttpStatusCode)401, typeof(string) },
            { (HttpStatusCode)403, typeof(string) },
            { (HttpStatusCode)405, typeof(string) },
            { (HttpStatusCode)429, typeof(RateLimitExceededError) },
            { (HttpStatusCode)500, typeof(Error) },
        };

        # endregion Response Type Disctionaries

        # region Api Response Objects
        

        # endregion Api Response Objects

        /// <summary>
        /// Initializes a new instance of the <see cref="MultipleQuestionChatApi"/> class.
        /// </summary>
        /// <returns></returns>
        public MultipleQuestionChatApi() : this((string)null)
        {
        }

        /// <summary>
        /// Initializes a new instance of the <see cref="MultipleQuestionChatApi"/> class.
        /// </summary>
        /// <returns></returns>
        public MultipleQuestionChatApi(string basePath)
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
        /// Initializes a new instance of the <see cref="MultipleQuestionChatApi"/> class
        /// using Configuration object
        /// </summary>
        /// <param name="configuration">An instance of Configuration</param>
        /// <returns></returns>
        public MultipleQuestionChatApi(FactSet.SDK.ConversationalAPIPoweredbyFactSetMercury.Client.Configuration configuration)
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
        /// Initializes a new instance of the <see cref="MultipleQuestionChatApi"/> class
        /// using a Configuration object and client instance.
        /// </summary>
        /// <param name="client">The client interface for synchronous API access.</param>
        /// <param name="asyncClient">The client interface for asynchronous API access.</param>
        /// <param name="configuration">The configuration object.</param>
        public MultipleQuestionChatApi(FactSet.SDK.ConversationalAPIPoweredbyFactSetMercury.Client.ISynchronousClient client, FactSet.SDK.ConversationalAPIPoweredbyFactSetMercury.Client.IAsynchronousClient asyncClient, FactSet.SDK.ConversationalAPIPoweredbyFactSetMercury.Client.IReadableConfiguration configuration)
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
        /// Retrieve the completed response for your query. Returns FactSet content and data in response to the query provided to the &#x60;/query&#x60; endpoint. This endpoint is the final step in the query request process. Responses contain a combination of Microsoft Adaptive Cards for data/tables and markdown for text. 
        /// </summary>
        /// <exception cref="FactSet.SDK.ConversationalAPIPoweredbyFactSetMercury.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="chatPollingRequest">ID representing the chat process for your query</param>
        /// <returns>QueryResponse</returns>
        public QueryResponse GetChatResult(ChatPollingRequest chatPollingRequest)
        {
            var localVarResponse = GetChatResultWithHttpInfo(chatPollingRequest);
            return localVarResponse.Data;
        }

        /// <summary>
        /// Retrieve the completed response for your query. Returns FactSet content and data in response to the query provided to the &#x60;/query&#x60; endpoint. This endpoint is the final step in the query request process. Responses contain a combination of Microsoft Adaptive Cards for data/tables and markdown for text. 
        /// </summary>
        /// <exception cref="FactSet.SDK.ConversationalAPIPoweredbyFactSetMercury.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="chatPollingRequest">ID representing the chat process for your query</param>
        /// <returns>ApiResponse of QueryResponse</returns>
        public ApiResponse<QueryResponse> GetChatResultWithHttpInfo(ChatPollingRequest chatPollingRequest)
        {
            // verify the required parameter 'chatPollingRequest' is set
            if (chatPollingRequest == null)
            {
                throw new FactSet.SDK.ConversationalAPIPoweredbyFactSetMercury.Client.ApiException(400, "Missing required parameter 'chatPollingRequest' when calling MultipleQuestionChatApi->GetChatResult");
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

            localVarRequestOptions.Data = chatPollingRequest;

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

            localVarRequestOptions.ResponseTypeDictionary = GetChatResultResponseTypeDictionary;

            // make the HTTP request
            var localVarResponse = this.Client.Post<
            QueryResponse>("/result", localVarRequestOptions, this.Configuration);
            if (this.ExceptionFactory != null)
            {
                Exception _exception = this.ExceptionFactory("GetChatResult", localVarResponse);
                if (_exception != null)
                {
                    throw _exception;
                }
            }
            return localVarResponse;
        }

        /// <summary>
        /// Retrieve the completed response for your query. Returns FactSet content and data in response to the query provided to the &#x60;/query&#x60; endpoint. This endpoint is the final step in the query request process. Responses contain a combination of Microsoft Adaptive Cards for data/tables and markdown for text. 
        /// </summary>
        /// <exception cref="FactSet.SDK.ConversationalAPIPoweredbyFactSetMercury.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="chatPollingRequest">ID representing the chat process for your query</param>
        /// <param name="cancellationToken">Cancellation Token to cancel the request.</param>
        /// <returns>Task of QueryResponse</returns>
        public async System.Threading.Tasks.Task<QueryResponse>GetChatResultAsync(ChatPollingRequest chatPollingRequest, System.Threading.CancellationToken cancellationToken = default(System.Threading.CancellationToken))
        {
            var localVarResponse = await GetChatResultWithHttpInfoAsync(chatPollingRequest, cancellationToken).ConfigureAwait(false);
            return localVarResponse.Data;
        }

        /// <summary>
        /// Retrieve the completed response for your query. Returns FactSet content and data in response to the query provided to the &#x60;/query&#x60; endpoint. This endpoint is the final step in the query request process. Responses contain a combination of Microsoft Adaptive Cards for data/tables and markdown for text. 
        /// </summary>
        /// <exception cref="FactSet.SDK.ConversationalAPIPoweredbyFactSetMercury.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="chatPollingRequest">ID representing the chat process for your query</param>
        /// <param name="cancellationToken">Cancellation Token to cancel the request.</param>
        /// <returns>Task of ApiResponse (QueryResponse)</returns>

        public async System.Threading.Tasks.Task<ApiResponse<QueryResponse>> GetChatResultWithHttpInfoAsync(ChatPollingRequest chatPollingRequest, System.Threading.CancellationToken cancellationToken = default(System.Threading.CancellationToken))
        {
            // verify the required parameter 'chatPollingRequest' is set
            if (chatPollingRequest == null)
            {
                throw new FactSet.SDK.ConversationalAPIPoweredbyFactSetMercury.Client.ApiException(400, "Missing required parameter 'chatPollingRequest' when calling MultipleQuestionChatApi->GetChatResult");
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

            localVarRequestOptions.Data = chatPollingRequest;

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


            localVarRequestOptions.ResponseTypeDictionary = GetChatResultResponseTypeDictionary;

            // make the HTTP request
            var localVarResponse = await this.AsynchronousClient.PostAsync<QueryResponse>("/result", localVarRequestOptions, this.Configuration, cancellationToken).ConfigureAwait(false);

            if (this.ExceptionFactory != null)
            {
                Exception _exception = this.ExceptionFactory("GetChatResult", localVarResponse);
                if (_exception != null)
                {
                    throw _exception;
                }
            }

            return localVarResponse;
        }

        /// <summary>
        /// Retrieve the status of a chat response process. Returns the status of a chat response for a given chat job ID (recevied from the &#x60;/query&#x60; endpoint). Poll the &#x60;/status&#x60; endpoint with your job ID to confirm when your data is ready. Answers may take minutes to generate, depending on the complexity of the query. 
        /// </summary>
        /// <exception cref="FactSet.SDK.ConversationalAPIPoweredbyFactSetMercury.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="chatPollingRequest">ID representing the chat process for your query</param>
        /// <returns>StatusPollResponse</returns>
        public StatusPollResponse GetChatStatus(ChatPollingRequest chatPollingRequest)
        {
            var localVarResponse = GetChatStatusWithHttpInfo(chatPollingRequest);
            return localVarResponse.Data;
        }

        /// <summary>
        /// Retrieve the status of a chat response process. Returns the status of a chat response for a given chat job ID (recevied from the &#x60;/query&#x60; endpoint). Poll the &#x60;/status&#x60; endpoint with your job ID to confirm when your data is ready. Answers may take minutes to generate, depending on the complexity of the query. 
        /// </summary>
        /// <exception cref="FactSet.SDK.ConversationalAPIPoweredbyFactSetMercury.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="chatPollingRequest">ID representing the chat process for your query</param>
        /// <returns>ApiResponse of StatusPollResponse</returns>
        public ApiResponse<StatusPollResponse> GetChatStatusWithHttpInfo(ChatPollingRequest chatPollingRequest)
        {
            // verify the required parameter 'chatPollingRequest' is set
            if (chatPollingRequest == null)
            {
                throw new FactSet.SDK.ConversationalAPIPoweredbyFactSetMercury.Client.ApiException(400, "Missing required parameter 'chatPollingRequest' when calling MultipleQuestionChatApi->GetChatStatus");
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

            localVarRequestOptions.Data = chatPollingRequest;

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

            localVarRequestOptions.ResponseTypeDictionary = GetChatStatusResponseTypeDictionary;

            // make the HTTP request
            var localVarResponse = this.Client.Post<
            StatusPollResponse>("/status", localVarRequestOptions, this.Configuration);
            if (this.ExceptionFactory != null)
            {
                Exception _exception = this.ExceptionFactory("GetChatStatus", localVarResponse);
                if (_exception != null)
                {
                    throw _exception;
                }
            }
            return localVarResponse;
        }

        /// <summary>
        /// Retrieve the status of a chat response process. Returns the status of a chat response for a given chat job ID (recevied from the &#x60;/query&#x60; endpoint). Poll the &#x60;/status&#x60; endpoint with your job ID to confirm when your data is ready. Answers may take minutes to generate, depending on the complexity of the query. 
        /// </summary>
        /// <exception cref="FactSet.SDK.ConversationalAPIPoweredbyFactSetMercury.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="chatPollingRequest">ID representing the chat process for your query</param>
        /// <param name="cancellationToken">Cancellation Token to cancel the request.</param>
        /// <returns>Task of StatusPollResponse</returns>
        public async System.Threading.Tasks.Task<StatusPollResponse>GetChatStatusAsync(ChatPollingRequest chatPollingRequest, System.Threading.CancellationToken cancellationToken = default(System.Threading.CancellationToken))
        {
            var localVarResponse = await GetChatStatusWithHttpInfoAsync(chatPollingRequest, cancellationToken).ConfigureAwait(false);
            return localVarResponse.Data;
        }

        /// <summary>
        /// Retrieve the status of a chat response process. Returns the status of a chat response for a given chat job ID (recevied from the &#x60;/query&#x60; endpoint). Poll the &#x60;/status&#x60; endpoint with your job ID to confirm when your data is ready. Answers may take minutes to generate, depending on the complexity of the query. 
        /// </summary>
        /// <exception cref="FactSet.SDK.ConversationalAPIPoweredbyFactSetMercury.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="chatPollingRequest">ID representing the chat process for your query</param>
        /// <param name="cancellationToken">Cancellation Token to cancel the request.</param>
        /// <returns>Task of ApiResponse (StatusPollResponse)</returns>

        public async System.Threading.Tasks.Task<ApiResponse<StatusPollResponse>> GetChatStatusWithHttpInfoAsync(ChatPollingRequest chatPollingRequest, System.Threading.CancellationToken cancellationToken = default(System.Threading.CancellationToken))
        {
            // verify the required parameter 'chatPollingRequest' is set
            if (chatPollingRequest == null)
            {
                throw new FactSet.SDK.ConversationalAPIPoweredbyFactSetMercury.Client.ApiException(400, "Missing required parameter 'chatPollingRequest' when calling MultipleQuestionChatApi->GetChatStatus");
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

            localVarRequestOptions.Data = chatPollingRequest;

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


            localVarRequestOptions.ResponseTypeDictionary = GetChatStatusResponseTypeDictionary;

            // make the HTTP request
            var localVarResponse = await this.AsynchronousClient.PostAsync<StatusPollResponse>("/status", localVarRequestOptions, this.Configuration, cancellationToken).ConfigureAwait(false);

            if (this.ExceptionFactory != null)
            {
                Exception _exception = this.ExceptionFactory("GetChatStatus", localVarResponse);
                if (_exception != null)
                {
                    throw _exception;
                }
            }

            return localVarResponse;
        }

        /// <summary>
        /// Create a query request for a given natural language query. Returns a job ID for polling the response to a natural language query for financial data as well as a chat ID to continue asking questions in the same conversational context. This endpoint is an interface for initiating responses from FactSet Mercury, our large language model for surfacing FactSet datasets through conversational natural language queries. Use the &#x60;/query&#x60; endpoint to generate responses for questions in or out of a conversational message chain context. Responses contain a job ID, used to request the status and result of the current question, and a chat ID, used to ask further questions in the same conversation message chain. Requests to &#x60;/query&#x60; without a chat ID will initialize a conversation, while requests with a chat ID will continue the conversation in the context of all previous sent and received messages in that conversation. 
        /// </summary>
        /// <exception cref="FactSet.SDK.ConversationalAPIPoweredbyFactSetMercury.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="queryChatRequest">Natural language query for FactSet data</param>
        /// <returns>QueryChatResponse</returns>
        public QueryChatResponse QueryChat(QueryChatRequest queryChatRequest)
        {
            var localVarResponse = QueryChatWithHttpInfo(queryChatRequest);
            return localVarResponse.Data;
        }

        /// <summary>
        /// Create a query request for a given natural language query. Returns a job ID for polling the response to a natural language query for financial data as well as a chat ID to continue asking questions in the same conversational context. This endpoint is an interface for initiating responses from FactSet Mercury, our large language model for surfacing FactSet datasets through conversational natural language queries. Use the &#x60;/query&#x60; endpoint to generate responses for questions in or out of a conversational message chain context. Responses contain a job ID, used to request the status and result of the current question, and a chat ID, used to ask further questions in the same conversation message chain. Requests to &#x60;/query&#x60; without a chat ID will initialize a conversation, while requests with a chat ID will continue the conversation in the context of all previous sent and received messages in that conversation. 
        /// </summary>
        /// <exception cref="FactSet.SDK.ConversationalAPIPoweredbyFactSetMercury.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="queryChatRequest">Natural language query for FactSet data</param>
        /// <returns>ApiResponse of QueryChatResponse</returns>
        public ApiResponse<QueryChatResponse> QueryChatWithHttpInfo(QueryChatRequest queryChatRequest)
        {
            // verify the required parameter 'queryChatRequest' is set
            if (queryChatRequest == null)
            {
                throw new FactSet.SDK.ConversationalAPIPoweredbyFactSetMercury.Client.ApiException(400, "Missing required parameter 'queryChatRequest' when calling MultipleQuestionChatApi->QueryChat");
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

            localVarRequestOptions.Data = queryChatRequest;

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

            localVarRequestOptions.ResponseTypeDictionary = QueryChatResponseTypeDictionary;

            // make the HTTP request
            var localVarResponse = this.Client.Post<
            QueryChatResponse>("/query", localVarRequestOptions, this.Configuration);
            if (this.ExceptionFactory != null)
            {
                Exception _exception = this.ExceptionFactory("QueryChat", localVarResponse);
                if (_exception != null)
                {
                    throw _exception;
                }
            }
            return localVarResponse;
        }

        /// <summary>
        /// Create a query request for a given natural language query. Returns a job ID for polling the response to a natural language query for financial data as well as a chat ID to continue asking questions in the same conversational context. This endpoint is an interface for initiating responses from FactSet Mercury, our large language model for surfacing FactSet datasets through conversational natural language queries. Use the &#x60;/query&#x60; endpoint to generate responses for questions in or out of a conversational message chain context. Responses contain a job ID, used to request the status and result of the current question, and a chat ID, used to ask further questions in the same conversation message chain. Requests to &#x60;/query&#x60; without a chat ID will initialize a conversation, while requests with a chat ID will continue the conversation in the context of all previous sent and received messages in that conversation. 
        /// </summary>
        /// <exception cref="FactSet.SDK.ConversationalAPIPoweredbyFactSetMercury.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="queryChatRequest">Natural language query for FactSet data</param>
        /// <param name="cancellationToken">Cancellation Token to cancel the request.</param>
        /// <returns>Task of QueryChatResponse</returns>
        public async System.Threading.Tasks.Task<QueryChatResponse>QueryChatAsync(QueryChatRequest queryChatRequest, System.Threading.CancellationToken cancellationToken = default(System.Threading.CancellationToken))
        {
            var localVarResponse = await QueryChatWithHttpInfoAsync(queryChatRequest, cancellationToken).ConfigureAwait(false);
            return localVarResponse.Data;
        }

        /// <summary>
        /// Create a query request for a given natural language query. Returns a job ID for polling the response to a natural language query for financial data as well as a chat ID to continue asking questions in the same conversational context. This endpoint is an interface for initiating responses from FactSet Mercury, our large language model for surfacing FactSet datasets through conversational natural language queries. Use the &#x60;/query&#x60; endpoint to generate responses for questions in or out of a conversational message chain context. Responses contain a job ID, used to request the status and result of the current question, and a chat ID, used to ask further questions in the same conversation message chain. Requests to &#x60;/query&#x60; without a chat ID will initialize a conversation, while requests with a chat ID will continue the conversation in the context of all previous sent and received messages in that conversation. 
        /// </summary>
        /// <exception cref="FactSet.SDK.ConversationalAPIPoweredbyFactSetMercury.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="queryChatRequest">Natural language query for FactSet data</param>
        /// <param name="cancellationToken">Cancellation Token to cancel the request.</param>
        /// <returns>Task of ApiResponse (QueryChatResponse)</returns>

        public async System.Threading.Tasks.Task<ApiResponse<QueryChatResponse>> QueryChatWithHttpInfoAsync(QueryChatRequest queryChatRequest, System.Threading.CancellationToken cancellationToken = default(System.Threading.CancellationToken))
        {
            // verify the required parameter 'queryChatRequest' is set
            if (queryChatRequest == null)
            {
                throw new FactSet.SDK.ConversationalAPIPoweredbyFactSetMercury.Client.ApiException(400, "Missing required parameter 'queryChatRequest' when calling MultipleQuestionChatApi->QueryChat");
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

            localVarRequestOptions.Data = queryChatRequest;

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


            localVarRequestOptions.ResponseTypeDictionary = QueryChatResponseTypeDictionary;

            // make the HTTP request
            var localVarResponse = await this.AsynchronousClient.PostAsync<QueryChatResponse>("/query", localVarRequestOptions, this.Configuration, cancellationToken).ConfigureAwait(false);

            if (this.ExceptionFactory != null)
            {
                Exception _exception = this.ExceptionFactory("QueryChat", localVarResponse);
                if (_exception != null)
                {
                    throw _exception;
                }
            }

            return localVarResponse;
        }

    }
}
