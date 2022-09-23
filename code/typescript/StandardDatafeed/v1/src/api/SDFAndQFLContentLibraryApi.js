/**
 * SDF Download API
 * The Standard DataFeed (SDF) Download API provides an alternative method for users to request and retrieve SDF packages (schemas & bundles). This service is not a direct replacement and does not have 100% feature parity with the Loader Application. This API provides an alternative for users who are unable to utilize the Loader application due to following reasons:   - Inability to install 3rd party executables due to Corporate Security policies     - Inability to utilize the Loader application due to limitations or restrictions with the environment used to consume Standard Datafeed   - Clients who are utilizing existing delivery method like FTP, who may want to use a more secured & modern solution     This API allows users to retrieve  - SDF packages(excluding Quant Factor Library) they have subscriptions for, going back to August 31, 2021,  - QFL - Quant Factor Library (Factor Family & Factor Groups) packages they have subscriptions for, going back to January 01, 1995.    Additional parameters are available to filter requests to get the exact files users are looking for.    QFL data is delivered through Content API & Bulk Data API (SDF API)  - Content API : Provides direct access to FactSet-hosted QFL data.  Suitable for interactive, ad hoc QFL requests.  Constraints on large extracts.  Costs are based on consumption, i.e. more calls can result in more costs.  - Bulk Data API : Provides access to download locations of zip files for client download. Suitable for production processes within a client environment. Cost is based on the use case and fixed unless scope changes (same as other SDFs).
 *
 * The version of the OpenAPI document: 1.0
 * Contact: teammustang@factset.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 *
 */


import ApiClient from "../ApiClient";
import ListFiles200Response from '../model/ListFiles200Response';
import ListFiles400Response from '../model/ListFiles400Response';

/**
* SDFAndQFLContentLibrary service.
* @module api/SDFAndQFLContentLibraryApi
*/
export default class SDFAndQFLContentLibraryApi {

    /**
    * Constructs a new SDFAndQFLContentLibraryApi. 
    * @alias module:api/SDFAndQFLContentLibraryApi
    * @class
    * @param {module:ApiClient} [apiClient] Optional API client implementation to use,
    * default to {@link module:ApiClient#instance} if unspecified.
    */
    constructor(apiClient) {
        this.apiClient = apiClient || ApiClient.instance;
    }



    /**
     * <a href=https://api.factset.com/bulk-documents/sdf/v1/list-files>List-Files</a> end point provides the delta & full files in a reverse chronological order by default for all the schemas & bundles subscribed by the client    QFL:-    - In case of QFL, <a href=https://api.factset.com/bulk-documents/sdf/v1/list-files>List-Files</a> end point provides the \"Historical & Year to Date (YTD)\" data in a reverse chronological order by default for all the factor families & groups subscribed to by the user</p> Provides \"full files\" only for historical bundles[data available from 1995 to previous year], \"full & delta files\" for YTD bundles[data available for current year]        If startDate and endDate parameters are not specified in the request, this endpoint returns past 10 days data by default. 
     * @param {Object} opts Optional parameters
     * @param {String} opts.schema schema name</p> </p> **Example: acta_v1, fgp_v1, yn_v1**  QFL:- To query QFL data, please use value:   **qfl_v1** 
     * @param {String} opts.bundle bundle name</p> If this parameter is not passed in the request, all the bundles a client is subscribed to are returned.  QFL:- - For QFL its the factor group name - If this parameter is not passed in the request, all the the factor families & factor groups subscribed to by the user are returned. - Supports comma separated list of multiple factor groups
     * @param {module:model/String} opts.type file type = Full or Delta</p> Full files are weekly files generated every weekend (Saturday). **The date range should include weekend dates if requesting for \"Full\" files**  QFL:- In case of QFL we have - Historical files (1995 to previous year)- Always \"Full\" . A \"Full\" file is generated for each year - For YTD (Current year)- \"Full\" files are weekly files generated every weekend (Saturday). The date range should include weekend dates if requesting for \"Full\" files
     * @param {String} opts.startDate The earliest date of the feed file the API should fetch for based on the fileTimestamp.</p>   - If schema parameter is not specified in the request, then data requested should be in batches of 10days or less**(Date range should be less than or equal to 10)** - If the schema parameter is specified in the request, date range can be greater than 10 days - If startDate and endDate parameters are not specified in the request, this endpoint returns past 10 days data by default. - startDate can be absolute- YYYY-MM-DD or relative:-  -1 for yesterday  QFL:- In case of QFL - Historical files available from 1995-01-01 to 2021-12-31. YTD files are current year files.
     * @param {String} opts.endDate The latest date of the feed file the API should fetch for based on the fileTimestamp  If startDate and endDate parameters are not specified in the request, this endpoint returns past 10 days data by default.  endDate can be in absolute- YYYY-MM-DD or relative date:- 0 for today
     * @param {Number} opts.paginationLimit Specifies the number of results to return per page. Default is 20 & Maximum is 500 results per page (default to 20)
     * @param {Number} opts.paginationOffset Specifies the starting point for pagination. This parameter is used to identify the beginning of next set of results
     * @param {module:model/String} opts.sort Enables to get the data in ascending or descending order based on startTime. Results are in reverse chronological order if this parameter is not used
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with an object containing data of type {@link module:model/ListFiles200Response} and HTTP response
     */
    getV1ListFilesWithHttpInfo(opts) {
      opts = opts || {};
      let postBody = null;

      let pathParams = {
      };
      let queryParams = {
        'schema': opts['schema'],
        'bundle': opts['bundle'],
        'type': opts['type'],
        'startDate': opts['startDate'],
        'endDate': opts['endDate'],
        '_paginationLimit': opts['paginationLimit'],
        '_paginationOffset': opts['paginationOffset'],
        '_sort': opts['sort']
      };
      let headerParams = {
      };
      let formParams = {
      };

      let authNames = ['FactSetApiKey', 'FactSetOAuth2'];
      let contentTypes = [];
      let accepts = ['application/json'];


      let returnType = ListFiles200Response;

      return this.apiClient.callApi(
        '/v1/list-files', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, null
      );
    }

    /**
     * <a href=https://api.factset.com/bulk-documents/sdf/v1/list-files>List-Files</a> end point provides the delta & full files in a reverse chronological order by default for all the schemas & bundles subscribed by the client    QFL:-    - In case of QFL, <a href=https://api.factset.com/bulk-documents/sdf/v1/list-files>List-Files</a> end point provides the \"Historical & Year to Date (YTD)\" data in a reverse chronological order by default for all the factor families & groups subscribed to by the user</p> Provides \"full files\" only for historical bundles[data available from 1995 to previous year], \"full & delta files\" for YTD bundles[data available for current year]        If startDate and endDate parameters are not specified in the request, this endpoint returns past 10 days data by default. 
     * @param {Object} opts Optional parameters
     * @param {String} opts.schema schema name</p> </p> **Example: acta_v1, fgp_v1, yn_v1**  QFL:- To query QFL data, please use value:   **qfl_v1** 
     * @param {String} opts.bundle bundle name</p> If this parameter is not passed in the request, all the bundles a client is subscribed to are returned.  QFL:- - For QFL its the factor group name - If this parameter is not passed in the request, all the the factor families & factor groups subscribed to by the user are returned. - Supports comma separated list of multiple factor groups
     * @param {module:model/String} opts.type file type = Full or Delta</p> Full files are weekly files generated every weekend (Saturday). **The date range should include weekend dates if requesting for \"Full\" files**  QFL:- In case of QFL we have - Historical files (1995 to previous year)- Always \"Full\" . A \"Full\" file is generated for each year - For YTD (Current year)- \"Full\" files are weekly files generated every weekend (Saturday). The date range should include weekend dates if requesting for \"Full\" files
     * @param {String} opts.startDate The earliest date of the feed file the API should fetch for based on the fileTimestamp.</p>   - If schema parameter is not specified in the request, then data requested should be in batches of 10days or less**(Date range should be less than or equal to 10)** - If the schema parameter is specified in the request, date range can be greater than 10 days - If startDate and endDate parameters are not specified in the request, this endpoint returns past 10 days data by default. - startDate can be absolute- YYYY-MM-DD or relative:-  -1 for yesterday  QFL:- In case of QFL - Historical files available from 1995-01-01 to 2021-12-31. YTD files are current year files.
     * @param {String} opts.endDate The latest date of the feed file the API should fetch for based on the fileTimestamp  If startDate and endDate parameters are not specified in the request, this endpoint returns past 10 days data by default.  endDate can be in absolute- YYYY-MM-DD or relative date:- 0 for today
     * @param {Number} opts.paginationLimit Specifies the number of results to return per page. Default is 20 & Maximum is 500 results per page (default to 20)
     * @param {Number} opts.paginationOffset Specifies the starting point for pagination. This parameter is used to identify the beginning of next set of results
     * @param {module:model/String} opts.sort Enables to get the data in ascending or descending order based on startTime. Results are in reverse chronological order if this parameter is not used
     * @return { Promise.< module:model/ListFiles200Response > } a Promise, with data of type {@link module:model/ListFiles200Response }
     */
    getV1ListFiles(opts) {
      return this.getV1ListFilesWithHttpInfo(opts)
        .then(function(response_and_data) {
          return response_and_data.data;
        });
    }


}




