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

/**
 * The PostNewsPublisherSearchByNameRequestMeta model module.
 * @module model/PostNewsPublisherSearchByNameRequestMeta
 */
class PostNewsPublisherSearchByNameRequestMeta {
    /**
     * Constructs a new <code>PostNewsPublisherSearchByNameRequestMeta</code>.
     * The meta member contains the meta information of the request.
     * @alias module:model/PostNewsPublisherSearchByNameRequestMeta
     */
    constructor() { 
        
        PostNewsPublisherSearchByNameRequestMeta.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>PostNewsPublisherSearchByNameRequestMeta</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/PostNewsPublisherSearchByNameRequestMeta} obj Optional instance to populate.
     * @return {module:model/PostNewsPublisherSearchByNameRequestMeta} The populated <code>PostNewsPublisherSearchByNameRequestMeta</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new PostNewsPublisherSearchByNameRequestMeta();

            if (data.hasOwnProperty('attributes')) {
                obj['attributes'] = ApiClient.convertToType(data['attributes'], ['String']);
            }
            if (data.hasOwnProperty('sort')) {
                obj['sort'] = ApiClient.convertToType(data['sort'], ['String']);
            }
        }
        return obj;
    }


}

/**
 * Limit the attributes returned in the response to the specified set.
 * @member {Array.<String>} attributes
 */
PostNewsPublisherSearchByNameRequestMeta.prototype['attributes'] = undefined;

/**
 * Sortable attributes. The sort order is ascending unless it is prefixed with a minus sign, in which case it is descending. A list of at most 1 (possibly prefixed) attribute name(s) is allowed.
 * @member {Array.<module:model/PostNewsPublisherSearchByNameRequestMeta.SortEnum>} sort
 */
PostNewsPublisherSearchByNameRequestMeta.prototype['sort'] = undefined;





/**
 * Allowed values for the <code>sort</code> property.
 * @enum {String}
 * @readonly
 */
PostNewsPublisherSearchByNameRequestMeta['SortEnum'] = {

    /**
     * value: "id"
     * @const
     */
    "id": "id",

    /**
     * value: "-id"
     * @const
     */
    "-id": "-id",

    /**
     * value: "name"
     * @const
     */
    "name": "name",

    /**
     * value: "-name"
     * @const
     */
    "-name": "-name"
};



export default PostNewsPublisherSearchByNameRequestMeta;

