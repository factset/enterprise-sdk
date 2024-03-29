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
import InlineResponse2001DataBalanceSheetCashAndDueFromBanks from './InlineResponse2001DataBalanceSheetCashAndDueFromBanks';
import InlineResponse2001DataBalanceSheetCashAndShortTermInvestments from './InlineResponse2001DataBalanceSheetCashAndShortTermInvestments';
import InlineResponse2001DataBalanceSheetNetDebt from './InlineResponse2001DataBalanceSheetNetDebt';
import InlineResponse2001DataBalanceSheetTotalAssets from './InlineResponse2001DataBalanceSheetTotalAssets';
import InlineResponse2001DataBalanceSheetTotalCash from './InlineResponse2001DataBalanceSheetTotalCash';
import InlineResponse2001DataBalanceSheetTotalDebt from './InlineResponse2001DataBalanceSheetTotalDebt';
import InlineResponse2001DataBalanceSheetTotalDeposits from './InlineResponse2001DataBalanceSheetTotalDeposits';
import InlineResponse2001DataBalanceSheetTotalLiabilities from './InlineResponse2001DataBalanceSheetTotalLiabilities';
import InlineResponse2001DataBalanceSheetTotalLoans from './InlineResponse2001DataBalanceSheetTotalLoans';
import InlineResponse2001DataBalanceSheetTotalShareholdersEquity from './InlineResponse2001DataBalanceSheetTotalShareholdersEquity';

/**
 * The InlineResponse2001DataBalanceSheet model module.
 * @module model/InlineResponse2001DataBalanceSheet
 */
class InlineResponse2001DataBalanceSheet {
    /**
     * Constructs a new <code>InlineResponse2001DataBalanceSheet</code>.
     * Balance sheet data.
     * @alias module:model/InlineResponse2001DataBalanceSheet
     */
    constructor() { 
        
        InlineResponse2001DataBalanceSheet.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>InlineResponse2001DataBalanceSheet</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/InlineResponse2001DataBalanceSheet} obj Optional instance to populate.
     * @return {module:model/InlineResponse2001DataBalanceSheet} The populated <code>InlineResponse2001DataBalanceSheet</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new InlineResponse2001DataBalanceSheet();

            if (data.hasOwnProperty('cashAndShortTermInvestments')) {
                obj['cashAndShortTermInvestments'] = InlineResponse2001DataBalanceSheetCashAndShortTermInvestments.constructFromObject(data['cashAndShortTermInvestments']);
            }
            if (data.hasOwnProperty('totalAssets')) {
                obj['totalAssets'] = InlineResponse2001DataBalanceSheetTotalAssets.constructFromObject(data['totalAssets']);
            }
            if (data.hasOwnProperty('totalDebt')) {
                obj['totalDebt'] = InlineResponse2001DataBalanceSheetTotalDebt.constructFromObject(data['totalDebt']);
            }
            if (data.hasOwnProperty('netDebt')) {
                obj['netDebt'] = InlineResponse2001DataBalanceSheetNetDebt.constructFromObject(data['netDebt']);
            }
            if (data.hasOwnProperty('totalLiabilities')) {
                obj['totalLiabilities'] = InlineResponse2001DataBalanceSheetTotalLiabilities.constructFromObject(data['totalLiabilities']);
            }
            if (data.hasOwnProperty('totalShareholdersEquity')) {
                obj['totalShareholdersEquity'] = InlineResponse2001DataBalanceSheetTotalShareholdersEquity.constructFromObject(data['totalShareholdersEquity']);
            }
            if (data.hasOwnProperty('totalLoans')) {
                obj['totalLoans'] = InlineResponse2001DataBalanceSheetTotalLoans.constructFromObject(data['totalLoans']);
            }
            if (data.hasOwnProperty('cashAndDueFromBanks')) {
                obj['cashAndDueFromBanks'] = InlineResponse2001DataBalanceSheetCashAndDueFromBanks.constructFromObject(data['cashAndDueFromBanks']);
            }
            if (data.hasOwnProperty('totalDeposits')) {
                obj['totalDeposits'] = InlineResponse2001DataBalanceSheetTotalDeposits.constructFromObject(data['totalDeposits']);
            }
            if (data.hasOwnProperty('totalCash')) {
                obj['totalCash'] = InlineResponse2001DataBalanceSheetTotalCash.constructFromObject(data['totalCash']);
            }
        }
        return obj;
    }


}

/**
 * @member {module:model/InlineResponse2001DataBalanceSheetCashAndShortTermInvestments} cashAndShortTermInvestments
 */
InlineResponse2001DataBalanceSheet.prototype['cashAndShortTermInvestments'] = undefined;

/**
 * @member {module:model/InlineResponse2001DataBalanceSheetTotalAssets} totalAssets
 */
InlineResponse2001DataBalanceSheet.prototype['totalAssets'] = undefined;

/**
 * @member {module:model/InlineResponse2001DataBalanceSheetTotalDebt} totalDebt
 */
InlineResponse2001DataBalanceSheet.prototype['totalDebt'] = undefined;

/**
 * @member {module:model/InlineResponse2001DataBalanceSheetNetDebt} netDebt
 */
InlineResponse2001DataBalanceSheet.prototype['netDebt'] = undefined;

/**
 * @member {module:model/InlineResponse2001DataBalanceSheetTotalLiabilities} totalLiabilities
 */
InlineResponse2001DataBalanceSheet.prototype['totalLiabilities'] = undefined;

/**
 * @member {module:model/InlineResponse2001DataBalanceSheetTotalShareholdersEquity} totalShareholdersEquity
 */
InlineResponse2001DataBalanceSheet.prototype['totalShareholdersEquity'] = undefined;

/**
 * @member {module:model/InlineResponse2001DataBalanceSheetTotalLoans} totalLoans
 */
InlineResponse2001DataBalanceSheet.prototype['totalLoans'] = undefined;

/**
 * @member {module:model/InlineResponse2001DataBalanceSheetCashAndDueFromBanks} cashAndDueFromBanks
 */
InlineResponse2001DataBalanceSheet.prototype['cashAndDueFromBanks'] = undefined;

/**
 * @member {module:model/InlineResponse2001DataBalanceSheetTotalDeposits} totalDeposits
 */
InlineResponse2001DataBalanceSheet.prototype['totalDeposits'] = undefined;

/**
 * @member {module:model/InlineResponse2001DataBalanceSheetTotalCash} totalCash
 */
InlineResponse2001DataBalanceSheet.prototype['totalCash'] = undefined;






export default InlineResponse2001DataBalanceSheet;

