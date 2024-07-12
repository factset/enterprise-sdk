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
import ErrorResponse from '../model/ErrorResponse';
import SplitsRequest from '../model/SplitsRequest';
import SplitsResponse from '../model/SplitsResponse';

/**
* Splits service.
* @module api/SplitsApi
*/
export default class SplitsApi {

    /**
    * Constructs a new SplitsApi. 
    * @alias module:api/SplitsApi
    * @class
    * @param {module:ApiClient} [apiClient] Optional API client implementation to use,
    * default to {@link module:ApiClient#instance} if unspecified.
    */
    constructor(apiClient) {
        this.apiClient = apiClient || ApiClient.instance;
    }



    /**
     * Gets full history of security Splits for a list of `ids`
     * Gets the entire history of splits for a given list of identifiers. Information returned includes the split factor, a plain text comment regarding the type of split, and the event date.
     * @param {Array.<String>} ids The requested list of security identifiers. Accepted ID types include Market Tickers, SEDOL, ISINs, CUSIPs, or FactSet Permanent Ids. <p>***ids limit** =  2000 per request*</p> *<p>Make note, GET Method URL request lines are also limited to a total length of 8192 bytes (8KB). In cases where the service allows for thousands of ids, which may lead to exceeding this request line limit of 8KB, its advised for any requests with large request lines to be requested through the respective \"POST\" method.</p>*
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with an object containing data of type {@link module:model/SplitsResponse} and HTTP response
     */
    getSecuritySplitsWithHttpInfo(ids) {
      let postBody = null;
      // verify the required parameter 'ids' is set
      if (ids === undefined || ids === null) {
        throw new Error("Missing the required parameter 'ids' when calling getSecuritySplits");
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


      let returnType = SplitsResponse;

      return this.apiClient.callApi(
        '/factset-prices/v1/splits', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, null
      );
    }

    /**
     * Gets full history of security Splits for a list of `ids`
     * Gets the entire history of splits for a given list of identifiers. Information returned includes the split factor, a plain text comment regarding the type of split, and the event date.
     * @param {Array.<String>} ids The requested list of security identifiers. Accepted ID types include Market Tickers, SEDOL, ISINs, CUSIPs, or FactSet Permanent Ids. <p>***ids limit** =  2000 per request*</p> *<p>Make note, GET Method URL request lines are also limited to a total length of 8192 bytes (8KB). In cases where the service allows for thousands of ids, which may lead to exceeding this request line limit of 8KB, its advised for any requests with large request lines to be requested through the respective \"POST\" method.</p>*
     * @return { Promise.< module:model/SplitsResponse > } a Promise, with data of type {@link module:model/SplitsResponse }
     */
    getSecuritySplits(ids) {
      return this.getSecuritySplitsWithHttpInfo(ids)
        .then(function(response_and_data) {
          return response_and_data.data;
        });
    }


    /**
     * Requests splits for a list of `ids`
     * Gets the entire history of splits for a given list of identifiers. Information returned includes the split factor, a plain text comment regarding the type of split, and the event date.
     * @param {module:model/SplitsRequest} splitsRequest Request object for `Security` split factors.
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with an object containing data of type {@link module:model/SplitsResponse} and HTTP response
     */
    getSecuritySplitsForListWithHttpInfo(splitsRequest) {
      let postBody = splitsRequest;
      // verify the required parameter 'splitsRequest' is set
      if (splitsRequest === undefined || splitsRequest === null) {
        throw new Error("Missing the required parameter 'splitsRequest' when calling getSecuritySplitsForList");
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


      let returnType = SplitsResponse;

      return this.apiClient.callApi(
        '/factset-prices/v1/splits', 'POST',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, null
      );
    }

    /**
     * Requests splits for a list of `ids`
     * Gets the entire history of splits for a given list of identifiers. Information returned includes the split factor, a plain text comment regarding the type of split, and the event date.
     * @param {module:model/SplitsRequest} splitsRequest Request object for `Security` split factors.
     * @return { Promise.< module:model/SplitsResponse > } a Promise, with data of type {@link module:model/SplitsResponse }
     */
    getSecuritySplitsForList(splitsRequest) {
      return this.getSecuritySplitsForListWithHttpInfo(splitsRequest)
        .then(function(response_and_data) {
          return response_and_data.data;
        });
    }


}





