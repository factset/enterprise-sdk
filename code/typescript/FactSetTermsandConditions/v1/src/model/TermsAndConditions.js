/**
 * FactSet Terms & Conditions API
 * The FactSet Terms & Conditions API exposes Terms & Conditions data for Fixed Income Corporate, Governement & Agency securities. The FactSet Corporate Government & Agency Terms & Conditions library provides descriptive data on the issue level, such as offering details, redemption information, and coupon schedules. Issuer level data is also available. Coverage is global and includes corporate, sovereign, and agency issues. 
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

/**
 * The TermsAndConditions model module.
 * @module model/TermsAndConditions
 */
class TermsAndConditions {
    /**
     * Constructs a new <code>TermsAndConditions</code>.
     * Terms And Conditions data items for a Fixed Income security.
     * @alias module:model/TermsAndConditions
     * @extends Object
     * @param requestId {String} Security identifier used in the request.
     * @param fsymId {String} FactSet Permanent Security Identifier.
     */
    constructor(requestId, fsymId) { 
        
        TermsAndConditions.initialize(this, requestId, fsymId);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj, requestId, fsymId) { 
        obj['requestId'] = requestId;
        obj['fsymId'] = fsymId;
    }

    /**
     * Constructs a <code>TermsAndConditions</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/TermsAndConditions} obj Optional instance to populate.
     * @return {module:model/TermsAndConditions} The populated <code>TermsAndConditions</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new TermsAndConditions();

            ApiClient.constructFromObject(data, obj, 'Object');
            

            if (data.hasOwnProperty('requestId')) {
                obj['requestId'] = ApiClient.convertToType(data['requestId'], 'String');
            }
            if (data.hasOwnProperty('fsymId')) {
                obj['fsymId'] = ApiClient.convertToType(data['fsymId'], 'String');
            }
        }
        return obj;
    }


}

/**
 * Security identifier used in the request.
 * @member {String} requestId
 */
TermsAndConditions.prototype['requestId'] = undefined;

/**
 * FactSet Permanent Security Identifier.
 * @member {String} fsymId
 */
TermsAndConditions.prototype['fsymId'] = undefined;






export default TermsAndConditions;

