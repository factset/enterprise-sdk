/**
 * FactSet Formula API
 *  **FactSet Formula API**  FactSet’s Formula API is a modern, flexible, formula-based API that enables users to access FactSet’s wide range of financial data and content. The API offers two endpoints, one optimized for time-series analysis and one designed for cross-sectional analysis, providing users a simplified interface into FactSet’s expansive offering. By providing two endpoints, it allows for the optimization of user workflows, while reducing complexity.  Leverage the power and flexibility of the Formula API to -   * Pull data from across most content sets that a user has access to in a single request   * Include business logic and mathematical operations in request   * Submit a dynamic universe in both endpoints   * Return the fsymId to easily combine with other FactSet content / products   * Set the trading calendar   * Define custom display names  **Formula API Request Builder**  The Formula API Request Builder provides users everything they need to form a Formula API request. In the Request Builder, you can select identifiers, build a universe expression, select FQL or Screening formulas, easily apply business logic and mathematical functions to the FQL or Screening formulas, specify optional parameters, and construct a GET or POST request. The Request Builder eliminates the need to have previous FQL and Screening knowledge and allows you to quickly find your desired data items and form the request.  The Formula API Request Builder can be accessed by navigating to [https://developer.factset.com/formula-api-request-builder](https://developer.factset.com/formula-api-request-builder) and logging in using your FactSet.net ID. When using the Request Builder to construct requests for the one of the Formula API's endpoints, be sure to toggle to the correct endpoint at the top of the page.  **How to Check the Health and Availability of the Formula API**  Please use the below endpoint to check the health and availability of the Formula API. You must be authorized for this API to use the Health endpoint.  [https://api.factset.com/formula-api/health](https://api.factset.com/formula-api/health)  **How to Programmatically Download API Specification File**  You can download the FactSet Formula API Specification File in .yaml. using the \"Download Spec\" button to the right of the version number. This specification can then be used for Codegen to create your own SDKs. 
 *
 * The version of the OpenAPI document: 1.8.0
 * Contact: api@factset.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 *
 */


import ApiClient from "../ApiClient";
import BatchStatusResponse from '../model/BatchStatusResponse';
import ErrorDetail from '../model/ErrorDetail';
import TimeSeriesRequest from '../model/TimeSeriesRequest';
import TimeSeriesResponse from '../model/TimeSeriesResponse';

/**
* TimeSeries service.
* @module api/TimeSeriesApi
*/
export default class TimeSeriesApi {

    /**
    * Constructs a new TimeSeriesApi. 
    * @alias module:api/TimeSeriesApi
    * @class
    * @param {module:ApiClient} [apiClient] Optional API client implementation to use,
    * default to {@link module:ApiClient#instance} if unspecified.
    */
    constructor(apiClient) {
        this.apiClient = apiClient || ApiClient.instance;
    }



    /**
     * Retrieve data items (FQL formulas) for a list of identifiers or defined universe.
     * The `/time-series` endpoint is closely aligned with FactSet’s powerful data retrieval language **FactSet Query Language (FQL)** which is optimized for time-series analysis. FQL can also perform sophisticated statistical, mathematical, logical, and other complex operations on the data.    This endpoint has a unique **TIMESERIES** data object that pairs the requested data with FactSet provided dates. This helps reduce the need for additional data requests and reduces the work required by users.  The `/time-series` endpoint supports Long Running asynchronous requests up to **30 minutes** via the `batch` parameter. *This feature is available to Individual Users subscribed to the Performance Package and Performance Package Plus Performance Tiers and all Production Users. If you are unsure which Performance Tier you are subscribed to or you would like to gain access to the batch capabilities, please contact your FactSet Account Team or \"Report Issue\" above and our support teams can assist.* 
     * @param {Array.<String>} formulas List of FQL formulas
     * @param {Object} opts Optional parameters
     * @param {Array.<String>} opts.ids List of entity identifiers. This request value is sent back in the response as the field *requestId*. By default, accepted symbol types include Market Tickers, SEDOLs, ISINs, CUSIPs, or FactSet Permanent Ids. Use the `symbolType` parameter to submit other supported third-party identifier types.  The `ids` and `universe` parameters provide two different ways to specify the identifiers for which you want data retrieved. Please enter either the `ids` or `universe` parameter. 
     * @param {module:model/String} opts.symbolType Specify the type of symbols submitted in the `ids` parameter. This is only required when submitting ids that are not supported by default.   Available symbol types - * DEFAULT - Accepted symbol types include Market Tickers, SEDOLs, ISINs, CUSIPs, or FactSet Permanent Ids.  * BLOOMBERG - Accepted symbol types include Bloomberg Tickers and Bloomberg FIGIs.    * When submitting Bloomberg symbols, the Bloomberg symbol is translated to a FactSet Permanent Identifier which is then used to retrieve the requested FQL and Screening formulas. The Bloomberg symbol submitted will be returned in the response in the field *requestId*. To see the FactSet Permanent Identifer that the Bloomberg symbol resolved to, use the `fsymId` parameter in addition to the `symbolType` parameter.   * Bloomberg symbols can not be submitted with other symbol types.    * Bloomberg Symbol Resolution is not available via Batch Requests.  Bloomberg Symbol Resolution is included with the Individual User subscription. Users with a Production User subscription require additional access to submit Bloomberg symbols. If you would like to gain access to Bloomberg Symbol Resolution, please contact your FactSet Account Team or \"Report Issue\" above and our support teams can assist.  (default to 'DEFAULT')
     * @param {String} opts.universe Screening expression to limit the universe  Please enter either the `ids` or `universe` parameter. 
     * @param {module:model/String} opts.universeType Specify the universe type to calculate the `universe` in.  Find documentation below on how to build a screen for each universe type - * Equity Screen - [Online Assistant Page 20606](https://my.apps.factset.com/oa/pages/20606)  * Debt Screen - [Online Assistant Page 20888](https://my.apps.factset.com/oa/pages/20888)  * Fund Screen - [Online Assistant Page 21384](https://my.apps.factset.com/oa/pages/21384)  This parameter may only be used in conjunction with the `universe` parameter.  (default to 'EQUITY')
     * @param {String} opts.calendar Calendar of data returned. The default value is FIVEDAY which displays Monday through Friday, regardless of whether there were trading holidays.
     * @param {module:model/String} opts.fsymId Specify **Y** for the `fsymId` parameter to return the **fsymId** (FactSet Default Permanent Identifier) of the `requestId`, in addition to the **requestId** field, in each response object. The default value for the `fsymId` parameter is **N**.  The **fsymId** field returned is the FactSet Default Permanent Identifier for the `requestId`. For all supported `requestId` symbol types, the `fsymId` parameter will return the Regional Level PermId '-R' which identifies the security’s best regional security data series per currency. Currently, the fsymId parameter only supports equities. Accepted `requestId` symbol types include all FactSet Permanent Identifiers types, CUSIP, SEDOL, ISIN, and Tickers. Further documentation can be found at this [Online Assistant attachment](https://oa.apps.factset.com/cms/oaAttachment/64c3213a-f415-4c27-a336-92c73a72deed/24881).  (default to 'N')
     * @param {Array.<String>} opts.displayName Define display names for the formulas inputted. Enter the list of display names in the same order as the formulas inputted. An additional field **displayName** will be returned in the data object for a formula.  If the number of display names does not match the number of formulas provided, an error will be returned.  To define the display name for a subset of the formulas, leave a blank in the position of the formula that won't be renamed. For example - If three formulas are inputted, to define display names only for the first and third formula, enter *displayName=FORMULA_1,,FORMULA_3*. The **displayName** field will still be included in that formula, but will contain the formula as inputted. 
     * @param {module:model/String} opts.flatten Specify **Y** for `flatten` to return a flat, table-like JSON response model instead of the standard nested JSON response model. This option is provided for easier data processing and visualization. The default value for `flatten` is **N**.  See the **Time-Series Result Object Flattened** schema for more detail on the response structure for flattened output.  (default to 'N')
     * @param {module:model/String} opts.dates Specify **N** for the `dates` parameter to suppress the **dates** of the response. The default value for the `dates` parameter is **Y**. Setting the parameter to **Y** will only return dates if the formula has a date value associated with it.  In the non-flattened response model, setting dates to **N** will remove the \"dates\" array from the TIMESERIES objectType, meaning that the results will be returned as an ARRAY objectType.  In the flattened response mode, setting dates to **N** will remove the \"dates\" attribute from the response objects. The flatten parameter first attempts to flatten the response by dates. Removing the dates can make it easier to align multiple data items when the date definition differs from the desired alignment.  (default to 'Y')
     * @param {module:model/String} opts.batch Enables the ability to asynchronously \"batch\" the request,  supporting a long-running request up to **30 minutes**. Upon requesting batch=Y, the service will respond back with an HTTP Status Code of 202.  Individual users are allowed 5 concurrent Batch Requests, while Production users are allowed 10 concurrent Batch Requests. *This feature is available to Individual Users subscribed to the Performance Package and Performance Package Plus Performance Tiers and all Production Users. If you are unsure which Performance Tier you are subscribed to or you would like to gain access to the batch capabilities, please contact your FactSet Account Team or \"Report Issue\" above and our support teams can assist.*  Once a batch request is submitted, use `/batch-status` to see if the job has completed. Once completed, retrieve the results of the request via `/batch-result`. See the endpoints listed under *Batch Processing* for more information.  (default to 'N')
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with an object containing data of type {@link module:model/TimeSeriesResponse} and HTTP response
     */
    getTimeSeriesDataWithHttpInfo(formulas, opts) {
      opts = opts || {};
      let postBody = null;
      // verify the required parameter 'formulas' is set
      if (formulas === undefined || formulas === null) {
        throw new Error("Missing the required parameter 'formulas' when calling getTimeSeriesData");
      }

      let pathParams = {
      };
      let queryParams = {
        'ids': this.apiClient.buildCollectionParam(opts['ids'], 'csv'),
        'symbolType': opts['symbolType'],
        'universe': opts['universe'],
        'universeType': opts['universeType'],
        'formulas': this.apiClient.buildCollectionParam(formulas, 'csv'),
        'calendar': opts['calendar'],
        'fsymId': opts['fsymId'],
        'displayName': this.apiClient.buildCollectionParam(opts['displayName'], 'csv'),
        'flatten': opts['flatten'],
        'dates': opts['dates'],
        'batch': opts['batch']
      };
      let headerParams = {
      };
      let formParams = {
      };

      let authNames = ['FactSetApiKey', 'FactSetOAuth2'];
      let contentTypes = [];
      let accepts = ['application/json'];

      let returnType = GetTimeSeriesDataResponseWrapperTypeMap;
      
      return this.apiClient.callApi(
        '/time-series', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, null
      );
    }

    /**
     * Retrieve data items (FQL formulas) for a list of identifiers or defined universe.
     * The `/time-series` endpoint is closely aligned with FactSet’s powerful data retrieval language **FactSet Query Language (FQL)** which is optimized for time-series analysis. FQL can also perform sophisticated statistical, mathematical, logical, and other complex operations on the data.    This endpoint has a unique **TIMESERIES** data object that pairs the requested data with FactSet provided dates. This helps reduce the need for additional data requests and reduces the work required by users.  The `/time-series` endpoint supports Long Running asynchronous requests up to **30 minutes** via the `batch` parameter. *This feature is available to Individual Users subscribed to the Performance Package and Performance Package Plus Performance Tiers and all Production Users. If you are unsure which Performance Tier you are subscribed to or you would like to gain access to the batch capabilities, please contact your FactSet Account Team or \"Report Issue\" above and our support teams can assist.* 
     * @param {Array.<String>} formulas List of FQL formulas
     * @param {Object} opts Optional parameters
     * @param {Array.<String>} opts.ids List of entity identifiers. This request value is sent back in the response as the field *requestId*. By default, accepted symbol types include Market Tickers, SEDOLs, ISINs, CUSIPs, or FactSet Permanent Ids. Use the `symbolType` parameter to submit other supported third-party identifier types.  The `ids` and `universe` parameters provide two different ways to specify the identifiers for which you want data retrieved. Please enter either the `ids` or `universe` parameter. 
     * @param {module:model/String} opts.symbolType Specify the type of symbols submitted in the `ids` parameter. This is only required when submitting ids that are not supported by default.   Available symbol types - * DEFAULT - Accepted symbol types include Market Tickers, SEDOLs, ISINs, CUSIPs, or FactSet Permanent Ids.  * BLOOMBERG - Accepted symbol types include Bloomberg Tickers and Bloomberg FIGIs.    * When submitting Bloomberg symbols, the Bloomberg symbol is translated to a FactSet Permanent Identifier which is then used to retrieve the requested FQL and Screening formulas. The Bloomberg symbol submitted will be returned in the response in the field *requestId*. To see the FactSet Permanent Identifer that the Bloomberg symbol resolved to, use the `fsymId` parameter in addition to the `symbolType` parameter.   * Bloomberg symbols can not be submitted with other symbol types.    * Bloomberg Symbol Resolution is not available via Batch Requests.  Bloomberg Symbol Resolution is included with the Individual User subscription. Users with a Production User subscription require additional access to submit Bloomberg symbols. If you would like to gain access to Bloomberg Symbol Resolution, please contact your FactSet Account Team or \"Report Issue\" above and our support teams can assist.  (default to 'DEFAULT')
     * @param {String} opts.universe Screening expression to limit the universe  Please enter either the `ids` or `universe` parameter. 
     * @param {module:model/String} opts.universeType Specify the universe type to calculate the `universe` in.  Find documentation below on how to build a screen for each universe type - * Equity Screen - [Online Assistant Page 20606](https://my.apps.factset.com/oa/pages/20606)  * Debt Screen - [Online Assistant Page 20888](https://my.apps.factset.com/oa/pages/20888)  * Fund Screen - [Online Assistant Page 21384](https://my.apps.factset.com/oa/pages/21384)  This parameter may only be used in conjunction with the `universe` parameter.  (default to 'EQUITY')
     * @param {String} opts.calendar Calendar of data returned. The default value is FIVEDAY which displays Monday through Friday, regardless of whether there were trading holidays.
     * @param {module:model/String} opts.fsymId Specify **Y** for the `fsymId` parameter to return the **fsymId** (FactSet Default Permanent Identifier) of the `requestId`, in addition to the **requestId** field, in each response object. The default value for the `fsymId` parameter is **N**.  The **fsymId** field returned is the FactSet Default Permanent Identifier for the `requestId`. For all supported `requestId` symbol types, the `fsymId` parameter will return the Regional Level PermId '-R' which identifies the security’s best regional security data series per currency. Currently, the fsymId parameter only supports equities. Accepted `requestId` symbol types include all FactSet Permanent Identifiers types, CUSIP, SEDOL, ISIN, and Tickers. Further documentation can be found at this [Online Assistant attachment](https://oa.apps.factset.com/cms/oaAttachment/64c3213a-f415-4c27-a336-92c73a72deed/24881).  (default to 'N')
     * @param {Array.<String>} opts.displayName Define display names for the formulas inputted. Enter the list of display names in the same order as the formulas inputted. An additional field **displayName** will be returned in the data object for a formula.  If the number of display names does not match the number of formulas provided, an error will be returned.  To define the display name for a subset of the formulas, leave a blank in the position of the formula that won't be renamed. For example - If three formulas are inputted, to define display names only for the first and third formula, enter *displayName=FORMULA_1,,FORMULA_3*. The **displayName** field will still be included in that formula, but will contain the formula as inputted. 
     * @param {module:model/String} opts.flatten Specify **Y** for `flatten` to return a flat, table-like JSON response model instead of the standard nested JSON response model. This option is provided for easier data processing and visualization. The default value for `flatten` is **N**.  See the **Time-Series Result Object Flattened** schema for more detail on the response structure for flattened output.  (default to 'N')
     * @param {module:model/String} opts.dates Specify **N** for the `dates` parameter to suppress the **dates** of the response. The default value for the `dates` parameter is **Y**. Setting the parameter to **Y** will only return dates if the formula has a date value associated with it.  In the non-flattened response model, setting dates to **N** will remove the \"dates\" array from the TIMESERIES objectType, meaning that the results will be returned as an ARRAY objectType.  In the flattened response mode, setting dates to **N** will remove the \"dates\" attribute from the response objects. The flatten parameter first attempts to flatten the response by dates. Removing the dates can make it easier to align multiple data items when the date definition differs from the desired alignment.  (default to 'Y')
     * @param {module:model/String} opts.batch Enables the ability to asynchronously \"batch\" the request,  supporting a long-running request up to **30 minutes**. Upon requesting batch=Y, the service will respond back with an HTTP Status Code of 202.  Individual users are allowed 5 concurrent Batch Requests, while Production users are allowed 10 concurrent Batch Requests. *This feature is available to Individual Users subscribed to the Performance Package and Performance Package Plus Performance Tiers and all Production Users. If you are unsure which Performance Tier you are subscribed to or you would like to gain access to the batch capabilities, please contact your FactSet Account Team or \"Report Issue\" above and our support teams can assist.*  Once a batch request is submitted, use `/batch-status` to see if the job has completed. Once completed, retrieve the results of the request via `/batch-result`. See the endpoints listed under *Batch Processing* for more information.  (default to 'N')
     * @return { Promise.< GetTimeSeriesDataResponseWrapper > } a Promise, with data of type {@link GetTimeSeriesDataResponseWrapper }
     */
    getTimeSeriesData(formulas, opts) {
      return this.getTimeSeriesDataWithHttpInfo(formulas, opts)
        .then(function(response_and_data) {
          return response_and_data.data;
        });
    }


    /**
     * Retrieve data items (FQL formulas) for a list of identifiers or defined universe.
     * The `/time-series` endpoint is closely aligned with FactSet’s powerful data retrieval language **FactSet Query Language (FQL)** which is optimized for time-series analysis. FQL can also perform sophisticated statistical, mathematical, logical, and other complex operations on the data.    This endpoint has a unique **TIMESERIES** data object that pairs the requested data with FactSet provided dates. This helps reduce the need for additional data requests and reduces the work required by users.  The `/time-series` endpoint supports Long Running asynchronous requests up to **30 minutes** via the `batch` parameter. *This feature is available to Individual Users subscribed to the Performance Package and Performance Package Plus Performance Tiers and all Production Users. If you are unsure which Performance Tier you are subscribed to or you would like to gain access to the batch capabilities, please contact your FactSet Account Team or \"Report Issue\" above and our support teams can assist.* 
     * @param {module:model/TimeSeriesRequest} timeSeriesRequest 
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with an object containing data of type {@link module:model/TimeSeriesResponse} and HTTP response
     */
    getTimeSeriesDataForListWithHttpInfo(timeSeriesRequest) {
      let postBody = timeSeriesRequest;
      // verify the required parameter 'timeSeriesRequest' is set
      if (timeSeriesRequest === undefined || timeSeriesRequest === null) {
        throw new Error("Missing the required parameter 'timeSeriesRequest' when calling getTimeSeriesDataForList");
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

      let returnType = GetTimeSeriesDataForListResponseWrapperTypeMap;
      
      return this.apiClient.callApi(
        '/time-series', 'POST',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, null
      );
    }

    /**
     * Retrieve data items (FQL formulas) for a list of identifiers or defined universe.
     * The `/time-series` endpoint is closely aligned with FactSet’s powerful data retrieval language **FactSet Query Language (FQL)** which is optimized for time-series analysis. FQL can also perform sophisticated statistical, mathematical, logical, and other complex operations on the data.    This endpoint has a unique **TIMESERIES** data object that pairs the requested data with FactSet provided dates. This helps reduce the need for additional data requests and reduces the work required by users.  The `/time-series` endpoint supports Long Running asynchronous requests up to **30 minutes** via the `batch` parameter. *This feature is available to Individual Users subscribed to the Performance Package and Performance Package Plus Performance Tiers and all Production Users. If you are unsure which Performance Tier you are subscribed to or you would like to gain access to the batch capabilities, please contact your FactSet Account Team or \"Report Issue\" above and our support teams can assist.* 
     * @param {module:model/TimeSeriesRequest} timeSeriesRequest 
     * @return { Promise.< GetTimeSeriesDataForListResponseWrapper > } a Promise, with data of type {@link GetTimeSeriesDataForListResponseWrapper }
     */
    getTimeSeriesDataForList(timeSeriesRequest) {
      return this.getTimeSeriesDataForListWithHttpInfo(timeSeriesRequest)
        .then(function(response_and_data) {
          return response_and_data.data;
        });
    }


}


const GetTimeSeriesDataResponseWrapperTypeMap = {
  200: TimeSeriesResponse,
  202: BatchStatusResponse,
  400: ErrorDetail,
  401: ErrorDetail,
  403: ErrorDetail,
  404: ErrorDetail,
  405: ErrorDetail,
  406: ErrorDetail,
  408: ErrorDetail,
  413: ErrorDetail,
  415: ErrorDetail,
  429: ErrorDetail,
  500: ErrorDetail,
  501: ErrorDetail,
  503: ErrorDetail,

  _createResponseWrapper(statusCode, response) {
    return new GetTimeSeriesDataResponseWrapper(statusCode, response);
  }
};

const GetTimeSeriesDataForListResponseWrapperTypeMap = {
  200: TimeSeriesResponse,
  202: BatchStatusResponse,
  400: ErrorDetail,
  401: ErrorDetail,
  403: ErrorDetail,
  404: ErrorDetail,
  405: ErrorDetail,
  406: ErrorDetail,
  408: ErrorDetail,
  413: ErrorDetail,
  415: ErrorDetail,
  429: ErrorDetail,
  500: ErrorDetail,
  501: ErrorDetail,
  503: ErrorDetail,

  _createResponseWrapper(statusCode, response) {
    return new GetTimeSeriesDataForListResponseWrapper(statusCode, response);
  }
};



/**
 * Wrapper to support GET /time-series returning different types
 * per status code.
 *
 * <p>
 * Responses:
 * <ul>
 *   <li>200 : {@code TimeSeriesResponse }<br>Gets an array of &#x60;Response Objects&#x60; for a list of IDs and FQL formulas.</li>
 * 
 *   <li>202 : {@code BatchStatusResponse }<br>Batch request has been accepted.</li>
 * </ul>
 *
 * </p>
 * Example:
 * <pre>{@code
 * const response = ...;
 * switch (response.statusCode) {
 *   case 200:
 *     TimeSeriesResponse data200 = response.getResponse200();
 *     break;
 *   case 202:
 *     BatchStatusResponse data202 = response.getResponse202();
 *     break;
 *  }
 * }</pre>
 *
 * @alias module:GetTimeSeriesDataResponseWrapper
 * @class
 */
export class GetTimeSeriesDataResponseWrapper {

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
   * @returns { TimeSeriesResponse }
   */
  getResponse200() {
    if (this.statusCode !== 200) {
      throw new Error("Invalid response getter called. getResponse200 can't return a " + this.statusCode + " response");
    }

    return this.response;
  }
  
  /**
   * @returns { BatchStatusResponse }
   */
  getResponse202() {
    if (this.statusCode !== 202) {
      throw new Error("Invalid response getter called. getResponse202 can't return a " + this.statusCode + " response");
    }

    return this.response;
  }
  
}

/**
 * Wrapper to support POST /time-series returning different types
 * per status code.
 *
 * <p>
 * Responses:
 * <ul>
 *   <li>200 : {@code TimeSeriesResponse }<br>Gets an array of &#x60;Response Objects&#x60; for a list of IDs and FQL formulas.</li>
 * 
 *   <li>202 : {@code BatchStatusResponse }<br>Batch request has been accepted.</li>
 * </ul>
 *
 * </p>
 * Example:
 * <pre>{@code
 * const response = ...;
 * switch (response.statusCode) {
 *   case 200:
 *     TimeSeriesResponse data200 = response.getResponse200();
 *     break;
 *   case 202:
 *     BatchStatusResponse data202 = response.getResponse202();
 *     break;
 *  }
 * }</pre>
 *
 * @alias module:GetTimeSeriesDataForListResponseWrapper
 * @class
 */
export class GetTimeSeriesDataForListResponseWrapper {

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
   * @returns { TimeSeriesResponse }
   */
  getResponse200() {
    if (this.statusCode !== 200) {
      throw new Error("Invalid response getter called. getResponse200 can't return a " + this.statusCode + " response");
    }

    return this.response;
  }
  
  /**
   * @returns { BatchStatusResponse }
   */
  getResponse202() {
    if (this.statusCode !== 202) {
      throw new Error("Invalid response getter called. getResponse202 can't return a " + this.statusCode + " response");
    }

    return this.response;
  }
  
}


