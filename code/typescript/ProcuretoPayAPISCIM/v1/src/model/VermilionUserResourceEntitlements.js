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
 * The VermilionUserResourceEntitlements model module.
 * @module model/VermilionUserResourceEntitlements
 */
class VermilionUserResourceEntitlements {
    /**
     * Constructs a new <code>VermilionUserResourceEntitlements</code>.
     * @alias module:model/VermilionUserResourceEntitlements
     */
    constructor() { 
        
        VermilionUserResourceEntitlements.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>VermilionUserResourceEntitlements</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/VermilionUserResourceEntitlements} obj Optional instance to populate.
     * @return {module:model/VermilionUserResourceEntitlements} The populated <code>VermilionUserResourceEntitlements</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new VermilionUserResourceEntitlements();

            if (data.hasOwnProperty('value')) {
                obj['value'] = ApiClient.convertToType(data['value'], 'String');
            }
            if (data.hasOwnProperty('display')) {
                obj['display'] = ApiClient.convertToType(data['display'], 'String');
            }
            if (data.hasOwnProperty('type')) {
                obj['type'] = ApiClient.convertToType(data['type'], 'String');
            }
            if (data.hasOwnProperty('primary')) {
                obj['primary'] = ApiClient.convertToType(data['primary'], 'Boolean');
            }
        }
        return obj;
    }


}

/**
 * The value of an entitlement.
 * @member {String} value
 */
VermilionUserResourceEntitlements.prototype['value'] = undefined;

/**
 * A human-readable name, primarily used for display purposes. READ-ONLY.
 * @member {String} display
 */
VermilionUserResourceEntitlements.prototype['display'] = undefined;

/**
 * A label indicating the attribute's function.
 * @member {String} type
 */
VermilionUserResourceEntitlements.prototype['type'] = undefined;

/**
 * A Boolean value indicating the 'primary' or preferred attribute value for this attribute. The primary attribute value 'true' MUST appear no more than once.
 * @member {Boolean} primary
 */
VermilionUserResourceEntitlements.prototype['primary'] = undefined;






export default VermilionUserResourceEntitlements;

