/**
 * OFDB API
 * OFDB api
 *
 * The version of the OpenAPI document: 1.0.0
 * Contact: client.portfolio.data.engineering@factset.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 *
 */


import ApiClient from "../ApiClient";
import AddDatabase from '../model/AddDatabase';
import AddSymbolDate from '../model/AddSymbolDate';
import AddSymbolDate3D from '../model/AddSymbolDate3D';
import AddSymbols from '../model/AddSymbols';
import DatabaseSchema from '../model/DatabaseSchema';
import InlineResponse202 from '../model/InlineResponse202';
import InlineResponse400 from '../model/InlineResponse400';
import InlineResponse403 from '../model/InlineResponse403';
import InlineResponse404 from '../model/InlineResponse404';
import InlineResponse413 from '../model/InlineResponse413';
import InlineResponse429 from '../model/InlineResponse429';
import SuccessPostResponse from '../model/SuccessPostResponse';

/**
* Create service.
* @module api/CreateApi
*/
export default class CreateApi {

    /**
    * Constructs a new CreateApi. 
    * @alias module:api/CreateApi
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
     * @param {module:model/AddSymbolDate} addSymbolDate Required data for creating date in the database. At least one iterative field is required otherwise it will throw 400.
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with an object containing data of type {@link module:model/SuccessPostResponse} and HTTP response
     */
    addSymbolDateWithHttpInfo(path, addSymbolDate) {
      let postBody = addSymbolDate;
      // verify the required parameter 'path' is set
      if (path === undefined || path === null) {
        throw new Error("Missing the required parameter 'path' when calling addSymbolDate");
      }
      // verify the required parameter 'addSymbolDate' is set
      if (addSymbolDate === undefined || addSymbolDate === null) {
        throw new Error("Missing the required parameter 'addSymbolDate' when calling addSymbolDate");
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
        '/v1/database/{path}/dates', 'POST',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, null
      );
    }

    /**
     * Creates a new date with single/multiple symbols for a 3d database(OFDB).
     * @param {String} path Encode database path
     * @param {module:model/AddSymbolDate} addSymbolDate Required data for creating date in the database. At least one iterative field is required otherwise it will throw 400.
     * @return { Promise.< module:model/SuccessPostResponse > } a Promise, with data of type {@link module:model/SuccessPostResponse }
     */
    addSymbolDate(path, addSymbolDate) {
      return this.addSymbolDateWithHttpInfo(path, addSymbolDate)
        .then(function(response_and_data) {
          return response_and_data.data;
        });
    }


    /**
     * Creates a new symbol for a given date in 3d database(OFDB)
     * @param {String} path Encode database path
     * @param {Number} date Date in YYYYMMDD format
     * @param {module:model/AddSymbolDate3D} addSymbolDate3D Data for creating symbol specific to a date in the database. At least one 3d field is required along with symbol.
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with an object containing data of type {@link module:model/SuccessPostResponse} and HTTP response
     */
    addSymbolDate3DWithHttpInfo(path, date, addSymbolDate3D) {
      let postBody = addSymbolDate3D;
      // verify the required parameter 'path' is set
      if (path === undefined || path === null) {
        throw new Error("Missing the required parameter 'path' when calling addSymbolDate3D");
      }
      // verify the required parameter 'date' is set
      if (date === undefined || date === null) {
        throw new Error("Missing the required parameter 'date' when calling addSymbolDate3D");
      }
      // verify the required parameter 'addSymbolDate3D' is set
      if (addSymbolDate3D === undefined || addSymbolDate3D === null) {
        throw new Error("Missing the required parameter 'addSymbolDate3D' when calling addSymbolDate3D");
      }

      let pathParams = {
        'path': path,
        'date': date
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
        '/v1/database/{path}/dates/{date}/symbols', 'POST',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, null
      );
    }

    /**
     * Creates a new symbol for a given date in 3d database(OFDB)
     * @param {String} path Encode database path
     * @param {Number} date Date in YYYYMMDD format
     * @param {module:model/AddSymbolDate3D} addSymbolDate3D Data for creating symbol specific to a date in the database. At least one 3d field is required along with symbol.
     * @return { Promise.< module:model/SuccessPostResponse > } a Promise, with data of type {@link module:model/SuccessPostResponse }
     */
    addSymbolDate3D(path, date, addSymbolDate3D) {
      return this.addSymbolDate3DWithHttpInfo(path, date, addSymbolDate3D)
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
        '/v1/database/{path}/symbols', 'POST',
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


    /**
     * Creates a 2d or 3d database(OFDB)
     * @param {Object} opts Optional parameters
     * @param {module:model/DatabaseSchema} opts.databaseSchema 
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with an object containing data of type {@link module:model/AddDatabase} and HTTP response
     */
    createDatabaseWithHttpInfo(opts) {
      opts = opts || {};
      let postBody = opts['databaseSchema'];

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


      let returnType = AddDatabase;

      return this.apiClient.callApi(
        '/v1/database/', 'POST',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, null
      );
    }

    /**
     * Creates a 2d or 3d database(OFDB)
     * @param {Object} opts Optional parameters
     * @param {module:model/DatabaseSchema} opts.databaseSchema 
     * @return { Promise.< module:model/AddDatabase > } a Promise, with data of type {@link module:model/AddDatabase }
     */
    createDatabase(opts) {
      return this.createDatabaseWithHttpInfo(opts)
        .then(function(response_and_data) {
          return response_and_data.data;
        });
    }


}





