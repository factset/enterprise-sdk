/**
 * Cabot Models API
 * Cabot Models API
 *
 * The version of the OpenAPI document: 0.3.0
 * Contact: api@factset.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 *
 */

import ApiClient from '../ApiClient';
/**
* Enum class SkillsHoldings.
* @enum {}
* @readonly
*/
export default class SkillsHoldings {
    
        /**
         * value: "all"
         * @const
         */
        "all" = "all";

    
        /**
         * value: "buySkill"
         * @const
         */
        "buySkill" = "buySkill";

    
        /**
         * value: "sizingSkill"
         * @const
         */
        "sizingSkill" = "sizingSkill";

    
        /**
         * value: "sellSkill"
         * @const
         */
        "sellSkill" = "sellSkill";

    

    /**
    * Returns a <code>SkillsHoldings</code> enum value from a Javascript object name.
    * @param {Object} data The plain JavaScript object containing the name of the enum value.
    * @return {module:model/SkillsHoldings} The enum <code>SkillsHoldings</code> value.
    */
    static constructFromObject(object) {
        return object;
    }
}

