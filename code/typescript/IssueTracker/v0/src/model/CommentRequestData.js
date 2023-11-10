/**
 * Issue Tracker API
 * This API is used to file issues
 *
 * The version of the OpenAPI document: 0.0.0
 * Contact: api@factset.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 *
 */

import ApiClient from '../ApiClient';

/**
 * The CommentRequestData model module.
 * @module model/CommentRequestData
 */
class CommentRequestData {
    /**
     * Constructs a new <code>CommentRequestData</code>.
     * @alias module:model/CommentRequestData
     */
    constructor() { 
        
        CommentRequestData.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>CommentRequestData</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/CommentRequestData} obj Optional instance to populate.
     * @return {module:model/CommentRequestData} The populated <code>CommentRequestData</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new CommentRequestData();

            if (data.hasOwnProperty('content')) {
                obj['content'] = ApiClient.convertToType(data['content'], 'String');
            }
        }
        return obj;
    }


}

/**
 * description for comment
 * @member {String} content
 */
CommentRequestData.prototype['content'] = undefined;






export default CommentRequestData;
