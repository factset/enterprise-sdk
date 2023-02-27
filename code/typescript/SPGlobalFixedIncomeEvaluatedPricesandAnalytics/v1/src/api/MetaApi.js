/**
 * S&P Global Fixed Income Evaluated Prices & Analytics API
 * Gain access to evaluated pricing and analytics data for Corporate Bonds, Municipal Bonds and Asset Backed Securities provided by S&P Global (formerly IHS Markit) .  Data returned through multiple endpoints like prices, spread, yield, yield curve, sensitivity, coupon information, securities metadata and details specific to the Asset Backed Securities. 
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
import BondMetaRequest from '../model/BondMetaRequest';
import BondMetaResponse from '../model/BondMetaResponse';
import ErrorResponse from '../model/ErrorResponse';

/**
* Meta service.
* @module api/MetaApi
*/
export default class MetaApi {

    /**
    * Constructs a new MetaApi. 
    * @alias module:api/MetaApi
    * @class
    * @param {module:ApiClient} [apiClient] Optional API client implementation to use,
    * default to {@link module:ApiClient#instance} if unspecified.
    */
    constructor(apiClient) {
        this.apiClient = apiClient || ApiClient.instance;
    }



    /**
     * Get bond meta data for a list of securities.
     * Get bond metadata like classification, maturity date, symbology information like isin, cusip, vendorid, ticker, issue and issuer name provided by Markit for a list of securities. 
     * @param {Array.<String>} ids Security or Entity identifiers. FactSet Identifiers, tickers, CUSIP, ISIN and SEDOL are accepted as input. <p>***ids limit** = 2000  per request*</p> *<p>Make note, GET Method URL request lines are also limited to a total length of 8192 bytes (8KB). In cases where the service allows for thousands of ids, which may lead to exceeding this request line limit of 8KB, its advised for any requests with large request lines to be requested through the respective \"POST\" method.</p>* 
     * @param {Object} opts Optional parameters
     * @param {String} opts.startDate The start date requested for a given date range in **YYYY-MM-DD** format. If left blank, the API will default to previous close. Future dates (T+1) are not accepted in this endpoint. 
     * @param {String} opts.endDate The end date requested for a given date range in **YYYY-MM-DD** format. If left blank, the API will default to previous close. Future dates (T+1) are not accepted in this endpoint. 
     * @param {module:model/String} opts.frequency Controls the display frequency of the data returned.   * **D** = Daily   * **W** = Weekly, based on the last day of the week of the start date.   * **M** = Monthly, based on the last trading day of the month.   * **AM** = Monthly, based on the start date (e.g., if the start date is June 16, data is displayed for June 16, May 16, April 16 etc.).   * **CQ** = Quarterly based on the last trading day of the calendar quarter (March, June, September, or December).   * **FQ** = Fiscal Quarter of the company.   * **AY** = Actual Annual, based on the start date.   * **CY** = Calendar Annual, based on the last trading day of the calendar year.   * **FY** = Fiscal Annual, based on the last trading day of the company's fiscal year.  (default to 'D')
     * @param {module:model/String} opts.calendar Calendar of data returned. SEVENDAY includes weekends. LOCAL calendar will default to the securities' trading calendar which excludes date records for respective holiday periods. (default to 'FIVEDAY')
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with an object containing data of type {@link module:model/BondMetaResponse} and HTTP response
     */
    getBondMetaWithHttpInfo(ids, opts) {
      opts = opts || {};
      let postBody = null;
      // verify the required parameter 'ids' is set
      if (ids === undefined || ids === null) {
        throw new Error("Missing the required parameter 'ids' when calling getBondMeta");
      }

      let pathParams = {
      };
      let queryParams = {
        'ids': this.apiClient.buildCollectionParam(ids, 'csv'),
        'startDate': opts['startDate'],
        'endDate': opts['endDate'],
        'frequency': opts['frequency'],
        'calendar': opts['calendar']
      };
      let headerParams = {
      };
      let formParams = {
      };

      let authNames = ['FactSetApiKey', 'FactSetOAuth2'];
      let contentTypes = [];
      let accepts = ['application/json'];


      let returnType = BondMetaResponse;

      return this.apiClient.callApi(
        '/markit-bond-prices-and-analytics/v1/meta', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, null
      );
    }

    /**
     * Get bond meta data for a list of securities.
     * Get bond metadata like classification, maturity date, symbology information like isin, cusip, vendorid, ticker, issue and issuer name provided by Markit for a list of securities. 
     * @param {Array.<String>} ids Security or Entity identifiers. FactSet Identifiers, tickers, CUSIP, ISIN and SEDOL are accepted as input. <p>***ids limit** = 2000  per request*</p> *<p>Make note, GET Method URL request lines are also limited to a total length of 8192 bytes (8KB). In cases where the service allows for thousands of ids, which may lead to exceeding this request line limit of 8KB, its advised for any requests with large request lines to be requested through the respective \"POST\" method.</p>* 
     * @param {Object} opts Optional parameters
     * @param {String} opts.startDate The start date requested for a given date range in **YYYY-MM-DD** format. If left blank, the API will default to previous close. Future dates (T+1) are not accepted in this endpoint. 
     * @param {String} opts.endDate The end date requested for a given date range in **YYYY-MM-DD** format. If left blank, the API will default to previous close. Future dates (T+1) are not accepted in this endpoint. 
     * @param {module:model/String} opts.frequency Controls the display frequency of the data returned.   * **D** = Daily   * **W** = Weekly, based on the last day of the week of the start date.   * **M** = Monthly, based on the last trading day of the month.   * **AM** = Monthly, based on the start date (e.g., if the start date is June 16, data is displayed for June 16, May 16, April 16 etc.).   * **CQ** = Quarterly based on the last trading day of the calendar quarter (March, June, September, or December).   * **FQ** = Fiscal Quarter of the company.   * **AY** = Actual Annual, based on the start date.   * **CY** = Calendar Annual, based on the last trading day of the calendar year.   * **FY** = Fiscal Annual, based on the last trading day of the company's fiscal year.  (default to 'D')
     * @param {module:model/String} opts.calendar Calendar of data returned. SEVENDAY includes weekends. LOCAL calendar will default to the securities' trading calendar which excludes date records for respective holiday periods. (default to 'FIVEDAY')
     * @return { Promise.< module:model/BondMetaResponse > } a Promise, with data of type {@link module:model/BondMetaResponse }
     */
    getBondMeta(ids, opts) {
      return this.getBondMetaWithHttpInfo(ids, opts)
        .then(function(response_and_data) {
          return response_and_data.data;
        });
    }


    /**
     * Get bond meta data for a list of securities.
     * Get bond metadata like classification, maturity date, symbology information like isin, cusip, vendorid, ticker, issue and issuer name provided by Markit for a list of securities. 
     * @param {module:model/BondMetaRequest} bondMetaRequest Request object for requesting meta data
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with an object containing data of type {@link module:model/BondMetaResponse} and HTTP response
     */
    getBondMetaForListWithHttpInfo(bondMetaRequest) {
      let postBody = bondMetaRequest;
      // verify the required parameter 'bondMetaRequest' is set
      if (bondMetaRequest === undefined || bondMetaRequest === null) {
        throw new Error("Missing the required parameter 'bondMetaRequest' when calling getBondMetaForList");
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


      let returnType = BondMetaResponse;

      return this.apiClient.callApi(
        '/markit-bond-prices-and-analytics/v1/meta', 'POST',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, null
      );
    }

    /**
     * Get bond meta data for a list of securities.
     * Get bond metadata like classification, maturity date, symbology information like isin, cusip, vendorid, ticker, issue and issuer name provided by Markit for a list of securities. 
     * @param {module:model/BondMetaRequest} bondMetaRequest Request object for requesting meta data
     * @return { Promise.< module:model/BondMetaResponse > } a Promise, with data of type {@link module:model/BondMetaResponse }
     */
    getBondMetaForList(bondMetaRequest) {
      return this.getBondMetaForListWithHttpInfo(bondMetaRequest)
        .then(function(response_and_data) {
          return response_and_data.data;
        });
    }


}




