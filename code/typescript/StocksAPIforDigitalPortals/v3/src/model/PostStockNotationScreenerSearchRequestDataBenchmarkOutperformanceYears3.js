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
import PostStockNotationScreenerSearchRequestDataEbitMarginMaximum from './PostStockNotationScreenerSearchRequestDataEbitMarginMaximum';
import PostStockNotationScreenerSearchRequestDataEbitMarginMinimum from './PostStockNotationScreenerSearchRequestDataEbitMarginMinimum';

/**
 * The PostStockNotationScreenerSearchRequestDataBenchmarkOutperformanceYears3 model module.
 * @module model/PostStockNotationScreenerSearchRequestDataBenchmarkOutperformanceYears3
 */
class PostStockNotationScreenerSearchRequestDataBenchmarkOutperformanceYears3 {
    /**
     * Constructs a new <code>PostStockNotationScreenerSearchRequestDataBenchmarkOutperformanceYears3</code>.
     * Value range for the time range three years.
     * @alias module:model/PostStockNotationScreenerSearchRequestDataBenchmarkOutperformanceYears3
     */
    constructor() { 
        
        PostStockNotationScreenerSearchRequestDataBenchmarkOutperformanceYears3.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>PostStockNotationScreenerSearchRequestDataBenchmarkOutperformanceYears3</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/PostStockNotationScreenerSearchRequestDataBenchmarkOutperformanceYears3} obj Optional instance to populate.
     * @return {module:model/PostStockNotationScreenerSearchRequestDataBenchmarkOutperformanceYears3} The populated <code>PostStockNotationScreenerSearchRequestDataBenchmarkOutperformanceYears3</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new PostStockNotationScreenerSearchRequestDataBenchmarkOutperformanceYears3();

            if (data.hasOwnProperty('minimum')) {
                obj['minimum'] = PostStockNotationScreenerSearchRequestDataEbitMarginMinimum.constructFromObject(data['minimum']);
            }
            if (data.hasOwnProperty('maximum')) {
                obj['maximum'] = PostStockNotationScreenerSearchRequestDataEbitMarginMaximum.constructFromObject(data['maximum']);
            }
        }
        return obj;
    }


}

/**
 * @member {module:model/PostStockNotationScreenerSearchRequestDataEbitMarginMinimum} minimum
 */
PostStockNotationScreenerSearchRequestDataBenchmarkOutperformanceYears3.prototype['minimum'] = undefined;

/**
 * @member {module:model/PostStockNotationScreenerSearchRequestDataEbitMarginMaximum} maximum
 */
PostStockNotationScreenerSearchRequestDataBenchmarkOutperformanceYears3.prototype['maximum'] = undefined;






export default PostStockNotationScreenerSearchRequestDataBenchmarkOutperformanceYears3;

