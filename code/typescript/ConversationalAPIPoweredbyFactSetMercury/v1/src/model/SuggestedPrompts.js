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
import PromptItem from './PromptItem';

/**
 * The SuggestedPrompts model module.
 * @module model/SuggestedPrompts
 */
class SuggestedPrompts {
    /**
     * Constructs a new <code>SuggestedPrompts</code>.
     * A list of follow-up prompts generated by FactSet Mercury that may be relevant to the current user prompt. These prompts can be used to guide the user to ask more specific questions or to provide additional context to the user.  SuggestedPrompts may include a FactSet Mercury generated template and prompt parameters to create a new prompt programmatically.   If a user would like to ask a follow-up question from SuggestedPrompts, send the follow-up prompt to the Conversational API &#x60;/query&#x60; endpoint with your chat ID and continue the conversation chain. 
     * @alias module:model/SuggestedPrompts
     * @param type {module:model/SuggestedPrompts.TypeEnum} Datatype contained in this data object
     * @param value {Array.<module:model/PromptItem>} List of suggested prompts
     */
    constructor(type, value) { 
        
        SuggestedPrompts.initialize(this, type, value);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj, type, value) { 
        obj['type'] = type;
        obj['value'] = value;
    }

    /**
     * Constructs a <code>SuggestedPrompts</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/SuggestedPrompts} obj Optional instance to populate.
     * @return {module:model/SuggestedPrompts} The populated <code>SuggestedPrompts</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new SuggestedPrompts();

            if (data.hasOwnProperty('type')) {
                obj['type'] = ApiClient.convertToType(data['type'], 'String');
            }
            if (data.hasOwnProperty('value')) {
                obj['value'] = ApiClient.convertToType(data['value'], [PromptItem]);
            }
        }
        return obj;
    }


}

/**
 * Datatype contained in this data object
 * @member {module:model/SuggestedPrompts.TypeEnum} type
 */
SuggestedPrompts.prototype['type'] = undefined;

/**
 * List of suggested prompts
 * @member {Array.<module:model/PromptItem>} value
 */
SuggestedPrompts.prototype['value'] = undefined;





/**
 * Allowed values for the <code>type</code> property.
 * @enum {String}
 * @readonly
 */
SuggestedPrompts['TypeEnum'] = {

    /**
     * value: "SuggestedPrompts"
     * @const
     */
    "SuggestedPrompts": "SuggestedPrompts"
};



export default SuggestedPrompts;

