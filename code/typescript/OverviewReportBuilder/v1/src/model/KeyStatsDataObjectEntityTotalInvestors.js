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
import KeyStatsAttributeValueNumber from './KeyStatsAttributeValueNumber';

/**
 * The KeyStatsDataObjectEntityTotalInvestors model module.
 * @module model/KeyStatsDataObjectEntityTotalInvestors
 */
class KeyStatsDataObjectEntityTotalInvestors {
    /**
     * Constructs a new <code>KeyStatsDataObjectEntityTotalInvestors</code>.
     * The total count of individual or institutional investors that have invested in a company at any point in time, including those that may no longer hold a position in its securities
     * @alias module:model/KeyStatsDataObjectEntityTotalInvestors
     * @param label {module:model/KeyStatsAttributeLabel} 
     * @param value {module:model/KeyStatsAttributeValueNumber} 
     */
    constructor(label, value) { 
        
        KeyStatsDataObjectEntityTotalInvestors.initialize(this, label, value);
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
     * Constructs a <code>KeyStatsDataObjectEntityTotalInvestors</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/KeyStatsDataObjectEntityTotalInvestors} obj Optional instance to populate.
     * @return {module:model/KeyStatsDataObjectEntityTotalInvestors} The populated <code>KeyStatsDataObjectEntityTotalInvestors</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new KeyStatsDataObjectEntityTotalInvestors();

            if (data.hasOwnProperty('label')) {
                obj['label'] = KeyStatsAttributeLabel.constructFromObject(data['label']);
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
KeyStatsDataObjectEntityTotalInvestors.prototype['label'] = undefined;

/**
 * @member {module:model/KeyStatsAttributeValueNumber} value
 */
KeyStatsDataObjectEntityTotalInvestors.prototype['value'] = undefined;






export default KeyStatsDataObjectEntityTotalInvestors;

