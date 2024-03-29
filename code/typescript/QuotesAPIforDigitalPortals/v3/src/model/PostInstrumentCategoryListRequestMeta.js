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
 * The PostInstrumentCategoryListRequestMeta model module.
 * @module model/PostInstrumentCategoryListRequestMeta
 */
class PostInstrumentCategoryListRequestMeta {
    /**
     * Constructs a new <code>PostInstrumentCategoryListRequestMeta</code>.
     * The meta member contains the meta information of the request.
     * @alias module:model/PostInstrumentCategoryListRequestMeta
     */
    constructor() { 
        
        PostInstrumentCategoryListRequestMeta.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>PostInstrumentCategoryListRequestMeta</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/PostInstrumentCategoryListRequestMeta} obj Optional instance to populate.
     * @return {module:model/PostInstrumentCategoryListRequestMeta} The populated <code>PostInstrumentCategoryListRequestMeta</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new PostInstrumentCategoryListRequestMeta();

            if (data.hasOwnProperty('attributes')) {
                obj['attributes'] = ApiClient.convertToType(data['attributes'], ['String']);
            }
            if (data.hasOwnProperty('language')) {
                obj['language'] = ApiClient.convertToType(data['language'], 'String');
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
PostInstrumentCategoryListRequestMeta.prototype['attributes'] = undefined;

/**
 * ISO 639-1 code of the language.
 * @member {String} language
 */
PostInstrumentCategoryListRequestMeta.prototype['language'] = undefined;

/**
 * Sortable attributes. The sort order is ascending unless it is prefixed with a minus sign, in which case it is descending. A list of at most 2 (possibly prefixed) attribute name(s) is allowed.
 * @member {Array.<module:model/PostInstrumentCategoryListRequestMeta.SortEnum>} sort
 */
PostInstrumentCategoryListRequestMeta.prototype['sort'] = undefined;





/**
 * Allowed values for the <code>sort</code> property.
 * @enum {String}
 * @readonly
 */
PostInstrumentCategoryListRequestMeta['SortEnum'] = {

    /**
     * value: "dataset.id"
     * @const
     */
    "dataset.id": "dataset.id",

    /**
     * value: "-dataset.id"
     * @const
     */
    "-dataset.id": "-dataset.id",

    /**
     * value: "dataset.name"
     * @const
     */
    "dataset.name": "dataset.name",

    /**
     * value: "-dataset.name"
     * @const
     */
    "-dataset.name": "-dataset.name"
};



export default PostInstrumentCategoryListRequestMeta;

