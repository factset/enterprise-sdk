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

/**
 * The InlineResponse20014ReportedKeyFiguresFirstFiscalYearRatios model module.
 * @module model/InlineResponse20014ReportedKeyFiguresFirstFiscalYearRatios
 */
class InlineResponse20014ReportedKeyFiguresFirstFiscalYearRatios {
    /**
     * Constructs a new <code>InlineResponse20014ReportedKeyFiguresFirstFiscalYearRatios</code>.
     * Ratios.
     * @alias module:model/InlineResponse20014ReportedKeyFiguresFirstFiscalYearRatios
     */
    constructor() { 
        
        InlineResponse20014ReportedKeyFiguresFirstFiscalYearRatios.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>InlineResponse20014ReportedKeyFiguresFirstFiscalYearRatios</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/InlineResponse20014ReportedKeyFiguresFirstFiscalYearRatios} obj Optional instance to populate.
     * @return {module:model/InlineResponse20014ReportedKeyFiguresFirstFiscalYearRatios} The populated <code>InlineResponse20014ReportedKeyFiguresFirstFiscalYearRatios</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new InlineResponse20014ReportedKeyFiguresFirstFiscalYearRatios();

            if (data.hasOwnProperty('priceSales')) {
                obj['priceSales'] = ApiClient.convertToType(data['priceSales'], 'Number');
            }
            if (data.hasOwnProperty('priceEarnings')) {
                obj['priceEarnings'] = ApiClient.convertToType(data['priceEarnings'], 'Number');
            }
            if (data.hasOwnProperty('priceBookValue')) {
                obj['priceBookValue'] = ApiClient.convertToType(data['priceBookValue'], 'Number');
            }
            if (data.hasOwnProperty('priceCashFlow')) {
                obj['priceCashFlow'] = ApiClient.convertToType(data['priceCashFlow'], 'Number');
            }
            if (data.hasOwnProperty('priceFreeCashFlow')) {
                obj['priceFreeCashFlow'] = ApiClient.convertToType(data['priceFreeCashFlow'], 'Number');
            }
            if (data.hasOwnProperty('dividendYield')) {
                obj['dividendYield'] = ApiClient.convertToType(data['dividendYield'], 'Number');
            }
            if (data.hasOwnProperty('enterpriseValueEbit')) {
                obj['enterpriseValueEbit'] = ApiClient.convertToType(data['enterpriseValueEbit'], 'Number');
            }
            if (data.hasOwnProperty('enterpriseValueEbitda')) {
                obj['enterpriseValueEbitda'] = ApiClient.convertToType(data['enterpriseValueEbitda'], 'Number');
            }
            if (data.hasOwnProperty('enterpriseValueSales')) {
                obj['enterpriseValueSales'] = ApiClient.convertToType(data['enterpriseValueSales'], 'Number');
            }
            if (data.hasOwnProperty('debtEquity')) {
                obj['debtEquity'] = ApiClient.convertToType(data['debtEquity'], 'Number');
            }
        }
        return obj;
    }


}

/**
 * Ratio of the price, divided by the total sales revenue per share.
 * @member {Number} priceSales
 */
InlineResponse20014ReportedKeyFiguresFirstFiscalYearRatios.prototype['priceSales'] = undefined;

/**
 * Ratio of the price, divided by the reported earnings per share (basic or diluted) by the company.
 * @member {Number} priceEarnings
 */
InlineResponse20014ReportedKeyFiguresFirstFiscalYearRatios.prototype['priceEarnings'] = undefined;

/**
 * Ratio of the price, divided by the book value per share.
 * @member {Number} priceBookValue
 */
InlineResponse20014ReportedKeyFiguresFirstFiscalYearRatios.prototype['priceBookValue'] = undefined;

/**
 * Ratio of the price, divided by the cash flow per share.
 * @member {Number} priceCashFlow
 */
InlineResponse20014ReportedKeyFiguresFirstFiscalYearRatios.prototype['priceCashFlow'] = undefined;

/**
 * Ratio of the price, divided by the free (i.e. without subtraction of dividends) cash flow per share.
 * @member {Number} priceFreeCashFlow
 */
InlineResponse20014ReportedKeyFiguresFirstFiscalYearRatios.prototype['priceFreeCashFlow'] = undefined;

/**
 * Ratio of the dividend per share, divided by the price.
 * @member {Number} dividendYield
 */
InlineResponse20014ReportedKeyFiguresFirstFiscalYearRatios.prototype['dividendYield'] = undefined;

/**
 * Ratio of the enterprise value, divided by the EBIT.
 * @member {Number} enterpriseValueEbit
 */
InlineResponse20014ReportedKeyFiguresFirstFiscalYearRatios.prototype['enterpriseValueEbit'] = undefined;

/**
 * Ratio of the enterprise value, divided by the EBITDA.
 * @member {Number} enterpriseValueEbitda
 */
InlineResponse20014ReportedKeyFiguresFirstFiscalYearRatios.prototype['enterpriseValueEbitda'] = undefined;

/**
 * Ratio of the enterprise value, divided by the total amount of sales revenue.
 * @member {Number} enterpriseValueSales
 */
InlineResponse20014ReportedKeyFiguresFirstFiscalYearRatios.prototype['enterpriseValueSales'] = undefined;

/**
 * Total-debt-to-total-equity ratio, which is the ratio of the total debt, divided by the total shareholders' equity.
 * @member {Number} debtEquity
 */
InlineResponse20014ReportedKeyFiguresFirstFiscalYearRatios.prototype['debtEquity'] = undefined;






export default InlineResponse20014ReportedKeyFiguresFirstFiscalYearRatios;

