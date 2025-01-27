/**
 * Publisher API
 * Allow clients to fetch Analytics through APIs.
 *
 * The version of the OpenAPI document: 3.12.6
 * Contact: api@factset.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 *
 */


import ApiClient from "../ApiClient";
import ClientErrorResponse from '../model/ClientErrorResponse';
import DocumentDirectoriesRoot from '../model/DocumentDirectoriesRoot';

/**
* Documents service.
* @module api/DocumentsApi
*/
export default class DocumentsApi {

    /**
    * Constructs a new DocumentsApi. 
    * @alias module:api/DocumentsApi
    * @class
    * @param {module:ApiClient} [apiClient] Optional API client implementation to use,
    * default to {@link module:ApiClient#instance} if unspecified.
    */
    constructor(apiClient) {
        this.apiClient = apiClient || ApiClient.instance;
    }



    /**
     * Gets Publisher documents and sub-directories in a directory
     * This endpoint looks up all Publisher documents and sub-directories in a given directory.
     * @param {String} path The directory to get the documents in
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with an object containing data of type {@link module:model/DocumentDirectoriesRoot} and HTTP response
     */
    getPubDocumentsWithHttpInfo(path) {
      let postBody = null;
      // verify the required parameter 'path' is set
      if (path === undefined || path === null) {
        throw new Error("Missing the required parameter 'path' when calling getPubDocuments");
      }

      let pathParams = {
        'path': path
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


      let returnType = DocumentDirectoriesRoot;

      return this.apiClient.callApi(
        '/analytics/engines/pub/v3/documents/{path}', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, null
      );
    }

    /**
     * Gets Publisher documents and sub-directories in a directory
     * This endpoint looks up all Publisher documents and sub-directories in a given directory.
     * @param {String} path The directory to get the documents in
     * @return { Promise.< module:model/DocumentDirectoriesRoot > } a Promise, with data of type {@link module:model/DocumentDirectoriesRoot }
     */
    getPubDocuments(path) {
      return this.getPubDocumentsWithHttpInfo(path)
        .then(function(response_and_data) {
          return response_and_data.data;
        });
    }


}





