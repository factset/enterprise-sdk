/**
 * OFDB API
 * OFDB api
 *
 * The version of the OpenAPI document: 1.0.0
 * Contact: client.portfolio.data.engineering@factset.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 *
 */

import ApiClient from '../ApiClient';

/**
 * The DatabaseSchema model module.
 * @module model/DatabaseSchema
 */
class DatabaseSchema {
    /**
     * Constructs a new <code>DatabaseSchema</code>.
     * @alias module:model/DatabaseSchema
     */
    constructor() { 
        
        DatabaseSchema.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>DatabaseSchema</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/DatabaseSchema} obj Optional instance to populate.
     * @return {module:model/DatabaseSchema} The populated <code>DatabaseSchema</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new DatabaseSchema();

            if (data.hasOwnProperty('path')) {
                obj['path'] = ApiClient.convertToType(data['path'], 'String');
            }
            if (data.hasOwnProperty('description')) {
                obj['description'] = ApiClient.convertToType(data['description'], 'String');
            }
            if (data.hasOwnProperty('fields')) {
                obj['fields'] = ApiClient.convertToType(data['fields'], [Object]);
            }
        }
        return obj;
    }


}

/**
 * @member {String} path
 */
DatabaseSchema.prototype['path'] = undefined;

/**
 * @member {String} description
 */
DatabaseSchema.prototype['description'] = undefined;

/**
 * @member {Array.<Object>} fields
 */
DatabaseSchema.prototype['fields'] = undefined;






export default DatabaseSchema;

