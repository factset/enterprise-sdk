# fds.sdk.FactSetOwnership.CompanyReportsApi

All URIs are relative to *https://api.factset.com/content/factset-ownership/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**get_ownership_company_reports_summary**](CompanyReportsApi.md#get_ownership_company_reports_summary) | **GET** /company-reports/summary | Get current only ownership summary data for a list of requested identifiers.
[**post_ownership_company_reports_summary**](CompanyReportsApi.md#post_ownership_company_reports_summary) | **POST** /company-reports/summary | Get current only ownership summary data for a list of requested identifiers.



# **get_ownership_company_reports_summary**
> OwnershipSummaryResponse get_ownership_company_reports_summary(ids)

Get current only ownership summary data for a list of requested identifiers.

Get current only ownership summary data for a list of requested identifiers. 

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.FactSetOwnership
from fds.sdk.FactSetOwnership.api import company_reports_api
from fds.sdk.FactSetOwnership.models import *
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
configuration = fds.sdk.FactSetOwnership.Configuration(
    fds_oauth_client=ConfidentialClient('/path/to/app-config.json')
)

# Basic authentication: FactSetApiKey
# See https://github.com/FactSet/enterprise-sdk#api-key
# for information how to create an API key
# configuration = fds.sdk.FactSetOwnership.Configuration(
#     username='USERNAME-SERIAL',
#     password='API-KEY'
# )

# Enter a context with an instance of the API client
with fds.sdk.FactSetOwnership.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = company_reports_api.CompanyReportsApi(api_client)

    # NOTE: The following variables are just an example and may contain invalid values. Please, replace these with valid values.
    ids = ["TSLA-US"] # [str] | Requested list of identifiers.  _**ids limit** = 10 per request_
    batch = Batch("N") # Batch | Enables the ability to asynchronously \"batch\" the request, supporting a long-running request for up to 20 minutes.  When `batch=Y`, the service will respond with an HTTP Status Code of 202.  Once a batch request is submitted, use batch status to see if the job has been completed.  Once completed, retrieve the results of the request via batch-result. When using Batch, ids     limit is increased to  1000 ids per request, though limits on query string via GET method still apply.  It's advised to submit large lists of ids via POST method.  (optional)

    try:
        # Get current only ownership summary data for a list of requested identifiers.
        # example passing only required values which don't have defaults set
        # and optional values
        api_response_wrapper = api_instance.get_ownership_company_reports_summary(ids, batch=batch)

        # This endpoint returns a response wrapper that contains different types of responses depending on the query.
        # To access the correct response type, you need to perform one additional step, as shown below.
        if api_response_wrapper.get_status_code() == 200:
            api_response = api_response_wrapper.get_response_200()
        if api_response_wrapper.get_status_code() == 202:
            api_response = api_response_wrapper.get_response_202()

        pprint(api_response)

    except fds.sdk.FactSetOwnership.ApiException as e:
        print("Exception when calling CompanyReportsApi->get_ownership_company_reports_summary: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ids** | **[str]**| Requested list of identifiers.  _**ids limit** &#x3D; 10 per request_ |
 **batch** | **Batch**| Enables the ability to asynchronously \&quot;batch\&quot; the request, supporting a long-running request for up to 20 minutes.  When &#x60;batch&#x3D;Y&#x60;, the service will respond with an HTTP Status Code of 202.  Once a batch request is submitted, use batch status to see if the job has been completed.  Once completed, retrieve the results of the request via batch-result. When using Batch, ids     limit is increased to  1000 ids per request, though limits on query string via GET method still apply.  It&#39;s advised to submit large lists of ids via POST method.  | [optional]

### Return type

The endpoint generates varying objects correlating with the successful status code, encapsulated within a response wrapper housing the appropriate object. The response wrapper includes the subsequent response types:
- **200**: [**OwnershipSummaryResponse**](OwnershipSummaryResponse.md)
- **202**: [**BatchStatusResponse**](BatchStatusResponse.md)


### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Ownership Summary Response. |  -  |
**202** | Batch request has been accepted. |  * Location - Path to Batch Request status. <br>  |
**400** | Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. |  -  |
**401** | Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. |  -  |
**403** | The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. |  -  |
**415** | Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. |  -  |
**500** | Internal Server Error. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **post_ownership_company_reports_summary**
> OwnershipSummaryResponse post_ownership_company_reports_summary(ownership_summary_request)

Get current only ownership summary data for a list of requested identifiers.

Get current only ownership summary data for a list of requested identifiers.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.FactSetOwnership
from fds.sdk.FactSetOwnership.api import company_reports_api
from fds.sdk.FactSetOwnership.models import *
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
configuration = fds.sdk.FactSetOwnership.Configuration(
    fds_oauth_client=ConfidentialClient('/path/to/app-config.json')
)

# Basic authentication: FactSetApiKey
# See https://github.com/FactSet/enterprise-sdk#api-key
# for information how to create an API key
# configuration = fds.sdk.FactSetOwnership.Configuration(
#     username='USERNAME-SERIAL',
#     password='API-KEY'
# )

# Enter a context with an instance of the API client
with fds.sdk.FactSetOwnership.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = company_reports_api.CompanyReportsApi(api_client)

    # NOTE: The following variables are just an example and may contain invalid values. Please, replace these with valid values.
    ownership_summary_request = OwnershipSummaryRequest(
        data=OwnershipSummaryRequestData(
            ids=IdCompanyReports(["TSLA-US"]),
            batch=Batch("N"),
        ),
    ) # OwnershipSummaryRequest | Requesting Ownership Summary Details

    try:
        # Get current only ownership summary data for a list of requested identifiers.
        # example passing only required values which don't have defaults set
        api_response_wrapper = api_instance.post_ownership_company_reports_summary(ownership_summary_request)

        # This endpoint returns a response wrapper that contains different types of responses depending on the query.
        # To access the correct response type, you need to perform one additional step, as shown below.
        if api_response_wrapper.get_status_code() == 200:
            api_response = api_response_wrapper.get_response_200()
        if api_response_wrapper.get_status_code() == 202:
            api_response = api_response_wrapper.get_response_202()

        pprint(api_response)

    except fds.sdk.FactSetOwnership.ApiException as e:
        print("Exception when calling CompanyReportsApi->post_ownership_company_reports_summary: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ownership_summary_request** | [**OwnershipSummaryRequest**](OwnershipSummaryRequest.md)| Requesting Ownership Summary Details |

### Return type

The endpoint generates varying objects correlating with the successful status code, encapsulated within a response wrapper housing the appropriate object. The response wrapper includes the subsequent response types:
- **200**: [**OwnershipSummaryResponse**](OwnershipSummaryResponse.md)
- **202**: [**BatchStatusResponse**](BatchStatusResponse.md)


### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Ownership Summary Response. |  -  |
**202** | Batch request has been accepted. |  * Location - Path to Batch Request status. <br>  |
**400** | Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. |  -  |
**401** | Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. |  -  |
**403** | The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. |  -  |
**415** | Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. |  -  |
**500** | Internal Server Error. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

