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
 * The PostVendorChartIQTimeSeriesEodSubsampleGetRequestMeta model module.
 * @module model/PostVendorChartIQTimeSeriesEodSubsampleGetRequestMeta
 */
class PostVendorChartIQTimeSeriesEodSubsampleGetRequestMeta {
    /**
     * Constructs a new <code>PostVendorChartIQTimeSeriesEodSubsampleGetRequestMeta</code>.
     * The meta member contains the meta information of the request.
     * @alias module:model/PostVendorChartIQTimeSeriesEodSubsampleGetRequestMeta
     */
    constructor() { 
        
        PostVendorChartIQTimeSeriesEodSubsampleGetRequestMeta.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>PostVendorChartIQTimeSeriesEodSubsampleGetRequestMeta</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/PostVendorChartIQTimeSeriesEodSubsampleGetRequestMeta} obj Optional instance to populate.
     * @return {module:model/PostVendorChartIQTimeSeriesEodSubsampleGetRequestMeta} The populated <code>PostVendorChartIQTimeSeriesEodSubsampleGetRequestMeta</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new PostVendorChartIQTimeSeriesEodSubsampleGetRequestMeta();

            if (data.hasOwnProperty('attributes')) {
                obj['attributes'] = ApiClient.convertToType(data['attributes'], ['String']);
            }
        }
        return obj;
    }


}

/**
 * Limit the attributes returned in the response to the specified set.
 * @member {Array.<String>} attributes
 */
PostVendorChartIQTimeSeriesEodSubsampleGetRequestMeta.prototype['attributes'] = undefined;






export default PostVendorChartIQTimeSeriesEodSubsampleGetRequestMeta;

