/**
 * FactSet Global Prices API
 * The FactSet Global Prices API provides end of day market pricing content using cloud and microservices technology, encompassing both pricing as well as corporate actions and events data.</p> 
 *
 * The version of the OpenAPI document: 1.7.0
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
import ReturnsRequest from '../model/ReturnsRequest';
import ReturnsResponse from '../model/ReturnsResponse';

/**
* Returns service.
* @module api/ReturnsApi
*/
export default class ReturnsApi {

    /**
    * Constructs a new ReturnsApi. 
    * @alias module:api/ReturnsApi
    * @class
    * @param {module:ApiClient} [apiClient] Optional API client implementation to use,
    * default to {@link module:ApiClient#instance} if unspecified.
    */
    constructor(apiClient) {
        this.apiClient = apiClient || ApiClient.instance;
    }



    /**
     * Gets Returns for a list of `ids` as of given date range.
     * Returns for the requested ids and currency for the given dates. Depending on the input parameters the return data is provided.  
     * @param {Array.<String>} ids The requested list of security identifiers. Accepted ID types include Market Tickers, SEDOL, ISINs, CUSIPs, or FactSet Permanent Ids.<p>***ids limit** =  50 per both non-batch request and batch request*</p> *<p>Make note, GET Method URL request lines are also limited to a total length of 8192 bytes (8KB). In cases where the service allows for thousands of ids, which may lead to exceeding this request line limit of 8KB, it's advised for any requests with large request lines to be requested through the respective \"POST\" method.</p>*
     * @param {String} startDate The start date requested for a given date range in **YYYY-MM-DD** format. The input start date must be before the input end date. Future dates (T+1) are not accepted in this endpoint. 
     * @param {Object} opts Optional parameters
     * @param {String} opts.endDate The end date requested for a given date range in **YYYY-MM-DD** format. The input end date must be after the input start date. Future dates (T+1) are not accepted in this endpoint. 
     * @param {String} opts.currency Currency code for adjusting prices. Default is Local. For a list of currency ISO codes, visit [Online Assistant Page 1470](https://oa.apps.factset.com/pages/1470).
     * @param {module:model/String} opts.frequency Controls the display frequency of the data returned.   * **D** = Daily   * **AD** = Actual Daily   * **W** = Weekly, based on the last day of the week of the start date.   * **M** = Monthly, based on the last trading day of the month.   * **AM** = Monthly, based on the start date (e.g., if the start date is June 16, data is displayed for June 16, May 16, April 16 etc.).   * **AQ** =  Actual Quarterly   * **CQ** = Quarterly based on the last trading day of the calendar quarter (March, June, September, or December).   * **ASA** = Actual Semi-annual   * **CSA** = Calendar Semi-annual   * **AY** = Actual Annual, based on the start date.   * **CY** = Calendar Annual, based on the last trading day of the calendar year.     (default to 'D')
     * @param {module:model/String} opts.dividendAdjust Controls the dividend reinvestment for the returns calculation.   * **PRICE** = Price Change - Dividends Excluded.   * **EXDATE** = Simple Return - Dividends Received on exdate but not reinvested.   * **PAYDATE** = Simple Return - Dividends Received on paydate but not reinvested.   * **EXDATE_C** = Compound Return - Dividends reinvested on exdate.   * **PAYDATE_C** = Compound Return - Dividends reinvested on paydate.      (default to 'EXDATE_C')
     * @param {module:model/String} opts.batch Enables the ability to asynchronously \"batch\" the request, supporting a long-running request for up to 20 minutes. Upon requesting batch=Y, the service will respond with an HTTP Status Code of 202. Once a batch request is submitted, use batch status to see if the job has been completed. Once completed, retrieve the results of the request via batch-result. When using Batch, ids limit is increased to 10000 ids per request, though limits on query string via GET method still apply. It's advised to submit large lists of ids via POST method. <B>Please note that the number of unique currencies present in the requested ids is limited to 50 per request.</B>  (default to 'N')
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with an object containing data of type {@link module:model/ReturnsResponse} and HTTP response
     */
    getReturnsWithHttpInfo(ids, startDate, opts) {
      opts = opts || {};
      let postBody = null;
      // verify the required parameter 'ids' is set
      if (ids === undefined || ids === null) {
        throw new Error("Missing the required parameter 'ids' when calling getReturns");
      }
      // verify the required parameter 'startDate' is set
      if (startDate === undefined || startDate === null) {
        throw new Error("Missing the required parameter 'startDate' when calling getReturns");
      }

      let pathParams = {
      };
      let queryParams = {
        'ids': this.apiClient.buildCollectionParam(ids, 'csv'),
        'startDate': startDate,
        'endDate': opts['endDate'],
        'currency': opts['currency'],
        'frequency': opts['frequency'],
        'dividendAdjust': opts['dividendAdjust'],
        'batch': opts['batch']
      };
      let headerParams = {
      };
      let formParams = {
      };

      let authNames = ['FactSetApiKey', 'FactSetOAuth2'];
      let contentTypes = [];
      let accepts = ['application/json'];

      let returnType = GetReturnsResponseWrapperTypeMap;
      
      return this.apiClient.callApi(
        '/factset-global-prices/v1/returns', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, null
      );
    }

    /**
     * Gets Returns for a list of `ids` as of given date range.
     * Returns for the requested ids and currency for the given dates. Depending on the input parameters the return data is provided.  
     * @param {Array.<String>} ids The requested list of security identifiers. Accepted ID types include Market Tickers, SEDOL, ISINs, CUSIPs, or FactSet Permanent Ids.<p>***ids limit** =  50 per both non-batch request and batch request*</p> *<p>Make note, GET Method URL request lines are also limited to a total length of 8192 bytes (8KB). In cases where the service allows for thousands of ids, which may lead to exceeding this request line limit of 8KB, it's advised for any requests with large request lines to be requested through the respective \"POST\" method.</p>*
     * @param {String} startDate The start date requested for a given date range in **YYYY-MM-DD** format. The input start date must be before the input end date. Future dates (T+1) are not accepted in this endpoint. 
     * @param {Object} opts Optional parameters
     * @param {String} opts.endDate The end date requested for a given date range in **YYYY-MM-DD** format. The input end date must be after the input start date. Future dates (T+1) are not accepted in this endpoint. 
     * @param {String} opts.currency Currency code for adjusting prices. Default is Local. For a list of currency ISO codes, visit [Online Assistant Page 1470](https://oa.apps.factset.com/pages/1470).
     * @param {module:model/String} opts.frequency Controls the display frequency of the data returned.   * **D** = Daily   * **AD** = Actual Daily   * **W** = Weekly, based on the last day of the week of the start date.   * **M** = Monthly, based on the last trading day of the month.   * **AM** = Monthly, based on the start date (e.g., if the start date is June 16, data is displayed for June 16, May 16, April 16 etc.).   * **AQ** =  Actual Quarterly   * **CQ** = Quarterly based on the last trading day of the calendar quarter (March, June, September, or December).   * **ASA** = Actual Semi-annual   * **CSA** = Calendar Semi-annual   * **AY** = Actual Annual, based on the start date.   * **CY** = Calendar Annual, based on the last trading day of the calendar year.     (default to 'D')
     * @param {module:model/String} opts.dividendAdjust Controls the dividend reinvestment for the returns calculation.   * **PRICE** = Price Change - Dividends Excluded.   * **EXDATE** = Simple Return - Dividends Received on exdate but not reinvested.   * **PAYDATE** = Simple Return - Dividends Received on paydate but not reinvested.   * **EXDATE_C** = Compound Return - Dividends reinvested on exdate.   * **PAYDATE_C** = Compound Return - Dividends reinvested on paydate.      (default to 'EXDATE_C')
     * @param {module:model/String} opts.batch Enables the ability to asynchronously \"batch\" the request, supporting a long-running request for up to 20 minutes. Upon requesting batch=Y, the service will respond with an HTTP Status Code of 202. Once a batch request is submitted, use batch status to see if the job has been completed. Once completed, retrieve the results of the request via batch-result. When using Batch, ids limit is increased to 10000 ids per request, though limits on query string via GET method still apply. It's advised to submit large lists of ids via POST method. <B>Please note that the number of unique currencies present in the requested ids is limited to 50 per request.</B>  (default to 'N')
     * @return { Promise.< GetReturnsResponseWrapper > } a Promise, with data of type {@link GetReturnsResponseWrapper }
     */
    getReturns(ids, startDate, opts) {
      return this.getReturnsWithHttpInfo(ids, startDate, opts)
        .then(function(response_and_data) {
          return response_and_data.data;
        });
    }


    /**
     * Gets Returns for a list of `ids` as of given date range.
     * Returns for the requested ids and currency for the given dates. Depending on the input parameters the return data is provided.
     * @param {module:model/ReturnsRequest} returnsRequest Request object for `Returns`.
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with an object containing data of type {@link module:model/ReturnsResponse} and HTTP response
     */
    getReturnsForListWithHttpInfo(returnsRequest) {
      let postBody = returnsRequest;
      // verify the required parameter 'returnsRequest' is set
      if (returnsRequest === undefined || returnsRequest === null) {
        throw new Error("Missing the required parameter 'returnsRequest' when calling getReturnsForList");
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

      let returnType = GetReturnsForListResponseWrapperTypeMap;
      
      return this.apiClient.callApi(
        '/factset-global-prices/v1/returns', 'POST',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, null
      );
    }

    /**
     * Gets Returns for a list of `ids` as of given date range.
     * Returns for the requested ids and currency for the given dates. Depending on the input parameters the return data is provided.
     * @param {module:model/ReturnsRequest} returnsRequest Request object for `Returns`.
     * @return { Promise.< GetReturnsForListResponseWrapper > } a Promise, with data of type {@link GetReturnsForListResponseWrapper }
     */
    getReturnsForList(returnsRequest) {
      return this.getReturnsForListWithHttpInfo(returnsRequest)
        .then(function(response_and_data) {
          return response_and_data.data;
        });
    }


}


const GetReturnsResponseWrapperTypeMap = {
  200: ReturnsResponse,
  202: BatchStatusResponse,
  400: ErrorResponse,
  401: ErrorResponse,
  403: ErrorResponse,
  415: ErrorResponse,
  500: ErrorResponse,

  _createResponseWrapper(statusCode, response) {
    return new GetReturnsResponseWrapper(statusCode, response);
  }
};

const GetReturnsForListResponseWrapperTypeMap = {
  200: ReturnsResponse,
  202: BatchStatusResponse,
  400: ErrorResponse,
  401: ErrorResponse,
  403: ErrorResponse,
  415: ErrorResponse,
  500: ErrorResponse,

  _createResponseWrapper(statusCode, response) {
    return new GetReturnsForListResponseWrapper(statusCode, response);
  }
};



/**
 * Wrapper to support GET /factset-global-prices/v1/returns returning different types
 * per status code.
 *
 * <p>
 * Responses:
 * <ul>
 *   <li>200 : {@code ReturnsResponse }<br>Array of Returns Objects</li>
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
 *     ReturnsResponse data200 = response.getResponse200();
 *     break;
 *   case 202:
 *     BatchStatusResponse data202 = response.getResponse202();
 *     break;
 *  }
 * }</pre>
 *
 * @alias module:GetReturnsResponseWrapper
 * @class
 */
export class GetReturnsResponseWrapper {

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
   * @returns { ReturnsResponse }
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

/**
 * Wrapper to support POST /factset-global-prices/v1/returns returning different types
 * per status code.
 *
 * <p>
 * Responses:
 * <ul>
 *   <li>200 : {@code ReturnsResponse }<br>Array of security prices</li>
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
 *     ReturnsResponse data200 = response.getResponse200();
 *     break;
 *   case 202:
 *     BatchStatusResponse data202 = response.getResponse202();
 *     break;
 *  }
 * }</pre>
 *
 * @alias module:GetReturnsForListResponseWrapper
 * @class
 */
export class GetReturnsForListResponseWrapper {

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
   * @returns { ReturnsResponse }
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


