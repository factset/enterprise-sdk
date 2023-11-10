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
import PostNotationSearchByTextRequestDataValidationPricesLatest from './PostNotationSearchByTextRequestDataValidationPricesLatest';
import PostNotationSearchByTextRequestDataValidationPricesPrevious from './PostNotationSearchByTextRequestDataValidationPricesPrevious';

/**
 * The PostNotationSearchByTextRequestDataValidationPrices model module.
 * @module model/PostNotationSearchByTextRequestDataValidationPrices
 */
class PostNotationSearchByTextRequestDataValidationPrices {
    /**
     * Constructs a new <code>PostNotationSearchByTextRequestDataValidationPrices</code>.
     * Price-related parameters.
     * @alias module:model/PostNotationSearchByTextRequestDataValidationPrices
     */
    constructor() { 
        
        PostNotationSearchByTextRequestDataValidationPrices.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>PostNotationSearchByTextRequestDataValidationPrices</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/PostNotationSearchByTextRequestDataValidationPrices} obj Optional instance to populate.
     * @return {module:model/PostNotationSearchByTextRequestDataValidationPrices} The populated <code>PostNotationSearchByTextRequestDataValidationPrices</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new PostNotationSearchByTextRequestDataValidationPrices();

            if (data.hasOwnProperty('quality')) {
                obj['quality'] = ApiClient.convertToType(data['quality'], 'String');
            }
            if (data.hasOwnProperty('latest')) {
                obj['latest'] = PostNotationSearchByTextRequestDataValidationPricesLatest.constructFromObject(data['latest']);
            }
            if (data.hasOwnProperty('previous')) {
                obj['previous'] = PostNotationSearchByTextRequestDataValidationPricesPrevious.constructFromObject(data['previous']);
            }
        }
        return obj;
    }


}

/**
 * Quality of the price.
 * @member {module:model/PostNotationSearchByTextRequestDataValidationPrices.QualityEnum} quality
 * @default 'EOD'
 */
PostNotationSearchByTextRequestDataValidationPrices.prototype['quality'] = 'EOD';

/**
 * @member {module:model/PostNotationSearchByTextRequestDataValidationPricesLatest} latest
 */
PostNotationSearchByTextRequestDataValidationPrices.prototype['latest'] = undefined;

/**
 * @member {module:model/PostNotationSearchByTextRequestDataValidationPricesPrevious} previous
 */
PostNotationSearchByTextRequestDataValidationPrices.prototype['previous'] = undefined;





/**
 * Allowed values for the <code>quality</code> property.
 * @enum {String}
 * @readonly
 */
PostNotationSearchByTextRequestDataValidationPrices['QualityEnum'] = {

    /**
     * value: "DLY"
     * @const
     */
    "DLY": "DLY",

    /**
     * value: "EOD"
     * @const
     */
    "EOD": "EOD"
};



export default PostNotationSearchByTextRequestDataValidationPrices;
