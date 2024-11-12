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
 * The InvoiceDetailsServiceDetailsExchangeFees model module.
 * @module model/InvoiceDetailsServiceDetailsExchangeFees
 */
class InvoiceDetailsServiceDetailsExchangeFees {
    /**
     * Constructs a new <code>InvoiceDetailsServiceDetailsExchangeFees</code>.
     * @alias module:model/InvoiceDetailsServiceDetailsExchangeFees
     */
    constructor() { 
        
        InvoiceDetailsServiceDetailsExchangeFees.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>InvoiceDetailsServiceDetailsExchangeFees</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/InvoiceDetailsServiceDetailsExchangeFees} obj Optional instance to populate.
     * @return {module:model/InvoiceDetailsServiceDetailsExchangeFees} The populated <code>InvoiceDetailsServiceDetailsExchangeFees</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new InvoiceDetailsServiceDetailsExchangeFees();

            if (data.hasOwnProperty('accountId')) {
                obj['accountId'] = ApiClient.convertToType(data['accountId'], 'String');
            }
            if (data.hasOwnProperty('invoiceId')) {
                obj['invoiceId'] = ApiClient.convertToType(data['invoiceId'], 'String');
            }
            if (data.hasOwnProperty('productId')) {
                obj['productId'] = ApiClient.convertToType(data['productId'], 'Number');
            }
            if (data.hasOwnProperty('quanitity')) {
                obj['quanitity'] = ApiClient.convertToType(data['quanitity'], 'Number');
            }
            if (data.hasOwnProperty('displayName')) {
                obj['displayName'] = ApiClient.convertToType(data['displayName'], 'String');
            }
            if (data.hasOwnProperty('unitPrice')) {
                obj['unitPrice'] = ApiClient.convertToType(data['unitPrice'], 'Number');
            }
            if (data.hasOwnProperty('discount')) {
                obj['discount'] = ApiClient.convertToType(data['discount'], 'Number');
            }
            if (data.hasOwnProperty('lastMonthAdd')) {
                obj['lastMonthAdd'] = ApiClient.convertToType(data['lastMonthAdd'], 'Boolean');
            }
        }
        return obj;
    }


}

/**
 * @member {String} accountId
 */
InvoiceDetailsServiceDetailsExchangeFees.prototype['accountId'] = undefined;

/**
 * =accountId + 2 char year + 2 char month
 * @member {String} invoiceId
 */
InvoiceDetailsServiceDetailsExchangeFees.prototype['invoiceId'] = undefined;

/**
 * @member {Number} productId
 */
InvoiceDetailsServiceDetailsExchangeFees.prototype['productId'] = undefined;

/**
 * @member {Number} quanitity
 */
InvoiceDetailsServiceDetailsExchangeFees.prototype['quanitity'] = undefined;

/**
 * @member {String} displayName
 */
InvoiceDetailsServiceDetailsExchangeFees.prototype['displayName'] = undefined;

/**
 * @member {Number} unitPrice
 */
InvoiceDetailsServiceDetailsExchangeFees.prototype['unitPrice'] = undefined;

/**
 * @member {Number} discount
 */
InvoiceDetailsServiceDetailsExchangeFees.prototype['discount'] = undefined;

/**
 * @member {Boolean} lastMonthAdd
 */
InvoiceDetailsServiceDetailsExchangeFees.prototype['lastMonthAdd'] = undefined;






export default InvoiceDetailsServiceDetailsExchangeFees;

