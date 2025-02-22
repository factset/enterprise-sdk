/**
 * Portfolio Reporting Batcher
 * The Portfolio Reporting Batcher (PRB) API allows clients to systematically leverage functionalities of the PRB application.
 *
 * The version of the OpenAPI document: 1.0.0
 * Contact: api@factset.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 *
 */

import ApiClient from '../ApiClient';
/**
* Enum class Status.
* @enum {}
* @readonly
*/
export default class Status {
    
        /**
         * value: "cancelled"
         * @const
         */
        "cancelled" = "cancelled";

    
        /**
         * value: "created"
         * @const
         */
        "created" = "created";

    
        /**
         * value: "executing"
         * @const
         */
        "executing" = "executing";

    
        /**
         * value: "failed"
         * @const
         */
        "failed" = "failed";

    
        /**
         * value: "queued"
         * @const
         */
        "queued" = "queued";

    

    /**
    * Returns a <code>Status</code> enum value from a Javascript object name.
    * @param {Object} data The plain JavaScript object containing the name of the enum value.
    * @return {module:model/Status} The enum <code>Status</code> value.
    */
    static constructFromObject(object) {
        return object;
    }
}

