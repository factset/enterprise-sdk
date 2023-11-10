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
import PostNotationCategoryListRequestDataFilter from './PostNotationCategoryListRequestDataFilter';

/**
 * The PostNotationCategoryListRequestData model module.
 * @module model/PostNotationCategoryListRequestData
 */
class PostNotationCategoryListRequestData {
    /**
     * Constructs a new <code>PostNotationCategoryListRequestData</code>.
     * The data member contains the request&#39;s primary data.
     * @alias module:model/PostNotationCategoryListRequestData
     * @param identifier {String} Identifier to resolve.
     * @param identifierType {module:model/PostNotationCategoryListRequestData.IdentifierTypeEnum} Type of the identifier.
     */
    constructor(identifier, identifierType) { 
        
        PostNotationCategoryListRequestData.initialize(this, identifier, identifierType);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj, identifier, identifierType) { 
        obj['identifier'] = identifier;
        obj['identifierType'] = identifierType;
    }

    /**
     * Constructs a <code>PostNotationCategoryListRequestData</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/PostNotationCategoryListRequestData} obj Optional instance to populate.
     * @return {module:model/PostNotationCategoryListRequestData} The populated <code>PostNotationCategoryListRequestData</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new PostNotationCategoryListRequestData();

            if (data.hasOwnProperty('identifier')) {
                obj['identifier'] = ApiClient.convertToType(data['identifier'], 'String');
            }
            if (data.hasOwnProperty('identifierType')) {
                obj['identifierType'] = ApiClient.convertToType(data['identifierType'], 'String');
            }
            if (data.hasOwnProperty('filter')) {
                obj['filter'] = PostNotationCategoryListRequestDataFilter.constructFromObject(data['filter']);
            }
        }
        return obj;
    }


}

/**
 * Identifier to resolve.
 * @member {String} identifier
 */
PostNotationCategoryListRequestData.prototype['identifier'] = undefined;

/**
 * Type of the identifier.
 * @member {module:model/PostNotationCategoryListRequestData.IdentifierTypeEnum} identifierType
 */
PostNotationCategoryListRequestData.prototype['identifierType'] = undefined;

/**
 * @member {module:model/PostNotationCategoryListRequestDataFilter} filter
 */
PostNotationCategoryListRequestData.prototype['filter'] = undefined;





/**
 * Allowed values for the <code>identifierType</code> property.
 * @enum {String}
 * @readonly
 */
PostNotationCategoryListRequestData['IdentifierTypeEnum'] = {

    /**
     * value: "idNotation"
     * @const
     */
    "idNotation": "idNotation",

    /**
     * value: "tickerExchange"
     * @const
     */
    "tickerExchange": "tickerExchange",

    /**
     * value: "tickerRegion"
     * @const
     */
    "tickerRegion": "tickerRegion",

    /**
     * value: "fdsPermanentIdentifierListing"
     * @const
     */
    "fdsPermanentIdentifierListing": "fdsPermanentIdentifierListing",

    /**
     * value: "fdsPermanentIdentifierRegional"
     * @const
     */
    "fdsPermanentIdentifierRegional": "fdsPermanentIdentifierRegional"
};



export default PostNotationCategoryListRequestData;
