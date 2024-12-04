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
import InlineResponse200DataRange from './InlineResponse200DataRange';
import PostPricesTimeSeriesEodSubsampleListDataSubsamplesItems from './PostPricesTimeSeriesEodSubsampleListDataSubsamplesItems';

/**
 * The InlineResponse2007Data model module.
 * @module model/InlineResponse2007Data
 */
class InlineResponse2007Data {
    /**
     * Constructs a new <code>InlineResponse2007Data</code>.
     * Subsampled time series data for the notation.
     * @alias module:model/InlineResponse2007Data
     */
    constructor() { 
        
        InlineResponse2007Data.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>InlineResponse2007Data</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/InlineResponse2007Data} obj Optional instance to populate.
     * @return {module:model/InlineResponse2007Data} The populated <code>InlineResponse2007Data</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new InlineResponse2007Data();

            if (data.hasOwnProperty('idNotation')) {
                obj['idNotation'] = ApiClient.convertToType(data['idNotation'], 'String');
            }
            if (data.hasOwnProperty('sourceIdentifier')) {
                obj['sourceIdentifier'] = ApiClient.convertToType(data['sourceIdentifier'], 'String');
            }
            if (data.hasOwnProperty('range')) {
                obj['range'] = InlineResponse200DataRange.constructFromObject(data['range']);
            }
            if (data.hasOwnProperty('quality')) {
                obj['quality'] = ApiClient.convertToType(data['quality'], 'String');
            }
            if (data.hasOwnProperty('subsamples')) {
                obj['subsamples'] = ApiClient.convertToType(data['subsamples'], [PostPricesTimeSeriesEodSubsampleListDataSubsamplesItems]);
            }
        }
        return obj;
    }


}

/**
 * MDG identifier of the listing.
 * @member {String} idNotation
 */
InlineResponse2007Data.prototype['idNotation'] = undefined;

/**
 * Identifier used in the request.
 * @member {String} sourceIdentifier
 */
InlineResponse2007Data.prototype['sourceIdentifier'] = undefined;

/**
 * @member {module:model/InlineResponse200DataRange} range
 */
InlineResponse2007Data.prototype['range'] = undefined;

/**
 * Quality of the price. | Value | Description | | --- | --- | | DLY | Delayed: intraday prices with an exchange-imposed delay of usually 15 to 30 minutes. | | EOD | End-of-day: prices updated once per day after the close of trading, possibly with an exchange-imposed delay of several hours or days. |  
 * @member {module:model/InlineResponse2007Data.QualityEnum} quality
 */
InlineResponse2007Data.prototype['quality'] = undefined;

/**
 * List of summary records. For the attributes first, last, low, high, see attribute `valueUnit` in endpoint `/prices/get` for their unit, except for price type yield, where the `valueUnit` is always `percent` (id=258).
 * @member {Array.<module:model/PostPricesTimeSeriesEodSubsampleListDataSubsamplesItems>} subsamples
 */
InlineResponse2007Data.prototype['subsamples'] = undefined;





/**
 * Allowed values for the <code>quality</code> property.
 * @enum {String}
 * @readonly
 */
InlineResponse2007Data['QualityEnum'] = {

    /**
     * value: "DLY"
     * @const
     */
    "DLY": "DLY",

    /**
     * value: "EOD"
     * @const
     */
    "EOD": "EOD"
};



export default InlineResponse2007Data;

