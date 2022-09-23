/**
 * Open:Risk API
 * Service to calculate parametric linear risk statistics and generate risk model asset identifier mappings.
 *
 * The version of the OpenAPI document: 1.21.0
 * Contact: ParametricRiskAnalyticsDevelopment@factset.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 *
 */

import ApiClient from '../ApiClient';

/**
 * The SupportedStatsLevels model module.
 * @module model/SupportedStatsLevels
 */
class SupportedStatsLevels {
    /**
     * Constructs a new <code>SupportedStatsLevels</code>.
     * Indicates whether each level is supported by the base stat and all derived stats
     * @alias module:model/SupportedStatsLevels
     * @param portfolio {Boolean} 
     * @param security {Boolean} 
     * @param securityGroup {Boolean} 
     * @param securitySecurity {Boolean} 
     * @param factor {Boolean} 
     * @param factorGroup {Boolean} 
     * @param factorFactor {Boolean} 
     * @param factorSecurity {Boolean} 
     * @param factorGroupSecurity {Boolean} 
     * @param factorSecurityGroup {Boolean} 
     * @param factorGroupSecurityGroup {Boolean} 
     */
    constructor(portfolio, security, securityGroup, securitySecurity, factor, factorGroup, factorFactor, factorSecurity, factorGroupSecurity, factorSecurityGroup, factorGroupSecurityGroup) { 
        
        SupportedStatsLevels.initialize(this, portfolio, security, securityGroup, securitySecurity, factor, factorGroup, factorFactor, factorSecurity, factorGroupSecurity, factorSecurityGroup, factorGroupSecurityGroup);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj, portfolio, security, securityGroup, securitySecurity, factor, factorGroup, factorFactor, factorSecurity, factorGroupSecurity, factorSecurityGroup, factorGroupSecurityGroup) { 
        obj['Portfolio'] = portfolio;
        obj['Security'] = security;
        obj['SecurityGroup'] = securityGroup;
        obj['SecuritySecurity'] = securitySecurity;
        obj['Factor'] = factor;
        obj['FactorGroup'] = factorGroup;
        obj['FactorFactor'] = factorFactor;
        obj['FactorSecurity'] = factorSecurity;
        obj['FactorGroupSecurity'] = factorGroupSecurity;
        obj['FactorSecurityGroup'] = factorSecurityGroup;
        obj['FactorGroupSecurityGroup'] = factorGroupSecurityGroup;
    }

    /**
     * Constructs a <code>SupportedStatsLevels</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/SupportedStatsLevels} obj Optional instance to populate.
     * @return {module:model/SupportedStatsLevels} The populated <code>SupportedStatsLevels</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new SupportedStatsLevels();

            if (data.hasOwnProperty('Portfolio')) {
                obj['Portfolio'] = ApiClient.convertToType(data['Portfolio'], 'Boolean');
            }
            if (data.hasOwnProperty('Security')) {
                obj['Security'] = ApiClient.convertToType(data['Security'], 'Boolean');
            }
            if (data.hasOwnProperty('SecurityGroup')) {
                obj['SecurityGroup'] = ApiClient.convertToType(data['SecurityGroup'], 'Boolean');
            }
            if (data.hasOwnProperty('SecuritySecurity')) {
                obj['SecuritySecurity'] = ApiClient.convertToType(data['SecuritySecurity'], 'Boolean');
            }
            if (data.hasOwnProperty('Factor')) {
                obj['Factor'] = ApiClient.convertToType(data['Factor'], 'Boolean');
            }
            if (data.hasOwnProperty('FactorGroup')) {
                obj['FactorGroup'] = ApiClient.convertToType(data['FactorGroup'], 'Boolean');
            }
            if (data.hasOwnProperty('FactorFactor')) {
                obj['FactorFactor'] = ApiClient.convertToType(data['FactorFactor'], 'Boolean');
            }
            if (data.hasOwnProperty('FactorSecurity')) {
                obj['FactorSecurity'] = ApiClient.convertToType(data['FactorSecurity'], 'Boolean');
            }
            if (data.hasOwnProperty('FactorGroupSecurity')) {
                obj['FactorGroupSecurity'] = ApiClient.convertToType(data['FactorGroupSecurity'], 'Boolean');
            }
            if (data.hasOwnProperty('FactorSecurityGroup')) {
                obj['FactorSecurityGroup'] = ApiClient.convertToType(data['FactorSecurityGroup'], 'Boolean');
            }
            if (data.hasOwnProperty('FactorGroupSecurityGroup')) {
                obj['FactorGroupSecurityGroup'] = ApiClient.convertToType(data['FactorGroupSecurityGroup'], 'Boolean');
            }
        }
        return obj;
    }


}

/**
 * @member {Boolean} Portfolio
 */
SupportedStatsLevels.prototype['Portfolio'] = undefined;

/**
 * @member {Boolean} Security
 */
SupportedStatsLevels.prototype['Security'] = undefined;

/**
 * @member {Boolean} SecurityGroup
 */
SupportedStatsLevels.prototype['SecurityGroup'] = undefined;

/**
 * @member {Boolean} SecuritySecurity
 */
SupportedStatsLevels.prototype['SecuritySecurity'] = undefined;

/**
 * @member {Boolean} Factor
 */
SupportedStatsLevels.prototype['Factor'] = undefined;

/**
 * @member {Boolean} FactorGroup
 */
SupportedStatsLevels.prototype['FactorGroup'] = undefined;

/**
 * @member {Boolean} FactorFactor
 */
SupportedStatsLevels.prototype['FactorFactor'] = undefined;

/**
 * @member {Boolean} FactorSecurity
 */
SupportedStatsLevels.prototype['FactorSecurity'] = undefined;

/**
 * @member {Boolean} FactorGroupSecurity
 */
SupportedStatsLevels.prototype['FactorGroupSecurity'] = undefined;

/**
 * @member {Boolean} FactorSecurityGroup
 */
SupportedStatsLevels.prototype['FactorSecurityGroup'] = undefined;

/**
 * @member {Boolean} FactorGroupSecurityGroup
 */
SupportedStatsLevels.prototype['FactorGroupSecurityGroup'] = undefined;






export default SupportedStatsLevels;
