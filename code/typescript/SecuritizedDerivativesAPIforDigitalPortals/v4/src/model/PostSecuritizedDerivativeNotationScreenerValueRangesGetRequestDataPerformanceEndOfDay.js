/**
 * Securitized Derivatives API For Digital Portals
 * Search for securitized derivative instruments, using a criteria-based screener. The API provides also fundamental data, notation-based key figures, list of barrier types, and details regarding the underlyings, their respective barriers and related cash flows, coupon lists and derived basic interest rate information.  The screener is based on securitized derivatives-specific parameters. The result is limited to the notations that satisfy all the selected filters. If more than one notation of an instrument matches the parameters, and no market priority has been specified, only the notation with the highest trading volume, averaged over one month, is considered. All identifier types used as parameters must be valid and application must have permissions for them.  Available search criteria include:  * validation: filter for only active listings, by price quality and latest/previous available price dates * traded markets: filter and indicate a market priority for the validation * life cycle: important dates in and features of the life cycle of the securitized derivatives instruments * filter by issuer, country of registration of the securitized derivatives * underlying and related barriers, including level and distance, and resulting cash flows * coupon data: where applicable, occurrence and frequency of coupon payments, current interest rate range * performance and volatility * product-specific ask-based key figures (not all key figures are available for all product types):     * bonus yield, sideways yield, maximum yield based on the ask price     * agio, discount     * spread     * break even, outperformance point, parity     * delta, weekly theta, vega, implied volatility     * leverage, omega     * intrinsic value, time value         Since some underlyings, e.g. an index or a performance difference of a stock and an index (alpha structure), do not represent a directly tradable asset, they do not have a price in the classical sense. Therefore, the term *level* is used instead of *price*, e.g. underlying level instead of underlying price. The endpoint does not support the search for securitized derivatives with multiple underlyings, thus only securitized derivatives with a single underlying are returned in the result.  The search can be restricted to a specific set of products by using customer-specific instrument or notation lists. Such restriction lists are set up by FactSet upon request.  This API is fully integrated with the corresponding [Quotes API](https://developer.factset.com/api-catalog/quotes-api-digital-portals), allowing access to detailed price and performance information of instruments, as well as basic security identifier cross-reference. For direct access to price histories, please refer to the [Time Series API for Digital Portals](https://developer.factset.com/api-catalog/time-series-api-digital-portals).  Similar criteria based screener APIs exist for equity and fixed income instruments: See the [Stocks API](https://developer.factset.com/api-catalog/stocks-api-digital-portals) and the [Bonds API](https://developer.factset.com/api-catalog/bonds-api-digital-portals) for details.  
 *
 * The version of the OpenAPI document: 4.0.0
 * Contact: api@factset.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 *
 */

import ApiClient from '../ApiClient';
import PostSecuritizedDerivativeNotationScreenerValueRangesGetRequestDataPerformanceEndOfDayDay1 from './PostSecuritizedDerivativeNotationScreenerValueRangesGetRequestDataPerformanceEndOfDayDay1';
import PostSecuritizedDerivativeNotationScreenerValueRangesGetRequestDataPerformanceEndOfDayMonth1 from './PostSecuritizedDerivativeNotationScreenerValueRangesGetRequestDataPerformanceEndOfDayMonth1';
import PostSecuritizedDerivativeNotationScreenerValueRangesGetRequestDataPerformanceEndOfDayMonths3 from './PostSecuritizedDerivativeNotationScreenerValueRangesGetRequestDataPerformanceEndOfDayMonths3';
import PostSecuritizedDerivativeNotationScreenerValueRangesGetRequestDataPerformanceEndOfDayMonths6 from './PostSecuritizedDerivativeNotationScreenerValueRangesGetRequestDataPerformanceEndOfDayMonths6';
import PostSecuritizedDerivativeNotationScreenerValueRangesGetRequestDataPerformanceEndOfDayWeek1 from './PostSecuritizedDerivativeNotationScreenerValueRangesGetRequestDataPerformanceEndOfDayWeek1';
import PostSecuritizedDerivativeNotationScreenerValueRangesGetRequestDataPerformanceEndOfDayYear1 from './PostSecuritizedDerivativeNotationScreenerValueRangesGetRequestDataPerformanceEndOfDayYear1';
import PostSecuritizedDerivativeNotationScreenerValueRangesGetRequestDataPerformanceEndOfDayYearToDate from './PostSecuritizedDerivativeNotationScreenerValueRangesGetRequestDataPerformanceEndOfDayYearToDate';
import PostSecuritizedDerivativeNotationScreenerValueRangesGetRequestDataPerformanceEndOfDayYears3 from './PostSecuritizedDerivativeNotationScreenerValueRangesGetRequestDataPerformanceEndOfDayYears3';
import PostSecuritizedDerivativeNotationScreenerValueRangesGetRequestDataPerformanceEndOfDayYears5 from './PostSecuritizedDerivativeNotationScreenerValueRangesGetRequestDataPerformanceEndOfDayYears5';

/**
 * The PostSecuritizedDerivativeNotationScreenerValueRangesGetRequestDataPerformanceEndOfDay model module.
 * @module model/PostSecuritizedDerivativeNotationScreenerValueRangesGetRequestDataPerformanceEndOfDay
 */
class PostSecuritizedDerivativeNotationScreenerValueRangesGetRequestDataPerformanceEndOfDay {
    /**
     * Constructs a new <code>PostSecuritizedDerivativeNotationScreenerValueRangesGetRequestDataPerformanceEndOfDay</code>.
     * End-of-day (EOD) relative performance for different time ranges. The relative performance is the difference of a notation&#39;s most recent EOD closing price against the EOD closing price on the reference date, relative to the EOD closing price on the reference date.
     * @alias module:model/PostSecuritizedDerivativeNotationScreenerValueRangesGetRequestDataPerformanceEndOfDay
     */
    constructor() { 
        
        PostSecuritizedDerivativeNotationScreenerValueRangesGetRequestDataPerformanceEndOfDay.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>PostSecuritizedDerivativeNotationScreenerValueRangesGetRequestDataPerformanceEndOfDay</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/PostSecuritizedDerivativeNotationScreenerValueRangesGetRequestDataPerformanceEndOfDay} obj Optional instance to populate.
     * @return {module:model/PostSecuritizedDerivativeNotationScreenerValueRangesGetRequestDataPerformanceEndOfDay} The populated <code>PostSecuritizedDerivativeNotationScreenerValueRangesGetRequestDataPerformanceEndOfDay</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new PostSecuritizedDerivativeNotationScreenerValueRangesGetRequestDataPerformanceEndOfDay();

            if (data.hasOwnProperty('day1')) {
                obj['day1'] = PostSecuritizedDerivativeNotationScreenerValueRangesGetRequestDataPerformanceEndOfDayDay1.constructFromObject(data['day1']);
            }
            if (data.hasOwnProperty('week1')) {
                obj['week1'] = PostSecuritizedDerivativeNotationScreenerValueRangesGetRequestDataPerformanceEndOfDayWeek1.constructFromObject(data['week1']);
            }
            if (data.hasOwnProperty('month1')) {
                obj['month1'] = PostSecuritizedDerivativeNotationScreenerValueRangesGetRequestDataPerformanceEndOfDayMonth1.constructFromObject(data['month1']);
            }
            if (data.hasOwnProperty('months3')) {
                obj['months3'] = PostSecuritizedDerivativeNotationScreenerValueRangesGetRequestDataPerformanceEndOfDayMonths3.constructFromObject(data['months3']);
            }
            if (data.hasOwnProperty('months6')) {
                obj['months6'] = PostSecuritizedDerivativeNotationScreenerValueRangesGetRequestDataPerformanceEndOfDayMonths6.constructFromObject(data['months6']);
            }
            if (data.hasOwnProperty('year1')) {
                obj['year1'] = PostSecuritizedDerivativeNotationScreenerValueRangesGetRequestDataPerformanceEndOfDayYear1.constructFromObject(data['year1']);
            }
            if (data.hasOwnProperty('years3')) {
                obj['years3'] = PostSecuritizedDerivativeNotationScreenerValueRangesGetRequestDataPerformanceEndOfDayYears3.constructFromObject(data['years3']);
            }
            if (data.hasOwnProperty('years5')) {
                obj['years5'] = PostSecuritizedDerivativeNotationScreenerValueRangesGetRequestDataPerformanceEndOfDayYears5.constructFromObject(data['years5']);
            }
            if (data.hasOwnProperty('yearToDate')) {
                obj['yearToDate'] = PostSecuritizedDerivativeNotationScreenerValueRangesGetRequestDataPerformanceEndOfDayYearToDate.constructFromObject(data['yearToDate']);
            }
        }
        return obj;
    }


}

/**
 * @member {module:model/PostSecuritizedDerivativeNotationScreenerValueRangesGetRequestDataPerformanceEndOfDayDay1} day1
 */
PostSecuritizedDerivativeNotationScreenerValueRangesGetRequestDataPerformanceEndOfDay.prototype['day1'] = undefined;

/**
 * @member {module:model/PostSecuritizedDerivativeNotationScreenerValueRangesGetRequestDataPerformanceEndOfDayWeek1} week1
 */
PostSecuritizedDerivativeNotationScreenerValueRangesGetRequestDataPerformanceEndOfDay.prototype['week1'] = undefined;

/**
 * @member {module:model/PostSecuritizedDerivativeNotationScreenerValueRangesGetRequestDataPerformanceEndOfDayMonth1} month1
 */
PostSecuritizedDerivativeNotationScreenerValueRangesGetRequestDataPerformanceEndOfDay.prototype['month1'] = undefined;

/**
 * @member {module:model/PostSecuritizedDerivativeNotationScreenerValueRangesGetRequestDataPerformanceEndOfDayMonths3} months3
 */
PostSecuritizedDerivativeNotationScreenerValueRangesGetRequestDataPerformanceEndOfDay.prototype['months3'] = undefined;

/**
 * @member {module:model/PostSecuritizedDerivativeNotationScreenerValueRangesGetRequestDataPerformanceEndOfDayMonths6} months6
 */
PostSecuritizedDerivativeNotationScreenerValueRangesGetRequestDataPerformanceEndOfDay.prototype['months6'] = undefined;

/**
 * @member {module:model/PostSecuritizedDerivativeNotationScreenerValueRangesGetRequestDataPerformanceEndOfDayYear1} year1
 */
PostSecuritizedDerivativeNotationScreenerValueRangesGetRequestDataPerformanceEndOfDay.prototype['year1'] = undefined;

/**
 * @member {module:model/PostSecuritizedDerivativeNotationScreenerValueRangesGetRequestDataPerformanceEndOfDayYears3} years3
 */
PostSecuritizedDerivativeNotationScreenerValueRangesGetRequestDataPerformanceEndOfDay.prototype['years3'] = undefined;

/**
 * @member {module:model/PostSecuritizedDerivativeNotationScreenerValueRangesGetRequestDataPerformanceEndOfDayYears5} years5
 */
PostSecuritizedDerivativeNotationScreenerValueRangesGetRequestDataPerformanceEndOfDay.prototype['years5'] = undefined;

/**
 * @member {module:model/PostSecuritizedDerivativeNotationScreenerValueRangesGetRequestDataPerformanceEndOfDayYearToDate} yearToDate
 */
PostSecuritizedDerivativeNotationScreenerValueRangesGetRequestDataPerformanceEndOfDay.prototype['yearToDate'] = undefined;






export default PostSecuritizedDerivativeNotationScreenerValueRangesGetRequestDataPerformanceEndOfDay;

