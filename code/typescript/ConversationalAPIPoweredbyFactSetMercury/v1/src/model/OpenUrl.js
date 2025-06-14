/**
 * Conversational API Powered by FactSet Mercury
 * ### OVERVIEW  The FactSet Conversational API allows clients to integrate core FactSet Mercury capabilities in chatbot experiences.  The Conversational API is powered by FactSet Mercury, FactSet's Generative Artificial Intelligence (GenAI) large language model. The Conversational API provides a variety of content and capabilities, including FactSet’s Federation layer (FactSet’s core GenAI-based technology), as well as more specific content and functionality tailored for financial services workflows.  The Conversational API provides answers to hundreds of natural language search queries and allows you to easily ask questions related to companies and markets research.  Some example supported prompts:  - Nintendo's highest closing stock price over the last 3 months - Has Yelp issued any guidance? - What are the key trends impacting costs for DaVita?  **For Information on Access to and Content Available via the Conversational API**  Please see the [Conversational API Online Assistant Page](https://my.apps.factset.com/oa/pages/23209). Here you can find instructions on how to set up access to the Conversational API, and the full list of content available.  #### Conversational API Consumer Workflow  The Conversational API is an asynchronous API that utilizes status polling to inform the consumer when a query response is complete. Please see the technical OpenAPI documentation below for specific information regarding consuming the API programmatically.  At a high level, the API consumer workflow is as follows:  1) Send a natural language query to the `/query` endpoint and start the response generation process. 2) Poll the status of the response generation process using the `/status` endpoint. 3) Once the status indicates a ready response, retrieve it using the `/result` endpoint.  - If your response contains a file ID, such as for an Excel chart or a [FactSet ActiveGraph](https://my.apps.factset.com/oa/pages/20355), retrieve it using the file ID at the `/download/file` endpoint. - To provide feedback on your response and help the Conversational API better serve you content, we encourage you to use the `/feedback` endpoint.   #### Receive updates on changes to the Conversational API Subscribe to our FactSet Notify by clicking \"Subscribe to notifications\" in the upper right above the API overview. You will receive email updates when any updates occur to the API  #### FAQ & Troubleshooting Please find FAQs and troubleshooting tips in the [FAQs section](https://my.apps.factset.com/oa/pages/23440) of the Conversational API OA page  ##### Current Limitations  - \"Natural language\" in this documentation refers to modern conversational English. Support for other languages is currently unavailable. - The Conversational API is currently limited to accept 10 natural language queries per minute and 200 per hour for an individual consumer. If you anticipate your needs to be greater than these limits, please reach out to FactSet Support. 
 *
 * The version of the OpenAPI document: 1.1.1
 * Contact: api@factset.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 *
 */

import ApiClient from '../ApiClient';
import OpenUrlUrl from './OpenUrlUrl';

/**
 * The OpenUrl model module.
 * @module model/OpenUrl
 */
class OpenUrl {
    /**
     * Constructs a new <code>OpenUrl</code>.
     * Action containing a URL to open relevant supporting content in the FactSet Workstation or other FactSet applications 
     * @alias module:model/OpenUrl
     * @param action {module:model/OpenUrl.ActionEnum} Type of action
     * @param name {String} Name of associated url
     * @param label {String} Label of associated url
     * @param url {module:model/OpenUrlUrl} 
     */
    constructor(action, name, label, url) { 
        
        OpenUrl.initialize(this, action, name, label, url);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj, action, name, label, url) { 
        obj['action'] = action;
        obj['name'] = name;
        obj['label'] = label;
        obj['url'] = url;
    }

    /**
     * Constructs a <code>OpenUrl</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/OpenUrl} obj Optional instance to populate.
     * @return {module:model/OpenUrl} The populated <code>OpenUrl</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new OpenUrl();

            if (data.hasOwnProperty('action')) {
                obj['action'] = ApiClient.convertToType(data['action'], 'String');
            }
            if (data.hasOwnProperty('name')) {
                obj['name'] = ApiClient.convertToType(data['name'], 'String');
            }
            if (data.hasOwnProperty('label')) {
                obj['label'] = ApiClient.convertToType(data['label'], 'String');
            }
            if (data.hasOwnProperty('category')) {
                obj['category'] = ApiClient.convertToType(data['category'], 'String');
            }
            if (data.hasOwnProperty('url')) {
                obj['url'] = OpenUrlUrl.constructFromObject(data['url']);
            }
        }
        return obj;
    }


}

/**
 * Type of action
 * @member {module:model/OpenUrl.ActionEnum} action
 */
OpenUrl.prototype['action'] = undefined;

/**
 * Name of associated url
 * @member {String} name
 */
OpenUrl.prototype['name'] = undefined;

/**
 * Label of associated url
 * @member {String} label
 */
OpenUrl.prototype['label'] = undefined;

/**
 * Category of associated url
 * @member {String} category
 */
OpenUrl.prototype['category'] = undefined;

/**
 * @member {module:model/OpenUrlUrl} url
 */
OpenUrl.prototype['url'] = undefined;





/**
 * Allowed values for the <code>action</code> property.
 * @enum {String}
 * @readonly
 */
OpenUrl['ActionEnum'] = {

    /**
     * value: "OpenUrl"
     * @const
     */
    "OpenUrl": "OpenUrl"
};



export default OpenUrl;

