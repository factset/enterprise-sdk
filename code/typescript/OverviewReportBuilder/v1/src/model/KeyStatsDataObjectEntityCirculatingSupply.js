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
 * The KeyStatsDataObjectEntityCirculatingSupply model module.
 * @module model/KeyStatsDataObjectEntityCirculatingSupply
 */
class KeyStatsDataObjectEntityCirculatingSupply {
    /**
     * Constructs a new <code>KeyStatsDataObjectEntityCirculatingSupply</code>.
     * @alias module:model/KeyStatsDataObjectEntityCirculatingSupply
     * @param label {module:model/KeyStatsAttributeLabel} 
     * @param value {module:model/KeyStatsAttributeValueNumber} 
     */
    constructor(label, value) { 
        
        KeyStatsDataObjectEntityCirculatingSupply.initialize(this, label, value);
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
     * Constructs a <code>KeyStatsDataObjectEntityCirculatingSupply</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/KeyStatsDataObjectEntityCirculatingSupply} obj Optional instance to populate.
     * @return {module:model/KeyStatsDataObjectEntityCirculatingSupply} The populated <code>KeyStatsDataObjectEntityCirculatingSupply</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new KeyStatsDataObjectEntityCirculatingSupply();

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
KeyStatsDataObjectEntityCirculatingSupply.prototype['label'] = undefined;

/**
 * @member {module:model/KeyStatsAttributeMeta} meta
 */
KeyStatsDataObjectEntityCirculatingSupply.prototype['meta'] = undefined;

/**
 * @member {module:model/KeyStatsAttributeValueNumber} value
 */
KeyStatsDataObjectEntityCirculatingSupply.prototype['value'] = undefined;






export default KeyStatsDataObjectEntityCirculatingSupply;

