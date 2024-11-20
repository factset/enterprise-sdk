/**
 * Best Execution Analytics for Smarter Trading (BEAST) API
 * Enables clients to programmatically access the underlying data which powers the BEAST Liquidity Analytics (LA) and Transaction Cost Analysis (TCA) applications.
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
     * Get Outlier metrics
     * Get outlier metrics by the specified metric type and date range
     * @param {module:model/String} metricType Metric type
     * @param {String} startDate Start date in the format YYYY-MM-DD
     * @param {String} endDate End date in the format YYYY-MM-DD
     * @param {Object} opts Optional parameters
     * @param {Number} opts.deviation Deviation (default to 2)
     * @param {Number} opts.binScalar Bin Scalar (default to 51)
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with an object containing data of type {@link module:model/OutlierResponseRoot} and HTTP response
     */
    getOutlierMetricsWithHttpInfo(metricType, startDate, endDate, opts) {
      opts = opts || {};
      let postBody = null;
      // verify the required parameter 'metricType' is set
      if (metricType === undefined || metricType === null) {
        throw new Error("Missing the required parameter 'metricType' when calling getOutlierMetrics");
      }
      // verify the required parameter 'startDate' is set
      if (startDate === undefined || startDate === null) {
        throw new Error("Missing the required parameter 'startDate' when calling getOutlierMetrics");
      }
      // verify the required parameter 'endDate' is set
      if (endDate === undefined || endDate === null) {
        throw new Error("Missing the required parameter 'endDate' when calling getOutlierMetrics");
      }

      let pathParams = {
      };
      let queryParams = {
        'metricType': metricType,
        'startDate': startDate,
        'endDate': endDate,
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
        '/tca/outlier/metrics', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, null
      );
    }

    /**
     * Get Outlier metrics
     * Get outlier metrics by the specified metric type and date range
     * @param {module:model/String} metricType Metric type
     * @param {String} startDate Start date in the format YYYY-MM-DD
     * @param {String} endDate End date in the format YYYY-MM-DD
     * @param {Object} opts Optional parameters
     * @param {Number} opts.deviation Deviation (default to 2)
     * @param {Number} opts.binScalar Bin Scalar (default to 51)
     * @return { Promise.< module:model/OutlierResponseRoot > } a Promise, with data of type {@link module:model/OutlierResponseRoot }
     */
    getOutlierMetrics(metricType, startDate, endDate, opts) {
      return this.getOutlierMetricsWithHttpInfo(metricType, startDate, endDate, opts)
        .then(function(response_and_data) {
          return response_and_data.data;
        });
    }


    /**
     * Get Outlier metrics by percent
     * Get outlier metrics by the specified metric type, percentage and date range
     * @param {module:model/String} metricType Metric type
     * @param {String} startDate Start date in the format YYYY-MM-DD
     * @param {String} endDate End date in the format YYYY-MM-DD
     * @param {Object} opts Optional parameters
     * @param {Number} opts.minPercent Min Percentage (default to 25)
     * @param {Number} opts.maxPercent Max Percentage (default to 75)
     * @param {Number} opts.binScalar Bin Scalar (default to 51)
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with an object containing data of type {@link module:model/OutlierResponseRoot} and HTTP response
     */
    getOutlierMetricsByPercentWithHttpInfo(metricType, startDate, endDate, opts) {
      opts = opts || {};
      let postBody = null;
      // verify the required parameter 'metricType' is set
      if (metricType === undefined || metricType === null) {
        throw new Error("Missing the required parameter 'metricType' when calling getOutlierMetricsByPercent");
      }
      // verify the required parameter 'startDate' is set
      if (startDate === undefined || startDate === null) {
        throw new Error("Missing the required parameter 'startDate' when calling getOutlierMetricsByPercent");
      }
      // verify the required parameter 'endDate' is set
      if (endDate === undefined || endDate === null) {
        throw new Error("Missing the required parameter 'endDate' when calling getOutlierMetricsByPercent");
      }

      let pathParams = {
      };
      let queryParams = {
        'metricType': metricType,
        'startDate': startDate,
        'endDate': endDate,
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
        '/tca/outlier/metrics-by-percent', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, null
      );
    }

    /**
     * Get Outlier metrics by percent
     * Get outlier metrics by the specified metric type, percentage and date range
     * @param {module:model/String} metricType Metric type
     * @param {String} startDate Start date in the format YYYY-MM-DD
     * @param {String} endDate End date in the format YYYY-MM-DD
     * @param {Object} opts Optional parameters
     * @param {Number} opts.minPercent Min Percentage (default to 25)
     * @param {Number} opts.maxPercent Max Percentage (default to 75)
     * @param {Number} opts.binScalar Bin Scalar (default to 51)
     * @return { Promise.< module:model/OutlierResponseRoot > } a Promise, with data of type {@link module:model/OutlierResponseRoot }
     */
    getOutlierMetricsByPercent(metricType, startDate, endDate, opts) {
      return this.getOutlierMetricsByPercentWithHttpInfo(metricType, startDate, endDate, opts)
        .then(function(response_and_data) {
          return response_and_data.data;
        });
    }


}





