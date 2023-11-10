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
import InlineResponse20046DataNotationFsym from './InlineResponse20046DataNotationFsym';
import InlineResponse20071DataMarket from './InlineResponse20071DataMarket';
import InlineResponse20071DataValueUnit from './InlineResponse20071DataValueUnit';

/**
 * The InlineResponse20072DataNotations model module.
 * @module model/InlineResponse20072DataNotations
 */
class InlineResponse20072DataNotations {
    /**
     * Constructs a new <code>InlineResponse20072DataNotations</code>.
     * @alias module:model/InlineResponse20072DataNotations
     */
    constructor() { 
        
        InlineResponse20072DataNotations.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>InlineResponse20072DataNotations</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/InlineResponse20072DataNotations} obj Optional instance to populate.
     * @return {module:model/InlineResponse20072DataNotations} The populated <code>InlineResponse20072DataNotations</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new InlineResponse20072DataNotations();

            if (data.hasOwnProperty('id')) {
                obj['id'] = ApiClient.convertToType(data['id'], 'String');
            }
            if (data.hasOwnProperty('symbol')) {
                obj['symbol'] = ApiClient.convertToType(data['symbol'], 'String');
            }
            if (data.hasOwnProperty('active')) {
                obj['active'] = ApiClient.convertToType(data['active'], 'Boolean');
            }
            if (data.hasOwnProperty('market')) {
                obj['market'] = InlineResponse20071DataMarket.constructFromObject(data['market']);
            }
            if (data.hasOwnProperty('valueUnit')) {
                obj['valueUnit'] = InlineResponse20071DataValueUnit.constructFromObject(data['valueUnit']);
            }
            if (data.hasOwnProperty('fsym')) {
                obj['fsym'] = InlineResponse20046DataNotationFsym.constructFromObject(data['fsym']);
            }
        }
        return obj;
    }


}

/**
 * Identifier of the notation.
 * @member {String} id
 */
InlineResponse20072DataNotations.prototype['id'] = undefined;

/**
 * The symbol of the notation. It is a market-specific code to identify the notation. Which characters can be part of a symbol depends on the market. If a market does not define a proprietary symbol, but uses a different identifier (for example, the ISIN or the WKN) to identify notations, no symbol will be set for the notations of that market.
 * @member {String} symbol
 */
InlineResponse20072DataNotations.prototype['symbol'] = undefined;

/**
 * Indicates whether the notation is active.
 * @member {Boolean} active
 */
InlineResponse20072DataNotations.prototype['active'] = undefined;

/**
 * @member {module:model/InlineResponse20071DataMarket} market
 */
InlineResponse20072DataNotations.prototype['market'] = undefined;

/**
 * @member {module:model/InlineResponse20071DataValueUnit} valueUnit
 */
InlineResponse20072DataNotations.prototype['valueUnit'] = undefined;

/**
 * @member {module:model/InlineResponse20046DataNotationFsym} fsym
 */
InlineResponse20072DataNotations.prototype['fsym'] = undefined;






export default InlineResponse20072DataNotations;
