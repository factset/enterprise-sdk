/**
 * Events and Transcripts API
 * <p>The Calendar Events API provides access to FactSetâ€™s Event Calendar data alongside business logic that allows users to replicate views and functionality consistent with the experience provided by the Workstation. This API provides the ability to pull Event Calendar data based on specific filters.</p> <p>Events Audio API provides access to historical as well as the latest audio recordings of various company events covered by FactSet. The events include, but are not limited to: earnings calls, conferences, and investor days. This API also provides relevant metadata such as timestamps and identifiers around each audio file.</p> <p>The  Near Real-time Transcripts API enables access to Near Real-time Transcripts provided by CallStreet to time-sensitive clients. This API also provides the relevant speaker metadata along with their confidence scores. This data caters to quant clients interested in building machine learning models. Clients can leverage this API to perform sentiment analysis through natural language processing or machine learning. It can also be used to complement analysis using FactSet's transcripts service.</p> <p>Transcripts API provides conference call transcripts for companies' publicly held conference calls and a wealth of information regarding upcoming corporate events, such as conference call date and time, phone number and password, type of conference call, and important company investor relations contact information.</p> 
 *
 * The version of the OpenAPI document: 2.0.0
 * Contact: api@factset.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 *
 */

import ApiClient from './ApiClient';
import AudioByDateRequest from './model/AudioByDateRequest';
import AudioByFileNameRequest from './model/AudioByFileNameRequest';
import AudioByIdsRequest from './model/AudioByIdsRequest';
import AudioByUploadTimeRequest from './model/AudioByUploadTimeRequest';
import AudioRequest from './model/AudioRequest';
import AudioRequestData from './model/AudioRequestData';
import AudioRequestMeta from './model/AudioRequestMeta';
import AudioRequestMetaPagination from './model/AudioRequestMetaPagination';
import AudioResponse from './model/AudioResponse';
import Body from './model/Body';
import BodyNrt from './model/BodyNrt';
import CategoriesResponse from './model/CategoriesResponse';
import CategoriesResponseData from './model/CategoriesResponseData';
import CompanyEventRequest from './model/CompanyEventRequest';
import CompanyEventRequestData from './model/CompanyEventRequestData';
import CompanyEventRequestDataDateTime from './model/CompanyEventRequestDataDateTime';
import CompanyEventRequestDataUniverse from './model/CompanyEventRequestDataUniverse';
import CompanyEventResponse from './model/CompanyEventResponse';
import CompanyEventResponseData from './model/CompanyEventResponseData';
import Document from './model/Document';
import DocumentOne from './model/DocumentOne';
import DocumentResult from './model/DocumentResult';
import Error from './model/Error';
import ErrorObject from './model/ErrorObject';
import EventsAudioDailyResponseData from './model/EventsAudioDailyResponseData';
import EventsAudioHistoryResponse from './model/EventsAudioHistoryResponse';
import EventsAudioHistoryResponseData from './model/EventsAudioHistoryResponseData';
import IndexedNrtResponse from './model/IndexedNrtResponse';
import IndexedNrtResponseData from './model/IndexedNrtResponseData';
import InvalidIdErrorData from './model/InvalidIdErrorData';
import InvestorSlidesResponse from './model/InvestorSlidesResponse';
import InvestorSlidesResponseData from './model/InvestorSlidesResponseData';
import Meta from './model/Meta';
import MetaData from './model/MetaData';
import MetaDataPagination from './model/MetaDataPagination';
import MetaNrt from './model/MetaNrt';
import NRT from './model/NRT';
import NrtCallsRequest from './model/NrtCallsRequest';
import NrtCallsRequestByIds from './model/NrtCallsRequestByIds';
import NrtCallsRequestByTicker from './model/NrtCallsRequestByTicker';
import NrtCallsRequestData from './model/NrtCallsRequestData';
import NrtCallsRequestMeta from './model/NrtCallsRequestMeta';
import NrtCallsResponse from './model/NrtCallsResponse';
import NrtCallsResponseData from './model/NrtCallsResponseData';
import NrtSpeakerIdsResponse from './model/NrtSpeakerIdsResponse';
import NrtSpeakerIdsResponseData from './model/NrtSpeakerIdsResponseData';
import Participant from './model/Participant';
import ParticipantNrt from './model/ParticipantNrt';
import Plist from './model/Plist';
import RawOrCorrected from './model/RawOrCorrected';
import ResponseType from './model/ResponseType';
import ResponseTypeData from './model/ResponseTypeData';
import Section from './model/Section';
import SectionNrt from './model/SectionNrt';
import Speaker from './model/Speaker';
import SpeakerNrt from './model/SpeakerNrt';
import TimeZonesResponse from './model/TimeZonesResponse';
import TimeZonesResponseData from './model/TimeZonesResponseData';
import TranscriptsByDateRequest from './model/TranscriptsByDateRequest';
import TranscriptsByEventsRequest from './model/TranscriptsByEventsRequest';
import TranscriptsByIdsRequest from './model/TranscriptsByIdsRequest';
import TranscriptsByIdsResponse from './model/TranscriptsByIdsResponse';
import TranscriptsBySearchRequest from './model/TranscriptsBySearchRequest';
import TranscriptsByTimesRequest from './model/TranscriptsByTimesRequest';
import TranscriptsCollection from './model/TranscriptsCollection';
import TranscriptsIntelligenceResponse from './model/TranscriptsIntelligenceResponse';
import TranscriptsIntelligenceResponseData from './model/TranscriptsIntelligenceResponseData';
import TranscriptsRequest from './model/TranscriptsRequest';
import TranscriptsRequestData from './model/TranscriptsRequestData';
import TranscriptsRequestMeta from './model/TranscriptsRequestMeta';
import TranscriptsRequestMetaPagination from './model/TranscriptsRequestMetaPagination';
import TranscriptsResponse from './model/TranscriptsResponse';
import TranscriptsResponseData from './model/TranscriptsResponseData';

import CalendarEventsApi from './api/CalendarEventsApi';
import EventsAudioApi from './api/EventsAudioApi';
import MetaApi from './api/MetaApi';
import NearRealTimeTranscriptsApi from './api/NearRealTimeTranscriptsApi';
import TranscriptsApi from './api/TranscriptsApi';


/**
* Events and Transcripts client library for JavaScript.<br>
* The <code>index</code> module provides access to constructors for all the classes which comprise the public API.
* <p>
* An AMD (recommended!) or CommonJS application will generally do something equivalent to the following:
* <pre>
* var eventsandtranscripts = require('index'); // See note below*.
* var xxxSvc = new eventsandtranscripts.XxxApi(); // Allocate the API class we're going to use.
* var yyyModel = new eventsandtranscripts.Yyy(); // Construct a model instance.
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
* var xxxSvc = new eventsandtranscripts.XxxApi(); // Allocate the API class we're going to use.
* var yyy = new eventsandtranscripts.Yyy(); // Construct a model instance.
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
     * The AudioByDateRequest model constructor.
     * @property {module:model/AudioByDateRequest}
     */
    AudioByDateRequest,

    /**
     * The AudioByFileNameRequest model constructor.
     * @property {module:model/AudioByFileNameRequest}
     */
    AudioByFileNameRequest,

    /**
     * The AudioByIdsRequest model constructor.
     * @property {module:model/AudioByIdsRequest}
     */
    AudioByIdsRequest,

    /**
     * The AudioByUploadTimeRequest model constructor.
     * @property {module:model/AudioByUploadTimeRequest}
     */
    AudioByUploadTimeRequest,

    /**
     * The AudioRequest model constructor.
     * @property {module:model/AudioRequest}
     */
    AudioRequest,

    /**
     * The AudioRequestData model constructor.
     * @property {module:model/AudioRequestData}
     */
    AudioRequestData,

    /**
     * The AudioRequestMeta model constructor.
     * @property {module:model/AudioRequestMeta}
     */
    AudioRequestMeta,

    /**
     * The AudioRequestMetaPagination model constructor.
     * @property {module:model/AudioRequestMetaPagination}
     */
    AudioRequestMetaPagination,

    /**
     * The AudioResponse model constructor.
     * @property {module:model/AudioResponse}
     */
    AudioResponse,

    /**
     * The Body model constructor.
     * @property {module:model/Body}
     */
    Body,

    /**
     * The BodyNrt model constructor.
     * @property {module:model/BodyNrt}
     */
    BodyNrt,

    /**
     * The CategoriesResponse model constructor.
     * @property {module:model/CategoriesResponse}
     */
    CategoriesResponse,

    /**
     * The CategoriesResponseData model constructor.
     * @property {module:model/CategoriesResponseData}
     */
    CategoriesResponseData,

    /**
     * The CompanyEventRequest model constructor.
     * @property {module:model/CompanyEventRequest}
     */
    CompanyEventRequest,

    /**
     * The CompanyEventRequestData model constructor.
     * @property {module:model/CompanyEventRequestData}
     */
    CompanyEventRequestData,

    /**
     * The CompanyEventRequestDataDateTime model constructor.
     * @property {module:model/CompanyEventRequestDataDateTime}
     */
    CompanyEventRequestDataDateTime,

    /**
     * The CompanyEventRequestDataUniverse model constructor.
     * @property {module:model/CompanyEventRequestDataUniverse}
     */
    CompanyEventRequestDataUniverse,

    /**
     * The CompanyEventResponse model constructor.
     * @property {module:model/CompanyEventResponse}
     */
    CompanyEventResponse,

    /**
     * The CompanyEventResponseData model constructor.
     * @property {module:model/CompanyEventResponseData}
     */
    CompanyEventResponseData,

    /**
     * The Document model constructor.
     * @property {module:model/Document}
     */
    Document,

    /**
     * The DocumentOne model constructor.
     * @property {module:model/DocumentOne}
     */
    DocumentOne,

    /**
     * The DocumentResult model constructor.
     * @property {module:model/DocumentResult}
     */
    DocumentResult,

    /**
     * The Error model constructor.
     * @property {module:model/Error}
     */
    Error,

    /**
     * The ErrorObject model constructor.
     * @property {module:model/ErrorObject}
     */
    ErrorObject,

    /**
     * The EventsAudioDailyResponseData model constructor.
     * @property {module:model/EventsAudioDailyResponseData}
     */
    EventsAudioDailyResponseData,

    /**
     * The EventsAudioHistoryResponse model constructor.
     * @property {module:model/EventsAudioHistoryResponse}
     */
    EventsAudioHistoryResponse,

    /**
     * The EventsAudioHistoryResponseData model constructor.
     * @property {module:model/EventsAudioHistoryResponseData}
     */
    EventsAudioHistoryResponseData,

    /**
     * The IndexedNrtResponse model constructor.
     * @property {module:model/IndexedNrtResponse}
     */
    IndexedNrtResponse,

    /**
     * The IndexedNrtResponseData model constructor.
     * @property {module:model/IndexedNrtResponseData}
     */
    IndexedNrtResponseData,

    /**
     * The InvalidIdErrorData model constructor.
     * @property {module:model/InvalidIdErrorData}
     */
    InvalidIdErrorData,

    /**
     * The InvestorSlidesResponse model constructor.
     * @property {module:model/InvestorSlidesResponse}
     */
    InvestorSlidesResponse,

    /**
     * The InvestorSlidesResponseData model constructor.
     * @property {module:model/InvestorSlidesResponseData}
     */
    InvestorSlidesResponseData,

    /**
     * The Meta model constructor.
     * @property {module:model/Meta}
     */
    Meta,

    /**
     * The MetaData model constructor.
     * @property {module:model/MetaData}
     */
    MetaData,

    /**
     * The MetaDataPagination model constructor.
     * @property {module:model/MetaDataPagination}
     */
    MetaDataPagination,

    /**
     * The MetaNrt model constructor.
     * @property {module:model/MetaNrt}
     */
    MetaNrt,

    /**
     * The NRT model constructor.
     * @property {module:model/NRT}
     */
    NRT,

    /**
     * The NrtCallsRequest model constructor.
     * @property {module:model/NrtCallsRequest}
     */
    NrtCallsRequest,

    /**
     * The NrtCallsRequestByIds model constructor.
     * @property {module:model/NrtCallsRequestByIds}
     */
    NrtCallsRequestByIds,

    /**
     * The NrtCallsRequestByTicker model constructor.
     * @property {module:model/NrtCallsRequestByTicker}
     */
    NrtCallsRequestByTicker,

    /**
     * The NrtCallsRequestData model constructor.
     * @property {module:model/NrtCallsRequestData}
     */
    NrtCallsRequestData,

    /**
     * The NrtCallsRequestMeta model constructor.
     * @property {module:model/NrtCallsRequestMeta}
     */
    NrtCallsRequestMeta,

    /**
     * The NrtCallsResponse model constructor.
     * @property {module:model/NrtCallsResponse}
     */
    NrtCallsResponse,

    /**
     * The NrtCallsResponseData model constructor.
     * @property {module:model/NrtCallsResponseData}
     */
    NrtCallsResponseData,

    /**
     * The NrtSpeakerIdsResponse model constructor.
     * @property {module:model/NrtSpeakerIdsResponse}
     */
    NrtSpeakerIdsResponse,

    /**
     * The NrtSpeakerIdsResponseData model constructor.
     * @property {module:model/NrtSpeakerIdsResponseData}
     */
    NrtSpeakerIdsResponseData,

    /**
     * The Participant model constructor.
     * @property {module:model/Participant}
     */
    Participant,

    /**
     * The ParticipantNrt model constructor.
     * @property {module:model/ParticipantNrt}
     */
    ParticipantNrt,

    /**
     * The Plist model constructor.
     * @property {module:model/Plist}
     */
    Plist,

    /**
     * The RawOrCorrected model constructor.
     * @property {module:model/RawOrCorrected}
     */
    RawOrCorrected,

    /**
     * The ResponseType model constructor.
     * @property {module:model/ResponseType}
     */
    ResponseType,

    /**
     * The ResponseTypeData model constructor.
     * @property {module:model/ResponseTypeData}
     */
    ResponseTypeData,

    /**
     * The Section model constructor.
     * @property {module:model/Section}
     */
    Section,

    /**
     * The SectionNrt model constructor.
     * @property {module:model/SectionNrt}
     */
    SectionNrt,

    /**
     * The Speaker model constructor.
     * @property {module:model/Speaker}
     */
    Speaker,

    /**
     * The SpeakerNrt model constructor.
     * @property {module:model/SpeakerNrt}
     */
    SpeakerNrt,

    /**
     * The TimeZonesResponse model constructor.
     * @property {module:model/TimeZonesResponse}
     */
    TimeZonesResponse,

    /**
     * The TimeZonesResponseData model constructor.
     * @property {module:model/TimeZonesResponseData}
     */
    TimeZonesResponseData,

    /**
     * The TranscriptsByDateRequest model constructor.
     * @property {module:model/TranscriptsByDateRequest}
     */
    TranscriptsByDateRequest,

    /**
     * The TranscriptsByEventsRequest model constructor.
     * @property {module:model/TranscriptsByEventsRequest}
     */
    TranscriptsByEventsRequest,

    /**
     * The TranscriptsByIdsRequest model constructor.
     * @property {module:model/TranscriptsByIdsRequest}
     */
    TranscriptsByIdsRequest,

    /**
     * The TranscriptsByIdsResponse model constructor.
     * @property {module:model/TranscriptsByIdsResponse}
     */
    TranscriptsByIdsResponse,

    /**
     * The TranscriptsBySearchRequest model constructor.
     * @property {module:model/TranscriptsBySearchRequest}
     */
    TranscriptsBySearchRequest,

    /**
     * The TranscriptsByTimesRequest model constructor.
     * @property {module:model/TranscriptsByTimesRequest}
     */
    TranscriptsByTimesRequest,

    /**
     * The TranscriptsCollection model constructor.
     * @property {module:model/TranscriptsCollection}
     */
    TranscriptsCollection,

    /**
     * The TranscriptsIntelligenceResponse model constructor.
     * @property {module:model/TranscriptsIntelligenceResponse}
     */
    TranscriptsIntelligenceResponse,

    /**
     * The TranscriptsIntelligenceResponseData model constructor.
     * @property {module:model/TranscriptsIntelligenceResponseData}
     */
    TranscriptsIntelligenceResponseData,

    /**
     * The TranscriptsRequest model constructor.
     * @property {module:model/TranscriptsRequest}
     */
    TranscriptsRequest,

    /**
     * The TranscriptsRequestData model constructor.
     * @property {module:model/TranscriptsRequestData}
     */
    TranscriptsRequestData,

    /**
     * The TranscriptsRequestMeta model constructor.
     * @property {module:model/TranscriptsRequestMeta}
     */
    TranscriptsRequestMeta,

    /**
     * The TranscriptsRequestMetaPagination model constructor.
     * @property {module:model/TranscriptsRequestMetaPagination}
     */
    TranscriptsRequestMetaPagination,

    /**
     * The TranscriptsResponse model constructor.
     * @property {module:model/TranscriptsResponse}
     */
    TranscriptsResponse,

    /**
     * The TranscriptsResponseData model constructor.
     * @property {module:model/TranscriptsResponseData}
     */
    TranscriptsResponseData,

    /**
    * The CalendarEventsApi service constructor.
    * @property {module:api/CalendarEventsApi}
    */
    CalendarEventsApi,

    /**
    * The EventsAudioApi service constructor.
    * @property {module:api/EventsAudioApi}
    */
    EventsAudioApi,

    /**
    * The MetaApi service constructor.
    * @property {module:api/MetaApi}
    */
    MetaApi,

    /**
    * The NearRealTimeTranscriptsApi service constructor.
    * @property {module:api/NearRealTimeTranscriptsApi}
    */
    NearRealTimeTranscriptsApi,

    /**
    * The TranscriptsApi service constructor.
    * @property {module:api/TranscriptsApi}
    */
    TranscriptsApi,

};
