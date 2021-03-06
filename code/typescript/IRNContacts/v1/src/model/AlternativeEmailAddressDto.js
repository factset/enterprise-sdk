/**
 * IRN API v1
 * Allows users to extract, create, update and configure IRN data.
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
 * The AlternativeEmailAddressDto model module.
 * @module model/AlternativeEmailAddressDto
 */
class AlternativeEmailAddressDto {
    /**
     * Constructs a new <code>AlternativeEmailAddressDto</code>.
     * @alias module:model/AlternativeEmailAddressDto
     */
    constructor() { 
        
        AlternativeEmailAddressDto.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>AlternativeEmailAddressDto</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/AlternativeEmailAddressDto} obj Optional instance to populate.
     * @return {module:model/AlternativeEmailAddressDto} The populated <code>AlternativeEmailAddressDto</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new AlternativeEmailAddressDto();

            if (data.hasOwnProperty('Id')) {
                obj['Id'] = ApiClient.convertToType(data['Id'], 'String');
            }
            if (data.hasOwnProperty('EmailAddress')) {
                obj['EmailAddress'] = ApiClient.convertToType(data['EmailAddress'], 'String');
            }
        }
        return obj;
    }


}

/**
 * @member {String} Id
 */
AlternativeEmailAddressDto.prototype['Id'] = undefined;

/**
 * @member {String} EmailAddress
 */
AlternativeEmailAddressDto.prototype['EmailAddress'] = undefined;






export default AlternativeEmailAddressDto;

