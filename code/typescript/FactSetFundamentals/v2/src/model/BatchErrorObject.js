/**
 * FactSet Fundamentals API
 * Gain access to current, comprehensive, and comparative information on securities in worldwide developed and emerging markets. Composed of annual and interim/quarterly data, detailed historical financial statement content, per-share data, and calculated ratios, FactSet Fundamentals provides you with the information you need for a global investment perspective.<p>This API is rate-limited to 10 requests per second and 10 concurrent requests per user.</p> 
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

/**
 * The BatchErrorObject model module.
 * @module model/BatchErrorObject
 */
class BatchErrorObject {
    /**
     * Constructs a new <code>BatchErrorObject</code>.
     * @alias module:model/BatchErrorObject
     */
    constructor() { 
        
        BatchErrorObject.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>BatchErrorObject</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/BatchErrorObject} obj Optional instance to populate.
     * @return {module:model/BatchErrorObject} The populated <code>BatchErrorObject</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new BatchErrorObject();

            if (data.hasOwnProperty('id')) {
                obj['id'] = ApiClient.convertToType(data['id'], 'String');
            }
            if (data.hasOwnProperty('code')) {
                obj['code'] = ApiClient.convertToType(data['code'], 'String');
            }
            if (data.hasOwnProperty('title')) {
                obj['title'] = ApiClient.convertToType(data['title'], 'String');
            }
        }
        return obj;
    }


}

/**
 * A UUID for this particular occurrence of the problem.
 * @member {String} id
 */
BatchErrorObject.prototype['id'] = undefined;

/**
 * status
 * @member {String} code
 */
BatchErrorObject.prototype['code'] = undefined;

/**
 * The plain text error message
 * @member {String} title
 */
BatchErrorObject.prototype['title'] = undefined;






export default BatchErrorObject;

