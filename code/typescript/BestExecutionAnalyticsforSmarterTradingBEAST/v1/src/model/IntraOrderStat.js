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
 * The IntraOrderStat model module.
 * @module model/IntraOrderStat
 */
class IntraOrderStat {
    /**
     * Constructs a new <code>IntraOrderStat</code>.
     * Intra Order Stat data
     * @alias module:model/IntraOrderStat
     */
    constructor() { 
        
        IntraOrderStat.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>IntraOrderStat</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/IntraOrderStat} obj Optional instance to populate.
     * @return {module:model/IntraOrderStat} The populated <code>IntraOrderStat</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new IntraOrderStat();

            if (data.hasOwnProperty('metric')) {
                obj['metric'] = ApiClient.convertToType(data['metric'], 'String');
            }
            if (data.hasOwnProperty('histAvg')) {
                obj['histAvg'] = ApiClient.convertToType(data['histAvg'], 'Number');
            }
            if (data.hasOwnProperty('histStd')) {
                obj['histStd'] = ApiClient.convertToType(data['histStd'], 'Number');
            }
            if (data.hasOwnProperty('histMax')) {
                obj['histMax'] = ApiClient.convertToType(data['histMax'], 'Number');
            }
            if (data.hasOwnProperty('histMin')) {
                obj['histMin'] = ApiClient.convertToType(data['histMin'], 'Number');
            }
            if (data.hasOwnProperty('histMedian')) {
                obj['histMedian'] = ApiClient.convertToType(data['histMedian'], 'Number');
            }
            if (data.hasOwnProperty('firstQuartile')) {
                obj['firstQuartile'] = ApiClient.convertToType(data['firstQuartile'], 'Number');
            }
            if (data.hasOwnProperty('thirdQuartile')) {
                obj['thirdQuartile'] = ApiClient.convertToType(data['thirdQuartile'], 'Number');
            }
            if (data.hasOwnProperty('recentValue')) {
                obj['recentValue'] = ApiClient.convertToType(data['recentValue'], 'Number');
            }
            if (data.hasOwnProperty('recentDate')) {
                obj['recentDate'] = ApiClient.convertToType(data['recentDate'], 'String');
            }
        }
        return obj;
    }


}

/**
 * Metric
 * @member {module:model/IntraOrderStat.MetricEnum} metric
 */
IntraOrderStat.prototype['metric'] = undefined;

/**
 * histAvg
 * @member {Number} histAvg
 */
IntraOrderStat.prototype['histAvg'] = undefined;

/**
 * histStd
 * @member {Number} histStd
 */
IntraOrderStat.prototype['histStd'] = undefined;

/**
 * histMax
 * @member {Number} histMax
 */
IntraOrderStat.prototype['histMax'] = undefined;

/**
 * histMin
 * @member {Number} histMin
 */
IntraOrderStat.prototype['histMin'] = undefined;

/**
 * histMedian
 * @member {Number} histMedian
 */
IntraOrderStat.prototype['histMedian'] = undefined;

/**
 * firstQuartile
 * @member {Number} firstQuartile
 */
IntraOrderStat.prototype['firstQuartile'] = undefined;

/**
 * thirdQuartile
 * @member {Number} thirdQuartile
 */
IntraOrderStat.prototype['thirdQuartile'] = undefined;

/**
 * recentValue
 * @member {Number} recentValue
 */
IntraOrderStat.prototype['recentValue'] = undefined;

/**
 * Recent Date
 * @member {String} recentDate
 */
IntraOrderStat.prototype['recentDate'] = undefined;





/**
 * Allowed values for the <code>metric</code> property.
 * @enum {String}
 * @readonly
 */
IntraOrderStat['MetricEnum'] = {

    /**
     * value: "spread"
     * @const
     */
    "spread": "spread",

    /**
     * value: "size"
     * @const
     */
    "size": "size",

    /**
     * value: "bidSize"
     * @const
     */
    "bidSize": "bidSize",

    /**
     * value: "askSize"
     * @const
     */
    "askSize": "askSize"
};



export default IntraOrderStat;

