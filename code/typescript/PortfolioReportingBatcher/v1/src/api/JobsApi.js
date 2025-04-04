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
import JobDetailsResponse from '../model/JobDetailsResponse';
import JobListResponse from '../model/JobListResponse';
import JobTypes from '../model/JobTypes';

/**
* Jobs service.
* @module api/JobsApi
*/
export default class JobsApi {

    /**
    * Constructs a new JobsApi. 
    * @alias module:api/JobsApi
    * @class
    * @param {module:ApiClient} [apiClient] Optional API client implementation to use,
    * default to {@link module:ApiClient#instance} if unspecified.
    */
    constructor(apiClient) {
        this.apiClient = apiClient || ApiClient.instance;
    }



    /**
     * Get details for the given PRB job
     * Use this endpoint to fetch the documents, tasks, accounts, and/or runs for the PRB job given in the path. Please note jobs with type PD will not return tasks nor accounts so this will be ignored if given as part of the array of attributes in the request.
     * @param {module:model/JobTypes} type The jobs type
     * @param {String} name The jobs name
     * @param {Object} opts Optional parameters
     * @param {Array.<module:model/String>} opts.attribute The attribute parameter accepts a list of the given enums, separated by commas. Each of them returns the respective data associated with the job. Runs returns the run history of the job.
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with an object containing data of type {@link module:model/JobDetailsResponse} and HTTP response
     */
    v1GetDetailsForJobWithHttpInfo(type, name, opts) {
      opts = opts || {};
      let postBody = null;
      // verify the required parameter 'type' is set
      if (type === undefined || type === null) {
        throw new Error("Missing the required parameter 'type' when calling v1GetDetailsForJob");
      }
      // verify the required parameter 'name' is set
      if (name === undefined || name === null) {
        throw new Error("Missing the required parameter 'name' when calling v1GetDetailsForJob");
      }

      let pathParams = {
        'type': type,
        'name': name
      };
      let queryParams = {
        'attribute': this.apiClient.buildCollectionParam(opts['attribute'], 'csv')
      };
      let headerParams = {
      };
      let formParams = {
      };

      let authNames = ['FactSetApiKey', 'FactSetOAuth2'];
      let contentTypes = [];
      let accepts = ['application/json'];


      let returnType = JobDetailsResponse;

      return this.apiClient.callApi(
        '/jobs/{type}/{name}', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, null
      );
    }

    /**
     * Get details for the given PRB job
     * Use this endpoint to fetch the documents, tasks, accounts, and/or runs for the PRB job given in the path. Please note jobs with type PD will not return tasks nor accounts so this will be ignored if given as part of the array of attributes in the request.
     * @param {module:model/JobTypes} type The jobs type
     * @param {String} name The jobs name
     * @param {Object} opts Optional parameters
     * @param {Array.<module:model/String>} opts.attribute The attribute parameter accepts a list of the given enums, separated by commas. Each of them returns the respective data associated with the job. Runs returns the run history of the job.
     * @return { Promise.< module:model/JobDetailsResponse > } a Promise, with data of type {@link module:model/JobDetailsResponse }
     */
    v1GetDetailsForJob(type, name, opts) {
      return this.v1GetDetailsForJobWithHttpInfo(type, name, opts)
        .then(function(response_and_data) {
          return response_and_data.data;
        });
    }


    /**
     * Get a list of existing jobs
     * Use this endpoint with the optional 'type' or 'name' filters to get a list of PRB jobs. 
     * @param {Object} opts Optional parameters
     * @param {module:model/JobTypes} opts.type The job type
     * @param {String} opts.name The job name
     * @param {Number} opts.paginationOffset The number of jobs to skip (please note the jobs are ordered by last modified in descending order, i.e. most recently modified will show on the
     * @param {Number} opts.paginationLimit The number of jobs to bring back (maximum 50)
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with an object containing data of type {@link module:model/JobListResponse} and HTTP response
     */
    v1GetPrbJobsWithHttpInfo(opts) {
      opts = opts || {};
      let postBody = null;

      let pathParams = {
      };
      let queryParams = {
        'type': opts['type'],
        'name': opts['name'],
        '_paginationOffset': opts['paginationOffset'],
        '_paginationLimit': opts['paginationLimit']
      };
      let headerParams = {
      };
      let formParams = {
      };

      let authNames = ['FactSetApiKey', 'FactSetOAuth2'];
      let contentTypes = [];
      let accepts = ['application/json'];


      let returnType = JobListResponse;

      return this.apiClient.callApi(
        '/jobs', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, null
      );
    }

    /**
     * Get a list of existing jobs
     * Use this endpoint with the optional 'type' or 'name' filters to get a list of PRB jobs. 
     * @param {Object} opts Optional parameters
     * @param {module:model/JobTypes} opts.type The job type
     * @param {String} opts.name The job name
     * @param {Number} opts.paginationOffset The number of jobs to skip (please note the jobs are ordered by last modified in descending order, i.e. most recently modified will show on the
     * @param {Number} opts.paginationLimit The number of jobs to bring back (maximum 50)
     * @return { Promise.< module:model/JobListResponse > } a Promise, with data of type {@link module:model/JobListResponse }
     */
    v1GetPrbJobs(opts) {
      return this.v1GetPrbJobsWithHttpInfo(opts)
        .then(function(response_and_data) {
          return response_and_data.data;
        });
    }


}





