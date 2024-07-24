/**
 * PA Engine API
 * Allow clients to fetch Analytics through APIs.
 *
 * The version of the OpenAPI document: 3.15.6
 * Contact: api@factset.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 *
 */


import ApiClient from "../ApiClient";
import ClientErrorResponse from '../model/ClientErrorResponse';
import DateParametersSummaryRoot from '../model/DateParametersSummaryRoot';

/**
* Dates service.
* @module api/DatesApi
*/
export default class DatesApi {

    /**
    * Constructs a new DatesApi. 
    * @alias module:api/DatesApi
    * @class
    * @param {module:ApiClient} [apiClient] Optional API client implementation to use,
    * default to {@link module:ApiClient#instance} if unspecified.
    */
    constructor(apiClient) {
        this.apiClient = apiClient || ApiClient.instance;
    }



    /**
     * Convert PA dates to absolute format
     * This endpoint converts the given start and end dates in FactSet date format to yyyymmdd format for a PA calculation. For more information on FactSet date format, please refer to the PA Engine API documentation under the 'API Documentation' section in the developer portal.
     * @param {String} enddate End Date
     * @param {String} componentid Component Id
     * @param {String} account Account ( Account Name ending with .ACCT or .ACTM )
     * @param {Object} opts Optional parameters
     * @param {String} opts.startdate Start Date
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with an object containing data of type {@link module:model/DateParametersSummaryRoot} and HTTP response
     */
    convertPADatesToAbsoluteFormatWithHttpInfo(enddate, componentid, account, opts) {
      opts = opts || {};
      let postBody = null;
      // verify the required parameter 'enddate' is set
      if (enddate === undefined || enddate === null) {
        throw new Error("Missing the required parameter 'enddate' when calling convertPADatesToAbsoluteFormat");
      }
      // verify the required parameter 'componentid' is set
      if (componentid === undefined || componentid === null) {
        throw new Error("Missing the required parameter 'componentid' when calling convertPADatesToAbsoluteFormat");
      }
      // verify the required parameter 'account' is set
      if (account === undefined || account === null) {
        throw new Error("Missing the required parameter 'account' when calling convertPADatesToAbsoluteFormat");
      }

      let pathParams = {
      };
      let queryParams = {
        'startdate': opts['startdate'],
        'enddate': enddate,
        'componentid': componentid,
        'account': account
      };
      let headerParams = {
      };
      let formParams = {
      };

      let authNames = ['FactSetApiKey', 'FactSetOAuth2'];
      let contentTypes = [];
      let accepts = ['application/json'];


      let returnType = DateParametersSummaryRoot;

      return this.apiClient.callApi(
        '/analytics/engines/pa/v3/dates', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, null
      );
    }

    /**
     * Convert PA dates to absolute format
     * This endpoint converts the given start and end dates in FactSet date format to yyyymmdd format for a PA calculation. For more information on FactSet date format, please refer to the PA Engine API documentation under the 'API Documentation' section in the developer portal.
     * @param {String} enddate End Date
     * @param {String} componentid Component Id
     * @param {String} account Account ( Account Name ending with .ACCT or .ACTM )
     * @param {Object} opts Optional parameters
     * @param {String} opts.startdate Start Date
     * @return { Promise.< module:model/DateParametersSummaryRoot > } a Promise, with data of type {@link module:model/DateParametersSummaryRoot }
     */
    convertPADatesToAbsoluteFormat(enddate, componentid, account, opts) {
      return this.convertPADatesToAbsoluteFormatWithHttpInfo(enddate, componentid, account, opts)
        .then(function(response_and_data) {
          return response_and_data.data;
        });
    }


}





