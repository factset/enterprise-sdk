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

/**
 * The ServiceProviderConfigPatch model module.
 * @module model/ServiceProviderConfigPatch
 */
class ServiceProviderConfigPatch {
    /**
     * Constructs a new <code>ServiceProviderConfigPatch</code>.
     * A complex type that specifies PATCH configuration options.
     * @alias module:model/ServiceProviderConfigPatch
     * @param supported {Boolean} A Boolean value specifying whether or not the operation is supported.
     */
    constructor(supported) { 
        
        ServiceProviderConfigPatch.initialize(this, supported);
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
     * Constructs a <code>ServiceProviderConfigPatch</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/ServiceProviderConfigPatch} obj Optional instance to populate.
     * @return {module:model/ServiceProviderConfigPatch} The populated <code>ServiceProviderConfigPatch</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new ServiceProviderConfigPatch();

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
ServiceProviderConfigPatch.prototype['supported'] = undefined;






export default ServiceProviderConfigPatch;

