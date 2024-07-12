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
import HelperObject from './HelperObject';

/**
 * The HelperEndpoint model module.
 * @module model/HelperEndpoint
 */
class HelperEndpoint {
    /**
     * Constructs a new <code>HelperEndpoint</code>.
     * Helper Endpoint
     * @alias module:model/HelperEndpoint
     * @param data {module:model/HelperObject} 
     */
    constructor(data) { 
        
        HelperEndpoint.initialize(this, data);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj, data) { 
        obj['data'] = data;
    }

    /**
     * Constructs a <code>HelperEndpoint</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/HelperEndpoint} obj Optional instance to populate.
     * @return {module:model/HelperEndpoint} The populated <code>HelperEndpoint</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new HelperEndpoint();

            if (data.hasOwnProperty('data')) {
                obj['data'] = HelperObject.constructFromObject(data['data']);
            }
        }
        return obj;
    }


}

/**
 * @member {module:model/HelperObject} data
 */
HelperEndpoint.prototype['data'] = undefined;






export default HelperEndpoint;

