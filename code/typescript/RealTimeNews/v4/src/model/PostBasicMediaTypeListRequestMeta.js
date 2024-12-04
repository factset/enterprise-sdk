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

/**
 * The PostBasicMediaTypeListRequestMeta model module.
 * @module model/PostBasicMediaTypeListRequestMeta
 */
class PostBasicMediaTypeListRequestMeta {
    /**
     * Constructs a new <code>PostBasicMediaTypeListRequestMeta</code>.
     * The meta member contains the meta information of the request.
     * @alias module:model/PostBasicMediaTypeListRequestMeta
     */
    constructor() { 
        
        PostBasicMediaTypeListRequestMeta.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>PostBasicMediaTypeListRequestMeta</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/PostBasicMediaTypeListRequestMeta} obj Optional instance to populate.
     * @return {module:model/PostBasicMediaTypeListRequestMeta} The populated <code>PostBasicMediaTypeListRequestMeta</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new PostBasicMediaTypeListRequestMeta();

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
PostBasicMediaTypeListRequestMeta.prototype['attributes'] = undefined;

/**
 * Sortable attributes. The sort order is ascending unless it is prefixed with a minus sign, in which case it is descending. A list of at most 2 (possibly prefixed) attribute name(s) is allowed. | Value | | --- | | id | | -id | | name | | -name |  
 * @member {Array.<module:model/PostBasicMediaTypeListRequestMeta.SortEnum>} sort
 */
PostBasicMediaTypeListRequestMeta.prototype['sort'] = undefined;





/**
 * Allowed values for the <code>sort</code> property.
 * @enum {String}
 * @readonly
 */
PostBasicMediaTypeListRequestMeta['SortEnum'] = {

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



export default PostBasicMediaTypeListRequestMeta;

