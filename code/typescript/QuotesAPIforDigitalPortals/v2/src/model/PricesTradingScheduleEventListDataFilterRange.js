/**
 * Prime Developer Trial
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: v1
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 *
 */

import ApiClient from '../ApiClient';

/**
 * The PricesTradingScheduleEventListDataFilterRange model module.
 * @module model/PricesTradingScheduleEventListDataFilterRange
 */
class PricesTradingScheduleEventListDataFilterRange {
    /**
     * Constructs a new <code>PricesTradingScheduleEventListDataFilterRange</code>.
     * Date and time range for the time series. A valid time range is between 1900-01-01 and 24 hours and 5 minutes into the future.
     * @alias module:model/PricesTradingScheduleEventListDataFilterRange
     * @param start {String} The starting point of the time range (inclusive).
     * @param end {String} The ending point of the time range (exclusive).
     */
    constructor(start, end) { 
        
        PricesTradingScheduleEventListDataFilterRange.initialize(this, start, end);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj, start, end) { 
        obj['start'] = start;
        obj['end'] = end;
    }

    /**
     * Constructs a <code>PricesTradingScheduleEventListDataFilterRange</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/PricesTradingScheduleEventListDataFilterRange} obj Optional instance to populate.
     * @return {module:model/PricesTradingScheduleEventListDataFilterRange} The populated <code>PricesTradingScheduleEventListDataFilterRange</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new PricesTradingScheduleEventListDataFilterRange();

            if (data.hasOwnProperty('start')) {
                obj['start'] = ApiClient.convertToType(data['start'], 'String');
            }
            if (data.hasOwnProperty('end')) {
                obj['end'] = ApiClient.convertToType(data['end'], 'String');
            }
        }
        return obj;
    }


}

/**
 * The starting point of the time range (inclusive).
 * @member {String} start
 */
PricesTradingScheduleEventListDataFilterRange.prototype['start'] = undefined;

/**
 * The ending point of the time range (exclusive).
 * @member {String} end
 */
PricesTradingScheduleEventListDataFilterRange.prototype['end'] = undefined;






export default PricesTradingScheduleEventListDataFilterRange;

