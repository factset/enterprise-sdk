/**
 * FactSet Global Prices API
 * The FactSet Global Prices API provides end of day market pricing content using cloud and microservices technology, encompassing both pricing as well as corporate actions and events data.</p> 
 *
 * The version of the OpenAPI document: 1.8.0
 * Contact: api@factset.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 *
 */

import ApiClient from '../ApiClient';
import SharesOutstandingResponseObject from './SharesOutstandingResponseObject';

/**
 * The SharesOutstandingResponse model module.
 * @module model/SharesOutstandingResponse
 */
class SharesOutstandingResponse {
    /**
     * Constructs a new <code>SharesOutstandingResponse</code>.
     * @alias module:model/SharesOutstandingResponse
     */
    constructor() { 
        
        SharesOutstandingResponse.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>SharesOutstandingResponse</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/SharesOutstandingResponse} obj Optional instance to populate.
     * @return {module:model/SharesOutstandingResponse} The populated <code>SharesOutstandingResponse</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new SharesOutstandingResponse();

            if (data.hasOwnProperty('data')) {
                obj['data'] = ApiClient.convertToType(data['data'], [SharesOutstandingResponseObject]);
            }
        }
        return obj;
    }


}

/**
 * Array of Shares Outstanding Objects
 * @member {Array.<module:model/SharesOutstandingResponseObject>} data
 */
SharesOutstandingResponse.prototype['data'] = undefined;






export default SharesOutstandingResponse;

