/**
 * Classifications API
 * The Classifications API gives access to various Industry Classifications for a given list of securities. Beginning first with GICS Direct, the service will then expand to offering NAICS, SIC, RBICS, and more.  
 *
 * The version of the OpenAPI document: 1.0.1
 * Contact: api@factset.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 *
 */

import ApiClient from '../ApiClient';

/**
 * The Gics model module.
 * @module model/Gics
 */
class Gics {
    /**
     * Constructs a new <code>Gics</code>.
     * @alias module:model/Gics
     */
    constructor() { 
        
        Gics.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>Gics</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/Gics} obj Optional instance to populate.
     * @return {module:model/Gics} The populated <code>Gics</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new Gics();

            if (data.hasOwnProperty('fsymId')) {
                obj['fsymId'] = ApiClient.convertToType(data['fsymId'], 'String');
            }
            if (data.hasOwnProperty('date')) {
                obj['date'] = ApiClient.convertToType(data['date'], 'Date');
            }
            if (data.hasOwnProperty('gicsSectorName')) {
                obj['gicsSectorName'] = ApiClient.convertToType(data['gicsSectorName'], 'String');
            }
            if (data.hasOwnProperty('gicsSectorNumber')) {
                obj['gicsSectorNumber'] = ApiClient.convertToType(data['gicsSectorNumber'], 'String');
            }
            if (data.hasOwnProperty('gicsIndustryGroupName')) {
                obj['gicsIndustryGroupName'] = ApiClient.convertToType(data['gicsIndustryGroupName'], 'String');
            }
            if (data.hasOwnProperty('gicsIndustryGroupNumber')) {
                obj['gicsIndustryGroupNumber'] = ApiClient.convertToType(data['gicsIndustryGroupNumber'], 'String');
            }
            if (data.hasOwnProperty('gicsIndustryName')) {
                obj['gicsIndustryName'] = ApiClient.convertToType(data['gicsIndustryName'], 'String');
            }
            if (data.hasOwnProperty('gicsIndustryNumber')) {
                obj['gicsIndustryNumber'] = ApiClient.convertToType(data['gicsIndustryNumber'], 'String');
            }
            if (data.hasOwnProperty('gicsSubIndustryName')) {
                obj['gicsSubIndustryName'] = ApiClient.convertToType(data['gicsSubIndustryName'], 'String');
            }
            if (data.hasOwnProperty('gicsSubIndustryNumber')) {
                obj['gicsSubIndustryNumber'] = ApiClient.convertToType(data['gicsSubIndustryNumber'], 'String');
            }
            if (data.hasOwnProperty('requestId')) {
                obj['requestId'] = ApiClient.convertToType(data['requestId'], 'String');
            }
        }
        return obj;
    }


}

/**
 * FactSet Entity Identifier by default, otherwise returns FactSet Regional Identifier. This is a six alpha-numeric characters, excluding vowels, with an -E suffix (XXXXXX-E).
 * @member {String} fsymId
 */
Gics.prototype['fsymId'] = undefined;

/**
 * Date in YYYY-MM-DD for the classification record from GICS Direct
 * @member {Date} date
 */
Gics.prototype['date'] = undefined;

/**
 * GICS Sector Name in Proper Format.
 * @member {String} gicsSectorName
 */
Gics.prototype['gicsSectorName'] = undefined;

/**
 * GICS Sector Number
 * @member {String} gicsSectorNumber
 */
Gics.prototype['gicsSectorNumber'] = undefined;

/**
 * GICS Industry Group Name in Proper Format.
 * @member {String} gicsIndustryGroupName
 */
Gics.prototype['gicsIndustryGroupName'] = undefined;

/**
 * GICS Industry Group Number
 * @member {String} gicsIndustryGroupNumber
 */
Gics.prototype['gicsIndustryGroupNumber'] = undefined;

/**
 * GICS Industry Name in Proper Format.
 * @member {String} gicsIndustryName
 */
Gics.prototype['gicsIndustryName'] = undefined;

/**
 * GICS Industry Number
 * @member {String} gicsIndustryNumber
 */
Gics.prototype['gicsIndustryNumber'] = undefined;

/**
 * GICS Sub-Industry Name in Proper Format.
 * @member {String} gicsSubIndustryName
 */
Gics.prototype['gicsSubIndustryName'] = undefined;

/**
 * GICS Industry Number.
 * @member {String} gicsSubIndustryNumber
 */
Gics.prototype['gicsSubIndustryNumber'] = undefined;

/**
 * Identifier specified in the request
 * @member {String} requestId
 */
Gics.prototype['requestId'] = undefined;






export default Gics;

