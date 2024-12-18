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
 * The InlineResponse2001Data model module.
 * @module model/InlineResponse2001Data
 */
class InlineResponse2001Data {
    /**
     * Constructs a new <code>InlineResponse2001Data</code>.
     * Subsample data for the notation.
     * @alias module:model/InlineResponse2001Data
     */
    constructor() { 
        
        InlineResponse2001Data.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>InlineResponse2001Data</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/InlineResponse2001Data} obj Optional instance to populate.
     * @return {module:model/InlineResponse2001Data} The populated <code>InlineResponse2001Data</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new InlineResponse2001Data();

            if (data.hasOwnProperty('idNotation')) {
                obj['idNotation'] = ApiClient.convertToType(data['idNotation'], 'String');
            }
            if (data.hasOwnProperty('sourceIdentifier')) {
                obj['sourceIdentifier'] = ApiClient.convertToType(data['sourceIdentifier'], 'String');
            }
            if (data.hasOwnProperty('quality')) {
                obj['quality'] = ApiClient.convertToType(data['quality'], 'String');
            }
            if (data.hasOwnProperty('subsample')) {
                obj['subsample'] = ApiClient.convertToType(data['subsample'], ['Number']);
            }
        }
        return obj;
    }


}

/**
 * MDG identifier of the listing.
 * @member {String} idNotation
 */
InlineResponse2001Data.prototype['idNotation'] = undefined;

/**
 * Identifier used in the request.
 * @member {String} sourceIdentifier
 */
InlineResponse2001Data.prototype['sourceIdentifier'] = undefined;

/**
 * Quality of the price. | Value | Description | | --- | --- | | DLY | Delayed: intraday prices with an exchange-imposed delay of usually 15 to 30 minutes. | | EOD | End-of-day: prices updated once per day after the close of trading, possibly with an exchange-imposed delay of several hours or days. |  
 * @member {module:model/InlineResponse2001Data.QualityEnum} quality
 */
InlineResponse2001Data.prototype['quality'] = undefined;

/**
 * Single summary record. The record consists of a timestamp, four price values, and the trading volume. For the unit of the price values, see attribute `valueUnit` in endpoint `/prices/get`, except for price type yield, where the `valueUnit` is always `percent` (id=258). The order is as follows: timestamp of the start of the subsample (seconds since epoch in UTC); first price of the subsample; highest price of the subsample; lowest price of the subsample; last price of the subsample; accumulated number of units (e.g. shares) traded of the subsample. If the requested type of the price is ask, bid, or yield, the accumulated number of units is empty.
 * @member {Array.<Number>} subsample
 */
InlineResponse2001Data.prototype['subsample'] = undefined;





/**
 * Allowed values for the <code>quality</code> property.
 * @enum {String}
 * @readonly
 */
InlineResponse2001Data['QualityEnum'] = {

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



export default InlineResponse2001Data;

