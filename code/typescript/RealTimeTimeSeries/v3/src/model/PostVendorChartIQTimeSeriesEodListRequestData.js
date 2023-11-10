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
import PostVendorChartIQTimeSeriesEodListRequestDataAdjustments from './PostVendorChartIQTimeSeriesEodListRequestDataAdjustments';
import PostVendorChartIQTimeSeriesEodListRequestDataIdentifier from './PostVendorChartIQTimeSeriesEodListRequestDataIdentifier';
import PostVendorChartIQTimeSeriesEodListRequestDataRange from './PostVendorChartIQTimeSeriesEodListRequestDataRange';

/**
 * The PostVendorChartIQTimeSeriesEodListRequestData model module.
 * @module model/PostVendorChartIQTimeSeriesEodListRequestData
 */
class PostVendorChartIQTimeSeriesEodListRequestData {
    /**
     * Constructs a new <code>PostVendorChartIQTimeSeriesEodListRequestData</code>.
     * The data member contains the request&#39;s primary data.
     * @alias module:model/PostVendorChartIQTimeSeriesEodListRequestData
     * @param identifier {module:model/PostVendorChartIQTimeSeriesEodListRequestDataIdentifier} 
     * @param range {module:model/PostVendorChartIQTimeSeriesEodListRequestDataRange} 
     */
    constructor(identifier, range) { 
        
        PostVendorChartIQTimeSeriesEodListRequestData.initialize(this, identifier, range);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj, identifier, range) { 
        obj['identifier'] = identifier;
        obj['range'] = range;
    }

    /**
     * Constructs a <code>PostVendorChartIQTimeSeriesEodListRequestData</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/PostVendorChartIQTimeSeriesEodListRequestData} obj Optional instance to populate.
     * @return {module:model/PostVendorChartIQTimeSeriesEodListRequestData} The populated <code>PostVendorChartIQTimeSeriesEodListRequestData</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new PostVendorChartIQTimeSeriesEodListRequestData();

            if (data.hasOwnProperty('identifier')) {
                obj['identifier'] = PostVendorChartIQTimeSeriesEodListRequestDataIdentifier.constructFromObject(data['identifier']);
            }
            if (data.hasOwnProperty('type')) {
                obj['type'] = ApiClient.convertToType(data['type'], 'String');
            }
            if (data.hasOwnProperty('quality')) {
                obj['quality'] = ApiClient.convertToType(data['quality'], 'String');
            }
            if (data.hasOwnProperty('range')) {
                obj['range'] = PostVendorChartIQTimeSeriesEodListRequestDataRange.constructFromObject(data['range']);
            }
            if (data.hasOwnProperty('newestFirst')) {
                obj['newestFirst'] = ApiClient.convertToType(data['newestFirst'], 'Boolean');
            }
            if (data.hasOwnProperty('adjustments')) {
                obj['adjustments'] = PostVendorChartIQTimeSeriesEodListRequestDataAdjustments.constructFromObject(data['adjustments']);
            }
        }
        return obj;
    }


}

/**
 * @member {module:model/PostVendorChartIQTimeSeriesEodListRequestDataIdentifier} identifier
 */
PostVendorChartIQTimeSeriesEodListRequestData.prototype['identifier'] = undefined;

/**
 * Type of the price as configured for the customer.
 * @member {module:model/PostVendorChartIQTimeSeriesEodListRequestData.TypeEnum} type
 * @default 'trade'
 */
PostVendorChartIQTimeSeriesEodListRequestData.prototype['type'] = 'trade';

/**
 * Quality of the price.
 * @member {module:model/PostVendorChartIQTimeSeriesEodListRequestData.QualityEnum} quality
 * @default 'DLY'
 */
PostVendorChartIQTimeSeriesEodListRequestData.prototype['quality'] = 'DLY';

/**
 * @member {module:model/PostVendorChartIQTimeSeriesEodListRequestDataRange} range
 */
PostVendorChartIQTimeSeriesEodListRequestData.prototype['range'] = undefined;

/**
 * Deliver the chronological last part of the requested data first.
 * @member {Boolean} newestFirst
 * @default false
 */
PostVendorChartIQTimeSeriesEodListRequestData.prototype['newestFirst'] = false;

/**
 * @member {module:model/PostVendorChartIQTimeSeriesEodListRequestDataAdjustments} adjustments
 */
PostVendorChartIQTimeSeriesEodListRequestData.prototype['adjustments'] = undefined;





/**
 * Allowed values for the <code>type</code> property.
 * @enum {String}
 * @readonly
 */
PostVendorChartIQTimeSeriesEodListRequestData['TypeEnum'] = {

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
    "yield": "yield",

    /**
     * value: "estimate"
     * @const
     */
    "estimate": "estimate"
};


/**
 * Allowed values for the <code>quality</code> property.
 * @enum {String}
 * @readonly
 */
PostVendorChartIQTimeSeriesEodListRequestData['QualityEnum'] = {

    /**
     * value: "DLY"
     * @const
     */
    "DLY": "DLY",

    /**
     * value: "EOD"
     * @const
     */
    "EOD": "EOD",

    /**
     * value: "BST"
     * @const
     */
    "BST": "BST"
};



export default PostVendorChartIQTimeSeriesEodListRequestData;
