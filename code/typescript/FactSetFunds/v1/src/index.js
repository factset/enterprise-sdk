/**
 * FactSet Funds API
 * FactSet Mutual Funds data offers over 50 fund- and share class-specific data points for mutual funds listed in the United States. <p>FactSet Mutual Funds Reference provides fund-specific reference information as well as FactSet's proprietary classification system. It includes but is not limited to the following coverage    * Fund descriptions    * A seven-tier classification system   * Leverage information   * Fees and expenses    * Portfolio managers       FactSet Mutual Funds Time Series provides quantitative data items on a historical basis. It includes but is not limited to the following coverage    * Net asset value   * Fund flows    * Assets under management   * Total return  <p>This API is rate-limited to 10 requests per second and 10 concurrent requests per user.</p> 
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
import Aum from './model/Aum';
import AumRequest from './model/AumRequest';
import AumResponse from './model/AumResponse';
import BenchmarkDetails from './model/BenchmarkDetails';
import BenchmarkDetailsRequest from './model/BenchmarkDetailsRequest';
import BenchmarkDetailsResponse from './model/BenchmarkDetailsResponse';
import Classifications from './model/Classifications';
import ClassificationsRequest from './model/ClassificationsRequest';
import ClassificationsResponse from './model/ClassificationsResponse';
import CostsFees from './model/CostsFees';
import CostsFeesRequest from './model/CostsFeesRequest';
import CostsFeesResponse from './model/CostsFeesResponse';
import DataType from './model/DataType';
import DistCurrent from './model/DistCurrent';
import DistCurrentRequest from './model/DistCurrentRequest';
import DistCurrentResponse from './model/DistCurrentResponse';
import DistHistorical from './model/DistHistorical';
import DistHistoricalRequest from './model/DistHistoricalRequest';
import DistHistoricalResponse from './model/DistHistoricalResponse';
import DividendAdjust from './model/DividendAdjust';
import ErrorResponse from './model/ErrorResponse';
import ErrorResponseSubErrors from './model/ErrorResponseSubErrors';
import Flows from './model/Flows';
import FlowsRequest from './model/FlowsRequest';
import FlowsResponse from './model/FlowsResponse';
import Frequency from './model/Frequency';
import FrequencyAum from './model/FrequencyAum';
import FundsPricesRequest from './model/FundsPricesRequest';
import FundsPricesResponse from './model/FundsPricesResponse';
import FundsReturnsRequest from './model/FundsReturnsRequest';
import FundsReturnsResponse from './model/FundsReturnsResponse';
import FundsReturnsSnapshotRequest from './model/FundsReturnsSnapshotRequest';
import FundsReturnsSnapshotResponse from './model/FundsReturnsSnapshotResponse';
import Group from './model/Group';
import GroupHolding from './model/GroupHolding';
import GroupHoldingsRequest from './model/GroupHoldingsRequest';
import GroupHoldingsResponse from './model/GroupHoldingsResponse';
import Managers from './model/Managers';
import ManagersRequest from './model/ManagersRequest';
import ManagersResponse from './model/ManagersResponse';
import MarketAggregate from './model/MarketAggregate';
import MarketAggregatesRequest from './model/MarketAggregatesRequest';
import MarketAggregatesResponse from './model/MarketAggregatesResponse';
import Prices from './model/Prices';
import RelatedFunds from './model/RelatedFunds';
import RelatedFundsRequest from './model/RelatedFundsRequest';
import RelatedFundsResponse from './model/RelatedFundsResponse';
import Returns from './model/Returns';
import ReturnsRange from './model/ReturnsRange';
import ReturnsRangeRequest from './model/ReturnsRangeRequest';
import ReturnsRangeResponse from './model/ReturnsRangeResponse';
import ReturnsSnapshot from './model/ReturnsSnapshot';
import SplitAdjust from './model/SplitAdjust';
import Statuses from './model/Statuses';
import StatusesRequest from './model/StatusesRequest';
import StatusesResponse from './model/StatusesResponse';
import Summaries from './model/Summaries';
import SummariesRequest from './model/SummariesRequest';
import SummariesResponse from './model/SummariesResponse';

import DistributionsApi from './api/DistributionsApi';
import FundFlowsAUMApi from './api/FundFlowsAUMApi';
import GroupHoldingsApi from './api/GroupHoldingsApi';
import HelperApi from './api/HelperApi';
import MarketAggregatesApi from './api/MarketAggregatesApi';
import PricesReturnsApi from './api/PricesReturnsApi';
import ReferenceApi from './api/ReferenceApi';


/**
* FactSet Funds client library for JavaScript.<br>
* The <code>index</code> module provides access to constructors for all the classes which comprise the public API.
* <p>
* An AMD (recommended!) or CommonJS application will generally do something equivalent to the following:
* <pre>
* var factsetfunds = require('index'); // See note below*.
* var xxxSvc = new factsetfunds.XxxApi(); // Allocate the API class we're going to use.
* var yyyModel = new factsetfunds.Yyy(); // Construct a model instance.
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
* var xxxSvc = new factsetfunds.XxxApi(); // Allocate the API class we're going to use.
* var yyy = new factsetfunds.Yyy(); // Construct a model instance.
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
     * The Aum model constructor.
     * @property {module:model/Aum}
     */
    Aum,

    /**
     * The AumRequest model constructor.
     * @property {module:model/AumRequest}
     */
    AumRequest,

    /**
     * The AumResponse model constructor.
     * @property {module:model/AumResponse}
     */
    AumResponse,

    /**
     * The BenchmarkDetails model constructor.
     * @property {module:model/BenchmarkDetails}
     */
    BenchmarkDetails,

    /**
     * The BenchmarkDetailsRequest model constructor.
     * @property {module:model/BenchmarkDetailsRequest}
     */
    BenchmarkDetailsRequest,

    /**
     * The BenchmarkDetailsResponse model constructor.
     * @property {module:model/BenchmarkDetailsResponse}
     */
    BenchmarkDetailsResponse,

    /**
     * The Classifications model constructor.
     * @property {module:model/Classifications}
     */
    Classifications,

    /**
     * The ClassificationsRequest model constructor.
     * @property {module:model/ClassificationsRequest}
     */
    ClassificationsRequest,

    /**
     * The ClassificationsResponse model constructor.
     * @property {module:model/ClassificationsResponse}
     */
    ClassificationsResponse,

    /**
     * The CostsFees model constructor.
     * @property {module:model/CostsFees}
     */
    CostsFees,

    /**
     * The CostsFeesRequest model constructor.
     * @property {module:model/CostsFeesRequest}
     */
    CostsFeesRequest,

    /**
     * The CostsFeesResponse model constructor.
     * @property {module:model/CostsFeesResponse}
     */
    CostsFeesResponse,

    /**
     * The DataType model constructor.
     * @property {module:model/DataType}
     */
    DataType,

    /**
     * The DistCurrent model constructor.
     * @property {module:model/DistCurrent}
     */
    DistCurrent,

    /**
     * The DistCurrentRequest model constructor.
     * @property {module:model/DistCurrentRequest}
     */
    DistCurrentRequest,

    /**
     * The DistCurrentResponse model constructor.
     * @property {module:model/DistCurrentResponse}
     */
    DistCurrentResponse,

    /**
     * The DistHistorical model constructor.
     * @property {module:model/DistHistorical}
     */
    DistHistorical,

    /**
     * The DistHistoricalRequest model constructor.
     * @property {module:model/DistHistoricalRequest}
     */
    DistHistoricalRequest,

    /**
     * The DistHistoricalResponse model constructor.
     * @property {module:model/DistHistoricalResponse}
     */
    DistHistoricalResponse,

    /**
     * The DividendAdjust model constructor.
     * @property {module:model/DividendAdjust}
     */
    DividendAdjust,

    /**
     * The ErrorResponse model constructor.
     * @property {module:model/ErrorResponse}
     */
    ErrorResponse,

    /**
     * The ErrorResponseSubErrors model constructor.
     * @property {module:model/ErrorResponseSubErrors}
     */
    ErrorResponseSubErrors,

    /**
     * The Flows model constructor.
     * @property {module:model/Flows}
     */
    Flows,

    /**
     * The FlowsRequest model constructor.
     * @property {module:model/FlowsRequest}
     */
    FlowsRequest,

    /**
     * The FlowsResponse model constructor.
     * @property {module:model/FlowsResponse}
     */
    FlowsResponse,

    /**
     * The Frequency model constructor.
     * @property {module:model/Frequency}
     */
    Frequency,

    /**
     * The FrequencyAum model constructor.
     * @property {module:model/FrequencyAum}
     */
    FrequencyAum,

    /**
     * The FundsPricesRequest model constructor.
     * @property {module:model/FundsPricesRequest}
     */
    FundsPricesRequest,

    /**
     * The FundsPricesResponse model constructor.
     * @property {module:model/FundsPricesResponse}
     */
    FundsPricesResponse,

    /**
     * The FundsReturnsRequest model constructor.
     * @property {module:model/FundsReturnsRequest}
     */
    FundsReturnsRequest,

    /**
     * The FundsReturnsResponse model constructor.
     * @property {module:model/FundsReturnsResponse}
     */
    FundsReturnsResponse,

    /**
     * The FundsReturnsSnapshotRequest model constructor.
     * @property {module:model/FundsReturnsSnapshotRequest}
     */
    FundsReturnsSnapshotRequest,

    /**
     * The FundsReturnsSnapshotResponse model constructor.
     * @property {module:model/FundsReturnsSnapshotResponse}
     */
    FundsReturnsSnapshotResponse,

    /**
     * The Group model constructor.
     * @property {module:model/Group}
     */
    Group,

    /**
     * The GroupHolding model constructor.
     * @property {module:model/GroupHolding}
     */
    GroupHolding,

    /**
     * The GroupHoldingsRequest model constructor.
     * @property {module:model/GroupHoldingsRequest}
     */
    GroupHoldingsRequest,

    /**
     * The GroupHoldingsResponse model constructor.
     * @property {module:model/GroupHoldingsResponse}
     */
    GroupHoldingsResponse,

    /**
     * The Managers model constructor.
     * @property {module:model/Managers}
     */
    Managers,

    /**
     * The ManagersRequest model constructor.
     * @property {module:model/ManagersRequest}
     */
    ManagersRequest,

    /**
     * The ManagersResponse model constructor.
     * @property {module:model/ManagersResponse}
     */
    ManagersResponse,

    /**
     * The MarketAggregate model constructor.
     * @property {module:model/MarketAggregate}
     */
    MarketAggregate,

    /**
     * The MarketAggregatesRequest model constructor.
     * @property {module:model/MarketAggregatesRequest}
     */
    MarketAggregatesRequest,

    /**
     * The MarketAggregatesResponse model constructor.
     * @property {module:model/MarketAggregatesResponse}
     */
    MarketAggregatesResponse,

    /**
     * The Prices model constructor.
     * @property {module:model/Prices}
     */
    Prices,

    /**
     * The RelatedFunds model constructor.
     * @property {module:model/RelatedFunds}
     */
    RelatedFunds,

    /**
     * The RelatedFundsRequest model constructor.
     * @property {module:model/RelatedFundsRequest}
     */
    RelatedFundsRequest,

    /**
     * The RelatedFundsResponse model constructor.
     * @property {module:model/RelatedFundsResponse}
     */
    RelatedFundsResponse,

    /**
     * The Returns model constructor.
     * @property {module:model/Returns}
     */
    Returns,

    /**
     * The ReturnsRange model constructor.
     * @property {module:model/ReturnsRange}
     */
    ReturnsRange,

    /**
     * The ReturnsRangeRequest model constructor.
     * @property {module:model/ReturnsRangeRequest}
     */
    ReturnsRangeRequest,

    /**
     * The ReturnsRangeResponse model constructor.
     * @property {module:model/ReturnsRangeResponse}
     */
    ReturnsRangeResponse,

    /**
     * The ReturnsSnapshot model constructor.
     * @property {module:model/ReturnsSnapshot}
     */
    ReturnsSnapshot,

    /**
     * The SplitAdjust model constructor.
     * @property {module:model/SplitAdjust}
     */
    SplitAdjust,

    /**
     * The Statuses model constructor.
     * @property {module:model/Statuses}
     */
    Statuses,

    /**
     * The StatusesRequest model constructor.
     * @property {module:model/StatusesRequest}
     */
    StatusesRequest,

    /**
     * The StatusesResponse model constructor.
     * @property {module:model/StatusesResponse}
     */
    StatusesResponse,

    /**
     * The Summaries model constructor.
     * @property {module:model/Summaries}
     */
    Summaries,

    /**
     * The SummariesRequest model constructor.
     * @property {module:model/SummariesRequest}
     */
    SummariesRequest,

    /**
     * The SummariesResponse model constructor.
     * @property {module:model/SummariesResponse}
     */
    SummariesResponse,

    /**
    * The DistributionsApi service constructor.
    * @property {module:api/DistributionsApi}
    */
    DistributionsApi,

    /**
    * The FundFlowsAUMApi service constructor.
    * @property {module:api/FundFlowsAUMApi}
    */
    FundFlowsAUMApi,

    /**
    * The GroupHoldingsApi service constructor.
    * @property {module:api/GroupHoldingsApi}
    */
    GroupHoldingsApi,

    /**
    * The HelperApi service constructor.
    * @property {module:api/HelperApi}
    */
    HelperApi,

    /**
    * The MarketAggregatesApi service constructor.
    * @property {module:api/MarketAggregatesApi}
    */
    MarketAggregatesApi,

    /**
    * The PricesReturnsApi service constructor.
    * @property {module:api/PricesReturnsApi}
    */
    PricesReturnsApi,

    /**
    * The ReferenceApi service constructor.
    * @property {module:api/ReferenceApi}
    */
    ReferenceApi,

};
