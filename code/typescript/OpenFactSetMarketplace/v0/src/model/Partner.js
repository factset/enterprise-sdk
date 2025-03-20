/**
 * Open:FactSet Marketplace API
 * This API provides read-only access to marketplace products and partners.
 *
 * The version of the OpenAPI document: 0.1.0
 * Contact: api@factset.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 *
 */

import ApiClient from '../ApiClient';
import PartnerAddress from './PartnerAddress';
import PartnerSocialMedia from './PartnerSocialMedia';

/**
 * The Partner model module.
 * @module model/Partner
 */
class Partner {
    /**
     * Constructs a new <code>Partner</code>.
     * Partner object
     * @alias module:model/Partner
     * @param id {String} Partner unique identifier, used in the request URL
     * @param partnerPageUrl {String} URL of the partner's page on the partner catalog.
     * @param name {String} Partner name
     * @param logo {String} Partner logo URL
     * @param shortDescription {String} Partner short description (plain text), appearing on the partner's card within the FactSet Partner Catalog.
     * @param fullDescription {String} Partner full description (HTML)
     * @param workflow {Array.<String>} An array of strings describing the Partner's workflow(s), used as categories on FactSet's Partner Catalog.
     * @param type {module:model/Partner.TypeEnum} Partner type, describing the Partner's relationship with FactSet
     */
    constructor(id, partnerPageUrl, name, logo, shortDescription, fullDescription, workflow, type) { 
        
        Partner.initialize(this, id, partnerPageUrl, name, logo, shortDescription, fullDescription, workflow, type);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj, id, partnerPageUrl, name, logo, shortDescription, fullDescription, workflow, type) { 
        obj['id'] = id;
        obj['partnerPageUrl'] = partnerPageUrl;
        obj['name'] = name;
        obj['logo'] = logo;
        obj['shortDescription'] = shortDescription;
        obj['fullDescription'] = fullDescription;
        obj['workflow'] = workflow;
        obj['type'] = type;
    }

    /**
     * Constructs a <code>Partner</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/Partner} obj Optional instance to populate.
     * @return {module:model/Partner} The populated <code>Partner</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new Partner();

            if (data.hasOwnProperty('id')) {
                obj['id'] = ApiClient.convertToType(data['id'], 'String');
            }
            if (data.hasOwnProperty('partnerPageUrl')) {
                obj['partnerPageUrl'] = ApiClient.convertToType(data['partnerPageUrl'], 'String');
            }
            if (data.hasOwnProperty('name')) {
                obj['name'] = ApiClient.convertToType(data['name'], 'String');
            }
            if (data.hasOwnProperty('logo')) {
                obj['logo'] = ApiClient.convertToType(data['logo'], 'String');
            }
            if (data.hasOwnProperty('shortDescription')) {
                obj['shortDescription'] = ApiClient.convertToType(data['shortDescription'], 'String');
            }
            if (data.hasOwnProperty('fullDescription')) {
                obj['fullDescription'] = ApiClient.convertToType(data['fullDescription'], 'String');
            }
            if (data.hasOwnProperty('workflow')) {
                obj['workflow'] = ApiClient.convertToType(data['workflow'], ['String']);
            }
            if (data.hasOwnProperty('type')) {
                obj['type'] = ApiClient.convertToType(data['type'], 'String');
            }
            if (data.hasOwnProperty('videoUrl')) {
                obj['videoUrl'] = ApiClient.convertToType(data['videoUrl'], 'String');
            }
            if (data.hasOwnProperty('socialMedia')) {
                obj['socialMedia'] = PartnerSocialMedia.constructFromObject(data['socialMedia']);
            }
            if (data.hasOwnProperty('companyUrl')) {
                obj['companyUrl'] = ApiClient.convertToType(data['companyUrl'], 'String');
            }
            if (data.hasOwnProperty('address')) {
                obj['address'] = PartnerAddress.constructFromObject(data['address']);
            }
        }
        return obj;
    }


}

/**
 * Partner unique identifier, used in the request URL
 * @member {String} id
 */
Partner.prototype['id'] = undefined;

/**
 * URL of the partner's page on the partner catalog.
 * @member {String} partnerPageUrl
 */
Partner.prototype['partnerPageUrl'] = undefined;

/**
 * Partner name
 * @member {String} name
 */
Partner.prototype['name'] = undefined;

/**
 * Partner logo URL
 * @member {String} logo
 */
Partner.prototype['logo'] = undefined;

/**
 * Partner short description (plain text), appearing on the partner's card within the FactSet Partner Catalog.
 * @member {String} shortDescription
 */
Partner.prototype['shortDescription'] = undefined;

/**
 * Partner full description (HTML)
 * @member {String} fullDescription
 */
Partner.prototype['fullDescription'] = undefined;

/**
 * An array of strings describing the Partner's workflow(s), used as categories on FactSet's Partner Catalog.
 * @member {Array.<String>} workflow
 */
Partner.prototype['workflow'] = undefined;

/**
 * Partner type, describing the Partner's relationship with FactSet
 * @member {module:model/Partner.TypeEnum} type
 */
Partner.prototype['type'] = undefined;

/**
 * Partner video URL
 * @member {String} videoUrl
 */
Partner.prototype['videoUrl'] = undefined;

/**
 * @member {module:model/PartnerSocialMedia} socialMedia
 */
Partner.prototype['socialMedia'] = undefined;

/**
 * Partner company URL
 * @member {String} companyUrl
 */
Partner.prototype['companyUrl'] = undefined;

/**
 * @member {module:model/PartnerAddress} address
 */
Partner.prototype['address'] = undefined;





/**
 * Allowed values for the <code>type</code> property.
 * @enum {String}
 * @readonly
 */
Partner['TypeEnum'] = {

    /**
     * value: "capabilityPartner"
     * @const
     */
    "capabilityPartner": "capabilityPartner",

    /**
     * value: "consultant"
     * @const
     */
    "consultant": "consultant",

    /**
     * value: "openFactSetPartner"
     * @const
     */
    "openFactSetPartner": "openFactSetPartner",

    /**
     * value: "dataPartner"
     * @const
     */
    "dataPartner": "dataPartner",

    /**
     * value: "technicalPartner"
     * @const
     */
    "technicalPartner": "technicalPartner"
};



export default Partner;

