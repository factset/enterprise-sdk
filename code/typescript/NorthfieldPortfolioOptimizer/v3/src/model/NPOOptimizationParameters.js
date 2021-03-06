/**
 * Northfield Portfolio API
 * Allow clients to fetch Analytics through APIs.
 *
 * The version of the OpenAPI document: 3
 * Contact: analytics.api.support@factset.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 *
 */

import ApiClient from '../ApiClient';
import NPOOptimizerStrategy from './NPOOptimizerStrategy';
import Optimization from './Optimization';
import OptimizerAccount from './OptimizerAccount';
import OptimizerOutputTypes from './OptimizerOutputTypes';

/**
 * The NPOOptimizationParameters model module.
 * @module model/NPOOptimizationParameters
 */
class NPOOptimizationParameters {
    /**
     * Constructs a new <code>NPOOptimizationParameters</code>.
     * @alias module:model/NPOOptimizationParameters
     * @param strategy {module:model/NPOOptimizerStrategy} 
     * @param outputTypes {module:model/OptimizerOutputTypes} 
     */
    constructor(strategy, outputTypes) { 
        
        NPOOptimizationParameters.initialize(this, strategy, outputTypes);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj, strategy, outputTypes) { 
        obj['strategy'] = strategy;
        obj['outputTypes'] = outputTypes;
    }

    /**
     * Constructs a <code>NPOOptimizationParameters</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/NPOOptimizationParameters} obj Optional instance to populate.
     * @return {module:model/NPOOptimizationParameters} The populated <code>NPOOptimizationParameters</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new NPOOptimizationParameters();

            if (data.hasOwnProperty('strategy')) {
                obj['strategy'] = NPOOptimizerStrategy.constructFromObject(data['strategy']);
            }
            if (data.hasOwnProperty('account')) {
                obj['account'] = OptimizerAccount.constructFromObject(data['account']);
            }
            if (data.hasOwnProperty('optimization')) {
                obj['optimization'] = Optimization.constructFromObject(data['optimization']);
            }
            if (data.hasOwnProperty('outputTypes')) {
                obj['outputTypes'] = OptimizerOutputTypes.constructFromObject(data['outputTypes']);
            }
        }
        return obj;
    }


}

/**
 * @member {module:model/NPOOptimizerStrategy} strategy
 */
NPOOptimizationParameters.prototype['strategy'] = undefined;

/**
 * @member {module:model/OptimizerAccount} account
 */
NPOOptimizationParameters.prototype['account'] = undefined;

/**
 * @member {module:model/Optimization} optimization
 */
NPOOptimizationParameters.prototype['optimization'] = undefined;

/**
 * @member {module:model/OptimizerOutputTypes} outputTypes
 */
NPOOptimizationParameters.prototype['outputTypes'] = undefined;






export default NPOOptimizationParameters;

