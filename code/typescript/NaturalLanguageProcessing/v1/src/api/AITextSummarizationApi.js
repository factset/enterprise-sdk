/**
 * Natural Language Processing API
 * APIs that leverage Natural Language Processing to help extract meaningful data from unstructured text
 *
 * The version of the OpenAPI document: 1.3.0
 * Contact: api@factset.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 *
 */


import ApiClient from "../ApiClient";
import HTTPError from '../model/HTTPError';
import SummarizationRequest from '../model/SummarizationRequest';
import SummarizationResult from '../model/SummarizationResult';
import SummarizationResultID from '../model/SummarizationResultID';
import ValidationError from '../model/ValidationError';

/**
* AITextSummarization service.
* @module api/AITextSummarizationApi
*/
export default class AITextSummarizationApi {

    /**
    * Constructs a new AITextSummarizationApi. 
    * @alias module:api/AITextSummarizationApi
    * @class
    * @param {module:ApiClient} [apiClient] Optional API client implementation to use,
    * default to {@link module:ApiClient#instance} if unspecified.
    */
    constructor(apiClient) {
        this.apiClient = apiClient || ApiClient.instance;
    }



    /**
     * Endpoint to generate a headline from text
     * Generate a headline-length summary of plain text
     * @param {Object} opts Optional parameters
     * @param {module:model/SummarizationRequest} opts.summarizationRequest 
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with an object containing data of type {@link module:model/SummarizationResultID} and HTTP response
     */
    summarizationHeadlineWithHttpInfo(opts) {
      opts = opts || {};
      let postBody = opts['summarizationRequest'];

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


      let returnType = SummarizationResultID;

      return this.apiClient.callApi(
        '/summarization/headline', 'POST',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, null
      );
    }

    /**
     * Endpoint to generate a headline from text
     * Generate a headline-length summary of plain text
     * @param {Object} opts Optional parameters
     * @param {module:model/SummarizationRequest} opts.summarizationRequest 
     * @return { Promise.< module:model/SummarizationResultID > } a Promise, with data of type {@link module:model/SummarizationResultID }
     */
    summarizationHeadline(opts) {
      return this.summarizationHeadlineWithHttpInfo(opts)
        .then(function(response_and_data) {
          return response_and_data.data;
        });
    }


    /**
     * Endpoint to summarize and generate a headline from text
     * Generate both a paragraph-length, and headline-length summary of plain text
     * @param {Object} opts Optional parameters
     * @param {module:model/SummarizationRequest} opts.summarizationRequest 
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with an object containing data of type {@link module:model/SummarizationResultID} and HTTP response
     */
    summarizationHeadlineAndSummaryWithHttpInfo(opts) {
      opts = opts || {};
      let postBody = opts['summarizationRequest'];

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


      let returnType = SummarizationResultID;

      return this.apiClient.callApi(
        '/summarization/headline-and-summary', 'POST',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, null
      );
    }

    /**
     * Endpoint to summarize and generate a headline from text
     * Generate both a paragraph-length, and headline-length summary of plain text
     * @param {Object} opts Optional parameters
     * @param {module:model/SummarizationRequest} opts.summarizationRequest 
     * @return { Promise.< module:model/SummarizationResultID > } a Promise, with data of type {@link module:model/SummarizationResultID }
     */
    summarizationHeadlineAndSummary(opts) {
      return this.summarizationHeadlineAndSummaryWithHttpInfo(opts)
        .then(function(response_and_data) {
          return response_and_data.data;
        });
    }


    /**
     * Endpoint to obtain result of a particular summarization job
     * Retrieve the summarization result from a job started with the other summarization endpoints
     * @param {String} resultId 
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with an object containing data of type {@link module:model/SummarizationResult} and HTTP response
     */
    summarizationResultWithHttpInfo(resultId) {
      let postBody = null;
      // verify the required parameter 'resultId' is set
      if (resultId === undefined || resultId === null) {
        throw new Error("Missing the required parameter 'resultId' when calling summarizationResult");
      }

      let pathParams = {
        'resultId': resultId
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


      let returnType = SummarizationResult;

      return this.apiClient.callApi(
        '/summarization/result/{resultId}', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, null
      );
    }

    /**
     * Endpoint to obtain result of a particular summarization job
     * Retrieve the summarization result from a job started with the other summarization endpoints
     * @param {String} resultId 
     * @return { Promise.< module:model/SummarizationResult > } a Promise, with data of type {@link module:model/SummarizationResult }
     */
    summarizationResult(resultId) {
      return this.summarizationResultWithHttpInfo(resultId)
        .then(function(response_and_data) {
          return response_and_data.data;
        });
    }


    /**
     * Endpoint to summarize text
     * Generate a paragraph-length summary of plain text
     * @param {Object} opts Optional parameters
     * @param {module:model/SummarizationRequest} opts.summarizationRequest 
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with an object containing data of type {@link module:model/SummarizationResultID} and HTTP response
     */
    summarizationSummaryWithHttpInfo(opts) {
      opts = opts || {};
      let postBody = opts['summarizationRequest'];

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


      let returnType = SummarizationResultID;

      return this.apiClient.callApi(
        '/summarization/summary', 'POST',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, null
      );
    }

    /**
     * Endpoint to summarize text
     * Generate a paragraph-length summary of plain text
     * @param {Object} opts Optional parameters
     * @param {module:model/SummarizationRequest} opts.summarizationRequest 
     * @return { Promise.< module:model/SummarizationResultID > } a Promise, with data of type {@link module:model/SummarizationResultID }
     */
    summarizationSummary(opts) {
      return this.summarizationSummaryWithHttpInfo(opts)
        .then(function(response_and_data) {
          return response_and_data.data;
        });
    }


}





