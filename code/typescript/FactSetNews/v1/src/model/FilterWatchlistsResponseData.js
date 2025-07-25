/**
 * News API
 *  The FactSet News API provides access to FactSet’s news alongside business logic that allows users to replicate views and functionality consistent with the experience provided by the Workstation. This API provides the ability to create views and pull news headlines based on specific filters. There are the filters available for News:  * Watchlists/Indices/Tickers * Sources * Company Filters * Market Topics * Countries * Regions      
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
import FlattenedFiltersWatchlists from './FlattenedFiltersWatchlists';
import StructuredFiltersWatchlists from './StructuredFiltersWatchlists';

/**
 * The FilterWatchlistsResponseData model module.
 * @module model/FilterWatchlistsResponseData
 */
class FilterWatchlistsResponseData {
    /**
     * Constructs a new <code>FilterWatchlistsResponseData</code>.
     * @alias module:model/FilterWatchlistsResponseData
     */
    constructor() { 
        
        FilterWatchlistsResponseData.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>FilterWatchlistsResponseData</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/FilterWatchlistsResponseData} obj Optional instance to populate.
     * @return {module:model/FilterWatchlistsResponseData} The populated <code>FilterWatchlistsResponseData</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new FilterWatchlistsResponseData();

            if (data.hasOwnProperty('structured')) {
                obj['structured'] = StructuredFiltersWatchlists.constructFromObject(data['structured']);
            }
            if (data.hasOwnProperty('flattened')) {
                obj['flattened'] = FlattenedFiltersWatchlists.constructFromObject(data['flattened']);
            }
        }
        return obj;
    }


}

/**
 * @member {module:model/StructuredFiltersWatchlists} structured
 */
FilterWatchlistsResponseData.prototype['structured'] = undefined;

/**
 * @member {module:model/FlattenedFiltersWatchlists} flattened
 */
FilterWatchlistsResponseData.prototype['flattened'] = undefined;






export default FilterWatchlistsResponseData;

