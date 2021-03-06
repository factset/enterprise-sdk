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
import OptimizerInputsPenalty from './OptimizerInputsPenalty';
import OptimizerInputsTailRiskMeasureEnum from './OptimizerInputsTailRiskMeasureEnum';
import OptimizerInputsValue from './OptimizerInputsValue';

/**
 * The OptimizerInputsLimitTailRiskConstraint model module.
 * @module model/OptimizerInputsLimitTailRiskConstraint
 */
class OptimizerInputsLimitTailRiskConstraint {
    /**
     * Constructs a new <code>OptimizerInputsLimitTailRiskConstraint</code>.
     * @alias module:model/OptimizerInputsLimitTailRiskConstraint
     */
    constructor() { 
        
        OptimizerInputsLimitTailRiskConstraint.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>OptimizerInputsLimitTailRiskConstraint</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/OptimizerInputsLimitTailRiskConstraint} obj Optional instance to populate.
     * @return {module:model/OptimizerInputsLimitTailRiskConstraint} The populated <code>OptimizerInputsLimitTailRiskConstraint</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new OptimizerInputsLimitTailRiskConstraint();

            if (data.hasOwnProperty('name')) {
                obj['name'] = ApiClient.convertToType(data['name'], 'String');
            }
            if (data.hasOwnProperty('risk_measure')) {
                obj['risk_measure'] = OptimizerInputsTailRiskMeasureEnum.constructFromObject(data['risk_measure']);
            }
            if (data.hasOwnProperty('max_risk')) {
                obj['max_risk'] = OptimizerInputsValue.constructFromObject(data['max_risk']);
            }
            if (data.hasOwnProperty('confidence_level')) {
                obj['confidence_level'] = OptimizerInputsValue.constructFromObject(data['confidence_level']);
            }
            if (data.hasOwnProperty('penalty')) {
                obj['penalty'] = OptimizerInputsPenalty.constructFromObject(data['penalty']);
            }
            if (data.hasOwnProperty('active_risk')) {
                obj['active_risk'] = ApiClient.convertToType(data['active_risk'], 'Boolean');
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
OptimizerInputsLimitTailRiskConstraint.prototype['name'] = undefined;

/**
 * @member {module:model/OptimizerInputsTailRiskMeasureEnum} risk_measure
 */
OptimizerInputsLimitTailRiskConstraint.prototype['risk_measure'] = undefined;

/**
 * @member {module:model/OptimizerInputsValue} max_risk
 */
OptimizerInputsLimitTailRiskConstraint.prototype['max_risk'] = undefined;

/**
 * @member {module:model/OptimizerInputsValue} confidence_level
 */
OptimizerInputsLimitTailRiskConstraint.prototype['confidence_level'] = undefined;

/**
 * @member {module:model/OptimizerInputsPenalty} penalty
 */
OptimizerInputsLimitTailRiskConstraint.prototype['penalty'] = undefined;

/**
 * @member {Boolean} active_risk
 */
OptimizerInputsLimitTailRiskConstraint.prototype['active_risk'] = undefined;

/**
 * @member {Number} benchmark_index
 */
OptimizerInputsLimitTailRiskConstraint.prototype['benchmark_index'] = undefined;

/**
 * @member {Number} hierarchy
 */
OptimizerInputsLimitTailRiskConstraint.prototype['hierarchy'] = undefined;






export default OptimizerInputsLimitTailRiskConstraint;

