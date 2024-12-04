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
import InlineResponse200Meta from './InlineResponse200Meta';
import PostBasicValueUnitListDataItems from './PostBasicValueUnitListDataItems';

/**
 * The InlineResponse20026 model module.
 * @module model/InlineResponse20026
 */
class InlineResponse20026 {
    /**
     * Constructs a new <code>InlineResponse20026</code>.
     * @alias module:model/InlineResponse20026
     */
    constructor() { 
        
        InlineResponse20026.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>InlineResponse20026</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/InlineResponse20026} obj Optional instance to populate.
     * @return {module:model/InlineResponse20026} The populated <code>InlineResponse20026</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new InlineResponse20026();

            if (data.hasOwnProperty('data')) {
                obj['data'] = ApiClient.convertToType(data['data'], [PostBasicValueUnitListDataItems]);
            }
            if (data.hasOwnProperty('meta')) {
                obj['meta'] = InlineResponse200Meta.constructFromObject(data['meta']);
            }
        }
        return obj;
    }


}

/**
 * List of value units.
 * @member {Array.<module:model/PostBasicValueUnitListDataItems>} data
 */
InlineResponse20026.prototype['data'] = undefined;

/**
 * @member {module:model/InlineResponse200Meta} meta
 */
InlineResponse20026.prototype['meta'] = undefined;






export default InlineResponse20026;

