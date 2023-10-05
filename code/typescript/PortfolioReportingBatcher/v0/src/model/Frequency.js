/**
 * Portfolio Reporting Batcher
 * The Portfolio Reporting Batcher (PRB) API allows clients to systematically leverage functionalities of the PRB application. With the initial release, clients can - trigger existing jobs - check status of running jobs - get various details of existing jobs
 *
 * The version of the OpenAPI document: 0.2.0
 * Contact: api@factset.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 *
 */

import ApiClient from '../ApiClient';
/**
* Enum class Frequency.
* @enum {}
* @readonly
*/
export default class Frequency {
    
        /**
         * value: "daily"
         * @const
         */
        "daily" = "daily";

    
        /**
         * value: "monthly"
         * @const
         */
        "monthly" = "monthly";

    
        /**
         * value: "weekly"
         * @const
         */
        "weekly" = "weekly";

    

    /**
    * Returns a <code>Frequency</code> enum value from a Javascript object name.
    * @param {Object} data The plain JavaScript object containing the name of the enum value.
    * @return {module:model/Frequency} The enum <code>Frequency</code> value.
    */
    static constructFromObject(object) {
        return object;
    }
}

