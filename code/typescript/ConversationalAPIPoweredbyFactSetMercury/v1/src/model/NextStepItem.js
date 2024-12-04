/**
 * Conversational API Powered by FactSet Mercury
 * ### OVERVIEW  The FactSet Conversational API allows clients to integrate core FactSet Mercury capabilities in chatbot experiences.  The Conversational API is powered by FactSet Mercury, FactSet's Generative Artificial Intelligence (GenAI) large language model. The Conversational API provides a variety of content and capabilities, including FactSet’s Federation layer (FactSet’s core GenAI-based technology), as well as more specific content and functionality tailored for financial services workflows.  The Conversational API provides answers to hundreds of natural language search queries and allows you to easily ask questions related to companies and markets research.  Some example supported prompts:  - Nintendo's highest closing stock price over the last 3 months - Has Yelp issued any guidance? - What are the key trends impacting costs for DaVita?  **For Information on Access to and Content Available via the Conversational API**  Please see the [Conversational API Online Assistant Page](https://my.apps.factset.com/oa/pages/23209). Here you can find instructions on how to set up access to the Conversational API, and the full list of content available.  #### Conversational API Consumer Workflow  The Conversational API is an asynchronous API that utilizes status polling to inform the consumer when a query response is complete. Please see the technical OpenAPI documentation below for specific information regarding consuming the API programmatically.  At a high level, the API consumer workflow is as follows:  1) Send a natural language query to the `/query` endpoint and start the response generation process. 2) Poll the status of the response generation process using the `/status` endpoint. 3) Once the status indicates a ready response, retrieve it using the `/result` endpoint.  - If your response contains a file ID, such as for an Excel chart or a [FactSet ActiveGraph](https://my.apps.factset.com/oa/pages/20355), retrieve it using the file ID at the `/download/file` endpoint. - To provide feedback on your response and help the Conversational API better serve you content, we encourage you to use the `/feedback` endpoint.   ##### Current Limitations  - \"Natural language\" in this documentation refers to modern conversational English. Support for other languages is currently unavailable. - The Conversational API is currently limited to accept 10 natural language queries per minute and 200 per hour for an individual consumer. If you anticipate your needs to be greater than these limits, please reach out to FactSet Support.  #### FAQ   **How can I receive updates on changes to the Conversational API?** - Please subscribe to our FactSet Notify by clicking \"Subscribe to notifications\" in the upper right above the API overview. You will receive email updates when any updates occur to the API. **Why am I receiving a 403 error with a valid API key?** - Please ensure that your current public IP is within the IP range allocated to the API key you are using to authenticate API requests. You can update your API key's allowable IP range via the [FactSet Developer Portal API Authentication page](https://developer.factset.com/api-authentication). If this does not resolve the issue, please reach out to FactSet Support to ensure you are appropriately authorized to access the Conversational API. 
 *
 * The version of the OpenAPI document: 1.0.5
 * Contact: api@factset.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 *
 */

import ApiClient from '../ApiClient';
import Download from './Download';
import FileGenerationErrorObject from './FileGenerationErrorObject';
import OpenUrl from './OpenUrl';
import OpenUrlUrl from './OpenUrlUrl';

/**
 * The NextStepItem model module.
 * @module model/NextStepItem
 */
class NextStepItem {
    /**
     * Constructs a new <code>NextStepItem</code>.
     * A single action item associated with the query response. The current supported actions are as below: * OpenUrl: Contains a URL to open relevant supporting content in the FactSet Workstation or other FactSet applications * Download: Contains a file ID to download a file associated with the response 
     * @alias module:model/NextStepItem
     * @implements module:model/OpenUrl
     * @implements module:model/Download
     * @param action {module:model/NextStepItem.ActionEnum} Type of action
     * @param name {String} Name of the download type
     * @param label {String} Label associated with the download
     * @param url {module:model/OpenUrlUrl} 
     * @param error {module:model/FileGenerationErrorObject} 
     */
    constructor(action, name, label, url, error) { 
        OpenUrl.initialize(this, action, name, label, url);Download.initialize(this, action, name, label, error);
        NextStepItem.initialize(this, action, name, label, url, error);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj, action, name, label, url, error) { 
        obj['action'] = action;
        obj['name'] = name;
        obj['label'] = label;
        obj['url'] = url;
        obj['error'] = error;
    }

    /**
     * Constructs a <code>NextStepItem</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/NextStepItem} obj Optional instance to populate.
     * @return {module:model/NextStepItem} The populated <code>NextStepItem</code> instance.
     */
    static constructFromObject(data, obj) {
        switch (data['action']) {
            case 'Download':
              return Download.constructFromObject(data, obj);
            case 'OpenUrl':
              return OpenUrl.constructFromObject(data, obj);
        }
        return obj;
    }


}

/**
 * Type of action
 * @member {module:model/NextStepItem.ActionEnum} action
 */
NextStepItem.prototype['action'] = undefined;

/**
 * Name of the download type
 * @member {String} name
 */
NextStepItem.prototype['name'] = undefined;

/**
 * Label associated with the download
 * @member {String} label
 */
NextStepItem.prototype['label'] = undefined;

/**
 * Category of associated file
 * @member {String} category
 */
NextStepItem.prototype['category'] = undefined;

/**
 * @member {module:model/OpenUrlUrl} url
 */
NextStepItem.prototype['url'] = undefined;

/**
 * Endpoint where file can be found
 * @member {module:model/NextStepItem.LocationEnum} location
 */
NextStepItem.prototype['location'] = undefined;

/**
 * Id of associated file
 * @member {String} fileId
 */
NextStepItem.prototype['fileId'] = undefined;

/**
 * ContentType of associated file
 * @member {module:model/NextStepItem.ContentTypeEnum} contentType
 */
NextStepItem.prototype['contentType'] = undefined;

/**
 * Name of associated file
 * @member {String} fileName
 */
NextStepItem.prototype['fileName'] = undefined;

/**
 * @member {module:model/FileGenerationErrorObject} error
 */
NextStepItem.prototype['error'] = undefined;


// Implement OpenUrl interface:
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
// Implement Download interface:
/**
 * Type of action
 * @member {module:model/Download.ActionEnum} action
 */
Download.prototype['action'] = undefined;
/**
 * Name of the download type
 * @member {String} name
 */
Download.prototype['name'] = undefined;
/**
 * Label associated with the download
 * @member {String} label
 */
Download.prototype['label'] = undefined;
/**
 * Category of associated file
 * @member {String} category
 */
Download.prototype['category'] = undefined;
/**
 * Endpoint where file can be found
 * @member {module:model/Download.LocationEnum} location
 */
Download.prototype['location'] = undefined;
/**
 * Id of associated file
 * @member {String} fileId
 */
Download.prototype['fileId'] = undefined;
/**
 * ContentType of associated file
 * @member {module:model/Download.ContentTypeEnum} contentType
 */
Download.prototype['contentType'] = undefined;
/**
 * Name of associated file
 * @member {String} fileName
 */
Download.prototype['fileName'] = undefined;
/**
 * @member {module:model/FileGenerationErrorObject} error
 */
Download.prototype['error'] = undefined;



/**
 * Allowed values for the <code>action</code> property.
 * @enum {String}
 * @readonly
 */
NextStepItem['ActionEnum'] = {

    /**
     * value: "Download"
     * @const
     */
    "Download": "Download"
};


/**
 * Allowed values for the <code>location</code> property.
 * @enum {String}
 * @readonly
 */
NextStepItem['LocationEnum'] = {

    /**
     * value: "/download/file"
     * @const
     */
    "/download/file": "/download/file"
};


/**
 * Allowed values for the <code>contentType</code> property.
 * @enum {String}
 * @readonly
 */
NextStepItem['ContentTypeEnum'] = {

    /**
     * value: "application/vnd.openxmlformats-officedocument.spreadsheetml.sheet"
     * @const
     */
    "application/vnd.openxmlformats-officedocument.spreadsheetml.sheet": "application/vnd.openxmlformats-officedocument.spreadsheetml.sheet"
};



export default NextStepItem;

