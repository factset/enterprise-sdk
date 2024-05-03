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

/**
 * The InsertResponseDataEventData model module.
 * @module model/InsertResponseDataEventData
 */
class InsertResponseDataEventData {
    /**
     * Constructs a new <code>InsertResponseDataEventData</code>.
     * @alias module:model/InsertResponseDataEventData
     */
    constructor() { 
        
        InsertResponseDataEventData.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>InsertResponseDataEventData</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/InsertResponseDataEventData} obj Optional instance to populate.
     * @return {module:model/InsertResponseDataEventData} The populated <code>InsertResponseDataEventData</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new InsertResponseDataEventData();

            if (data.hasOwnProperty('eventId')) {
                obj['eventId'] = ApiClient.convertToType(data['eventId'], 'String');
            }
        }
        return obj;
    }


}

/**
 * Id of the event that was successfully inserted
 * @member {String} eventId
 */
InsertResponseDataEventData.prototype['eventId'] = undefined;






export default InsertResponseDataEventData;

