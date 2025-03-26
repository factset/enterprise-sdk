/**
 * Tick History
 * Tick History provides dynamic access to historical tick data for a specific security for specific dates or date range.
 *
 * The version of the OpenAPI document: 2.4.0
 * Contact: api@factset.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 *
 */

import ApiClient from '../ApiClient';
import CheckFiles from './CheckFiles';

/**
 * The CompletedResponse model module.
 * @module model/CompletedResponse
 */
class CompletedResponse {
    /**
     * Constructs a new <code>CompletedResponse</code>.
     * Returns status.
     * @alias module:model/CompletedResponse
     */
    constructor() { 
        
        CompletedResponse.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>CompletedResponse</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/CompletedResponse} obj Optional instance to populate.
     * @return {module:model/CompletedResponse} The populated <code>CompletedResponse</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new CompletedResponse();

            if (data.hasOwnProperty('data')) {
                obj['data'] = CheckFiles.constructFromObject(data['data']);
            }
        }
        return obj;
    }


}

/**
 * @member {module:model/CheckFiles} data
 */
CompletedResponse.prototype['data'] = undefined;






export default CompletedResponse;

