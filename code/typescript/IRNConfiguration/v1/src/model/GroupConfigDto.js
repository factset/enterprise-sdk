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
import GroupFieldsDto from './GroupFieldsDto';

/**
 * The GroupConfigDto model module.
 * @module model/GroupConfigDto
 */
class GroupConfigDto {
    /**
     * Constructs a new <code>GroupConfigDto</code>.
     * @alias module:model/GroupConfigDto
     */
    constructor() { 
        
        GroupConfigDto.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>GroupConfigDto</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/GroupConfigDto} obj Optional instance to populate.
     * @return {module:model/GroupConfigDto} The populated <code>GroupConfigDto</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new GroupConfigDto();

            if (data.hasOwnProperty('Id')) {
                obj['Id'] = ApiClient.convertToType(data['Id'], 'String');
            }
            if (data.hasOwnProperty('Name')) {
                obj['Name'] = ApiClient.convertToType(data['Name'], 'String');
            }
            if (data.hasOwnProperty('Fields')) {
                obj['Fields'] = GroupFieldsDto.constructFromObject(data['Fields']);
            }
        }
        return obj;
    }


}

/**
 * @member {String} Id
 */
GroupConfigDto.prototype['Id'] = undefined;

/**
 * @member {String} Name
 */
GroupConfigDto.prototype['Name'] = undefined;

/**
 * @member {module:model/GroupFieldsDto} Fields
 */
GroupConfigDto.prototype['Fields'] = undefined;






export default GroupConfigDto;

