/**
 * Conversational API Powered by FactSet Mercury
 * ### OVERVIEW  The FactSet Conversational API allows clients to white-label core FactSet Mercury capabilities in a client's chatbot experience.  The Conversational API is powered by FactSet Mercury, FactSet's Generative Artificial Intelligence (GenAI) large language model. The Conversational API provides a variety of content and capabilities, including FactSet’s Federation layer (FactSet’s core GenAI-based technology), as well as more specific content and functionality tailored for financial services workflows.  The Conversational API provides answers to hundreds of natural language search queries and allows you to easily ask questions related to companies and markets research.  Some example supported prompts:  - Nintendo's highest closing stock price over the last 3 months - Has Yelp issued any guidance? - What are the key trends impacting costs for DaVita?  **For Information on Access to and Content Available via the Conversational API**  Please see the [Conversational API Online Assistant Page](https://my.apps.factset.com/oa/pages/23209). Here you can find instructions on how to set up access to the Conversational API, and the full list of content available.  **Conversational API Consumer Workflow**  The Conversational API is an asynchronous API that utilizes status polling to inform the consumer when a query response is complete. Please see the technical OpenAPI documentation below for specific information regarding consuming the API programmatically.  At a high level, the API consumer workflow is as follows:  1) Send a natural language query to the `/query` endpoint and start the response generation process. 2) Poll the status of the response generation process using the `/status` endpoint. 3) Once the status indicates a ready response, retrieve it using the `/result` endpoint.  - If your response contains a file ID, such as for an Excel chart or a [FactSet ActiveGraph](https://my.apps.factset.com/oa/pages/20355), retrieve it using the file ID at the `/download/file` endpoint. - To provide feedback on your response and help the Conversational API better serve you content, we encourage you to use the `/feedback` endpoint.   **FAQ and Limitations**  - \"Natural language\" in this documentation refers to modern conversational English. Support for other languages is currently unavailable. - The Conversational API is currently limited to accept 10 natural language queries per minute and 200 per hour for an individual consumer. If you anticipate your needs to be greater than these limits, please reach out to FatSet Support. 
 *
 * The version of the OpenAPI document: 1.0.2
 * Contact: api@factset.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 *
 */

import ApiClient from '../ApiClient';
import StatusPollResponseData from './StatusPollResponseData';

/**
 * The StatusPollResponse model module.
 * @module model/StatusPollResponse
 */
class StatusPollResponse {
    /**
     * Constructs a new <code>StatusPollResponse</code>.
     * Response from &#x60;/status&#x60; containing the job ID and status of chat processing
     * @alias module:model/StatusPollResponse
     * @param data {module:model/StatusPollResponseData} 
     */
    constructor(data) { 
        
        StatusPollResponse.initialize(this, data);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj, data) { 
        obj['data'] = data;
    }

    /**
     * Constructs a <code>StatusPollResponse</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/StatusPollResponse} obj Optional instance to populate.
     * @return {module:model/StatusPollResponse} The populated <code>StatusPollResponse</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new StatusPollResponse();

            if (data.hasOwnProperty('data')) {
                obj['data'] = StatusPollResponseData.constructFromObject(data['data']);
            }
        }
        return obj;
    }


}

/**
 * @member {module:model/StatusPollResponseData} data
 */
StatusPollResponse.prototype['data'] = undefined;






export default StatusPollResponse;

