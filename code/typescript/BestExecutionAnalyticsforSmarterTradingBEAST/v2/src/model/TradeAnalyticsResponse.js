/**
 * Best Execution Analytics for Smarter Trading (BEAST) API
 * Enables clients to programmatically access the underlying data which powers the BEAST Liquidity Analytics (LA) and Transaction Cost Analysis (TCA) applications.
 *
 * The version of the OpenAPI document: 2.0.0
 * Contact: api@factset.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 *
 */

import ApiClient from '../ApiClient';
import TradeAnalytic from './TradeAnalytic';

/**
 * The TradeAnalyticsResponse model module.
 * @module model/TradeAnalyticsResponse
 */
class TradeAnalyticsResponse {
    /**
     * Constructs a new <code>TradeAnalyticsResponse</code>.
     * Trade Analytics Response object
     * @alias module:model/TradeAnalyticsResponse
     */
    constructor() { 
        
        TradeAnalyticsResponse.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>TradeAnalyticsResponse</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/TradeAnalyticsResponse} obj Optional instance to populate.
     * @return {module:model/TradeAnalyticsResponse} The populated <code>TradeAnalyticsResponse</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new TradeAnalyticsResponse();

            if (data.hasOwnProperty('analytics')) {
                obj['analytics'] = ApiClient.convertToType(data['analytics'], [TradeAnalytic]);
            }
        }
        return obj;
    }


}

/**
 * List of Analytics
 * @member {Array.<module:model/TradeAnalytic>} analytics
 */
TradeAnalyticsResponse.prototype['analytics'] = undefined;






export default TradeAnalyticsResponse;

