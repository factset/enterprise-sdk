/**
 * EVENTS AND TRANSCRIPTS API
 * <p>The Calendar Events API provides access to FactSetâ€™s Event Calendar data alongside business logic that allows users to replicate views and functionality consistent with the experience provided by the Workstation. This API provides the ability to pull Event Calendar data based on specific filters.</p> <p>Events Audio API provides access to historical as well as the latest audio recordings of various company events covered by FactSet. The events include, but are not limited to: earnings calls, conferences, and investor days. This API also provides relevant metadata such as timestamps and identifiers around each audio file.</p> <p>The  Near Real-time Transcripts API enables access to Near Real-time Transcripts provided by CallStreet to time-sensitive clients. This API also provides the relevant speaker metadata along with their confidence scores. This data caters to quant clients interested in building machine learning models. Clients can leverage this API to perform sentiment analysis through natural language processing or machine learning. It can also be used to complement analysis using FactSet's transcripts service.</p> <p>Transcripts API provides conference call transcripts for companies' publicly held conference calls and a wealth of information regarding upcoming corporate events, such as conference call date and time, phone number and password, type of conference call, and important company investor relations contact information.</p>  
 *
 * The version of the OpenAPI document: 1.2.0
 * Contact: api@factset.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 *
 */

import ApiClient from '../ApiClient';

/**
 * The ListFileObject model module.
 * @module model/ListFileObject
 */
class ListFileObject {
    /**
     * Constructs a new <code>ListFileObject</code>.
     * @alias module:model/ListFileObject
     */
    constructor() { 
        
        ListFileObject.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>ListFileObject</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/ListFileObject} obj Optional instance to populate.
     * @return {module:model/ListFileObject} The populated <code>ListFileObject</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new ListFileObject();

            if (data.hasOwnProperty('year')) {
                obj['year'] = ApiClient.convertToType(data['year'], 'Number');
            }
            if (data.hasOwnProperty('trimmed')) {
                obj['trimmed'] = ApiClient.convertToType(data['trimmed'], 'Boolean');
            }
            if (data.hasOwnProperty('fileName')) {
                obj['fileName'] = ApiClient.convertToType(data['fileName'], 'String');
            }
            if (data.hasOwnProperty('fileSize')) {
                obj['fileSize'] = ApiClient.convertToType(data['fileSize'], 'Number');
            }
            if (data.hasOwnProperty('fileCount')) {
                obj['fileCount'] = ApiClient.convertToType(data['fileCount'], 'Number');
            }
            if (data.hasOwnProperty('url')) {
                obj['url'] = ApiClient.convertToType(data['url'], 'String');
            }
        }
        return obj;
    }


}

/**
 * The year corresponding to the file containing historical audio recordings that can be downloaded via presigned URL.
 * @member {Number} year
 */
ListFileObject.prototype['year'] = undefined;

/**
 * True  it signifies that the pre-signed URL for downloading includes trimmed historical audio recordings along with their metadata for a specific year.  False  it signifies that the pre-signed URL for downloading contains the untrimmed historical audio recordings along with their relevant metadata for a specific year.
 * @member {Boolean} trimmed
 */
ListFileObject.prototype['trimmed'] = undefined;

/**
 * The name of the file.
 * @member {String} fileName
 */
ListFileObject.prototype['fileName'] = undefined;

/**
 * The size of the file, in bytes.
 * @member {Number} fileSize
 */
ListFileObject.prototype['fileSize'] = undefined;

/**
 * The count of the files.
 * @member {Number} fileCount
 */
ListFileObject.prototype['fileCount'] = undefined;

/**
 * A pre-signed URL for downloading historical audio recordings and related metadata of a specific year. The URL provided in the response will expire after 3 hours.
 * @member {String} url
 */
ListFileObject.prototype['url'] = undefined;






export default ListFileObject;

