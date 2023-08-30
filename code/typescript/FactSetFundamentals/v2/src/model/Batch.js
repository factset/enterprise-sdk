/**
 * FactSet Fundamentals API
 * Gain access to current, comprehensive, and comparative information on securities in worldwide developed and emerging markets. Composed of annual and interim/quarterly data, detailed historical financial statement content, per-share data, and calculated ratios, FactSet Fundamentals provides you with the information you need for a global investment perspective. 
 *
 * The version of the OpenAPI document: 2.0.0
 * Contact: api@factset.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 *
 */

import ApiClient from '../ApiClient';
/**
* Enum class Batch.
* @enum {}
* @readonly
*/
export default class Batch {
    
        /**
         * value: "Y"
         * @const
         */
        "Y" = "Y";

    
        /**
         * value: "N"
         * @const
         */
        "N" = "N";

    

    /**
    * Returns a <code>Batch</code> enum value from a Javascript object name.
    * @param {Object} data The plain JavaScript object containing the name of the enum value.
    * @return {module:model/Batch} The enum <code>Batch</code> value.
    */
    static constructFromObject(object) {
        return object;
    }
}
