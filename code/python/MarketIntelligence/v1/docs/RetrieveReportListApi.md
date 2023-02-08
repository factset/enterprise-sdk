# fds.sdk.MarketIntelligence.RetrieveReportListApi

All URIs are relative to *https://api.factset.com/market-intelligence*

Method | HTTP request | Description
------------- | ------------- | -------------
[**get_reports_get**](RetrieveReportListApi.md#get_reports_get) | **GET** /get-reports | Retrieve a list of previously created reports and associated report metadata.



# **get_reports_get**
> GetReportInfo get_reports_get()

Retrieve a list of previously created reports and associated report metadata.

Endpoint to retrieve list of all available Market Intelligence reports for specific User in JSON format.

### Example

* Basic Authentication (FactSetApiKey):
* OAuth Authentication (FactSetOAuth2):

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.MarketIntelligence
from fds.sdk.MarketIntelligence.api import retrieve_report_list_api
from fds.sdk.MarketIntelligence.models import *
from dateutil.parser import parse as dateutil_parser
from pprint import pprint

# See configuration.py for a list of all supported configuration parameters.

# Examples for each supported authentication method are below,
# choose one that satisfies your use case.

# (Preferred) OAuth 2.0: FactSetOAuth2
# See https://github.com/FactSet/enterprise-sdk#oauth-20
# for information on how to create the app-config.json file
# See https://github.com/FactSet/enterprise-sdk-utils-python#authentication
# for more information on using the ConfidentialClient class
configuration = fds.sdk.MarketIntelligence.Configuration(
    fds_oauth_client=ConfidentialClient('/path/to/app-config.json')
)

# Basic authentication: FactSetApiKey
# See https://github.com/FactSet/enterprise-sdk#api-key
# for information how to create an API key
# configuration = fds.sdk.MarketIntelligence.Configuration(
#     username='USERNAME-SERIAL',
#     password='API-KEY'
# )

# Enter a context with an instance of the API client
with fds.sdk.MarketIntelligence.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = retrieve_report_list_api.RetrieveReportListApi(api_client)


    try:
        # Retrieve a list of previously created reports and associated report metadata.
        # example, this endpoint has no required or optional parameters
        api_response = api_instance.get_reports_get()
        pprint(api_response)

    except fds.sdk.MarketIntelligence.ApiException as e:
        print("Exception when calling RetrieveReportListApi->get_reports_get: %s\n" % e)
```


### Parameters
This endpoint does not need any parameter.

### Return type

[**GetReportInfo**](GetReportInfo.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Successful response, Previously created report list fetched. |  -  |
**400** | Unknown Error |  -  |
**401** | Missing/invalid Credentials  or authentication failure |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

