/**
 * FactSet Fundamentals API
 * Gain access to current, comprehensive, and comparative information on securities in worldwide developed and emerging markets. Composed of annual and interim/quarterly data, detailed historical financial statement content, per-share data, and calculated ratios, FactSet Fundamentals provides you with the information you need for a global investment perspective.<p>This API is rate-limited to 10 requests per second and 10 concurrent requests per user.</p> 
 *
 * The version of the OpenAPI document: 2.2.0
 * Contact: api@factset.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 *
 */


import ApiClient from "../ApiClient";
import CompanyFundamentalsResponse from '../model/CompanyFundamentalsResponse';
import ErrorResponse from '../model/ErrorResponse';
import FinancialResponse from '../model/FinancialResponse';
import ProfileResponse from '../model/ProfileResponse';

/**
* CompanyReports service.
* @module api/CompanyReportsApi
*/
export default class CompanyReportsApi {

    /**
    * Constructs a new CompanyReportsApi. 
    * @alias module:api/CompanyReportsApi
    * @class
    * @param {module:ApiClient} [apiClient] Optional API client implementation to use,
    * default to {@link module:ApiClient#instance} if unspecified.
    */
    constructor(apiClient) {
        this.apiClient = apiClient || ApiClient.instance;
    }



    /**
     * Returns company profile information for a specified list of identifiers.
     * Retrieves a comprehensive overview of key profile details and information of specified list of identifiers. The response includes the company name, address, industry, sector, number of employees, CEO, business summary, exchange, market capitalization, shares outstanding, P/E ratio, year founded, and other details. All values provided in the response are absolute. 
     * @param {Array.<String>} ids The requested list of security identifiers. Accepted ID types include Market Tickers, SEDOL, ISINs, CUSIPs, or FactSet Permanent Ids. <p>***ids limit** =  50 per request*</p> 
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with an object containing data of type {@link module:model/ProfileResponse} and HTTP response
     */
    getFdsProfilesWithHttpInfo(ids) {
      let postBody = null;
      // verify the required parameter 'ids' is set
      if (ids === undefined || ids === null) {
        throw new Error("Missing the required parameter 'ids' when calling getFdsProfiles");
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


      let returnType = ProfileResponse;

      return this.apiClient.callApi(
        '/company-reports/profile', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, null
      );
    }

    /**
     * Returns company profile information for a specified list of identifiers.
     * Retrieves a comprehensive overview of key profile details and information of specified list of identifiers. The response includes the company name, address, industry, sector, number of employees, CEO, business summary, exchange, market capitalization, shares outstanding, P/E ratio, year founded, and other details. All values provided in the response are absolute. 
     * @param {Array.<String>} ids The requested list of security identifiers. Accepted ID types include Market Tickers, SEDOL, ISINs, CUSIPs, or FactSet Permanent Ids. <p>***ids limit** =  50 per request*</p> 
     * @return { Promise.< module:model/ProfileResponse > } a Promise, with data of type {@link module:model/ProfileResponse }
     */
    getFdsProfiles(ids) {
      return this.getFdsProfilesWithHttpInfo(ids)
        .then(function(response_and_data) {
          return response_and_data.data;
        });
    }


    /**
     * Returns company financial data.
     * Returns company financial data (preliminary or final) for specified security and statement type (income statement, balance sheet, cash flow), for various fiscal reporting periods. All values provided in the response are absolute.<br> **Note:** Due to variations in calculation time of average exchange rates, there may be some minor differences in the values of company report financial statement attributes if you are requesting for a currency other than local, when compared to the workstation. 
     * @param {module:model/String} statementType The type of financial statement being requested.
     * @param {String} id The requested security identifier. Accepted ID types include Market Ticker, SEDOL, ISIN, CUSIP, or FactSet Permanent Id.
     * @param {module:model/String} periodicity Periodicity or frequency of the fiscal periods, where   * **ANN**  = Annual - Original,   * **ANN_R** = Annual - Latest - *Includes Restatements*,   * **QTR**  = Quarterly - Original,   * **QTR_R** = Quarterly - Latest - *Includes Restatements*,   * **SEMI** = Semi-Annual,   * **SEMI_R** = Semi-Annual - Latest - *Includes Restatements*,   * **LTM**  = Last Twelve Months,   * **YTD** = Year-to-date.   <br>  Please note that the coverage for SEMI_R may be limited as fewer companies report with this periodicity.<br> 
     * @param {Object} opts Optional parameters
     * @param {String} opts.currency Currency code for currency values. For a list of currency ISO codes, visit Online Assistant Page [OA1470](https://my.apps.factset.com/oa/pages/1470).  Giving input as \"DOC\" would give the values in reporting currency for the requested ids.  (default to 'LOCAL')
     * @param {module:model/String} opts.updateType Update Status Flag:   * **RP** = Include preliminary data,   * **RF** = Only final data  (default to 'RP')
     * @param {Number} opts.limit The time period for the returned data. Within range of 1 to 100. If not specified default will be 4. (default to 4)
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with an object containing data of type {@link module:model/FinancialResponse} and HTTP response
     */
    getFinancialsWithHttpInfo(statementType, id, periodicity, opts) {
      opts = opts || {};
      let postBody = null;
      // verify the required parameter 'statementType' is set
      if (statementType === undefined || statementType === null) {
        throw new Error("Missing the required parameter 'statementType' when calling getFinancials");
      }
      // verify the required parameter 'id' is set
      if (id === undefined || id === null) {
        throw new Error("Missing the required parameter 'id' when calling getFinancials");
      }
      // verify the required parameter 'periodicity' is set
      if (periodicity === undefined || periodicity === null) {
        throw new Error("Missing the required parameter 'periodicity' when calling getFinancials");
      }

      let pathParams = {
      };
      let queryParams = {
        'statementType': statementType,
        'id': id,
        'periodicity': periodicity,
        'currency': opts['currency'],
        'updateType': opts['updateType'],
        'limit': opts['limit']
      };
      let headerParams = {
      };
      let formParams = {
      };

      let authNames = ['FactSetApiKey', 'FactSetOAuth2'];
      let contentTypes = [];
      let accepts = ['application/json'];


      let returnType = FinancialResponse;

      return this.apiClient.callApi(
        '/company-reports/financial-statement', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, null
      );
    }

    /**
     * Returns company financial data.
     * Returns company financial data (preliminary or final) for specified security and statement type (income statement, balance sheet, cash flow), for various fiscal reporting periods. All values provided in the response are absolute.<br> **Note:** Due to variations in calculation time of average exchange rates, there may be some minor differences in the values of company report financial statement attributes if you are requesting for a currency other than local, when compared to the workstation. 
     * @param {module:model/String} statementType The type of financial statement being requested.
     * @param {String} id The requested security identifier. Accepted ID types include Market Ticker, SEDOL, ISIN, CUSIP, or FactSet Permanent Id.
     * @param {module:model/String} periodicity Periodicity or frequency of the fiscal periods, where   * **ANN**  = Annual - Original,   * **ANN_R** = Annual - Latest - *Includes Restatements*,   * **QTR**  = Quarterly - Original,   * **QTR_R** = Quarterly - Latest - *Includes Restatements*,   * **SEMI** = Semi-Annual,   * **SEMI_R** = Semi-Annual - Latest - *Includes Restatements*,   * **LTM**  = Last Twelve Months,   * **YTD** = Year-to-date.   <br>  Please note that the coverage for SEMI_R may be limited as fewer companies report with this periodicity.<br> 
     * @param {Object} opts Optional parameters
     * @param {String} opts.currency Currency code for currency values. For a list of currency ISO codes, visit Online Assistant Page [OA1470](https://my.apps.factset.com/oa/pages/1470).  Giving input as \"DOC\" would give the values in reporting currency for the requested ids.  (default to 'LOCAL')
     * @param {module:model/String} opts.updateType Update Status Flag:   * **RP** = Include preliminary data,   * **RF** = Only final data  (default to 'RP')
     * @param {Number} opts.limit The time period for the returned data. Within range of 1 to 100. If not specified default will be 4. (default to 4)
     * @return { Promise.< module:model/FinancialResponse > } a Promise, with data of type {@link module:model/FinancialResponse }
     */
    getFinancials(statementType, id, periodicity, opts) {
      return this.getFinancialsWithHttpInfo(statementType, id, periodicity, opts)
        .then(function(response_and_data) {
          return response_and_data.data;
        });
    }


    /**
     * Returns company fundamentals for a given list of identifiers.
     * Returns detailed insights on specified publicly traded company's various key financial measures or fundamentals like cash per share, dividend, EPS, EBIT etc. All values provided in the response are absolute.<br> **Note:** Due to variations in calculation time of average exchange rates, there may be some minor differences in the values of company report financial statement attributes if you are requesting for a currency other than local, when compared to the workstation. 
     * @param {Array.<String>} ids The requested list of security identifiers. Accepted ID types include Market Tickers, SEDOL, ISINs, CUSIPs, or FactSet Permanent Ids. <p>***ids limit** =  50 per request*</p> 
     * @param {Object} opts Optional parameters
     * @param {String} opts.currency Currency code for currency values. For a list of currency ISO codes, visit Online Assistant Page [OA1470](https://my.apps.factset.com/oa/pages/1470).  Giving input as \"DOC\" would give the values in reporting currency for the requested ids.  (default to 'LOCAL')
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with an object containing data of type {@link module:model/CompanyFundamentalsResponse} and HTTP response
     */
    getFundamentalsWithHttpInfo(ids, opts) {
      opts = opts || {};
      let postBody = null;
      // verify the required parameter 'ids' is set
      if (ids === undefined || ids === null) {
        throw new Error("Missing the required parameter 'ids' when calling getFundamentals");
      }

      let pathParams = {
      };
      let queryParams = {
        'ids': this.apiClient.buildCollectionParam(ids, 'csv'),
        'currency': opts['currency']
      };
      let headerParams = {
      };
      let formParams = {
      };

      let authNames = ['FactSetApiKey', 'FactSetOAuth2'];
      let contentTypes = [];
      let accepts = ['application/json'];


      let returnType = CompanyFundamentalsResponse;

      return this.apiClient.callApi(
        '/company-reports/fundamentals', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, null
      );
    }

    /**
     * Returns company fundamentals for a given list of identifiers.
     * Returns detailed insights on specified publicly traded company's various key financial measures or fundamentals like cash per share, dividend, EPS, EBIT etc. All values provided in the response are absolute.<br> **Note:** Due to variations in calculation time of average exchange rates, there may be some minor differences in the values of company report financial statement attributes if you are requesting for a currency other than local, when compared to the workstation. 
     * @param {Array.<String>} ids The requested list of security identifiers. Accepted ID types include Market Tickers, SEDOL, ISINs, CUSIPs, or FactSet Permanent Ids. <p>***ids limit** =  50 per request*</p> 
     * @param {Object} opts Optional parameters
     * @param {String} opts.currency Currency code for currency values. For a list of currency ISO codes, visit Online Assistant Page [OA1470](https://my.apps.factset.com/oa/pages/1470).  Giving input as \"DOC\" would give the values in reporting currency for the requested ids.  (default to 'LOCAL')
     * @return { Promise.< module:model/CompanyFundamentalsResponse > } a Promise, with data of type {@link module:model/CompanyFundamentalsResponse }
     */
    getFundamentals(ids, opts) {
      return this.getFundamentalsWithHttpInfo(ids, opts)
        .then(function(response_and_data) {
          return response_and_data.data;
        });
    }


}





