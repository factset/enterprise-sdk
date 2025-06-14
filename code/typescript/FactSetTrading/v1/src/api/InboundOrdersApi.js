/**
 * Trading API
 * Allow clients to trade orders.
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
import CancelInboundOrdersRoot from '../model/CancelInboundOrdersRoot';
import ClientErrorResponse from '../model/ClientErrorResponse';
import InboundOrdersResponseRoot from '../model/InboundOrdersResponseRoot';
import InboundOrdersRoot from '../model/InboundOrdersRoot';
import ReplaceInboundOrdersRoot from '../model/ReplaceInboundOrdersRoot';

/**
* InboundOrders service.
* @module api/InboundOrdersApi
*/
export default class InboundOrdersApi {

    /**
    * Constructs a new InboundOrdersApi. 
    * @alias module:api/InboundOrdersApi
    * @class
    * @param {module:ApiClient} [apiClient] Optional API client implementation to use,
    * default to {@link module:ApiClient#instance} if unspecified.
    */
    constructor(apiClient) {
        this.apiClient = apiClient || ApiClient.instance;
    }



    /**
     * Cancel the inbound orders on Trading system.
     * This endpoint takes the list of inbound orders to be cancelled on the Trading system.
     * @param {Object} opts Optional parameters
     * @param {module:model/CancelInboundOrdersRoot} opts.cancelInboundOrdersRoot 
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with an object containing data of type {@link module:model/InboundOrdersResponseRoot} and HTTP response
     */
    cancelWithHttpInfo(opts) {
      opts = opts || {};
      let postBody = opts['cancelInboundOrdersRoot'];

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


      let returnType = InboundOrdersResponseRoot;

      return this.apiClient.callApi(
        '/inbound-orders/cancel', 'POST',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, null
      );
    }

    /**
     * Cancel the inbound orders on Trading system.
     * This endpoint takes the list of inbound orders to be cancelled on the Trading system.
     * @param {Object} opts Optional parameters
     * @param {module:model/CancelInboundOrdersRoot} opts.cancelInboundOrdersRoot 
     * @return { Promise.< module:model/InboundOrdersResponseRoot > } a Promise, with data of type {@link module:model/InboundOrdersResponseRoot }
     */
    cancel(opts) {
      return this.cancelWithHttpInfo(opts)
        .then(function(response_and_data) {
          return response_and_data.data;
        });
    }


    /**
     * Send inbound orders to Trading system for execution.
     * This endpoint takes the list of inbound orders and place them on Trading system for execution.
     * @param {Object} opts Optional parameters
     * @param {module:model/InboundOrdersRoot} opts.inboundOrdersRoot 
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with an object containing data of type {@link module:model/InboundOrdersResponseRoot} and HTTP response
     */
    createWithHttpInfo(opts) {
      opts = opts || {};
      let postBody = opts['inboundOrdersRoot'];

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


      let returnType = InboundOrdersResponseRoot;

      return this.apiClient.callApi(
        '/inbound-orders/create', 'POST',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, null
      );
    }

    /**
     * Send inbound orders to Trading system for execution.
     * This endpoint takes the list of inbound orders and place them on Trading system for execution.
     * @param {Object} opts Optional parameters
     * @param {module:model/InboundOrdersRoot} opts.inboundOrdersRoot 
     * @return { Promise.< module:model/InboundOrdersResponseRoot > } a Promise, with data of type {@link module:model/InboundOrdersResponseRoot }
     */
    create(opts) {
      return this.createWithHttpInfo(opts)
        .then(function(response_and_data) {
          return response_and_data.data;
        });
    }


    /**
     * Replace the inbound orders on Trading system.
     * This endpoint takes the list of orders to be replaced on the Trading system.
     * @param {Object} opts Optional parameters
     * @param {module:model/ReplaceInboundOrdersRoot} opts.replaceInboundOrdersRoot 
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with an object containing data of type {@link module:model/InboundOrdersResponseRoot} and HTTP response
     */
    replaceWithHttpInfo(opts) {
      opts = opts || {};
      let postBody = opts['replaceInboundOrdersRoot'];

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


      let returnType = InboundOrdersResponseRoot;

      return this.apiClient.callApi(
        '/inbound-orders/replace', 'POST',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, null
      );
    }

    /**
     * Replace the inbound orders on Trading system.
     * This endpoint takes the list of orders to be replaced on the Trading system.
     * @param {Object} opts Optional parameters
     * @param {module:model/ReplaceInboundOrdersRoot} opts.replaceInboundOrdersRoot 
     * @return { Promise.< module:model/InboundOrdersResponseRoot > } a Promise, with data of type {@link module:model/InboundOrdersResponseRoot }
     */
    replace(opts) {
      return this.replaceWithHttpInfo(opts)
        .then(function(response_and_data) {
          return response_and_data.data;
        });
    }


}





