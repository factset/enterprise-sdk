/**
 * Quotes API For Digital Portals
 * The Quotes API combines endpoints for retrieving security end-of-day, delayed, and realtime prices with performance key figures and basic reference data on the security and market level.  The API supports over 20 different price types for each quote and comes with basic search endpoints based on security identifiers and instrument names. Market coverage is included in the *Sample Use Cases* section below.  The Digital Portal use case is focused on high-performance applications that are  * serving millions of end-users, * accessible by client browsers via the internet, * supporting subscriptions for streamed updates out-of-the-box, * typically combining a wide variety of *for Digital Portals*-APIs into a highly use-case specific solution for customers, * integrated into complex infrastructures such as existing frontend frameworks, authentication services.  All APIs labelled *for Digital Portals* have been designed for direct use by client web applications and feature extreme low latency: The average response time across all endpoints is 30 ms whereas 99% of all requests are answered in close to under 300ms.  See the [Time Series API for Digital Portals](https://developer.factset.com/api-catalog/time-series-api-digital-portals) for direct access to price histories, and the [News API for Digital Portals](https://developer.factset.com/api-catalog/news-api-digital-portals) for searching and fetching related news. 
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
import InlineResponse20089DataCurrency from './InlineResponse20089DataCurrency';
import InlineResponse20089DataValueUnit from './InlineResponse20089DataValueUnit';
import InlineResponse20090Market from './InlineResponse20090Market';
import InlineResponse20091DataAsk from './InlineResponse20091DataAsk';
import InlineResponse20091DataBid from './InlineResponse20091DataBid';

/**
 * The InlineResponse20091Data model module.
 * @module model/InlineResponse20091Data
 */
class InlineResponse20091Data {
    /**
     * Constructs a new <code>InlineResponse20091Data</code>.
     * Bid and ask prices for the notation.
     * @alias module:model/InlineResponse20091Data
     */
    constructor() { 
        
        InlineResponse20091Data.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>InlineResponse20091Data</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/InlineResponse20091Data} obj Optional instance to populate.
     * @return {module:model/InlineResponse20091Data} The populated <code>InlineResponse20091Data</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new InlineResponse20091Data();

            if (data.hasOwnProperty('idNotation')) {
                obj['idNotation'] = ApiClient.convertToType(data['idNotation'], 'String');
            }
            if (data.hasOwnProperty('sourceIdentifier')) {
                obj['sourceIdentifier'] = ApiClient.convertToType(data['sourceIdentifier'], 'String');
            }
            if (data.hasOwnProperty('valueUnit')) {
                obj['valueUnit'] = InlineResponse20089DataValueUnit.constructFromObject(data['valueUnit']);
            }
            if (data.hasOwnProperty('currency')) {
                obj['currency'] = InlineResponse20089DataCurrency.constructFromObject(data['currency']);
            }
            if (data.hasOwnProperty('market')) {
                obj['market'] = InlineResponse20090Market.constructFromObject(data['market']);
            }
            if (data.hasOwnProperty('quality')) {
                obj['quality'] = ApiClient.convertToType(data['quality'], 'String');
            }
            if (data.hasOwnProperty('bid')) {
                obj['bid'] = InlineResponse20091DataBid.constructFromObject(data['bid']);
            }
            if (data.hasOwnProperty('ask')) {
                obj['ask'] = InlineResponse20091DataAsk.constructFromObject(data['ask']);
            }
        }
        return obj;
    }


}

/**
 * MDG identifier of the listing.
 * @member {String} idNotation
 */
InlineResponse20091Data.prototype['idNotation'] = undefined;

/**
 * Identifier used in the request.
 * @member {String} sourceIdentifier
 */
InlineResponse20091Data.prototype['sourceIdentifier'] = undefined;

/**
 * @member {module:model/InlineResponse20089DataValueUnit} valueUnit
 */
InlineResponse20091Data.prototype['valueUnit'] = undefined;

/**
 * @member {module:model/InlineResponse20089DataCurrency} currency
 */
InlineResponse20091Data.prototype['currency'] = undefined;

/**
 * @member {module:model/InlineResponse20090Market} market
 */
InlineResponse20091Data.prototype['market'] = undefined;

/**
 * Quality of the price.
 * @member {module:model/InlineResponse20091Data.QualityEnum} quality
 */
InlineResponse20091Data.prototype['quality'] = undefined;

/**
 * @member {module:model/InlineResponse20091DataBid} bid
 */
InlineResponse20091Data.prototype['bid'] = undefined;

/**
 * @member {module:model/InlineResponse20091DataAsk} ask
 */
InlineResponse20091Data.prototype['ask'] = undefined;





/**
 * Allowed values for the <code>quality</code> property.
 * @enum {String}
 * @readonly
 */
InlineResponse20091Data['QualityEnum'] = {

    /**
     * value: "RLT"
     * @const
     */
    "RLT": "RLT",

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



export default InlineResponse20091Data;

