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

/**
 * The InlineResponse2005DataReportedKeyFiguresFirstFiscalYearCurrencyDependentKeyFiguresEbit model module.
 * @module model/InlineResponse2005DataReportedKeyFiguresFirstFiscalYearCurrencyDependentKeyFiguresEbit
 */
class InlineResponse2005DataReportedKeyFiguresFirstFiscalYearCurrencyDependentKeyFiguresEbit {
    /**
     * Constructs a new <code>InlineResponse2005DataReportedKeyFiguresFirstFiscalYearCurrencyDependentKeyFiguresEbit</code>.
     * EBIT (earnings before interest and taxes).
     * @alias module:model/InlineResponse2005DataReportedKeyFiguresFirstFiscalYearCurrencyDependentKeyFiguresEbit
     */
    constructor() { 
        
        InlineResponse2005DataReportedKeyFiguresFirstFiscalYearCurrencyDependentKeyFiguresEbit.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>InlineResponse2005DataReportedKeyFiguresFirstFiscalYearCurrencyDependentKeyFiguresEbit</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/InlineResponse2005DataReportedKeyFiguresFirstFiscalYearCurrencyDependentKeyFiguresEbit} obj Optional instance to populate.
     * @return {module:model/InlineResponse2005DataReportedKeyFiguresFirstFiscalYearCurrencyDependentKeyFiguresEbit} The populated <code>InlineResponse2005DataReportedKeyFiguresFirstFiscalYearCurrencyDependentKeyFiguresEbit</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new InlineResponse2005DataReportedKeyFiguresFirstFiscalYearCurrencyDependentKeyFiguresEbit();

            if (data.hasOwnProperty('minimum')) {
                obj['minimum'] = ApiClient.convertToType(data['minimum'], 'Number');
            }
            if (data.hasOwnProperty('maximum')) {
                obj['maximum'] = ApiClient.convertToType(data['maximum'], 'Number');
            }
        }
        return obj;
    }


}

/**
 * Minimum value.
 * @member {Number} minimum
 */
InlineResponse2005DataReportedKeyFiguresFirstFiscalYearCurrencyDependentKeyFiguresEbit.prototype['minimum'] = undefined;

/**
 * Maximum value.
 * @member {Number} maximum
 */
InlineResponse2005DataReportedKeyFiguresFirstFiscalYearCurrencyDependentKeyFiguresEbit.prototype['maximum'] = undefined;






export default InlineResponse2005DataReportedKeyFiguresFirstFiscalYearCurrencyDependentKeyFiguresEbit;

