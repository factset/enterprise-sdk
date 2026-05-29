# fds.sdk.StreetAccountNews.SABurstsApi

All URIs are relative to *https://api.factset.com/streetaccount/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**get_latest_burst_file**](SABurstsApi.md#get_latest_burst_file) | **GET** /sa-bursts/latest-file | Retrieve the latest burst file metadata and download URL



# **get_latest_burst_file**
> BurstFileResponse get_latest_burst_file()

Retrieve the latest burst file metadata and download URL

Returns JSON containing the timestamp and a download URL for the most recent StreetAccount burst ZIP file. Use the `downloadUrl` in the response to download the file.  **Response fields**  - **`burstDateTime`** — Timestamp of the latest burst file in ISO 8601 UTC format (YYYY-MM-DDTHH:mm:ssZ).  - **`downloadUrl`** — Opaque URL to download the burst file. Issue   a `GET` request to this URL to receive an HTTP 302 redirect to the file.   The URL contains a short-lived token unique to this burst and   is valid for **5 minutes**. 

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.StreetAccountNews
from fds.sdk.StreetAccountNews.api import sa_bursts_api
from fds.sdk.StreetAccountNews.models import *
from dateutil.parser import parse as dateutil_parser
from pprint import pprint

# See configuration.py for a list of all supported configuration parameters.

# Examples for each supported authentication method are below,
# choose one that satisfies your use case.

# (Preferred) OAuth 2.0: FactSetOAuth2
# See https://github.com/FactSet/enterprise-sdk#oauth-20
# for information on how to create the app-config.json file
#
# The confidential client instance should be reused in production environments.
# See https://github.com/FactSet/enterprise-sdk-utils-python#authentication
# for more information on using the ConfidentialClient class
configuration = fds.sdk.StreetAccountNews.Configuration(
    fds_oauth_client=ConfidentialClient('/path/to/app-config.json')
)

# Basic authentication: FactSetApiKey
# See https://github.com/FactSet/enterprise-sdk#api-key
# for information how to create an API key
# configuration = fds.sdk.StreetAccountNews.Configuration(
#     username='USERNAME-SERIAL',
#     password='API-KEY'
# )

# Enter a context with an instance of the API client
with fds.sdk.StreetAccountNews.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = sa_bursts_api.SABurstsApi(api_client)

    # NOTE: The following variables are just an example and may contain invalid values. Please, replace these with valid values.

    try:
        # Retrieve the latest burst file metadata and download URL
        # example, this endpoint has no required or optional parameters
        api_response = api_instance.get_latest_burst_file()

        pprint(api_response)

    except fds.sdk.StreetAccountNews.ApiException as e:
        print("Exception when calling SABurstsApi->get_latest_burst_file: %s\n" % e)
```


### Parameters
This endpoint does not need any parameter.

### Return type

[**BurstFileResponse**](BurstFileResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Latest burst file metadata. |  -  |
**401** | Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the Report Issue in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses.  |  -  |
**404** | No burst file available. |  -  |
**429** | Limit Exceeded |  * X-FactSet-Api-RateLimit-Limit - Number of allowed requests for the time window. <br>  * X-FactSet-Api-RateLimit-Limit-Remaining - Number of requests left for the time window. <br>  * X-FactSet-Api-RateLimit-Limit-Reset - Number of seconds remaining till rate limit resets. <br>  |
**500** | Internal Server Error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

