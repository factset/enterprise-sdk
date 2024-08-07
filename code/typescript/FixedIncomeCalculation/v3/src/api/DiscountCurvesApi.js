/**
 * FI API
 * Allow clients to fetch Analytics through APIs.
 *
 * The version of the OpenAPI document: 3.13.0
 * Contact: api@factset.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 *
 */


import ApiClient from "../ApiClient";
import ClientErrorResponse from '../model/ClientErrorResponse';
import FIDiscountCurveInfoRoot from '../model/FIDiscountCurveInfoRoot';

/**
* DiscountCurves service.
* @module api/DiscountCurvesApi
*/
export default class DiscountCurvesApi {

    /**
    * Constructs a new DiscountCurvesApi. 
    * @alias module:api/DiscountCurvesApi
    * @class
    * @param {module:ApiClient} [apiClient] Optional API client implementation to use,
    * default to {@link module:ApiClient#instance} if unspecified.
    */
    constructor(apiClient) {
        this.apiClient = apiClient || ApiClient.instance;
    }



    /**
     * Get Discount Curves
     * This endpoint lists all the discount curves that can be applied to a FI calculation.
     * @param {Object} opts Optional parameters
     * @param {String} opts.currency 
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with an object containing data of type {@link module:model/FIDiscountCurveInfoRoot} and HTTP response
     */
    getAllFIDiscountCurvesWithHttpInfo(opts) {
      opts = opts || {};
      let postBody = null;

      let pathParams = {
      };
      let queryParams = {
        'currency': opts['currency']
      };
      let headerParams = {
      };
      let formParams = {
      };

      let authNames = ['FactSetApiKey', 'FactSetOAuth2'];
      let contentTypes = [];
      let accepts = ['application/json'];


      let returnType = FIDiscountCurveInfoRoot;

      return this.apiClient.callApi(
        '/discount-curves', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, null
      );
    }

    /**
     * Get Discount Curves
     * This endpoint lists all the discount curves that can be applied to a FI calculation.
     * @param {Object} opts Optional parameters
     * @param {String} opts.currency 
     * @return { Promise.< module:model/FIDiscountCurveInfoRoot > } a Promise, with data of type {@link module:model/FIDiscountCurveInfoRoot }
     */
    getAllFIDiscountCurves(opts) {
      return this.getAllFIDiscountCurvesWithHttpInfo(opts)
        .then(function(response_and_data) {
          return response_and_data.data;
        });
    }


}





