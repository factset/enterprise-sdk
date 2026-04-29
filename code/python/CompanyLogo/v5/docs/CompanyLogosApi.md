# fds.sdk.CompanyLogo.CompanyLogosApi

All URIs are relative to *https://api.factset.com/wealth/v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**post_company_logo**](CompanyLogosApi.md#post_company_logo) | **POST** /company/logo | Retrieves logos for one or more publicly traded companies.



# **post_company_logo**
> InlineResponse200 post_company_logo()

Retrieves logos for one or more publicly traded companies.

Retrieves high-quality logos for one or more publicly traded companies using standard identifiers (e.g., ticker symbols, ISIN). Logos are available in a selection of predefined sizes or can be generated on-the-fly to custom dimensions. The endpoint accepts up to 100 identifiers per request. Note: Requesting a large number of logos in a single call may result in increased response times.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.CompanyLogo
from fds.sdk.CompanyLogo.api import company_logos_api
from fds.sdk.CompanyLogo.models import *
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
configuration = fds.sdk.CompanyLogo.Configuration(
    fds_oauth_client=ConfidentialClient('/path/to/app-config.json')
)

# Basic authentication: FactSetApiKey
# See https://github.com/FactSet/enterprise-sdk#api-key
# for information how to create an API key
# configuration = fds.sdk.CompanyLogo.Configuration(
#     username='USERNAME-SERIAL',
#     password='API-KEY'
# )

# Enter a context with an instance of the API client
with fds.sdk.CompanyLogo.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = company_logos_api.CompanyLogosApi(api_client)

    # NOTE: The following variables are just an example and may contain invalid values. Please, replace these with valid values.
    post_company_logo_request = PostCompanyLogoRequest(
        data=PostCompanyLogoRequestData(
            identifier=PostCompanyLogoRequestDataIdentifier(
                values=["FDS-US"],
                type="tickerRegion",
            ),
            format="rectangular",
            size=PostCompanyLogoRequestDataSize(
                predefined=[
                    "small",
                ],
                custom=PostCompanyLogoRequestDataSizeCustom(
                    width=10,
                    height=10,
                ),
            ),
            mime_type="image/png",
        ),
        meta=PostCompanyLogoRequestMeta(
            attributes=AttributesMember([]),
        ),
    ) # PostCompanyLogoRequest | Request Body (optional)

    try:
        # Retrieves logos for one or more publicly traded companies.
        # example passing only required values which don't have defaults set
        # and optional values
        api_response = api_instance.post_company_logo(post_company_logo_request=post_company_logo_request)

        pprint(api_response)

    except fds.sdk.CompanyLogo.ApiException as e:
        print("Exception when calling CompanyLogosApi->post_company_logo: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **post_company_logo_request** | [**PostCompanyLogoRequest**](PostCompanyLogoRequest.md)| Request Body | [optional]

### Return type

[**InlineResponse200**](InlineResponse200.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Successful Response |  -  |
**400** | Bad Request. Please review the \&quot;message\&quot; for more details. |  -  |
**401** | Unauthenticated API Key or Token. |  -  |
**403** | Forbidden. The API Key or token is not authorized. |  -  |
**500** | Internal Server Error. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

