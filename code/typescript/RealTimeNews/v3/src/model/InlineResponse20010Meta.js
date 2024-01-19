/**
 * News API For Digital Portals
 * Consume FactSet’s StreetAccount news and 3rd party content through an API that seamlessly integrates with [quotes](https://developer.factset.com/api-catalog/real-time-quotes-api), [time series](https://developer.factset.com/api-catalog/real-time-time-series-api), [watchlists](https://developer.factset.com/api-catalog/watchlist-api-digital-portals), and other Functional APIs.  Search for news articles from various news distributors and publishers. Incorporate a multitude of search parameters such as region, category, source, article type and provider-specific meta data, to easily filter out the noise.  All search and list endpoints can be subscribed to receive streamed updates.  News providers include:  * APA * AWP  * Businesswire * Cercle Finance * Direkt News SE * Dow Jones News * dpa * dpa-AFX  * EUWAX * GlobenewsWire * Kauppalehti * MT Newswires * MoneyAM * newsaktuell * OMX * PR Newswire  * Ritzau Finans * StreetAccount News * TDN News        See the [Real-Time Quotes API](https://developer.factset.com/api-catalog/real-time-quotes-api) for access to detailed price and performance information, plus basic support for security identifier cross-reference. 
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
import OffsetBasedPaginationOutputObjectWithoutTotal from './OffsetBasedPaginationOutputObjectWithoutTotal';
import StatusObject from './StatusObject';

/**
 * The InlineResponse20010Meta model module.
 * @module model/InlineResponse20010Meta
 */
class InlineResponse20010Meta {
    /**
     * Constructs a new <code>InlineResponse20010Meta</code>.
     * The meta member contains the meta information of the response.
     * @alias module:model/InlineResponse20010Meta
     */
    constructor() { 
        
        InlineResponse20010Meta.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>InlineResponse20010Meta</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/InlineResponse20010Meta} obj Optional instance to populate.
     * @return {module:model/InlineResponse20010Meta} The populated <code>InlineResponse20010Meta</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new InlineResponse20010Meta();

            if (data.hasOwnProperty('status')) {
                obj['status'] = StatusObject.constructFromObject(data['status']);
            }
            if (data.hasOwnProperty('pagination')) {
                obj['pagination'] = OffsetBasedPaginationOutputObjectWithoutTotal.constructFromObject(data['pagination']);
            }
        }
        return obj;
    }


}

/**
 * @member {module:model/StatusObject} status
 */
InlineResponse20010Meta.prototype['status'] = undefined;

/**
 * @member {module:model/OffsetBasedPaginationOutputObjectWithoutTotal} pagination
 */
InlineResponse20010Meta.prototype['pagination'] = undefined;






export default InlineResponse20010Meta;

