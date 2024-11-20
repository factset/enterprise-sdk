/**
 * Best Execution Analytics for Smarter Trading (BEAST) API
 * Enables clients to programmatically access the underlying data which powers the BEAST Liquidity Analytics (LA) and Transaction Cost Analysis (TCA) applications.
 *
 * The version of the OpenAPI document: 1.0.0
 * Contact: api@factset.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 *
 */


import ApiClient from "../ApiClient";
import ErrorResponse from '../model/ErrorResponse';
import ZScoreResponseRoot from '../model/ZScoreResponseRoot';

/**
* ZScore service.
* @module api/ZScoreApi
*/
export default class ZScoreApi {

    /**
    * Constructs a new ZScoreApi. 
    * @alias module:api/ZScoreApi
    * @class
    * @param {module:ApiClient} [apiClient] Optional API client implementation to use,
    * default to {@link module:ApiClient#instance} if unspecified.
    */
    constructor(apiClient) {
        this.apiClient = apiClient || ApiClient.instance;
    }



    /**
     * Get Quote Z-Scores
     * Get quote z-scores for a specific date range, security and region. Z-Scores compare the value of the liquidity analytics for the  latest day in the specified date range with the mean and standard deviation from the historical period defined by the date range.
     * @param {String} startDate Search start date in the format YYYY-MM-DD
     * @param {String} endDate Search end date in the format YYYY-MM-DD
     * @param {String} securityId ISIN for European securities, otherwise TICKER
     * @param {String} region The two character ISO country code of the trading region. EMEA is used for the European trading region
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with an object containing data of type {@link module:model/ZScoreResponseRoot} and HTTP response
     */
    getZScoreQuotesWithHttpInfo(startDate, endDate, securityId, region) {
      let postBody = null;
      // verify the required parameter 'startDate' is set
      if (startDate === undefined || startDate === null) {
        throw new Error("Missing the required parameter 'startDate' when calling getZScoreQuotes");
      }
      // verify the required parameter 'endDate' is set
      if (endDate === undefined || endDate === null) {
        throw new Error("Missing the required parameter 'endDate' when calling getZScoreQuotes");
      }
      // verify the required parameter 'securityId' is set
      if (securityId === undefined || securityId === null) {
        throw new Error("Missing the required parameter 'securityId' when calling getZScoreQuotes");
      }
      // verify the required parameter 'region' is set
      if (region === undefined || region === null) {
        throw new Error("Missing the required parameter 'region' when calling getZScoreQuotes");
      }

      let pathParams = {
      };
      let queryParams = {
        'startDate': startDate,
        'endDate': endDate,
        'securityId': securityId,
        'region': region
      };
      let headerParams = {
      };
      let formParams = {
      };

      let authNames = ['FactSetApiKey', 'FactSetOAuth2'];
      let contentTypes = [];
      let accepts = ['application/json'];


      let returnType = ZScoreResponseRoot;

      return this.apiClient.callApi(
        '/la/zscore/quotes', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, null
      );
    }

    /**
     * Get Quote Z-Scores
     * Get quote z-scores for a specific date range, security and region. Z-Scores compare the value of the liquidity analytics for the  latest day in the specified date range with the mean and standard deviation from the historical period defined by the date range.
     * @param {String} startDate Search start date in the format YYYY-MM-DD
     * @param {String} endDate Search end date in the format YYYY-MM-DD
     * @param {String} securityId ISIN for European securities, otherwise TICKER
     * @param {String} region The two character ISO country code of the trading region. EMEA is used for the European trading region
     * @return { Promise.< module:model/ZScoreResponseRoot > } a Promise, with data of type {@link module:model/ZScoreResponseRoot }
     */
    getZScoreQuotes(startDate, endDate, securityId, region) {
      return this.getZScoreQuotesWithHttpInfo(startDate, endDate, securityId, region)
        .then(function(response_and_data) {
          return response_and_data.data;
        });
    }


    /**
     * Get Trade Z-Scores
     * Get trade z-scores for a specific date range, security and region. Z-Scores compare the value of the liquidity analytics for the  latest day in the specified date range with the mean and standard deviation from the historical period defined by the date range.
     * @param {String} startDate Search start date in the format YYYY-MM-DD
     * @param {String} endDate Search end date in the format YYYY-MM-DD
     * @param {String} securityId ISIN for European securities, otherwise TICKER
     * @param {String} region The two character ISO country code of the trading region. EMEA is used for the European trading region
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with an object containing data of type {@link module:model/ZScoreResponseRoot} and HTTP response
     */
    getZScoreTradesWithHttpInfo(startDate, endDate, securityId, region) {
      let postBody = null;
      // verify the required parameter 'startDate' is set
      if (startDate === undefined || startDate === null) {
        throw new Error("Missing the required parameter 'startDate' when calling getZScoreTrades");
      }
      // verify the required parameter 'endDate' is set
      if (endDate === undefined || endDate === null) {
        throw new Error("Missing the required parameter 'endDate' when calling getZScoreTrades");
      }
      // verify the required parameter 'securityId' is set
      if (securityId === undefined || securityId === null) {
        throw new Error("Missing the required parameter 'securityId' when calling getZScoreTrades");
      }
      // verify the required parameter 'region' is set
      if (region === undefined || region === null) {
        throw new Error("Missing the required parameter 'region' when calling getZScoreTrades");
      }

      let pathParams = {
      };
      let queryParams = {
        'startDate': startDate,
        'endDate': endDate,
        'securityId': securityId,
        'region': region
      };
      let headerParams = {
      };
      let formParams = {
      };

      let authNames = ['FactSetApiKey', 'FactSetOAuth2'];
      let contentTypes = [];
      let accepts = ['application/json'];


      let returnType = ZScoreResponseRoot;

      return this.apiClient.callApi(
        '/la/zscore/trades', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, null
      );
    }

    /**
     * Get Trade Z-Scores
     * Get trade z-scores for a specific date range, security and region. Z-Scores compare the value of the liquidity analytics for the  latest day in the specified date range with the mean and standard deviation from the historical period defined by the date range.
     * @param {String} startDate Search start date in the format YYYY-MM-DD
     * @param {String} endDate Search end date in the format YYYY-MM-DD
     * @param {String} securityId ISIN for European securities, otherwise TICKER
     * @param {String} region The two character ISO country code of the trading region. EMEA is used for the European trading region
     * @return { Promise.< module:model/ZScoreResponseRoot > } a Promise, with data of type {@link module:model/ZScoreResponseRoot }
     */
    getZScoreTrades(startDate, endDate, securityId, region) {
      return this.getZScoreTradesWithHttpInfo(startDate, endDate, securityId, region)
        .then(function(response_and_data) {
          return response_and_data.data;
        });
    }


}





