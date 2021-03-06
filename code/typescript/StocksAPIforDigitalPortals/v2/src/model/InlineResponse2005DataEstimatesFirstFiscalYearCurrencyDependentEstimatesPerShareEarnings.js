/**
 * Prime Developer Trial
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: v1
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 *
 */

import ApiClient from '../ApiClient';
import InlineResponse2005DataEstimatesFirstFiscalYearCurrencyDependentEstimatesEbitMean from './InlineResponse2005DataEstimatesFirstFiscalYearCurrencyDependentEstimatesEbitMean';

/**
 * The InlineResponse2005DataEstimatesFirstFiscalYearCurrencyDependentEstimatesPerShareEarnings model module.
 * @module model/InlineResponse2005DataEstimatesFirstFiscalYearCurrencyDependentEstimatesPerShareEarnings
 */
class InlineResponse2005DataEstimatesFirstFiscalYearCurrencyDependentEstimatesPerShareEarnings {
    /**
     * Constructs a new <code>InlineResponse2005DataEstimatesFirstFiscalYearCurrencyDependentEstimatesPerShareEarnings</code>.
     * Earnings per share (EPS), which is ratio of the net income, divided by the shares outstanding. For European equities, EPS is adjusted for exceptional and any non-recurring items. For Asian equities, EPS is as reported (as per local accounting standards). For US, Canada &amp; South Africa, EPS reflects the analysts’ and company’s standards.
     * @alias module:model/InlineResponse2005DataEstimatesFirstFiscalYearCurrencyDependentEstimatesPerShareEarnings
     */
    constructor() { 
        
        InlineResponse2005DataEstimatesFirstFiscalYearCurrencyDependentEstimatesPerShareEarnings.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>InlineResponse2005DataEstimatesFirstFiscalYearCurrencyDependentEstimatesPerShareEarnings</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/InlineResponse2005DataEstimatesFirstFiscalYearCurrencyDependentEstimatesPerShareEarnings} obj Optional instance to populate.
     * @return {module:model/InlineResponse2005DataEstimatesFirstFiscalYearCurrencyDependentEstimatesPerShareEarnings} The populated <code>InlineResponse2005DataEstimatesFirstFiscalYearCurrencyDependentEstimatesPerShareEarnings</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new InlineResponse2005DataEstimatesFirstFiscalYearCurrencyDependentEstimatesPerShareEarnings();

            if (data.hasOwnProperty('mean')) {
                obj['mean'] = InlineResponse2005DataEstimatesFirstFiscalYearCurrencyDependentEstimatesEbitMean.constructFromObject(data['mean']);
            }
        }
        return obj;
    }


}

/**
 * @member {module:model/InlineResponse2005DataEstimatesFirstFiscalYearCurrencyDependentEstimatesEbitMean} mean
 */
InlineResponse2005DataEstimatesFirstFiscalYearCurrencyDependentEstimatesPerShareEarnings.prototype['mean'] = undefined;






export default InlineResponse2005DataEstimatesFirstFiscalYearCurrencyDependentEstimatesPerShareEarnings;

