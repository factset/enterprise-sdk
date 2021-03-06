# fds.sdk.CompanyLogoAPIforDigitalPortals.CompanyApi

All URIs are relative to *http://api.factset.com/wealth/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**get_company_logo_get_by_instrument**](CompanyApi.md#get_company_logo_get_by_instrument) | **GET** /company/logo/getByInstrument | URLs of company logos.


# **get_company_logo_get_by_instrument**
> InlineResponse200 get_company_logo_get_by_instrument(id)

URLs of company logos.

URLs of transparent company logos in different sizes. A small square logo is 31x31 pixels. A small rectangular logo has a maximum width of 88 pixels and a maximum height of 31 pixels. A medium or large logo has the size of the small logo scaled up by 200% and 300% respectively. A vector logo can be rendered at any size.

### Example

* Basic Authentication (FactSetApiKey):
* OAuth Authentication (FactSetOAuth2):

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.CompanyLogoAPIforDigitalPortals
from fds.sdk.CompanyLogoAPIforDigitalPortals.api import company_api
from fds.sdk.CompanyLogoAPIforDigitalPortals.models import *
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
configuration = fds.sdk.CompanyLogoAPIforDigitalPortals.Configuration(
    fds_oauth_client=ConfidentialClient('/path/to/app-config.json')
)

# Basic authentication: FactSetApiKey
# See https://github.com/FactSet/enterprise-sdk#api-key
# for information how to create an API key
# configuration = fds.sdk.CompanyLogoAPIforDigitalPortals.Configuration(
#     username='USERNAME-SERIAL',
#     password='API-KEY'
# )

# Enter a context with an instance of the API client
with fds.sdk.CompanyLogoAPIforDigitalPortals.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = company_api.CompanyApi(api_client)

    id = "id_example" # str | Identifier of an instrument.
    attributes = [
        "_attributes_example",
    ] # [str] | Limit the attributes returned in the response to the specified set. (optional)

    try:
        # URLs of company logos.
        # example passing only required values which don't have defaults set
        # and optional values
        api_response = api_instance.get_company_logo_get_by_instrument(id, attributes=attributes)
        pprint(api_response)

    except fds.sdk.CompanyLogoAPIforDigitalPortals.ApiException as e:
        print("Exception when calling CompanyApi->get_company_logo_get_by_instrument: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **str**| Identifier of an instrument. |
 **attributes** | **[str]**| Limit the attributes returned in the response to the specified set. | [optional]

### Return type

[**InlineResponse200**](InlineResponse200.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Successful Response |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

