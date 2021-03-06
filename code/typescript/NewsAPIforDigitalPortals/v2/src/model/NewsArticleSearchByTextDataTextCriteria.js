/**
 * News API For Digital Portals
 * Consume FactSet’s StreetAccount news and 3rd party content through an API that seamlessly integrates with quotes, time series, watchlists, and other Functional APIs.  Search for news articles from various news distributors and publishers. Incorporate a multitude of search parameters such as region, category, source, article type and provider-specific meta data, to easily filter out the noise.  All search and list endpoints can be subscribed to receive streamed updates.  News providers include:  * APA * AWP  * Businesswire * Cercle Finance * Direkt News SE * Dow Jones News * dpa * dpa-AFX  * EUWAX * GlobenewsWire * Kauppalehti * Midnight Trader * MoneyAM * newsaktuell * OMX * PR Newswire  * Ritzau Finans * StreetAccount News * TDN News        See the Quotes API for Digital Portals for access to detailed price and performance information, plus basic support for security identifier cross-reference.
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
 * The NewsArticleSearchByTextDataTextCriteria model module.
 * @module model/NewsArticleSearchByTextDataTextCriteria
 */
class NewsArticleSearchByTextDataTextCriteria {
    /**
     * Constructs a new <code>NewsArticleSearchByTextDataTextCriteria</code>.
     * @alias module:model/NewsArticleSearchByTextDataTextCriteria
     */
    constructor() { 
        
        NewsArticleSearchByTextDataTextCriteria.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>NewsArticleSearchByTextDataTextCriteria</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/NewsArticleSearchByTextDataTextCriteria} obj Optional instance to populate.
     * @return {module:model/NewsArticleSearchByTextDataTextCriteria} The populated <code>NewsArticleSearchByTextDataTextCriteria</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new NewsArticleSearchByTextDataTextCriteria();

            if (data.hasOwnProperty('selectionType')) {
                obj['selectionType'] = ApiClient.convertToType(data['selectionType'], 'String');
            }
            if (data.hasOwnProperty('phrases')) {
                obj['phrases'] = ApiClient.convertToType(data['phrases'], ['String']);
            }
            if (data.hasOwnProperty('minimumMatchScore')) {
                obj['minimumMatchScore'] = ApiClient.convertToType(data['minimumMatchScore'], 'Number');
            }
            if (data.hasOwnProperty('scope')) {
                obj['scope'] = ApiClient.convertToType(data['scope'], 'String');
            }
        }
        return obj;
    }


}

/**
 * Specify how the criteria should be applied to the search.
 * @member {module:model/NewsArticleSearchByTextDataTextCriteria.SelectionTypeEnum} selectionType
 * @default 'include'
 */
NewsArticleSearchByTextDataTextCriteria.prototype['selectionType'] = 'include';

/**
 * Phrases to be used in the criteria.
 * @member {Array.<String>} phrases
 */
NewsArticleSearchByTextDataTextCriteria.prototype['phrases'] = undefined;

/**
 * Minimum match score for words in the news article.
 * @member {Number} minimumMatchScore
 * @default 0.7
 */
NewsArticleSearchByTextDataTextCriteria.prototype['minimumMatchScore'] = 0.7;

/**
 * Restrict fulltext search to specific scope.
 * @member {module:model/NewsArticleSearchByTextDataTextCriteria.ScopeEnum} scope
 * @default 'all'
 */
NewsArticleSearchByTextDataTextCriteria.prototype['scope'] = 'all';





/**
 * Allowed values for the <code>selectionType</code> property.
 * @enum {String}
 * @readonly
 */
NewsArticleSearchByTextDataTextCriteria['SelectionTypeEnum'] = {

    /**
     * value: "include"
     * @const
     */
    "include": "include",

    /**
     * value: "exclude"
     * @const
     */
    "exclude": "exclude"
};


/**
 * Allowed values for the <code>scope</code> property.
 * @enum {String}
 * @readonly
 */
NewsArticleSearchByTextDataTextCriteria['ScopeEnum'] = {

    /**
     * value: "headline"
     * @const
     */
    "headline": "headline",

    /**
     * value: "body"
     * @const
     */
    "body": "body",

    /**
     * value: "all"
     * @const
     */
    "all": "all"
};



export default NewsArticleSearchByTextDataTextCriteria;

