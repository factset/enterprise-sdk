/**
 * Conversational API Powered by FactSet Mercury
 * ### OVERVIEW  The FactSet Conversational API allows clients to white-label core FactSet Mercury capabilities in a client’s chatbot experience.  Request data from FactSet using natural language queries. Start the response generation using the `/query` endpoint, poll the status using `/status`. Once the result is ready, retrieve it using `/result`.  If your response contains a file ID, such as for an Excel chart or a FactSet ActiveGraph, retrieve it using the file ID at the `/download/file` endpoint.  We also encourage you to provide feedback on your responses using the `/feedback` endpoint!  **Please note:** \"Natural language\" in this documentation refers to modern conversational English. Support for other languages is currently unavailable.  **Try the Conversational API and view Available Content**  In the [Using the Conversational API Online Assistant](https://my.apps.factset.com/oa/pages/23209) you can find instructions on how to start using the Conversational API, and the full list of content available.  Some of the prompts supported are:  - What is Tesla's enterprise value? - Create a chart showing CME price relative to the S&P 500 - What were the highlights from Palantir's recent earnings call?  **Adaptive Card Format**  The Conversational API uses the Microsoft Adaptive Card format for response data surfaced from FactSet content sets. `Value` property of parent FederationData contains a JSON serialized presentation of a Microsoft Adaptive Card. See [Microsoft docs](https://learn.microsoft.com/en-us/adaptive-cards/) for Adaptive Card documentation, and the [Adaptive Card schema explorer](https://adaptivecards.io/explorer/) for schema details. **Please note**: \"The adaptive card may contain actions, which represent functionality within the card itself. In order to execute these actions, a handler must be implemented in your Adaptive Card rendering process. See [handling actions](https://learn.microsoft.com/en-us/adaptive-cards/sdk/rendering-cards/javascript/actions) for an example implementation.  **STACH Format**  The Conversational API may use Factset's STACH V3 format to represent tabular data in JSON. Please refer to the [STACH V3 documentation](https://factset.github.io/stachschema/#/v3/README) on column organized data for more information on how to process STACH-organized data. <details>   <summary><u>**STACH Example**</u></summary>   ```json   {     \"version\": \"3.1\",     \"table\": {       \"primaryKeys\": [         \"Insider Holders\",         \"MV (M,$)\",         \"% O/S\"       ],       \"totalNumRows\": 5     },     \"views\": [       {         \"name\": \"view\",         \"displayName\": \"who are the suppliers of nike\",         \"table\": {           \"columns\": [             \"Insider Holders\",             \"MV (M,$)\",             \"% O/S\"           ],           \"headers\": {             \"Insider Holders\": \"Insider Holders\",             \"MV (M,$)\": \"MV (M,$)\",             \"% O/S\": \"% O/S\"           }         }       }     ],     \"columns\": [       {         \"name\": \"Insider Holders\",         \"contextualType\": \"string\",         \"customMetadata\": {           \"relevancy\": {             \"contextualType\": \"int32\",             \"value\": 100           }         }       },       {         \"name\": \"MV (M,$)\",         \"contextualType\": \"real\",         \"customMetadata\": {           \"relevancy\": {             \"contextualType\": \"int32\",             \"value\": 67           }         }       },       {         \"name\": \"% O/S\",         \"contextualType\": \"real\",         \"customMetadata\": {           \"relevancy\": {             \"contextualType\": \"int32\",             \"value\": 34           }         }       }     ],     \"rows\": [       {         \"Insider Holders\": \"Knight Philip Hampson\",         \"MV (M,$)\": 3156.8,         \"% O/S\": 1.531       },       {         \"Insider Holders\": \"Knight Travis A\",         \"MV (M,$)\": 601.6,         \"% O/S\": 0.496       },       {         \"Insider Holders\": \"Wellcome Trust Ltd. (Direct Investments)\",         \"MV (M,$)\": 225.5,         \"% O/S\": 0.105       },       {         \"Insider Holders\": \"Parker Mark G\",         \"MV (M,$)\": 100.1,         \"% O/S\": 0.056       },       {         \"Insider Holders\": \"Donahoe John J Ii\",         \"MV (M,$)\": 19.8,         \"% O/S\": 0.018       }     ]   }   ``` </details>  **Citations**  Responses from the Conversational API may contain `citations` which provide references to the source of the data directly within the textual response. Phrases within the response text are mapped to a data item in the `citations` object via a bracketed ID (e.g. `[1]`). Citations may be used to provide additional context or to verify the source of the data; in some cases, a single phrase within the response may be supported by multiple data sources. **Please note**: Links to the source data are provided as links to FactSet's Document Viewer (see [Document Viewer OA page](https://my.apps.factset.com/oa/pages/17390)). The link will direct you to the entire document; you may need to search for the specific phrase within the document. We are currently working on providing direct links to the specific section or excerpt of the document. <details>   <summary><u>**Citation Example**</u></summary>   ```json   {     \"type\": \"string\",     \"value\": \"FactSet has expressed optimism about the potential of generative AI (GenAI) to enhance their product offerings and drive efficiency[1].\"     \"citations\": {       \"[1]\": [         \"phraseId\": \"aba1d533-08b3-4d3e-8961-5d37bb2caff6\",         \"content\": \"At the same time, expectations are high around the effect generative AI will have on our industry.\",         \"speakerInfo\": {           \"companyId\": \"0016YD-E\",           \"companyName\": \"FactSet Research Systems, Inc.\",           \"speakerId\": \"0DPHLH-E\",           \"speakerName\": \"Philip Snow\",           \"speakerTitle\": \"Chief Executive Officer & Director\"         },         \"sourceURL\": \"https://my.apps.factset.com/viewer-fusion/?_doc_id=2948302-t&_doc_date=20231219&_doc_product=FCST&_doc_docfn=/home/docs/fcst/8/302/2948302-t.pdf&e=false\"       ]     }   }   ``` </details> 
 *
 * The version of the OpenAPI document: 0.6.0
 * Contact: api@factset.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 *
 */

import ApiClient from './ApiClient';
import AdaptiveCard from './model/AdaptiveCard';
import AdaptiveCardBodyElement from './model/AdaptiveCardBodyElement';
import AdaptiveCardData from './model/AdaptiveCardData';
import ChatPollingRequest from './model/ChatPollingRequest';
import ChatPollingRequestData from './model/ChatPollingRequestData';
import Download from './model/Download';
import Error from './model/Error';
import ErrorObject from './model/ErrorObject';
import FederationData from './model/FederationData';
import FeedbackRequest from './model/FeedbackRequest';
import FeedbackRequestData from './model/FeedbackRequestData';
import FileDownloadRequest from './model/FileDownloadRequest';
import FileDownloadRequestData from './model/FileDownloadRequestData';
import NextStep from './model/NextStep';
import NextStepItem from './model/NextStepItem';
import OpenUrl from './model/OpenUrl';
import OpenUrlUrl from './model/OpenUrlUrl';
import Phrase from './model/Phrase';
import PromptItem from './model/PromptItem';
import PromptParameter from './model/PromptParameter';
import PromptParameters from './model/PromptParameters';
import QueryChatRequest from './model/QueryChatRequest';
import QueryChatRequestData from './model/QueryChatRequestData';
import QueryChatResponse from './model/QueryChatResponse';
import QueryChatResponseData from './model/QueryChatResponseData';
import QueryResponse from './model/QueryResponse';
import QueryResponseData from './model/QueryResponseData';
import RateLimitExceededError from './model/RateLimitExceededError';
import ResponseString from './model/ResponseString';
import SpeakerInfo from './model/SpeakerInfo';
import StatusPollResponse from './model/StatusPollResponse';
import StatusPollResponseData from './model/StatusPollResponseData';
import SuggestedPrompts from './model/SuggestedPrompts';
import Table from './model/Table';
import TableData from './model/TableData';

import DownloadApi from './api/DownloadApi';
import FeedbackApi from './api/FeedbackApi';
import MultipleQuestionChatApi from './api/MultipleQuestionChatApi';


/**
* Conversational API Powered by FactSet Mercury client library for JavaScript.<br>
* The <code>index</code> module provides access to constructors for all the classes which comprise the public API.
* <p>
* An AMD (recommended!) or CommonJS application will generally do something equivalent to the following:
* <pre>
* var conversationalapipoweredbyfactsetmercury = require('index'); // See note below*.
* var xxxSvc = new conversationalapipoweredbyfactsetmercury.XxxApi(); // Allocate the API class we're going to use.
* var yyyModel = new conversationalapipoweredbyfactsetmercury.Yyy(); // Construct a model instance.
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
* var xxxSvc = new conversationalapipoweredbyfactsetmercury.XxxApi(); // Allocate the API class we're going to use.
* var yyy = new conversationalapipoweredbyfactsetmercury.Yyy(); // Construct a model instance.
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
     * The AdaptiveCard model constructor.
     * @property {module:model/AdaptiveCard}
     */
    AdaptiveCard,

    /**
     * The AdaptiveCardBodyElement model constructor.
     * @property {module:model/AdaptiveCardBodyElement}
     */
    AdaptiveCardBodyElement,

    /**
     * The AdaptiveCardData model constructor.
     * @property {module:model/AdaptiveCardData}
     */
    AdaptiveCardData,

    /**
     * The ChatPollingRequest model constructor.
     * @property {module:model/ChatPollingRequest}
     */
    ChatPollingRequest,

    /**
     * The ChatPollingRequestData model constructor.
     * @property {module:model/ChatPollingRequestData}
     */
    ChatPollingRequestData,

    /**
     * The Download model constructor.
     * @property {module:model/Download}
     */
    Download,

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
     * The FederationData model constructor.
     * @property {module:model/FederationData}
     */
    FederationData,

    /**
     * The FeedbackRequest model constructor.
     * @property {module:model/FeedbackRequest}
     */
    FeedbackRequest,

    /**
     * The FeedbackRequestData model constructor.
     * @property {module:model/FeedbackRequestData}
     */
    FeedbackRequestData,

    /**
     * The FileDownloadRequest model constructor.
     * @property {module:model/FileDownloadRequest}
     */
    FileDownloadRequest,

    /**
     * The FileDownloadRequestData model constructor.
     * @property {module:model/FileDownloadRequestData}
     */
    FileDownloadRequestData,

    /**
     * The NextStep model constructor.
     * @property {module:model/NextStep}
     */
    NextStep,

    /**
     * The NextStepItem model constructor.
     * @property {module:model/NextStepItem}
     */
    NextStepItem,

    /**
     * The OpenUrl model constructor.
     * @property {module:model/OpenUrl}
     */
    OpenUrl,

    /**
     * The OpenUrlUrl model constructor.
     * @property {module:model/OpenUrlUrl}
     */
    OpenUrlUrl,

    /**
     * The Phrase model constructor.
     * @property {module:model/Phrase}
     */
    Phrase,

    /**
     * The PromptItem model constructor.
     * @property {module:model/PromptItem}
     */
    PromptItem,

    /**
     * The PromptParameter model constructor.
     * @property {module:model/PromptParameter}
     */
    PromptParameter,

    /**
     * The PromptParameters model constructor.
     * @property {module:model/PromptParameters}
     */
    PromptParameters,

    /**
     * The QueryChatRequest model constructor.
     * @property {module:model/QueryChatRequest}
     */
    QueryChatRequest,

    /**
     * The QueryChatRequestData model constructor.
     * @property {module:model/QueryChatRequestData}
     */
    QueryChatRequestData,

    /**
     * The QueryChatResponse model constructor.
     * @property {module:model/QueryChatResponse}
     */
    QueryChatResponse,

    /**
     * The QueryChatResponseData model constructor.
     * @property {module:model/QueryChatResponseData}
     */
    QueryChatResponseData,

    /**
     * The QueryResponse model constructor.
     * @property {module:model/QueryResponse}
     */
    QueryResponse,

    /**
     * The QueryResponseData model constructor.
     * @property {module:model/QueryResponseData}
     */
    QueryResponseData,

    /**
     * The RateLimitExceededError model constructor.
     * @property {module:model/RateLimitExceededError}
     */
    RateLimitExceededError,

    /**
     * The ResponseString model constructor.
     * @property {module:model/ResponseString}
     */
    ResponseString,

    /**
     * The SpeakerInfo model constructor.
     * @property {module:model/SpeakerInfo}
     */
    SpeakerInfo,

    /**
     * The StatusPollResponse model constructor.
     * @property {module:model/StatusPollResponse}
     */
    StatusPollResponse,

    /**
     * The StatusPollResponseData model constructor.
     * @property {module:model/StatusPollResponseData}
     */
    StatusPollResponseData,

    /**
     * The SuggestedPrompts model constructor.
     * @property {module:model/SuggestedPrompts}
     */
    SuggestedPrompts,

    /**
     * The Table model constructor.
     * @property {module:model/Table}
     */
    Table,

    /**
     * The TableData model constructor.
     * @property {module:model/TableData}
     */
    TableData,

    /**
    * The DownloadApi service constructor.
    * @property {module:api/DownloadApi}
    */
    DownloadApi,

    /**
    * The FeedbackApi service constructor.
    * @property {module:api/FeedbackApi}
    */
    FeedbackApi,

    /**
    * The MultipleQuestionChatApi service constructor.
    * @property {module:api/MultipleQuestionChatApi}
    */
    MultipleQuestionChatApi,

};
