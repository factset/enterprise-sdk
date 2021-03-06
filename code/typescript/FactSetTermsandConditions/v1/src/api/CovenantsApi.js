/**
 * FactSet Terms & Conditions API
 * The FactSet Terms & Conditions API exposes Terms & Conditions data for Fixed Income Corporate, Governement & Agency securities. The FactSet Corporate Government & Agency Terms & Conditions library provides descriptive data on the issue level, such as offering details, redemption information, and coupon schedules. Issuer level data is also available. Coverage is global and includes corporate, sovereign, and agency issues. 
 *
 * The version of the OpenAPI document: 1.0.0
 * Contact: api@factset.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 *
 */


import ApiClient from "../ApiClient";
import CovenantDetailsResponse from '../model/CovenantDetailsResponse';
import ErrorResponse from '../model/ErrorResponse';
import TermsAndConditionsScalarRequest from '../model/TermsAndConditionsScalarRequest';

/**
* Covenants service.
* @module api/CovenantsApi
*/
export default class CovenantsApi {

    /**
    * Constructs a new CovenantsApi. 
    * @alias module:api/CovenantsApi
    * @class
    * @param {module:ApiClient} [apiClient] Optional API client implementation to use,
    * default to {@link module:ApiClient#instance} if unspecified.
    */
    constructor(apiClient) {
        this.apiClient = apiClient || ApiClient.instance;
    }



    /**
     * Return Covenant Details for a Fixed Income security.
     * Returns Covenant Details for the Fixed Income security. 
     * @param {Array.<String>} ids List of Fixed Income Security identifiers. Supported symbol types include CUSIP, SEDOL, ISIN, and FactSet Security Permanent Identifier (-S).  **ID LIMIT = 250** *per request*. 
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with an object containing data of type {@link module:model/CovenantDetailsResponse} and HTTP response
     */
    getCovenantDetailsWithHttpInfo(ids) {
      let postBody = null;
      // verify the required parameter 'ids' is set
      if (ids === undefined || ids === null) {
        throw new Error("Missing the required parameter 'ids' when calling getCovenantDetails");
      }

      let pathParams = {
      };
      let queryParams = {
        'ids': this.apiClient.buildCollectionParam(ids, 'csv')
      };
      let headerParams = {
      };
      let formParams = {
      };

      let authNames = ['FactSetApiKey', 'FactSetOAuth2'];
      let contentTypes = [];
      let accepts = ['application/json'];


      let returnType = CovenantDetailsResponse;

      return this.apiClient.callApi(
        '/factset-terms-and-conditions/v1/covenant-details', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, null
      );
    }

    /**
     * Return Covenant Details for a Fixed Income security.
     * Returns Covenant Details for the Fixed Income security. 
     * @param {Array.<String>} ids List of Fixed Income Security identifiers. Supported symbol types include CUSIP, SEDOL, ISIN, and FactSet Security Permanent Identifier (-S).  **ID LIMIT = 250** *per request*. 
     * @return { Promise.< module:model/CovenantDetailsResponse > } a Promise, with data of type {@link module:model/CovenantDetailsResponse }
     */
    getCovenantDetails(ids) {
      return this.getCovenantDetailsWithHttpInfo(ids)
        .then(function(response_and_data) {
          return response_and_data.data;
        });
    }


    /**
     * Return Covenant Details for a list of Fixed Income securities.
     * Returns Covenant Details for a list of Fixed Income securities. 
     * @param {module:model/TermsAndConditionsScalarRequest} termsAndConditionsScalarRequest Request object for Fixed Income Covenant Details.
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with an object containing data of type {@link module:model/CovenantDetailsResponse} and HTTP response
     */
    getCovenantDetailsForListWithHttpInfo(termsAndConditionsScalarRequest) {
      let postBody = termsAndConditionsScalarRequest;
      // verify the required parameter 'termsAndConditionsScalarRequest' is set
      if (termsAndConditionsScalarRequest === undefined || termsAndConditionsScalarRequest === null) {
        throw new Error("Missing the required parameter 'termsAndConditionsScalarRequest' when calling getCovenantDetailsForList");
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


      let returnType = CovenantDetailsResponse;

      return this.apiClient.callApi(
        '/factset-terms-and-conditions/v1/covenant-details', 'POST',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, null
      );
    }

    /**
     * Return Covenant Details for a list of Fixed Income securities.
     * Returns Covenant Details for a list of Fixed Income securities. 
     * @param {module:model/TermsAndConditionsScalarRequest} termsAndConditionsScalarRequest Request object for Fixed Income Covenant Details.
     * @return { Promise.< module:model/CovenantDetailsResponse > } a Promise, with data of type {@link module:model/CovenantDetailsResponse }
     */
    getCovenantDetailsForList(termsAndConditionsScalarRequest) {
      return this.getCovenantDetailsForListWithHttpInfo(termsAndConditionsScalarRequest)
        .then(function(response_and_data) {
          return response_and_data.data;
        });
    }


}





