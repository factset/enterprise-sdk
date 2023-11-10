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
import InlineResponse2004DataRange from './InlineResponse2004DataRange';
import InlineResponse2008DataPrices from './InlineResponse2008DataPrices';

/**
 * The InlineResponse2008Data model module.
 * @module model/InlineResponse2008Data
 */
class InlineResponse2008Data {
    /**
     * Constructs a new <code>InlineResponse2008Data</code>.
     * Time series data for the notation.
     * @alias module:model/InlineResponse2008Data
     */
    constructor() { 
        
        InlineResponse2008Data.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>InlineResponse2008Data</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/InlineResponse2008Data} obj Optional instance to populate.
     * @return {module:model/InlineResponse2008Data} The populated <code>InlineResponse2008Data</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new InlineResponse2008Data();

            if (data.hasOwnProperty('idNotation')) {
                obj['idNotation'] = ApiClient.convertToType(data['idNotation'], 'String');
            }
            if (data.hasOwnProperty('sourceIdentifier')) {
                obj['sourceIdentifier'] = ApiClient.convertToType(data['sourceIdentifier'], 'String');
            }
            if (data.hasOwnProperty('range')) {
                obj['range'] = InlineResponse2004DataRange.constructFromObject(data['range']);
            }
            if (data.hasOwnProperty('quality')) {
                obj['quality'] = ApiClient.convertToType(data['quality'], 'String');
            }
            if (data.hasOwnProperty('prices')) {
                obj['prices'] = ApiClient.convertToType(data['prices'], [InlineResponse2008DataPrices]);
            }
        }
        return obj;
    }


}

/**
 * MDG identifier of the listing.
 * @member {String} idNotation
 */
InlineResponse2008Data.prototype['idNotation'] = undefined;

/**
 * Identifier used in the request.
 * @member {String} sourceIdentifier
 */
InlineResponse2008Data.prototype['sourceIdentifier'] = undefined;

/**
 * @member {module:model/InlineResponse2004DataRange} range
 */
InlineResponse2008Data.prototype['range'] = undefined;

/**
 * Quality of the price.
 * @member {module:model/InlineResponse2008Data.QualityEnum} quality
 */
InlineResponse2008Data.prototype['quality'] = undefined;

/**
 * Time series of prices.
 * @member {Array.<module:model/InlineResponse2008DataPrices>} prices
 */
InlineResponse2008Data.prototype['prices'] = undefined;





/**
 * Allowed values for the <code>quality</code> property.
 * @enum {String}
 * @readonly
 */
InlineResponse2008Data['QualityEnum'] = {

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



export default InlineResponse2008Data;
