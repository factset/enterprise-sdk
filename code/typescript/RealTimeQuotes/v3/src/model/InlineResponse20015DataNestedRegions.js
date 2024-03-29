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

/**
 * The InlineResponse20015DataNestedRegions model module.
 * @module model/InlineResponse20015DataNestedRegions
 */
class InlineResponse20015DataNestedRegions {
    /**
     * Constructs a new <code>InlineResponse20015DataNestedRegions</code>.
     * @alias module:model/InlineResponse20015DataNestedRegions
     */
    constructor() { 
        
        InlineResponse20015DataNestedRegions.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>InlineResponse20015DataNestedRegions</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/InlineResponse20015DataNestedRegions} obj Optional instance to populate.
     * @return {module:model/InlineResponse20015DataNestedRegions} The populated <code>InlineResponse20015DataNestedRegions</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new InlineResponse20015DataNestedRegions();

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
InlineResponse20015DataNestedRegions.prototype['id'] = undefined;

/**
 * ISO 3166-1 alpha-2 code of the country. This attribute is set for each country, may be set for miscellaneous regions and is empty for regions of other types.
 * @member {String} code
 */
InlineResponse20015DataNestedRegions.prototype['code'] = undefined;

/**
 * Name of the region.
 * @member {String} name
 */
InlineResponse20015DataNestedRegions.prototype['name'] = undefined;

/**
 * Type of the region.
 * @member {module:model/InlineResponse20015DataNestedRegions.TypeEnum} type
 */
InlineResponse20015DataNestedRegions.prototype['type'] = undefined;





/**
 * Allowed values for the <code>type</code> property.
 * @enum {String}
 * @readonly
 */
InlineResponse20015DataNestedRegions['TypeEnum'] = {

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



export default InlineResponse20015DataNestedRegions;

