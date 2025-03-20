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
 * The VolumePriceMetrics model module.
 * @module model/VolumePriceMetrics
 */
class VolumePriceMetrics {
    /**
     * Constructs a new <code>VolumePriceMetrics</code>.
     * Volume Price Metric data
     * @alias module:model/VolumePriceMetrics
     */
    constructor() { 
        
        VolumePriceMetrics.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>VolumePriceMetrics</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/VolumePriceMetrics} obj Optional instance to populate.
     * @return {module:model/VolumePriceMetrics} The populated <code>VolumePriceMetrics</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new VolumePriceMetrics();

            if (data.hasOwnProperty('volatility')) {
                obj['volatility'] = ApiClient.convertToType(data['volatility'], 'Number');
            }
            if (data.hasOwnProperty('vwap')) {
                obj['vwap'] = ApiClient.convertToType(data['vwap'], 'Number');
            }
            if (data.hasOwnProperty('binSize')) {
                obj['binSize'] = ApiClient.convertToType(data['binSize'], 'Number');
            }
        }
        return obj;
    }


}

/**
 * Volatility
 * @member {Number} volatility
 */
VolumePriceMetrics.prototype['volatility'] = undefined;

/**
 * VWAP
 * @member {Number} vwap
 */
VolumePriceMetrics.prototype['vwap'] = undefined;

/**
 * Bin Size
 * @member {Number} binSize
 */
VolumePriceMetrics.prototype['binSize'] = undefined;






export default VolumePriceMetrics;

