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
import InlineResponse20036Fsym from './InlineResponse20036Fsym';
import InlineResponse20038DataCategories from './InlineResponse20038DataCategories';
import InlineResponse20093InstrumentNsin from './InlineResponse20093InstrumentNsin';
import InlineResponse20094InstrumentAssetClass from './InlineResponse20094InstrumentAssetClass';
import InlineResponse20094InstrumentName from './InlineResponse20094InstrumentName';

/**
 * The InlineResponse20094Instrument model module.
 * @module model/InlineResponse20094Instrument
 */
class InlineResponse20094Instrument {
    /**
     * Constructs a new <code>InlineResponse20094Instrument</code>.
     * Instrument data of the notation.
     * @alias module:model/InlineResponse20094Instrument
     */
    constructor() { 
        
        InlineResponse20094Instrument.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>InlineResponse20094Instrument</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/InlineResponse20094Instrument} obj Optional instance to populate.
     * @return {module:model/InlineResponse20094Instrument} The populated <code>InlineResponse20094Instrument</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new InlineResponse20094Instrument();

            if (data.hasOwnProperty('id')) {
                obj['id'] = ApiClient.convertToType(data['id'], 'String');
            }
            if (data.hasOwnProperty('name')) {
                obj['name'] = InlineResponse20094InstrumentName.constructFromObject(data['name']);
            }
            if (data.hasOwnProperty('isin')) {
                obj['isin'] = ApiClient.convertToType(data['isin'], 'String');
            }
            if (data.hasOwnProperty('nsin')) {
                obj['nsin'] = InlineResponse20093InstrumentNsin.constructFromObject(data['nsin']);
            }
            if (data.hasOwnProperty('fsym')) {
                obj['fsym'] = InlineResponse20036Fsym.constructFromObject(data['fsym']);
            }
            if (data.hasOwnProperty('assetClass')) {
                obj['assetClass'] = InlineResponse20094InstrumentAssetClass.constructFromObject(data['assetClass']);
            }
            if (data.hasOwnProperty('type')) {
                obj['type'] = ApiClient.convertToType(data['type'], [InlineResponse20038DataCategories]);
            }
        }
        return obj;
    }


}

/**
 * Identifier of the instrument.
 * @member {String} id
 */
InlineResponse20094Instrument.prototype['id'] = undefined;

/**
 * @member {module:model/InlineResponse20094InstrumentName} name
 */
InlineResponse20094Instrument.prototype['name'] = undefined;

/**
 * International Securities Identification Number of the instrument.
 * @member {String} isin
 */
InlineResponse20094Instrument.prototype['isin'] = undefined;

/**
 * @member {module:model/InlineResponse20093InstrumentNsin} nsin
 */
InlineResponse20094Instrument.prototype['nsin'] = undefined;

/**
 * @member {module:model/InlineResponse20036Fsym} fsym
 */
InlineResponse20094Instrument.prototype['fsym'] = undefined;

/**
 * @member {module:model/InlineResponse20094InstrumentAssetClass} assetClass
 */
InlineResponse20094Instrument.prototype['assetClass'] = undefined;

/**
 * Instrument type as defined by FactSet Digital Solutions. Instrument categories are arranged in a hierarchy, with level 1 representing the most coarse granularity. See endpoint `/category/listBySystem` for category systems 18 for possible values.
 * @member {Array.<module:model/InlineResponse20038DataCategories>} type
 */
InlineResponse20094Instrument.prototype['type'] = undefined;






export default InlineResponse20094Instrument;
