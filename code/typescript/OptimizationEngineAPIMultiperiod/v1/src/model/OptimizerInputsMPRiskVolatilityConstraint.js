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
import OptimizerInputsOnPeriods from './OptimizerInputsOnPeriods';
import OptimizerInputsRiskVolatilityConstraint from './OptimizerInputsRiskVolatilityConstraint';

/**
 * The OptimizerInputsMPRiskVolatilityConstraint model module.
 * @module model/OptimizerInputsMPRiskVolatilityConstraint
 */
class OptimizerInputsMPRiskVolatilityConstraint {
    /**
     * Constructs a new <code>OptimizerInputsMPRiskVolatilityConstraint</code>.
     * @alias module:model/OptimizerInputsMPRiskVolatilityConstraint
     */
    constructor() { 
        
        OptimizerInputsMPRiskVolatilityConstraint.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>OptimizerInputsMPRiskVolatilityConstraint</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/OptimizerInputsMPRiskVolatilityConstraint} obj Optional instance to populate.
     * @return {module:model/OptimizerInputsMPRiskVolatilityConstraint} The populated <code>OptimizerInputsMPRiskVolatilityConstraint</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new OptimizerInputsMPRiskVolatilityConstraint();

            if (data.hasOwnProperty('constraint')) {
                obj['constraint'] = OptimizerInputsRiskVolatilityConstraint.constructFromObject(data['constraint']);
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
 * @member {module:model/OptimizerInputsRiskVolatilityConstraint} constraint
 */
OptimizerInputsMPRiskVolatilityConstraint.prototype['constraint'] = undefined;

/**
 * @member {module:model/OptimizerInputsBoundSourceEnum} constraint_on
 */
OptimizerInputsMPRiskVolatilityConstraint.prototype['constraint_on'] = undefined;

/**
 * @member {module:model/OptimizerInputsOnPeriods} on_periods
 */
OptimizerInputsMPRiskVolatilityConstraint.prototype['on_periods'] = undefined;

/**
 * @member {module:model/OptimizerInputsAcrossPeriods} across_periods
 */
OptimizerInputsMPRiskVolatilityConstraint.prototype['across_periods'] = undefined;






export default OptimizerInputsMPRiskVolatilityConstraint;

