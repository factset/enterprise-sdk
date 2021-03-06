/**
 * Prime Developer Trial
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: v1
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 *
 */

import ApiClient from '../ApiClient';
import StockNotationScreenerSearchDataCompany from './StockNotationScreenerSearchDataCompany';
import StockNotationScreenerSearchDataCompliance from './StockNotationScreenerSearchDataCompliance';
import StockNotationScreenerSearchDataEstimates from './StockNotationScreenerSearchDataEstimates';
import StockNotationScreenerSearchDataIndexMembership from './StockNotationScreenerSearchDataIndexMembership';
import StockNotationScreenerSearchDataIndustryClassification from './StockNotationScreenerSearchDataIndustryClassification';
import StockNotationScreenerSearchDataPerformance from './StockNotationScreenerSearchDataPerformance';
import StockNotationScreenerSearchDataRecommendation from './StockNotationScreenerSearchDataRecommendation';
import StockNotationScreenerSearchDataReportedKeyFigures from './StockNotationScreenerSearchDataReportedKeyFigures';
import StockNotationScreenerSearchDataRsiWilder from './StockNotationScreenerSearchDataRsiWilder';
import StockNotationScreenerSearchDataSimpleMovingAverage from './StockNotationScreenerSearchDataSimpleMovingAverage';
import StockNotationScreenerSearchDataTradingValue from './StockNotationScreenerSearchDataTradingValue';
import StockNotationScreenerSearchDataValidation from './StockNotationScreenerSearchDataValidation';
import StockNotationScreenerSearchDataVolatility from './StockNotationScreenerSearchDataVolatility';

/**
 * The StockNotationScreenerSearchData model module.
 * @module model/StockNotationScreenerSearchData
 */
class StockNotationScreenerSearchData {
    /**
     * Constructs a new <code>StockNotationScreenerSearchData</code>.
     * The data member contains the request&#39;s primary data.
     * @alias module:model/StockNotationScreenerSearchData
     */
    constructor() { 
        
        StockNotationScreenerSearchData.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>StockNotationScreenerSearchData</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/StockNotationScreenerSearchData} obj Optional instance to populate.
     * @return {module:model/StockNotationScreenerSearchData} The populated <code>StockNotationScreenerSearchData</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new StockNotationScreenerSearchData();

            if (data.hasOwnProperty('validation')) {
                obj['validation'] = StockNotationScreenerSearchDataValidation.constructFromObject(data['validation']);
            }
            if (data.hasOwnProperty('stockType')) {
                obj['stockType'] = ApiClient.convertToType(data['stockType'], ['String']);
            }
            if (data.hasOwnProperty('industryClassification')) {
                obj['industryClassification'] = StockNotationScreenerSearchDataIndustryClassification.constructFromObject(data['industryClassification']);
            }
            if (data.hasOwnProperty('company')) {
                obj['company'] = StockNotationScreenerSearchDataCompany.constructFromObject(data['company']);
            }
            if (data.hasOwnProperty('indexMembership')) {
                obj['indexMembership'] = StockNotationScreenerSearchDataIndexMembership.constructFromObject(data['indexMembership']);
            }
            if (data.hasOwnProperty('compliance')) {
                obj['compliance'] = StockNotationScreenerSearchDataCompliance.constructFromObject(data['compliance']);
            }
            if (data.hasOwnProperty('reportedKeyFigures')) {
                obj['reportedKeyFigures'] = ApiClient.convertToType(data['reportedKeyFigures'], [StockNotationScreenerSearchDataReportedKeyFigures]);
            }
            if (data.hasOwnProperty('performance')) {
                obj['performance'] = StockNotationScreenerSearchDataPerformance.constructFromObject(data['performance']);
            }
            if (data.hasOwnProperty('volatility')) {
                obj['volatility'] = StockNotationScreenerSearchDataVolatility.constructFromObject(data['volatility']);
            }
            if (data.hasOwnProperty('tradingValue')) {
                obj['tradingValue'] = StockNotationScreenerSearchDataTradingValue.constructFromObject(data['tradingValue']);
            }
            if (data.hasOwnProperty('simpleMovingAverage')) {
                obj['simpleMovingAverage'] = StockNotationScreenerSearchDataSimpleMovingAverage.constructFromObject(data['simpleMovingAverage']);
            }
            if (data.hasOwnProperty('rsiWilder')) {
                obj['rsiWilder'] = StockNotationScreenerSearchDataRsiWilder.constructFromObject(data['rsiWilder']);
            }
            if (data.hasOwnProperty('recommendation')) {
                obj['recommendation'] = StockNotationScreenerSearchDataRecommendation.constructFromObject(data['recommendation']);
            }
            if (data.hasOwnProperty('estimates')) {
                obj['estimates'] = ApiClient.convertToType(data['estimates'], [StockNotationScreenerSearchDataEstimates]);
            }
        }
        return obj;
    }


}

/**
 * @member {module:model/StockNotationScreenerSearchDataValidation} validation
 */
StockNotationScreenerSearchData.prototype['validation'] = undefined;

/**
 * Type of stock.
 * @member {Array.<module:model/StockNotationScreenerSearchData.StockTypeEnum>} stockType
 */
StockNotationScreenerSearchData.prototype['stockType'] = undefined;

/**
 * @member {module:model/StockNotationScreenerSearchDataIndustryClassification} industryClassification
 */
StockNotationScreenerSearchData.prototype['industryClassification'] = undefined;

/**
 * @member {module:model/StockNotationScreenerSearchDataCompany} company
 */
StockNotationScreenerSearchData.prototype['company'] = undefined;

/**
 * @member {module:model/StockNotationScreenerSearchDataIndexMembership} indexMembership
 */
StockNotationScreenerSearchData.prototype['indexMembership'] = undefined;

/**
 * @member {module:model/StockNotationScreenerSearchDataCompliance} compliance
 */
StockNotationScreenerSearchData.prototype['compliance'] = undefined;

/**
 * Parameters for stock-specific key figures as reported for a fiscal year.
 * @member {Array.<module:model/StockNotationScreenerSearchDataReportedKeyFigures>} reportedKeyFigures
 */
StockNotationScreenerSearchData.prototype['reportedKeyFigures'] = undefined;

/**
 * @member {module:model/StockNotationScreenerSearchDataPerformance} performance
 */
StockNotationScreenerSearchData.prototype['performance'] = undefined;

/**
 * @member {module:model/StockNotationScreenerSearchDataVolatility} volatility
 */
StockNotationScreenerSearchData.prototype['volatility'] = undefined;

/**
 * @member {module:model/StockNotationScreenerSearchDataTradingValue} tradingValue
 */
StockNotationScreenerSearchData.prototype['tradingValue'] = undefined;

/**
 * @member {module:model/StockNotationScreenerSearchDataSimpleMovingAverage} simpleMovingAverage
 */
StockNotationScreenerSearchData.prototype['simpleMovingAverage'] = undefined;

/**
 * @member {module:model/StockNotationScreenerSearchDataRsiWilder} rsiWilder
 */
StockNotationScreenerSearchData.prototype['rsiWilder'] = undefined;

/**
 * @member {module:model/StockNotationScreenerSearchDataRecommendation} recommendation
 */
StockNotationScreenerSearchData.prototype['recommendation'] = undefined;

/**
 * Parameters for stock-specific consolidated estimates for a fiscal year.
 * @member {Array.<module:model/StockNotationScreenerSearchDataEstimates>} estimates
 */
StockNotationScreenerSearchData.prototype['estimates'] = undefined;





/**
 * Allowed values for the <code>stockType</code> property.
 * @enum {String}
 * @readonly
 */
StockNotationScreenerSearchData['StockTypeEnum'] = {

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



export default StockNotationScreenerSearchData;

