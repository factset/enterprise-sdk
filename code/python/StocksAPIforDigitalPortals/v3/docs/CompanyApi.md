# fds.sdk.StocksAPIforDigitalPortals.CompanyApi

All URIs are relative to *https://api.factset.com/wealth/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**get_company_board_list_by_instrument**](CompanyApi.md#get_company_board_list_by_instrument) | **GET** /company/board/listByInstrument | List of boards for a company, with their officers.
[**get_company_board_officer_function_delivery_list**](CompanyApi.md#get_company_board_officer_function_delivery_list) | **GET** /company/board/officer/function/delivery/list | List of officer functions as provided by a delivery.
[**get_company_board_type_list**](CompanyApi.md#get_company_board_type_list) | **GET** /company/board/type/list | List of company board types.
[**post_company_estimates_list_by_instrument**](CompanyApi.md#post_company_estimates_list_by_instrument) | **POST** /company/estimates/listByInstrument | Estimates for selected figures for a stock.
[**post_company_key_items_current_get_by_instrument**](CompanyApi.md#post_company_key_items_current_get_by_instrument) | **POST** /company/keyItems/current/getByInstrument | Fundamentals for a stock with potentially daily updates.
[**post_company_key_items_fiscal_year_list_by_instrument**](CompanyApi.md#post_company_key_items_fiscal_year_list_by_instrument) | **POST** /company/keyItems/fiscalYear/listByInstrument | Selected fundamentals for a stock with values as of the end of a fiscal year.



# **get_company_board_list_by_instrument**
> InlineResponse2005 get_company_board_list_by_instrument(id)

List of boards for a company, with their officers.

List of boards for a company, with their officers. A given person may be a member ofdifferent boards of the same company but also a member of boards of different companies.

### Example

* Basic Authentication (FactSetApiKey):
* OAuth Authentication (FactSetOAuth2):

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.StocksAPIforDigitalPortals
from fds.sdk.StocksAPIforDigitalPortals.api import company_api
from fds.sdk.StocksAPIforDigitalPortals.models import *
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
configuration = fds.sdk.StocksAPIforDigitalPortals.Configuration(
    fds_oauth_client=ConfidentialClient('/path/to/app-config.json')
)

# Basic authentication: FactSetApiKey
# See https://github.com/FactSet/enterprise-sdk#api-key
# for information how to create an API key
# configuration = fds.sdk.StocksAPIforDigitalPortals.Configuration(
#     username='USERNAME-SERIAL',
#     password='API-KEY'
# )

# Enter a context with an instance of the API client
with fds.sdk.StocksAPIforDigitalPortals.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = company_api.CompanyApi(api_client)

    id = "id_example" # str | 
    attributes = [
        "_attributes_example",
    ] # [str] | Limit the attributes returned in the response to the specified set. (optional)
    language = "_language_example" # str |  (optional)

    try:
        # List of boards for a company, with their officers.
        # example passing only required values which don't have defaults set
        # and optional values
        api_response = api_instance.get_company_board_list_by_instrument(id, attributes=attributes, language=language)
        pprint(api_response)

    except fds.sdk.StocksAPIforDigitalPortals.ApiException as e:
        print("Exception when calling CompanyApi->get_company_board_list_by_instrument: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **str**|  |
 **attributes** | **[str]**| Limit the attributes returned in the response to the specified set. | [optional]
 **language** | **str**|  | [optional]

### Return type

[**InlineResponse2005**](InlineResponse2005.md)

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

# **get_company_board_officer_function_delivery_list**
> InlineResponse2006 get_company_board_officer_function_delivery_list()

List of officer functions as provided by a delivery.

List of officer functions as provided by a delivery.

### Example

* Basic Authentication (FactSetApiKey):
* OAuth Authentication (FactSetOAuth2):

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.StocksAPIforDigitalPortals
from fds.sdk.StocksAPIforDigitalPortals.api import company_api
from fds.sdk.StocksAPIforDigitalPortals.models import *
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
configuration = fds.sdk.StocksAPIforDigitalPortals.Configuration(
    fds_oauth_client=ConfidentialClient('/path/to/app-config.json')
)

# Basic authentication: FactSetApiKey
# See https://github.com/FactSet/enterprise-sdk#api-key
# for information how to create an API key
# configuration = fds.sdk.StocksAPIforDigitalPortals.Configuration(
#     username='USERNAME-SERIAL',
#     password='API-KEY'
# )

# Enter a context with an instance of the API client
with fds.sdk.StocksAPIforDigitalPortals.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = company_api.CompanyApi(api_client)

    attributes = [
        "_attributes_example",
    ] # [str] | Limit the attributes returned in the response to the specified set. (optional)
    language = "_language_example" # str |  (optional)

    try:
        # List of officer functions as provided by a delivery.
        # example passing only required values which don't have defaults set
        # and optional values
        api_response = api_instance.get_company_board_officer_function_delivery_list(attributes=attributes, language=language)
        pprint(api_response)

    except fds.sdk.StocksAPIforDigitalPortals.ApiException as e:
        print("Exception when calling CompanyApi->get_company_board_officer_function_delivery_list: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **attributes** | **[str]**| Limit the attributes returned in the response to the specified set. | [optional]
 **language** | **str**|  | [optional]

### Return type

[**InlineResponse2006**](InlineResponse2006.md)

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

# **get_company_board_type_list**
> InlineResponse2007 get_company_board_type_list()

List of company board types.

List of company board types.

### Example

* Basic Authentication (FactSetApiKey):
* OAuth Authentication (FactSetOAuth2):

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.StocksAPIforDigitalPortals
from fds.sdk.StocksAPIforDigitalPortals.api import company_api
from fds.sdk.StocksAPIforDigitalPortals.models import *
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
configuration = fds.sdk.StocksAPIforDigitalPortals.Configuration(
    fds_oauth_client=ConfidentialClient('/path/to/app-config.json')
)

# Basic authentication: FactSetApiKey
# See https://github.com/FactSet/enterprise-sdk#api-key
# for information how to create an API key
# configuration = fds.sdk.StocksAPIforDigitalPortals.Configuration(
#     username='USERNAME-SERIAL',
#     password='API-KEY'
# )

# Enter a context with an instance of the API client
with fds.sdk.StocksAPIforDigitalPortals.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = company_api.CompanyApi(api_client)

    attributes = [
        "_attributes_example",
    ] # [str] | Limit the attributes returned in the response to the specified set. (optional)
    language = "_language_example" # str |  (optional)

    try:
        # List of company board types.
        # example passing only required values which don't have defaults set
        # and optional values
        api_response = api_instance.get_company_board_type_list(attributes=attributes, language=language)
        pprint(api_response)

    except fds.sdk.StocksAPIforDigitalPortals.ApiException as e:
        print("Exception when calling CompanyApi->get_company_board_type_list: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **attributes** | **[str]**| Limit the attributes returned in the response to the specified set. | [optional]
 **language** | **str**|  | [optional]

### Return type

[**InlineResponse2007**](InlineResponse2007.md)

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

# **post_company_estimates_list_by_instrument**
> InlineResponse2002 post_company_estimates_list_by_instrument()

Estimates for selected figures for a stock.

Fiscal year estimates for selected figures of a stock. Data is available only for common shares; instruments such as preferred shares or depository receipts yield an empty result. For the share type, see endpoint `/instrument/category/list` using dataset 23. Data can be retrieved only for the current, the past, and three future fiscal years. For past fiscal years, the estimates are not being replaced by the reported figures. Since a fiscal year and a calendar year do not necessarily match with regard to their start and end dates, the year is derived as the calendar year occupied to a larger extent by the fiscal year, using a June through May fiscal year assignment. That means, fiscal years ending from the 1st of June onwards are assigned to the same calendar year. Dates are interpreted in the timezone of the location of the head office of the company.

### Example

* Basic Authentication (FactSetApiKey):
* OAuth Authentication (FactSetOAuth2):

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.StocksAPIforDigitalPortals
from fds.sdk.StocksAPIforDigitalPortals.api import company_api
from fds.sdk.StocksAPIforDigitalPortals.models import *
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
configuration = fds.sdk.StocksAPIforDigitalPortals.Configuration(
    fds_oauth_client=ConfidentialClient('/path/to/app-config.json')
)

# Basic authentication: FactSetApiKey
# See https://github.com/FactSet/enterprise-sdk#api-key
# for information how to create an API key
# configuration = fds.sdk.StocksAPIforDigitalPortals.Configuration(
#     username='USERNAME-SERIAL',
#     password='API-KEY'
# )

# Enter a context with an instance of the API client
with fds.sdk.StocksAPIforDigitalPortals.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = company_api.CompanyApi(api_client)

    post_company_estimates_list_by_instrument_request = PostCompanyEstimatesListByInstrumentRequest(
        data=PostCompanyEstimatesListByInstrumentRequestData(
            id="id_example",
            fiscal_years=PostCompanyEstimatesListByInstrumentRequestDataFiscalYears(
                start=3.14,
                end=3.14,
            ),
            currency=PostCompanyEstimatesListByInstrumentRequestDataCurrency(
                iso_code="EUR",
            ),
        ),
        meta=PostCompanyEstimatesListByInstrumentRequestMeta(
            attributes=AttributesMember([
                "attributes_example",
            ]),
        ),
    ) # PostCompanyEstimatesListByInstrumentRequest |  (optional)

    try:
        # Estimates for selected figures for a stock.
        # example passing only required values which don't have defaults set
        # and optional values
        api_response = api_instance.post_company_estimates_list_by_instrument(post_company_estimates_list_by_instrument_request=post_company_estimates_list_by_instrument_request)
        pprint(api_response)

    except fds.sdk.StocksAPIforDigitalPortals.ApiException as e:
        print("Exception when calling CompanyApi->post_company_estimates_list_by_instrument: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **post_company_estimates_list_by_instrument_request** | [**PostCompanyEstimatesListByInstrumentRequest**](PostCompanyEstimatesListByInstrumentRequest.md)|  | [optional]

### Return type

[**InlineResponse2002**](InlineResponse2002.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Successful Response |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **post_company_key_items_current_get_by_instrument**
> InlineResponse200 post_company_key_items_current_get_by_instrument()

Fundamentals for a stock with potentially daily updates.

Fundamentals for a stock with potentially daily updates; any other instrument yields empty values for stock-specific attributes. The price used to calculate the various price-dependent figures is unspecified and the exchange for that price is not identified. Dates are interpreted in the timezone of the data provider. For reported company fundamentals of the previous fiscal years (only closed fiscal years) see endpoint `/company/keyItems/fiscalYear/listByInstrument.`

### Example

* Basic Authentication (FactSetApiKey):
* OAuth Authentication (FactSetOAuth2):

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.StocksAPIforDigitalPortals
from fds.sdk.StocksAPIforDigitalPortals.api import company_api
from fds.sdk.StocksAPIforDigitalPortals.models import *
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
configuration = fds.sdk.StocksAPIforDigitalPortals.Configuration(
    fds_oauth_client=ConfidentialClient('/path/to/app-config.json')
)

# Basic authentication: FactSetApiKey
# See https://github.com/FactSet/enterprise-sdk#api-key
# for information how to create an API key
# configuration = fds.sdk.StocksAPIforDigitalPortals.Configuration(
#     username='USERNAME-SERIAL',
#     password='API-KEY'
# )

# Enter a context with an instance of the API client
with fds.sdk.StocksAPIforDigitalPortals.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = company_api.CompanyApi(api_client)

    post_company_key_items_current_get_by_instrument_request = PostCompanyKeyItemsCurrentGetByInstrumentRequest(
        data=PostCompanyKeyItemsCurrentGetByInstrumentRequestData(
            id="id_example",
            currency=PostCompanyKeyItemsCurrentGetByInstrumentRequestDataCurrency(
                iso_code="EUR",
            ),
        ),
        meta=PostCompanyKeyItemsCurrentGetByInstrumentRequestMeta(
            attributes=AttributesMember([
                "attributes_example",
            ]),
            language=LanguageMember("language_example"),
        ),
    ) # PostCompanyKeyItemsCurrentGetByInstrumentRequest |  (optional)

    try:
        # Fundamentals for a stock with potentially daily updates.
        # example passing only required values which don't have defaults set
        # and optional values
        api_response = api_instance.post_company_key_items_current_get_by_instrument(post_company_key_items_current_get_by_instrument_request=post_company_key_items_current_get_by_instrument_request)
        pprint(api_response)

    except fds.sdk.StocksAPIforDigitalPortals.ApiException as e:
        print("Exception when calling CompanyApi->post_company_key_items_current_get_by_instrument: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **post_company_key_items_current_get_by_instrument_request** | [**PostCompanyKeyItemsCurrentGetByInstrumentRequest**](PostCompanyKeyItemsCurrentGetByInstrumentRequest.md)|  | [optional]

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

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **post_company_key_items_fiscal_year_list_by_instrument**
> InlineResponse2001 post_company_key_items_fiscal_year_list_by_instrument()

Selected fundamentals for a stock with values as of the end of a fiscal year.

Selected fundamentals for a stock with values as of the end of a fiscal year; any other instrument yields empty values for stock-specific attributes. The endpoint allows the retrieval of data only for specified fiscal years by using the start and end properties. Since a fiscal year and a calendar year do not necessarily match with regard to their start and end dates, the year is derived as the calendar year occupied to a larger extent by the fiscal year, using a June through May fiscal year assignment. That means, fiscal years ending from the 1st of June onwards are assigned to the same calendar year. Dates are interpreted in the timezone of the location of the head office of the company.

### Example

* Basic Authentication (FactSetApiKey):
* OAuth Authentication (FactSetOAuth2):

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.StocksAPIforDigitalPortals
from fds.sdk.StocksAPIforDigitalPortals.api import company_api
from fds.sdk.StocksAPIforDigitalPortals.models import *
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
configuration = fds.sdk.StocksAPIforDigitalPortals.Configuration(
    fds_oauth_client=ConfidentialClient('/path/to/app-config.json')
)

# Basic authentication: FactSetApiKey
# See https://github.com/FactSet/enterprise-sdk#api-key
# for information how to create an API key
# configuration = fds.sdk.StocksAPIforDigitalPortals.Configuration(
#     username='USERNAME-SERIAL',
#     password='API-KEY'
# )

# Enter a context with an instance of the API client
with fds.sdk.StocksAPIforDigitalPortals.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = company_api.CompanyApi(api_client)

    post_company_key_items_fiscal_year_list_by_instrument_request = PostCompanyKeyItemsFiscalYearListByInstrumentRequest(
        data=PostCompanyKeyItemsFiscalYearListByInstrumentRequestData(
            id="id_example",
            fiscal_years=PostCompanyKeyItemsFiscalYearListByInstrumentRequestDataFiscalYears(
                start=3.14,
                end=3.14,
            ),
            currency=PostCompanyKeyItemsFiscalYearListByInstrumentRequestDataCurrency(
                iso_code="EUR",
            ),
        ),
        meta=PostCompanyKeyItemsCurrentGetByInstrumentRequestMeta(
            attributes=AttributesMember([
                "attributes_example",
            ]),
            language=LanguageMember("language_example"),
        ),
    ) # PostCompanyKeyItemsFiscalYearListByInstrumentRequest |  (optional)

    try:
        # Selected fundamentals for a stock with values as of the end of a fiscal year.
        # example passing only required values which don't have defaults set
        # and optional values
        api_response = api_instance.post_company_key_items_fiscal_year_list_by_instrument(post_company_key_items_fiscal_year_list_by_instrument_request=post_company_key_items_fiscal_year_list_by_instrument_request)
        pprint(api_response)

    except fds.sdk.StocksAPIforDigitalPortals.ApiException as e:
        print("Exception when calling CompanyApi->post_company_key_items_fiscal_year_list_by_instrument: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **post_company_key_items_fiscal_year_list_by_instrument_request** | [**PostCompanyKeyItemsFiscalYearListByInstrumentRequest**](PostCompanyKeyItemsFiscalYearListByInstrumentRequest.md)|  | [optional]

### Return type

[**InlineResponse2001**](InlineResponse2001.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Successful Response |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

