/**
 * ID Lookup API
 * The ID Lookup API is a fuzzy search service that allows users to resolve symbols but are unable to find them elsewhere. The ID Lookup API allows users to search for entities in a wide variety of ways including, but not limited to, tickers, CUSIPs, URLs, a company’s brands, names and descriptions. The API does not require a complete query and will return different lists of results with each additional character, which enables users to iterate and adjust queries to return the desired results. Each search query returns a list of suggestions that can include every entity type offered by the API based on a matching and ranking algorithm.   The API response returns multiple different symbols that map to both internal FactSet identifiers like security or entity IDs as well as external identifiers like exchange tickers, Morningstar symbols and ISINs. This gives users flexibility in mapping identifiers across the FactSet universe.
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

/**
 * The Filters model module.
 * @module model/Filters
 */
class Filters {
    /**
     * Constructs a new <code>Filters</code>.
     *   Filters object helps narrow down the search results by including and/or excluding parameters. Filters are specific, depending on the dataset.   Please refer to &#x60;/metadata/fields/list-by-dataset&#x60; for the complete list of supported fields and values to filter the requested dataset.  If no filters are provided, all data will be returned.    * include - restricts results to those matching the provided fields and values   * exclude - returns all results except those matching the provided fields and values.   Possible cases:    * No filters object (default): No filter will be applied to the results.     * Include and exclude objects used together: Results are based on the combination of different fields used in both objects.     * The same field cannot be used in both include and exclude. If that happens, an HTTP 400 response is returned.    * If a specified field does not exist in the dataset, an HTTP 400 response is returned. 
     * @alias module:model/Filters
     */
    constructor() { 
        
        Filters.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>Filters</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/Filters} obj Optional instance to populate.
     * @return {module:model/Filters} The populated <code>Filters</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new Filters();

            if (data.hasOwnProperty('include')) {
                obj['include'] = ApiClient.convertToType(data['include'], {'String': ['String']});
            }
            if (data.hasOwnProperty('exclude')) {
                obj['exclude'] = ApiClient.convertToType(data['exclude'], {'String': ['String']});
            }
        }
        return obj;
    }


}

/**
 * @member {Object.<String, Array.<String>>} include
 */
Filters.prototype['include'] = undefined;

/**
 * @member {Object.<String, Array.<String>>} exclude
 */
Filters.prototype['exclude'] = undefined;






export default Filters;

