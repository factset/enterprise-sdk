/**
 * FactSet Quant Factor Library API
 * The FactSet FactSet Quant Factor Library (QFL) API helps to detect investment themes across global equity markets, incorporate ideas into your portfolio construction process, and transform raw data into actionable intelligence. Over 2000+ items spanning Factor Groups in-   * Classification and Reference Data - Asset Data, Country, Industry, and Size   * Market - Liquidity, Market Sensitivity, Momentum, Technical, Volatility   * Core Fundamentals - Efficiency, Growth, Management, Profitability, Quality, Solvency, Value   * Macro and Cross Asset - Commodity, FX Sensitivity, Debt, Economic   * Alternative - Analyst Sentiment, Corporate Governance, Crowding, Insider Activity. 
 *
 * The version of the OpenAPI document: 1.0.2
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
         * value: ""
         * @const
         */
        "empty" = "";

    

    /**
    * Returns a <code>Frequency</code> enum value from a Javascript object name.
    * @param {Object} data The plain JavaScript object containing the name of the enum value.
    * @return {module:model/Frequency} The enum <code>Frequency</code> value.
    */
    static constructFromObject(object) {
        return object;
    }
}

