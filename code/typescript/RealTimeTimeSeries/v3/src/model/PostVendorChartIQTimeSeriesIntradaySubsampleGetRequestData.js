/**
 * Time Series API For Digital Portals
 * Time series data, end-of-day or intraday, tick-by-tick or subsampled. Additional vendor-specific endpoints provide a modified interface for seamless integration with the ChartIQ chart library.  This API is focused on high-performance applications that are  * serving millions of end-users, * accessible by client browsers via the internet, * integrated into complex infrastructures such as existing frontend frameworks or authentication services.  This API has been designed for direct use by client web applications and feature extreme low latency: The average response time across all endpoints is 30 ms whereas 99% of all requests are answered in close to under 300ms.  See the [Real-Time Quotes API for Digital Portals](https://developer.factset.com/api-catalog/real-time-quotes-api) for access to detailed price information. 
 *
 * The version of the OpenAPI document: 3.0.0
 * Contact: api@factset.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 *
 */

import ApiClient from '../ApiClient';
import PostVendorChartIQTimeSeriesEodListRequestDataIdentifier from './PostVendorChartIQTimeSeriesEodListRequestDataIdentifier';
import PostVendorChartIQTimeSeriesIntradaySubsampleGetRequestDataAdjustments from './PostVendorChartIQTimeSeriesIntradaySubsampleGetRequestDataAdjustments';

/**
 * The PostVendorChartIQTimeSeriesIntradaySubsampleGetRequestData model module.
 * @module model/PostVendorChartIQTimeSeriesIntradaySubsampleGetRequestData
 */
class PostVendorChartIQTimeSeriesIntradaySubsampleGetRequestData {
    /**
     * Constructs a new <code>PostVendorChartIQTimeSeriesIntradaySubsampleGetRequestData</code>.
     * The data member contains the request&#39;s primary data.
     * @alias module:model/PostVendorChartIQTimeSeriesIntradaySubsampleGetRequestData
     * @param identifier {module:model/PostVendorChartIQTimeSeriesEodListRequestDataIdentifier} 
     * @param from {String} Date and time of the start point of the subsample (inclusive). `from` must be aligned to `granularity`. That is, the numerical value is an integral multiple of the time span value represented by `granularity`. The data accessible in the past is limited to a few weeks at most. Values in the future are not allowed.
     */
    constructor(identifier, from) { 
        
        PostVendorChartIQTimeSeriesIntradaySubsampleGetRequestData.initialize(this, identifier, from);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj, identifier, from) { 
        obj['identifier'] = identifier;
        obj['from'] = from;
    }

    /**
     * Constructs a <code>PostVendorChartIQTimeSeriesIntradaySubsampleGetRequestData</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/PostVendorChartIQTimeSeriesIntradaySubsampleGetRequestData} obj Optional instance to populate.
     * @return {module:model/PostVendorChartIQTimeSeriesIntradaySubsampleGetRequestData} The populated <code>PostVendorChartIQTimeSeriesIntradaySubsampleGetRequestData</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new PostVendorChartIQTimeSeriesIntradaySubsampleGetRequestData();

            if (data.hasOwnProperty('identifier')) {
                obj['identifier'] = PostVendorChartIQTimeSeriesEodListRequestDataIdentifier.constructFromObject(data['identifier']);
            }
            if (data.hasOwnProperty('type')) {
                obj['type'] = ApiClient.convertToType(data['type'], 'String');
            }
            if (data.hasOwnProperty('quality')) {
                obj['quality'] = ApiClient.convertToType(data['quality'], 'String');
            }
            if (data.hasOwnProperty('from')) {
                obj['from'] = ApiClient.convertToType(data['from'], 'String');
            }
            if (data.hasOwnProperty('granularity')) {
                obj['granularity'] = ApiClient.convertToType(data['granularity'], 'String');
            }
            if (data.hasOwnProperty('adjustments')) {
                obj['adjustments'] = PostVendorChartIQTimeSeriesIntradaySubsampleGetRequestDataAdjustments.constructFromObject(data['adjustments']);
            }
        }
        return obj;
    }


}

/**
 * @member {module:model/PostVendorChartIQTimeSeriesEodListRequestDataIdentifier} identifier
 */
PostVendorChartIQTimeSeriesIntradaySubsampleGetRequestData.prototype['identifier'] = undefined;

/**
 * Type of the price as configured for the customer.
 * @member {module:model/PostVendorChartIQTimeSeriesIntradaySubsampleGetRequestData.TypeEnum} type
 * @default 'trade'
 */
PostVendorChartIQTimeSeriesIntradaySubsampleGetRequestData.prototype['type'] = 'trade';

/**
 * Quality of the price.
 * @member {module:model/PostVendorChartIQTimeSeriesIntradaySubsampleGetRequestData.QualityEnum} quality
 * @default 'DLY'
 */
PostVendorChartIQTimeSeriesIntradaySubsampleGetRequestData.prototype['quality'] = 'DLY';

/**
 * Date and time of the start point of the subsample (inclusive). `from` must be aligned to `granularity`. That is, the numerical value is an integral multiple of the time span value represented by `granularity`. The data accessible in the past is limited to a few weeks at most. Values in the future are not allowed.
 * @member {String} from
 */
PostVendorChartIQTimeSeriesIntradaySubsampleGetRequestData.prototype['from'] = undefined;

/**
 * Subsample granularities suitable for intraday data.
 * @member {module:model/PostVendorChartIQTimeSeriesIntradaySubsampleGetRequestData.GranularityEnum} granularity
 * @default '1h'
 */
PostVendorChartIQTimeSeriesIntradaySubsampleGetRequestData.prototype['granularity'] = '1h';

/**
 * @member {module:model/PostVendorChartIQTimeSeriesIntradaySubsampleGetRequestDataAdjustments} adjustments
 */
PostVendorChartIQTimeSeriesIntradaySubsampleGetRequestData.prototype['adjustments'] = undefined;





/**
 * Allowed values for the <code>type</code> property.
 * @enum {String}
 * @readonly
 */
PostVendorChartIQTimeSeriesIntradaySubsampleGetRequestData['TypeEnum'] = {

    /**
     * value: "trade"
     * @const
     */
    "trade": "trade",

    /**
     * value: "bid"
     * @const
     */
    "bid": "bid",

    /**
     * value: "ask"
     * @const
     */
    "ask": "ask",

    /**
     * value: "yield"
     * @const
     */
    "yield": "yield"
};


/**
 * Allowed values for the <code>quality</code> property.
 * @enum {String}
 * @readonly
 */
PostVendorChartIQTimeSeriesIntradaySubsampleGetRequestData['QualityEnum'] = {

    /**
     * value: "RLT"
     * @const
     */
    "RLT": "RLT",

    /**
     * value: "DLY"
     * @const
     */
    "DLY": "DLY",

    /**
     * value: "BST"
     * @const
     */
    "BST": "BST"
};


/**
 * Allowed values for the <code>granularity</code> property.
 * @enum {String}
 * @readonly
 */
PostVendorChartIQTimeSeriesIntradaySubsampleGetRequestData['GranularityEnum'] = {

    /**
     * value: "1s"
     * @const
     */
    "1s": "1s",

    /**
     * value: "5s"
     * @const
     */
    "5s": "5s",

    /**
     * value: "10s"
     * @const
     */
    "10s": "10s",

    /**
     * value: "30s"
     * @const
     */
    "30s": "30s",

    /**
     * value: "1m"
     * @const
     */
    "1m": "1m",

    /**
     * value: "5m"
     * @const
     */
    "5m": "5m",

    /**
     * value: "10m"
     * @const
     */
    "10m": "10m",

    /**
     * value: "15m"
     * @const
     */
    "15m": "15m",

    /**
     * value: "30m"
     * @const
     */
    "30m": "30m",

    /**
     * value: "1h"
     * @const
     */
    "1h": "1h"
};



export default PostVendorChartIQTimeSeriesIntradaySubsampleGetRequestData;
