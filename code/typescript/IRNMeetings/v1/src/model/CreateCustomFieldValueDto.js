/**
 * IRN API v1
 * Allows users to extract, create, update and configure IRN data.
 *
 * The version of the OpenAPI document: 1.4.0
 * Contact: api@factset.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 *
 */

import ApiClient from '../ApiClient';
import UserTeamLookupDto from './UserTeamLookupDto';

/**
 * The CreateCustomFieldValueDto model module.
 * @module model/CreateCustomFieldValueDto
 */
class CreateCustomFieldValueDto {
    /**
     * Constructs a new <code>CreateCustomFieldValueDto</code>.
     * Set a value or values for a custom field identified by the field &#39;Code&#39;. Only one of the fields (IntegerValue / TextValue / FilePathValue etc) will be used,  depending on the data type of the custom field corresponding to the &#39;Code&#39; provided
     * @alias module:model/CreateCustomFieldValueDto
     * @param code {String} 
     */
    constructor(code) { 
        
        CreateCustomFieldValueDto.initialize(this, code);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj, code) { 
        obj['code'] = code;
    }

    /**
     * Constructs a <code>CreateCustomFieldValueDto</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/CreateCustomFieldValueDto} obj Optional instance to populate.
     * @return {module:model/CreateCustomFieldValueDto} The populated <code>CreateCustomFieldValueDto</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new CreateCustomFieldValueDto();

            if (data.hasOwnProperty('code')) {
                obj['code'] = ApiClient.convertToType(data['code'], 'String');
            }
            if (data.hasOwnProperty('integerValue')) {
                obj['integerValue'] = ApiClient.convertToType(data['integerValue'], 'Number');
            }
            if (data.hasOwnProperty('textValue')) {
                obj['textValue'] = ApiClient.convertToType(data['textValue'], 'String');
            }
            if (data.hasOwnProperty('filePathValue')) {
                obj['filePathValue'] = ApiClient.convertToType(data['filePathValue'], 'String');
            }
            if (data.hasOwnProperty('numericValue')) {
                obj['numericValue'] = ApiClient.convertToType(data['numericValue'], 'Number');
            }
            if (data.hasOwnProperty('dateValue')) {
                obj['dateValue'] = ApiClient.convertToType(data['dateValue'], 'String');
            }
            if (data.hasOwnProperty('extendedTextValue')) {
                obj['extendedTextValue'] = ApiClient.convertToType(data['extendedTextValue'], 'String');
            }
            if (data.hasOwnProperty('contactLookupValues')) {
                obj['contactLookupValues'] = ApiClient.convertToType(data['contactLookupValues'], ['String']);
            }
            if (data.hasOwnProperty('optionValue')) {
                obj['optionValue'] = ApiClient.convertToType(data['optionValue'], 'String');
            }
            if (data.hasOwnProperty('optionValues')) {
                obj['optionValues'] = ApiClient.convertToType(data['optionValues'], ['String']);
            }
            if (data.hasOwnProperty('userTeamLookupValues')) {
                obj['userTeamLookupValues'] = UserTeamLookupDto.constructFromObject(data['userTeamLookupValues']);
            }
        }
        return obj;
    }


}

/**
 * @member {String} code
 */
CreateCustomFieldValueDto.prototype['code'] = undefined;

/**
 * @member {Number} integerValue
 */
CreateCustomFieldValueDto.prototype['integerValue'] = undefined;

/**
 * @member {String} textValue
 */
CreateCustomFieldValueDto.prototype['textValue'] = undefined;

/**
 * @member {String} filePathValue
 */
CreateCustomFieldValueDto.prototype['filePathValue'] = undefined;

/**
 * @member {Number} numericValue
 */
CreateCustomFieldValueDto.prototype['numericValue'] = undefined;

/**
 * @member {String} dateValue
 */
CreateCustomFieldValueDto.prototype['dateValue'] = undefined;

/**
 * @member {String} extendedTextValue
 */
CreateCustomFieldValueDto.prototype['extendedTextValue'] = undefined;

/**
 * @member {Array.<String>} contactLookupValues
 */
CreateCustomFieldValueDto.prototype['contactLookupValues'] = undefined;

/**
 * @member {String} optionValue
 */
CreateCustomFieldValueDto.prototype['optionValue'] = undefined;

/**
 * @member {Array.<String>} optionValues
 */
CreateCustomFieldValueDto.prototype['optionValues'] = undefined;

/**
 * @member {module:model/UserTeamLookupDto} userTeamLookupValues
 */
CreateCustomFieldValueDto.prototype['userTeamLookupValues'] = undefined;






export default CreateCustomFieldValueDto;

