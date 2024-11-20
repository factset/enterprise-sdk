/**
 * Security Explanation API
 * Allow clients to use Security Explanation through APIs.
 *
 * The version of the OpenAPI document: 0.1.0
 * Contact: api@factset.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 *
 */

import ApiClient from '../ApiClient';
import SecurityExplanationResponse from './SecurityExplanationResponse';

/**
 * The SecurityExplanationResponseRoot model module.
 * @module model/SecurityExplanationResponseRoot
 */
class SecurityExplanationResponseRoot {
    /**
     * Constructs a new <code>SecurityExplanationResponseRoot</code>.
     * @alias module:model/SecurityExplanationResponseRoot
     * @param data {module:model/SecurityExplanationResponse} 
     */
    constructor(data) { 
        
        SecurityExplanationResponseRoot.initialize(this, data);
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
     * Constructs a <code>SecurityExplanationResponseRoot</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/SecurityExplanationResponseRoot} obj Optional instance to populate.
     * @return {module:model/SecurityExplanationResponseRoot} The populated <code>SecurityExplanationResponseRoot</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new SecurityExplanationResponseRoot();

            if (data.hasOwnProperty('data')) {
                obj['data'] = SecurityExplanationResponse.constructFromObject(data['data']);
            }
            if (data.hasOwnProperty('meta')) {
                obj['meta'] = ApiClient.convertToType(data['meta'], Object);
            }
        }
        return obj;
    }


}

/**
 * @member {module:model/SecurityExplanationResponse} data
 */
SecurityExplanationResponseRoot.prototype['data'] = undefined;

/**
 * @member {Object} meta
 */
SecurityExplanationResponseRoot.prototype['meta'] = undefined;






export default SecurityExplanationResponseRoot;

