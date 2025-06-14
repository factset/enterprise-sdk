/**
 * Tick History
 * Tick History provides dynamic access to historical tick data for a specific security for specific dates or date range.
 *
 * The version of the OpenAPI document: 2.4.1
 * Contact: api@factset.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 *
 */

import ApiClient from '../ApiClient';
import ErrorExample from './ErrorExample';

/**
 * The Status model module.
 * @module model/Status
 */
class Status {
    /**
     * Constructs a new <code>Status</code>.
     * specifies the error message fields in the response
     * @alias module:model/Status
     */
    constructor() { 
        
        Status.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>Status</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/Status} obj Optional instance to populate.
     * @return {module:model/Status} The populated <code>Status</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new Status();

            if (data.hasOwnProperty('errors')) {
                obj['errors'] = ApiClient.convertToType(data['errors'], [ErrorExample]);
            }
        }
        return obj;
    }


}

/**
 * An array containing errors
 * @member {Array.<module:model/ErrorExample>} errors
 */
Status.prototype['errors'] = undefined;






export default Status;

