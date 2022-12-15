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
import InlineResponse2002BalanceSheet from './InlineResponse2002BalanceSheet';
import InlineResponse2002Currency from './InlineResponse2002Currency';
import InlineResponse2002FiscalYear from './InlineResponse2002FiscalYear';
import InlineResponse2002IncomeStatement from './InlineResponse2002IncomeStatement';
import InlineResponse2002PerShare from './InlineResponse2002PerShare';
import InlineResponse2002Ratios from './InlineResponse2002Ratios';

/**
 * The InlineResponse2002Data model module.
 * @module model/InlineResponse2002Data
 */
class InlineResponse2002Data {
    /**
     * Constructs a new <code>InlineResponse2002Data</code>.
     * @alias module:model/InlineResponse2002Data
     */
    constructor() { 
        
        InlineResponse2002Data.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>InlineResponse2002Data</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/InlineResponse2002Data} obj Optional instance to populate.
     * @return {module:model/InlineResponse2002Data} The populated <code>InlineResponse2002Data</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new InlineResponse2002Data();

            if (data.hasOwnProperty('fiscalYear')) {
                obj['fiscalYear'] = InlineResponse2002FiscalYear.constructFromObject(data['fiscalYear']);
            }
            if (data.hasOwnProperty('reportDate')) {
                obj['reportDate'] = ApiClient.convertToType(data['reportDate'], 'Date');
            }
            if (data.hasOwnProperty('currency')) {
                obj['currency'] = InlineResponse2002Currency.constructFromObject(data['currency']);
            }
            if (data.hasOwnProperty('incomeStatement')) {
                obj['incomeStatement'] = InlineResponse2002IncomeStatement.constructFromObject(data['incomeStatement']);
            }
            if (data.hasOwnProperty('balanceSheet')) {
                obj['balanceSheet'] = InlineResponse2002BalanceSheet.constructFromObject(data['balanceSheet']);
            }
            if (data.hasOwnProperty('ratios')) {
                obj['ratios'] = InlineResponse2002Ratios.constructFromObject(data['ratios']);
            }
            if (data.hasOwnProperty('perShare')) {
                obj['perShare'] = InlineResponse2002PerShare.constructFromObject(data['perShare']);
            }
        }
        return obj;
    }


}

/**
 * @member {module:model/InlineResponse2002FiscalYear} fiscalYear
 */
InlineResponse2002Data.prototype['fiscalYear'] = undefined;

/**
 * Publication date of the financial report.
 * @member {Date} reportDate
 */
InlineResponse2002Data.prototype['reportDate'] = undefined;

/**
 * @member {module:model/InlineResponse2002Currency} currency
 */
InlineResponse2002Data.prototype['currency'] = undefined;

/**
 * @member {module:model/InlineResponse2002IncomeStatement} incomeStatement
 */
InlineResponse2002Data.prototype['incomeStatement'] = undefined;

/**
 * @member {module:model/InlineResponse2002BalanceSheet} balanceSheet
 */
InlineResponse2002Data.prototype['balanceSheet'] = undefined;

/**
 * @member {module:model/InlineResponse2002Ratios} ratios
 */
InlineResponse2002Data.prototype['ratios'] = undefined;

/**
 * @member {module:model/InlineResponse2002PerShare} perShare
 */
InlineResponse2002Data.prototype['perShare'] = undefined;






export default InlineResponse2002Data;

