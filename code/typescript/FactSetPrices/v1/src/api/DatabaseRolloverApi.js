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
import RolloverResponse from '../model/RolloverResponse';

/**
* DatabaseRollover service.
* @module api/DatabaseRolloverApi
*/
export default class DatabaseRolloverApi {

    /**
    * Constructs a new DatabaseRolloverApi. 
    * @alias module:api/DatabaseRolloverApi
    * @class
    * @param {module:ApiClient} [apiClient] Optional API client implementation to use,
    * default to {@link module:ApiClient#instance} if unspecified.
    */
    constructor(apiClient) {
        this.apiClient = apiClient || ApiClient.instance;
    }



    /**
     * Gets the latest relative rollover date for the database.
     * Gets zero relative date and last update time for FactSet databases. The dates represent the date that the rollover event happened; the date and time is in **eastern time zone**.  <p>Depending on the ids requested and their respective regions, a requested startDate or endDate used in the various Prices API may reflect different previous close dates. This relative \"zero\" date, meaning - as of yesterday's close - will vary across global regions. This API is designed to help production systems account for regional rollover dates to know when to trigger their processes for different regions to reflect the latest close. The response gives context for AMERICAS, ASIA PACIFIC, and EUROPE. </p> 
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with an object containing data of type {@link module:model/RolloverResponse} and HTTP response
     */
    getDatabaseRolloverWithHttpInfo() {
      let postBody = null;

      let pathParams = {
      };
      let queryParams = {
      };
      let headerParams = {
      };
      let formParams = {
      };

      let authNames = ['FactSetApiKey', 'FactSetOAuth2'];
      let contentTypes = [];
      let accepts = ['application/json'];


      let returnType = RolloverResponse;

      return this.apiClient.callApi(
        '/factset-prices/v1/database-rollover', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, null
      );
    }

    /**
     * Gets the latest relative rollover date for the database.
     * Gets zero relative date and last update time for FactSet databases. The dates represent the date that the rollover event happened; the date and time is in **eastern time zone**.  <p>Depending on the ids requested and their respective regions, a requested startDate or endDate used in the various Prices API may reflect different previous close dates. This relative \"zero\" date, meaning - as of yesterday's close - will vary across global regions. This API is designed to help production systems account for regional rollover dates to know when to trigger their processes for different regions to reflect the latest close. The response gives context for AMERICAS, ASIA PACIFIC, and EUROPE. </p> 
     * @return { Promise.< module:model/RolloverResponse > } a Promise, with data of type {@link module:model/RolloverResponse }
     */
    getDatabaseRollover() {
      return this.getDatabaseRolloverWithHttpInfo()
        .then(function(response_and_data) {
          return response_and_data.data;
        });
    }


    /**
     * Gets the latest relative rollover date for the database.
     * Gets zero relative date and last update time for FactSet databases. The dates represent the date that the rollover event happened; the date and time is in **eastern time zone**.  <p>Depending on the ids requested and their respective regions, a requested startDate or endDate used in the various Prices API may reflect different previous close dates. This relative \"zero\" date, meaning - as of yesterday's close - will vary across global regions. This API is designed to help production systems account for regional rollover dates to know when to trigger their processes for different regions to reflect the latest close. The response gives context for AMERICAS, ASIA PACIFIC, and EUROPE. </p> 
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with an object containing data of type {@link module:model/RolloverResponse} and HTTP response
     */
    getDatabaseRolloverForListWithHttpInfo() {
      let postBody = null;

      let pathParams = {
      };
      let queryParams = {
      };
      let headerParams = {
      };
      let formParams = {
      };

      let authNames = ['FactSetApiKey', 'FactSetOAuth2'];
      let contentTypes = [];
      let accepts = ['application/json'];


      let returnType = RolloverResponse;

      return this.apiClient.callApi(
        '/factset-prices/v1/database-rollover', 'POST',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, null
      );
    }

    /**
     * Gets the latest relative rollover date for the database.
     * Gets zero relative date and last update time for FactSet databases. The dates represent the date that the rollover event happened; the date and time is in **eastern time zone**.  <p>Depending on the ids requested and their respective regions, a requested startDate or endDate used in the various Prices API may reflect different previous close dates. This relative \"zero\" date, meaning - as of yesterday's close - will vary across global regions. This API is designed to help production systems account for regional rollover dates to know when to trigger their processes for different regions to reflect the latest close. The response gives context for AMERICAS, ASIA PACIFIC, and EUROPE. </p> 
     * @return { Promise.< module:model/RolloverResponse > } a Promise, with data of type {@link module:model/RolloverResponse }
     */
    getDatabaseRolloverForList() {
      return this.getDatabaseRolloverForListWithHttpInfo()
        .then(function(response_and_data) {
          return response_and_data.data;
        });
    }


}





