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
import KeyStatsAttributeMetaPeriodicity from './KeyStatsAttributeMetaPeriodicity';
import ProfileDataObjectBusinessCrunchbaseCategories from './ProfileDataObjectBusinessCrunchbaseCategories';
import ProfileDataObjectBusinessCrunchbaseUrl from './ProfileDataObjectBusinessCrunchbaseUrl';
import ProfileDataObjectBusinessDescription from './ProfileDataObjectBusinessDescription';

/**
 * The ProfileDataObjectBusiness model module.
 * @module model/ProfileDataObjectBusiness
 */
class ProfileDataObjectBusiness {
    /**
     * Constructs a new <code>ProfileDataObjectBusiness</code>.
     * @alias module:model/ProfileDataObjectBusiness
     * @param description {module:model/ProfileDataObjectBusinessDescription} 
     * @param industry {module:model/KeyStatsAttributeMetaPeriodicity} 
     * @param name {module:model/KeyStatsAttributeMetaPeriodicity} 
     * @param sector {module:model/KeyStatsAttributeMetaPeriodicity} 
     */
    constructor(description, industry, name, sector) { 
        
        ProfileDataObjectBusiness.initialize(this, description, industry, name, sector);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj, description, industry, name, sector) { 
        obj['description'] = description;
        obj['industry'] = industry;
        obj['name'] = name;
        obj['sector'] = sector;
    }

    /**
     * Constructs a <code>ProfileDataObjectBusiness</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/ProfileDataObjectBusiness} obj Optional instance to populate.
     * @return {module:model/ProfileDataObjectBusiness} The populated <code>ProfileDataObjectBusiness</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new ProfileDataObjectBusiness();

            if (data.hasOwnProperty('crunchbaseCategories')) {
                obj['crunchbaseCategories'] = ProfileDataObjectBusinessCrunchbaseCategories.constructFromObject(data['crunchbaseCategories']);
            }
            if (data.hasOwnProperty('crunchbaseUrl')) {
                obj['crunchbaseUrl'] = ProfileDataObjectBusinessCrunchbaseUrl.constructFromObject(data['crunchbaseUrl']);
            }
            if (data.hasOwnProperty('dbaName')) {
                obj['dbaName'] = KeyStatsAttributeMetaPeriodicity.constructFromObject(data['dbaName']);
            }
            if (data.hasOwnProperty('description')) {
                obj['description'] = ProfileDataObjectBusinessDescription.constructFromObject(data['description']);
            }
            if (data.hasOwnProperty('industry')) {
                obj['industry'] = KeyStatsAttributeMetaPeriodicity.constructFromObject(data['industry']);
            }
            if (data.hasOwnProperty('name')) {
                obj['name'] = KeyStatsAttributeMetaPeriodicity.constructFromObject(data['name']);
            }
            if (data.hasOwnProperty('sector')) {
                obj['sector'] = KeyStatsAttributeMetaPeriodicity.constructFromObject(data['sector']);
            }
        }
        return obj;
    }


}

/**
 * @member {module:model/ProfileDataObjectBusinessCrunchbaseCategories} crunchbaseCategories
 */
ProfileDataObjectBusiness.prototype['crunchbaseCategories'] = undefined;

/**
 * @member {module:model/ProfileDataObjectBusinessCrunchbaseUrl} crunchbaseUrl
 */
ProfileDataObjectBusiness.prototype['crunchbaseUrl'] = undefined;

/**
 * @member {module:model/KeyStatsAttributeMetaPeriodicity} dbaName
 */
ProfileDataObjectBusiness.prototype['dbaName'] = undefined;

/**
 * @member {module:model/ProfileDataObjectBusinessDescription} description
 */
ProfileDataObjectBusiness.prototype['description'] = undefined;

/**
 * @member {module:model/KeyStatsAttributeMetaPeriodicity} industry
 */
ProfileDataObjectBusiness.prototype['industry'] = undefined;

/**
 * @member {module:model/KeyStatsAttributeMetaPeriodicity} name
 */
ProfileDataObjectBusiness.prototype['name'] = undefined;

/**
 * @member {module:model/KeyStatsAttributeMetaPeriodicity} sector
 */
ProfileDataObjectBusiness.prototype['sector'] = undefined;






export default ProfileDataObjectBusiness;

