/**
 * FactSet SCIM API
 * FactSet's SCIM API implementation.
 *
 * The version of the OpenAPI document: 2.4.0
 * Contact: api@factset.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 *
 */

import ApiClient from '../ApiClient';
import UserResourceVRSDomainData from './UserResourceVRSDomainData';

/**
 * The UserResourceUrnScimSchemasExtensionFactSetVRS10User model module.
 * @module model/UserResourceUrnScimSchemasExtensionFactSetVRS10User
 */
class UserResourceUrnScimSchemasExtensionFactSetVRS10User {
    /**
     * Constructs a new <code>UserResourceUrnScimSchemasExtensionFactSetVRS10User</code>.
     * @alias module:model/UserResourceUrnScimSchemasExtensionFactSetVRS10User
     */
    constructor() { 
        
        UserResourceUrnScimSchemasExtensionFactSetVRS10User.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>UserResourceUrnScimSchemasExtensionFactSetVRS10User</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/UserResourceUrnScimSchemasExtensionFactSetVRS10User} obj Optional instance to populate.
     * @return {module:model/UserResourceUrnScimSchemasExtensionFactSetVRS10User} The populated <code>UserResourceUrnScimSchemasExtensionFactSetVRS10User</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new UserResourceUrnScimSchemasExtensionFactSetVRS10User();

            if (data.hasOwnProperty('domainData')) {
                obj['domainData'] = ApiClient.convertToType(data['domainData'], [UserResourceVRSDomainData]);
            }
        }
        return obj;
    }


}

/**
 * A set of attributes pertaining to individual Vermilion domains.
 * @member {Array.<module:model/UserResourceVRSDomainData>} domainData
 */
UserResourceUrnScimSchemasExtensionFactSetVRS10User.prototype['domainData'] = undefined;






export default UserResourceUrnScimSchemasExtensionFactSetVRS10User;

