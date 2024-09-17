/**
 * FactSet People API
 * The FactSet People API exposes FactSet data for individuals and their jobs.<p>This API is rate-limited to 10 requests per second and 10 concurrent requests per user.</p> 
 *
 * The version of the OpenAPI document: 1.3.0
 * Contact: api@factset.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 *
 */

import ApiClient from '../ApiClient';
/**
* Enum class Level.
* @enum {}
* @readonly
*/
export default class Level {
    
        /**
         * value: "SUMMARY"
         * @const
         */
        "SUMMARY" = "SUMMARY";

    
        /**
         * value: "DETAIL"
         * @const
         */
        "DETAIL" = "DETAIL";

    

    /**
    * Returns a <code>Level</code> enum value from a Javascript object name.
    * @param {Object} data The plain JavaScript object containing the name of the enum value.
    * @return {module:model/Level} The enum <code>Level</code> value.
    */
    static constructFromObject(object) {
        return object;
    }
}

