/**
 * Open:FactSet Marketplace API
 * This API provides read-only access to marketplace products and partners.
 *
 * The version of the OpenAPI document: 3.0.0
 * Contact: api@factset.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 *
 */

import ApiClient from '../ApiClient';

/**
 * The PartnerSocialMedia model module.
 * @module model/PartnerSocialMedia
 */
class PartnerSocialMedia {
    /**
     * Constructs a new <code>PartnerSocialMedia</code>.
     * Partner social media URLs
     * @alias module:model/PartnerSocialMedia
     */
    constructor() { 
        
        PartnerSocialMedia.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>PartnerSocialMedia</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/PartnerSocialMedia} obj Optional instance to populate.
     * @return {module:model/PartnerSocialMedia} The populated <code>PartnerSocialMedia</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new PartnerSocialMedia();

            if (data.hasOwnProperty('linkedin')) {
                obj['linkedin'] = ApiClient.convertToType(data['linkedin'], 'String');
            }
            if (data.hasOwnProperty('x')) {
                obj['x'] = ApiClient.convertToType(data['x'], 'String');
            }
            if (data.hasOwnProperty('facebook')) {
                obj['facebook'] = ApiClient.convertToType(data['facebook'], 'String');
            }
        }
        return obj;
    }


}

/**
 * Partner LinkedIn URL
 * @member {String} linkedin
 */
PartnerSocialMedia.prototype['linkedin'] = undefined;

/**
 * Partner X URL
 * @member {String} x
 */
PartnerSocialMedia.prototype['x'] = undefined;

/**
 * Partner Facebook URL
 * @member {String} facebook
 */
PartnerSocialMedia.prototype['facebook'] = undefined;






export default PartnerSocialMedia;

