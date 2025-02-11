/**
 * StreetAccount News API
 * The StreetAccount News API provides access to FactSet's proprietary news provider, StreetAccount. StreetAccount, is a premium real-time market intelligence news service that delivers comprehensive U.S., Canadian, and European coverage (and expanding Asia coverage). All possible sources for corporate news are scanned and key story facts are highlighted and presented in an easy-to-read format.  **StreetAccount Filters, Headlines, and Views:**  These endpoints allow for the retrieval of news headlines using filters such as Watchlists/Indices/Tickers, Categories (the equivalent of 'Subjects' within the Workstation), Market Topics, Regions, and Sectors.  Headlines can also be retrieved based on saved views within the Workstation.
 *
 * The version of the OpenAPI document: 1.2.0
 * Contact: api@factset.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 *
 */

import ApiClient from '../ApiClient';
import FlattenedFiltersRegions from './FlattenedFiltersRegions';
import StructuredFiltersRegions from './StructuredFiltersRegions';

/**
 * The FilterRegionsResponseData model module.
 * @module model/FilterRegionsResponseData
 */
class FilterRegionsResponseData {
    /**
     * Constructs a new <code>FilterRegionsResponseData</code>.
     * @alias module:model/FilterRegionsResponseData
     */
    constructor() { 
        
        FilterRegionsResponseData.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>FilterRegionsResponseData</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/FilterRegionsResponseData} obj Optional instance to populate.
     * @return {module:model/FilterRegionsResponseData} The populated <code>FilterRegionsResponseData</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new FilterRegionsResponseData();

            if (data.hasOwnProperty('structured')) {
                obj['structured'] = StructuredFiltersRegions.constructFromObject(data['structured']);
            }
            if (data.hasOwnProperty('flattened')) {
                obj['flattened'] = FlattenedFiltersRegions.constructFromObject(data['flattened']);
            }
        }
        return obj;
    }


}

/**
 * @member {module:model/StructuredFiltersRegions} structured
 */
FilterRegionsResponseData.prototype['structured'] = undefined;

/**
 * @member {module:model/FlattenedFiltersRegions} flattened
 */
FilterRegionsResponseData.prototype['flattened'] = undefined;






export default FilterRegionsResponseData;

