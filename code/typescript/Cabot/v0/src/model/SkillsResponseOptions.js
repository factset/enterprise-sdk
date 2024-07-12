/**
 * Cabot Models API
 * Cabot Models API
 *
 * The version of the OpenAPI document: 0.1.0
 * Contact: api@factset.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 *
 */

import ApiClient from '../ApiClient';
import SkillsModelAnalytics from './SkillsModelAnalytics';

/**
 * The SkillsResponseOptions model module.
 * @module model/SkillsResponseOptions
 */
class SkillsResponseOptions {
    /**
     * Constructs a new <code>SkillsResponseOptions</code>.
     * @alias module:model/SkillsResponseOptions
     */
    constructor() { 
        
        SkillsResponseOptions.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>SkillsResponseOptions</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/SkillsResponseOptions} obj Optional instance to populate.
     * @return {module:model/SkillsResponseOptions} The populated <code>SkillsResponseOptions</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new SkillsResponseOptions();

            if (data.hasOwnProperty('highSkillValues')) {
                obj['highSkillValues'] = SkillsModelAnalytics.constructFromObject(data['highSkillValues']);
            }
            if (data.hasOwnProperty('lowSkillValues')) {
                obj['lowSkillValues'] = SkillsModelAnalytics.constructFromObject(data['lowSkillValues']);
            }
            if (data.hasOwnProperty('skillValues')) {
                obj['skillValues'] = SkillsModelAnalytics.constructFromObject(data['skillValues']);
            }
            if (data.hasOwnProperty('attribute')) {
                obj['attribute'] = ApiClient.convertToType(data['attribute'], 'String');
            }
        }
        return obj;
    }


}

/**
 * @member {module:model/SkillsModelAnalytics} highSkillValues
 */
SkillsResponseOptions.prototype['highSkillValues'] = undefined;

/**
 * @member {module:model/SkillsModelAnalytics} lowSkillValues
 */
SkillsResponseOptions.prototype['lowSkillValues'] = undefined;

/**
 * @member {module:model/SkillsModelAnalytics} skillValues
 */
SkillsResponseOptions.prototype['skillValues'] = undefined;

/**
 * @member {String} attribute
 */
SkillsResponseOptions.prototype['attribute'] = undefined;






export default SkillsResponseOptions;

