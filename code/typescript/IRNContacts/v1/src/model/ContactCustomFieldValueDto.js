/**
 * IRN API v1
 * Allows users to extract, create, update and configure IRN data.
 *
 * The version of the OpenAPI document: 1
 * Contact: api@factset.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 *
 */

import ApiClient from '../ApiClient';
import ContactCustomFieldOptionValueDto from './ContactCustomFieldOptionValueDto';

/**
 * The ContactCustomFieldValueDto model module.
 * @module model/ContactCustomFieldValueDto
 */
class ContactCustomFieldValueDto {
    /**
     * Constructs a new <code>ContactCustomFieldValueDto</code>.
     * @alias module:model/ContactCustomFieldValueDto
     */
    constructor() { 
        
        ContactCustomFieldValueDto.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>ContactCustomFieldValueDto</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/ContactCustomFieldValueDto} obj Optional instance to populate.
     * @return {module:model/ContactCustomFieldValueDto} The populated <code>ContactCustomFieldValueDto</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new ContactCustomFieldValueDto();

            if (data.hasOwnProperty('fieldCode')) {
                obj['fieldCode'] = ApiClient.convertToType(data['fieldCode'], 'String');
            }
            if (data.hasOwnProperty('value')) {
                obj['value'] = ApiClient.convertToType(data['value'], 'String');
            }
            if (data.hasOwnProperty('optionValues')) {
                obj['optionValues'] = ApiClient.convertToType(data['optionValues'], [ContactCustomFieldOptionValueDto]);
            }
        }
        return obj;
    }


}

/**
 * @member {String} fieldCode
 */
ContactCustomFieldValueDto.prototype['fieldCode'] = undefined;

/**
 * @member {String} value
 */
ContactCustomFieldValueDto.prototype['value'] = undefined;

/**
 * @member {Array.<module:model/ContactCustomFieldOptionValueDto>} optionValues
 */
ContactCustomFieldValueDto.prototype['optionValues'] = undefined;






export default ContactCustomFieldValueDto;

