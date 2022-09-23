/**
 * Documents Distributor - Documents API
 * Documents APIs that provide filings such as Global Filings and XML files such as StreetAccount    Global Filings API provides the capability to search and download filings documents from various exchanges around the world. This API will provide access to the full history and the ability to search by date and dataset(source). It does not provide real-time updates to the filings documents. Filings providers currently include EDGAR       Note: The real-time updates to the filing documents will be available within week to ten days and per request able to query up to 8 days of data               StreetAccount XML API provides access to historical StreetAccount (SA) news. SA provides a summary for various corporate and market news written by journalist with background in financial markets.    The API delivers SA stories in XML format based on user-specified date input parameters. When the API request is completed, output files will be made available back to the users through a secure URL. This API has three endpoints (1) Request Files (2) Check Status (3) Get Files.      This API only supports adhoc requests to retrieve historical files and does not support real-time files and if require real-time push should consider the other three methods (pushed via SFTP, to QNT account, or users Azure Storage)   Both historical and real-time Street Account news is also delivered via SFTP, to users QNT account, or users Azure Storage.  Files delivered contain both metadata and content body in each file. This eliminates the need to make multiple requests through multiple services to get all the information.  News API provides access to historical news. This provides a summary for various corporate and market news written by journalist with background in financial markets.  The API delivers  stories in different format based on user-specified date input parameters. When the API request is completed, output files will be made available back to the users through a secure URL. This API has three endpoints (1) Request Files (2) Check Status (3) Get Files    
 *
 * The version of the OpenAPI document: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 *
 */


import ApiClient from "../ApiClient";
import NewsStatus from '../model/NewsStatus';
import NewscheckstatusResponse from '../model/NewscheckstatusResponse';
import NewsgetfilesResponse from '../model/NewsgetfilesResponse';
import NewsrequestfilesResponse from '../model/NewsrequestfilesResponse';

/**
* NewsAPI service.
* @module api/NewsAPIApi
*/
export default class NewsAPIApi {

    /**
    * Constructs a new NewsAPIApi. 
    * @alias module:api/NewsAPIApi
    * @class
    * @param {module:ApiClient} [apiClient] Optional API client implementation to use,
    * default to {@link module:ApiClient#instance} if unspecified.
    */
    constructor(apiClient) {
        this.apiClient = apiClient || ApiClient.instance;
    }



    /**
     * Returns the status and percentDone of the requested jobID and source
     * Need to plug-in the jobID got from /request-files into /check-status endpoint
     * @param {String} jobID jobID returned by the request-files endpoint to know the status and percentDone
     * @param {module:model/String} source This parameter filters the results based on the source of the filings document
     * @param {Object} opts Optional parameters
     * @param {Number} opts.paginationLimit Specifies the maximum number of results to return per result
     * @param {Number} opts.paginationOffset Specifies the starting point for pagination. This parameter is used to identify the   beginning of next set of results
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with an object containing data of type {@link module:model/NewscheckstatusResponse} and HTTP response
     */
    asynchNewsV1CheckStatusGetWithHttpInfo(jobID, source, opts) {
      opts = opts || {};
      let postBody = null;
      // verify the required parameter 'jobID' is set
      if (jobID === undefined || jobID === null) {
        throw new Error("Missing the required parameter 'jobID' when calling asynchNewsV1CheckStatusGet");
      }
      // verify the required parameter 'source' is set
      if (source === undefined || source === null) {
        throw new Error("Missing the required parameter 'source' when calling asynchNewsV1CheckStatusGet");
      }

      let pathParams = {
      };
      let queryParams = {
        'jobID': jobID,
        'source': source,
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


      let returnType = NewscheckstatusResponse;

      return this.apiClient.callApi(
        '/asynch/news/v1/check-status', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, null
      );
    }

    /**
     * Returns the status and percentDone of the requested jobID and source
     * Need to plug-in the jobID got from /request-files into /check-status endpoint
     * @param {String} jobID jobID returned by the request-files endpoint to know the status and percentDone
     * @param {module:model/String} source This parameter filters the results based on the source of the filings document
     * @param {Object} opts Optional parameters
     * @param {Number} opts.paginationLimit Specifies the maximum number of results to return per result
     * @param {Number} opts.paginationOffset Specifies the starting point for pagination. This parameter is used to identify the   beginning of next set of results
     * @return { Promise.< module:model/NewscheckstatusResponse > } a Promise, with data of type {@link module:model/NewscheckstatusResponse }
     */
    asynchNewsV1CheckStatusGet(jobID, source, opts) {
      return this.asynchNewsV1CheckStatusGetWithHttpInfo(jobID, source, opts)
        .then(function(response_and_data) {
          return response_and_data.data;
        });
    }


    /**
     * Returns the news filings for the specified daterange and source
     * Need to plug-in the source and jobID got from /request-files into /get-files endpoint
     * @param {String} jobID jobID returned by the request-files endpoint to collect the results of the query
     * @param {module:model/String} source This parameter filters the results based on the source of the filings document
     * @param {Object} opts Optional parameters
     * @param {Number} opts.paginationLimit Specifies the maximum number of results to return per result
     * @param {Number} opts.paginationOffset Specifies the starting point for pagination. This parameter is used to identify the   beginning of next set of results
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with an object containing data of type {@link module:model/NewsgetfilesResponse} and HTTP response
     */
    asynchNewsV1GetFilesGetWithHttpInfo(jobID, source, opts) {
      opts = opts || {};
      let postBody = null;
      // verify the required parameter 'jobID' is set
      if (jobID === undefined || jobID === null) {
        throw new Error("Missing the required parameter 'jobID' when calling asynchNewsV1GetFilesGet");
      }
      // verify the required parameter 'source' is set
      if (source === undefined || source === null) {
        throw new Error("Missing the required parameter 'source' when calling asynchNewsV1GetFilesGet");
      }

      let pathParams = {
      };
      let queryParams = {
        'jobID': jobID,
        'source': source,
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


      let returnType = NewsgetfilesResponse;

      return this.apiClient.callApi(
        '/asynch/news/v1/get-files', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, null
      );
    }

    /**
     * Returns the news filings for the specified daterange and source
     * Need to plug-in the source and jobID got from /request-files into /get-files endpoint
     * @param {String} jobID jobID returned by the request-files endpoint to collect the results of the query
     * @param {module:model/String} source This parameter filters the results based on the source of the filings document
     * @param {Object} opts Optional parameters
     * @param {Number} opts.paginationLimit Specifies the maximum number of results to return per result
     * @param {Number} opts.paginationOffset Specifies the starting point for pagination. This parameter is used to identify the   beginning of next set of results
     * @return { Promise.< module:model/NewsgetfilesResponse > } a Promise, with data of type {@link module:model/NewsgetfilesResponse }
     */
    asynchNewsV1GetFilesGet(jobID, source, opts) {
      return this.asynchNewsV1GetFilesGetWithHttpInfo(jobID, source, opts)
        .then(function(response_and_data) {
          return response_and_data.data;
        });
    }


    /**
     * Returns the jobID
     * Give the startDate,endDate and source parameters as request parameters in the /request-files endpoint, it returns the jobID. startDate and endDate should be in YYYY-MM-DDTHH:MM:SSZ format This API only supports adhoc requests to retrieve historical files
     * @param {Date} startDate Date from which data is required. Should be YYYY-MM-DDTHH:MM:SSZ format
     * @param {Date} endDate The date until which the data is to be fetched. Should be YYYY-MM-DDTHH:MM:SSZ format
     * @param {module:model/String} source This parameter filters the results based on the source of the filings document
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with an object containing data of type {@link module:model/NewsrequestfilesResponse} and HTTP response
     */
    asynchNewsV1RequestFilesGetWithHttpInfo(startDate, endDate, source) {
      let postBody = null;
      // verify the required parameter 'startDate' is set
      if (startDate === undefined || startDate === null) {
        throw new Error("Missing the required parameter 'startDate' when calling asynchNewsV1RequestFilesGet");
      }
      // verify the required parameter 'endDate' is set
      if (endDate === undefined || endDate === null) {
        throw new Error("Missing the required parameter 'endDate' when calling asynchNewsV1RequestFilesGet");
      }
      // verify the required parameter 'source' is set
      if (source === undefined || source === null) {
        throw new Error("Missing the required parameter 'source' when calling asynchNewsV1RequestFilesGet");
      }

      let pathParams = {
      };
      let queryParams = {
        'startDate': startDate,
        'endDate': endDate,
        'source': source
      };
      let headerParams = {
      };
      let formParams = {
      };

      let authNames = ['FactSetApiKey', 'FactSetOAuth2'];
      let contentTypes = [];
      let accepts = ['application/json'];


      let returnType = NewsrequestfilesResponse;

      return this.apiClient.callApi(
        '/asynch/news/v1/request-files', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, null
      );
    }

    /**
     * Returns the jobID
     * Give the startDate,endDate and source parameters as request parameters in the /request-files endpoint, it returns the jobID. startDate and endDate should be in YYYY-MM-DDTHH:MM:SSZ format This API only supports adhoc requests to retrieve historical files
     * @param {Date} startDate Date from which data is required. Should be YYYY-MM-DDTHH:MM:SSZ format
     * @param {Date} endDate The date until which the data is to be fetched. Should be YYYY-MM-DDTHH:MM:SSZ format
     * @param {module:model/String} source This parameter filters the results based on the source of the filings document
     * @return { Promise.< module:model/NewsrequestfilesResponse > } a Promise, with data of type {@link module:model/NewsrequestfilesResponse }
     */
    asynchNewsV1RequestFilesGet(startDate, endDate, source) {
      return this.asynchNewsV1RequestFilesGetWithHttpInfo(startDate, endDate, source)
        .then(function(response_and_data) {
          return response_and_data.data;
        });
    }


}




