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
 * The StockNotationScreenerSearchDataPerformanceEndOfDayDay1 model module.
 * @module model/StockNotationScreenerSearchDataPerformanceEndOfDayDay1
 */
class StockNotationScreenerSearchDataPerformanceEndOfDayDay1 {
    /**
     * Constructs a new <code>StockNotationScreenerSearchDataPerformanceEndOfDayDay1</code>.
     * Value range for the time range one day.
     * @alias module:model/StockNotationScreenerSearchDataPerformanceEndOfDayDay1
     */
    constructor() { 
        
        StockNotationScreenerSearchDataPerformanceEndOfDayDay1.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>StockNotationScreenerSearchDataPerformanceEndOfDayDay1</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/StockNotationScreenerSearchDataPerformanceEndOfDayDay1} obj Optional instance to populate.
     * @return {module:model/StockNotationScreenerSearchDataPerformanceEndOfDayDay1} The populated <code>StockNotationScreenerSearchDataPerformanceEndOfDayDay1</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new StockNotationScreenerSearchDataPerformanceEndOfDayDay1();

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
StockNotationScreenerSearchDataPerformanceEndOfDayDay1.prototype['minimum'] = undefined;

/**
 * @member {module:model/StockNotationScreenerSearchDataEbitMarginMaximum} maximum
 */
StockNotationScreenerSearchDataPerformanceEndOfDayDay1.prototype['maximum'] = undefined;






export default StockNotationScreenerSearchDataPerformanceEndOfDayDay1;

