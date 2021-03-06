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

/**
 * The StockNotationScreenerSearchDataValidationValueUnitRestrict model module.
 * @module model/StockNotationScreenerSearchDataValidationValueUnitRestrict
 */
class StockNotationScreenerSearchDataValidationValueUnitRestrict {
    /**
     * Constructs a new <code>StockNotationScreenerSearchDataValidationValueUnitRestrict</code>.
     * Specifies the value units a notation may have.
     * @alias module:model/StockNotationScreenerSearchDataValidationValueUnitRestrict
     */
    constructor() { 
        
        StockNotationScreenerSearchDataValidationValueUnitRestrict.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>StockNotationScreenerSearchDataValidationValueUnitRestrict</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/StockNotationScreenerSearchDataValidationValueUnitRestrict} obj Optional instance to populate.
     * @return {module:model/StockNotationScreenerSearchDataValidationValueUnitRestrict} The populated <code>StockNotationScreenerSearchDataValidationValueUnitRestrict</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new StockNotationScreenerSearchDataValidationValueUnitRestrict();

            if (data.hasOwnProperty('ids')) {
                obj['ids'] = ApiClient.convertToType(data['ids'], ['Number']);
            }
        }
        return obj;
    }


}

/**
 * Set of value unit identifiers.
 * @member {Array.<Number>} ids
 */
StockNotationScreenerSearchDataValidationValueUnitRestrict.prototype['ids'] = undefined;






export default StockNotationScreenerSearchDataValidationValueUnitRestrict;

