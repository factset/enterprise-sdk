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
import StockNotationScreenerSearchDataEbitMarginMaximum from './StockNotationScreenerSearchDataEbitMarginMaximum';
import StockNotationScreenerSearchDataEbitMarginMinimum from './StockNotationScreenerSearchDataEbitMarginMinimum';

/**
 * The StockNotationScreenerSearchDataPerformanceEndOfDayYearToDate model module.
 * @module model/StockNotationScreenerSearchDataPerformanceEndOfDayYearToDate
 */
class StockNotationScreenerSearchDataPerformanceEndOfDayYearToDate {
    /**
     * Constructs a new <code>StockNotationScreenerSearchDataPerformanceEndOfDayYearToDate</code>.
     * Value range for the time range year-to-date (YTD).
     * @alias module:model/StockNotationScreenerSearchDataPerformanceEndOfDayYearToDate
     */
    constructor() { 
        
        StockNotationScreenerSearchDataPerformanceEndOfDayYearToDate.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>StockNotationScreenerSearchDataPerformanceEndOfDayYearToDate</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/StockNotationScreenerSearchDataPerformanceEndOfDayYearToDate} obj Optional instance to populate.
     * @return {module:model/StockNotationScreenerSearchDataPerformanceEndOfDayYearToDate} The populated <code>StockNotationScreenerSearchDataPerformanceEndOfDayYearToDate</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new StockNotationScreenerSearchDataPerformanceEndOfDayYearToDate();

            if (data.hasOwnProperty('minimum')) {
                obj['minimum'] = StockNotationScreenerSearchDataEbitMarginMinimum.constructFromObject(data['minimum']);
            }
            if (data.hasOwnProperty('maximum')) {
                obj['maximum'] = StockNotationScreenerSearchDataEbitMarginMaximum.constructFromObject(data['maximum']);
            }
        }
        return obj;
    }


}

/**
 * @member {module:model/StockNotationScreenerSearchDataEbitMarginMinimum} minimum
 */
StockNotationScreenerSearchDataPerformanceEndOfDayYearToDate.prototype['minimum'] = undefined;

/**
 * @member {module:model/StockNotationScreenerSearchDataEbitMarginMaximum} maximum
 */
StockNotationScreenerSearchDataPerformanceEndOfDayYearToDate.prototype['maximum'] = undefined;






export default StockNotationScreenerSearchDataPerformanceEndOfDayYearToDate;

