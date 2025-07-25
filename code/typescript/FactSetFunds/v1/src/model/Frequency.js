/**
 * FactSet Funds API
 * FactSet Mutual Funds data offers over 50 fund- and share class-specific data points for mutual funds listed in the United States. <p>FactSet Mutual Funds Reference provides fund-specific reference information as well as FactSet's proprietary classification system. It includes but is not limited to the following coverage    * Fund descriptions    * A seven-tier classification system   * Leverage information   * Fees and expenses    * Portfolio managers       FactSet Mutual Funds Time Series provides quantitative data items on a historical basis. It includes but is not limited to the following coverage    * Net asset value   * Fund flows    * Assets under management   * Total return  <p>This API is rate-limited to 10 requests per second and 10 concurrent requests per user.</p> 
 *
 * The version of the OpenAPI document: 1.4.0
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
         * value: "D"
         * @const
         */
        "D" = "D";

    
        /**
         * value: "W"
         * @const
         */
        "W" = "W";

    
        /**
         * value: "M"
         * @const
         */
        "M" = "M";

    
        /**
         * value: "AM"
         * @const
         */
        "AM" = "AM";

    
        /**
         * value: "CQ"
         * @const
         */
        "CQ" = "CQ";

    
        /**
         * value: "FQ"
         * @const
         */
        "FQ" = "FQ";

    
        /**
         * value: "AY"
         * @const
         */
        "AY" = "AY";

    
        /**
         * value: "CY"
         * @const
         */
        "CY" = "CY";

    
        /**
         * value: "FY"
         * @const
         */
        "FY" = "FY";

    

    /**
    * Returns a <code>Frequency</code> enum value from a Javascript object name.
    * @param {Object} data The plain JavaScript object containing the name of the enum value.
    * @return {module:model/Frequency} The enum <code>Frequency</code> value.
    */
    static constructFromObject(object) {
        return object;
    }
}

