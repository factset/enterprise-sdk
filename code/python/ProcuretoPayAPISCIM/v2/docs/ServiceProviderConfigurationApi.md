# fds.sdk.ProcuretoPayAPISCIM.ServiceProviderConfigurationApi

All URIs are relative to *https://api.factset.com/scim/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**get_service_provider_config**](ServiceProviderConfigurationApi.md#get_service_provider_config) | **GET** /ServiceProviderConfig | Get service provider configuration.



# **get_service_provider_config**
> ServiceProviderConfig get_service_provider_config()

Get service provider configuration.

Get service provider configuration, which describes the SCIM specification features available. See RFC 7644 section 4.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.ProcuretoPayAPISCIM
from fds.sdk.ProcuretoPayAPISCIM.api import service_provider_configuration_api
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
    api_instance = service_provider_configuration_api.ServiceProviderConfigurationApi(api_client)

    # NOTE: The following variables are just an example and may contain invalid values. Please, replace these with valid values.

    try:
        # Get service provider configuration.
        # example, this endpoint has no required or optional parameters
        api_response = api_instance.get_service_provider_config()

        pprint(api_response)

    except fds.sdk.ProcuretoPayAPISCIM.ApiException as e:
        print("Exception when calling ServiceProviderConfigurationApi->get_service_provider_config: %s\n" % e)
```


### Parameters
This endpoint does not need any parameter.

### Return type

[**ServiceProviderConfig**](ServiceProviderConfig.md)

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
**429** | User is accessing this API too frequently. |  -  |
**500** | Internal server error. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

