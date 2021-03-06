/**
 * Bonds API For Digital Portals
 * Search for fixed income instruments, using a criteria-based screener. The API provides also fundamental data and key figures, basic interest rate information and derived coupon lists.  Available search criteria include:  * validation: filter for only active listings, by price quality and latest/previous available price dates * traded markets: filter and indicate a market priority for the validation * important dates in and features of the life cycle of the fixed income instruments * filter by issuer, its country of registration and the issued volume * coupon data: occurrence and frequency of coupon payments, current interest rate range * yield and yield to maturity range, spread * Macaulay duration * sensitivity ranges: base point value, modified duration, elasticity, convexity * cash flow for all transactions over a certain time range: sum or average * country-specific attributes: for Germany: is eligible for trustees        The key figures are calculated using delayed prices with an additional delay of 10 minutes after an update of the debt instrument's price. Special product features such as the right to a maturity extension, an attached option, or convertibility are not considered for the key figure calculation. Further, a calculation is not performed for perpetual products and for products with variable interest rate.  This API is fully integrated with the corresponding Quotes API, allowing access to detailed price and performance information of instruments, as well as basic security identifier cross-reference. For direct access to price histories, please refer to the Time Series API for Digital Portals.  Similar criteria based screener APIs exist for equity instruments and securitized derivatives: See the Stocks API and the Securitized Derivatives API for details.
 *
 * The version of the OpenAPI document: 2
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 *
 */


import ApiClient from "../ApiClient";
import InlineObject from '../model/InlineObject';
import InlineObject1 from '../model/InlineObject1';
import InlineObject2 from '../model/InlineObject2';
import InlineResponse200 from '../model/InlineResponse200';
import InlineResponse2001 from '../model/InlineResponse2001';
import InlineResponse2002 from '../model/InlineResponse2002';
import InlineResponse2003 from '../model/InlineResponse2003';
import InlineResponse2004 from '../model/InlineResponse2004';

/**
* DebtInstrument service.
* @module api/DebtInstrumentApi
*/
export default class DebtInstrumentApi {

    /**
    * Constructs a new DebtInstrumentApi. 
    * @alias module:api/DebtInstrumentApi
    * @class
    * @param {module:ApiClient} [apiClient] Optional API client implementation to use,
    * default to {@link module:ApiClient#instance} if unspecified.
    */
    constructor(apiClient) {
        this.apiClient = apiClient || ApiClient.instance;
    }



    /**
     * Fundamental data for a debt instrument.
     * Fundamental data for a debt instrument; any other instrument yields empty values for debt-instrument-specific attributes. Dates are interpreted in the timezone of the issuer.
     * @param {String} id 
     * @param {Object} opts Optional parameters
     * @param {Array.<String>} opts.attributes Limit the attributes returned in the response to the specified set.
     * @param {String} opts.language 
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with an object containing data of type {@link module:model/InlineResponse200} and HTTP response
     */
    getDebtInstrumentGetWithHttpInfo(id, opts) {
      opts = opts || {};
      let postBody = null;
      // verify the required parameter 'id' is set
      if (id === undefined || id === null) {
        throw new Error("Missing the required parameter 'id' when calling getDebtInstrumentGet");
      }

      let pathParams = {
      };
      let queryParams = {
        'id': id,
        '_attributes': this.apiClient.buildCollectionParam(opts['attributes'], 'csv'),
        '_language': opts['language']
      };
      let headerParams = {
      };
      let formParams = {
      };

      let authNames = ['FactSetApiKey', 'FactSetOAuth2'];
      let contentTypes = [];
      let accepts = ['application/json'];


      let returnType = InlineResponse200;

      return this.apiClient.callApi(
        '/debtInstrument/get', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, null
      );
    }

    /**
     * Fundamental data for a debt instrument.
     * Fundamental data for a debt instrument; any other instrument yields empty values for debt-instrument-specific attributes. Dates are interpreted in the timezone of the issuer.
     * @param {String} id 
     * @param {Object} opts Optional parameters
     * @param {Array.<String>} opts.attributes Limit the attributes returned in the response to the specified set.
     * @param {String} opts.language 
     * @return { Promise.< module:model/InlineResponse200 > } a Promise, with data of type {@link module:model/InlineResponse200 }
     */
    getDebtInstrumentGet(id, opts) {
      return this.getDebtInstrumentGetWithHttpInfo(id, opts)
        .then(function(response_and_data) {
          return response_and_data.data;
        });
    }


    /**
     * Key figures of a debt instrument.
     * Key figures of a debt instrument. The key figures are calculated using delayed prices with an additional delay of 10 minutes after an  update of the debt instrument's price. Special product features such as the right to a maturity extension, an attached option, or convertibility are not considered for the key figure calculation. Further, a calculation is not performed for perpetual products and for products with variable interest rate.
     * @param {String} id 
     * @param {Object} opts Optional parameters
     * @param {Array.<String>} opts.attributes Limit the attributes returned in the response to the specified set.
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with an object containing data of type {@link module:model/InlineResponse2002} and HTTP response
     */
    getDebtInstrumentKeyFiguresNotationGetWithHttpInfo(id, opts) {
      opts = opts || {};
      let postBody = null;
      // verify the required parameter 'id' is set
      if (id === undefined || id === null) {
        throw new Error("Missing the required parameter 'id' when calling getDebtInstrumentKeyFiguresNotationGet");
      }

      let pathParams = {
      };
      let queryParams = {
        'id': id,
        '_attributes': this.apiClient.buildCollectionParam(opts['attributes'], 'csv')
      };
      let headerParams = {
      };
      let formParams = {
      };

      let authNames = ['FactSetApiKey', 'FactSetOAuth2'];
      let contentTypes = [];
      let accepts = ['application/json'];


      let returnType = InlineResponse2002;

      return this.apiClient.callApi(
        '/debtInstrument/keyFigures/notation/get', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, null
      );
    }

    /**
     * Key figures of a debt instrument.
     * Key figures of a debt instrument. The key figures are calculated using delayed prices with an additional delay of 10 minutes after an  update of the debt instrument's price. Special product features such as the right to a maturity extension, an attached option, or convertibility are not considered for the key figure calculation. Further, a calculation is not performed for perpetual products and for products with variable interest rate.
     * @param {String} id 
     * @param {Object} opts Optional parameters
     * @param {Array.<String>} opts.attributes Limit the attributes returned in the response to the specified set.
     * @return { Promise.< module:model/InlineResponse2002 > } a Promise, with data of type {@link module:model/InlineResponse2002 }
     */
    getDebtInstrumentKeyFiguresNotationGet(id, opts) {
      return this.getDebtInstrumentKeyFiguresNotationGetWithHttpInfo(id, opts)
        .then(function(response_and_data) {
          return response_and_data.data;
        });
    }


    /**
     * Search for issuers of debt instruments.
     * Search for issuers of debt instruments. FactSet does not consolidate the data provided by different suppliers, therefore the result may contain more than one identifier for a given issuer. The response is limited to 100 results.
     * @param {Object} opts Optional parameters
     * @param {module:model/InlineObject} opts.inlineObject 
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with an object containing data of type {@link module:model/InlineResponse2001} and HTTP response
     */
    postDebtInstrumentIssuerSearchWithHttpInfo(opts) {
      opts = opts || {};
      let postBody = opts['inlineObject'];

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


      let returnType = InlineResponse2001;

      return this.apiClient.callApi(
        '/debtInstrument/issuer/search', 'POST',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, null
      );
    }

    /**
     * Search for issuers of debt instruments.
     * Search for issuers of debt instruments. FactSet does not consolidate the data provided by different suppliers, therefore the result may contain more than one identifier for a given issuer. The response is limited to 100 results.
     * @param {Object} opts Optional parameters
     * @param {module:model/InlineObject} opts.inlineObject 
     * @return { Promise.< module:model/InlineResponse2001 > } a Promise, with data of type {@link module:model/InlineResponse2001 }
     */
    postDebtInstrumentIssuerSearch(opts) {
      return this.postDebtInstrumentIssuerSearchWithHttpInfo(opts)
        .then(function(response_and_data) {
          return response_and_data.data;
        });
    }


    /**
     * Screener for debt instruments' notations based on debt instrument-specific parameters.
     * Screener for debt instruments' notations based on debt instrument-specific parameters. The result is limited to the notations that satisfy all the selected filters. If more than one notation of an instrument matches the parameters, and no market priority has been specified, only the notation with the highest trading volume, averaged over one month, is considered.
     * @param {Object} opts Optional parameters
     * @param {module:model/InlineObject1} opts.inlineObject1 
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with an object containing data of type {@link module:model/InlineResponse2003} and HTTP response
     */
    postDebtInstrumentNotationScreenerSearchWithHttpInfo(opts) {
      opts = opts || {};
      let postBody = opts['inlineObject1'];

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


      let returnType = InlineResponse2003;

      return this.apiClient.callApi(
        '/debtInstrument/notation/screener/search', 'POST',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, null
      );
    }

    /**
     * Screener for debt instruments' notations based on debt instrument-specific parameters.
     * Screener for debt instruments' notations based on debt instrument-specific parameters. The result is limited to the notations that satisfy all the selected filters. If more than one notation of an instrument matches the parameters, and no market priority has been specified, only the notation with the highest trading volume, averaged over one month, is considered.
     * @param {Object} opts Optional parameters
     * @param {module:model/InlineObject1} opts.inlineObject1 
     * @return { Promise.< module:model/InlineResponse2003 > } a Promise, with data of type {@link module:model/InlineResponse2003 }
     */
    postDebtInstrumentNotationScreenerSearch(opts) {
      return this.postDebtInstrumentNotationScreenerSearchWithHttpInfo(opts)
        .then(function(response_and_data) {
          return response_and_data.data;
        });
    }


    /**
     * Possible values and value ranges for the parameters used in the endpoint `/debtInstrument/notation/screener/search.`
     * The endpoint returns the possible values and value ranges for the parameters used in the endpoint `/debtInstrument/notation/screener/search`. It allows to request the values and value ranges only for a restricted set of notations that match predefined parameters. The functionality may be used to pre-fill the values and value ranges of the parameters of the `/debtInstrument/notation/screener/search` endpoint so that performing a search always leads to a non-empty set of notations. If more than one notation of an instrument matches the parameters, and no market priority has been specified, only the notation with the highest trading volume, averaged over one month, is considered.
     * @param {Object} opts Optional parameters
     * @param {module:model/InlineObject2} opts.inlineObject2 
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with an object containing data of type {@link module:model/InlineResponse2004} and HTTP response
     */
    postDebtInstrumentNotationScreenerValueRangesGetWithHttpInfo(opts) {
      opts = opts || {};
      let postBody = opts['inlineObject2'];

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


      let returnType = InlineResponse2004;

      return this.apiClient.callApi(
        '/debtInstrument/notation/screener/valueRanges/get', 'POST',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, null
      );
    }

    /**
     * Possible values and value ranges for the parameters used in the endpoint `/debtInstrument/notation/screener/search.`
     * The endpoint returns the possible values and value ranges for the parameters used in the endpoint `/debtInstrument/notation/screener/search`. It allows to request the values and value ranges only for a restricted set of notations that match predefined parameters. The functionality may be used to pre-fill the values and value ranges of the parameters of the `/debtInstrument/notation/screener/search` endpoint so that performing a search always leads to a non-empty set of notations. If more than one notation of an instrument matches the parameters, and no market priority has been specified, only the notation with the highest trading volume, averaged over one month, is considered.
     * @param {Object} opts Optional parameters
     * @param {module:model/InlineObject2} opts.inlineObject2 
     * @return { Promise.< module:model/InlineResponse2004 > } a Promise, with data of type {@link module:model/InlineResponse2004 }
     */
    postDebtInstrumentNotationScreenerValueRangesGet(opts) {
      return this.postDebtInstrumentNotationScreenerValueRangesGetWithHttpInfo(opts)
        .then(function(response_and_data) {
          return response_and_data.data;
        });
    }


}





