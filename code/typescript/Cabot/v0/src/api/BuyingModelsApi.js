/**
 * Cabot Models API
 * Cabot Models API
 *
 * The version of the OpenAPI document: 0.3.0
 * Contact: api@factset.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 *
 */


import ApiClient from "../ApiClient";
import Attributes from '../model/Attributes';
import BuyContextResponseRoot from '../model/BuyContextResponseRoot';
import BuyTimingHoldings from '../model/BuyTimingHoldings';
import BuyTimingResponseRoot from '../model/BuyTimingResponseRoot';
import ClientErrorResponse from '../model/ClientErrorResponse';
import Regions from '../model/Regions';
import Sectors from '../model/Sectors';

/**
* BuyingModels service.
* @module api/BuyingModelsApi
*/
export default class BuyingModelsApi {

    /**
    * Constructs a new BuyingModelsApi. 
    * @alias module:api/BuyingModelsApi
    * @class
    * @param {module:ApiClient} [apiClient] Optional API client implementation to use,
    * default to {@link module:ApiClient#instance} if unspecified.
    */
    constructor(apiClient) {
        this.apiClient = apiClient || ApiClient.instance;
    }



    /**
     * Cabot main path for Buy Context API
     * Cabot main path for Buy Context API
     * @param {String} accountPath The account path of the portfolio you want to retrieve the data for.
     * @param {String} benchmarkPath The path of the benchmark you want to retrieve the data for.<br /><br />
     * @param {String} period For which period you want to retrieve the data.<br />There are four options available as follows:<br /><br />1 -> YYYY (Repeating One Year)<br /><br />2 -> YYYY-YYYY (Repeating Three/Five/Ten Year)<br /><br />3 -> 1M_TRAILING, 3M_TRAILING, 1Y_TRAILING, 3Y_TRAILING, 5Y_TRAILING (Trailing Periods (If available for your portfolio))<br /><br />4 -> INCEPTION_TO_DATE<br /><br />You can only get the data for one period per request.<br /><br />
     * @param {module:model/Attributes} attribute The attribute represents the different factors.<br />You can choose which of them (if any) you want to see analytics for.<br /><br />If provided, the API response will contain both \"LOW\" and \"HIGH\" values for it.<br /><br />
     * @param {Object} opts Optional parameters
     * @param {module:model/Sectors} opts.sector Sector represents the sector based on the company's industry breakdown.<br />You can choose which of them (if any) you want to see analytics for.<br /><br />
     * @param {module:model/Regions} opts.region Region of domicile represents the region based on the company's primary listing.<br />You can choose which of them (if any) you want to see analytics for.<br /><br />
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with an object containing data of type {@link module:model/BuyContextResponseRoot} and HTTP response
     */
    getBuyContextModelAnalyticWithHttpInfo(accountPath, benchmarkPath, period, attribute, opts) {
      opts = opts || {};
      let postBody = null;
      // verify the required parameter 'accountPath' is set
      if (accountPath === undefined || accountPath === null) {
        throw new Error("Missing the required parameter 'accountPath' when calling getBuyContextModelAnalytic");
      }
      // verify the required parameter 'benchmarkPath' is set
      if (benchmarkPath === undefined || benchmarkPath === null) {
        throw new Error("Missing the required parameter 'benchmarkPath' when calling getBuyContextModelAnalytic");
      }
      // verify the required parameter 'period' is set
      if (period === undefined || period === null) {
        throw new Error("Missing the required parameter 'period' when calling getBuyContextModelAnalytic");
      }
      // verify the required parameter 'attribute' is set
      if (attribute === undefined || attribute === null) {
        throw new Error("Missing the required parameter 'attribute' when calling getBuyContextModelAnalytic");
      }

      let pathParams = {
      };
      let queryParams = {
        'accountPath': accountPath,
        'benchmarkPath': benchmarkPath,
        'period': period,
        'attribute': attribute,
        'sector': opts['sector'],
        'region': opts['region']
      };
      let headerParams = {
      };
      let formParams = {
      };

      let authNames = ['FactSetApiKey', 'FactSetOAuth2'];
      let contentTypes = [];
      let accepts = ['application/json'];


      let returnType = BuyContextResponseRoot;

      return this.apiClient.callApi(
        '/models/buy-context', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, null
      );
    }

    /**
     * Cabot main path for Buy Context API
     * Cabot main path for Buy Context API
     * @param {String} accountPath The account path of the portfolio you want to retrieve the data for.
     * @param {String} benchmarkPath The path of the benchmark you want to retrieve the data for.<br /><br />
     * @param {String} period For which period you want to retrieve the data.<br />There are four options available as follows:<br /><br />1 -> YYYY (Repeating One Year)<br /><br />2 -> YYYY-YYYY (Repeating Three/Five/Ten Year)<br /><br />3 -> 1M_TRAILING, 3M_TRAILING, 1Y_TRAILING, 3Y_TRAILING, 5Y_TRAILING (Trailing Periods (If available for your portfolio))<br /><br />4 -> INCEPTION_TO_DATE<br /><br />You can only get the data for one period per request.<br /><br />
     * @param {module:model/Attributes} attribute The attribute represents the different factors.<br />You can choose which of them (if any) you want to see analytics for.<br /><br />If provided, the API response will contain both \"LOW\" and \"HIGH\" values for it.<br /><br />
     * @param {Object} opts Optional parameters
     * @param {module:model/Sectors} opts.sector Sector represents the sector based on the company's industry breakdown.<br />You can choose which of them (if any) you want to see analytics for.<br /><br />
     * @param {module:model/Regions} opts.region Region of domicile represents the region based on the company's primary listing.<br />You can choose which of them (if any) you want to see analytics for.<br /><br />
     * @return { Promise.< module:model/BuyContextResponseRoot > } a Promise, with data of type {@link module:model/BuyContextResponseRoot }
     */
    getBuyContextModelAnalytic(accountPath, benchmarkPath, period, attribute, opts) {
      return this.getBuyContextModelAnalyticWithHttpInfo(accountPath, benchmarkPath, period, attribute, opts)
        .then(function(response_and_data) {
          return response_and_data.data;
        });
    }


    /**
     * Cabot main path for Buy Timing API
     * Cabot main path for Buy Timing API.    Buy timing examines the timeliness of entry points and measures how quickly new buys contribute to results. This is done by delaying the buys by the specified number of days to see if buying into the position early would have benefited the portfolio.
     * @param {String} accountPath The account path of the portfolio you want to retrieve the data for.<br /><br />
     * @param {String} benchmarkPath The path of the benchmark you want to retrieve the data for.<br /><br />
     * @param {String} period For which period you want to retrieve the data.<br />There are four options available as follows:<br /><br />1 -> YYYY (Repeating One Year)<br /><br />2 -> YYYY-YYYY (Repeating Three/Five/Ten Year)<br /><br />3 -> 1M_TRAILING, 3M_TRAILING, 1Y_TRAILING, 3Y_TRAILING, 5Y_TRAILING (Trailing Periods (If available for your portfolio))<br /><br />4 -> INCEPTION_TO_DATE<br /><br />You can only get the data for one period per request.<br /><br />
     * @param {Object} opts Optional parameters
     * @param {module:model/Attributes} opts.attribute The attribute represents the different factors.<br />You can choose which of them (if any) you want to see analytics for.<br /><br />If provided, the API response will contain both \"LOW\" and \"HIGH\" values for it.<br /><br />
     * @param {module:model/Sectors} opts.sector Sector represents the sector based on the company's industry breakdown.<br />You can choose which of them (if any) you want to see analytics for.<br /><br />
     * @param {module:model/Regions} opts.region Region of domicile represents the region based on the company's primary listing.<br />You can choose which of them (if any) you want to see analytics for.<br /><br />
     * @param {module:model/BuyTimingHoldings} opts.holdings If set, the API will add holding-level details for all or only the selected analytic (if available for your portfolio).<br /><br />
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with an object containing data of type {@link module:model/BuyTimingResponseRoot} and HTTP response
     */
    getBuyTimingModelAnalyticWithHttpInfo(accountPath, benchmarkPath, period, opts) {
      opts = opts || {};
      let postBody = null;
      // verify the required parameter 'accountPath' is set
      if (accountPath === undefined || accountPath === null) {
        throw new Error("Missing the required parameter 'accountPath' when calling getBuyTimingModelAnalytic");
      }
      // verify the required parameter 'benchmarkPath' is set
      if (benchmarkPath === undefined || benchmarkPath === null) {
        throw new Error("Missing the required parameter 'benchmarkPath' when calling getBuyTimingModelAnalytic");
      }
      // verify the required parameter 'period' is set
      if (period === undefined || period === null) {
        throw new Error("Missing the required parameter 'period' when calling getBuyTimingModelAnalytic");
      }

      let pathParams = {
      };
      let queryParams = {
        'accountPath': accountPath,
        'benchmarkPath': benchmarkPath,
        'period': period,
        'attribute': opts['attribute'],
        'sector': opts['sector'],
        'region': opts['region'],
        'holdings': opts['holdings']
      };
      let headerParams = {
      };
      let formParams = {
      };

      let authNames = ['FactSetApiKey', 'FactSetOAuth2'];
      let contentTypes = [];
      let accepts = ['application/json'];


      let returnType = BuyTimingResponseRoot;

      return this.apiClient.callApi(
        '/models/buy-timing', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, null
      );
    }

    /**
     * Cabot main path for Buy Timing API
     * Cabot main path for Buy Timing API.    Buy timing examines the timeliness of entry points and measures how quickly new buys contribute to results. This is done by delaying the buys by the specified number of days to see if buying into the position early would have benefited the portfolio.
     * @param {String} accountPath The account path of the portfolio you want to retrieve the data for.<br /><br />
     * @param {String} benchmarkPath The path of the benchmark you want to retrieve the data for.<br /><br />
     * @param {String} period For which period you want to retrieve the data.<br />There are four options available as follows:<br /><br />1 -> YYYY (Repeating One Year)<br /><br />2 -> YYYY-YYYY (Repeating Three/Five/Ten Year)<br /><br />3 -> 1M_TRAILING, 3M_TRAILING, 1Y_TRAILING, 3Y_TRAILING, 5Y_TRAILING (Trailing Periods (If available for your portfolio))<br /><br />4 -> INCEPTION_TO_DATE<br /><br />You can only get the data for one period per request.<br /><br />
     * @param {Object} opts Optional parameters
     * @param {module:model/Attributes} opts.attribute The attribute represents the different factors.<br />You can choose which of them (if any) you want to see analytics for.<br /><br />If provided, the API response will contain both \"LOW\" and \"HIGH\" values for it.<br /><br />
     * @param {module:model/Sectors} opts.sector Sector represents the sector based on the company's industry breakdown.<br />You can choose which of them (if any) you want to see analytics for.<br /><br />
     * @param {module:model/Regions} opts.region Region of domicile represents the region based on the company's primary listing.<br />You can choose which of them (if any) you want to see analytics for.<br /><br />
     * @param {module:model/BuyTimingHoldings} opts.holdings If set, the API will add holding-level details for all or only the selected analytic (if available for your portfolio).<br /><br />
     * @return { Promise.< module:model/BuyTimingResponseRoot > } a Promise, with data of type {@link module:model/BuyTimingResponseRoot }
     */
    getBuyTimingModelAnalytic(accountPath, benchmarkPath, period, opts) {
      return this.getBuyTimingModelAnalyticWithHttpInfo(accountPath, benchmarkPath, period, opts)
        .then(function(response_and_data) {
          return response_and_data.data;
        });
    }


}





