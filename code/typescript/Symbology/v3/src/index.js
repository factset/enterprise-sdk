/**
 * FactSet Symbology API
 * The FactSet Symbology API provides symbol resolution services, allowing clients to translate market identifiers into various symbology types such as, FactSet Permanent Identifiers, CUSIP, ISIN, SEDOL, Tickers, and LEIs. <p>Factset's Symbology API sits at the center of its hub-and-spoke data model, enabling you to quickly harmonize the expanding catalog of Content APIs.</p><p>This API is rate-limited to 10 requests per second and 10 concurrent requests per user.</p> 
 *
 * The version of the OpenAPI document: 3.4.0
 * Contact: api@factset.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 *
 */

import ApiClient from './ApiClient';
import ErrorObject from './model/ErrorObject';
import ErrorObjectLinks from './model/ErrorObjectLinks';
import ErrorResponse from './model/ErrorResponse';
import ErrorResponseHistorical from './model/ErrorResponseHistorical';
import ErrorResponseSubErrors from './model/ErrorResponseSubErrors';
import GetHistoricalInputSymbolType from './model/GetHistoricalInputSymbolType';
import GetInputSymbolType from './model/GetInputSymbolType';
import IdentifierResolution from './model/IdentifierResolution';
import IdentifierResolutionHistorical from './model/IdentifierResolutionHistorical';
import IdentifierResolutionHistoricalRequest from './model/IdentifierResolutionHistoricalRequest';
import IdentifierResolutionHistoricalRequestBody from './model/IdentifierResolutionHistoricalRequestBody';
import IdentifierResolutionHistoricalResponse from './model/IdentifierResolutionHistoricalResponse';
import IdentifierResolutionRequest from './model/IdentifierResolutionRequest';
import IdentifierResolutionResponse from './model/IdentifierResolutionResponse';

import HistoricalIdentifierResolutionApi from './api/HistoricalIdentifierResolutionApi';
import IdentifierResolutionApi from './api/IdentifierResolutionApi';


/**
* Symbology client library for JavaScript.<br>
* The <code>index</code> module provides access to constructors for all the classes which comprise the public API.
* <p>
* An AMD (recommended!) or CommonJS application will generally do something equivalent to the following:
* <pre>
* var symbology = require('index'); // See note below*.
* var xxxSvc = new symbology.XxxApi(); // Allocate the API class we're going to use.
* var yyyModel = new symbology.Yyy(); // Construct a model instance.
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
* var xxxSvc = new symbology.XxxApi(); // Allocate the API class we're going to use.
* var yyy = new symbology.Yyy(); // Construct a model instance.
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
     * The ErrorObject model constructor.
     * @property {module:model/ErrorObject}
     */
    ErrorObject,

    /**
     * The ErrorObjectLinks model constructor.
     * @property {module:model/ErrorObjectLinks}
     */
    ErrorObjectLinks,

    /**
     * The ErrorResponse model constructor.
     * @property {module:model/ErrorResponse}
     */
    ErrorResponse,

    /**
     * The ErrorResponseHistorical model constructor.
     * @property {module:model/ErrorResponseHistorical}
     */
    ErrorResponseHistorical,

    /**
     * The ErrorResponseSubErrors model constructor.
     * @property {module:model/ErrorResponseSubErrors}
     */
    ErrorResponseSubErrors,

    /**
     * The GetHistoricalInputSymbolType model constructor.
     * @property {module:model/GetHistoricalInputSymbolType}
     */
    GetHistoricalInputSymbolType,

    /**
     * The GetInputSymbolType model constructor.
     * @property {module:model/GetInputSymbolType}
     */
    GetInputSymbolType,

    /**
     * The IdentifierResolution model constructor.
     * @property {module:model/IdentifierResolution}
     */
    IdentifierResolution,

    /**
     * The IdentifierResolutionHistorical model constructor.
     * @property {module:model/IdentifierResolutionHistorical}
     */
    IdentifierResolutionHistorical,

    /**
     * The IdentifierResolutionHistoricalRequest model constructor.
     * @property {module:model/IdentifierResolutionHistoricalRequest}
     */
    IdentifierResolutionHistoricalRequest,

    /**
     * The IdentifierResolutionHistoricalRequestBody model constructor.
     * @property {module:model/IdentifierResolutionHistoricalRequestBody}
     */
    IdentifierResolutionHistoricalRequestBody,

    /**
     * The IdentifierResolutionHistoricalResponse model constructor.
     * @property {module:model/IdentifierResolutionHistoricalResponse}
     */
    IdentifierResolutionHistoricalResponse,

    /**
     * The IdentifierResolutionRequest model constructor.
     * @property {module:model/IdentifierResolutionRequest}
     */
    IdentifierResolutionRequest,

    /**
     * The IdentifierResolutionResponse model constructor.
     * @property {module:model/IdentifierResolutionResponse}
     */
    IdentifierResolutionResponse,

    /**
    * The HistoricalIdentifierResolutionApi service constructor.
    * @property {module:api/HistoricalIdentifierResolutionApi}
    */
    HistoricalIdentifierResolutionApi,

    /**
    * The IdentifierResolutionApi service constructor.
    * @property {module:api/IdentifierResolutionApi}
    */
    IdentifierResolutionApi,

};
