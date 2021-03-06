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
import OptimizerInputsEObjectiveRiskTypeEnum from './OptimizerInputsEObjectiveRiskTypeEnum';
import OptimizerInputsEObjectiveTermDirectionEnum from './OptimizerInputsEObjectiveTermDirectionEnum';
import OptimizerInputsValue from './OptimizerInputsValue';

/**
 * The OptimizerInputsVolatilityTerm model module.
 * @module model/OptimizerInputsVolatilityTerm
 */
class OptimizerInputsVolatilityTerm {
    /**
     * Constructs a new <code>OptimizerInputsVolatilityTerm</code>.
     * @alias module:model/OptimizerInputsVolatilityTerm
     */
    constructor() { 
        
        OptimizerInputsVolatilityTerm.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>OptimizerInputsVolatilityTerm</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/OptimizerInputsVolatilityTerm} obj Optional instance to populate.
     * @return {module:model/OptimizerInputsVolatilityTerm} The populated <code>OptimizerInputsVolatilityTerm</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new OptimizerInputsVolatilityTerm();

            if (data.hasOwnProperty('name')) {
                obj['name'] = ApiClient.convertToType(data['name'], 'String');
            }
            if (data.hasOwnProperty('multiplier')) {
                obj['multiplier'] = OptimizerInputsValue.constructFromObject(data['multiplier']);
            }
            if (data.hasOwnProperty('direction')) {
                obj['direction'] = OptimizerInputsEObjectiveTermDirectionEnum.constructFromObject(data['direction']);
            }
            if (data.hasOwnProperty('risk_type')) {
                obj['risk_type'] = OptimizerInputsEObjectiveRiskTypeEnum.constructFromObject(data['risk_type']);
            }
            if (data.hasOwnProperty('factors')) {
                obj['factors'] = ApiClient.convertToType(data['factors'], ['String']);
            }
            if (data.hasOwnProperty('active_risk')) {
                obj['active_risk'] = ApiClient.convertToType(data['active_risk'], 'Boolean');
            }
            if (data.hasOwnProperty('benchmark_index')) {
                obj['benchmark_index'] = ApiClient.convertToType(data['benchmark_index'], 'Number');
            }
        }
        return obj;
    }


}

/**
 * @member {String} name
 */
OptimizerInputsVolatilityTerm.prototype['name'] = undefined;

/**
 * @member {module:model/OptimizerInputsValue} multiplier
 */
OptimizerInputsVolatilityTerm.prototype['multiplier'] = undefined;

/**
 * @member {module:model/OptimizerInputsEObjectiveTermDirectionEnum} direction
 */
OptimizerInputsVolatilityTerm.prototype['direction'] = undefined;

/**
 * @member {module:model/OptimizerInputsEObjectiveRiskTypeEnum} risk_type
 */
OptimizerInputsVolatilityTerm.prototype['risk_type'] = undefined;

/**
 * @member {Array.<String>} factors
 */
OptimizerInputsVolatilityTerm.prototype['factors'] = undefined;

/**
 * @member {Boolean} active_risk
 */
OptimizerInputsVolatilityTerm.prototype['active_risk'] = undefined;

/**
 * @member {Number} benchmark_index
 */
OptimizerInputsVolatilityTerm.prototype['benchmark_index'] = undefined;






export default OptimizerInputsVolatilityTerm;

