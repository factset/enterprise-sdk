/**
 * fpo_mp_input
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: 1
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 *
 */

import ApiClient from '../ApiClient';

/**
 * The OptimizerInputsGroupDefinition model module.
 * @module model/OptimizerInputsGroupDefinition
 */
class OptimizerInputsGroupDefinition {
    /**
     * Constructs a new <code>OptimizerInputsGroupDefinition</code>.
     * Contains the subset of assets associated with a constraint group. (excluding Factor groups, as the optimizer will be respondible for fetching the risk model and expanding factor groups.
     * @alias module:model/OptimizerInputsGroupDefinition
     */
    constructor() { 
        
        OptimizerInputsGroupDefinition.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>OptimizerInputsGroupDefinition</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/OptimizerInputsGroupDefinition} obj Optional instance to populate.
     * @return {module:model/OptimizerInputsGroupDefinition} The populated <code>OptimizerInputsGroupDefinition</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new OptimizerInputsGroupDefinition();

            if (data.hasOwnProperty('univ_indices')) {
                obj['univ_indices'] = ApiClient.convertToType(data['univ_indices'], ['Number']);
            }
        }
        return obj;
    }


}

/**
 * @member {Array.<Number>} univ_indices
 */
OptimizerInputsGroupDefinition.prototype['univ_indices'] = undefined;






export default OptimizerInputsGroupDefinition;

