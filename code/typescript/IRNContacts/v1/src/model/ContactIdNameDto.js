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
 * The ContactIdNameDto model module.
 * @module model/ContactIdNameDto
 */
class ContactIdNameDto {
    /**
     * Constructs a new <code>ContactIdNameDto</code>.
     * @alias module:model/ContactIdNameDto
     */
    constructor() { 
        
        ContactIdNameDto.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>ContactIdNameDto</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/ContactIdNameDto} obj Optional instance to populate.
     * @return {module:model/ContactIdNameDto} The populated <code>ContactIdNameDto</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new ContactIdNameDto();

            if (data.hasOwnProperty('Id')) {
                obj['Id'] = ApiClient.convertToType(data['Id'], 'String');
            }
            if (data.hasOwnProperty('Name')) {
                obj['Name'] = ApiClient.convertToType(data['Name'], 'String');
            }
        }
        return obj;
    }


}

/**
 * @member {String} Id
 */
ContactIdNameDto.prototype['Id'] = undefined;

/**
 * @member {String} Name
 */
ContactIdNameDto.prototype['Name'] = undefined;






export default ContactIdNameDto;

