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
import FieldValuesResponseRoot from '../model/FieldValuesResponseRoot';
import OrdersResponseRoot from '../model/OrdersResponseRoot';

/**
* OrderSearch service.
* @module api/OrderSearchApi
*/
export default class OrderSearchApi {

    /**
    * Constructs a new OrderSearchApi. 
    * @alias module:api/OrderSearchApi
    * @class
    * @param {module:ApiClient} [apiClient] Optional API client implementation to use,
    * default to {@link module:ApiClient#instance} if unspecified.
    */
    constructor(apiClient) {
        this.apiClient = apiClient || ApiClient.instance;
    }



    /**
     * Get Order field values
     * Get lists of Order field values for symbol, trader, region, strategy and broker fields
     * @param {String} startDate Search start date in the format YYYY-MM-DD
     * @param {String} endDate Search end date in the format YYYY-MM-DD
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with an object containing data of type {@link module:model/FieldValuesResponseRoot} and HTTP response
     */
    getFieldValuesWithHttpInfo(startDate, endDate) {
      let postBody = null;
      // verify the required parameter 'startDate' is set
      if (startDate === undefined || startDate === null) {
        throw new Error("Missing the required parameter 'startDate' when calling getFieldValues");
      }
      // verify the required parameter 'endDate' is set
      if (endDate === undefined || endDate === null) {
        throw new Error("Missing the required parameter 'endDate' when calling getFieldValues");
      }

      let pathParams = {
      };
      let queryParams = {
        'startDate': startDate,
        'endDate': endDate
      };
      let headerParams = {
      };
      let formParams = {
      };

      let authNames = ['FactSetApiKey', 'FactSetOAuth2'];
      let contentTypes = [];
      let accepts = ['application/json'];


      let returnType = FieldValuesResponseRoot;

      return this.apiClient.callApi(
        '/tca/search/field-values', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, null
      );
    }

    /**
     * Get Order field values
     * Get lists of Order field values for symbol, trader, region, strategy and broker fields
     * @param {String} startDate Search start date in the format YYYY-MM-DD
     * @param {String} endDate Search end date in the format YYYY-MM-DD
     * @return { Promise.< module:model/FieldValuesResponseRoot > } a Promise, with data of type {@link module:model/FieldValuesResponseRoot }
     */
    getFieldValues(startDate, endDate) {
      return this.getFieldValuesWithHttpInfo(startDate, endDate)
        .then(function(response_and_data) {
          return response_and_data.data;
        });
    }


    /**
     * Find Orders by field values
     * Find Orders by specific field values.
     * @param {String} startDate Search start date in the format YYYY-MM-DD
     * @param {String} endDate Search end date in the format YYYY-MM-DD
     * @param {Object} opts Optional parameters
     * @param {String} opts.securityId ISIN for European securities, otherwise TICKER
     * @param {String} opts.trader Order Trader
     * @param {String} opts.region The two character ISO country code of the trading region. EMEA is used for the European trading region
     * @param {String} opts.strategy Order Strategy
     * @param {String} opts.broker Order Broker
     * @param {String} opts.searchText Free text field for searching all fields
     * @param {Boolean} opts.hierarchical Return order records in hierarchical format or as flat records (default to true)
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with an object containing data of type {@link module:model/OrdersResponseRoot} and HTTP response
     */
    getOrdersWithHttpInfo(startDate, endDate, opts) {
      opts = opts || {};
      let postBody = null;
      // verify the required parameter 'startDate' is set
      if (startDate === undefined || startDate === null) {
        throw new Error("Missing the required parameter 'startDate' when calling getOrders");
      }
      // verify the required parameter 'endDate' is set
      if (endDate === undefined || endDate === null) {
        throw new Error("Missing the required parameter 'endDate' when calling getOrders");
      }

      let pathParams = {
      };
      let queryParams = {
        'startDate': startDate,
        'endDate': endDate,
        'securityId': opts['securityId'],
        'trader': opts['trader'],
        'region': opts['region'],
        'strategy': opts['strategy'],
        'broker': opts['broker'],
        'searchText': opts['searchText'],
        'hierarchical': opts['hierarchical']
      };
      let headerParams = {
      };
      let formParams = {
      };

      let authNames = ['FactSetApiKey', 'FactSetOAuth2'];
      let contentTypes = [];
      let accepts = ['application/json'];


      let returnType = OrdersResponseRoot;

      return this.apiClient.callApi(
        '/tca/search/orders', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, null
      );
    }

    /**
     * Find Orders by field values
     * Find Orders by specific field values.
     * @param {String} startDate Search start date in the format YYYY-MM-DD
     * @param {String} endDate Search end date in the format YYYY-MM-DD
     * @param {Object} opts Optional parameters
     * @param {String} opts.securityId ISIN for European securities, otherwise TICKER
     * @param {String} opts.trader Order Trader
     * @param {String} opts.region The two character ISO country code of the trading region. EMEA is used for the European trading region
     * @param {String} opts.strategy Order Strategy
     * @param {String} opts.broker Order Broker
     * @param {String} opts.searchText Free text field for searching all fields
     * @param {Boolean} opts.hierarchical Return order records in hierarchical format or as flat records (default to true)
     * @return { Promise.< module:model/OrdersResponseRoot > } a Promise, with data of type {@link module:model/OrdersResponseRoot }
     */
    getOrders(startDate, endDate, opts) {
      return this.getOrdersWithHttpInfo(startDate, endDate, opts)
        .then(function(response_and_data) {
          return response_and_data.data;
        });
    }


}





