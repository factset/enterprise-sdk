/**
 * Issue Tracker API
 * This API is used to file issues
 *
 * The version of the OpenAPI document: 1.0.0
 * Contact: api@factset.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 *
 */

import ApiClient from '../ApiClient';

/**
 * The Comment model module.
 * @module model/Comment
 */
class Comment {
    /**
     * Constructs a new <code>Comment</code>.
     * @alias module:model/Comment
     */
    constructor() { 
        
        Comment.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>Comment</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/Comment} obj Optional instance to populate.
     * @return {module:model/Comment} The populated <code>Comment</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new Comment();

            if (data.hasOwnProperty('id')) {
                obj['id'] = ApiClient.convertToType(data['id'], 'String');
            }
            if (data.hasOwnProperty('content')) {
                obj['content'] = ApiClient.convertToType(data['content'], 'String');
            }
            if (data.hasOwnProperty('createdAt')) {
                obj['createdAt'] = ApiClient.convertToType(data['createdAt'], 'Date');
            }
            if (data.hasOwnProperty('author')) {
                obj['author'] = ApiClient.convertToType(data['author'], 'String');
            }
        }
        return obj;
    }


}

/**
 * generated comment id
 * @member {String} id
 */
Comment.prototype['id'] = undefined;

/**
 * cotent of comment
 * @member {String} content
 */
Comment.prototype['content'] = undefined;

/**
 * comment creation time
 * @member {Date} createdAt
 */
Comment.prototype['createdAt'] = undefined;

/**
 * author of the comment.
 * @member {String} author
 */
Comment.prototype['author'] = undefined;






export default Comment;

