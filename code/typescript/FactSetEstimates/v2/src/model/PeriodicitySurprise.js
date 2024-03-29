/**
 * FactSet Estimates
 * Gain access to 20+ years of comprehensive estimates and statistics of over 250+ estimated metrics, including financial statement items, product segments, geosegments, and industry metrics. FactSet's consensus estimates are aggregated from a wide base of over 800+ contributors and cover over 19,000 active companies across 90+ countries. Data returned can be accessed on the data frequencies based on quarterly, fiscal years, and calendar years. FactSet Estimates updates on a real time basis intraday (every 5 minutes). Updating times vary based on earning season vs. non-earning season but the goal is to have the data available to the client within a few hours that FactSet receives updated information. Often times updates times can be much faster as FactSet has always been known as one of the fastest estimate providers in the market. 
 *
 * The version of the OpenAPI document: 2.5.0
 * Contact: api@factset.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 *
 */

import ApiClient from '../ApiClient';
/**
* Enum class PeriodicitySurprise.
* @enum {}
* @readonly
*/
export default class PeriodicitySurprise {
    
        /**
         * value: "ANN"
         * @const
         */
        "ANN" = "ANN";

    
        /**
         * value: "QTR"
         * @const
         */
        "QTR" = "QTR";

    
        /**
         * value: "SEMI"
         * @const
         */
        "SEMI" = "SEMI";

    

    /**
    * Returns a <code>PeriodicitySurprise</code> enum value from a Javascript object name.
    * @param {Object} data The plain JavaScript object containing the name of the enum value.
    * @return {module:model/PeriodicitySurprise} The enum <code>PeriodicitySurprise</code> value.
    */
    static constructFromObject(object) {
        return object;
    }
}

