/**
 * FactSet People API
 * The FactSet People API exposes FactSet data for individuals and their jobs.<p>This API is rate-limited to 10 requests per second and 10 concurrent requests per user.</p> 
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
import PeopleJobsRequest from '../model/PeopleJobsRequest';
import PeopleJobsResponse from '../model/PeopleJobsResponse';

/**
* JobHistory service.
* @module api/JobHistoryApi
*/
export default class JobHistoryApi {

    /**
    * Constructs a new JobHistoryApi. 
    * @alias module:api/JobHistoryApi
    * @class
    * @param {module:ApiClient} [apiClient] Optional API client implementation to use,
    * default to {@link module:ApiClient#instance} if unspecified.
    */
    constructor(apiClient) {
        this.apiClient = apiClient || ApiClient.instance;
    }



    /**
     * Returns the Job history of the person.
     * Returns the `Job` history of the person referenced by the entityId specified in the request. 
     * @param {Array.<String>} ids List of FactSet Person Entity identifier.
     * @param {Object} opts Optional parameters
     * @param {module:model/String} opts.status Select only Jobs with a certain status primary, active, or inactive. (default to 'ALL')
     * @param {module:model/String} opts.level Select the level of detail only main Jobs or include other Jobs at a company. (default to 'DETAIL')
     * @param {module:model/String} opts.type Select only Jobs of a certain type board member or employee. (default to 'ALL')
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with an object containing data of type {@link module:model/PeopleJobsResponse} and HTTP response
     */
    getPeopleJobsWithHttpInfo(ids, opts) {
      opts = opts || {};
      let postBody = null;
      // verify the required parameter 'ids' is set
      if (ids === undefined || ids === null) {
        throw new Error("Missing the required parameter 'ids' when calling getPeopleJobs");
      }

      let pathParams = {
      };
      let queryParams = {
        'ids': this.apiClient.buildCollectionParam(ids, 'csv'),
        'status': opts['status'],
        'level': opts['level'],
        'type': opts['type']
      };
      let headerParams = {
      };
      let formParams = {
      };

      let authNames = ['FactSetApiKey', 'FactSetOAuth2'];
      let contentTypes = [];
      let accepts = ['application/json'];


      let returnType = PeopleJobsResponse;

      return this.apiClient.callApi(
        '/factset-people/v1/jobs', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, null
      );
    }

    /**
     * Returns the Job history of the person.
     * Returns the `Job` history of the person referenced by the entityId specified in the request. 
     * @param {Array.<String>} ids List of FactSet Person Entity identifier.
     * @param {Object} opts Optional parameters
     * @param {module:model/String} opts.status Select only Jobs with a certain status primary, active, or inactive. (default to 'ALL')
     * @param {module:model/String} opts.level Select the level of detail only main Jobs or include other Jobs at a company. (default to 'DETAIL')
     * @param {module:model/String} opts.type Select only Jobs of a certain type board member or employee. (default to 'ALL')
     * @return { Promise.< module:model/PeopleJobsResponse > } a Promise, with data of type {@link module:model/PeopleJobsResponse }
     */
    getPeopleJobs(ids, opts) {
      return this.getPeopleJobsWithHttpInfo(ids, opts)
        .then(function(response_and_data) {
          return response_and_data.data;
        });
    }


    /**
     * Returns the Job history for the large list of people.
     * Returns the `Job` history of the person referenced by the entityId specified in the request. 
     * @param {module:model/PeopleJobsRequest} peopleJobsRequest 
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with an object containing data of type {@link module:model/PeopleJobsResponse} and HTTP response
     */
    getPeopleJobsForListWithHttpInfo(peopleJobsRequest) {
      let postBody = peopleJobsRequest;
      // verify the required parameter 'peopleJobsRequest' is set
      if (peopleJobsRequest === undefined || peopleJobsRequest === null) {
        throw new Error("Missing the required parameter 'peopleJobsRequest' when calling getPeopleJobsForList");
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


      let returnType = PeopleJobsResponse;

      return this.apiClient.callApi(
        '/factset-people/v1/jobs', 'POST',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, null
      );
    }

    /**
     * Returns the Job history for the large list of people.
     * Returns the `Job` history of the person referenced by the entityId specified in the request. 
     * @param {module:model/PeopleJobsRequest} peopleJobsRequest 
     * @return { Promise.< module:model/PeopleJobsResponse > } a Promise, with data of type {@link module:model/PeopleJobsResponse }
     */
    getPeopleJobsForList(peopleJobsRequest) {
      return this.getPeopleJobsForListWithHttpInfo(peopleJobsRequest)
        .then(function(response_and_data) {
          return response_and_data.data;
        });
    }


}





