/**
 * Events Contribution API
 * The Events Contribution API provides the ability to add specific types of corporate events to FactSet’s own events calendar, for display within FactSet’s applications, as well as for off-platform re-distribution via FactSet’s Events Calendar API.
 *
 * The version of the OpenAPI document: 0.1.0
 * Contact: api@factset.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 *
 */

import ApiClient from '../ApiClient';
import UpdateResponseData from './UpdateResponseData';

/**
 * The UpdateResponse model module.
 * @module model/UpdateResponse
 */
class UpdateResponse {
    /**
     * Constructs a new <code>UpdateResponse</code>.
     * @alias module:model/UpdateResponse
     */
    constructor() { 
        
        UpdateResponse.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>UpdateResponse</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/UpdateResponse} obj Optional instance to populate.
     * @return {module:model/UpdateResponse} The populated <code>UpdateResponse</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new UpdateResponse();

            if (data.hasOwnProperty('data')) {
                obj['data'] = UpdateResponseData.constructFromObject(data['data']);
            }
        }
        return obj;
    }


}

/**
 * @member {module:model/UpdateResponseData} data
 */
UpdateResponse.prototype['data'] = undefined;






export default UpdateResponse;

