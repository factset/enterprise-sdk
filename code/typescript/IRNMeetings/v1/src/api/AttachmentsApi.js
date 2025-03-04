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
     * Create an attachment for a existing meeting
     * Create an attachment for a existing meeting by providing the meeting id and atatchment details.
     * @param {String} meetingId Meeting Id
     * @param {File} file 
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with an object containing data of type {@link module:model/NewItemDto} and HTTP response
     */
    createAttachmentWithHttpInfo(meetingId, file) {
      let postBody = null;
      // verify the required parameter 'meetingId' is set
      if (meetingId === undefined || meetingId === null) {
        throw new Error("Missing the required parameter 'meetingId' when calling createAttachment");
      }
      // verify the required parameter 'file' is set
      if (file === undefined || file === null) {
        throw new Error("Missing the required parameter 'file' when calling createAttachment");
      }

      let pathParams = {
        'meetingId': meetingId
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
        '/meetings/{meetingId}/attachments', 'POST',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, null
      );
    }

    /**
     * Create an attachment for a existing meeting
     * Create an attachment for a existing meeting by providing the meeting id and atatchment details.
     * @param {String} meetingId Meeting Id
     * @param {File} file 
     * @return { Promise.< module:model/NewItemDto > } a Promise, with data of type {@link module:model/NewItemDto }
     */
    createAttachment(meetingId, file) {
      return this.createAttachmentWithHttpInfo(meetingId, file)
        .then(function(response_and_data) {
          return response_and_data.data;
        });
    }


    /**
     * Download an attachment from a Meeting
     * Download an attachment from a Meeting by providing the meeting id and attachment id.
     * @param {String} meetingId Meeting Id
     * @param {String} attachmentId Attachment Id
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with an object containing data of type {@link File} and HTTP response
     */
    downloadAttachmentWithHttpInfo(meetingId, attachmentId) {
      let postBody = null;
      // verify the required parameter 'meetingId' is set
      if (meetingId === undefined || meetingId === null) {
        throw new Error("Missing the required parameter 'meetingId' when calling downloadAttachment");
      }
      // verify the required parameter 'attachmentId' is set
      if (attachmentId === undefined || attachmentId === null) {
        throw new Error("Missing the required parameter 'attachmentId' when calling downloadAttachment");
      }

      let pathParams = {
        'meetingId': meetingId,
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
        '/meetings/{meetingId}/attachments/{attachmentId}/download', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, null
      );
    }

    /**
     * Download an attachment from a Meeting
     * Download an attachment from a Meeting by providing the meeting id and attachment id.
     * @param {String} meetingId Meeting Id
     * @param {String} attachmentId Attachment Id
     * @return { Promise.< File > } a Promise, with data of type {@link File }
     */
    downloadAttachment(meetingId, attachmentId) {
      return this.downloadAttachmentWithHttpInfo(meetingId, attachmentId)
        .then(function(response_and_data) {
          return response_and_data.data;
        });
    }


    /**
     * Get all the attachments belonging to a meeting
     * Get all the attachments belonging to a meeting by providing the meeting id.
     * @param {String} meetingId Meeting Id
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with an object containing data of type {@link Array.<module:model/AttachmentSummaryDto>} and HTTP response
     */
    getAttachmentsWithHttpInfo(meetingId) {
      let postBody = null;
      // verify the required parameter 'meetingId' is set
      if (meetingId === undefined || meetingId === null) {
        throw new Error("Missing the required parameter 'meetingId' when calling getAttachments");
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


      let returnType = [AttachmentSummaryDto];

      return this.apiClient.callApi(
        '/meetings/{meetingId}/attachments', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, null
      );
    }

    /**
     * Get all the attachments belonging to a meeting
     * Get all the attachments belonging to a meeting by providing the meeting id.
     * @param {String} meetingId Meeting Id
     * @return { Promise.< Array.<module:model/AttachmentSummaryDto> > } a Promise, with data of type {@link Array.<module:model/AttachmentSummaryDto> }
     */
    getAttachments(meetingId) {
      return this.getAttachmentsWithHttpInfo(meetingId)
        .then(function(response_and_data) {
          return response_and_data.data;
        });
    }


    /**
     * Delete attachment from meeting
     * Delete a attachment from a meeting by providing the meeting id and attachment id.
     * @param {String} meetingId Meeting Id
     * @param {String} attachmentId Attachment Id
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with an object containing HTTP response
     */
    softDeleteMeetingAttachmentWithHttpInfo(meetingId, attachmentId) {
      let postBody = null;
      // verify the required parameter 'meetingId' is set
      if (meetingId === undefined || meetingId === null) {
        throw new Error("Missing the required parameter 'meetingId' when calling softDeleteMeetingAttachment");
      }
      // verify the required parameter 'attachmentId' is set
      if (attachmentId === undefined || attachmentId === null) {
        throw new Error("Missing the required parameter 'attachmentId' when calling softDeleteMeetingAttachment");
      }

      let pathParams = {
        'meetingId': meetingId,
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
        '/meetings/{meetingId}/attachments/{attachmentId}', 'DELETE',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, null
      );
    }

    /**
     * Delete attachment from meeting
     * Delete a attachment from a meeting by providing the meeting id and attachment id.
     * @param {String} meetingId Meeting Id
     * @param {String} attachmentId Attachment Id
     * @return { Promise } a Promise
     */
    softDeleteMeetingAttachment(meetingId, attachmentId) {
      return this.softDeleteMeetingAttachmentWithHttpInfo(meetingId, attachmentId)
        .then(function(response_and_data) {
          return response_and_data.data;
        });
    }


}





