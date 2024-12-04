/**
 * FactSet Symbology API
 * The FactSet Symbology API provides symbol resolution services, allowing clients to translate market identifiers into various symbology types such as, FactSet Permanent Identifiers, CUSIP, ISIN, SEDOL, Tickers, and Bloomberg FIGIs. <p>Factset's Symbology API sits at the center of its hub-and-spoke data model, enabling you to quickly harmonize the expanding catalog of Content APIs. Translate market IDs into CUSIP, SEDOL, ISIN, Tickers as of a point in time or for the entire history of the requested id allowing Data Management workflows to normalize ids over time.</p> 
 *
 * The version of the OpenAPI document: 2.1.3
 * Contact: api@factset.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 *
 */

import ApiClient from '../ApiClient';
/**
* Enum class GetSymbolType.
* @enum {}
* @readonly
*/
export default class GetSymbolType {
    
        /**
         * value: "BIC"
         * @const
         */
        "BIC" = "BIC";

    
        /**
         * value: "CIK"
         * @const
         */
        "CIK" = "CIK";

    
        /**
         * value: "CRD"
         * @const
         */
        "CRD" = "CRD";

    
        /**
         * value: "EIN"
         * @const
         */
        "EIN" = "EIN";

    
        /**
         * value: "FITCH"
         * @const
         */
        "FITCH" = "FITCH";

    
        /**
         * value: "LEI"
         * @const
         */
        "LEI" = "LEI";

    
        /**
         * value: "MD"
         * @const
         */
        "MD" = "MD";

    
        /**
         * value: "SPR"
         * @const
         */
        "SPR" = "SPR";

    
        /**
         * value: "VALOREN"
         * @const
         */
        "VALOREN" = "VALOREN";

    
        /**
         * value: "WKN"
         * @const
         */
        "WKN" = "WKN";

    
        /**
         * value: "JCN"
         * @const
         */
        "JCN" = "JCN";

    
        /**
         * value: "UKCH"
         * @const
         */
        "UKCH" = "UKCH";

    
        /**
         * value: "RSSD"
         * @const
         */
        "RSSD" = "RSSD";

    
        /**
         * value: ""
         * @const
         */
        "empty" = "";

    

    /**
    * Returns a <code>GetSymbolType</code> enum value from a Javascript object name.
    * @param {Object} data The plain JavaScript object containing the name of the enum value.
    * @return {module:model/GetSymbolType} The enum <code>GetSymbolType</code> value.
    */
    static constructFromObject(object) {
        return object;
    }
}

