/**
 * Open:Risk API
 * Service to calculate parametric linear risk statistics and generate risk model asset identifier mappings.
 *
 * The version of the OpenAPI document: 1.26.0
 * Contact: api@factset.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 *
 */

import ApiClient from '../ApiClient';
import StatCalculationLevel from './StatCalculationLevel';
import SupportedStatDetailsSecurityGroupMethod from './SupportedStatDetailsSecurityGroupMethod';

/**
 * The SupportedStatDetails model module.
 * @module model/SupportedStatDetails
 */
class SupportedStatDetails {
    /**
     * Constructs a new <code>SupportedStatDetails</code>.
     * Details on support and/or requirement for certain name-settings statistics options (such as: correlated specific risk, covariance isolation method, etc.), derived stats, available levels, security group calculation methodology, and multi-lot security allocation. When &#39;securityGroupMethod&#39; is &#39;statSpecific&#39;, please refer to the risk statistics documentation service or inquire for more information.
     * @alias module:model/SupportedStatDetails
     * @param correlatedSpecificRisk {Boolean} Indicates support for correlated specific risk (CSR) calculation setting if true, and false if the setting is prohibited.
     * @param covarianceTimesTwo {Boolean} Indicates support for covariance times two (Cov*2) calculation setting if true, and false if the setting is prohibited.
     * @param requiresCorrelatedSpecificRisk {Boolean} Indicates correlated specific risk (CSR) calculation setting is mandatory for the stat, if true.
     * @param requiresCovarianceTimesTwo {Boolean} Indicates covariance times two (Cov*2) calculation setting is mandatory for the stat, if true.
     * @param derived {Array.<String>} A list of the base stat and all possible derived stats which are currently supported by the service.
     * @param supportedLevels {Array.<module:model/StatCalculationLevel>} Indicates the calculation levels that are supported by the base stat and all derived stats. Unless it is present, a given calculation level is not supported.
     */
    constructor(correlatedSpecificRisk, covarianceTimesTwo, requiresCorrelatedSpecificRisk, requiresCovarianceTimesTwo, derived, supportedLevels) { 
        
        SupportedStatDetails.initialize(this, correlatedSpecificRisk, covarianceTimesTwo, requiresCorrelatedSpecificRisk, requiresCovarianceTimesTwo, derived, supportedLevels);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj, correlatedSpecificRisk, covarianceTimesTwo, requiresCorrelatedSpecificRisk, requiresCovarianceTimesTwo, derived, supportedLevels) { 
        obj['correlatedSpecificRisk'] = correlatedSpecificRisk;
        obj['covarianceTimesTwo'] = covarianceTimesTwo;
        obj['requiresCorrelatedSpecificRisk'] = requiresCorrelatedSpecificRisk;
        obj['requiresCovarianceTimesTwo'] = requiresCovarianceTimesTwo;
        obj['derived'] = derived;
        obj['supportedLevels'] = supportedLevels;
    }

    /**
     * Constructs a <code>SupportedStatDetails</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/SupportedStatDetails} obj Optional instance to populate.
     * @return {module:model/SupportedStatDetails} The populated <code>SupportedStatDetails</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new SupportedStatDetails();

            if (data.hasOwnProperty('correlatedSpecificRisk')) {
                obj['correlatedSpecificRisk'] = ApiClient.convertToType(data['correlatedSpecificRisk'], 'Boolean');
            }
            if (data.hasOwnProperty('covarianceTimesTwo')) {
                obj['covarianceTimesTwo'] = ApiClient.convertToType(data['covarianceTimesTwo'], 'Boolean');
            }
            if (data.hasOwnProperty('requiresCorrelatedSpecificRisk')) {
                obj['requiresCorrelatedSpecificRisk'] = ApiClient.convertToType(data['requiresCorrelatedSpecificRisk'], 'Boolean');
            }
            if (data.hasOwnProperty('requiresCovarianceTimesTwo')) {
                obj['requiresCovarianceTimesTwo'] = ApiClient.convertToType(data['requiresCovarianceTimesTwo'], 'Boolean');
            }
            if (data.hasOwnProperty('derived')) {
                obj['derived'] = ApiClient.convertToType(data['derived'], ['String']);
            }
            if (data.hasOwnProperty('supportedLevels')) {
                obj['supportedLevels'] = ApiClient.convertToType(data['supportedLevels'], [StatCalculationLevel]);
            }
            if (data.hasOwnProperty('securityGroupMethod')) {
                obj['securityGroupMethod'] = SupportedStatDetailsSecurityGroupMethod.constructFromObject(data['securityGroupMethod']);
            }
            if (data.hasOwnProperty('securityLotAllocation')) {
                obj['securityLotAllocation'] = ApiClient.convertToType(data['securityLotAllocation'], 'String');
            }
        }
        return obj;
    }


}

/**
 * Indicates support for correlated specific risk (CSR) calculation setting if true, and false if the setting is prohibited.
 * @member {Boolean} correlatedSpecificRisk
 */
SupportedStatDetails.prototype['correlatedSpecificRisk'] = undefined;

/**
 * Indicates support for covariance times two (Cov*2) calculation setting if true, and false if the setting is prohibited.
 * @member {Boolean} covarianceTimesTwo
 */
SupportedStatDetails.prototype['covarianceTimesTwo'] = undefined;

/**
 * Indicates correlated specific risk (CSR) calculation setting is mandatory for the stat, if true.
 * @member {Boolean} requiresCorrelatedSpecificRisk
 */
SupportedStatDetails.prototype['requiresCorrelatedSpecificRisk'] = undefined;

/**
 * Indicates covariance times two (Cov*2) calculation setting is mandatory for the stat, if true.
 * @member {Boolean} requiresCovarianceTimesTwo
 */
SupportedStatDetails.prototype['requiresCovarianceTimesTwo'] = undefined;

/**
 * A list of the base stat and all possible derived stats which are currently supported by the service.
 * @member {Array.<String>} derived
 */
SupportedStatDetails.prototype['derived'] = undefined;

/**
 * Indicates the calculation levels that are supported by the base stat and all derived stats. Unless it is present, a given calculation level is not supported.
 * @member {Array.<module:model/StatCalculationLevel>} supportedLevels
 */
SupportedStatDetails.prototype['supportedLevels'] = undefined;

/**
 * @member {module:model/SupportedStatDetailsSecurityGroupMethod} securityGroupMethod
 */
SupportedStatDetails.prototype['securityGroupMethod'] = undefined;

/**
 * Indicates the weights according to which securities with multiple lots have their risk statistic values allocated. 'FillAll' indicates the computed statistic value of a particular security is allocated to each of its lots equally. This is common for risk statistics such as marginal statistics or beta. If security group calculations are available, these weights will be used along with 'weighting' method specified in 'securityGroupMethod'. For example, if this is 'ActiveWeights' and 'weighting' is 'AbsoluteValue', a net position value is allocated to multiple lots based off of absolute active weights distribution.
 * @member {module:model/SupportedStatDetails.SecurityLotAllocationEnum} securityLotAllocation
 */
SupportedStatDetails.prototype['securityLotAllocation'] = undefined;





/**
 * Allowed values for the <code>securityLotAllocation</code> property.
 * @enum {String}
 * @readonly
 */
SupportedStatDetails['SecurityLotAllocationEnum'] = {

    /**
     * value: "PortfolioWeights"
     * @const
     */
    "PortfolioWeights": "PortfolioWeights",

    /**
     * value: "BenchmarkWeights"
     * @const
     */
    "BenchmarkWeights": "BenchmarkWeights",

    /**
     * value: "ActiveWeights"
     * @const
     */
    "ActiveWeights": "ActiveWeights",

    /**
     * value: "MarketWeights"
     * @const
     */
    "MarketWeights": "MarketWeights",

    /**
     * value: "FillAll"
     * @const
     */
    "FillAll": "FillAll"
};



export default SupportedStatDetails;

