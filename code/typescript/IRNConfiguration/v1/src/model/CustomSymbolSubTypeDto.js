/**
 * IRN API v1
 * Allows users to extract, create, update and configure IRN data.
 *
 * The version of the OpenAPI document: 1.0.0
 * Contact: api@factset.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 *
 */

import ApiClient from '../ApiClient';

/**
 * The CustomSymbolSubTypeDto model module.
 * @module model/CustomSymbolSubTypeDto
 */
class CustomSymbolSubTypeDto {
    /**
     * Constructs a new <code>CustomSymbolSubTypeDto</code>.
     * @alias module:model/CustomSymbolSubTypeDto
     */
    constructor() { 
        
        CustomSymbolSubTypeDto.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>CustomSymbolSubTypeDto</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/CustomSymbolSubTypeDto} obj Optional instance to populate.
     * @return {module:model/CustomSymbolSubTypeDto} The populated <code>CustomSymbolSubTypeDto</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new CustomSymbolSubTypeDto();

            if (data.hasOwnProperty('id')) {
                obj['id'] = ApiClient.convertToType(data['id'], 'String');
            }
            if (data.hasOwnProperty('name')) {
                obj['name'] = ApiClient.convertToType(data['name'], 'String');
            }
        }
        return obj;
    }


}

/**
 * @member {String} id
 */
CustomSymbolSubTypeDto.prototype['id'] = undefined;

/**
 * @member {String} name
 */
CustomSymbolSubTypeDto.prototype['name'] = undefined;






export default CustomSymbolSubTypeDto;

