/**
 * Documents Distributor - CallStreet Events
 * CallStreet Events contains all the Documents Distributor APIs that offer events data such as Events Audio and Near Real-Time Transcripts.  The  Events Audio API provides access to historical as well as latest audio recordings of various company events covered by FactSet. The events include, but are not limited to: earnings calls, conferences, and investor days.   This API also provides relevant metadata such as timestamps and identifiers around each audio file.  The Documents Distributor - Near Real-time Transcripts API enables access to Near Real-time Transcripts provided by CallStreet to time-sensitive clients. This API also provides the relevant speaker metadata along with their confidence scores. This data caters to quant clients interested in building machine learning models.  Clients can leverage this API to perform sentiment analysis through natural language processing or machine learning. It can also be used to complement analysis using FactSet's transcripts service. 
 *
 * The version of the OpenAPI document: 1.7.0
 * Contact: api@factset.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 *
 */

import ApiClient from '../ApiClient';
import NRTCalls400ResponseDetails from './NRTCalls400ResponseDetails';

/**
 * The NRTCalls400Response model module.
 * @module model/NRTCalls400Response
 */
class NRTCalls400Response {
    /**
     * Constructs a new <code>NRTCalls400Response</code>.
     * @alias module:model/NRTCalls400Response
     */
    constructor() { 
        
        NRTCalls400Response.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>NRTCalls400Response</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/NRTCalls400Response} obj Optional instance to populate.
     * @return {module:model/NRTCalls400Response} The populated <code>NRTCalls400Response</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new NRTCalls400Response();

            if (data.hasOwnProperty('id')) {
                obj['id'] = ApiClient.convertToType(data['id'], 'String');
            }
            if (data.hasOwnProperty('error_message')) {
                obj['error_message'] = ApiClient.convertToType(data['error_message'], 'String');
            }
            if (data.hasOwnProperty('details')) {
                obj['details'] = NRTCalls400ResponseDetails.constructFromObject(data['details']);
            }
        }
        return obj;
    }


}

/**
 * @member {String} id
 */
NRTCalls400Response.prototype['id'] = undefined;

/**
 * @member {String} error_message
 */
NRTCalls400Response.prototype['error_message'] = undefined;

/**
 * @member {module:model/NRTCalls400ResponseDetails} details
 */
NRTCalls400Response.prototype['details'] = undefined;






export default NRTCalls400Response;

