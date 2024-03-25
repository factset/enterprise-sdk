# fds.sdk.StandardDatafeed.SchemaApi

All URIs are relative to *https://api.factset.com/bulk-documents/sdf/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**get_list_schemaswithoutwithoout_required_parameters**](SchemaApi.md#get_list_schemaswithoutwithoout_required_parameters) | **GET** /list-schemas | List of Standard DataFeed (SDF) schemas.
[**get_schema_details**](SchemaApi.md#get_schema_details) | **GET** /schema-details | Schema Details.



# **get_list_schemaswithoutwithoout_required_parameters**
> ListSchema get_list_schemaswithoutwithoout_required_parameters()

List of Standard DataFeed (SDF) schemas.

This helper endpoint provides the list of schemas subscribed by the client and their corresponding versions. 

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.StandardDatafeed
from fds.sdk.StandardDatafeed.api import schema_api
from fds.sdk.StandardDatafeed.models import *
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
configuration = fds.sdk.StandardDatafeed.Configuration(
    fds_oauth_client=ConfidentialClient('/path/to/app-config.json')
)

# Basic authentication: FactSetApiKey
# See https://github.com/FactSet/enterprise-sdk#api-key
# for information how to create an API key
# configuration = fds.sdk.StandardDatafeed.Configuration(
#     username='USERNAME-SERIAL',
#     password='API-KEY'
# )

# Enter a context with an instance of the API client
with fds.sdk.StandardDatafeed.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = schema_api.SchemaApi(api_client)


    try:
        # List of Standard DataFeed (SDF) schemas.
        # example, this endpoint has no required or optional parameters
        api_response = api_instance.get_list_schemaswithoutwithoout_required_parameters()

        pprint(api_response)

    except fds.sdk.StandardDatafeed.ApiException as e:
        print("Exception when calling SchemaApi->get_list_schemaswithoutwithoout_required_parameters: %s\n" % e)
```


### Parameters
This endpoint does not need any parameter.

### Return type

[**ListSchema**](ListSchema.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |
**400** | Bad request. |  -  |
**401** | Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the Report Issue in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses.  |  -  |
**403** | The USERNAME-SERIAL attempted to request the endpoint but is not authorized to access it. The request was legal, but the server is refusing to respond. Please reach out to the FactSet Account Team for assistance with authorization.  |  -  |
**429** | Quantity Limits Exceeded |  -  |
**500** | Internal Server Error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_schema_details**
> SchemaDetail get_schema_details(schema, version)

Schema Details.

If the schema and version number are passed in the request, this endpoint provides a pre-signed URL pointing to the location from where the schema details can be downloaded. 

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.StandardDatafeed
from fds.sdk.StandardDatafeed.api import schema_api
from fds.sdk.StandardDatafeed.models import *
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
configuration = fds.sdk.StandardDatafeed.Configuration(
    fds_oauth_client=ConfidentialClient('/path/to/app-config.json')
)

# Basic authentication: FactSetApiKey
# See https://github.com/FactSet/enterprise-sdk#api-key
# for information how to create an API key
# configuration = fds.sdk.StandardDatafeed.Configuration(
#     username='USERNAME-SERIAL',
#     password='API-KEY'
# )

# Enter a context with an instance of the API client
with fds.sdk.StandardDatafeed.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = schema_api.SchemaApi(api_client)

    # NOTE: The parameter variable defined below is just an example and may potentially contain non valid values. So please replace this with valid values.
    schema = "fgp_v1" # str | Name of the schema.
    # NOTE: The parameter variable defined below is just an example and may potentially contain non valid values. So please replace this with valid values.
    version = 5 # int | Version number of the schema.

    try:
        # Schema Details.
        # example passing only required values which don't have defaults set
        api_response = api_instance.get_schema_details(schema, version)

        pprint(api_response)

    except fds.sdk.StandardDatafeed.ApiException as e:
        print("Exception when calling SchemaApi->get_schema_details: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **schema** | **str**| Name of the schema. |
 **version** | **int**| Version number of the schema. |

### Return type

[**SchemaDetail**](SchemaDetail.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |
**400** | Bad request. |  -  |
**401** | Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the Report Issue in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses.  |  -  |
**403** | The USERNAME-SERIAL attempted to request the endpoint but is not authorized to access it. The request was legal, but the server is refusing to respond. Please reach out to the FactSet Account Team for assistance with authorization.  |  -  |
**429** | Quantity Limits Exceeded |  -  |
**500** | Internal Server Error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

