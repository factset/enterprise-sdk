/**
 * Global Filings API
 *  The Filings API provides a comprehensive set of functionalities for searching and retrieving filing documents from various sources.  This API is designed to expose document search and document retrieval functionality. A document search will allow a request to query FactSet document databases based on certain search criteria specified in the request.  In addition, a document count request will provide information on the number of stories available for a particular security.  The meta endpoints, such as sources, formTypes, timeZones, and categories, provide comprehensive lists of available sources, form types, time zones, and categories, respectively.
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
import CountResponse from '../model/CountResponse';
import ErrorResponse from '../model/ErrorResponse';
import SearchResponse from '../model/SearchResponse';

/**
* FilingsAPI service.
* @module api/FilingsAPIApi
*/
export default class FilingsAPIApi {

    /**
    * Constructs a new FilingsAPIApi. 
    * @alias module:api/FilingsAPIApi
    * @class
    * @param {module:ApiClient} [apiClient] Optional API client implementation to use,
    * default to {@link module:ApiClient#instance} if unspecified.
    */
    constructor(apiClient) {
        this.apiClient = apiClient || ApiClient.instance;
    }



    /**
     * Returns the count of filings for specified source.
     * Returns the count of filings documents along with other response fields.
     * @param {Array.<String>} ids Requested symbols or securities.  This is a comma-separated list with a maximum limit of 10.  Each symbol can be a FactSet exchange symbol, CUSIP, or SEDOL.
     * @param {Array.<String>} sources Code for document source to include.This is a comma-separated list. Use the `/meta/sources` endpoint to get the list of available sources.  
     * @param {Object} opts Optional parameters
     * @param {String} opts.startDate Start Date. Format is YYYYMMDD or relative +/- days (0,-1,etc). 
     * @param {String} opts.endDate End Date. Format is YYYYMMDD or relative +/- days (0,-1,etc).
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with an object containing data of type {@link module:model/CountResponse} and HTTP response
     */
    getCountWithHttpInfo(ids, sources, opts) {
      opts = opts || {};
      let postBody = null;
      // verify the required parameter 'ids' is set
      if (ids === undefined || ids === null) {
        throw new Error("Missing the required parameter 'ids' when calling getCount");
      }
      // verify the required parameter 'sources' is set
      if (sources === undefined || sources === null) {
        throw new Error("Missing the required parameter 'sources' when calling getCount");
      }

      let pathParams = {
      };
      let queryParams = {
        'startDate': opts['startDate'],
        'endDate': opts['endDate'],
        'ids': this.apiClient.buildCollectionParam(ids, 'csv'),
        'sources': this.apiClient.buildCollectionParam(sources, 'csv')
      };
      let headerParams = {
      };
      let formParams = {
      };

      let authNames = ['FactSetApiKey', 'FactSetOAuth2'];
      let contentTypes = [];
      let accepts = ['application/json'];


      let returnType = CountResponse;

      return this.apiClient.callApi(
        '/count', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, null
      );
    }

    /**
     * Returns the count of filings for specified source.
     * Returns the count of filings documents along with other response fields.
     * @param {Array.<String>} ids Requested symbols or securities.  This is a comma-separated list with a maximum limit of 10.  Each symbol can be a FactSet exchange symbol, CUSIP, or SEDOL.
     * @param {Array.<String>} sources Code for document source to include.This is a comma-separated list. Use the `/meta/sources` endpoint to get the list of available sources.  
     * @param {Object} opts Optional parameters
     * @param {String} opts.startDate Start Date. Format is YYYYMMDD or relative +/- days (0,-1,etc). 
     * @param {String} opts.endDate End Date. Format is YYYYMMDD or relative +/- days (0,-1,etc).
     * @return { Promise.< module:model/CountResponse > } a Promise, with data of type {@link module:model/CountResponse }
     */
    getCount(ids, sources, opts) {
      return this.getCountWithHttpInfo(ids, sources, opts)
        .then(function(response_and_data) {
          return response_and_data.data;
        });
    }


    /**
     * Returns the filings documents and related metadata within FactSet coverage.
     * Returns the filings documents within FactSet coverage along with other response fields.
     * @param {Array.<String>} ids Requested symbols or securities.  This is a comma-separated list with a maximum limit of 1000.  Each symbol can be a FactSet exchange symbol, CUSIP, or SEDOL.
     * @param {Array.<String>} sources 
     * @param {Object} opts Optional parameters
     * @param {String} opts.startDate Start Date. Format is YYYYMMDD or relative +/- days (0,-1,etc). 
     * @param {String} opts.endDate End Date. Format is YYYYMMDD or relative +/- days (0,-1,etc).
     * @param {Number} opts.paginationLimit Number of results to return per page. (default to 25)
     * @param {Number} opts.paginationOffset Page number of the results to return.  (default to 0)
     * @param {String} opts.timeZone timeZone to return story dates and times.Time zones, represented in POSIX format, are automatically adjusted for daylight savings. timeZone names are sourced from the IANA timezone registry. (default to 'America/New_York')
     * @param {Array.<module:model/String>} opts.sort Enables sorting data in ascending or descending  order based on filingsDateTime.   * `filingsDateTime` - sorting results in chronological (ascending) order. If a start date is not specified, the    API has a 10-year searching limitation.   *  `-filingsDateTime` - sorting results in reverse chronological (descending) order. This is the default value if     the sort parameter isn't used in the query.
     * @param {Array.<String>} opts.categories Code for categories to include.  This is a comma-separated list. Use the `/meta/categories` endpoint to get the list of available categories.  Default = All categories.
     * @param {module:model/Boolean} opts.primaryId Type of identifier search * true - Returns headlines of stories that have the searched identifier(s) as the primary  identifier. * false - Returns headlines of stories that mentioned or referred to the  identifier. (default to false)
     * @param {String} opts.searchText Restricts the search to include only document stories which include the text searched.
     * @param {Array.<String>} opts.formTypes The search to include any form types of given sources
     * @param {String} opts.edgarAccession A unique identifier given to each EDGAR filings document. e.g. accession=0001013237-21-000069&sources=EDG.   > **Note:**  > When used in conjunction with the 'sources' parameter set to 'EDGAR, the API considers this accession for data retrieval.  > For non-EDGAR sources, this parameter is ignored.
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with an object containing data of type {@link module:model/SearchResponse} and HTTP response
     */
    getFilingsWithHttpInfo(ids, sources, opts) {
      opts = opts || {};
      let postBody = null;
      // verify the required parameter 'ids' is set
      if (ids === undefined || ids === null) {
        throw new Error("Missing the required parameter 'ids' when calling getFilings");
      }
      // verify the required parameter 'sources' is set
      if (sources === undefined || sources === null) {
        throw new Error("Missing the required parameter 'sources' when calling getFilings");
      }

      let pathParams = {
      };
      let queryParams = {
        'ids': this.apiClient.buildCollectionParam(ids, 'csv'),
        'startDate': opts['startDate'],
        'endDate': opts['endDate'],
        '_paginationLimit': opts['paginationLimit'],
        '_paginationOffset': opts['paginationOffset'],
        'timeZone': opts['timeZone'],
        '_sort': this.apiClient.buildCollectionParam(opts['sort'], 'csv'),
        'sources': this.apiClient.buildCollectionParam(sources, 'multi'),
        'categories': this.apiClient.buildCollectionParam(opts['categories'], 'csv'),
        'primaryId': opts['primaryId'],
        'searchText': opts['searchText'],
        'formTypes': this.apiClient.buildCollectionParam(opts['formTypes'], 'csv'),
        'edgarAccession': opts['edgarAccession']
      };
      let headerParams = {
      };
      let formParams = {
      };

      let authNames = ['FactSetApiKey', 'FactSetOAuth2'];
      let contentTypes = [];
      let accepts = ['application/json'];


      let returnType = SearchResponse;

      return this.apiClient.callApi(
        '/search', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, null
      );
    }

    /**
     * Returns the filings documents and related metadata within FactSet coverage.
     * Returns the filings documents within FactSet coverage along with other response fields.
     * @param {Array.<String>} ids Requested symbols or securities.  This is a comma-separated list with a maximum limit of 1000.  Each symbol can be a FactSet exchange symbol, CUSIP, or SEDOL.
     * @param {Array.<String>} sources 
     * @param {Object} opts Optional parameters
     * @param {String} opts.startDate Start Date. Format is YYYYMMDD or relative +/- days (0,-1,etc). 
     * @param {String} opts.endDate End Date. Format is YYYYMMDD or relative +/- days (0,-1,etc).
     * @param {Number} opts.paginationLimit Number of results to return per page. (default to 25)
     * @param {Number} opts.paginationOffset Page number of the results to return.  (default to 0)
     * @param {String} opts.timeZone timeZone to return story dates and times.Time zones, represented in POSIX format, are automatically adjusted for daylight savings. timeZone names are sourced from the IANA timezone registry. (default to 'America/New_York')
     * @param {Array.<module:model/String>} opts.sort Enables sorting data in ascending or descending  order based on filingsDateTime.   * `filingsDateTime` - sorting results in chronological (ascending) order. If a start date is not specified, the    API has a 10-year searching limitation.   *  `-filingsDateTime` - sorting results in reverse chronological (descending) order. This is the default value if     the sort parameter isn't used in the query.
     * @param {Array.<String>} opts.categories Code for categories to include.  This is a comma-separated list. Use the `/meta/categories` endpoint to get the list of available categories.  Default = All categories.
     * @param {module:model/Boolean} opts.primaryId Type of identifier search * true - Returns headlines of stories that have the searched identifier(s) as the primary  identifier. * false - Returns headlines of stories that mentioned or referred to the  identifier. (default to false)
     * @param {String} opts.searchText Restricts the search to include only document stories which include the text searched.
     * @param {Array.<String>} opts.formTypes The search to include any form types of given sources
     * @param {String} opts.edgarAccession A unique identifier given to each EDGAR filings document. e.g. accession=0001013237-21-000069&sources=EDG.   > **Note:**  > When used in conjunction with the 'sources' parameter set to 'EDGAR, the API considers this accession for data retrieval.  > For non-EDGAR sources, this parameter is ignored.
     * @return { Promise.< module:model/SearchResponse > } a Promise, with data of type {@link module:model/SearchResponse }
     */
    getFilings(ids, sources, opts) {
      return this.getFilingsWithHttpInfo(ids, sources, opts)
        .then(function(response_and_data) {
          return response_and_data.data;
        });
    }


}





