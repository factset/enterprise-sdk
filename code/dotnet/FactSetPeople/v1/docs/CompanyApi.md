# FactSet.SDK.FactSetPeople.Api.CompanyApi

All URIs are relative to *https://api.factset.com/content*

Method | HTTP request | Description
------------- | ------------- | -------------
[**GetCompanyCompensation**](CompanyApi.md#getcompanycompensation) | **GET** /factset-people/v1/company-compensation | Returns the compensation details of the people for the specified company identifier
[**GetCompanyCompensationForList**](CompanyApi.md#getcompanycompensationforlist) | **POST** /factset-people/v1/company-compensation | Returns the compensation details for the people for the specified company identifier
[**GetCompanyPeople**](CompanyApi.md#getcompanypeople) | **GET** /factset-people/v1/company-people | Returns the list of people for the specified company identifiers
[**GetCompanyPeopleForList**](CompanyApi.md#getcompanypeopleforlist) | **POST** /factset-people/v1/company-people | Returns the list of people associated for a large list of company identitifers
[**GetCompanyPositions**](CompanyApi.md#getcompanypositions) | **GET** /factset-people/v1/company-positions | Returns the list of people for the specified company identifiers and position
[**GetCompanyPositionsForList**](CompanyApi.md#getcompanypositionsforlist) | **POST** /factset-people/v1/company-positions | Returns the list of people associated for a large list of company identitifers and position
[**GetCompanyStats**](CompanyApi.md#getcompanystats) | **GET** /factset-people/v1/company-stats | Returns statistics about top leadership of a company.
[**GetCompanyStatsForList**](CompanyApi.md#getcompanystatsforlist) | **POST** /factset-people/v1/company-stats | Returns statistics about top leadership of a company.



<a name="getcompanycompensation"></a>
# **GetCompanyCompensation**
> CompanyCompensationResponse GetCompanyCompensation (List<string> ids)

Returns the compensation details of the people for the specified company identifier

Returns the list of company-level executive compensation data items for the top executives listed in annual filings.The coverage of the compensation details for the executives are limited to US region. All the compensation figures are expressed in raw units.  

### Example
```csharp
using System;
using System.Threading.Tasks;
using FactSet.SDK.Utils.Authentication;
using FactSet.SDK.FactSetPeople.Api;
using FactSet.SDK.FactSetPeople.Client;
using FactSet.SDK.FactSetPeople.Model;

namespace Example
{
    public class GetCompanyCompensationExample
    {
        public static async Task Main()
        {
            var config = new FactSet.SDK.FactSetPeople.Client.Configuration();

            // Examples for each supported authentication method are below,
            // choose one that satisfies your use case.

            /* (Preferred) OAuth 2.0: FactSetOAuth2 */
            // See https://github.com/FactSet/enterprise-sdk#oauth-20
            // for information on how to create the app-config.json file
            // See https://github.com/FactSet/enterprise-sdk-utils-dotnet#authentication
            // for more information on using the ConfidentialClient class
            ConfidentialClient confidentialClient = await ConfidentialClient.CreateAsync("/path/to/app-config.json");
            config.OAuth2Client = confidentialClient;

            /* Basic authentication: FactSetApiKey */
            // See https://github.com/FactSet/enterprise-sdk#api-key
            // for information how to create an API key
            // config.Username = "USERNAME-SERIAL";
            // config.Password = "API-KEY";

            var apiInstance = new CompanyApi(config);

            var ids = new List<string>(); // List<string> | The requested company identifier. FactSet Identifiers, tickers, CUSIP, SEDOL, and ISIN are accepted inputs. <p>***ids limit** =  1000 per request*</p> *<p>Make note, GET Method URL request lines are also limited to a total length of 8192 bytes (8KB). In cases where the service allows for thousands of ids, which may lead to exceeding this request line limit of 8KB, its advised for any requests with large request lines to be requested through the respective \"POST\" method.</p>* 

            try
            {
                // Returns the compensation details of the people for the specified company identifier
                CompanyCompensationResponse result = apiInstance.GetCompanyCompensation(ids);
                Console.WriteLine(result.ToJson());
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling CompanyApi.GetCompanyCompensation: " + e.Message );
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
 **ids** | [**List&lt;string&gt;**](string.md)| The requested company identifier. FactSet Identifiers, tickers, CUSIP, SEDOL, and ISIN are accepted inputs. &lt;p&gt;***ids limit** &#x3D;  1000 per request*&lt;/p&gt; *&lt;p&gt;Make note, GET Method URL request lines are also limited to a total length of 8192 bytes (8KB). In cases where the service allows for thousands of ids, which may lead to exceeding this request line limit of 8KB, its advised for any requests with large request lines to be requested through the respective \&quot;POST\&quot; method.&lt;/p&gt;*  | 

### Return type
[**CompanyCompensationResponse**](CompanyCompensationResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Array of Company Compensation objects. |  -  |
| **400** | Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. |  -  |
| **401** | Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. |  -  |
| **403** | The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. |  -  |
| **415** | Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. |  -  |
| **500** | Internal Server Error. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


<a name="getcompanycompensationforlist"></a>
# **GetCompanyCompensationForList**
> CompanyCompensationResponse GetCompanyCompensationForList (CompanyCompensationRequest companyCompensationRequest)

Returns the compensation details for the people for the specified company identifier

Returns the list of company-level executive compensation data items for the top executives listed in annual filings for the most recent fiscal year. The coverage of the compensation details for the executives are limited to US region. All the compensation figures are expressed in raw units.  

### Example
```csharp
using System;
using System.Threading.Tasks;
using FactSet.SDK.Utils.Authentication;
using FactSet.SDK.FactSetPeople.Api;
using FactSet.SDK.FactSetPeople.Client;
using FactSet.SDK.FactSetPeople.Model;

namespace Example
{
    public class GetCompanyCompensationForListExample
    {
        public static async Task Main()
        {
            var config = new FactSet.SDK.FactSetPeople.Client.Configuration();

            // Examples for each supported authentication method are below,
            // choose one that satisfies your use case.

            /* (Preferred) OAuth 2.0: FactSetOAuth2 */
            // See https://github.com/FactSet/enterprise-sdk#oauth-20
            // for information on how to create the app-config.json file
            // See https://github.com/FactSet/enterprise-sdk-utils-dotnet#authentication
            // for more information on using the ConfidentialClient class
            ConfidentialClient confidentialClient = await ConfidentialClient.CreateAsync("/path/to/app-config.json");
            config.OAuth2Client = confidentialClient;

            /* Basic authentication: FactSetApiKey */
            // See https://github.com/FactSet/enterprise-sdk#api-key
            // for information how to create an API key
            // config.Username = "USERNAME-SERIAL";
            // config.Password = "API-KEY";

            var apiInstance = new CompanyApi(config);

            var companyCompensationRequest = new CompanyCompensationRequest(); // CompanyCompensationRequest | 

            try
            {
                // Returns the compensation details for the people for the specified company identifier
                CompanyCompensationResponse result = apiInstance.GetCompanyCompensationForList(companyCompensationRequest);
                Console.WriteLine(result.ToJson());
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling CompanyApi.GetCompanyCompensationForList: " + e.Message );
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
 **companyCompensationRequest** | [**CompanyCompensationRequest**](CompanyCompensationRequest.md)|  | 

### Return type
[**CompanyCompensationResponse**](CompanyCompensationResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Array of Company Positions objects. |  -  |
| **400** | Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. |  -  |
| **401** | Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. |  -  |
| **403** | The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. |  -  |
| **415** | Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. |  -  |
| **500** | Internal Server Error. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


<a name="getcompanypeople"></a>
# **GetCompanyPeople**
> CompanyPeopleResponse GetCompanyPeople (List<string> ids, string function = null)

Returns the list of people for the specified company identifiers

Returns the list of executives associated the company identifier requested. Information includes the job functions, email, phone, title, name, and FactSet Entity Identifier. The personId returned can then be used in the `/profiles` endpoint to learn more about the given person. 

### Example
```csharp
using System;
using System.Threading.Tasks;
using FactSet.SDK.Utils.Authentication;
using FactSet.SDK.FactSetPeople.Api;
using FactSet.SDK.FactSetPeople.Client;
using FactSet.SDK.FactSetPeople.Model;

namespace Example
{
    public class GetCompanyPeopleExample
    {
        public static async Task Main()
        {
            var config = new FactSet.SDK.FactSetPeople.Client.Configuration();

            // Examples for each supported authentication method are below,
            // choose one that satisfies your use case.

            /* (Preferred) OAuth 2.0: FactSetOAuth2 */
            // See https://github.com/FactSet/enterprise-sdk#oauth-20
            // for information on how to create the app-config.json file
            // See https://github.com/FactSet/enterprise-sdk-utils-dotnet#authentication
            // for more information on using the ConfidentialClient class
            ConfidentialClient confidentialClient = await ConfidentialClient.CreateAsync("/path/to/app-config.json");
            config.OAuth2Client = confidentialClient;

            /* Basic authentication: FactSetApiKey */
            // See https://github.com/FactSet/enterprise-sdk#api-key
            // for information how to create an API key
            // config.Username = "USERNAME-SERIAL";
            // config.Password = "API-KEY";

            var apiInstance = new CompanyApi(config);

            var ids = new List<string>(); // List<string> | The requested company identifier. FactSet Identifiers, tickers, CUSIP, SEDOL, and ISIN are accepted inputs. <p>***ids limit** =  1000 per request*</p> *<p>Make note, GET Method URL request lines are also limited to a total length of 8192 bytes (8KB). In cases where the service allows for thousands of ids, which may lead to exceeding this request line limit of 8KB, its advised for any requests with large request lines to be requested through the respective \"POST\" method.</p>* 
            var function = "PEOPLE";  // string | Controls the types of people returned based on high-level job functions. Filter by -    |function|description|   |- --|- --|   |PEOPLE|Retrieve **ALL** Executives of a requested company|   |OFFICER|Retrieve only the Officers of a requested company|   |DIRECTOR|Retrieve only the Directors of a requested company|  (optional)  (default to PEOPLE)

            try
            {
                // Returns the list of people for the specified company identifiers
                CompanyPeopleResponse result = apiInstance.GetCompanyPeople(ids, function);
                Console.WriteLine(result.ToJson());
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling CompanyApi.GetCompanyPeople: " + e.Message );
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
 **ids** | [**List&lt;string&gt;**](string.md)| The requested company identifier. FactSet Identifiers, tickers, CUSIP, SEDOL, and ISIN are accepted inputs. &lt;p&gt;***ids limit** &#x3D;  1000 per request*&lt;/p&gt; *&lt;p&gt;Make note, GET Method URL request lines are also limited to a total length of 8192 bytes (8KB). In cases where the service allows for thousands of ids, which may lead to exceeding this request line limit of 8KB, its advised for any requests with large request lines to be requested through the respective \&quot;POST\&quot; method.&lt;/p&gt;*  | 
 **function** | **string**| Controls the types of people returned based on high-level job functions. Filter by -    |function|description|   |- --|- --|   |PEOPLE|Retrieve **ALL** Executives of a requested company|   |OFFICER|Retrieve only the Officers of a requested company|   |DIRECTOR|Retrieve only the Directors of a requested company|  | [optional] [default to PEOPLE]

### Return type
[**CompanyPeopleResponse**](CompanyPeopleResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Array of Company People objects. |  -  |
| **400** | Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. |  -  |
| **401** | Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. |  -  |
| **403** | The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. |  -  |
| **415** | Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. |  -  |
| **500** | Internal Server Error. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


<a name="getcompanypeopleforlist"></a>
# **GetCompanyPeopleForList**
> CompanyPeopleResponse GetCompanyPeopleForList (CompanyPeopleRequest companyPeopleRequest)

Returns the list of people associated for a large list of company identitifers

Returns the list of executives associated the company identifier requested. Information includes the job functions, email, phone, title, name, and FactSet Entity Identifier. The personId returned can then be used in the /profiles endpoint to learn more about the given person. 

### Example
```csharp
using System;
using System.Threading.Tasks;
using FactSet.SDK.Utils.Authentication;
using FactSet.SDK.FactSetPeople.Api;
using FactSet.SDK.FactSetPeople.Client;
using FactSet.SDK.FactSetPeople.Model;

namespace Example
{
    public class GetCompanyPeopleForListExample
    {
        public static async Task Main()
        {
            var config = new FactSet.SDK.FactSetPeople.Client.Configuration();

            // Examples for each supported authentication method are below,
            // choose one that satisfies your use case.

            /* (Preferred) OAuth 2.0: FactSetOAuth2 */
            // See https://github.com/FactSet/enterprise-sdk#oauth-20
            // for information on how to create the app-config.json file
            // See https://github.com/FactSet/enterprise-sdk-utils-dotnet#authentication
            // for more information on using the ConfidentialClient class
            ConfidentialClient confidentialClient = await ConfidentialClient.CreateAsync("/path/to/app-config.json");
            config.OAuth2Client = confidentialClient;

            /* Basic authentication: FactSetApiKey */
            // See https://github.com/FactSet/enterprise-sdk#api-key
            // for information how to create an API key
            // config.Username = "USERNAME-SERIAL";
            // config.Password = "API-KEY";

            var apiInstance = new CompanyApi(config);

            var companyPeopleRequest = new CompanyPeopleRequest(); // CompanyPeopleRequest | 

            try
            {
                // Returns the list of people associated for a large list of company identitifers
                CompanyPeopleResponse result = apiInstance.GetCompanyPeopleForList(companyPeopleRequest);
                Console.WriteLine(result.ToJson());
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling CompanyApi.GetCompanyPeopleForList: " + e.Message );
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
 **companyPeopleRequest** | [**CompanyPeopleRequest**](CompanyPeopleRequest.md)|  | 

### Return type
[**CompanyPeopleResponse**](CompanyPeopleResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Array of Company People objects. |  -  |
| **400** | Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. |  -  |
| **401** | Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. |  -  |
| **403** | The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. |  -  |
| **415** | Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. |  -  |
| **500** | Internal Server Error. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


<a name="getcompanypositions"></a>
# **GetCompanyPositions**
> CompanyPositionsResponse GetCompanyPositions (List<string> ids, string position = null)

Returns the list of people for the specified company identifiers and position

Returns the list of people, name, and title for a list of company ids and requested position. Positions include-   * Chairman   * Chief Executive Officer   * President   * Chief Operating Officer   * Chief Financial Officer   * Chief Technology Officer   * Chief Investment Officer   * Founder(s)   * Compliance Officer   * Admin   * Independent Director   * Directors/Board Members   * Investor Relations   * Legal Counsel   * Treasurer   * Sales and Marketing Managers   * Human Resources 

### Example
```csharp
using System;
using System.Threading.Tasks;
using FactSet.SDK.Utils.Authentication;
using FactSet.SDK.FactSetPeople.Api;
using FactSet.SDK.FactSetPeople.Client;
using FactSet.SDK.FactSetPeople.Model;

namespace Example
{
    public class GetCompanyPositionsExample
    {
        public static async Task Main()
        {
            var config = new FactSet.SDK.FactSetPeople.Client.Configuration();

            // Examples for each supported authentication method are below,
            // choose one that satisfies your use case.

            /* (Preferred) OAuth 2.0: FactSetOAuth2 */
            // See https://github.com/FactSet/enterprise-sdk#oauth-20
            // for information on how to create the app-config.json file
            // See https://github.com/FactSet/enterprise-sdk-utils-dotnet#authentication
            // for more information on using the ConfidentialClient class
            ConfidentialClient confidentialClient = await ConfidentialClient.CreateAsync("/path/to/app-config.json");
            config.OAuth2Client = confidentialClient;

            /* Basic authentication: FactSetApiKey */
            // See https://github.com/FactSet/enterprise-sdk#api-key
            // for information how to create an API key
            // config.Username = "USERNAME-SERIAL";
            // config.Password = "API-KEY";

            var apiInstance = new CompanyApi(config);

            var ids = new List<string>(); // List<string> | The requested company identifier. FactSet Identifiers, tickers, CUSIP, SEDOL, and ISIN are accepted inputs. <p>***ids limit** =  1000 per request*</p> *<p>Make note, GET Method URL request lines are also limited to a total length of 8192 bytes (8KB). In cases where the service allows for thousands of ids, which may lead to exceeding this request line limit of 8KB, its advised for any requests with large request lines to be requested through the respective \"POST\" method.</p>* 
            var position = "CHAIR";  // string | Controls the position details returned for the requested company. By default, the service returns the CEO name, title, and ID for the requested company ids.   |position|description|   |- --|- --|   |CHAIR|Chairman|   |CEO|Chief Executive Officer|   |PRES|President|   |COO|Chief Operating Officer|   |CFO|Chief Financial Officer|   |CTO|Chief Technology Officer|   |CIO|Chief Investment Officer|   |FOU|Founder(s)|   |CMP|Compliance Officer|   |ADM|Admin|   |IND|Independent Director|   |BRD|Directors/Board Members|   |IR|Investor Relations|   |LEG|Legal Counsel|   |TREAS|Treasurer|   |MKT|Sales and Marketing Managers|   |HR|Human Resources|  (optional)  (default to CEO)

            try
            {
                // Returns the list of people for the specified company identifiers and position
                CompanyPositionsResponse result = apiInstance.GetCompanyPositions(ids, position);
                Console.WriteLine(result.ToJson());
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling CompanyApi.GetCompanyPositions: " + e.Message );
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
 **ids** | [**List&lt;string&gt;**](string.md)| The requested company identifier. FactSet Identifiers, tickers, CUSIP, SEDOL, and ISIN are accepted inputs. &lt;p&gt;***ids limit** &#x3D;  1000 per request*&lt;/p&gt; *&lt;p&gt;Make note, GET Method URL request lines are also limited to a total length of 8192 bytes (8KB). In cases where the service allows for thousands of ids, which may lead to exceeding this request line limit of 8KB, its advised for any requests with large request lines to be requested through the respective \&quot;POST\&quot; method.&lt;/p&gt;*  | 
 **position** | **string**| Controls the position details returned for the requested company. By default, the service returns the CEO name, title, and ID for the requested company ids.   |position|description|   |- --|- --|   |CHAIR|Chairman|   |CEO|Chief Executive Officer|   |PRES|President|   |COO|Chief Operating Officer|   |CFO|Chief Financial Officer|   |CTO|Chief Technology Officer|   |CIO|Chief Investment Officer|   |FOU|Founder(s)|   |CMP|Compliance Officer|   |ADM|Admin|   |IND|Independent Director|   |BRD|Directors/Board Members|   |IR|Investor Relations|   |LEG|Legal Counsel|   |TREAS|Treasurer|   |MKT|Sales and Marketing Managers|   |HR|Human Resources|  | [optional] [default to CEO]

### Return type
[**CompanyPositionsResponse**](CompanyPositionsResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Array of Company Positions objects. |  -  |
| **400** | Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. |  -  |
| **401** | Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. |  -  |
| **403** | The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. |  -  |
| **415** | Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. |  -  |
| **500** | Internal Server Error. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


<a name="getcompanypositionsforlist"></a>
# **GetCompanyPositionsForList**
> CompanyPositionsResponse GetCompanyPositionsForList (CompanyPositionsRequest companyPositionsRequest)

Returns the list of people associated for a large list of company identitifers and position

Returns the list of people, name, and title for a list of company ids and requested position. Positions include-   * Chairman   * Chief Executive Officer   * President   * Chief Operating Officer   * Chief Financial Officer   * Chief Technology Officer   * Chief Investment Officer   * Founder(s)   * Compliance Officer   * Admin   * Independent Director   * Directors/Board Members   * Investor Relations   * Legal Counsel   * Treasurer   * Sales and Marketing Managers   * Human Resources 

### Example
```csharp
using System;
using System.Threading.Tasks;
using FactSet.SDK.Utils.Authentication;
using FactSet.SDK.FactSetPeople.Api;
using FactSet.SDK.FactSetPeople.Client;
using FactSet.SDK.FactSetPeople.Model;

namespace Example
{
    public class GetCompanyPositionsForListExample
    {
        public static async Task Main()
        {
            var config = new FactSet.SDK.FactSetPeople.Client.Configuration();

            // Examples for each supported authentication method are below,
            // choose one that satisfies your use case.

            /* (Preferred) OAuth 2.0: FactSetOAuth2 */
            // See https://github.com/FactSet/enterprise-sdk#oauth-20
            // for information on how to create the app-config.json file
            // See https://github.com/FactSet/enterprise-sdk-utils-dotnet#authentication
            // for more information on using the ConfidentialClient class
            ConfidentialClient confidentialClient = await ConfidentialClient.CreateAsync("/path/to/app-config.json");
            config.OAuth2Client = confidentialClient;

            /* Basic authentication: FactSetApiKey */
            // See https://github.com/FactSet/enterprise-sdk#api-key
            // for information how to create an API key
            // config.Username = "USERNAME-SERIAL";
            // config.Password = "API-KEY";

            var apiInstance = new CompanyApi(config);

            var companyPositionsRequest = new CompanyPositionsRequest(); // CompanyPositionsRequest | 

            try
            {
                // Returns the list of people associated for a large list of company identitifers and position
                CompanyPositionsResponse result = apiInstance.GetCompanyPositionsForList(companyPositionsRequest);
                Console.WriteLine(result.ToJson());
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling CompanyApi.GetCompanyPositionsForList: " + e.Message );
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
 **companyPositionsRequest** | [**CompanyPositionsRequest**](CompanyPositionsRequest.md)|  | 

### Return type
[**CompanyPositionsResponse**](CompanyPositionsResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Array of Company Positions objects. |  -  |
| **400** | Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. |  -  |
| **401** | Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. |  -  |
| **403** | The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. |  -  |
| **415** | Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. |  -  |
| **500** | Internal Server Error. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


<a name="getcompanystats"></a>
# **GetCompanyStats**
> CompanyStatsResponse GetCompanyStats (List<string> ids, string mbType = null)

Returns statistics about top leadership of a company.

Returns the statistics such as the average age, tenure, compensation of leadership, number of executives, and the gender diversity of leadership. We can utilize the data for analyzing a company's board and management. 

### Example
```csharp
using System;
using System.Threading.Tasks;
using FactSet.SDK.Utils.Authentication;
using FactSet.SDK.FactSetPeople.Api;
using FactSet.SDK.FactSetPeople.Client;
using FactSet.SDK.FactSetPeople.Model;

namespace Example
{
    public class GetCompanyStatsExample
    {
        public static async Task Main()
        {
            var config = new FactSet.SDK.FactSetPeople.Client.Configuration();

            // Examples for each supported authentication method are below,
            // choose one that satisfies your use case.

            /* (Preferred) OAuth 2.0: FactSetOAuth2 */
            // See https://github.com/FactSet/enterprise-sdk#oauth-20
            // for information on how to create the app-config.json file
            // See https://github.com/FactSet/enterprise-sdk-utils-dotnet#authentication
            // for more information on using the ConfidentialClient class
            ConfidentialClient confidentialClient = await ConfidentialClient.CreateAsync("/path/to/app-config.json");
            config.OAuth2Client = confidentialClient;

            /* Basic authentication: FactSetApiKey */
            // See https://github.com/FactSet/enterprise-sdk#api-key
            // for information how to create an API key
            // config.Username = "USERNAME-SERIAL";
            // config.Password = "API-KEY";

            var apiInstance = new CompanyApi(config);

            var ids = new List<string>(); // List<string> | The requested company identifier. FactSet Identifiers, tickers, CUSIP, SEDOL, and ISIN are accepted inputs. <p>***ids limit** =  1000 per request*</p> *<p>Make note, GET Method URL request lines are also limited to a total length of 8192 bytes (8KB). In cases where the service allows for thousands of ids, which may lead to exceeding this request line limit of 8KB, its advised for any requests with large request lines to be requested through the respective \"POST\" method.</p>* 
            var mbType = "MB";  // string | Search based on the management and board types. The types include -  |type|description| |- --|- --| |MB|Management & Board| |MGMT|Management| |BRD|Board|  (optional)  (default to MB)

            try
            {
                // Returns statistics about top leadership of a company.
                CompanyStatsResponse result = apiInstance.GetCompanyStats(ids, mbType);
                Console.WriteLine(result.ToJson());
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling CompanyApi.GetCompanyStats: " + e.Message );
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
 **ids** | [**List&lt;string&gt;**](string.md)| The requested company identifier. FactSet Identifiers, tickers, CUSIP, SEDOL, and ISIN are accepted inputs. &lt;p&gt;***ids limit** &#x3D;  1000 per request*&lt;/p&gt; *&lt;p&gt;Make note, GET Method URL request lines are also limited to a total length of 8192 bytes (8KB). In cases where the service allows for thousands of ids, which may lead to exceeding this request line limit of 8KB, its advised for any requests with large request lines to be requested through the respective \&quot;POST\&quot; method.&lt;/p&gt;*  | 
 **mbType** | **string**| Search based on the management and board types. The types include -  |type|description| |- --|- --| |MB|Management &amp; Board| |MGMT|Management| |BRD|Board|  | [optional] [default to MB]

### Return type
[**CompanyStatsResponse**](CompanyStatsResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Array of Company Stats objects. |  -  |
| **400** | Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. |  -  |
| **401** | Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. |  -  |
| **403** | The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. |  -  |
| **415** | Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. |  -  |
| **500** | Internal Server Error. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


<a name="getcompanystatsforlist"></a>
# **GetCompanyStatsForList**
> CompanyStatsResponse GetCompanyStatsForList (CompanyStatsRequest companyStatsRequest)

Returns statistics about top leadership of a company.

Returns the statistics such as the average age, tenure, compensation of leadership, number of executives, and the gender diversity of leadership. We can utilize the data for analyzing a company's board and management.  

### Example
```csharp
using System;
using System.Threading.Tasks;
using FactSet.SDK.Utils.Authentication;
using FactSet.SDK.FactSetPeople.Api;
using FactSet.SDK.FactSetPeople.Client;
using FactSet.SDK.FactSetPeople.Model;

namespace Example
{
    public class GetCompanyStatsForListExample
    {
        public static async Task Main()
        {
            var config = new FactSet.SDK.FactSetPeople.Client.Configuration();

            // Examples for each supported authentication method are below,
            // choose one that satisfies your use case.

            /* (Preferred) OAuth 2.0: FactSetOAuth2 */
            // See https://github.com/FactSet/enterprise-sdk#oauth-20
            // for information on how to create the app-config.json file
            // See https://github.com/FactSet/enterprise-sdk-utils-dotnet#authentication
            // for more information on using the ConfidentialClient class
            ConfidentialClient confidentialClient = await ConfidentialClient.CreateAsync("/path/to/app-config.json");
            config.OAuth2Client = confidentialClient;

            /* Basic authentication: FactSetApiKey */
            // See https://github.com/FactSet/enterprise-sdk#api-key
            // for information how to create an API key
            // config.Username = "USERNAME-SERIAL";
            // config.Password = "API-KEY";

            var apiInstance = new CompanyApi(config);

            var companyStatsRequest = new CompanyStatsRequest(); // CompanyStatsRequest | 

            try
            {
                // Returns statistics about top leadership of a company.
                CompanyStatsResponse result = apiInstance.GetCompanyStatsForList(companyStatsRequest);
                Console.WriteLine(result.ToJson());
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling CompanyApi.GetCompanyStatsForList: " + e.Message );
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
 **companyStatsRequest** | [**CompanyStatsRequest**](CompanyStatsRequest.md)|  | 

### Return type
[**CompanyStatsResponse**](CompanyStatsResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Array of Company Positions objects. |  -  |
| **400** | Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. |  -  |
| **401** | Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. |  -  |
| **403** | The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. |  -  |
| **415** | Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. |  -  |
| **500** | Internal Server Error. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


