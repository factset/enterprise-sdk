/**
 * Cabot Models API
 * Cabot Models API
 *
 * The version of the OpenAPI document: 0.4.0
 * Contact: api@factset.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 *
 */

import ApiClient from '../ApiClient';
import BuyTimingRequestBody from './BuyTimingRequestBody';

/**
 * The BuyTimingRequestBodyRoot model module.
 * @module model/BuyTimingRequestBodyRoot
 */
class BuyTimingRequestBodyRoot {
    /**
     * Constructs a new <code>BuyTimingRequestBodyRoot</code>.
     * @alias module:model/BuyTimingRequestBodyRoot
     */
    constructor() { 
        
        BuyTimingRequestBodyRoot.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>BuyTimingRequestBodyRoot</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/BuyTimingRequestBodyRoot} obj Optional instance to populate.
     * @return {module:model/BuyTimingRequestBodyRoot} The populated <code>BuyTimingRequestBodyRoot</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new BuyTimingRequestBodyRoot();

            if (data.hasOwnProperty('data')) {
                obj['data'] = BuyTimingRequestBody.constructFromObject(data['data']);
            }
        }
        return obj;
    }


}

/**
 * @member {module:model/BuyTimingRequestBody} data
 */
BuyTimingRequestBodyRoot.prototype['data'] = undefined;






export default BuyTimingRequestBodyRoot;

