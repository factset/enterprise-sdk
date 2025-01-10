/**
 * FactSet Benchmarks API
 * FactSet Benchmarks API gives access to Index Constituents, Prices, Returns, and Ratios. For a sample list of identifiers, use the /metrics endpoint. Equity Only - Fixed Income Benchmark support coming soon. 
 *
 * The version of the OpenAPI document: 1.9.0
 * Contact: api@factset.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 *
 */


import ApiClient from "../ApiClient";
import BenchmarkIdListRequest from '../model/BenchmarkIdListRequest';
import BenchmarkIdListResponse from '../model/BenchmarkIdListResponse';
import ErrorResponse from '../model/ErrorResponse';

/**
* Helper service.
* @module api/HelperApi
*/
export default class HelperApi {

    /**
    * Constructs a new HelperApi. 
    * @alias module:api/HelperApi
    * @class
    * @param {module:ApiClient} [apiClient] Optional API client implementation to use,
    * default to {@link module:ApiClient#instance} if unspecified.
    */
    constructor(apiClient) {
        this.apiClient = apiClient || ApiClient.instance;
    }



    /**
     * Returns a sample list of Benchmark Identifiers and the benchmark categorization to use in other Benchmark API endpoints.
     * Returns a **sample** list of Benchmark Identifiers to use in other Benchmark API endpoints. This is a supporting API to be use alongside the other Benchmark API endpoints. For example, use the fsymID value returned in this response as the input to your `ids` parameter in the /constituents endpoint to return constituents for that id.<p> *This is not the full list of benchmark ids allowed in this service, but rather a representation of the most commonly requested. For complete assistance with ID lookup or concordance services, please reach out to FactSet Support. *</p>
     * @param {Object} opts Optional parameters
     * @param {module:model/String} opts.familyFilter Highest Level Filter to search by common Benchmark Families, such as S&P, MSCI, or Russell. This will retrieve all related benchmark ids. For further filtering, use the response items such as the categoryDescription field. Leave blank if you wish to see a full sample list of ids. requested- * **CHINA & HK INDICES** - Major Hong Kong and China Indices, such as Hang Seng Index (HSI-HKX) * **DOW JONES** - Dow Jones Global, Regions, Countries, Titans * **FACTSET MARKET INDICES** - Regional and Country Indices defined by FactSet * **FTSE** - FTSE Global, UK, Global All Cap, World, Xinhua, European, GWA, JSE, Multinationals, and Style indices * **GLOBAL INDICES** - A mix of major indices across the globe * **MSCI** - MSCI All Country, Asia Pacific, Thematic & Strategy, Emerging, Developed, US * **RUSSELL** - US, Global, and Nomura * **S&P** - US, ASX, Select Industry, BMI, Global, Thematic, Emerging, TSX * **STOXX** - Total Market, Europe, and Nordic * **TOPIX** - Topix Indices, such as TOPIX 500 (182301) * **MORNINGSTAR** - Global, Regional, Country, and Sector indicies * **BLOOMBERG** - Global, Regional, US, Europe, Maturity, Ratings 
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with an object containing data of type {@link module:model/BenchmarkIdListResponse} and HTTP response
     */
    getBenchmarkIdsWithHttpInfo(opts) {
      opts = opts || {};
      let postBody = null;

      let pathParams = {
      };
      let queryParams = {
        'familyFilter': opts['familyFilter']
      };
      let headerParams = {
      };
      let formParams = {
      };

      let authNames = ['FactSetApiKey', 'FactSetOAuth2'];
      let contentTypes = [];
      let accepts = ['application/json'];


      let returnType = BenchmarkIdListResponse;

      return this.apiClient.callApi(
        '/factset-benchmarks/v1/id-list', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, null
      );
    }

    /**
     * Returns a sample list of Benchmark Identifiers and the benchmark categorization to use in other Benchmark API endpoints.
     * Returns a **sample** list of Benchmark Identifiers to use in other Benchmark API endpoints. This is a supporting API to be use alongside the other Benchmark API endpoints. For example, use the fsymID value returned in this response as the input to your `ids` parameter in the /constituents endpoint to return constituents for that id.<p> *This is not the full list of benchmark ids allowed in this service, but rather a representation of the most commonly requested. For complete assistance with ID lookup or concordance services, please reach out to FactSet Support. *</p>
     * @param {Object} opts Optional parameters
     * @param {module:model/String} opts.familyFilter Highest Level Filter to search by common Benchmark Families, such as S&P, MSCI, or Russell. This will retrieve all related benchmark ids. For further filtering, use the response items such as the categoryDescription field. Leave blank if you wish to see a full sample list of ids. requested- * **CHINA & HK INDICES** - Major Hong Kong and China Indices, such as Hang Seng Index (HSI-HKX) * **DOW JONES** - Dow Jones Global, Regions, Countries, Titans * **FACTSET MARKET INDICES** - Regional and Country Indices defined by FactSet * **FTSE** - FTSE Global, UK, Global All Cap, World, Xinhua, European, GWA, JSE, Multinationals, and Style indices * **GLOBAL INDICES** - A mix of major indices across the globe * **MSCI** - MSCI All Country, Asia Pacific, Thematic & Strategy, Emerging, Developed, US * **RUSSELL** - US, Global, and Nomura * **S&P** - US, ASX, Select Industry, BMI, Global, Thematic, Emerging, TSX * **STOXX** - Total Market, Europe, and Nordic * **TOPIX** - Topix Indices, such as TOPIX 500 (182301) * **MORNINGSTAR** - Global, Regional, Country, and Sector indicies * **BLOOMBERG** - Global, Regional, US, Europe, Maturity, Ratings 
     * @return { Promise.< module:model/BenchmarkIdListResponse > } a Promise, with data of type {@link module:model/BenchmarkIdListResponse }
     */
    getBenchmarkIds(opts) {
      return this.getBenchmarkIdsWithHttpInfo(opts)
        .then(function(response_and_data) {
          return response_and_data.data;
        });
    }


    /**
     * Returns a sample list of Benchmark Identifiers and the benchmark categorization to use in other Benchmark API endpoints.
     * Returns a **sample** list of Benchmark Identifiers to use in other Benchmark API endpoints. This is a supporting API to be use alongside the other Benchmark API endpoints. For example, use the fsymID value returned in this response as the input to your `ids` parameter in the /constituents endpoint to return constituents for that id.<p> *This is not the full list of benchmark ids allowed in this service, but rather a representation of the most commonly requested. For complete assistance with ID lookup or concordance services, please reach out to FactSet Support.*</p>
     * @param {module:model/BenchmarkIdListRequest} benchmarkIdListRequest Requests a sample list of identifiers that can be used in other Benchmarks API endpoints.
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with an object containing data of type {@link module:model/BenchmarkIdListResponse} and HTTP response
     */
    getBenchmarkIdsForListWithHttpInfo(benchmarkIdListRequest) {
      let postBody = benchmarkIdListRequest;
      // verify the required parameter 'benchmarkIdListRequest' is set
      if (benchmarkIdListRequest === undefined || benchmarkIdListRequest === null) {
        throw new Error("Missing the required parameter 'benchmarkIdListRequest' when calling getBenchmarkIdsForList");
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


      let returnType = BenchmarkIdListResponse;

      return this.apiClient.callApi(
        '/factset-benchmarks/v1/id-list', 'POST',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, null
      );
    }

    /**
     * Returns a sample list of Benchmark Identifiers and the benchmark categorization to use in other Benchmark API endpoints.
     * Returns a **sample** list of Benchmark Identifiers to use in other Benchmark API endpoints. This is a supporting API to be use alongside the other Benchmark API endpoints. For example, use the fsymID value returned in this response as the input to your `ids` parameter in the /constituents endpoint to return constituents for that id.<p> *This is not the full list of benchmark ids allowed in this service, but rather a representation of the most commonly requested. For complete assistance with ID lookup or concordance services, please reach out to FactSet Support.*</p>
     * @param {module:model/BenchmarkIdListRequest} benchmarkIdListRequest Requests a sample list of identifiers that can be used in other Benchmarks API endpoints.
     * @return { Promise.< module:model/BenchmarkIdListResponse > } a Promise, with data of type {@link module:model/BenchmarkIdListResponse }
     */
    getBenchmarkIdsForList(benchmarkIdListRequest) {
      return this.getBenchmarkIdsForListWithHttpInfo(benchmarkIdListRequest)
        .then(function(response_and_data) {
          return response_and_data.data;
        });
    }


}





