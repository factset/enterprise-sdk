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
 * The PhoneNumberTypeDto model module.
 * @module model/PhoneNumberTypeDto
 */
class PhoneNumberTypeDto {
    /**
     * Constructs a new <code>PhoneNumberTypeDto</code>.
     * @alias module:model/PhoneNumberTypeDto
     */
    constructor() { 
        
        PhoneNumberTypeDto.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>PhoneNumberTypeDto</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/PhoneNumberTypeDto} obj Optional instance to populate.
     * @return {module:model/PhoneNumberTypeDto} The populated <code>PhoneNumberTypeDto</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new PhoneNumberTypeDto();

            if (data.hasOwnProperty('id')) {
                obj['id'] = ApiClient.convertToType(data['id'], 'String');
            }
            if (data.hasOwnProperty('name')) {
                obj['name'] = ApiClient.convertToType(data['name'], 'String');
            }
            if (data.hasOwnProperty('isStandard')) {
                obj['isStandard'] = ApiClient.convertToType(data['isStandard'], 'Boolean');
            }
        }
        return obj;
    }


}

/**
 * @member {String} id
 */
PhoneNumberTypeDto.prototype['id'] = undefined;

/**
 * @member {String} name
 */
PhoneNumberTypeDto.prototype['name'] = undefined;

/**
 * @member {Boolean} isStandard
 */
PhoneNumberTypeDto.prototype['isStandard'] = undefined;






export default PhoneNumberTypeDto;

