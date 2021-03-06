/**
 * Barra Portfolio Optimizer API
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
import BPMOptimizerStrategyOverrides from './BPMOptimizerStrategyOverrides';

/**
 * The BPMOptimizerStrategy model module.
 * @module model/BPMOptimizerStrategy
 */
class BPMOptimizerStrategy {
    /**
     * Constructs a new <code>BPMOptimizerStrategy</code>.
     * @alias module:model/BPMOptimizerStrategy
     * @param id {String} OptimizerStrategy document path
     */
    constructor(id) { 
        
        BPMOptimizerStrategy.initialize(this, id);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj, id) { 
        obj['id'] = id;
    }

    /**
     * Constructs a <code>BPMOptimizerStrategy</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/BPMOptimizerStrategy} obj Optional instance to populate.
     * @return {module:model/BPMOptimizerStrategy} The populated <code>BPMOptimizerStrategy</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new BPMOptimizerStrategy();

            if (data.hasOwnProperty('overrides')) {
                obj['overrides'] = BPMOptimizerStrategyOverrides.constructFromObject(data['overrides']);
            }
            if (data.hasOwnProperty('id')) {
                obj['id'] = ApiClient.convertToType(data['id'], 'String');
            }
        }
        return obj;
    }


}

/**
 * @member {module:model/BPMOptimizerStrategyOverrides} overrides
 */
BPMOptimizerStrategy.prototype['overrides'] = undefined;

/**
 * OptimizerStrategy document path
 * @member {String} id
 */
BPMOptimizerStrategy.prototype['id'] = undefined;






export default BPMOptimizerStrategy;

