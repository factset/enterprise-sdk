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
 * The KeyStatsDataObjectFundInceptionDateFund model module.
 * @module model/KeyStatsDataObjectFundInceptionDateFund
 */
class KeyStatsDataObjectFundInceptionDateFund {
    /**
     * Constructs a new <code>KeyStatsDataObjectFundInceptionDateFund</code>.
     * Launch date of the fund.
     * @alias module:model/KeyStatsDataObjectFundInceptionDateFund
     * @param label {module:model/KeyStatsAttributeLabel} 
     * @param value {module:model/KeyStatsDataObjectEntityExDividendDateValue} 
     */
    constructor(label, value) { 
        
        KeyStatsDataObjectFundInceptionDateFund.initialize(this, label, value);
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
     * Constructs a <code>KeyStatsDataObjectFundInceptionDateFund</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/KeyStatsDataObjectFundInceptionDateFund} obj Optional instance to populate.
     * @return {module:model/KeyStatsDataObjectFundInceptionDateFund} The populated <code>KeyStatsDataObjectFundInceptionDateFund</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new KeyStatsDataObjectFundInceptionDateFund();

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
KeyStatsDataObjectFundInceptionDateFund.prototype['label'] = undefined;

/**
 * @member {module:model/KeyStatsDataObjectEntityExDividendDateValue} value
 */
KeyStatsDataObjectFundInceptionDateFund.prototype['value'] = undefined;






export default KeyStatsDataObjectFundInceptionDateFund;

