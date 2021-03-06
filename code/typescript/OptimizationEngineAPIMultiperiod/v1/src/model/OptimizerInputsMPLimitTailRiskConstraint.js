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
import OptimizerInputsAcrossPeriods from './OptimizerInputsAcrossPeriods';
import OptimizerInputsBoundSourceEnum from './OptimizerInputsBoundSourceEnum';
import OptimizerInputsLimitTailRiskConstraint from './OptimizerInputsLimitTailRiskConstraint';
import OptimizerInputsOnPeriods from './OptimizerInputsOnPeriods';

/**
 * The OptimizerInputsMPLimitTailRiskConstraint model module.
 * @module model/OptimizerInputsMPLimitTailRiskConstraint
 */
class OptimizerInputsMPLimitTailRiskConstraint {
    /**
     * Constructs a new <code>OptimizerInputsMPLimitTailRiskConstraint</code>.
     * @alias module:model/OptimizerInputsMPLimitTailRiskConstraint
     */
    constructor() { 
        
        OptimizerInputsMPLimitTailRiskConstraint.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>OptimizerInputsMPLimitTailRiskConstraint</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/OptimizerInputsMPLimitTailRiskConstraint} obj Optional instance to populate.
     * @return {module:model/OptimizerInputsMPLimitTailRiskConstraint} The populated <code>OptimizerInputsMPLimitTailRiskConstraint</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new OptimizerInputsMPLimitTailRiskConstraint();

            if (data.hasOwnProperty('constraint')) {
                obj['constraint'] = OptimizerInputsLimitTailRiskConstraint.constructFromObject(data['constraint']);
            }
            if (data.hasOwnProperty('constraint_on')) {
                obj['constraint_on'] = OptimizerInputsBoundSourceEnum.constructFromObject(data['constraint_on']);
            }
            if (data.hasOwnProperty('on_periods')) {
                obj['on_periods'] = OptimizerInputsOnPeriods.constructFromObject(data['on_periods']);
            }
            if (data.hasOwnProperty('across_periods')) {
                obj['across_periods'] = OptimizerInputsAcrossPeriods.constructFromObject(data['across_periods']);
            }
        }
        return obj;
    }


}

/**
 * @member {module:model/OptimizerInputsLimitTailRiskConstraint} constraint
 */
OptimizerInputsMPLimitTailRiskConstraint.prototype['constraint'] = undefined;

/**
 * @member {module:model/OptimizerInputsBoundSourceEnum} constraint_on
 */
OptimizerInputsMPLimitTailRiskConstraint.prototype['constraint_on'] = undefined;

/**
 * @member {module:model/OptimizerInputsOnPeriods} on_periods
 */
OptimizerInputsMPLimitTailRiskConstraint.prototype['on_periods'] = undefined;

/**
 * @member {module:model/OptimizerInputsAcrossPeriods} across_periods
 */
OptimizerInputsMPLimitTailRiskConstraint.prototype['across_periods'] = undefined;






export default OptimizerInputsMPLimitTailRiskConstraint;

