/**
 * Signals API
 * Collection of endpoints for providing Signal Events, Definitions and Metadata
 *
 * The version of the OpenAPI document: 2.6.0
 * Contact: api@factset.com
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
 * The EventDetail model module.
 * @module model/EventDetail
 */
class EventDetail {
    /**
     * Constructs a new <code>EventDetail</code>.
     * Signals event headlines plus all additional event details
     * @alias module:model/EventDetail
     * @param data {module:model/EventDetailDataItem} 
     * @param meta {module:model/EventMeta} 
     */
    constructor(data, meta) { 
        
        EventDetail.initialize(this, data, meta);
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
     * Constructs a <code>EventDetail</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/EventDetail} obj Optional instance to populate.
     * @return {module:model/EventDetail} The populated <code>EventDetail</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new EventDetail();

            if (data.hasOwnProperty('data')) {
                obj['data'] = EventDetailDataItem.constructFromObject(data['data']);
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
 * @member {module:model/EventDetailDataItem} data
 */
EventDetail.prototype['data'] = undefined;

/**
 * @member {module:model/EventMeta} meta
 */
EventDetail.prototype['meta'] = undefined;

/**
 * @member {Array.<module:model/ErrorItem>} errors
 */
EventDetail.prototype['errors'] = undefined;






export default EventDetail;

