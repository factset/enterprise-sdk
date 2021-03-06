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
 * The InlineResponse2004PerformanceEndOfDay model module.
 * @module model/InlineResponse2004PerformanceEndOfDay
 */
class InlineResponse2004PerformanceEndOfDay {
    /**
     * Constructs a new <code>InlineResponse2004PerformanceEndOfDay</code>.
     * End-of-day (EOD) relative performance for different time ranges. The relative performance is the difference of a notation&#39;s most recent EOD closing price against the EOD closing price on the reference date, relative to the EOD closing price on the reference date.
     * @alias module:model/InlineResponse2004PerformanceEndOfDay
     */
    constructor() { 
        
        InlineResponse2004PerformanceEndOfDay.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>InlineResponse2004PerformanceEndOfDay</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/InlineResponse2004PerformanceEndOfDay} obj Optional instance to populate.
     * @return {module:model/InlineResponse2004PerformanceEndOfDay} The populated <code>InlineResponse2004PerformanceEndOfDay</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new InlineResponse2004PerformanceEndOfDay();

            if (data.hasOwnProperty('day1')) {
                obj['day1'] = ApiClient.convertToType(data['day1'], 'Number');
            }
            if (data.hasOwnProperty('week1')) {
                obj['week1'] = ApiClient.convertToType(data['week1'], 'Number');
            }
            if (data.hasOwnProperty('month1')) {
                obj['month1'] = ApiClient.convertToType(data['month1'], 'Number');
            }
            if (data.hasOwnProperty('months3')) {
                obj['months3'] = ApiClient.convertToType(data['months3'], 'Number');
            }
            if (data.hasOwnProperty('months6')) {
                obj['months6'] = ApiClient.convertToType(data['months6'], 'Number');
            }
            if (data.hasOwnProperty('year1')) {
                obj['year1'] = ApiClient.convertToType(data['year1'], 'Number');
            }
            if (data.hasOwnProperty('years3')) {
                obj['years3'] = ApiClient.convertToType(data['years3'], 'Number');
            }
            if (data.hasOwnProperty('years5')) {
                obj['years5'] = ApiClient.convertToType(data['years5'], 'Number');
            }
            if (data.hasOwnProperty('yearToDate')) {
                obj['yearToDate'] = ApiClient.convertToType(data['yearToDate'], 'Number');
            }
        }
        return obj;
    }


}

/**
 * One day.
 * @member {Number} day1
 */
InlineResponse2004PerformanceEndOfDay.prototype['day1'] = undefined;

/**
 * One week.
 * @member {Number} week1
 */
InlineResponse2004PerformanceEndOfDay.prototype['week1'] = undefined;

/**
 * One month.
 * @member {Number} month1
 */
InlineResponse2004PerformanceEndOfDay.prototype['month1'] = undefined;

/**
 * Three months.
 * @member {Number} months3
 */
InlineResponse2004PerformanceEndOfDay.prototype['months3'] = undefined;

/**
 * Six months.
 * @member {Number} months6
 */
InlineResponse2004PerformanceEndOfDay.prototype['months6'] = undefined;

/**
 * One year.
 * @member {Number} year1
 */
InlineResponse2004PerformanceEndOfDay.prototype['year1'] = undefined;

/**
 * Three years.
 * @member {Number} years3
 */
InlineResponse2004PerformanceEndOfDay.prototype['years3'] = undefined;

/**
 * Five years.
 * @member {Number} years5
 */
InlineResponse2004PerformanceEndOfDay.prototype['years5'] = undefined;

/**
 * Year-to-date.
 * @member {Number} yearToDate
 */
InlineResponse2004PerformanceEndOfDay.prototype['yearToDate'] = undefined;






export default InlineResponse2004PerformanceEndOfDay;

