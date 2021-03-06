/**
 * Securitized Derivatives API For Digital Portals
 * Search for securitized derivative instruments, using a criteria-based screener. The API provides also fundamental data, notation-based key figures, list of barrier types, and details regarding the underlyings, their respective barriers and related cash flows, coupon lists and derived basic interest rate information.  The screener is based on securitized derivatives-specific parameters. The result is limited to the notations that satisfy all the selected filters. If more than one notation of an instrument matches the parameters, and no market priority has been specified, only the notation with the highest trading volume, averaged over one month, is considered. All identifier types used as parameters must be valid and application must have permissions for them.  Available search criteria include:  * validation: filter for only active listings, by price quality and latest/previous available price dates * traded markets: filter and indicate a market priority for the validation * life cycle: important dates in and features of the life cycle of the securitized derivatives instruments * filter by issuer, country of registration of the securitized derivatives * underlying and related barriers, including level and distance, and resulting cash flows * coupon data: where applicable, occurrence and frequency of coupon payments, current interest rate range * performance and volatility * product-specific ask-based key figures (not all key figures are available for all product types):     * bonus yield, sideways yield, maximum yield based on the ask price     * agio, discount     * spread     * break even, outperformance point, parity     * delta, weekly theta, vega, implied volatility     * leverage, omega     * intrinsic value, time value         Since some underlyings, e.g. an index or a performance difference of a stock and an index (alpha structure), do not represent a directly tradable asset, they do not have a price in the classical sense. Therefore, the term *level* is used instead of *price*, e.g. underlying level instead of underlying price. The endpoint does not support the search for securitized derivatives with multiple underlyings, thus only securitized derivatives with a single underlying are returned in the result.  The search can be restricted to a specific set of products by using customer-specific instrument or notation lists. Such restriction lists are set up by FactSet upon request.  This API is fully integrated with the corresponding Quotes API, allowing access to detailed price and performance information of instruments, as well as basic security identifier cross-reference. For direct access to price histories, please refer to the Time Series API for Digital Portals.  Similar criteria based screener APIs exist for equity and fixed income instruments: See the Stocks API and the Bonds API for details.
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
import SecuritizedDerivativeNotationScreenerValueRangesGetDataPerformanceEndOfDayDay1 from './SecuritizedDerivativeNotationScreenerValueRangesGetDataPerformanceEndOfDayDay1';
import SecuritizedDerivativeNotationScreenerValueRangesGetDataPerformanceEndOfDayMonth1 from './SecuritizedDerivativeNotationScreenerValueRangesGetDataPerformanceEndOfDayMonth1';
import SecuritizedDerivativeNotationScreenerValueRangesGetDataPerformanceEndOfDayMonths3 from './SecuritizedDerivativeNotationScreenerValueRangesGetDataPerformanceEndOfDayMonths3';
import SecuritizedDerivativeNotationScreenerValueRangesGetDataPerformanceEndOfDayMonths6 from './SecuritizedDerivativeNotationScreenerValueRangesGetDataPerformanceEndOfDayMonths6';
import SecuritizedDerivativeNotationScreenerValueRangesGetDataPerformanceEndOfDayWeek1 from './SecuritizedDerivativeNotationScreenerValueRangesGetDataPerformanceEndOfDayWeek1';
import SecuritizedDerivativeNotationScreenerValueRangesGetDataPerformanceEndOfDayYear1 from './SecuritizedDerivativeNotationScreenerValueRangesGetDataPerformanceEndOfDayYear1';
import SecuritizedDerivativeNotationScreenerValueRangesGetDataPerformanceEndOfDayYearToDate from './SecuritizedDerivativeNotationScreenerValueRangesGetDataPerformanceEndOfDayYearToDate';
import SecuritizedDerivativeNotationScreenerValueRangesGetDataPerformanceEndOfDayYears3 from './SecuritizedDerivativeNotationScreenerValueRangesGetDataPerformanceEndOfDayYears3';
import SecuritizedDerivativeNotationScreenerValueRangesGetDataPerformanceEndOfDayYears5 from './SecuritizedDerivativeNotationScreenerValueRangesGetDataPerformanceEndOfDayYears5';

/**
 * The SecuritizedDerivativeNotationScreenerValueRangesGetDataPerformanceEndOfDay model module.
 * @module model/SecuritizedDerivativeNotationScreenerValueRangesGetDataPerformanceEndOfDay
 */
class SecuritizedDerivativeNotationScreenerValueRangesGetDataPerformanceEndOfDay {
    /**
     * Constructs a new <code>SecuritizedDerivativeNotationScreenerValueRangesGetDataPerformanceEndOfDay</code>.
     * End-of-day (EOD) relative performance for different time ranges. The relative performance is the difference of a notation&#39;s most recent EOD closing price against the EOD closing price on the reference date, relative to the EOD closing price on the reference date.
     * @alias module:model/SecuritizedDerivativeNotationScreenerValueRangesGetDataPerformanceEndOfDay
     */
    constructor() { 
        
        SecuritizedDerivativeNotationScreenerValueRangesGetDataPerformanceEndOfDay.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>SecuritizedDerivativeNotationScreenerValueRangesGetDataPerformanceEndOfDay</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/SecuritizedDerivativeNotationScreenerValueRangesGetDataPerformanceEndOfDay} obj Optional instance to populate.
     * @return {module:model/SecuritizedDerivativeNotationScreenerValueRangesGetDataPerformanceEndOfDay} The populated <code>SecuritizedDerivativeNotationScreenerValueRangesGetDataPerformanceEndOfDay</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new SecuritizedDerivativeNotationScreenerValueRangesGetDataPerformanceEndOfDay();

            if (data.hasOwnProperty('day1')) {
                obj['day1'] = SecuritizedDerivativeNotationScreenerValueRangesGetDataPerformanceEndOfDayDay1.constructFromObject(data['day1']);
            }
            if (data.hasOwnProperty('week1')) {
                obj['week1'] = SecuritizedDerivativeNotationScreenerValueRangesGetDataPerformanceEndOfDayWeek1.constructFromObject(data['week1']);
            }
            if (data.hasOwnProperty('month1')) {
                obj['month1'] = SecuritizedDerivativeNotationScreenerValueRangesGetDataPerformanceEndOfDayMonth1.constructFromObject(data['month1']);
            }
            if (data.hasOwnProperty('months3')) {
                obj['months3'] = SecuritizedDerivativeNotationScreenerValueRangesGetDataPerformanceEndOfDayMonths3.constructFromObject(data['months3']);
            }
            if (data.hasOwnProperty('months6')) {
                obj['months6'] = SecuritizedDerivativeNotationScreenerValueRangesGetDataPerformanceEndOfDayMonths6.constructFromObject(data['months6']);
            }
            if (data.hasOwnProperty('year1')) {
                obj['year1'] = SecuritizedDerivativeNotationScreenerValueRangesGetDataPerformanceEndOfDayYear1.constructFromObject(data['year1']);
            }
            if (data.hasOwnProperty('years3')) {
                obj['years3'] = SecuritizedDerivativeNotationScreenerValueRangesGetDataPerformanceEndOfDayYears3.constructFromObject(data['years3']);
            }
            if (data.hasOwnProperty('years5')) {
                obj['years5'] = SecuritizedDerivativeNotationScreenerValueRangesGetDataPerformanceEndOfDayYears5.constructFromObject(data['years5']);
            }
            if (data.hasOwnProperty('yearToDate')) {
                obj['yearToDate'] = SecuritizedDerivativeNotationScreenerValueRangesGetDataPerformanceEndOfDayYearToDate.constructFromObject(data['yearToDate']);
            }
        }
        return obj;
    }


}

/**
 * @member {module:model/SecuritizedDerivativeNotationScreenerValueRangesGetDataPerformanceEndOfDayDay1} day1
 */
SecuritizedDerivativeNotationScreenerValueRangesGetDataPerformanceEndOfDay.prototype['day1'] = undefined;

/**
 * @member {module:model/SecuritizedDerivativeNotationScreenerValueRangesGetDataPerformanceEndOfDayWeek1} week1
 */
SecuritizedDerivativeNotationScreenerValueRangesGetDataPerformanceEndOfDay.prototype['week1'] = undefined;

/**
 * @member {module:model/SecuritizedDerivativeNotationScreenerValueRangesGetDataPerformanceEndOfDayMonth1} month1
 */
SecuritizedDerivativeNotationScreenerValueRangesGetDataPerformanceEndOfDay.prototype['month1'] = undefined;

/**
 * @member {module:model/SecuritizedDerivativeNotationScreenerValueRangesGetDataPerformanceEndOfDayMonths3} months3
 */
SecuritizedDerivativeNotationScreenerValueRangesGetDataPerformanceEndOfDay.prototype['months3'] = undefined;

/**
 * @member {module:model/SecuritizedDerivativeNotationScreenerValueRangesGetDataPerformanceEndOfDayMonths6} months6
 */
SecuritizedDerivativeNotationScreenerValueRangesGetDataPerformanceEndOfDay.prototype['months6'] = undefined;

/**
 * @member {module:model/SecuritizedDerivativeNotationScreenerValueRangesGetDataPerformanceEndOfDayYear1} year1
 */
SecuritizedDerivativeNotationScreenerValueRangesGetDataPerformanceEndOfDay.prototype['year1'] = undefined;

/**
 * @member {module:model/SecuritizedDerivativeNotationScreenerValueRangesGetDataPerformanceEndOfDayYears3} years3
 */
SecuritizedDerivativeNotationScreenerValueRangesGetDataPerformanceEndOfDay.prototype['years3'] = undefined;

/**
 * @member {module:model/SecuritizedDerivativeNotationScreenerValueRangesGetDataPerformanceEndOfDayYears5} years5
 */
SecuritizedDerivativeNotationScreenerValueRangesGetDataPerformanceEndOfDay.prototype['years5'] = undefined;

/**
 * @member {module:model/SecuritizedDerivativeNotationScreenerValueRangesGetDataPerformanceEndOfDayYearToDate} yearToDate
 */
SecuritizedDerivativeNotationScreenerValueRangesGetDataPerformanceEndOfDay.prototype['yearToDate'] = undefined;






export default SecuritizedDerivativeNotationScreenerValueRangesGetDataPerformanceEndOfDay;

