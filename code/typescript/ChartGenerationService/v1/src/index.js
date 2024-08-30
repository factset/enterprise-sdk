/**
 * Chart Generation Service
 * This is a service for generating charts in a node environment that were created using web charting and get back images in form of `PNGs` and `JPEGs` as response.
 *
 * The version of the OpenAPI document: 1.5.0
 * Contact: api@factset.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 *
 */

import ApiClient from './ApiClient';
import CategoriesErrorResponse from './model/CategoriesErrorResponse';
import CategorizedChartList from './model/CategorizedChartList';
import CategoryChartListErrorObject from './model/CategoryChartListErrorObject';
import CategoryListResponse from './model/CategoryListResponse';
import ChartErrorResponseObject from './model/ChartErrorResponseObject';
import ChartInput from './model/ChartInput';
import ChartList from './model/ChartList';
import ChartListErrorResponse from './model/ChartListErrorResponse';
import ErrorResponse from './model/ErrorResponse';
import UnauthorizedResponse from './model/UnauthorizedResponse';

import ChartTemplatesApi from './api/ChartTemplatesApi';


/**
* Chart Generation Service client library for JavaScript.<br>
* The <code>index</code> module provides access to constructors for all the classes which comprise the public API.
* <p>
* An AMD (recommended!) or CommonJS application will generally do something equivalent to the following:
* <pre>
* var chartgenerationservice = require('index'); // See note below*.
* var xxxSvc = new chartgenerationservice.XxxApi(); // Allocate the API class we're going to use.
* var yyyModel = new chartgenerationservice.Yyy(); // Construct a model instance.
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
* var xxxSvc = new chartgenerationservice.XxxApi(); // Allocate the API class we're going to use.
* var yyy = new chartgenerationservice.Yyy(); // Construct a model instance.
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
     * The CategoriesErrorResponse model constructor.
     * @property {module:model/CategoriesErrorResponse}
     */
    CategoriesErrorResponse,

    /**
     * The CategorizedChartList model constructor.
     * @property {module:model/CategorizedChartList}
     */
    CategorizedChartList,

    /**
     * The CategoryChartListErrorObject model constructor.
     * @property {module:model/CategoryChartListErrorObject}
     */
    CategoryChartListErrorObject,

    /**
     * The CategoryListResponse model constructor.
     * @property {module:model/CategoryListResponse}
     */
    CategoryListResponse,

    /**
     * The ChartErrorResponseObject model constructor.
     * @property {module:model/ChartErrorResponseObject}
     */
    ChartErrorResponseObject,

    /**
     * The ChartInput model constructor.
     * @property {module:model/ChartInput}
     */
    ChartInput,

    /**
     * The ChartList model constructor.
     * @property {module:model/ChartList}
     */
    ChartList,

    /**
     * The ChartListErrorResponse model constructor.
     * @property {module:model/ChartListErrorResponse}
     */
    ChartListErrorResponse,

    /**
     * The ErrorResponse model constructor.
     * @property {module:model/ErrorResponse}
     */
    ErrorResponse,

    /**
     * The UnauthorizedResponse model constructor.
     * @property {module:model/UnauthorizedResponse}
     */
    UnauthorizedResponse,

    /**
    * The ChartTemplatesApi service constructor.
    * @property {module:api/ChartTemplatesApi}
    */
    ChartTemplatesApi,

};
