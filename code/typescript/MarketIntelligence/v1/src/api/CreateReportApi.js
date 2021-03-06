/**
 * Market Intelligence
 * Through the Market Intelligence API, stay up to date on the companies and sectors you care most about with ease. Request the templates you have made in Market Intelligence to receive news and data on your portfolio.
 *
 * The version of the OpenAPI document: 1.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 *
 */


import ApiClient from "../ApiClient";
import MIAPIPostRequest from '../model/MIAPIPostRequest';
import PostResponseInfo from '../model/PostResponseInfo';

/**
* CreateReport service.
* @module api/CreateReportApi
*/
export default class CreateReportApi {

    /**
    * Constructs a new CreateReportApi. 
    * @alias module:api/CreateReportApi
    * @class
    * @param {module:ApiClient} [apiClient] Optional API client implementation to use,
    * default to {@link module:ApiClient#instance} if unspecified.
    */
    constructor(apiClient) {
        this.apiClient = apiClient || ApiClient.instance;
    }



    /**
     * Create new report templates including portfolio or market news and data.
     * Endpoint to create a new Market Intelligence report. If you want to retrieve a report you created, use get-reports call mentioned below.
     * @param {module:model/MIAPIPostRequest} mIAPIPostRequest 
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with an object containing data of type {@link module:model/PostResponseInfo} and HTTP response
     */
    createPostWithHttpInfo(mIAPIPostRequest) {
      let postBody = mIAPIPostRequest;
      // verify the required parameter 'mIAPIPostRequest' is set
      if (mIAPIPostRequest === undefined || mIAPIPostRequest === null) {
        throw new Error("Missing the required parameter 'mIAPIPostRequest' when calling createPost");
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


      let returnType = PostResponseInfo;

      return this.apiClient.callApi(
        '/create', 'POST',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, null
      );
    }

    /**
     * Create new report templates including portfolio or market news and data.
     * Endpoint to create a new Market Intelligence report. If you want to retrieve a report you created, use get-reports call mentioned below.
     * @param {module:model/MIAPIPostRequest} mIAPIPostRequest 
     * @return { Promise.< module:model/PostResponseInfo > } a Promise, with data of type {@link module:model/PostResponseInfo }
     */
    createPost(mIAPIPostRequest) {
      return this.createPostWithHttpInfo(mIAPIPostRequest)
        .then(function(response_and_data) {
          return response_and_data.data;
        });
    }


}





