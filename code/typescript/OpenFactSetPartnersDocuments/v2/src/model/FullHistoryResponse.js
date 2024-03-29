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
import FullHistoryFiles from './FullHistoryFiles';
import Meta from './Meta';

/**
 * The FullHistoryResponse model module.
 * @module model/FullHistoryResponse
 */
class FullHistoryResponse {
    /**
     * Constructs a new <code>FullHistoryResponse</code>.
     * Returns History Response
     * @alias module:model/FullHistoryResponse
     */
    constructor() { 
        
        FullHistoryResponse.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>FullHistoryResponse</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/FullHistoryResponse} obj Optional instance to populate.
     * @return {module:model/FullHistoryResponse} The populated <code>FullHistoryResponse</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new FullHistoryResponse();

            if (data.hasOwnProperty('data')) {
                obj['data'] = ApiClient.convertToType(data['data'], [FullHistoryFiles]);
            }
            if (data.hasOwnProperty('meta')) {
                obj['meta'] = Meta.constructFromObject(data['meta']);
            }
        }
        return obj;
    }


}

/**
 * Returns History Response
 * @member {Array.<module:model/FullHistoryFiles>} data
 */
FullHistoryResponse.prototype['data'] = undefined;

/**
 * @member {module:model/Meta} meta
 */
FullHistoryResponse.prototype['meta'] = undefined;






export default FullHistoryResponse;

