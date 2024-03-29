/**
 * Security-Modeling API
 * Allow clients to fetch Analytics through APIs.
 *
 * The version of the OpenAPI document: 3
 * Contact: api@factset.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 *
 */


import ApiClient from "../ApiClient";
import SMCreateParametersRoot from '../model/SMCreateParametersRoot';
import SMCreateResponseRoot from '../model/SMCreateResponseRoot';
import SMDeleteParametersRoot from '../model/SMDeleteParametersRoot';
import SMDeleteResponseRoot from '../model/SMDeleteResponseRoot';
import SMRetrieveParametersRoot from '../model/SMRetrieveParametersRoot';
import SMRetrieveResponseRoot from '../model/SMRetrieveResponseRoot';

/**
* SecurityModeling service.
* @module api/SecurityModelingApi
*/
export default class SecurityModelingApi {

    /**
    * Constructs a new SecurityModelingApi. 
    * @alias module:api/SecurityModelingApi
    * @class
    * @param {module:ApiClient} [apiClient] Optional API client implementation to use,
    * default to {@link module:ApiClient#instance} if unspecified.
    */
    constructor(apiClient) {
        this.apiClient = apiClient || ApiClient.instance;
    }



    /**
     * Delete existing securities
     * This endpoint deletes existing securities.
     * @param {Object} opts Optional parameters
     * @param {module:model/SMDeleteParametersRoot} opts.sMDeleteParametersRoot 
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with an object containing data of type {@link module:model/SMDeleteResponseRoot} and HTTP response
     */
    deleteSecuritiesWithHttpInfo(opts) {
      opts = opts || {};
      let postBody = opts['sMDeleteParametersRoot'];

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


      let returnType = SMDeleteResponseRoot;

      return this.apiClient.callApi(
        '/analytics/security-modeling/v3/securities/delete', 'POST',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, null
      );
    }

    /**
     * Delete existing securities
     * This endpoint deletes existing securities.
     * @param {Object} opts Optional parameters
     * @param {module:model/SMDeleteParametersRoot} opts.sMDeleteParametersRoot 
     * @return { Promise.< module:model/SMDeleteResponseRoot > } a Promise, with data of type {@link module:model/SMDeleteResponseRoot }
     */
    deleteSecurities(opts) {
      return this.deleteSecuritiesWithHttpInfo(opts)
        .then(function(response_and_data) {
          return response_and_data.data;
        });
    }


    /**
     * Get existing securities
     * This endpoint gets all existing securities.
     * @param {Object} opts Optional parameters
     * @param {module:model/SMRetrieveParametersRoot} opts.sMRetrieveParametersRoot 
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with an object containing data of type {@link module:model/SMRetrieveResponseRoot} and HTTP response
     */
    getSecuritiesWithHttpInfo(opts) {
      opts = opts || {};
      let postBody = opts['sMRetrieveParametersRoot'];

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


      let returnType = SMRetrieveResponseRoot;

      return this.apiClient.callApi(
        '/analytics/security-modeling/v3/securities/retrieve', 'POST',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, null
      );
    }

    /**
     * Get existing securities
     * This endpoint gets all existing securities.
     * @param {Object} opts Optional parameters
     * @param {module:model/SMRetrieveParametersRoot} opts.sMRetrieveParametersRoot 
     * @return { Promise.< module:model/SMRetrieveResponseRoot > } a Promise, with data of type {@link module:model/SMRetrieveResponseRoot }
     */
    getSecurities(opts) {
      return this.getSecuritiesWithHttpInfo(opts)
        .then(function(response_and_data) {
          return response_and_data.data;
        });
    }


    /**
     * Create or update securities
     * This endpoint is to create or update existing securities.
     * @param {Object} opts Optional parameters
     * @param {module:model/SMCreateParametersRoot} opts.sMCreateParametersRoot 
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with an object containing data of type {@link module:model/SMCreateResponseRoot} and HTTP response
     */
    upsertSecuritiesWithHttpInfo(opts) {
      opts = opts || {};
      let postBody = opts['sMCreateParametersRoot'];

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


      let returnType = SMCreateResponseRoot;

      return this.apiClient.callApi(
        '/analytics/security-modeling/v3/securities/upsert', 'POST',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, null
      );
    }

    /**
     * Create or update securities
     * This endpoint is to create or update existing securities.
     * @param {Object} opts Optional parameters
     * @param {module:model/SMCreateParametersRoot} opts.sMCreateParametersRoot 
     * @return { Promise.< module:model/SMCreateResponseRoot > } a Promise, with data of type {@link module:model/SMCreateResponseRoot }
     */
    upsertSecurities(opts) {
      return this.upsertSecuritiesWithHttpInfo(opts)
        .then(function(response_and_data) {
          return response_and_data.data;
        });
    }


}





