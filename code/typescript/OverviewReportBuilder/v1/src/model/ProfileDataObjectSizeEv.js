/**
 * FactSet Overview Report Builder API
 * Get relevant industry-specific data for high level analysis of public and private companies
 *
 * The version of the OpenAPI document: 1.1.0
 * Contact: api@factset.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 *
 */

import ApiClient from '../ApiClient';
import ProfileDataItemMeta from './ProfileDataItemMeta';

/**
 * The ProfileDataObjectSizeEv model module.
 * @module model/ProfileDataObjectSizeEv
 */
class ProfileDataObjectSizeEv {
    /**
     * Constructs a new <code>ProfileDataObjectSizeEv</code>.
     * @alias module:model/ProfileDataObjectSizeEv
     * @param value {Number} 
     */
    constructor(value) { 
        
        ProfileDataObjectSizeEv.initialize(this, value);
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
     * Constructs a <code>ProfileDataObjectSizeEv</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/ProfileDataObjectSizeEv} obj Optional instance to populate.
     * @return {module:model/ProfileDataObjectSizeEv} The populated <code>ProfileDataObjectSizeEv</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new ProfileDataObjectSizeEv();

            if (data.hasOwnProperty('meta')) {
                obj['meta'] = ProfileDataItemMeta.constructFromObject(data['meta']);
            }
            if (data.hasOwnProperty('value')) {
                obj['value'] = ApiClient.convertToType(data['value'], 'Number');
            }
        }
        return obj;
    }


}

/**
 * @member {module:model/ProfileDataItemMeta} meta
 */
ProfileDataObjectSizeEv.prototype['meta'] = undefined;

/**
 * @member {Number} value
 */
ProfileDataObjectSizeEv.prototype['value'] = undefined;






export default ProfileDataObjectSizeEv;

