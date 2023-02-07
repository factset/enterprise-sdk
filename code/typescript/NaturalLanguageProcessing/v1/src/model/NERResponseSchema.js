/**
 * Natural Language Processing API
 * APIs that leverage Natural Language Processing to help extract meaningful data from unstructured text
 *
 * The version of the OpenAPI document: 1.3.0
 * Contact: api@factset.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 *
 */

import ApiClient from '../ApiClient';
import NEREntityList from './NEREntityList';
import NERErrorSchema from './NERErrorSchema';

/**
 * The NERResponseSchema model module.
 * @module model/NERResponseSchema
 */
class NERResponseSchema {
    /**
     * Constructs a new <code>NERResponseSchema</code>.
     * @alias module:model/NERResponseSchema
     */
    constructor() { 
        
        NERResponseSchema.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>NERResponseSchema</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/NERResponseSchema} obj Optional instance to populate.
     * @return {module:model/NERResponseSchema} The populated <code>NERResponseSchema</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new NERResponseSchema();

            if (data.hasOwnProperty('data')) {
                obj['data'] = NEREntityList.constructFromObject(data['data']);
            }
            if (data.hasOwnProperty('errors')) {
                obj['errors'] = ApiClient.convertToType(data['errors'], [NERErrorSchema]);
            }
        }
        return obj;
    }


}

/**
 * @member {module:model/NEREntityList} data
 */
NERResponseSchema.prototype['data'] = undefined;

/**
 * @member {Array.<module:model/NERErrorSchema>} errors
 */
NERResponseSchema.prototype['errors'] = undefined;






export default NERResponseSchema;

