/**
 * Events Contribution API
 * The Events Contribution API provides the ability to add specific types of corporate events to FactSet’s own events calendar, for display within FactSet’s applications, as well as for off-platform re-distribution via FactSet’s Events Calendar API.
 *
 * The version of the OpenAPI document: 0.2.0
 * Contact: api@factset.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 *
 */

import ApiClient from '../ApiClient';
import UpdateResponseDataEventData from './UpdateResponseDataEventData';
import UpdateResponseDataMessage from './UpdateResponseDataMessage';

/**
 * The UpdateResponseData model module.
 * @module model/UpdateResponseData
 */
class UpdateResponseData {
    /**
     * Constructs a new <code>UpdateResponseData</code>.
     * @alias module:model/UpdateResponseData
     */
    constructor() { 
        
        UpdateResponseData.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>UpdateResponseData</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/UpdateResponseData} obj Optional instance to populate.
     * @return {module:model/UpdateResponseData} The populated <code>UpdateResponseData</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new UpdateResponseData();

            if (data.hasOwnProperty('eventData')) {
                obj['eventData'] = UpdateResponseDataEventData.constructFromObject(data['eventData']);
            }
            if (data.hasOwnProperty('message')) {
                obj['message'] = UpdateResponseDataMessage.constructFromObject(data['message']);
            }
        }
        return obj;
    }


}

/**
 * @member {module:model/UpdateResponseDataEventData} eventData
 */
UpdateResponseData.prototype['eventData'] = undefined;

/**
 * @member {module:model/UpdateResponseDataMessage} message
 */
UpdateResponseData.prototype['message'] = undefined;






export default UpdateResponseData;

