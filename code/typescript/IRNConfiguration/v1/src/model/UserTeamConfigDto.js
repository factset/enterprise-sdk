/**
 * IRN API v1
 * Allows users to extract, create, update and configure IRN data.
 *
 * The version of the OpenAPI document: 1.0.0
 * Contact: api@factset.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 *
 */

import ApiClient from '../ApiClient';
import CustomFieldTeamConfigDto from './CustomFieldTeamConfigDto';
import CustomFieldUserTeamLookupFilterType from './CustomFieldUserTeamLookupFilterType';

/**
 * The UserTeamConfigDto model module.
 * @module model/UserTeamConfigDto
 */
class UserTeamConfigDto {
    /**
     * Constructs a new <code>UserTeamConfigDto</code>.
     * @alias module:model/UserTeamConfigDto
     */
    constructor() { 
        
        UserTeamConfigDto.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>UserTeamConfigDto</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/UserTeamConfigDto} obj Optional instance to populate.
     * @return {module:model/UserTeamConfigDto} The populated <code>UserTeamConfigDto</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new UserTeamConfigDto();

            if (data.hasOwnProperty('userTeamLookupFilterType')) {
                obj['userTeamLookupFilterType'] = CustomFieldUserTeamLookupFilterType.constructFromObject(data['userTeamLookupFilterType']);
            }
            if (data.hasOwnProperty('customFieldTeams')) {
                obj['customFieldTeams'] = ApiClient.convertToType(data['customFieldTeams'], [CustomFieldTeamConfigDto]);
            }
        }
        return obj;
    }


}

/**
 * @member {module:model/CustomFieldUserTeamLookupFilterType} userTeamLookupFilterType
 */
UserTeamConfigDto.prototype['userTeamLookupFilterType'] = undefined;

/**
 * @member {Array.<module:model/CustomFieldTeamConfigDto>} customFieldTeams
 */
UserTeamConfigDto.prototype['customFieldTeams'] = undefined;






export default UserTeamConfigDto;

