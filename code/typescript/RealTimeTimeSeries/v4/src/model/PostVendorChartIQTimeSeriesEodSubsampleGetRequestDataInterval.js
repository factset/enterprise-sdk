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
 * The PostVendorChartIQTimeSeriesEodSubsampleGetRequestDataInterval model module.
 * @module model/PostVendorChartIQTimeSeriesEodSubsampleGetRequestDataInterval
 */
class PostVendorChartIQTimeSeriesEodSubsampleGetRequestDataInterval {
    /**
     * Constructs a new <code>PostVendorChartIQTimeSeriesEodSubsampleGetRequestDataInterval</code>.
     * Non-empty interval of days specifying a single subsample period. The starting point &#x60;start&#x60; of the single subsample is usually the attribute &#x60;range.end&#x60; of a previously received &#x60;/vendor/chartIQ/timeSeries/eod/subsample/list&#x60; request. A valid range is between 1900-01-01 and a day that is less than or equal to the maximum allowed day determined from the delay period (if any). The ending point &#x60;end&#x60; may exceed the maximally entitled date range.
     * @alias module:model/PostVendorChartIQTimeSeriesEodSubsampleGetRequestDataInterval
     * @param start {Date} The starting point of the interval (inclusive). 
     * @param end {Date} The ending point of the interval (exclusive).
     */
    constructor(start, end) { 
        
        PostVendorChartIQTimeSeriesEodSubsampleGetRequestDataInterval.initialize(this, start, end);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj, start, end) { 
        obj['start'] = start;
        obj['end'] = end;
    }

    /**
     * Constructs a <code>PostVendorChartIQTimeSeriesEodSubsampleGetRequestDataInterval</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/PostVendorChartIQTimeSeriesEodSubsampleGetRequestDataInterval} obj Optional instance to populate.
     * @return {module:model/PostVendorChartIQTimeSeriesEodSubsampleGetRequestDataInterval} The populated <code>PostVendorChartIQTimeSeriesEodSubsampleGetRequestDataInterval</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new PostVendorChartIQTimeSeriesEodSubsampleGetRequestDataInterval();

            if (data.hasOwnProperty('start')) {
                obj['start'] = ApiClient.convertToType(data['start'], 'Date');
            }
            if (data.hasOwnProperty('end')) {
                obj['end'] = ApiClient.convertToType(data['end'], 'Date');
            }
        }
        return obj;
    }


}

/**
 * The starting point of the interval (inclusive). 
 * @member {Date} start
 */
PostVendorChartIQTimeSeriesEodSubsampleGetRequestDataInterval.prototype['start'] = undefined;

/**
 * The ending point of the interval (exclusive).
 * @member {Date} end
 */
PostVendorChartIQTimeSeriesEodSubsampleGetRequestDataInterval.prototype['end'] = undefined;






export default PostVendorChartIQTimeSeriesEodSubsampleGetRequestDataInterval;

