/**
 * Investment Banking Office Refresh API
 * Service for refreshing models with refreshable FactSet objects (e.g., =FDS codes)
 *
 * The version of the OpenAPI document: 1.0.0
 * Contact: api@factset.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 *
 */

import ApiClient from '../ApiClient';
import ActiveJobStatus from './ActiveJobStatus';

/**
 * The ActiveJobStatusList model module.
 * @module model/ActiveJobStatusList
 */
class ActiveJobStatusList {
    /**
     * Constructs a new <code>ActiveJobStatusList</code>.
     * List of active job status information
     * @alias module:model/ActiveJobStatusList
     */
    constructor() { 
        
        ActiveJobStatusList.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>ActiveJobStatusList</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/ActiveJobStatusList} obj Optional instance to populate.
     * @return {module:model/ActiveJobStatusList} The populated <code>ActiveJobStatusList</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new ActiveJobStatusList();

            if (data.hasOwnProperty('data')) {
                obj['data'] = ApiClient.convertToType(data['data'], [ActiveJobStatus]);
            }
        }
        return obj;
    }


}

/**
 * @member {Array.<module:model/ActiveJobStatus>} data
 */
ActiveJobStatusList.prototype['data'] = undefined;






export default ActiveJobStatusList;

