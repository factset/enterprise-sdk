/**
 * StreetAccount News API
 * The StreetAccount News API provides access to FactSet's proprietary news provider, StreetAccount. StreetAccount, is a premium real-time market intelligence news service that delivers comprehensive U.S., Canadian, and European coverage (and expanding Asia coverage). All possible sources for corporate news are scanned and key story facts are highlighted and presented in an easy-to-read format.  **StreetAccount Filters, Headlines, and Views:**  These endpoints allow for the retrieval of news headlines using filters such as Watchlists/Indices/Tickers, Categories (the equivalent of 'Subjects' within the Workstation), Market Topics, Regions, and Sectors.  Headlines can also be retrieved based on saved views within the Workstation.
 *
 * The version of the OpenAPI document: 1.2.0
 * Contact: api@factset.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 *
 */


import ApiClient from "../ApiClient";
import Error from '../model/Error';
import HeadlinesRequest from '../model/HeadlinesRequest';
import HeadlinesRequestByView from '../model/HeadlinesRequestByView';
import HeadlinesResponse from '../model/HeadlinesResponse';

/**
* Headlines service.
* @module api/HeadlinesApi
*/
export default class HeadlinesApi {

    /**
    * Constructs a new HeadlinesApi. 
    * @alias module:api/HeadlinesApi
    * @class
    * @param {module:ApiClient} [apiClient] Optional API client implementation to use,
    * default to {@link module:ApiClient#instance} if unspecified.
    */
    constructor(apiClient) {
        this.apiClient = apiClient || ApiClient.instance;
    }



    /**
     * Retrieve StreetAccount headlines for given filters
     * This endpoint will pull all headlines produced by StreetAccount and the full story body will be returned by the data set. Filters can be specified via the endpoint below. The attributes field in the request body can be used to specify which fields are returned in the response. If attributes are empty or not specified, the response does not omit attributes.
     * @param {Object} opts Optional parameters
     * @param {module:model/HeadlinesRequest} opts.headlinesRequest /filters endpoint contains the filters associated with the optional parameters in the request body.
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with an object containing data of type {@link module:model/HeadlinesResponse} and HTTP response
     */
    getStreetAccountHeadlinesWithHttpInfo(opts) {
      opts = opts || {};
      let postBody = opts['headlinesRequest'];

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


      let returnType = HeadlinesResponse;

      return this.apiClient.callApi(
        '/headlines', 'POST',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, null
      );
    }

    /**
     * Retrieve StreetAccount headlines for given filters
     * This endpoint will pull all headlines produced by StreetAccount and the full story body will be returned by the data set. Filters can be specified via the endpoint below. The attributes field in the request body can be used to specify which fields are returned in the response. If attributes are empty or not specified, the response does not omit attributes.
     * @param {Object} opts Optional parameters
     * @param {module:model/HeadlinesRequest} opts.headlinesRequest /filters endpoint contains the filters associated with the optional parameters in the request body.
     * @return { Promise.< module:model/HeadlinesResponse > } a Promise, with data of type {@link module:model/HeadlinesResponse }
     */
    getStreetAccountHeadlines(opts) {
      return this.getStreetAccountHeadlinesWithHttpInfo(opts)
        .then(function(response_and_data) {
          return response_and_data.data;
        });
    }


    /**
     * Retrieve StreetAccount headlines for given view
     * This endpoint allows you to pull all headlines produced by StreetAccount for a saved view. The full story body will be returned by the data set. Views can be created via the 'Create Views' endpoint.
     * @param {Object} opts Optional parameters
     * @param {module:model/HeadlinesRequestByView} opts.headlinesRequestByView View body which needs to be sent with request
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with an object containing data of type {@link module:model/HeadlinesResponse} and HTTP response
     */
    getStreetAccountHeadlinesByViewWithHttpInfo(opts) {
      opts = opts || {};
      let postBody = opts['headlinesRequestByView'];

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


      let returnType = HeadlinesResponse;

      return this.apiClient.callApi(
        '/headlines/view', 'POST',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, null
      );
    }

    /**
     * Retrieve StreetAccount headlines for given view
     * This endpoint allows you to pull all headlines produced by StreetAccount for a saved view. The full story body will be returned by the data set. Views can be created via the 'Create Views' endpoint.
     * @param {Object} opts Optional parameters
     * @param {module:model/HeadlinesRequestByView} opts.headlinesRequestByView View body which needs to be sent with request
     * @return { Promise.< module:model/HeadlinesResponse > } a Promise, with data of type {@link module:model/HeadlinesResponse }
     */
    getStreetAccountHeadlinesByView(opts) {
      return this.getStreetAccountHeadlinesByViewWithHttpInfo(opts)
        .then(function(response_and_data) {
          return response_and_data.data;
        });
    }


}





