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
import HitRateModelAnalytics from './HitRateModelAnalytics';

/**
 * The HitRateResponseOptions model module.
 * @module model/HitRateResponseOptions
 */
class HitRateResponseOptions {
    /**
     * Constructs a new <code>HitRateResponseOptions</code>.
     * @alias module:model/HitRateResponseOptions
     */
    constructor() { 
        
        HitRateResponseOptions.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>HitRateResponseOptions</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/HitRateResponseOptions} obj Optional instance to populate.
     * @return {module:model/HitRateResponseOptions} The populated <code>HitRateResponseOptions</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new HitRateResponseOptions();

            if (data.hasOwnProperty('hitRateValues')) {
                obj['hitRateValues'] = HitRateModelAnalytics.constructFromObject(data['hitRateValues']);
            }
        }
        return obj;
    }


}

/**
 * @member {module:model/HitRateModelAnalytics} hitRateValues
 */
HitRateResponseOptions.prototype['hitRateValues'] = undefined;






export default HitRateResponseOptions;

