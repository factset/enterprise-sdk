/**
 * Style Performance and Risk Analysis (SPAR) Engine API
 * Allow clients to fetch Analytics through APIs.
 *
 * The version of the OpenAPI document: 3.13.4
 * Contact: api@factset.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 *
 */


import ApiClient from "../ApiClient";
import AccountDirectoriesRoot from '../model/AccountDirectoriesRoot';
import ClientErrorResponse from '../model/ClientErrorResponse';
import SPARAccountsRoot from '../model/SPARAccountsRoot';

/**
* Accounts service.
* @module api/AccountsApi
*/
export default class AccountsApi {

    /**
    * Constructs a new AccountsApi. 
    * @alias module:api/AccountsApi
    * @class
    * @param {module:ApiClient} [apiClient] Optional API client implementation to use,
    * default to {@link module:ApiClient#instance} if unspecified.
    */
    constructor(apiClient) {
        this.apiClient = apiClient || ApiClient.instance;
    }



    /**
     * Get accounts and sub-directories in a directory
     * This endpoint looks up all ACCT and ACTM files and sub-directories in a given directory.
     * @param {String} path The directory to get the accounts and sub-directories.
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with an object containing data of type {@link module:model/AccountDirectoriesRoot} and HTTP response
     */
    getAccountsWithHttpInfo(path) {
      let postBody = null;
      // verify the required parameter 'path' is set
      if (path === undefined || path === null) {
        throw new Error("Missing the required parameter 'path' when calling getAccounts");
      }

      let pathParams = {
        'path': path
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


      let returnType = AccountDirectoriesRoot;

      return this.apiClient.callApi(
        '/analytics/lookups/v3/accounts/{path}', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, null
      );
    }

    /**
     * Get accounts and sub-directories in a directory
     * This endpoint looks up all ACCT and ACTM files and sub-directories in a given directory.
     * @param {String} path The directory to get the accounts and sub-directories.
     * @return { Promise.< module:model/AccountDirectoriesRoot > } a Promise, with data of type {@link module:model/AccountDirectoriesRoot }
     */
    getAccounts(path) {
      return this.getAccountsWithHttpInfo(path)
        .then(function(response_and_data) {
          return response_and_data.data;
        });
    }


    /**
     * Get SPAR account returns type details
     * This endpoint returns the returns type of account associated with SPAR
     * @param {String} accountPath URL encoded account path
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with an object containing data of type {@link module:model/SPARAccountsRoot} and HTTP response
     */
    getSPARReturnsTypeWithHttpInfo(accountPath) {
      let postBody = null;
      // verify the required parameter 'accountPath' is set
      if (accountPath === undefined || accountPath === null) {
        throw new Error("Missing the required parameter 'accountPath' when calling getSPARReturnsType");
      }

      let pathParams = {
        'accountPath': accountPath
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


      let returnType = SPARAccountsRoot;

      return this.apiClient.callApi(
        '/analytics/engines/spar/v3/accounts/{accountPath}/returns-type', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, null
      );
    }

    /**
     * Get SPAR account returns type details
     * This endpoint returns the returns type of account associated with SPAR
     * @param {String} accountPath URL encoded account path
     * @return { Promise.< module:model/SPARAccountsRoot > } a Promise, with data of type {@link module:model/SPARAccountsRoot }
     */
    getSPARReturnsType(accountPath) {
      return this.getSPARReturnsTypeWithHttpInfo(accountPath)
        .then(function(response_and_data) {
          return response_and_data.data;
        });
    }


}





