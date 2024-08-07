/**
 * FactSet Prices API
 * Gain access to comprehensive global coverage for Equities & Fixed Income. Perform quick analytics by controlling the date ranges, currencies, and rolling periods, or simply request Open, High, Low, and Close prices. Easily connect pricing data with other core company data or alternative content sets using FactSet's hub and spoke symbology. <p>Equity and Fund Security types include Common Stock, ADR, GDR, Preferred, Closed-ended Fund, Exchange Traded Fund, Unit, Open-ended Fund, Exchange Traded Fund UVI, Exchange Traded Fund NAV, Preferred Equity, Non-Voting Depositary Receipt/Certificate, Alien/Foreign, Structured Product, and Temporary Instruments. Reference over 180,000+ active and inactive securities.</p><p>Fixed Income Security Types include Corporate Bonds, Treasury and Agency bonds, Government Bonds, and Municipals.</p><p><b>Rate limit is set to 25 requests per second</b>.</p> 
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
import BatchStatusResponse from '../model/BatchStatusResponse';
import ErrorResponse from '../model/ErrorResponse';
import PricesFixedIncomeRequest from '../model/PricesFixedIncomeRequest';
import PricesFixedIncomeResponse from '../model/PricesFixedIncomeResponse';
import PricesRequest from '../model/PricesRequest';
import PricesResponse from '../model/PricesResponse';

/**
* Prices service.
* @module api/PricesApi
*/
export default class PricesApi {

    /**
    * Constructs a new PricesApi. 
    * @alias module:api/PricesApi
    * @class
    * @param {module:ApiClient} [apiClient] Optional API client implementation to use,
    * default to {@link module:ApiClient#instance} if unspecified.
    */
    constructor(apiClient) {
        this.apiClient = apiClient || ApiClient.instance;
    }



    /**
     * Gets pricing for a list of Fixed Income securities
     * Get BID, MID, ASK, and Issuer Entity ID for a list of Fixed Income Securities as of a requested date range. Available for U.S. Corporate, Treasury and Agency bonds, Municipals, and non-U.S. Corporate and Government bonds. To learn more about Fixed Income Prices database, please review [OA:15995](https://my.apps.factset.com/oa/pages/15995) 
     * @param {Array.<String>} ids The requested list of Fixed Income security identifiers. <p>***ids limit** =  2000 per request*</p> *<p>Make note, GET Method URL request lines are also limited to a total length of 8192 bytes (8KB). In cases where the service allows for thousands of ids, which may lead to exceeding this request line limit of 8KB, its advised for any requests with large request lines to be requested through the respective \"POST\" method.</p>*
     * @param {Object} opts Optional parameters
     * @param {String} opts.startDate The start date requested for a given date range in **YYYY-MM-DD** format. If left blank, the API will default to previous close. Future dates (T+1) are not accepted in this endpoint. 
     * @param {String} opts.endDate The end date requested for a given date range in **YYYY-MM-DD** format. If left blank, the API will default to previous close. Future dates (T+1) are not accepted in this endpoint. 
     * @param {module:model/String} opts.frequency Controls the display frequency of the data returned.   * **D** = Daily   * **M** = Monthly, based on the last trading day of the month.   * **AM** = Monthly, based on the start date (e.g., if the start date is June 16, data is displayed for June 16, May 16, April 16 etc.).   * **MTD** = Month-to-date   * **CQ** = Quarterly based on the last trading day of the calendar quarter (March, June, September, or December).   * **CQTD** =  Calendar quarter-to-date   * **AY** = Actual Annual, based on the start date.   * **CY** = Calendar Annual, based on the last trading day of the calendar year.   * **CYTD** = Calendar Year-to-date.  (default to 'D')
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with an object containing data of type {@link module:model/PricesFixedIncomeResponse} and HTTP response
     */
    getFixedSecurityPricesWithHttpInfo(ids, opts) {
      opts = opts || {};
      let postBody = null;
      // verify the required parameter 'ids' is set
      if (ids === undefined || ids === null) {
        throw new Error("Missing the required parameter 'ids' when calling getFixedSecurityPrices");
      }

      let pathParams = {
      };
      let queryParams = {
        'ids': this.apiClient.buildCollectionParam(ids, 'csv'),
        'startDate': opts['startDate'],
        'endDate': opts['endDate'],
        'frequency': opts['frequency']
      };
      let headerParams = {
      };
      let formParams = {
      };

      let authNames = ['FactSetApiKey', 'FactSetOAuth2'];
      let contentTypes = [];
      let accepts = ['application/json'];


      let returnType = PricesFixedIncomeResponse;

      return this.apiClient.callApi(
        '/factset-prices/v1/fixed-income', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, null
      );
    }

    /**
     * Gets pricing for a list of Fixed Income securities
     * Get BID, MID, ASK, and Issuer Entity ID for a list of Fixed Income Securities as of a requested date range. Available for U.S. Corporate, Treasury and Agency bonds, Municipals, and non-U.S. Corporate and Government bonds. To learn more about Fixed Income Prices database, please review [OA:15995](https://my.apps.factset.com/oa/pages/15995) 
     * @param {Array.<String>} ids The requested list of Fixed Income security identifiers. <p>***ids limit** =  2000 per request*</p> *<p>Make note, GET Method URL request lines are also limited to a total length of 8192 bytes (8KB). In cases where the service allows for thousands of ids, which may lead to exceeding this request line limit of 8KB, its advised for any requests with large request lines to be requested through the respective \"POST\" method.</p>*
     * @param {Object} opts Optional parameters
     * @param {String} opts.startDate The start date requested for a given date range in **YYYY-MM-DD** format. If left blank, the API will default to previous close. Future dates (T+1) are not accepted in this endpoint. 
     * @param {String} opts.endDate The end date requested for a given date range in **YYYY-MM-DD** format. If left blank, the API will default to previous close. Future dates (T+1) are not accepted in this endpoint. 
     * @param {module:model/String} opts.frequency Controls the display frequency of the data returned.   * **D** = Daily   * **M** = Monthly, based on the last trading day of the month.   * **AM** = Monthly, based on the start date (e.g., if the start date is June 16, data is displayed for June 16, May 16, April 16 etc.).   * **MTD** = Month-to-date   * **CQ** = Quarterly based on the last trading day of the calendar quarter (March, June, September, or December).   * **CQTD** =  Calendar quarter-to-date   * **AY** = Actual Annual, based on the start date.   * **CY** = Calendar Annual, based on the last trading day of the calendar year.   * **CYTD** = Calendar Year-to-date.  (default to 'D')
     * @return { Promise.< module:model/PricesFixedIncomeResponse > } a Promise, with data of type {@link module:model/PricesFixedIncomeResponse }
     */
    getFixedSecurityPrices(ids, opts) {
      return this.getFixedSecurityPricesWithHttpInfo(ids, opts)
        .then(function(response_and_data) {
          return response_and_data.data;
        });
    }


    /**
     * Requests pricing for a list of Fixed Income securities for date range requested
     * Get BID, MID, ASK, and Issuer Entity ID for a list of Fixed Income Securities as of a requested date range. Available for U.S. Corporate, Treasury and Agency bonds, Municipals, and non-U.S. Corporate and Government bonds. To learn more about Fixed Income Prices database, please review [OA:15995](https://my.apps.factset.com/oa/pages/15995) 
     * @param {module:model/PricesFixedIncomeRequest} pricesFixedIncomeRequest Request object for Fixed Income `Security` prices.
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with an object containing data of type {@link module:model/PricesFixedIncomeResponse} and HTTP response
     */
    getFixedSecurityPricesForListWithHttpInfo(pricesFixedIncomeRequest) {
      let postBody = pricesFixedIncomeRequest;
      // verify the required parameter 'pricesFixedIncomeRequest' is set
      if (pricesFixedIncomeRequest === undefined || pricesFixedIncomeRequest === null) {
        throw new Error("Missing the required parameter 'pricesFixedIncomeRequest' when calling getFixedSecurityPricesForList");
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


      let returnType = PricesFixedIncomeResponse;

      return this.apiClient.callApi(
        '/factset-prices/v1/fixed-income', 'POST',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, null
      );
    }

    /**
     * Requests pricing for a list of Fixed Income securities for date range requested
     * Get BID, MID, ASK, and Issuer Entity ID for a list of Fixed Income Securities as of a requested date range. Available for U.S. Corporate, Treasury and Agency bonds, Municipals, and non-U.S. Corporate and Government bonds. To learn more about Fixed Income Prices database, please review [OA:15995](https://my.apps.factset.com/oa/pages/15995) 
     * @param {module:model/PricesFixedIncomeRequest} pricesFixedIncomeRequest Request object for Fixed Income `Security` prices.
     * @return { Promise.< module:model/PricesFixedIncomeResponse > } a Promise, with data of type {@link module:model/PricesFixedIncomeResponse }
     */
    getFixedSecurityPricesForList(pricesFixedIncomeRequest) {
      return this.getFixedSecurityPricesForListWithHttpInfo(pricesFixedIncomeRequest)
        .then(function(response_and_data) {
          return response_and_data.data;
        });
    }


    /**
     * Gets end-of-day Open, High, Low, Close for a list of securities.
     * Gets security prices, Open, High, Low, Close, Volume, and currency for a specified date range and frequency. Prices are updated and at different times across the different regions around the globe. The Prices API automatically defaults relative price dates to the local region which is determined by the local region of the requested security id. To learn more about relative dates please visit [OA Page 4627](https://my.apps.factset.com/oa/pages/4627)  *_/prices* endpoint currently supports Long Running asynchronous requests up to **10 minutes** via `batch` parameter. **Additional Approvals needed for access**. Id limits increased to **5000 ids** per request using batch parameter. 
     * @param {Array.<String>} ids The requested list of security identifiers. Accepted ID types include Market Tickers, SEDOL, ISINs, CUSIPs, or FactSet Permanent Ids.<p>***ids limit** =  2000 per non-batch request / 5000 per batch request*</p> *<p>Make note, GET Method URL request lines are also limited to a total length of 8192 bytes (8KB). In cases where the service allows for thousands of ids, which may lead to exceeding this request line limit of 8KB, its advised for any requests with large request lines to be requested through the respective \"POST\" method.</p>*
     * @param {Object} opts Optional parameters
     * @param {String} opts.startDate The start date requested for a given date range in **YYYY-MM-DD** format. If left blank, the API will default to previous close. Future dates (T+1) are not accepted in this endpoint. 
     * @param {String} opts.endDate The end date requested for a given date range in **YYYY-MM-DD** format. If left blank, the API will default to previous close. Future dates (T+1) are not accepted in this endpoint. 
     * @param {module:model/String} opts.frequency Controls the display frequency of the data returned.   * **D** = Daily   * **W** = Weekly, based on the last day of the week of the start date.   * **M** = Monthly, based on the last trading day of the month.   * **AM** = Monthly, based on the start date (e.g., if the start date is June 16, data is displayed for June 16, May 16, April 16 etc.).   * **CQ** = Quarterly based on the last trading day of the calendar quarter (March, June, September, or December).   * **FQ** = Fiscal Quarter of the company.   * **AY** = Actual Annual, based on the start date.   * **CY** = Calendar Annual, based on the last trading day of the calendar year.   * **FY** = Fiscal Annual, based on the last trading day of the company's fiscal year.  (default to 'D')
     * @param {module:model/String} opts.calendar Calendar of data returned. SEVENDAY includes weekends. LOCAL calendar will default to the securities' trading calendar which excludes date records for respective holiday periods. (default to 'FIVEDAY')
     * @param {String} opts.currency Currency code for adjusting prices. Default is Local. For a list of currency ISO codes, visit [Online Assistant Page 1470](https://oa.apps.factset.com/pages/1470).
     * @param {module:model/String} opts.adjust Controls the split, spinoff, and dividend adjustments for the prices. <p>For more information, visit [Online Assistant Page 614](https://oa.apps.factset.com/pages/614)</p>   * **SPLIT** = Split ONLY Adjusted. This is used by default.   * **SPINOFF** = Splits & Spinoff Adjusted.   * **DIVADJ** = Splits, Spinoffs, and Dividends adjusted.   * **UNSPLIT** = No Adjustments.  (default to 'SPLIT')
     * @param {module:model/String} opts.batch Enables the ability to asynchronously \"batch\" the request, supporting a long-running request up to **10 minutes**. Upon requesting batch=Y, the service will respond back with an HTTP Status Code of 202.  **Additional Access Required. To gain access to this feature, reach out to your FactSet Account team or \"Report Issue\" above and our support teams can assist.**  Once a batch request is submitted, use `batch/v1/status` to see if the job has completed. Once completed, retrieve the results of the request via `batch/v1/result`.  When using Batch, `ids` limit is increased to **5000** ids per request, though limits on query string via GET method still apply. It's advised to submit large lists of ids via POST method.  (default to 'N')
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with an object containing data of type {@link module:model/PricesResponse} and HTTP response
     */
    getSecurityPricesWithHttpInfo(ids, opts) {
      opts = opts || {};
      let postBody = null;
      // verify the required parameter 'ids' is set
      if (ids === undefined || ids === null) {
        throw new Error("Missing the required parameter 'ids' when calling getSecurityPrices");
      }

      let pathParams = {
      };
      let queryParams = {
        'ids': this.apiClient.buildCollectionParam(ids, 'csv'),
        'startDate': opts['startDate'],
        'endDate': opts['endDate'],
        'frequency': opts['frequency'],
        'calendar': opts['calendar'],
        'currency': opts['currency'],
        'adjust': opts['adjust'],
        'batch': opts['batch']
      };
      let headerParams = {
      };
      let formParams = {
      };

      let authNames = ['FactSetApiKey', 'FactSetOAuth2'];
      let contentTypes = [];
      let accepts = ['application/json'];

      let returnType = GetSecurityPricesResponseWrapperTypeMap;
      
      return this.apiClient.callApi(
        '/factset-prices/v1/prices', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, null
      );
    }

    /**
     * Gets end-of-day Open, High, Low, Close for a list of securities.
     * Gets security prices, Open, High, Low, Close, Volume, and currency for a specified date range and frequency. Prices are updated and at different times across the different regions around the globe. The Prices API automatically defaults relative price dates to the local region which is determined by the local region of the requested security id. To learn more about relative dates please visit [OA Page 4627](https://my.apps.factset.com/oa/pages/4627)  *_/prices* endpoint currently supports Long Running asynchronous requests up to **10 minutes** via `batch` parameter. **Additional Approvals needed for access**. Id limits increased to **5000 ids** per request using batch parameter. 
     * @param {Array.<String>} ids The requested list of security identifiers. Accepted ID types include Market Tickers, SEDOL, ISINs, CUSIPs, or FactSet Permanent Ids.<p>***ids limit** =  2000 per non-batch request / 5000 per batch request*</p> *<p>Make note, GET Method URL request lines are also limited to a total length of 8192 bytes (8KB). In cases where the service allows for thousands of ids, which may lead to exceeding this request line limit of 8KB, its advised for any requests with large request lines to be requested through the respective \"POST\" method.</p>*
     * @param {Object} opts Optional parameters
     * @param {String} opts.startDate The start date requested for a given date range in **YYYY-MM-DD** format. If left blank, the API will default to previous close. Future dates (T+1) are not accepted in this endpoint. 
     * @param {String} opts.endDate The end date requested for a given date range in **YYYY-MM-DD** format. If left blank, the API will default to previous close. Future dates (T+1) are not accepted in this endpoint. 
     * @param {module:model/String} opts.frequency Controls the display frequency of the data returned.   * **D** = Daily   * **W** = Weekly, based on the last day of the week of the start date.   * **M** = Monthly, based on the last trading day of the month.   * **AM** = Monthly, based on the start date (e.g., if the start date is June 16, data is displayed for June 16, May 16, April 16 etc.).   * **CQ** = Quarterly based on the last trading day of the calendar quarter (March, June, September, or December).   * **FQ** = Fiscal Quarter of the company.   * **AY** = Actual Annual, based on the start date.   * **CY** = Calendar Annual, based on the last trading day of the calendar year.   * **FY** = Fiscal Annual, based on the last trading day of the company's fiscal year.  (default to 'D')
     * @param {module:model/String} opts.calendar Calendar of data returned. SEVENDAY includes weekends. LOCAL calendar will default to the securities' trading calendar which excludes date records for respective holiday periods. (default to 'FIVEDAY')
     * @param {String} opts.currency Currency code for adjusting prices. Default is Local. For a list of currency ISO codes, visit [Online Assistant Page 1470](https://oa.apps.factset.com/pages/1470).
     * @param {module:model/String} opts.adjust Controls the split, spinoff, and dividend adjustments for the prices. <p>For more information, visit [Online Assistant Page 614](https://oa.apps.factset.com/pages/614)</p>   * **SPLIT** = Split ONLY Adjusted. This is used by default.   * **SPINOFF** = Splits & Spinoff Adjusted.   * **DIVADJ** = Splits, Spinoffs, and Dividends adjusted.   * **UNSPLIT** = No Adjustments.  (default to 'SPLIT')
     * @param {module:model/String} opts.batch Enables the ability to asynchronously \"batch\" the request, supporting a long-running request up to **10 minutes**. Upon requesting batch=Y, the service will respond back with an HTTP Status Code of 202.  **Additional Access Required. To gain access to this feature, reach out to your FactSet Account team or \"Report Issue\" above and our support teams can assist.**  Once a batch request is submitted, use `batch/v1/status` to see if the job has completed. Once completed, retrieve the results of the request via `batch/v1/result`.  When using Batch, `ids` limit is increased to **5000** ids per request, though limits on query string via GET method still apply. It's advised to submit large lists of ids via POST method.  (default to 'N')
     * @return { Promise.< GetSecurityPricesResponseWrapper > } a Promise, with data of type {@link GetSecurityPricesResponseWrapper }
     */
    getSecurityPrices(ids, opts) {
      return this.getSecurityPricesWithHttpInfo(ids, opts)
        .then(function(response_and_data) {
          return response_and_data.data;
        });
    }


    /**
     * Requests end-of-day Open, High, Low, Close for a large list of securities.
     *  Gets security prices, Open, High, Low, Close, Volume, and currency for a specified date range and frequency.  *_/prices* endpoint currently supports Long Running asynchronous requests up to **10 minutes** via `batch` parameter. **Additional Approvals needed for access**. Id limits increased to **5000 ids** per request using batch parameter. 
     * @param {module:model/PricesRequest} pricesRequest Request object for `Security` prices.
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with an object containing data of type {@link module:model/PricesResponse} and HTTP response
     */
    getSecurityPricesForListWithHttpInfo(pricesRequest) {
      let postBody = pricesRequest;
      // verify the required parameter 'pricesRequest' is set
      if (pricesRequest === undefined || pricesRequest === null) {
        throw new Error("Missing the required parameter 'pricesRequest' when calling getSecurityPricesForList");
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

      let returnType = GetSecurityPricesForListResponseWrapperTypeMap;
      
      return this.apiClient.callApi(
        '/factset-prices/v1/prices', 'POST',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, null
      );
    }

    /**
     * Requests end-of-day Open, High, Low, Close for a large list of securities.
     *  Gets security prices, Open, High, Low, Close, Volume, and currency for a specified date range and frequency.  *_/prices* endpoint currently supports Long Running asynchronous requests up to **10 minutes** via `batch` parameter. **Additional Approvals needed for access**. Id limits increased to **5000 ids** per request using batch parameter. 
     * @param {module:model/PricesRequest} pricesRequest Request object for `Security` prices.
     * @return { Promise.< GetSecurityPricesForListResponseWrapper > } a Promise, with data of type {@link GetSecurityPricesForListResponseWrapper }
     */
    getSecurityPricesForList(pricesRequest) {
      return this.getSecurityPricesForListWithHttpInfo(pricesRequest)
        .then(function(response_and_data) {
          return response_and_data.data;
        });
    }


}


const GetSecurityPricesResponseWrapperTypeMap = {
  200: PricesResponse,
  202: BatchStatusResponse,
  400: ErrorResponse,
  401: ErrorResponse,
  403: ErrorResponse,
  415: ErrorResponse,
  500: ErrorResponse,

  _createResponseWrapper(statusCode, response) {
    return new GetSecurityPricesResponseWrapper(statusCode, response);
  }
};

const GetSecurityPricesForListResponseWrapperTypeMap = {
  200: PricesResponse,
  202: BatchStatusResponse,
  400: ErrorResponse,
  401: ErrorResponse,
  403: ErrorResponse,
  415: ErrorResponse,
  500: ErrorResponse,

  _createResponseWrapper(statusCode, response) {
    return new GetSecurityPricesForListResponseWrapper(statusCode, response);
  }
};



/**
 * Wrapper to support GET /factset-prices/v1/prices returning different types
 * per status code.
 *
 * <p>
 * Responses:
 * <ul>
 *   <li>200 : {@code PricesResponse }<br>Array of security prices open, high, low, close, and volume.</li>
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
 *     PricesResponse data200 = response.getResponse200();
 *     break;
 *   case 202:
 *     BatchStatusResponse data202 = response.getResponse202();
 *     break;
 *  }
 * }</pre>
 *
 * @alias module:GetSecurityPricesResponseWrapper
 * @class
 */
export class GetSecurityPricesResponseWrapper {

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
   * @returns { PricesResponse }
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
 * Wrapper to support POST /factset-prices/v1/prices returning different types
 * per status code.
 *
 * <p>
 * Responses:
 * <ul>
 *   <li>200 : {@code PricesResponse }<br>Array of security prices</li>
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
 *     PricesResponse data200 = response.getResponse200();
 *     break;
 *   case 202:
 *     BatchStatusResponse data202 = response.getResponse202();
 *     break;
 *  }
 * }</pre>
 *
 * @alias module:GetSecurityPricesForListResponseWrapper
 * @class
 */
export class GetSecurityPricesForListResponseWrapper {

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
   * @returns { PricesResponse }
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


