/**
 * Tick History
 * <p>FactSet’s Tick History provides cost-effective access to real-time and delayed global exchange data. Proprietary technology normalizes over 200 global exchanges and 19 tick history fields. Asset types integrated include equities, futures, options, fixed income, mutual funds, ETFs, indices, commodities, and FX rates.</p><p>Tick History provides dynamic access to tick data for a specific security intra-day or historically via standard HTTPS protocol. History is available for all quotes and trades for a trailing 6 months or 1-year, respectively. Quotes and trade data for Options is available for 30 days. Tick History data is also available in a separate end-of-day feed.</p>   
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
 * The Fields model module.
 * @module model/Fields
 */
class Fields {
    /**
     * Constructs a new <code>Fields</code>.
     * All available fields in service. FID &#x3D; Field ID Number.
     * @alias module:model/Fields
     */
    constructor() { 
        
        Fields.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>Fields</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/Fields} obj Optional instance to populate.
     * @return {module:model/Fields} The populated <code>Fields</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new Fields();

            if (data.hasOwnProperty('BID_1')) {
                obj['BID_1'] = ApiClient.convertToType(data['BID_1'], 'Number');
            }
            if (data.hasOwnProperty('BID_VOL_1')) {
                obj['BID_VOL_1'] = ApiClient.convertToType(data['BID_VOL_1'], 'Number');
            }
            if (data.hasOwnProperty('BID_EXCH_1')) {
                obj['BID_EXCH_1'] = ApiClient.convertToType(data['BID_EXCH_1'], 'String');
            }
            if (data.hasOwnProperty('ASK_1')) {
                obj['ASK_1'] = ApiClient.convertToType(data['ASK_1'], 'Number');
            }
            if (data.hasOwnProperty('ASK_VOL_1')) {
                obj['ASK_VOL_1'] = ApiClient.convertToType(data['ASK_VOL_1'], 'Number');
            }
            if (data.hasOwnProperty('ASK_EXCH_1')) {
                obj['ASK_EXCH_1'] = ApiClient.convertToType(data['ASK_EXCH_1'], 'String');
            }
            if (data.hasOwnProperty('LAST_1')) {
                obj['LAST_1'] = ApiClient.convertToType(data['LAST_1'], 'Number');
            }
            if (data.hasOwnProperty('LAST_DATE_1')) {
                obj['LAST_DATE_1'] = ApiClient.convertToType(data['LAST_DATE_1'], 'String');
            }
            if (data.hasOwnProperty('LAST_TIME_1')) {
                obj['LAST_TIME_1'] = ApiClient.convertToType(data['LAST_TIME_1'], 'String');
            }
            if (data.hasOwnProperty('LAST_VOL_1')) {
                obj['LAST_VOL_1'] = ApiClient.convertToType(data['LAST_VOL_1'], 'Number');
            }
            if (data.hasOwnProperty('LAST_EXCH_1')) {
                obj['LAST_EXCH_1'] = ApiClient.convertToType(data['LAST_EXCH_1'], 'String');
            }
            if (data.hasOwnProperty('CUM_VOL')) {
                obj['CUM_VOL'] = ApiClient.convertToType(data['CUM_VOL'], 'Number');
            }
            if (data.hasOwnProperty('VWAP')) {
                obj['VWAP'] = ApiClient.convertToType(data['VWAP'], 'Number');
            }
            if (data.hasOwnProperty('OPEN_1')) {
                obj['OPEN_1'] = ApiClient.convertToType(data['OPEN_1'], 'Number');
            }
            if (data.hasOwnProperty('HIGH_1')) {
                obj['HIGH_1'] = ApiClient.convertToType(data['HIGH_1'], 'Number');
            }
            if (data.hasOwnProperty('LOW_1')) {
                obj['LOW_1'] = ApiClient.convertToType(data['LOW_1'], 'Number');
            }
            if (data.hasOwnProperty('TRADE_CONDITION')) {
                obj['TRADE_CONDITION'] = ApiClient.convertToType(data['TRADE_CONDITION'], 'String');
            }
            if (data.hasOwnProperty('GMT_OFFSET')) {
                obj['GMT_OFFSET'] = ApiClient.convertToType(data['GMT_OFFSET'], 'Number');
            }
            if (data.hasOwnProperty('PRICE_CURRENCY')) {
                obj['PRICE_CURRENCY'] = ApiClient.convertToType(data['PRICE_CURRENCY'], 'String');
            }
        }
        return obj;
    }


}

/**
 * The last bid price or last bid price in an interval. FID # 100
 * @member {Number} BID_1
 */
Fields.prototype['BID_1'] = undefined;

/**
 * The volume of the last bid in an interval. FID # 104
 * @member {Number} BID_VOL_1
 */
Fields.prototype['BID_VOL_1'] = undefined;

/**
 * The volume of the last bid or last bid in an interval. FID # 107. Enumeration Table 7
 * @member {String} BID_EXCH_1
 */
Fields.prototype['BID_EXCH_1'] = undefined;

/**
 * The last ask price or last ask price in an interval. FID # 200
 * @member {Number} ASK_1
 */
Fields.prototype['ASK_1'] = undefined;

/**
 * The volume of the last ask or last ask in an interval. FID # 204
 * @member {Number} ASK_VOL_1
 */
Fields.prototype['ASK_VOL_1'] = undefined;

/**
 * The exchange of the last ask or last ask in an interval. FID # 207. Enumeration Table 7.
 * @member {String} ASK_EXCH_1
 */
Fields.prototype['ASK_EXCH_1'] = undefined;

/**
 * The last trade price or last trade price in an interval. FID # 300
 * @member {Number} LAST_1
 */
Fields.prototype['LAST_1'] = undefined;

/**
 * The date of the last trade or last trade in an interval. FID # 301
 * @member {String} LAST_DATE_1
 */
Fields.prototype['LAST_DATE_1'] = undefined;

/**
 * The time of the last trade or last trade in an interval. FID # 302
 * @member {String} LAST_TIME_1
 */
Fields.prototype['LAST_TIME_1'] = undefined;

/**
 * The trade volume, or the sum of all trade volumes inside a bin. FID # 304
 * @member {Number} LAST_VOL_1
 */
Fields.prototype['LAST_VOL_1'] = undefined;

/**
 * The exchange of the last trade or last trade in an interval. FID # 307. Enumeration Table 7
 * @member {String} LAST_EXCH_1
 */
Fields.prototype['LAST_EXCH_1'] = undefined;

/**
 * The symbol's daily cumulative volume, or the last cumulative volume in an interval. FID # 601
 * @member {Number} CUM_VOL
 */
Fields.prototype['CUM_VOL'] = undefined;

/**
 * The daily volume weighted average price, or the last VWAP in an interval. FID # 603
 * @member {Number} VWAP
 */
Fields.prototype['VWAP'] = undefined;

/**
 * The first trade of an interval. FID # 710
 * @member {Number} OPEN_1
 */
Fields.prototype['OPEN_1'] = undefined;

/**
 * The highest trade price in an interval. FID # 720
 * @member {Number} HIGH_1
 */
Fields.prototype['HIGH_1'] = undefined;

/**
 * The lowest trade price in an interval. FID # 723
 * @member {Number} LOW_1
 */
Fields.prototype['LOW_1'] = undefined;

/**
 * Trade Condition. FID # 2709
 * @member {String} TRADE_CONDITION
 */
Fields.prototype['TRADE_CONDITION'] = undefined;

/**
 * GMT Offset in Minutes. FID # 2037
 * @member {Number} GMT_OFFSET
 */
Fields.prototype['GMT_OFFSET'] = undefined;

/**
 * Price Currency Code. FID # 2032
 * @member {String} PRICE_CURRENCY
 */
Fields.prototype['PRICE_CURRENCY'] = undefined;






export default Fields;

