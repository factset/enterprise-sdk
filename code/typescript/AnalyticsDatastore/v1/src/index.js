/**
 * Analytics Datastore  API
 * Allow clients to fetch precalculated Analytics through predeterministic URLs.
 *
 * The version of the OpenAPI document: 1
 * Contact: analytics.api.support@factset.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 *
 */

import ApiClient from './ApiClient';

import CargoApi from './api/CargoApi';
import SwivelApi from './api/SwivelApi';


/**
* Analytics Datastore client library for JavaScript.<br>
* The <code>index</code> module provides access to constructors for all the classes which comprise the public API.
* <p>
* An AMD (recommended!) or CommonJS application will generally do something equivalent to the following:
* <pre>
* var analyticsdatastore = require('index'); // See note below*.
* var xxxSvc = new analyticsdatastore.XxxApi(); // Allocate the API class we're going to use.
* var yyyModel = new analyticsdatastore.Yyy(); // Construct a model instance.
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
* var xxxSvc = new analyticsdatastore.XxxApi(); // Allocate the API class we're going to use.
* var yyy = new analyticsdatastore.Yyy(); // Construct a model instance.
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
    * The CargoApi service constructor.
    * @property {module:api/CargoApi}
    */
    CargoApi,

    /**
    * The SwivelApi service constructor.
    * @property {module:api/SwivelApi}
    */
    SwivelApi,

};
