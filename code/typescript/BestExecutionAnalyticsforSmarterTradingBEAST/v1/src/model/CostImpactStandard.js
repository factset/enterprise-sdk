/**
 * Best Execution Analytics for Smarter Trading (BEAST) API
 * Enables clients to programmatically access the underlying data which powers the BEAST Liquidity Analytics (LA) and Transaction Cost Analysis (TCA) applications.
 *
 * The version of the OpenAPI document: 1.0.0
 * Contact: api@factset.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 *
 */

import ApiClient from '../ApiClient';

/**
 * The CostImpactStandard model module.
 * @module model/CostImpactStandard
 */
class CostImpactStandard {
    /**
     * Constructs a new <code>CostImpactStandard</code>.
     * The Cost Impact Standard object
     * @alias module:model/CostImpactStandard
     */
    constructor() { 
        
        CostImpactStandard.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>CostImpactStandard</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/CostImpactStandard} obj Optional instance to populate.
     * @return {module:model/CostImpactStandard} The populated <code>CostImpactStandard</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new CostImpactStandard();

            if (data.hasOwnProperty('costPerShare')) {
                obj['costPerShare'] = ApiClient.convertToType(data['costPerShare'], 'Number');
            }
            if (data.hasOwnProperty('liquidityCostPerShare')) {
                obj['liquidityCostPerShare'] = ApiClient.convertToType(data['liquidityCostPerShare'], 'Number');
            }
            if (data.hasOwnProperty('spreadCostPerShare')) {
                obj['spreadCostPerShare'] = ApiClient.convertToType(data['spreadCostPerShare'], 'Number');
            }
            if (data.hasOwnProperty('costPerShareBps')) {
                obj['costPerShareBps'] = ApiClient.convertToType(data['costPerShareBps'], 'Number');
            }
            if (data.hasOwnProperty('liquidityCostPerShareBps')) {
                obj['liquidityCostPerShareBps'] = ApiClient.convertToType(data['liquidityCostPerShareBps'], 'Number');
            }
            if (data.hasOwnProperty('spreadCostPerShareBps')) {
                obj['spreadCostPerShareBps'] = ApiClient.convertToType(data['spreadCostPerShareBps'], 'Number');
            }
            if (data.hasOwnProperty('marketImpact')) {
                obj['marketImpact'] = ApiClient.convertToType(data['marketImpact'], 'Number');
            }
            if (data.hasOwnProperty('confidenceInterval')) {
                obj['confidenceInterval'] = ApiClient.convertToType(data['confidenceInterval'], 'Number');
            }
        }
        return obj;
    }


}

/**
 * Cost Per Share
 * @member {Number} costPerShare
 */
CostImpactStandard.prototype['costPerShare'] = undefined;

/**
 * Liquidity Cost Per Share
 * @member {Number} liquidityCostPerShare
 */
CostImpactStandard.prototype['liquidityCostPerShare'] = undefined;

/**
 * Spread Cost Per Share
 * @member {Number} spreadCostPerShare
 */
CostImpactStandard.prototype['spreadCostPerShare'] = undefined;

/**
 * Cost Per Share Bps
 * @member {Number} costPerShareBps
 */
CostImpactStandard.prototype['costPerShareBps'] = undefined;

/**
 * Liquidity Cost Per Share Bps
 * @member {Number} liquidityCostPerShareBps
 */
CostImpactStandard.prototype['liquidityCostPerShareBps'] = undefined;

/**
 * Spread Cost Per Share Bps
 * @member {Number} spreadCostPerShareBps
 */
CostImpactStandard.prototype['spreadCostPerShareBps'] = undefined;

/**
 * Market Impact
 * @member {Number} marketImpact
 */
CostImpactStandard.prototype['marketImpact'] = undefined;

/**
 * Confidence Interval
 * @member {Number} confidenceInterval
 */
CostImpactStandard.prototype['confidenceInterval'] = undefined;






export default CostImpactStandard;

