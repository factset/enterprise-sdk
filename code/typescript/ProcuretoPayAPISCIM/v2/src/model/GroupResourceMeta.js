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
 * The GroupResourceMeta model module.
 * @module model/GroupResourceMeta
 */
class GroupResourceMeta {
    /**
     * Constructs a new <code>GroupResourceMeta</code>.
     * @alias module:model/GroupResourceMeta
     */
    constructor() { 
        
        GroupResourceMeta.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>GroupResourceMeta</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/GroupResourceMeta} obj Optional instance to populate.
     * @return {module:model/GroupResourceMeta} The populated <code>GroupResourceMeta</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new GroupResourceMeta();

            if (data.hasOwnProperty('resourceType')) {
                obj['resourceType'] = ApiClient.convertToType(data['resourceType'], 'String');
            }
            if (data.hasOwnProperty('created')) {
                obj['created'] = ApiClient.convertToType(data['created'], 'Date');
            }
            if (data.hasOwnProperty('lastModified')) {
                obj['lastModified'] = ApiClient.convertToType(data['lastModified'], 'Date');
            }
            if (data.hasOwnProperty('location')) {
                obj['location'] = ApiClient.convertToType(data['location'], 'String');
            }
        }
        return obj;
    }


}

/**
 * @member {String} resourceType
 */
GroupResourceMeta.prototype['resourceType'] = undefined;

/**
 * @member {Date} created
 */
GroupResourceMeta.prototype['created'] = undefined;

/**
 * @member {Date} lastModified
 */
GroupResourceMeta.prototype['lastModified'] = undefined;

/**
 * @member {String} location
 */
GroupResourceMeta.prototype['location'] = undefined;






export default GroupResourceMeta;

