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
import CustomSymbolSubTypeDto from './CustomSymbolSubTypeDto';
import EntityType from './EntityType';

/**
 * The UpdateCustomSymbolTypeDto model module.
 * @module model/UpdateCustomSymbolTypeDto
 */
class UpdateCustomSymbolTypeDto {
    /**
     * Constructs a new <code>UpdateCustomSymbolTypeDto</code>.
     * @alias module:model/UpdateCustomSymbolTypeDto
     * @param name {String} 
     */
    constructor(name) { 
        
        UpdateCustomSymbolTypeDto.initialize(this, name);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj, name) { 
        obj['Name'] = name;
    }

    /**
     * Constructs a <code>UpdateCustomSymbolTypeDto</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/UpdateCustomSymbolTypeDto} obj Optional instance to populate.
     * @return {module:model/UpdateCustomSymbolTypeDto} The populated <code>UpdateCustomSymbolTypeDto</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new UpdateCustomSymbolTypeDto();

            if (data.hasOwnProperty('Name')) {
                obj['Name'] = ApiClient.convertToType(data['Name'], 'String');
            }
            if (data.hasOwnProperty('HideAddressField')) {
                obj['HideAddressField'] = ApiClient.convertToType(data['HideAddressField'], 'Boolean');
            }
            if (data.hasOwnProperty('HideSymbolSubtype')) {
                obj['HideSymbolSubtype'] = ApiClient.convertToType(data['HideSymbolSubtype'], 'Boolean');
            }
            if (data.hasOwnProperty('IsDefault')) {
                obj['IsDefault'] = ApiClient.convertToType(data['IsDefault'], 'Boolean');
            }
            if (data.hasOwnProperty('DueDiligenceSymbolEntityType')) {
                obj['DueDiligenceSymbolEntityType'] = EntityType.constructFromObject(data['DueDiligenceSymbolEntityType']);
            }
            if (data.hasOwnProperty('SubTypes')) {
                obj['SubTypes'] = ApiClient.convertToType(data['SubTypes'], [CustomSymbolSubTypeDto]);
            }
            if (data.hasOwnProperty('CustomFieldIds')) {
                obj['CustomFieldIds'] = ApiClient.convertToType(data['CustomFieldIds'], ['String']);
            }
        }
        return obj;
    }


}

/**
 * @member {String} Name
 */
UpdateCustomSymbolTypeDto.prototype['Name'] = undefined;

/**
 * @member {Boolean} HideAddressField
 */
UpdateCustomSymbolTypeDto.prototype['HideAddressField'] = undefined;

/**
 * @member {Boolean} HideSymbolSubtype
 */
UpdateCustomSymbolTypeDto.prototype['HideSymbolSubtype'] = undefined;

/**
 * @member {Boolean} IsDefault
 * @default false
 */
UpdateCustomSymbolTypeDto.prototype['IsDefault'] = false;

/**
 * @member {module:model/EntityType} DueDiligenceSymbolEntityType
 */
UpdateCustomSymbolTypeDto.prototype['DueDiligenceSymbolEntityType'] = undefined;

/**
 * @member {Array.<module:model/CustomSymbolSubTypeDto>} SubTypes
 */
UpdateCustomSymbolTypeDto.prototype['SubTypes'] = undefined;

/**
 * @member {Array.<String>} CustomFieldIds
 */
UpdateCustomSymbolTypeDto.prototype['CustomFieldIds'] = undefined;






export default UpdateCustomSymbolTypeDto;

