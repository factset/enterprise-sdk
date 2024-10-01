/*
 * IRN API v1
 *
 * Allows users to extract, create, update and configure IRN data.
 *
 * The version of the OpenAPI document: 1.4.0
 * Contact: api@factset.com
 * Generated by: https://github.com/openapitools/openapi-generator.git
 */


using System;
using System.Collections.Generic;
using System.Collections.ObjectModel;
using System.Linq;
using System.Net;
using System.Net.Mime;
using FactSet.SDK.IRNMeetings.Client;
using FactSet.SDK.IRNMeetings.Model;
using FactSet.SDK.Utils.Authentication;

namespace FactSet.SDK.IRNMeetings.Api
{

    /// <summary>
    /// Represents a collection of functions to interact with the API endpoints
    /// </summary>
    public interface IEventsApiSync : IApiAccessor
    {
        #region Synchronous Operations
        /// <summary>
        /// Get all the record events that belong to a meeting
        /// </summary>
        /// <remarks>
        /// Get all the record events that belong to a meeting by providing the meeting id.
        /// </remarks>
        /// <exception cref="FactSet.SDK.IRNMeetings.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="meetingId">Meeting ID</param>
        /// <returns>List<RecordEventSummaryDto></returns>
        List<RecordEventSummaryDto> GetEvents(Guid meetingId);

        /// <summary>
        /// Get all the record events that belong to a meeting
        /// </summary>
        /// <remarks>
        /// Get all the record events that belong to a meeting by providing the meeting id.
        /// </remarks>
        /// <exception cref="FactSet.SDK.IRNMeetings.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="meetingId">Meeting ID</param>
        /// <returns>ApiResponse of List<RecordEventSummaryDto></returns>
        ApiResponse<List<RecordEventSummaryDto>> GetEventsWithHttpInfo(Guid meetingId);
        /// <summary>
        /// Get details of a record event of a meeting
        /// </summary>
        /// <remarks>
        /// Get details of record event of meeting by providing recordeventid and meetingid
        /// </remarks>
        /// <exception cref="FactSet.SDK.IRNMeetings.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="meetingId">Meeting Id</param>
        /// <param name="recordEventId">Record Event Id</param>
        /// <returns>MeetingEventDto</returns>
        MeetingEventDto GetRecordEvent(Guid meetingId, Guid recordEventId);

        /// <summary>
        /// Get details of a record event of a meeting
        /// </summary>
        /// <remarks>
        /// Get details of record event of meeting by providing recordeventid and meetingid
        /// </remarks>
        /// <exception cref="FactSet.SDK.IRNMeetings.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="meetingId">Meeting Id</param>
        /// <param name="recordEventId">Record Event Id</param>
        /// <returns>ApiResponse of MeetingEventDto</returns>
        ApiResponse<MeetingEventDto> GetRecordEventWithHttpInfo(Guid meetingId, Guid recordEventId);
        #endregion Synchronous Operations
    }

    /// <summary>
    /// Represents a collection of functions to interact with the API endpoints
    /// </summary>
    public interface IEventsApiAsync : IApiAccessor
    {
        #region Asynchronous Operations
        /// <summary>
        /// Get all the record events that belong to a meeting
        /// </summary>
        /// <remarks>
        /// Get all the record events that belong to a meeting by providing the meeting id.
        /// </remarks>
        /// <exception cref="FactSet.SDK.IRNMeetings.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="meetingId">Meeting ID</param>
        /// <param name="cancellationToken">Cancellation Token to cancel the request.</param>
        /// <returns>Task of List&lt;RecordEventSummaryDto&gt;</returns>
        System.Threading.Tasks.Task<List<RecordEventSummaryDto>> GetEventsAsync(Guid meetingId, System.Threading.CancellationToken cancellationToken = default(System.Threading.CancellationToken));

        /// <summary>
        /// Get all the record events that belong to a meeting
        /// </summary>
        /// <remarks>
        /// Get all the record events that belong to a meeting by providing the meeting id.
        /// </remarks>
        /// <exception cref="FactSet.SDK.IRNMeetings.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="meetingId">Meeting ID</param>
        /// <param name="cancellationToken">Cancellation Token to cancel the request.</param>
        /// <returns>Task of ApiResponse (List<RecordEventSummaryDto>)</returns>
        System.Threading.Tasks.Task<ApiResponse<List<RecordEventSummaryDto>>> GetEventsWithHttpInfoAsync(Guid meetingId, System.Threading.CancellationToken cancellationToken = default(System.Threading.CancellationToken));
        /// <summary>
        /// Get details of a record event of a meeting
        /// </summary>
        /// <remarks>
        /// Get details of record event of meeting by providing recordeventid and meetingid
        /// </remarks>
        /// <exception cref="FactSet.SDK.IRNMeetings.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="meetingId">Meeting Id</param>
        /// <param name="recordEventId">Record Event Id</param>
        /// <param name="cancellationToken">Cancellation Token to cancel the request.</param>
        /// <returns>Task of MeetingEventDto</returns>
        System.Threading.Tasks.Task<MeetingEventDto> GetRecordEventAsync(Guid meetingId, Guid recordEventId, System.Threading.CancellationToken cancellationToken = default(System.Threading.CancellationToken));

        /// <summary>
        /// Get details of a record event of a meeting
        /// </summary>
        /// <remarks>
        /// Get details of record event of meeting by providing recordeventid and meetingid
        /// </remarks>
        /// <exception cref="FactSet.SDK.IRNMeetings.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="meetingId">Meeting Id</param>
        /// <param name="recordEventId">Record Event Id</param>
        /// <param name="cancellationToken">Cancellation Token to cancel the request.</param>
        /// <returns>Task of ApiResponse (MeetingEventDto)</returns>
        System.Threading.Tasks.Task<ApiResponse<MeetingEventDto>> GetRecordEventWithHttpInfoAsync(Guid meetingId, Guid recordEventId, System.Threading.CancellationToken cancellationToken = default(System.Threading.CancellationToken));
        #endregion Asynchronous Operations
    }

    /// <summary>
    /// Represents a collection of functions to interact with the API endpoints
    /// </summary>
    public interface IEventsApi : IEventsApiSync, IEventsApiAsync
    {

    }

    /// <summary>
    /// Represents a collection of functions to interact with the API endpoints
    /// </summary>
    public partial class EventsApi : IEventsApi
    {
        private FactSet.SDK.IRNMeetings.Client.ExceptionFactory _exceptionFactory = (name, response) => null;

        # region Response Type Disctionaries
        
        private static readonly Dictionary<HttpStatusCode, System.Type> GetEventsResponseTypeDictionary = new Dictionary<HttpStatusCode, System.Type>
        {
            { (HttpStatusCode)200, typeof(List<RecordEventSummaryDto>) },
            { (HttpStatusCode)404, typeof(ProblemDetails) },
            { (HttpStatusCode)0, typeof(ProblemDetails) },
        };

        private static readonly Dictionary<HttpStatusCode, System.Type> GetRecordEventResponseTypeDictionary = new Dictionary<HttpStatusCode, System.Type>
        {
            { (HttpStatusCode)200, typeof(MeetingEventDto) },
            { (HttpStatusCode)403, typeof(ProblemDetails) },
            { (HttpStatusCode)404, typeof(ProblemDetails) },
        };

        # endregion Response Type Disctionaries

        # region Api Response Objects
        

        # endregion Api Response Objects

        /// <summary>
        /// Initializes a new instance of the <see cref="EventsApi"/> class.
        /// </summary>
        /// <returns></returns>
        public EventsApi() : this((string)null)
        {
        }

        /// <summary>
        /// Initializes a new instance of the <see cref="EventsApi"/> class.
        /// </summary>
        /// <returns></returns>
        public EventsApi(string basePath)
        {
            this.Configuration = FactSet.SDK.IRNMeetings.Client.Configuration.MergeConfigurations(
                FactSet.SDK.IRNMeetings.Client.GlobalConfiguration.Instance,
                new FactSet.SDK.IRNMeetings.Client.Configuration { BasePath = basePath }
            );
            this.Client = new FactSet.SDK.IRNMeetings.Client.ApiClient(this.Configuration.BasePath);
            this.AsynchronousClient = new FactSet.SDK.IRNMeetings.Client.ApiClient(this.Configuration.BasePath);
            this.ExceptionFactory = FactSet.SDK.IRNMeetings.Client.Configuration.DefaultExceptionFactory;
        }

        /// <summary>
        /// Initializes a new instance of the <see cref="EventsApi"/> class
        /// using Configuration object
        /// </summary>
        /// <param name="configuration">An instance of Configuration</param>
        /// <returns></returns>
        public EventsApi(FactSet.SDK.IRNMeetings.Client.Configuration configuration)
        {
            if (configuration == null) throw new ArgumentNullException("configuration");

            this.Configuration = FactSet.SDK.IRNMeetings.Client.Configuration.MergeConfigurations(
                FactSet.SDK.IRNMeetings.Client.GlobalConfiguration.Instance,
                configuration
            );
            this.Client = new FactSet.SDK.IRNMeetings.Client.ApiClient(this.Configuration.BasePath);
            this.AsynchronousClient = new FactSet.SDK.IRNMeetings.Client.ApiClient(this.Configuration.BasePath);
            ExceptionFactory = FactSet.SDK.IRNMeetings.Client.Configuration.DefaultExceptionFactory;
        }

        /// <summary>
        /// Initializes a new instance of the <see cref="EventsApi"/> class
        /// using a Configuration object and client instance.
        /// </summary>
        /// <param name="client">The client interface for synchronous API access.</param>
        /// <param name="asyncClient">The client interface for asynchronous API access.</param>
        /// <param name="configuration">The configuration object.</param>
        public EventsApi(FactSet.SDK.IRNMeetings.Client.ISynchronousClient client, FactSet.SDK.IRNMeetings.Client.IAsynchronousClient asyncClient, FactSet.SDK.IRNMeetings.Client.IReadableConfiguration configuration)
        {
            if (client == null) throw new ArgumentNullException("client");
            if (asyncClient == null) throw new ArgumentNullException("asyncClient");
            if (configuration == null) throw new ArgumentNullException("configuration");

            this.Client = client;
            this.AsynchronousClient = asyncClient;
            this.Configuration = configuration;
            this.ExceptionFactory = FactSet.SDK.IRNMeetings.Client.Configuration.DefaultExceptionFactory;
        }

        /// <summary>
        /// The client for accessing this underlying API asynchronously.
        /// </summary>
        public FactSet.SDK.IRNMeetings.Client.IAsynchronousClient AsynchronousClient { get; set; }

        /// <summary>
        /// The client for accessing this underlying API synchronously.
        /// </summary>
        public FactSet.SDK.IRNMeetings.Client.ISynchronousClient Client { get; set; }

        /// <summary>
        /// Gets the base path of the API client.
        /// </summary>
        /// <value>The base path</value>
        public string GetBasePath()
        {
            return this.Configuration.BasePath;
        }

        /// <summary>
        /// Gets or sets the configuration object
        /// </summary>
        /// <value>An instance of the Configuration</value>
        public FactSet.SDK.IRNMeetings.Client.IReadableConfiguration Configuration { get; set; }

        /// <summary>
        /// Provides a factory method hook for the creation of exceptions.
        /// </summary>
        public FactSet.SDK.IRNMeetings.Client.ExceptionFactory ExceptionFactory
        {
            get
            {
                if (_exceptionFactory != null && _exceptionFactory.GetInvocationList().Length > 1)
                {
                    throw new InvalidOperationException("Multicast delegate for ExceptionFactory is unsupported.");
                }
                return _exceptionFactory;
            }
            set { _exceptionFactory = value; }
        }

        /// <summary>
        /// Get all the record events that belong to a meeting Get all the record events that belong to a meeting by providing the meeting id.
        /// </summary>
        /// <exception cref="FactSet.SDK.IRNMeetings.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="meetingId">Meeting ID</param>
        /// <returns>List<RecordEventSummaryDto></returns>
        public List<RecordEventSummaryDto> GetEvents(Guid meetingId)
        {
            var localVarResponse = GetEventsWithHttpInfo(meetingId);
            return localVarResponse.Data;
        }

        /// <summary>
        /// Get all the record events that belong to a meeting Get all the record events that belong to a meeting by providing the meeting id.
        /// </summary>
        /// <exception cref="FactSet.SDK.IRNMeetings.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="meetingId">Meeting ID</param>
        /// <returns>ApiResponse of List&lt;RecordEventSummaryDto&gt;</returns>
        public ApiResponse<List<RecordEventSummaryDto>> GetEventsWithHttpInfo(Guid meetingId)
        {
            FactSet.SDK.IRNMeetings.Client.RequestOptions localVarRequestOptions = new FactSet.SDK.IRNMeetings.Client.RequestOptions();

            string[] _contentTypes = new string[] {
            };

            // to determine the Accept header
            string[] _accepts = new string[] {
                "application/json"
            };

            var localVarContentType = FactSet.SDK.IRNMeetings.Client.ClientUtils.SelectHeaderContentType(_contentTypes);
            if (localVarContentType != null)
            {
                localVarRequestOptions.HeaderParameters.Add("Content-Type", localVarContentType);
            }

            var localVarAccept = FactSet.SDK.IRNMeetings.Client.ClientUtils.SelectHeaderAccept(_accepts);
            if (localVarAccept != null)
            {
                localVarRequestOptions.HeaderParameters.Add("Accept", localVarAccept);
            }

            localVarRequestOptions.PathParameters.Add("meetingId", FactSet.SDK.IRNMeetings.Client.ClientUtils.ParameterToString(meetingId)); // path parameter

            // authentication (FactSetApiKey) required
            // http basic authentication required
            if (!string.IsNullOrEmpty(this.Configuration.Username) || !string.IsNullOrEmpty(this.Configuration.Password) && !localVarRequestOptions.HeaderParameters.ContainsKey("Authorization"))
            {
                localVarRequestOptions.HeaderParameters.Add("Authorization", "Basic " + FactSet.SDK.IRNMeetings.Client.ClientUtils.Base64Encode(this.Configuration.Username + ":" + this.Configuration.Password));
            }
            // authentication (FactSetOAuth2) required
            // oauth required
            if (!string.IsNullOrEmpty(this.Configuration.AccessToken) && !localVarRequestOptions.HeaderParameters.ContainsKey("Authorization"))
            {
                localVarRequestOptions.HeaderParameters.Add("Authorization", "Bearer " + this.Configuration.AccessToken);
            }

            // FactSet Authentication Client required
            if (this.Configuration.OAuth2Client != null)
            {
                var token = this.Configuration.OAuth2Client.GetAccessTokenAsync().Result;
                localVarRequestOptions.HeaderParameters.Add("Authorization", "Bearer " + token);
            }

            localVarRequestOptions.ResponseTypeDictionary = GetEventsResponseTypeDictionary;

            // make the HTTP request
            var localVarResponse = this.Client.Get<
            List<RecordEventSummaryDto>>("/meetings/{meetingId}/events", localVarRequestOptions, this.Configuration);
            if (this.ExceptionFactory != null)
            {
                Exception _exception = this.ExceptionFactory("GetEvents", localVarResponse);
                if (_exception != null)
                {
                    throw _exception;
                }
            }
            return localVarResponse;
        }

        /// <summary>
        /// Get all the record events that belong to a meeting Get all the record events that belong to a meeting by providing the meeting id.
        /// </summary>
        /// <exception cref="FactSet.SDK.IRNMeetings.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="meetingId">Meeting ID</param>
        /// <param name="cancellationToken">Cancellation Token to cancel the request.</param>
        /// <returns>Task of List&lt;RecordEventSummaryDto&gt;</returns>
        public async System.Threading.Tasks.Task<List<RecordEventSummaryDto>>GetEventsAsync(Guid meetingId, System.Threading.CancellationToken cancellationToken = default(System.Threading.CancellationToken))
        {
            var localVarResponse = await GetEventsWithHttpInfoAsync(meetingId, cancellationToken).ConfigureAwait(false);
            return localVarResponse.Data;
        }

        /// <summary>
        /// Get all the record events that belong to a meeting Get all the record events that belong to a meeting by providing the meeting id.
        /// </summary>
        /// <exception cref="FactSet.SDK.IRNMeetings.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="meetingId">Meeting ID</param>
        /// <param name="cancellationToken">Cancellation Token to cancel the request.</param>
        /// <returns>Task of ApiResponse (List&lt;RecordEventSummaryDto&gt;)</returns>

        public async System.Threading.Tasks.Task<ApiResponse<List<RecordEventSummaryDto>>> GetEventsWithHttpInfoAsync(Guid meetingId, System.Threading.CancellationToken cancellationToken = default(System.Threading.CancellationToken))
        {

            FactSet.SDK.IRNMeetings.Client.RequestOptions localVarRequestOptions = new FactSet.SDK.IRNMeetings.Client.RequestOptions();

            string[] _contentTypes = new string[] {
            };

            // to determine the Accept header
            string[] _accepts = new string[] {
                "application/json"
            };

            var localVarContentType = FactSet.SDK.IRNMeetings.Client.ClientUtils.SelectHeaderContentType(_contentTypes);
            if (localVarContentType != null)
            {
                localVarRequestOptions.HeaderParameters.Add("Content-Type", localVarContentType);
            }

            var localVarAccept = FactSet.SDK.IRNMeetings.Client.ClientUtils.SelectHeaderAccept(_accepts);
            if (localVarAccept != null)
            {
                localVarRequestOptions.HeaderParameters.Add("Accept", localVarAccept);
            }

            localVarRequestOptions.PathParameters.Add("meetingId", FactSet.SDK.IRNMeetings.Client.ClientUtils.ParameterToString(meetingId)); // path parameter

            // authentication (FactSetApiKey) required
            // http basic authentication required
            if (!string.IsNullOrEmpty(this.Configuration.Username) || !string.IsNullOrEmpty(this.Configuration.Password) && !localVarRequestOptions.HeaderParameters.ContainsKey("Authorization"))
            {
                localVarRequestOptions.HeaderParameters.Add("Authorization", "Basic " + FactSet.SDK.IRNMeetings.Client.ClientUtils.Base64Encode(this.Configuration.Username + ":" + this.Configuration.Password));
            }
            // authentication (FactSetOAuth2) required
            // oauth required
            if (!string.IsNullOrEmpty(this.Configuration.AccessToken) && !localVarRequestOptions.HeaderParameters.ContainsKey("Authorization"))
            {
                localVarRequestOptions.HeaderParameters.Add("Authorization", "Bearer " + this.Configuration.AccessToken);
            }

            // FactSet Authentication Client required
            if (this.Configuration.OAuth2Client != null) {
                var token = await this.Configuration.OAuth2Client.GetAccessTokenAsync();
                localVarRequestOptions.HeaderParameters.Add("Authorization", "Bearer " + token);
            }


            localVarRequestOptions.ResponseTypeDictionary = GetEventsResponseTypeDictionary;

            // make the HTTP request
            var localVarResponse = await this.AsynchronousClient.GetAsync<List<RecordEventSummaryDto>>("/meetings/{meetingId}/events", localVarRequestOptions, this.Configuration, cancellationToken).ConfigureAwait(false);

            if (this.ExceptionFactory != null)
            {
                Exception _exception = this.ExceptionFactory("GetEvents", localVarResponse);
                if (_exception != null)
                {
                    throw _exception;
                }
            }

            return localVarResponse;
        }

        /// <summary>
        /// Get details of a record event of a meeting Get details of record event of meeting by providing recordeventid and meetingid
        /// </summary>
        /// <exception cref="FactSet.SDK.IRNMeetings.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="meetingId">Meeting Id</param>
        /// <param name="recordEventId">Record Event Id</param>
        /// <returns>MeetingEventDto</returns>
        public MeetingEventDto GetRecordEvent(Guid meetingId, Guid recordEventId)
        {
            var localVarResponse = GetRecordEventWithHttpInfo(meetingId, recordEventId);
            return localVarResponse.Data;
        }

        /// <summary>
        /// Get details of a record event of a meeting Get details of record event of meeting by providing recordeventid and meetingid
        /// </summary>
        /// <exception cref="FactSet.SDK.IRNMeetings.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="meetingId">Meeting Id</param>
        /// <param name="recordEventId">Record Event Id</param>
        /// <returns>ApiResponse of MeetingEventDto</returns>
        public ApiResponse<MeetingEventDto> GetRecordEventWithHttpInfo(Guid meetingId, Guid recordEventId)
        {
            FactSet.SDK.IRNMeetings.Client.RequestOptions localVarRequestOptions = new FactSet.SDK.IRNMeetings.Client.RequestOptions();

            string[] _contentTypes = new string[] {
            };

            // to determine the Accept header
            string[] _accepts = new string[] {
                "application/json"
            };

            var localVarContentType = FactSet.SDK.IRNMeetings.Client.ClientUtils.SelectHeaderContentType(_contentTypes);
            if (localVarContentType != null)
            {
                localVarRequestOptions.HeaderParameters.Add("Content-Type", localVarContentType);
            }

            var localVarAccept = FactSet.SDK.IRNMeetings.Client.ClientUtils.SelectHeaderAccept(_accepts);
            if (localVarAccept != null)
            {
                localVarRequestOptions.HeaderParameters.Add("Accept", localVarAccept);
            }

            localVarRequestOptions.PathParameters.Add("meetingId", FactSet.SDK.IRNMeetings.Client.ClientUtils.ParameterToString(meetingId)); // path parameter
            localVarRequestOptions.PathParameters.Add("recordEventId", FactSet.SDK.IRNMeetings.Client.ClientUtils.ParameterToString(recordEventId)); // path parameter

            // authentication (FactSetApiKey) required
            // http basic authentication required
            if (!string.IsNullOrEmpty(this.Configuration.Username) || !string.IsNullOrEmpty(this.Configuration.Password) && !localVarRequestOptions.HeaderParameters.ContainsKey("Authorization"))
            {
                localVarRequestOptions.HeaderParameters.Add("Authorization", "Basic " + FactSet.SDK.IRNMeetings.Client.ClientUtils.Base64Encode(this.Configuration.Username + ":" + this.Configuration.Password));
            }
            // authentication (FactSetOAuth2) required
            // oauth required
            if (!string.IsNullOrEmpty(this.Configuration.AccessToken) && !localVarRequestOptions.HeaderParameters.ContainsKey("Authorization"))
            {
                localVarRequestOptions.HeaderParameters.Add("Authorization", "Bearer " + this.Configuration.AccessToken);
            }

            // FactSet Authentication Client required
            if (this.Configuration.OAuth2Client != null)
            {
                var token = this.Configuration.OAuth2Client.GetAccessTokenAsync().Result;
                localVarRequestOptions.HeaderParameters.Add("Authorization", "Bearer " + token);
            }

            localVarRequestOptions.ResponseTypeDictionary = GetRecordEventResponseTypeDictionary;

            // make the HTTP request
            var localVarResponse = this.Client.Get<
            MeetingEventDto>("/meetings/{meetingId}/events/{recordEventId}", localVarRequestOptions, this.Configuration);
            if (this.ExceptionFactory != null)
            {
                Exception _exception = this.ExceptionFactory("GetRecordEvent", localVarResponse);
                if (_exception != null)
                {
                    throw _exception;
                }
            }
            return localVarResponse;
        }

        /// <summary>
        /// Get details of a record event of a meeting Get details of record event of meeting by providing recordeventid and meetingid
        /// </summary>
        /// <exception cref="FactSet.SDK.IRNMeetings.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="meetingId">Meeting Id</param>
        /// <param name="recordEventId">Record Event Id</param>
        /// <param name="cancellationToken">Cancellation Token to cancel the request.</param>
        /// <returns>Task of MeetingEventDto</returns>
        public async System.Threading.Tasks.Task<MeetingEventDto>GetRecordEventAsync(Guid meetingId, Guid recordEventId, System.Threading.CancellationToken cancellationToken = default(System.Threading.CancellationToken))
        {
            var localVarResponse = await GetRecordEventWithHttpInfoAsync(meetingId, recordEventId, cancellationToken).ConfigureAwait(false);
            return localVarResponse.Data;
        }

        /// <summary>
        /// Get details of a record event of a meeting Get details of record event of meeting by providing recordeventid and meetingid
        /// </summary>
        /// <exception cref="FactSet.SDK.IRNMeetings.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="meetingId">Meeting Id</param>
        /// <param name="recordEventId">Record Event Id</param>
        /// <param name="cancellationToken">Cancellation Token to cancel the request.</param>
        /// <returns>Task of ApiResponse (MeetingEventDto)</returns>

        public async System.Threading.Tasks.Task<ApiResponse<MeetingEventDto>> GetRecordEventWithHttpInfoAsync(Guid meetingId, Guid recordEventId, System.Threading.CancellationToken cancellationToken = default(System.Threading.CancellationToken))
        {

            FactSet.SDK.IRNMeetings.Client.RequestOptions localVarRequestOptions = new FactSet.SDK.IRNMeetings.Client.RequestOptions();

            string[] _contentTypes = new string[] {
            };

            // to determine the Accept header
            string[] _accepts = new string[] {
                "application/json"
            };

            var localVarContentType = FactSet.SDK.IRNMeetings.Client.ClientUtils.SelectHeaderContentType(_contentTypes);
            if (localVarContentType != null)
            {
                localVarRequestOptions.HeaderParameters.Add("Content-Type", localVarContentType);
            }

            var localVarAccept = FactSet.SDK.IRNMeetings.Client.ClientUtils.SelectHeaderAccept(_accepts);
            if (localVarAccept != null)
            {
                localVarRequestOptions.HeaderParameters.Add("Accept", localVarAccept);
            }

            localVarRequestOptions.PathParameters.Add("meetingId", FactSet.SDK.IRNMeetings.Client.ClientUtils.ParameterToString(meetingId)); // path parameter
            localVarRequestOptions.PathParameters.Add("recordEventId", FactSet.SDK.IRNMeetings.Client.ClientUtils.ParameterToString(recordEventId)); // path parameter

            // authentication (FactSetApiKey) required
            // http basic authentication required
            if (!string.IsNullOrEmpty(this.Configuration.Username) || !string.IsNullOrEmpty(this.Configuration.Password) && !localVarRequestOptions.HeaderParameters.ContainsKey("Authorization"))
            {
                localVarRequestOptions.HeaderParameters.Add("Authorization", "Basic " + FactSet.SDK.IRNMeetings.Client.ClientUtils.Base64Encode(this.Configuration.Username + ":" + this.Configuration.Password));
            }
            // authentication (FactSetOAuth2) required
            // oauth required
            if (!string.IsNullOrEmpty(this.Configuration.AccessToken) && !localVarRequestOptions.HeaderParameters.ContainsKey("Authorization"))
            {
                localVarRequestOptions.HeaderParameters.Add("Authorization", "Bearer " + this.Configuration.AccessToken);
            }

            // FactSet Authentication Client required
            if (this.Configuration.OAuth2Client != null) {
                var token = await this.Configuration.OAuth2Client.GetAccessTokenAsync();
                localVarRequestOptions.HeaderParameters.Add("Authorization", "Bearer " + token);
            }


            localVarRequestOptions.ResponseTypeDictionary = GetRecordEventResponseTypeDictionary;

            // make the HTTP request
            var localVarResponse = await this.AsynchronousClient.GetAsync<MeetingEventDto>("/meetings/{meetingId}/events/{recordEventId}", localVarRequestOptions, this.Configuration, cancellationToken).ConfigureAwait(false);

            if (this.ExceptionFactory != null)
            {
                Exception _exception = this.ExceptionFactory("GetRecordEvent", localVarResponse);
                if (_exception != null)
                {
                    throw _exception;
                }
            }

            return localVarResponse;
        }

    }
}
