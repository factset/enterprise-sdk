/**
 * FPE API
 * FactSet Programmatic Environment (FPE) API is an API for users to interact with FPE programmatically, streamlining path from research to production.
 *
 * The version of the OpenAPI document: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 *
 */

import ApiClient from './ApiClient';
import Calculation from './model/Calculation';
import CalculationStatus from './model/CalculationStatus';
import FileUploadStatus from './model/FileUploadStatus';

import CalculationsApi from './api/CalculationsApi';
import FilesApi from './api/FilesApi';


/**
* FactSet Programmatic Environment client library for JavaScript.<br>
* The <code>index</code> module provides access to constructors for all the classes which comprise the public API.
* <p>
* An AMD (recommended!) or CommonJS application will generally do something equivalent to the following:
* <pre>
* var factsetprogrammaticenvironment = require('index'); // See note below*.
* var xxxSvc = new factsetprogrammaticenvironment.XxxApi(); // Allocate the API class we're going to use.
* var yyyModel = new factsetprogrammaticenvironment.Yyy(); // Construct a model instance.
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
* var xxxSvc = new factsetprogrammaticenvironment.XxxApi(); // Allocate the API class we're going to use.
* var yyy = new factsetprogrammaticenvironment.Yyy(); // Construct a model instance.
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
     * The Calculation model constructor.
     * @property {module:model/Calculation}
     */
    Calculation,

    /**
     * The CalculationStatus model constructor.
     * @property {module:model/CalculationStatus}
     */
    CalculationStatus,

    /**
     * The FileUploadStatus model constructor.
     * @property {module:model/FileUploadStatus}
     */
    FileUploadStatus,

    /**
    * The CalculationsApi service constructor.
    * @property {module:api/CalculationsApi}
    */
    CalculationsApi,

    /**
    * The FilesApi service constructor.
    * @property {module:api/FilesApi}
    */
    FilesApi,

};
