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

/**
 * The PostInstrumentNotationListRequestDataIdentifier model module.
 * @module model/PostInstrumentNotationListRequestDataIdentifier
 */
class PostInstrumentNotationListRequestDataIdentifier {
    /**
     * Constructs a new <code>PostInstrumentNotationListRequestDataIdentifier</code>.
     * Set of instrument-related identifiers and their type.
     * @alias module:model/PostInstrumentNotationListRequestDataIdentifier
     * @param values {Array.<String>} Set of identifiers that resolve to an instrument.
     * @param type {module:model/PostInstrumentNotationListRequestDataIdentifier.TypeEnum} Type of the identifier.
     */
    constructor(values, type) { 
        
        PostInstrumentNotationListRequestDataIdentifier.initialize(this, values, type);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj, values, type) { 
        obj['values'] = values;
        obj['type'] = type;
    }

    /**
     * Constructs a <code>PostInstrumentNotationListRequestDataIdentifier</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/PostInstrumentNotationListRequestDataIdentifier} obj Optional instance to populate.
     * @return {module:model/PostInstrumentNotationListRequestDataIdentifier} The populated <code>PostInstrumentNotationListRequestDataIdentifier</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new PostInstrumentNotationListRequestDataIdentifier();

            if (data.hasOwnProperty('values')) {
                obj['values'] = ApiClient.convertToType(data['values'], ['String']);
            }
            if (data.hasOwnProperty('type')) {
                obj['type'] = ApiClient.convertToType(data['type'], 'String');
            }
        }
        return obj;
    }


}

/**
 * Set of identifiers that resolve to an instrument.
 * @member {Array.<String>} values
 */
PostInstrumentNotationListRequestDataIdentifier.prototype['values'] = undefined;

/**
 * Type of the identifier.
 * @member {module:model/PostInstrumentNotationListRequestDataIdentifier.TypeEnum} type
 */
PostInstrumentNotationListRequestDataIdentifier.prototype['type'] = undefined;





/**
 * Allowed values for the <code>type</code> property.
 * @enum {String}
 * @readonly
 */
PostInstrumentNotationListRequestDataIdentifier['TypeEnum'] = {

    /**
     * value: "idInstrument"
     * @const
     */
    "idInstrument": "idInstrument",

    /**
     * value: "tickerExchange"
     * @const
     */
    "tickerExchange": "tickerExchange"
};



export default PostInstrumentNotationListRequestDataIdentifier;

