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
import PostNewsArticleListByInstrumentRequestDataIdentifier from './PostNewsArticleListByInstrumentRequestDataIdentifier';
import PostNewsArticleListRequestDataFilter from './PostNewsArticleListRequestDataFilter';

/**
 * The PostNewsArticleListByInstrumentRequestData model module.
 * @module model/PostNewsArticleListByInstrumentRequestData
 */
class PostNewsArticleListByInstrumentRequestData {
    /**
     * Constructs a new <code>PostNewsArticleListByInstrumentRequestData</code>.
     * The data member contains the request&#39;s primary data.
     * @alias module:model/PostNewsArticleListByInstrumentRequestData
     * @param identifier {module:model/PostNewsArticleListByInstrumentRequestDataIdentifier} 
     */
    constructor(identifier) { 
        
        PostNewsArticleListByInstrumentRequestData.initialize(this, identifier);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj, identifier) { 
        obj['identifier'] = identifier;
    }

    /**
     * Constructs a <code>PostNewsArticleListByInstrumentRequestData</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/PostNewsArticleListByInstrumentRequestData} obj Optional instance to populate.
     * @return {module:model/PostNewsArticleListByInstrumentRequestData} The populated <code>PostNewsArticleListByInstrumentRequestData</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new PostNewsArticleListByInstrumentRequestData();

            if (data.hasOwnProperty('identifier')) {
                obj['identifier'] = PostNewsArticleListByInstrumentRequestDataIdentifier.constructFromObject(data['identifier']);
            }
            if (data.hasOwnProperty('filter')) {
                obj['filter'] = PostNewsArticleListRequestDataFilter.constructFromObject(data['filter']);
            }
        }
        return obj;
    }


}

/**
 * @member {module:model/PostNewsArticleListByInstrumentRequestDataIdentifier} identifier
 */
PostNewsArticleListByInstrumentRequestData.prototype['identifier'] = undefined;

/**
 * @member {module:model/PostNewsArticleListRequestDataFilter} filter
 */
PostNewsArticleListByInstrumentRequestData.prototype['filter'] = undefined;






export default PostNewsArticleListByInstrumentRequestData;

