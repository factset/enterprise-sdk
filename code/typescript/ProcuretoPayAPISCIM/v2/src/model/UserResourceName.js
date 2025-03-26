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
 * The UserResourceName model module.
 * @module model/UserResourceName
 */
class UserResourceName {
    /**
     * Constructs a new <code>UserResourceName</code>.
     * The components of the user&#39;s real name. Providers MAY return just the full name as a single string in the formatted sub-attribute, or they MAY return just the individual component attributes using the other sub-attributes, or they MAY return both.  If both variants are returned, they SHOULD be describing the same name, with the formatted name indicating how the component attributes should be combined.
     * @alias module:model/UserResourceName
     * @param familyName {String} The family name of the User, or last name in most Western languages (e.g., 'Jensen' given the full name 'Ms. Barbara J Jensen, III').
     * @param givenName {String} The given name of the User, or first name in most Western languages (e.g., 'Barbara' given the full name 'Ms. Barbara J Jensen, III').
     */
    constructor(familyName, givenName) { 
        
        UserResourceName.initialize(this, familyName, givenName);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj, familyName, givenName) { 
        obj['familyName'] = familyName;
        obj['givenName'] = givenName;
    }

    /**
     * Constructs a <code>UserResourceName</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/UserResourceName} obj Optional instance to populate.
     * @return {module:model/UserResourceName} The populated <code>UserResourceName</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new UserResourceName();

            if (data.hasOwnProperty('familyName')) {
                obj['familyName'] = ApiClient.convertToType(data['familyName'], 'String');
            }
            if (data.hasOwnProperty('givenName')) {
                obj['givenName'] = ApiClient.convertToType(data['givenName'], 'String');
            }
        }
        return obj;
    }


}

/**
 * The family name of the User, or last name in most Western languages (e.g., 'Jensen' given the full name 'Ms. Barbara J Jensen, III').
 * @member {String} familyName
 */
UserResourceName.prototype['familyName'] = undefined;

/**
 * The given name of the User, or first name in most Western languages (e.g., 'Barbara' given the full name 'Ms. Barbara J Jensen, III').
 * @member {String} givenName
 */
UserResourceName.prototype['givenName'] = undefined;






export default UserResourceName;

