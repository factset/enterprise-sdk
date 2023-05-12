/**
 * FactSet Overview Report Builder API
 * Get relevant industry-specific data for high level analysis of public and private companies
 *
 * The version of the OpenAPI document: 1.2.0
 * Contact: api@factset.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 *
 */

import ApiClient from '../ApiClient';
import KeyStatsEntityObjectRange52WeekValue from './KeyStatsEntityObjectRange52WeekValue';

/**
 * The KeyStatsEntityObjectTargetPrice model module.
 * @module model/KeyStatsEntityObjectTargetPrice
 */
class KeyStatsEntityObjectTargetPrice {
    /**
     * Constructs a new <code>KeyStatsEntityObjectTargetPrice</code>.
     * The price level at which an analyst or brokerage firm predicts a stock will trade in the future
     * @alias module:model/KeyStatsEntityObjectTargetPrice
     * @param value {module:model/KeyStatsEntityObjectRange52WeekValue} 
     * @param label {module:model/KeyStatsEntityObjectRange52WeekValue} 
     */
    constructor(value, label) { 
        
        KeyStatsEntityObjectTargetPrice.initialize(this, value, label);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj, value, label) { 
        obj['value'] = value;
        obj['label'] = label;
    }

    /**
     * Constructs a <code>KeyStatsEntityObjectTargetPrice</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/KeyStatsEntityObjectTargetPrice} obj Optional instance to populate.
     * @return {module:model/KeyStatsEntityObjectTargetPrice} The populated <code>KeyStatsEntityObjectTargetPrice</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new KeyStatsEntityObjectTargetPrice();

            if (data.hasOwnProperty('value')) {
                obj['value'] = KeyStatsEntityObjectRange52WeekValue.constructFromObject(data['value']);
            }
            if (data.hasOwnProperty('label')) {
                obj['label'] = KeyStatsEntityObjectRange52WeekValue.constructFromObject(data['label']);
            }
        }
        return obj;
    }


}

/**
 * @member {module:model/KeyStatsEntityObjectRange52WeekValue} value
 */
KeyStatsEntityObjectTargetPrice.prototype['value'] = undefined;

/**
 * @member {module:model/KeyStatsEntityObjectRange52WeekValue} label
 */
KeyStatsEntityObjectTargetPrice.prototype['label'] = undefined;






export default KeyStatsEntityObjectTargetPrice;
