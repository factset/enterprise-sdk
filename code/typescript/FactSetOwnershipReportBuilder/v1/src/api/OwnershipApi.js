/**
 * FactSet Ownership API
 * description.md
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
import ErrorWithMetaResponse from '../model/ErrorWithMetaResponse';
import ResponseHolders from '../model/ResponseHolders';
import ResponseUltimateParent from '../model/ResponseUltimateParent';

/**
* Ownership service.
* @module api/OwnershipApi
*/
export default class OwnershipApi {

    /**
    * Constructs a new OwnershipApi. 
    * @alias module:api/OwnershipApi
    * @class
    * @param {module:ApiClient} [apiClient] Optional API client implementation to use,
    * default to {@link module:ApiClient#instance} if unspecified.
    */
    constructor(apiClient) {
        this.apiClient = apiClient || ApiClient.instance;
    }



    /**
     * Holders of a company or fund
     * Holders of a company or fund
     * @param {String} id Company or Fund Identifier
     * @param {Object} opts Optional parameters
     * @param {module:model/String} opts.assetType Controls the Asset Type of the data returned (default to 'EQUITY')
     * @param {module:model/String} opts.holderType Controls the Holder Type of the data returned (default to 'INSTITUTIONS')
     * @param {module:model/String} opts.entityType Controls the type of Entity data returned. Defaults to Security data, but can also be used to display Company data. (default to 'SECURITY')
     * @param {String} opts.topn Limits the number of holders returned based on their Market Value position in the security. Default is ALL, otherwise use a valid number above 0. 
     * @param {Date} opts.date Top Holders as of date expressed in YYYY-MM-DD format. Defaults to latest month-end close; non-month-end dates are converted to month-end dates.
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with an object containing data of type {@link module:model/ResponseHolders} and HTTP response
     */
    getOwnershipHoldersWithHttpInfo(id, opts) {
      opts = opts || {};
      let postBody = null;
      // verify the required parameter 'id' is set
      if (id === undefined || id === null) {
        throw new Error("Missing the required parameter 'id' when calling getOwnershipHolders");
      }

      let pathParams = {
      };
      let queryParams = {
        'id': id,
        'asset_type': opts['assetType'],
        'holder_type': opts['holderType'],
        'entity_type': opts['entityType'],
        'topn': opts['topn'],
        'date': opts['date']
      };
      let headerParams = {
      };
      let formParams = {
      };

      let authNames = ['FactSetApiKey', 'FactSetOAuth2'];
      let contentTypes = [];
      let accepts = ['application/json'];


      let returnType = ResponseHolders;

      return this.apiClient.callApi(
        '/holders', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, null
      );
    }

    /**
     * Holders of a company or fund
     * Holders of a company or fund
     * @param {String} id Company or Fund Identifier
     * @param {Object} opts Optional parameters
     * @param {module:model/String} opts.assetType Controls the Asset Type of the data returned (default to 'EQUITY')
     * @param {module:model/String} opts.holderType Controls the Holder Type of the data returned (default to 'INSTITUTIONS')
     * @param {module:model/String} opts.entityType Controls the type of Entity data returned. Defaults to Security data, but can also be used to display Company data. (default to 'SECURITY')
     * @param {String} opts.topn Limits the number of holders returned based on their Market Value position in the security. Default is ALL, otherwise use a valid number above 0. 
     * @param {Date} opts.date Top Holders as of date expressed in YYYY-MM-DD format. Defaults to latest month-end close; non-month-end dates are converted to month-end dates.
     * @return { Promise.< module:model/ResponseHolders > } a Promise, with data of type {@link module:model/ResponseHolders }
     */
    getOwnershipHolders(id, opts) {
      return this.getOwnershipHoldersWithHttpInfo(id, opts)
        .then(function(response_and_data) {
          return response_and_data.data;
        });
    }


    /**
     * Get FactSet's ownership breakdown about a specific security.  The returned table will display the institutions, insiders, funds, and beneficial owners that comprise the ownership of the provided security.  These holders will be grouped by the ultimate parent in their entity structure.
     * Get FactSet's ownership breakdown about a specific security.  The returned table will display the institutions, insiders, funds, and beneficial owners that comprise the ownership of the provided security.  These holders will be grouped by the ultimate parent in their entity structure.
     * @param {String} id Any valid FactSet identifier which points to a security.  This could be Ticker Region, Entity ID, CUSIP, or SEDOL. 
     * @param {Object} opts Optional parameters
     * @param {module:model/String} opts.currency Currency ISO code that any currency-based data should be returned in.  If excluded, the value will default to the special keyword \"LOCAL\" which will cause the currency-based values to be calculated in currency which is local to the exchange it is traded on. 
     * @param {Array.<module:model/String>} opts.attributes The columns to be returned in the resulting table
     * @param {module:model/String} opts.period The period over which we should return holdings for. (default to '6m')
     * @param {module:model/String} opts.holderType The holder types which should be included in this table (default to 'institutions')
     * @param {Date} opts.date The date as of which this data should be returned. YYYY-MM-DD format. Defaults to current date.
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with an object containing data of type {@link module:model/ResponseUltimateParent} and HTTP response
     */
    getOwnershipUltimateParentWithHttpInfo(id, opts) {
      opts = opts || {};
      let postBody = null;
      // verify the required parameter 'id' is set
      if (id === undefined || id === null) {
        throw new Error("Missing the required parameter 'id' when calling getOwnershipUltimateParent");
      }

      let pathParams = {
      };
      let queryParams = {
        'id': id,
        'currency': opts['currency'],
        'attributes': this.apiClient.buildCollectionParam(opts['attributes'], 'multi'),
        'period': opts['period'],
        'holderType': opts['holderType'],
        'date': opts['date']
      };
      let headerParams = {
      };
      let formParams = {
      };

      let authNames = ['FactSetApiKey', 'FactSetOAuth2'];
      let contentTypes = [];
      let accepts = ['application/json'];


      let returnType = ResponseUltimateParent;

      return this.apiClient.callApi(
        '/ultimate-parent', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, null
      );
    }

    /**
     * Get FactSet's ownership breakdown about a specific security.  The returned table will display the institutions, insiders, funds, and beneficial owners that comprise the ownership of the provided security.  These holders will be grouped by the ultimate parent in their entity structure.
     * Get FactSet's ownership breakdown about a specific security.  The returned table will display the institutions, insiders, funds, and beneficial owners that comprise the ownership of the provided security.  These holders will be grouped by the ultimate parent in their entity structure.
     * @param {String} id Any valid FactSet identifier which points to a security.  This could be Ticker Region, Entity ID, CUSIP, or SEDOL. 
     * @param {Object} opts Optional parameters
     * @param {module:model/String} opts.currency Currency ISO code that any currency-based data should be returned in.  If excluded, the value will default to the special keyword \"LOCAL\" which will cause the currency-based values to be calculated in currency which is local to the exchange it is traded on. 
     * @param {Array.<module:model/String>} opts.attributes The columns to be returned in the resulting table
     * @param {module:model/String} opts.period The period over which we should return holdings for. (default to '6m')
     * @param {module:model/String} opts.holderType The holder types which should be included in this table (default to 'institutions')
     * @param {Date} opts.date The date as of which this data should be returned. YYYY-MM-DD format. Defaults to current date.
     * @return { Promise.< module:model/ResponseUltimateParent > } a Promise, with data of type {@link module:model/ResponseUltimateParent }
     */
    getOwnershipUltimateParent(id, opts) {
      return this.getOwnershipUltimateParentWithHttpInfo(id, opts)
        .then(function(response_and_data) {
          return response_and_data.data;
        });
    }


}





