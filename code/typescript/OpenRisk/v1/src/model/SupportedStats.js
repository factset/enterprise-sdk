/**
 * Open:Risk API
 * Service to calculate parametric linear risk statistics and generate risk model asset identifier mappings.
 *
 * The version of the OpenAPI document: 1.26.0
 * Contact: api@factset.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 *
 */

import ApiClient from '../ApiClient';
import SupportedStatDetails from './SupportedStatDetails';

/**
 * The SupportedStats model module.
 * @module model/SupportedStats
 */
class SupportedStats {
    /**
     * Constructs a new <code>SupportedStats</code>.
     * Contains all available base risk statistics. In the event &#39;data&#39; property is empty, no stats are available at all.
     * @alias module:model/SupportedStats
     * @param data {Object.<String, module:model/SupportedStatDetails>} All available base risk statistics
     */
    constructor(data) { 
        
        SupportedStats.initialize(this, data);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj, data) { 
        obj['data'] = data;
    }

    /**
     * Constructs a <code>SupportedStats</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/SupportedStats} obj Optional instance to populate.
     * @return {module:model/SupportedStats} The populated <code>SupportedStats</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new SupportedStats();

            if (data.hasOwnProperty('data')) {
                obj['data'] = ApiClient.convertToType(data['data'], {'String': SupportedStatDetails});
            }
        }
        return obj;
    }


}

/**
 * All available base risk statistics
 * @member {Object.<String, module:model/SupportedStatDetails>} data
 */
SupportedStats.prototype['data'] = undefined;






export default SupportedStats;

