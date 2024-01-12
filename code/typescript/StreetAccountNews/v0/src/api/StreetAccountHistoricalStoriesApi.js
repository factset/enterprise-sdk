/**
 * StreetAccount News API
 * The StreetAccount News API provides access to FactSet's proprietary news provider, StreetAccount. StreetAccount, is a premium real-time market intelligence news service that delivers comprehensive U.S., Canadian, and European coverage (and expanding Asia coverage). All possible sources for corporate news are scanned and key story facts are highlighted and presented in an easy-to-read format.  **StreetAccount Filters, Headlines, and Views:**  These endpoints allow for the retrieval of news headlines using filters such as Watchlists/Indices/Tickers, Company Filters, Market Topics, Regions, and Sectors.  Headlines can also be retrieved based on saved views within the Workstation.  **StreetAccount Historical Stories:**  These endpoints provide access to historical StreetAccount (SA) news. The API delivers SA stories in XML format based on user-specified date input parameters. Output files are securely available to users through a URL. This API has three endpoints: Request Files, Check Status, and Get Files.  Please note that this API only supports adhoc requests for historical files and does not support real-time files. If real-time push is required, consider using other methods such as SFTP, QNT account, or Azure Storage. Both historical and real-time Street Account news can be delivered via SFTP, QNT account, or Azure Storage.  The files delivered contain both metadata and content body, eliminating the need for multiple requests through multiple services to retrieve all the information.
 *
 * The version of the OpenAPI document: 0.1.0
 * Contact: api@factset.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 *
 */


import ApiClient from "../ApiClient";
import CheckstatusResponse from '../model/CheckstatusResponse';
import GetfilesResponse from '../model/GetfilesResponse';
import RequestfilesResponse from '../model/RequestfilesResponse';
import StreetAccountStatus from '../model/StreetAccountStatus';

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
     * Returns the status and percentage of completion for the requested jobID
     * Need to plug-in the jobID from /request-files into /check-status endpoint
     * @param {String} jobID jobID returned by the request-files endpoint to know the status and percentDone
     * @param {Object} opts Optional parameters
     * @param {Number} opts.paginationLimit Specifies the maximum number of results to return per result
     * @param {Number} opts.paginationOffset Specifies the starting point for pagination. This parameter is used to identify the   beginning of next set of results
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with an object containing data of type {@link module:model/CheckstatusResponse} and HTTP response
     */
    streetaccountHistoricalCheckStatusGetWithHttpInfo(jobID, opts) {
      opts = opts || {};
      let postBody = null;
      // verify the required parameter 'jobID' is set
      if (jobID === undefined || jobID === null) {
        throw new Error("Missing the required parameter 'jobID' when calling streetaccountHistoricalCheckStatusGet");
      }

      let pathParams = {
      };
      let queryParams = {
        'jobID': jobID,
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


      let returnType = CheckstatusResponse;

      return this.apiClient.callApi(
        '/streetaccount/historical/check-status', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, null
      );
    }

    /**
     * Returns the status and percentage of completion for the requested jobID
     * Need to plug-in the jobID from /request-files into /check-status endpoint
     * @param {String} jobID jobID returned by the request-files endpoint to know the status and percentDone
     * @param {Object} opts Optional parameters
     * @param {Number} opts.paginationLimit Specifies the maximum number of results to return per result
     * @param {Number} opts.paginationOffset Specifies the starting point for pagination. This parameter is used to identify the   beginning of next set of results
     * @return { Promise.< module:model/CheckstatusResponse > } a Promise, with data of type {@link module:model/CheckstatusResponse }
     */
    streetaccountHistoricalCheckStatusGet(jobID, opts) {
      return this.streetaccountHistoricalCheckStatusGetWithHttpInfo(jobID, opts)
        .then(function(response_and_data) {
          return response_and_data.data;
        });
    }


    /**
     * Returns the StreetAccount XML files for the specified date range
     * Need to plug-in the jobID from /check-status into /get-files endpoint
     * @param {String} jobID jobID returned by the request-files endpoint to collect the results of the query
     * @param {Object} opts Optional parameters
     * @param {Number} opts.paginationLimit Specifies the maximum number of results to return per result
     * @param {Number} opts.paginationOffset Specifies the starting point for pagination. This parameter is used to identify the   beginning of next set of results
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with an object containing data of type {@link module:model/GetfilesResponse} and HTTP response
     */
    streetaccountHistoricalGetFilesGetWithHttpInfo(jobID, opts) {
      opts = opts || {};
      let postBody = null;
      // verify the required parameter 'jobID' is set
      if (jobID === undefined || jobID === null) {
        throw new Error("Missing the required parameter 'jobID' when calling streetaccountHistoricalGetFilesGet");
      }

      let pathParams = {
      };
      let queryParams = {
        'jobID': jobID,
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
        '/streetaccount/historical/get-files', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, null
      );
    }

    /**
     * Returns the StreetAccount XML files for the specified date range
     * Need to plug-in the jobID from /check-status into /get-files endpoint
     * @param {String} jobID jobID returned by the request-files endpoint to collect the results of the query
     * @param {Object} opts Optional parameters
     * @param {Number} opts.paginationLimit Specifies the maximum number of results to return per result
     * @param {Number} opts.paginationOffset Specifies the starting point for pagination. This parameter is used to identify the   beginning of next set of results
     * @return { Promise.< module:model/GetfilesResponse > } a Promise, with data of type {@link module:model/GetfilesResponse }
     */
    streetaccountHistoricalGetFilesGet(jobID, opts) {
      return this.streetaccountHistoricalGetFilesGetWithHttpInfo(jobID, opts)
        .then(function(response_and_data) {
          return response_and_data.data;
        });
    }


    /**
     * Returns the jobID
     * Give the startDate and endDate parameters as request parameters in the /request-files endpoint, it returns the jobID. startDate and endDate should be in YYYY-MM-DDTHH:MM:SSZ format. This API only supports adhoc requests to retrieve historical files and does not support real-time files and if you interested in require real-time push should consider the other three methods (pushed via SFTP, to QNT account, or your Azure Storage). Per API request able to query till 2 years of data
     * @param {Date} startDate Date from which data is required. Should be YYYY-MM-DDTHH:MM:SSZ format
     * @param {Date} endDate The date until which the data is to be fetched. Should be YYYY-MM-DDTHH:MM:SSZ format
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with an object containing data of type {@link module:model/RequestfilesResponse} and HTTP response
     */
    streetaccountHistoricalRequestFilesGetWithHttpInfo(startDate, endDate) {
      let postBody = null;
      // verify the required parameter 'startDate' is set
      if (startDate === undefined || startDate === null) {
        throw new Error("Missing the required parameter 'startDate' when calling streetaccountHistoricalRequestFilesGet");
      }
      // verify the required parameter 'endDate' is set
      if (endDate === undefined || endDate === null) {
        throw new Error("Missing the required parameter 'endDate' when calling streetaccountHistoricalRequestFilesGet");
      }

      let pathParams = {
      };
      let queryParams = {
        'startDate': startDate,
        'endDate': endDate
      };
      let headerParams = {
      };
      let formParams = {
      };

      let authNames = ['FactSetApiKey', 'FactSetOAuth2'];
      let contentTypes = [];
      let accepts = ['application/json'];


      let returnType = RequestfilesResponse;

      return this.apiClient.callApi(
        '/streetaccount/historical/request-files', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, null
      );
    }

    /**
     * Returns the jobID
     * Give the startDate and endDate parameters as request parameters in the /request-files endpoint, it returns the jobID. startDate and endDate should be in YYYY-MM-DDTHH:MM:SSZ format. This API only supports adhoc requests to retrieve historical files and does not support real-time files and if you interested in require real-time push should consider the other three methods (pushed via SFTP, to QNT account, or your Azure Storage). Per API request able to query till 2 years of data
     * @param {Date} startDate Date from which data is required. Should be YYYY-MM-DDTHH:MM:SSZ format
     * @param {Date} endDate The date until which the data is to be fetched. Should be YYYY-MM-DDTHH:MM:SSZ format
     * @return { Promise.< module:model/RequestfilesResponse > } a Promise, with data of type {@link module:model/RequestfilesResponse }
     */
    streetaccountHistoricalRequestFilesGet(startDate, endDate) {
      return this.streetaccountHistoricalRequestFilesGetWithHttpInfo(startDate, endDate)
        .then(function(response_and_data) {
          return response_and_data.data;
        });
    }


}





