/**
 * Tick History
 * Tick History provides dynamic access to historical tick data for a specific security for specific dates or date range.
 *
 * The version of the OpenAPI document: 2.2.0
 * Contact: api@factset.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 *
 */

import ApiClient from '../ApiClient';

/**
 * The DateTimePeriod model module.
 * @module model/DateTimePeriod
 */
class DateTimePeriod {
    /**
     * Constructs a new <code>DateTimePeriod</code>.
     *  NOTE:       - Using start and end parameters within dateTimeRange will fetch the data on particular days in between the timestamps given.      - The start and end times are processed as the local time of the factsetExchangeCode provided. Please refer to the **Data Model User Guide** for time zone to exchange mappings. 
     * @alias module:model/DateTimePeriod
     */
    constructor() { 
        
        DateTimePeriod.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>DateTimePeriod</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/DateTimePeriod} obj Optional instance to populate.
     * @return {module:model/DateTimePeriod} The populated <code>DateTimePeriod</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new DateTimePeriod();

            if (data.hasOwnProperty('start')) {
                obj['start'] = ApiClient.convertToType(data['start'], 'Date');
            }
            if (data.hasOwnProperty('end')) {
                obj['end'] = ApiClient.convertToType(data['end'], 'Date');
            }
        }
        return obj;
    }


}

/**
 * The date for (or from which) the data is required. Supports in YYYY-MM-DDTHH:MM:SSZ format.  
 * @member {Date} start
 */
DateTimePeriod.prototype['start'] = undefined;

/**
 * The date to which data is required. Supports in YYYY-MM-DDTHH:MM:SSZ format. end time is interpreted in the local timezone as the selected exchange. 
 * @member {Date} end
 */
DateTimePeriod.prototype['end'] = undefined;






export default DateTimePeriod;

