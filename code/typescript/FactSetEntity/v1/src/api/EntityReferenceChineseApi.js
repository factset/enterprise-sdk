/**
 * FactSet Entity API
 * Using an entity centric data model, FactSet's Entity API provides access to FactSet's complete security and entity level symbology, comprehensive entity reference data, and all of the necessary relationships and connections to create a foundation that tightly correlates disparate sources of information to a master entity identifier. Use this API to quickly understand the full entity structure and related securities.<p><b>Rate limit is set to 10 requests per second</b>.</p> 
 *
 * The version of the OpenAPI document: 1.5.0
 * Contact: api@factset.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 *
 */


import ApiClient from "../ApiClient";
import EntityReferenceChiRequest from '../model/EntityReferenceChiRequest';
import EntityReferenceChiResponse from '../model/EntityReferenceChiResponse';
import ErrorResponse from '../model/ErrorResponse';

/**
* EntityReferenceChinese service.
* @module api/EntityReferenceChineseApi
*/
export default class EntityReferenceChineseApi {

    /**
    * Constructs a new EntityReferenceChineseApi. 
    * @alias module:api/EntityReferenceChineseApi
    * @class
    * @param {module:ApiClient} [apiClient] Optional API client implementation to use,
    * default to {@link module:ApiClient#instance} if unspecified.
    */
    constructor(apiClient) {
        this.apiClient = apiClient || ApiClient.instance;
    }



    /**
     * Returns entity reference data in Chinese for an individual entity.
     * Returns entity reference data in Chinese for the requested Id(s). Data points include Business Description and Entity Name in both simplified and traditional Chinese. 
     * @param {Array.<String>} ids The requested Market Identifier. Accepted input identifiers include Ticker-Exchange, Ticker-Regions, CUSIPs, ISINs, SEDOLs, BBGs or FactSet Permanent Ids, such as -R, -L, or -E.<p>**Max Ids Limit set to 1500 in a single request**</p>   *<p>Make note, GET Method URL request lines are also limited to a total length of 8192 bytes (8KB). In cases where the service allows for thousands of ids,       which may lead to exceeding this request line limit of 8KB, its       advised for any requests with large request lines to be requested through       the respective \\\"POST\\\" method.</p>* 
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with an object containing data of type {@link module:model/EntityReferenceChiResponse} and HTTP response
     */
    getEntityReferenceChiWithHttpInfo(ids) {
      let postBody = null;
      // verify the required parameter 'ids' is set
      if (ids === undefined || ids === null) {
        throw new Error("Missing the required parameter 'ids' when calling getEntityReferenceChi");
      }

      let pathParams = {
      };
      let queryParams = {
        'ids': this.apiClient.buildCollectionParam(ids, 'csv')
      };
      let headerParams = {
      };
      let formParams = {
      };

      let authNames = ['FactSetApiKey', 'FactSetOAuth2'];
      let contentTypes = [];
      let accepts = ['application/json'];


      let returnType = EntityReferenceChiResponse;

      return this.apiClient.callApi(
        '/factset-entity/v1/entity-reference-chi', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, null
      );
    }

    /**
     * Returns entity reference data in Chinese for an individual entity.
     * Returns entity reference data in Chinese for the requested Id(s). Data points include Business Description and Entity Name in both simplified and traditional Chinese. 
     * @param {Array.<String>} ids The requested Market Identifier. Accepted input identifiers include Ticker-Exchange, Ticker-Regions, CUSIPs, ISINs, SEDOLs, BBGs or FactSet Permanent Ids, such as -R, -L, or -E.<p>**Max Ids Limit set to 1500 in a single request**</p>   *<p>Make note, GET Method URL request lines are also limited to a total length of 8192 bytes (8KB). In cases where the service allows for thousands of ids,       which may lead to exceeding this request line limit of 8KB, its       advised for any requests with large request lines to be requested through       the respective \\\"POST\\\" method.</p>* 
     * @return { Promise.< module:model/EntityReferenceChiResponse > } a Promise, with data of type {@link module:model/EntityReferenceChiResponse }
     */
    getEntityReferenceChi(ids) {
      return this.getEntityReferenceChiWithHttpInfo(ids)
        .then(function(response_and_data) {
          return response_and_data.data;
        });
    }


    /**
     * Returns entity reference data in Chinese for an individual entity.
     * Returns entity reference data in Chinese for the requested Id(s). Data points include Business Description and Entity Name in both simplified and traditional Chinese. 
     * @param {module:model/EntityReferenceChiRequest} entityReferenceChiRequest Request Body to request a list of Entity Reference Chinese objects.
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with an object containing data of type {@link module:model/EntityReferenceChiResponse} and HTTP response
     */
    getEntityReferenceChiForListWithHttpInfo(entityReferenceChiRequest) {
      let postBody = entityReferenceChiRequest;
      // verify the required parameter 'entityReferenceChiRequest' is set
      if (entityReferenceChiRequest === undefined || entityReferenceChiRequest === null) {
        throw new Error("Missing the required parameter 'entityReferenceChiRequest' when calling getEntityReferenceChiForList");
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


      let returnType = EntityReferenceChiResponse;

      return this.apiClient.callApi(
        '/factset-entity/v1/entity-reference-chi', 'POST',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, null
      );
    }

    /**
     * Returns entity reference data in Chinese for an individual entity.
     * Returns entity reference data in Chinese for the requested Id(s). Data points include Business Description and Entity Name in both simplified and traditional Chinese. 
     * @param {module:model/EntityReferenceChiRequest} entityReferenceChiRequest Request Body to request a list of Entity Reference Chinese objects.
     * @return { Promise.< module:model/EntityReferenceChiResponse > } a Promise, with data of type {@link module:model/EntityReferenceChiResponse }
     */
    getEntityReferenceChiForList(entityReferenceChiRequest) {
      return this.getEntityReferenceChiForListWithHttpInfo(entityReferenceChiRequest)
        .then(function(response_and_data) {
          return response_and_data.data;
        });
    }


}





