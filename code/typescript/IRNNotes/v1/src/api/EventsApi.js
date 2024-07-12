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
import EventSnippetDto from '../model/EventSnippetDto';
import NoteEventDto from '../model/NoteEventDto';
import ProblemDetails from '../model/ProblemDetails';
import RecordEventSummaryDto from '../model/RecordEventSummaryDto';

/**
* Events service.
* @module api/EventsApi
*/
export default class EventsApi {

    /**
    * Constructs a new EventsApi. 
    * @alias module:api/EventsApi
    * @class
    * @param {module:ApiClient} [apiClient] Optional API client implementation to use,
    * default to {@link module:ApiClient#instance} if unspecified.
    */
    constructor(apiClient) {
        this.apiClient = apiClient || ApiClient.instance;
    }



    /**
     * Get all the record events in the specified date range filtered on the given types
     * @param {String} startDate StartDate
     * @param {Object} opts Optional parameters
     * @param {String} opts.endDate EndDate
     * @param {Array.<String>} opts.types Set of event types to filter on
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with an object containing data of type {@link Array.<module:model/EventSnippetDto>} and HTTP response
     */
    getAllEventsWithHttpInfo(startDate, opts) {
      opts = opts || {};
      let postBody = null;
      // verify the required parameter 'startDate' is set
      if (startDate === undefined || startDate === null) {
        throw new Error("Missing the required parameter 'startDate' when calling getAllEvents");
      }

      let pathParams = {
      };
      let queryParams = {
        'startDate': startDate,
        'endDate': opts['endDate'],
        'types': this.apiClient.buildCollectionParam(opts['types'], 'multi')
      };
      let headerParams = {
      };
      let formParams = {
      };

      let authNames = ['FactSetApiKey', 'FactSetOAuth2'];
      let contentTypes = [];
      let accepts = ['text/plain', 'application/json', 'text/json'];


      let returnType = [EventSnippetDto];

      return this.apiClient.callApi(
        '/events', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, null
      );
    }

    /**
     * Get all the record events in the specified date range filtered on the given types
     * @param {String} startDate StartDate
     * @param {Object} opts Optional parameters
     * @param {String} opts.endDate EndDate
     * @param {Array.<String>} opts.types Set of event types to filter on
     * @return { Promise.< Array.<module:model/EventSnippetDto> > } a Promise, with data of type {@link Array.<module:model/EventSnippetDto> }
     */
    getAllEvents(startDate, opts) {
      return this.getAllEventsWithHttpInfo(startDate, opts)
        .then(function(response_and_data) {
          return response_and_data.data;
        });
    }


    /**
     * Get all the record events that belong to a note
     * @param {String} noteId Note Id
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with an object containing data of type {@link Array.<module:model/RecordEventSummaryDto>} and HTTP response
     */
    getEventsWithHttpInfo(noteId) {
      let postBody = null;
      // verify the required parameter 'noteId' is set
      if (noteId === undefined || noteId === null) {
        throw new Error("Missing the required parameter 'noteId' when calling getEvents");
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


      let returnType = [RecordEventSummaryDto];

      return this.apiClient.callApi(
        '/notes/{noteId}/events', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, null
      );
    }

    /**
     * Get all the record events that belong to a note
     * @param {String} noteId Note Id
     * @return { Promise.< Array.<module:model/RecordEventSummaryDto> > } a Promise, with data of type {@link Array.<module:model/RecordEventSummaryDto> }
     */
    getEvents(noteId) {
      return this.getEventsWithHttpInfo(noteId)
        .then(function(response_and_data) {
          return response_and_data.data;
        });
    }


    /**
     * Get details of a record event of a note
     * @param {String} noteId Note Id
     * @param {String} recordEventId Record Event Id
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with an object containing data of type {@link module:model/NoteEventDto} and HTTP response
     */
    getRecordEventWithHttpInfo(noteId, recordEventId) {
      let postBody = null;
      // verify the required parameter 'noteId' is set
      if (noteId === undefined || noteId === null) {
        throw new Error("Missing the required parameter 'noteId' when calling getRecordEvent");
      }
      // verify the required parameter 'recordEventId' is set
      if (recordEventId === undefined || recordEventId === null) {
        throw new Error("Missing the required parameter 'recordEventId' when calling getRecordEvent");
      }

      let pathParams = {
        'noteId': noteId,
        'recordEventId': recordEventId
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


      let returnType = NoteEventDto;

      return this.apiClient.callApi(
        '/notes/{noteId}/events/{recordEventId}', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, null
      );
    }

    /**
     * Get details of a record event of a note
     * @param {String} noteId Note Id
     * @param {String} recordEventId Record Event Id
     * @return { Promise.< module:model/NoteEventDto > } a Promise, with data of type {@link module:model/NoteEventDto }
     */
    getRecordEvent(noteId, recordEventId) {
      return this.getRecordEventWithHttpInfo(noteId, recordEventId)
        .then(function(response_and_data) {
          return response_and_data.data;
        });
    }


}





