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
import SpeakerInfo from './SpeakerInfo';

/**
 * The Phrase model module.
 * @module model/Phrase
 */
class Phrase {
    /**
     * Constructs a new <code>Phrase</code>.
     * A single source for the current data item. Contains data excerpt, various citation information, and Document Viewer URL. If the citation is from a transcript, the information of the person who spoke the phrase is included as &#x60;speakerInfo&#x60;.
     * @alias module:model/Phrase
     * @param phraseId {String} The unique identifier for the citation phrase in the source document.
     * @param content {String} Highlighted content of the citation source from which the response was generated. Commonly a document excerpt identified as the source of the data
     * @param sourceURL {String} The URL of the source document in FactSet's Document Viewer (see [Document Viewer OA page](https://my.apps.factset.com/oa/pages/17390)). If available, the URL will directly link to the excerpted content highlighted within the document.
     * @param sourceTitle {String} The title of the citation's source document.
     * @param sourceDate {Date} The date the citation's source document was published, represented per ISO 8601 guideline (YYYY-MM-DD).
     */
    constructor(phraseId, content, sourceURL, sourceTitle, sourceDate) { 
        
        Phrase.initialize(this, phraseId, content, sourceURL, sourceTitle, sourceDate);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj, phraseId, content, sourceURL, sourceTitle, sourceDate) { 
        obj['phraseId'] = phraseId;
        obj['content'] = content;
        obj['sourceURL'] = sourceURL;
        obj['sourceTitle'] = sourceTitle;
        obj['sourceDate'] = sourceDate;
    }

    /**
     * Constructs a <code>Phrase</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/Phrase} obj Optional instance to populate.
     * @return {module:model/Phrase} The populated <code>Phrase</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new Phrase();

            if (data.hasOwnProperty('phraseId')) {
                obj['phraseId'] = ApiClient.convertToType(data['phraseId'], 'String');
            }
            if (data.hasOwnProperty('content')) {
                obj['content'] = ApiClient.convertToType(data['content'], 'String');
            }
            if (data.hasOwnProperty('sourceURL')) {
                obj['sourceURL'] = ApiClient.convertToType(data['sourceURL'], 'String');
            }
            if (data.hasOwnProperty('sourceTitle')) {
                obj['sourceTitle'] = ApiClient.convertToType(data['sourceTitle'], 'String');
            }
            if (data.hasOwnProperty('sourceDate')) {
                obj['sourceDate'] = ApiClient.convertToType(data['sourceDate'], 'Date');
            }
            if (data.hasOwnProperty('speakerInfo')) {
                obj['speakerInfo'] = SpeakerInfo.constructFromObject(data['speakerInfo']);
            }
        }
        return obj;
    }


}

/**
 * The unique identifier for the citation phrase in the source document.
 * @member {String} phraseId
 */
Phrase.prototype['phraseId'] = undefined;

/**
 * Highlighted content of the citation source from which the response was generated. Commonly a document excerpt identified as the source of the data
 * @member {String} content
 */
Phrase.prototype['content'] = undefined;

/**
 * The URL of the source document in FactSet's Document Viewer (see [Document Viewer OA page](https://my.apps.factset.com/oa/pages/17390)). If available, the URL will directly link to the excerpted content highlighted within the document.
 * @member {String} sourceURL
 */
Phrase.prototype['sourceURL'] = undefined;

/**
 * The title of the citation's source document.
 * @member {String} sourceTitle
 */
Phrase.prototype['sourceTitle'] = undefined;

/**
 * The date the citation's source document was published, represented per ISO 8601 guideline (YYYY-MM-DD).
 * @member {Date} sourceDate
 */
Phrase.prototype['sourceDate'] = undefined;

/**
 * @member {module:model/SpeakerInfo} speakerInfo
 */
Phrase.prototype['speakerInfo'] = undefined;






export default Phrase;

