/**
 * Best Execution Analytics for Smarter Trading (BEAST) API
 * Enables clients to programmatically access the underlying data which powers the BEAST Liquidity Analytics (LA) and Transaction Cost Analysis (TCA) applications.
 *
 * The version of the OpenAPI document: 2.0.0
 * Contact: api@factset.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 *
 */


import ApiClient from "../ApiClient";
import ErrorResponse from '../model/ErrorResponse';
import OutlierResponseRoot from '../model/OutlierResponseRoot';

/**
* Outliers service.
* @module api/OutliersApi
*/
export default class OutliersApi {

    /**
    * Constructs a new OutliersApi. 
    * @alias module:api/OutliersApi
    * @class
    * @param {module:ApiClient} [apiClient] Optional API client implementation to use,
    * default to {@link module:ApiClient#instance} if unspecified.
    */
    constructor(apiClient) {
        this.apiClient = apiClient || ApiClient.instance;
    }



    /**
     * Get Outlier Metrics by percentile
     * Get outlier metrics by the specified metric type, percentile and date range
     * @param {module:model/String} metricType Metric type
     * @param {String} startDate Start date in the format YYYY-MM-DD
     * @param {String} endDate End date in the format YYYY-MM-DD
     * @param {Object} opts Optional parameters
     * @param {String} opts.region The two character ISO country code of the trading region. EMEA is used for the European trading region
     * @param {String} opts.trader Optionally specify a trader to filter by, Example : Ryan
     * @param {Number} opts.minPercent Min Percentile (default to 2.5)
     * @param {Number} opts.maxPercent Max Percentile (default to 97.5)
     * @param {Number} opts.binScalar Bin Scalar (default to 51)
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with an object containing data of type {@link module:model/OutlierResponseRoot} and HTTP response
     */
    getOutlierMetricsByPercentileWithHttpInfo(metricType, startDate, endDate, opts) {
      opts = opts || {};
      let postBody = null;
      // verify the required parameter 'metricType' is set
      if (metricType === undefined || metricType === null) {
        throw new Error("Missing the required parameter 'metricType' when calling getOutlierMetricsByPercentile");
      }
      // verify the required parameter 'startDate' is set
      if (startDate === undefined || startDate === null) {
        throw new Error("Missing the required parameter 'startDate' when calling getOutlierMetricsByPercentile");
      }
      // verify the required parameter 'endDate' is set
      if (endDate === undefined || endDate === null) {
        throw new Error("Missing the required parameter 'endDate' when calling getOutlierMetricsByPercentile");
      }

      let pathParams = {
      };
      let queryParams = {
        'metricType': metricType,
        'startDate': startDate,
        'endDate': endDate,
        'region': opts['region'],
        'trader': opts['trader'],
        'minPercent': opts['minPercent'],
        'maxPercent': opts['maxPercent'],
        'binScalar': opts['binScalar']
      };
      let headerParams = {
      };
      let formParams = {
      };

      let authNames = ['FactSetApiKey', 'FactSetOAuth2'];
      let contentTypes = [];
      let accepts = ['application/json'];


      let returnType = OutlierResponseRoot;

      return this.apiClient.callApi(
        '/tca/outlier/metrics-by-percentile', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, null
      );
    }

    /**
     * Get Outlier Metrics by percentile
     * Get outlier metrics by the specified metric type, percentile and date range
     * @param {module:model/String} metricType Metric type
     * @param {String} startDate Start date in the format YYYY-MM-DD
     * @param {String} endDate End date in the format YYYY-MM-DD
     * @param {Object} opts Optional parameters
     * @param {String} opts.region The two character ISO country code of the trading region. EMEA is used for the European trading region
     * @param {String} opts.trader Optionally specify a trader to filter by, Example : Ryan
     * @param {Number} opts.minPercent Min Percentile (default to 2.5)
     * @param {Number} opts.maxPercent Max Percentile (default to 97.5)
     * @param {Number} opts.binScalar Bin Scalar (default to 51)
     * @return { Promise.< module:model/OutlierResponseRoot > } a Promise, with data of type {@link module:model/OutlierResponseRoot }
     */
    getOutlierMetricsByPercentile(metricType, startDate, endDate, opts) {
      return this.getOutlierMetricsByPercentileWithHttpInfo(metricType, startDate, endDate, opts)
        .then(function(response_and_data) {
          return response_and_data.data;
        });
    }


    /**
     * Get Outlier Metrics by standard deviation
     * Get outlier metrics by the specified metric type and date range
     * @param {module:model/String} metricType Metric type
     * @param {String} startDate Start date in the format YYYY-MM-DD
     * @param {String} endDate End date in the format YYYY-MM-DD
     * @param {Object} opts Optional parameters
     * @param {String} opts.region The two character ISO country code of the trading region. EMEA is used for the European trading region
     * @param {String} opts.trader Optionally specify a trader to filter by, Example : Ryan
     * @param {Number} opts.deviation Deviation (default to 2)
     * @param {Number} opts.binScalar Bin Scalar (default to 51)
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with an object containing data of type {@link module:model/OutlierResponseRoot} and HTTP response
     */
    getOutlierMetricsStandardWithHttpInfo(metricType, startDate, endDate, opts) {
      opts = opts || {};
      let postBody = null;
      // verify the required parameter 'metricType' is set
      if (metricType === undefined || metricType === null) {
        throw new Error("Missing the required parameter 'metricType' when calling getOutlierMetricsStandard");
      }
      // verify the required parameter 'startDate' is set
      if (startDate === undefined || startDate === null) {
        throw new Error("Missing the required parameter 'startDate' when calling getOutlierMetricsStandard");
      }
      // verify the required parameter 'endDate' is set
      if (endDate === undefined || endDate === null) {
        throw new Error("Missing the required parameter 'endDate' when calling getOutlierMetricsStandard");
      }

      let pathParams = {
      };
      let queryParams = {
        'metricType': metricType,
        'startDate': startDate,
        'endDate': endDate,
        'region': opts['region'],
        'trader': opts['trader'],
        'deviation': opts['deviation'],
        'binScalar': opts['binScalar']
      };
      let headerParams = {
      };
      let formParams = {
      };

      let authNames = ['FactSetApiKey', 'FactSetOAuth2'];
      let contentTypes = [];
      let accepts = ['application/json'];


      let returnType = OutlierResponseRoot;

      return this.apiClient.callApi(
        '/tca/outlier/metrics-standard', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, null
      );
    }

    /**
     * Get Outlier Metrics by standard deviation
     * Get outlier metrics by the specified metric type and date range
     * @param {module:model/String} metricType Metric type
     * @param {String} startDate Start date in the format YYYY-MM-DD
     * @param {String} endDate End date in the format YYYY-MM-DD
     * @param {Object} opts Optional parameters
     * @param {String} opts.region The two character ISO country code of the trading region. EMEA is used for the European trading region
     * @param {String} opts.trader Optionally specify a trader to filter by, Example : Ryan
     * @param {Number} opts.deviation Deviation (default to 2)
     * @param {Number} opts.binScalar Bin Scalar (default to 51)
     * @return { Promise.< module:model/OutlierResponseRoot > } a Promise, with data of type {@link module:model/OutlierResponseRoot }
     */
    getOutlierMetricsStandard(metricType, startDate, endDate, opts) {
      return this.getOutlierMetricsStandardWithHttpInfo(metricType, startDate, endDate, opts)
        .then(function(response_and_data) {
          return response_and_data.data;
        });
    }


}





