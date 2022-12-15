/**
 * Stocks API For Digital Portals
 * The Stocks API features a screener to search for equity instruments based on stock-specific parameters.  Parameters for up to three fiscal years might now be used in one request; data is available for the ten most recent completed fiscal years. Estimates are available for the current and two consecutive fiscal years. Search criteria also include benchmark-related attributes (beta, correlation, outperformance), and ESG parameters, based on FactSet’s Truvalue ESG scores.  A separate endpoint returns the possible values and value ranges for the parameters that the endpoint /stock/notation/screener/search accepts Application developers can request the values and value ranges only for a restricted set of notations that match predefined parameters. This functionality may be used to pre-fill the values and value ranges of the parameters of the /stock/notation/screener/search endpoint so that performing a search always leads to a non-empty set of notations.  The endpoint /stock/notation/ranking/intraday/list ranks stocks notations using intraday figures, for example to build a gainers/losers list.   Additional endpoints include end-of-day benchmark key figures, and selected fundamentals (as of end of fiscal year and with daily updates).  This API is fully integrated with the corresponding [Quotes API](https://developer.factset.com/api-catalog/quotes-api-digital-portals), allowing access to detailed price and performance information of instruments, as well as basic security identifier cross-reference. For direct access to price histories, please refer to the [Time Series API for Digital Portals](https://developer.factset.com/api-catalog/time-series-api-digital-portals).  Similar criteria based screener APIs exist for fixed income instruments and securitized derivatives: See the [Bonds API](https://developer.factset.com/api-catalog/bonds-api-digital-portals) and the [Securitized Derivatives API](https://developer.factset.com/api-catalog/securitized-derivatives-api-digital-portals) for details.  See also the recipe [\"Enrich Your Digital Portal with Flexible Equity Screening\"](https://developer.factset.com/recipe-catalog/enrich-your-digital-portal-flexible-equity-screening). 
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
import InlineResponse20015DataSimpleMovingAverageTradingDaysSinceCrossoverSma20vs50UpNumberDays from './InlineResponse20015DataSimpleMovingAverageTradingDaysSinceCrossoverSma20vs50UpNumberDays';

/**
 * The InlineResponse20015DataSimpleMovingAverageTradingDaysSinceCrossoverSma20vs50Up model module.
 * @module model/InlineResponse20015DataSimpleMovingAverageTradingDaysSinceCrossoverSma20vs50Up
 */
class InlineResponse20015DataSimpleMovingAverageTradingDaysSinceCrossoverSma20vs50Up {
    /**
     * Constructs a new <code>InlineResponse20015DataSimpleMovingAverageTradingDaysSinceCrossoverSma20vs50Up</code>.
     * Value range of the up direction, i.e. the SMA 20 crossed the SMA 50 from below, hence the SMA 20 has currently a higher value.
     * @alias module:model/InlineResponse20015DataSimpleMovingAverageTradingDaysSinceCrossoverSma20vs50Up
     */
    constructor() { 
        
        InlineResponse20015DataSimpleMovingAverageTradingDaysSinceCrossoverSma20vs50Up.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>InlineResponse20015DataSimpleMovingAverageTradingDaysSinceCrossoverSma20vs50Up</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/InlineResponse20015DataSimpleMovingAverageTradingDaysSinceCrossoverSma20vs50Up} obj Optional instance to populate.
     * @return {module:model/InlineResponse20015DataSimpleMovingAverageTradingDaysSinceCrossoverSma20vs50Up} The populated <code>InlineResponse20015DataSimpleMovingAverageTradingDaysSinceCrossoverSma20vs50Up</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new InlineResponse20015DataSimpleMovingAverageTradingDaysSinceCrossoverSma20vs50Up();

            if (data.hasOwnProperty('numberDays')) {
                obj['numberDays'] = InlineResponse20015DataSimpleMovingAverageTradingDaysSinceCrossoverSma20vs50UpNumberDays.constructFromObject(data['numberDays']);
            }
            if (data.hasOwnProperty('count')) {
                obj['count'] = ApiClient.convertToType(data['count'], 'Number');
            }
        }
        return obj;
    }


}

/**
 * @member {module:model/InlineResponse20015DataSimpleMovingAverageTradingDaysSinceCrossoverSma20vs50UpNumberDays} numberDays
 */
InlineResponse20015DataSimpleMovingAverageTradingDaysSinceCrossoverSma20vs50Up.prototype['numberDays'] = undefined;

/**
 * Number of notations.
 * @member {Number} count
 */
InlineResponse20015DataSimpleMovingAverageTradingDaysSinceCrossoverSma20vs50Up.prototype['count'] = undefined;






export default InlineResponse20015DataSimpleMovingAverageTradingDaysSinceCrossoverSma20vs50Up;

