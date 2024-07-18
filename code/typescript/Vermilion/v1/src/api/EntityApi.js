/**
 * VRS API documentation
 * Documentation on all available end points in the VRSAPI
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
import EntityFieldValueDTO from '../model/EntityFieldValueDTO';
import ErrorList from '../model/ErrorList';

/**
* Entity service.
* @module api/EntityApi
*/
export default class EntityApi {

    /**
    * Constructs a new EntityApi. 
    * @alias module:api/EntityApi
    * @class
    * @param {module:ApiClient} [apiClient] Optional API client implementation to use,
    * default to {@link module:ApiClient#instance} if unspecified.
    */
    constructor(apiClient) {
        this.apiClient = apiClient || ApiClient.instance;
    }



    /**
     * Gets the entity values
     * Gets the entity values for the specified entity
     * @param {String} tenant The code of the tenancy
     * @param {String} entityCode The code of the entity
     * @param {Object} opts Optional parameters
     * @param {Array.<String>} opts.sort The entity field to sort on. Can only be sorted on entity key, description or secondary key fields. Append \"-\" to sort in descending order. If no parameter given, it will be sorted by key field in ascending order by default
     * @param {Number} opts.paginationLimit Non-negative maximum number of entries to return. Default is 25 (default to 25)
     * @param {Number} opts.paginationOffset Non-negative number of entries to skip. Default is 0 (default to 0)
     * @param {Number} opts.showAll Whether to show all field values for each entity row. Value should either be 1 or 0. Default is 0 (false). Otherwise, show all field values in a JSON array named \"fieldsWithValues\", with each array value being a string in the format of \"**<FIELD_NAME> : <FIELD_VALUE>**\". Both key and description field values will be included in this JSON array too. (default to 0)
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with an object containing data of type {@link module:model/EntityFieldValueDTO} and HTTP response
     */
    getEntityValuesByCodeWithHttpInfo(tenant, entityCode, opts) {
      opts = opts || {};
      let postBody = null;
      // verify the required parameter 'tenant' is set
      if (tenant === undefined || tenant === null) {
        throw new Error("Missing the required parameter 'tenant' when calling getEntityValuesByCode");
      }
      // verify the required parameter 'entityCode' is set
      if (entityCode === undefined || entityCode === null) {
        throw new Error("Missing the required parameter 'entityCode' when calling getEntityValuesByCode");
      }

      let pathParams = {
        'tenant': tenant,
        'entityCode': entityCode
      };
      let queryParams = {
        '_sort': this.apiClient.buildCollectionParam(opts['sort'], 'csv'),
        '_paginationLimit': opts['paginationLimit'],
        '_paginationOffset': opts['paginationOffset'],
        'showAll': opts['showAll']
      };
      let headerParams = {
      };
      let formParams = {
      };

      let authNames = ['FactSetApiKey', 'FactSetOAuth2'];
      let contentTypes = [];
      let accepts = ['application/json'];


      let returnType = EntityFieldValueDTO;

      return this.apiClient.callApi(
        '/v1/{tenant}/entities/{entityCode}/values', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, null
      );
    }

    /**
     * Gets the entity values
     * Gets the entity values for the specified entity
     * @param {String} tenant The code of the tenancy
     * @param {String} entityCode The code of the entity
     * @param {Object} opts Optional parameters
     * @param {Array.<String>} opts.sort The entity field to sort on. Can only be sorted on entity key, description or secondary key fields. Append \"-\" to sort in descending order. If no parameter given, it will be sorted by key field in ascending order by default
     * @param {Number} opts.paginationLimit Non-negative maximum number of entries to return. Default is 25 (default to 25)
     * @param {Number} opts.paginationOffset Non-negative number of entries to skip. Default is 0 (default to 0)
     * @param {Number} opts.showAll Whether to show all field values for each entity row. Value should either be 1 or 0. Default is 0 (false). Otherwise, show all field values in a JSON array named \"fieldsWithValues\", with each array value being a string in the format of \"**<FIELD_NAME> : <FIELD_VALUE>**\". Both key and description field values will be included in this JSON array too. (default to 0)
     * @return { Promise.< module:model/EntityFieldValueDTO > } a Promise, with data of type {@link module:model/EntityFieldValueDTO }
     */
    getEntityValuesByCode(tenant, entityCode, opts) {
      return this.getEntityValuesByCodeWithHttpInfo(tenant, entityCode, opts)
        .then(function(response_and_data) {
          return response_and_data.data;
        });
    }


}





