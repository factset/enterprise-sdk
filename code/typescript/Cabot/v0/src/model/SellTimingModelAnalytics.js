/**
 * Cabot Models API
 * Cabot Models API
 *
 * The version of the OpenAPI document: 0.3.0
 * Contact: api@factset.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 *
 */

import ApiClient from '../ApiClient';

/**
 * The SellTimingModelAnalytics model module.
 * @module model/SellTimingModelAnalytics
 */
class SellTimingModelAnalytics {
    /**
     * Constructs a new <code>SellTimingModelAnalytics</code>.
     * @alias module:model/SellTimingModelAnalytics
     */
    constructor() { 
        
        SellTimingModelAnalytics.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>SellTimingModelAnalytics</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/SellTimingModelAnalytics} obj Optional instance to populate.
     * @return {module:model/SellTimingModelAnalytics} The populated <code>SellTimingModelAnalytics</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new SellTimingModelAnalytics();

            if (data.hasOwnProperty('olderLoser')) {
                obj['olderLoser'] = ApiClient.convertToType(data['olderLoser'], 'Number');
            }
            if (data.hasOwnProperty('olderWinner')) {
                obj['olderWinner'] = ApiClient.convertToType(data['olderWinner'], 'Number');
            }
            if (data.hasOwnProperty('youngerLoser')) {
                obj['youngerLoser'] = ApiClient.convertToType(data['youngerLoser'], 'Number');
            }
            if (data.hasOwnProperty('youngerWinner')) {
                obj['youngerWinner'] = ApiClient.convertToType(data['youngerWinner'], 'Number');
            }
        }
        return obj;
    }


}

/**
 * Benefit of harvesting older, losing positions.
 * @member {Number} olderLoser
 */
SellTimingModelAnalytics.prototype['olderLoser'] = undefined;

/**
 * Benefit of harvesting older, winning positions
 * @member {Number} olderWinner
 */
SellTimingModelAnalytics.prototype['olderWinner'] = undefined;

/**
 * Benefit of harvesting younger, losing positions.
 * @member {Number} youngerLoser
 */
SellTimingModelAnalytics.prototype['youngerLoser'] = undefined;

/**
 * Benefit of harvesting younger, winning positions.
 * @member {Number} youngerWinner
 */
SellTimingModelAnalytics.prototype['youngerWinner'] = undefined;






export default SellTimingModelAnalytics;

