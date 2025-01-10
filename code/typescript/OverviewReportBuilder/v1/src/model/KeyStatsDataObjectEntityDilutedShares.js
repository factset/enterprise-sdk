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
import KeyStatsAttributeMeta from './KeyStatsAttributeMeta';
import KeyStatsAttributeValueNumber from './KeyStatsAttributeValueNumber';

/**
 * The KeyStatsDataObjectEntityDilutedShares model module.
 * @module model/KeyStatsDataObjectEntityDilutedShares
 */
class KeyStatsDataObjectEntityDilutedShares {
    /**
     * Constructs a new <code>KeyStatsDataObjectEntityDilutedShares</code>.
     * The total number of a company&#39;s outstanding shares that would exist if all securities that could potentially be converted into common shares, such as outstanding shares, stock options, warrants, and convertible securities
     * @alias module:model/KeyStatsDataObjectEntityDilutedShares
     * @param label {module:model/KeyStatsAttributeLabel} 
     * @param value {module:model/KeyStatsAttributeValueNumber} 
     */
    constructor(label, value) { 
        
        KeyStatsDataObjectEntityDilutedShares.initialize(this, label, value);
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
     * Constructs a <code>KeyStatsDataObjectEntityDilutedShares</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/KeyStatsDataObjectEntityDilutedShares} obj Optional instance to populate.
     * @return {module:model/KeyStatsDataObjectEntityDilutedShares} The populated <code>KeyStatsDataObjectEntityDilutedShares</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new KeyStatsDataObjectEntityDilutedShares();

            if (data.hasOwnProperty('label')) {
                obj['label'] = KeyStatsAttributeLabel.constructFromObject(data['label']);
            }
            if (data.hasOwnProperty('meta')) {
                obj['meta'] = KeyStatsAttributeMeta.constructFromObject(data['meta']);
            }
            if (data.hasOwnProperty('value')) {
                obj['value'] = KeyStatsAttributeValueNumber.constructFromObject(data['value']);
            }
        }
        return obj;
    }


}

/**
 * @member {module:model/KeyStatsAttributeLabel} label
 */
KeyStatsDataObjectEntityDilutedShares.prototype['label'] = undefined;

/**
 * @member {module:model/KeyStatsAttributeMeta} meta
 */
KeyStatsDataObjectEntityDilutedShares.prototype['meta'] = undefined;

/**
 * @member {module:model/KeyStatsAttributeValueNumber} value
 */
KeyStatsDataObjectEntityDilutedShares.prototype['value'] = undefined;






export default KeyStatsDataObjectEntityDilutedShares;

