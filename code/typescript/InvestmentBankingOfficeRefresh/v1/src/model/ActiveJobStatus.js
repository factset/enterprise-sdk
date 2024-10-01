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
import Error from './Error';

/**
 * The ActiveJobStatus model module.
 * @module model/ActiveJobStatus
 */
class ActiveJobStatus {
    /**
     * Constructs a new <code>ActiveJobStatus</code>.
     * Status information about an active job
     * @alias module:model/ActiveJobStatus
     */
    constructor() { 
        
        ActiveJobStatus.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>ActiveJobStatus</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/ActiveJobStatus} obj Optional instance to populate.
     * @return {module:model/ActiveJobStatus} The populated <code>ActiveJobStatus</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new ActiveJobStatus();

            if (data.hasOwnProperty('id')) {
                obj['id'] = ApiClient.convertToType(data['id'], 'String');
            }
            if (data.hasOwnProperty('status')) {
                obj['status'] = ApiClient.convertToType(data['status'], 'String');
            }
            if (data.hasOwnProperty('error')) {
                obj['error'] = Error.constructFromObject(data['error']);
            }
        }
        return obj;
    }


}

/**
 * Unique identifier for the job (resource ID returned from FactSet).
 * @member {String} id
 */
ActiveJobStatus.prototype['id'] = undefined;

/**
 * The status of the job
 * @member {module:model/ActiveJobStatus.StatusEnum} status
 */
ActiveJobStatus.prototype['status'] = undefined;

/**
 * @member {module:model/Error} error
 */
ActiveJobStatus.prototype['error'] = undefined;





/**
 * Allowed values for the <code>status</code> property.
 * @enum {String}
 * @readonly
 */
ActiveJobStatus['StatusEnum'] = {

    /**
     * value: "queued"
     * @const
     */
    "queued": "queued",

    /**
     * value: "executing"
     * @const
     */
    "executing": "executing"
};



export default ActiveJobStatus;

