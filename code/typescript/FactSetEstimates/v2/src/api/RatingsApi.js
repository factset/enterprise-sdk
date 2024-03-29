/**
 * FactSet Estimates
 * Gain access to 20+ years of comprehensive estimates and statistics of over 250+ estimated metrics, including financial statement items, product segments, geosegments, and industry metrics. FactSet's consensus estimates are aggregated from a wide base of over 800+ contributors and cover over 19,000 active companies across 90+ countries. Data returned can be accessed on the data frequencies based on quarterly, fiscal years, and calendar years. FactSet Estimates updates on a real time basis intraday (every 5 minutes). Updating times vary based on earning season vs. non-earning season but the goal is to have the data available to the client within a few hours that FactSet receives updated information. Often times updates times can be much faster as FactSet has always been known as one of the fastest estimate providers in the market. 
 *
 * The version of the OpenAPI document: 2.5.0
 * Contact: api@factset.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 *
 */


import ApiClient from "../ApiClient";
import ConsensusRatingsRequest from '../model/ConsensusRatingsRequest';
import ConsensusRatingsResponse from '../model/ConsensusRatingsResponse';
import DetailRatingsRequest from '../model/DetailRatingsRequest';
import DetailRatingsResponse from '../model/DetailRatingsResponse';
import ErrorResponse from '../model/ErrorResponse';

/**
* Ratings service.
* @module api/RatingsApi
*/
export default class RatingsApi {

    /**
    * Constructs a new RatingsApi. 
    * @alias module:api/RatingsApi
    * @class
    * @param {module:ApiClient} [apiClient] Optional API client implementation to use,
    * default to {@link module:ApiClient#instance} if unspecified.
    */
    constructor(apiClient) {
        this.apiClient = apiClient || ApiClient.instance;
    }



    /**
     * Ratings consensus estimates to fetch Buy, Overweight, Hold, Underweight, and Sell.
     * Returns ratings from the FactSet Estimates database for current and historical for an individual security using rolling fiscal dates as of a specific date. 
     * @param {Array.<String>} ids Security or Entity identifiers. FactSet Identifiers, tickers, CUSIP and SEDOL are accepted input. <p>***ids limit** =  3000 per request*</p> * Make Note - id limit of 3000 for defaults, otherwise the service is limited to a 30 second duration. This can be reached when increasing total number of metrics requested and depth of history. * 
     * @param {Object} opts Optional parameters
     * @param {String} opts.startDate Start date for point in time of estimates expressed in YYYY-MM-DD format.
     * @param {String} opts.endDate End date for point in time of estimates expressed in YYYY-MM-DD format.
     * @param {module:model/String} opts.frequency Controls the frequency of the data returned.   * **D** = Daily   * **W** = Weekly, based on the last day of the week of the start date.   * **AM** = Monthly, based on the start date (e.g., if the start date is June 16, data is displayed for June 16, May 16, April 16 etc.).         * **AQ** = Quarterly, based on the start date.   * **AY** = Actual Annual, based on the start date.   (default to 'D')
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with an object containing data of type {@link module:model/ConsensusRatingsResponse} and HTTP response
     */
    getConsensusRatingsWithHttpInfo(ids, opts) {
      opts = opts || {};
      let postBody = null;
      // verify the required parameter 'ids' is set
      if (ids === undefined || ids === null) {
        throw new Error("Missing the required parameter 'ids' when calling getConsensusRatings");
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


      let returnType = ConsensusRatingsResponse;

      return this.apiClient.callApi(
        '/factset-estimates/v2/consensus-ratings', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, null
      );
    }

    /**
     * Ratings consensus estimates to fetch Buy, Overweight, Hold, Underweight, and Sell.
     * Returns ratings from the FactSet Estimates database for current and historical for an individual security using rolling fiscal dates as of a specific date. 
     * @param {Array.<String>} ids Security or Entity identifiers. FactSet Identifiers, tickers, CUSIP and SEDOL are accepted input. <p>***ids limit** =  3000 per request*</p> * Make Note - id limit of 3000 for defaults, otherwise the service is limited to a 30 second duration. This can be reached when increasing total number of metrics requested and depth of history. * 
     * @param {Object} opts Optional parameters
     * @param {String} opts.startDate Start date for point in time of estimates expressed in YYYY-MM-DD format.
     * @param {String} opts.endDate End date for point in time of estimates expressed in YYYY-MM-DD format.
     * @param {module:model/String} opts.frequency Controls the frequency of the data returned.   * **D** = Daily   * **W** = Weekly, based on the last day of the week of the start date.   * **AM** = Monthly, based on the start date (e.g., if the start date is June 16, data is displayed for June 16, May 16, April 16 etc.).         * **AQ** = Quarterly, based on the start date.   * **AY** = Actual Annual, based on the start date.   (default to 'D')
     * @return { Promise.< module:model/ConsensusRatingsResponse > } a Promise, with data of type {@link module:model/ConsensusRatingsResponse }
     */
    getConsensusRatings(ids, opts) {
      return this.getConsensusRatingsWithHttpInfo(ids, opts)
        .then(function(response_and_data) {
          return response_and_data.data;
        });
    }


    /**
     * Ratings consensus estimates to fetch Buy, Overweight, Hold, Underweight, and Sell.
     * Returns ratings from the FactSet Estimates database for current and historical for an individual security using rolling fiscal dates as of a specific date. 
     * @param {module:model/ConsensusRatingsRequest} consensusRatingsRequest Request object for Estimate Data Items.
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with an object containing data of type {@link module:model/ConsensusRatingsResponse} and HTTP response
     */
    getConsensusRatingsForListWithHttpInfo(consensusRatingsRequest) {
      let postBody = consensusRatingsRequest;
      // verify the required parameter 'consensusRatingsRequest' is set
      if (consensusRatingsRequest === undefined || consensusRatingsRequest === null) {
        throw new Error("Missing the required parameter 'consensusRatingsRequest' when calling getConsensusRatingsForList");
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


      let returnType = ConsensusRatingsResponse;

      return this.apiClient.callApi(
        '/factset-estimates/v2/consensus-ratings', 'POST',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, null
      );
    }

    /**
     * Ratings consensus estimates to fetch Buy, Overweight, Hold, Underweight, and Sell.
     * Returns ratings from the FactSet Estimates database for current and historical for an individual security using rolling fiscal dates as of a specific date. 
     * @param {module:model/ConsensusRatingsRequest} consensusRatingsRequest Request object for Estimate Data Items.
     * @return { Promise.< module:model/ConsensusRatingsResponse > } a Promise, with data of type {@link module:model/ConsensusRatingsResponse }
     */
    getConsensusRatingsForList(consensusRatingsRequest) {
      return this.getConsensusRatingsForListWithHttpInfo(consensusRatingsRequest)
        .then(function(response_and_data) {
          return response_and_data.data;
        });
    }


    /**
     * Broker Detail estimates to fetch Buy, Overweight, Hold, Underweight, and Sell.
     * Retrieves the Broker Level ratings for the requested Id and date range. Ratings include Buy, Hold, Sell, Overweight, and Underweight. <p>The `startDate` and `endDate` parameters controls the range of perspective dates. By default, the service will return the range of estimateDates within the latest company's reporting period. As you expand the date range, additional full historical reporting periods and all ratings estimateDates per broker will be returned.</p> 
     * @param {Array.<String>} ids Security or Entity identifiers. FactSet Identifiers, tickers, CUSIP and SEDOL are accepted input. <p>***ids limit** =  3000 per request*</p> * Make Note - id limit of 3000 for defaults, otherwise the service is limited to a 30 second duration. This can be reached when increasing total number of metrics requested and depth of history. * 
     * @param {Object} opts Optional parameters
     * @param {String} opts.startDate Start date for point in time of estimates expressed in YYYY-MM-DD format.
     * @param {String} opts.endDate End date for point in time of estimates expressed in YYYY-MM-DD format.
     * @param {Boolean} opts.includeAll Include All filter is used to identify included and excluded broker details from the consensus   By default the service would return only the brokers included in the consensus-   * **TRUE** = Returns all the brokers included and excluded in the consensus   * **FALSE** = Returns only the broker details included in the consensus     (default to false)
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with an object containing data of type {@link module:model/DetailRatingsResponse} and HTTP response
     */
    getDetailRatingsWithHttpInfo(ids, opts) {
      opts = opts || {};
      let postBody = null;
      // verify the required parameter 'ids' is set
      if (ids === undefined || ids === null) {
        throw new Error("Missing the required parameter 'ids' when calling getDetailRatings");
      }

      let pathParams = {
      };
      let queryParams = {
        'ids': this.apiClient.buildCollectionParam(ids, 'csv'),
        'startDate': opts['startDate'],
        'endDate': opts['endDate'],
        'includeAll': opts['includeAll']
      };
      let headerParams = {
      };
      let formParams = {
      };

      let authNames = ['FactSetApiKey', 'FactSetOAuth2'];
      let contentTypes = [];
      let accepts = ['application/json'];


      let returnType = DetailRatingsResponse;

      return this.apiClient.callApi(
        '/factset-estimates/v2/detail-ratings', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, null
      );
    }

    /**
     * Broker Detail estimates to fetch Buy, Overweight, Hold, Underweight, and Sell.
     * Retrieves the Broker Level ratings for the requested Id and date range. Ratings include Buy, Hold, Sell, Overweight, and Underweight. <p>The `startDate` and `endDate` parameters controls the range of perspective dates. By default, the service will return the range of estimateDates within the latest company's reporting period. As you expand the date range, additional full historical reporting periods and all ratings estimateDates per broker will be returned.</p> 
     * @param {Array.<String>} ids Security or Entity identifiers. FactSet Identifiers, tickers, CUSIP and SEDOL are accepted input. <p>***ids limit** =  3000 per request*</p> * Make Note - id limit of 3000 for defaults, otherwise the service is limited to a 30 second duration. This can be reached when increasing total number of metrics requested and depth of history. * 
     * @param {Object} opts Optional parameters
     * @param {String} opts.startDate Start date for point in time of estimates expressed in YYYY-MM-DD format.
     * @param {String} opts.endDate End date for point in time of estimates expressed in YYYY-MM-DD format.
     * @param {Boolean} opts.includeAll Include All filter is used to identify included and excluded broker details from the consensus   By default the service would return only the brokers included in the consensus-   * **TRUE** = Returns all the brokers included and excluded in the consensus   * **FALSE** = Returns only the broker details included in the consensus     (default to false)
     * @return { Promise.< module:model/DetailRatingsResponse > } a Promise, with data of type {@link module:model/DetailRatingsResponse }
     */
    getDetailRatings(ids, opts) {
      return this.getDetailRatingsWithHttpInfo(ids, opts)
        .then(function(response_and_data) {
          return response_and_data.data;
        });
    }


    /**
     * Broker Detail estimates to fetch Buy, Overweight, Hold, Underweight, and Sell.
     * Retrieves the Broker Level ratings for the requested Id and date range. Ratings include Buy, Hold, Sell, Overweight, and Underweight. <p>The `startDate` and `endDate` parameters controls the range of perspective dates. By default, the service will return the range of estimateDates within the latest company's reporting period. As you expand the date range, additional full historical reporting periods and all ratings estimateDates per broker will be returned.</p> 
     * @param {module:model/DetailRatingsRequest} detailRatingsRequest Request object for Detail Reatings Data Items.
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with an object containing data of type {@link module:model/DetailRatingsResponse} and HTTP response
     */
    getDetailRatingsForListWithHttpInfo(detailRatingsRequest) {
      let postBody = detailRatingsRequest;
      // verify the required parameter 'detailRatingsRequest' is set
      if (detailRatingsRequest === undefined || detailRatingsRequest === null) {
        throw new Error("Missing the required parameter 'detailRatingsRequest' when calling getDetailRatingsForList");
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


      let returnType = DetailRatingsResponse;

      return this.apiClient.callApi(
        '/factset-estimates/v2/detail-ratings', 'POST',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, null
      );
    }

    /**
     * Broker Detail estimates to fetch Buy, Overweight, Hold, Underweight, and Sell.
     * Retrieves the Broker Level ratings for the requested Id and date range. Ratings include Buy, Hold, Sell, Overweight, and Underweight. <p>The `startDate` and `endDate` parameters controls the range of perspective dates. By default, the service will return the range of estimateDates within the latest company's reporting period. As you expand the date range, additional full historical reporting periods and all ratings estimateDates per broker will be returned.</p> 
     * @param {module:model/DetailRatingsRequest} detailRatingsRequest Request object for Detail Reatings Data Items.
     * @return { Promise.< module:model/DetailRatingsResponse > } a Promise, with data of type {@link module:model/DetailRatingsResponse }
     */
    getDetailRatingsForList(detailRatingsRequest) {
      return this.getDetailRatingsForListWithHttpInfo(detailRatingsRequest)
        .then(function(response_and_data) {
          return response_and_data.data;
        });
    }


}





