/**
 * PA Engine API
 * Allow clients to fetch Analytics through APIs.
 *
 * The version of the OpenAPI document: 3.16.0
 * Contact: api@factset.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 *
 */


import ApiClient from "../ApiClient";
import ClientErrorResponse from '../model/ClientErrorResponse';
import ColumnRoot from '../model/ColumnRoot';
import ColumnSummaryRoot from '../model/ColumnSummaryRoot';

/**
* Columns service.
* @module api/ColumnsApi
*/
export default class ColumnsApi {

    /**
    * Constructs a new ColumnsApi. 
    * @alias module:api/ColumnsApi
    * @class
    * @param {module:ApiClient} [apiClient] Optional API client implementation to use,
    * default to {@link module:ApiClient#instance} if unspecified.
    */
    constructor(apiClient) {
        this.apiClient = apiClient || ApiClient.instance;
    }



    /**
     * Get PA column settings
     * This endpoint returns the default settings of a PA column.
     * @param {String} id Unique identifier for a column
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with an object containing data of type {@link module:model/ColumnRoot} and HTTP response
     */
    getPAColumnByIdWithHttpInfo(id) {
      let postBody = null;
      // verify the required parameter 'id' is set
      if (id === undefined || id === null) {
        throw new Error("Missing the required parameter 'id' when calling getPAColumnById");
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


      let returnType = ColumnRoot;

      return this.apiClient.callApi(
        '/analytics/engines/pa/v3/columns/{id}', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, null
      );
    }

    /**
     * Get PA column settings
     * This endpoint returns the default settings of a PA column.
     * @param {String} id Unique identifier for a column
     * @return { Promise.< module:model/ColumnRoot > } a Promise, with data of type {@link module:model/ColumnRoot }
     */
    getPAColumnById(id) {
      return this.getPAColumnByIdWithHttpInfo(id)
        .then(function(response_and_data) {
          return response_and_data.data;
        });
    }


    /**
     * Get PA columns
     * This endpoint lists all the PA columns that can be applied to a calculation.
     * @param {Object} opts Optional parameters
     * @param {String} opts.name Column name (default to '')
     * @param {String} opts.category Column category (default to '')
     * @param {String} opts.directory The directory to get the columns in (default to '')
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with an object containing data of type {@link module:model/ColumnSummaryRoot} and HTTP response
     */
    getPAColumnsWithHttpInfo(opts) {
      opts = opts || {};
      let postBody = null;

      let pathParams = {
      };
      let queryParams = {
        'name': opts['name'],
        'category': opts['category'],
        'directory': opts['directory']
      };
      let headerParams = {
      };
      let formParams = {
      };

      let authNames = ['FactSetApiKey', 'FactSetOAuth2'];
      let contentTypes = [];
      let accepts = ['application/json'];


      let returnType = ColumnSummaryRoot;

      return this.apiClient.callApi(
        '/analytics/engines/pa/v3/columns', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, null
      );
    }

    /**
     * Get PA columns
     * This endpoint lists all the PA columns that can be applied to a calculation.
     * @param {Object} opts Optional parameters
     * @param {String} opts.name Column name (default to '')
     * @param {String} opts.category Column category (default to '')
     * @param {String} opts.directory The directory to get the columns in (default to '')
     * @return { Promise.< module:model/ColumnSummaryRoot > } a Promise, with data of type {@link module:model/ColumnSummaryRoot }
     */
    getPAColumns(opts) {
      return this.getPAColumnsWithHttpInfo(opts)
        .then(function(response_and_data) {
          return response_and_data.data;
        });
    }


}





