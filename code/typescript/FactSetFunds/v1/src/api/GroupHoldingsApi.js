/**
 * FactSet Funds API
 * FactSet Mutual Funds data offers over 50 fund- and share class-specific data points for mutual funds listed in the United States. <p>FactSet Mutual Funds Reference provides fund-specific reference information as well as FactSet's proprietary classification system. It includes but is not limited to the following coverage    * Fund descriptions    * A seven-tier classification system   * Leverage information   * Fees and expenses    * Portfolio managers       FactSet Mutual Funds Time Series provides quantitative data items on a historical basis. It includes but is not limited to the following coverage    * Net asset value   * Fund flows    * Assets under management   * Total return  <p>This API is rate-limited to 10 requests per second and 10 concurrent requests per user.</p> 
 *
 * The version of the OpenAPI document: 1.1.0
 * Contact: api@factset.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 *
 */


import ApiClient from "../ApiClient";
import ErrorResponse from '../model/ErrorResponse';
import GroupHoldingsRequest from '../model/GroupHoldingsRequest';
import GroupHoldingsResponse from '../model/GroupHoldingsResponse';

/**
* GroupHoldings service.
* @module api/GroupHoldingsApi
*/
export default class GroupHoldingsApi {

    /**
    * Constructs a new GroupHoldingsApi. 
    * @alias module:api/GroupHoldingsApi
    * @class
    * @param {module:ApiClient} [apiClient] Optional API client implementation to use,
    * default to {@link module:ApiClient#instance} if unspecified.
    */
    constructor(apiClient) {
        this.apiClient = apiClient || ApiClient.instance;
    }



    /**
     * Get group holdings for a specific date and group.
     * Retrieves the holding percentages for the group and funds specified. Available groups are:   * **ASSET** = Asset Class   * **ASSETISTYP** = Issue Type with Asset Class   * **CAPGRP** = Cap Group   * **CNTRY** = Country   * **EXCHANGE** = Exchange   * **INDUSTRY** = Industry   * **ISSUE_TYPE** = Issue Type   * **REGION** = Region   * **SECTOR** = Sector   * **ULTPARENT** = Ultimate Parent 
     * @param {Array.<String>} ids The requested fund identifier. FactSet Identifiers, tickers, CUSIP, SEDOL, and ISIN are accepted inputs. <p>***ids limit** =  1000 per request*</p> *<p>Make note, GET Method URL request lines are also limited to a total length of 8192 bytes (8KB). In cases where the service allows for thousands of ids, which may lead to exceeding this request line limit of 8KB, its advised for any requests with large request lines to be requested through the respective \"POST\" method.</p>* 
     * @param {Object} opts Optional parameters
     * @param {String} opts.asOfDate As of date for historical group holdings in **YYYY-MM-DD** format. If left blank, the API will default to latest available completed period. 
     * @param {module:model/String} opts.group Controls the group of the data returned.   * **ASSET** = Asset Class   * **ASSETISTYP** = Issue Type with Asset Class   * **CAPGRP** = Cap Group   * **CNTRY** = Country   * **EXCHANGE** = Exchange   * **INDUSTRY** = Industry   * **ISSUE_TYPE** = Issue Type   * **REGION** = Region   * **SECTOR** = Sector   * **ULTPARENT** = Ultimate Parent        (default to 'CNTRY')
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with an object containing data of type {@link module:model/GroupHoldingsResponse} and HTTP response
     */
    getGroupHoldingsWithHttpInfo(ids, opts) {
      opts = opts || {};
      let postBody = null;
      // verify the required parameter 'ids' is set
      if (ids === undefined || ids === null) {
        throw new Error("Missing the required parameter 'ids' when calling getGroupHoldings");
      }

      let pathParams = {
      };
      let queryParams = {
        'ids': this.apiClient.buildCollectionParam(ids, 'csv'),
        'asOfDate': opts['asOfDate'],
        'group': opts['group']
      };
      let headerParams = {
      };
      let formParams = {
      };

      let authNames = ['FactSetApiKey', 'FactSetOAuth2'];
      let contentTypes = [];
      let accepts = ['application/json'];


      let returnType = GroupHoldingsResponse;

      return this.apiClient.callApi(
        '/factset-funds/v1/holdings/group', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, null
      );
    }

    /**
     * Get group holdings for a specific date and group.
     * Retrieves the holding percentages for the group and funds specified. Available groups are:   * **ASSET** = Asset Class   * **ASSETISTYP** = Issue Type with Asset Class   * **CAPGRP** = Cap Group   * **CNTRY** = Country   * **EXCHANGE** = Exchange   * **INDUSTRY** = Industry   * **ISSUE_TYPE** = Issue Type   * **REGION** = Region   * **SECTOR** = Sector   * **ULTPARENT** = Ultimate Parent 
     * @param {Array.<String>} ids The requested fund identifier. FactSet Identifiers, tickers, CUSIP, SEDOL, and ISIN are accepted inputs. <p>***ids limit** =  1000 per request*</p> *<p>Make note, GET Method URL request lines are also limited to a total length of 8192 bytes (8KB). In cases where the service allows for thousands of ids, which may lead to exceeding this request line limit of 8KB, its advised for any requests with large request lines to be requested through the respective \"POST\" method.</p>* 
     * @param {Object} opts Optional parameters
     * @param {String} opts.asOfDate As of date for historical group holdings in **YYYY-MM-DD** format. If left blank, the API will default to latest available completed period. 
     * @param {module:model/String} opts.group Controls the group of the data returned.   * **ASSET** = Asset Class   * **ASSETISTYP** = Issue Type with Asset Class   * **CAPGRP** = Cap Group   * **CNTRY** = Country   * **EXCHANGE** = Exchange   * **INDUSTRY** = Industry   * **ISSUE_TYPE** = Issue Type   * **REGION** = Region   * **SECTOR** = Sector   * **ULTPARENT** = Ultimate Parent        (default to 'CNTRY')
     * @return { Promise.< module:model/GroupHoldingsResponse > } a Promise, with data of type {@link module:model/GroupHoldingsResponse }
     */
    getGroupHoldings(ids, opts) {
      return this.getGroupHoldingsWithHttpInfo(ids, opts)
        .then(function(response_and_data) {
          return response_and_data.data;
        });
    }


    /**
     * Get group holdings for a specific date and group.
     * Retrieves the holding percentages for the group and funds specified. Available groups are:   * **ASSET** = Asset Class   * **ASSETISTYP** = Issue Type with Asset Class   * **CAPGRP** = Cap Group   * **CNTRY** = Country   * **EXCHANGE** = Exchange   * **INDUSTRY** = Industry   * **ISSUE_TYPE** = Issue Type   * **REGION** = Region   * **SECTOR** = Sector   * **ULTPARENT** = Ultimate Parent 
     * @param {module:model/GroupHoldingsRequest} groupHoldingsRequest The Group Holdings request body, allowing the user to specify a list of ids, date, and group.
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with an object containing data of type {@link module:model/GroupHoldingsResponse} and HTTP response
     */
    getGroupHoldingsForListWithHttpInfo(groupHoldingsRequest) {
      let postBody = groupHoldingsRequest;
      // verify the required parameter 'groupHoldingsRequest' is set
      if (groupHoldingsRequest === undefined || groupHoldingsRequest === null) {
        throw new Error("Missing the required parameter 'groupHoldingsRequest' when calling getGroupHoldingsForList");
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


      let returnType = GroupHoldingsResponse;

      return this.apiClient.callApi(
        '/factset-funds/v1/holdings/group', 'POST',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, null
      );
    }

    /**
     * Get group holdings for a specific date and group.
     * Retrieves the holding percentages for the group and funds specified. Available groups are:   * **ASSET** = Asset Class   * **ASSETISTYP** = Issue Type with Asset Class   * **CAPGRP** = Cap Group   * **CNTRY** = Country   * **EXCHANGE** = Exchange   * **INDUSTRY** = Industry   * **ISSUE_TYPE** = Issue Type   * **REGION** = Region   * **SECTOR** = Sector   * **ULTPARENT** = Ultimate Parent 
     * @param {module:model/GroupHoldingsRequest} groupHoldingsRequest The Group Holdings request body, allowing the user to specify a list of ids, date, and group.
     * @return { Promise.< module:model/GroupHoldingsResponse > } a Promise, with data of type {@link module:model/GroupHoldingsResponse }
     */
    getGroupHoldingsForList(groupHoldingsRequest) {
      return this.getGroupHoldingsForListWithHttpInfo(groupHoldingsRequest)
        .then(function(response_and_data) {
          return response_and_data.data;
        });
    }


}





