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

/**
 * The ProfileDataItemMetaAnyOf model module.
 * @module model/ProfileDataItemMetaAnyOf
 */
class ProfileDataItemMetaAnyOf {
    /**
     * Constructs a new <code>ProfileDataItemMetaAnyOf</code>.
     * @alias module:model/ProfileDataItemMetaAnyOf
     */
    constructor() { 
        
        ProfileDataItemMetaAnyOf.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>ProfileDataItemMetaAnyOf</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/ProfileDataItemMetaAnyOf} obj Optional instance to populate.
     * @return {module:model/ProfileDataItemMetaAnyOf} The populated <code>ProfileDataItemMetaAnyOf</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new ProfileDataItemMetaAnyOf();

            if (data.hasOwnProperty('currencyCode')) {
                obj['currencyCode'] = ApiClient.convertToType(data['currencyCode'], 'String');
            }
            if (data.hasOwnProperty('currencySymbol')) {
                obj['currencySymbol'] = ApiClient.convertToType(data['currencySymbol'], 'String');
            }
            if (data.hasOwnProperty('scale')) {
                obj['scale'] = ApiClient.convertToType(data['scale'], 'Number');
            }
        }
        return obj;
    }


}

/**
 * Code for data currency
 * @member {String} currencyCode
 */
ProfileDataItemMetaAnyOf.prototype['currencyCode'] = undefined;

/**
 * Symbol for data currency
 * @member {String} currencySymbol
 */
ProfileDataItemMetaAnyOf.prototype['currencySymbol'] = undefined;

/**
 * Integer power of 10 to which numbers have been scaled. For example: 6 implies millions. Default is 0. 
 * @member {Number} scale
 */
ProfileDataItemMetaAnyOf.prototype['scale'] = undefined;






export default ProfileDataItemMetaAnyOf;

