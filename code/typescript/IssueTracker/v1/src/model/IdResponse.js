/**
 * Issue Tracker API
 * This API is used to file issues
 *
 * The version of the OpenAPI document: 1.3.0
 * Contact: api@factset.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 *
 */

import ApiClient from '../ApiClient';
import IdResponseData from './IdResponseData';

/**
 * The IdResponse model module.
 * @module model/IdResponse
 */
class IdResponse {
    /**
     * Constructs a new <code>IdResponse</code>.
     * generated response of issue creation or comment addition.
     * @alias module:model/IdResponse
     */
    constructor() { 
        
        IdResponse.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>IdResponse</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/IdResponse} obj Optional instance to populate.
     * @return {module:model/IdResponse} The populated <code>IdResponse</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new IdResponse();

            if (data.hasOwnProperty('data')) {
                obj['data'] = IdResponseData.constructFromObject(data['data']);
            }
        }
        return obj;
    }


}

/**
 * @member {module:model/IdResponseData} data
 */
IdResponse.prototype['data'] = undefined;






export default IdResponse;

