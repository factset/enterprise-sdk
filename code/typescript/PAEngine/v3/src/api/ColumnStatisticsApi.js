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
import ColumnStatisticRoot from '../model/ColumnStatisticRoot';

/**
* ColumnStatistics service.
* @module api/ColumnStatisticsApi
*/
export default class ColumnStatisticsApi {

    /**
    * Constructs a new ColumnStatisticsApi. 
    * @alias module:api/ColumnStatisticsApi
    * @class
    * @param {module:ApiClient} [apiClient] Optional API client implementation to use,
    * default to {@link module:ApiClient#instance} if unspecified.
    */
    constructor(apiClient) {
        this.apiClient = apiClient || ApiClient.instance;
    }



    /**
     * Get PA column statistics
     * This endpoint lists all the column statistics that can be applied to a PA column.
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with an object containing data of type {@link module:model/ColumnStatisticRoot} and HTTP response
     */
    getPAColumnStatisticsWithHttpInfo() {
      let postBody = null;

      let pathParams = {
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


      let returnType = ColumnStatisticRoot;

      return this.apiClient.callApi(
        '/analytics/engines/pa/v3/columnstatistics', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, null
      );
    }

    /**
     * Get PA column statistics
     * This endpoint lists all the column statistics that can be applied to a PA column.
     * @return { Promise.< module:model/ColumnStatisticRoot > } a Promise, with data of type {@link module:model/ColumnStatisticRoot }
     */
    getPAColumnStatistics() {
      return this.getPAColumnStatisticsWithHttpInfo()
        .then(function(response_and_data) {
          return response_and_data.data;
        });
    }


}





