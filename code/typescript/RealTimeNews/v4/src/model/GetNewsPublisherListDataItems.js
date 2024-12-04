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
import GetNewsPublisherListDataItemsDistributor from './GetNewsPublisherListDataItemsDistributor';

/**
 * The GetNewsPublisherListDataItems model module.
 * @module model/GetNewsPublisherListDataItems
 */
class GetNewsPublisherListDataItems {
    /**
     * Constructs a new <code>GetNewsPublisherListDataItems</code>.
     * A list of objects. For semantical context see the description of the parent array.
     * @alias module:model/GetNewsPublisherListDataItems
     */
    constructor() { 
        
        GetNewsPublisherListDataItems.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>GetNewsPublisherListDataItems</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/GetNewsPublisherListDataItems} obj Optional instance to populate.
     * @return {module:model/GetNewsPublisherListDataItems} The populated <code>GetNewsPublisherListDataItems</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new GetNewsPublisherListDataItems();

            if (data.hasOwnProperty('id')) {
                obj['id'] = ApiClient.convertToType(data['id'], 'Number');
            }
            if (data.hasOwnProperty('name')) {
                obj['name'] = ApiClient.convertToType(data['name'], 'String');
            }
            if (data.hasOwnProperty('distributor')) {
                obj['distributor'] = GetNewsPublisherListDataItemsDistributor.constructFromObject(data['distributor']);
            }
        }
        return obj;
    }


}

/**
 * Identifier of the publisher.
 * @member {Number} id
 */
GetNewsPublisherListDataItems.prototype['id'] = undefined;

/**
 * Name of the publisher.
 * @member {String} name
 */
GetNewsPublisherListDataItems.prototype['name'] = undefined;

/**
 * @member {module:model/GetNewsPublisherListDataItemsDistributor} distributor
 */
GetNewsPublisherListDataItems.prototype['distributor'] = undefined;






export default GetNewsPublisherListDataItems;

