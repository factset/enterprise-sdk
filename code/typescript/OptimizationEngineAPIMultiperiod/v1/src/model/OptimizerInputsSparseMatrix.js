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

/**
 * The OptimizerInputsSparseMatrix model module.
 * @module model/OptimizerInputsSparseMatrix
 * @version 0.20.0
 */
class OptimizerInputsSparseMatrix {
    /**
     * Constructs a new <code>OptimizerInputsSparseMatrix</code>.
     * Represents a sparse matrix in the CSR format
     * @alias module:model/OptimizerInputsSparseMatrix
     */
    constructor() { 
        
        OptimizerInputsSparseMatrix.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>OptimizerInputsSparseMatrix</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/OptimizerInputsSparseMatrix} obj Optional instance to populate.
     * @return {module:model/OptimizerInputsSparseMatrix} The populated <code>OptimizerInputsSparseMatrix</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new OptimizerInputsSparseMatrix();

            if (data.hasOwnProperty('rows')) {
                obj['rows'] = ApiClient.convertToType(data['rows'], 'Number');
            }
            if (data.hasOwnProperty('columns')) {
                obj['columns'] = ApiClient.convertToType(data['columns'], 'Number');
            }
            if (data.hasOwnProperty('indexPointer')) {
                obj['indexPointer'] = ApiClient.convertToType(data['indexPointer'], ['Number']);
            }
            if (data.hasOwnProperty('indices')) {
                obj['indices'] = ApiClient.convertToType(data['indices'], ['Number']);
            }
            if (data.hasOwnProperty('value')) {
                obj['value'] = ApiClient.convertToType(data['value'], ['Number']);
            }
        }
        return obj;
    }


}

/**
 * @member {Number} rows
 */
OptimizerInputsSparseMatrix.prototype['rows'] = undefined;

/**
 * @member {Number} columns
 */
OptimizerInputsSparseMatrix.prototype['columns'] = undefined;

/**
 * @member {Array.<Number>} indexPointer
 */
OptimizerInputsSparseMatrix.prototype['indexPointer'] = undefined;

/**
 * @member {Array.<Number>} indices
 */
OptimizerInputsSparseMatrix.prototype['indices'] = undefined;

/**
 * @member {Array.<Number>} value
 */
OptimizerInputsSparseMatrix.prototype['value'] = undefined;






export default OptimizerInputsSparseMatrix;
