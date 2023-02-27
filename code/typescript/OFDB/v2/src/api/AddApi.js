/**
 * OFDB API
 * OFDB API
 *
 * The version of the OpenAPI document: 2.0.0
 * Contact: api@factset.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 *
 */


import ApiClient from "../ApiClient";
import AddDates from '../model/AddDates';
import AddFields from '../model/AddFields';
import AddSymbols from '../model/AddSymbols';
import InlineResponse202 from '../model/InlineResponse202';
import InlineResponse400 from '../model/InlineResponse400';
import InlineResponse403 from '../model/InlineResponse403';
import InlineResponse404 from '../model/InlineResponse404';
import InlineResponse406 from '../model/InlineResponse406';
import InlineResponse413 from '../model/InlineResponse413';
import InlineResponse429 from '../model/InlineResponse429';
import SuccessPostResponse from '../model/SuccessPostResponse';

/**
* Add service.
* @module api/AddApi
*/
export default class AddApi {

    /**
    * Constructs a new AddApi. 
    * @alias module:api/AddApi
    * @class
    * @param {module:ApiClient} [apiClient] Optional API client implementation to use,
    * default to {@link module:ApiClient#instance} if unspecified.
    */
    constructor(apiClient) {
        this.apiClient = apiClient || ApiClient.instance;
    }



    /**
     * Creates a new date with single/multiple symbols for a 3d database(OFDB).
     * @param {String} path Encode database path
     * @param {module:model/AddDates} addDates Required data for creating date in the database. At least one iterative field is required otherwise it will throw 400.
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with an object containing data of type {@link module:model/SuccessPostResponse} and HTTP response
     */
    addDatesWithHttpInfo(path, addDates) {
      let postBody = addDates;
      // verify the required parameter 'path' is set
      if (path === undefined || path === null) {
        throw new Error("Missing the required parameter 'path' when calling addDates");
      }
      // verify the required parameter 'addDates' is set
      if (addDates === undefined || addDates === null) {
        throw new Error("Missing the required parameter 'addDates' when calling addDates");
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
      let contentTypes = ['application/json'];
      let accepts = ['application/json'];


      let returnType = SuccessPostResponse;

      return this.apiClient.callApi(
        '/database/{path}/dates', 'POST',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, null
      );
    }

    /**
     * Creates a new date with single/multiple symbols for a 3d database(OFDB).
     * @param {String} path Encode database path
     * @param {module:model/AddDates} addDates Required data for creating date in the database. At least one iterative field is required otherwise it will throw 400.
     * @return { Promise.< module:model/SuccessPostResponse > } a Promise, with data of type {@link module:model/SuccessPostResponse }
     */
    addDates(path, addDates) {
      return this.addDatesWithHttpInfo(path, addDates)
        .then(function(response_and_data) {
          return response_and_data.data;
        });
    }


    /**
     * Allows users to add fields to existing OFDBs
     * @param {String} path Encode database path
     * @param {module:model/AddFields} addFields Data for creating fields in the database.
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with an object containing data of type {@link module:model/SuccessPostResponse} and HTTP response
     */
    addFieldsWithHttpInfo(path, addFields) {
      let postBody = addFields;
      // verify the required parameter 'path' is set
      if (path === undefined || path === null) {
        throw new Error("Missing the required parameter 'path' when calling addFields");
      }
      // verify the required parameter 'addFields' is set
      if (addFields === undefined || addFields === null) {
        throw new Error("Missing the required parameter 'addFields' when calling addFields");
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
      let contentTypes = ['application/json'];
      let accepts = ['application/json'];


      let returnType = SuccessPostResponse;

      return this.apiClient.callApi(
        '/database/{path}/fields', 'POST',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, null
      );
    }

    /**
     * Allows users to add fields to existing OFDBs
     * @param {String} path Encode database path
     * @param {module:model/AddFields} addFields Data for creating fields in the database.
     * @return { Promise.< module:model/SuccessPostResponse > } a Promise, with data of type {@link module:model/SuccessPostResponse }
     */
    addFields(path, addFields) {
      return this.addFieldsWithHttpInfo(path, addFields)
        .then(function(response_and_data) {
          return response_and_data.data;
        });
    }


    /**
     * Creates a new symbol with single/multiple dates for 3d database(OFDB). Creates a symbol for 2d database(OFDB)
     * @param {String} path Encode database path
     * @param {module:model/AddSymbols} addSymbols Data for creating symbol in the database
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with an object containing data of type {@link module:model/SuccessPostResponse} and HTTP response
     */
    addSymbolsWithHttpInfo(path, addSymbols) {
      let postBody = addSymbols;
      // verify the required parameter 'path' is set
      if (path === undefined || path === null) {
        throw new Error("Missing the required parameter 'path' when calling addSymbols");
      }
      // verify the required parameter 'addSymbols' is set
      if (addSymbols === undefined || addSymbols === null) {
        throw new Error("Missing the required parameter 'addSymbols' when calling addSymbols");
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
      let contentTypes = ['application/json'];
      let accepts = ['application/json'];


      let returnType = SuccessPostResponse;

      return this.apiClient.callApi(
        '/database/{path}/symbols', 'POST',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, null
      );
    }

    /**
     * Creates a new symbol with single/multiple dates for 3d database(OFDB). Creates a symbol for 2d database(OFDB)
     * @param {String} path Encode database path
     * @param {module:model/AddSymbols} addSymbols Data for creating symbol in the database
     * @return { Promise.< module:model/SuccessPostResponse > } a Promise, with data of type {@link module:model/SuccessPostResponse }
     */
    addSymbols(path, addSymbols) {
      return this.addSymbolsWithHttpInfo(path, addSymbols)
        .then(function(response_and_data) {
          return response_and_data.data;
        });
    }


}




