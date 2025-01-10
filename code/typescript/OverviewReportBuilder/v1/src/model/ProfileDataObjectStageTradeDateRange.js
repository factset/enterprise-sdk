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
import KeyStatsAttributeMetaPeriodicity from './KeyStatsAttributeMetaPeriodicity';

/**
 * The ProfileDataObjectStageTradeDateRange model module.
 * @module model/ProfileDataObjectStageTradeDateRange
 */
class ProfileDataObjectStageTradeDateRange {
    /**
     * Constructs a new <code>ProfileDataObjectStageTradeDateRange</code>.
     * @alias module:model/ProfileDataObjectStageTradeDateRange
     */
    constructor() { 
        
        ProfileDataObjectStageTradeDateRange.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>ProfileDataObjectStageTradeDateRange</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/ProfileDataObjectStageTradeDateRange} obj Optional instance to populate.
     * @return {module:model/ProfileDataObjectStageTradeDateRange} The populated <code>ProfileDataObjectStageTradeDateRange</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new ProfileDataObjectStageTradeDateRange();

            if (data.hasOwnProperty('end')) {
                obj['end'] = KeyStatsAttributeMetaPeriodicity.constructFromObject(data['end']);
            }
            if (data.hasOwnProperty('start')) {
                obj['start'] = KeyStatsAttributeMetaPeriodicity.constructFromObject(data['start']);
            }
        }
        return obj;
    }


}

/**
 * @member {module:model/KeyStatsAttributeMetaPeriodicity} end
 */
ProfileDataObjectStageTradeDateRange.prototype['end'] = undefined;

/**
 * @member {module:model/KeyStatsAttributeMetaPeriodicity} start
 */
ProfileDataObjectStageTradeDateRange.prototype['start'] = undefined;






export default ProfileDataObjectStageTradeDateRange;

