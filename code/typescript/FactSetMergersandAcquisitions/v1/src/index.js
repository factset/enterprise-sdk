/**
 * FactSet Mergers and Acquisitions API
 * The FactSet Mergers and Acquisitions API provides access to key transactions and pricing metrics on over 60,000 globally traded deals. Reference a Global Universe of Mergers and Acquisitions (M&A) transactions where the target of the deal is a Publicly traded Company. Review premiums, multiples and fundamental data to gather insights on deals and create predictive models based on different deal characteristics.    Monetary values returned by this API are converted and represented in USD.    This API is allows a limit of 10 requests per second and a maximum of 10 concurrent requests. 
 *
 * The version of the OpenAPI document: 1.1.0
 * Contact: api@factset.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 *
 */

import ApiClient from './ApiClient';
import AdvisorParticipant from './model/AdvisorParticipant';
import Advisors from './model/Advisors';
import BuyersAdvisor from './model/BuyersAdvisor';
import DealCompany from './model/DealCompany';
import DealPublic from './model/DealPublic';
import DealValue from './model/DealValue';
import DealsPublicRequest from './model/DealsPublicRequest';
import DealsPublicRequestBody from './model/DealsPublicRequestBody';
import DealsPublicResponse from './model/DealsPublicResponse';
import DealsRequest from './model/DealsRequest';
import DealsRequestBody from './model/DealsRequestBody';
import DealsResponse from './model/DealsResponse';
import Detail from './model/Detail';
import DetailsRequest from './model/DetailsRequest';
import DetailsRequestBody from './model/DetailsRequestBody';
import DetailsResponse from './model/DetailsResponse';
import ErrorObject from './model/ErrorObject';
import ErrorResponse from './model/ErrorResponse';
import Participant from './model/Participant';
import SellersAdvisor from './model/SellersAdvisor';
import Status from './model/Status';
import Target from './model/Target';

import DealsApi from './api/DealsApi';


/**
* FactSet Mergers and Acquisitions client library for JavaScript.<br>
* The <code>index</code> module provides access to constructors for all the classes which comprise the public API.
* <p>
* An AMD (recommended!) or CommonJS application will generally do something equivalent to the following:
* <pre>
* var factsetmergersandacquisitions = require('index'); // See note below*.
* var xxxSvc = new factsetmergersandacquisitions.XxxApi(); // Allocate the API class we're going to use.
* var yyyModel = new factsetmergersandacquisitions.Yyy(); // Construct a model instance.
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
* var xxxSvc = new factsetmergersandacquisitions.XxxApi(); // Allocate the API class we're going to use.
* var yyy = new factsetmergersandacquisitions.Yyy(); // Construct a model instance.
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
     * The AdvisorParticipant model constructor.
     * @property {module:model/AdvisorParticipant}
     */
    AdvisorParticipant,

    /**
     * The Advisors model constructor.
     * @property {module:model/Advisors}
     */
    Advisors,

    /**
     * The BuyersAdvisor model constructor.
     * @property {module:model/BuyersAdvisor}
     */
    BuyersAdvisor,

    /**
     * The DealCompany model constructor.
     * @property {module:model/DealCompany}
     */
    DealCompany,

    /**
     * The DealPublic model constructor.
     * @property {module:model/DealPublic}
     */
    DealPublic,

    /**
     * The DealValue model constructor.
     * @property {module:model/DealValue}
     */
    DealValue,

    /**
     * The DealsPublicRequest model constructor.
     * @property {module:model/DealsPublicRequest}
     */
    DealsPublicRequest,

    /**
     * The DealsPublicRequestBody model constructor.
     * @property {module:model/DealsPublicRequestBody}
     */
    DealsPublicRequestBody,

    /**
     * The DealsPublicResponse model constructor.
     * @property {module:model/DealsPublicResponse}
     */
    DealsPublicResponse,

    /**
     * The DealsRequest model constructor.
     * @property {module:model/DealsRequest}
     */
    DealsRequest,

    /**
     * The DealsRequestBody model constructor.
     * @property {module:model/DealsRequestBody}
     */
    DealsRequestBody,

    /**
     * The DealsResponse model constructor.
     * @property {module:model/DealsResponse}
     */
    DealsResponse,

    /**
     * The Detail model constructor.
     * @property {module:model/Detail}
     */
    Detail,

    /**
     * The DetailsRequest model constructor.
     * @property {module:model/DetailsRequest}
     */
    DetailsRequest,

    /**
     * The DetailsRequestBody model constructor.
     * @property {module:model/DetailsRequestBody}
     */
    DetailsRequestBody,

    /**
     * The DetailsResponse model constructor.
     * @property {module:model/DetailsResponse}
     */
    DetailsResponse,

    /**
     * The ErrorObject model constructor.
     * @property {module:model/ErrorObject}
     */
    ErrorObject,

    /**
     * The ErrorResponse model constructor.
     * @property {module:model/ErrorResponse}
     */
    ErrorResponse,

    /**
     * The Participant model constructor.
     * @property {module:model/Participant}
     */
    Participant,

    /**
     * The SellersAdvisor model constructor.
     * @property {module:model/SellersAdvisor}
     */
    SellersAdvisor,

    /**
     * The Status model constructor.
     * @property {module:model/Status}
     */
    Status,

    /**
     * The Target model constructor.
     * @property {module:model/Target}
     */
    Target,

    /**
    * The DealsApi service constructor.
    * @property {module:api/DealsApi}
    */
    DealsApi,

};
