# fds.sdk.StandardDatafeed.SchemaApi

All URIs are relative to *https://api.factset.com/bulk-documents/sdf*

Method | HTTP request | Description
------------- | ------------- | -------------
[**get_v1_list_schemas**](SchemaApi.md#get_v1_list_schemas) | **GET** /v1/list-schemas | schemas


# **get_v1_list_schemas**
> ListSchema200Response get_v1_list_schemas()

schemas

<a href=https://api.factset.com/bulk-documents/sdf/v1/list-schemas>List-Schemas</a> helper end point provides the list of schemas subscribed by the client  This API provides a downloadable file for the schema & sequence number (version number of schema) specified

### Example

* Basic Authentication (FactSetApiKey):
* OAuth Authentication (FactSetOAuth2):

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.StandardDatafeed
from fds.sdk.StandardDatafeed.api import schema_api
from fds.sdk.StandardDatafeed.model.list_schema200_response import ListSchema200Response
from fds.sdk.StandardDatafeed.model.list_schema400_response import ListSchema400Response
from pprint import pprint

# See configuration.py for a list of all supported configuration parameters.

# Examples for each supported authentication method are below,
# choose one that satisfies your use case.

# (Preferred) OAuth 2.0: FactSetOAuth2
# See https://github.com/FactSet/enterprise-sdk#oauth-20
# for information on how to create the app-config.json file
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

    schema = "schema_example" # str | schema name</p> Default is all schemas & bundles subscribed by the client</p> **Example: acta_v1, fgp_v1, yn_v1** (optional)
    sequence = 1 # int | Enter the sequence number associated with a schema</p> Provides a pre-signed url to download the respective schema file</p> \"**Example: \"8\" from acta_v1: [8],** (optional)

    try:
        # schemas
        api_response = api_instance.get_v1_list_schemas(schema=schema, sequence=sequence)
        pprint(api_response)

    except fds.sdk.StandardDatafeed.ApiException as e:
        print("Exception when calling SchemaApi->get_v1_list_schemas: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **schema** | **str**| schema name&lt;/p&gt; Default is all schemas &amp; bundles subscribed by the client&lt;/p&gt; **Example: acta_v1, fgp_v1, yn_v1** | [optional]
 **sequence** | **int**| Enter the sequence number associated with a schema&lt;/p&gt; Provides a pre-signed url to download the respective schema file&lt;/p&gt; \&quot;**Example: \&quot;8\&quot; from acta_v1: [8],** | [optional]

### Return type

[**ListSchema200Response**](ListSchema200Response.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |
**400** | Bad Request |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

