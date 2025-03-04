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
import DeleteResponseDataEventData from './DeleteResponseDataEventData';
import DeleteResponseDataMessage from './DeleteResponseDataMessage';

/**
 * The DeleteResponseData model module.
 * @module model/DeleteResponseData
 */
class DeleteResponseData {
    /**
     * Constructs a new <code>DeleteResponseData</code>.
     * @alias module:model/DeleteResponseData
     */
    constructor() { 
        
        DeleteResponseData.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>DeleteResponseData</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/DeleteResponseData} obj Optional instance to populate.
     * @return {module:model/DeleteResponseData} The populated <code>DeleteResponseData</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new DeleteResponseData();

            if (data.hasOwnProperty('eventData')) {
                obj['eventData'] = DeleteResponseDataEventData.constructFromObject(data['eventData']);
            }
            if (data.hasOwnProperty('message')) {
                obj['message'] = DeleteResponseDataMessage.constructFromObject(data['message']);
            }
        }
        return obj;
    }


}

/**
 * @member {module:model/DeleteResponseDataEventData} eventData
 */
DeleteResponseData.prototype['eventData'] = undefined;

/**
 * @member {module:model/DeleteResponseDataMessage} message
 */
DeleteResponseData.prototype['message'] = undefined;






export default DeleteResponseData;

