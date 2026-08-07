# fds.sdk.OffPlatformIntegrations.CheckCACCESSApi

All URIs are relative to *https://api.factset.com/services/off-platform-integrations-api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**check_caccess**](CheckCACCESSApi.md#check_caccess) | **POST** /check-caccess | Check access for a list of encrypted CACCESS codes



# **check_caccess**
> AccessCheckResponse check_caccess(access_check_request)

Check access for a list of encrypted CACCESS codes

Accepts an array of up to 25 encrypted CACCESS codes in 'data' and returns an array of result objects. On successful decryption of all codes, returns 200 with each result containing the encrypted code and a boolean 'hasAccess'. If decryption fails for any code, returns 400 with an 'errors' array containing the decryption errors and, if any codes decrypted successfully, a 'data' array with those results. Returns 400 with an 'errors' envelope for malformed input or if more than 25 codes are submitted, and 401 if the user is not authenticated.  Each CACCESS code must be encrypted using **AES-256-CBC** before being sent. To obtain the encryption key and integration guidance, contact [research-integrations-dev@factset.com](mailto:research-integrations-dev@factset.com).

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.OffPlatformIntegrations
from fds.sdk.OffPlatformIntegrations.api import check_caccess_api
from fds.sdk.OffPlatformIntegrations.models import *
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
configuration = fds.sdk.OffPlatformIntegrations.Configuration(
    fds_oauth_client=ConfidentialClient('/path/to/app-config.json')
)

# Basic authentication: FactSetApiKey
# See https://github.com/FactSet/enterprise-sdk#api-key
# for information how to create an API key
# configuration = fds.sdk.OffPlatformIntegrations.Configuration(
#     username='USERNAME-SERIAL',
#     password='API-KEY'
# )

# Enter a context with an instance of the API client
with fds.sdk.OffPlatformIntegrations.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = check_caccess_api.CheckCACCESSApi(api_client)

    # NOTE: The following variables are just an example and may contain invalid values. Please, replace these with valid values.
    access_check_request = AccessCheckRequest(
        data=[
            EncryptedCACCESSCode("data_example"),
        ],
    ) # AccessCheckRequest | 

    try:
        # Check access for a list of encrypted CACCESS codes
        # example passing only required values which don't have defaults set
        api_response = api_instance.check_caccess(access_check_request)

        pprint(api_response)

    except fds.sdk.OffPlatformIntegrations.ApiException as e:
        print("Exception when calling CheckCACCESSApi->check_caccess: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **access_check_request** | [**AccessCheckRequest**](AccessCheckRequest.md)|  |

### Return type

[**AccessCheckResponse**](AccessCheckResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | All codes decrypted successfully. Returns a list of encrypted CACCESS codes and their access status. |  * api-version -  <br>  |
**400** | Bad Request - either the request body is malformed/missing, more than 25 codes were submitted, or one or more codes could not be decrypted. Validation errors return an &#39;errors&#39; envelope; decryption failures return an &#39;errors&#39; array containing decryption errors and, if any codes decrypted successfully, a &#39;data&#39; array with those results. |  * api-version -  <br>  |
**401** | Unauthenticated - authentication credentials are missing or invalid |  * api-version -  <br>  |
**403** | Forbidden - authenticated user does not have the required access |  * api-version -  <br>  |
**408** | Request Timeout - the request body took too long to arrive (limit: 10s) |  * api-version -  <br>  |
**500** | Internal Server Error |  * api-version -  <br>  |
**503** | Service Unavailable - request processing timed out (limit: 25s) |  * api-version -  <br>  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

