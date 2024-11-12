/**
 * FactSet Fundamentals API
 * Gain access to current, comprehensive, and comparative information on securities in worldwide developed and emerging markets. Composed of annual and interim/quarterly data, detailed historical financial statement content, per-share data, and calculated ratios, FactSet Fundamentals provides you with the information you need for a global investment perspective.<p>This API is rate-limited to 10 requests per second and 10 concurrent requests per user.</p> 
 *
 * The version of the OpenAPI document: 2.2.0
 * Contact: api@factset.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 *
 */


import ApiClient from "../ApiClient";
import BatchResultResponse from '../model/BatchResultResponse';
import BatchStatusResponse from '../model/BatchStatusResponse';
import ErrorResponse from '../model/ErrorResponse';

/**
* BatchProcessing service.
* @module api/BatchProcessingApi
*/
export default class BatchProcessingApi {

    /**
    * Constructs a new BatchProcessingApi. 
    * @alias module:api/BatchProcessingApi
    * @class
    * @param {module:ApiClient} [apiClient] Optional API client implementation to use,
    * default to {@link module:ApiClient#instance} if unspecified.
    */
    constructor(apiClient) {
        this.apiClient = apiClient || ApiClient.instance;
    }



    /**
     * Returns the response for a Batch Request
     * Returns the response data for the underlying batch request that is specified by the id.  By default, this endpoint will return data as JSON. If you wish to receive your data in CSV format, you can edit the header to have the \"accept\" parameter as \"text/csv\" instead of \"application/json\". 
     * @param {String} id Batch Request identifier.
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with an object containing data of type {@link module:model/BatchResultResponse} and HTTP response
     */
    getBatchDataWithHttpInfo(id) {
      let postBody = null;
      // verify the required parameter 'id' is set
      if (id === undefined || id === null) {
        throw new Error("Missing the required parameter 'id' when calling getBatchData");
      }

      let pathParams = {
      };
      let queryParams = {
        'id': id
      };
      let headerParams = {
      };
      let formParams = {
      };

      let authNames = ['FactSetApiKey', 'FactSetOAuth2'];
      let contentTypes = [];
      let accepts = ['application/json'];

      let returnType = GetBatchDataResponseWrapperTypeMap;
      
      return this.apiClient.callApi(
        '/batch-result', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, null
      );
    }

    /**
     * Returns the response for a Batch Request
     * Returns the response data for the underlying batch request that is specified by the id.  By default, this endpoint will return data as JSON. If you wish to receive your data in CSV format, you can edit the header to have the \"accept\" parameter as \"text/csv\" instead of \"application/json\". 
     * @param {String} id Batch Request identifier.
     * @return { Promise.< GetBatchDataResponseWrapper > } a Promise, with data of type {@link GetBatchDataResponseWrapper }
     */
    getBatchData(id) {
      return this.getBatchDataWithHttpInfo(id)
        .then(function(response_and_data) {
          return response_and_data.data;
        });
    }


    /**
     * Returns the status for a Batch Request
     * Return the status for the underlying batch request that is specified by the id.
     * @param {String} id Batch Request identifier.
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with an object containing data of type {@link module:model/BatchStatusResponse} and HTTP response
     */
    getBatchStatusWithHttpInfo(id) {
      let postBody = null;
      // verify the required parameter 'id' is set
      if (id === undefined || id === null) {
        throw new Error("Missing the required parameter 'id' when calling getBatchStatus");
      }

      let pathParams = {
      };
      let queryParams = {
        'id': id
      };
      let headerParams = {
      };
      let formParams = {
      };

      let authNames = ['FactSetApiKey', 'FactSetOAuth2'];
      let contentTypes = [];
      let accepts = ['application/json'];


      let returnType = BatchStatusResponse;

      return this.apiClient.callApi(
        '/batch-status', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, null
      );
    }

    /**
     * Returns the status for a Batch Request
     * Return the status for the underlying batch request that is specified by the id.
     * @param {String} id Batch Request identifier.
     * @return { Promise.< module:model/BatchStatusResponse > } a Promise, with data of type {@link module:model/BatchStatusResponse }
     */
    getBatchStatus(id) {
      return this.getBatchStatusWithHttpInfo(id)
        .then(function(response_and_data) {
          return response_and_data.data;
        });
    }


}


const GetBatchDataResponseWrapperTypeMap = {
  200: BatchResultResponse,
  202: BatchStatusResponse,
  404: ErrorResponse,

  _createResponseWrapper(statusCode, response) {
    return new GetBatchDataResponseWrapper(statusCode, response);
  }
};



/**
 * Wrapper to support GET /batch-result returning different types
 * per status code.
 *
 * <p>
 * Responses:
 * <ul>
 *   <li>200 : {@code BatchResultResponse }<br>Request Response Object when the batch request has been completed and the response is created</li>
 * 
 *   <li>202 : {@code BatchStatusResponse }<br>The batch Request has not finished and the result has NOT been created.</li>
 * </ul>
 *
 * </p>
 * Example:
 * <pre>{@code
 * const response = ...;
 * switch (response.statusCode) {
 *   case 200:
 *     BatchResultResponse data200 = response.getResponse200();
 *     break;
 *   case 202:
 *     BatchStatusResponse data202 = response.getResponse202();
 *     break;
 *  }
 * }</pre>
 *
 * @alias module:GetBatchDataResponseWrapper
 * @class
 */
export class GetBatchDataResponseWrapper {

  /**
   * @param {number} statusCode
   * @param {*} response
   */
  constructor(statusCode, response) {
    /**
     * @type {number}
     */
    this.statusCode = statusCode;

    /**
     * @type {*}
     */
    this.response = response;
  }

  
  /**
   * @returns { BatchResultResponse }
   */
  getResponse200() {
    if (this.statusCode !== 200) {
      throw new Error("Invalid response getter called. getResponse200 can't return a " + this.statusCode + " response");
    }

    return this.response;
  }
  
  /**
   * @returns { BatchStatusResponse }
   */
  getResponse202() {
    if (this.statusCode !== 202) {
      throw new Error("Invalid response getter called. getResponse202 can't return a " + this.statusCode + " response");
    }

    return this.response;
  }
  
}


