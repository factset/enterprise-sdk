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
import LookupObject from './LookupObject';
import LookupRequestMeta from './LookupRequestMeta';

/**
 * The LookupRequest model module.
 * @module model/LookupRequest
 */
class LookupRequest {
    /**
     * Constructs a new <code>LookupRequest</code>.
     * Lookup Request Object
     * @alias module:model/LookupRequest
     * @param data {module:model/LookupObject} 
     */
    constructor(data) { 
        
        LookupRequest.initialize(this, data);
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
     * Constructs a <code>LookupRequest</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/LookupRequest} obj Optional instance to populate.
     * @return {module:model/LookupRequest} The populated <code>LookupRequest</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new LookupRequest();

            if (data.hasOwnProperty('data')) {
                obj['data'] = LookupObject.constructFromObject(data['data']);
            }
            if (data.hasOwnProperty('meta')) {
                obj['meta'] = LookupRequestMeta.constructFromObject(data['meta']);
            }
        }
        return obj;
    }


}

/**
 * @member {module:model/LookupObject} data
 */
LookupRequest.prototype['data'] = undefined;

/**
 * @member {module:model/LookupRequestMeta} meta
 */
LookupRequest.prototype['meta'] = undefined;






export default LookupRequest;

