/**
 * Conversational API Powered by FactSet Mercury
 * ### OVERVIEW  The FactSet Conversational API allows clients to integrate core FactSet Mercury capabilities in chatbot experiences.  The Conversational API is powered by FactSet Mercury, FactSet's Generative Artificial Intelligence (GenAI) large language model. The Conversational API provides a variety of content and capabilities, including FactSet’s Federation layer (FactSet’s core GenAI-based technology), as well as more specific content and functionality tailored for financial services workflows.  The Conversational API provides answers to hundreds of natural language search queries and allows you to easily ask questions related to companies and markets research.  Some example supported prompts:  - Nintendo's highest closing stock price over the last 3 months - Has Yelp issued any guidance? - What are the key trends impacting costs for DaVita?  **For Information on Access to and Content Available via the Conversational API**  Please see the [Conversational API Online Assistant Page](https://my.apps.factset.com/oa/pages/23209). Here you can find instructions on how to set up access to the Conversational API, and the full list of content available.  #### Conversational API Consumer Workflow  The Conversational API is an asynchronous API that utilizes status polling to inform the consumer when a query response is complete. Please see the technical OpenAPI documentation below for specific information regarding consuming the API programmatically.  At a high level, the API consumer workflow is as follows:  1) Send a natural language query to the `/query` endpoint and start the response generation process. 2) Poll the status of the response generation process using the `/status` endpoint. 3) Once the status indicates a ready response, retrieve it using the `/result` endpoint.  - If your response contains a file ID, such as for an Excel chart or a [FactSet ActiveGraph](https://my.apps.factset.com/oa/pages/20355), retrieve it using the file ID at the `/download/file` endpoint. - To provide feedback on your response and help the Conversational API better serve you content, we encourage you to use the `/feedback` endpoint.   #### Receive updates on changes to the Conversational API Subscribe to our FactSet Notify by clicking \"Subscribe to notifications\" in the upper right above the API overview. You will receive email updates when any updates occur to the API  #### FAQ & Troubleshooting Please find FAQs and troubleshooting tips in the [FAQs section](https://my.apps.factset.com/oa/pages/23440) of the Conversational API OA page  ##### Current Limitations  - \"Natural language\" in this documentation refers to modern conversational English. Support for other languages is currently unavailable. - The Conversational API is currently limited to accept 10 natural language queries per minute and 200 per hour for an individual consumer. If you anticipate your needs to be greater than these limits, please reach out to FactSet Support. 
 *
 * The version of the OpenAPI document: 1.1.0
 * Contact: api@factset.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 *
 */

import ApiClient from '../ApiClient';

/**
 * The SpeakerInfo model module.
 * @module model/SpeakerInfo
 */
class SpeakerInfo {
    /**
     * Constructs a new <code>SpeakerInfo</code>.
     * If the source is a transcript, this field contains the phrase&#39;s speaker information.
     * @alias module:model/SpeakerInfo
     */
    constructor() { 
        
        SpeakerInfo.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>SpeakerInfo</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/SpeakerInfo} obj Optional instance to populate.
     * @return {module:model/SpeakerInfo} The populated <code>SpeakerInfo</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new SpeakerInfo();

            if (data.hasOwnProperty('speakerName')) {
                obj['speakerName'] = ApiClient.convertToType(data['speakerName'], 'String');
            }
            if (data.hasOwnProperty('speakerTitle')) {
                obj['speakerTitle'] = ApiClient.convertToType(data['speakerTitle'], 'String');
            }
            if (data.hasOwnProperty('speakerId')) {
                obj['speakerId'] = ApiClient.convertToType(data['speakerId'], 'String');
            }
            if (data.hasOwnProperty('companyName')) {
                obj['companyName'] = ApiClient.convertToType(data['companyName'], 'String');
            }
            if (data.hasOwnProperty('companyId')) {
                obj['companyId'] = ApiClient.convertToType(data['companyId'], 'String');
            }
        }
        return obj;
    }


}

/**
 * The name of the speaker.
 * @member {String} speakerName
 */
SpeakerInfo.prototype['speakerName'] = undefined;

/**
 * The title of the speaker.
 * @member {String} speakerTitle
 */
SpeakerInfo.prototype['speakerTitle'] = undefined;

/**
 * The FactSet entity ID for the speaker.
 * @member {String} speakerId
 */
SpeakerInfo.prototype['speakerId'] = undefined;

/**
 * The name of the company the speaker is associated with.
 * @member {String} companyName
 */
SpeakerInfo.prototype['companyName'] = undefined;

/**
 * The FactSet entity ID for the company the speaker is associated with.
 * @member {String} companyId
 */
SpeakerInfo.prototype['companyId'] = undefined;






export default SpeakerInfo;

