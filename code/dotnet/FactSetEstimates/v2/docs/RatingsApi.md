# FactSet.SDK.FactSetEstimates.Api.RatingsApi

All URIs are relative to *https://api.factset.com/content*

Method | HTTP request | Description
------------- | ------------- | -------------
[**GetConsensusRatings**](RatingsApi.md#getconsensusratings) | **GET** /factset-estimates/v2/consensus-ratings | Ratings consensus estimates to fetch Buy, Overweight, Hold, Underweight, and Sell.
[**GetConsensusRatingsForList**](RatingsApi.md#getconsensusratingsforlist) | **POST** /factset-estimates/v2/consensus-ratings | Ratings consensus estimates to fetch Buy, Overweight, Hold, Underweight, and Sell.
[**GetDetailRatings**](RatingsApi.md#getdetailratings) | **GET** /factset-estimates/v2/detail-ratings | Broker Detail estimates to fetch Buy, Overweight, Hold, Underweight, and Sell.
[**GetDetailRatingsForList**](RatingsApi.md#getdetailratingsforlist) | **POST** /factset-estimates/v2/detail-ratings | Broker Detail estimates to fetch Buy, Overweight, Hold, Underweight, and Sell.



<a name="getconsensusratings"></a>
# **GetConsensusRatings**
> ConsensusRatingsResponse GetConsensusRatings (List<string> ids, string startDate = null, string endDate = null, string frequency = null)

Ratings consensus estimates to fetch Buy, Overweight, Hold, Underweight, and Sell.

Returns ratings from the FactSet Estimates database for current and historical for an individual security using rolling fiscal dates as of a specific date. 

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```csharp
using System;
using System.Threading.Tasks;
using FactSet.SDK.Utils.Authentication;
using FactSet.SDK.FactSetEstimates.Api;
using FactSet.SDK.FactSetEstimates.Client;
using FactSet.SDK.FactSetEstimates.Model;

namespace Example
{
    public class GetConsensusRatingsExample
    {
        public static async Task Main()
        {
            var config = new FactSet.SDK.FactSetEstimates.Client.Configuration();

            // Examples for each supported authentication method are below,
            // choose one that satisfies your use case.

            /* (Preferred) OAuth 2.0: FactSetOAuth2 */
            // See https://github.com/FactSet/enterprise-sdk#oauth-20
            // for information on how to create the app-config.json file
            //
            // The confidential client instance should be reused in production environments.
            // See https://github.com/FactSet/enterprise-sdk-utils-dotnet#authentication
            // for more information on using the ConfidentialClient class
            ConfidentialClient confidentialClient = await ConfidentialClient.CreateAsync("/path/to/app-config.json");
            config.OAuth2Client = confidentialClient;

            /* Basic authentication: FactSetApiKey */
            // See https://github.com/FactSet/enterprise-sdk#api-key
            // for information how to create an API key
            // config.Username = "USERNAME-SERIAL";
            // config.Password = "API-KEY";

            var apiInstance = new RatingsApi(config);

            var ids = new List<string>(); // List<string> | Security or Entity identifiers. FactSet Identifiers, tickers, CUSIP and SEDOL are accepted input. <p>***ids limit** =  3000 per request*</p> * Make Note - id limit of 3000 for defaults, otherwise the service is limited to a 30 second duration. This can be reached when increasing total number of metrics requested and depth of history. * 
            var startDate = "2019-07-30";  // string | Start date for point in time of estimates expressed in YYYY-MM-DD format. (optional) 
            var endDate = "2020-07-30";  // string | End date for point in time of estimates expressed in YYYY-MM-DD format. (optional) 
            var frequency = "D";  // string | Controls the frequency of the data returned.   * **D** = Daily   * **W** = Weekly, based on the last day of the week of the start date.   * **AM** = Monthly, based on the start date (e.g., if the start date is June 16, data is displayed for June 16, May 16, April 16 etc.).         * **AQ** = Quarterly, based on the start date.   * **AY** = Actual Annual, based on the start date.   (optional)  (default to D)

            try
            {
                // Ratings consensus estimates to fetch Buy, Overweight, Hold, Underweight, and Sell.
                ConsensusRatingsResponse result = apiInstance.GetConsensusRatings(ids, startDate, endDate, frequency);
                Console.WriteLine(result.ToJson());
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling RatingsApi.GetConsensusRatings: " + e.Message );
                Console.WriteLine("Status Code: "+ e.ErrorCode);
                Console.WriteLine(e.StackTrace);
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ids** | [**List&lt;string&gt;**](string.md)| Security or Entity identifiers. FactSet Identifiers, tickers, CUSIP and SEDOL are accepted input. &lt;p&gt;***ids limit** &#x3D;  3000 per request*&lt;/p&gt; * Make Note - id limit of 3000 for defaults, otherwise the service is limited to a 30 second duration. This can be reached when increasing total number of metrics requested and depth of history. *  | 
 **startDate** | **string**| Start date for point in time of estimates expressed in YYYY-MM-DD format. | [optional] 
 **endDate** | **string**| End date for point in time of estimates expressed in YYYY-MM-DD format. | [optional] 
 **frequency** | **string**| Controls the frequency of the data returned.   * **D** &#x3D; Daily   * **W** &#x3D; Weekly, based on the last day of the week of the start date.   * **AM** &#x3D; Monthly, based on the start date (e.g., if the start date is June 16, data is displayed for June 16, May 16, April 16 etc.).         * **AQ** &#x3D; Quarterly, based on the start date.   * **AY** &#x3D; Actual Annual, based on the start date.   | [optional] [default to D]

### Return type
[**ConsensusRatingsResponse**](ConsensusRatingsResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Estimate data items |  -  |
| **400** | Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. |  -  |
| **401** | Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. |  -  |
| **403** | The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. |  -  |
| **415** | Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. |  -  |
| **500** | Internal Server Error. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


<a name="getconsensusratingsforlist"></a>
# **GetConsensusRatingsForList**
> ConsensusRatingsResponse GetConsensusRatingsForList (ConsensusRatingsRequest consensusRatingsRequest)

Ratings consensus estimates to fetch Buy, Overweight, Hold, Underweight, and Sell.

Returns ratings from the FactSet Estimates database for current and historical for an individual security using rolling fiscal dates as of a specific date. 

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```csharp
using System;
using System.Threading.Tasks;
using FactSet.SDK.Utils.Authentication;
using FactSet.SDK.FactSetEstimates.Api;
using FactSet.SDK.FactSetEstimates.Client;
using FactSet.SDK.FactSetEstimates.Model;

namespace Example
{
    public class GetConsensusRatingsForListExample
    {
        public static async Task Main()
        {
            var config = new FactSet.SDK.FactSetEstimates.Client.Configuration();

            // Examples for each supported authentication method are below,
            // choose one that satisfies your use case.

            /* (Preferred) OAuth 2.0: FactSetOAuth2 */
            // See https://github.com/FactSet/enterprise-sdk#oauth-20
            // for information on how to create the app-config.json file
            //
            // The confidential client instance should be reused in production environments.
            // See https://github.com/FactSet/enterprise-sdk-utils-dotnet#authentication
            // for more information on using the ConfidentialClient class
            ConfidentialClient confidentialClient = await ConfidentialClient.CreateAsync("/path/to/app-config.json");
            config.OAuth2Client = confidentialClient;

            /* Basic authentication: FactSetApiKey */
            // See https://github.com/FactSet/enterprise-sdk#api-key
            // for information how to create an API key
            // config.Username = "USERNAME-SERIAL";
            // config.Password = "API-KEY";

            var apiInstance = new RatingsApi(config);

            var consensusRatingsRequest = new ConsensusRatingsRequest(); // ConsensusRatingsRequest | Request object for Estimate Data Items.

            try
            {
                // Ratings consensus estimates to fetch Buy, Overweight, Hold, Underweight, and Sell.
                ConsensusRatingsResponse result = apiInstance.GetConsensusRatingsForList(consensusRatingsRequest);
                Console.WriteLine(result.ToJson());
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling RatingsApi.GetConsensusRatingsForList: " + e.Message );
                Console.WriteLine("Status Code: "+ e.ErrorCode);
                Console.WriteLine(e.StackTrace);
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **consensusRatingsRequest** | [**ConsensusRatingsRequest**](ConsensusRatingsRequest.md)| Request object for Estimate Data Items. | 

### Return type
[**ConsensusRatingsResponse**](ConsensusRatingsResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Estimate data items |  -  |
| **400** | Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. |  -  |
| **401** | Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. |  -  |
| **403** | The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. |  -  |
| **415** | Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. |  -  |
| **500** | Internal Server Error. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


<a name="getdetailratings"></a>
# **GetDetailRatings**
> DetailRatingsResponse GetDetailRatings (List<string> ids, string startDate = null, string endDate = null, bool? includeAll = null)

Broker Detail estimates to fetch Buy, Overweight, Hold, Underweight, and Sell.

Retrieves the Broker Level ratings for the requested Id and date range. Ratings include Buy, Hold, Sell, Overweight, and Underweight. <p>The `startDate` and `endDate` parameters controls the range of perspective dates. By default, the service will return the range of estimateDates within the latest company's reporting period. As you expand the date range, additional full historical reporting periods and all ratings estimateDates per broker will be returned.</p> 

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```csharp
using System;
using System.Threading.Tasks;
using FactSet.SDK.Utils.Authentication;
using FactSet.SDK.FactSetEstimates.Api;
using FactSet.SDK.FactSetEstimates.Client;
using FactSet.SDK.FactSetEstimates.Model;

namespace Example
{
    public class GetDetailRatingsExample
    {
        public static async Task Main()
        {
            var config = new FactSet.SDK.FactSetEstimates.Client.Configuration();

            // Examples for each supported authentication method are below,
            // choose one that satisfies your use case.

            /* (Preferred) OAuth 2.0: FactSetOAuth2 */
            // See https://github.com/FactSet/enterprise-sdk#oauth-20
            // for information on how to create the app-config.json file
            //
            // The confidential client instance should be reused in production environments.
            // See https://github.com/FactSet/enterprise-sdk-utils-dotnet#authentication
            // for more information on using the ConfidentialClient class
            ConfidentialClient confidentialClient = await ConfidentialClient.CreateAsync("/path/to/app-config.json");
            config.OAuth2Client = confidentialClient;

            /* Basic authentication: FactSetApiKey */
            // See https://github.com/FactSet/enterprise-sdk#api-key
            // for information how to create an API key
            // config.Username = "USERNAME-SERIAL";
            // config.Password = "API-KEY";

            var apiInstance = new RatingsApi(config);

            var ids = new List<string>(); // List<string> | Security or Entity identifiers. FactSet Identifiers, tickers, CUSIP and SEDOL are accepted input. <p>***ids limit** =  3000 per request*</p> * Make Note - id limit of 3000 for defaults, otherwise the service is limited to a 30 second duration. This can be reached when increasing total number of metrics requested and depth of history. * 
            var startDate = "2019-07-30";  // string | Start date for point in time of estimates expressed in YYYY-MM-DD format. (optional) 
            var endDate = "2020-07-30";  // string | End date for point in time of estimates expressed in YYYY-MM-DD format. (optional) 
            var includeAll = false;  // bool? | Include All filter is used to identify included and excluded broker details from the consensus   By default the service would return only the brokers included in the consensus-   * **TRUE** = Returns all the brokers included and excluded in the consensus   * **FALSE** = Returns only the broker details included in the consensus     (optional)  (default to false)

            try
            {
                // Broker Detail estimates to fetch Buy, Overweight, Hold, Underweight, and Sell.
                DetailRatingsResponse result = apiInstance.GetDetailRatings(ids, startDate, endDate, includeAll);
                Console.WriteLine(result.ToJson());
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling RatingsApi.GetDetailRatings: " + e.Message );
                Console.WriteLine("Status Code: "+ e.ErrorCode);
                Console.WriteLine(e.StackTrace);
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ids** | [**List&lt;string&gt;**](string.md)| Security or Entity identifiers. FactSet Identifiers, tickers, CUSIP and SEDOL are accepted input. &lt;p&gt;***ids limit** &#x3D;  3000 per request*&lt;/p&gt; * Make Note - id limit of 3000 for defaults, otherwise the service is limited to a 30 second duration. This can be reached when increasing total number of metrics requested and depth of history. *  | 
 **startDate** | **string**| Start date for point in time of estimates expressed in YYYY-MM-DD format. | [optional] 
 **endDate** | **string**| End date for point in time of estimates expressed in YYYY-MM-DD format. | [optional] 
 **includeAll** | **bool?**| Include All filter is used to identify included and excluded broker details from the consensus   By default the service would return only the brokers included in the consensus-   * **TRUE** &#x3D; Returns all the brokers included and excluded in the consensus   * **FALSE** &#x3D; Returns only the broker details included in the consensus     | [optional] [default to false]

### Return type
[**DetailRatingsResponse**](DetailRatingsResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Estimate Ratings data items |  -  |
| **400** | Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. |  -  |
| **401** | Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. |  -  |
| **403** | The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. |  -  |
| **415** | Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. |  -  |
| **500** | Internal Server Error. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


<a name="getdetailratingsforlist"></a>
# **GetDetailRatingsForList**
> DetailRatingsResponse GetDetailRatingsForList (DetailRatingsRequest detailRatingsRequest)

Broker Detail estimates to fetch Buy, Overweight, Hold, Underweight, and Sell.

Retrieves the Broker Level ratings for the requested Id and date range. Ratings include Buy, Hold, Sell, Overweight, and Underweight. <p>The `startDate` and `endDate` parameters controls the range of perspective dates. By default, the service will return the range of estimateDates within the latest company's reporting period. As you expand the date range, additional full historical reporting periods and all ratings estimateDates per broker will be returned.</p> 

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```csharp
using System;
using System.Threading.Tasks;
using FactSet.SDK.Utils.Authentication;
using FactSet.SDK.FactSetEstimates.Api;
using FactSet.SDK.FactSetEstimates.Client;
using FactSet.SDK.FactSetEstimates.Model;

namespace Example
{
    public class GetDetailRatingsForListExample
    {
        public static async Task Main()
        {
            var config = new FactSet.SDK.FactSetEstimates.Client.Configuration();

            // Examples for each supported authentication method are below,
            // choose one that satisfies your use case.

            /* (Preferred) OAuth 2.0: FactSetOAuth2 */
            // See https://github.com/FactSet/enterprise-sdk#oauth-20
            // for information on how to create the app-config.json file
            //
            // The confidential client instance should be reused in production environments.
            // See https://github.com/FactSet/enterprise-sdk-utils-dotnet#authentication
            // for more information on using the ConfidentialClient class
            ConfidentialClient confidentialClient = await ConfidentialClient.CreateAsync("/path/to/app-config.json");
            config.OAuth2Client = confidentialClient;

            /* Basic authentication: FactSetApiKey */
            // See https://github.com/FactSet/enterprise-sdk#api-key
            // for information how to create an API key
            // config.Username = "USERNAME-SERIAL";
            // config.Password = "API-KEY";

            var apiInstance = new RatingsApi(config);

            var detailRatingsRequest = new DetailRatingsRequest(); // DetailRatingsRequest | Request object for Detail Reatings Data Items.

            try
            {
                // Broker Detail estimates to fetch Buy, Overweight, Hold, Underweight, and Sell.
                DetailRatingsResponse result = apiInstance.GetDetailRatingsForList(detailRatingsRequest);
                Console.WriteLine(result.ToJson());
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling RatingsApi.GetDetailRatingsForList: " + e.Message );
                Console.WriteLine("Status Code: "+ e.ErrorCode);
                Console.WriteLine(e.StackTrace);
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **detailRatingsRequest** | [**DetailRatingsRequest**](DetailRatingsRequest.md)| Request object for Detail Reatings Data Items. | 

### Return type
[**DetailRatingsResponse**](DetailRatingsResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Estimate Detail Ratings data items |  -  |
| **400** | Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. |  -  |
| **401** | Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. |  -  |
| **403** | The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. |  -  |
| **415** | Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. |  -  |
| **500** | Internal Server Error. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


