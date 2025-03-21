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
import InlineResponse20010DataRange from './InlineResponse20010DataRange';
import PostPricesTimeSeriesIntradaySubsampleListDataSubsamplesItems from './PostPricesTimeSeriesIntradaySubsampleListDataSubsamplesItems';

/**
 * The InlineResponse20010Data model module.
 * @module model/InlineResponse20010Data
 */
class InlineResponse20010Data {
    /**
     * Constructs a new <code>InlineResponse20010Data</code>.
     * Subsampled time series data for the notation.
     * @alias module:model/InlineResponse20010Data
     */
    constructor() { 
        
        InlineResponse20010Data.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>InlineResponse20010Data</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/InlineResponse20010Data} obj Optional instance to populate.
     * @return {module:model/InlineResponse20010Data} The populated <code>InlineResponse20010Data</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new InlineResponse20010Data();

            if (data.hasOwnProperty('idNotation')) {
                obj['idNotation'] = ApiClient.convertToType(data['idNotation'], 'String');
            }
            if (data.hasOwnProperty('sourceIdentifier')) {
                obj['sourceIdentifier'] = ApiClient.convertToType(data['sourceIdentifier'], 'String');
            }
            if (data.hasOwnProperty('range')) {
                obj['range'] = InlineResponse20010DataRange.constructFromObject(data['range']);
            }
            if (data.hasOwnProperty('quality')) {
                obj['quality'] = ApiClient.convertToType(data['quality'], 'String');
            }
            if (data.hasOwnProperty('volumeWeightedAveragePrice')) {
                obj['volumeWeightedAveragePrice'] = ApiClient.convertToType(data['volumeWeightedAveragePrice'], 'Number');
            }
            if (data.hasOwnProperty('subsamples')) {
                obj['subsamples'] = ApiClient.convertToType(data['subsamples'], [PostPricesTimeSeriesIntradaySubsampleListDataSubsamplesItems]);
            }
        }
        return obj;
    }


}

/**
 * MDG identifier of the listing.
 * @member {String} idNotation
 */
InlineResponse20010Data.prototype['idNotation'] = undefined;

/**
 * Identifier used in the request.
 * @member {String} sourceIdentifier
 */
InlineResponse20010Data.prototype['sourceIdentifier'] = undefined;

/**
 * @member {module:model/InlineResponse20010DataRange} range
 */
InlineResponse20010Data.prototype['range'] = undefined;

/**
 * Quality of the price. | Value | Description | | --- | --- | | RLT | Real-time: intraday prices with minimal technical processing delays. | | DLY | Delayed: intraday prices with an exchange-imposed delay of usually 15 to 30 minutes. |  
 * @member {module:model/InlineResponse20010Data.QualityEnum} quality
 */
InlineResponse20010Data.prototype['quality'] = undefined;

/**
 * The volume-weighted average price (VWAP) for the returned time series. See attribute currency in endpoint `/prices/get` for its unit.
 * @member {Number} volumeWeightedAveragePrice
 */
InlineResponse20010Data.prototype['volumeWeightedAveragePrice'] = undefined;

/**
 * List of summary records. For the attributes first, last, low, high, see attribute `valueUnit` in endpoint `/prices/get` for their unit, except for price type yield, where the `valueUnit` is always `percent` (id=258).
 * @member {Array.<module:model/PostPricesTimeSeriesIntradaySubsampleListDataSubsamplesItems>} subsamples
 */
InlineResponse20010Data.prototype['subsamples'] = undefined;





/**
 * Allowed values for the <code>quality</code> property.
 * @enum {String}
 * @readonly
 */
InlineResponse20010Data['QualityEnum'] = {

    /**
     * value: "RLT"
     * @const
     */
    "RLT": "RLT",

    /**
     * value: "DLY"
     * @const
     */
    "DLY": "DLY"
};



export default InlineResponse20010Data;

