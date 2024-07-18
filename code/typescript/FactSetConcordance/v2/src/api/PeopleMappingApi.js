/**
 * FactSet Concordance API
 *   The FactSet Concordance API enables Application Developers and Data Scientists to programmatically discover the FactSet Identifier for a specific Entity or Person based on attributes, such as name, URL, and location.FactSet Identifiers are mapped to industry-standard identifiers, as well as to a comprehensive set of reference data and unique content, to enhance the ability to quickly connect content sets.<p>     Using the submitted attributes, the FactSet Concordance API leverages FactSet’s extensive Entity Master, People, and Symbology databases to return potential candidate matches and a proposed match. The result is a concorded FactSet Identifier that can then be used as input throughout FactSet's expanding catalog of Content using our Content APIs or Standard DataFeeds.</p>    <b>There are two types of workflows supported in the API:</b>    <b>Entity & People Match:</b> The first workflow follows traditional API conventions in that a request is accepted and a response is returned synchronously enabling the concordance of up to 25 names in a single request. The response returns a list of 20 candidates as well as a proposed match.    <b>Entity & People Match - Bulk:</b> The second workflow allows you to input a large list of names within a .CSV file in a single request With this workflow, a task is created for uploading a set of queries. Once the task has completed, the client retrieves the concordance results through the /entity-decisions or /people-decisions endpoint. Note that in the Bulk workflow, only the matches for the records are returned. Candidates are not included.    Once the service has provided a list of concorded FactSet Identifiers, you can then use our Entity Mappings and People Mappings endpoints to further review the universe of mapped identifiers or modify existing records. </p><p><b>Rate limit is set to 10 requests per second</b>.</p>    Methodology Guide link:   [https://open.factset.com/api/public/media/download/products/documents/8ca33e81-a7da-4d77-a8cf-2b3a2e868b3d](https://open.factset.com/api/public/media/download/products/documents/8ca33e81-a7da-4d77-a8cf-2b3a2e868b3d)    
 *
 * The version of the OpenAPI document: 2.8.0
 * Contact: api@factset.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 *
 */


import ApiClient from "../ApiClient";
import EntityMappingDeleteRequest from '../model/EntityMappingDeleteRequest';
import ErrorResponse from '../model/ErrorResponse';
import PeopleMappingDeleteResponse from '../model/PeopleMappingDeleteResponse';
import PeopleMappingRequest from '../model/PeopleMappingRequest';
import PeopleMappingResponse from '../model/PeopleMappingResponse';
import PeopleUniverseRequest from '../model/PeopleUniverseRequest';
import PeopleUniverseResponse from '../model/PeopleUniverseResponse';

/**
* PeopleMapping service.
* @module api/PeopleMappingApi
*/
export default class PeopleMappingApi {

    /**
    * Constructs a new PeopleMappingApi. 
    * @alias module:api/PeopleMappingApi
    * @class
    * @param {module:ApiClient} [apiClient] Optional API client implementation to use,
    * default to {@link module:ApiClient#instance} if unspecified.
    */
    constructor(apiClient) {
        this.apiClient = apiClient || ApiClient.instance;
    }



    /**
     * Deletes mapping specified by the client.
     * Delete a Concordance Mapping to the client universe. When making a post, all exiting values are overwritten in the database with the values passed in the request. clientId and universeId are required. 
     * @param {module:model/EntityMappingDeleteRequest} entityMappingDeleteRequest A request to delete people mappings specified by the client
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with an object containing data of type {@link module:model/PeopleMappingDeleteResponse} and HTTP response
     */
    getPeopleMappingDeleteForListWithHttpInfo(entityMappingDeleteRequest) {
      let postBody = entityMappingDeleteRequest;
      // verify the required parameter 'entityMappingDeleteRequest' is set
      if (entityMappingDeleteRequest === undefined || entityMappingDeleteRequest === null) {
        throw new Error("Missing the required parameter 'entityMappingDeleteRequest' when calling getPeopleMappingDeleteForList");
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


      let returnType = PeopleMappingDeleteResponse;

      return this.apiClient.callApi(
        '/factset-concordance/v2/people-mapping-delete', 'POST',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, null
      );
    }

    /**
     * Deletes mapping specified by the client.
     * Delete a Concordance Mapping to the client universe. When making a post, all exiting values are overwritten in the database with the values passed in the request. clientId and universeId are required. 
     * @param {module:model/EntityMappingDeleteRequest} entityMappingDeleteRequest A request to delete people mappings specified by the client
     * @return { Promise.< module:model/PeopleMappingDeleteResponse > } a Promise, with data of type {@link module:model/PeopleMappingDeleteResponse }
     */
    getPeopleMappingDeleteForList(entityMappingDeleteRequest) {
      return this.getPeopleMappingDeleteForListWithHttpInfo(entityMappingDeleteRequest)
        .then(function(response_and_data) {
          return response_and_data.data;
        });
    }


    /**
     * Saves a single-mapping specified by the client.
     * Saves a single Concordance People Mapping to a given universe. When making a post, all exiting values are overwritten in the database with the values passed in the request. clientId and clientName are required. 
     * @param {module:model/PeopleMappingRequest} peopleMappingRequest A request to create a single mapping.
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with an object containing data of type {@link module:model/PeopleMappingResponse} and HTTP response
     */
    getPeopleMappingForListWithHttpInfo(peopleMappingRequest) {
      let postBody = peopleMappingRequest;
      // verify the required parameter 'peopleMappingRequest' is set
      if (peopleMappingRequest === undefined || peopleMappingRequest === null) {
        throw new Error("Missing the required parameter 'peopleMappingRequest' when calling getPeopleMappingForList");
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


      let returnType = PeopleMappingResponse;

      return this.apiClient.callApi(
        '/factset-concordance/v2/people-mapping', 'POST',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, null
      );
    }

    /**
     * Saves a single-mapping specified by the client.
     * Saves a single Concordance People Mapping to a given universe. When making a post, all exiting values are overwritten in the database with the values passed in the request. clientId and clientName are required. 
     * @param {module:model/PeopleMappingRequest} peopleMappingRequest A request to create a single mapping.
     * @return { Promise.< module:model/PeopleMappingResponse > } a Promise, with data of type {@link module:model/PeopleMappingResponse }
     */
    getPeopleMappingForList(peopleMappingRequest) {
      return this.getPeopleMappingForListWithHttpInfo(peopleMappingRequest)
        .then(function(response_and_data) {
          return response_and_data.data;
        });
    }


    /**
     * Retrieve all saved mappings within a requested universe
     * Retrieves all people mappings within a requested universe. 
     * @param {Number} universeId Universe identifier. *To create a universe, use the `/universe' endpoint.*
     * @param {Object} opts Optional parameters
     * @param {Array.<String>} opts.clientId Filter by the clientId(s) created by the user in a previous mapping. 
     * @param {Array.<module:model/String>} opts.mapStatus Filter by the Entity Decisions that have the specified mapStatus, where -   * MAPPED - The requested Entity Name is successfully mapped to a FactSet Entity Id (-E)   * UNMAPPED - The requested Entity Name is unmapped by FactSet.   * INDETERMINATE - The requested Entity Name was unable to make a mapping. 
     * @param {Number} opts.offset Starting row for records to return or rows to skip. (default to 0)
     * @param {Number} opts.limit Limits the number of records in the response.
     * @param {Array.<String>} opts.sort Sort clientId, createdTime, updatedTime, clientPersonName, personId fields in ascending or descending order with asc and desc to indicate the order. Example (clientId:asc)
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with an object containing data of type {@link module:model/PeopleUniverseResponse} and HTTP response
     */
    getPeopleUniverseWithHttpInfo(universeId, opts) {
      opts = opts || {};
      let postBody = null;
      // verify the required parameter 'universeId' is set
      if (universeId === undefined || universeId === null) {
        throw new Error("Missing the required parameter 'universeId' when calling getPeopleUniverse");
      }

      let pathParams = {
      };
      let queryParams = {
        'universeId': universeId,
        'clientId': this.apiClient.buildCollectionParam(opts['clientId'], 'csv'),
        'mapStatus': this.apiClient.buildCollectionParam(opts['mapStatus'], 'multi'),
        'offset': opts['offset'],
        'limit': opts['limit'],
        'sort': this.apiClient.buildCollectionParam(opts['sort'], 'csv')
      };
      let headerParams = {
      };
      let formParams = {
      };

      let authNames = ['FactSetApiKey', 'FactSetOAuth2'];
      let contentTypes = [];
      let accepts = ['application/json'];


      let returnType = PeopleUniverseResponse;

      return this.apiClient.callApi(
        '/factset-concordance/v2/people-universe', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, null
      );
    }

    /**
     * Retrieve all saved mappings within a requested universe
     * Retrieves all people mappings within a requested universe. 
     * @param {Number} universeId Universe identifier. *To create a universe, use the `/universe' endpoint.*
     * @param {Object} opts Optional parameters
     * @param {Array.<String>} opts.clientId Filter by the clientId(s) created by the user in a previous mapping. 
     * @param {Array.<module:model/String>} opts.mapStatus Filter by the Entity Decisions that have the specified mapStatus, where -   * MAPPED - The requested Entity Name is successfully mapped to a FactSet Entity Id (-E)   * UNMAPPED - The requested Entity Name is unmapped by FactSet.   * INDETERMINATE - The requested Entity Name was unable to make a mapping. 
     * @param {Number} opts.offset Starting row for records to return or rows to skip. (default to 0)
     * @param {Number} opts.limit Limits the number of records in the response.
     * @param {Array.<String>} opts.sort Sort clientId, createdTime, updatedTime, clientPersonName, personId fields in ascending or descending order with asc and desc to indicate the order. Example (clientId:asc)
     * @return { Promise.< module:model/PeopleUniverseResponse > } a Promise, with data of type {@link module:model/PeopleUniverseResponse }
     */
    getPeopleUniverse(universeId, opts) {
      return this.getPeopleUniverseWithHttpInfo(universeId, opts)
        .then(function(response_and_data) {
          return response_and_data.data;
        });
    }


    /**
     * Retrieve all saved mappings within a requested universe or large list of client ids
     * Retrieves all people mappings that were saved in a given universe. Supports filtering by a large number of `clientId`s 
     * @param {module:model/PeopleUniverseRequest} peopleUniverseRequest A request to fetch all entities of a given universe
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with an object containing data of type {@link module:model/PeopleUniverseResponse} and HTTP response
     */
    getPeopleUniverseForListWithHttpInfo(peopleUniverseRequest) {
      let postBody = peopleUniverseRequest;
      // verify the required parameter 'peopleUniverseRequest' is set
      if (peopleUniverseRequest === undefined || peopleUniverseRequest === null) {
        throw new Error("Missing the required parameter 'peopleUniverseRequest' when calling getPeopleUniverseForList");
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


      let returnType = PeopleUniverseResponse;

      return this.apiClient.callApi(
        '/factset-concordance/v2/people-universe', 'POST',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, null
      );
    }

    /**
     * Retrieve all saved mappings within a requested universe or large list of client ids
     * Retrieves all people mappings that were saved in a given universe. Supports filtering by a large number of `clientId`s 
     * @param {module:model/PeopleUniverseRequest} peopleUniverseRequest A request to fetch all entities of a given universe
     * @return { Promise.< module:model/PeopleUniverseResponse > } a Promise, with data of type {@link module:model/PeopleUniverseResponse }
     */
    getPeopleUniverseForList(peopleUniverseRequest) {
      return this.getPeopleUniverseForListWithHttpInfo(peopleUniverseRequest)
        .then(function(response_and_data) {
          return response_and_data.data;
        });
    }


}





