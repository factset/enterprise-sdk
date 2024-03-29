/**
 * FactSet Overview Report Builder API
 * Get relevant industry-specific data for high level analysis of public and private companies
 *
 * The version of the OpenAPI document: 1.2.0
 * Contact: api@factset.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 *
 */

import ApiClient from '../ApiClient';
import ProfileDataBusinessIndustry from './ProfileDataBusinessIndustry';

/**
 * The ProfileDataContactPeople model module.
 * @module model/ProfileDataContactPeople
 */
class ProfileDataContactPeople {
    /**
     * Constructs a new <code>ProfileDataContactPeople</code>.
     * @alias module:model/ProfileDataContactPeople
     * @param title {module:model/ProfileDataBusinessIndustry} 
     * @param name {module:model/ProfileDataBusinessIndustry} 
     * @param id {module:model/ProfileDataBusinessIndustry} 
     */
    constructor(title, name, id) { 
        
        ProfileDataContactPeople.initialize(this, title, name, id);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj, title, name, id) { 
        obj['title'] = title;
        obj['name'] = name;
        obj['id'] = id;
    }

    /**
     * Constructs a <code>ProfileDataContactPeople</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/ProfileDataContactPeople} obj Optional instance to populate.
     * @return {module:model/ProfileDataContactPeople} The populated <code>ProfileDataContactPeople</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new ProfileDataContactPeople();

            if (data.hasOwnProperty('title')) {
                obj['title'] = ProfileDataBusinessIndustry.constructFromObject(data['title']);
            }
            if (data.hasOwnProperty('name')) {
                obj['name'] = ProfileDataBusinessIndustry.constructFromObject(data['name']);
            }
            if (data.hasOwnProperty('id')) {
                obj['id'] = ProfileDataBusinessIndustry.constructFromObject(data['id']);
            }
        }
        return obj;
    }


}

/**
 * @member {module:model/ProfileDataBusinessIndustry} title
 */
ProfileDataContactPeople.prototype['title'] = undefined;

/**
 * @member {module:model/ProfileDataBusinessIndustry} name
 */
ProfileDataContactPeople.prototype['name'] = undefined;

/**
 * @member {module:model/ProfileDataBusinessIndustry} id
 */
ProfileDataContactPeople.prototype['id'] = undefined;






export default ProfileDataContactPeople;

