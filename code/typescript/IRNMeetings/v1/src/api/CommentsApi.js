/**
 * IRN API v1
 * Allows users to extract, create, update and configure IRN data.
 *
 * The version of the OpenAPI document: 1.4.0
 * Contact: api@factset.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 *
 */


import ApiClient from "../ApiClient";
import AttachmentSummaryDto from '../model/AttachmentSummaryDto';
import CommentDto from '../model/CommentDto';
import CommentSummaryDto from '../model/CommentSummaryDto';
import CreateCommentDto from '../model/CreateCommentDto';
import NewItemDto from '../model/NewItemDto';
import Operation from '../model/Operation';
import ProblemDetails from '../model/ProblemDetails';

/**
* Comments service.
* @module api/CommentsApi
*/
export default class CommentsApi {

    /**
    * Constructs a new CommentsApi. 
    * @alias module:api/CommentsApi
    * @class
    * @param {module:ApiClient} [apiClient] Optional API client implementation to use,
    * default to {@link module:ApiClient#instance} if unspecified.
    */
    constructor(apiClient) {
        this.apiClient = apiClient || ApiClient.instance;
    }



    /**
     * Create a comment to a Meeting
     * Create a comment to a Meeting by providing the meeting id and comment details.
     * @param {String} meetingId The meeting Id to which the comment will be added
     * @param {Object} opts Optional parameters
     * @param {module:model/CreateCommentDto} opts.createCommentDto The details of the comment to be created
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with an object containing data of type {@link module:model/NewItemDto} and HTTP response
     */
    createCommentWithHttpInfo(meetingId, opts) {
      opts = opts || {};
      let postBody = opts['createCommentDto'];
      // verify the required parameter 'meetingId' is set
      if (meetingId === undefined || meetingId === null) {
        throw new Error("Missing the required parameter 'meetingId' when calling createComment");
      }

      let pathParams = {
        'meetingId': meetingId
      };
      let queryParams = {
      };
      let headerParams = {
      };
      let formParams = {
      };

      let authNames = ['FactSetApiKey', 'FactSetOAuth2'];
      let contentTypes = ['application/json-patch+json', 'application/json', 'text/json', 'application/_*+json'];
      let accepts = ['application/json'];


      let returnType = NewItemDto;

      return this.apiClient.callApi(
        '/meetings/{meetingId}/comments', 'POST',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, null
      );
    }

    /**
     * Create a comment to a Meeting
     * Create a comment to a Meeting by providing the meeting id and comment details.
     * @param {String} meetingId The meeting Id to which the comment will be added
     * @param {Object} opts Optional parameters
     * @param {module:model/CreateCommentDto} opts.createCommentDto The details of the comment to be created
     * @return { Promise.< module:model/NewItemDto > } a Promise, with data of type {@link module:model/NewItemDto }
     */
    createComment(meetingId, opts) {
      return this.createCommentWithHttpInfo(meetingId, opts)
        .then(function(response_and_data) {
          return response_and_data.data;
        });
    }


    /**
     * Create a comment attachment to a Meeting
     * Create a attachment on a comment of a Meeting by providing the meeting id and comment id and attachment details.
     * @param {String} meetingId Meeting Id
     * @param {String} commentId Comment Id
     * @param {File} file 
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with an object containing data of type {@link module:model/NewItemDto} and HTTP response
     */
    createCommentAttachmentWithHttpInfo(meetingId, commentId, file) {
      let postBody = null;
      // verify the required parameter 'meetingId' is set
      if (meetingId === undefined || meetingId === null) {
        throw new Error("Missing the required parameter 'meetingId' when calling createCommentAttachment");
      }
      // verify the required parameter 'commentId' is set
      if (commentId === undefined || commentId === null) {
        throw new Error("Missing the required parameter 'commentId' when calling createCommentAttachment");
      }
      // verify the required parameter 'file' is set
      if (file === undefined || file === null) {
        throw new Error("Missing the required parameter 'file' when calling createCommentAttachment");
      }

      let pathParams = {
        'meetingId': meetingId,
        'commentId': commentId
      };
      let queryParams = {
      };
      let headerParams = {
      };
      let formParams = {
        'file': file
      };

      let authNames = ['FactSetApiKey', 'FactSetOAuth2'];
      let contentTypes = ['multipart/form-data'];
      let accepts = ['application/json'];


      let returnType = NewItemDto;

      return this.apiClient.callApi(
        '/meetings/{meetingId}/comments/{commentId}/attachments', 'POST',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, null
      );
    }

    /**
     * Create a comment attachment to a Meeting
     * Create a attachment on a comment of a Meeting by providing the meeting id and comment id and attachment details.
     * @param {String} meetingId Meeting Id
     * @param {String} commentId Comment Id
     * @param {File} file 
     * @return { Promise.< module:model/NewItemDto > } a Promise, with data of type {@link module:model/NewItemDto }
     */
    createCommentAttachment(meetingId, commentId, file) {
      return this.createCommentAttachmentWithHttpInfo(meetingId, commentId, file)
        .then(function(response_and_data) {
          return response_and_data.data;
        });
    }


    /**
     * Delete a Comment from a Meeting
     * Delete a Comment from a Meeting by providing the meeting id and comment id.
     * @param {String} meetingId Meeting Id
     * @param {String} commentId Comment Id
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with an object containing HTTP response
     */
    deleteCommentWithHttpInfo(meetingId, commentId) {
      let postBody = null;
      // verify the required parameter 'meetingId' is set
      if (meetingId === undefined || meetingId === null) {
        throw new Error("Missing the required parameter 'meetingId' when calling deleteComment");
      }
      // verify the required parameter 'commentId' is set
      if (commentId === undefined || commentId === null) {
        throw new Error("Missing the required parameter 'commentId' when calling deleteComment");
      }

      let pathParams = {
        'meetingId': meetingId,
        'commentId': commentId
      };
      let queryParams = {
      };
      let headerParams = {
      };
      let formParams = {
      };

      let authNames = ['FactSetApiKey', 'FactSetOAuth2'];
      let contentTypes = [];
      let accepts = ['application/json'];


      let returnType = null;

      return this.apiClient.callApi(
        '/meetings/{meetingId}/comments/{commentId}', 'DELETE',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, null
      );
    }

    /**
     * Delete a Comment from a Meeting
     * Delete a Comment from a Meeting by providing the meeting id and comment id.
     * @param {String} meetingId Meeting Id
     * @param {String} commentId Comment Id
     * @return { Promise } a Promise
     */
    deleteComment(meetingId, commentId) {
      return this.deleteCommentWithHttpInfo(meetingId, commentId)
        .then(function(response_and_data) {
          return response_and_data.data;
        });
    }


    /**
     * Download single attachment detail of a comment belonging to a meeting
     * Download single attachment detail of a comment belonging to a meeting by providing the meeting id, comment id and attachment id.
     * @param {String} meetingId Meeting Id
     * @param {String} commentId Comment Id
     * @param {String} attachmentId Attachment Id
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with an object containing data of type {@link File} and HTTP response
     */
    downloadCommentAttachmentForCommentWithHttpInfo(meetingId, commentId, attachmentId) {
      let postBody = null;
      // verify the required parameter 'meetingId' is set
      if (meetingId === undefined || meetingId === null) {
        throw new Error("Missing the required parameter 'meetingId' when calling downloadCommentAttachmentForComment");
      }
      // verify the required parameter 'commentId' is set
      if (commentId === undefined || commentId === null) {
        throw new Error("Missing the required parameter 'commentId' when calling downloadCommentAttachmentForComment");
      }
      // verify the required parameter 'attachmentId' is set
      if (attachmentId === undefined || attachmentId === null) {
        throw new Error("Missing the required parameter 'attachmentId' when calling downloadCommentAttachmentForComment");
      }

      let pathParams = {
        'meetingId': meetingId,
        'commentId': commentId,
        'attachmentId': attachmentId
      };
      let queryParams = {
      };
      let headerParams = {
      };
      let formParams = {
      };

      let authNames = ['FactSetApiKey', 'FactSetOAuth2'];
      let contentTypes = [];
      let accepts = ['application/octet-stream', 'application/json'];


      let returnType = File;

      return this.apiClient.callApi(
        '/meetings/{meetingId}/comments/{commentId}/attachments/{attachmentId}/download', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, null
      );
    }

    /**
     * Download single attachment detail of a comment belonging to a meeting
     * Download single attachment detail of a comment belonging to a meeting by providing the meeting id, comment id and attachment id.
     * @param {String} meetingId Meeting Id
     * @param {String} commentId Comment Id
     * @param {String} attachmentId Attachment Id
     * @return { Promise.< File > } a Promise, with data of type {@link File }
     */
    downloadCommentAttachmentForComment(meetingId, commentId, attachmentId) {
      return this.downloadCommentAttachmentForCommentWithHttpInfo(meetingId, commentId, attachmentId)
        .then(function(response_and_data) {
          return response_and_data.data;
        });
    }


    /**
     * Get details of a comment belonging to a meeting
     * Get details of a comment belonging to a meeting by providing the meeting id and comment id.
     * @param {String} meetingId Meeting Id
     * @param {String} commentId Comment Id
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with an object containing data of type {@link module:model/CommentDto} and HTTP response
     */
    getCommentWithHttpInfo(meetingId, commentId) {
      let postBody = null;
      // verify the required parameter 'meetingId' is set
      if (meetingId === undefined || meetingId === null) {
        throw new Error("Missing the required parameter 'meetingId' when calling getComment");
      }
      // verify the required parameter 'commentId' is set
      if (commentId === undefined || commentId === null) {
        throw new Error("Missing the required parameter 'commentId' when calling getComment");
      }

      let pathParams = {
        'meetingId': meetingId,
        'commentId': commentId
      };
      let queryParams = {
      };
      let headerParams = {
      };
      let formParams = {
      };

      let authNames = ['FactSetApiKey', 'FactSetOAuth2'];
      let contentTypes = [];
      let accepts = ['application/json'];


      let returnType = CommentDto;

      return this.apiClient.callApi(
        '/meetings/{meetingId}/comments/{commentId}', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, null
      );
    }

    /**
     * Get details of a comment belonging to a meeting
     * Get details of a comment belonging to a meeting by providing the meeting id and comment id.
     * @param {String} meetingId Meeting Id
     * @param {String} commentId Comment Id
     * @return { Promise.< module:model/CommentDto > } a Promise, with data of type {@link module:model/CommentDto }
     */
    getComment(meetingId, commentId) {
      return this.getCommentWithHttpInfo(meetingId, commentId)
        .then(function(response_and_data) {
          return response_and_data.data;
        });
    }


    /**
     * Get attachments summary of a comment belonging to a meeting
     * Get attachments summary of a comment belonging to a meeting by providing the meeting id and comment id.
     * @param {String} meetingId Meeting Id
     * @param {String} commentId Comment Id
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with an object containing data of type {@link Array.<module:model/AttachmentSummaryDto>} and HTTP response
     */
    getCommentAttachmentsWithHttpInfo(meetingId, commentId) {
      let postBody = null;
      // verify the required parameter 'meetingId' is set
      if (meetingId === undefined || meetingId === null) {
        throw new Error("Missing the required parameter 'meetingId' when calling getCommentAttachments");
      }
      // verify the required parameter 'commentId' is set
      if (commentId === undefined || commentId === null) {
        throw new Error("Missing the required parameter 'commentId' when calling getCommentAttachments");
      }

      let pathParams = {
        'meetingId': meetingId,
        'commentId': commentId
      };
      let queryParams = {
      };
      let headerParams = {
      };
      let formParams = {
      };

      let authNames = ['FactSetApiKey', 'FactSetOAuth2'];
      let contentTypes = [];
      let accepts = ['application/json'];


      let returnType = [AttachmentSummaryDto];

      return this.apiClient.callApi(
        '/meetings/{meetingId}/comments/{commentId}/attachments', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, null
      );
    }

    /**
     * Get attachments summary of a comment belonging to a meeting
     * Get attachments summary of a comment belonging to a meeting by providing the meeting id and comment id.
     * @param {String} meetingId Meeting Id
     * @param {String} commentId Comment Id
     * @return { Promise.< Array.<module:model/AttachmentSummaryDto> > } a Promise, with data of type {@link Array.<module:model/AttachmentSummaryDto> }
     */
    getCommentAttachments(meetingId, commentId) {
      return this.getCommentAttachmentsWithHttpInfo(meetingId, commentId)
        .then(function(response_and_data) {
          return response_and_data.data;
        });
    }


    /**
     * Get all comments for a meeting
     * Get all comments for a meeting by providing the meeting id.
     * @param {String} meetingId Meeting Id
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with an object containing data of type {@link Array.<module:model/CommentSummaryDto>} and HTTP response
     */
    getCommentsWithHttpInfo(meetingId) {
      let postBody = null;
      // verify the required parameter 'meetingId' is set
      if (meetingId === undefined || meetingId === null) {
        throw new Error("Missing the required parameter 'meetingId' when calling getComments");
      }

      let pathParams = {
        'meetingId': meetingId
      };
      let queryParams = {
      };
      let headerParams = {
      };
      let formParams = {
      };

      let authNames = ['FactSetApiKey', 'FactSetOAuth2'];
      let contentTypes = [];
      let accepts = ['application/json'];


      let returnType = [CommentSummaryDto];

      return this.apiClient.callApi(
        '/meetings/{meetingId}/comments', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, null
      );
    }

    /**
     * Get all comments for a meeting
     * Get all comments for a meeting by providing the meeting id.
     * @param {String} meetingId Meeting Id
     * @return { Promise.< Array.<module:model/CommentSummaryDto> > } a Promise, with data of type {@link Array.<module:model/CommentSummaryDto> }
     */
    getComments(meetingId) {
      return this.getCommentsWithHttpInfo(meetingId)
        .then(function(response_and_data) {
          return response_and_data.data;
        });
    }


    /**
     * Edit a comment for a meeting
     * Edit a comment for a meeting by providing the meeting id and comment id.
     * @param {String} meetingId Meeting Id
     * @param {String} commentId Comment Id
     * @param {Object} opts Optional parameters
     * @param {Array.<module:model/Operation>} opts.operation The JSON patch document with updates for the comment
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with an object containing HTTP response
     */
    patchCommentWithHttpInfo(meetingId, commentId, opts) {
      opts = opts || {};
      let postBody = opts['operation'];
      // verify the required parameter 'meetingId' is set
      if (meetingId === undefined || meetingId === null) {
        throw new Error("Missing the required parameter 'meetingId' when calling patchComment");
      }
      // verify the required parameter 'commentId' is set
      if (commentId === undefined || commentId === null) {
        throw new Error("Missing the required parameter 'commentId' when calling patchComment");
      }

      let pathParams = {
        'meetingId': meetingId,
        'commentId': commentId
      };
      let queryParams = {
      };
      let headerParams = {
      };
      let formParams = {
      };

      let authNames = ['FactSetApiKey', 'FactSetOAuth2'];
      let contentTypes = ['application/json-patch+json', 'application/json', 'text/json', 'application/_*+json'];
      let accepts = ['application/json'];


      let returnType = null;

      return this.apiClient.callApi(
        '/meetings/{meetingId}/comments/{commentId}', 'PATCH',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, null
      );
    }

    /**
     * Edit a comment for a meeting
     * Edit a comment for a meeting by providing the meeting id and comment id.
     * @param {String} meetingId Meeting Id
     * @param {String} commentId Comment Id
     * @param {Object} opts Optional parameters
     * @param {Array.<module:model/Operation>} opts.operation The JSON patch document with updates for the comment
     * @return { Promise } a Promise
     */
    patchComment(meetingId, commentId, opts) {
      return this.patchCommentWithHttpInfo(meetingId, commentId, opts)
        .then(function(response_and_data) {
          return response_and_data.data;
        });
    }


}





