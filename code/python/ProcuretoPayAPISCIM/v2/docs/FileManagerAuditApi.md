# fds.sdk.ProcuretoPayAPISCIM.FileManagerAuditApi

All URIs are relative to *https://api.factset.com/scim/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**get_file_manager_audit**](FileManagerAuditApi.md#get_file_manager_audit) | **GET** /FileManagerAudit | Get File Manager audit data.



# **get_file_manager_audit**
> FileManagerAudit get_file_manager_audit()

Get File Manager audit data.

Get a list of File Manager file paths and associated information, such as user permissions.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.ProcuretoPayAPISCIM
from fds.sdk.ProcuretoPayAPISCIM.api import file_manager_audit_api
from fds.sdk.ProcuretoPayAPISCIM.models import *
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
configuration = fds.sdk.ProcuretoPayAPISCIM.Configuration(
    fds_oauth_client=ConfidentialClient('/path/to/app-config.json')
)

# Basic authentication: FactSetApiKey
# See https://github.com/FactSet/enterprise-sdk#api-key
# for information how to create an API key
# configuration = fds.sdk.ProcuretoPayAPISCIM.Configuration(
#     username='USERNAME-SERIAL',
#     password='API-KEY'
# )

# Enter a context with an instance of the API client
with fds.sdk.ProcuretoPayAPISCIM.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = file_manager_audit_api.FileManagerAuditApi(api_client)

    # NOTE: The following variables are just an example and may contain invalid values. Please, replace these with valid values.

    try:
        # Get File Manager audit data.
        # example, this endpoint has no required or optional parameters
        api_response = api_instance.get_file_manager_audit()

        pprint(api_response)

    except fds.sdk.ProcuretoPayAPISCIM.ApiException as e:
        print("Exception when calling FileManagerAuditApi->get_file_manager_audit: %s\n" % e)
```


### Parameters
This endpoint does not need any parameter.

### Return type

[**FileManagerAudit**](FileManagerAudit.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/scim+json, application/json


### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Success. |  -  |
**401** | User has not been authenticated. |  -  |
**403** | User is not authorized to use this API. |  -  |
**429** | User is accessing this API too frequently. |  -  |
**500** | Internal server error. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

