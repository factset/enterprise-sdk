/**
 * Invoice and Billing Endpoints
 * API endpoints for managing and downloading FactSet Invoices
 *
 * The version of the OpenAPI document: 1K
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 *
 */

import ApiClient from '../ApiClient';

/**
 * The InvoiceDetailsTaxDetails model module.
 * @module model/InvoiceDetailsTaxDetails
 */
class InvoiceDetailsTaxDetails {
    /**
     * Constructs a new <code>InvoiceDetailsTaxDetails</code>.
     * @alias module:model/InvoiceDetailsTaxDetails
     */
    constructor() { 
        
        InvoiceDetailsTaxDetails.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>InvoiceDetailsTaxDetails</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/InvoiceDetailsTaxDetails} obj Optional instance to populate.
     * @return {module:model/InvoiceDetailsTaxDetails} The populated <code>InvoiceDetailsTaxDetails</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new InvoiceDetailsTaxDetails();

            if (data.hasOwnProperty('services')) {
                obj['services'] = ApiClient.convertToType(data['services'], 'Number');
            }
            if (data.hasOwnProperty('tax')) {
                obj['tax'] = ApiClient.convertToType(data['tax'], 'Number');
            }
            if (data.hasOwnProperty('allocationPercent')) {
                obj['allocationPercent'] = ApiClient.convertToType(data['allocationPercent'], 'Number');
            }
            if (data.hasOwnProperty('taxRate')) {
                obj['taxRate'] = ApiClient.convertToType(data['taxRate'], 'String');
            }
            if (data.hasOwnProperty('taxZone')) {
                obj['taxZone'] = ApiClient.convertToType(data['taxZone'], 'String');
            }
            if (data.hasOwnProperty('currencySymbol')) {
                obj['currencySymbol'] = ApiClient.convertToType(data['currencySymbol'], 'String');
            }
            if (data.hasOwnProperty('conversionRatio')) {
                obj['conversionRatio'] = ApiClient.convertToType(data['conversionRatio'], 'Number');
            }
            if (data.hasOwnProperty('ukExchangeRate')) {
                obj['ukExchangeRate'] = ApiClient.convertToType(data['ukExchangeRate'], 'Number');
            }
        }
        return obj;
    }


}

/**
 * @member {Number} services
 */
InvoiceDetailsTaxDetails.prototype['services'] = undefined;

/**
 * @member {Number} tax
 */
InvoiceDetailsTaxDetails.prototype['tax'] = undefined;

/**
 * Taxes allocation to a particular TaxZone
 * @member {Number} allocationPercent
 */
InvoiceDetailsTaxDetails.prototype['allocationPercent'] = undefined;

/**
 * @member {String} taxRate
 */
InvoiceDetailsTaxDetails.prototype['taxRate'] = undefined;

/**
 * @member {String} taxZone
 */
InvoiceDetailsTaxDetails.prototype['taxZone'] = undefined;

/**
 * @member {String} currencySymbol
 */
InvoiceDetailsTaxDetails.prototype['currencySymbol'] = undefined;

/**
 * @member {Number} conversionRatio
 */
InvoiceDetailsTaxDetails.prototype['conversionRatio'] = undefined;

/**
 * @member {Number} ukExchangeRate
 */
InvoiceDetailsTaxDetails.prototype['ukExchangeRate'] = undefined;






export default InvoiceDetailsTaxDetails;

