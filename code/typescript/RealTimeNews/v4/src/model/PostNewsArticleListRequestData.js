/**
 * Real-Time News API
 * Consume FactSet’s StreetAccount news and 3rd party content through an API that seamlessly integrates with [quotes](https://developer.factset.com/api-catalog/real-time-quotes-api), [time series](https://developer.factset.com/api-catalog/real-time-time-series-api), [watchlists](https://developer.factset.com/api-catalog/watchlist-api-digital-portals), and other Functional APIs.  Search for news articles from various news distributors and publishers. Incorporate a multitude of search parameters such as region, category, source, article type and provider-specific meta data, to easily filter out the noise.  All search and list endpoints can be subscribed to receive streamed updates.  News providers include:  * APA * AWP  * Businesswire * Cercle Finance * Direkt News SE * Dow Jones News * dpa * dpa-AFX  * EUWAX * GlobenewsWire * Kauppalehti * MT Newswires * MoneyAM * newsaktuell * OMX * PR Newswire  * Ritzau Finans * StreetAccount News * TDN News        See the [Real-Time Quotes API](https://developer.factset.com/api-catalog/real-time-quotes-api) for access to detailed price and performance information, plus basic support for security identifier cross-reference. 
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
import PostNewsArticleListRequestDataFilter from './PostNewsArticleListRequestDataFilter';

/**
 * The PostNewsArticleListRequestData model module.
 * @module model/PostNewsArticleListRequestData
 */
class PostNewsArticleListRequestData {
    /**
     * Constructs a new <code>PostNewsArticleListRequestData</code>.
     * The data member contains the request&#39;s primary data.
     * @alias module:model/PostNewsArticleListRequestData
     */
    constructor() { 
        
        PostNewsArticleListRequestData.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>PostNewsArticleListRequestData</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/PostNewsArticleListRequestData} obj Optional instance to populate.
     * @return {module:model/PostNewsArticleListRequestData} The populated <code>PostNewsArticleListRequestData</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new PostNewsArticleListRequestData();

            if (data.hasOwnProperty('filter')) {
                obj['filter'] = PostNewsArticleListRequestDataFilter.constructFromObject(data['filter']);
            }
        }
        return obj;
    }


}

/**
 * @member {module:model/PostNewsArticleListRequestDataFilter} filter
 */
PostNewsArticleListRequestData.prototype['filter'] = undefined;






export default PostNewsArticleListRequestData;

