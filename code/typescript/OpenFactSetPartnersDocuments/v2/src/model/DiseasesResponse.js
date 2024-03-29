/**
 * Open:FactSet - Partners
 * This service provides the capability to search and download unstructured content provided by <a href=\"https://open.factset.com/catalog/en-us\">Open:FactSet Partners</a>.
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
import DiseasesFiles from './DiseasesFiles';
import Meta from './Meta';

/**
 * The DiseasesResponse model module.
 * @module model/DiseasesResponse
 */
class DiseasesResponse {
    /**
     * Constructs a new <code>DiseasesResponse</code>.
     * Returns Diseases Response
     * @alias module:model/DiseasesResponse
     */
    constructor() { 
        
        DiseasesResponse.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>DiseasesResponse</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/DiseasesResponse} obj Optional instance to populate.
     * @return {module:model/DiseasesResponse} The populated <code>DiseasesResponse</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new DiseasesResponse();

            if (data.hasOwnProperty('data')) {
                obj['data'] = ApiClient.convertToType(data['data'], [DiseasesFiles]);
            }
            if (data.hasOwnProperty('meta')) {
                obj['meta'] = Meta.constructFromObject(data['meta']);
            }
        }
        return obj;
    }


}

/**
 * Returns Diseases Response
 * @member {Array.<module:model/DiseasesFiles>} data
 */
DiseasesResponse.prototype['data'] = undefined;

/**
 * @member {module:model/Meta} meta
 */
DiseasesResponse.prototype['meta'] = undefined;






export default DiseasesResponse;

