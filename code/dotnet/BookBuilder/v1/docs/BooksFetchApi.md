# FactSet.SDK.BookBuilder.Api.BooksFetchApi

All URIs are relative to *https://api.factset.com/book-builder-api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**DownloadBook**](BooksFetchApi.md#downloadbook) | **GET** /download-api-book-aws/{book_id} | Retrieves book in PDF format
[**GetBookList**](BooksFetchApi.md#getbooklist) | **GET** /book-list | Check out the books that are in the book library



<a name="downloadbook"></a>
# **DownloadBook**
> EnableBookDownload DownloadBook (string bookId)

Retrieves book in PDF format

This endpoint uses the BookId returned from any of the request above. Returns the URL to load the book for the book ID requested. The URL will be in JSON format, the final book will be in PDF format. <br><br> NOTE - - The execution of this endpoint requires an extra step within the developer portal due to authentication limitations. When using the actual API, a successful response for this endpoint will be the PDF book rather than the URL to the PDF. <br><br><b><i>The actual endpoint is </b><font color=blue>https://api.factset.com/book-builder-api/v1/download-api-book/{book_id}</font></i>

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```csharp
using System;
using System.Net;
using System.Threading.Tasks;
using FactSet.SDK.Utils.Authentication;
using FactSet.SDK.BookBuilder.Api;
using FactSet.SDK.BookBuilder.Client;
using FactSet.SDK.BookBuilder.Model;

namespace Example
{
    public class DownloadBookExample
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

            var apiInstance = new BooksFetchApi(config);

            var bookId = "20200331093828132";  // string | A string representing the unique ID for a specific book. This ID must be provided in the URL path.

            try
            {
                // Retrieves book in PDF format
                BooksFetchApi.DownloadBookResponseWrapper result = apiInstance.DownloadBook(bookId);

                switch (result.StatusCode)
                {

                    case (HttpStatusCode)200:
                        Console.WriteLine(result.Response200);
                        break;

                    case (HttpStatusCode)202:
                        Console.WriteLine(result.Response202);
                        break;

                }
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling BooksFetchApi.DownloadBook: " + e.Message );
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
 **bookId** | **string**| A string representing the unique ID for a specific book. This ID must be provided in the URL path. | 

### Return type
DownloadBookResponseWrapper

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response contains URL to load the book for the BookID requested |  -  |
| **202** | Book is processing. Please check back later. |  -  |
| **400** | Something went wrong. Please create a new request. |  -  |
| **401** | Missing or invalid authentication |  -  |
| **503** | Unrecognized BookId |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


<a name="getbooklist"></a>
# **GetBookList**
> List&lt;BookInfo&gt; GetBookList ()

Check out the books that are in the book library

Retrieves the list of books that were previously created and are available in the client's book library

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
    public class GetBookListExample
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

            var apiInstance = new BooksFetchApi(config);


            try
            {
                // Check out the books that are in the book library
                List<BookInfo> result = apiInstance.GetBookList();
                Console.WriteLine(result.ToJson());
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling BooksFetchApi.GetBookList: " + e.Message );
                Console.WriteLine("Status Code: "+ e.ErrorCode);
                Console.WriteLine(e.StackTrace);
            }
        }
    }
}
```

### Parameters
This endpoint does not need any parameter.

### Return type
[**List&lt;BookInfo&gt;**](BookInfo.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response contains book name, book ID, created date, shared status of the book and book type |  -  |
| **401** | Missing or Invalid authentication |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


