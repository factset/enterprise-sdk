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
import NotationSearchByTextDataValidationPricesLatest from './NotationSearchByTextDataValidationPricesLatest';
import NotationSearchByTextDataValidationPricesPrevious from './NotationSearchByTextDataValidationPricesPrevious';

/**
 * The NotationSearchByTextDataValidationPrices model module.
 * @module model/NotationSearchByTextDataValidationPrices
 */
class NotationSearchByTextDataValidationPrices {
    /**
     * Constructs a new <code>NotationSearchByTextDataValidationPrices</code>.
     * Price-related parameters.
     * @alias module:model/NotationSearchByTextDataValidationPrices
     */
    constructor() { 
        
        NotationSearchByTextDataValidationPrices.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>NotationSearchByTextDataValidationPrices</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/NotationSearchByTextDataValidationPrices} obj Optional instance to populate.
     * @return {module:model/NotationSearchByTextDataValidationPrices} The populated <code>NotationSearchByTextDataValidationPrices</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new NotationSearchByTextDataValidationPrices();

            if (data.hasOwnProperty('quality')) {
                obj['quality'] = ApiClient.convertToType(data['quality'], 'String');
            }
            if (data.hasOwnProperty('latest')) {
                obj['latest'] = NotationSearchByTextDataValidationPricesLatest.constructFromObject(data['latest']);
            }
            if (data.hasOwnProperty('previous')) {
                obj['previous'] = NotationSearchByTextDataValidationPricesPrevious.constructFromObject(data['previous']);
            }
        }
        return obj;
    }


}

/**
 * Quality of the price.
 * @member {module:model/NotationSearchByTextDataValidationPrices.QualityEnum} quality
 * @default 'EOD'
 */
NotationSearchByTextDataValidationPrices.prototype['quality'] = 'EOD';

/**
 * @member {module:model/NotationSearchByTextDataValidationPricesLatest} latest
 */
NotationSearchByTextDataValidationPrices.prototype['latest'] = undefined;

/**
 * @member {module:model/NotationSearchByTextDataValidationPricesPrevious} previous
 */
NotationSearchByTextDataValidationPrices.prototype['previous'] = undefined;





/**
 * Allowed values for the <code>quality</code> property.
 * @enum {String}
 * @readonly
 */
NotationSearchByTextDataValidationPrices['QualityEnum'] = {

    /**
     * value: "DLY"
     * @const
     */
    "DLY": "DLY",

    /**
     * value: "EOD"
     * @const
     */
    "EOD": "EOD"
};



export default NotationSearchByTextDataValidationPrices;

