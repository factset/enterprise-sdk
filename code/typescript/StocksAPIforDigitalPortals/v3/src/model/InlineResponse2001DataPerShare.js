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
import InlineResponse2001DataPerShareBookValue from './InlineResponse2001DataPerShareBookValue';
import InlineResponse2001DataPerShareCashFlow from './InlineResponse2001DataPerShareCashFlow';
import InlineResponse2001DataPerShareDilutedEarnings from './InlineResponse2001DataPerShareDilutedEarnings';
import InlineResponse2001DataPerShareDividends from './InlineResponse2001DataPerShareDividends';
import InlineResponse2001DataPerShareEarnings from './InlineResponse2001DataPerShareEarnings';
import InlineResponse2001DataPerShareFreeCashFlow from './InlineResponse2001DataPerShareFreeCashFlow';
import InlineResponse2001DataPerShareRecurringDilutedEarnings from './InlineResponse2001DataPerShareRecurringDilutedEarnings';
import InlineResponse2001DataPerShareSales from './InlineResponse2001DataPerShareSales';
import InlineResponse2001DataPerShareTangibleBookValue from './InlineResponse2001DataPerShareTangibleBookValue';

/**
 * The InlineResponse2001DataPerShare model module.
 * @module model/InlineResponse2001DataPerShare
 */
class InlineResponse2001DataPerShare {
    /**
     * Constructs a new <code>InlineResponse2001DataPerShare</code>.
     * Key per-share figures used in a fundamental analysis.
     * @alias module:model/InlineResponse2001DataPerShare
     */
    constructor() { 
        
        InlineResponse2001DataPerShare.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>InlineResponse2001DataPerShare</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/InlineResponse2001DataPerShare} obj Optional instance to populate.
     * @return {module:model/InlineResponse2001DataPerShare} The populated <code>InlineResponse2001DataPerShare</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new InlineResponse2001DataPerShare();

            if (data.hasOwnProperty('sales')) {
                obj['sales'] = InlineResponse2001DataPerShareSales.constructFromObject(data['sales']);
            }
            if (data.hasOwnProperty('earnings')) {
                obj['earnings'] = InlineResponse2001DataPerShareEarnings.constructFromObject(data['earnings']);
            }
            if (data.hasOwnProperty('recurringDilutedEarnings')) {
                obj['recurringDilutedEarnings'] = InlineResponse2001DataPerShareRecurringDilutedEarnings.constructFromObject(data['recurringDilutedEarnings']);
            }
            if (data.hasOwnProperty('dilutedEarnings')) {
                obj['dilutedEarnings'] = InlineResponse2001DataPerShareDilutedEarnings.constructFromObject(data['dilutedEarnings']);
            }
            if (data.hasOwnProperty('dividends')) {
                obj['dividends'] = InlineResponse2001DataPerShareDividends.constructFromObject(data['dividends']);
            }
            if (data.hasOwnProperty('bookValue')) {
                obj['bookValue'] = InlineResponse2001DataPerShareBookValue.constructFromObject(data['bookValue']);
            }
            if (data.hasOwnProperty('tangibleBookValue')) {
                obj['tangibleBookValue'] = InlineResponse2001DataPerShareTangibleBookValue.constructFromObject(data['tangibleBookValue']);
            }
            if (data.hasOwnProperty('cashFlow')) {
                obj['cashFlow'] = InlineResponse2001DataPerShareCashFlow.constructFromObject(data['cashFlow']);
            }
            if (data.hasOwnProperty('freeCashFlow')) {
                obj['freeCashFlow'] = InlineResponse2001DataPerShareFreeCashFlow.constructFromObject(data['freeCashFlow']);
            }
        }
        return obj;
    }


}

/**
 * @member {module:model/InlineResponse2001DataPerShareSales} sales
 */
InlineResponse2001DataPerShare.prototype['sales'] = undefined;

/**
 * @member {module:model/InlineResponse2001DataPerShareEarnings} earnings
 */
InlineResponse2001DataPerShare.prototype['earnings'] = undefined;

/**
 * @member {module:model/InlineResponse2001DataPerShareRecurringDilutedEarnings} recurringDilutedEarnings
 */
InlineResponse2001DataPerShare.prototype['recurringDilutedEarnings'] = undefined;

/**
 * @member {module:model/InlineResponse2001DataPerShareDilutedEarnings} dilutedEarnings
 */
InlineResponse2001DataPerShare.prototype['dilutedEarnings'] = undefined;

/**
 * @member {module:model/InlineResponse2001DataPerShareDividends} dividends
 */
InlineResponse2001DataPerShare.prototype['dividends'] = undefined;

/**
 * @member {module:model/InlineResponse2001DataPerShareBookValue} bookValue
 */
InlineResponse2001DataPerShare.prototype['bookValue'] = undefined;

/**
 * @member {module:model/InlineResponse2001DataPerShareTangibleBookValue} tangibleBookValue
 */
InlineResponse2001DataPerShare.prototype['tangibleBookValue'] = undefined;

/**
 * @member {module:model/InlineResponse2001DataPerShareCashFlow} cashFlow
 */
InlineResponse2001DataPerShare.prototype['cashFlow'] = undefined;

/**
 * @member {module:model/InlineResponse2001DataPerShareFreeCashFlow} freeCashFlow
 */
InlineResponse2001DataPerShare.prototype['freeCashFlow'] = undefined;






export default InlineResponse2001DataPerShare;

