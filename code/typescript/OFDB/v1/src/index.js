/**
 * OFDB API
 * OFDB api
 *
 * The version of the OpenAPI document: 1.0.0
 * Contact: cpd-hyd-engineering@factset.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 *
 */

import ApiClient from './ApiClient';
import CreateSymbols from './model/CreateSymbols';
import DatabaseSchema from './model/DatabaseSchema';
import InlineResponse201 from './model/InlineResponse201';
import ModifySymbols from './model/ModifySymbols';
import Modifydatespecific from './model/Modifydatespecific';
import Modifysymboldate from './model/Modifysymboldate';
import PostDatesymbol from './model/PostDatesymbol';
import Postnewsymboldate from './model/Postnewsymboldate';
import SuccessPostResponse from './model/SuccessPostResponse';

import CreateApi from './api/CreateApi';
import ModifyApi from './api/ModifyApi';
import ViewApi from './api/ViewApi';


/**
* OFDB client library for JavaScript.<br>
* The <code>index</code> module provides access to constructors for all the classes which comprise the public API.
* <p>
* An AMD (recommended!) or CommonJS application will generally do something equivalent to the following:
* <pre>
* var ofdb = require('index'); // See note below*.
* var xxxSvc = new ofdb.XxxApi(); // Allocate the API class we're going to use.
* var yyyModel = new ofdb.Yyy(); // Construct a model instance.
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
* var xxxSvc = new ofdb.XxxApi(); // Allocate the API class we're going to use.
* var yyy = new ofdb.Yyy(); // Construct a model instance.
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
     * The CreateSymbols model constructor.
     * @property {module:model/CreateSymbols}
     */
    CreateSymbols,

    /**
     * The DatabaseSchema model constructor.
     * @property {module:model/DatabaseSchema}
     */
    DatabaseSchema,

    /**
     * The InlineResponse201 model constructor.
     * @property {module:model/InlineResponse201}
     */
    InlineResponse201,

    /**
     * The ModifySymbols model constructor.
     * @property {module:model/ModifySymbols}
     */
    ModifySymbols,

    /**
     * The Modifydatespecific model constructor.
     * @property {module:model/Modifydatespecific}
     */
    Modifydatespecific,

    /**
     * The Modifysymboldate model constructor.
     * @property {module:model/Modifysymboldate}
     */
    Modifysymboldate,

    /**
     * The PostDatesymbol model constructor.
     * @property {module:model/PostDatesymbol}
     */
    PostDatesymbol,

    /**
     * The Postnewsymboldate model constructor.
     * @property {module:model/Postnewsymboldate}
     */
    Postnewsymboldate,

    /**
     * The SuccessPostResponse model constructor.
     * @property {module:model/SuccessPostResponse}
     */
    SuccessPostResponse,

    /**
    * The CreateApi service constructor.
    * @property {module:api/CreateApi}
    */
    CreateApi,

    /**
    * The ModifyApi service constructor.
    * @property {module:api/ModifyApi}
    */
    ModifyApi,

    /**
    * The ViewApi service constructor.
    * @property {module:api/ViewApi}
    */
    ViewApi,

};
