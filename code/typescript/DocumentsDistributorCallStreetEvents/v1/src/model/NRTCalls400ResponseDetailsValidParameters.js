/**
 * Documents Distributor - CallStreet Events
 * CallStreet Events contains all the Documents Distributor APIs that offer events data such as Events Audio and Near Real-Time Transcripts.  The  Events Audio API provides access to historical as well as the latest audio recordings of various company events covered by FactSet. The events include, but are not limited to: earnings calls, conferences, and investor days.   This API also provides relevant metadata such as timestamps and identifiers around each audio file.  The Documents Distributor - Near Real-time Transcripts API enables access to Near Real-time Transcripts provided by CallStreet to time-sensitive clients. This API also provides the relevant speaker metadata along with their confidence scores. This data caters to quant clients interested in building machine learning models.  Clients can leverage this API to perform sentiment analysis through natural language processing or machine learning. It can also be used to complement analysis using FactSet's transcripts service. 
 *
 * The version of the OpenAPI document: 1.8.2
 * Contact: api@factset.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 *
 */

import ApiClient from '../ApiClient';

/**
 * The NRTCalls400ResponseDetailsValidParameters model module.
 * @module model/NRTCalls400ResponseDetailsValidParameters
 */
class NRTCalls400ResponseDetailsValidParameters {
    /**
     * Constructs a new <code>NRTCalls400ResponseDetailsValidParameters</code>.
     * @alias module:model/NRTCalls400ResponseDetailsValidParameters
     */
    constructor() { 
        
        NRTCalls400ResponseDetailsValidParameters.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>NRTCalls400ResponseDetailsValidParameters</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/NRTCalls400ResponseDetailsValidParameters} obj Optional instance to populate.
     * @return {module:model/NRTCalls400ResponseDetailsValidParameters} The populated <code>NRTCalls400ResponseDetailsValidParameters</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new NRTCalls400ResponseDetailsValidParameters();

            if (data.hasOwnProperty('_sort')) {
                obj['_sort'] = ApiClient.convertToType(data['_sort'], ['String']);
            }
            if (data.hasOwnProperty('_paginationLimit')) {
                obj['_paginationLimit'] = ApiClient.convertToType(data['_paginationLimit'], ['String']);
            }
            if (data.hasOwnProperty('_paginationOffset')) {
                obj['_paginationOffset'] = ApiClient.convertToType(data['_paginationOffset'], ['String']);
            }
            if (data.hasOwnProperty('audioSourceId')) {
                obj['audioSourceId'] = ApiClient.convertToType(data['audioSourceId'], ['String']);
            }
            if (data.hasOwnProperty('reportId')) {
                obj['reportId'] = ApiClient.convertToType(data['reportId'], ['String']);
            }
            if (data.hasOwnProperty('callStatus')) {
                obj['callStatus'] = ApiClient.convertToType(data['callStatus'], ['String']);
            }
            if (data.hasOwnProperty('ticker')) {
                obj['ticker'] = ApiClient.convertToType(data['ticker'], ['String']);
            }
            if (data.hasOwnProperty('entityId')) {
                obj['entityId'] = ApiClient.convertToType(data['entityId'], ['String']);
            }
        }
        return obj;
    }


}

/**
 * @member {Array.<String>} _sort
 */
NRTCalls400ResponseDetailsValidParameters.prototype['_sort'] = undefined;

/**
 * @member {Array.<String>} _paginationLimit
 */
NRTCalls400ResponseDetailsValidParameters.prototype['_paginationLimit'] = undefined;

/**
 * @member {Array.<String>} _paginationOffset
 */
NRTCalls400ResponseDetailsValidParameters.prototype['_paginationOffset'] = undefined;

/**
 * @member {Array.<String>} audioSourceId
 */
NRTCalls400ResponseDetailsValidParameters.prototype['audioSourceId'] = undefined;

/**
 * @member {Array.<String>} reportId
 */
NRTCalls400ResponseDetailsValidParameters.prototype['reportId'] = undefined;

/**
 * @member {Array.<String>} callStatus
 */
NRTCalls400ResponseDetailsValidParameters.prototype['callStatus'] = undefined;

/**
 * @member {Array.<String>} ticker
 */
NRTCalls400ResponseDetailsValidParameters.prototype['ticker'] = undefined;

/**
 * @member {Array.<String>} entityId
 */
NRTCalls400ResponseDetailsValidParameters.prototype['entityId'] = undefined;






export default NRTCalls400ResponseDetailsValidParameters;

