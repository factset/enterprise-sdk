/**
 * FactSet SCIM API
 * FactSet's SCIM API implementation.
 *
 * The version of the OpenAPI document: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 *
 */

import ApiClient from '../ApiClient';

/**
 * The ServiceProviderConfigChangePassword model module.
 * @module model/ServiceProviderConfigChangePassword
 * @version 0.20.0
 */
class ServiceProviderConfigChangePassword {
    /**
     * Constructs a new <code>ServiceProviderConfigChangePassword</code>.
     * A complex type that specifies configuration options related to changing a password.
     * @alias module:model/ServiceProviderConfigChangePassword
     * @param supported {Boolean} A Boolean value specifying whether or not the operation is supported.
     */
    constructor(supported) { 
        
        ServiceProviderConfigChangePassword.initialize(this, supported);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj, supported) { 
        obj['supported'] = supported;
    }

    /**
     * Constructs a <code>ServiceProviderConfigChangePassword</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/ServiceProviderConfigChangePassword} obj Optional instance to populate.
     * @return {module:model/ServiceProviderConfigChangePassword} The populated <code>ServiceProviderConfigChangePassword</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new ServiceProviderConfigChangePassword();

            if (data.hasOwnProperty('supported')) {
                obj['supported'] = ApiClient.convertToType(data['supported'], 'Boolean');
            }
        }
        return obj;
    }


}

/**
 * A Boolean value specifying whether or not the operation is supported.
 * @member {Boolean} supported
 */
ServiceProviderConfigChangePassword.prototype['supported'] = undefined;






export default ServiceProviderConfigChangePassword;
