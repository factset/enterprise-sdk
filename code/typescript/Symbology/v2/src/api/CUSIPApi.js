/**
 * FactSet Symbology API
 * The FactSet Symbology API provides symbol resolution services, allowing clients to translate market identifiers into various symbology types such as, FactSet Permanent Identifiers, CUSIP, ISIN, SEDOL, Tickers, and Bloomberg FIGIs. <p>Factset's Symbology API sits at the center of its hub-and-spoke data model, enabling you to quickly harmonize the expanding catalog of Content APIs. Translate market IDs into CUSIP, SEDOL, ISIN, Tickers as of a point in time or for the entire history of the requested id allowing Data Management workflows to normalize ids over time.</p> 
 *
 * The version of the OpenAPI document: 2.1.3
 * Contact: api@factset.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 *
 */


import ApiClient from "../ApiClient";
import CusipHistoryResponse from '../model/CusipHistoryResponse';
import CusipHistoryTranslationRequest from '../model/CusipHistoryTranslationRequest';
import CusipTranslationRequest from '../model/CusipTranslationRequest';
import CusipTranslationResponse from '../model/CusipTranslationResponse';
import ErrorResponse from '../model/ErrorResponse';

/**
* CUSIP service.
* @module api/CUSIPApi
*/
export default class CUSIPApi {

    /**
    * Constructs a new CUSIPApi. 
    * @alias module:api/CUSIPApi
    * @class
    * @param {module:ApiClient} [apiClient] Optional API client implementation to use,
    * default to {@link module:ApiClient#instance} if unspecified.
    */
    constructor(apiClient) {
        this.apiClient = apiClient || ApiClient.instance;
    }



    /**
     * Retrieve the full history or as of a specific date of CUSIP changes for the requested ID(s).
     * Return the full history of CUSIP changes for a given market security or FactSet Permanent Id.
     * @param {module:model/CusipHistoryTranslationRequest} cusipHistoryTranslationRequest Request Body for CUSIP History
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with an object containing data of type {@link module:model/CusipHistoryResponse} and HTTP response
     */
    batchCusipHistoryWithHttpInfo(cusipHistoryTranslationRequest) {
      let postBody = cusipHistoryTranslationRequest;
      // verify the required parameter 'cusipHistoryTranslationRequest' is set
      if (cusipHistoryTranslationRequest === undefined || cusipHistoryTranslationRequest === null) {
        throw new Error("Missing the required parameter 'cusipHistoryTranslationRequest' when calling batchCusipHistory");
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


      let returnType = CusipHistoryResponse;

      return this.apiClient.callApi(
        '/symbology/v2/cusip-history', 'POST',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, null
      );
    }

    /**
     * Retrieve the full history or as of a specific date of CUSIP changes for the requested ID(s).
     * Return the full history of CUSIP changes for a given market security or FactSet Permanent Id.
     * @param {module:model/CusipHistoryTranslationRequest} cusipHistoryTranslationRequest Request Body for CUSIP History
     * @return { Promise.< module:model/CusipHistoryResponse > } a Promise, with data of type {@link module:model/CusipHistoryResponse }
     */
    batchCusipHistory(cusipHistoryTranslationRequest) {
      return this.batchCusipHistoryWithHttpInfo(cusipHistoryTranslationRequest)
        .then(function(response_and_data) {
          return response_and_data.data;
        });
    }


    /**
     * Translate market security symbols into CUSIP - Current Only
     * Translate market security symbols into CUSIP and FactSet Permanent Identifiers. Visit [OA 9094](https://my.apps.factset.com/oa/pages/9094) for more details regarding the CUSIP numbering system. <p>This method is best for requesting **large universes** of `ids`.</p>
     * @param {module:model/CusipTranslationRequest} cusipTranslationRequest Request Body for current only CUSIP Symbology Translation
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with an object containing data of type {@link module:model/CusipTranslationResponse} and HTTP response
     */
    batchTranslateCusipsWithHttpInfo(cusipTranslationRequest) {
      let postBody = cusipTranslationRequest;
      // verify the required parameter 'cusipTranslationRequest' is set
      if (cusipTranslationRequest === undefined || cusipTranslationRequest === null) {
        throw new Error("Missing the required parameter 'cusipTranslationRequest' when calling batchTranslateCusips");
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


      let returnType = CusipTranslationResponse;

      return this.apiClient.callApi(
        '/symbology/v2/cusip', 'POST',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, null
      );
    }

    /**
     * Translate market security symbols into CUSIP - Current Only
     * Translate market security symbols into CUSIP and FactSet Permanent Identifiers. Visit [OA 9094](https://my.apps.factset.com/oa/pages/9094) for more details regarding the CUSIP numbering system. <p>This method is best for requesting **large universes** of `ids`.</p>
     * @param {module:model/CusipTranslationRequest} cusipTranslationRequest Request Body for current only CUSIP Symbology Translation
     * @return { Promise.< module:model/CusipTranslationResponse > } a Promise, with data of type {@link module:model/CusipTranslationResponse }
     */
    batchTranslateCusips(cusipTranslationRequest) {
      return this.batchTranslateCusipsWithHttpInfo(cusipTranslationRequest)
        .then(function(response_and_data) {
          return response_and_data.data;
        });
    }


    /**
     * Retrieve the full history or as of a requested date of CUSIP changes for the requested ID(s).
     * Return the full history of CUSIP changes or as of a requested date for a given market security or FactSet Permanent Id. Visit [OA 9094](https://my.apps.factset.com/oa/pages/9094) for more details regarding the CUSIP numbering system. If no asOfDate is requested, the service will default to returning the entire history. 
     * @param {Array.<String>} ids Requested market securities or entities. Accepted identifiers include all FactSet Permanent Identifiers types, CUSIP, SEDOL, ISIN, and Tickers. This request value is sent back in the response as, `requestId'. <p>***ids limit** =  3000 per request*</p> *<p>Make note, GET Method URL request lines are also limited to a total length of 8192 bytes (8KB). In cases where the service allows for thousands of ids, which may lead to exceeding this request line limit of 8KB, its advised for any requests with large request lines to be requested through the respective \"POST\" method.</p>*
     * @param {Object} opts Optional parameters
     * @param {String} opts.asOfDate As-Of date for historical symbol request in YYYY-MM-DD format. This is the date requested in the service. If no asOfDate was requested, the response will be null.
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with an object containing data of type {@link module:model/CusipHistoryResponse} and HTTP response
     */
    cusipHistoryWithHttpInfo(ids, opts) {
      opts = opts || {};
      let postBody = null;
      // verify the required parameter 'ids' is set
      if (ids === undefined || ids === null) {
        throw new Error("Missing the required parameter 'ids' when calling cusipHistory");
      }

      let pathParams = {
      };
      let queryParams = {
        'ids': this.apiClient.buildCollectionParam(ids, 'csv'),
        'asOfDate': opts['asOfDate']
      };
      let headerParams = {
      };
      let formParams = {
      };

      let authNames = ['FactSetApiKey', 'FactSetOAuth2'];
      let contentTypes = [];
      let accepts = ['application/json'];


      let returnType = CusipHistoryResponse;

      return this.apiClient.callApi(
        '/symbology/v2/cusip-history', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, null
      );
    }

    /**
     * Retrieve the full history or as of a requested date of CUSIP changes for the requested ID(s).
     * Return the full history of CUSIP changes or as of a requested date for a given market security or FactSet Permanent Id. Visit [OA 9094](https://my.apps.factset.com/oa/pages/9094) for more details regarding the CUSIP numbering system. If no asOfDate is requested, the service will default to returning the entire history. 
     * @param {Array.<String>} ids Requested market securities or entities. Accepted identifiers include all FactSet Permanent Identifiers types, CUSIP, SEDOL, ISIN, and Tickers. This request value is sent back in the response as, `requestId'. <p>***ids limit** =  3000 per request*</p> *<p>Make note, GET Method URL request lines are also limited to a total length of 8192 bytes (8KB). In cases where the service allows for thousands of ids, which may lead to exceeding this request line limit of 8KB, its advised for any requests with large request lines to be requested through the respective \"POST\" method.</p>*
     * @param {Object} opts Optional parameters
     * @param {String} opts.asOfDate As-Of date for historical symbol request in YYYY-MM-DD format. This is the date requested in the service. If no asOfDate was requested, the response will be null.
     * @return { Promise.< module:model/CusipHistoryResponse > } a Promise, with data of type {@link module:model/CusipHistoryResponse }
     */
    cusipHistory(ids, opts) {
      return this.cusipHistoryWithHttpInfo(ids, opts)
        .then(function(response_and_data) {
          return response_and_data.data;
        });
    }


    /**
     * Translate market security symbols into CUSIPs - Current Only
     * Translate market security symbols into CUSIP and FactSet Permanent Identifiers. Visit [OA 9094](https://my.apps.factset.com/oa/pages/9094) for more details regarding the CUSIP numbering system.
     * @param {Array.<String>} ids Requested market securities or entities. Accepted identifiers include all FactSet Permanent Identifiers types, CUSIP, SEDOL, ISIN, and Tickers. This request value is sent back in the response as, `requestId'. <p>***ids limit** =  3000 per request*</p> *<p>Make note, GET Method URL request lines are also limited to a total length of 8192 bytes (8KB). In cases where the service allows for thousands of ids, which may lead to exceeding this request line limit of 8KB, its advised for any requests with large request lines to be requested through the respective \"POST\" method.</p>*
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with an object containing data of type {@link module:model/CusipTranslationResponse} and HTTP response
     */
    translateCusipWithHttpInfo(ids) {
      let postBody = null;
      // verify the required parameter 'ids' is set
      if (ids === undefined || ids === null) {
        throw new Error("Missing the required parameter 'ids' when calling translateCusip");
      }

      let pathParams = {
      };
      let queryParams = {
        'ids': this.apiClient.buildCollectionParam(ids, 'csv')
      };
      let headerParams = {
      };
      let formParams = {
      };

      let authNames = ['FactSetApiKey', 'FactSetOAuth2'];
      let contentTypes = [];
      let accepts = ['application/json'];


      let returnType = CusipTranslationResponse;

      return this.apiClient.callApi(
        '/symbology/v2/cusip', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, null
      );
    }

    /**
     * Translate market security symbols into CUSIPs - Current Only
     * Translate market security symbols into CUSIP and FactSet Permanent Identifiers. Visit [OA 9094](https://my.apps.factset.com/oa/pages/9094) for more details regarding the CUSIP numbering system.
     * @param {Array.<String>} ids Requested market securities or entities. Accepted identifiers include all FactSet Permanent Identifiers types, CUSIP, SEDOL, ISIN, and Tickers. This request value is sent back in the response as, `requestId'. <p>***ids limit** =  3000 per request*</p> *<p>Make note, GET Method URL request lines are also limited to a total length of 8192 bytes (8KB). In cases where the service allows for thousands of ids, which may lead to exceeding this request line limit of 8KB, its advised for any requests with large request lines to be requested through the respective \"POST\" method.</p>*
     * @return { Promise.< module:model/CusipTranslationResponse > } a Promise, with data of type {@link module:model/CusipTranslationResponse }
     */
    translateCusip(ids) {
      return this.translateCusipWithHttpInfo(ids)
        .then(function(response_and_data) {
          return response_and_data.data;
        });
    }


}





