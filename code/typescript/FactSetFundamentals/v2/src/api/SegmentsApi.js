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
import BatchStatusResponse from '../model/BatchStatusResponse';
import ErrorResponse from '../model/ErrorResponse';
import SegmentsRequest from '../model/SegmentsRequest';
import SegmentsResponse from '../model/SegmentsResponse';

/**
* Segments service.
* @module api/SegmentsApi
*/
export default class SegmentsApi {

    /**
    * Constructs a new SegmentsApi. 
    * @alias module:api/SegmentsApi
    * @class
    * @param {module:ApiClient} [apiClient] Optional API client implementation to use,
    * default to {@link module:ApiClient#instance} if unspecified.
    */
    constructor(apiClient) {
        this.apiClient = apiClient || ApiClient.instance;
    }



    /**
     * Returns Company Segment Data.
     * Retrieves Sales Metrics data for specified companies.  The ```/segments``` endpoint currently supports Long Running asynchronous requests up to **20 minutes** via batch parameter. Id limits are increased to 30000 ids per request when using batch capability.This 30000 id limit has been derived based on single metric for one day. This feature is available for all users. 
     * @param {module:model/SegmentsRequest} segmentsRequest Request object for requesting segments data
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with an object containing data of type {@link module:model/SegmentsResponse} and HTTP response
     */
    getFdsSegmentsForListWithHttpInfo(segmentsRequest) {
      let postBody = segmentsRequest;
      // verify the required parameter 'segmentsRequest' is set
      if (segmentsRequest === undefined || segmentsRequest === null) {
        throw new Error("Missing the required parameter 'segmentsRequest' when calling getFdsSegmentsForList");
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

      let returnType = GetFdsSegmentsForListResponseWrapperTypeMap;
      
      return this.apiClient.callApi(
        '/segments', 'POST',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, null
      );
    }

    /**
     * Returns Company Segment Data.
     * Retrieves Sales Metrics data for specified companies.  The ```/segments``` endpoint currently supports Long Running asynchronous requests up to **20 minutes** via batch parameter. Id limits are increased to 30000 ids per request when using batch capability.This 30000 id limit has been derived based on single metric for one day. This feature is available for all users. 
     * @param {module:model/SegmentsRequest} segmentsRequest Request object for requesting segments data
     * @return { Promise.< GetFdsSegmentsForListResponseWrapper > } a Promise, with data of type {@link GetFdsSegmentsForListResponseWrapper }
     */
    getFdsSegmentsForList(segmentsRequest) {
      return this.getFdsSegmentsForListWithHttpInfo(segmentsRequest)
        .then(function(response_and_data) {
          return response_and_data.data;
        });
    }


}


const GetFdsSegmentsForListResponseWrapperTypeMap = {
  200: SegmentsResponse,
  202: BatchStatusResponse,
  400: ErrorResponse,
  401: ErrorResponse,
  403: ErrorResponse,
  415: ErrorResponse,
  500: ErrorResponse,

  _createResponseWrapper(statusCode, response) {
    return new GetFdsSegmentsForListResponseWrapper(statusCode, response);
  }
};



/**
 * Wrapper to support POST /segments returning different types
 * per status code.
 *
 * <p>
 * Responses:
 * <ul>
 *   <li>200 : {@code SegmentsResponse }<br>Segment data items</li>
 * 
 *   <li>202 : {@code BatchStatusResponse }<br>Batch request has been accepted.</li>
 * </ul>
 *
 * </p>
 * Example:
 * <pre>{@code
 * const response = ...;
 * switch (response.statusCode) {
 *   case 200:
 *     SegmentsResponse data200 = response.getResponse200();
 *     break;
 *   case 202:
 *     BatchStatusResponse data202 = response.getResponse202();
 *     break;
 *  }
 * }</pre>
 *
 * @alias module:GetFdsSegmentsForListResponseWrapper
 * @class
 */
export class GetFdsSegmentsForListResponseWrapper {

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
   * @returns { SegmentsResponse }
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


