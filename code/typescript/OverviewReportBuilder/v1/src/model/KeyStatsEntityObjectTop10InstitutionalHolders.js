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
 * The KeyStatsEntityObjectTop10InstitutionalHolders model module.
 * @module model/KeyStatsEntityObjectTop10InstitutionalHolders
 */
class KeyStatsEntityObjectTop10InstitutionalHolders {
    /**
     * Constructs a new <code>KeyStatsEntityObjectTop10InstitutionalHolders</code>.
     * Percentage owned by 10 largest institutional investors in a company, based on the number of shares they hold
     * @alias module:model/KeyStatsEntityObjectTop10InstitutionalHolders
     * @param value {module:model/KeyStatsEntityObjectAverageDailyVolValue} 
     * @param label {module:model/KeyStatsEntityObjectRange52WeekValue} 
     */
    constructor(value, label) { 
        
        KeyStatsEntityObjectTop10InstitutionalHolders.initialize(this, value, label);
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
     * Constructs a <code>KeyStatsEntityObjectTop10InstitutionalHolders</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/KeyStatsEntityObjectTop10InstitutionalHolders} obj Optional instance to populate.
     * @return {module:model/KeyStatsEntityObjectTop10InstitutionalHolders} The populated <code>KeyStatsEntityObjectTop10InstitutionalHolders</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new KeyStatsEntityObjectTop10InstitutionalHolders();

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
KeyStatsEntityObjectTop10InstitutionalHolders.prototype['value'] = undefined;

/**
 * @member {module:model/KeyStatsEntityObjectRange52WeekValue} label
 */
KeyStatsEntityObjectTop10InstitutionalHolders.prototype['label'] = undefined;






export default KeyStatsEntityObjectTop10InstitutionalHolders;

