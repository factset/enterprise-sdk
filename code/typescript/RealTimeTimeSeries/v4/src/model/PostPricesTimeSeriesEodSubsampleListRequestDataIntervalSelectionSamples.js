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
 * The PostPricesTimeSeriesEodSubsampleListRequestDataIntervalSelectionSamples model module.
 * @module model/PostPricesTimeSeriesEodSubsampleListRequestDataIntervalSelectionSamples
 */
class PostPricesTimeSeriesEodSubsampleListRequestDataIntervalSelectionSamples {
    /**
     * Constructs a new <code>PostPricesTimeSeriesEodSubsampleListRequestDataIntervalSelectionSamples</code>.
     * Subsample granularity and number of samples suitable for end-of-day data.
     * @alias module:model/PostPricesTimeSeriesEodSubsampleListRequestDataIntervalSelectionSamples
     * @param end {Date} Date of the end point of the subsamples (exclusive). `end` is limited to the day after the current day.
     * @param number {Number} Number of subsamples returned. The product of `number` and `granularity` must not extend further into the past than 1900-01-01.
     */
    constructor(end, number) { 
        
        PostPricesTimeSeriesEodSubsampleListRequestDataIntervalSelectionSamples.initialize(this, end, number);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj, end, number) { 
        obj['end'] = end;
        obj['number'] = number;
    }

    /**
     * Constructs a <code>PostPricesTimeSeriesEodSubsampleListRequestDataIntervalSelectionSamples</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/PostPricesTimeSeriesEodSubsampleListRequestDataIntervalSelectionSamples} obj Optional instance to populate.
     * @return {module:model/PostPricesTimeSeriesEodSubsampleListRequestDataIntervalSelectionSamples} The populated <code>PostPricesTimeSeriesEodSubsampleListRequestDataIntervalSelectionSamples</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new PostPricesTimeSeriesEodSubsampleListRequestDataIntervalSelectionSamples();

            if (data.hasOwnProperty('end')) {
                obj['end'] = ApiClient.convertToType(data['end'], 'Date');
            }
            if (data.hasOwnProperty('number')) {
                obj['number'] = ApiClient.convertToType(data['number'], 'Number');
            }
            if (data.hasOwnProperty('granularity')) {
                obj['granularity'] = ApiClient.convertToType(data['granularity'], 'String');
            }
        }
        return obj;
    }


}

/**
 * Date of the end point of the subsamples (exclusive). `end` is limited to the day after the current day.
 * @member {Date} end
 */
PostPricesTimeSeriesEodSubsampleListRequestDataIntervalSelectionSamples.prototype['end'] = undefined;

/**
 * Number of subsamples returned. The product of `number` and `granularity` must not extend further into the past than 1900-01-01.
 * @member {Number} number
 */
PostPricesTimeSeriesEodSubsampleListRequestDataIntervalSelectionSamples.prototype['number'] = undefined;

/**
 * Subsample granularities suitable for end-of-day data. | Value | Description | | --- | --- | | 1d | Each subsample interval encompasses 1 day. | | 1w | Each subsample interval encompasses 1 week. | | 1m | Each subsample interval encompasses 1 month. | | 3m | Each subsample interval encompasses 3 month. | | 6m | Each subsample interval encompasses 6 month. | | 1y | Each subsample interval encompasses 1 year. |  
 * @member {module:model/PostPricesTimeSeriesEodSubsampleListRequestDataIntervalSelectionSamples.GranularityEnum} granularity
 * @default '1w'
 */
PostPricesTimeSeriesEodSubsampleListRequestDataIntervalSelectionSamples.prototype['granularity'] = '1w';





/**
 * Allowed values for the <code>granularity</code> property.
 * @enum {String}
 * @readonly
 */
PostPricesTimeSeriesEodSubsampleListRequestDataIntervalSelectionSamples['GranularityEnum'] = {

    /**
     * value: "1d"
     * @const
     */
    "1d": "1d",

    /**
     * value: "1w"
     * @const
     */
    "1w": "1w",

    /**
     * value: "1m"
     * @const
     */
    "1m": "1m",

    /**
     * value: "3m"
     * @const
     */
    "3m": "3m",

    /**
     * value: "6m"
     * @const
     */
    "6m": "6m",

    /**
     * value: "1y"
     * @const
     */
    "1y": "1y"
};



export default PostPricesTimeSeriesEodSubsampleListRequestDataIntervalSelectionSamples;

