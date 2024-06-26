/**
 * Company Logo API
 * Consume FactSet collected Company Logos through an API that seamlessly integrates with company fundamentals and estimates data (listed equities data available via the stocks API), quotes, time series, and other Digital APIs.  The Logo API provides access to logos of US, CA and EU listed companies. The logos could be accessed by using national and international identifiers like ISIN, CUSIP, WKN, Valor, etc. and are a nice feature for comprehensive visualizations of equities on overview pages (factsheets).  Logos are reviewed/updated twice a year.  The Logo API for Digital Portals seamlessly integrates with the [Stocks API](https://developer.factset.com/api-catalog/stocks-api-digital-portals) for equities and estimates data and the [Quotes API](https://developer.factset.com/api-catalog/quotes-api-digital-portals), allowing access to detailed price and performance information of listings. The [Quotes API](https://developer.factset.com/api-catalog/quotes-api-digital-portals) also supports basic security identifier cross-reference (see for example /notation/crossReference/getByFactSetMarketSymbol to retrieve an instrument id). For direct access to price histories for charting, please refer to the [Time Series API for Digital Portals](https://developer.factset.com/api-catalog/time-series-api-digital-portals). 
 *
 * The version of the OpenAPI document: 3.0.0
 * Contact: api@factset.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 *
 */


import ApiClient from "../ApiClient";
import InlineResponse200 from '../model/InlineResponse200';

/**
* Company service.
* @module api/CompanyApi
*/
export default class CompanyApi {

    /**
    * Constructs a new CompanyApi. 
    * @alias module:api/CompanyApi
    * @class
    * @param {module:ApiClient} [apiClient] Optional API client implementation to use,
    * default to {@link module:ApiClient#instance} if unspecified.
    */
    constructor(apiClient) {
        this.apiClient = apiClient || ApiClient.instance;
    }



    /**
     * List of URLs of company logos.
     * List of URLs for transparent company logos in different sizes and formats.   The different sizes for the rectangular and square formats are:    **Small**:  * rectangular:  maximum width of 88 pixels and maximum height of 31 pixels.  * square:  31 x 31 pixels.    **Medium**: small logo scaled up by 200%.   **Large**: small logo scaled up by 300%.   **Vector**: can be rendered at any size.
     * @param {String} identifier 
     * @param {module:model/String} identifierType 
     * @param {Object} opts Optional parameters
     * @param {module:model/String} opts.format  (default to 'rectangular')
     * @param {Array.<String>} opts.attributes Limit the attributes returned in the response to the specified set.
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with an object containing data of type {@link module:model/InlineResponse200} and HTTP response
     */
    getCompanyLogoGetWithHttpInfo(identifier, identifierType, opts) {
      opts = opts || {};
      let postBody = null;
      // verify the required parameter 'identifier' is set
      if (identifier === undefined || identifier === null) {
        throw new Error("Missing the required parameter 'identifier' when calling getCompanyLogoGet");
      }
      // verify the required parameter 'identifierType' is set
      if (identifierType === undefined || identifierType === null) {
        throw new Error("Missing the required parameter 'identifierType' when calling getCompanyLogoGet");
      }

      let pathParams = {
      };
      let queryParams = {
        'identifier': identifier,
        'identifierType': identifierType,
        'format': opts['format'],
        '_attributes': this.apiClient.buildCollectionParam(opts['attributes'], 'csv')
      };
      let headerParams = {
      };
      let formParams = {
      };

      let authNames = ['FactSetApiKey', 'FactSetOAuth2'];
      let contentTypes = [];
      let accepts = ['application/json'];


      let returnType = InlineResponse200;

      return this.apiClient.callApi(
        '/company/logo/get', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, null
      );
    }

    /**
     * List of URLs of company logos.
     * List of URLs for transparent company logos in different sizes and formats.   The different sizes for the rectangular and square formats are:    **Small**:  * rectangular:  maximum width of 88 pixels and maximum height of 31 pixels.  * square:  31 x 31 pixels.    **Medium**: small logo scaled up by 200%.   **Large**: small logo scaled up by 300%.   **Vector**: can be rendered at any size.
     * @param {String} identifier 
     * @param {module:model/String} identifierType 
     * @param {Object} opts Optional parameters
     * @param {module:model/String} opts.format  (default to 'rectangular')
     * @param {Array.<String>} opts.attributes Limit the attributes returned in the response to the specified set.
     * @return { Promise.< module:model/InlineResponse200 > } a Promise, with data of type {@link module:model/InlineResponse200 }
     */
    getCompanyLogoGet(identifier, identifierType, opts) {
      return this.getCompanyLogoGetWithHttpInfo(identifier, identifierType, opts)
        .then(function(response_and_data) {
          return response_and_data.data;
        });
    }


}





