/**
 * IRN API v1
 * Allows users to extract, create, update and configure IRN data.
 *
 * The version of the OpenAPI document: 1.1.0
 * Contact: api@factset.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 *
 */

import ApiClient from '../ApiClient';
import CreateCustomSymbolCustomFieldValueDto from './CreateCustomSymbolCustomFieldValueDto';

/**
 * The CreateCustomSymbolDto model module.
 * @module model/CreateCustomSymbolDto
 */
class CreateCustomSymbolDto {
    /**
     * Constructs a new <code>CreateCustomSymbolDto</code>.
     * @alias module:model/CreateCustomSymbolDto
     */
    constructor() { 
        
        CreateCustomSymbolDto.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>CreateCustomSymbolDto</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/CreateCustomSymbolDto} obj Optional instance to populate.
     * @return {module:model/CreateCustomSymbolDto} The populated <code>CreateCustomSymbolDto</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new CreateCustomSymbolDto();

            if (data.hasOwnProperty('code')) {
                obj['code'] = ApiClient.convertToType(data['code'], 'String');
            }
            if (data.hasOwnProperty('name')) {
                obj['name'] = ApiClient.convertToType(data['name'], 'String');
            }
            if (data.hasOwnProperty('description')) {
                obj['description'] = ApiClient.convertToType(data['description'], 'String');
            }
            if (data.hasOwnProperty('typeId')) {
                obj['typeId'] = ApiClient.convertToType(data['typeId'], 'String');
            }
            if (data.hasOwnProperty('subTypeId')) {
                obj['subTypeId'] = ApiClient.convertToType(data['subTypeId'], 'String');
            }
            if (data.hasOwnProperty('googleMapsPlaceId')) {
                obj['googleMapsPlaceId'] = ApiClient.convertToType(data['googleMapsPlaceId'], 'String');
            }
            if (data.hasOwnProperty('formattedAddress')) {
                obj['formattedAddress'] = ApiClient.convertToType(data['formattedAddress'], 'String');
            }
            if (data.hasOwnProperty('city')) {
                obj['city'] = ApiClient.convertToType(data['city'], 'String');
            }
            if (data.hasOwnProperty('stateProvince')) {
                obj['stateProvince'] = ApiClient.convertToType(data['stateProvince'], 'String');
            }
            if (data.hasOwnProperty('postalCode')) {
                obj['postalCode'] = ApiClient.convertToType(data['postalCode'], 'String');
            }
            if (data.hasOwnProperty('country')) {
                obj['country'] = ApiClient.convertToType(data['country'], 'String');
            }
            if (data.hasOwnProperty('customFieldValues')) {
                obj['customFieldValues'] = ApiClient.convertToType(data['customFieldValues'], [CreateCustomSymbolCustomFieldValueDto]);
            }
        }
        return obj;
    }


}

/**
 * @member {String} code
 */
CreateCustomSymbolDto.prototype['code'] = undefined;

/**
 * @member {String} name
 */
CreateCustomSymbolDto.prototype['name'] = undefined;

/**
 * @member {String} description
 */
CreateCustomSymbolDto.prototype['description'] = undefined;

/**
 * @member {String} typeId
 */
CreateCustomSymbolDto.prototype['typeId'] = undefined;

/**
 * @member {String} subTypeId
 */
CreateCustomSymbolDto.prototype['subTypeId'] = undefined;

/**
 * @member {String} googleMapsPlaceId
 */
CreateCustomSymbolDto.prototype['googleMapsPlaceId'] = undefined;

/**
 * @member {String} formattedAddress
 */
CreateCustomSymbolDto.prototype['formattedAddress'] = undefined;

/**
 * @member {String} city
 */
CreateCustomSymbolDto.prototype['city'] = undefined;

/**
 * @member {String} stateProvince
 */
CreateCustomSymbolDto.prototype['stateProvince'] = undefined;

/**
 * @member {String} postalCode
 */
CreateCustomSymbolDto.prototype['postalCode'] = undefined;

/**
 * @member {String} country
 */
CreateCustomSymbolDto.prototype['country'] = undefined;

/**
 * @member {Array.<module:model/CreateCustomSymbolCustomFieldValueDto>} customFieldValues
 */
CreateCustomSymbolDto.prototype['customFieldValues'] = undefined;






export default CreateCustomSymbolDto;

