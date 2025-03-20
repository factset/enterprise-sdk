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
 * The PriceTimeFill model module.
 * @module model/PriceTimeFill
 */
class PriceTimeFill {
    /**
     * Constructs a new <code>PriceTimeFill</code>.
     * Price Time Fill object
     * @alias module:model/PriceTimeFill
     */
    constructor() { 
        
        PriceTimeFill.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>PriceTimeFill</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/PriceTimeFill} obj Optional instance to populate.
     * @return {module:model/PriceTimeFill} The populated <code>PriceTimeFill</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new PriceTimeFill();

            if (data.hasOwnProperty('time')) {
                obj['time'] = ApiClient.convertToType(data['time'], 'Number');
            }
            if (data.hasOwnProperty('lastFillTimeUtc')) {
                obj['lastFillTimeUtc'] = ApiClient.convertToType(data['lastFillTimeUtc'], 'String');
            }
            if (data.hasOwnProperty('price')) {
                obj['price'] = ApiClient.convertToType(data['price'], 'Number');
            }
            if (data.hasOwnProperty('venue')) {
                obj['venue'] = ApiClient.convertToType(data['venue'], 'String');
            }
            if (data.hasOwnProperty('orderId')) {
                obj['orderId'] = ApiClient.convertToType(data['orderId'], 'String');
            }
            if (data.hasOwnProperty('volume')) {
                obj['volume'] = ApiClient.convertToType(data['volume'], 'Number');
            }
            if (data.hasOwnProperty('spreadCross')) {
                obj['spreadCross'] = ApiClient.convertToType(data['spreadCross'], 'Number');
            }
            if (data.hasOwnProperty('cumVwap')) {
                obj['cumVwap'] = ApiClient.convertToType(data['cumVwap'], 'Number');
            }
        }
        return obj;
    }


}

/**
 * Time
 * @member {Number} time
 */
PriceTimeFill.prototype['time'] = undefined;

/**
 * Last Fill Time Utc
 * @member {String} lastFillTimeUtc
 */
PriceTimeFill.prototype['lastFillTimeUtc'] = undefined;

/**
 * Price
 * @member {Number} price
 */
PriceTimeFill.prototype['price'] = undefined;

/**
 * Venue
 * @member {String} venue
 */
PriceTimeFill.prototype['venue'] = undefined;

/**
 * Order Id
 * @member {String} orderId
 */
PriceTimeFill.prototype['orderId'] = undefined;

/**
 * Volume
 * @member {Number} volume
 */
PriceTimeFill.prototype['volume'] = undefined;

/**
 * Spread Cross
 * @member {Number} spreadCross
 */
PriceTimeFill.prototype['spreadCross'] = undefined;

/**
 * cumVwap
 * @member {Number} cumVwap
 */
PriceTimeFill.prototype['cumVwap'] = undefined;






export default PriceTimeFill;

