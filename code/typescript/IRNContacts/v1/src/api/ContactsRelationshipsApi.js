/**
 * IRN API v1
 * Allows users to extract, create, update and configure IRN data.
 *
 * The version of the OpenAPI document: 1
 * Contact: api@factset.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 *
 */


import ApiClient from "../ApiClient";
import ContactRelationshipTwoSidedDto from '../model/ContactRelationshipTwoSidedDto';
import ContactRelationshipTwoSidedSaveDto from '../model/ContactRelationshipTwoSidedSaveDto';
import NewItemDto from '../model/NewItemDto';
import Operation from '../model/Operation';
import ProblemDetails from '../model/ProblemDetails';

/**
* ContactsRelationships service.
* @module api/ContactsRelationshipsApi
*/
export default class ContactsRelationshipsApi {

    /**
    * Constructs a new ContactsRelationshipsApi. 
    * @alias module:api/ContactsRelationshipsApi
    * @class
    * @param {module:ApiClient} [apiClient] Optional API client implementation to use,
    * default to {@link module:ApiClient#instance} if unspecified.
    */
    constructor(apiClient) {
        this.apiClient = apiClient || ApiClient.instance;
    }



    /**
     * Create a contact relationship
     * @param {Object} opts Optional parameters
     * @param {module:model/ContactRelationshipTwoSidedSaveDto} opts.contactRelationshipTwoSidedSaveDto contactRelationship object to save
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with an object containing data of type {@link module:model/NewItemDto} and HTTP response
     */
    createContactRelationshipWithHttpInfo(opts) {
      opts = opts || {};
      let postBody = opts['contactRelationshipTwoSidedSaveDto'];

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


      let returnType = NewItemDto;

      return this.apiClient.callApi(
        '/contact-relationships', 'POST',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, null
      );
    }

    /**
     * Create a contact relationship
     * @param {Object} opts Optional parameters
     * @param {module:model/ContactRelationshipTwoSidedSaveDto} opts.contactRelationshipTwoSidedSaveDto contactRelationship object to save
     * @return { Promise.< module:model/NewItemDto > } a Promise, with data of type {@link module:model/NewItemDto }
     */
    createContactRelationship(opts) {
      return this.createContactRelationshipWithHttpInfo(opts)
        .then(function(response_and_data) {
          return response_and_data.data;
        });
    }


    /**
     * Delete a contact relationship
     * @param {String} contactRelationshipId contactRelationshipId to delete associated record
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with an object containing HTTP response
     */
    deleteContactRelationshipWithHttpInfo(contactRelationshipId) {
      let postBody = null;
      // verify the required parameter 'contactRelationshipId' is set
      if (contactRelationshipId === undefined || contactRelationshipId === null) {
        throw new Error("Missing the required parameter 'contactRelationshipId' when calling deleteContactRelationship");
      }

      let pathParams = {
        'contactRelationshipId': contactRelationshipId
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
        '/contact-relationships/{contactRelationshipId}', 'DELETE',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, null
      );
    }

    /**
     * Delete a contact relationship
     * @param {String} contactRelationshipId contactRelationshipId to delete associated record
     * @return { Promise } a Promise
     */
    deleteContactRelationship(contactRelationshipId) {
      return this.deleteContactRelationshipWithHttpInfo(contactRelationshipId)
        .then(function(response_and_data) {
          return response_and_data.data;
        });
    }


    /**
     * Get all the relationships where the given symbol or contact identifier has been tagged in a relationship
     * @param {Object} opts Optional parameters
     * @param {String} opts.symbol 
     * @param {String} opts.contactId 
     * @param {String} opts.relationshipId 
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with an object containing data of type {@link Array.<module:model/ContactRelationshipTwoSidedDto>} and HTTP response
     */
    getAllRelationshipsTaggingAContactWithHttpInfo(opts) {
      opts = opts || {};
      let postBody = null;

      let pathParams = {
      };
      let queryParams = {
        'symbol': opts['symbol'],
        'contactId': opts['contactId'],
        'relationshipId': opts['relationshipId']
      };
      let headerParams = {
      };
      let formParams = {
      };

      let authNames = ['FactSetApiKey', 'FactSetOAuth2'];
      let contentTypes = [];
      let accepts = ['application/json'];


      let returnType = [ContactRelationshipTwoSidedDto];

      return this.apiClient.callApi(
        '/contact-relationships', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, null
      );
    }

    /**
     * Get all the relationships where the given symbol or contact identifier has been tagged in a relationship
     * @param {Object} opts Optional parameters
     * @param {String} opts.symbol 
     * @param {String} opts.contactId 
     * @param {String} opts.relationshipId 
     * @return { Promise.< Array.<module:model/ContactRelationshipTwoSidedDto> > } a Promise, with data of type {@link Array.<module:model/ContactRelationshipTwoSidedDto> }
     */
    getAllRelationshipsTaggingAContact(opts) {
      return this.getAllRelationshipsTaggingAContactWithHttpInfo(opts)
        .then(function(response_and_data) {
          return response_and_data.data;
        });
    }


    /**
     * Get details on a specific contact relationship
     * @param {String} contactRelationshipId contactRelationshipId to get associated record
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with an object containing data of type {@link module:model/ContactRelationshipTwoSidedDto} and HTTP response
     */
    getContactRelationshipWithHttpInfo(contactRelationshipId) {
      let postBody = null;
      // verify the required parameter 'contactRelationshipId' is set
      if (contactRelationshipId === undefined || contactRelationshipId === null) {
        throw new Error("Missing the required parameter 'contactRelationshipId' when calling getContactRelationship");
      }

      let pathParams = {
        'contactRelationshipId': contactRelationshipId
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


      let returnType = ContactRelationshipTwoSidedDto;

      return this.apiClient.callApi(
        '/contact-relationships/{contactRelationshipId}', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, null
      );
    }

    /**
     * Get details on a specific contact relationship
     * @param {String} contactRelationshipId contactRelationshipId to get associated record
     * @return { Promise.< module:model/ContactRelationshipTwoSidedDto > } a Promise, with data of type {@link module:model/ContactRelationshipTwoSidedDto }
     */
    getContactRelationship(contactRelationshipId) {
      return this.getContactRelationshipWithHttpInfo(contactRelationshipId)
        .then(function(response_and_data) {
          return response_and_data.data;
        });
    }


    /**
     * Update a contact relationship
     * @param {String} contactRelationshipId contactRelationshipId to update associated record
     * @param {Object} opts Optional parameters
     * @param {Array.<module:model/Operation>} opts.operation contactRelationshipPatch object to update
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with an object containing HTTP response
     */
    patchContactRelationshipWithHttpInfo(contactRelationshipId, opts) {
      opts = opts || {};
      let postBody = opts['operation'];
      // verify the required parameter 'contactRelationshipId' is set
      if (contactRelationshipId === undefined || contactRelationshipId === null) {
        throw new Error("Missing the required parameter 'contactRelationshipId' when calling patchContactRelationship");
      }

      let pathParams = {
        'contactRelationshipId': contactRelationshipId
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
        '/contact-relationships/{contactRelationshipId}', 'PATCH',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, null
      );
    }

    /**
     * Update a contact relationship
     * @param {String} contactRelationshipId contactRelationshipId to update associated record
     * @param {Object} opts Optional parameters
     * @param {Array.<module:model/Operation>} opts.operation contactRelationshipPatch object to update
     * @return { Promise } a Promise
     */
    patchContactRelationship(contactRelationshipId, opts) {
      return this.patchContactRelationshipWithHttpInfo(contactRelationshipId, opts)
        .then(function(response_and_data) {
          return response_and_data.data;
        });
    }


}





