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
import OptimizerInputsPenalty from './OptimizerInputsPenalty';
import OptimizerInputsValue from './OptimizerInputsValue';

/**
 * The OptimizerInputsLimitRiskETLConstraint model module.
 * @module model/OptimizerInputsLimitRiskETLConstraint
 * @version 0.20.0
 */
class OptimizerInputsLimitRiskETLConstraint {
    /**
     * Constructs a new <code>OptimizerInputsLimitRiskETLConstraint</code>.
     * 16
     * @alias module:model/OptimizerInputsLimitRiskETLConstraint
     */
    constructor() { 
        
        OptimizerInputsLimitRiskETLConstraint.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>OptimizerInputsLimitRiskETLConstraint</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/OptimizerInputsLimitRiskETLConstraint} obj Optional instance to populate.
     * @return {module:model/OptimizerInputsLimitRiskETLConstraint} The populated <code>OptimizerInputsLimitRiskETLConstraint</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new OptimizerInputsLimitRiskETLConstraint();

            if (data.hasOwnProperty('name')) {
                obj['name'] = ApiClient.convertToType(data['name'], 'String');
            }
            if (data.hasOwnProperty('max_etl')) {
                obj['max_etl'] = OptimizerInputsValue.constructFromObject(data['max_etl']);
            }
            if (data.hasOwnProperty('confidence_level')) {
                obj['confidence_level'] = OptimizerInputsValue.constructFromObject(data['confidence_level']);
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
            if (data.hasOwnProperty('active_etl')) {
                obj['active_etl'] = ApiClient.convertToType(data['active_etl'], 'Boolean');
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
OptimizerInputsLimitRiskETLConstraint.prototype['name'] = undefined;

/**
 * @member {module:model/OptimizerInputsValue} max_etl
 */
OptimizerInputsLimitRiskETLConstraint.prototype['max_etl'] = undefined;

/**
 * @member {module:model/OptimizerInputsValue} confidence_level
 */
OptimizerInputsLimitRiskETLConstraint.prototype['confidence_level'] = undefined;

/**
 * @member {module:model/OptimizerInputsPenalty} penalty
 */
OptimizerInputsLimitRiskETLConstraint.prototype['penalty'] = undefined;

/**
 * @member {Array.<module:model/OptimizerInputsConstraintGroup>} groups
 */
OptimizerInputsLimitRiskETLConstraint.prototype['groups'] = undefined;

/**
 * @member {module:model/OptimizerInputsEConstraintLevelEnum} level
 */
OptimizerInputsLimitRiskETLConstraint.prototype['level'] = undefined;

/**
 * @member {Boolean} active_etl
 */
OptimizerInputsLimitRiskETLConstraint.prototype['active_etl'] = undefined;

/**
 * @member {Number} benchmark_index
 */
OptimizerInputsLimitRiskETLConstraint.prototype['benchmark_index'] = undefined;

/**
 * @member {Number} hierarchy
 */
OptimizerInputsLimitRiskETLConstraint.prototype['hierarchy'] = undefined;






export default OptimizerInputsLimitRiskETLConstraint;
