/**
 * Time Series API For Digital Portals
 * Time series data, end-of-day or intraday, tick-by-tick or subsampled. Additional vendor-specific endpoints provide a modified interface for seamless integration with the ChartIQ chart library.  This API is focused on high-performance applications that are  * serving millions of end-users, * accessible by client browsers via the internet, * integrated into complex infrastructures such as existing frontend frameworks or authentication services.  This API has been designed for direct use by client web applications and feature extreme low latency: The average response time across all endpoints is 30 ms whereas 99% of all requests are answered in close to under 300ms.  See the [Real-Time Quotes API for Digital Portals](https://developer.factset.com/api-catalog/real-time-quotes-api) for access to detailed price information. 
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
import CursorBasedPaginationOutputObjectWithoutTotal from './model/CursorBasedPaginationOutputObjectWithoutTotal';
import ErrorMetaObject from './model/ErrorMetaObject';
import InlineResponse200 from './model/InlineResponse200';
import InlineResponse2001 from './model/InlineResponse2001';
import InlineResponse20010 from './model/InlineResponse20010';
import InlineResponse20010Data from './model/InlineResponse20010Data';
import InlineResponse20010DataSubsamples from './model/InlineResponse20010DataSubsamples';
import InlineResponse2001Data from './model/InlineResponse2001Data';
import InlineResponse2001Meta from './model/InlineResponse2001Meta';
import InlineResponse2002 from './model/InlineResponse2002';
import InlineResponse2002Data from './model/InlineResponse2002Data';
import InlineResponse2003 from './model/InlineResponse2003';
import InlineResponse2003Data from './model/InlineResponse2003Data';
import InlineResponse2004 from './model/InlineResponse2004';
import InlineResponse2004Data from './model/InlineResponse2004Data';
import InlineResponse2004DataRange from './model/InlineResponse2004DataRange';
import InlineResponse2005 from './model/InlineResponse2005';
import InlineResponse2005Data from './model/InlineResponse2005Data';
import InlineResponse2005DataPrices from './model/InlineResponse2005DataPrices';
import InlineResponse2006 from './model/InlineResponse2006';
import InlineResponse2006Data from './model/InlineResponse2006Data';
import InlineResponse2006DataSubsample from './model/InlineResponse2006DataSubsample';
import InlineResponse2007 from './model/InlineResponse2007';
import InlineResponse2007Data from './model/InlineResponse2007Data';
import InlineResponse2007DataSubsamples from './model/InlineResponse2007DataSubsamples';
import InlineResponse2008 from './model/InlineResponse2008';
import InlineResponse2008Data from './model/InlineResponse2008Data';
import InlineResponse2008DataPrices from './model/InlineResponse2008DataPrices';
import InlineResponse2009 from './model/InlineResponse2009';
import InlineResponse2009Data from './model/InlineResponse2009Data';
import InlineResponse2009DataSubsample from './model/InlineResponse2009DataSubsample';
import InlineResponse200Data from './model/InlineResponse200Data';
import InlineResponse200DataRange from './model/InlineResponse200DataRange';
import InlineResponse200Meta from './model/InlineResponse200Meta';
import OffsetBasedPaginationOutputObject from './model/OffsetBasedPaginationOutputObject';
import OffsetBasedPaginationOutputObjectWithoutTotal from './model/OffsetBasedPaginationOutputObjectWithoutTotal';
import PartialOutputObject from './model/PartialOutputObject';
import PostPricesTimeSeriesEodListRequest from './model/PostPricesTimeSeriesEodListRequest';
import PostPricesTimeSeriesEodSubsampleGetRequest from './model/PostPricesTimeSeriesEodSubsampleGetRequest';
import PostPricesTimeSeriesEodSubsampleGetRequestData from './model/PostPricesTimeSeriesEodSubsampleGetRequestData';
import PostPricesTimeSeriesEodSubsampleGetRequestDataInterval from './model/PostPricesTimeSeriesEodSubsampleGetRequestDataInterval';
import PostPricesTimeSeriesEodSubsampleListRequest from './model/PostPricesTimeSeriesEodSubsampleListRequest';
import PostPricesTimeSeriesIntradayListRequest from './model/PostPricesTimeSeriesIntradayListRequest';
import PostPricesTimeSeriesIntradayListRequestData from './model/PostPricesTimeSeriesIntradayListRequestData';
import PostPricesTimeSeriesIntradayListRequestDataRange from './model/PostPricesTimeSeriesIntradayListRequestDataRange';
import PostPricesTimeSeriesIntradayListRequestMeta from './model/PostPricesTimeSeriesIntradayListRequestMeta';
import PostPricesTimeSeriesIntradayListRequestMetaPagination from './model/PostPricesTimeSeriesIntradayListRequestMetaPagination';
import PostPricesTimeSeriesIntradaySubsampleGetRequest from './model/PostPricesTimeSeriesIntradaySubsampleGetRequest';
import PostPricesTimeSeriesIntradaySubsampleListRequest from './model/PostPricesTimeSeriesIntradaySubsampleListRequest';
import PostVendorChartIQTimeSeriesEodListRequest from './model/PostVendorChartIQTimeSeriesEodListRequest';
import PostVendorChartIQTimeSeriesEodListRequestData from './model/PostVendorChartIQTimeSeriesEodListRequestData';
import PostVendorChartIQTimeSeriesEodListRequestDataAdjustments from './model/PostVendorChartIQTimeSeriesEodListRequestDataAdjustments';
import PostVendorChartIQTimeSeriesEodListRequestDataIdentifier from './model/PostVendorChartIQTimeSeriesEodListRequestDataIdentifier';
import PostVendorChartIQTimeSeriesEodListRequestDataRange from './model/PostVendorChartIQTimeSeriesEodListRequestDataRange';
import PostVendorChartIQTimeSeriesEodListRequestMeta from './model/PostVendorChartIQTimeSeriesEodListRequestMeta';
import PostVendorChartIQTimeSeriesEodListRequestMetaPagination from './model/PostVendorChartIQTimeSeriesEodListRequestMetaPagination';
import PostVendorChartIQTimeSeriesEodSubsampleGetRequest from './model/PostVendorChartIQTimeSeriesEodSubsampleGetRequest';
import PostVendorChartIQTimeSeriesEodSubsampleGetRequestData from './model/PostVendorChartIQTimeSeriesEodSubsampleGetRequestData';
import PostVendorChartIQTimeSeriesEodSubsampleGetRequestDataInterval from './model/PostVendorChartIQTimeSeriesEodSubsampleGetRequestDataInterval';
import PostVendorChartIQTimeSeriesEodSubsampleGetRequestMeta from './model/PostVendorChartIQTimeSeriesEodSubsampleGetRequestMeta';
import PostVendorChartIQTimeSeriesEodSubsampleListRequest from './model/PostVendorChartIQTimeSeriesEodSubsampleListRequest';
import PostVendorChartIQTimeSeriesEodSubsampleListRequestData from './model/PostVendorChartIQTimeSeriesEodSubsampleListRequestData';
import PostVendorChartIQTimeSeriesEodSubsampleListRequestDataIntervalSelection from './model/PostVendorChartIQTimeSeriesEodSubsampleListRequestDataIntervalSelection';
import PostVendorChartIQTimeSeriesEodSubsampleListRequestDataIntervalSelectionSamples from './model/PostVendorChartIQTimeSeriesEodSubsampleListRequestDataIntervalSelectionSamples';
import PostVendorChartIQTimeSeriesIntradaySubsampleGetRequest from './model/PostVendorChartIQTimeSeriesIntradaySubsampleGetRequest';
import PostVendorChartIQTimeSeriesIntradaySubsampleGetRequestData from './model/PostVendorChartIQTimeSeriesIntradaySubsampleGetRequestData';
import PostVendorChartIQTimeSeriesIntradaySubsampleGetRequestDataAdjustments from './model/PostVendorChartIQTimeSeriesIntradaySubsampleGetRequestDataAdjustments';
import PostVendorChartIQTimeSeriesIntradaySubsampleListRequest from './model/PostVendorChartIQTimeSeriesIntradaySubsampleListRequest';
import PostVendorChartIQTimeSeriesIntradaySubsampleListRequestData from './model/PostVendorChartIQTimeSeriesIntradaySubsampleListRequestData';
import PostVendorChartIQTimeSeriesIntradaySubsampleListRequestDataRange from './model/PostVendorChartIQTimeSeriesIntradaySubsampleListRequestDataRange';
import StatusObject from './model/StatusObject';

import PricesApi from './api/PricesApi';
import VendorApi from './api/VendorApi';


/**
* Real-Time Time Series client library for JavaScript.<br>
* The <code>index</code> module provides access to constructors for all the classes which comprise the public API.
* <p>
* An AMD (recommended!) or CommonJS application will generally do something equivalent to the following:
* <pre>
* var realtimetimeseries = require('index'); // See note below*.
* var xxxSvc = new realtimetimeseries.XxxApi(); // Allocate the API class we're going to use.
* var yyyModel = new realtimetimeseries.Yyy(); // Construct a model instance.
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
* var xxxSvc = new realtimetimeseries.XxxApi(); // Allocate the API class we're going to use.
* var yyy = new realtimetimeseries.Yyy(); // Construct a model instance.
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
     * The CursorBasedPaginationOutputObjectWithoutTotal model constructor.
     * @property {module:model/CursorBasedPaginationOutputObjectWithoutTotal}
     */
    CursorBasedPaginationOutputObjectWithoutTotal,

    /**
     * The ErrorMetaObject model constructor.
     * @property {module:model/ErrorMetaObject}
     */
    ErrorMetaObject,

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
     * The InlineResponse20010 model constructor.
     * @property {module:model/InlineResponse20010}
     */
    InlineResponse20010,

    /**
     * The InlineResponse20010Data model constructor.
     * @property {module:model/InlineResponse20010Data}
     */
    InlineResponse20010Data,

    /**
     * The InlineResponse20010DataSubsamples model constructor.
     * @property {module:model/InlineResponse20010DataSubsamples}
     */
    InlineResponse20010DataSubsamples,

    /**
     * The InlineResponse2001Data model constructor.
     * @property {module:model/InlineResponse2001Data}
     */
    InlineResponse2001Data,

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
     * The InlineResponse2003 model constructor.
     * @property {module:model/InlineResponse2003}
     */
    InlineResponse2003,

    /**
     * The InlineResponse2003Data model constructor.
     * @property {module:model/InlineResponse2003Data}
     */
    InlineResponse2003Data,

    /**
     * The InlineResponse2004 model constructor.
     * @property {module:model/InlineResponse2004}
     */
    InlineResponse2004,

    /**
     * The InlineResponse2004Data model constructor.
     * @property {module:model/InlineResponse2004Data}
     */
    InlineResponse2004Data,

    /**
     * The InlineResponse2004DataRange model constructor.
     * @property {module:model/InlineResponse2004DataRange}
     */
    InlineResponse2004DataRange,

    /**
     * The InlineResponse2005 model constructor.
     * @property {module:model/InlineResponse2005}
     */
    InlineResponse2005,

    /**
     * The InlineResponse2005Data model constructor.
     * @property {module:model/InlineResponse2005Data}
     */
    InlineResponse2005Data,

    /**
     * The InlineResponse2005DataPrices model constructor.
     * @property {module:model/InlineResponse2005DataPrices}
     */
    InlineResponse2005DataPrices,

    /**
     * The InlineResponse2006 model constructor.
     * @property {module:model/InlineResponse2006}
     */
    InlineResponse2006,

    /**
     * The InlineResponse2006Data model constructor.
     * @property {module:model/InlineResponse2006Data}
     */
    InlineResponse2006Data,

    /**
     * The InlineResponse2006DataSubsample model constructor.
     * @property {module:model/InlineResponse2006DataSubsample}
     */
    InlineResponse2006DataSubsample,

    /**
     * The InlineResponse2007 model constructor.
     * @property {module:model/InlineResponse2007}
     */
    InlineResponse2007,

    /**
     * The InlineResponse2007Data model constructor.
     * @property {module:model/InlineResponse2007Data}
     */
    InlineResponse2007Data,

    /**
     * The InlineResponse2007DataSubsamples model constructor.
     * @property {module:model/InlineResponse2007DataSubsamples}
     */
    InlineResponse2007DataSubsamples,

    /**
     * The InlineResponse2008 model constructor.
     * @property {module:model/InlineResponse2008}
     */
    InlineResponse2008,

    /**
     * The InlineResponse2008Data model constructor.
     * @property {module:model/InlineResponse2008Data}
     */
    InlineResponse2008Data,

    /**
     * The InlineResponse2008DataPrices model constructor.
     * @property {module:model/InlineResponse2008DataPrices}
     */
    InlineResponse2008DataPrices,

    /**
     * The InlineResponse2009 model constructor.
     * @property {module:model/InlineResponse2009}
     */
    InlineResponse2009,

    /**
     * The InlineResponse2009Data model constructor.
     * @property {module:model/InlineResponse2009Data}
     */
    InlineResponse2009Data,

    /**
     * The InlineResponse2009DataSubsample model constructor.
     * @property {module:model/InlineResponse2009DataSubsample}
     */
    InlineResponse2009DataSubsample,

    /**
     * The InlineResponse200Data model constructor.
     * @property {module:model/InlineResponse200Data}
     */
    InlineResponse200Data,

    /**
     * The InlineResponse200DataRange model constructor.
     * @property {module:model/InlineResponse200DataRange}
     */
    InlineResponse200DataRange,

    /**
     * The InlineResponse200Meta model constructor.
     * @property {module:model/InlineResponse200Meta}
     */
    InlineResponse200Meta,

    /**
     * The OffsetBasedPaginationOutputObject model constructor.
     * @property {module:model/OffsetBasedPaginationOutputObject}
     */
    OffsetBasedPaginationOutputObject,

    /**
     * The OffsetBasedPaginationOutputObjectWithoutTotal model constructor.
     * @property {module:model/OffsetBasedPaginationOutputObjectWithoutTotal}
     */
    OffsetBasedPaginationOutputObjectWithoutTotal,

    /**
     * The PartialOutputObject model constructor.
     * @property {module:model/PartialOutputObject}
     */
    PartialOutputObject,

    /**
     * The PostPricesTimeSeriesEodListRequest model constructor.
     * @property {module:model/PostPricesTimeSeriesEodListRequest}
     */
    PostPricesTimeSeriesEodListRequest,

    /**
     * The PostPricesTimeSeriesEodSubsampleGetRequest model constructor.
     * @property {module:model/PostPricesTimeSeriesEodSubsampleGetRequest}
     */
    PostPricesTimeSeriesEodSubsampleGetRequest,

    /**
     * The PostPricesTimeSeriesEodSubsampleGetRequestData model constructor.
     * @property {module:model/PostPricesTimeSeriesEodSubsampleGetRequestData}
     */
    PostPricesTimeSeriesEodSubsampleGetRequestData,

    /**
     * The PostPricesTimeSeriesEodSubsampleGetRequestDataInterval model constructor.
     * @property {module:model/PostPricesTimeSeriesEodSubsampleGetRequestDataInterval}
     */
    PostPricesTimeSeriesEodSubsampleGetRequestDataInterval,

    /**
     * The PostPricesTimeSeriesEodSubsampleListRequest model constructor.
     * @property {module:model/PostPricesTimeSeriesEodSubsampleListRequest}
     */
    PostPricesTimeSeriesEodSubsampleListRequest,

    /**
     * The PostPricesTimeSeriesIntradayListRequest model constructor.
     * @property {module:model/PostPricesTimeSeriesIntradayListRequest}
     */
    PostPricesTimeSeriesIntradayListRequest,

    /**
     * The PostPricesTimeSeriesIntradayListRequestData model constructor.
     * @property {module:model/PostPricesTimeSeriesIntradayListRequestData}
     */
    PostPricesTimeSeriesIntradayListRequestData,

    /**
     * The PostPricesTimeSeriesIntradayListRequestDataRange model constructor.
     * @property {module:model/PostPricesTimeSeriesIntradayListRequestDataRange}
     */
    PostPricesTimeSeriesIntradayListRequestDataRange,

    /**
     * The PostPricesTimeSeriesIntradayListRequestMeta model constructor.
     * @property {module:model/PostPricesTimeSeriesIntradayListRequestMeta}
     */
    PostPricesTimeSeriesIntradayListRequestMeta,

    /**
     * The PostPricesTimeSeriesIntradayListRequestMetaPagination model constructor.
     * @property {module:model/PostPricesTimeSeriesIntradayListRequestMetaPagination}
     */
    PostPricesTimeSeriesIntradayListRequestMetaPagination,

    /**
     * The PostPricesTimeSeriesIntradaySubsampleGetRequest model constructor.
     * @property {module:model/PostPricesTimeSeriesIntradaySubsampleGetRequest}
     */
    PostPricesTimeSeriesIntradaySubsampleGetRequest,

    /**
     * The PostPricesTimeSeriesIntradaySubsampleListRequest model constructor.
     * @property {module:model/PostPricesTimeSeriesIntradaySubsampleListRequest}
     */
    PostPricesTimeSeriesIntradaySubsampleListRequest,

    /**
     * The PostVendorChartIQTimeSeriesEodListRequest model constructor.
     * @property {module:model/PostVendorChartIQTimeSeriesEodListRequest}
     */
    PostVendorChartIQTimeSeriesEodListRequest,

    /**
     * The PostVendorChartIQTimeSeriesEodListRequestData model constructor.
     * @property {module:model/PostVendorChartIQTimeSeriesEodListRequestData}
     */
    PostVendorChartIQTimeSeriesEodListRequestData,

    /**
     * The PostVendorChartIQTimeSeriesEodListRequestDataAdjustments model constructor.
     * @property {module:model/PostVendorChartIQTimeSeriesEodListRequestDataAdjustments}
     */
    PostVendorChartIQTimeSeriesEodListRequestDataAdjustments,

    /**
     * The PostVendorChartIQTimeSeriesEodListRequestDataIdentifier model constructor.
     * @property {module:model/PostVendorChartIQTimeSeriesEodListRequestDataIdentifier}
     */
    PostVendorChartIQTimeSeriesEodListRequestDataIdentifier,

    /**
     * The PostVendorChartIQTimeSeriesEodListRequestDataRange model constructor.
     * @property {module:model/PostVendorChartIQTimeSeriesEodListRequestDataRange}
     */
    PostVendorChartIQTimeSeriesEodListRequestDataRange,

    /**
     * The PostVendorChartIQTimeSeriesEodListRequestMeta model constructor.
     * @property {module:model/PostVendorChartIQTimeSeriesEodListRequestMeta}
     */
    PostVendorChartIQTimeSeriesEodListRequestMeta,

    /**
     * The PostVendorChartIQTimeSeriesEodListRequestMetaPagination model constructor.
     * @property {module:model/PostVendorChartIQTimeSeriesEodListRequestMetaPagination}
     */
    PostVendorChartIQTimeSeriesEodListRequestMetaPagination,

    /**
     * The PostVendorChartIQTimeSeriesEodSubsampleGetRequest model constructor.
     * @property {module:model/PostVendorChartIQTimeSeriesEodSubsampleGetRequest}
     */
    PostVendorChartIQTimeSeriesEodSubsampleGetRequest,

    /**
     * The PostVendorChartIQTimeSeriesEodSubsampleGetRequestData model constructor.
     * @property {module:model/PostVendorChartIQTimeSeriesEodSubsampleGetRequestData}
     */
    PostVendorChartIQTimeSeriesEodSubsampleGetRequestData,

    /**
     * The PostVendorChartIQTimeSeriesEodSubsampleGetRequestDataInterval model constructor.
     * @property {module:model/PostVendorChartIQTimeSeriesEodSubsampleGetRequestDataInterval}
     */
    PostVendorChartIQTimeSeriesEodSubsampleGetRequestDataInterval,

    /**
     * The PostVendorChartIQTimeSeriesEodSubsampleGetRequestMeta model constructor.
     * @property {module:model/PostVendorChartIQTimeSeriesEodSubsampleGetRequestMeta}
     */
    PostVendorChartIQTimeSeriesEodSubsampleGetRequestMeta,

    /**
     * The PostVendorChartIQTimeSeriesEodSubsampleListRequest model constructor.
     * @property {module:model/PostVendorChartIQTimeSeriesEodSubsampleListRequest}
     */
    PostVendorChartIQTimeSeriesEodSubsampleListRequest,

    /**
     * The PostVendorChartIQTimeSeriesEodSubsampleListRequestData model constructor.
     * @property {module:model/PostVendorChartIQTimeSeriesEodSubsampleListRequestData}
     */
    PostVendorChartIQTimeSeriesEodSubsampleListRequestData,

    /**
     * The PostVendorChartIQTimeSeriesEodSubsampleListRequestDataIntervalSelection model constructor.
     * @property {module:model/PostVendorChartIQTimeSeriesEodSubsampleListRequestDataIntervalSelection}
     */
    PostVendorChartIQTimeSeriesEodSubsampleListRequestDataIntervalSelection,

    /**
     * The PostVendorChartIQTimeSeriesEodSubsampleListRequestDataIntervalSelectionSamples model constructor.
     * @property {module:model/PostVendorChartIQTimeSeriesEodSubsampleListRequestDataIntervalSelectionSamples}
     */
    PostVendorChartIQTimeSeriesEodSubsampleListRequestDataIntervalSelectionSamples,

    /**
     * The PostVendorChartIQTimeSeriesIntradaySubsampleGetRequest model constructor.
     * @property {module:model/PostVendorChartIQTimeSeriesIntradaySubsampleGetRequest}
     */
    PostVendorChartIQTimeSeriesIntradaySubsampleGetRequest,

    /**
     * The PostVendorChartIQTimeSeriesIntradaySubsampleGetRequestData model constructor.
     * @property {module:model/PostVendorChartIQTimeSeriesIntradaySubsampleGetRequestData}
     */
    PostVendorChartIQTimeSeriesIntradaySubsampleGetRequestData,

    /**
     * The PostVendorChartIQTimeSeriesIntradaySubsampleGetRequestDataAdjustments model constructor.
     * @property {module:model/PostVendorChartIQTimeSeriesIntradaySubsampleGetRequestDataAdjustments}
     */
    PostVendorChartIQTimeSeriesIntradaySubsampleGetRequestDataAdjustments,

    /**
     * The PostVendorChartIQTimeSeriesIntradaySubsampleListRequest model constructor.
     * @property {module:model/PostVendorChartIQTimeSeriesIntradaySubsampleListRequest}
     */
    PostVendorChartIQTimeSeriesIntradaySubsampleListRequest,

    /**
     * The PostVendorChartIQTimeSeriesIntradaySubsampleListRequestData model constructor.
     * @property {module:model/PostVendorChartIQTimeSeriesIntradaySubsampleListRequestData}
     */
    PostVendorChartIQTimeSeriesIntradaySubsampleListRequestData,

    /**
     * The PostVendorChartIQTimeSeriesIntradaySubsampleListRequestDataRange model constructor.
     * @property {module:model/PostVendorChartIQTimeSeriesIntradaySubsampleListRequestDataRange}
     */
    PostVendorChartIQTimeSeriesIntradaySubsampleListRequestDataRange,

    /**
     * The StatusObject model constructor.
     * @property {module:model/StatusObject}
     */
    StatusObject,

    /**
    * The PricesApi service constructor.
    * @property {module:api/PricesApi}
    */
    PricesApi,

    /**
    * The VendorApi service constructor.
    * @property {module:api/VendorApi}
    */
    VendorApi,

};