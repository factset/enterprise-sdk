/**
 * FactSet Concordance API
 *   The FactSet Concordance API enables Application Developers and Data Scientists to programmatically discover the FactSet Identifier for a specific Entity or Person based on attributes, such as name, URL, and location.FactSet Identifiers are mapped to industry-standard identifiers, as well as to a comprehensive set of reference data and unique content, to enhance the ability to quickly connect content sets.<p>     Using the submitted attributes, the FactSet Concordance API leverages FactSet’s extensive Entity Master, People, and Symbology databases to return potential candidate matches and a proposed match. The result is a concorded FactSet Identifier that can then be used as input throughout FactSet's expanding catalog of Content using our Content APIs or Standard DataFeeds.</p>    <b>There are two types of workflows supported in the API:</b>    <b>Entity & People Match:</b> The first workflow follows traditional API conventions in that a request is accepted and a response is returned synchronously enabling the concordance of up to 25 names in a single request. The response returns a list of 20 candidates as well as a proposed match.    <b>Entity & People Match - Bulk:</b> The second workflow allows you to input a large list of names within a .CSV file in a single request. With this workflow, a task is created for uploading a set of queries. Once the task has completed, the client retrieves the concordance results through the /entity-decisions or /people-decisions endpoint. Note that in the Bulk workflow, only the matches for the records are returned. Candidates are not included.    Once the service has provided a list of concorded FactSet Identifiers, you can then use our Entity Mappings and People Mappings endpoints to further review the universe of mapped identifiers or modify existing records. </p><p><b>Rate limit is set to 10 requests per second</b>.</p>    Methodology Guide link:   [https://open.factset.com/api/public/media/download/products/documents/8ca33e81-a7da-4d77-a8cf-2b3a2e868b3d](https://open.factset.com/api/public/media/download/products/documents/8ca33e81-a7da-4d77-a8cf-2b3a2e868b3d)    
 *
 * The version of the OpenAPI document: 2.10.0
 * Contact: api@factset.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 *
 */


import ApiClient from "../ApiClient";
import SnowflakeEntityMappingRequest from '../model/SnowflakeEntityMappingRequest';
import SnowflakeEntityMappingResponse from '../model/SnowflakeEntityMappingResponse';
import SnowflakeEntityMatchRequest from '../model/SnowflakeEntityMatchRequest';
import SnowflakeEntityMatchResponse from '../model/SnowflakeEntityMatchResponse';

/**
* Snowflake service.
* @module api/SnowflakeApi
*/
export default class SnowflakeApi {

    /**
    * Constructs a new SnowflakeApi. 
    * @alias module:api/SnowflakeApi
    * @class
    * @param {module:ApiClient} [apiClient] Optional API client implementation to use,
    * default to {@link module:ApiClient#instance} if unspecified.
    */
    constructor(apiClient) {
        this.apiClient = apiClient || ApiClient.instance;
    }



    /**
     * Perform an entity search and return a snowflake-friendly response. Up to 25 Names per request.
     * Finds the best candidate entities matching the given company name. Additional attributes can be supplied to narrow the search. *This endpoint is used natively within Snowflake and is not to be consumed directly by users. Reach out to your FactSet Account team to learn more about Concordance in Snowflake.* 
     * @param {module:model/SnowflakeEntityMatchRequest} snowflakeEntityMatchRequest A request to match an entity name and its attributes within Snowflake.
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with an object containing data of type {@link module:model/SnowflakeEntityMatchResponse} and HTTP response
     */
    getSnowflakeEntityMatchForListWithHttpInfo(snowflakeEntityMatchRequest) {
      let postBody = snowflakeEntityMatchRequest;
      // verify the required parameter 'snowflakeEntityMatchRequest' is set
      if (snowflakeEntityMatchRequest === undefined || snowflakeEntityMatchRequest === null) {
        throw new Error("Missing the required parameter 'snowflakeEntityMatchRequest' when calling getSnowflakeEntityMatchForList");
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


      let returnType = SnowflakeEntityMatchResponse;

      return this.apiClient.callApi(
        '/factset-concordance/v2/snowflake-entity-match', 'POST',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, null
      );
    }

    /**
     * Perform an entity search and return a snowflake-friendly response. Up to 25 Names per request.
     * Finds the best candidate entities matching the given company name. Additional attributes can be supplied to narrow the search. *This endpoint is used natively within Snowflake and is not to be consumed directly by users. Reach out to your FactSet Account team to learn more about Concordance in Snowflake.* 
     * @param {module:model/SnowflakeEntityMatchRequest} snowflakeEntityMatchRequest A request to match an entity name and its attributes within Snowflake.
     * @return { Promise.< module:model/SnowflakeEntityMatchResponse > } a Promise, with data of type {@link module:model/SnowflakeEntityMatchResponse }
     */
    getSnowflakeEntityMatchForList(snowflakeEntityMatchRequest) {
      return this.getSnowflakeEntityMatchForListWithHttpInfo(snowflakeEntityMatchRequest)
        .then(function(response_and_data) {
          return response_and_data.data;
        });
    }


    /**
     * Save entity mappings to a universe
     * Manually save or update entity mappings with metadata
     * @param {module:model/SnowflakeEntityMappingRequest} snowflakeEntityMappingRequest A request to save entity mappings to a universe
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with an object containing data of type {@link module:model/SnowflakeEntityMappingResponse} and HTTP response
     */
    snowflakeEntityMappingPostWithHttpInfo(snowflakeEntityMappingRequest) {
      let postBody = snowflakeEntityMappingRequest;
      // verify the required parameter 'snowflakeEntityMappingRequest' is set
      if (snowflakeEntityMappingRequest === undefined || snowflakeEntityMappingRequest === null) {
        throw new Error("Missing the required parameter 'snowflakeEntityMappingRequest' when calling snowflakeEntityMappingPost");
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


      let returnType = SnowflakeEntityMappingResponse;

      return this.apiClient.callApi(
        '/factset-concordance/v2/snowflake-entity-mapping', 'POST',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, null
      );
    }

    /**
     * Save entity mappings to a universe
     * Manually save or update entity mappings with metadata
     * @param {module:model/SnowflakeEntityMappingRequest} snowflakeEntityMappingRequest A request to save entity mappings to a universe
     * @return { Promise.< module:model/SnowflakeEntityMappingResponse > } a Promise, with data of type {@link module:model/SnowflakeEntityMappingResponse }
     */
    snowflakeEntityMappingPost(snowflakeEntityMappingRequest) {
      return this.snowflakeEntityMappingPostWithHttpInfo(snowflakeEntityMappingRequest)
        .then(function(response_and_data) {
          return response_and_data.data;
        });
    }


}





