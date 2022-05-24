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
import GoogleProtobufListValue from './GoogleProtobufListValue';

/**
 * The OptimizerInputsDenseMatrix model module.
 * @module model/OptimizerInputsDenseMatrix
 * @version 0.20.0
 */
class OptimizerInputsDenseMatrix {
    /**
     * Constructs a new <code>OptimizerInputsDenseMatrix</code>.
     * Represents a dense matrix
     * @alias module:model/OptimizerInputsDenseMatrix
     */
    constructor() { 
        
        OptimizerInputsDenseMatrix.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>OptimizerInputsDenseMatrix</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/OptimizerInputsDenseMatrix} obj Optional instance to populate.
     * @return {module:model/OptimizerInputsDenseMatrix} The populated <code>OptimizerInputsDenseMatrix</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new OptimizerInputsDenseMatrix();

            if (data.hasOwnProperty('value')) {
                obj['value'] = ApiClient.convertToType(data['value'], [GoogleProtobufListValue]);
            }
        }
        return obj;
    }


}

/**
 * 2D array of doubles
 * @member {Array.<module:model/GoogleProtobufListValue>} value
 */
OptimizerInputsDenseMatrix.prototype['value'] = undefined;






export default OptimizerInputsDenseMatrix;
