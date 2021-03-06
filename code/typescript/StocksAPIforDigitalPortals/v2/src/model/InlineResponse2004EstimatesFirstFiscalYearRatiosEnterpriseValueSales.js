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
 * The InlineResponse2004EstimatesFirstFiscalYearRatiosEnterpriseValueSales model module.
 * @module model/InlineResponse2004EstimatesFirstFiscalYearRatiosEnterpriseValueSales
 */
class InlineResponse2004EstimatesFirstFiscalYearRatiosEnterpriseValueSales {
    /**
     * Constructs a new <code>InlineResponse2004EstimatesFirstFiscalYearRatiosEnterpriseValueSales</code>.
     * Ratio of the enterprise value, divided by the total amount of sales revenue.
     * @alias module:model/InlineResponse2004EstimatesFirstFiscalYearRatiosEnterpriseValueSales
     */
    constructor() { 
        
        InlineResponse2004EstimatesFirstFiscalYearRatiosEnterpriseValueSales.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>InlineResponse2004EstimatesFirstFiscalYearRatiosEnterpriseValueSales</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/InlineResponse2004EstimatesFirstFiscalYearRatiosEnterpriseValueSales} obj Optional instance to populate.
     * @return {module:model/InlineResponse2004EstimatesFirstFiscalYearRatiosEnterpriseValueSales} The populated <code>InlineResponse2004EstimatesFirstFiscalYearRatiosEnterpriseValueSales</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new InlineResponse2004EstimatesFirstFiscalYearRatiosEnterpriseValueSales();

            if (data.hasOwnProperty('mean')) {
                obj['mean'] = ApiClient.convertToType(data['mean'], 'Number');
            }
        }
        return obj;
    }


}

/**
 * Mean value.
 * @member {Number} mean
 */
InlineResponse2004EstimatesFirstFiscalYearRatiosEnterpriseValueSales.prototype['mean'] = undefined;






export default InlineResponse2004EstimatesFirstFiscalYearRatiosEnterpriseValueSales;

