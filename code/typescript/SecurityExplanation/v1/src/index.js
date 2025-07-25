/**
 * Security Explanation API
 * Allow clients to use Security Explanation through APIs.
 *
 * The version of the OpenAPI document: 1.3.0
 * Contact: api@factset.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 *
 */

import ApiClient from './ApiClient';
import APIClientErrorResponse from './model/APIClientErrorResponse';
import APIError from './model/APIError';
import ErrorSource from './model/ErrorSource';
import ExplanationCreateResponse from './model/ExplanationCreateResponse';
import ExplanationCreateResponseRoot from './model/ExplanationCreateResponseRoot';
import ExplanationStatus from './model/ExplanationStatus';
import ExplanationStatusRoot from './model/ExplanationStatusRoot';
import SecurityExplanationParametersRoot from './model/SecurityExplanationParametersRoot';
import SecurityExplanationRequestParameters from './model/SecurityExplanationRequestParameters';
import SecurityExplanationResponse from './model/SecurityExplanationResponse';
import SecurityExplanationResponseRoot from './model/SecurityExplanationResponseRoot';

import SecurityExplanationApi from './api/SecurityExplanationApi';
import CheckExplanationStatusResponseWrapper from './api/SecurityExplanationApi';


/**
* Security Explanation client library for JavaScript.<br>
* The <code>index</code> module provides access to constructors for all the classes which comprise the public API.
* <p>
* An AMD (recommended!) or CommonJS application will generally do something equivalent to the following:
* <pre>
* var securityexplanation = require('index'); // See note below*.
* var xxxSvc = new securityexplanation.XxxApi(); // Allocate the API class we're going to use.
* var yyyModel = new securityexplanation.Yyy(); // Construct a model instance.
* yyyModel.someProperty = 'someValue';
* ...
* var zzz = xxxSvc.doSomething(yyyModel); // Invoke the service.
* ...
* </pre>
* <em>*NOTE: For a top-level AMD script, use require(['index'], function(){...})
* and put the application logic within the callback function.</em>
* </p>
* <p>
* A non-AMD browser application (discouraged) might do something like this:
* <pre>
* var xxxSvc = new securityexplanation.XxxApi(); // Allocate the API class we're going to use.
* var yyy = new securityexplanation.Yyy(); // Construct a model instance.
* yyyModel.someProperty = 'someValue';
* ...
* var zzz = xxxSvc.doSomething(yyyModel); // Invoke the service.
* ...
* </pre>
* </p>
* @module index
*/
export {
    /**
     * The ApiClient constructor.
     * @property {module:ApiClient}
     */
    ApiClient,

    /**
     * The APIClientErrorResponse model constructor.
     * @property {module:model/APIClientErrorResponse}
     */
    APIClientErrorResponse,

    /**
     * The APIError model constructor.
     * @property {module:model/APIError}
     */
    APIError,

    /**
     * The ErrorSource model constructor.
     * @property {module:model/ErrorSource}
     */
    ErrorSource,

    /**
     * The ExplanationCreateResponse model constructor.
     * @property {module:model/ExplanationCreateResponse}
     */
    ExplanationCreateResponse,

    /**
     * The ExplanationCreateResponseRoot model constructor.
     * @property {module:model/ExplanationCreateResponseRoot}
     */
    ExplanationCreateResponseRoot,

    /**
     * The ExplanationStatus model constructor.
     * @property {module:model/ExplanationStatus}
     */
    ExplanationStatus,

    /**
     * The ExplanationStatusRoot model constructor.
     * @property {module:model/ExplanationStatusRoot}
     */
    ExplanationStatusRoot,

    /**
     * The SecurityExplanationParametersRoot model constructor.
     * @property {module:model/SecurityExplanationParametersRoot}
     */
    SecurityExplanationParametersRoot,

    /**
     * The SecurityExplanationRequestParameters model constructor.
     * @property {module:model/SecurityExplanationRequestParameters}
     */
    SecurityExplanationRequestParameters,

    /**
     * The SecurityExplanationResponse model constructor.
     * @property {module:model/SecurityExplanationResponse}
     */
    SecurityExplanationResponse,

    /**
     * The SecurityExplanationResponseRoot model constructor.
     * @property {module:model/SecurityExplanationResponseRoot}
     */
    SecurityExplanationResponseRoot,

    /**
    * The SecurityExplanationApi service constructor.
    * @property {module:api/SecurityExplanationApi}
    */
    SecurityExplanationApi,

    /**
    * The CheckExplanationStatus response wrapper.
    * @property {module:GetCalculationStatusByIdResponseWrapper}
    */
    CheckExplanationStatusResponseWrapper,

};
