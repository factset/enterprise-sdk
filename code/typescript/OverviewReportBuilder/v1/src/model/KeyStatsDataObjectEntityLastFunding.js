/**
 * FactSet Overview Report Builder API
 * Get relevant industry-specific data for high level analysis of public and private companies
 *
 * The version of the OpenAPI document: 1.1.0
 * Contact: api@factset.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 *
 */

import ApiClient from '../ApiClient';
import KeyStatsAttributeLabel from './KeyStatsAttributeLabel';
import KeyStatsDataObjectEntityExDividendDateValue from './KeyStatsDataObjectEntityExDividendDateValue';

/**
 * The KeyStatsDataObjectEntityLastFunding model module.
 * @module model/KeyStatsDataObjectEntityLastFunding
 */
class KeyStatsDataObjectEntityLastFunding {
    /**
     * Constructs a new <code>KeyStatsDataObjectEntityLastFunding</code>.
     * The most recent date on which a company raised capital from investors in a funding round. (Deprecated) use lastFundingRound instead
     * @alias module:model/KeyStatsDataObjectEntityLastFunding
     * @param label {module:model/KeyStatsAttributeLabel} 
     * @param value {module:model/KeyStatsDataObjectEntityExDividendDateValue} 
     */
    constructor(label, value) { 
        
        KeyStatsDataObjectEntityLastFunding.initialize(this, label, value);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj, label, value) { 
        obj['label'] = label;
        obj['value'] = value;
    }

    /**
     * Constructs a <code>KeyStatsDataObjectEntityLastFunding</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/KeyStatsDataObjectEntityLastFunding} obj Optional instance to populate.
     * @return {module:model/KeyStatsDataObjectEntityLastFunding} The populated <code>KeyStatsDataObjectEntityLastFunding</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new KeyStatsDataObjectEntityLastFunding();

            if (data.hasOwnProperty('label')) {
                obj['label'] = KeyStatsAttributeLabel.constructFromObject(data['label']);
            }
            if (data.hasOwnProperty('value')) {
                obj['value'] = KeyStatsDataObjectEntityExDividendDateValue.constructFromObject(data['value']);
            }
        }
        return obj;
    }


}

/**
 * @member {module:model/KeyStatsAttributeLabel} label
 */
KeyStatsDataObjectEntityLastFunding.prototype['label'] = undefined;

/**
 * @member {module:model/KeyStatsDataObjectEntityExDividendDateValue} value
 */
KeyStatsDataObjectEntityLastFunding.prototype['value'] = undefined;






export default KeyStatsDataObjectEntityLastFunding;

