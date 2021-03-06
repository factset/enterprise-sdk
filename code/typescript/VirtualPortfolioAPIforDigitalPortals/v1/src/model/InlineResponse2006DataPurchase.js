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
 * The InlineResponse2006DataPurchase model module.
 * @module model/InlineResponse2006DataPurchase
 */
class InlineResponse2006DataPurchase {
    /**
     * Constructs a new <code>InlineResponse2006DataPurchase</code>.
     * Purchase details of the position.
     * @alias module:model/InlineResponse2006DataPurchase
     */
    constructor() { 
        
        InlineResponse2006DataPurchase.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>InlineResponse2006DataPurchase</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/InlineResponse2006DataPurchase} obj Optional instance to populate.
     * @return {module:model/InlineResponse2006DataPurchase} The populated <code>InlineResponse2006DataPurchase</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new InlineResponse2006DataPurchase();

            if (data.hasOwnProperty('price')) {
                obj['price'] = ApiClient.convertToType(data['price'], 'Number');
            }
            if (data.hasOwnProperty('exchangeRate')) {
                obj['exchangeRate'] = ApiClient.convertToType(data['exchangeRate'], 'Number');
            }
            if (data.hasOwnProperty('charges')) {
                obj['charges'] = ApiClient.convertToType(data['charges'], 'Number');
            }
            if (data.hasOwnProperty('value')) {
                obj['value'] = ApiClient.convertToType(data['value'], 'Number');
            }
        }
        return obj;
    }


}

/**
 * Weighted average purchase price of the position.
 * @member {Number} price
 */
InlineResponse2006DataPurchase.prototype['price'] = undefined;

/**
 * Weighted average exchange rate of the position between the position and portfolio currency.
 * @member {Number} exchangeRate
 */
InlineResponse2006DataPurchase.prototype['exchangeRate'] = undefined;

/**
 * Sum of additional purchase fees for the position in portfolio's base currency.
 * @member {Number} charges
 */
InlineResponse2006DataPurchase.prototype['charges'] = undefined;

/**
 * Aggregated purchase value of all buy transactions of the position.
 * @member {Number} value
 */
InlineResponse2006DataPurchase.prototype['value'] = undefined;






export default InlineResponse2006DataPurchase;

