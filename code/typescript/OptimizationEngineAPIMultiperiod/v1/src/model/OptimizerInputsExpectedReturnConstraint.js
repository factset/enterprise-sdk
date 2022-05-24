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
import OptimizerInputsConstraintGroup from './OptimizerInputsConstraintGroup';
import OptimizerInputsEConstraintLevelEnum from './OptimizerInputsEConstraintLevelEnum';
import OptimizerInputsEConstraintReturnTypeEnum from './OptimizerInputsEConstraintReturnTypeEnum';
import OptimizerInputsPenalty from './OptimizerInputsPenalty';
import OptimizerInputsValue from './OptimizerInputsValue';

/**
 * The OptimizerInputsExpectedReturnConstraint model module.
 * @module model/OptimizerInputsExpectedReturnConstraint
 * @version 0.20.0
 */
class OptimizerInputsExpectedReturnConstraint {
    /**
     * Constructs a new <code>OptimizerInputsExpectedReturnConstraint</code>.
     * 1
     * @alias module:model/OptimizerInputsExpectedReturnConstraint
     */
    constructor() { 
        
        OptimizerInputsExpectedReturnConstraint.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>OptimizerInputsExpectedReturnConstraint</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/OptimizerInputsExpectedReturnConstraint} obj Optional instance to populate.
     * @return {module:model/OptimizerInputsExpectedReturnConstraint} The populated <code>OptimizerInputsExpectedReturnConstraint</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new OptimizerInputsExpectedReturnConstraint();

            if (data.hasOwnProperty('name')) {
                obj['name'] = ApiClient.convertToType(data['name'], 'String');
            }
            if (data.hasOwnProperty('min')) {
                obj['min'] = OptimizerInputsValue.constructFromObject(data['min']);
            }
            if (data.hasOwnProperty('max')) {
                obj['max'] = OptimizerInputsValue.constructFromObject(data['max']);
            }
            if (data.hasOwnProperty('return_value')) {
                obj['return_value'] = OptimizerInputsValue.constructFromObject(data['return_value']);
            }
            if (data.hasOwnProperty('use_strategy_return_value')) {
                obj['use_strategy_return_value'] = ApiClient.convertToType(data['use_strategy_return_value'], 'Boolean');
            }
            if (data.hasOwnProperty('penalty')) {
                obj['penalty'] = OptimizerInputsPenalty.constructFromObject(data['penalty']);
            }
            if (data.hasOwnProperty('groups')) {
                obj['groups'] = ApiClient.convertToType(data['groups'], [OptimizerInputsConstraintGroup]);
            }
            if (data.hasOwnProperty('level')) {
                obj['level'] = OptimizerInputsEConstraintLevelEnum.constructFromObject(data['level']);
            }
            if (data.hasOwnProperty('return_type')) {
                obj['return_type'] = OptimizerInputsEConstraintReturnTypeEnum.constructFromObject(data['return_type']);
            }
            if (data.hasOwnProperty('rel_to_benchmark')) {
                obj['rel_to_benchmark'] = ApiClient.convertToType(data['rel_to_benchmark'], 'Boolean');
            }
            if (data.hasOwnProperty('benchmark_index')) {
                obj['benchmark_index'] = ApiClient.convertToType(data['benchmark_index'], 'Number');
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
OptimizerInputsExpectedReturnConstraint.prototype['name'] = undefined;

/**
 * @member {module:model/OptimizerInputsValue} min
 */
OptimizerInputsExpectedReturnConstraint.prototype['min'] = undefined;

/**
 * @member {module:model/OptimizerInputsValue} max
 */
OptimizerInputsExpectedReturnConstraint.prototype['max'] = undefined;

/**
 * @member {module:model/OptimizerInputsValue} return_value
 */
OptimizerInputsExpectedReturnConstraint.prototype['return_value'] = undefined;

/**
 * @member {Boolean} use_strategy_return_value
 */
OptimizerInputsExpectedReturnConstraint.prototype['use_strategy_return_value'] = undefined;

/**
 * @member {module:model/OptimizerInputsPenalty} penalty
 */
OptimizerInputsExpectedReturnConstraint.prototype['penalty'] = undefined;

/**
 * @member {Array.<module:model/OptimizerInputsConstraintGroup>} groups
 */
OptimizerInputsExpectedReturnConstraint.prototype['groups'] = undefined;

/**
 * @member {module:model/OptimizerInputsEConstraintLevelEnum} level
 */
OptimizerInputsExpectedReturnConstraint.prototype['level'] = undefined;

/**
 * @member {module:model/OptimizerInputsEConstraintReturnTypeEnum} return_type
 */
OptimizerInputsExpectedReturnConstraint.prototype['return_type'] = undefined;

/**
 * @member {Boolean} rel_to_benchmark
 */
OptimizerInputsExpectedReturnConstraint.prototype['rel_to_benchmark'] = undefined;

/**
 * @member {Number} benchmark_index
 */
OptimizerInputsExpectedReturnConstraint.prototype['benchmark_index'] = undefined;

/**
 * @member {Number} hierarchy
 */
OptimizerInputsExpectedReturnConstraint.prototype['hierarchy'] = undefined;






export default OptimizerInputsExpectedReturnConstraint;
