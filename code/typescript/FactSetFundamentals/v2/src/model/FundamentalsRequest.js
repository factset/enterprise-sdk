/**
 * FactSet Fundamentals API
 * Gain access to current, comprehensive, and comparative information on securities in worldwide developed and emerging markets. Composed of annual and interim/quarterly data, detailed historical financial statement content, per-share data, and calculated ratios, FactSet Fundamentals provides you with the information you need for a global investment perspective.<p>This API is rate-limited to 10 requests per second and 10 concurrent requests per user.</p> 
 *
 * The version of the OpenAPI document: 2.2.0
 * Contact: api@factset.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 *
 */

import ApiClient from '../ApiClient';
import FundamentalRequestBody from './FundamentalRequestBody';

/**
 * The FundamentalsRequest model module.
 * @module model/FundamentalsRequest
 */
class FundamentalsRequest {
    /**
     * Constructs a new <code>FundamentalsRequest</code>.
     * Fundamentals request body elements
     * @alias module:model/FundamentalsRequest
     * @param data {module:model/FundamentalRequestBody} 
     */
    constructor(data) { 
        
        FundamentalsRequest.initialize(this, data);
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
     * Constructs a <code>FundamentalsRequest</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/FundamentalsRequest} obj Optional instance to populate.
     * @return {module:model/FundamentalsRequest} The populated <code>FundamentalsRequest</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new FundamentalsRequest();

            if (data.hasOwnProperty('data')) {
                obj['data'] = FundamentalRequestBody.constructFromObject(data['data']);
            }
        }
        return obj;
    }


}

/**
 * @member {module:model/FundamentalRequestBody} data
 */
FundamentalsRequest.prototype['data'] = undefined;






export default FundamentalsRequest;

