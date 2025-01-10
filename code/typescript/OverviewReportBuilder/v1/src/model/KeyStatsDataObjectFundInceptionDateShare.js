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
 * The KeyStatsDataObjectFundInceptionDateShare model module.
 * @module model/KeyStatsDataObjectFundInceptionDateShare
 */
class KeyStatsDataObjectFundInceptionDateShare {
    /**
     * Constructs a new <code>KeyStatsDataObjectFundInceptionDateShare</code>.
     * Launch date of the share class.
     * @alias module:model/KeyStatsDataObjectFundInceptionDateShare
     * @param label {module:model/KeyStatsAttributeLabel} 
     * @param value {module:model/KeyStatsDataObjectEntityExDividendDateValue} 
     */
    constructor(label, value) { 
        
        KeyStatsDataObjectFundInceptionDateShare.initialize(this, label, value);
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
     * Constructs a <code>KeyStatsDataObjectFundInceptionDateShare</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/KeyStatsDataObjectFundInceptionDateShare} obj Optional instance to populate.
     * @return {module:model/KeyStatsDataObjectFundInceptionDateShare} The populated <code>KeyStatsDataObjectFundInceptionDateShare</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new KeyStatsDataObjectFundInceptionDateShare();

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
KeyStatsDataObjectFundInceptionDateShare.prototype['label'] = undefined;

/**
 * @member {module:model/KeyStatsDataObjectEntityExDividendDateValue} value
 */
KeyStatsDataObjectFundInceptionDateShare.prototype['value'] = undefined;






export default KeyStatsDataObjectFundInceptionDateShare;

