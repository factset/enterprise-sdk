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
import OptimizerInputsGroupDefinition from './OptimizerInputsGroupDefinition';
import OptimizerInputsValueReference from './OptimizerInputsValueReference';

/**
 * The OptimizerInputsLookupTables model module.
 * @module model/OptimizerInputsLookupTables
 */
class OptimizerInputsLookupTables {
    /**
     * Constructs a new <code>OptimizerInputsLookupTables</code>.
     * @alias module:model/OptimizerInputsLookupTables
     */
    constructor() { 
        
        OptimizerInputsLookupTables.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>OptimizerInputsLookupTables</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/OptimizerInputsLookupTables} obj Optional instance to populate.
     * @return {module:model/OptimizerInputsLookupTables} The populated <code>OptimizerInputsLookupTables</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new OptimizerInputsLookupTables();

            if (data.hasOwnProperty('groups')) {
                obj['groups'] = ApiClient.convertToType(data['groups'], [OptimizerInputsGroupDefinition]);
            }
            if (data.hasOwnProperty('values')) {
                obj['values'] = ApiClient.convertToType(data['values'], [OptimizerInputsValueReference]);
            }
        }
        return obj;
    }


}

/**
 * tables to be referenced by index from the strategy.
 * @member {Array.<module:model/OptimizerInputsGroupDefinition>} groups
 */
OptimizerInputsLookupTables.prototype['groups'] = undefined;

/**
 * @member {Array.<module:model/OptimizerInputsValueReference>} values
 */
OptimizerInputsLookupTables.prototype['values'] = undefined;






export default OptimizerInputsLookupTables;

