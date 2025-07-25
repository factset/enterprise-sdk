/**
 * Issue Tracker API
 * This API is used to file issues
 *
 * The version of the OpenAPI document: 1.4.0
 * Contact: api@factset.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 *
 */

import ApiClient from './ApiClient';
import Attachment from './model/Attachment';
import AttachmentResponse from './model/AttachmentResponse';
import Comment from './model/Comment';
import CommentRequest from './model/CommentRequest';
import CommentRequestData from './model/CommentRequestData';
import Error from './model/Error';
import ErrorResponse from './model/ErrorResponse';
import FileExtension from './model/FileExtension';
import IdResponse from './model/IdResponse';
import IdResponseData from './model/IdResponseData';
import Issue from './model/Issue';
import IssueData from './model/IssueData';
import IssueRequest from './model/IssueRequest';
import IssueRequestData from './model/IssueRequestData';
import UpdateIssueRequest from './model/UpdateIssueRequest';
import UpdateIssueRequestData from './model/UpdateIssueRequestData';

import AttachmentApi from './api/AttachmentApi';
import IssueApi from './api/IssueApi';


/**
* Issue Tracker client library for JavaScript.<br>
* The <code>index</code> module provides access to constructors for all the classes which comprise the public API.
* <p>
* An AMD (recommended!) or CommonJS application will generally do something equivalent to the following:
* <pre>
* var issuetracker = require('index'); // See note below*.
* var xxxSvc = new issuetracker.XxxApi(); // Allocate the API class we're going to use.
* var yyyModel = new issuetracker.Yyy(); // Construct a model instance.
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
* var xxxSvc = new issuetracker.XxxApi(); // Allocate the API class we're going to use.
* var yyy = new issuetracker.Yyy(); // Construct a model instance.
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
     * The Attachment model constructor.
     * @property {module:model/Attachment}
     */
    Attachment,

    /**
     * The AttachmentResponse model constructor.
     * @property {module:model/AttachmentResponse}
     */
    AttachmentResponse,

    /**
     * The Comment model constructor.
     * @property {module:model/Comment}
     */
    Comment,

    /**
     * The CommentRequest model constructor.
     * @property {module:model/CommentRequest}
     */
    CommentRequest,

    /**
     * The CommentRequestData model constructor.
     * @property {module:model/CommentRequestData}
     */
    CommentRequestData,

    /**
     * The Error model constructor.
     * @property {module:model/Error}
     */
    Error,

    /**
     * The ErrorResponse model constructor.
     * @property {module:model/ErrorResponse}
     */
    ErrorResponse,

    /**
     * The FileExtension model constructor.
     * @property {module:model/FileExtension}
     */
    FileExtension,

    /**
     * The IdResponse model constructor.
     * @property {module:model/IdResponse}
     */
    IdResponse,

    /**
     * The IdResponseData model constructor.
     * @property {module:model/IdResponseData}
     */
    IdResponseData,

    /**
     * The Issue model constructor.
     * @property {module:model/Issue}
     */
    Issue,

    /**
     * The IssueData model constructor.
     * @property {module:model/IssueData}
     */
    IssueData,

    /**
     * The IssueRequest model constructor.
     * @property {module:model/IssueRequest}
     */
    IssueRequest,

    /**
     * The IssueRequestData model constructor.
     * @property {module:model/IssueRequestData}
     */
    IssueRequestData,

    /**
     * The UpdateIssueRequest model constructor.
     * @property {module:model/UpdateIssueRequest}
     */
    UpdateIssueRequest,

    /**
     * The UpdateIssueRequestData model constructor.
     * @property {module:model/UpdateIssueRequestData}
     */
    UpdateIssueRequestData,

    /**
    * The AttachmentApi service constructor.
    * @property {module:api/AttachmentApi}
    */
    AttachmentApi,

    /**
    * The IssueApi service constructor.
    * @property {module:api/IssueApi}
    */
    IssueApi,

};
