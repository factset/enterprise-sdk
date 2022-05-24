/**
 * Stocks API For Digital Portals
 * The stocks API features a screener to search for equity instruments based on stock-specific parameters.  Parameters for up to three fiscal years might now be used in one request; data is available for the ten most recent completed fiscal years. Estimates are available for the current and two consecutive fiscal years.  A separate endpoint returns the possible values and value ranges for the parameters that the endpoint /stock/notation/screener/search accepts: Application developers can request the values and value ranges only for a restricted set of notations that match predefined parameters. This functionality may be used to pre-fill the values and value ranges of the parameters of the /stock/notation/screener/search endpoint so that performing a search always leads to a non-empty set of notations.  The endpoint /stock/notation/ranking/intraday/list ranks stocks notations using intraday figures, for example to build a gainers/losers list.   Additional endpoints include end-of-day benchmark key figures, and selected fundamentals (as of end of fiscal year and with potentially daily updates).  This API is fully integrated with the corresponding Quotes API, allowing access to detailed price and performance information of instruments, as well as basic security identifier cross-reference. For direct access to price histories, please refer to the Time Series API for Digital Portals.  Similar criteria based screener APIs exist for fixed income instruments and securitized derivatives: See the Bonds API and the Securitized Derivatives API for details.
 *
 * The version of the OpenAPI document: 2
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 *
 */

import ApiClient from '../ApiClient';
import InlineResponse20012DataPerformanceEndOfDayMonth1 from './InlineResponse20012DataPerformanceEndOfDayMonth1';
import InlineResponse20012DataPerformanceEndOfDayMonths3 from './InlineResponse20012DataPerformanceEndOfDayMonths3';
import InlineResponse20012DataPerformanceEndOfDayMonths6 from './InlineResponse20012DataPerformanceEndOfDayMonths6';
import InlineResponse20012DataPerformanceEndOfDayWeek1 from './InlineResponse20012DataPerformanceEndOfDayWeek1';
import InlineResponse20012DataPerformanceEndOfDayYear1 from './InlineResponse20012DataPerformanceEndOfDayYear1';
import InlineResponse20012DataPerformanceEndOfDayYearToDate from './InlineResponse20012DataPerformanceEndOfDayYearToDate';
import InlineResponse20012DataPerformanceEndOfDayYears3 from './InlineResponse20012DataPerformanceEndOfDayYears3';
import InlineResponse20012DataPerformanceEndOfDayYears5 from './InlineResponse20012DataPerformanceEndOfDayYears5';

/**
 * The InlineResponse20012DataVolatility model module.
 * @module model/InlineResponse20012DataVolatility
 * @version 0.10.0
 */
class InlineResponse20012DataVolatility {
    /**
     * Constructs a new <code>InlineResponse20012DataVolatility</code>.
     * Value ranges related to the volatility for different time ranges.
     * @alias module:model/InlineResponse20012DataVolatility
     */
    constructor() { 
        
        InlineResponse20012DataVolatility.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>InlineResponse20012DataVolatility</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/InlineResponse20012DataVolatility} obj Optional instance to populate.
     * @return {module:model/InlineResponse20012DataVolatility} The populated <code>InlineResponse20012DataVolatility</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new InlineResponse20012DataVolatility();

            if (data.hasOwnProperty('week1')) {
                obj['week1'] = InlineResponse20012DataPerformanceEndOfDayWeek1.constructFromObject(data['week1']);
            }
            if (data.hasOwnProperty('month1')) {
                obj['month1'] = InlineResponse20012DataPerformanceEndOfDayMonth1.constructFromObject(data['month1']);
            }
            if (data.hasOwnProperty('months3')) {
                obj['months3'] = InlineResponse20012DataPerformanceEndOfDayMonths3.constructFromObject(data['months3']);
            }
            if (data.hasOwnProperty('months6')) {
                obj['months6'] = InlineResponse20012DataPerformanceEndOfDayMonths6.constructFromObject(data['months6']);
            }
            if (data.hasOwnProperty('year1')) {
                obj['year1'] = InlineResponse20012DataPerformanceEndOfDayYear1.constructFromObject(data['year1']);
            }
            if (data.hasOwnProperty('years3')) {
                obj['years3'] = InlineResponse20012DataPerformanceEndOfDayYears3.constructFromObject(data['years3']);
            }
            if (data.hasOwnProperty('years5')) {
                obj['years5'] = InlineResponse20012DataPerformanceEndOfDayYears5.constructFromObject(data['years5']);
            }
            if (data.hasOwnProperty('yearToDate')) {
                obj['yearToDate'] = InlineResponse20012DataPerformanceEndOfDayYearToDate.constructFromObject(data['yearToDate']);
            }
        }
        return obj;
    }


}

/**
 * @member {module:model/InlineResponse20012DataPerformanceEndOfDayWeek1} week1
 */
InlineResponse20012DataVolatility.prototype['week1'] = undefined;

/**
 * @member {module:model/InlineResponse20012DataPerformanceEndOfDayMonth1} month1
 */
InlineResponse20012DataVolatility.prototype['month1'] = undefined;

/**
 * @member {module:model/InlineResponse20012DataPerformanceEndOfDayMonths3} months3
 */
InlineResponse20012DataVolatility.prototype['months3'] = undefined;

/**
 * @member {module:model/InlineResponse20012DataPerformanceEndOfDayMonths6} months6
 */
InlineResponse20012DataVolatility.prototype['months6'] = undefined;

/**
 * @member {module:model/InlineResponse20012DataPerformanceEndOfDayYear1} year1
 */
InlineResponse20012DataVolatility.prototype['year1'] = undefined;

/**
 * @member {module:model/InlineResponse20012DataPerformanceEndOfDayYears3} years3
 */
InlineResponse20012DataVolatility.prototype['years3'] = undefined;

/**
 * @member {module:model/InlineResponse20012DataPerformanceEndOfDayYears5} years5
 */
InlineResponse20012DataVolatility.prototype['years5'] = undefined;

/**
 * @member {module:model/InlineResponse20012DataPerformanceEndOfDayYearToDate} yearToDate
 */
InlineResponse20012DataVolatility.prototype['yearToDate'] = undefined;






export default InlineResponse20012DataVolatility;
