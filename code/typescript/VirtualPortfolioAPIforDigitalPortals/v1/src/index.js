/**
 * Prime Developer Trial
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: v1
 * 
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
import InlineObject from './model/InlineObject';
import InlineObject1 from './model/InlineObject1';
import InlineObject10 from './model/InlineObject10';
import InlineObject11 from './model/InlineObject11';
import InlineObject12 from './model/InlineObject12';
import InlineObject13 from './model/InlineObject13';
import InlineObject14 from './model/InlineObject14';
import InlineObject2 from './model/InlineObject2';
import InlineObject3 from './model/InlineObject3';
import InlineObject4 from './model/InlineObject4';
import InlineObject5 from './model/InlineObject5';
import InlineObject6 from './model/InlineObject6';
import InlineObject7 from './model/InlineObject7';
import InlineObject8 from './model/InlineObject8';
import InlineObject9 from './model/InlineObject9';
import InlineResponse200 from './model/InlineResponse200';
import InlineResponse2001 from './model/InlineResponse2001';
import InlineResponse20010 from './model/InlineResponse20010';
import InlineResponse20010Data from './model/InlineResponse20010Data';
import InlineResponse20011 from './model/InlineResponse20011';
import InlineResponse20011Data from './model/InlineResponse20011Data';
import InlineResponse20011Notation from './model/InlineResponse20011Notation';
import InlineResponse2001Data from './model/InlineResponse2001Data';
import InlineResponse2001DataCurrency from './model/InlineResponse2001DataCurrency';
import InlineResponse2001DataProfitLoss from './model/InlineResponse2001DataProfitLoss';
import InlineResponse2001DataProfitLossPotential from './model/InlineResponse2001DataProfitLossPotential';
import InlineResponse2001DataProfitLossRealized from './model/InlineResponse2001DataProfitLossRealized';
import InlineResponse2001DataProfitLossToday from './model/InlineResponse2001DataProfitLossToday';
import InlineResponse2001DataProfitLossTotal from './model/InlineResponse2001DataProfitLossTotal';
import InlineResponse2001DataRiskKeyFigures from './model/InlineResponse2001DataRiskKeyFigures';
import InlineResponse2001DataSummary from './model/InlineResponse2001DataSummary';
import InlineResponse2001DataSummaryCash from './model/InlineResponse2001DataSummaryCash';
import InlineResponse2001DataSummaryTransactions from './model/InlineResponse2001DataSummaryTransactions';
import InlineResponse2001DataSummaryTransactionsBuy from './model/InlineResponse2001DataSummaryTransactionsBuy';
import InlineResponse2001DataSummaryTransactionsSell from './model/InlineResponse2001DataSummaryTransactionsSell';
import InlineResponse2001DataSummaryTransactionsTotal from './model/InlineResponse2001DataSummaryTransactionsTotal';
import InlineResponse2002 from './model/InlineResponse2002';
import InlineResponse2002Currency from './model/InlineResponse2002Currency';
import InlineResponse2002Data from './model/InlineResponse2002Data';
import InlineResponse2002ProfitLoss from './model/InlineResponse2002ProfitLoss';
import InlineResponse2002Summary from './model/InlineResponse2002Summary';
import InlineResponse2002SummaryTransactions from './model/InlineResponse2002SummaryTransactions';
import InlineResponse2003 from './model/InlineResponse2003';
import InlineResponse2004 from './model/InlineResponse2004';
import InlineResponse2004Data from './model/InlineResponse2004Data';
import InlineResponse2004DataKeyfigures from './model/InlineResponse2004DataKeyfigures';
import InlineResponse2004DataPeriod from './model/InlineResponse2004DataPeriod';
import InlineResponse2004DataPeriodProfitLoss from './model/InlineResponse2004DataPeriodProfitLoss';
import InlineResponse2004DataProfitLoss from './model/InlineResponse2004DataProfitLoss';
import InlineResponse2005 from './model/InlineResponse2005';
import InlineResponse2005Data from './model/InlineResponse2005Data';
import InlineResponse2006 from './model/InlineResponse2006';
import InlineResponse2006Data from './model/InlineResponse2006Data';
import InlineResponse2006DataCurrency from './model/InlineResponse2006DataCurrency';
import InlineResponse2006DataInstrument from './model/InlineResponse2006DataInstrument';
import InlineResponse2006DataNotation from './model/InlineResponse2006DataNotation';
import InlineResponse2006DataNotationPrice from './model/InlineResponse2006DataNotationPrice';
import InlineResponse2006DataPositions from './model/InlineResponse2006DataPositions';
import InlineResponse2006DataProfitLoss from './model/InlineResponse2006DataProfitLoss';
import InlineResponse2006DataPurchase from './model/InlineResponse2006DataPurchase';
import InlineResponse2006DataShares from './model/InlineResponse2006DataShares';
import InlineResponse2007 from './model/InlineResponse2007';
import InlineResponse2008 from './model/InlineResponse2008';
import InlineResponse2008Data from './model/InlineResponse2008Data';
import InlineResponse2008Notation from './model/InlineResponse2008Notation';
import InlineResponse2009 from './model/InlineResponse2009';
import InlineResponse201 from './model/InlineResponse201';
import InlineResponse2011 from './model/InlineResponse2011';
import InlineResponse2011Data from './model/InlineResponse2011Data';
import InlineResponse2012 from './model/InlineResponse2012';
import InlineResponse2012Data from './model/InlineResponse2012Data';
import InlineResponse2013 from './model/InlineResponse2013';
import InlineResponse2013Data from './model/InlineResponse2013Data';
import InlineResponse201Data from './model/InlineResponse201Data';
import InlineResponse201Meta from './model/InlineResponse201Meta';
import OffsetBasedPaginationOutputObject from './model/OffsetBasedPaginationOutputObject';
import OffsetBasedPaginationOutputObjectWithoutTotal from './model/OffsetBasedPaginationOutputObjectWithoutTotal';
import PartialOutputObject from './model/PartialOutputObject';
import PortfolioCreateData from './model/PortfolioCreateData';
import PortfolioCreateDataCurrency from './model/PortfolioCreateDataCurrency';
import PortfolioCreateMeta from './model/PortfolioCreateMeta';
import PortfolioDeleteData from './model/PortfolioDeleteData';
import PortfolioEvaluationListData from './model/PortfolioEvaluationListData';
import PortfolioEvaluationListDataRange from './model/PortfolioEvaluationListDataRange';
import PortfolioModifyData from './model/PortfolioModifyData';
import PortfolioTransactionCashCreateData from './model/PortfolioTransactionCashCreateData';
import PortfolioTransactionCashDeleteData from './model/PortfolioTransactionCashDeleteData';
import PortfolioTransactionCreateData from './model/PortfolioTransactionCreateData';
import PortfolioTransactionCreateDataNotation from './model/PortfolioTransactionCreateDataNotation';
import PortfolioTransactionCreateDataParentTransaction from './model/PortfolioTransactionCreateDataParentTransaction';
import PortfolioTransactionDeleteData from './model/PortfolioTransactionDeleteData';
import PortfolioTransactionDeleteDataNotation from './model/PortfolioTransactionDeleteDataNotation';
import PortfolioTransactionDeleteDataTransaction from './model/PortfolioTransactionDeleteDataTransaction';
import PortfolioTransactionModifyData from './model/PortfolioTransactionModifyData';
import PortfolioTransactionModifyDataTransaction from './model/PortfolioTransactionModifyDataTransaction';
import StatusObject from './model/StatusObject';
import SubscriptionMember from './model/SubscriptionMember';
import WatchlistCreateData from './model/WatchlistCreateData';
import WatchlistDeleteData from './model/WatchlistDeleteData';
import WatchlistModifyData from './model/WatchlistModifyData';
import WatchlistPositionCreateData from './model/WatchlistPositionCreateData';
import WatchlistPositionDeleteData from './model/WatchlistPositionDeleteData';
import WatchlistPositionDeleteDataPosition from './model/WatchlistPositionDeleteDataPosition';
import WatchlistPositionModifyData from './model/WatchlistPositionModifyData';
import WatchlistPositionModifyDataPosition from './model/WatchlistPositionModifyDataPosition';

import PortfolioApi from './api/PortfolioApi';
import WatchlistApi from './api/WatchlistApi';


/**
* Virtual Portfolio API for Digital Portals client library for JavaScript.<br>
* The <code>index</code> module provides access to constructors for all the classes which comprise the public API.
* <p>
* An AMD (recommended!) or CommonJS application will generally do something equivalent to the following:
* <pre>
* var virtualportfolioapifordigitalportals = require('index'); // See note below*.
* var xxxSvc = new virtualportfolioapifordigitalportals.XxxApi(); // Allocate the API class we're going to use.
* var yyyModel = new virtualportfolioapifordigitalportals.Yyy(); // Construct a model instance.
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
* var xxxSvc = new virtualportfolioapifordigitalportals.XxxApi(); // Allocate the API class we're going to use.
* var yyy = new virtualportfolioapifordigitalportals.Yyy(); // Construct a model instance.
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
     * The InlineObject model constructor.
     * @property {module:model/InlineObject}
     */
    InlineObject,

    /**
     * The InlineObject1 model constructor.
     * @property {module:model/InlineObject1}
     */
    InlineObject1,

    /**
     * The InlineObject10 model constructor.
     * @property {module:model/InlineObject10}
     */
    InlineObject10,

    /**
     * The InlineObject11 model constructor.
     * @property {module:model/InlineObject11}
     */
    InlineObject11,

    /**
     * The InlineObject12 model constructor.
     * @property {module:model/InlineObject12}
     */
    InlineObject12,

    /**
     * The InlineObject13 model constructor.
     * @property {module:model/InlineObject13}
     */
    InlineObject13,

    /**
     * The InlineObject14 model constructor.
     * @property {module:model/InlineObject14}
     */
    InlineObject14,

    /**
     * The InlineObject2 model constructor.
     * @property {module:model/InlineObject2}
     */
    InlineObject2,

    /**
     * The InlineObject3 model constructor.
     * @property {module:model/InlineObject3}
     */
    InlineObject3,

    /**
     * The InlineObject4 model constructor.
     * @property {module:model/InlineObject4}
     */
    InlineObject4,

    /**
     * The InlineObject5 model constructor.
     * @property {module:model/InlineObject5}
     */
    InlineObject5,

    /**
     * The InlineObject6 model constructor.
     * @property {module:model/InlineObject6}
     */
    InlineObject6,

    /**
     * The InlineObject7 model constructor.
     * @property {module:model/InlineObject7}
     */
    InlineObject7,

    /**
     * The InlineObject8 model constructor.
     * @property {module:model/InlineObject8}
     */
    InlineObject8,

    /**
     * The InlineObject9 model constructor.
     * @property {module:model/InlineObject9}
     */
    InlineObject9,

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
     * The InlineResponse20011 model constructor.
     * @property {module:model/InlineResponse20011}
     */
    InlineResponse20011,

    /**
     * The InlineResponse20011Data model constructor.
     * @property {module:model/InlineResponse20011Data}
     */
    InlineResponse20011Data,

    /**
     * The InlineResponse20011Notation model constructor.
     * @property {module:model/InlineResponse20011Notation}
     */
    InlineResponse20011Notation,

    /**
     * The InlineResponse2001Data model constructor.
     * @property {module:model/InlineResponse2001Data}
     */
    InlineResponse2001Data,

    /**
     * The InlineResponse2001DataCurrency model constructor.
     * @property {module:model/InlineResponse2001DataCurrency}
     */
    InlineResponse2001DataCurrency,

    /**
     * The InlineResponse2001DataProfitLoss model constructor.
     * @property {module:model/InlineResponse2001DataProfitLoss}
     */
    InlineResponse2001DataProfitLoss,

    /**
     * The InlineResponse2001DataProfitLossPotential model constructor.
     * @property {module:model/InlineResponse2001DataProfitLossPotential}
     */
    InlineResponse2001DataProfitLossPotential,

    /**
     * The InlineResponse2001DataProfitLossRealized model constructor.
     * @property {module:model/InlineResponse2001DataProfitLossRealized}
     */
    InlineResponse2001DataProfitLossRealized,

    /**
     * The InlineResponse2001DataProfitLossToday model constructor.
     * @property {module:model/InlineResponse2001DataProfitLossToday}
     */
    InlineResponse2001DataProfitLossToday,

    /**
     * The InlineResponse2001DataProfitLossTotal model constructor.
     * @property {module:model/InlineResponse2001DataProfitLossTotal}
     */
    InlineResponse2001DataProfitLossTotal,

    /**
     * The InlineResponse2001DataRiskKeyFigures model constructor.
     * @property {module:model/InlineResponse2001DataRiskKeyFigures}
     */
    InlineResponse2001DataRiskKeyFigures,

    /**
     * The InlineResponse2001DataSummary model constructor.
     * @property {module:model/InlineResponse2001DataSummary}
     */
    InlineResponse2001DataSummary,

    /**
     * The InlineResponse2001DataSummaryCash model constructor.
     * @property {module:model/InlineResponse2001DataSummaryCash}
     */
    InlineResponse2001DataSummaryCash,

    /**
     * The InlineResponse2001DataSummaryTransactions model constructor.
     * @property {module:model/InlineResponse2001DataSummaryTransactions}
     */
    InlineResponse2001DataSummaryTransactions,

    /**
     * The InlineResponse2001DataSummaryTransactionsBuy model constructor.
     * @property {module:model/InlineResponse2001DataSummaryTransactionsBuy}
     */
    InlineResponse2001DataSummaryTransactionsBuy,

    /**
     * The InlineResponse2001DataSummaryTransactionsSell model constructor.
     * @property {module:model/InlineResponse2001DataSummaryTransactionsSell}
     */
    InlineResponse2001DataSummaryTransactionsSell,

    /**
     * The InlineResponse2001DataSummaryTransactionsTotal model constructor.
     * @property {module:model/InlineResponse2001DataSummaryTransactionsTotal}
     */
    InlineResponse2001DataSummaryTransactionsTotal,

    /**
     * The InlineResponse2002 model constructor.
     * @property {module:model/InlineResponse2002}
     */
    InlineResponse2002,

    /**
     * The InlineResponse2002Currency model constructor.
     * @property {module:model/InlineResponse2002Currency}
     */
    InlineResponse2002Currency,

    /**
     * The InlineResponse2002Data model constructor.
     * @property {module:model/InlineResponse2002Data}
     */
    InlineResponse2002Data,

    /**
     * The InlineResponse2002ProfitLoss model constructor.
     * @property {module:model/InlineResponse2002ProfitLoss}
     */
    InlineResponse2002ProfitLoss,

    /**
     * The InlineResponse2002Summary model constructor.
     * @property {module:model/InlineResponse2002Summary}
     */
    InlineResponse2002Summary,

    /**
     * The InlineResponse2002SummaryTransactions model constructor.
     * @property {module:model/InlineResponse2002SummaryTransactions}
     */
    InlineResponse2002SummaryTransactions,

    /**
     * The InlineResponse2003 model constructor.
     * @property {module:model/InlineResponse2003}
     */
    InlineResponse2003,

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
     * The InlineResponse2004DataKeyfigures model constructor.
     * @property {module:model/InlineResponse2004DataKeyfigures}
     */
    InlineResponse2004DataKeyfigures,

    /**
     * The InlineResponse2004DataPeriod model constructor.
     * @property {module:model/InlineResponse2004DataPeriod}
     */
    InlineResponse2004DataPeriod,

    /**
     * The InlineResponse2004DataPeriodProfitLoss model constructor.
     * @property {module:model/InlineResponse2004DataPeriodProfitLoss}
     */
    InlineResponse2004DataPeriodProfitLoss,

    /**
     * The InlineResponse2004DataProfitLoss model constructor.
     * @property {module:model/InlineResponse2004DataProfitLoss}
     */
    InlineResponse2004DataProfitLoss,

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
     * The InlineResponse2006DataCurrency model constructor.
     * @property {module:model/InlineResponse2006DataCurrency}
     */
    InlineResponse2006DataCurrency,

    /**
     * The InlineResponse2006DataInstrument model constructor.
     * @property {module:model/InlineResponse2006DataInstrument}
     */
    InlineResponse2006DataInstrument,

    /**
     * The InlineResponse2006DataNotation model constructor.
     * @property {module:model/InlineResponse2006DataNotation}
     */
    InlineResponse2006DataNotation,

    /**
     * The InlineResponse2006DataNotationPrice model constructor.
     * @property {module:model/InlineResponse2006DataNotationPrice}
     */
    InlineResponse2006DataNotationPrice,

    /**
     * The InlineResponse2006DataPositions model constructor.
     * @property {module:model/InlineResponse2006DataPositions}
     */
    InlineResponse2006DataPositions,

    /**
     * The InlineResponse2006DataProfitLoss model constructor.
     * @property {module:model/InlineResponse2006DataProfitLoss}
     */
    InlineResponse2006DataProfitLoss,

    /**
     * The InlineResponse2006DataPurchase model constructor.
     * @property {module:model/InlineResponse2006DataPurchase}
     */
    InlineResponse2006DataPurchase,

    /**
     * The InlineResponse2006DataShares model constructor.
     * @property {module:model/InlineResponse2006DataShares}
     */
    InlineResponse2006DataShares,

    /**
     * The InlineResponse2007 model constructor.
     * @property {module:model/InlineResponse2007}
     */
    InlineResponse2007,

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
     * The InlineResponse2008Notation model constructor.
     * @property {module:model/InlineResponse2008Notation}
     */
    InlineResponse2008Notation,

    /**
     * The InlineResponse2009 model constructor.
     * @property {module:model/InlineResponse2009}
     */
    InlineResponse2009,

    /**
     * The InlineResponse201 model constructor.
     * @property {module:model/InlineResponse201}
     */
    InlineResponse201,

    /**
     * The InlineResponse2011 model constructor.
     * @property {module:model/InlineResponse2011}
     */
    InlineResponse2011,

    /**
     * The InlineResponse2011Data model constructor.
     * @property {module:model/InlineResponse2011Data}
     */
    InlineResponse2011Data,

    /**
     * The InlineResponse2012 model constructor.
     * @property {module:model/InlineResponse2012}
     */
    InlineResponse2012,

    /**
     * The InlineResponse2012Data model constructor.
     * @property {module:model/InlineResponse2012Data}
     */
    InlineResponse2012Data,

    /**
     * The InlineResponse2013 model constructor.
     * @property {module:model/InlineResponse2013}
     */
    InlineResponse2013,

    /**
     * The InlineResponse2013Data model constructor.
     * @property {module:model/InlineResponse2013Data}
     */
    InlineResponse2013Data,

    /**
     * The InlineResponse201Data model constructor.
     * @property {module:model/InlineResponse201Data}
     */
    InlineResponse201Data,

    /**
     * The InlineResponse201Meta model constructor.
     * @property {module:model/InlineResponse201Meta}
     */
    InlineResponse201Meta,

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
     * The PortfolioCreateData model constructor.
     * @property {module:model/PortfolioCreateData}
     */
    PortfolioCreateData,

    /**
     * The PortfolioCreateDataCurrency model constructor.
     * @property {module:model/PortfolioCreateDataCurrency}
     */
    PortfolioCreateDataCurrency,

    /**
     * The PortfolioCreateMeta model constructor.
     * @property {module:model/PortfolioCreateMeta}
     */
    PortfolioCreateMeta,

    /**
     * The PortfolioDeleteData model constructor.
     * @property {module:model/PortfolioDeleteData}
     */
    PortfolioDeleteData,

    /**
     * The PortfolioEvaluationListData model constructor.
     * @property {module:model/PortfolioEvaluationListData}
     */
    PortfolioEvaluationListData,

    /**
     * The PortfolioEvaluationListDataRange model constructor.
     * @property {module:model/PortfolioEvaluationListDataRange}
     */
    PortfolioEvaluationListDataRange,

    /**
     * The PortfolioModifyData model constructor.
     * @property {module:model/PortfolioModifyData}
     */
    PortfolioModifyData,

    /**
     * The PortfolioTransactionCashCreateData model constructor.
     * @property {module:model/PortfolioTransactionCashCreateData}
     */
    PortfolioTransactionCashCreateData,

    /**
     * The PortfolioTransactionCashDeleteData model constructor.
     * @property {module:model/PortfolioTransactionCashDeleteData}
     */
    PortfolioTransactionCashDeleteData,

    /**
     * The PortfolioTransactionCreateData model constructor.
     * @property {module:model/PortfolioTransactionCreateData}
     */
    PortfolioTransactionCreateData,

    /**
     * The PortfolioTransactionCreateDataNotation model constructor.
     * @property {module:model/PortfolioTransactionCreateDataNotation}
     */
    PortfolioTransactionCreateDataNotation,

    /**
     * The PortfolioTransactionCreateDataParentTransaction model constructor.
     * @property {module:model/PortfolioTransactionCreateDataParentTransaction}
     */
    PortfolioTransactionCreateDataParentTransaction,

    /**
     * The PortfolioTransactionDeleteData model constructor.
     * @property {module:model/PortfolioTransactionDeleteData}
     */
    PortfolioTransactionDeleteData,

    /**
     * The PortfolioTransactionDeleteDataNotation model constructor.
     * @property {module:model/PortfolioTransactionDeleteDataNotation}
     */
    PortfolioTransactionDeleteDataNotation,

    /**
     * The PortfolioTransactionDeleteDataTransaction model constructor.
     * @property {module:model/PortfolioTransactionDeleteDataTransaction}
     */
    PortfolioTransactionDeleteDataTransaction,

    /**
     * The PortfolioTransactionModifyData model constructor.
     * @property {module:model/PortfolioTransactionModifyData}
     */
    PortfolioTransactionModifyData,

    /**
     * The PortfolioTransactionModifyDataTransaction model constructor.
     * @property {module:model/PortfolioTransactionModifyDataTransaction}
     */
    PortfolioTransactionModifyDataTransaction,

    /**
     * The StatusObject model constructor.
     * @property {module:model/StatusObject}
     */
    StatusObject,

    /**
     * The SubscriptionMember model constructor.
     * @property {module:model/SubscriptionMember}
     */
    SubscriptionMember,

    /**
     * The WatchlistCreateData model constructor.
     * @property {module:model/WatchlistCreateData}
     */
    WatchlistCreateData,

    /**
     * The WatchlistDeleteData model constructor.
     * @property {module:model/WatchlistDeleteData}
     */
    WatchlistDeleteData,

    /**
     * The WatchlistModifyData model constructor.
     * @property {module:model/WatchlistModifyData}
     */
    WatchlistModifyData,

    /**
     * The WatchlistPositionCreateData model constructor.
     * @property {module:model/WatchlistPositionCreateData}
     */
    WatchlistPositionCreateData,

    /**
     * The WatchlistPositionDeleteData model constructor.
     * @property {module:model/WatchlistPositionDeleteData}
     */
    WatchlistPositionDeleteData,

    /**
     * The WatchlistPositionDeleteDataPosition model constructor.
     * @property {module:model/WatchlistPositionDeleteDataPosition}
     */
    WatchlistPositionDeleteDataPosition,

    /**
     * The WatchlistPositionModifyData model constructor.
     * @property {module:model/WatchlistPositionModifyData}
     */
    WatchlistPositionModifyData,

    /**
     * The WatchlistPositionModifyDataPosition model constructor.
     * @property {module:model/WatchlistPositionModifyDataPosition}
     */
    WatchlistPositionModifyDataPosition,

    /**
    * The PortfolioApi service constructor.
    * @property {module:api/PortfolioApi}
    */
    PortfolioApi,

    /**
    * The WatchlistApi service constructor.
    * @property {module:api/WatchlistApi}
    */
    WatchlistApi,

};
