/**
 * Style Performance and Risk Analysis (SPAR) Engine API
 * Allow clients to fetch Analytics through APIs.
 *
 * The version of the OpenAPI document: 3.13.4
 * Contact: api@factset.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 *
 */


import ApiClient from "../ApiClient";
import CurrencyRoot from '../model/CurrencyRoot';

/**
* Currencies service.
* @module api/CurrenciesApi
*/
export default class CurrenciesApi {

    /**
    * Constructs a new CurrenciesApi. 
    * @alias module:api/CurrenciesApi
    * @class
    * @param {module:ApiClient} [apiClient] Optional API client implementation to use,
    * default to {@link module:ApiClient#instance} if unspecified.
    */
    constructor(apiClient) {
        this.apiClient = apiClient || ApiClient.instance;
    }



    /**
     * Get currencies
     * This endpoint lists all the currencies that can be applied to any calculation.
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with an object containing data of type {@link module:model/CurrencyRoot} and HTTP response
     */
    getCurrenciesWithHttpInfo() {
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


      let returnType = CurrencyRoot;

      return this.apiClient.callApi(
        '/analytics/lookups/v3/currencies', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, null
      );
    }

    /**
     * Get currencies
     * This endpoint lists all the currencies that can be applied to any calculation.
     * @return { Promise.< module:model/CurrencyRoot > } a Promise, with data of type {@link module:model/CurrencyRoot }
     */
    getCurrencies() {
      return this.getCurrenciesWithHttpInfo()
        .then(function(response_and_data) {
          return response_and_data.data;
        });
    }


}





