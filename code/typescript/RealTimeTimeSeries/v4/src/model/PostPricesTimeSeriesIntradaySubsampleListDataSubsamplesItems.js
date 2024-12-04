/**
 * Real-Time Time Series API
 * Time series data, end-of-day or intraday, tick-by-tick or subsampled. Additional vendor-specific endpoints provide a modified interface for seamless integration with the ChartIQ chart library.  This API is focused on high-performance applications that are  * serving millions of end-users, * accessible by client browsers via the internet, * integrated into complex infrastructures such as existing frontend frameworks or authentication services.  This API has been designed for direct use by client web applications and feature extreme low latency: The average response time across all endpoints is 30 ms whereas 99% of all requests are answered in close to under 300ms.  See the [Real-Time Quotes API for Digital Portals](https://developer.factset.com/api-catalog/real-time-quotes-api) for access to detailed price information. 
 *
 * The version of the OpenAPI document: 4.0.0
 * Contact: api@factset.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 *
 */

import ApiClient from '../ApiClient';

/**
 * The PostPricesTimeSeriesIntradaySubsampleListDataSubsamplesItems model module.
 * @module model/PostPricesTimeSeriesIntradaySubsampleListDataSubsamplesItems
 */
class PostPricesTimeSeriesIntradaySubsampleListDataSubsamplesItems {
    /**
     * Constructs a new <code>PostPricesTimeSeriesIntradaySubsampleListDataSubsamplesItems</code>.
     * A list of objects. For semantical context see the description of the parent array.
     * @alias module:model/PostPricesTimeSeriesIntradaySubsampleListDataSubsamplesItems
     */
    constructor() { 
        
        PostPricesTimeSeriesIntradaySubsampleListDataSubsamplesItems.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>PostPricesTimeSeriesIntradaySubsampleListDataSubsamplesItems</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/PostPricesTimeSeriesIntradaySubsampleListDataSubsamplesItems} obj Optional instance to populate.
     * @return {module:model/PostPricesTimeSeriesIntradaySubsampleListDataSubsamplesItems} The populated <code>PostPricesTimeSeriesIntradaySubsampleListDataSubsamplesItems</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new PostPricesTimeSeriesIntradaySubsampleListDataSubsamplesItems();

            if (data.hasOwnProperty('time')) {
                obj['time'] = ApiClient.convertToType(data['time'], 'Date');
            }
            if (data.hasOwnProperty('first')) {
                obj['first'] = ApiClient.convertToType(data['first'], 'Number');
            }
            if (data.hasOwnProperty('last')) {
                obj['last'] = ApiClient.convertToType(data['last'], 'Number');
            }
            if (data.hasOwnProperty('low')) {
                obj['low'] = ApiClient.convertToType(data['low'], 'Number');
            }
            if (data.hasOwnProperty('high')) {
                obj['high'] = ApiClient.convertToType(data['high'], 'Number');
            }
            if (data.hasOwnProperty('tradingVolume')) {
                obj['tradingVolume'] = ApiClient.convertToType(data['tradingVolume'], 'Number');
            }
            if (data.hasOwnProperty('tradingValue')) {
                obj['tradingValue'] = ApiClient.convertToType(data['tradingValue'], 'Number');
            }
            if (data.hasOwnProperty('volumeWeightedAveragePrice')) {
                obj['volumeWeightedAveragePrice'] = ApiClient.convertToType(data['volumeWeightedAveragePrice'], 'Number');
            }
        }
        return obj;
    }


}

/**
 * Date and time of the start of the subsample.
 * @member {Date} time
 */
PostPricesTimeSeriesIntradaySubsampleListDataSubsamplesItems.prototype['time'] = undefined;

/**
 * First price of the subsample.
 * @member {Number} first
 */
PostPricesTimeSeriesIntradaySubsampleListDataSubsamplesItems.prototype['first'] = undefined;

/**
 * Last price of the subsample.
 * @member {Number} last
 */
PostPricesTimeSeriesIntradaySubsampleListDataSubsamplesItems.prototype['last'] = undefined;

/**
 * Lowest price of the subsample.
 * @member {Number} low
 */
PostPricesTimeSeriesIntradaySubsampleListDataSubsamplesItems.prototype['low'] = undefined;

/**
 * Highest price of the subsample.
 * @member {Number} high
 */
PostPricesTimeSeriesIntradaySubsampleListDataSubsamplesItems.prototype['high'] = undefined;

/**
 * Accumulated number of units (e.g. shares) traded of the subsample. If the requested type of the price is ask, bid, or yield, the value is empty.
 * @member {Number} tradingVolume
 */
PostPricesTimeSeriesIntradaySubsampleListDataSubsamplesItems.prototype['tradingVolume'] = undefined;

/**
 * Accumulated monetary equivalent (cash value) of the subsample. If the requested type of the price is ask, bid, or yield, the value is empty. See attribute `currency` in endpoint `/prices/get` for its unit.
 * @member {Number} tradingValue
 */
PostPricesTimeSeriesIntradaySubsampleListDataSubsamplesItems.prototype['tradingValue'] = undefined;

/**
 * The volume-weighted average price (VWAP) of the subsample. See attribute currency in endpoint `/prices/get` for its unit.
 * @member {Number} volumeWeightedAveragePrice
 */
PostPricesTimeSeriesIntradaySubsampleListDataSubsamplesItems.prototype['volumeWeightedAveragePrice'] = undefined;






export default PostPricesTimeSeriesIntradaySubsampleListDataSubsamplesItems;

