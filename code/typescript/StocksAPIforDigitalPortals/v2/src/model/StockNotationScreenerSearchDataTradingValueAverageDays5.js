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
import StockNotationScreenerSearchDataCurrencyDependentKeyFiguresMarketCapitalizationMaximum from './StockNotationScreenerSearchDataCurrencyDependentKeyFiguresMarketCapitalizationMaximum';
import StockNotationScreenerSearchDataCurrencyDependentKeyFiguresMarketCapitalizationMinimum from './StockNotationScreenerSearchDataCurrencyDependentKeyFiguresMarketCapitalizationMinimum';

/**
 * The StockNotationScreenerSearchDataTradingValueAverageDays5 model module.
 * @module model/StockNotationScreenerSearchDataTradingValueAverageDays5
 */
class StockNotationScreenerSearchDataTradingValueAverageDays5 {
    /**
     * Constructs a new <code>StockNotationScreenerSearchDataTradingValueAverageDays5</code>.
     * Value range for the time range five trading days.
     * @alias module:model/StockNotationScreenerSearchDataTradingValueAverageDays5
     */
    constructor() { 
        
        StockNotationScreenerSearchDataTradingValueAverageDays5.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>StockNotationScreenerSearchDataTradingValueAverageDays5</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/StockNotationScreenerSearchDataTradingValueAverageDays5} obj Optional instance to populate.
     * @return {module:model/StockNotationScreenerSearchDataTradingValueAverageDays5} The populated <code>StockNotationScreenerSearchDataTradingValueAverageDays5</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new StockNotationScreenerSearchDataTradingValueAverageDays5();

            if (data.hasOwnProperty('minimum')) {
                obj['minimum'] = StockNotationScreenerSearchDataCurrencyDependentKeyFiguresMarketCapitalizationMinimum.constructFromObject(data['minimum']);
            }
            if (data.hasOwnProperty('maximum')) {
                obj['maximum'] = StockNotationScreenerSearchDataCurrencyDependentKeyFiguresMarketCapitalizationMaximum.constructFromObject(data['maximum']);
            }
        }
        return obj;
    }


}

/**
 * @member {module:model/StockNotationScreenerSearchDataCurrencyDependentKeyFiguresMarketCapitalizationMinimum} minimum
 */
StockNotationScreenerSearchDataTradingValueAverageDays5.prototype['minimum'] = undefined;

/**
 * @member {module:model/StockNotationScreenerSearchDataCurrencyDependentKeyFiguresMarketCapitalizationMaximum} maximum
 */
StockNotationScreenerSearchDataTradingValueAverageDays5.prototype['maximum'] = undefined;






export default StockNotationScreenerSearchDataTradingValueAverageDays5;

