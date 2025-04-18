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
 * The VolumePriceBin model module.
 * @module model/VolumePriceBin
 */
class VolumePriceBin {
    /**
     * Constructs a new <code>VolumePriceBin</code>.
     * Volume Price Bin data
     * @alias module:model/VolumePriceBin
     */
    constructor() { 
        
        VolumePriceBin.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>VolumePriceBin</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/VolumePriceBin} obj Optional instance to populate.
     * @return {module:model/VolumePriceBin} The populated <code>VolumePriceBin</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new VolumePriceBin();

            if (data.hasOwnProperty('bin')) {
                obj['bin'] = ApiClient.convertToType(data['bin'], 'Number');
            }
            if (data.hasOwnProperty('minPrice')) {
                obj['minPrice'] = ApiClient.convertToType(data['minPrice'], 'Number');
            }
            if (data.hasOwnProperty('maxPrice')) {
                obj['maxPrice'] = ApiClient.convertToType(data['maxPrice'], 'Number');
            }
            if (data.hasOwnProperty('binPrice')) {
                obj['binPrice'] = ApiClient.convertToType(data['binPrice'], 'Number');
            }
            if (data.hasOwnProperty('tradesVolumePct')) {
                obj['tradesVolumePct'] = ApiClient.convertToType(data['tradesVolumePct'], 'Number');
            }
            if (data.hasOwnProperty('fillVolumePct')) {
                obj['fillVolumePct'] = ApiClient.convertToType(data['fillVolumePct'], 'Number');
            }
            if (data.hasOwnProperty('tradeVolume')) {
                obj['tradeVolume'] = ApiClient.convertToType(data['tradeVolume'], 'Number');
            }
            if (data.hasOwnProperty('fillVolume')) {
                obj['fillVolume'] = ApiClient.convertToType(data['fillVolume'], 'Number');
            }
        }
        return obj;
    }


}

/**
 * Bin
 * @member {Number} bin
 */
VolumePriceBin.prototype['bin'] = undefined;

/**
 * Min Price
 * @member {Number} minPrice
 */
VolumePriceBin.prototype['minPrice'] = undefined;

/**
 * Max Price
 * @member {Number} maxPrice
 */
VolumePriceBin.prototype['maxPrice'] = undefined;

/**
 * Bin Price
 * @member {Number} binPrice
 */
VolumePriceBin.prototype['binPrice'] = undefined;

/**
 * Trades Volume Pct
 * @member {Number} tradesVolumePct
 */
VolumePriceBin.prototype['tradesVolumePct'] = undefined;

/**
 * Fill Volume Pct
 * @member {Number} fillVolumePct
 */
VolumePriceBin.prototype['fillVolumePct'] = undefined;

/**
 * Trade Volume
 * @member {Number} tradeVolume
 */
VolumePriceBin.prototype['tradeVolume'] = undefined;

/**
 * Fill Volume
 * @member {Number} fillVolume
 */
VolumePriceBin.prototype['fillVolume'] = undefined;






export default VolumePriceBin;

