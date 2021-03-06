/**
 * Barra Portfolio Optimizer API
 * Allow clients to fetch Analytics through APIs.
 *
 * The version of the OpenAPI document: 3
 * Contact: analytics.api.support@factset.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 *
 */


import ApiClient from "../ApiClient";
import BPMOptimizationParametersRoot from '../model/BPMOptimizationParametersRoot';
import CalculationInfoRoot from '../model/CalculationInfoRoot';
import ClientErrorResponse from '../model/ClientErrorResponse';
import ObjectRoot from '../model/ObjectRoot';

/**
* BPMOptimizer service.
* @module api/BPMOptimizerApi
*/
export default class BPMOptimizerApi {

    /**
    * Constructs a new BPMOptimizerApi. 
    * @alias module:api/BPMOptimizerApi
    * @class
    * @param {module:ApiClient} [apiClient] Optional API client implementation to use,
    * default to {@link module:ApiClient#instance} if unspecified.
    */
    constructor(apiClient) {
        this.apiClient = apiClient || ApiClient.instance;
    }



    /**
     * Cancel BPM optimization by id
     * This is the endpoint to cancel a previously submitted optimization.
     * @param {String} id from url, provided from the location header in the Create and Run BPM optimization endpoint
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with an object containing HTTP response
     */
    cancelOptimizationByIdWithHttpInfo(id) {
      let postBody = null;
      // verify the required parameter 'id' is set
      if (id === undefined || id === null) {
        throw new Error("Missing the required parameter 'id' when calling cancelOptimizationById");
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
      let accepts = ['text/plain', 'application/json', 'text/json'];


      let returnType = null;

      return this.apiClient.callApi(
        '/analytics/engines/bpm/v3/optimizations/{id}', 'DELETE',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, null
      );
    }

    /**
     * Cancel BPM optimization by id
     * This is the endpoint to cancel a previously submitted optimization.
     * @param {String} id from url, provided from the location header in the Create and Run BPM optimization endpoint
     * @return { Promise } a Promise
     */
    cancelOptimizationById(id) {
      return this.cancelOptimizationByIdWithHttpInfo(id)
        .then(function(response_and_data) {
          return response_and_data.data;
        });
    }


    /**
     * Get BPM optimization parameters by id
     * This is the endpoint that returns the optimization parameters passed for an optimization.
     * @param {String} id from url, provided from the location header in the Create and Run BPM optimization endpoint
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with an object containing data of type {@link module:model/BPMOptimizationParametersRoot} and HTTP response
     */
    getOptimizationParametersWithHttpInfo(id) {
      let postBody = null;
      // verify the required parameter 'id' is set
      if (id === undefined || id === null) {
        throw new Error("Missing the required parameter 'id' when calling getOptimizationParameters");
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
      let accepts = ['application/json'];


      let returnType = BPMOptimizationParametersRoot;

      return this.apiClient.callApi(
        '/analytics/engines/bpm/v3/optimizations/{id}', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, null
      );
    }

    /**
     * Get BPM optimization parameters by id
     * This is the endpoint that returns the optimization parameters passed for an optimization.
     * @param {String} id from url, provided from the location header in the Create and Run BPM optimization endpoint
     * @return { Promise.< module:model/BPMOptimizationParametersRoot > } a Promise, with data of type {@link module:model/BPMOptimizationParametersRoot }
     */
    getOptimizationParameters(id) {
      return this.getOptimizationParametersWithHttpInfo(id)
        .then(function(response_and_data) {
          return response_and_data.data;
        });
    }


    /**
     * Get BPM optimization result by id
     * This is the endpoint to get the result of a previously requested optimization.
     * @param {String} id from url, provided from the location header in the Get BPM optimization status by id endpoint
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with an object containing data of type {@link module:model/ObjectRoot} and HTTP response
     */
    getOptimizationResultWithHttpInfo(id) {
      let postBody = null;
      // verify the required parameter 'id' is set
      if (id === undefined || id === null) {
        throw new Error("Missing the required parameter 'id' when calling getOptimizationResult");
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
      let accepts = ['application/json'];


      let returnType = ObjectRoot;

      return this.apiClient.callApi(
        '/analytics/engines/bpm/v3/optimizations/{id}/result', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, null
      );
    }

    /**
     * Get BPM optimization result by id
     * This is the endpoint to get the result of a previously requested optimization.
     * @param {String} id from url, provided from the location header in the Get BPM optimization status by id endpoint
     * @return { Promise.< module:model/ObjectRoot > } a Promise, with data of type {@link module:model/ObjectRoot }
     */
    getOptimizationResult(id) {
      return this.getOptimizationResultWithHttpInfo(id)
        .then(function(response_and_data) {
          return response_and_data.data;
        });
    }


    /**
     * Get BPM optimization status by id
     * This is the endpoint to check on the progress of a previously requested optimization.  If the optimization has finished computing, the body of the response will contain result in JSON.  Otherwise, the optimization is still running and the X-FactSet-Api-PickUp-Progress header will contain a progress percentage.
     * @param {String} id from url, provided from the location header in the Create and Run BPM optimization endpoint
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with an object containing data of type {@link module:model/ObjectRoot} and HTTP response
     */
    getOptimizationStatusByIdWithHttpInfo(id) {
      let postBody = null;
      // verify the required parameter 'id' is set
      if (id === undefined || id === null) {
        throw new Error("Missing the required parameter 'id' when calling getOptimizationStatusById");
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
      let accepts = ['application/json'];


      let returnType = ObjectRoot;

      return this.apiClient.callApi(
        '/analytics/engines/bpm/v3/optimizations/{id}/status', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, null
      );
    }

    /**
     * Get BPM optimization status by id
     * This is the endpoint to check on the progress of a previously requested optimization.  If the optimization has finished computing, the body of the response will contain result in JSON.  Otherwise, the optimization is still running and the X-FactSet-Api-PickUp-Progress header will contain a progress percentage.
     * @param {String} id from url, provided from the location header in the Create and Run BPM optimization endpoint
     * @return { Promise.< module:model/ObjectRoot > } a Promise, with data of type {@link module:model/ObjectRoot }
     */
    getOptimizationStatusById(id) {
      return this.getOptimizationStatusByIdWithHttpInfo(id)
        .then(function(response_and_data) {
          return response_and_data.data;
        });
    }


    /**
     * Create and Run BPM optimization
     * This endpoint creates and runs BPM optimization specified in the POST body parameters.                Remarks:                * Any settings in POST body will act as a one-time override over the settings saved in the strategy document.
     * @param {Object} opts Optional parameters
     * @param {Number} opts.xFactSetApiLongRunningDeadline Long running deadline in seconds.
     * @param {String} opts.cacheControl Standard HTTP header.  Accepts no-store, max-age, max-stale.
     * @param {module:model/BPMOptimizationParametersRoot} opts.bPMOptimizationParametersRoot Optimization Parameters
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with an object containing data of type {@link module:model/ObjectRoot} and HTTP response
     */
    postAndOptimizeWithHttpInfo(opts) {
      opts = opts || {};
      let postBody = opts['bPMOptimizationParametersRoot'];

      let pathParams = {
      };
      let queryParams = {
      };
      let headerParams = {
        'X-FactSet-Api-Long-Running-Deadline': opts['xFactSetApiLongRunningDeadline'],
        'Cache-Control': opts['cacheControl']
      };
      let formParams = {
      };

      let authNames = ['FactSetApiKey', 'FactSetOAuth2'];
      let contentTypes = ['application/json'];
      let accepts = ['application/json'];

      let returnType = PostAndOptimizeResponseWrapperTypeMap;
      
      return this.apiClient.callApi(
        '/analytics/engines/bpm/v3/optimizations', 'POST',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, null
      );
    }

    /**
     * Create and Run BPM optimization
     * This endpoint creates and runs BPM optimization specified in the POST body parameters.                Remarks:                * Any settings in POST body will act as a one-time override over the settings saved in the strategy document.
     * @param {Object} opts Optional parameters
     * @param {Number} opts.xFactSetApiLongRunningDeadline Long running deadline in seconds.
     * @param {String} opts.cacheControl Standard HTTP header.  Accepts no-store, max-age, max-stale.
     * @param {module:model/BPMOptimizationParametersRoot} opts.bPMOptimizationParametersRoot Optimization Parameters
     * @return { Promise.< PostAndOptimizeResponseWrapper > } a Promise, with data of type {@link PostAndOptimizeResponseWrapper }
     */
    postAndOptimize(opts) {
      return this.postAndOptimizeWithHttpInfo(opts)
        .then(function(response_and_data) {
          return response_and_data.data;
        });
    }


    /**
     * Create or Update BPM optimization and run it.
     * This endpoint updates and run the BPM optimization specified in the PUT body parameters. It also allows the creation of new BPM optimization with custom id.
     * @param {String} id from url, provided from the location header in the Create and Run BPM optimization endpoint
     * @param {Object} opts Optional parameters
     * @param {Number} opts.xFactSetApiLongRunningDeadline Long running deadline in seconds.
     * @param {String} opts.cacheControl Standard HTTP header.  Accepts no-store, max-age, max-stale.
     * @param {module:model/BPMOptimizationParametersRoot} opts.bPMOptimizationParametersRoot Optimization Parameters
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with an object containing data of type {@link module:model/ObjectRoot} and HTTP response
     */
    putAndOptimizeWithHttpInfo(id, opts) {
      opts = opts || {};
      let postBody = opts['bPMOptimizationParametersRoot'];
      // verify the required parameter 'id' is set
      if (id === undefined || id === null) {
        throw new Error("Missing the required parameter 'id' when calling putAndOptimize");
      }

      let pathParams = {
        'id': id
      };
      let queryParams = {
      };
      let headerParams = {
        'X-FactSet-Api-Long-Running-Deadline': opts['xFactSetApiLongRunningDeadline'],
        'Cache-Control': opts['cacheControl']
      };
      let formParams = {
      };

      let authNames = ['FactSetApiKey', 'FactSetOAuth2'];
      let contentTypes = ['application/json'];
      let accepts = ['application/json'];

      let returnType = PutAndOptimizeResponseWrapperTypeMap;
      
      return this.apiClient.callApi(
        '/analytics/engines/bpm/v3/optimizations/{id}', 'PUT',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, null
      );
    }

    /**
     * Create or Update BPM optimization and run it.
     * This endpoint updates and run the BPM optimization specified in the PUT body parameters. It also allows the creation of new BPM optimization with custom id.
     * @param {String} id from url, provided from the location header in the Create and Run BPM optimization endpoint
     * @param {Object} opts Optional parameters
     * @param {Number} opts.xFactSetApiLongRunningDeadline Long running deadline in seconds.
     * @param {String} opts.cacheControl Standard HTTP header.  Accepts no-store, max-age, max-stale.
     * @param {module:model/BPMOptimizationParametersRoot} opts.bPMOptimizationParametersRoot Optimization Parameters
     * @return { Promise.< PutAndOptimizeResponseWrapper > } a Promise, with data of type {@link PutAndOptimizeResponseWrapper }
     */
    putAndOptimize(id, opts) {
      return this.putAndOptimizeWithHttpInfo(id, opts)
        .then(function(response_and_data) {
          return response_and_data.data;
        });
    }


}


const PostAndOptimizeResponseWrapperTypeMap = {
  201: ObjectRoot,
  202: CalculationInfoRoot,
  400: ClientErrorResponse,
  404: ClientErrorResponse,

  _createResponseWrapper(statusCode, response) {
    return new PostAndOptimizeResponseWrapper(statusCode, response);
  }
};

const PutAndOptimizeResponseWrapperTypeMap = {
  201: ObjectRoot,
  202: CalculationInfoRoot,
  400: ClientErrorResponse,
  404: ClientErrorResponse,
  409: ClientErrorResponse,

  _createResponseWrapper(statusCode, response) {
    return new PutAndOptimizeResponseWrapper(statusCode, response);
  }
};



/**
 * Wrapper to support POST /analytics/engines/bpm/v3/optimizations returning different types
 * per status code.
 *
 * <p>
 * Responses:
 * <ul>
 *   <li>201 : {@code ObjectRoot }<br>Expected response, returns json if optimization is completed in a short span.</li>
 * 
 *   <li>202 : {@code CalculationInfoRoot }<br>Expected response, contains the poll URL in the Location header.</li>
 * </ul>
 *
 * </p>
 * Example:
 * <pre>{@code
 * const response = ...;
 * switch (response.statusCode) {
 *   case 201:
 *     ObjectRoot data201 = response.getResponse201();
 *     break;
 *   case 202:
 *     CalculationInfoRoot data202 = response.getResponse202();
 *     break;
 *  }
 * }</pre>
 *
 * @alias module:PostAndOptimizeResponseWrapper
 * @class
 */
export class PostAndOptimizeResponseWrapper {

  /**
   * @param {number} statusCode
   * @param {*} response
   */
  constructor(statusCode, response) {
    /**
     * @type {number}
     */
    this.statusCode = statusCode;

    /**
     * @type {*}
     */
    this.response = response;
  }

  
  /**
   * @returns { ObjectRoot }
   */
  getResponse201() {
    if (this.statusCode !== 201) {
      throw new Error("Invalid response getter called. getResponse201 can't return a " + this.statusCode + " response");
    }

    return this.response;
  }
  
  /**
   * @returns { CalculationInfoRoot }
   */
  getResponse202() {
    if (this.statusCode !== 202) {
      throw new Error("Invalid response getter called. getResponse202 can't return a " + this.statusCode + " response");
    }

    return this.response;
  }
  
}

/**
 * Wrapper to support PUT /analytics/engines/bpm/v3/optimizations/{id} returning different types
 * per status code.
 *
 * <p>
 * Responses:
 * <ul>
 *   <li>201 : {@code ObjectRoot }<br>Expected response, returns json if optimization is completed in a short span.</li>
 * 
 *   <li>202 : {@code CalculationInfoRoot }<br>Expected response, contains the poll URL in the Location header.</li>
 * </ul>
 *
 * </p>
 * Example:
 * <pre>{@code
 * const response = ...;
 * switch (response.statusCode) {
 *   case 201:
 *     ObjectRoot data201 = response.getResponse201();
 *     break;
 *   case 202:
 *     CalculationInfoRoot data202 = response.getResponse202();
 *     break;
 *  }
 * }</pre>
 *
 * @alias module:PutAndOptimizeResponseWrapper
 * @class
 */
export class PutAndOptimizeResponseWrapper {

  /**
   * @param {number} statusCode
   * @param {*} response
   */
  constructor(statusCode, response) {
    /**
     * @type {number}
     */
    this.statusCode = statusCode;

    /**
     * @type {*}
     */
    this.response = response;
  }

  
  /**
   * @returns { ObjectRoot }
   */
  getResponse201() {
    if (this.statusCode !== 201) {
      throw new Error("Invalid response getter called. getResponse201 can't return a " + this.statusCode + " response");
    }

    return this.response;
  }
  
  /**
   * @returns { CalculationInfoRoot }
   */
  getResponse202() {
    if (this.statusCode !== 202) {
      throw new Error("Invalid response getter called. getResponse202 can't return a " + this.statusCode + " response");
    }

    return this.response;
  }
  
}


