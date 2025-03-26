/**
 * FactSet Estimates
 * With global coverage since 1999, the FactSet Estimates API provides you with comprehensive estimates and statistics on a wide variety of financial statement items as well as industry-specific metrics. The universe is comprised of over 19,000 active companies across 90+ countries with the following types of data included:   - **Consensus** - **Detail** - **Ratings** - **Surprise** - **Segments** - **Actuals** - **New Estimates and Ratings Reports Endpoints**  For clients seeking  curated and relevant financial data, the FactSet Estimates API now includes Estimates and Ratings Reports endpoints. These powerful endpoints are designed for easy integration and consumption, delivering a wide array of financial metrics, estimates, and critical statistics in a highly accessible format suitable for both mobile and web applications.   Whether you are an analyst, investor, or financial professional, the Estimates and Ratings Reports endpoints offer detailed and actionable financial insights that can support thorough analyses and strategic decision-making processes.   The Estimates and Ratings Reports endpoints are especially valuable for B2B2C  applications, empowering financial services firms, investment companies, and corporate finance teams to:   - **Elevate Client Engagement:** Enrich user experiences in client-facing applications with comprehensive and up-to-date financial metrics.  - **Build Custom Reporting Tools:** Create tailored dashboards and analytics tools that provide deep insights and foster better financial understanding.  By adopting the FactSet Estimates API with its enriched Estimates and Ratings Reports endpoints, businesses can streamline their financial data integration process, improve operational efficiency, and deliver superior financial insights to their clients and end-users.     <p>This API is rate-limited to 10 requests per second and 10 concurrent requests per user.</p>  **Download API Specification**        To programmatically download the FactSet Estimates API Specification file in .yaml format, utilize the link below. You must be authorized for this API to extract the specification. This specification can then be used for Codegen to create your own SDKs. You can also access it by selecting the \"Download Spec\" button beside the version information.      [https://api.factset.com/content/factset-estimates/v2/spec/swagger.yaml](https://api.factset.com/content/factset-estimates/v2/spec/swagger.yaml) 
 *
 * The version of the OpenAPI document: 2.6.1
 * Contact: api@factset.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 *
 */


import ApiClient from "../ApiClient";
import ErrorResponse from '../model/ErrorResponse';
import SurpriseRequest from '../model/SurpriseRequest';
import SurpriseResponse from '../model/SurpriseResponse';

/**
* Surprise service.
* @module api/SurpriseApi
*/
export default class SurpriseApi {

    /**
    * Constructs a new SurpriseApi. 
    * @alias module:api/SurpriseApi
    * @class
    * @param {module:ApiClient} [apiClient] Optional API client implementation to use,
    * default to {@link module:ApiClient#instance} if unspecified.
    */
    constructor(apiClient) {
        this.apiClient = apiClient || ApiClient.instance;
    }



    /**
     * Surprise estimates for rolling fiscal periods
     * Returns FactSet Estimates surprise data using rolling fiscal dates. 
     * @param {Array.<String>} ids Security or Entity identifiers. FactSet Identifiers, tickers, CUSIP and SEDOL are accepted input. <p>***ids limit** =  3000 per request*</p> _Make Note - id limit of 3000 for defaults, otherwise the service is limited to a 30 second duration. This can be reached when increasing total number of metrics requested and depth of history._ 
     * @param {Array.<String>} metrics Requested metrics. Use the `/metrics` endpoint to return a list of available estimate items. Note, the number of metrics you are allowed to supply is limited to 1 for now. **Top 10** most used metrics are **EPS, SALES, DPS, EBITDA,EBIT, PRICE_TGT, CFPS, BPS, NET_INC, and ASSETS**.  For more details, visit [Online Assistant Page #15034](https://oa.apps.factset.com/pages/15034). 
     * @param {Object} opts Optional parameters
     * @param {String} opts.startDate Start date for point in time of estimates expressed in YYYY-MM-DD format.
     * @param {String} opts.endDate End date for point in time of estimates expressed in YYYY-MM-DD format.
     * @param {module:model/String} opts.frequency Controls the frequency of the data returned.   * **D** = Daily   * **W** = Weekly, based on the last day of the week of the start date.   * **AM** = Monthly, based on the start date (e.g., if the start date is June 16, data is displayed for June 16, May 16, April 16 etc.).         * **AQ** = Quarterly, based on the start date.   * **AY** = Actual Annual, based on the start date.   (default to 'AM')
     * @param {module:model/String} opts.periodicity The periodicity for the estimates requested, allowing you to fetch Quarterly, Semi-Annual and Annual Estimates.   * **ANN** - Annual   * **QTR** - Quarterly   * **SEMI** - Semi-Annual   (default to 'ANN')
     * @param {module:model/String} opts.statistic Statistic for consensus calculation. (default to 'MEAN')
     * @param {String} opts.currency Currency code for adjusting the data. Use `ESTIMATE` as input value for the values in Estimate Currency. For a list of currency ISO codes, visit [Online Assistant Page #1470](https://oa.apps.factset.com/pages/1470).
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with an object containing data of type {@link module:model/SurpriseResponse} and HTTP response
     */
    getSurpriseWithHttpInfo(ids, metrics, opts) {
      opts = opts || {};
      let postBody = null;
      // verify the required parameter 'ids' is set
      if (ids === undefined || ids === null) {
        throw new Error("Missing the required parameter 'ids' when calling getSurprise");
      }
      // verify the required parameter 'metrics' is set
      if (metrics === undefined || metrics === null) {
        throw new Error("Missing the required parameter 'metrics' when calling getSurprise");
      }

      let pathParams = {
      };
      let queryParams = {
        'ids': this.apiClient.buildCollectionParam(ids, 'csv'),
        'metrics': this.apiClient.buildCollectionParam(metrics, 'csv'),
        'startDate': opts['startDate'],
        'endDate': opts['endDate'],
        'frequency': opts['frequency'],
        'periodicity': opts['periodicity'],
        'statistic': opts['statistic'],
        'currency': opts['currency']
      };
      let headerParams = {
      };
      let formParams = {
      };

      let authNames = ['FactSetApiKey', 'FactSetOAuth2'];
      let contentTypes = [];
      let accepts = ['application/json'];


      let returnType = SurpriseResponse;

      return this.apiClient.callApi(
        '/factset-estimates/v2/surprise', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, null
      );
    }

    /**
     * Surprise estimates for rolling fiscal periods
     * Returns FactSet Estimates surprise data using rolling fiscal dates. 
     * @param {Array.<String>} ids Security or Entity identifiers. FactSet Identifiers, tickers, CUSIP and SEDOL are accepted input. <p>***ids limit** =  3000 per request*</p> _Make Note - id limit of 3000 for defaults, otherwise the service is limited to a 30 second duration. This can be reached when increasing total number of metrics requested and depth of history._ 
     * @param {Array.<String>} metrics Requested metrics. Use the `/metrics` endpoint to return a list of available estimate items. Note, the number of metrics you are allowed to supply is limited to 1 for now. **Top 10** most used metrics are **EPS, SALES, DPS, EBITDA,EBIT, PRICE_TGT, CFPS, BPS, NET_INC, and ASSETS**.  For more details, visit [Online Assistant Page #15034](https://oa.apps.factset.com/pages/15034). 
     * @param {Object} opts Optional parameters
     * @param {String} opts.startDate Start date for point in time of estimates expressed in YYYY-MM-DD format.
     * @param {String} opts.endDate End date for point in time of estimates expressed in YYYY-MM-DD format.
     * @param {module:model/String} opts.frequency Controls the frequency of the data returned.   * **D** = Daily   * **W** = Weekly, based on the last day of the week of the start date.   * **AM** = Monthly, based on the start date (e.g., if the start date is June 16, data is displayed for June 16, May 16, April 16 etc.).         * **AQ** = Quarterly, based on the start date.   * **AY** = Actual Annual, based on the start date.   (default to 'AM')
     * @param {module:model/String} opts.periodicity The periodicity for the estimates requested, allowing you to fetch Quarterly, Semi-Annual and Annual Estimates.   * **ANN** - Annual   * **QTR** - Quarterly   * **SEMI** - Semi-Annual   (default to 'ANN')
     * @param {module:model/String} opts.statistic Statistic for consensus calculation. (default to 'MEAN')
     * @param {String} opts.currency Currency code for adjusting the data. Use `ESTIMATE` as input value for the values in Estimate Currency. For a list of currency ISO codes, visit [Online Assistant Page #1470](https://oa.apps.factset.com/pages/1470).
     * @return { Promise.< module:model/SurpriseResponse > } a Promise, with data of type {@link module:model/SurpriseResponse }
     */
    getSurprise(ids, metrics, opts) {
      return this.getSurpriseWithHttpInfo(ids, metrics, opts)
        .then(function(response_and_data) {
          return response_and_data.data;
        });
    }


    /**
     * Surprise estimates for rolling fiscal periods
     * Returns FactSet Estimates surprise data using rolling fiscal dates. 
     * @param {module:model/SurpriseRequest} surpriseRequest Request object for `Security` prices.
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with an object containing data of type {@link module:model/SurpriseResponse} and HTTP response
     */
    getSurpriseForListWithHttpInfo(surpriseRequest) {
      let postBody = surpriseRequest;
      // verify the required parameter 'surpriseRequest' is set
      if (surpriseRequest === undefined || surpriseRequest === null) {
        throw new Error("Missing the required parameter 'surpriseRequest' when calling getSurpriseForList");
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


      let returnType = SurpriseResponse;

      return this.apiClient.callApi(
        '/factset-estimates/v2/surprise', 'POST',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, null
      );
    }

    /**
     * Surprise estimates for rolling fiscal periods
     * Returns FactSet Estimates surprise data using rolling fiscal dates. 
     * @param {module:model/SurpriseRequest} surpriseRequest Request object for `Security` prices.
     * @return { Promise.< module:model/SurpriseResponse > } a Promise, with data of type {@link module:model/SurpriseResponse }
     */
    getSurpriseForList(surpriseRequest) {
      return this.getSurpriseForListWithHttpInfo(surpriseRequest)
        .then(function(response_and_data) {
          return response_and_data.data;
        });
    }


}





