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
import KeyStatsEntityObjectAverageDailyVolValue from './KeyStatsEntityObjectAverageDailyVolValue';
import KeyStatsEntityObjectRange52WeekValue from './KeyStatsEntityObjectRange52WeekValue';

/**
 * The KeyStatsEntityObjectInstitutional model module.
 * @module model/KeyStatsEntityObjectInstitutional
 */
class KeyStatsEntityObjectInstitutional {
    /**
     * Constructs a new <code>KeyStatsEntityObjectInstitutional</code>.
     * The percentage of a company&#39;s outstanding shares that are owned by institutional investors
     * @alias module:model/KeyStatsEntityObjectInstitutional
     * @param value {module:model/KeyStatsEntityObjectAverageDailyVolValue} 
     * @param label {module:model/KeyStatsEntityObjectRange52WeekValue} 
     */
    constructor(value, label) { 
        
        KeyStatsEntityObjectInstitutional.initialize(this, value, label);
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
     * Constructs a <code>KeyStatsEntityObjectInstitutional</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/KeyStatsEntityObjectInstitutional} obj Optional instance to populate.
     * @return {module:model/KeyStatsEntityObjectInstitutional} The populated <code>KeyStatsEntityObjectInstitutional</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new KeyStatsEntityObjectInstitutional();

            if (data.hasOwnProperty('value')) {
                obj['value'] = KeyStatsEntityObjectAverageDailyVolValue.constructFromObject(data['value']);
            }
            if (data.hasOwnProperty('label')) {
                obj['label'] = KeyStatsEntityObjectRange52WeekValue.constructFromObject(data['label']);
            }
        }
        return obj;
    }


}

/**
 * @member {module:model/KeyStatsEntityObjectAverageDailyVolValue} value
 */
KeyStatsEntityObjectInstitutional.prototype['value'] = undefined;

/**
 * @member {module:model/KeyStatsEntityObjectRange52WeekValue} label
 */
KeyStatsEntityObjectInstitutional.prototype['label'] = undefined;






export default KeyStatsEntityObjectInstitutional;

