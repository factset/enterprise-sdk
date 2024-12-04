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
import PostVendorChartIQTimeSeriesEodListRequestData from './PostVendorChartIQTimeSeriesEodListRequestData';
import PostVendorChartIQTimeSeriesEodListRequestMeta from './PostVendorChartIQTimeSeriesEodListRequestMeta';

/**
 * The PostVendorChartIQTimeSeriesEodListRequest model module.
 * @module model/PostVendorChartIQTimeSeriesEodListRequest
 */
class PostVendorChartIQTimeSeriesEodListRequest {
    /**
     * Constructs a new <code>PostVendorChartIQTimeSeriesEodListRequest</code>.
     * Request Body
     * @alias module:model/PostVendorChartIQTimeSeriesEodListRequest
     * @param data {module:model/PostVendorChartIQTimeSeriesEodListRequestData} 
     */
    constructor(data) { 
        
        PostVendorChartIQTimeSeriesEodListRequest.initialize(this, data);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj, data) { 
        obj['data'] = data;
    }

    /**
     * Constructs a <code>PostVendorChartIQTimeSeriesEodListRequest</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/PostVendorChartIQTimeSeriesEodListRequest} obj Optional instance to populate.
     * @return {module:model/PostVendorChartIQTimeSeriesEodListRequest} The populated <code>PostVendorChartIQTimeSeriesEodListRequest</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new PostVendorChartIQTimeSeriesEodListRequest();

            if (data.hasOwnProperty('data')) {
                obj['data'] = PostVendorChartIQTimeSeriesEodListRequestData.constructFromObject(data['data']);
            }
            if (data.hasOwnProperty('meta')) {
                obj['meta'] = PostVendorChartIQTimeSeriesEodListRequestMeta.constructFromObject(data['meta']);
            }
        }
        return obj;
    }


}

/**
 * @member {module:model/PostVendorChartIQTimeSeriesEodListRequestData} data
 */
PostVendorChartIQTimeSeriesEodListRequest.prototype['data'] = undefined;

/**
 * @member {module:model/PostVendorChartIQTimeSeriesEodListRequestMeta} meta
 */
PostVendorChartIQTimeSeriesEodListRequest.prototype['meta'] = undefined;






export default PostVendorChartIQTimeSeriesEodListRequest;

