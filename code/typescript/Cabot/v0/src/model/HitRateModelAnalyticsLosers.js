/**
 * Cabot Models API
 * Cabot Models API
 *
 * The version of the OpenAPI document: 0.2.0
 * Contact: api@factset.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 *
 */

import ApiClient from '../ApiClient';

/**
 * The HitRateModelAnalyticsLosers model module.
 * @module model/HitRateModelAnalyticsLosers
 */
class HitRateModelAnalyticsLosers {
    /**
     * Constructs a new <code>HitRateModelAnalyticsLosers</code>.
     * Losers are Positions that detracted from portfolio results
     * @alias module:model/HitRateModelAnalyticsLosers
     */
    constructor() { 
        
        HitRateModelAnalyticsLosers.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>HitRateModelAnalyticsLosers</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/HitRateModelAnalyticsLosers} obj Optional instance to populate.
     * @return {module:model/HitRateModelAnalyticsLosers} The populated <code>HitRateModelAnalyticsLosers</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new HitRateModelAnalyticsLosers();

            if (data.hasOwnProperty('benefit')) {
                obj['benefit'] = ApiClient.convertToType(data['benefit'], 'Number');
            }
            if (data.hasOwnProperty('percent')) {
                obj['percent'] = ApiClient.convertToType(data['percent'], 'Number');
            }
        }
        return obj;
    }


}

/**
 * @member {Number} benefit
 */
HitRateModelAnalyticsLosers.prototype['benefit'] = undefined;

/**
 * @member {Number} percent
 */
HitRateModelAnalyticsLosers.prototype['percent'] = undefined;






export default HitRateModelAnalyticsLosers;

