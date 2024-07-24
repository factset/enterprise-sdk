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
import ComponentSummaryRoot from '../model/ComponentSummaryRoot';
import PAComponentRoot from '../model/PAComponentRoot';

/**
* Components service.
* @module api/ComponentsApi
*/
export default class ComponentsApi {

    /**
    * Constructs a new ComponentsApi. 
    * @alias module:api/ComponentsApi
    * @class
    * @param {module:ApiClient} [apiClient] Optional API client implementation to use,
    * default to {@link module:ApiClient#instance} if unspecified.
    */
    constructor(apiClient) {
        this.apiClient = apiClient || ApiClient.instance;
    }



    /**
     * Get PA component by id
     * This endpoint returns the default settings of a PA component.
     * @param {String} id Unique identifier for a PA component
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with an object containing data of type {@link module:model/PAComponentRoot} and HTTP response
     */
    getPAComponentByIdWithHttpInfo(id) {
      let postBody = null;
      // verify the required parameter 'id' is set
      if (id === undefined || id === null) {
        throw new Error("Missing the required parameter 'id' when calling getPAComponentById");
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


      let returnType = PAComponentRoot;

      return this.apiClient.callApi(
        '/analytics/engines/pa/v3/components/{id}', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, null
      );
    }

    /**
     * Get PA component by id
     * This endpoint returns the default settings of a PA component.
     * @param {String} id Unique identifier for a PA component
     * @return { Promise.< module:model/PAComponentRoot > } a Promise, with data of type {@link module:model/PAComponentRoot }
     */
    getPAComponentById(id) {
      return this.getPAComponentByIdWithHttpInfo(id)
        .then(function(response_and_data) {
          return response_and_data.data;
        });
    }


    /**
     * Get PA components
     * This endpoint returns the list of PA components in a given PA document.
     * @param {String} document Document Name
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with an object containing data of type {@link module:model/ComponentSummaryRoot} and HTTP response
     */
    getPAComponentsWithHttpInfo(document) {
      let postBody = null;
      // verify the required parameter 'document' is set
      if (document === undefined || document === null) {
        throw new Error("Missing the required parameter 'document' when calling getPAComponents");
      }

      let pathParams = {
      };
      let queryParams = {
        'document': document
      };
      let headerParams = {
      };
      let formParams = {
      };

      let authNames = ['FactSetApiKey', 'FactSetOAuth2'];
      let contentTypes = [];
      let accepts = ['application/json'];


      let returnType = ComponentSummaryRoot;

      return this.apiClient.callApi(
        '/analytics/engines/pa/v3/components', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, null
      );
    }

    /**
     * Get PA components
     * This endpoint returns the list of PA components in a given PA document.
     * @param {String} document Document Name
     * @return { Promise.< module:model/ComponentSummaryRoot > } a Promise, with data of type {@link module:model/ComponentSummaryRoot }
     */
    getPAComponents(document) {
      return this.getPAComponentsWithHttpInfo(document)
        .then(function(response_and_data) {
          return response_and_data.data;
        });
    }


}





