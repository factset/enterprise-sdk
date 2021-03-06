/**
 * Quotes API For Digital Portals
 * The quotes API combines endpoints for retrieving security end-of-day, delayed, and realtime prices with performance key figures and basic reference data on the security and market level.  The API supports over 20 different price types for each quote and comes with basic search endpoints based on security identifiers and instrument names. Market coverage is included in the *Sample Use Cases* section below.  The Digital Portal use case is focused on high-performance applications that are  * serving millions of end-users, * accessible by client browsers via the internet, * supporting subscriptions for streamed updates out-of-the-box, * typically combining a wide variety of *for Digital Portals*-APIs into a highly use-case specific solution for customers, * integrated into complex infrastructures such as existing frontend frameworks, authentication services.  All APIs labelled *for Digital Portals* have been designed for direct use by client web applications and feature extreme low latency: The average response time across all endpoints is 30 ms whereas 99% of all requests are answered in close to under 300ms.  See the Time Series API for Digital Portals for direct access to price histories, and the News API for Digital Portals for searching and fetching related news.
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
import InlineResponse20063Current from './InlineResponse20063Current';
import InlineResponse20063Previous from './InlineResponse20063Previous';
import InlineResponse20063System from './InlineResponse20063System';

/**
 * The InlineResponse20063Ratings model module.
 * @module model/InlineResponse20063Ratings
 */
class InlineResponse20063Ratings {
    /**
     * Constructs a new <code>InlineResponse20063Ratings</code>.
     * @alias module:model/InlineResponse20063Ratings
     */
    constructor() { 
        
        InlineResponse20063Ratings.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>InlineResponse20063Ratings</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/InlineResponse20063Ratings} obj Optional instance to populate.
     * @return {module:model/InlineResponse20063Ratings} The populated <code>InlineResponse20063Ratings</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new InlineResponse20063Ratings();

            if (data.hasOwnProperty('system')) {
                obj['system'] = InlineResponse20063System.constructFromObject(data['system']);
            }
            if (data.hasOwnProperty('current')) {
                obj['current'] = InlineResponse20063Current.constructFromObject(data['current']);
            }
            if (data.hasOwnProperty('previous')) {
                obj['previous'] = InlineResponse20063Previous.constructFromObject(data['previous']);
            }
            if (data.hasOwnProperty('change')) {
                obj['change'] = ApiClient.convertToType(data['change'], 'Number');
            }
        }
        return obj;
    }


}

/**
 * @member {module:model/InlineResponse20063System} system
 */
InlineResponse20063Ratings.prototype['system'] = undefined;

/**
 * @member {module:model/InlineResponse20063Current} current
 */
InlineResponse20063Ratings.prototype['current'] = undefined;

/**
 * @member {module:model/InlineResponse20063Previous} previous
 */
InlineResponse20063Ratings.prototype['previous'] = undefined;

/**
 * Rating grade change which is the difference between the rank of the current rating and the rank of the previous rating. Example: If a rating system has AAA, AA, A, B, C, D as possible ratings (from best to worst), then a change from AA to B is represented as -2 and a change from C to AAA is represented as +4.
 * @member {Number} change
 */
InlineResponse20063Ratings.prototype['change'] = undefined;






export default InlineResponse20063Ratings;

