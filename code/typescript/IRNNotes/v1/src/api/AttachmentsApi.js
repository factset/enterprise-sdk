/**
 * IRN API v1
 * Allows users to extract, create, update and configure IRN data.
 *
 * The version of the OpenAPI document: 1
 * Contact: api@factset.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 *
 */


import ApiClient from "../ApiClient";
import AttachmentSummaryDto from '../model/AttachmentSummaryDto';
import NewItemDto from '../model/NewItemDto';
import ProblemDetails from '../model/ProblemDetails';

/**
* Attachments service.
* @module api/AttachmentsApi
*/
export default class AttachmentsApi {

    /**
    * Constructs a new AttachmentsApi. 
    * @alias module:api/AttachmentsApi
    * @class
    * @param {module:ApiClient} [apiClient] Optional API client implementation to use,
    * default to {@link module:ApiClient#instance} if unspecified.
    */
    constructor(apiClient) {
        this.apiClient = apiClient || ApiClient.instance;
    }



    /**
     * Create an attachment for an existing note
     * @param {String} noteId 
     * @param {File} file 
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with an object containing data of type {@link module:model/NewItemDto} and HTTP response
     */
    createAttachmentWithHttpInfo(noteId, file) {
      let postBody = null;
      // verify the required parameter 'noteId' is set
      if (noteId === undefined || noteId === null) {
        throw new Error("Missing the required parameter 'noteId' when calling createAttachment");
      }
      // verify the required parameter 'file' is set
      if (file === undefined || file === null) {
        throw new Error("Missing the required parameter 'file' when calling createAttachment");
      }

      let pathParams = {
        'noteId': noteId
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
        '/notes/{noteId}/attachments', 'POST',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, null
      );
    }

    /**
     * Create an attachment for an existing note
     * @param {String} noteId 
     * @param {File} file 
     * @return { Promise.< module:model/NewItemDto > } a Promise, with data of type {@link module:model/NewItemDto }
     */
    createAttachment(noteId, file) {
      return this.createAttachmentWithHttpInfo(noteId, file)
        .then(function(response_and_data) {
          return response_and_data.data;
        });
    }


    /**
     * Download an attachment from a Note
     * @param {String} noteId 
     * @param {String} attachmentId 
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with an object containing HTTP response
     */
    downloadAttachmentWithHttpInfo(noteId, attachmentId) {
      let postBody = null;
      // verify the required parameter 'noteId' is set
      if (noteId === undefined || noteId === null) {
        throw new Error("Missing the required parameter 'noteId' when calling downloadAttachment");
      }
      // verify the required parameter 'attachmentId' is set
      if (attachmentId === undefined || attachmentId === null) {
        throw new Error("Missing the required parameter 'attachmentId' when calling downloadAttachment");
      }

      let pathParams = {
        'noteId': noteId,
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
      let accepts = ['application/json'];


      let returnType = null;

      return this.apiClient.callApi(
        '/notes/{noteId}/attachments/{attachmentId}/download', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, null
      );
    }

    /**
     * Download an attachment from a Note
     * @param {String} noteId 
     * @param {String} attachmentId 
     * @return { Promise } a Promise
     */
    downloadAttachment(noteId, attachmentId) {
      return this.downloadAttachmentWithHttpInfo(noteId, attachmentId)
        .then(function(response_and_data) {
          return response_and_data.data;
        });
    }


    /**
     * Get all the attachments belonging to a note
     * @param {String} noteId Note Id
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with an object containing data of type {@link Array.<module:model/AttachmentSummaryDto>} and HTTP response
     */
    getAttachmentsWithHttpInfo(noteId) {
      let postBody = null;
      // verify the required parameter 'noteId' is set
      if (noteId === undefined || noteId === null) {
        throw new Error("Missing the required parameter 'noteId' when calling getAttachments");
      }

      let pathParams = {
        'noteId': noteId
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
        '/notes/{noteId}/attachments', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, null
      );
    }

    /**
     * Get all the attachments belonging to a note
     * @param {String} noteId Note Id
     * @return { Promise.< Array.<module:model/AttachmentSummaryDto> > } a Promise, with data of type {@link Array.<module:model/AttachmentSummaryDto> }
     */
    getAttachments(noteId) {
      return this.getAttachmentsWithHttpInfo(noteId)
        .then(function(response_and_data) {
          return response_and_data.data;
        });
    }


    /**
     * Delete attachment from note
     * @param {String} noteId Note Id
     * @param {String} attachmentId Attachment Id
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with an object containing HTTP response
     */
    softDeleteNoteAttachmentWithHttpInfo(noteId, attachmentId) {
      let postBody = null;
      // verify the required parameter 'noteId' is set
      if (noteId === undefined || noteId === null) {
        throw new Error("Missing the required parameter 'noteId' when calling softDeleteNoteAttachment");
      }
      // verify the required parameter 'attachmentId' is set
      if (attachmentId === undefined || attachmentId === null) {
        throw new Error("Missing the required parameter 'attachmentId' when calling softDeleteNoteAttachment");
      }

      let pathParams = {
        'noteId': noteId,
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
      let accepts = ['application/json'];


      let returnType = null;

      return this.apiClient.callApi(
        '/notes/{noteId}/attachments/{attachmentId}', 'DELETE',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, null
      );
    }

    /**
     * Delete attachment from note
     * @param {String} noteId Note Id
     * @param {String} attachmentId Attachment Id
     * @return { Promise } a Promise
     */
    softDeleteNoteAttachment(noteId, attachmentId) {
      return this.softDeleteNoteAttachmentWithHttpInfo(noteId, attachmentId)
        .then(function(response_and_data) {
          return response_and_data.data;
        });
    }


}





