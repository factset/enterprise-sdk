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
 * The Intervals model module.
 * @module model/Intervals
 */
class Intervals {
    /**
     * Constructs a new <code>Intervals</code>.
     * @alias module:model/Intervals
     */
    constructor() { 
        
        Intervals.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>Intervals</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/Intervals} obj Optional instance to populate.
     * @return {module:model/Intervals} The populated <code>Intervals</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new Intervals();

            if (data.hasOwnProperty('0')) {
                obj['0'] = ApiClient.convertToType(data['0'], 'String');
            }
            if (data.hasOwnProperty('1S')) {
                obj['1S'] = ApiClient.convertToType(data['1S'], 'String');
            }
            if (data.hasOwnProperty('5S')) {
                obj['5S'] = ApiClient.convertToType(data['5S'], 'String');
            }
            if (data.hasOwnProperty('10S')) {
                obj['10S'] = ApiClient.convertToType(data['10S'], 'String');
            }
            if (data.hasOwnProperty('15S')) {
                obj['15S'] = ApiClient.convertToType(data['15S'], 'String');
            }
            if (data.hasOwnProperty('30S')) {
                obj['30S'] = ApiClient.convertToType(data['30S'], 'String');
            }
            if (data.hasOwnProperty('1M')) {
                obj['1M'] = ApiClient.convertToType(data['1M'], 'String');
            }
            if (data.hasOwnProperty('2M')) {
                obj['2M'] = ApiClient.convertToType(data['2M'], 'String');
            }
            if (data.hasOwnProperty('5M')) {
                obj['5M'] = ApiClient.convertToType(data['5M'], 'String');
            }
            if (data.hasOwnProperty('10M')) {
                obj['10M'] = ApiClient.convertToType(data['10M'], 'String');
            }
            if (data.hasOwnProperty('15M')) {
                obj['15M'] = ApiClient.convertToType(data['15M'], 'String');
            }
            if (data.hasOwnProperty('30M')) {
                obj['30M'] = ApiClient.convertToType(data['30M'], 'String');
            }
            if (data.hasOwnProperty('1H')) {
                obj['1H'] = ApiClient.convertToType(data['1H'], 'String');
            }
        }
        return obj;
    }


}

/**
 * Every Tick. Max days requested = 1
 * @member {String} 0
 */
Intervals.prototype['0'] = undefined;

/**
 * 1 Second. Max days requested = 1
 * @member {String} 1S
 */
Intervals.prototype['1S'] = undefined;

/**
 * 5 Seconds. Max days requested = 1
 * @member {String} 5S
 */
Intervals.prototype['5S'] = undefined;

/**
 * 10 Seconds. Max days requested = 1
 * @member {String} 10S
 */
Intervals.prototype['10S'] = undefined;

/**
 * 15 Seconds. Max days requested = 1
 * @member {String} 15S
 */
Intervals.prototype['15S'] = undefined;

/**
 * 30 Seconds. Max days requested = 15
 * @member {String} 30S
 */
Intervals.prototype['30S'] = undefined;

/**
 * 1 Minute. Max days requested = 30
 * @member {String} 1M
 */
Intervals.prototype['1M'] = undefined;

/**
 * 2 Minutes. Max days requested = 60
 * @member {String} 2M
 */
Intervals.prototype['2M'] = undefined;

/**
 * 5 Minutes. Max days requested = 60
 * @member {String} 5M
 */
Intervals.prototype['5M'] = undefined;

/**
 * 10 Minutes. Max days requested = 60
 * @member {String} 10M
 */
Intervals.prototype['10M'] = undefined;

/**
 * 15 Minutes. Max days requested = 60
 * @member {String} 15M
 */
Intervals.prototype['15M'] = undefined;

/**
 * 30 Minutes. Max days requested = 60
 * @member {String} 30M
 */
Intervals.prototype['30M'] = undefined;

/**
 * 1 Hour. Max days requested = 60
 * @member {String} 1H
 */
Intervals.prototype['1H'] = undefined;






export default Intervals;

