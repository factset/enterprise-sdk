/**
 * IRN API v1
 * Allows users to extract, create, update and configure IRN data.
 *
 * The version of the OpenAPI document: 1
 * Contact: api@factset.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 *
 */


import ApiClient from "../ApiClient";
import ProblemDetails from '../model/ProblemDetails';

/**
* Identifiers service.
* @module api/IdentifiersApi
*/
export default class IdentifiersApi {

    /**
    * Constructs a new IdentifiersApi. 
    * @alias module:api/IdentifiersApi
    * @class
    * @param {module:ApiClient} [apiClient] Optional API client implementation to use,
    * default to {@link module:ApiClient#instance} if unspecified.
    */
    constructor(apiClient) {
        this.apiClient = apiClient || ApiClient.instance;
    }



    /**
     * Get all the identifier details for given identifiers
     * @param {Object} opts Optional parameters
     * @param {String} opts.identifiers Identifiers
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with an object containing data of type {@link Array.<Object>} and HTTP response
     */
    getIdentifiersWithHttpInfo(opts) {
      opts = opts || {};
      let postBody = null;

      let pathParams = {
      };
      let queryParams = {
        'identifiers': opts['identifiers']
      };
      let headerParams = {
      };
      let formParams = {
      };

      let authNames = ['FactSetApiKey', 'FactSetOAuth2'];
      let contentTypes = [];
      let accepts = ['application/json'];


      let returnType = [Object];

      return this.apiClient.callApi(
        '/identifiers', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, null
      );
    }

    /**
     * Get all the identifier details for given identifiers
     * @param {Object} opts Optional parameters
     * @param {String} opts.identifiers Identifiers
     * @return { Promise.< Array.<Object> > } a Promise, with data of type {@link Array.<Object> }
     */
    getIdentifiers(opts) {
      return this.getIdentifiersWithHttpInfo(opts)
        .then(function(response_and_data) {
          return response_and_data.data;
        });
    }


}





