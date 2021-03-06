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
import OptimizerInputsEValueTypeEnum from './OptimizerInputsEValueTypeEnum';

/**
 * The OptimizerInputsValue model module.
 * @module model/OptimizerInputsValue
 */
class OptimizerInputsValue {
    /**
     * Constructs a new <code>OptimizerInputsValue</code>.
     * @alias module:model/OptimizerInputsValue
     */
    constructor() { 
        
        OptimizerInputsValue.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>OptimizerInputsValue</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/OptimizerInputsValue} obj Optional instance to populate.
     * @return {module:model/OptimizerInputsValue} The populated <code>OptimizerInputsValue</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new OptimizerInputsValue();

            if (data.hasOwnProperty('value_type')) {
                obj['value_type'] = OptimizerInputsEValueTypeEnum.constructFromObject(data['value_type']);
            }
            if (data.hasOwnProperty('raw_value')) {
                obj['raw_value'] = ApiClient.convertToType(data['raw_value'], 'Number');
            }
            if (data.hasOwnProperty('ref_index')) {
                obj['ref_index'] = ApiClient.convertToType(data['ref_index'], 'Number');
            }
        }
        return obj;
    }


}

/**
 * @member {module:model/OptimizerInputsEValueTypeEnum} value_type
 */
OptimizerInputsValue.prototype['value_type'] = undefined;

/**
 * @member {Number} raw_value
 */
OptimizerInputsValue.prototype['raw_value'] = undefined;

/**
 * @member {Number} ref_index
 */
OptimizerInputsValue.prototype['ref_index'] = undefined;






export default OptimizerInputsValue;

