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
import InlineResponse20014EstimatesFirstFiscalYearCurrencyDependentEstimatesPerShareCashFlow from './InlineResponse20014EstimatesFirstFiscalYearCurrencyDependentEstimatesPerShareCashFlow';
import InlineResponse20014EstimatesFirstFiscalYearCurrencyDependentEstimatesPerShareDividends from './InlineResponse20014EstimatesFirstFiscalYearCurrencyDependentEstimatesPerShareDividends';
import InlineResponse20014EstimatesFirstFiscalYearCurrencyDependentEstimatesPerShareEarnings from './InlineResponse20014EstimatesFirstFiscalYearCurrencyDependentEstimatesPerShareEarnings';
import InlineResponse20014EstimatesFirstFiscalYearCurrencyDependentEstimatesPerShareSales from './InlineResponse20014EstimatesFirstFiscalYearCurrencyDependentEstimatesPerShareSales';

/**
 * The InlineResponse20014EstimatesFirstFiscalYearCurrencyDependentEstimatesPerShare model module.
 * @module model/InlineResponse20014EstimatesFirstFiscalYearCurrencyDependentEstimatesPerShare
 */
class InlineResponse20014EstimatesFirstFiscalYearCurrencyDependentEstimatesPerShare {
    /**
     * Constructs a new <code>InlineResponse20014EstimatesFirstFiscalYearCurrencyDependentEstimatesPerShare</code>.
     * Per-share figures.
     * @alias module:model/InlineResponse20014EstimatesFirstFiscalYearCurrencyDependentEstimatesPerShare
     */
    constructor() { 
        
        InlineResponse20014EstimatesFirstFiscalYearCurrencyDependentEstimatesPerShare.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>InlineResponse20014EstimatesFirstFiscalYearCurrencyDependentEstimatesPerShare</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/InlineResponse20014EstimatesFirstFiscalYearCurrencyDependentEstimatesPerShare} obj Optional instance to populate.
     * @return {module:model/InlineResponse20014EstimatesFirstFiscalYearCurrencyDependentEstimatesPerShare} The populated <code>InlineResponse20014EstimatesFirstFiscalYearCurrencyDependentEstimatesPerShare</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new InlineResponse20014EstimatesFirstFiscalYearCurrencyDependentEstimatesPerShare();

            if (data.hasOwnProperty('sales')) {
                obj['sales'] = InlineResponse20014EstimatesFirstFiscalYearCurrencyDependentEstimatesPerShareSales.constructFromObject(data['sales']);
            }
            if (data.hasOwnProperty('earnings')) {
                obj['earnings'] = InlineResponse20014EstimatesFirstFiscalYearCurrencyDependentEstimatesPerShareEarnings.constructFromObject(data['earnings']);
            }
            if (data.hasOwnProperty('dividends')) {
                obj['dividends'] = InlineResponse20014EstimatesFirstFiscalYearCurrencyDependentEstimatesPerShareDividends.constructFromObject(data['dividends']);
            }
            if (data.hasOwnProperty('cashFlow')) {
                obj['cashFlow'] = InlineResponse20014EstimatesFirstFiscalYearCurrencyDependentEstimatesPerShareCashFlow.constructFromObject(data['cashFlow']);
            }
        }
        return obj;
    }


}

/**
 * @member {module:model/InlineResponse20014EstimatesFirstFiscalYearCurrencyDependentEstimatesPerShareSales} sales
 */
InlineResponse20014EstimatesFirstFiscalYearCurrencyDependentEstimatesPerShare.prototype['sales'] = undefined;

/**
 * @member {module:model/InlineResponse20014EstimatesFirstFiscalYearCurrencyDependentEstimatesPerShareEarnings} earnings
 */
InlineResponse20014EstimatesFirstFiscalYearCurrencyDependentEstimatesPerShare.prototype['earnings'] = undefined;

/**
 * @member {module:model/InlineResponse20014EstimatesFirstFiscalYearCurrencyDependentEstimatesPerShareDividends} dividends
 */
InlineResponse20014EstimatesFirstFiscalYearCurrencyDependentEstimatesPerShare.prototype['dividends'] = undefined;

/**
 * @member {module:model/InlineResponse20014EstimatesFirstFiscalYearCurrencyDependentEstimatesPerShareCashFlow} cashFlow
 */
InlineResponse20014EstimatesFirstFiscalYearCurrencyDependentEstimatesPerShare.prototype['cashFlow'] = undefined;






export default InlineResponse20014EstimatesFirstFiscalYearCurrencyDependentEstimatesPerShare;

