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
 * The GetBasicRegionListDataItems model module.
 * @module model/GetBasicRegionListDataItems
 */
class GetBasicRegionListDataItems {
    /**
     * Constructs a new <code>GetBasicRegionListDataItems</code>.
     * A list of objects. For semantical context see the description of the parent array.
     * @alias module:model/GetBasicRegionListDataItems
     */
    constructor() { 
        
        GetBasicRegionListDataItems.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>GetBasicRegionListDataItems</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/GetBasicRegionListDataItems} obj Optional instance to populate.
     * @return {module:model/GetBasicRegionListDataItems} The populated <code>GetBasicRegionListDataItems</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new GetBasicRegionListDataItems();

            if (data.hasOwnProperty('id')) {
                obj['id'] = ApiClient.convertToType(data['id'], 'Number');
            }
            if (data.hasOwnProperty('code')) {
                obj['code'] = ApiClient.convertToType(data['code'], 'String');
            }
            if (data.hasOwnProperty('name')) {
                obj['name'] = ApiClient.convertToType(data['name'], 'String');
            }
            if (data.hasOwnProperty('type')) {
                obj['type'] = ApiClient.convertToType(data['type'], 'String');
            }
        }
        return obj;
    }


}

/**
 * Identifier of a region.
 * @member {Number} id
 */
GetBasicRegionListDataItems.prototype['id'] = undefined;

/**
 * ISO 3166-1 alpha-2 code of the country. This attribute is set for each country, may be set for miscellaneous regions and is empty for regions of other types.
 * @member {String} code
 */
GetBasicRegionListDataItems.prototype['code'] = undefined;

/**
 * Name of the region.
 * @member {String} name
 */
GetBasicRegionListDataItems.prototype['name'] = undefined;

/**
 * Type of the region. | Value | Description | | --- | --- | | continent | Regions that are considered to be a continent in the context of the Market Data Gateway. | | country | A region that represents a country that has been assigned an official ISO 3166-1 code. | | subdivision | A region that represents a subdivision of a country that has been assigned an official ISO 3166-2 code. | | misc | A miscellaneous region represents a region that is neither a continent, nor a country, nor a subdivision of a country. | | compound | A compound miscellaneous region consists of member regions which are uniquely and undoubtedly defined. |  
 * @member {module:model/GetBasicRegionListDataItems.TypeEnum} type
 */
GetBasicRegionListDataItems.prototype['type'] = undefined;





/**
 * Allowed values for the <code>type</code> property.
 * @enum {String}
 * @readonly
 */
GetBasicRegionListDataItems['TypeEnum'] = {

    /**
     * value: "continent"
     * @const
     */
    "continent": "continent",

    /**
     * value: "country"
     * @const
     */
    "country": "country",

    /**
     * value: "subdivision"
     * @const
     */
    "subdivision": "subdivision",

    /**
     * value: "misc"
     * @const
     */
    "misc": "misc",

    /**
     * value: "compound"
     * @const
     */
    "compound": "compound"
};



export default GetBasicRegionListDataItems;

