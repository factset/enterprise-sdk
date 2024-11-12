/**
 * Office Cloud Refresh API
 * Service for refreshing models with refreshable FactSet objects (e.g., =FDS codes)
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
import Errors from '../model/Errors';
import FileGroupInfo from '../model/FileGroupInfo';
import JobStatus from '../model/JobStatus';

/**
* RefreshOperations service.
* @module api/RefreshOperationsApi
*/
export default class RefreshOperationsApi {

    /**
    * Constructs a new RefreshOperationsApi. 
    * @alias module:api/RefreshOperationsApi
    * @class
    * @param {module:ApiClient} [apiClient] Optional API client implementation to use,
    * default to {@link module:ApiClient#instance} if unspecified.
    */
    constructor(apiClient) {
        this.apiClient = apiClient || ApiClient.instance;
    }



    /**
     * Retrieve a calculated file by resource ID.
     * If the requested job is complete, the calculated file will be returned.
     * @param {String} id Unique identifier for the job (resource ID returned from FactSet).
     * @param {Object} opts Optional parameters
     * @param {Boolean} opts.deleteFile Delete the file from FactSet servers after completing the request. (default to true)
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with an object containing data of type {@link File} and HTTP response
     */
    getFileByIdWithHttpInfo(id, opts) {
      opts = opts || {};
      let postBody = null;
      // verify the required parameter 'id' is set
      if (id === undefined || id === null) {
        throw new Error("Missing the required parameter 'id' when calling getFileById");
      }

      let pathParams = {
        'id': id
      };
      let queryParams = {
        'deleteFile': opts['deleteFile']
      };
      let headerParams = {
      };
      let formParams = {
      };

      let authNames = ['FactSetApiKey', 'FactSetOAuth2'];
      let contentTypes = [];
      let accepts = ['application/vnd.openxmlformats-officedocument.spreadsheetml.sheet', 'application/json'];

      let returnType = GetFileByIdResponseWrapperTypeMap;
      
      return this.apiClient.callApi(
        '/refresh/{id}', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, null
      );
    }

    /**
     * Retrieve a calculated file by resource ID.
     * If the requested job is complete, the calculated file will be returned.
     * @param {String} id Unique identifier for the job (resource ID returned from FactSet).
     * @param {Object} opts Optional parameters
     * @param {Boolean} opts.deleteFile Delete the file from FactSet servers after completing the request. (default to true)
     * @return { Promise.< GetFileByIdResponseWrapper > } a Promise, with data of type {@link GetFileByIdResponseWrapper }
     */
    getFileById(id, opts) {
      return this.getFileByIdWithHttpInfo(id, opts)
        .then(function(response_and_data) {
          return response_and_data.data;
        });
    }


    /**
     * Get the status of the refresh job with the given resource ID
     * Check the status of the given job by the resource ID
     * @param {String} id Unique identifier for the job (resource ID returned from FactSet).
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with an object containing data of type {@link module:model/JobStatus} and HTTP response
     */
    getStatusByIdWithHttpInfo(id) {
      let postBody = null;
      // verify the required parameter 'id' is set
      if (id === undefined || id === null) {
        throw new Error("Missing the required parameter 'id' when calling getStatusById");
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


      let returnType = JobStatus;

      return this.apiClient.callApi(
        '/refresh/{id}/status', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, null
      );
    }

    /**
     * Get the status of the refresh job with the given resource ID
     * Check the status of the given job by the resource ID
     * @param {String} id Unique identifier for the job (resource ID returned from FactSet).
     * @return { Promise.< module:model/JobStatus > } a Promise, with data of type {@link module:model/JobStatus }
     */
    getStatusById(id) {
      return this.getStatusByIdWithHttpInfo(id)
        .then(function(response_and_data) {
          return response_and_data.data;
        });
    }


    /**
     * Refresh a spreadsheet file
     * Start refreshing a spreadsheet file (in the Open Office XML format).
     * @param {File} body 
     * @param {Object} opts Optional parameters
     * @param {Boolean} opts.nowHandlingEnabled Return \\#VALUE for =FDS codes dependent on NOW(). Default is true. For more information on volatile code handling, see Online Assistant https://my.apps.factset.com/oa/pages/16118.
     * @param {Boolean} opts.refreshAutoFilters Option to refresh =FDS codes within autofilters.  Codes that are filtered out will not be refreshed, unless this option is set to true.  Default is true.  For more information, see Online Assistant https://my.apps.factset.com/oa/pages/21084#fds
     * @param {Boolean} opts.resizeArrays Option to allow automatic array-resizing, which allows you to return a time series of data without manually setting an array.  Default is true.  For more information, see Online Assistant https://my.apps.factset.com/oa/pages/21084#fds
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with an object containing data of type {@link module:model/JobStatus} and HTTP response
     */
    postWorkbookWithHttpInfo(body, opts) {
      opts = opts || {};
      let postBody = body;
      // verify the required parameter 'body' is set
      if (body === undefined || body === null) {
        throw new Error("Missing the required parameter 'body' when calling postWorkbook");
      }

      let pathParams = {
      };
      let queryParams = {
        'nowHandlingEnabled': opts['nowHandlingEnabled'],
        'refreshAutoFilters': opts['refreshAutoFilters'],
        'resizeArrays': opts['resizeArrays']
      };
      let headerParams = {
      };
      let formParams = {
      };

      let authNames = ['FactSetApiKey', 'FactSetOAuth2'];
      let contentTypes = ['application/vnd.openxmlformats-officedocument.spreadsheetml.sheet', 'application/json'];
      let accepts = ['application/json'];


      let returnType = JobStatus;

      return this.apiClient.callApi(
        '/refresh/calculate', 'POST',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, null
      );
    }

    /**
     * Refresh a spreadsheet file
     * Start refreshing a spreadsheet file (in the Open Office XML format).
     * @param {File} body 
     * @param {Object} opts Optional parameters
     * @param {Boolean} opts.nowHandlingEnabled Return \\#VALUE for =FDS codes dependent on NOW(). Default is true. For more information on volatile code handling, see Online Assistant https://my.apps.factset.com/oa/pages/16118.
     * @param {Boolean} opts.refreshAutoFilters Option to refresh =FDS codes within autofilters.  Codes that are filtered out will not be refreshed, unless this option is set to true.  Default is true.  For more information, see Online Assistant https://my.apps.factset.com/oa/pages/21084#fds
     * @param {Boolean} opts.resizeArrays Option to allow automatic array-resizing, which allows you to return a time series of data without manually setting an array.  Default is true.  For more information, see Online Assistant https://my.apps.factset.com/oa/pages/21084#fds
     * @return { Promise.< module:model/JobStatus > } a Promise, with data of type {@link module:model/JobStatus }
     */
    postWorkbook(body, opts) {
      return this.postWorkbookWithHttpInfo(body, opts)
        .then(function(response_and_data) {
          return response_and_data.data;
        });
    }


}


const GetFileByIdResponseWrapperTypeMap = {
  200: File,
  202: JobStatus,
  400: Errors,
  404: Errors,
  422: Errors,
  500: Errors,

  _createResponseWrapper(statusCode, response) {
    return new GetFileByIdResponseWrapper(statusCode, response);
  }
};



/**
 * Wrapper to support GET /refresh/{id} returning different types
 * per status code.
 *
 * <p>
 * Responses:
 * <ul>
 *   <li>200 : {@code File }<br>Expected response; body will contain calculated file</li>
 * 
 *   <li>202 : {@code JobStatus }<br>Accepted (resource not ready yet)</li>
 * </ul>
 *
 * </p>
 * Example:
 * <pre>{@code
 * const response = ...;
 * switch (response.statusCode) {
 *   case 200:
 *     File data200 = response.getResponse200();
 *     break;
 *   case 202:
 *     JobStatus data202 = response.getResponse202();
 *     break;
 *  }
 * }</pre>
 *
 * @alias module:GetFileByIdResponseWrapper
 * @class
 */
export class GetFileByIdResponseWrapper {

  /**
   * @param {number} statusCode
   * @param {*} response
   */
  constructor(statusCode, response) {
    /**
     * @type {number}
     */
    this.statusCode = statusCode;

    /**
     * @type {*}
     */
    this.response = response;
  }

  
  /**
   * @returns { File }
   */
  getResponse200() {
    if (this.statusCode !== 200) {
      throw new Error("Invalid response getter called. getResponse200 can't return a " + this.statusCode + " response");
    }

    return this.response;
  }
  
  /**
   * @returns { JobStatus }
   */
  getResponse202() {
    if (this.statusCode !== 202) {
      throw new Error("Invalid response getter called. getResponse202 can't return a " + this.statusCode + " response");
    }

    return this.response;
  }
  
}


