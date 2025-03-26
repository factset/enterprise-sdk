/**
 * FactSet SCIM API
 * FactSet's SCIM API implementation.
 *
 * The version of the OpenAPI document: 2.3.0
 * Contact: api@factset.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 *
 */


import ApiClient from "../ApiClient";
import Error from '../model/Error';
import InlineResponse429 from '../model/InlineResponse429';
import Patch from '../model/Patch';
import UserResource from '../model/UserResource';
import UserResourceList from '../model/UserResourceList';

/**
* Users service.
* @module api/UsersApi
*/
export default class UsersApi {

    /**
    * Constructs a new UsersApi. 
    * @alias module:api/UsersApi
    * @class
    * @param {module:ApiClient} [apiClient] Optional API client implementation to use,
    * default to {@link module:ApiClient#instance} if unspecified.
    */
    constructor(apiClient) {
        this.apiClient = apiClient || ApiClient.instance;
    }



    /**
     * Create a user.
     * Create a user resource.
     * @param {module:model/UserResource} userResource User resource.
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with an object containing data of type {@link module:model/UserResource} and HTTP response
     */
    createUserWithHttpInfo(userResource) {
      let postBody = userResource;
      // verify the required parameter 'userResource' is set
      if (userResource === undefined || userResource === null) {
        throw new Error("Missing the required parameter 'userResource' when calling createUser");
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
      let contentTypes = ['application/scim+json'];
      let accepts = ['application/scim+json', 'application/json'];


      let returnType = UserResource;

      return this.apiClient.callApi(
        '/Users', 'POST',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, null
      );
    }

    /**
     * Create a user.
     * Create a user resource.
     * @param {module:model/UserResource} userResource User resource.
     * @return { Promise.< module:model/UserResource > } a Promise, with data of type {@link module:model/UserResource }
     */
    createUser(userResource) {
      return this.createUserWithHttpInfo(userResource)
        .then(function(response_and_data) {
          return response_and_data.data;
        });
    }


    /**
     * Delete a user.
     * Delete a specific user resource.
     * @param {String} id ID of resource.
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with an object containing HTTP response
     */
    deleteUserWithHttpInfo(id) {
      let postBody = null;
      // verify the required parameter 'id' is set
      if (id === undefined || id === null) {
        throw new Error("Missing the required parameter 'id' when calling deleteUser");
      }

      let pathParams = {
        'id': id
      };
      let queryParams = {
      };
      let headerParams = {
      };
      let formParams = {
      };

      let authNames = ['FactSetApiKey', 'FactSetOAuth2'];
      let contentTypes = [];
      let accepts = ['application/scim+json', 'application/json'];


      let returnType = null;

      return this.apiClient.callApi(
        '/Users/{id}', 'DELETE',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, null
      );
    }

    /**
     * Delete a user.
     * Delete a specific user resource.
     * @param {String} id ID of resource.
     * @return { Promise } a Promise
     */
    deleteUser(id) {
      return this.deleteUserWithHttpInfo(id)
        .then(function(response_and_data) {
          return response_and_data.data;
        });
    }


    /**
     * Get a user.
     * Get a specific user resource.
     * @param {String} id ID of resource.
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with an object containing data of type {@link module:model/UserResource} and HTTP response
     */
    getUserWithHttpInfo(id) {
      let postBody = null;
      // verify the required parameter 'id' is set
      if (id === undefined || id === null) {
        throw new Error("Missing the required parameter 'id' when calling getUser");
      }

      let pathParams = {
        'id': id
      };
      let queryParams = {
      };
      let headerParams = {
      };
      let formParams = {
      };

      let authNames = ['FactSetApiKey', 'FactSetOAuth2'];
      let contentTypes = [];
      let accepts = ['application/scim+json', 'application/json'];


      let returnType = UserResource;

      return this.apiClient.callApi(
        '/Users/{id}', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, null
      );
    }

    /**
     * Get a user.
     * Get a specific user resource.
     * @param {String} id ID of resource.
     * @return { Promise.< module:model/UserResource > } a Promise, with data of type {@link module:model/UserResource }
     */
    getUser(id) {
      return this.getUserWithHttpInfo(id)
        .then(function(response_and_data) {
          return response_and_data.data;
        });
    }


    /**
     * Get a list of users.
     * Get a list of user resources.
     * @param {Object} opts Optional parameters
     * @param {String} opts.filter Resource filter string. See [RFC 7644 section 3.4.2.2](https://tools.ietf.org/html/rfc7644#section-3.4.2.2) for syntax. Note this API implementation also supports a non-standard \"re\" operator for regular expression matching against string attributes. When using the \"re\" operator, do not include slash characters as delimiters (e.g. use \"foo\" instead of \"/foo/\".) Also note the case-sensitivity of the regular expression corresponds to the \"caseExact\" characteristic of the target attribute.
     * @param {String} opts.sortBy Attribute to be used for sorting resources. See [RFC 7644 section 3.4.2.3](https://tools.ietf.org/html/rfc7644#section-3.4.2.3). The attribute name must be specified in standard attribute notation (see [RFC 7644 section 3.10](https://datatracker.ietf.org/doc/html/rfc7644#section-3.10).) Use the *sortOrder* parameter to specify whether resources should be sorted in ascending or descending order.
     * @param {String} opts.sortOrder The order by which resources are to be sorted. See [RFC 7644 section 3.4.2.3](https://tools.ietf.org/html/rfc7644#section-3.4.2.3). Valid values are ''ascending'' (the default value) or ''descending''. This parameter may not be used unless the *sortBy* parameter is also specified.
     * @param {Number} opts.startIndex Result start index. The one-based index of the first result to be returned in the list of resources. For example, to exclude the first two resources, use a *startIndex* value of 3. This parameter has a default value of 1. This index applies *after* any resource filtration has been applied as specified by the *filter* argument.
     * @param {Number} opts.count Maximum resource count. The server will not return more resources than this value, although it may return fewer.
     * @param {String} opts.attributes Attribute whitelist filter string. A comma-separated list of resource attribute names to be returned in the response, overriding the set of attributes that would be returned by default. Attribute names must be specified in standard attribute notation (see [RFC 7644 section 3.10](https://datatracker.ietf.org/doc/html/rfc7644#section-3.10).) This parameter cannot be used with the *excludedAttributes* parameter.
     * @param {String} opts.excludedAttributes Attribute blacklist filter string. A comma-separated list of resource attribute names to be excluded in the response, overriding the set of attributes that would be returned by default. Attribute names must be specified in standard attribute notation (see [RFC 7644 section 3.10](https://datatracker.ietf.org/doc/html/rfc7644#section-3.10).) This parameter cannot be used with the *attributes* parameter.
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with an object containing data of type {@link module:model/UserResourceList} and HTTP response
     */
    getUsersWithHttpInfo(opts) {
      opts = opts || {};
      let postBody = null;

      let pathParams = {
      };
      let queryParams = {
        'filter': opts['filter'],
        'sortBy': opts['sortBy'],
        'sortOrder': opts['sortOrder'],
        'startIndex': opts['startIndex'],
        'count': opts['count'],
        'attributes': opts['attributes'],
        'excludedAttributes': opts['excludedAttributes']
      };
      let headerParams = {
      };
      let formParams = {
      };

      let authNames = ['FactSetApiKey', 'FactSetOAuth2'];
      let contentTypes = [];
      let accepts = ['application/scim+json', 'application/json'];


      let returnType = UserResourceList;

      return this.apiClient.callApi(
        '/Users', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, null
      );
    }

    /**
     * Get a list of users.
     * Get a list of user resources.
     * @param {Object} opts Optional parameters
     * @param {String} opts.filter Resource filter string. See [RFC 7644 section 3.4.2.2](https://tools.ietf.org/html/rfc7644#section-3.4.2.2) for syntax. Note this API implementation also supports a non-standard \"re\" operator for regular expression matching against string attributes. When using the \"re\" operator, do not include slash characters as delimiters (e.g. use \"foo\" instead of \"/foo/\".) Also note the case-sensitivity of the regular expression corresponds to the \"caseExact\" characteristic of the target attribute.
     * @param {String} opts.sortBy Attribute to be used for sorting resources. See [RFC 7644 section 3.4.2.3](https://tools.ietf.org/html/rfc7644#section-3.4.2.3). The attribute name must be specified in standard attribute notation (see [RFC 7644 section 3.10](https://datatracker.ietf.org/doc/html/rfc7644#section-3.10).) Use the *sortOrder* parameter to specify whether resources should be sorted in ascending or descending order.
     * @param {String} opts.sortOrder The order by which resources are to be sorted. See [RFC 7644 section 3.4.2.3](https://tools.ietf.org/html/rfc7644#section-3.4.2.3). Valid values are ''ascending'' (the default value) or ''descending''. This parameter may not be used unless the *sortBy* parameter is also specified.
     * @param {Number} opts.startIndex Result start index. The one-based index of the first result to be returned in the list of resources. For example, to exclude the first two resources, use a *startIndex* value of 3. This parameter has a default value of 1. This index applies *after* any resource filtration has been applied as specified by the *filter* argument.
     * @param {Number} opts.count Maximum resource count. The server will not return more resources than this value, although it may return fewer.
     * @param {String} opts.attributes Attribute whitelist filter string. A comma-separated list of resource attribute names to be returned in the response, overriding the set of attributes that would be returned by default. Attribute names must be specified in standard attribute notation (see [RFC 7644 section 3.10](https://datatracker.ietf.org/doc/html/rfc7644#section-3.10).) This parameter cannot be used with the *excludedAttributes* parameter.
     * @param {String} opts.excludedAttributes Attribute blacklist filter string. A comma-separated list of resource attribute names to be excluded in the response, overriding the set of attributes that would be returned by default. Attribute names must be specified in standard attribute notation (see [RFC 7644 section 3.10](https://datatracker.ietf.org/doc/html/rfc7644#section-3.10).) This parameter cannot be used with the *attributes* parameter.
     * @return { Promise.< module:model/UserResourceList > } a Promise, with data of type {@link module:model/UserResourceList }
     */
    getUsers(opts) {
      return this.getUsersWithHttpInfo(opts)
        .then(function(response_and_data) {
          return response_and_data.data;
        });
    }


    /**
     * Patch a user.
     * Modify a specific user resource (i.e. add, replace, or remove attributes of a user resource.)
     * @param {String} id ID of resource.
     * @param {Object} opts Optional parameters
     * @param {module:model/Patch} opts.patch 
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with an object containing data of type {@link module:model/UserResource} and HTTP response
     */
    modifyUserWithHttpInfo(id, opts) {
      opts = opts || {};
      let postBody = opts['patch'];
      // verify the required parameter 'id' is set
      if (id === undefined || id === null) {
        throw new Error("Missing the required parameter 'id' when calling modifyUser");
      }

      let pathParams = {
        'id': id
      };
      let queryParams = {
      };
      let headerParams = {
      };
      let formParams = {
      };

      let authNames = ['FactSetApiKey', 'FactSetOAuth2'];
      let contentTypes = ['application/scim+json'];
      let accepts = ['application/scim+json', 'application/json'];


      let returnType = UserResource;

      return this.apiClient.callApi(
        '/Users/{id}', 'PATCH',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, null
      );
    }

    /**
     * Patch a user.
     * Modify a specific user resource (i.e. add, replace, or remove attributes of a user resource.)
     * @param {String} id ID of resource.
     * @param {Object} opts Optional parameters
     * @param {module:model/Patch} opts.patch 
     * @return { Promise.< module:model/UserResource > } a Promise, with data of type {@link module:model/UserResource }
     */
    modifyUser(id, opts) {
      return this.modifyUserWithHttpInfo(id, opts)
        .then(function(response_and_data) {
          return response_and_data.data;
        });
    }


    /**
     * Replace a user.
     * Replace a specific user resource with another provided user resource.
     * @param {String} id ID of resource.
     * @param {module:model/UserResource} userResource User resource.
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with an object containing data of type {@link module:model/UserResource} and HTTP response
     */
    replaceUserWithHttpInfo(id, userResource) {
      let postBody = userResource;
      // verify the required parameter 'id' is set
      if (id === undefined || id === null) {
        throw new Error("Missing the required parameter 'id' when calling replaceUser");
      }
      // verify the required parameter 'userResource' is set
      if (userResource === undefined || userResource === null) {
        throw new Error("Missing the required parameter 'userResource' when calling replaceUser");
      }

      let pathParams = {
        'id': id
      };
      let queryParams = {
      };
      let headerParams = {
      };
      let formParams = {
      };

      let authNames = ['FactSetApiKey', 'FactSetOAuth2'];
      let contentTypes = ['application/scim+json'];
      let accepts = ['application/scim+json', 'application/json'];


      let returnType = UserResource;

      return this.apiClient.callApi(
        '/Users/{id}', 'PUT',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, null
      );
    }

    /**
     * Replace a user.
     * Replace a specific user resource with another provided user resource.
     * @param {String} id ID of resource.
     * @param {module:model/UserResource} userResource User resource.
     * @return { Promise.< module:model/UserResource > } a Promise, with data of type {@link module:model/UserResource }
     */
    replaceUser(id, userResource) {
      return this.replaceUserWithHttpInfo(id, userResource)
        .then(function(response_and_data) {
          return response_and_data.data;
        });
    }


}





