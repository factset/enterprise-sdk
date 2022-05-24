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
 * The CustomSymbolAddressDto model module.
 * @module model/CustomSymbolAddressDto
 * @version 0.20.0
 */
class CustomSymbolAddressDto {
    /**
     * Constructs a new <code>CustomSymbolAddressDto</code>.
     * @alias module:model/CustomSymbolAddressDto
     */
    constructor() { 
        
        CustomSymbolAddressDto.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>CustomSymbolAddressDto</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/CustomSymbolAddressDto} obj Optional instance to populate.
     * @return {module:model/CustomSymbolAddressDto} The populated <code>CustomSymbolAddressDto</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new CustomSymbolAddressDto();

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
        }
        return obj;
    }


}

/**
 * @member {String} googleMapsPlaceId
 */
CustomSymbolAddressDto.prototype['googleMapsPlaceId'] = undefined;

/**
 * @member {String} formattedAddress
 */
CustomSymbolAddressDto.prototype['formattedAddress'] = undefined;

/**
 * @member {String} city
 */
CustomSymbolAddressDto.prototype['city'] = undefined;

/**
 * @member {String} stateProvince
 */
CustomSymbolAddressDto.prototype['stateProvince'] = undefined;

/**
 * @member {String} postalCode
 */
CustomSymbolAddressDto.prototype['postalCode'] = undefined;

/**
 * @member {String} country
 */
CustomSymbolAddressDto.prototype['country'] = undefined;






export default CustomSymbolAddressDto;
