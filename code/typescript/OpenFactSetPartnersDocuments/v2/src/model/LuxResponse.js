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
import Bonds from './Bonds';
import Meta from './Meta';

/**
 * The LuxResponse model module.
 * @module model/LuxResponse
 */
class LuxResponse {
    /**
     * Constructs a new <code>LuxResponse</code>.
     * Returns Bonds Response
     * @alias module:model/LuxResponse
     */
    constructor() { 
        
        LuxResponse.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>LuxResponse</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/LuxResponse} obj Optional instance to populate.
     * @return {module:model/LuxResponse} The populated <code>LuxResponse</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new LuxResponse();

            if (data.hasOwnProperty('data')) {
                obj['data'] = ApiClient.convertToType(data['data'], [Bonds]);
            }
            if (data.hasOwnProperty('meta')) {
                obj['meta'] = Meta.constructFromObject(data['meta']);
            }
        }
        return obj;
    }


}

/**
 * Returns Bonds Response
 * @member {Array.<module:model/Bonds>} data
 */
LuxResponse.prototype['data'] = undefined;

/**
 * @member {module:model/Meta} meta
 */
LuxResponse.prototype['meta'] = undefined;






export default LuxResponse;

