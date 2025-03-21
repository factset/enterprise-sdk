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
 * The PostPricesTimeSeriesIntradayListDataPricesItems model module.
 * @module model/PostPricesTimeSeriesIntradayListDataPricesItems
 */
class PostPricesTimeSeriesIntradayListDataPricesItems {
    /**
     * Constructs a new <code>PostPricesTimeSeriesIntradayListDataPricesItems</code>.
     * A list of objects. For semantical context see the description of the parent array.
     * @alias module:model/PostPricesTimeSeriesIntradayListDataPricesItems
     */
    constructor() { 
        
        PostPricesTimeSeriesIntradayListDataPricesItems.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>PostPricesTimeSeriesIntradayListDataPricesItems</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/PostPricesTimeSeriesIntradayListDataPricesItems} obj Optional instance to populate.
     * @return {module:model/PostPricesTimeSeriesIntradayListDataPricesItems} The populated <code>PostPricesTimeSeriesIntradayListDataPricesItems</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new PostPricesTimeSeriesIntradayListDataPricesItems();

            if (data.hasOwnProperty('time')) {
                obj['time'] = ApiClient.convertToType(data['time'], 'Date');
            }
            if (data.hasOwnProperty('tickId')) {
                obj['tickId'] = ApiClient.convertToType(data['tickId'], 'Number');
            }
            if (data.hasOwnProperty('price')) {
                obj['price'] = ApiClient.convertToType(data['price'], 'Number');
            }
            if (data.hasOwnProperty('quoteCondition')) {
                obj['quoteCondition'] = ApiClient.convertToType(data['quoteCondition'], 'String');
            }
            if (data.hasOwnProperty('tradingVolume')) {
                obj['tradingVolume'] = ApiClient.convertToType(data['tradingVolume'], 'Number');
            }
            if (data.hasOwnProperty('tradingValue')) {
                obj['tradingValue'] = ApiClient.convertToType(data['tradingValue'], 'Number');
            }
        }
        return obj;
    }


}

/**
 * Date and time.
 * @member {Date} time
 */
PostPricesTimeSeriesIntradayListDataPricesItems.prototype['time'] = undefined;

/**
 * Intraday tick identifier created by a feed handler, unique within a trading day.
 * @member {Number} tickId
 */
PostPricesTimeSeriesIntradayListDataPricesItems.prototype['tickId'] = undefined;

/**
 * Price value. See attribute `valueUnit` in endpoint `/prices/get` for its unit, except for price type yield, where the `valueUnit` is always `percent` (id=258).
 * @member {Number} price
 */
PostPricesTimeSeriesIntradayListDataPricesItems.prototype['price'] = undefined;

/**
 * Quote condition. Possible values depend on the values delivered by the supplier of the price information.
 * @member {String} quoteCondition
 */
PostPricesTimeSeriesIntradayListDataPricesItems.prototype['quoteCondition'] = undefined;

/**
 * Number of units (e.g. shares) traded, offered (price type ask), solicited (price type bid), or empty (price type yield).
 * @member {Number} tradingVolume
 */
PostPricesTimeSeriesIntradayListDataPricesItems.prototype['tradingVolume'] = undefined;

/**
 * Monetary equivalent (cash value) of the trade. See attribute `currency` in endpoint `/prices/get` for its unit. Empty for price type yield.
 * @member {Number} tradingValue
 */
PostPricesTimeSeriesIntradayListDataPricesItems.prototype['tradingValue'] = undefined;






export default PostPricesTimeSeriesIntradayListDataPricesItems;

