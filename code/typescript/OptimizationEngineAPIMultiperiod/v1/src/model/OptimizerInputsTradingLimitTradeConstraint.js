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
import OptimizerInputsPenalty from './OptimizerInputsPenalty';
import OptimizerInputsValue from './OptimizerInputsValue';

/**
 * The OptimizerInputsTradingLimitTradeConstraint model module.
 * @module model/OptimizerInputsTradingLimitTradeConstraint
 */
class OptimizerInputsTradingLimitTradeConstraint {
    /**
     * Constructs a new <code>OptimizerInputsTradingLimitTradeConstraint</code>.
     * 19
     * @alias module:model/OptimizerInputsTradingLimitTradeConstraint
     */
    constructor() { 
        
        OptimizerInputsTradingLimitTradeConstraint.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>OptimizerInputsTradingLimitTradeConstraint</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/OptimizerInputsTradingLimitTradeConstraint} obj Optional instance to populate.
     * @return {module:model/OptimizerInputsTradingLimitTradeConstraint} The populated <code>OptimizerInputsTradingLimitTradeConstraint</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new OptimizerInputsTradingLimitTradeConstraint();

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
            if (data.hasOwnProperty('level')) {
                obj['level'] = OptimizerInputsEConstraintLevelEnum.constructFromObject(data['level']);
            }
            if (data.hasOwnProperty('asset_type')) {
                obj['asset_type'] = OptimizerInputsEFPOConstraintAssetTypeEnum.constructFromObject(data['asset_type']);
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
OptimizerInputsTradingLimitTradeConstraint.prototype['name'] = undefined;

/**
 * @member {module:model/OptimizerInputsValue} custom_asset
 */
OptimizerInputsTradingLimitTradeConstraint.prototype['custom_asset'] = undefined;

/**
 * @member {module:model/OptimizerInputsValue} min
 */
OptimizerInputsTradingLimitTradeConstraint.prototype['min'] = undefined;

/**
 * @member {module:model/OptimizerInputsValue} max
 */
OptimizerInputsTradingLimitTradeConstraint.prototype['max'] = undefined;

/**
 * @member {module:model/OptimizerInputsPenalty} penalty
 */
OptimizerInputsTradingLimitTradeConstraint.prototype['penalty'] = undefined;

/**
 * @member {Array.<module:model/OptimizerInputsConstraintGroup>} groups
 */
OptimizerInputsTradingLimitTradeConstraint.prototype['groups'] = undefined;

/**
 * @member {module:model/OptimizerInputsEConstraintUnitTypeEnum} unit
 */
OptimizerInputsTradingLimitTradeConstraint.prototype['unit'] = undefined;

/**
 * @member {module:model/OptimizerInputsEConstraintLevelEnum} level
 */
OptimizerInputsTradingLimitTradeConstraint.prototype['level'] = undefined;

/**
 * @member {module:model/OptimizerInputsEFPOConstraintAssetTypeEnum} asset_type
 */
OptimizerInputsTradingLimitTradeConstraint.prototype['asset_type'] = undefined;

/**
 * @member {Number} hierarchy
 */
OptimizerInputsTradingLimitTradeConstraint.prototype['hierarchy'] = undefined;






export default OptimizerInputsTradingLimitTradeConstraint;

