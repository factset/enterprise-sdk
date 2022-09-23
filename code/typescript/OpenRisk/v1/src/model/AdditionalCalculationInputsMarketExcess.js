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
 * The AdditionalCalculationInputsMarketExcess model module.
 * @module model/AdditionalCalculationInputsMarketExcess
 */
class AdditionalCalculationInputsMarketExcess {
    /**
     * Constructs a new <code>AdditionalCalculationInputsMarketExcess</code>.
     * User-defined values (all required) to compute the desired arbitrary &#39;excess return&#39; of the market portfolio (which is usually intended to be defined as a broad market index).
     * @alias module:model/AdditionalCalculationInputsMarketExcess
     * @param _return {Number} User-defined arbitrary return value measured from the market portfolio. The value is expected to be a scalar and the return horizon must match that of the factor returns. For example, if the factor returns used are daily-basis, the market return needs to be 1-day market return for the calculation. This number will be one of the inputs to calculate market timing effect.
     * @param riskFreeRate {Number} User-defined risk-free rate of return whose horizon must match that of the factor returns. This number will be one of the inputs to calculate market timing effect.
     * @param riskPremium {Number} Expected return of the market portfolio which is required to be an annualized return. This number will be one of the inputs to calculate market timing effect.
     * @param riskPremiumPeriodsPerYear {Number} Deannualization factor on the Market Risk Premium which can be any user-defined positive integer number. This number will be used to deannualize Market Risk Premium so that the expected market return horizon will match that of the factor returns. For example, if a risk model has daily factor returns, select desired integer such as 365 or 252.
     */
    constructor(_return, riskFreeRate, riskPremium, riskPremiumPeriodsPerYear) { 
        
        AdditionalCalculationInputsMarketExcess.initialize(this, _return, riskFreeRate, riskPremium, riskPremiumPeriodsPerYear);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj, _return, riskFreeRate, riskPremium, riskPremiumPeriodsPerYear) { 
        obj['return'] = _return;
        obj['riskFreeRate'] = riskFreeRate;
        obj['riskPremium'] = riskPremium;
        obj['riskPremiumPeriodsPerYear'] = riskPremiumPeriodsPerYear;
    }

    /**
     * Constructs a <code>AdditionalCalculationInputsMarketExcess</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/AdditionalCalculationInputsMarketExcess} obj Optional instance to populate.
     * @return {module:model/AdditionalCalculationInputsMarketExcess} The populated <code>AdditionalCalculationInputsMarketExcess</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new AdditionalCalculationInputsMarketExcess();

            if (data.hasOwnProperty('return')) {
                obj['return'] = ApiClient.convertToType(data['return'], 'Number');
            }
            if (data.hasOwnProperty('riskFreeRate')) {
                obj['riskFreeRate'] = ApiClient.convertToType(data['riskFreeRate'], 'Number');
            }
            if (data.hasOwnProperty('riskPremium')) {
                obj['riskPremium'] = ApiClient.convertToType(data['riskPremium'], 'Number');
            }
            if (data.hasOwnProperty('riskPremiumPeriodsPerYear')) {
                obj['riskPremiumPeriodsPerYear'] = ApiClient.convertToType(data['riskPremiumPeriodsPerYear'], 'Number');
            }
        }
        return obj;
    }


}

/**
 * User-defined arbitrary return value measured from the market portfolio. The value is expected to be a scalar and the return horizon must match that of the factor returns. For example, if the factor returns used are daily-basis, the market return needs to be 1-day market return for the calculation. This number will be one of the inputs to calculate market timing effect.
 * @member {Number} return
 */
AdditionalCalculationInputsMarketExcess.prototype['return'] = undefined;

/**
 * User-defined risk-free rate of return whose horizon must match that of the factor returns. This number will be one of the inputs to calculate market timing effect.
 * @member {Number} riskFreeRate
 */
AdditionalCalculationInputsMarketExcess.prototype['riskFreeRate'] = undefined;

/**
 * Expected return of the market portfolio which is required to be an annualized return. This number will be one of the inputs to calculate market timing effect.
 * @member {Number} riskPremium
 */
AdditionalCalculationInputsMarketExcess.prototype['riskPremium'] = undefined;

/**
 * Deannualization factor on the Market Risk Premium which can be any user-defined positive integer number. This number will be used to deannualize Market Risk Premium so that the expected market return horizon will match that of the factor returns. For example, if a risk model has daily factor returns, select desired integer such as 365 or 252.
 * @member {Number} riskPremiumPeriodsPerYear
 */
AdditionalCalculationInputsMarketExcess.prototype['riskPremiumPeriodsPerYear'] = undefined;






export default AdditionalCalculationInputsMarketExcess;
