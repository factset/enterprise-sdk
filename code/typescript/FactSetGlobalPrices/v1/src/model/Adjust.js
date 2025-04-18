/**
 * FactSet Global Prices API
 * The FactSet Global Prices API provides end of day market pricing content using cloud and microservices technology, encompassing both pricing as well as corporate actions and events data.</p> 
 *
 * The version of the OpenAPI document: 1.8.0
 * Contact: api@factset.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 *
 */

import ApiClient from '../ApiClient';
/**
* Enum class Adjust.
* @enum {}
* @readonly
*/
export default class Adjust {
    
        /**
         * value: "SPLIT"
         * @const
         */
        "SPLIT" = "SPLIT";

    
        /**
         * value: "SPLIT_SPINOFF"
         * @const
         */
        "SPLIT_SPINOFF" = "SPLIT_SPINOFF";

    
        /**
         * value: "DIV_SPIN_SPLITS"
         * @const
         */
        "DIV_SPIN_SPLITS" = "DIV_SPIN_SPLITS";

    
        /**
         * value: "UNSPLIT"
         * @const
         */
        "UNSPLIT" = "UNSPLIT";

    

    /**
    * Returns a <code>Adjust</code> enum value from a Javascript object name.
    * @param {Object} data The plain JavaScript object containing the name of the enum value.
    * @return {module:model/Adjust} The enum <code>Adjust</code> value.
    */
    static constructFromObject(object) {
        return object;
    }
}

