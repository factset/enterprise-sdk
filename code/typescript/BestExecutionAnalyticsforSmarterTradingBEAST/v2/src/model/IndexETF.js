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
 * The IndexETF model module.
 * @module model/IndexETF
 */
class IndexETF {
    /**
     * Constructs a new <code>IndexETF</code>.
     * Index ETF object
     * @alias module:model/IndexETF
     */
    constructor() { 
        
        IndexETF.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>IndexETF</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/IndexETF} obj Optional instance to populate.
     * @return {module:model/IndexETF} The populated <code>IndexETF</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new IndexETF();

            if (data.hasOwnProperty('priceChange')) {
                obj['priceChange'] = ApiClient.convertToType(data['priceChange'], 'Number');
            }
            if (data.hasOwnProperty('time')) {
                obj['time'] = ApiClient.convertToType(data['time'], 'Number');
            }
            if (data.hasOwnProperty('price')) {
                obj['price'] = ApiClient.convertToType(data['price'], 'Number');
            }
            if (data.hasOwnProperty('etfIndexName')) {
                obj['etfIndexName'] = ApiClient.convertToType(data['etfIndexName'], 'String');
            }
        }
        return obj;
    }


}

/**
 * Price Change
 * @member {Number} priceChange
 */
IndexETF.prototype['priceChange'] = undefined;

/**
 * Time
 * @member {Number} time
 */
IndexETF.prototype['time'] = undefined;

/**
 * Price
 * @member {Number} price
 */
IndexETF.prototype['price'] = undefined;

/**
 * ETF Index Name
 * @member {String} etfIndexName
 */
IndexETF.prototype['etfIndexName'] = undefined;






export default IndexETF;

