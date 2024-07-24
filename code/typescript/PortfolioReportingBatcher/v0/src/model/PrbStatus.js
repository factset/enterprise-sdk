/**
 * Portfolio Reporting Batcher
 * The Portfolio Reporting Batcher (PRB) API allows clients to systematically leverage functionalities of the PRB application.
 *
 * The version of the OpenAPI document: 0.6.0
 * Contact: api@factset.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 *
 */

import ApiClient from '../ApiClient';
/**
* Enum class PrbStatus.
* @enum {}
* @readonly
*/
export default class PrbStatus {
    
        /**
         * value: "failed"
         * @const
         */
        "failed" = "failed";

    
        /**
         * value: "pending"
         * @const
         */
        "pending" = "pending";

    
        /**
         * value: "running"
         * @const
         */
        "running" = "running";

    
        /**
         * value: "soft"
         * @const
         */
        "soft" = "soft";

    
        /**
         * value: "stopped"
         * @const
         */
        "stopped" = "stopped";

    
        /**
         * value: "success"
         * @const
         */
        "success" = "success";

    
        /**
         * value: "warning"
         * @const
         */
        "warning" = "warning";

    

    /**
    * Returns a <code>PrbStatus</code> enum value from a Javascript object name.
    * @param {Object} data The plain JavaScript object containing the name of the enum value.
    * @return {module:model/PrbStatus} The enum <code>PrbStatus</code> value.
    */
    static constructFromObject(object) {
        return object;
    }
}

