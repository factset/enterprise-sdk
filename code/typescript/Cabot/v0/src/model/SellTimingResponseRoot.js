/**
 * Cabot Models API
 * Cabot Models API
 *
 * The version of the OpenAPI document: 0.1.0
 * Contact: api@factset.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 *
 */

import ApiClient from '../ApiClient';
import SellTimingResponseOptions from './SellTimingResponseOptions';

/**
 * The SellTimingResponseRoot model module.
 * @module model/SellTimingResponseRoot
 */
class SellTimingResponseRoot {
    /**
     * Constructs a new <code>SellTimingResponseRoot</code>.
     * @alias module:model/SellTimingResponseRoot
     */
    constructor() { 
        
        SellTimingResponseRoot.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>SellTimingResponseRoot</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/SellTimingResponseRoot} obj Optional instance to populate.
     * @return {module:model/SellTimingResponseRoot} The populated <code>SellTimingResponseRoot</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new SellTimingResponseRoot();

            if (data.hasOwnProperty('data')) {
                obj['data'] = SellTimingResponseOptions.constructFromObject(data['data']);
            }
        }
        return obj;
    }


}

/**
 * @member {module:model/SellTimingResponseOptions} data
 */
SellTimingResponseRoot.prototype['data'] = undefined;






export default SellTimingResponseRoot;

