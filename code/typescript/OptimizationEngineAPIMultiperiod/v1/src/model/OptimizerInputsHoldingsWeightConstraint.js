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
import OptimizerInputsEConstraintUnitTypeEnum from './OptimizerInputsEConstraintUnitTypeEnum';
import OptimizerInputsEFPOConstraintAssetTypeEnum from './OptimizerInputsEFPOConstraintAssetTypeEnum';
import OptimizerInputsEFPOConstraintWeightTypeEnum from './OptimizerInputsEFPOConstraintWeightTypeEnum';
import OptimizerInputsPenalty from './OptimizerInputsPenalty';
import OptimizerInputsValue from './OptimizerInputsValue';

/**
 * The OptimizerInputsHoldingsWeightConstraint model module.
 * @module model/OptimizerInputsHoldingsWeightConstraint
 * @version 0.20.0
 */
class OptimizerInputsHoldingsWeightConstraint {
    /**
     * Constructs a new <code>OptimizerInputsHoldingsWeightConstraint</code>.
     * 9
     * @alias module:model/OptimizerInputsHoldingsWeightConstraint
     */
    constructor() { 
        
        OptimizerInputsHoldingsWeightConstraint.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>OptimizerInputsHoldingsWeightConstraint</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/OptimizerInputsHoldingsWeightConstraint} obj Optional instance to populate.
     * @return {module:model/OptimizerInputsHoldingsWeightConstraint} The populated <code>OptimizerInputsHoldingsWeightConstraint</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new OptimizerInputsHoldingsWeightConstraint();

            if (data.hasOwnProperty('name')) {
                obj['name'] = ApiClient.convertToType(data['name'], 'String');
            }
            if (data.hasOwnProperty('custom_asset')) {
                obj['custom_asset'] = OptimizerInputsValue.constructFromObject(data['custom_asset']);
            }
            if (data.hasOwnProperty('min')) {
                obj['min'] = OptimizerInputsValue.constructFromObject(data['min']);
            }
            if (data.hasOwnProperty('max')) {
                obj['max'] = OptimizerInputsValue.constructFromObject(data['max']);
            }
            if (data.hasOwnProperty('penalty')) {
                obj['penalty'] = OptimizerInputsPenalty.constructFromObject(data['penalty']);
            }
            if (data.hasOwnProperty('groups')) {
                obj['groups'] = ApiClient.convertToType(data['groups'], [OptimizerInputsConstraintGroup]);
            }
            if (data.hasOwnProperty('unit')) {
                obj['unit'] = OptimizerInputsEConstraintUnitTypeEnum.constructFromObject(data['unit']);
            }
            if (data.hasOwnProperty('weight_type')) {
                obj['weight_type'] = OptimizerInputsEFPOConstraintWeightTypeEnum.constructFromObject(data['weight_type']);
            }
            if (data.hasOwnProperty('level')) {
                obj['level'] = OptimizerInputsEConstraintLevelEnum.constructFromObject(data['level']);
            }
            if (data.hasOwnProperty('asset_type')) {
                obj['asset_type'] = OptimizerInputsEFPOConstraintAssetTypeEnum.constructFromObject(data['asset_type']);
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
            if (data.hasOwnProperty('apply_only_to_direct')) {
                obj['apply_only_to_direct'] = ApiClient.convertToType(data['apply_only_to_direct'], 'Boolean');
            }
        }
        return obj;
    }


}

/**
 * @member {String} name
 */
OptimizerInputsHoldingsWeightConstraint.prototype['name'] = undefined;

/**
 * @member {module:model/OptimizerInputsValue} custom_asset
 */
OptimizerInputsHoldingsWeightConstraint.prototype['custom_asset'] = undefined;

/**
 * @member {module:model/OptimizerInputsValue} min
 */
OptimizerInputsHoldingsWeightConstraint.prototype['min'] = undefined;

/**
 * @member {module:model/OptimizerInputsValue} max
 */
OptimizerInputsHoldingsWeightConstraint.prototype['max'] = undefined;

/**
 * @member {module:model/OptimizerInputsPenalty} penalty
 */
OptimizerInputsHoldingsWeightConstraint.prototype['penalty'] = undefined;

/**
 * @member {Array.<module:model/OptimizerInputsConstraintGroup>} groups
 */
OptimizerInputsHoldingsWeightConstraint.prototype['groups'] = undefined;

/**
 * @member {module:model/OptimizerInputsEConstraintUnitTypeEnum} unit
 */
OptimizerInputsHoldingsWeightConstraint.prototype['unit'] = undefined;

/**
 * @member {module:model/OptimizerInputsEFPOConstraintWeightTypeEnum} weight_type
 */
OptimizerInputsHoldingsWeightConstraint.prototype['weight_type'] = undefined;

/**
 * @member {module:model/OptimizerInputsEConstraintLevelEnum} level
 */
OptimizerInputsHoldingsWeightConstraint.prototype['level'] = undefined;

/**
 * @member {module:model/OptimizerInputsEFPOConstraintAssetTypeEnum} asset_type
 */
OptimizerInputsHoldingsWeightConstraint.prototype['asset_type'] = undefined;

/**
 * @member {Boolean} rel_to_benchmark
 */
OptimizerInputsHoldingsWeightConstraint.prototype['rel_to_benchmark'] = undefined;

/**
 * @member {Number} benchmark_index
 */
OptimizerInputsHoldingsWeightConstraint.prototype['benchmark_index'] = undefined;

/**
 * @member {Number} hierarchy
 */
OptimizerInputsHoldingsWeightConstraint.prototype['hierarchy'] = undefined;

/**
 * @member {Boolean} apply_only_to_direct
 */
OptimizerInputsHoldingsWeightConstraint.prototype['apply_only_to_direct'] = undefined;






export default OptimizerInputsHoldingsWeightConstraint;
