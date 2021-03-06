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
 * The NotationSearchByTextDataValidationPricesLatest model module.
 * @module model/NotationSearchByTextDataValidationPricesLatest
 */
class NotationSearchByTextDataValidationPricesLatest {
    /**
     * Constructs a new <code>NotationSearchByTextDataValidationPricesLatest</code>.
     * Parameters related to the presence and age of the most recent trade price.
     * @alias module:model/NotationSearchByTextDataValidationPricesLatest
     */
    constructor() { 
        
        NotationSearchByTextDataValidationPricesLatest.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>NotationSearchByTextDataValidationPricesLatest</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/NotationSearchByTextDataValidationPricesLatest} obj Optional instance to populate.
     * @return {module:model/NotationSearchByTextDataValidationPricesLatest} The populated <code>NotationSearchByTextDataValidationPricesLatest</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new NotationSearchByTextDataValidationPricesLatest();

            if (data.hasOwnProperty('availableOnly')) {
                obj['availableOnly'] = ApiClient.convertToType(data['availableOnly'], 'Boolean');
            }
            if (data.hasOwnProperty('minimumDate')) {
                obj['minimumDate'] = ApiClient.convertToType(data['minimumDate'], 'Date');
            }
        }
        return obj;
    }


}

/**
 * If `true`, only notations for which a trade price (even an outdated one) is available will be returned.
 * @member {Boolean} availableOnly
 */
NotationSearchByTextDataValidationPricesLatest.prototype['availableOnly'] = undefined;

/**
 * Earliest admissible date of the most recent trade price.
 * @member {Date} minimumDate
 */
NotationSearchByTextDataValidationPricesLatest.prototype['minimumDate'] = undefined;






export default NotationSearchByTextDataValidationPricesLatest;

