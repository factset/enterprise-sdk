/**
 * IRN API v1
 * Allows users to extract, create, update and configure IRN data.
 *
 * The version of the OpenAPI document: 1
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 *
 */

import ApiClient from '../ApiClient';
import AttachmentSummaryDto from './AttachmentSummaryDto';
import SubcommentSummaryDto from './SubcommentSummaryDto';

/**
 * The CommentDto model module.
 * @module model/CommentDto
 */
class CommentDto {
    /**
     * Constructs a new <code>CommentDto</code>.
     * @alias module:model/CommentDto
     */
    constructor() { 
        
        CommentDto.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>CommentDto</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/CommentDto} obj Optional instance to populate.
     * @return {module:model/CommentDto} The populated <code>CommentDto</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new CommentDto();

            if (data.hasOwnProperty('Id')) {
                obj['Id'] = ApiClient.convertToType(data['Id'], 'String');
            }
            if (data.hasOwnProperty('AuthorId')) {
                obj['AuthorId'] = ApiClient.convertToType(data['AuthorId'], 'String');
            }
            if (data.hasOwnProperty('ParentCommentId')) {
                obj['ParentCommentId'] = ApiClient.convertToType(data['ParentCommentId'], 'String');
            }
            if (data.hasOwnProperty('Body')) {
                obj['Body'] = ApiClient.convertToType(data['Body'], 'String');
            }
            if (data.hasOwnProperty('CreatedAt')) {
                obj['CreatedAt'] = ApiClient.convertToType(data['CreatedAt'], 'String');
            }
            if (data.hasOwnProperty('Attachments')) {
                obj['Attachments'] = ApiClient.convertToType(data['Attachments'], [AttachmentSummaryDto]);
            }
            if (data.hasOwnProperty('Subcomments')) {
                obj['Subcomments'] = ApiClient.convertToType(data['Subcomments'], [SubcommentSummaryDto]);
            }
        }
        return obj;
    }


}

/**
 * @member {String} Id
 */
CommentDto.prototype['Id'] = undefined;

/**
 * @member {String} AuthorId
 */
CommentDto.prototype['AuthorId'] = undefined;

/**
 * @member {String} ParentCommentId
 */
CommentDto.prototype['ParentCommentId'] = undefined;

/**
 * @member {String} Body
 */
CommentDto.prototype['Body'] = undefined;

/**
 * @member {String} CreatedAt
 */
CommentDto.prototype['CreatedAt'] = undefined;

/**
 * @member {Array.<module:model/AttachmentSummaryDto>} Attachments
 */
CommentDto.prototype['Attachments'] = undefined;

/**
 * @member {Array.<module:model/SubcommentSummaryDto>} Subcomments
 */
CommentDto.prototype['Subcomments'] = undefined;






export default CommentDto;

