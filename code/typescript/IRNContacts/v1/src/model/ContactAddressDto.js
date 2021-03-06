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
 * The ContactAddressDto model module.
 * @module model/ContactAddressDto
 */
class ContactAddressDto {
    /**
     * Constructs a new <code>ContactAddressDto</code>.
     * @alias module:model/ContactAddressDto
     */
    constructor() { 
        
        ContactAddressDto.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>ContactAddressDto</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/ContactAddressDto} obj Optional instance to populate.
     * @return {module:model/ContactAddressDto} The populated <code>ContactAddressDto</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new ContactAddressDto();

            if (data.hasOwnProperty('GoogleMapsPlaceId')) {
                obj['GoogleMapsPlaceId'] = ApiClient.convertToType(data['GoogleMapsPlaceId'], 'String');
            }
            if (data.hasOwnProperty('FormattedAddress')) {
                obj['FormattedAddress'] = ApiClient.convertToType(data['FormattedAddress'], 'String');
            }
            if (data.hasOwnProperty('City')) {
                obj['City'] = ApiClient.convertToType(data['City'], 'String');
            }
            if (data.hasOwnProperty('StateProvince')) {
                obj['StateProvince'] = ApiClient.convertToType(data['StateProvince'], 'String');
            }
            if (data.hasOwnProperty('PostalCode')) {
                obj['PostalCode'] = ApiClient.convertToType(data['PostalCode'], 'String');
            }
            if (data.hasOwnProperty('Country')) {
                obj['Country'] = ApiClient.convertToType(data['Country'], 'String');
            }
        }
        return obj;
    }


}

/**
 * @member {String} GoogleMapsPlaceId
 */
ContactAddressDto.prototype['GoogleMapsPlaceId'] = undefined;

/**
 * @member {String} FormattedAddress
 */
ContactAddressDto.prototype['FormattedAddress'] = undefined;

/**
 * @member {String} City
 */
ContactAddressDto.prototype['City'] = undefined;

/**
 * @member {String} StateProvince
 */
ContactAddressDto.prototype['StateProvince'] = undefined;

/**
 * @member {String} PostalCode
 */
ContactAddressDto.prototype['PostalCode'] = undefined;

/**
 * @member {String} Country
 */
ContactAddressDto.prototype['Country'] = undefined;






export default ContactAddressDto;

