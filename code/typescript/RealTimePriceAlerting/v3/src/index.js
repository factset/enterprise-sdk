/**
 * Real-Time Price Alerting API
 * The Price Alerting API is designed to inform the users of an application directly about important changes in the data on the platform. The endpoint group *basic price alerting* deals with generation of alerts based on current price data. For notations, users can define an upper or lower limit and choose on which price type those limit conditions apply.  Alerting uses the concepts of triggers and alerts.   * A trigger is an entity that is set up by an application to watch a certain condition in the market data around a financial instrument.   The standard conditions that can be applied are lower limit and upper limit for the value of the price for a given financial instrument. * When the condition of a trigger is met, an alert is created. Each alert thus represents one event where a trigger condition was met.  An application can learn about the creation of alerts in two ways: The application can actively request the list of alerts (pull approach) or it can subscribe to the list of existing alerts. If a new alert is created, that list changes and the application is notified about the new alert with an update that contains the details on the new alert (push approach).  The API supports both approaches. The push approach is realized most easily by using the subscription support that the client libraries provide.  See the [Real-Time Quotes API](https://developer.factset.com/api-catalog/real-time-quotes-api) for access to detailed price information.  Note: As part of the general trial access, endpoints to write data are excluded. For a description of the full alerting API, please work with a FactSet consultant and see https://endpointreference.factset.com. 
 *
 * The version of the OpenAPI document: 3.0.0
 * Contact: api@factset.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 *
 */

import ApiClient from './ApiClient';
import CursorBasedPaginationOutputObject from './model/CursorBasedPaginationOutputObject';
import GetAlertingPricesBasicAlertGetDataNotificationStatusItems from './model/GetAlertingPricesBasicAlertGetDataNotificationStatusItems';
import GetAlertingPricesBasicAlertGetDataNotificationStatusItemsChannel from './model/GetAlertingPricesBasicAlertGetDataNotificationStatusItemsChannel';
import GetAlertingPricesBasicAlertListDataItems from './model/GetAlertingPricesBasicAlertListDataItems';
import GetAlertingPricesBasicAlertListDataItemsNotification from './model/GetAlertingPricesBasicAlertListDataItemsNotification';
import GetAlertingPricesBasicAlertListDataItemsTrigger from './model/GetAlertingPricesBasicAlertListDataItemsTrigger';
import GetAlertingPricesBasicAlertListDataItemsTriggerNotification from './model/GetAlertingPricesBasicAlertListDataItemsTriggerNotification';
import GetAlertingPricesBasicAlertListDataItemsTriggerNotificationChannel from './model/GetAlertingPricesBasicAlertListDataItemsTriggerNotificationChannel';
import GetAlertingPricesBasicAlertListDataItemsTriggerPrice from './model/GetAlertingPricesBasicAlertListDataItemsTriggerPrice';
import GetAlertingPricesBasicAlertListDataItemsTriggerRange from './model/GetAlertingPricesBasicAlertListDataItemsTriggerRange';
import GetAlertingPricesBasicAlertListDataNotificationStatusItems from './model/GetAlertingPricesBasicAlertListDataNotificationStatusItems';
import GetAlertingPricesBasicAlertListDataNotificationStatusItemsChannel from './model/GetAlertingPricesBasicAlertListDataNotificationStatusItemsChannel';
import GetAlertingPricesBasicTriggerGetDataNotificationChannelItems from './model/GetAlertingPricesBasicTriggerGetDataNotificationChannelItems';
import InlineResponse200 from './model/InlineResponse200';
import InlineResponse2001 from './model/InlineResponse2001';
import InlineResponse2001Meta from './model/InlineResponse2001Meta';
import InlineResponse2002 from './model/InlineResponse2002';
import InlineResponse2002Data from './model/InlineResponse2002Data';
import InlineResponse2002DataNotification from './model/InlineResponse2002DataNotification';
import InlineResponse2002DataPrice from './model/InlineResponse2002DataPrice';
import InlineResponse2002DataRange from './model/InlineResponse2002DataRange';
import InlineResponse2002DataStatus from './model/InlineResponse2002DataStatus';
import InlineResponse2003 from './model/InlineResponse2003';
import InlineResponse200Data from './model/InlineResponse200Data';
import InlineResponse200DataNotification from './model/InlineResponse200DataNotification';
import InlineResponse200DataPrice from './model/InlineResponse200DataPrice';
import InlineResponse200DataTrigger from './model/InlineResponse200DataTrigger';
import InlineResponse200DataTriggerNotation from './model/InlineResponse200DataTriggerNotation';
import InlineResponse200DataTriggerNotification from './model/InlineResponse200DataTriggerNotification';
import InlineResponse200DataTriggerNotificationChannel from './model/InlineResponse200DataTriggerNotificationChannel';
import InlineResponse200DataTriggerPrice from './model/InlineResponse200DataTriggerPrice';
import InlineResponse200DataTriggerRange from './model/InlineResponse200DataTriggerRange';
import InlineResponse200DataTriggerStatus from './model/InlineResponse200DataTriggerStatus';
import InlineResponse200Meta from './model/InlineResponse200Meta';
import PostAlertingPricesBasicTriggerListDataItems from './model/PostAlertingPricesBasicTriggerListDataItems';
import PostAlertingPricesBasicTriggerListDataItemsNotification from './model/PostAlertingPricesBasicTriggerListDataItemsNotification';
import PostAlertingPricesBasicTriggerListDataItemsPrice from './model/PostAlertingPricesBasicTriggerListDataItemsPrice';
import PostAlertingPricesBasicTriggerListDataItemsRange from './model/PostAlertingPricesBasicTriggerListDataItemsRange';
import PostAlertingPricesBasicTriggerListDataItemsStatus from './model/PostAlertingPricesBasicTriggerListDataItemsStatus';
import PostAlertingPricesBasicTriggerListDataNotificationChannelItems from './model/PostAlertingPricesBasicTriggerListDataNotificationChannelItems';
import PostAlertingPricesBasicTriggerListRequest from './model/PostAlertingPricesBasicTriggerListRequest';
import PostAlertingPricesBasicTriggerListRequestData from './model/PostAlertingPricesBasicTriggerListRequestData';
import PostAlertingPricesBasicTriggerListRequestDataFilter from './model/PostAlertingPricesBasicTriggerListRequestDataFilter';
import PostAlertingPricesBasicTriggerListRequestDataFilterStatus from './model/PostAlertingPricesBasicTriggerListRequestDataFilterStatus';
import PostAlertingPricesBasicTriggerListRequestMeta from './model/PostAlertingPricesBasicTriggerListRequestMeta';
import PostAlertingPricesBasicTriggerListRequestMetaPagination from './model/PostAlertingPricesBasicTriggerListRequestMetaPagination';
import StatusObject from './model/StatusObject';

import AlertingApi from './api/AlertingApi';


/**
* Real-Time Price Alerting client library for JavaScript.<br>
* The <code>index</code> module provides access to constructors for all the classes which comprise the public API.
* <p>
* An AMD (recommended!) or CommonJS application will generally do something equivalent to the following:
* <pre>
* var realtimepricealerting = require('index'); // See note below*.
* var xxxSvc = new realtimepricealerting.XxxApi(); // Allocate the API class we're going to use.
* var yyyModel = new realtimepricealerting.Yyy(); // Construct a model instance.
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
* var xxxSvc = new realtimepricealerting.XxxApi(); // Allocate the API class we're going to use.
* var yyy = new realtimepricealerting.Yyy(); // Construct a model instance.
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
     * The CursorBasedPaginationOutputObject model constructor.
     * @property {module:model/CursorBasedPaginationOutputObject}
     */
    CursorBasedPaginationOutputObject,

    /**
     * The GetAlertingPricesBasicAlertGetDataNotificationStatusItems model constructor.
     * @property {module:model/GetAlertingPricesBasicAlertGetDataNotificationStatusItems}
     */
    GetAlertingPricesBasicAlertGetDataNotificationStatusItems,

    /**
     * The GetAlertingPricesBasicAlertGetDataNotificationStatusItemsChannel model constructor.
     * @property {module:model/GetAlertingPricesBasicAlertGetDataNotificationStatusItemsChannel}
     */
    GetAlertingPricesBasicAlertGetDataNotificationStatusItemsChannel,

    /**
     * The GetAlertingPricesBasicAlertListDataItems model constructor.
     * @property {module:model/GetAlertingPricesBasicAlertListDataItems}
     */
    GetAlertingPricesBasicAlertListDataItems,

    /**
     * The GetAlertingPricesBasicAlertListDataItemsNotification model constructor.
     * @property {module:model/GetAlertingPricesBasicAlertListDataItemsNotification}
     */
    GetAlertingPricesBasicAlertListDataItemsNotification,

    /**
     * The GetAlertingPricesBasicAlertListDataItemsTrigger model constructor.
     * @property {module:model/GetAlertingPricesBasicAlertListDataItemsTrigger}
     */
    GetAlertingPricesBasicAlertListDataItemsTrigger,

    /**
     * The GetAlertingPricesBasicAlertListDataItemsTriggerNotification model constructor.
     * @property {module:model/GetAlertingPricesBasicAlertListDataItemsTriggerNotification}
     */
    GetAlertingPricesBasicAlertListDataItemsTriggerNotification,

    /**
     * The GetAlertingPricesBasicAlertListDataItemsTriggerNotificationChannel model constructor.
     * @property {module:model/GetAlertingPricesBasicAlertListDataItemsTriggerNotificationChannel}
     */
    GetAlertingPricesBasicAlertListDataItemsTriggerNotificationChannel,

    /**
     * The GetAlertingPricesBasicAlertListDataItemsTriggerPrice model constructor.
     * @property {module:model/GetAlertingPricesBasicAlertListDataItemsTriggerPrice}
     */
    GetAlertingPricesBasicAlertListDataItemsTriggerPrice,

    /**
     * The GetAlertingPricesBasicAlertListDataItemsTriggerRange model constructor.
     * @property {module:model/GetAlertingPricesBasicAlertListDataItemsTriggerRange}
     */
    GetAlertingPricesBasicAlertListDataItemsTriggerRange,

    /**
     * The GetAlertingPricesBasicAlertListDataNotificationStatusItems model constructor.
     * @property {module:model/GetAlertingPricesBasicAlertListDataNotificationStatusItems}
     */
    GetAlertingPricesBasicAlertListDataNotificationStatusItems,

    /**
     * The GetAlertingPricesBasicAlertListDataNotificationStatusItemsChannel model constructor.
     * @property {module:model/GetAlertingPricesBasicAlertListDataNotificationStatusItemsChannel}
     */
    GetAlertingPricesBasicAlertListDataNotificationStatusItemsChannel,

    /**
     * The GetAlertingPricesBasicTriggerGetDataNotificationChannelItems model constructor.
     * @property {module:model/GetAlertingPricesBasicTriggerGetDataNotificationChannelItems}
     */
    GetAlertingPricesBasicTriggerGetDataNotificationChannelItems,

    /**
     * The InlineResponse200 model constructor.
     * @property {module:model/InlineResponse200}
     */
    InlineResponse200,

    /**
     * The InlineResponse2001 model constructor.
     * @property {module:model/InlineResponse2001}
     */
    InlineResponse2001,

    /**
     * The InlineResponse2001Meta model constructor.
     * @property {module:model/InlineResponse2001Meta}
     */
    InlineResponse2001Meta,

    /**
     * The InlineResponse2002 model constructor.
     * @property {module:model/InlineResponse2002}
     */
    InlineResponse2002,

    /**
     * The InlineResponse2002Data model constructor.
     * @property {module:model/InlineResponse2002Data}
     */
    InlineResponse2002Data,

    /**
     * The InlineResponse2002DataNotification model constructor.
     * @property {module:model/InlineResponse2002DataNotification}
     */
    InlineResponse2002DataNotification,

    /**
     * The InlineResponse2002DataPrice model constructor.
     * @property {module:model/InlineResponse2002DataPrice}
     */
    InlineResponse2002DataPrice,

    /**
     * The InlineResponse2002DataRange model constructor.
     * @property {module:model/InlineResponse2002DataRange}
     */
    InlineResponse2002DataRange,

    /**
     * The InlineResponse2002DataStatus model constructor.
     * @property {module:model/InlineResponse2002DataStatus}
     */
    InlineResponse2002DataStatus,

    /**
     * The InlineResponse2003 model constructor.
     * @property {module:model/InlineResponse2003}
     */
    InlineResponse2003,

    /**
     * The InlineResponse200Data model constructor.
     * @property {module:model/InlineResponse200Data}
     */
    InlineResponse200Data,

    /**
     * The InlineResponse200DataNotification model constructor.
     * @property {module:model/InlineResponse200DataNotification}
     */
    InlineResponse200DataNotification,

    /**
     * The InlineResponse200DataPrice model constructor.
     * @property {module:model/InlineResponse200DataPrice}
     */
    InlineResponse200DataPrice,

    /**
     * The InlineResponse200DataTrigger model constructor.
     * @property {module:model/InlineResponse200DataTrigger}
     */
    InlineResponse200DataTrigger,

    /**
     * The InlineResponse200DataTriggerNotation model constructor.
     * @property {module:model/InlineResponse200DataTriggerNotation}
     */
    InlineResponse200DataTriggerNotation,

    /**
     * The InlineResponse200DataTriggerNotification model constructor.
     * @property {module:model/InlineResponse200DataTriggerNotification}
     */
    InlineResponse200DataTriggerNotification,

    /**
     * The InlineResponse200DataTriggerNotificationChannel model constructor.
     * @property {module:model/InlineResponse200DataTriggerNotificationChannel}
     */
    InlineResponse200DataTriggerNotificationChannel,

    /**
     * The InlineResponse200DataTriggerPrice model constructor.
     * @property {module:model/InlineResponse200DataTriggerPrice}
     */
    InlineResponse200DataTriggerPrice,

    /**
     * The InlineResponse200DataTriggerRange model constructor.
     * @property {module:model/InlineResponse200DataTriggerRange}
     */
    InlineResponse200DataTriggerRange,

    /**
     * The InlineResponse200DataTriggerStatus model constructor.
     * @property {module:model/InlineResponse200DataTriggerStatus}
     */
    InlineResponse200DataTriggerStatus,

    /**
     * The InlineResponse200Meta model constructor.
     * @property {module:model/InlineResponse200Meta}
     */
    InlineResponse200Meta,

    /**
     * The PostAlertingPricesBasicTriggerListDataItems model constructor.
     * @property {module:model/PostAlertingPricesBasicTriggerListDataItems}
     */
    PostAlertingPricesBasicTriggerListDataItems,

    /**
     * The PostAlertingPricesBasicTriggerListDataItemsNotification model constructor.
     * @property {module:model/PostAlertingPricesBasicTriggerListDataItemsNotification}
     */
    PostAlertingPricesBasicTriggerListDataItemsNotification,

    /**
     * The PostAlertingPricesBasicTriggerListDataItemsPrice model constructor.
     * @property {module:model/PostAlertingPricesBasicTriggerListDataItemsPrice}
     */
    PostAlertingPricesBasicTriggerListDataItemsPrice,

    /**
     * The PostAlertingPricesBasicTriggerListDataItemsRange model constructor.
     * @property {module:model/PostAlertingPricesBasicTriggerListDataItemsRange}
     */
    PostAlertingPricesBasicTriggerListDataItemsRange,

    /**
     * The PostAlertingPricesBasicTriggerListDataItemsStatus model constructor.
     * @property {module:model/PostAlertingPricesBasicTriggerListDataItemsStatus}
     */
    PostAlertingPricesBasicTriggerListDataItemsStatus,

    /**
     * The PostAlertingPricesBasicTriggerListDataNotificationChannelItems model constructor.
     * @property {module:model/PostAlertingPricesBasicTriggerListDataNotificationChannelItems}
     */
    PostAlertingPricesBasicTriggerListDataNotificationChannelItems,

    /**
     * The PostAlertingPricesBasicTriggerListRequest model constructor.
     * @property {module:model/PostAlertingPricesBasicTriggerListRequest}
     */
    PostAlertingPricesBasicTriggerListRequest,

    /**
     * The PostAlertingPricesBasicTriggerListRequestData model constructor.
     * @property {module:model/PostAlertingPricesBasicTriggerListRequestData}
     */
    PostAlertingPricesBasicTriggerListRequestData,

    /**
     * The PostAlertingPricesBasicTriggerListRequestDataFilter model constructor.
     * @property {module:model/PostAlertingPricesBasicTriggerListRequestDataFilter}
     */
    PostAlertingPricesBasicTriggerListRequestDataFilter,

    /**
     * The PostAlertingPricesBasicTriggerListRequestDataFilterStatus model constructor.
     * @property {module:model/PostAlertingPricesBasicTriggerListRequestDataFilterStatus}
     */
    PostAlertingPricesBasicTriggerListRequestDataFilterStatus,

    /**
     * The PostAlertingPricesBasicTriggerListRequestMeta model constructor.
     * @property {module:model/PostAlertingPricesBasicTriggerListRequestMeta}
     */
    PostAlertingPricesBasicTriggerListRequestMeta,

    /**
     * The PostAlertingPricesBasicTriggerListRequestMetaPagination model constructor.
     * @property {module:model/PostAlertingPricesBasicTriggerListRequestMetaPagination}
     */
    PostAlertingPricesBasicTriggerListRequestMetaPagination,

    /**
     * The StatusObject model constructor.
     * @property {module:model/StatusObject}
     */
    StatusObject,

    /**
    * The AlertingApi service constructor.
    * @property {module:api/AlertingApi}
    */
    AlertingApi,

};
