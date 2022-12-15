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
import PostNotationSearchByTextRequestDataValidationMarket from './PostNotationSearchByTextRequestDataValidationMarket';
import PostNotationSearchByTextRequestDataValidationPrices from './PostNotationSearchByTextRequestDataValidationPrices';
import PostNotationSearchByTextRequestDataValidationValueUnit from './PostNotationSearchByTextRequestDataValidationValueUnit';

/**
 * The PostNotationSearchByTextRequestDataValidation model module.
 * @module model/PostNotationSearchByTextRequestDataValidation
 */
class PostNotationSearchByTextRequestDataValidation {
    /**
     * Constructs a new <code>PostNotationSearchByTextRequestDataValidation</code>.
     * Validation parameters.
     * @alias module:model/PostNotationSearchByTextRequestDataValidation
     */
    constructor() { 
        
        PostNotationSearchByTextRequestDataValidation.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>PostNotationSearchByTextRequestDataValidation</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/PostNotationSearchByTextRequestDataValidation} obj Optional instance to populate.
     * @return {module:model/PostNotationSearchByTextRequestDataValidation} The populated <code>PostNotationSearchByTextRequestDataValidation</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new PostNotationSearchByTextRequestDataValidation();

            if (data.hasOwnProperty('onlyActive')) {
                obj['onlyActive'] = ApiClient.convertToType(data['onlyActive'], 'Boolean');
            }
            if (data.hasOwnProperty('prices')) {
                obj['prices'] = PostNotationSearchByTextRequestDataValidationPrices.constructFromObject(data['prices']);
            }
            if (data.hasOwnProperty('valueUnit')) {
                obj['valueUnit'] = PostNotationSearchByTextRequestDataValidationValueUnit.constructFromObject(data['valueUnit']);
            }
            if (data.hasOwnProperty('market')) {
                obj['market'] = PostNotationSearchByTextRequestDataValidationMarket.constructFromObject(data['market']);
            }
        }
        return obj;
    }


}

/**
 * If `true`, only active notations will be returned. The term \"active\" reflects the fact that notations and related data is not being deleted immediately after becoming irrelevant (e.g. because the source does not provide a price anymore), but remains in general retrievable for up to 6 months.
 * @member {Boolean} onlyActive
 * @default true
 */
PostNotationSearchByTextRequestDataValidation.prototype['onlyActive'] = true;

/**
 * @member {module:model/PostNotationSearchByTextRequestDataValidationPrices} prices
 */
PostNotationSearchByTextRequestDataValidation.prototype['prices'] = undefined;

/**
 * @member {module:model/PostNotationSearchByTextRequestDataValidationValueUnit} valueUnit
 */
PostNotationSearchByTextRequestDataValidation.prototype['valueUnit'] = undefined;

/**
 * @member {module:model/PostNotationSearchByTextRequestDataValidationMarket} market
 */
PostNotationSearchByTextRequestDataValidation.prototype['market'] = undefined;






export default PostNotationSearchByTextRequestDataValidation;

