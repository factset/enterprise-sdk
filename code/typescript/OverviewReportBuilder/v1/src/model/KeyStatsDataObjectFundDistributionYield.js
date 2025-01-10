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
import KeyStatsDataObjectFundAverageSpreadValue from './KeyStatsDataObjectFundAverageSpreadValue';

/**
 * The KeyStatsDataObjectFundDistributionYield model module.
 * @module model/KeyStatsDataObjectFundDistributionYield
 */
class KeyStatsDataObjectFundDistributionYield {
    /**
     * Constructs a new <code>KeyStatsDataObjectFundDistributionYield</code>.
     * LTM (Last Twelve Months) trailing 12-month yield of distributions made by the fund, relative to the current price. Distinct from Dividend Yield, which measures distributions made by the portfolio&#39;s holdings. This data point is returned as a percentage.
     * @alias module:model/KeyStatsDataObjectFundDistributionYield
     * @param label {module:model/KeyStatsAttributeLabel} 
     * @param value {module:model/KeyStatsDataObjectFundAverageSpreadValue} 
     */
    constructor(label, value) { 
        
        KeyStatsDataObjectFundDistributionYield.initialize(this, label, value);
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
     * Constructs a <code>KeyStatsDataObjectFundDistributionYield</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/KeyStatsDataObjectFundDistributionYield} obj Optional instance to populate.
     * @return {module:model/KeyStatsDataObjectFundDistributionYield} The populated <code>KeyStatsDataObjectFundDistributionYield</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new KeyStatsDataObjectFundDistributionYield();

            if (data.hasOwnProperty('label')) {
                obj['label'] = KeyStatsAttributeLabel.constructFromObject(data['label']);
            }
            if (data.hasOwnProperty('value')) {
                obj['value'] = KeyStatsDataObjectFundAverageSpreadValue.constructFromObject(data['value']);
            }
        }
        return obj;
    }


}

/**
 * @member {module:model/KeyStatsAttributeLabel} label
 */
KeyStatsDataObjectFundDistributionYield.prototype['label'] = undefined;

/**
 * @member {module:model/KeyStatsDataObjectFundAverageSpreadValue} value
 */
KeyStatsDataObjectFundDistributionYield.prototype['value'] = undefined;






export default KeyStatsDataObjectFundDistributionYield;

