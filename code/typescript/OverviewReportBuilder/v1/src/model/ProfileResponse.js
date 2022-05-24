/**
 * FactSet Overview Report Builder API
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
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
import ProfileData from './ProfileData';

/**
 * The ProfileResponse model module.
 * @module model/ProfileResponse
 * @version 0.20.0
 */
class ProfileResponse {
    /**
     * Constructs a new <code>ProfileResponse</code>.
     * @alias module:model/ProfileResponse
     */
    constructor() { 
        
        ProfileResponse.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>ProfileResponse</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/ProfileResponse} obj Optional instance to populate.
     * @return {module:model/ProfileResponse} The populated <code>ProfileResponse</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new ProfileResponse();

            if (data.hasOwnProperty('data')) {
                obj['data'] = ProfileData.constructFromObject(data['data']);
            }
            if (data.hasOwnProperty('meta')) {
                obj['meta'] = ApiClient.convertToType(data['meta'], {'String': 'String'});
            }
        }
        return obj;
    }


}

/**
 * @member {module:model/ProfileData} data
 */
ProfileResponse.prototype['data'] = undefined;

/**
 * @member {Object.<String, String>} meta
 */
ProfileResponse.prototype['meta'] = undefined;






export default ProfileResponse;
