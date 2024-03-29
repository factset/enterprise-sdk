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
import KeyStatsEntityObjectRevenueAsOfDate from './KeyStatsEntityObjectRevenueAsOfDate';

/**
 * The KeyStatsEntityObjectLatestPostMoneyValuation model module.
 * @module model/KeyStatsEntityObjectLatestPostMoneyValuation
 */
class KeyStatsEntityObjectLatestPostMoneyValuation {
    /**
     * Constructs a new <code>KeyStatsEntityObjectLatestPostMoneyValuation</code>.
     * The estimated total value of a company after its most recent funding round, taking into account the new capital that was raised
     * @alias module:model/KeyStatsEntityObjectLatestPostMoneyValuation
     * @param value {module:model/KeyStatsEntityObjectRange52WeekValue} 
     * @param label {module:model/KeyStatsEntityObjectRange52WeekValue} 
     */
    constructor(value, label) { 
        
        KeyStatsEntityObjectLatestPostMoneyValuation.initialize(this, value, label);
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
     * Constructs a <code>KeyStatsEntityObjectLatestPostMoneyValuation</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/KeyStatsEntityObjectLatestPostMoneyValuation} obj Optional instance to populate.
     * @return {module:model/KeyStatsEntityObjectLatestPostMoneyValuation} The populated <code>KeyStatsEntityObjectLatestPostMoneyValuation</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new KeyStatsEntityObjectLatestPostMoneyValuation();

            if (data.hasOwnProperty('value')) {
                obj['value'] = KeyStatsEntityObjectRange52WeekValue.constructFromObject(data['value']);
            }
            if (data.hasOwnProperty('label')) {
                obj['label'] = KeyStatsEntityObjectRange52WeekValue.constructFromObject(data['label']);
            }
            if (data.hasOwnProperty('asOfDate')) {
                obj['asOfDate'] = KeyStatsEntityObjectRevenueAsOfDate.constructFromObject(data['asOfDate']);
            }
        }
        return obj;
    }


}

/**
 * @member {module:model/KeyStatsEntityObjectRange52WeekValue} value
 */
KeyStatsEntityObjectLatestPostMoneyValuation.prototype['value'] = undefined;

/**
 * @member {module:model/KeyStatsEntityObjectRange52WeekValue} label
 */
KeyStatsEntityObjectLatestPostMoneyValuation.prototype['label'] = undefined;

/**
 * @member {module:model/KeyStatsEntityObjectRevenueAsOfDate} asOfDate
 */
KeyStatsEntityObjectLatestPostMoneyValuation.prototype['asOfDate'] = undefined;






export default KeyStatsEntityObjectLatestPostMoneyValuation;

