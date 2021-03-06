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
import OptimizerInputsValue from './OptimizerInputsValue';

/**
 * The OptimizerInputsTargetProbabilityConstraint model module.
 * @module model/OptimizerInputsTargetProbabilityConstraint
 */
class OptimizerInputsTargetProbabilityConstraint {
    /**
     * Constructs a new <code>OptimizerInputsTargetProbabilityConstraint</code>.
     * @alias module:model/OptimizerInputsTargetProbabilityConstraint
     */
    constructor() { 
        
        OptimizerInputsTargetProbabilityConstraint.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>OptimizerInputsTargetProbabilityConstraint</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/OptimizerInputsTargetProbabilityConstraint} obj Optional instance to populate.
     * @return {module:model/OptimizerInputsTargetProbabilityConstraint} The populated <code>OptimizerInputsTargetProbabilityConstraint</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new OptimizerInputsTargetProbabilityConstraint();

            if (data.hasOwnProperty('name')) {
                obj['name'] = ApiClient.convertToType(data['name'], 'String');
            }
            if (data.hasOwnProperty('threshold_min')) {
                obj['threshold_min'] = OptimizerInputsValue.constructFromObject(data['threshold_min']);
            }
            if (data.hasOwnProperty('threshold_max')) {
                obj['threshold_max'] = OptimizerInputsValue.constructFromObject(data['threshold_max']);
            }
            if (data.hasOwnProperty('min_probability')) {
                obj['min_probability'] = OptimizerInputsValue.constructFromObject(data['min_probability']);
            }
            if (data.hasOwnProperty('max_probability')) {
                obj['max_probability'] = OptimizerInputsValue.constructFromObject(data['max_probability']);
            }
            if (data.hasOwnProperty('hierarchy')) {
                obj['hierarchy'] = ApiClient.convertToType(data['hierarchy'], 'Number');
            }
        }
        return obj;
    }


}

/**
 * @member {String} name
 */
OptimizerInputsTargetProbabilityConstraint.prototype['name'] = undefined;

/**
 * @member {module:model/OptimizerInputsValue} threshold_min
 */
OptimizerInputsTargetProbabilityConstraint.prototype['threshold_min'] = undefined;

/**
 * @member {module:model/OptimizerInputsValue} threshold_max
 */
OptimizerInputsTargetProbabilityConstraint.prototype['threshold_max'] = undefined;

/**
 * @member {module:model/OptimizerInputsValue} min_probability
 */
OptimizerInputsTargetProbabilityConstraint.prototype['min_probability'] = undefined;

/**
 * @member {module:model/OptimizerInputsValue} max_probability
 */
OptimizerInputsTargetProbabilityConstraint.prototype['max_probability'] = undefined;

/**
 * @member {Number} hierarchy
 */
OptimizerInputsTargetProbabilityConstraint.prototype['hierarchy'] = undefined;






export default OptimizerInputsTargetProbabilityConstraint;

