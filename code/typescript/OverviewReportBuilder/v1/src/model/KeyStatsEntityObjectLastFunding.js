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
import KeyStatsEntityObjectFirstDateValue from './KeyStatsEntityObjectFirstDateValue';
import KeyStatsEntityObjectRange52WeekValue from './KeyStatsEntityObjectRange52WeekValue';

/**
 * The KeyStatsEntityObjectLastFunding model module.
 * @module model/KeyStatsEntityObjectLastFunding
 */
class KeyStatsEntityObjectLastFunding {
    /**
     * Constructs a new <code>KeyStatsEntityObjectLastFunding</code>.
     * The most recent date on which a company raised capital from investors in a funding round.
     * @alias module:model/KeyStatsEntityObjectLastFunding
     * @param value {module:model/KeyStatsEntityObjectFirstDateValue} 
     * @param label {module:model/KeyStatsEntityObjectRange52WeekValue} 
     */
    constructor(value, label) { 
        
        KeyStatsEntityObjectLastFunding.initialize(this, value, label);
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
     * Constructs a <code>KeyStatsEntityObjectLastFunding</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/KeyStatsEntityObjectLastFunding} obj Optional instance to populate.
     * @return {module:model/KeyStatsEntityObjectLastFunding} The populated <code>KeyStatsEntityObjectLastFunding</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new KeyStatsEntityObjectLastFunding();

            if (data.hasOwnProperty('value')) {
                obj['value'] = KeyStatsEntityObjectFirstDateValue.constructFromObject(data['value']);
            }
            if (data.hasOwnProperty('label')) {
                obj['label'] = KeyStatsEntityObjectRange52WeekValue.constructFromObject(data['label']);
            }
        }
        return obj;
    }


}

/**
 * @member {module:model/KeyStatsEntityObjectFirstDateValue} value
 */
KeyStatsEntityObjectLastFunding.prototype['value'] = undefined;

/**
 * @member {module:model/KeyStatsEntityObjectRange52WeekValue} label
 */
KeyStatsEntityObjectLastFunding.prototype['label'] = undefined;






export default KeyStatsEntityObjectLastFunding;

