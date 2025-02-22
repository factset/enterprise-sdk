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
import MeetingEventDto from '../model/MeetingEventDto';
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
     * Get all the record events that belong to a meeting
     * Get all the record events that belong to a meeting by providing the meeting id.
     * @param {String} meetingId Meeting ID
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with an object containing data of type {@link Array.<module:model/RecordEventSummaryDto>} and HTTP response
     */
    getEventsWithHttpInfo(meetingId) {
      let postBody = null;
      // verify the required parameter 'meetingId' is set
      if (meetingId === undefined || meetingId === null) {
        throw new Error("Missing the required parameter 'meetingId' when calling getEvents");
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


      let returnType = [RecordEventSummaryDto];

      return this.apiClient.callApi(
        '/meetings/{meetingId}/events', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, null
      );
    }

    /**
     * Get all the record events that belong to a meeting
     * Get all the record events that belong to a meeting by providing the meeting id.
     * @param {String} meetingId Meeting ID
     * @return { Promise.< Array.<module:model/RecordEventSummaryDto> > } a Promise, with data of type {@link Array.<module:model/RecordEventSummaryDto> }
     */
    getEvents(meetingId) {
      return this.getEventsWithHttpInfo(meetingId)
        .then(function(response_and_data) {
          return response_and_data.data;
        });
    }


    /**
     * Get details of a record event of a meeting
     * Get details of record event of meeting by providing recordeventid and meetingid
     * @param {String} meetingId Meeting Id
     * @param {String} recordEventId Record Event Id
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with an object containing data of type {@link module:model/MeetingEventDto} and HTTP response
     */
    getRecordEventWithHttpInfo(meetingId, recordEventId) {
      let postBody = null;
      // verify the required parameter 'meetingId' is set
      if (meetingId === undefined || meetingId === null) {
        throw new Error("Missing the required parameter 'meetingId' when calling getRecordEvent");
      }
      // verify the required parameter 'recordEventId' is set
      if (recordEventId === undefined || recordEventId === null) {
        throw new Error("Missing the required parameter 'recordEventId' when calling getRecordEvent");
      }

      let pathParams = {
        'meetingId': meetingId,
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


      let returnType = MeetingEventDto;

      return this.apiClient.callApi(
        '/meetings/{meetingId}/events/{recordEventId}', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, null
      );
    }

    /**
     * Get details of a record event of a meeting
     * Get details of record event of meeting by providing recordeventid and meetingid
     * @param {String} meetingId Meeting Id
     * @param {String} recordEventId Record Event Id
     * @return { Promise.< module:model/MeetingEventDto > } a Promise, with data of type {@link module:model/MeetingEventDto }
     */
    getRecordEvent(meetingId, recordEventId) {
      return this.getRecordEventWithHttpInfo(meetingId, recordEventId)
        .then(function(response_and_data) {
          return response_and_data.data;
        });
    }


}





