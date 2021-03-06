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
import OptimizerInputsEObjectiveTermDirectionEnum from './OptimizerInputsEObjectiveTermDirectionEnum';
import OptimizerInputsValue from './OptimizerInputsValue';

/**
 * The OptimizerInputsFactorExposureTerm model module.
 * @module model/OptimizerInputsFactorExposureTerm
 */
class OptimizerInputsFactorExposureTerm {
    /**
     * Constructs a new <code>OptimizerInputsFactorExposureTerm</code>.
     * @alias module:model/OptimizerInputsFactorExposureTerm
     */
    constructor() { 
        
        OptimizerInputsFactorExposureTerm.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>OptimizerInputsFactorExposureTerm</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/OptimizerInputsFactorExposureTerm} obj Optional instance to populate.
     * @return {module:model/OptimizerInputsFactorExposureTerm} The populated <code>OptimizerInputsFactorExposureTerm</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new OptimizerInputsFactorExposureTerm();

            if (data.hasOwnProperty('name')) {
                obj['name'] = ApiClient.convertToType(data['name'], 'String');
            }
            if (data.hasOwnProperty('multiplier')) {
                obj['multiplier'] = OptimizerInputsValue.constructFromObject(data['multiplier']);
            }
            if (data.hasOwnProperty('factors')) {
                obj['factors'] = ApiClient.convertToType(data['factors'], ['String']);
            }
            if (data.hasOwnProperty('direction')) {
                obj['direction'] = OptimizerInputsEObjectiveTermDirectionEnum.constructFromObject(data['direction']);
            }
            if (data.hasOwnProperty('rel_to_benchmark')) {
                obj['rel_to_benchmark'] = ApiClient.convertToType(data['rel_to_benchmark'], 'Boolean');
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
OptimizerInputsFactorExposureTerm.prototype['name'] = undefined;

/**
 * @member {module:model/OptimizerInputsValue} multiplier
 */
OptimizerInputsFactorExposureTerm.prototype['multiplier'] = undefined;

/**
 * @member {Array.<String>} factors
 */
OptimizerInputsFactorExposureTerm.prototype['factors'] = undefined;

/**
 * @member {module:model/OptimizerInputsEObjectiveTermDirectionEnum} direction
 */
OptimizerInputsFactorExposureTerm.prototype['direction'] = undefined;

/**
 * @member {Boolean} rel_to_benchmark
 */
OptimizerInputsFactorExposureTerm.prototype['rel_to_benchmark'] = undefined;

/**
 * @member {Number} benchmark_index
 */
OptimizerInputsFactorExposureTerm.prototype['benchmark_index'] = undefined;






export default OptimizerInputsFactorExposureTerm;

