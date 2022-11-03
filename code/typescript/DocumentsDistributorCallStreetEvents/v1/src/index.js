/**
 * Documents Distributor - CallStreet Events
 * CallStreet Events contains all the Documents Distributor APIs that offer events data such as Events Audio and Near Real-Time Transcripts.  The  Events Audio API provides access to historical as well as latest audio recordings of various company events covered by FactSet. The events include, but are not limited to: earnings calls, conferences, and investor days.   This API also provides relevant metadata such as timestamps and identifiers around each audio file.  The Documents Distributor - Near Real-time Transcripts API enables access to Near Real-time Transcripts provided by CallStreet to time-sensitive clients. This API also provides the relevant speaker metadata along with their confidence scores. This data caters to quant clients interested in building machine learning models.  Clients can leverage this API to perform sentiment analysis through natural language processing or machine learning. It can also be used to complement analysis using FactSet's transcripts service. 
 *
 * The version of the OpenAPI document: 1.7.0
 * Contact: api@factset.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 *
 */

import ApiClient from './ApiClient';
import Error from './model/Error';
import EventsAudio from './model/EventsAudio';
import EventsAudio400Response from './model/EventsAudio400Response';
import EventsAudio400ResponseDetails from './model/EventsAudio400ResponseDetails';
import EventsAudio400ResponseDetailsValidParameters from './model/EventsAudio400ResponseDetailsValidParameters';
import EventsAudioData from './model/EventsAudioData';
import EventsAudioHistory from './model/EventsAudioHistory';
import EventsAudioHistory400Response from './model/EventsAudioHistory400Response';
import EventsAudioHistory400ResponseDetails from './model/EventsAudioHistory400ResponseDetails';
import EventsAudioHistory400ResponseDetailsValidParameters from './model/EventsAudioHistory400ResponseDetailsValidParameters';
import EventsAudioHistoryData from './model/EventsAudioHistoryData';
import EventsAudioHistoryMeta from './model/EventsAudioHistoryMeta';
import EventsAudioMeta from './model/EventsAudioMeta';
import EventsAudioMetaPagination from './model/EventsAudioMetaPagination';
import IndexedNRT from './model/IndexedNRT';
import IndexedNRTMeta from './model/IndexedNRTMeta';
import IndexedNRTMetaPagination from './model/IndexedNRTMetaPagination';
import NRT403Error from './model/NRT403Error';
import NRTCalls from './model/NRTCalls';
import NRTCalls400Response from './model/NRTCalls400Response';
import NRTCalls400ResponseDetails from './model/NRTCalls400ResponseDetails';
import NRTCalls400ResponseDetailsValidParameters from './model/NRTCalls400ResponseDetailsValidParameters';
import NRTCallsData from './model/NRTCallsData';
import NRTCallsMeta from './model/NRTCallsMeta';
import NRTSnippets from './model/NRTSnippets';
import NRTSnippets400Response from './model/NRTSnippets400Response';
import NRTSnippets400ResponseDetails from './model/NRTSnippets400ResponseDetails';
import NRTSnippets400ResponseDetailsValidParameters from './model/NRTSnippets400ResponseDetailsValidParameters';
import NRTSnippetsData from './model/NRTSnippetsData';
import NRTSnippetsMeta from './model/NRTSnippetsMeta';
import NRTSnippetsMetaPagination from './model/NRTSnippetsMetaPagination';
import NRTSnippetsMetaPartial from './model/NRTSnippetsMetaPartial';
import NRTSnippetsSnippetData from './model/NRTSnippetsSnippetData';
import NRTSnippetsTranscriptData from './model/NRTSnippetsTranscriptData';
import NRTSpeakerids from './model/NRTSpeakerids';
import NRTSpeakerids400Response from './model/NRTSpeakerids400Response';
import NRTSpeakerids400ResponseDetails from './model/NRTSpeakerids400ResponseDetails';
import NRTSpeakerids400ResponseDetailsValidParameters from './model/NRTSpeakerids400ResponseDetailsValidParameters';
import NRTSpeakeridsData from './model/NRTSpeakeridsData';
import NRTSpeakeridsMeta from './model/NRTSpeakeridsMeta';
import NRTSpeakeridsMetaPagination from './model/NRTSpeakeridsMetaPagination';

import EventsAudioApi from './api/EventsAudioApi';
import NearRealTimeTranscriptsApi from './api/NearRealTimeTranscriptsApi';


/**
* Documents Distributor - CallStreet Events client library for JavaScript.<br>
* The <code>index</code> module provides access to constructors for all the classes which comprise the public API.
* <p>
* An AMD (recommended!) or CommonJS application will generally do something equivalent to the following:
* <pre>
* var documentsdistributorcallstreetevents = require('index'); // See note below*.
* var xxxSvc = new documentsdistributorcallstreetevents.XxxApi(); // Allocate the API class we're going to use.
* var yyyModel = new documentsdistributorcallstreetevents.Yyy(); // Construct a model instance.
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
* var xxxSvc = new documentsdistributorcallstreetevents.XxxApi(); // Allocate the API class we're going to use.
* var yyy = new documentsdistributorcallstreetevents.Yyy(); // Construct a model instance.
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
     * The Error model constructor.
     * @property {module:model/Error}
     */
    Error,

    /**
     * The EventsAudio model constructor.
     * @property {module:model/EventsAudio}
     */
    EventsAudio,

    /**
     * The EventsAudio400Response model constructor.
     * @property {module:model/EventsAudio400Response}
     */
    EventsAudio400Response,

    /**
     * The EventsAudio400ResponseDetails model constructor.
     * @property {module:model/EventsAudio400ResponseDetails}
     */
    EventsAudio400ResponseDetails,

    /**
     * The EventsAudio400ResponseDetailsValidParameters model constructor.
     * @property {module:model/EventsAudio400ResponseDetailsValidParameters}
     */
    EventsAudio400ResponseDetailsValidParameters,

    /**
     * The EventsAudioData model constructor.
     * @property {module:model/EventsAudioData}
     */
    EventsAudioData,

    /**
     * The EventsAudioHistory model constructor.
     * @property {module:model/EventsAudioHistory}
     */
    EventsAudioHistory,

    /**
     * The EventsAudioHistory400Response model constructor.
     * @property {module:model/EventsAudioHistory400Response}
     */
    EventsAudioHistory400Response,

    /**
     * The EventsAudioHistory400ResponseDetails model constructor.
     * @property {module:model/EventsAudioHistory400ResponseDetails}
     */
    EventsAudioHistory400ResponseDetails,

    /**
     * The EventsAudioHistory400ResponseDetailsValidParameters model constructor.
     * @property {module:model/EventsAudioHistory400ResponseDetailsValidParameters}
     */
    EventsAudioHistory400ResponseDetailsValidParameters,

    /**
     * The EventsAudioHistoryData model constructor.
     * @property {module:model/EventsAudioHistoryData}
     */
    EventsAudioHistoryData,

    /**
     * The EventsAudioHistoryMeta model constructor.
     * @property {module:model/EventsAudioHistoryMeta}
     */
    EventsAudioHistoryMeta,

    /**
     * The EventsAudioMeta model constructor.
     * @property {module:model/EventsAudioMeta}
     */
    EventsAudioMeta,

    /**
     * The EventsAudioMetaPagination model constructor.
     * @property {module:model/EventsAudioMetaPagination}
     */
    EventsAudioMetaPagination,

    /**
     * The IndexedNRT model constructor.
     * @property {module:model/IndexedNRT}
     */
    IndexedNRT,

    /**
     * The IndexedNRTMeta model constructor.
     * @property {module:model/IndexedNRTMeta}
     */
    IndexedNRTMeta,

    /**
     * The IndexedNRTMetaPagination model constructor.
     * @property {module:model/IndexedNRTMetaPagination}
     */
    IndexedNRTMetaPagination,

    /**
     * The NRT403Error model constructor.
     * @property {module:model/NRT403Error}
     */
    NRT403Error,

    /**
     * The NRTCalls model constructor.
     * @property {module:model/NRTCalls}
     */
    NRTCalls,

    /**
     * The NRTCalls400Response model constructor.
     * @property {module:model/NRTCalls400Response}
     */
    NRTCalls400Response,

    /**
     * The NRTCalls400ResponseDetails model constructor.
     * @property {module:model/NRTCalls400ResponseDetails}
     */
    NRTCalls400ResponseDetails,

    /**
     * The NRTCalls400ResponseDetailsValidParameters model constructor.
     * @property {module:model/NRTCalls400ResponseDetailsValidParameters}
     */
    NRTCalls400ResponseDetailsValidParameters,

    /**
     * The NRTCallsData model constructor.
     * @property {module:model/NRTCallsData}
     */
    NRTCallsData,

    /**
     * The NRTCallsMeta model constructor.
     * @property {module:model/NRTCallsMeta}
     */
    NRTCallsMeta,

    /**
     * The NRTSnippets model constructor.
     * @property {module:model/NRTSnippets}
     */
    NRTSnippets,

    /**
     * The NRTSnippets400Response model constructor.
     * @property {module:model/NRTSnippets400Response}
     */
    NRTSnippets400Response,

    /**
     * The NRTSnippets400ResponseDetails model constructor.
     * @property {module:model/NRTSnippets400ResponseDetails}
     */
    NRTSnippets400ResponseDetails,

    /**
     * The NRTSnippets400ResponseDetailsValidParameters model constructor.
     * @property {module:model/NRTSnippets400ResponseDetailsValidParameters}
     */
    NRTSnippets400ResponseDetailsValidParameters,

    /**
     * The NRTSnippetsData model constructor.
     * @property {module:model/NRTSnippetsData}
     */
    NRTSnippetsData,

    /**
     * The NRTSnippetsMeta model constructor.
     * @property {module:model/NRTSnippetsMeta}
     */
    NRTSnippetsMeta,

    /**
     * The NRTSnippetsMetaPagination model constructor.
     * @property {module:model/NRTSnippetsMetaPagination}
     */
    NRTSnippetsMetaPagination,

    /**
     * The NRTSnippetsMetaPartial model constructor.
     * @property {module:model/NRTSnippetsMetaPartial}
     */
    NRTSnippetsMetaPartial,

    /**
     * The NRTSnippetsSnippetData model constructor.
     * @property {module:model/NRTSnippetsSnippetData}
     */
    NRTSnippetsSnippetData,

    /**
     * The NRTSnippetsTranscriptData model constructor.
     * @property {module:model/NRTSnippetsTranscriptData}
     */
    NRTSnippetsTranscriptData,

    /**
     * The NRTSpeakerids model constructor.
     * @property {module:model/NRTSpeakerids}
     */
    NRTSpeakerids,

    /**
     * The NRTSpeakerids400Response model constructor.
     * @property {module:model/NRTSpeakerids400Response}
     */
    NRTSpeakerids400Response,

    /**
     * The NRTSpeakerids400ResponseDetails model constructor.
     * @property {module:model/NRTSpeakerids400ResponseDetails}
     */
    NRTSpeakerids400ResponseDetails,

    /**
     * The NRTSpeakerids400ResponseDetailsValidParameters model constructor.
     * @property {module:model/NRTSpeakerids400ResponseDetailsValidParameters}
     */
    NRTSpeakerids400ResponseDetailsValidParameters,

    /**
     * The NRTSpeakeridsData model constructor.
     * @property {module:model/NRTSpeakeridsData}
     */
    NRTSpeakeridsData,

    /**
     * The NRTSpeakeridsMeta model constructor.
     * @property {module:model/NRTSpeakeridsMeta}
     */
    NRTSpeakeridsMeta,

    /**
     * The NRTSpeakeridsMetaPagination model constructor.
     * @property {module:model/NRTSpeakeridsMetaPagination}
     */
    NRTSpeakeridsMetaPagination,

    /**
    * The EventsAudioApi service constructor.
    * @property {module:api/EventsAudioApi}
    */
    EventsAudioApi,

    /**
    * The NearRealTimeTranscriptsApi service constructor.
    * @property {module:api/NearRealTimeTranscriptsApi}
    */
    NearRealTimeTranscriptsApi,

};
