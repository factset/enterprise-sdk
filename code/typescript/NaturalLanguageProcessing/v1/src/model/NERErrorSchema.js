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

/**
 * The NERErrorSchema model module.
 * @module model/NERErrorSchema
 */
class NERErrorSchema {
    /**
     * Constructs a new <code>NERErrorSchema</code>.
     * @alias module:model/NERErrorSchema
     */
    constructor() { 
        
        NERErrorSchema.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>NERErrorSchema</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/NERErrorSchema} obj Optional instance to populate.
     * @return {module:model/NERErrorSchema} The populated <code>NERErrorSchema</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new NERErrorSchema();

            if (data.hasOwnProperty('code')) {
                obj['code'] = ApiClient.convertToType(data['code'], 'String');
            }
            if (data.hasOwnProperty('id')) {
                obj['id'] = ApiClient.convertToType(data['id'], 'String');
            }
            if (data.hasOwnProperty('title')) {
                obj['title'] = ApiClient.convertToType(data['title'], 'String');
            }
        }
        return obj;
    }


}

/**
 * NER-specific error code of the problem
 * @member {String} code
 */
NERErrorSchema.prototype['code'] = undefined;

/**
 * Unique ID for the occurance of the problem
 * @member {String} id
 */
NERErrorSchema.prototype['id'] = undefined;

/**
 * A short summary of the problem
 * @member {String} title
 */
NERErrorSchema.prototype['title'] = undefined;






export default NERErrorSchema;

