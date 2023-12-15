/**
 * FactSet Search Answers API
 * The FactSet Search Answers API provides answers to search queries, reflecting the data shown within FactSet Search Answers, and allowing you to easily add financial data to your widgets, lookups, bots, and assistants. The API understands a fixed amount of search terms and returns structured data from FactSet’s many data sources. Possible answers include Price of a Company, Top 10 Year-to-Date Gainers, Revenue per Passenger Mile, and many more.
 *
 * The version of the OpenAPI document: 1.1.0
 * Contact: FactSearch.Team@factset.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 *
 */

import ApiClient from '../ApiClient';
/**
* Enum class ValueColor.
* @enum {}
* @readonly
*/
export default class ValueColor {
    
        /**
         * value: "colorNone"
         * @const
         */
        "colorNone" = "colorNone";

    
        /**
         * value: "colorBuy"
         * @const
         */
        "colorBuy" = "colorBuy";

    
        /**
         * value: "colorHold"
         * @const
         */
        "colorHold" = "colorHold";

    
        /**
         * value: "colorSell"
         * @const
         */
        "colorSell" = "colorSell";

    
        /**
         * value: "colorOverweight"
         * @const
         */
        "colorOverweight" = "colorOverweight";

    
        /**
         * value: "colorUnderweight"
         * @const
         */
        "colorUnderweight" = "colorUnderweight";

    

    /**
    * Returns a <code>ValueColor</code> enum value from a Javascript object name.
    * @param {Object} data The plain JavaScript object containing the name of the enum value.
    * @return {module:model/ValueColor} The enum <code>ValueColor</code> value.
    */
    static constructFromObject(object) {
        return object;
    }
}

