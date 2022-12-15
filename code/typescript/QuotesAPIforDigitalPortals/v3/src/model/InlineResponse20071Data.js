/**
 * Quotes API For Digital Portals
 * The Quotes API combines endpoints for retrieving security end-of-day, delayed, and realtime prices with performance key figures and basic reference data on the security and market level.  The API supports over 20 different price types for each quote and comes with basic search endpoints based on security identifiers and instrument names. Market coverage is included in the *Sample Use Cases* section below.  The Digital Portal use case is focused on high-performance applications that are  * serving millions of end-users, * accessible by client browsers via the internet, * supporting subscriptions for streamed updates out-of-the-box, * typically combining a wide variety of *for Digital Portals*-APIs into a highly use-case specific solution for customers, * integrated into complex infrastructures such as existing frontend frameworks, authentication services.  All APIs labelled *for Digital Portals* have been designed for direct use by client web applications and feature extreme low latency: The average response time across all endpoints is 30 ms whereas 99% of all requests are answered in close to under 300ms.  See the [Time Series API for Digital Portals](https://developer.factset.com/api-catalog/time-series-api-digital-portals) for direct access to price histories, and the [News API for Digital Portals](https://developer.factset.com/api-catalog/news-api-digital-portals) for searching and fetching related news. 
 *
 * The version of the OpenAPI document: 2
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 *
 */

import ApiClient from '../ApiClient';
import InlineResponse20071DataInstrument from './InlineResponse20071DataInstrument';
import InlineResponse20071DataRegional from './InlineResponse20071DataRegional';

/**
 * The InlineResponse20071Data model module.
 * @module model/InlineResponse20071Data
 */
class InlineResponse20071Data {
    /**
     * Constructs a new <code>InlineResponse20071Data</code>.
     * Instrument data with a list of regional-level data and assigned listing-level data.
     * @alias module:model/InlineResponse20071Data
     */
    constructor() { 
        
        InlineResponse20071Data.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>InlineResponse20071Data</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/InlineResponse20071Data} obj Optional instance to populate.
     * @return {module:model/InlineResponse20071Data} The populated <code>InlineResponse20071Data</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new InlineResponse20071Data();

            if (data.hasOwnProperty('idNotation')) {
                obj['idNotation'] = ApiClient.convertToType(data['idNotation'], 'String');
            }
            if (data.hasOwnProperty('sourceIdentifier')) {
                obj['sourceIdentifier'] = ApiClient.convertToType(data['sourceIdentifier'], 'String');
            }
            if (data.hasOwnProperty('instrument')) {
                obj['instrument'] = InlineResponse20071DataInstrument.constructFromObject(data['instrument']);
            }
            if (data.hasOwnProperty('permanentIdentifier')) {
                obj['permanentIdentifier'] = ApiClient.convertToType(data['permanentIdentifier'], 'String');
            }
            if (data.hasOwnProperty('regional')) {
                obj['regional'] = InlineResponse20071DataRegional.constructFromObject(data['regional']);
            }
        }
        return obj;
    }


}

/**
 * MDG identifier of the listing.
 * @member {String} idNotation
 */
InlineResponse20071Data.prototype['idNotation'] = undefined;

/**
 * Identifier used in the request.
 * @member {String} sourceIdentifier
 */
InlineResponse20071Data.prototype['sourceIdentifier'] = undefined;

/**
 * @member {module:model/InlineResponse20071DataInstrument} instrument
 */
InlineResponse20071Data.prototype['instrument'] = undefined;

/**
 * FactSet Permanent Identifier for an instrument. The format is six alpha numeric characters, excluding vowels, with an S suffix (XXXXXX-S).
 * @member {String} permanentIdentifier
 */
InlineResponse20071Data.prototype['permanentIdentifier'] = undefined;

/**
 * @member {module:model/InlineResponse20071DataRegional} regional
 */
InlineResponse20071Data.prototype['regional'] = undefined;






export default InlineResponse20071Data;

