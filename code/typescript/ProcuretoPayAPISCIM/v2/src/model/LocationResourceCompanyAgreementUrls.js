/**
 * FactSet SCIM API
 * FactSet's SCIM API implementation.
 *
 * The version of the OpenAPI document: 2.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 *
 */

import ApiClient from '../ApiClient';

/**
 * The LocationResourceCompanyAgreementUrls model module.
 * @module model/LocationResourceCompanyAgreementUrls
 */
class LocationResourceCompanyAgreementUrls {
    /**
     * Constructs a new <code>LocationResourceCompanyAgreementUrls</code>.
     * @alias module:model/LocationResourceCompanyAgreementUrls
     * @param ref {String} The company agreement URL for authorizing pre-established Exchange Entitlements for this location. This URL must use either the \"http\" or \"https\" schemas and the URL must be available for download by FactSet systems.
     */
    constructor(ref) { 
        
        LocationResourceCompanyAgreementUrls.initialize(this, ref);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj, ref) { 
        obj['$ref'] = ref;
    }

    /**
     * Constructs a <code>LocationResourceCompanyAgreementUrls</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/LocationResourceCompanyAgreementUrls} obj Optional instance to populate.
     * @return {module:model/LocationResourceCompanyAgreementUrls} The populated <code>LocationResourceCompanyAgreementUrls</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new LocationResourceCompanyAgreementUrls();

            if (data.hasOwnProperty('$ref')) {
                obj['$ref'] = ApiClient.convertToType(data['$ref'], 'String');
            }
        }
        return obj;
    }


}

/**
 * The company agreement URL for authorizing pre-established Exchange Entitlements for this location. This URL must use either the \"http\" or \"https\" schemas and the URL must be available for download by FactSet systems.
 * @member {String} $ref
 */
LocationResourceCompanyAgreementUrls.prototype['$ref'] = undefined;






export default LocationResourceCompanyAgreementUrls;

