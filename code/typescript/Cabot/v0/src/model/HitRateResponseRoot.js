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
import HitRateResponseOptions from './HitRateResponseOptions';

/**
 * The HitRateResponseRoot model module.
 * @module model/HitRateResponseRoot
 */
class HitRateResponseRoot {
    /**
     * Constructs a new <code>HitRateResponseRoot</code>.
     * @alias module:model/HitRateResponseRoot
     */
    constructor() { 
        
        HitRateResponseRoot.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>HitRateResponseRoot</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/HitRateResponseRoot} obj Optional instance to populate.
     * @return {module:model/HitRateResponseRoot} The populated <code>HitRateResponseRoot</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new HitRateResponseRoot();

            if (data.hasOwnProperty('data')) {
                obj['data'] = HitRateResponseOptions.constructFromObject(data['data']);
            }
        }
        return obj;
    }


}

/**
 * @member {module:model/HitRateResponseOptions} data
 */
HitRateResponseRoot.prototype['data'] = undefined;






export default HitRateResponseRoot;

