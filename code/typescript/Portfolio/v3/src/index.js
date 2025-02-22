/**
 * ModelAccounts API
 * Allow clients to fetch ModelAccounts Analytics through APIs.
 *
 * The version of the OpenAPI document: 3.3.0
 * Contact: api@factset.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 *
 */

import ApiClient from './ApiClient';
import ClientErrorResponse from './model/ClientErrorResponse';
import DataAndMetaModel from './model/DataAndMetaModel';
import Error from './model/Error';
import ErrorSource from './model/ErrorSource';
import ModelAccountAdditionalField from './model/ModelAccountAdditionalField';
import ModelAccountFields from './model/ModelAccountFields';
import ModelAccountFieldsRoot from './model/ModelAccountFieldsRoot';
import ModelAccountSchemaRoot from './model/ModelAccountSchemaRoot';

import ModelAccountsApi from './api/ModelAccountsApi';


/**
* Portfolio client library for JavaScript.<br>
* The <code>index</code> module provides access to constructors for all the classes which comprise the public API.
* <p>
* An AMD (recommended!) or CommonJS application will generally do something equivalent to the following:
* <pre>
* var portfolio = require('index'); // See note below*.
* var xxxSvc = new portfolio.XxxApi(); // Allocate the API class we're going to use.
* var yyyModel = new portfolio.Yyy(); // Construct a model instance.
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
* var xxxSvc = new portfolio.XxxApi(); // Allocate the API class we're going to use.
* var yyy = new portfolio.Yyy(); // Construct a model instance.
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
     * The ClientErrorResponse model constructor.
     * @property {module:model/ClientErrorResponse}
     */
    ClientErrorResponse,

    /**
     * The DataAndMetaModel model constructor.
     * @property {module:model/DataAndMetaModel}
     */
    DataAndMetaModel,

    /**
     * The Error model constructor.
     * @property {module:model/Error}
     */
    Error,

    /**
     * The ErrorSource model constructor.
     * @property {module:model/ErrorSource}
     */
    ErrorSource,

    /**
     * The ModelAccountAdditionalField model constructor.
     * @property {module:model/ModelAccountAdditionalField}
     */
    ModelAccountAdditionalField,

    /**
     * The ModelAccountFields model constructor.
     * @property {module:model/ModelAccountFields}
     */
    ModelAccountFields,

    /**
     * The ModelAccountFieldsRoot model constructor.
     * @property {module:model/ModelAccountFieldsRoot}
     */
    ModelAccountFieldsRoot,

    /**
     * The ModelAccountSchemaRoot model constructor.
     * @property {module:model/ModelAccountSchemaRoot}
     */
    ModelAccountSchemaRoot,

    /**
    * The ModelAccountsApi service constructor.
    * @property {module:api/ModelAccountsApi}
    */
    ModelAccountsApi,

};
