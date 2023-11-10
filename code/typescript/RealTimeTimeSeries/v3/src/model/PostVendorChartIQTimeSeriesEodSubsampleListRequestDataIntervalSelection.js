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
import PostVendorChartIQTimeSeriesEodSubsampleListRequestDataIntervalSelectionSamples from './PostVendorChartIQTimeSeriesEodSubsampleListRequestDataIntervalSelectionSamples';

/**
 * The PostVendorChartIQTimeSeriesEodSubsampleListRequestDataIntervalSelection model module.
 * @module model/PostVendorChartIQTimeSeriesEodSubsampleListRequestDataIntervalSelection
 */
class PostVendorChartIQTimeSeriesEodSubsampleListRequestDataIntervalSelection {
    /**
     * Constructs a new <code>PostVendorChartIQTimeSeriesEodSubsampleListRequestDataIntervalSelection</code>.
     * Select the intervals from which the subsamples are to be created.
     * @alias module:model/PostVendorChartIQTimeSeriesEodSubsampleListRequestDataIntervalSelection
     */
    constructor() { 
        
        PostVendorChartIQTimeSeriesEodSubsampleListRequestDataIntervalSelection.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>PostVendorChartIQTimeSeriesEodSubsampleListRequestDataIntervalSelection</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/PostVendorChartIQTimeSeriesEodSubsampleListRequestDataIntervalSelection} obj Optional instance to populate.
     * @return {module:model/PostVendorChartIQTimeSeriesEodSubsampleListRequestDataIntervalSelection} The populated <code>PostVendorChartIQTimeSeriesEodSubsampleListRequestDataIntervalSelection</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new PostVendorChartIQTimeSeriesEodSubsampleListRequestDataIntervalSelection();

            if (data.hasOwnProperty('intervals')) {
                obj['intervals'] = ApiClient.convertToType(data['intervals'], ['Date']);
            }
            if (data.hasOwnProperty('samples')) {
                obj['samples'] = PostVendorChartIQTimeSeriesEodSubsampleListRequestDataIntervalSelectionSamples.constructFromObject(data['samples']);
            }
        }
        return obj;
    }


}

/**
 * Non-empty intervals of days to consider for the request. The array contains a list of at least two days in increasing order. Each pair of adjacent entries day_n and day_(n+1) specifies a half-open interval, that is a range of days d where day_n <= d < day_(n+1). A subsample is computed for each interval. The valid range of intervals is between 1900-01-01 and the day after the current day.
 * @member {Array.<Date>} intervals
 */
PostVendorChartIQTimeSeriesEodSubsampleListRequestDataIntervalSelection.prototype['intervals'] = undefined;

/**
 * @member {module:model/PostVendorChartIQTimeSeriesEodSubsampleListRequestDataIntervalSelectionSamples} samples
 */
PostVendorChartIQTimeSeriesEodSubsampleListRequestDataIntervalSelection.prototype['samples'] = undefined;






export default PostVendorChartIQTimeSeriesEodSubsampleListRequestDataIntervalSelection;
