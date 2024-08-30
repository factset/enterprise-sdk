/**
 * IRN API v1
 * Allows users to extract, create, update and configure IRN data.
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
import NewItemDto from '../model/NewItemDto';
import ProblemDetails from '../model/ProblemDetails';
import RelationshipCategoryDto from '../model/RelationshipCategoryDto';
import RelationshipCategoryListDto from '../model/RelationshipCategoryListDto';
import RelationshipCategorySaveDto from '../model/RelationshipCategorySaveDto';

/**
* ContactsRelationshipCategory service.
* @module api/ContactsRelationshipCategoryApi
*/
export default class ContactsRelationshipCategoryApi {

    /**
    * Constructs a new ContactsRelationshipCategoryApi. 
    * @alias module:api/ContactsRelationshipCategoryApi
    * @class
    * @param {module:ApiClient} [apiClient] Optional API client implementation to use,
    * default to {@link module:ApiClient#instance} if unspecified.
    */
    constructor(apiClient) {
        this.apiClient = apiClient || ApiClient.instance;
    }



    /**
     * Create a relationship category
     * Create a relationship category with given name
     * @param {Object} opts Optional parameters
     * @param {module:model/RelationshipCategorySaveDto} opts.relationshipCategorySaveDto RelationshipCategorySaveDto object to save
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with an object containing data of type {@link module:model/NewItemDto} and HTTP response
     */
    createRelationshipCategoryWithHttpInfo(opts) {
      opts = opts || {};
      let postBody = opts['relationshipCategorySaveDto'];

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


      let returnType = NewItemDto;

      return this.apiClient.callApi(
        '/relationship-categories', 'POST',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, null
      );
    }

    /**
     * Create a relationship category
     * Create a relationship category with given name
     * @param {Object} opts Optional parameters
     * @param {module:model/RelationshipCategorySaveDto} opts.relationshipCategorySaveDto RelationshipCategorySaveDto object to save
     * @return { Promise.< module:model/NewItemDto > } a Promise, with data of type {@link module:model/NewItemDto }
     */
    createRelationshipCategory(opts) {
      return this.createRelationshipCategoryWithHttpInfo(opts)
        .then(function(response_and_data) {
          return response_and_data.data;
        });
    }


    /**
     * Delete a relationship category
     * Delete a contact relationship category based on guid
     * @param {String} relationshipCategoryId relationshipCategoryId to delete associated record
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with an object containing HTTP response
     */
    deleteRelationshipCategoryWithHttpInfo(relationshipCategoryId) {
      let postBody = null;
      // verify the required parameter 'relationshipCategoryId' is set
      if (relationshipCategoryId === undefined || relationshipCategoryId === null) {
        throw new Error("Missing the required parameter 'relationshipCategoryId' when calling deleteRelationshipCategory");
      }

      let pathParams = {
        'relationshipCategoryId': relationshipCategoryId
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


      let returnType = null;

      return this.apiClient.callApi(
        '/relationship-categories/{relationshipCategoryId}', 'DELETE',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, null
      );
    }

    /**
     * Delete a relationship category
     * Delete a contact relationship category based on guid
     * @param {String} relationshipCategoryId relationshipCategoryId to delete associated record
     * @return { Promise } a Promise
     */
    deleteRelationshipCategory(relationshipCategoryId) {
      return this.deleteRelationshipCategoryWithHttpInfo(relationshipCategoryId)
        .then(function(response_and_data) {
          return response_and_data.data;
        });
    }


    /**
     * Edit a relationship category
     * Update details of contact relationship category
     * @param {String} relationshipCategoryId relationshipCategoryId to update associated record
     * @param {Object} opts Optional parameters
     * @param {module:model/RelationshipCategorySaveDto} opts.relationshipCategorySaveDto RelationshipCategorySaveDto object to update
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with an object containing HTTP response
     */
    editRelationshipCategoryWithHttpInfo(relationshipCategoryId, opts) {
      opts = opts || {};
      let postBody = opts['relationshipCategorySaveDto'];
      // verify the required parameter 'relationshipCategoryId' is set
      if (relationshipCategoryId === undefined || relationshipCategoryId === null) {
        throw new Error("Missing the required parameter 'relationshipCategoryId' when calling editRelationshipCategory");
      }

      let pathParams = {
        'relationshipCategoryId': relationshipCategoryId
      };
      let queryParams = {
      };
      let headerParams = {
      };
      let formParams = {
      };

      let authNames = ['FactSetApiKey', 'FactSetOAuth2'];
      let contentTypes = ['application/json-patch+json', 'application/json', 'text/json', 'application/_*+json'];
      let accepts = ['application/json'];


      let returnType = null;

      return this.apiClient.callApi(
        '/relationship-categories/{relationshipCategoryId}', 'PUT',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, null
      );
    }

    /**
     * Edit a relationship category
     * Update details of contact relationship category
     * @param {String} relationshipCategoryId relationshipCategoryId to update associated record
     * @param {Object} opts Optional parameters
     * @param {module:model/RelationshipCategorySaveDto} opts.relationshipCategorySaveDto RelationshipCategorySaveDto object to update
     * @return { Promise } a Promise
     */
    editRelationshipCategory(relationshipCategoryId, opts) {
      return this.editRelationshipCategoryWithHttpInfo(relationshipCategoryId, opts)
        .then(function(response_and_data) {
          return response_and_data.data;
        });
    }


    /**
     * Get list of the relationship categories configured in your group
     * Get all relationship categories configured in your group
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with an object containing data of type {@link Array.<module:model/RelationshipCategoryDto>} and HTTP response
     */
    getRelationshipCategoriesWithHttpInfo() {
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


      let returnType = [RelationshipCategoryDto];

      return this.apiClient.callApi(
        '/relationship-categories', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, null
      );
    }

    /**
     * Get list of the relationship categories configured in your group
     * Get all relationship categories configured in your group
     * @return { Promise.< Array.<module:model/RelationshipCategoryDto> > } a Promise, with data of type {@link Array.<module:model/RelationshipCategoryDto> }
     */
    getRelationshipCategories() {
      return this.getRelationshipCategoriesWithHttpInfo()
        .then(function(response_and_data) {
          return response_and_data.data;
        });
    }


    /**
     * Reorder relationship categories
     * Reorder relationship categories that are configured in your group
     * @param {Object} opts Optional parameters
     * @param {module:model/RelationshipCategoryListDto} opts.relationshipCategoryListDto List of Guid
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with an object containing HTTP response
     */
    updateRelationshipCategoryOrderWithHttpInfo(opts) {
      opts = opts || {};
      let postBody = opts['relationshipCategoryListDto'];

      let pathParams = {
      };
      let queryParams = {
      };
      let headerParams = {
      };
      let formParams = {
      };

      let authNames = ['FactSetApiKey', 'FactSetOAuth2'];
      let contentTypes = ['application/json-patch+json', 'application/json', 'text/json', 'application/_*+json'];
      let accepts = ['application/json'];


      let returnType = null;

      return this.apiClient.callApi(
        '/relationship-categories/reorder', 'POST',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, null
      );
    }

    /**
     * Reorder relationship categories
     * Reorder relationship categories that are configured in your group
     * @param {Object} opts Optional parameters
     * @param {module:model/RelationshipCategoryListDto} opts.relationshipCategoryListDto List of Guid
     * @return { Promise } a Promise
     */
    updateRelationshipCategoryOrder(opts) {
      return this.updateRelationshipCategoryOrderWithHttpInfo(opts)
        .then(function(response_and_data) {
          return response_and_data.data;
        });
    }


}





