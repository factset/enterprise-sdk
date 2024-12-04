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
* Enum class RampDownHoldings.
* @enum {}
* @readonly
*/
export default class RampDownHoldings {
    
        /**
         * value: "all"
         * @const
         */
        "all" = "all";

    
        /**
         * value: "a month"
         * @const
         */
        "a month" = "a month";

    
        /**
         * value: "months"
         * @const
         */
        "months" = "months";

    
        /**
         * value: "years"
         * @const
         */
        "years" = "years";

    

    /**
    * Returns a <code>RampDownHoldings</code> enum value from a Javascript object name.
    * @param {Object} data The plain JavaScript object containing the name of the enum value.
    * @return {module:model/RampDownHoldings} The enum <code>RampDownHoldings</code> value.
    */
    static constructFromObject(object) {
        return object;
    }
}

