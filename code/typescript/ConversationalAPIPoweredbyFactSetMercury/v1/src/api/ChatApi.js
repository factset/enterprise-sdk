/**
 * Conversational API Powered by FactSet Mercury
 * ### OVERVIEW  The FactSet Conversational API allows clients to white-label core FactSet Mercury capabilities in a client's chatbot experience.  The Conversational API is powered by FactSet Mercury, FactSet's Generative Artificial Intelligence (GenAI) large language model. The Conversational API provides a variety of content and capabilities, including FactSet’s Federation layer (FactSet’s core GenAI-based technology), as well as more specific content and functionality tailored for financial services workflows.  The Conversational API provides answers to hundreds of natural language search queries and allows you to easily ask questions related to companies and markets research.  Some example supported prompts:  - Nintendo's highest closing stock price over the last 3 months - Has Yelp issued any guidance? - What are the key trends impacting costs for DaVita?  **For Information on Access to and Content Available via the Conversational API**  Please see the [Conversational API Online Assistant Page](https://my.apps.factset.com/oa/pages/23209). Here you can find instructions on how to set up access to the Conversational API, and the full list of content available.  #### Conversational API Consumer Workflow  The Conversational API is an asynchronous API that utilizes status polling to inform the consumer when a query response is complete. Please see the technical OpenAPI documentation below for specific information regarding consuming the API programmatically.  At a high level, the API consumer workflow is as follows:  1) Send a natural language query to the `/query` endpoint and start the response generation process. 2) Poll the status of the response generation process using the `/status` endpoint. 3) Once the status indicates a ready response, retrieve it using the `/result` endpoint.  - If your response contains a file ID, such as for an Excel chart or a [FactSet ActiveGraph](https://my.apps.factset.com/oa/pages/20355), retrieve it using the file ID at the `/download/file` endpoint. - To provide feedback on your response and help the Conversational API better serve you content, we encourage you to use the `/feedback` endpoint.   ##### Current Limitations  - \"Natural language\" in this documentation refers to modern conversational English. Support for other languages is currently unavailable. - The Conversational API is currently limited to accept 10 natural language queries per minute and 200 per hour for an individual consumer. If you anticipate your needs to be greater than these limits, please reach out to FatSet Support.  #### FAQ   **How can I receive updates on changes to the Conversational API?** - Please subscribe to our FactSet Notify by clicking \"Subscribe to notifications\" in the upper right above the API overview. You will receive email updates when any updates occur to the API. **Why am I receiving a 403 error with a valid API key?** - Please ensure that your current public IP is within the IP range allocated to the API key you are using to authenticate API requests. You can update your API key's allowable IP range via the [FactSet Developer Portal API Authentication page](https://developer.factset.com/api-authentication). If this does not resolve the issue, please reach out to FactSet Support to ensure you are appropriately authorized to access the Conversational API. 
 *
 * The version of the OpenAPI document: 1.0.3
 * Contact: api@factset.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 *
 */


import ApiClient from "../ApiClient";
import BadRequestError from '../model/BadRequestError';
import BadRequestErrorWithInvalidDataSchema from '../model/BadRequestErrorWithInvalidDataSchema';
import ChatPollingRequest from '../model/ChatPollingRequest';
import ForbiddenError from '../model/ForbiddenError';
import InternalServerError from '../model/InternalServerError';
import QueryChatRequest from '../model/QueryChatRequest';
import QueryChatResponse from '../model/QueryChatResponse';
import QueryResponse from '../model/QueryResponse';
import ResourceNotFoundError from '../model/ResourceNotFoundError';
import StatusPollResponse from '../model/StatusPollResponse';

/**
* Chat service.
* @module api/ChatApi
*/
export default class ChatApi {

    /**
    * Constructs a new ChatApi. 
    * @alias module:api/ChatApi
    * @class
    * @param {module:ApiClient} [apiClient] Optional API client implementation to use,
    * default to {@link module:ApiClient#instance} if unspecified.
    */
    constructor(apiClient) {
        this.apiClient = apiClient || ApiClient.instance;
    }



    /**
     * Retrieve the completed response for your query
     * Use this endpoint to retrieve the results of your query to FactSet Mercury. This endpoint is the final step in the query polling process. Once the status for your jobId is `created`, you can retrieve the query response using this `/result` endpoint.  The response will contain the natural language answer to your query, supporting data and content that FactSet Mercury has surfaced, and suggestions for further engagement with FactSet Mercury.   Data and content will be returned using various defined and standard formats, such as markdown and Microsoft Adaptive Cards. Please see the examples and data schemas associated with the `/result` endpoint for details.  **Please note:** The ID contained in the response represents the ID for the response itself, it does not match the chatId or jobId. Please use this response ID at the `/feedback` endpoint to provide feedback on the response. 
     * @param {module:model/ChatPollingRequest} chatPollingRequest Polling request body, containing the job ID for your response generation process
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with an object containing data of type {@link module:model/QueryResponse} and HTTP response
     */
    getChatResultWithHttpInfo(chatPollingRequest) {
      let postBody = chatPollingRequest;
      // verify the required parameter 'chatPollingRequest' is set
      if (chatPollingRequest === undefined || chatPollingRequest === null) {
        throw new Error("Missing the required parameter 'chatPollingRequest' when calling getChatResult");
      }

      let pathParams = {
      };
      let queryParams = {
      };
      let headerParams = {
      };
      let formParams = {
      };

      let authNames = ['FactSetApiKey', 'FactSetOAuth2'];
      let contentTypes = ['application/json'];
      let accepts = ['application/json', 'text/plain'];


      let returnType = QueryResponse;

      return this.apiClient.callApi(
        '/result', 'POST',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, null
      );
    }

    /**
     * Retrieve the completed response for your query
     * Use this endpoint to retrieve the results of your query to FactSet Mercury. This endpoint is the final step in the query polling process. Once the status for your jobId is `created`, you can retrieve the query response using this `/result` endpoint.  The response will contain the natural language answer to your query, supporting data and content that FactSet Mercury has surfaced, and suggestions for further engagement with FactSet Mercury.   Data and content will be returned using various defined and standard formats, such as markdown and Microsoft Adaptive Cards. Please see the examples and data schemas associated with the `/result` endpoint for details.  **Please note:** The ID contained in the response represents the ID for the response itself, it does not match the chatId or jobId. Please use this response ID at the `/feedback` endpoint to provide feedback on the response. 
     * @param {module:model/ChatPollingRequest} chatPollingRequest Polling request body, containing the job ID for your response generation process
     * @return { Promise.< module:model/QueryResponse > } a Promise, with data of type {@link module:model/QueryResponse }
     */
    getChatResult(chatPollingRequest) {
      return this.getChatResultWithHttpInfo(chatPollingRequest)
        .then(function(response_and_data) {
          return response_and_data.data;
        });
    }


    /**
     * Retrieve the status of a chat response generation process
     * Use this endpoint to retrieve the status of a chat response for a given chat job ID (received from the `/query` endpoint). Poll the `/status` endpoint with your job ID to confirm when your data is ready.  Answers may take minutes to generate, depending on the complexity of the query.  Returns a 202 status code if the response is still processing, and a 201 status code if the response is ready. 
     * @param {module:model/ChatPollingRequest} chatPollingRequest Polling request body, containing the job ID for your response generation process
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with an object containing data of type {@link module:model/StatusPollResponse} and HTTP response
     */
    getChatStatusWithHttpInfo(chatPollingRequest) {
      let postBody = chatPollingRequest;
      // verify the required parameter 'chatPollingRequest' is set
      if (chatPollingRequest === undefined || chatPollingRequest === null) {
        throw new Error("Missing the required parameter 'chatPollingRequest' when calling getChatStatus");
      }

      let pathParams = {
      };
      let queryParams = {
      };
      let headerParams = {
      };
      let formParams = {
      };

      let authNames = ['FactSetApiKey', 'FactSetOAuth2'];
      let contentTypes = ['application/json'];
      let accepts = ['application/json', 'text/plain'];


      let returnType = StatusPollResponse;

      return this.apiClient.callApi(
        '/status', 'POST',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, null
      );
    }

    /**
     * Retrieve the status of a chat response generation process
     * Use this endpoint to retrieve the status of a chat response for a given chat job ID (received from the `/query` endpoint). Poll the `/status` endpoint with your job ID to confirm when your data is ready.  Answers may take minutes to generate, depending on the complexity of the query.  Returns a 202 status code if the response is still processing, and a 201 status code if the response is ready. 
     * @param {module:model/ChatPollingRequest} chatPollingRequest Polling request body, containing the job ID for your response generation process
     * @return { Promise.< module:model/StatusPollResponse > } a Promise, with data of type {@link module:model/StatusPollResponse }
     */
    getChatStatus(chatPollingRequest) {
      return this.getChatStatusWithHttpInfo(chatPollingRequest)
        .then(function(response_and_data) {
          return response_and_data.data;
        });
    }


    /**
     * Send a natural language query to FactSet Mercury
     * Use this endpoint to send a natural language query to FactSet Mercury, our large language model for surfacing FactSet datasets through conversational natural language queries. A request to `/query` will initiate the response generation process for the given query. Queries can be sent as standalone questions or as part of a conversational message chain, using a chat ID to maintain context.  Responses from `/query` contain the following: * **jobId**: used in subsequent endpoints to poll the status of response generation and retrieve the response from FactSet Mercury. * **chatId**: optionally used to ask further questions in the same conversational message chain.  Please see the [Conversational API Online Assistant page](https://my.apps.factset.com/oa/pages/23209) for details around available content and types of questions the Conversational API can answer. 
     * @param {module:model/QueryChatRequest} queryChatRequest Request body to the `/query` endpoint, containing the natural language query to be sent to FactSet Mercury and an optional chat ID for continuing an ongoing conversation.
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with an object containing data of type {@link module:model/QueryChatResponse} and HTTP response
     */
    sendQueryWithHttpInfo(queryChatRequest) {
      let postBody = queryChatRequest;
      // verify the required parameter 'queryChatRequest' is set
      if (queryChatRequest === undefined || queryChatRequest === null) {
        throw new Error("Missing the required parameter 'queryChatRequest' when calling sendQuery");
      }

      let pathParams = {
      };
      let queryParams = {
      };
      let headerParams = {
      };
      let formParams = {
      };

      let authNames = ['FactSetApiKey', 'FactSetOAuth2'];
      let contentTypes = ['application/json'];
      let accepts = ['application/json', 'text/plain'];


      let returnType = QueryChatResponse;

      return this.apiClient.callApi(
        '/query', 'POST',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, null
      );
    }

    /**
     * Send a natural language query to FactSet Mercury
     * Use this endpoint to send a natural language query to FactSet Mercury, our large language model for surfacing FactSet datasets through conversational natural language queries. A request to `/query` will initiate the response generation process for the given query. Queries can be sent as standalone questions or as part of a conversational message chain, using a chat ID to maintain context.  Responses from `/query` contain the following: * **jobId**: used in subsequent endpoints to poll the status of response generation and retrieve the response from FactSet Mercury. * **chatId**: optionally used to ask further questions in the same conversational message chain.  Please see the [Conversational API Online Assistant page](https://my.apps.factset.com/oa/pages/23209) for details around available content and types of questions the Conversational API can answer. 
     * @param {module:model/QueryChatRequest} queryChatRequest Request body to the `/query` endpoint, containing the natural language query to be sent to FactSet Mercury and an optional chat ID for continuing an ongoing conversation.
     * @return { Promise.< module:model/QueryChatResponse > } a Promise, with data of type {@link module:model/QueryChatResponse }
     */
    sendQuery(queryChatRequest) {
      return this.sendQueryWithHttpInfo(queryChatRequest)
        .then(function(response_and_data) {
          return response_and_data.data;
        });
    }


}





