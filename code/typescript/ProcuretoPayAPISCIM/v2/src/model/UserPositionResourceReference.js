/**
 * FactSet SCIM API
 * FactSet's SCIM API implementation.
 *
 * The version of the OpenAPI document: 2.3.0
 * Contact: api@factset.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 *
 */

import ApiClient from '../ApiClient';

/**
 * The UserPositionResourceReference model module.
 * @module model/UserPositionResourceReference
 */
class UserPositionResourceReference {
    /**
     * Constructs a new <code>UserPositionResourceReference</code>.
     * @alias module:model/UserPositionResourceReference
     * @param value {String} Identifier of the User Position.
     */
    constructor(value) { 
        
        UserPositionResourceReference.initialize(this, value);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj, value) { 
        obj['value'] = value;
    }

    /**
     * Constructs a <code>UserPositionResourceReference</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/UserPositionResourceReference} obj Optional instance to populate.
     * @return {module:model/UserPositionResourceReference} The populated <code>UserPositionResourceReference</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new UserPositionResourceReference();

            if (data.hasOwnProperty('value')) {
                obj['value'] = ApiClient.convertToType(data['value'], 'String');
            }
            if (data.hasOwnProperty('$ref')) {
                obj['$ref'] = ApiClient.convertToType(data['$ref'], 'String');
            }
            if (data.hasOwnProperty('display')) {
                obj['display'] = ApiClient.convertToType(data['display'], 'String');
            }
        }
        return obj;
    }


}

/**
 * Identifier of the User Position.
 * @member {String} value
 */
UserPositionResourceReference.prototype['value'] = undefined;

/**
 * The URI corresponding to a SCIM resource that is this User Position.
 * @member {String} $ref
 */
UserPositionResourceReference.prototype['$ref'] = undefined;

/**
 * A human-readable name, primarily used for display purposes.
 * @member {String} display
 */
UserPositionResourceReference.prototype['display'] = undefined;






export default UserPositionResourceReference;

