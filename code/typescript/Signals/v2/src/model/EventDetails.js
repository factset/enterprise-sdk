/**
 * Signals API
 * Collection of endpoints for providing Signal Events, Definitions and Metadata
 *
 * The version of the OpenAPI document: 2.4.0
 * Contact: signals.api@factset.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 *
 */

import ApiClient from '../ApiClient';
import ErrorItem from './ErrorItem';
import EventDetailDataItem from './EventDetailDataItem';
import EventMeta from './EventMeta';

/**
 * The EventDetails model module.
 * @module model/EventDetails
 * @version 0.20.0
 */
class EventDetails {
    /**
     * Constructs a new <code>EventDetails</code>.
     * @alias module:model/EventDetails
     * @param data {Array.<module:model/EventDetailDataItem>} 
     * @param meta {module:model/EventMeta} 
     */
    constructor(data, meta) { 
        
        EventDetails.initialize(this, data, meta);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj, data, meta) { 
        obj['data'] = data;
        obj['meta'] = meta;
    }

    /**
     * Constructs a <code>EventDetails</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/EventDetails} obj Optional instance to populate.
     * @return {module:model/EventDetails} The populated <code>EventDetails</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new EventDetails();

            if (data.hasOwnProperty('data')) {
                obj['data'] = ApiClient.convertToType(data['data'], [EventDetailDataItem]);
            }
            if (data.hasOwnProperty('meta')) {
                obj['meta'] = EventMeta.constructFromObject(data['meta']);
            }
            if (data.hasOwnProperty('errors')) {
                obj['errors'] = ApiClient.convertToType(data['errors'], [ErrorItem]);
            }
        }
        return obj;
    }


}

/**
 * @member {Array.<module:model/EventDetailDataItem>} data
 */
EventDetails.prototype['data'] = undefined;

/**
 * @member {module:model/EventMeta} meta
 */
EventDetails.prototype['meta'] = undefined;

/**
 * @member {Array.<module:model/ErrorItem>} errors
 */
EventDetails.prototype['errors'] = undefined;






export default EventDetails;
