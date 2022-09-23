/**
 * CTS Data Dictionary API
 * An API for interacting with CTS Data Dictionary.
 *
 * The version of the OpenAPI document: 0.2
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 *
 */

import ApiClient from '../ApiClient';
import BasicSearchResponseResults from './BasicSearchResponseResults';

/**
 * The BasicSearchResponse model module.
 * @module model/BasicSearchResponse
 */
class BasicSearchResponse {
    /**
     * Constructs a new <code>BasicSearchResponse</code>.
     * @alias module:model/BasicSearchResponse
     */
    constructor() { 
        
        BasicSearchResponse.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>BasicSearchResponse</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/BasicSearchResponse} obj Optional instance to populate.
     * @return {module:model/BasicSearchResponse} The populated <code>BasicSearchResponse</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new BasicSearchResponse();

            if (data.hasOwnProperty('results')) {
                obj['results'] = ApiClient.convertToType(data['results'], [BasicSearchResponseResults]);
            }
        }
        return obj;
    }


}

/**
 * @member {Array.<module:model/BasicSearchResponseResults>} results
 */
BasicSearchResponse.prototype['results'] = undefined;






export default BasicSearchResponse;
