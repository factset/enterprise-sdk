/**
 * Quotes API For Digital Portals
 * The Quotes API combines endpoints for retrieving security end-of-day, delayed, and realtime prices with performance key figures and basic reference data on the security and market level.  The API supports over 20 different price types for each quote and comes with basic search endpoints based on security identifiers and instrument names. Market coverage is included in the *Sample Use Cases* section below.  The Digital Portal use case is focused on high-performance applications that are  * serving millions of end-users, * accessible by client browsers via the internet, * supporting subscriptions for streamed updates out-of-the-box, * typically combining a wide variety of *for Digital Portals*-APIs into a highly use-case specific solution for customers, * integrated into complex infrastructures such as existing frontend frameworks, authentication services.  All APIs labelled *for Digital Portals* have been designed for direct use by client web applications and feature extreme low latency: The average response time across all endpoints is 30 ms whereas 99% of all requests are answered in close to under 300ms.  See the [Time Series API for Digital Portals](https://developer.factset.com/api-catalog/time-series-api-digital-portals) for direct access to price histories, and the [News API for Digital Portals](https://developer.factset.com/api-catalog/news-api-digital-portals) for searching and fetching related news. 
 *
 * The version of the OpenAPI document: 2
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 *
 */

import ApiClient from '../ApiClient';

/**
 * The InlineResponse20083Accumulated model module.
 * @module model/InlineResponse20083Accumulated
 */
class InlineResponse20083Accumulated {
    /**
     * Constructs a new <code>InlineResponse20083Accumulated</code>.
     * Summary data accumulated over all trades of the most recent trading day.
     * @alias module:model/InlineResponse20083Accumulated
     */
    constructor() { 
        
        InlineResponse20083Accumulated.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>InlineResponse20083Accumulated</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/InlineResponse20083Accumulated} obj Optional instance to populate.
     * @return {module:model/InlineResponse20083Accumulated} The populated <code>InlineResponse20083Accumulated</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new InlineResponse20083Accumulated();

            if (data.hasOwnProperty('numberTrades')) {
                obj['numberTrades'] = ApiClient.convertToType(data['numberTrades'], 'Number');
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
 * Number of trades.
 * @member {Number} numberTrades
 */
InlineResponse20083Accumulated.prototype['numberTrades'] = undefined;

/**
 * Number of units (e.g. shares) traded.
 * @member {Number} tradingVolume
 */
InlineResponse20083Accumulated.prototype['tradingVolume'] = undefined;

/**
 * Monetary equivalent (cash value) of the trades. See attribute `currency` for its unit.
 * @member {Number} tradingValue
 */
InlineResponse20083Accumulated.prototype['tradingValue'] = undefined;

/**
 * The volume-weighted average price (VWAP). See attribute `valueUnit` for its unit.
 * @member {Number} volumeWeightedAveragePrice
 */
InlineResponse20083Accumulated.prototype['volumeWeightedAveragePrice'] = undefined;






export default InlineResponse20083Accumulated;

