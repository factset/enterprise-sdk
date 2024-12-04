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
import PostNewsArticleListByChainRequestDataFilterRange from './PostNewsArticleListByChainRequestDataFilterRange';
import PostNewsArticleListByIndexRequestDataFilterCategories from './PostNewsArticleListByIndexRequestDataFilterCategories';
import PostNewsArticleListByIndexRequestDataFilterDistributor from './PostNewsArticleListByIndexRequestDataFilterDistributor';
import PostNewsArticleListByIndexRequestDataFilterLanguage from './PostNewsArticleListByIndexRequestDataFilterLanguage';
import PostNewsArticleListByIndexRequestDataFilterPublisher from './PostNewsArticleListByIndexRequestDataFilterPublisher';
import PostNewsArticleListByIndexRequestDataFilterRegions from './PostNewsArticleListByIndexRequestDataFilterRegions';
import PostNewsArticleListByIndexRequestDataFilterTypes from './PostNewsArticleListByIndexRequestDataFilterTypes';

/**
 * The PostNewsArticleListByIndexRequestDataFilter model module.
 * @module model/PostNewsArticleListByIndexRequestDataFilter
 */
class PostNewsArticleListByIndexRequestDataFilter {
    /**
     * Constructs a new <code>PostNewsArticleListByIndexRequestDataFilter</code>.
     * Criteria that filter the items in the response list; only items that match all of the criteria are returned.
     * @alias module:model/PostNewsArticleListByIndexRequestDataFilter
     */
    constructor() { 
        
        PostNewsArticleListByIndexRequestDataFilter.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>PostNewsArticleListByIndexRequestDataFilter</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/PostNewsArticleListByIndexRequestDataFilter} obj Optional instance to populate.
     * @return {module:model/PostNewsArticleListByIndexRequestDataFilter} The populated <code>PostNewsArticleListByIndexRequestDataFilter</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new PostNewsArticleListByIndexRequestDataFilter();

            if (data.hasOwnProperty('range')) {
                obj['range'] = PostNewsArticleListByChainRequestDataFilterRange.constructFromObject(data['range']);
            }
            if (data.hasOwnProperty('categories')) {
                obj['categories'] = PostNewsArticleListByIndexRequestDataFilterCategories.constructFromObject(data['categories']);
            }
            if (data.hasOwnProperty('regions')) {
                obj['regions'] = PostNewsArticleListByIndexRequestDataFilterRegions.constructFromObject(data['regions']);
            }
            if (data.hasOwnProperty('distributor')) {
                obj['distributor'] = PostNewsArticleListByIndexRequestDataFilterDistributor.constructFromObject(data['distributor']);
            }
            if (data.hasOwnProperty('publisher')) {
                obj['publisher'] = PostNewsArticleListByIndexRequestDataFilterPublisher.constructFromObject(data['publisher']);
            }
            if (data.hasOwnProperty('language')) {
                obj['language'] = PostNewsArticleListByIndexRequestDataFilterLanguage.constructFromObject(data['language']);
            }
            if (data.hasOwnProperty('types')) {
                obj['types'] = PostNewsArticleListByIndexRequestDataFilterTypes.constructFromObject(data['types']);
            }
        }
        return obj;
    }


}

/**
 * @member {module:model/PostNewsArticleListByChainRequestDataFilterRange} range
 */
PostNewsArticleListByIndexRequestDataFilter.prototype['range'] = undefined;

/**
 * @member {module:model/PostNewsArticleListByIndexRequestDataFilterCategories} categories
 */
PostNewsArticleListByIndexRequestDataFilter.prototype['categories'] = undefined;

/**
 * @member {module:model/PostNewsArticleListByIndexRequestDataFilterRegions} regions
 */
PostNewsArticleListByIndexRequestDataFilter.prototype['regions'] = undefined;

/**
 * @member {module:model/PostNewsArticleListByIndexRequestDataFilterDistributor} distributor
 */
PostNewsArticleListByIndexRequestDataFilter.prototype['distributor'] = undefined;

/**
 * @member {module:model/PostNewsArticleListByIndexRequestDataFilterPublisher} publisher
 */
PostNewsArticleListByIndexRequestDataFilter.prototype['publisher'] = undefined;

/**
 * @member {module:model/PostNewsArticleListByIndexRequestDataFilterLanguage} language
 */
PostNewsArticleListByIndexRequestDataFilter.prototype['language'] = undefined;

/**
 * @member {module:model/PostNewsArticleListByIndexRequestDataFilterTypes} types
 */
PostNewsArticleListByIndexRequestDataFilter.prototype['types'] = undefined;






export default PostNewsArticleListByIndexRequestDataFilter;

