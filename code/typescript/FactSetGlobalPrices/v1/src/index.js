/**
 * FactSet Global Prices API
 * The FactSet Global Prices API provides end of day market pricing content using cloud and microservices technology, encompassing both pricing as well as corporate actions and events data.</p> 
 *
 * The version of the OpenAPI document: 1.8.0
 * Contact: api@factset.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 *
 */

import ApiClient from './ApiClient';
import Adjust from './model/Adjust';
import AnnualizedDividendResponse from './model/AnnualizedDividendResponse';
import AnnualizedDividendsObject from './model/AnnualizedDividendsObject';
import AnnualizedDividendsRequest from './model/AnnualizedDividendsRequest';
import Batch from './model/Batch';
import BatchErrorObject from './model/BatchErrorObject';
import BatchErrorObjectLinks from './model/BatchErrorObjectLinks';
import BatchErrorResponse from './model/BatchErrorResponse';
import BatchResult from './model/BatchResult';
import BatchResultResponse from './model/BatchResultResponse';
import BatchStatus from './model/BatchStatus';
import BatchStatusResponse from './model/BatchStatusResponse';
import Calendar from './model/Calendar';
import CancelledDividend from './model/CancelledDividend';
import CashDividendsResponse from './model/CashDividendsResponse';
import CorporateAction from './model/CorporateAction';
import CorporateActionsRequest from './model/CorporateActionsRequest';
import CorporateActionsResponse from './model/CorporateActionsResponse';
import Distribution from './model/Distribution';
import Dividend from './model/Dividend';
import DividendAdjust from './model/DividendAdjust';
import ErrorResponse from './model/ErrorResponse';
import ErrorResponseSubErrors from './model/ErrorResponseSubErrors';
import EventCategory from './model/EventCategory';
import Frequency from './model/Frequency';
import GlobalPricesRequest from './model/GlobalPricesRequest';
import GlobalPricesResponse from './model/GlobalPricesResponse';
import Price from './model/Price';
import Returns from './model/Returns';
import ReturnsRequest from './model/ReturnsRequest';
import ReturnsResponse from './model/ReturnsResponse';
import RightsIssueResponse from './model/RightsIssueResponse';
import SharesOutstandingRequest from './model/SharesOutstandingRequest';
import SharesOutstandingRequestBody from './model/SharesOutstandingRequestBody';
import SharesOutstandingResponse from './model/SharesOutstandingResponse';
import SharesOutstandingResponseObject from './model/SharesOutstandingResponseObject';
import SoErrorObject from './model/SoErrorObject';
import SoErrorObjectLinks from './model/SoErrorObjectLinks';
import SoErrorResponse from './model/SoErrorResponse';
import SpinoffsResponse from './model/SpinoffsResponse';
import Split from './model/Split';
import SplitsResponse from './model/SplitsResponse';
import StockDistributionsResponse from './model/StockDistributionsResponse';

import BatchProcessingApi from './api/BatchProcessingApi';
import GetBatchDataResponseWrapper from './api/BatchProcessingApi';
import CorporateActionsApi from './api/CorporateActionsApi';
import GetGPDCorporateActionsResponseWrapper from './api/CorporateActionsApi';
import GetannualizedDividendsResponseWrapper from './api/CorporateActionsApi';
import GetannualizedDividendsForListResponseWrapper from './api/CorporateActionsApi';
import PostCorporateActionsResponseWrapper from './api/CorporateActionsApi';
import PricesApi from './api/PricesApi';
import GetGPDPricesResponseWrapper from './api/PricesApi';
import GetSecurityPricesForListResponseWrapper from './api/PricesApi';
import ReturnsApi from './api/ReturnsApi';
import GetReturnsResponseWrapper from './api/ReturnsApi';
import GetReturnsForListResponseWrapper from './api/ReturnsApi';
import SharesOutstandingApi from './api/SharesOutstandingApi';
import GetSharesOutstandingResponseWrapper from './api/SharesOutstandingApi';
import PostSharesOutstandingResponseWrapper from './api/SharesOutstandingApi';


/**
* FactSet Global Prices client library for JavaScript.<br>
* The <code>index</code> module provides access to constructors for all the classes which comprise the public API.
* <p>
* An AMD (recommended!) or CommonJS application will generally do something equivalent to the following:
* <pre>
* var factsetglobalprices = require('index'); // See note below*.
* var xxxSvc = new factsetglobalprices.XxxApi(); // Allocate the API class we're going to use.
* var yyyModel = new factsetglobalprices.Yyy(); // Construct a model instance.
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
* var xxxSvc = new factsetglobalprices.XxxApi(); // Allocate the API class we're going to use.
* var yyy = new factsetglobalprices.Yyy(); // Construct a model instance.
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
     * The Adjust model constructor.
     * @property {module:model/Adjust}
     */
    Adjust,

    /**
     * The AnnualizedDividendResponse model constructor.
     * @property {module:model/AnnualizedDividendResponse}
     */
    AnnualizedDividendResponse,

    /**
     * The AnnualizedDividendsObject model constructor.
     * @property {module:model/AnnualizedDividendsObject}
     */
    AnnualizedDividendsObject,

    /**
     * The AnnualizedDividendsRequest model constructor.
     * @property {module:model/AnnualizedDividendsRequest}
     */
    AnnualizedDividendsRequest,

    /**
     * The Batch model constructor.
     * @property {module:model/Batch}
     */
    Batch,

    /**
     * The BatchErrorObject model constructor.
     * @property {module:model/BatchErrorObject}
     */
    BatchErrorObject,

    /**
     * The BatchErrorObjectLinks model constructor.
     * @property {module:model/BatchErrorObjectLinks}
     */
    BatchErrorObjectLinks,

    /**
     * The BatchErrorResponse model constructor.
     * @property {module:model/BatchErrorResponse}
     */
    BatchErrorResponse,

    /**
     * The BatchResult model constructor.
     * @property {module:model/BatchResult}
     */
    BatchResult,

    /**
     * The BatchResultResponse model constructor.
     * @property {module:model/BatchResultResponse}
     */
    BatchResultResponse,

    /**
     * The BatchStatus model constructor.
     * @property {module:model/BatchStatus}
     */
    BatchStatus,

    /**
     * The BatchStatusResponse model constructor.
     * @property {module:model/BatchStatusResponse}
     */
    BatchStatusResponse,

    /**
     * The Calendar model constructor.
     * @property {module:model/Calendar}
     */
    Calendar,

    /**
     * The CancelledDividend model constructor.
     * @property {module:model/CancelledDividend}
     */
    CancelledDividend,

    /**
     * The CashDividendsResponse model constructor.
     * @property {module:model/CashDividendsResponse}
     */
    CashDividendsResponse,

    /**
     * The CorporateAction model constructor.
     * @property {module:model/CorporateAction}
     */
    CorporateAction,

    /**
     * The CorporateActionsRequest model constructor.
     * @property {module:model/CorporateActionsRequest}
     */
    CorporateActionsRequest,

    /**
     * The CorporateActionsResponse model constructor.
     * @property {module:model/CorporateActionsResponse}
     */
    CorporateActionsResponse,

    /**
     * The Distribution model constructor.
     * @property {module:model/Distribution}
     */
    Distribution,

    /**
     * The Dividend model constructor.
     * @property {module:model/Dividend}
     */
    Dividend,

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
     * The EventCategory model constructor.
     * @property {module:model/EventCategory}
     */
    EventCategory,

    /**
     * The Frequency model constructor.
     * @property {module:model/Frequency}
     */
    Frequency,

    /**
     * The GlobalPricesRequest model constructor.
     * @property {module:model/GlobalPricesRequest}
     */
    GlobalPricesRequest,

    /**
     * The GlobalPricesResponse model constructor.
     * @property {module:model/GlobalPricesResponse}
     */
    GlobalPricesResponse,

    /**
     * The Price model constructor.
     * @property {module:model/Price}
     */
    Price,

    /**
     * The Returns model constructor.
     * @property {module:model/Returns}
     */
    Returns,

    /**
     * The ReturnsRequest model constructor.
     * @property {module:model/ReturnsRequest}
     */
    ReturnsRequest,

    /**
     * The ReturnsResponse model constructor.
     * @property {module:model/ReturnsResponse}
     */
    ReturnsResponse,

    /**
     * The RightsIssueResponse model constructor.
     * @property {module:model/RightsIssueResponse}
     */
    RightsIssueResponse,

    /**
     * The SharesOutstandingRequest model constructor.
     * @property {module:model/SharesOutstandingRequest}
     */
    SharesOutstandingRequest,

    /**
     * The SharesOutstandingRequestBody model constructor.
     * @property {module:model/SharesOutstandingRequestBody}
     */
    SharesOutstandingRequestBody,

    /**
     * The SharesOutstandingResponse model constructor.
     * @property {module:model/SharesOutstandingResponse}
     */
    SharesOutstandingResponse,

    /**
     * The SharesOutstandingResponseObject model constructor.
     * @property {module:model/SharesOutstandingResponseObject}
     */
    SharesOutstandingResponseObject,

    /**
     * The SoErrorObject model constructor.
     * @property {module:model/SoErrorObject}
     */
    SoErrorObject,

    /**
     * The SoErrorObjectLinks model constructor.
     * @property {module:model/SoErrorObjectLinks}
     */
    SoErrorObjectLinks,

    /**
     * The SoErrorResponse model constructor.
     * @property {module:model/SoErrorResponse}
     */
    SoErrorResponse,

    /**
     * The SpinoffsResponse model constructor.
     * @property {module:model/SpinoffsResponse}
     */
    SpinoffsResponse,

    /**
     * The Split model constructor.
     * @property {module:model/Split}
     */
    Split,

    /**
     * The SplitsResponse model constructor.
     * @property {module:model/SplitsResponse}
     */
    SplitsResponse,

    /**
     * The StockDistributionsResponse model constructor.
     * @property {module:model/StockDistributionsResponse}
     */
    StockDistributionsResponse,

    /**
    * The BatchProcessingApi service constructor.
    * @property {module:api/BatchProcessingApi}
    */
    BatchProcessingApi,

    /**
    * The GetBatchData response wrapper.
    * @property {module:GetCalculationStatusByIdResponseWrapper}
    */
    GetBatchDataResponseWrapper,

    /**
    * The CorporateActionsApi service constructor.
    * @property {module:api/CorporateActionsApi}
    */
    CorporateActionsApi,

    /**
    * The GetGPDCorporateActions response wrapper.
    * @property {module:GetCalculationStatusByIdResponseWrapper}
    */
    GetGPDCorporateActionsResponseWrapper,

    /**
    * The GetannualizedDividends response wrapper.
    * @property {module:GetCalculationStatusByIdResponseWrapper}
    */
    GetannualizedDividendsResponseWrapper,

    /**
    * The GetannualizedDividendsForList response wrapper.
    * @property {module:GetCalculationStatusByIdResponseWrapper}
    */
    GetannualizedDividendsForListResponseWrapper,

    /**
    * The PostCorporateActions response wrapper.
    * @property {module:GetCalculationStatusByIdResponseWrapper}
    */
    PostCorporateActionsResponseWrapper,

    /**
    * The PricesApi service constructor.
    * @property {module:api/PricesApi}
    */
    PricesApi,

    /**
    * The GetGPDPrices response wrapper.
    * @property {module:GetCalculationStatusByIdResponseWrapper}
    */
    GetGPDPricesResponseWrapper,

    /**
    * The GetSecurityPricesForList response wrapper.
    * @property {module:GetCalculationStatusByIdResponseWrapper}
    */
    GetSecurityPricesForListResponseWrapper,

    /**
    * The ReturnsApi service constructor.
    * @property {module:api/ReturnsApi}
    */
    ReturnsApi,

    /**
    * The GetReturns response wrapper.
    * @property {module:GetCalculationStatusByIdResponseWrapper}
    */
    GetReturnsResponseWrapper,

    /**
    * The GetReturnsForList response wrapper.
    * @property {module:GetCalculationStatusByIdResponseWrapper}
    */
    GetReturnsForListResponseWrapper,

    /**
    * The SharesOutstandingApi service constructor.
    * @property {module:api/SharesOutstandingApi}
    */
    SharesOutstandingApi,

    /**
    * The GetSharesOutstanding response wrapper.
    * @property {module:GetCalculationStatusByIdResponseWrapper}
    */
    GetSharesOutstandingResponseWrapper,

    /**
    * The PostSharesOutstanding response wrapper.
    * @property {module:GetCalculationStatusByIdResponseWrapper}
    */
    PostSharesOutstandingResponseWrapper,

};
