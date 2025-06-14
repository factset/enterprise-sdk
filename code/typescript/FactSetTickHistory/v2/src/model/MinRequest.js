/**
 * Tick History
 * Tick History provides dynamic access to historical tick data for a specific security for specific dates or date range.
 *
 * The version of the OpenAPI document: 2.4.1
 * Contact: api@factset.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 *
 */

import ApiClient from '../ApiClient';
import MinutesbarRequestBody from './MinutesbarRequestBody';

/**
 * The MinRequest model module.
 * @module model/MinRequest
 */
class MinRequest {
    /**
     * Constructs a new <code>MinRequest</code>.
     * Level1 Minute bars request body elements
     * @alias module:model/MinRequest
     * @param data {module:model/MinutesbarRequestBody} 
     */
    constructor(data) { 
        
        MinRequest.initialize(this, data);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj, data) { 
        obj['data'] = data;
    }

    /**
     * Constructs a <code>MinRequest</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/MinRequest} obj Optional instance to populate.
     * @return {module:model/MinRequest} The populated <code>MinRequest</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new MinRequest();

            if (data.hasOwnProperty('data')) {
                obj['data'] = MinutesbarRequestBody.constructFromObject(data['data']);
            }
        }
        return obj;
    }


}

/**
 * @member {module:model/MinutesbarRequestBody} data
 */
MinRequest.prototype['data'] = undefined;






export default MinRequest;

