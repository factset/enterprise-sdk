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
import InvoiceDetailsSubscriptionChangesExchanges from './InvoiceDetailsSubscriptionChangesExchanges';

/**
 * The InvoiceDetailsSubscriptionChanges model module.
 * @module model/InvoiceDetailsSubscriptionChanges
 */
class InvoiceDetailsSubscriptionChanges {
    /**
     * Constructs a new <code>InvoiceDetailsSubscriptionChanges</code>.
     * Per Serial or per Username  subscription changes, returned by Product Group.
     * @alias module:model/InvoiceDetailsSubscriptionChanges
     */
    constructor() { 
        
        InvoiceDetailsSubscriptionChanges.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>InvoiceDetailsSubscriptionChanges</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/InvoiceDetailsSubscriptionChanges} obj Optional instance to populate.
     * @return {module:model/InvoiceDetailsSubscriptionChanges} The populated <code>InvoiceDetailsSubscriptionChanges</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new InvoiceDetailsSubscriptionChanges();

            if (data.hasOwnProperty('exchanges')) {
                obj['exchanges'] = ApiClient.convertToType(data['exchanges'], [InvoiceDetailsSubscriptionChangesExchanges]);
            }
        }
        return obj;
    }


}

/**
 * @member {Array.<module:model/InvoiceDetailsSubscriptionChangesExchanges>} exchanges
 */
InvoiceDetailsSubscriptionChanges.prototype['exchanges'] = undefined;






export default InvoiceDetailsSubscriptionChanges;

