/**
 * StreetAccount News API
 * The StreetAccount News API provides access to FactSet's proprietary news provider, StreetAccount. StreetAccount, is a premium real-time market intelligence news service that delivers comprehensive U.S., Canadian, and European coverage (and expanding Asia coverage). All possible sources for corporate news are scanned and key story facts are highlighted and presented in an easy-to-read format.  **StreetAccount Filters, Headlines, and Views:**  These endpoints allow for the retrieval of news headlines using filters such as Watchlists/Indices/Tickers, Categories (the equivalent of 'Subjects' within the Workstation), Market Topics, Regions, and Sectors.  Headlines can also be retrieved based on saved views within the Workstation.
 *
 * The version of the OpenAPI document: 1.0.0
 * Contact: api@factset.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 *
 */

import ApiClient from '../ApiClient';

/**
 * The StructuredFiltersWatchlistsObject model module.
 * @module model/StructuredFiltersWatchlistsObject
 */
class StructuredFiltersWatchlistsObject {
    /**
     * Constructs a new <code>StructuredFiltersWatchlistsObject</code>.
     * Elements of structured filters watchlists object.
     * @alias module:model/StructuredFiltersWatchlistsObject
     */
    constructor() { 
        
        StructuredFiltersWatchlistsObject.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>StructuredFiltersWatchlistsObject</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/StructuredFiltersWatchlistsObject} obj Optional instance to populate.
     * @return {module:model/StructuredFiltersWatchlistsObject} The populated <code>StructuredFiltersWatchlistsObject</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new StructuredFiltersWatchlistsObject();

            if (data.hasOwnProperty('name')) {
                obj['name'] = ApiClient.convertToType(data['name'], 'String');
            }
            if (data.hasOwnProperty('type')) {
                obj['type'] = ApiClient.convertToType(data['type'], 'String');
            }
            if (data.hasOwnProperty('value')) {
                obj['value'] = ApiClient.convertToType(data['value'], 'String');
            }
        }
        return obj;
    }


}

/**
 * The name of the watchlist.
 * @member {String} name
 */
StructuredFiltersWatchlistsObject.prototype['name'] = undefined;

/**
 * The type of watchlist.
 * @member {String} type
 */
StructuredFiltersWatchlistsObject.prototype['type'] = undefined;

/**
 * The value associated with the watchlist.
 * @member {String} value
 */
StructuredFiltersWatchlistsObject.prototype['value'] = undefined;






export default StructuredFiltersWatchlistsObject;

