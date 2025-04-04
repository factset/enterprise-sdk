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
 * The ProfileDataObjectStagePevcLatestPostMoneyValuation model module.
 * @module model/ProfileDataObjectStagePevcLatestPostMoneyValuation
 */
class ProfileDataObjectStagePevcLatestPostMoneyValuation {
    /**
     * Constructs a new <code>ProfileDataObjectStagePevcLatestPostMoneyValuation</code>.
     * @alias module:model/ProfileDataObjectStagePevcLatestPostMoneyValuation
     * @param asOfDate {Number} 
     * @param value {Number} 
     */
    constructor(asOfDate, value) { 
        
        ProfileDataObjectStagePevcLatestPostMoneyValuation.initialize(this, asOfDate, value);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj, asOfDate, value) { 
        obj['asOfDate'] = asOfDate;
        obj['value'] = value;
    }

    /**
     * Constructs a <code>ProfileDataObjectStagePevcLatestPostMoneyValuation</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/ProfileDataObjectStagePevcLatestPostMoneyValuation} obj Optional instance to populate.
     * @return {module:model/ProfileDataObjectStagePevcLatestPostMoneyValuation} The populated <code>ProfileDataObjectStagePevcLatestPostMoneyValuation</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new ProfileDataObjectStagePevcLatestPostMoneyValuation();

            if (data.hasOwnProperty('asOfDate')) {
                obj['asOfDate'] = ApiClient.convertToType(data['asOfDate'], 'Number');
            }
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
 * @member {Number} asOfDate
 */
ProfileDataObjectStagePevcLatestPostMoneyValuation.prototype['asOfDate'] = undefined;

/**
 * @member {module:model/ProfileDataItemMeta} meta
 */
ProfileDataObjectStagePevcLatestPostMoneyValuation.prototype['meta'] = undefined;

/**
 * @member {Number} value
 */
ProfileDataObjectStagePevcLatestPostMoneyValuation.prototype['value'] = undefined;






export default ProfileDataObjectStagePevcLatestPostMoneyValuation;

