/**
 * Portfolio Reporting Batcher
 * The Portfolio Reporting Batcher (PRB) API allows clients to systematically leverage functionalities of the PRB application. With the initial release, clients can - trigger existing jobs - check status of running jobs - get various details of existing jobs
 *
 * The version of the OpenAPI document: 0.1.0
 * Contact: api@factset.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 *
 */

import ApiClient from './ApiClient';
import Calendar from './model/Calendar';
import ClientErrorResponse from './model/ClientErrorResponse';
import Error from './model/Error';
import ErrorSource from './model/ErrorSource';
import Frequency from './model/Frequency';
import IdStatus from './model/IdStatus';
import IdStatusData from './model/IdStatusData';
import JobOverrides from './model/JobOverrides';
import JobOverridesCombinationsRoot from './model/JobOverridesCombinationsRoot';
import JobOverridesDates from './model/JobOverridesDates';
import JobTypes from './model/JobTypes';
import PrbStatus from './model/PrbStatus';
import StartJob from './model/StartJob';
import StartJobRoot from './model/StartJobRoot';
import StartJobRunResponse from './model/StartJobRunResponse';
import StartJobRunResponseData from './model/StartJobRunResponseData';
import Status from './model/Status';

import RunsApi from './api/RunsApi';


/**
* Portfolio Reporting Batcher client library for JavaScript.<br>
* The <code>index</code> module provides access to constructors for all the classes which comprise the public API.
* <p>
* An AMD (recommended!) or CommonJS application will generally do something equivalent to the following:
* <pre>
* var portfolioreportingbatcher = require('index'); // See note below*.
* var xxxSvc = new portfolioreportingbatcher.XxxApi(); // Allocate the API class we're going to use.
* var yyyModel = new portfolioreportingbatcher.Yyy(); // Construct a model instance.
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
* var xxxSvc = new portfolioreportingbatcher.XxxApi(); // Allocate the API class we're going to use.
* var yyy = new portfolioreportingbatcher.Yyy(); // Construct a model instance.
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
     * The Calendar model constructor.
     * @property {module:model/Calendar}
     */
    Calendar,

    /**
     * The ClientErrorResponse model constructor.
     * @property {module:model/ClientErrorResponse}
     */
    ClientErrorResponse,

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
     * The Frequency model constructor.
     * @property {module:model/Frequency}
     */
    Frequency,

    /**
     * The IdStatus model constructor.
     * @property {module:model/IdStatus}
     */
    IdStatus,

    /**
     * The IdStatusData model constructor.
     * @property {module:model/IdStatusData}
     */
    IdStatusData,

    /**
     * The JobOverrides model constructor.
     * @property {module:model/JobOverrides}
     */
    JobOverrides,

    /**
     * The JobOverridesCombinationsRoot model constructor.
     * @property {module:model/JobOverridesCombinationsRoot}
     */
    JobOverridesCombinationsRoot,

    /**
     * The JobOverridesDates model constructor.
     * @property {module:model/JobOverridesDates}
     */
    JobOverridesDates,

    /**
     * The JobTypes model constructor.
     * @property {module:model/JobTypes}
     */
    JobTypes,

    /**
     * The PrbStatus model constructor.
     * @property {module:model/PrbStatus}
     */
    PrbStatus,

    /**
     * The StartJob model constructor.
     * @property {module:model/StartJob}
     */
    StartJob,

    /**
     * The StartJobRoot model constructor.
     * @property {module:model/StartJobRoot}
     */
    StartJobRoot,

    /**
     * The StartJobRunResponse model constructor.
     * @property {module:model/StartJobRunResponse}
     */
    StartJobRunResponse,

    /**
     * The StartJobRunResponseData model constructor.
     * @property {module:model/StartJobRunResponseData}
     */
    StartJobRunResponseData,

    /**
     * The Status model constructor.
     * @property {module:model/Status}
     */
    Status,

    /**
    * The RunsApi service constructor.
    * @property {module:api/RunsApi}
    */
    RunsApi,

};