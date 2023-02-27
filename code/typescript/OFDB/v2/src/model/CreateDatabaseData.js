/**
 * OFDB API
 * OFDB API
 *
 * The version of the OpenAPI document: 2.0.0
 * Contact: api@factset.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 *
 */

import ApiClient from '../ApiClient';

/**
 * The CreateDatabaseData model module.
 * @module model/CreateDatabaseData
 */
class CreateDatabaseData {
    /**
     * Constructs a new <code>CreateDatabaseData</code>.
     * @alias module:model/CreateDatabaseData
     */
    constructor() { 
        
        CreateDatabaseData.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>CreateDatabaseData</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/CreateDatabaseData} obj Optional instance to populate.
     * @return {module:model/CreateDatabaseData} The populated <code>CreateDatabaseData</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new CreateDatabaseData();

            if (data.hasOwnProperty('path')) {
                obj['path'] = ApiClient.convertToType(data['path'], 'String');
            }
        }
        return obj;
    }


}

/**
 * path of the newly created database.
 * @member {String} path
 */
CreateDatabaseData.prototype['path'] = undefined;






export default CreateDatabaseData;
