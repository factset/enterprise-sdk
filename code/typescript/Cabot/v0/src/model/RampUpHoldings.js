/**
 * Cabot Models API
 * Cabot Models API
 *
 * The version of the OpenAPI document: 0.4.0
 * Contact: api@factset.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 *
 */

import ApiClient from '../ApiClient';
/**
* Enum class RampUpHoldings.
* @enum {}
* @readonly
*/
export default class RampUpHoldings {
    
        /**
         * value: "all"
         * @const
         */
        "all" = "all";

    
        /**
         * value: "immediate"
         * @const
         */
        "immediate" = "immediate";

    
        /**
         * value: "days"
         * @const
         */
        "days" = "days";

    
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
    * Returns a <code>RampUpHoldings</code> enum value from a Javascript object name.
    * @param {Object} data The plain JavaScript object containing the name of the enum value.
    * @return {module:model/RampUpHoldings} The enum <code>RampUpHoldings</code> value.
    */
    static constructFromObject(object) {
        return object;
    }
}

