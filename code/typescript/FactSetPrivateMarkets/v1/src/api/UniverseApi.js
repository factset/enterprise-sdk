/**
 * FactSet Private Markets API
 * FactSet Private Markets API encompasses Private Company Financials data to start. Private Company firmographics can be found in the FactSet Entity API. The future plans of this service will include additional Private Markets data, such as Private Equity/Venture Capital. 
 *
 * The version of the OpenAPI document: 1.2.0
 * Contact: api@factset.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 *
 */


import ApiClient from "../ApiClient";
import EntityMatchRequest from '../model/EntityMatchRequest';
import EntityMatchesResponse from '../model/EntityMatchesResponse';
import ErrorResponse from '../model/ErrorResponse';

/**
* Universe service.
* @module api/UniverseApi
*/
export default class UniverseApi {

    /**
    * Constructs a new UniverseApi. 
    * @alias module:api/UniverseApi
    * @class
    * @param {module:ApiClient} [apiClient] Optional API client implementation to use,
    * default to {@link module:ApiClient#instance} if unspecified.
    */
    constructor(apiClient) {
        this.apiClient = apiClient || ApiClient.instance;
    }



    /**
     * Get Entity Candidates and Matches for a single name and attributes.
     * Finds the best candidate entities matching the given entity name. Country code can also be supplied to narrow the search. <p>**Max of 1 Name permitted in a single GET request.** Use the POST method for /entity-match to fetch up to 25 names.</p><p> 
     * @param {String} name Name of Entity to match.
     * @param {Object} opts Optional parameters
     * @param {String} opts.country ISO2 country code corresponding to the entity name that is used when evaluating candidates for a match. For a list of ISO2 Country codes, visit [OA 8754](https://my.apps.factset.com/oa/pages/8754).
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with an object containing data of type {@link module:model/EntityMatchesResponse} and HTTP response
     */
    getUniverseWithHttpInfo(name, opts) {
      opts = opts || {};
      let postBody = null;
      // verify the required parameter 'name' is set
      if (name === undefined || name === null) {
        throw new Error("Missing the required parameter 'name' when calling getUniverse");
      }

      let pathParams = {
      };
      let queryParams = {
        'name': name,
        'country': opts['country']
      };
      let headerParams = {
      };
      let formParams = {
      };

      let authNames = ['FactSetApiKey', 'FactSetOAuth2'];
      let contentTypes = [];
      let accepts = ['application/json;charset=utf-8', 'application/json'];


      let returnType = EntityMatchesResponse;

      return this.apiClient.callApi(
        '/factset-private-markets/v1/universe', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, null
      );
    }

    /**
     * Get Entity Candidates and Matches for a single name and attributes.
     * Finds the best candidate entities matching the given entity name. Country code can also be supplied to narrow the search. <p>**Max of 1 Name permitted in a single GET request.** Use the POST method for /entity-match to fetch up to 25 names.</p><p> 
     * @param {String} name Name of Entity to match.
     * @param {Object} opts Optional parameters
     * @param {String} opts.country ISO2 country code corresponding to the entity name that is used when evaluating candidates for a match. For a list of ISO2 Country codes, visit [OA 8754](https://my.apps.factset.com/oa/pages/8754).
     * @return { Promise.< module:model/EntityMatchesResponse > } a Promise, with data of type {@link module:model/EntityMatchesResponse }
     */
    getUniverse(name, opts) {
      return this.getUniverseWithHttpInfo(name, opts)
        .then(function(response_and_data) {
          return response_and_data.data;
        });
    }


    /**
     * Get a list of Entity Candidates and Matches for a requested list of up to 25 names and attributes.
     * Finds the best candidate entities matching the given entity name. Country code can also be supplied to narrow the search. Finds the best candidate entities matching the given company name. <p>**Max of 25 Names inputted.**</p><p> 
     * @param {module:model/EntityMatchRequest} entityMatchRequest A request to match an Entity.
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with an object containing data of type {@link module:model/EntityMatchesResponse} and HTTP response
     */
    getUniverseForListWithHttpInfo(entityMatchRequest) {
      let postBody = entityMatchRequest;
      // verify the required parameter 'entityMatchRequest' is set
      if (entityMatchRequest === undefined || entityMatchRequest === null) {
        throw new Error("Missing the required parameter 'entityMatchRequest' when calling getUniverseForList");
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
      let accepts = ['application/json;charset=utf-8', 'application/json'];


      let returnType = EntityMatchesResponse;

      return this.apiClient.callApi(
        '/factset-private-markets/v1/universe', 'POST',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, null
      );
    }

    /**
     * Get a list of Entity Candidates and Matches for a requested list of up to 25 names and attributes.
     * Finds the best candidate entities matching the given entity name. Country code can also be supplied to narrow the search. Finds the best candidate entities matching the given company name. <p>**Max of 25 Names inputted.**</p><p> 
     * @param {module:model/EntityMatchRequest} entityMatchRequest A request to match an Entity.
     * @return { Promise.< module:model/EntityMatchesResponse > } a Promise, with data of type {@link module:model/EntityMatchesResponse }
     */
    getUniverseForList(entityMatchRequest) {
      return this.getUniverseForListWithHttpInfo(entityMatchRequest)
        .then(function(response_and_data) {
          return response_and_data.data;
        });
    }


}




