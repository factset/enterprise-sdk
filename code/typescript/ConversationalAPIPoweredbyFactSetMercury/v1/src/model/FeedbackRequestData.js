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

import ApiClient from '../ApiClient';

/**
 * The FeedbackRequestData model module.
 * @module model/FeedbackRequestData
 */
class FeedbackRequestData {
    /**
     * Constructs a new <code>FeedbackRequestData</code>.
     * Data object
     * @alias module:model/FeedbackRequestData
     * @param responseId {String} Response ID received from the `/result` endpoint, representing the response for which you are providing feedback.
     * @param helpful {Boolean} Boolean representing whether the response was helpful (true) or not helpful (false). If the response left out any requested information, please mark as not helpful.
     */
    constructor(responseId, helpful) { 
        
        FeedbackRequestData.initialize(this, responseId, helpful);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj, responseId, helpful) { 
        obj['responseId'] = responseId;
        obj['helpful'] = helpful;
    }

    /**
     * Constructs a <code>FeedbackRequestData</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/FeedbackRequestData} obj Optional instance to populate.
     * @return {module:model/FeedbackRequestData} The populated <code>FeedbackRequestData</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new FeedbackRequestData();

            if (data.hasOwnProperty('responseId')) {
                obj['responseId'] = ApiClient.convertToType(data['responseId'], 'String');
            }
            if (data.hasOwnProperty('helpful')) {
                obj['helpful'] = ApiClient.convertToType(data['helpful'], 'Boolean');
            }
            if (data.hasOwnProperty('comment')) {
                obj['comment'] = ApiClient.convertToType(data['comment'], 'String');
            }
        }
        return obj;
    }


}

/**
 * Response ID received from the `/result` endpoint, representing the response for which you are providing feedback.
 * @member {String} responseId
 */
FeedbackRequestData.prototype['responseId'] = undefined;

/**
 * Boolean representing whether the response was helpful (true) or not helpful (false). If the response left out any requested information, please mark as not helpful.
 * @member {Boolean} helpful
 */
FeedbackRequestData.prototype['helpful'] = undefined;

/**
 * Optional field for additional feedback. If you would like to provide natural language feedback, include comments here. Comments are limited to 4000 characters; if you need to provide more feedback, please reach out to your FactSet Support Team representative. 
 * @member {String} comment
 */
FeedbackRequestData.prototype['comment'] = undefined;






export default FeedbackRequestData;

