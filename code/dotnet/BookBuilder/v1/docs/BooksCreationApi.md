# FactSet.SDK.BookBuilder.Api.BooksCreationApi

All URIs are relative to *https://api.factset.com/book-builder-api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**CreateBook**](BooksCreationApi.md#createbook) | **POST** /create-book | Kicks off request to create a book with reports of your choice
[**CreateBookFromTemplate**](BooksCreationApi.md#createbookfromtemplate) | **POST** /create-book-from-template | Kicks off request to create a book with template
[**GetAvailableReports**](BooksCreationApi.md#getavailablereports) | **GET** /available-report/{ticker} | This endpoint retrieves all available sections and reports based on a ticker.



<a name="createbook"></a>
# **CreateBook**
> EnableBookInfo CreateBook (CreateBookPostRequest createBookPostRequest)

Kicks off request to create a book with reports of your choice

This end point retrieves book name and book_id for the PDF book you create. All the book options such as name of the book, ticker, pagination options, and reports can be specified in the request body. Please refer to the documentation for valid section ids and report ids.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```csharp
using System;
using System.Threading.Tasks;
using FactSet.SDK.Utils.Authentication;
using FactSet.SDK.BookBuilder.Api;
using FactSet.SDK.BookBuilder.Client;
using FactSet.SDK.BookBuilder.Model;

namespace Example
{
    public class CreateBookExample
    {
        public static async Task Main()
        {
            var config = new FactSet.SDK.BookBuilder.Client.Configuration();

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

            var apiInstance = new BooksCreationApi(config);

            var createBookPostRequest = new CreateBookPostRequest(); // CreateBookPostRequest | 

            try
            {
                // Kicks off request to create a book with reports of your choice
                EnableBookInfo result = apiInstance.CreateBook(createBookPostRequest);
                Console.WriteLine(result.ToJson());
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling BooksCreationApi.CreateBook: " + e.Message );
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
 **createBookPostRequest** | [**CreateBookPostRequest**](CreateBookPostRequest.md)|  | 

### Return type
[**EnableBookInfo**](EnableBookInfo.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response contains book name and book ID |  -  |
| **400** | Invalid ticker/section_id/report_id |  -  |
| **401** | Missing or invalid authentication |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


<a name="createbookfromtemplate"></a>
# **CreateBookFromTemplate**
> EnableBookInfoFromTemplate CreateBookFromTemplate (CreateBookFromTemplatePostRequest createBookFromTemplatePostRequest)

Kicks off request to create a book with template

This endpoint retrieves book status, book name, and book ID for ticker requested in JSON format. This end-point excepts ticker and template_id as inputs. If the template_id input is not used, a book will be created with FactSet's default template.</br></br>Please try out the below template ids to quickly get the FactSet curated books</br></br>Company Quick Book - <b>g_20210415065838185</b></br>Post-Earnings Call - <b>g_20210415070044785</b> </br>Public Information Book(PIB) - <b>g_20210415070353151</b></br></br> Take a look at the example books attached under API documentation below.</br></br>If you are scheduling Post Earnings Call curated book, please note that in contains Corrected Transcript that takes a little while to be available.</br> </br>Once a Raw Transcript is published, FactSet's editors review the call to produce a Corrected Transcript. They listen to the entire audio file again to confirm that all of the terms and numbers are correctly transcribed. FactSet aims to publish a Corrected Transcript within six times the length of the event, measured from the beginning of the event. That means for a typical one-hour call, FactSet will produce a Corrected Transcript within approximately five hours of the call's completion. Visit [OA 13208](https://my.apps.factset.com/oa/pages/13208)

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```csharp
using System;
using System.Threading.Tasks;
using FactSet.SDK.Utils.Authentication;
using FactSet.SDK.BookBuilder.Api;
using FactSet.SDK.BookBuilder.Client;
using FactSet.SDK.BookBuilder.Model;

namespace Example
{
    public class CreateBookFromTemplateExample
    {
        public static async Task Main()
        {
            var config = new FactSet.SDK.BookBuilder.Client.Configuration();

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

            var apiInstance = new BooksCreationApi(config);

            var createBookFromTemplatePostRequest = new CreateBookFromTemplatePostRequest(); // CreateBookFromTemplatePostRequest | 

            try
            {
                // Kicks off request to create a book with template
                EnableBookInfoFromTemplate result = apiInstance.CreateBookFromTemplate(createBookFromTemplatePostRequest);
                Console.WriteLine(result.ToJson());
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling BooksCreationApi.CreateBookFromTemplate: " + e.Message );
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
 **createBookFromTemplatePostRequest** | [**CreateBookFromTemplatePostRequest**](CreateBookFromTemplatePostRequest.md)|  | 

### Return type
[**EnableBookInfoFromTemplate**](EnableBookInfoFromTemplate.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response contains request status, book name, and book ID |  -  |
| **400** | Invalid ticker or Unknown error |  -  |
| **401** | Missing or invalid authentication |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


<a name="getavailablereports"></a>
# **GetAvailableReports**
> AvailableReportsList GetAvailableReports (string ticker)

This endpoint retrieves all available sections and reports based on a ticker.

This endpoint retrieves all available sections and reports for a specified ticker. The only parameter required is the ticker.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```csharp
using System;
using System.Threading.Tasks;
using FactSet.SDK.Utils.Authentication;
using FactSet.SDK.BookBuilder.Api;
using FactSet.SDK.BookBuilder.Client;
using FactSet.SDK.BookBuilder.Model;

namespace Example
{
    public class GetAvailableReportsExample
    {
        public static async Task Main()
        {
            var config = new FactSet.SDK.BookBuilder.Client.Configuration();

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

            var apiInstance = new BooksCreationApi(config);

            var ticker = "APPL-US";  // string | A string representing a specific ticker of Public, Private companies and Mutual Funds. This ticker must be provided in the URL path.

            try
            {
                // This endpoint retrieves all available sections and reports based on a ticker.
                AvailableReportsList result = apiInstance.GetAvailableReports(ticker);
                Console.WriteLine(result.ToJson());
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling BooksCreationApi.GetAvailableReports: " + e.Message );
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
 **ticker** | **string**| A string representing a specific ticker of Public, Private companies and Mutual Funds. This ticker must be provided in the URL path. | 

### Return type
[**AvailableReportsList**](AvailableReportsList.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response contains all available sections and reports for the ticker. |  -  |
| **400** | Invalid Ticker |  -  |
| **401** | Missing or invalid authentication |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


