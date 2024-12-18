/**
 * StreetAccount News API
 * The StreetAccount News API provides access to FactSet's proprietary news provider, StreetAccount. StreetAccount, is a premium real-time market intelligence news service that delivers comprehensive U.S., Canadian, and European coverage (and expanding Asia coverage). All possible sources for corporate news are scanned and key story facts are highlighted and presented in an easy-to-read format.  **StreetAccount Filters, Headlines, and Views:**  These endpoints allow for the retrieval of news headlines using filters such as Watchlists/Indices/Tickers, Categories (the equivalent of 'Subjects' within the Workstation), Market Topics, Regions, and Sectors.  Headlines can also be retrieved based on saved views within the Workstation.   **StreetAccount Historical Stories:**  These endpoints provide access to historical StreetAccount (SA) news. The API delivers SA stories in XML format based on user-specified date input parameters. Output files are securely available to users through a URL. This API has three endpoints: Create, Status, and Get.  Please note that this API only supports adhoc requests for historical files and does not support real-time files. If real-time push is required, consider using other methods such as SFTP, QNT account, or Azure Storage. Both historical and real-time Street Account news can be delivered via SFTP, QNT account, or Azure Storage.  The files delivered contain both metadata and content body, eliminating the need for multiple requests through multiple services to retrieve all the information.
 *
 * The version of the OpenAPI document: 1.1.0
 * Contact: api@factset.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 *
 */


import ApiClient from "../ApiClient";
import AcceptedResponse from '../model/AcceptedResponse';
import CreateFilesRequest from '../model/CreateFilesRequest';
import Error from '../model/Error';
import GetfilesResponse from '../model/GetfilesResponse';
import SubmittedResponse from '../model/SubmittedResponse';

/**
* StreetAccountHistoricalStories service.
* @module api/StreetAccountHistoricalStoriesApi
*/
export default class StreetAccountHistoricalStoriesApi {

    /**
    * Constructs a new StreetAccountHistoricalStoriesApi. 
    * @alias module:api/StreetAccountHistoricalStoriesApi
    * @class
    * @param {module:ApiClient} [apiClient] Optional API client implementation to use,
    * default to {@link module:ApiClient#instance} if unspecified.
    */
    constructor(apiClient) {
        this.apiClient = apiClient || ApiClient.instance;
    }



    /**
     * Returns the StreetAccount Historical data in files requested in the /historical/files/create endpoint.
     * Need to plug-in the ID got from /historical/files/create into /historical/files/status endpoint
     * @param {String} id ID returned by the /historical/files/create endpoint to collect the results of the query
     * @param {Object} opts Optional parameters
     * @param {Number} opts.paginationLimit Specifies the maximum number of results to return per result
     * @param {Number} opts.paginationOffset Specifies the starting point for pagination. This parameter is used to identify the   beginning of next set of results
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with an object containing data of type {@link module:model/GetfilesResponse} and HTTP response
     */
    getFilesDataWithHttpInfo(id, opts) {
      opts = opts || {};
      let postBody = null;
      // verify the required parameter 'id' is set
      if (id === undefined || id === null) {
        throw new Error("Missing the required parameter 'id' when calling getFilesData");
      }

      let pathParams = {
      };
      let queryParams = {
        'id': id,
        '_paginationLimit': opts['paginationLimit'],
        '_paginationOffset': opts['paginationOffset']
      };
      let headerParams = {
      };
      let formParams = {
      };

      let authNames = ['FactSetApiKey', 'FactSetOAuth2'];
      let contentTypes = [];
      let accepts = ['application/json'];


      let returnType = GetfilesResponse;

      return this.apiClient.callApi(
        '/historical/files/get', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, null
      );
    }

    /**
     * Returns the StreetAccount Historical data in files requested in the /historical/files/create endpoint.
     * Need to plug-in the ID got from /historical/files/create into /historical/files/status endpoint
     * @param {String} id ID returned by the /historical/files/create endpoint to collect the results of the query
     * @param {Object} opts Optional parameters
     * @param {Number} opts.paginationLimit Specifies the maximum number of results to return per result
     * @param {Number} opts.paginationOffset Specifies the starting point for pagination. This parameter is used to identify the   beginning of next set of results
     * @return { Promise.< module:model/GetfilesResponse > } a Promise, with data of type {@link module:model/GetfilesResponse }
     */
    getFilesData(id, opts) {
      return this.getFilesDataWithHttpInfo(id, opts)
        .then(function(response_and_data) {
          return response_and_data.data;
        });
    }


    /**
     * Returns the status of the request
     * Need to plug-in the ID get from /historical/files/create endpoint into /historical/files/status endpoint
     * @param {String} id ID returned by the /historical/files/create endpoint to know the status
     * @param {Object} opts Optional parameters
     * @param {Number} opts.paginationLimit Specifies the maximum number of results to return per result
     * @param {Number} opts.paginationOffset Specifies the starting point for pagination. This parameter is used to identify the beginning of next set of results
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with an object containing data of type {@link module:model/SubmittedResponse} and HTTP response
     */
    getStatusDataWithHttpInfo(id, opts) {
      opts = opts || {};
      let postBody = null;
      // verify the required parameter 'id' is set
      if (id === undefined || id === null) {
        throw new Error("Missing the required parameter 'id' when calling getStatusData");
      }

      let pathParams = {
      };
      let queryParams = {
        'id': id,
        '_paginationLimit': opts['paginationLimit'],
        '_paginationOffset': opts['paginationOffset']
      };
      let headerParams = {
      };
      let formParams = {
      };

      let authNames = ['FactSetApiKey', 'FactSetOAuth2'];
      let contentTypes = [];
      let accepts = ['application/json'];

      let returnType = GetStatusDataResponseWrapperTypeMap;
      
      return this.apiClient.callApi(
        '/historical/files/status', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, null
      );
    }

    /**
     * Returns the status of the request
     * Need to plug-in the ID get from /historical/files/create endpoint into /historical/files/status endpoint
     * @param {String} id ID returned by the /historical/files/create endpoint to know the status
     * @param {Object} opts Optional parameters
     * @param {Number} opts.paginationLimit Specifies the maximum number of results to return per result
     * @param {Number} opts.paginationOffset Specifies the starting point for pagination. This parameter is used to identify the beginning of next set of results
     * @return { Promise.< GetStatusDataResponseWrapper > } a Promise, with data of type {@link GetStatusDataResponseWrapper }
     */
    getStatusData(id, opts) {
      return this.getStatusDataWithHttpInfo(id, opts)
        .then(function(response_and_data) {
          return response_and_data.data;
        });
    }


    /**
     * Requests the creation of StreetAccount News Files with historical data.
     * Data available from past 10 years, 2 years of data can be retrieved per API request and an ID is returned.
     * @param {module:model/CreateFilesRequest} createFilesRequest 
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with an object containing data of type {@link module:model/AcceptedResponse} and HTTP response
     */
    requestFilesWithHttpInfo(createFilesRequest) {
      let postBody = createFilesRequest;
      // verify the required parameter 'createFilesRequest' is set
      if (createFilesRequest === undefined || createFilesRequest === null) {
        throw new Error("Missing the required parameter 'createFilesRequest' when calling requestFiles");
      }

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


      let returnType = AcceptedResponse;

      return this.apiClient.callApi(
        '/historical/files/create', 'POST',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, null
      );
    }

    /**
     * Requests the creation of StreetAccount News Files with historical data.
     * Data available from past 10 years, 2 years of data can be retrieved per API request and an ID is returned.
     * @param {module:model/CreateFilesRequest} createFilesRequest 
     * @return { Promise.< module:model/AcceptedResponse > } a Promise, with data of type {@link module:model/AcceptedResponse }
     */
    requestFiles(createFilesRequest) {
      return this.requestFilesWithHttpInfo(createFilesRequest)
        .then(function(response_and_data) {
          return response_and_data.data;
        });
    }


}


const GetStatusDataResponseWrapperTypeMap = {
  201: SubmittedResponse,
  202: AcceptedResponse,
  400: Error,
  401: Error,
  403: Error,
  404: Error,
  500: Error,

  _createResponseWrapper(statusCode, response) {
    return new GetStatusDataResponseWrapper(statusCode, response);
  }
};



/**
 * Wrapper to support GET /historical/files/status returning different types
 * per status code.
 *
 * <p>
 * Responses:
 * <ul>
 *   <li>201 : {@code SubmittedResponse }<br>The Request has been Created. </li>
 * 
 *   <li>202 : {@code AcceptedResponse }<br>The Request has been Accepted. </li>
 * </ul>
 *
 * </p>
 * Example:
 * <pre>{@code
 * const response = ...;
 * switch (response.statusCode) {
 *   case 201:
 *     SubmittedResponse data201 = response.getResponse201();
 *     break;
 *   case 202:
 *     AcceptedResponse data202 = response.getResponse202();
 *     break;
 *  }
 * }</pre>
 *
 * @alias module:GetStatusDataResponseWrapper
 * @class
 */
export class GetStatusDataResponseWrapper {

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
   * @returns { SubmittedResponse }
   */
  getResponse201() {
    if (this.statusCode !== 201) {
      throw new Error("Invalid response getter called. getResponse201 can't return a " + this.statusCode + " response");
    }

    return this.response;
  }
  
  /**
   * @returns { AcceptedResponse }
   */
  getResponse202() {
    if (this.statusCode !== 202) {
      throw new Error("Invalid response getter called. getResponse202 can't return a " + this.statusCode + " response");
    }

    return this.response;
  }
  
}


