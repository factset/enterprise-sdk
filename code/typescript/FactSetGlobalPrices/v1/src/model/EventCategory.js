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
* Enum class EventCategory.
* @enum {}
* @readonly
*/
export default class EventCategory {
    
        /**
         * value: "CASH_DIVS"
         * @const
         */
        "CASH_DIVS" = "CASH_DIVS";

    
        /**
         * value: "STOCK_DIST"
         * @const
         */
        "STOCK_DIST" = "STOCK_DIST";

    
        /**
         * value: "RIGHTS"
         * @const
         */
        "RIGHTS" = "RIGHTS";

    
        /**
         * value: "SPINOFFS"
         * @const
         */
        "SPINOFFS" = "SPINOFFS";

    
        /**
         * value: "SPLITS"
         * @const
         */
        "SPLITS" = "SPLITS";

    
        /**
         * value: "ALL"
         * @const
         */
        "ALL" = "ALL";

    

    /**
    * Returns a <code>EventCategory</code> enum value from a Javascript object name.
    * @param {Object} data The plain JavaScript object containing the name of the enum value.
    * @return {module:model/EventCategory} The enum <code>EventCategory</code> value.
    */
    static constructFromObject(object) {
        return object;
    }
}

