/**
 * Portfolio Reporting Batcher
 * The Portfolio Reporting Batcher (PRB) API allows clients to systematically leverage functionalities of the PRB application.
 *
 * The version of the OpenAPI document: 1.0.0
 * Contact: api@factset.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 *
 */


import ApiClient from "../ApiClient";
import ClientErrorResponse from '../model/ClientErrorResponse';
import IdStatus from '../model/IdStatus';
import StartJobRoot from '../model/StartJobRoot';
import StartJobRunResponse from '../model/StartJobRunResponse';

/**
* Runs service.
* @module api/RunsApi
*/
export default class RunsApi {

    /**
    * Constructs a new RunsApi. 
    * @alias module:api/RunsApi
    * @class
    * @param {module:ApiClient} [apiClient] Optional API client implementation to use,
    * default to {@link module:ApiClient#instance} if unspecified.
    */
    constructor(apiClient) {
        this.apiClient = apiClient || ApiClient.instance;
    }



    /**
     * cancel runs
     * Use this endpoint with the DELETE method to cancel a specific run
     * @param {String} id 
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with an object containing HTTP response
     */
    v1CancelRunIdWithHttpInfo(id) {
      let postBody = null;
      // verify the required parameter 'id' is set
      if (id === undefined || id === null) {
        throw new Error("Missing the required parameter 'id' when calling v1CancelRunId");
      }

      let pathParams = {
        'id': id
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
        '/runs/{id}', 'DELETE',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, null
      );
    }

    /**
     * cancel runs
     * Use this endpoint with the DELETE method to cancel a specific run
     * @param {String} id 
     * @return { Promise } a Promise
     */
    v1CancelRunId(id) {
      return this.v1CancelRunIdWithHttpInfo(id)
        .then(function(response_and_data) {
          return response_and_data.data;
        });
    }


    /**
     * check the status for a particular run ID
     * Use this endpoint to check the status of a run using the id from the POST /runs endpoint
     * @param {String} id run id
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with an object containing data of type {@link module:model/IdStatus} and HTTP response
     */
    v1CheckRunStatusWithHttpInfo(id) {
      let postBody = null;
      // verify the required parameter 'id' is set
      if (id === undefined || id === null) {
        throw new Error("Missing the required parameter 'id' when calling v1CheckRunStatus");
      }

      let pathParams = {
        'id': id
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


      let returnType = IdStatus;

      return this.apiClient.callApi(
        '/runs/{id}/status', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, null
      );
    }

    /**
     * check the status for a particular run ID
     * Use this endpoint to check the status of a run using the id from the POST /runs endpoint
     * @param {String} id run id
     * @return { Promise.< module:model/IdStatus > } a Promise, with data of type {@link module:model/IdStatus }
     */
    v1CheckRunStatus(id) {
      return this.v1CheckRunStatusWithHttpInfo(id)
        .then(function(response_and_data) {
          return response_and_data.data;
        });
    }


    /**
     * trigger PRB jobs
     * Use this endpoint with with POST method to trigger PRB jobs.
     * @param {Object} opts Optional parameters
     * @param {module:model/StartJobRoot} opts.startJobRoot The main object in the request body contains details for the job to be triggered. The \"name\" and \"type\" fields will uniquely identify the job and both must be provided. Other fields can be provided depending on the job's type.
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with an object containing data of type {@link module:model/StartJobRunResponse} and HTTP response
     */
    v1StartJobRunWithHttpInfo(opts) {
      opts = opts || {};
      let postBody = opts['startJobRoot'];

      let pathParams = {
      };
      let queryParams = {
      };
      let headerParams = {
      };
      let formParams = {
      };

      let authNames = ['FactSetApiKey', 'FactSetOAuth2'];
      let contentTypes = ['application/json'];
      let accepts = ['application/json'];


      let returnType = StartJobRunResponse;

      return this.apiClient.callApi(
        '/runs', 'POST',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, null
      );
    }

    /**
     * trigger PRB jobs
     * Use this endpoint with with POST method to trigger PRB jobs.
     * @param {Object} opts Optional parameters
     * @param {module:model/StartJobRoot} opts.startJobRoot The main object in the request body contains details for the job to be triggered. The \"name\" and \"type\" fields will uniquely identify the job and both must be provided. Other fields can be provided depending on the job's type.
     * @return { Promise.< module:model/StartJobRunResponse > } a Promise, with data of type {@link module:model/StartJobRunResponse }
     */
    v1StartJobRun(opts) {
      return this.v1StartJobRunWithHttpInfo(opts)
        .then(function(response_and_data) {
          return response_and_data.data;
        });
    }


}





