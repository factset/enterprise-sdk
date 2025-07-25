/**
 * FactSet Private Company API
 * FactSet Private Company API encompasses Private Company Financials and includes some Private Company non-periodic data. Additional Private Company firmographics can be found in the FactSet Entity API. <p><b>Rate limit is set to 10 requests per second and 10 concurrent requests per user</b>.</p> 
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
import ErrorResponse from '../model/ErrorResponse';
import FinancialsRequest from '../model/FinancialsRequest';
import FinancialsResponse from '../model/FinancialsResponse';

/**
* Financials service.
* @module api/FinancialsApi
*/
export default class FinancialsApi {

    /**
    * Constructs a new FinancialsApi. 
    * @alias module:api/FinancialsApi
    * @class
    * @param {module:ApiClient} [apiClient] Optional API client implementation to use,
    * default to {@link module:ApiClient#instance} if unspecified.
    */
    constructor(apiClient) {
        this.apiClient = apiClient || ApiClient.instance;
    }



    /**
     * Returns Private Company Financial Data.
     * Retrieves Financial Data for specified Private Companies. Use the ```/universe``` endpoint to retrieve valid Private Company  identifiers. Use the ```/metrics``` endpoint to retrieve a full list of valid metrics or data items.  
     * @param {Array.<String>} ids The requested FactSet Private Company Entity Identifier in XXXXXX-E format.<br/><br/> *Make note, GET Method URL request lines are also limited to a total length of 8192 bytes (8KB). In cases where the  service allows for thousands of ids, which may lead to exceeding this request line limit of 8KB,  it's advised for any requests with large request lines to be requested through the respective \\\"POST\\\" method.* 
     * @param {Array.<String>} metrics Requested list of Private Company Financial items 
     * @param {Date} startDate The start date requested for a given date range in YYYY-MM-DD format. <br/> Future dates (T+1) are not accepted in this endpoint. 
     * @param {Object} opts Optional parameters
     * @param {Date} opts.endDate The end date requested for a given date range in YYYY-MM-DD format. If left blank, the API will default to previous close. <br/> Future dates (T+1) are not accepted in this endpoint. 
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with an object containing data of type {@link module:model/FinancialsResponse} and HTTP response
     */
    getFinancialsWithHttpInfo(ids, metrics, startDate, opts) {
      opts = opts || {};
      let postBody = null;
      // verify the required parameter 'ids' is set
      if (ids === undefined || ids === null) {
        throw new Error("Missing the required parameter 'ids' when calling getFinancials");
      }
      // verify the required parameter 'metrics' is set
      if (metrics === undefined || metrics === null) {
        throw new Error("Missing the required parameter 'metrics' when calling getFinancials");
      }
      // verify the required parameter 'startDate' is set
      if (startDate === undefined || startDate === null) {
        throw new Error("Missing the required parameter 'startDate' when calling getFinancials");
      }

      let pathParams = {
      };
      let queryParams = {
        'ids': this.apiClient.buildCollectionParam(ids, 'csv'),
        'metrics': this.apiClient.buildCollectionParam(metrics, 'csv'),
        'startDate': startDate,
        'endDate': opts['endDate']
      };
      let headerParams = {
      };
      let formParams = {
      };

      let authNames = ['FactSetApiKey', 'FactSetOAuth2'];
      let contentTypes = [];
      let accepts = ['application/json'];


      let returnType = FinancialsResponse;

      return this.apiClient.callApi(
        '/financials', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, null
      );
    }

    /**
     * Returns Private Company Financial Data.
     * Retrieves Financial Data for specified Private Companies. Use the ```/universe``` endpoint to retrieve valid Private Company  identifiers. Use the ```/metrics``` endpoint to retrieve a full list of valid metrics or data items.  
     * @param {Array.<String>} ids The requested FactSet Private Company Entity Identifier in XXXXXX-E format.<br/><br/> *Make note, GET Method URL request lines are also limited to a total length of 8192 bytes (8KB). In cases where the  service allows for thousands of ids, which may lead to exceeding this request line limit of 8KB,  it's advised for any requests with large request lines to be requested through the respective \\\"POST\\\" method.* 
     * @param {Array.<String>} metrics Requested list of Private Company Financial items 
     * @param {Date} startDate The start date requested for a given date range in YYYY-MM-DD format. <br/> Future dates (T+1) are not accepted in this endpoint. 
     * @param {Object} opts Optional parameters
     * @param {Date} opts.endDate The end date requested for a given date range in YYYY-MM-DD format. If left blank, the API will default to previous close. <br/> Future dates (T+1) are not accepted in this endpoint. 
     * @return { Promise.< module:model/FinancialsResponse > } a Promise, with data of type {@link module:model/FinancialsResponse }
     */
    getFinancials(ids, metrics, startDate, opts) {
      return this.getFinancialsWithHttpInfo(ids, metrics, startDate, opts)
        .then(function(response_and_data) {
          return response_and_data.data;
        });
    }


    /**
     * Returns Private Company Financial Data.
     * Retrieves Financial Data for specified Private Companies. Use the ```/universe``` endpoint to retrieve valid Private Company  identifiers. Use the ```/metrics``` endpoint to retrieve a full list of valid metrics or data items.  
     * @param {module:model/FinancialsRequest} financialsRequest Request Body to request a list of Private Company financials objects.
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with an object containing data of type {@link module:model/FinancialsResponse} and HTTP response
     */
    getFinancialsForListWithHttpInfo(financialsRequest) {
      let postBody = financialsRequest;
      // verify the required parameter 'financialsRequest' is set
      if (financialsRequest === undefined || financialsRequest === null) {
        throw new Error("Missing the required parameter 'financialsRequest' when calling getFinancialsForList");
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


      let returnType = FinancialsResponse;

      return this.apiClient.callApi(
        '/financials', 'POST',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, null
      );
    }

    /**
     * Returns Private Company Financial Data.
     * Retrieves Financial Data for specified Private Companies. Use the ```/universe``` endpoint to retrieve valid Private Company  identifiers. Use the ```/metrics``` endpoint to retrieve a full list of valid metrics or data items.  
     * @param {module:model/FinancialsRequest} financialsRequest Request Body to request a list of Private Company financials objects.
     * @return { Promise.< module:model/FinancialsResponse > } a Promise, with data of type {@link module:model/FinancialsResponse }
     */
    getFinancialsForList(financialsRequest) {
      return this.getFinancialsForListWithHttpInfo(financialsRequest)
        .then(function(response_and_data) {
          return response_and_data.data;
        });
    }


}





