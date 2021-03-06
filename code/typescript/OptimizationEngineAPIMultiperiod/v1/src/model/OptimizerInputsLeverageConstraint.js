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
import OptimizerInputsELeverageValueTypeEnum from './OptimizerInputsELeverageValueTypeEnum';
import OptimizerInputsValue from './OptimizerInputsValue';

/**
 * The OptimizerInputsLeverageConstraint model module.
 * @module model/OptimizerInputsLeverageConstraint
 */
class OptimizerInputsLeverageConstraint {
    /**
     * Constructs a new <code>OptimizerInputsLeverageConstraint</code>.
     * 6
     * @alias module:model/OptimizerInputsLeverageConstraint
     */
    constructor() { 
        
        OptimizerInputsLeverageConstraint.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>OptimizerInputsLeverageConstraint</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/OptimizerInputsLeverageConstraint} obj Optional instance to populate.
     * @return {module:model/OptimizerInputsLeverageConstraint} The populated <code>OptimizerInputsLeverageConstraint</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new OptimizerInputsLeverageConstraint();

            if (data.hasOwnProperty('name')) {
                obj['name'] = ApiClient.convertToType(data['name'], 'String');
            }
            if (data.hasOwnProperty('value')) {
                obj['value'] = OptimizerInputsValue.constructFromObject(data['value']);
            }
            if (data.hasOwnProperty('value_type')) {
                obj['value_type'] = OptimizerInputsELeverageValueTypeEnum.constructFromObject(data['value_type']);
            }
            if (data.hasOwnProperty('hierarchy')) {
                obj['hierarchy'] = ApiClient.convertToType(data['hierarchy'], 'Number');
            }
            if (data.hasOwnProperty('groups')) {
                obj['groups'] = ApiClient.convertToType(data['groups'], [OptimizerInputsConstraintGroup]);
            }
            if (data.hasOwnProperty('level')) {
                obj['level'] = OptimizerInputsEConstraintLevelEnum.constructFromObject(data['level']);
            }
        }
        return obj;
    }


}

/**
 * @member {String} name
 */
OptimizerInputsLeverageConstraint.prototype['name'] = undefined;

/**
 * @member {module:model/OptimizerInputsValue} value
 */
OptimizerInputsLeverageConstraint.prototype['value'] = undefined;

/**
 * @member {module:model/OptimizerInputsELeverageValueTypeEnum} value_type
 */
OptimizerInputsLeverageConstraint.prototype['value_type'] = undefined;

/**
 * @member {Number} hierarchy
 */
OptimizerInputsLeverageConstraint.prototype['hierarchy'] = undefined;

/**
 * @member {Array.<module:model/OptimizerInputsConstraintGroup>} groups
 */
OptimizerInputsLeverageConstraint.prototype['groups'] = undefined;

/**
 * @member {module:model/OptimizerInputsEConstraintLevelEnum} level
 */
OptimizerInputsLeverageConstraint.prototype['level'] = undefined;






export default OptimizerInputsLeverageConstraint;

