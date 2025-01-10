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

/**
 * The KeyStatsAttributeMetaPeriodicity model module.
 * @module model/KeyStatsAttributeMetaPeriodicity
 */
class KeyStatsAttributeMetaPeriodicity {
    /**
     * Constructs a new <code>KeyStatsAttributeMetaPeriodicity</code>.
     * @alias module:model/KeyStatsAttributeMetaPeriodicity
     * @param value {String} 
     */
    constructor(value) { 
        
        KeyStatsAttributeMetaPeriodicity.initialize(this, value);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj, value) { 
        obj['value'] = value;
    }

    /**
     * Constructs a <code>KeyStatsAttributeMetaPeriodicity</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/KeyStatsAttributeMetaPeriodicity} obj Optional instance to populate.
     * @return {module:model/KeyStatsAttributeMetaPeriodicity} The populated <code>KeyStatsAttributeMetaPeriodicity</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new KeyStatsAttributeMetaPeriodicity();

            if (data.hasOwnProperty('value')) {
                obj['value'] = ApiClient.convertToType(data['value'], 'String');
            }
        }
        return obj;
    }


}

/**
 * @member {String} value
 */
KeyStatsAttributeMetaPeriodicity.prototype['value'] = undefined;






export default KeyStatsAttributeMetaPeriodicity;

