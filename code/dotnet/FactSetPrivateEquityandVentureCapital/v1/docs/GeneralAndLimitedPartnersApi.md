# FactSet.SDK.FactSetPrivateEquityandVentureCapital.Api.GeneralAndLimitedPartnersApi

All URIs are relative to *https://api.factset.com/content/factset-pevc/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**GetFundLimitedPartners**](GeneralAndLimitedPartnersApi.md#getfundlimitedpartners) | **GET** /limited-partners/funds | Retrieve the Limited Partners (LPs) and their capital commitments to specific funds.
[**GetGP**](GeneralAndLimitedPartnersApi.md#getgp) | **GET** /general-partners | Retrieve core profile and summary data for specified General Partner (GP) firms.
[**GetGPFunds**](GeneralAndLimitedPartnersApi.md#getgpfunds) | **GET** /general-partners/funds | Retrieve the list of all Private Equity and Venture Capital Funds managed by specified General Partners.



<a name="getfundlimitedpartners"></a>
# **GetFundLimitedPartners**
> FundLimitedPartnersResponse GetFundLimitedPartners (List<string> ids)

Retrieve the Limited Partners (LPs) and their capital commitments to specific funds.

Returns a list of **Limited Partners** (investors) associated with the specified funds, along with details of their **capital commitments** (investment amounts) and the **commit date**. This data is essential for understanding a fund's LP base.  Use the `/universe` endpoint and input the fund's name, setting the `entityType` to the most appropriate type (e.g., VEN, FAF, PVF).

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```csharp
using System;
using System.Threading.Tasks;
using FactSet.SDK.Utils.Authentication;
using FactSet.SDK.FactSetPrivateEquityandVentureCapital.Api;
using FactSet.SDK.FactSetPrivateEquityandVentureCapital.Client;
using FactSet.SDK.FactSetPrivateEquityandVentureCapital.Model;

namespace Example
{
    public class GetFundLimitedPartnersExample
    {
        public static async Task Main()
        {
            var config = new FactSet.SDK.FactSetPrivateEquityandVentureCapital.Client.Configuration();

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

            var apiInstance = new GeneralAndLimitedPartnersApi(config);

            var ids = new List<string>(); // List<string> | A list of FactSet Permanent Entity Identifiers (FactSet IDs) for **Private Equity and Venture Capital Funds**. These IDs are in the format 'XXXXXX-E' and are the primary input for most fund-related endpoints. These IDs can be retrieved from the /universe endpoint

            try
            {
                // Retrieve the Limited Partners (LPs) and their capital commitments to specific funds.
                FundLimitedPartnersResponse result = apiInstance.GetFundLimitedPartners(ids);
                Console.WriteLine(result.ToJson());
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling GeneralAndLimitedPartnersApi.GetFundLimitedPartners: " + e.Message );
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
 **ids** | [**List&lt;string&gt;**](string.md)| A list of FactSet Permanent Entity Identifiers (FactSet IDs) for **Private Equity and Venture Capital Funds**. These IDs are in the format &#39;XXXXXX-E&#39; and are the primary input for most fund-related endpoints. These IDs can be retrieved from the /universe endpoint | 

### Return type
[**FundLimitedPartnersResponse**](FundLimitedPartnersResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response |  -  |
| **400** | Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. |  -  |
| **401** | Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. |  -  |
| **403** | The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was legal, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. |  -  |
| **415** | Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that the Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. |  -  |
| **500** | Internal Server Error. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


<a name="getgp"></a>
# **GetGP**
> GPDetailsResponse GetGP (List<string> ids, DateTime? asOfDate = null)

Retrieve core profile and summary data for specified General Partner (GP) firms.

Retrieves the primary descriptive and profile information for one or more General Partner firms. This includes firm-level details such as the **Asset Under Management (AUM)** and a high-level overview of their **investment strategy** (e.g., target industry, geography).  Use the `/universe` endpoint and input the GP firm name, with `entityType` set to `HOL`. Only use `entityId` values whose `entityTypeCode` is `HOL` in your request.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```csharp
using System;
using System.Threading.Tasks;
using FactSet.SDK.Utils.Authentication;
using FactSet.SDK.FactSetPrivateEquityandVentureCapital.Api;
using FactSet.SDK.FactSetPrivateEquityandVentureCapital.Client;
using FactSet.SDK.FactSetPrivateEquityandVentureCapital.Model;

namespace Example
{
    public class GetGPExample
    {
        public static async Task Main()
        {
            var config = new FactSet.SDK.FactSetPrivateEquityandVentureCapital.Client.Configuration();

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

            var apiInstance = new GeneralAndLimitedPartnersApi(config);

            var ids = new List<string>(); // List<string> | A list of FactSet Permanent Entity Identifiers (FactSet IDs) for **General Partner (GP) firms**. These IDs are used to identify the management companies of the funds.
            var asOfDate = DateTime.Parse("2023-08-27");  // DateTime? | The as-of date for the AUM data in **YYYY-MM-DD** format. Returns the AUM value as of the specified date.  Note:  - If omitted: The response will return the latest available AUM data. - Future dates (T+1) are not accepted in this endpoint.  (optional) 

            try
            {
                // Retrieve core profile and summary data for specified General Partner (GP) firms.
                GPDetailsResponse result = apiInstance.GetGP(ids, asOfDate);
                Console.WriteLine(result.ToJson());
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling GeneralAndLimitedPartnersApi.GetGP: " + e.Message );
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
 **ids** | [**List&lt;string&gt;**](string.md)| A list of FactSet Permanent Entity Identifiers (FactSet IDs) for **General Partner (GP) firms**. These IDs are used to identify the management companies of the funds. | 
 **asOfDate** | **DateTime?**| The as-of date for the AUM data in **YYYY-MM-DD** format. Returns the AUM value as of the specified date.  Note:  - If omitted: The response will return the latest available AUM data. - Future dates (T+1) are not accepted in this endpoint.  | [optional] 

### Return type
[**GPDetailsResponse**](GPDetailsResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response |  -  |
| **400** | Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. |  -  |
| **401** | Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. |  -  |
| **403** | The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was legal, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. |  -  |
| **415** | Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that the Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. |  -  |
| **500** | Internal Server Error. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


<a name="getgpfunds"></a>
# **GetGPFunds**
> GPFundsResponse GetGPFunds (List<string> ids)

Retrieve the list of all Private Equity and Venture Capital Funds managed by specified General Partners.

Returns a list of all Private Equity and Venture Capital funds that are actively or historically managed by the specified General Partner firms. This provides a complete view of a GP's fund vintage and strategy history.  Use the `/universe` endpoint and input the GP firm name, with `entityType` set to `HOL`. Only use `entityId` values whose `entityTypeCode` is `HOL` in your request.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```csharp
using System;
using System.Threading.Tasks;
using FactSet.SDK.Utils.Authentication;
using FactSet.SDK.FactSetPrivateEquityandVentureCapital.Api;
using FactSet.SDK.FactSetPrivateEquityandVentureCapital.Client;
using FactSet.SDK.FactSetPrivateEquityandVentureCapital.Model;

namespace Example
{
    public class GetGPFundsExample
    {
        public static async Task Main()
        {
            var config = new FactSet.SDK.FactSetPrivateEquityandVentureCapital.Client.Configuration();

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

            var apiInstance = new GeneralAndLimitedPartnersApi(config);

            var ids = new List<string>(); // List<string> | A list of FactSet Permanent Entity Identifiers (FactSet IDs) for **General Partner (GP) firms**. These IDs are used to identify the management companies of the funds.

            try
            {
                // Retrieve the list of all Private Equity and Venture Capital Funds managed by specified General Partners.
                GPFundsResponse result = apiInstance.GetGPFunds(ids);
                Console.WriteLine(result.ToJson());
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling GeneralAndLimitedPartnersApi.GetGPFunds: " + e.Message );
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
 **ids** | [**List&lt;string&gt;**](string.md)| A list of FactSet Permanent Entity Identifiers (FactSet IDs) for **General Partner (GP) firms**. These IDs are used to identify the management companies of the funds. | 

### Return type
[**GPFundsResponse**](GPFundsResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response |  -  |
| **400** | Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. |  -  |
| **401** | Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. |  -  |
| **403** | The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was legal, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. |  -  |
| **415** | Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that the Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. |  -  |
| **500** | Internal Server Error. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


