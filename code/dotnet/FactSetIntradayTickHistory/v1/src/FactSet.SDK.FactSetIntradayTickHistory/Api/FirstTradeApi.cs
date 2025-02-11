/*
 * Tick History
 *
 * <p>FactSet’s Tick History provides cost-effective access to real-time and delayed global exchange data. Proprietary technology normalizes over 200 global exchanges and 19 tick history fields. Asset types integrated include equities, futures, options, fixed income, mutual funds, ETFs, indices, commodities, and FX rates.</p><p>Tick History provides dynamic access to tick data for a specific security intra-day or historically via standard HTTPS protocol. History is available for all quotes and trades for a trailing 6 months or 1-year, respectively. Quotes and trade data for Options is available for 30 days. Tick History data is also available in a separate end-of-day feed.</p>   
 *
 * The version of the OpenAPI document: 1.0.0
 * Contact: api@factset.com
 * Generated by: https://github.com/openapitools/openapi-generator.git
 */


using System;
using System.Collections.Generic;
using System.Collections.ObjectModel;
using System.Linq;
using System.Net;
using System.Net.Mime;
using FactSet.SDK.FactSetIntradayTickHistory.Client;
using FactSet.SDK.FactSetIntradayTickHistory.Model;
using FactSet.SDK.Utils.Authentication;

namespace FactSet.SDK.FactSetIntradayTickHistory.Api
{

    /// <summary>
    /// Represents a collection of functions to interact with the API endpoints
    /// </summary>
    public interface IFirstTradeApiSync : IApiAccessor
    {
        #region Synchronous Operations
        /// <summary>
        /// Request returns data for the first trade (official and unofficial) after the specified time
        /// </summary>
        /// <exception cref="FactSet.SDK.FactSetIntradayTickHistory.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="id">Requested symbol or security. The symbol can be a FactSet exchange symbol, CUSIP, or SEDOL. **NOTE**: Only one identifier can be requested per request.&lt;P&gt;**TRY IT OUT** - Choose One from - BABA-USA,WALMEX-MX,7203-TKS,VOD-LON,NPN-JSE,MABAX,NZF,SPY-USA,AGG-USA,GLD-USA,AOR-USA,MNA-USA,UUP-USA,SP50-SPX,ESX-STX,XAO-ASX,WD-MSX,NG00-USA,GC00-USA,CC00-USA,C00-USA,FC00-USA,ER00-USA,EURUSD-FX1,USDMXN-FX1,AUDJPY-FX1,EURCZK-FX1,USDILS-FX1,USDZAR-FX1,US10YY-TU1,FDS#190621C00145000-USA,FDS#190621P00145000-USA</param>
        /// <param name="reqId">Request Identification String. Can be used by the application to keep track of requests. The id is not used by this service, however, it is included in the XML response. (optional)</param>
        /// <param name="startDate">This is the start date for the Snapshot History. Requests should be made in the format YYYYMMDD Default is current business day. Field can be sd or date. TRY IT OUT Cannot use current day. (optional)</param>
        /// <param name="startTime">This is the start time for the snapshot history requested. Requests should be made in a **HHMMSSS** format.Range from 000000 - 235959. **TRY IT OUT** Cannot use current day (optional, default to &quot;040000&quot;)</param>
        /// <param name="format">The format of the output file. TRY IT OUT Choose from JSON, CSV, CSV_NO_HEADER (optional, default to XML)</param>
        /// <param name="includeRequest">Flag to include request id and key in the CSV output. (optional, default to false)</param>
        /// <param name="dataset">Decides what type of trades to return, default is all trades and quotes, alternatively charting can be selected which will filter out unofficial trades. (optional)</param>
        /// <returns>TickhistoryResponse</returns>
        TickhistoryResponse TickHistoryFirsttradeGet(string id, string reqId = default(string), string startDate = default(string), string startTime = default(string), string format = default(string), string includeRequest = default(string), string dataset = default(string));

        /// <summary>
        /// Request returns data for the first trade (official and unofficial) after the specified time
        /// </summary>
        /// <remarks>
        /// 
        /// </remarks>
        /// <exception cref="FactSet.SDK.FactSetIntradayTickHistory.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="id">Requested symbol or security. The symbol can be a FactSet exchange symbol, CUSIP, or SEDOL. **NOTE**: Only one identifier can be requested per request.&lt;P&gt;**TRY IT OUT** - Choose One from - BABA-USA,WALMEX-MX,7203-TKS,VOD-LON,NPN-JSE,MABAX,NZF,SPY-USA,AGG-USA,GLD-USA,AOR-USA,MNA-USA,UUP-USA,SP50-SPX,ESX-STX,XAO-ASX,WD-MSX,NG00-USA,GC00-USA,CC00-USA,C00-USA,FC00-USA,ER00-USA,EURUSD-FX1,USDMXN-FX1,AUDJPY-FX1,EURCZK-FX1,USDILS-FX1,USDZAR-FX1,US10YY-TU1,FDS#190621C00145000-USA,FDS#190621P00145000-USA</param>
        /// <param name="reqId">Request Identification String. Can be used by the application to keep track of requests. The id is not used by this service, however, it is included in the XML response. (optional)</param>
        /// <param name="startDate">This is the start date for the Snapshot History. Requests should be made in the format YYYYMMDD Default is current business day. Field can be sd or date. TRY IT OUT Cannot use current day. (optional)</param>
        /// <param name="startTime">This is the start time for the snapshot history requested. Requests should be made in a **HHMMSSS** format.Range from 000000 - 235959. **TRY IT OUT** Cannot use current day (optional, default to &quot;040000&quot;)</param>
        /// <param name="format">The format of the output file. TRY IT OUT Choose from JSON, CSV, CSV_NO_HEADER (optional, default to XML)</param>
        /// <param name="includeRequest">Flag to include request id and key in the CSV output. (optional, default to false)</param>
        /// <param name="dataset">Decides what type of trades to return, default is all trades and quotes, alternatively charting can be selected which will filter out unofficial trades. (optional)</param>
        /// <returns>ApiResponse of TickhistoryResponse</returns>
        ApiResponse<TickhistoryResponse> TickHistoryFirsttradeGetWithHttpInfo(string id, string reqId = default(string), string startDate = default(string), string startTime = default(string), string format = default(string), string includeRequest = default(string), string dataset = default(string));
        #endregion Synchronous Operations
    }

    /// <summary>
    /// Represents a collection of functions to interact with the API endpoints
    /// </summary>
    public interface IFirstTradeApiAsync : IApiAccessor
    {
        #region Asynchronous Operations
        /// <summary>
        /// Request returns data for the first trade (official and unofficial) after the specified time
        /// </summary>
        /// <remarks>
        /// 
        /// </remarks>
        /// <exception cref="FactSet.SDK.FactSetIntradayTickHistory.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="id">Requested symbol or security. The symbol can be a FactSet exchange symbol, CUSIP, or SEDOL. **NOTE**: Only one identifier can be requested per request.&lt;P&gt;**TRY IT OUT** - Choose One from - BABA-USA,WALMEX-MX,7203-TKS,VOD-LON,NPN-JSE,MABAX,NZF,SPY-USA,AGG-USA,GLD-USA,AOR-USA,MNA-USA,UUP-USA,SP50-SPX,ESX-STX,XAO-ASX,WD-MSX,NG00-USA,GC00-USA,CC00-USA,C00-USA,FC00-USA,ER00-USA,EURUSD-FX1,USDMXN-FX1,AUDJPY-FX1,EURCZK-FX1,USDILS-FX1,USDZAR-FX1,US10YY-TU1,FDS#190621C00145000-USA,FDS#190621P00145000-USA</param>
        /// <param name="reqId">Request Identification String. Can be used by the application to keep track of requests. The id is not used by this service, however, it is included in the XML response. (optional)</param>
        /// <param name="startDate">This is the start date for the Snapshot History. Requests should be made in the format YYYYMMDD Default is current business day. Field can be sd or date. TRY IT OUT Cannot use current day. (optional)</param>
        /// <param name="startTime">This is the start time for the snapshot history requested. Requests should be made in a **HHMMSSS** format.Range from 000000 - 235959. **TRY IT OUT** Cannot use current day (optional, default to &quot;040000&quot;)</param>
        /// <param name="format">The format of the output file. TRY IT OUT Choose from JSON, CSV, CSV_NO_HEADER (optional, default to XML)</param>
        /// <param name="includeRequest">Flag to include request id and key in the CSV output. (optional, default to false)</param>
        /// <param name="dataset">Decides what type of trades to return, default is all trades and quotes, alternatively charting can be selected which will filter out unofficial trades. (optional)</param>
        /// <param name="cancellationToken">Cancellation Token to cancel the request.</param>
        /// <returns>Task of TickhistoryResponse</returns>
        System.Threading.Tasks.Task<TickhistoryResponse> TickHistoryFirsttradeGetAsync(string id, string reqId = default(string), string startDate = default(string), string startTime = default(string), string format = default(string), string includeRequest = default(string), string dataset = default(string), System.Threading.CancellationToken cancellationToken = default(System.Threading.CancellationToken));

        /// <summary>
        /// Request returns data for the first trade (official and unofficial) after the specified time
        /// </summary>
        /// <remarks>
        /// 
        /// </remarks>
        /// <exception cref="FactSet.SDK.FactSetIntradayTickHistory.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="id">Requested symbol or security. The symbol can be a FactSet exchange symbol, CUSIP, or SEDOL. **NOTE**: Only one identifier can be requested per request.&lt;P&gt;**TRY IT OUT** - Choose One from - BABA-USA,WALMEX-MX,7203-TKS,VOD-LON,NPN-JSE,MABAX,NZF,SPY-USA,AGG-USA,GLD-USA,AOR-USA,MNA-USA,UUP-USA,SP50-SPX,ESX-STX,XAO-ASX,WD-MSX,NG00-USA,GC00-USA,CC00-USA,C00-USA,FC00-USA,ER00-USA,EURUSD-FX1,USDMXN-FX1,AUDJPY-FX1,EURCZK-FX1,USDILS-FX1,USDZAR-FX1,US10YY-TU1,FDS#190621C00145000-USA,FDS#190621P00145000-USA</param>
        /// <param name="reqId">Request Identification String. Can be used by the application to keep track of requests. The id is not used by this service, however, it is included in the XML response. (optional)</param>
        /// <param name="startDate">This is the start date for the Snapshot History. Requests should be made in the format YYYYMMDD Default is current business day. Field can be sd or date. TRY IT OUT Cannot use current day. (optional)</param>
        /// <param name="startTime">This is the start time for the snapshot history requested. Requests should be made in a **HHMMSSS** format.Range from 000000 - 235959. **TRY IT OUT** Cannot use current day (optional, default to &quot;040000&quot;)</param>
        /// <param name="format">The format of the output file. TRY IT OUT Choose from JSON, CSV, CSV_NO_HEADER (optional, default to XML)</param>
        /// <param name="includeRequest">Flag to include request id and key in the CSV output. (optional, default to false)</param>
        /// <param name="dataset">Decides what type of trades to return, default is all trades and quotes, alternatively charting can be selected which will filter out unofficial trades. (optional)</param>
        /// <param name="cancellationToken">Cancellation Token to cancel the request.</param>
        /// <returns>Task of ApiResponse (TickhistoryResponse)</returns>
        System.Threading.Tasks.Task<ApiResponse<TickhistoryResponse>> TickHistoryFirsttradeGetWithHttpInfoAsync(string id, string reqId = default(string), string startDate = default(string), string startTime = default(string), string format = default(string), string includeRequest = default(string), string dataset = default(string), System.Threading.CancellationToken cancellationToken = default(System.Threading.CancellationToken));
        #endregion Asynchronous Operations
    }

    /// <summary>
    /// Represents a collection of functions to interact with the API endpoints
    /// </summary>
    public interface IFirstTradeApi : IFirstTradeApiSync, IFirstTradeApiAsync
    {

    }

    /// <summary>
    /// Represents a collection of functions to interact with the API endpoints
    /// </summary>
    public partial class FirstTradeApi : IFirstTradeApi
    {
        private FactSet.SDK.FactSetIntradayTickHistory.Client.ExceptionFactory _exceptionFactory = (name, response) => null;

        # region Response Type Disctionaries
        
        private static readonly Dictionary<HttpStatusCode, System.Type> TickHistoryFirsttradeGetResponseTypeDictionary = new Dictionary<HttpStatusCode, System.Type>
        {
            { (HttpStatusCode)200, typeof(TickhistoryResponse) },
            { (HttpStatusCode)401, typeof(Object) },
            { (HttpStatusCode)403, typeof(Object) },
            { (HttpStatusCode)405, typeof(Object) },
        };

        # endregion Response Type Disctionaries

        # region Api Response Objects
        

        # endregion Api Response Objects

        /// <summary>
        /// Initializes a new instance of the <see cref="FirstTradeApi"/> class.
        /// </summary>
        /// <returns></returns>
        public FirstTradeApi() : this((string)null)
        {
        }

        /// <summary>
        /// Initializes a new instance of the <see cref="FirstTradeApi"/> class.
        /// </summary>
        /// <returns></returns>
        public FirstTradeApi(string basePath)
        {
            this.Configuration = FactSet.SDK.FactSetIntradayTickHistory.Client.Configuration.MergeConfigurations(
                FactSet.SDK.FactSetIntradayTickHistory.Client.GlobalConfiguration.Instance,
                new FactSet.SDK.FactSetIntradayTickHistory.Client.Configuration { BasePath = basePath }
            );
            this.Client = new FactSet.SDK.FactSetIntradayTickHistory.Client.ApiClient(this.Configuration.BasePath);
            this.AsynchronousClient = new FactSet.SDK.FactSetIntradayTickHistory.Client.ApiClient(this.Configuration.BasePath);
            this.ExceptionFactory = FactSet.SDK.FactSetIntradayTickHistory.Client.Configuration.DefaultExceptionFactory;
        }

        /// <summary>
        /// Initializes a new instance of the <see cref="FirstTradeApi"/> class
        /// using Configuration object
        /// </summary>
        /// <param name="configuration">An instance of Configuration</param>
        /// <returns></returns>
        public FirstTradeApi(FactSet.SDK.FactSetIntradayTickHistory.Client.Configuration configuration)
        {
            if (configuration == null) throw new ArgumentNullException("configuration");

            this.Configuration = FactSet.SDK.FactSetIntradayTickHistory.Client.Configuration.MergeConfigurations(
                FactSet.SDK.FactSetIntradayTickHistory.Client.GlobalConfiguration.Instance,
                configuration
            );
            this.Client = new FactSet.SDK.FactSetIntradayTickHistory.Client.ApiClient(this.Configuration.BasePath);
            this.AsynchronousClient = new FactSet.SDK.FactSetIntradayTickHistory.Client.ApiClient(this.Configuration.BasePath);
            ExceptionFactory = FactSet.SDK.FactSetIntradayTickHistory.Client.Configuration.DefaultExceptionFactory;
        }

        /// <summary>
        /// Initializes a new instance of the <see cref="FirstTradeApi"/> class
        /// using a Configuration object and client instance.
        /// </summary>
        /// <param name="client">The client interface for synchronous API access.</param>
        /// <param name="asyncClient">The client interface for asynchronous API access.</param>
        /// <param name="configuration">The configuration object.</param>
        public FirstTradeApi(FactSet.SDK.FactSetIntradayTickHistory.Client.ISynchronousClient client, FactSet.SDK.FactSetIntradayTickHistory.Client.IAsynchronousClient asyncClient, FactSet.SDK.FactSetIntradayTickHistory.Client.IReadableConfiguration configuration)
        {
            if (client == null) throw new ArgumentNullException("client");
            if (asyncClient == null) throw new ArgumentNullException("asyncClient");
            if (configuration == null) throw new ArgumentNullException("configuration");

            this.Client = client;
            this.AsynchronousClient = asyncClient;
            this.Configuration = configuration;
            this.ExceptionFactory = FactSet.SDK.FactSetIntradayTickHistory.Client.Configuration.DefaultExceptionFactory;
        }

        /// <summary>
        /// The client for accessing this underlying API asynchronously.
        /// </summary>
        public FactSet.SDK.FactSetIntradayTickHistory.Client.IAsynchronousClient AsynchronousClient { get; set; }

        /// <summary>
        /// The client for accessing this underlying API synchronously.
        /// </summary>
        public FactSet.SDK.FactSetIntradayTickHistory.Client.ISynchronousClient Client { get; set; }

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
        public FactSet.SDK.FactSetIntradayTickHistory.Client.IReadableConfiguration Configuration { get; set; }

        /// <summary>
        /// Provides a factory method hook for the creation of exceptions.
        /// </summary>
        public FactSet.SDK.FactSetIntradayTickHistory.Client.ExceptionFactory ExceptionFactory
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
        /// Request returns data for the first trade (official and unofficial) after the specified time 
        /// </summary>
        /// <exception cref="FactSet.SDK.FactSetIntradayTickHistory.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="id">Requested symbol or security. The symbol can be a FactSet exchange symbol, CUSIP, or SEDOL. **NOTE**: Only one identifier can be requested per request.&lt;P&gt;**TRY IT OUT** - Choose One from - BABA-USA,WALMEX-MX,7203-TKS,VOD-LON,NPN-JSE,MABAX,NZF,SPY-USA,AGG-USA,GLD-USA,AOR-USA,MNA-USA,UUP-USA,SP50-SPX,ESX-STX,XAO-ASX,WD-MSX,NG00-USA,GC00-USA,CC00-USA,C00-USA,FC00-USA,ER00-USA,EURUSD-FX1,USDMXN-FX1,AUDJPY-FX1,EURCZK-FX1,USDILS-FX1,USDZAR-FX1,US10YY-TU1,FDS#190621C00145000-USA,FDS#190621P00145000-USA</param>
        /// <param name="reqId">Request Identification String. Can be used by the application to keep track of requests. The id is not used by this service, however, it is included in the XML response. (optional)</param>
        /// <param name="startDate">This is the start date for the Snapshot History. Requests should be made in the format YYYYMMDD Default is current business day. Field can be sd or date. TRY IT OUT Cannot use current day. (optional)</param>
        /// <param name="startTime">This is the start time for the snapshot history requested. Requests should be made in a **HHMMSSS** format.Range from 000000 - 235959. **TRY IT OUT** Cannot use current day (optional, default to &quot;040000&quot;)</param>
        /// <param name="format">The format of the output file. TRY IT OUT Choose from JSON, CSV, CSV_NO_HEADER (optional, default to XML)</param>
        /// <param name="includeRequest">Flag to include request id and key in the CSV output. (optional, default to false)</param>
        /// <param name="dataset">Decides what type of trades to return, default is all trades and quotes, alternatively charting can be selected which will filter out unofficial trades. (optional)</param>
        /// <returns>TickhistoryResponse</returns>
        public TickhistoryResponse TickHistoryFirsttradeGet(string id, string reqId = default(string), string startDate = default(string), string startTime = default(string), string format = default(string), string includeRequest = default(string), string dataset = default(string))
        {
            var localVarResponse = TickHistoryFirsttradeGetWithHttpInfo(id, reqId, startDate, startTime, format, includeRequest, dataset);
            return localVarResponse.Data;
        }

        /// <summary>
        /// Request returns data for the first trade (official and unofficial) after the specified time 
        /// </summary>
        /// <exception cref="FactSet.SDK.FactSetIntradayTickHistory.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="id">Requested symbol or security. The symbol can be a FactSet exchange symbol, CUSIP, or SEDOL. **NOTE**: Only one identifier can be requested per request.&lt;P&gt;**TRY IT OUT** - Choose One from - BABA-USA,WALMEX-MX,7203-TKS,VOD-LON,NPN-JSE,MABAX,NZF,SPY-USA,AGG-USA,GLD-USA,AOR-USA,MNA-USA,UUP-USA,SP50-SPX,ESX-STX,XAO-ASX,WD-MSX,NG00-USA,GC00-USA,CC00-USA,C00-USA,FC00-USA,ER00-USA,EURUSD-FX1,USDMXN-FX1,AUDJPY-FX1,EURCZK-FX1,USDILS-FX1,USDZAR-FX1,US10YY-TU1,FDS#190621C00145000-USA,FDS#190621P00145000-USA</param>
        /// <param name="reqId">Request Identification String. Can be used by the application to keep track of requests. The id is not used by this service, however, it is included in the XML response. (optional)</param>
        /// <param name="startDate">This is the start date for the Snapshot History. Requests should be made in the format YYYYMMDD Default is current business day. Field can be sd or date. TRY IT OUT Cannot use current day. (optional)</param>
        /// <param name="startTime">This is the start time for the snapshot history requested. Requests should be made in a **HHMMSSS** format.Range from 000000 - 235959. **TRY IT OUT** Cannot use current day (optional, default to &quot;040000&quot;)</param>
        /// <param name="format">The format of the output file. TRY IT OUT Choose from JSON, CSV, CSV_NO_HEADER (optional, default to XML)</param>
        /// <param name="includeRequest">Flag to include request id and key in the CSV output. (optional, default to false)</param>
        /// <param name="dataset">Decides what type of trades to return, default is all trades and quotes, alternatively charting can be selected which will filter out unofficial trades. (optional)</param>
        /// <returns>ApiResponse of TickhistoryResponse</returns>
        public ApiResponse<TickhistoryResponse> TickHistoryFirsttradeGetWithHttpInfo(string id, string reqId = default(string), string startDate = default(string), string startTime = default(string), string format = default(string), string includeRequest = default(string), string dataset = default(string))
        {
            // verify the required parameter 'id' is set
            if (id == null)
            {
                throw new FactSet.SDK.FactSetIntradayTickHistory.Client.ApiException(400, "Missing required parameter 'id' when calling FirstTradeApi->TickHistoryFirsttradeGet");
            }

            FactSet.SDK.FactSetIntradayTickHistory.Client.RequestOptions localVarRequestOptions = new FactSet.SDK.FactSetIntradayTickHistory.Client.RequestOptions();

            string[] _contentTypes = new string[] {
            };

            // to determine the Accept header
            string[] _accepts = new string[] {
                "application/json",
                "application/xml",
                "text/csv"
            };

            var localVarContentType = FactSet.SDK.FactSetIntradayTickHistory.Client.ClientUtils.SelectHeaderContentType(_contentTypes);
            if (localVarContentType != null)
            {
                localVarRequestOptions.HeaderParameters.Add("Content-Type", localVarContentType);
            }

            var localVarAccept = FactSet.SDK.FactSetIntradayTickHistory.Client.ClientUtils.SelectHeaderAccept(_accepts);
            if (localVarAccept != null)
            {
                localVarRequestOptions.HeaderParameters.Add("Accept", localVarAccept);
            }

            localVarRequestOptions.QueryParameters.Add(FactSet.SDK.FactSetIntradayTickHistory.Client.ClientUtils.ParameterToMultiMap("", "id", id));
            if (reqId != null)
            {
                localVarRequestOptions.QueryParameters.Add(FactSet.SDK.FactSetIntradayTickHistory.Client.ClientUtils.ParameterToMultiMap("", "req_id", reqId));
            }
            if (startDate != null)
            {
                localVarRequestOptions.QueryParameters.Add(FactSet.SDK.FactSetIntradayTickHistory.Client.ClientUtils.ParameterToMultiMap("", "start_date", startDate));
            }
            if (startTime != null)
            {
                localVarRequestOptions.QueryParameters.Add(FactSet.SDK.FactSetIntradayTickHistory.Client.ClientUtils.ParameterToMultiMap("", "start_time", startTime));
            }
            if (format != null)
            {
                localVarRequestOptions.QueryParameters.Add(FactSet.SDK.FactSetIntradayTickHistory.Client.ClientUtils.ParameterToMultiMap("", "format", format));
            }
            if (includeRequest != null)
            {
                localVarRequestOptions.QueryParameters.Add(FactSet.SDK.FactSetIntradayTickHistory.Client.ClientUtils.ParameterToMultiMap("", "include_request", includeRequest));
            }
            if (dataset != null)
            {
                localVarRequestOptions.QueryParameters.Add(FactSet.SDK.FactSetIntradayTickHistory.Client.ClientUtils.ParameterToMultiMap("", "dataset", dataset));
            }

            // authentication (FactSetApiKey) required
            // http basic authentication required
            if (!string.IsNullOrEmpty(this.Configuration.Username) || !string.IsNullOrEmpty(this.Configuration.Password) && !localVarRequestOptions.HeaderParameters.ContainsKey("Authorization"))
            {
                localVarRequestOptions.HeaderParameters.Add("Authorization", "Basic " + FactSet.SDK.FactSetIntradayTickHistory.Client.ClientUtils.Base64Encode(this.Configuration.Username + ":" + this.Configuration.Password));
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

            localVarRequestOptions.ResponseTypeDictionary = TickHistoryFirsttradeGetResponseTypeDictionary;

            // make the HTTP request
            var localVarResponse = this.Client.Get<
            TickhistoryResponse>("/TickHistory/firsttrade", localVarRequestOptions, this.Configuration);
            if (this.ExceptionFactory != null)
            {
                Exception _exception = this.ExceptionFactory("TickHistoryFirsttradeGet", localVarResponse);
                if (_exception != null)
                {
                    throw _exception;
                }
            }
            return localVarResponse;
        }

        /// <summary>
        /// Request returns data for the first trade (official and unofficial) after the specified time 
        /// </summary>
        /// <exception cref="FactSet.SDK.FactSetIntradayTickHistory.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="id">Requested symbol or security. The symbol can be a FactSet exchange symbol, CUSIP, or SEDOL. **NOTE**: Only one identifier can be requested per request.&lt;P&gt;**TRY IT OUT** - Choose One from - BABA-USA,WALMEX-MX,7203-TKS,VOD-LON,NPN-JSE,MABAX,NZF,SPY-USA,AGG-USA,GLD-USA,AOR-USA,MNA-USA,UUP-USA,SP50-SPX,ESX-STX,XAO-ASX,WD-MSX,NG00-USA,GC00-USA,CC00-USA,C00-USA,FC00-USA,ER00-USA,EURUSD-FX1,USDMXN-FX1,AUDJPY-FX1,EURCZK-FX1,USDILS-FX1,USDZAR-FX1,US10YY-TU1,FDS#190621C00145000-USA,FDS#190621P00145000-USA</param>
        /// <param name="reqId">Request Identification String. Can be used by the application to keep track of requests. The id is not used by this service, however, it is included in the XML response. (optional)</param>
        /// <param name="startDate">This is the start date for the Snapshot History. Requests should be made in the format YYYYMMDD Default is current business day. Field can be sd or date. TRY IT OUT Cannot use current day. (optional)</param>
        /// <param name="startTime">This is the start time for the snapshot history requested. Requests should be made in a **HHMMSSS** format.Range from 000000 - 235959. **TRY IT OUT** Cannot use current day (optional, default to &quot;040000&quot;)</param>
        /// <param name="format">The format of the output file. TRY IT OUT Choose from JSON, CSV, CSV_NO_HEADER (optional, default to XML)</param>
        /// <param name="includeRequest">Flag to include request id and key in the CSV output. (optional, default to false)</param>
        /// <param name="dataset">Decides what type of trades to return, default is all trades and quotes, alternatively charting can be selected which will filter out unofficial trades. (optional)</param>
        /// <param name="cancellationToken">Cancellation Token to cancel the request.</param>
        /// <returns>Task of TickhistoryResponse</returns>
        public async System.Threading.Tasks.Task<TickhistoryResponse>TickHistoryFirsttradeGetAsync(string id, string reqId = default(string), string startDate = default(string), string startTime = default(string), string format = default(string), string includeRequest = default(string), string dataset = default(string), System.Threading.CancellationToken cancellationToken = default(System.Threading.CancellationToken))
        {
            var localVarResponse = await TickHistoryFirsttradeGetWithHttpInfoAsync(id, reqId, startDate, startTime, format, includeRequest, dataset, cancellationToken).ConfigureAwait(false);
            return localVarResponse.Data;
        }

        /// <summary>
        /// Request returns data for the first trade (official and unofficial) after the specified time 
        /// </summary>
        /// <exception cref="FactSet.SDK.FactSetIntradayTickHistory.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="id">Requested symbol or security. The symbol can be a FactSet exchange symbol, CUSIP, or SEDOL. **NOTE**: Only one identifier can be requested per request.&lt;P&gt;**TRY IT OUT** - Choose One from - BABA-USA,WALMEX-MX,7203-TKS,VOD-LON,NPN-JSE,MABAX,NZF,SPY-USA,AGG-USA,GLD-USA,AOR-USA,MNA-USA,UUP-USA,SP50-SPX,ESX-STX,XAO-ASX,WD-MSX,NG00-USA,GC00-USA,CC00-USA,C00-USA,FC00-USA,ER00-USA,EURUSD-FX1,USDMXN-FX1,AUDJPY-FX1,EURCZK-FX1,USDILS-FX1,USDZAR-FX1,US10YY-TU1,FDS#190621C00145000-USA,FDS#190621P00145000-USA</param>
        /// <param name="reqId">Request Identification String. Can be used by the application to keep track of requests. The id is not used by this service, however, it is included in the XML response. (optional)</param>
        /// <param name="startDate">This is the start date for the Snapshot History. Requests should be made in the format YYYYMMDD Default is current business day. Field can be sd or date. TRY IT OUT Cannot use current day. (optional)</param>
        /// <param name="startTime">This is the start time for the snapshot history requested. Requests should be made in a **HHMMSSS** format.Range from 000000 - 235959. **TRY IT OUT** Cannot use current day (optional, default to &quot;040000&quot;)</param>
        /// <param name="format">The format of the output file. TRY IT OUT Choose from JSON, CSV, CSV_NO_HEADER (optional, default to XML)</param>
        /// <param name="includeRequest">Flag to include request id and key in the CSV output. (optional, default to false)</param>
        /// <param name="dataset">Decides what type of trades to return, default is all trades and quotes, alternatively charting can be selected which will filter out unofficial trades. (optional)</param>
        /// <param name="cancellationToken">Cancellation Token to cancel the request.</param>
        /// <returns>Task of ApiResponse (TickhistoryResponse)</returns>

        public async System.Threading.Tasks.Task<ApiResponse<TickhistoryResponse>> TickHistoryFirsttradeGetWithHttpInfoAsync(string id, string reqId = default(string), string startDate = default(string), string startTime = default(string), string format = default(string), string includeRequest = default(string), string dataset = default(string), System.Threading.CancellationToken cancellationToken = default(System.Threading.CancellationToken))
        {
            // verify the required parameter 'id' is set
            if (id == null)
            {
                throw new FactSet.SDK.FactSetIntradayTickHistory.Client.ApiException(400, "Missing required parameter 'id' when calling FirstTradeApi->TickHistoryFirsttradeGet");
            }


            FactSet.SDK.FactSetIntradayTickHistory.Client.RequestOptions localVarRequestOptions = new FactSet.SDK.FactSetIntradayTickHistory.Client.RequestOptions();

            string[] _contentTypes = new string[] {
            };

            // to determine the Accept header
            string[] _accepts = new string[] {
                "application/json",
                "application/xml",
                "text/csv"
            };

            var localVarContentType = FactSet.SDK.FactSetIntradayTickHistory.Client.ClientUtils.SelectHeaderContentType(_contentTypes);
            if (localVarContentType != null)
            {
                localVarRequestOptions.HeaderParameters.Add("Content-Type", localVarContentType);
            }

            var localVarAccept = FactSet.SDK.FactSetIntradayTickHistory.Client.ClientUtils.SelectHeaderAccept(_accepts);
            if (localVarAccept != null)
            {
                localVarRequestOptions.HeaderParameters.Add("Accept", localVarAccept);
            }

            localVarRequestOptions.QueryParameters.Add(FactSet.SDK.FactSetIntradayTickHistory.Client.ClientUtils.ParameterToMultiMap("", "id", id));
            if (reqId != null)
            {
                localVarRequestOptions.QueryParameters.Add(FactSet.SDK.FactSetIntradayTickHistory.Client.ClientUtils.ParameterToMultiMap("", "req_id", reqId));
            }
            if (startDate != null)
            {
                localVarRequestOptions.QueryParameters.Add(FactSet.SDK.FactSetIntradayTickHistory.Client.ClientUtils.ParameterToMultiMap("", "start_date", startDate));
            }
            if (startTime != null)
            {
                localVarRequestOptions.QueryParameters.Add(FactSet.SDK.FactSetIntradayTickHistory.Client.ClientUtils.ParameterToMultiMap("", "start_time", startTime));
            }
            if (format != null)
            {
                localVarRequestOptions.QueryParameters.Add(FactSet.SDK.FactSetIntradayTickHistory.Client.ClientUtils.ParameterToMultiMap("", "format", format));
            }
            if (includeRequest != null)
            {
                localVarRequestOptions.QueryParameters.Add(FactSet.SDK.FactSetIntradayTickHistory.Client.ClientUtils.ParameterToMultiMap("", "include_request", includeRequest));
            }
            if (dataset != null)
            {
                localVarRequestOptions.QueryParameters.Add(FactSet.SDK.FactSetIntradayTickHistory.Client.ClientUtils.ParameterToMultiMap("", "dataset", dataset));
            }

            // authentication (FactSetApiKey) required
            // http basic authentication required
            if (!string.IsNullOrEmpty(this.Configuration.Username) || !string.IsNullOrEmpty(this.Configuration.Password) && !localVarRequestOptions.HeaderParameters.ContainsKey("Authorization"))
            {
                localVarRequestOptions.HeaderParameters.Add("Authorization", "Basic " + FactSet.SDK.FactSetIntradayTickHistory.Client.ClientUtils.Base64Encode(this.Configuration.Username + ":" + this.Configuration.Password));
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


            localVarRequestOptions.ResponseTypeDictionary = TickHistoryFirsttradeGetResponseTypeDictionary;

            // make the HTTP request
            var localVarResponse = await this.AsynchronousClient.GetAsync<TickhistoryResponse>("/TickHistory/firsttrade", localVarRequestOptions, this.Configuration, cancellationToken).ConfigureAwait(false);

            if (this.ExceptionFactory != null)
            {
                Exception _exception = this.ExceptionFactory("TickHistoryFirsttradeGet", localVarResponse);
                if (_exception != null)
                {
                    throw _exception;
                }
            }

            return localVarResponse;
        }

    }
}
