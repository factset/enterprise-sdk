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
 * The ContactPhoneSaveDto model module.
 * @module model/ContactPhoneSaveDto
 */
class ContactPhoneSaveDto {
    /**
     * Constructs a new <code>ContactPhoneSaveDto</code>.
     * @alias module:model/ContactPhoneSaveDto
     */
    constructor() { 
        
        ContactPhoneSaveDto.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>ContactPhoneSaveDto</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/ContactPhoneSaveDto} obj Optional instance to populate.
     * @return {module:model/ContactPhoneSaveDto} The populated <code>ContactPhoneSaveDto</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new ContactPhoneSaveDto();

            if (data.hasOwnProperty('Id')) {
                obj['Id'] = ApiClient.convertToType(data['Id'], 'String');
            }
            if (data.hasOwnProperty('Number')) {
                obj['Number'] = ApiClient.convertToType(data['Number'], 'String');
            }
            if (data.hasOwnProperty('TypeId')) {
                obj['TypeId'] = ApiClient.convertToType(data['TypeId'], 'String');
            }
            if (data.hasOwnProperty('IsPrimary')) {
                obj['IsPrimary'] = ApiClient.convertToType(data['IsPrimary'], 'Boolean');
            }
        }
        return obj;
    }


}

/**
 * @member {String} Id
 */
ContactPhoneSaveDto.prototype['Id'] = undefined;

/**
 * @member {String} Number
 */
ContactPhoneSaveDto.prototype['Number'] = undefined;

/**
 * @member {String} TypeId
 */
ContactPhoneSaveDto.prototype['TypeId'] = undefined;

/**
 * @member {Boolean} IsPrimary
 */
ContactPhoneSaveDto.prototype['IsPrimary'] = undefined;






export default ContactPhoneSaveDto;

