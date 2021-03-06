/**
 * Stocks API For Digital Portals
 * The stocks API features a screener to search for equity instruments based on stock-specific parameters.  Parameters for up to three fiscal years might now be used in one request; data is available for the ten most recent completed fiscal years. Estimates are available for the current and two consecutive fiscal years.  A separate endpoint returns the possible values and value ranges for the parameters that the endpoint /stock/notation/screener/search accepts: Application developers can request the values and value ranges only for a restricted set of notations that match predefined parameters. This functionality may be used to pre-fill the values and value ranges of the parameters of the /stock/notation/screener/search endpoint so that performing a search always leads to a non-empty set of notations.  The endpoint /stock/notation/ranking/intraday/list ranks stocks notations using intraday figures, for example to build a gainers/losers list.   Additional endpoints include end-of-day benchmark key figures, and selected fundamentals (as of end of fiscal year and with potentially daily updates).  This API is fully integrated with the corresponding Quotes API, allowing access to detailed price and performance information of instruments, as well as basic security identifier cross-reference. For direct access to price histories, please refer to the Time Series API for Digital Portals.  Similar criteria based screener APIs exist for fixed income instruments and securitized derivatives: See the Bonds API and the Securitized Derivatives API for details.
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
import InlineResponse20012DataCompany from './InlineResponse20012DataCompany';
import InlineResponse20012DataCompliance from './InlineResponse20012DataCompliance';
import InlineResponse20012DataEstimates from './InlineResponse20012DataEstimates';
import InlineResponse20012DataIndustryClassification from './InlineResponse20012DataIndustryClassification';
import InlineResponse20012DataMarket from './InlineResponse20012DataMarket';
import InlineResponse20012DataPerformance from './InlineResponse20012DataPerformance';
import InlineResponse20012DataRecommendation from './InlineResponse20012DataRecommendation';
import InlineResponse20012DataReportedKeyFigures from './InlineResponse20012DataReportedKeyFigures';
import InlineResponse20012DataRsiWilder from './InlineResponse20012DataRsiWilder';
import InlineResponse20012DataSimpleMovingAverage from './InlineResponse20012DataSimpleMovingAverage';
import InlineResponse20012DataStockType from './InlineResponse20012DataStockType';
import InlineResponse20012DataTradingValue from './InlineResponse20012DataTradingValue';
import InlineResponse20012DataValueUnit from './InlineResponse20012DataValueUnit';
import InlineResponse20012DataVolatility from './InlineResponse20012DataVolatility';

/**
 * The InlineResponse20012Data model module.
 * @module model/InlineResponse20012Data
 */
class InlineResponse20012Data {
    /**
     * Constructs a new <code>InlineResponse20012Data</code>.
     * Possible values and value ranges of the parameters. 
     * @alias module:model/InlineResponse20012Data
     */
    constructor() { 
        
        InlineResponse20012Data.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>InlineResponse20012Data</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/InlineResponse20012Data} obj Optional instance to populate.
     * @return {module:model/InlineResponse20012Data} The populated <code>InlineResponse20012Data</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new InlineResponse20012Data();

            if (data.hasOwnProperty('totalCount')) {
                obj['totalCount'] = ApiClient.convertToType(data['totalCount'], 'Number');
            }
            if (data.hasOwnProperty('valueUnit')) {
                obj['valueUnit'] = ApiClient.convertToType(data['valueUnit'], [InlineResponse20012DataValueUnit]);
            }
            if (data.hasOwnProperty('market')) {
                obj['market'] = ApiClient.convertToType(data['market'], [InlineResponse20012DataMarket]);
            }
            if (data.hasOwnProperty('stockType')) {
                obj['stockType'] = ApiClient.convertToType(data['stockType'], [InlineResponse20012DataStockType]);
            }
            if (data.hasOwnProperty('industryClassification')) {
                obj['industryClassification'] = ApiClient.convertToType(data['industryClassification'], [InlineResponse20012DataIndustryClassification]);
            }
            if (data.hasOwnProperty('company')) {
                obj['company'] = InlineResponse20012DataCompany.constructFromObject(data['company']);
            }
            if (data.hasOwnProperty('compliance')) {
                obj['compliance'] = InlineResponse20012DataCompliance.constructFromObject(data['compliance']);
            }
            if (data.hasOwnProperty('reportedKeyFigures')) {
                obj['reportedKeyFigures'] = InlineResponse20012DataReportedKeyFigures.constructFromObject(data['reportedKeyFigures']);
            }
            if (data.hasOwnProperty('performance')) {
                obj['performance'] = InlineResponse20012DataPerformance.constructFromObject(data['performance']);
            }
            if (data.hasOwnProperty('volatility')) {
                obj['volatility'] = InlineResponse20012DataVolatility.constructFromObject(data['volatility']);
            }
            if (data.hasOwnProperty('tradingValue')) {
                obj['tradingValue'] = InlineResponse20012DataTradingValue.constructFromObject(data['tradingValue']);
            }
            if (data.hasOwnProperty('simpleMovingAverage')) {
                obj['simpleMovingAverage'] = InlineResponse20012DataSimpleMovingAverage.constructFromObject(data['simpleMovingAverage']);
            }
            if (data.hasOwnProperty('rsiWilder')) {
                obj['rsiWilder'] = InlineResponse20012DataRsiWilder.constructFromObject(data['rsiWilder']);
            }
            if (data.hasOwnProperty('recommendation')) {
                obj['recommendation'] = InlineResponse20012DataRecommendation.constructFromObject(data['recommendation']);
            }
            if (data.hasOwnProperty('estimates')) {
                obj['estimates'] = InlineResponse20012DataEstimates.constructFromObject(data['estimates']);
            }
        }
        return obj;
    }


}

/**
 * Number of notations that satisfy the request parameters, hence have been used to retrieve the possible values and value ranges.
 * @member {Number} totalCount
 */
InlineResponse20012Data.prototype['totalCount'] = undefined;

/**
 * List of value unit identifiers. See endpoint `/basic/valueUnit/list` for possible values.
 * @member {Array.<module:model/InlineResponse20012DataValueUnit>} valueUnit
 */
InlineResponse20012Data.prototype['valueUnit'] = undefined;

/**
 * List of market identifiers. See endpoint `/basic/market/list` for possible values.
 * @member {Array.<module:model/InlineResponse20012DataMarket>} market
 */
InlineResponse20012Data.prototype['market'] = undefined;

/**
 * List of stock types.
 * @member {Array.<module:model/InlineResponse20012DataStockType>} stockType
 */
InlineResponse20012Data.prototype['stockType'] = undefined;

/**
 * Lists of categories of the industry classification. Here, an industry is a category from any level of category system FactSet Revere Business Industry Classification System (RBICS). Starting with the most coarse level (one), for each level of the category system, the list of categories of the stocks, matching the parameters, is returned. See endpoint `/category/listBySystem` with `id=48` for possible values.
 * @member {Array.<module:model/InlineResponse20012DataIndustryClassification>} industryClassification
 */
InlineResponse20012Data.prototype['industryClassification'] = undefined;

/**
 * @member {module:model/InlineResponse20012DataCompany} company
 */
InlineResponse20012Data.prototype['company'] = undefined;

/**
 * @member {module:model/InlineResponse20012DataCompliance} compliance
 */
InlineResponse20012Data.prototype['compliance'] = undefined;

/**
 * @member {module:model/InlineResponse20012DataReportedKeyFigures} reportedKeyFigures
 */
InlineResponse20012Data.prototype['reportedKeyFigures'] = undefined;

/**
 * @member {module:model/InlineResponse20012DataPerformance} performance
 */
InlineResponse20012Data.prototype['performance'] = undefined;

/**
 * @member {module:model/InlineResponse20012DataVolatility} volatility
 */
InlineResponse20012Data.prototype['volatility'] = undefined;

/**
 * @member {module:model/InlineResponse20012DataTradingValue} tradingValue
 */
InlineResponse20012Data.prototype['tradingValue'] = undefined;

/**
 * @member {module:model/InlineResponse20012DataSimpleMovingAverage} simpleMovingAverage
 */
InlineResponse20012Data.prototype['simpleMovingAverage'] = undefined;

/**
 * @member {module:model/InlineResponse20012DataRsiWilder} rsiWilder
 */
InlineResponse20012Data.prototype['rsiWilder'] = undefined;

/**
 * @member {module:model/InlineResponse20012DataRecommendation} recommendation
 */
InlineResponse20012Data.prototype['recommendation'] = undefined;

/**
 * @member {module:model/InlineResponse20012DataEstimates} estimates
 */
InlineResponse20012Data.prototype['estimates'] = undefined;






export default InlineResponse20012Data;

