# FactSet.SDK.FactSetPrivateEquityandVentureCapital.Api.UniverseApi

All URIs are relative to *https://api.factset.com/content/factset-pevc/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**GetUniverse**](UniverseApi.md#getuniverse) | **GET** /universe | Returns Entity Candidates and Matches for a single name and attributes.



<a name="getuniverse"></a>
# **GetUniverse**
> EntityMatchesResponse GetUniverse (string name, string country = null, List<string> entityType = null)

Returns Entity Candidates and Matches for a single name and attributes.

Finds the best candidate entities matching the given entity name. Country code can also be supplied to narrow the search.  Returns a list of potential entity matches, along with a match indicator, to assist in identifying the correct entity within the FactSet universe.  **Max of 1 Name permitted in a single request.** 

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
    public class GetUniverseExample
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

            var apiInstance = new UniverseApi(config);

            var name = "Alto Pharmacy";  // string | The proper name of a Private Equity/Venture Capital firm, Fund, or Portfolio Company to be matched against the FactSet entity universe.<br/>  <p>***max length** =  200 per request*</p> 
            var country = "US";  // string | The two-character ISO2 country code corresponding to the entity's primary location. Providing this code helps to narrow the entity match candidates, significantly improving the accuracy of the matching algorithm. For a list of ISO2 Country codes, visit [OA 8754](https://my.apps.factset.com/oa/pages/8754). (optional) 
            var entityType = new List<string>(); // List<string> | Three-character FactSet entity type code used to filter candidates in order to determine the final match result.   |Entity Type Code|Entity Type Description|Entity Type Code|Entity Type Description|   |- --|- --|- --|- --|   |PVT|Private Company|SUB|Subsidiary|   |HOL|Holding Company|JVT|Joint Venture|   |NPO|Non-Profit Organization|      |Entity Type Code|Entity Type Description|Entity Type Code|Entity Type Description|   |- --|- --|- --|- --|   |FAF| Family of Funds (Venture Capital/Private Equity)|PVF|Private Equity Fund / Alternative Investment|   |VEN|Venture Capital Fund| (optional) 

            try
            {
                // Returns Entity Candidates and Matches for a single name and attributes.
                EntityMatchesResponse result = apiInstance.GetUniverse(name, country, entityType);
                Console.WriteLine(result.ToJson());
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling UniverseApi.GetUniverse: " + e.Message );
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
 **name** | **string**| The proper name of a Private Equity/Venture Capital firm, Fund, or Portfolio Company to be matched against the FactSet entity universe.&lt;br/&gt;  &lt;p&gt;***max length** &#x3D;  200 per request*&lt;/p&gt;  | 
 **country** | **string**| The two-character ISO2 country code corresponding to the entity&#39;s primary location. Providing this code helps to narrow the entity match candidates, significantly improving the accuracy of the matching algorithm. For a list of ISO2 Country codes, visit [OA 8754](https://my.apps.factset.com/oa/pages/8754). | [optional] 
 **entityType** | [**List&lt;string&gt;**](string.md)| Three-character FactSet entity type code used to filter candidates in order to determine the final match result.   |Entity Type Code|Entity Type Description|Entity Type Code|Entity Type Description|   |- --|- --|- --|- --|   |PVT|Private Company|SUB|Subsidiary|   |HOL|Holding Company|JVT|Joint Venture|   |NPO|Non-Profit Organization|      |Entity Type Code|Entity Type Description|Entity Type Code|Entity Type Description|   |- --|- --|- --|- --|   |FAF| Family of Funds (Venture Capital/Private Equity)|PVF|Private Equity Fund / Alternative Investment|   |VEN|Venture Capital Fund| | [optional] 

### Return type
[**EntityMatchesResponse**](EntityMatchesResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Response containing Entity Match results. |  -  |
| **400** | Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. |  -  |
| **401** | Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. |  -  |
| **403** | The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was legal, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. |  -  |
| **415** | Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that the Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. |  -  |
| **500** | Internal Server Error. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


