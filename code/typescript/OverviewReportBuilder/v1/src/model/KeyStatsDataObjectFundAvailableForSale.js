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
import KeyStatsAttributeValueString from './KeyStatsAttributeValueString';

/**
 * The KeyStatsDataObjectFundAvailableForSale model module.
 * @module model/KeyStatsDataObjectFundAvailableForSale
 */
class KeyStatsDataObjectFundAvailableForSale {
    /**
     * Constructs a new <code>KeyStatsDataObjectFundAvailableForSale</code>.
     * Determines where the fund is available for sale.
     * @alias module:model/KeyStatsDataObjectFundAvailableForSale
     * @param label {module:model/KeyStatsAttributeLabel} 
     * @param value {module:model/KeyStatsAttributeValueString} 
     */
    constructor(label, value) { 
        
        KeyStatsDataObjectFundAvailableForSale.initialize(this, label, value);
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
     * Constructs a <code>KeyStatsDataObjectFundAvailableForSale</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/KeyStatsDataObjectFundAvailableForSale} obj Optional instance to populate.
     * @return {module:model/KeyStatsDataObjectFundAvailableForSale} The populated <code>KeyStatsDataObjectFundAvailableForSale</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new KeyStatsDataObjectFundAvailableForSale();

            if (data.hasOwnProperty('label')) {
                obj['label'] = KeyStatsAttributeLabel.constructFromObject(data['label']);
            }
            if (data.hasOwnProperty('value')) {
                obj['value'] = KeyStatsAttributeValueString.constructFromObject(data['value']);
            }
        }
        return obj;
    }


}

/**
 * @member {module:model/KeyStatsAttributeLabel} label
 */
KeyStatsDataObjectFundAvailableForSale.prototype['label'] = undefined;

/**
 * @member {module:model/KeyStatsAttributeValueString} value
 */
KeyStatsDataObjectFundAvailableForSale.prototype['value'] = undefined;






export default KeyStatsDataObjectFundAvailableForSale;

