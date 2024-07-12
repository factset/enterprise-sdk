/**
 * FactSet Prices API
 * Gain access to comprehensive global coverage for Equities & Fixed Income. Perform quick analytics by controlling the date ranges, currencies, and rolling periods, or simply request Open, High, Low, and Close prices. Easily connect pricing data with other core company data or alternative content sets using FactSet's hub and spoke symbology. <p>Equity and Fund Security types include Common Stock, ADR, GDR, Preferred, Closed-ended Fund, Exchange Traded Fund, Unit, Open-ended Fund, Exchange Traded Fund UVI, Exchange Traded Fund NAV, Preferred Equity, Non-Voting Depositary Receipt/Certificate, Alien/Foreign, Structured Product, and Temporary Instruments. Reference over 180,000+ active and inactive securities.</p><p>Fixed Income Security Types include Corporate Bonds, Treasury and Agency bonds, Government Bonds, and Municipals.</p><p><b>Rate limit is set to 25 requests per second</b>.</p> 
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
* Enum class RollingPeriod.
* @enum {}
* @readonly
*/
export default class RollingPeriod {
    
        /**
         * value: "1D"
         * @const
         */
        "1D" = "1D";

    
        /**
         * value: "1W"
         * @const
         */
        "1W" = "1W";

    
        /**
         * value: "1M"
         * @const
         */
        "1M" = "1M";

    
        /**
         * value: "3M"
         * @const
         */
        "3M" = "3M";

    
        /**
         * value: "6M"
         * @const
         */
        "6M" = "6M";

    
        /**
         * value: "52W"
         * @const
         */
        "52W" = "52W";

    
        /**
         * value: "2Y"
         * @const
         */
        "2Y" = "2Y";

    
        /**
         * value: "3Y"
         * @const
         */
        "3Y" = "3Y";

    
        /**
         * value: "5Y"
         * @const
         */
        "5Y" = "5Y";

    
        /**
         * value: "10Y"
         * @const
         */
        "10Y" = "10Y";

    

    /**
    * Returns a <code>RollingPeriod</code> enum value from a Javascript object name.
    * @param {Object} data The plain JavaScript object containing the name of the enum value.
    * @return {module:model/RollingPeriod} The enum <code>RollingPeriod</code> value.
    */
    static constructFromObject(object) {
        return object;
    }
}

