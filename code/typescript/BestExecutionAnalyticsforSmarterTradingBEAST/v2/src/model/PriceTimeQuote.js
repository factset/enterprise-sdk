/**
 * Best Execution Analytics for Smarter Trading (BEAST) API
 * Enables clients to programmatically access the underlying data which powers the BEAST Liquidity Analytics (LA) and Transaction Cost Analysis (TCA) applications.
 *
 * The version of the OpenAPI document: 2.0.0
 * Contact: api@factset.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 *
 */

import ApiClient from '../ApiClient';

/**
 * The PriceTimeQuote model module.
 * @module model/PriceTimeQuote
 */
class PriceTimeQuote {
    /**
     * Constructs a new <code>PriceTimeQuote</code>.
     * Price Time Quote object
     * @alias module:model/PriceTimeQuote
     */
    constructor() { 
        
        PriceTimeQuote.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>PriceTimeQuote</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/PriceTimeQuote} obj Optional instance to populate.
     * @return {module:model/PriceTimeQuote} The populated <code>PriceTimeQuote</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new PriceTimeQuote();

            if (data.hasOwnProperty('time')) {
                obj['time'] = ApiClient.convertToType(data['time'], 'Number');
            }
            if (data.hasOwnProperty('orderNum')) {
                obj['orderNum'] = ApiClient.convertToType(data['orderNum'], 'Number');
            }
            if (data.hasOwnProperty('bid')) {
                obj['bid'] = ApiClient.convertToType(data['bid'], 'Number');
            }
            if (data.hasOwnProperty('ask')) {
                obj['ask'] = ApiClient.convertToType(data['ask'], 'Number');
            }
        }
        return obj;
    }


}

/**
 * Time
 * @member {Number} time
 */
PriceTimeQuote.prototype['time'] = undefined;

/**
 * Order Num
 * @member {Number} orderNum
 */
PriceTimeQuote.prototype['orderNum'] = undefined;

/**
 * Bid
 * @member {Number} bid
 */
PriceTimeQuote.prototype['bid'] = undefined;

/**
 * Ask
 * @member {Number} ask
 */
PriceTimeQuote.prototype['ask'] = undefined;






export default PriceTimeQuote;

