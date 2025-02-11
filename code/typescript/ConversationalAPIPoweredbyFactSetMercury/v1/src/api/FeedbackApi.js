/**
 * Conversational API Powered by FactSet Mercury
 * ### OVERVIEW  The FactSet Conversational API allows clients to integrate core FactSet Mercury capabilities in chatbot experiences.  The Conversational API is powered by FactSet Mercury, FactSet's Generative Artificial Intelligence (GenAI) large language model. The Conversational API provides a variety of content and capabilities, including FactSet’s Federation layer (FactSet’s core GenAI-based technology), as well as more specific content and functionality tailored for financial services workflows.  The Conversational API provides answers to hundreds of natural language search queries and allows you to easily ask questions related to companies and markets research.  Some example supported prompts:  - Nintendo's highest closing stock price over the last 3 months - Has Yelp issued any guidance? - What are the key trends impacting costs for DaVita?  **For Information on Access to and Content Available via the Conversational API**  Please see the [Conversational API Online Assistant Page](https://my.apps.factset.com/oa/pages/23209). Here you can find instructions on how to set up access to the Conversational API, and the full list of content available.  #### Conversational API Consumer Workflow  The Conversational API is an asynchronous API that utilizes status polling to inform the consumer when a query response is complete. Please see the technical OpenAPI documentation below for specific information regarding consuming the API programmatically.  At a high level, the API consumer workflow is as follows:  1) Send a natural language query to the `/query` endpoint and start the response generation process. 2) Poll the status of the response generation process using the `/status` endpoint. 3) Once the status indicates a ready response, retrieve it using the `/result` endpoint.  - If your response contains a file ID, such as for an Excel chart or a [FactSet ActiveGraph](https://my.apps.factset.com/oa/pages/20355), retrieve it using the file ID at the `/download/file` endpoint. - To provide feedback on your response and help the Conversational API better serve you content, we encourage you to use the `/feedback` endpoint.   #### Receive updates on changes to the Conversational API Subscribe to our FactSet Notify by clicking \"Subscribe to notifications\" in the upper right above the API overview. You will receive email updates when any updates occur to the API  #### FAQ & Troubleshooting Please find FAQs and troubleshooting tips in the [FAQs section](https://my.apps.factset.com/oa/pages/23440) of the Conversational API OA page  ##### Current Limitations  - \"Natural language\" in this documentation refers to modern conversational English. Support for other languages is currently unavailable. - The Conversational API is currently limited to accept 10 natural language queries per minute and 200 per hour for an individual consumer. If you anticipate your needs to be greater than these limits, please reach out to FactSet Support. 
 *
 * The version of the OpenAPI document: 1.0.8
 * Contact: api@factset.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 *
 */


import ApiClient from "../ApiClient";
import BadFeedbackRequestError from '../model/BadFeedbackRequestError';
import FeedbackRequest from '../model/FeedbackRequest';
import ForbiddenError from '../model/ForbiddenError';
import InternalServerError from '../model/InternalServerError';

/**
* Feedback service.
* @module api/FeedbackApi
*/
export default class FeedbackApi {

    /**
    * Constructs a new FeedbackApi. 
    * @alias module:api/FeedbackApi
    * @class
    * @param {module:ApiClient} [apiClient] Optional API client implementation to use,
    * default to {@link module:ApiClient#instance} if unspecified.
    */
    constructor(apiClient) {
        this.apiClient = apiClient || ApiClient.instance;
    }



    /**
     * Send feedback on the response to a query.
     * Use this endpoint to provide feedback to FactSet regarding the response to a query. Feedback is used to help us identify areas for improvement in our responses.  Feedback will only be accepted within 24 hours of the original response, and only once for each response ID. If you would like to provide additional feedback, please reach out to your FactSet Support Team representative. 
     * @param {module:model/FeedbackRequest} feedbackRequest Body containing the ID of the response from FactSet Mercury as well as the feedback on that response.  The responseId field must be populated with the ID received from the `/result` endpoint. Send this along with a boolean representing whether the response was helpful or not. 
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with an object containing HTTP response
     */
    sendFeedbackWithHttpInfo(feedbackRequest) {
      let postBody = feedbackRequest;
      // verify the required parameter 'feedbackRequest' is set
      if (feedbackRequest === undefined || feedbackRequest === null) {
        throw new Error("Missing the required parameter 'feedbackRequest' when calling sendFeedback");
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


      let returnType = null;

      return this.apiClient.callApi(
        '/feedback', 'POST',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, null
      );
    }

    /**
     * Send feedback on the response to a query.
     * Use this endpoint to provide feedback to FactSet regarding the response to a query. Feedback is used to help us identify areas for improvement in our responses.  Feedback will only be accepted within 24 hours of the original response, and only once for each response ID. If you would like to provide additional feedback, please reach out to your FactSet Support Team representative. 
     * @param {module:model/FeedbackRequest} feedbackRequest Body containing the ID of the response from FactSet Mercury as well as the feedback on that response.  The responseId field must be populated with the ID received from the `/result` endpoint. Send this along with a boolean representing whether the response was helpful or not. 
     * @return { Promise } a Promise
     */
    sendFeedback(feedbackRequest) {
      return this.sendFeedbackWithHttpInfo(feedbackRequest)
        .then(function(response_and_data) {
          return response_and_data.data;
        });
    }


}





