/**
 * Tick History
 * Tick History provides dynamic access to historical tick data for a specific security for specific dates or date range.
 *
 * The version of the OpenAPI document: 2.4.1
 * Contact: api@factset.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 *
 */

import ApiClient from '../ApiClient';
import StatusOne from './StatusOne';

/**
 * The SubmittedResponse model module.
 * @module model/SubmittedResponse
 */
class SubmittedResponse {
    /**
     * Constructs a new <code>SubmittedResponse</code>.
     * Returns Status of the id.
     * @alias module:model/SubmittedResponse
     */
    constructor() { 
        
        SubmittedResponse.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>SubmittedResponse</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/SubmittedResponse} obj Optional instance to populate.
     * @return {module:model/SubmittedResponse} The populated <code>SubmittedResponse</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new SubmittedResponse();

            if (data.hasOwnProperty('data')) {
                obj['data'] = StatusOne.constructFromObject(data['data']);
            }
        }
        return obj;
    }


}

/**
 * @member {module:model/StatusOne} data
 */
SubmittedResponse.prototype['data'] = undefined;






export default SubmittedResponse;

