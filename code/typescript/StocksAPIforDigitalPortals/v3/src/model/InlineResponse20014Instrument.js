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
import InlineResponse20014InstrumentCompany from './InlineResponse20014InstrumentCompany';
import InlineResponse20014InstrumentIndustryClassification from './InlineResponse20014InstrumentIndustryClassification';
import InlineResponse20014InstrumentNsin from './InlineResponse20014InstrumentNsin';
import InlineResponse200DataFsym from './InlineResponse200DataFsym';

/**
 * The InlineResponse20014Instrument model module.
 * @module model/InlineResponse20014Instrument
 */
class InlineResponse20014Instrument {
    /**
     * Constructs a new <code>InlineResponse20014Instrument</code>.
     * Instrument data of the notation.
     * @alias module:model/InlineResponse20014Instrument
     */
    constructor() { 
        
        InlineResponse20014Instrument.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>InlineResponse20014Instrument</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/InlineResponse20014Instrument} obj Optional instance to populate.
     * @return {module:model/InlineResponse20014Instrument} The populated <code>InlineResponse20014Instrument</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new InlineResponse20014Instrument();

            if (data.hasOwnProperty('id')) {
                obj['id'] = ApiClient.convertToType(data['id'], 'String');
            }
            if (data.hasOwnProperty('name')) {
                obj['name'] = ApiClient.convertToType(data['name'], 'String');
            }
            if (data.hasOwnProperty('shortName')) {
                obj['shortName'] = ApiClient.convertToType(data['shortName'], 'String');
            }
            if (data.hasOwnProperty('isin')) {
                obj['isin'] = ApiClient.convertToType(data['isin'], 'String');
            }
            if (data.hasOwnProperty('nsin')) {
                obj['nsin'] = InlineResponse20014InstrumentNsin.constructFromObject(data['nsin']);
            }
            if (data.hasOwnProperty('fsym')) {
                obj['fsym'] = InlineResponse200DataFsym.constructFromObject(data['fsym']);
            }
            if (data.hasOwnProperty('stockType')) {
                obj['stockType'] = ApiClient.convertToType(data['stockType'], 'String');
            }
            if (data.hasOwnProperty('industryClassification')) {
                obj['industryClassification'] = InlineResponse20014InstrumentIndustryClassification.constructFromObject(data['industryClassification']);
            }
            if (data.hasOwnProperty('company')) {
                obj['company'] = InlineResponse20014InstrumentCompany.constructFromObject(data['company']);
            }
        }
        return obj;
    }


}

/**
 * Identifier of the instrument.
 * @member {String} id
 */
InlineResponse20014Instrument.prototype['id'] = undefined;

/**
 * Name of the instrument.
 * @member {String} name
 */
InlineResponse20014Instrument.prototype['name'] = undefined;

/**
 * Short name of the instrument.
 * @member {String} shortName
 */
InlineResponse20014Instrument.prototype['shortName'] = undefined;

/**
 * The International Securities Identification Number (ISIN) of the instrument. The ISIN is a 12-character code of digits and upper-case letters that uniquely identifies an instrument.
 * @member {String} isin
 */
InlineResponse20014Instrument.prototype['isin'] = undefined;

/**
 * @member {module:model/InlineResponse20014InstrumentNsin} nsin
 */
InlineResponse20014Instrument.prototype['nsin'] = undefined;

/**
 * @member {module:model/InlineResponse200DataFsym} fsym
 */
InlineResponse20014Instrument.prototype['fsym'] = undefined;

/**
 * Type of stock.
 * @member {module:model/InlineResponse20014Instrument.StockTypeEnum} stockType
 */
InlineResponse20014Instrument.prototype['stockType'] = undefined;

/**
 * @member {module:model/InlineResponse20014InstrumentIndustryClassification} industryClassification
 */
InlineResponse20014Instrument.prototype['industryClassification'] = undefined;

/**
 * @member {module:model/InlineResponse20014InstrumentCompany} company
 */
InlineResponse20014Instrument.prototype['company'] = undefined;





/**
 * Allowed values for the <code>stockType</code> property.
 * @enum {String}
 * @readonly
 */
InlineResponse20014Instrument['StockTypeEnum'] = {

    /**
     * value: "common"
     * @const
     */
    "common": "common",

    /**
     * value: "preferred"
     * @const
     */
    "preferred": "preferred",

    /**
     * value: "depositoryReceipt"
     * @const
     */
    "depositoryReceipt": "depositoryReceipt",

    /**
     * value: "other"
     * @const
     */
    "other": "other"
};



export default InlineResponse20014Instrument;

