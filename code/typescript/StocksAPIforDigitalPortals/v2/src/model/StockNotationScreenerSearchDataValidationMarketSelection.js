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
import StockNotationScreenerSearchDataValidationMarketSelectionExclude from './StockNotationScreenerSearchDataValidationMarketSelectionExclude';
import StockNotationScreenerSearchDataValidationMarketSelectionRestrict from './StockNotationScreenerSearchDataValidationMarketSelectionRestrict';

/**
 * The StockNotationScreenerSearchDataValidationMarketSelection model module.
 * @module model/StockNotationScreenerSearchDataValidationMarketSelection
 */
class StockNotationScreenerSearchDataValidationMarketSelection {
    /**
     * Constructs a new <code>StockNotationScreenerSearchDataValidationMarketSelection</code>.
     * Market selection.
     * @alias module:model/StockNotationScreenerSearchDataValidationMarketSelection
     */
    constructor() { 
        
        StockNotationScreenerSearchDataValidationMarketSelection.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>StockNotationScreenerSearchDataValidationMarketSelection</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/StockNotationScreenerSearchDataValidationMarketSelection} obj Optional instance to populate.
     * @return {module:model/StockNotationScreenerSearchDataValidationMarketSelection} The populated <code>StockNotationScreenerSearchDataValidationMarketSelection</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new StockNotationScreenerSearchDataValidationMarketSelection();

            if (data.hasOwnProperty('restrict')) {
                obj['restrict'] = StockNotationScreenerSearchDataValidationMarketSelectionRestrict.constructFromObject(data['restrict']);
            }
            if (data.hasOwnProperty('exclude')) {
                obj['exclude'] = StockNotationScreenerSearchDataValidationMarketSelectionExclude.constructFromObject(data['exclude']);
            }
        }
        return obj;
    }


}

/**
 * @member {module:model/StockNotationScreenerSearchDataValidationMarketSelectionRestrict} restrict
 */
StockNotationScreenerSearchDataValidationMarketSelection.prototype['restrict'] = undefined;

/**
 * @member {module:model/StockNotationScreenerSearchDataValidationMarketSelectionExclude} exclude
 */
StockNotationScreenerSearchDataValidationMarketSelection.prototype['exclude'] = undefined;






export default StockNotationScreenerSearchDataValidationMarketSelection;

