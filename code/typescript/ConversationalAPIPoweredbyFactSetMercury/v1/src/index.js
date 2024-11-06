/**
 * Conversational API Powered by FactSet Mercury
 * ### OVERVIEW  The FactSet Conversational API allows clients to white-label core FactSet Mercury capabilities in a client's chatbot experience.  The Conversational API is powered by FactSet Mercury, FactSet's Generative Artificial Intelligence (GenAI) large language model. The Conversational API provides a variety of content and capabilities, including FactSet’s Federation layer (FactSet’s core GenAI-based technology), as well as more specific content and functionality tailored for financial services workflows.  The Conversational API provides answers to hundreds of natural language search queries and allows you to easily ask questions related to companies and markets research.  Some example supported prompts:  - Nintendo's highest closing stock price over the last 3 months - Has Yelp issued any guidance? - What are the key trends impacting costs for DaVita?  **For Information on Access to and Content Available via the Conversational API**  Please see the [Conversational API Online Assistant Page](https://my.apps.factset.com/oa/pages/23209). Here you can find instructions on how to set up access to the Conversational API, and the full list of content available.  **Conversational API Consumer Workflow**  The Conversational API is an asynchronous API that utilizes status polling to inform the consumer when a query response is complete. Please see the technical OpenAPI documentation below for specific information regarding consuming the API programmatically.  At a high level, the API consumer workflow is as follows:  1) Send a natural language query to the `/query` endpoint and start the response generation process. 2) Poll the status of the response generation process using the `/status` endpoint. 3) Once the status indicates a ready response, retrieve it using the `/result` endpoint.  - If your response contains a file ID, such as for an Excel chart or a [FactSet ActiveGraph](https://my.apps.factset.com/oa/pages/20355), retrieve it using the file ID at the `/download/file` endpoint. - To provide feedback on your response and help the Conversational API better serve you content, we encourage you to use the `/feedback` endpoint.   **FAQ and Limitations**  - \"Natural language\" in this documentation refers to modern conversational English. Support for other languages is currently unavailable. - The Conversational API is currently limited to accept 10 natural language queries per minute and 200 per hour for an individual consumer. If you anticipate your needs to be greater than these limits, please reach out to FatSet Support. 
 *
 * The version of the OpenAPI document: 1.0.2
 * Contact: api@factset.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 *
 */

import ApiClient from './ApiClient';
import AdaptiveCard from './model/AdaptiveCard';
import BadFeedbackRequestError from './model/BadFeedbackRequestError';
import BadFeedbackRequestErrorObject from './model/BadFeedbackRequestErrorObject';
import BadRequestError from './model/BadRequestError';
import BadRequestErrorObject from './model/BadRequestErrorObject';
import BadRequestErrorWithInvalidDataSchema from './model/BadRequestErrorWithInvalidDataSchema';
import BadRequestErrorWithInvalidDataSchemaObject from './model/BadRequestErrorWithInvalidDataSchemaObject';
import ChatPollingRequest from './model/ChatPollingRequest';
import ChatPollingRequestData from './model/ChatPollingRequestData';
import Download from './model/Download';
import FederationData from './model/FederationData';
import FeedbackRequest from './model/FeedbackRequest';
import FeedbackRequestData from './model/FeedbackRequestData';
import FileDownloadRequest from './model/FileDownloadRequest';
import FileDownloadRequestData from './model/FileDownloadRequestData';
import FileGenerationErrorObject from './model/FileGenerationErrorObject';
import ForbiddenError from './model/ForbiddenError';
import ForbiddenErrorObject from './model/ForbiddenErrorObject';
import InternalServerError from './model/InternalServerError';
import InternalServerErrorObject from './model/InternalServerErrorObject';
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
import ResourceNotFoundError from './model/ResourceNotFoundError';
import ResourceNotFoundErrorObject from './model/ResourceNotFoundErrorObject';
import ResponseText from './model/ResponseText';
import SpeakerInfo from './model/SpeakerInfo';
import StatusPollResponse from './model/StatusPollResponse';
import StatusPollResponseData from './model/StatusPollResponseData';
import SuggestedPrompts from './model/SuggestedPrompts';
import Table from './model/Table';

import ChatApi from './api/ChatApi';
import DownloadApi from './api/DownloadApi';
import FeedbackApi from './api/FeedbackApi';


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
     * The BadFeedbackRequestError model constructor.
     * @property {module:model/BadFeedbackRequestError}
     */
    BadFeedbackRequestError,

    /**
     * The BadFeedbackRequestErrorObject model constructor.
     * @property {module:model/BadFeedbackRequestErrorObject}
     */
    BadFeedbackRequestErrorObject,

    /**
     * The BadRequestError model constructor.
     * @property {module:model/BadRequestError}
     */
    BadRequestError,

    /**
     * The BadRequestErrorObject model constructor.
     * @property {module:model/BadRequestErrorObject}
     */
    BadRequestErrorObject,

    /**
     * The BadRequestErrorWithInvalidDataSchema model constructor.
     * @property {module:model/BadRequestErrorWithInvalidDataSchema}
     */
    BadRequestErrorWithInvalidDataSchema,

    /**
     * The BadRequestErrorWithInvalidDataSchemaObject model constructor.
     * @property {module:model/BadRequestErrorWithInvalidDataSchemaObject}
     */
    BadRequestErrorWithInvalidDataSchemaObject,

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
     * The FileGenerationErrorObject model constructor.
     * @property {module:model/FileGenerationErrorObject}
     */
    FileGenerationErrorObject,

    /**
     * The ForbiddenError model constructor.
     * @property {module:model/ForbiddenError}
     */
    ForbiddenError,

    /**
     * The ForbiddenErrorObject model constructor.
     * @property {module:model/ForbiddenErrorObject}
     */
    ForbiddenErrorObject,

    /**
     * The InternalServerError model constructor.
     * @property {module:model/InternalServerError}
     */
    InternalServerError,

    /**
     * The InternalServerErrorObject model constructor.
     * @property {module:model/InternalServerErrorObject}
     */
    InternalServerErrorObject,

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
     * The ResourceNotFoundError model constructor.
     * @property {module:model/ResourceNotFoundError}
     */
    ResourceNotFoundError,

    /**
     * The ResourceNotFoundErrorObject model constructor.
     * @property {module:model/ResourceNotFoundErrorObject}
     */
    ResourceNotFoundErrorObject,

    /**
     * The ResponseText model constructor.
     * @property {module:model/ResponseText}
     */
    ResponseText,

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
    * The ChatApi service constructor.
    * @property {module:api/ChatApi}
    */
    ChatApi,

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

};
