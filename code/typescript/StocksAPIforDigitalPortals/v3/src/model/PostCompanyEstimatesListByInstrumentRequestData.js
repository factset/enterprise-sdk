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
import PostCompanyEstimatesListByInstrumentRequestDataCurrency from './PostCompanyEstimatesListByInstrumentRequestDataCurrency';
import PostCompanyEstimatesListByInstrumentRequestDataFiscalYears from './PostCompanyEstimatesListByInstrumentRequestDataFiscalYears';

/**
 * The PostCompanyEstimatesListByInstrumentRequestData model module.
 * @module model/PostCompanyEstimatesListByInstrumentRequestData
 */
class PostCompanyEstimatesListByInstrumentRequestData {
    /**
     * Constructs a new <code>PostCompanyEstimatesListByInstrumentRequestData</code>.
     * The data member contains the request&#39;s primary data.
     * @alias module:model/PostCompanyEstimatesListByInstrumentRequestData
     * @param id {String} Identifier of the instrument
     * @param currency {module:model/PostCompanyEstimatesListByInstrumentRequestDataCurrency} 
     */
    constructor(id, currency) { 
        
        PostCompanyEstimatesListByInstrumentRequestData.initialize(this, id, currency);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj, id, currency) { 
        obj['id'] = id;
        obj['currency'] = currency;
    }

    /**
     * Constructs a <code>PostCompanyEstimatesListByInstrumentRequestData</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/PostCompanyEstimatesListByInstrumentRequestData} obj Optional instance to populate.
     * @return {module:model/PostCompanyEstimatesListByInstrumentRequestData} The populated <code>PostCompanyEstimatesListByInstrumentRequestData</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new PostCompanyEstimatesListByInstrumentRequestData();

            if (data.hasOwnProperty('id')) {
                obj['id'] = ApiClient.convertToType(data['id'], 'String');
            }
            if (data.hasOwnProperty('fiscalYears')) {
                obj['fiscalYears'] = PostCompanyEstimatesListByInstrumentRequestDataFiscalYears.constructFromObject(data['fiscalYears']);
            }
            if (data.hasOwnProperty('currency')) {
                obj['currency'] = PostCompanyEstimatesListByInstrumentRequestDataCurrency.constructFromObject(data['currency']);
            }
        }
        return obj;
    }


}

/**
 * Identifier of the instrument
 * @member {String} id
 */
PostCompanyEstimatesListByInstrumentRequestData.prototype['id'] = undefined;

/**
 * @member {module:model/PostCompanyEstimatesListByInstrumentRequestDataFiscalYears} fiscalYears
 */
PostCompanyEstimatesListByInstrumentRequestData.prototype['fiscalYears'] = undefined;

/**
 * @member {module:model/PostCompanyEstimatesListByInstrumentRequestDataCurrency} currency
 */
PostCompanyEstimatesListByInstrumentRequestData.prototype['currency'] = undefined;






export default PostCompanyEstimatesListByInstrumentRequestData;

