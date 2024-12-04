/**
 * Cabot Models API
 * Cabot Models API
 *
 * The version of the OpenAPI document: 0.3.0
 * Contact: api@factset.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 *
 */

import ApiClient from '../ApiClient';
/**
* Enum class Currency.
* @enum {}
* @readonly
*/
export default class Currency {
    
        /**
         * value: "USD"
         * @const
         */
        "USD" = "USD";

    
        /**
         * value: "CAD"
         * @const
         */
        "CAD" = "CAD";

    
        /**
         * value: "EUR"
         * @const
         */
        "EUR" = "EUR";

    
        /**
         * value: "GBP"
         * @const
         */
        "GBP" = "GBP";

    
        /**
         * value: "JPY"
         * @const
         */
        "JPY" = "JPY";

    
        /**
         * value: "AUD"
         * @const
         */
        "AUD" = "AUD";

    

    /**
    * Returns a <code>Currency</code> enum value from a Javascript object name.
    * @param {Object} data The plain JavaScript object containing the name of the enum value.
    * @return {module:model/Currency} The enum <code>Currency</code> value.
    */
    static constructFromObject(object) {
        return object;
    }
}

