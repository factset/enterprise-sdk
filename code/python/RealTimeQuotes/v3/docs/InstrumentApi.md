# fds.sdk.RealTimeQuotes.InstrumentApi

All URIs are relative to *https://api.factset.com/wealth/v3*

Method | HTTP request | Description
------------- | ------------- | -------------
[**get_instrument_background_text_list**](InstrumentApi.md#get_instrument_background_text_list) | **GET** /instrument/backgroundText/list | Background texts of an instrument.
[**get_instrument_compliance_property_list_by_instrument**](InstrumentApi.md#get_instrument_compliance_property_list_by_instrument) | **GET** /instrument/complianceProperty/listByInstrument | Compliance properties of an instrument.
[**get_instrument_composite_get**](InstrumentApi.md#get_instrument_composite_get) | **GET** /instrument/composite/get | Composite instrument and its components.
[**get_instrument_coupon_day_count_convention_type_list**](InstrumentApi.md#get_instrument_coupon_day_count_convention_type_list) | **GET** /instrument/coupon/dayCountConvention/type/list | List of day count convention types.
[**get_instrument_coupon_interest_rate_type_list**](InstrumentApi.md#get_instrument_coupon_interest_rate_type_list) | **GET** /instrument/coupon/interestRate/type/list | List of interest rate types.
[**get_instrument_coupon_key_data_get**](InstrumentApi.md#get_instrument_coupon_key_data_get) | **GET** /instrument/coupon/keyData/get | Interest rate details for selected periods of an interest-bearing instrument.
[**get_instrument_coupon_list**](InstrumentApi.md#get_instrument_coupon_list) | **GET** /instrument/coupon/list | List of coupons for an interest-bearing instrument.
[**get_instrument_cross_reference_get_by_isin**](InstrumentApi.md#get_instrument_cross_reference_get_by_isin) | **GET** /instrument/crossReference/getByISIN | Translate ISIN to instrument.
[**get_instrument_cross_reference_get_by_wkn**](InstrumentApi.md#get_instrument_cross_reference_get_by_wkn) | **GET** /instrument/crossReference/getByWKN | Translate WKN to instrument.
[**get_instrument_cross_reference_history_get_by_isin**](InstrumentApi.md#get_instrument_cross_reference_history_get_by_isin) | **GET** /instrument/crossReference/history/getByISIN | ISIN to instrument translation history.
[**get_instrument_cross_reference_history_get_by_wkn**](InstrumentApi.md#get_instrument_cross_reference_history_get_by_wkn) | **GET** /instrument/crossReference/history/getByWKN | WKN to instrument translation history.
[**get_instrument_exchange_rate_get**](InstrumentApi.md#get_instrument_exchange_rate_get) | **GET** /instrument/exchangeRate/get | Retrieve an exchange rate instrument identifier.
[**get_instrument_exchange_rate_get_by_iso_code**](InstrumentApi.md#get_instrument_exchange_rate_get_by_iso_code) | **GET** /instrument/exchangeRate/getByISOCode | Retrieve an exchange rate instrument identifier.
[**get_instrument_get**](InstrumentApi.md#get_instrument_get) | **GET** /instrument/get | Basic data for an instrument.
[**get_instrument_get_by_notation**](InstrumentApi.md#get_instrument_get_by_notation) | **GET** /instrument/getByNotation | Basic data for an instrument.
[**get_instrument_legal_entity_background_text_list**](InstrumentApi.md#get_instrument_legal_entity_background_text_list) | **GET** /instrument/legalEntity/backgroundText/list | Role-specific background texts of legal entities related to an instrument.
[**get_instrument_legal_entity_compliance_property_list**](InstrumentApi.md#get_instrument_legal_entity_compliance_property_list) | **GET** /instrument/legalEntity/complianceProperty/list | Role-specific compliance properties of legal entities related to an instrument.
[**get_instrument_mifid_get**](InstrumentApi.md#get_instrument_mifid_get) | **GET** /instrument/mifid/get | MiFID II data for a financial instrument.
[**get_instrument_search_basic**](InstrumentApi.md#get_instrument_search_basic) | **GET** /instrument/search/basic | Basic search for instruments.
[**get_instrument_selection_list_list**](InstrumentApi.md#get_instrument_selection_list_list) | **GET** /instrument/selectionList/list | Set of custom instrument-level selection lists.
[**get_instrument_selection_list_list_by_instrument**](InstrumentApi.md#get_instrument_selection_list_list_by_instrument) | **GET** /instrument/selectionList/listByInstrument | For each given instrument, returns the instrument-level selection lists of which the instrument is a member.
[**post_instrument_background_text_type_list**](InstrumentApi.md#post_instrument_background_text_type_list) | **POST** /instrument/backgroundText/type/list | List of background text types for instruments.
[**post_instrument_benchmark_list**](InstrumentApi.md#post_instrument_benchmark_list) | **POST** /instrument/benchmark/list | List of benchmarks of a financial instrument.
[**post_instrument_category_list**](InstrumentApi.md#post_instrument_category_list) | **POST** /instrument/category/list | List of categories assigned to a specific instrument the application is entitled to see.
[**post_instrument_compliance_property_list**](InstrumentApi.md#post_instrument_compliance_property_list) | **POST** /instrument/complianceProperty/list | List of compliance properties for instruments.
[**post_instrument_cross_reference_list_by_isin**](InstrumentApi.md#post_instrument_cross_reference_list_by_isin) | **POST** /instrument/crossReference/listByISIN | Translate a list of ISINs to instruments.
[**post_instrument_cross_reference_list_by_wkn**](InstrumentApi.md#post_instrument_cross_reference_list_by_wkn) | **POST** /instrument/crossReference/listByWKN | Translate a list of WKNs to instruments.
[**post_instrument_notation_list**](InstrumentApi.md#post_instrument_notation_list) | **POST** /instrument/notation/list | List of active, entitled notations for a set of instruments.
[**post_instrument_rating_grade_list**](InstrumentApi.md#post_instrument_rating_grade_list) | **POST** /instrument/rating/grade/list | List of rating grades for a list of instruments.
[**post_instrument_selection_list_members_list**](InstrumentApi.md#post_instrument_selection_list_members_list) | **POST** /instrument/selectionList/members/list | List of instruments belonging to an instrument-level selection list.



# **get_instrument_background_text_list**
> InlineResponse20044 get_instrument_background_text_list(identifier, identifier_type)

Background texts of an instrument.

Background texts of an instrument.

### Example

* Basic Authentication (FactSetApiKey):
* OAuth Authentication (FactSetOAuth2):

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.RealTimeQuotes
from fds.sdk.RealTimeQuotes.api import instrument_api
from fds.sdk.RealTimeQuotes.models import *
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
configuration = fds.sdk.RealTimeQuotes.Configuration(
    fds_oauth_client=ConfidentialClient('/path/to/app-config.json')
)

# Basic authentication: FactSetApiKey
# See https://github.com/FactSet/enterprise-sdk#api-key
# for information how to create an API key
# configuration = fds.sdk.RealTimeQuotes.Configuration(
#     username='USERNAME-SERIAL',
#     password='API-KEY'
# )

# Enter a context with an instance of the API client
with fds.sdk.RealTimeQuotes.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = instrument_api.InstrumentApi(api_client)

    # NOTE: The parameter variable defined below is just an example and may potentially contain non valid values. So please replace this with valid values.
    identifier = "PQ6ZGC" # str | 
    # NOTE: The parameter variable defined below is just an example and may potentially contain non valid values. So please replace this with valid values.
    identifier_type = "idInstrument" # str | 
    # NOTE: The parameter variable defined below is just an example and may potentially contain non valid values. So please replace this with valid values.
    attributes = [
        "_attributes_example",
    ] # [str] | Limit the attributes returned in the response to the specified set. (optional)
    # NOTE: The parameter variable defined below is just an example and may potentially contain non valid values. So please replace this with valid values.
    language = "_language_example" # str |  (optional)

    try:
        # Background texts of an instrument.
        # example passing only required values which don't have defaults set
        # and optional values
        api_response = api_instance.get_instrument_background_text_list(identifier, identifier_type, attributes=attributes, language=language)

        pprint(api_response)

    except fds.sdk.RealTimeQuotes.ApiException as e:
        print("Exception when calling InstrumentApi->get_instrument_background_text_list: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **identifier** | **str**|  |
 **identifier_type** | **str**|  |
 **attributes** | **[str]**| Limit the attributes returned in the response to the specified set. | [optional]
 **language** | **str**|  | [optional]

### Return type

[**InlineResponse20044**](InlineResponse20044.md)

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

# **get_instrument_compliance_property_list_by_instrument**
> InlineResponse20049 get_instrument_compliance_property_list_by_instrument(identifier, identifier_type)

Compliance properties of an instrument.

Compliance properties of an instrument.

### Example

* Basic Authentication (FactSetApiKey):
* OAuth Authentication (FactSetOAuth2):

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.RealTimeQuotes
from fds.sdk.RealTimeQuotes.api import instrument_api
from fds.sdk.RealTimeQuotes.models import *
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
configuration = fds.sdk.RealTimeQuotes.Configuration(
    fds_oauth_client=ConfidentialClient('/path/to/app-config.json')
)

# Basic authentication: FactSetApiKey
# See https://github.com/FactSet/enterprise-sdk#api-key
# for information how to create an API key
# configuration = fds.sdk.RealTimeQuotes.Configuration(
#     username='USERNAME-SERIAL',
#     password='API-KEY'
# )

# Enter a context with an instance of the API client
with fds.sdk.RealTimeQuotes.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = instrument_api.InstrumentApi(api_client)

    # NOTE: The parameter variable defined below is just an example and may potentially contain non valid values. So please replace this with valid values.
    identifier = "PQ6ZGC" # str | 
    # NOTE: The parameter variable defined below is just an example and may potentially contain non valid values. So please replace this with valid values.
    identifier_type = "idInstrument" # str | 
    # NOTE: The parameter variable defined below is just an example and may potentially contain non valid values. So please replace this with valid values.
    attributes = [
        "_attributes_example",
    ] # [str] | Limit the attributes returned in the response to the specified set. (optional)
    # NOTE: The parameter variable defined below is just an example and may potentially contain non valid values. So please replace this with valid values.
    language = "_language_example" # str |  (optional)

    try:
        # Compliance properties of an instrument.
        # example passing only required values which don't have defaults set
        # and optional values
        api_response = api_instance.get_instrument_compliance_property_list_by_instrument(identifier, identifier_type, attributes=attributes, language=language)

        pprint(api_response)

    except fds.sdk.RealTimeQuotes.ApiException as e:
        print("Exception when calling InstrumentApi->get_instrument_compliance_property_list_by_instrument: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **identifier** | **str**|  |
 **identifier_type** | **str**|  |
 **attributes** | **[str]**| Limit the attributes returned in the response to the specified set. | [optional]
 **language** | **str**|  | [optional]

### Return type

[**InlineResponse20049**](InlineResponse20049.md)

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

# **get_instrument_composite_get**
> InlineResponse20050 get_instrument_composite_get(identifier, identifier_type)

Composite instrument and its components.

Composite instrument and its components.

### Example

* Basic Authentication (FactSetApiKey):
* OAuth Authentication (FactSetOAuth2):

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.RealTimeQuotes
from fds.sdk.RealTimeQuotes.api import instrument_api
from fds.sdk.RealTimeQuotes.models import *
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
configuration = fds.sdk.RealTimeQuotes.Configuration(
    fds_oauth_client=ConfidentialClient('/path/to/app-config.json')
)

# Basic authentication: FactSetApiKey
# See https://github.com/FactSet/enterprise-sdk#api-key
# for information how to create an API key
# configuration = fds.sdk.RealTimeQuotes.Configuration(
#     username='USERNAME-SERIAL',
#     password='API-KEY'
# )

# Enter a context with an instance of the API client
with fds.sdk.RealTimeQuotes.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = instrument_api.InstrumentApi(api_client)

    # NOTE: The parameter variable defined below is just an example and may potentially contain non valid values. So please replace this with valid values.
    identifier = "PQ6ZGC" # str | 
    # NOTE: The parameter variable defined below is just an example and may potentially contain non valid values. So please replace this with valid values.
    identifier_type = "idInstrument" # str | 
    # NOTE: The parameter variable defined below is just an example and may potentially contain non valid values. So please replace this with valid values.
    attributes = [
        "_attributes_example",
    ] # [str] | Limit the attributes returned in the response to the specified set. (optional)
    # NOTE: The parameter variable defined below is just an example and may potentially contain non valid values. So please replace this with valid values.
    language = "_language_example" # str |  (optional)

    try:
        # Composite instrument and its components.
        # example passing only required values which don't have defaults set
        # and optional values
        api_response = api_instance.get_instrument_composite_get(identifier, identifier_type, attributes=attributes, language=language)

        pprint(api_response)

    except fds.sdk.RealTimeQuotes.ApiException as e:
        print("Exception when calling InstrumentApi->get_instrument_composite_get: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **identifier** | **str**|  |
 **identifier_type** | **str**|  |
 **attributes** | **[str]**| Limit the attributes returned in the response to the specified set. | [optional]
 **language** | **str**|  | [optional]

### Return type

[**InlineResponse20050**](InlineResponse20050.md)

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

# **get_instrument_coupon_day_count_convention_type_list**
> InlineResponse20052 get_instrument_coupon_day_count_convention_type_list()

List of day count convention types.

List of day count convention types.

### Example

* Basic Authentication (FactSetApiKey):
* OAuth Authentication (FactSetOAuth2):

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.RealTimeQuotes
from fds.sdk.RealTimeQuotes.api import instrument_api
from fds.sdk.RealTimeQuotes.models import *
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
configuration = fds.sdk.RealTimeQuotes.Configuration(
    fds_oauth_client=ConfidentialClient('/path/to/app-config.json')
)

# Basic authentication: FactSetApiKey
# See https://github.com/FactSet/enterprise-sdk#api-key
# for information how to create an API key
# configuration = fds.sdk.RealTimeQuotes.Configuration(
#     username='USERNAME-SERIAL',
#     password='API-KEY'
# )

# Enter a context with an instance of the API client
with fds.sdk.RealTimeQuotes.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = instrument_api.InstrumentApi(api_client)

    # NOTE: The parameter variable defined below is just an example and may potentially contain non valid values. So please replace this with valid values.
    attributes = [
        "_attributes_example",
    ] # [str] | Limit the attributes returned in the response to the specified set. (optional)
    # NOTE: The parameter variable defined below is just an example and may potentially contain non valid values. So please replace this with valid values.
    language = "_language_example" # str |  (optional)

    try:
        # List of day count convention types.
        # example passing only required values which don't have defaults set
        # and optional values
        api_response = api_instance.get_instrument_coupon_day_count_convention_type_list(attributes=attributes, language=language)

        pprint(api_response)

    except fds.sdk.RealTimeQuotes.ApiException as e:
        print("Exception when calling InstrumentApi->get_instrument_coupon_day_count_convention_type_list: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **attributes** | **[str]**| Limit the attributes returned in the response to the specified set. | [optional]
 **language** | **str**|  | [optional]

### Return type

[**InlineResponse20052**](InlineResponse20052.md)

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

# **get_instrument_coupon_interest_rate_type_list**
> InlineResponse20053 get_instrument_coupon_interest_rate_type_list()

List of interest rate types.

List of interest rate types.

### Example

* Basic Authentication (FactSetApiKey):
* OAuth Authentication (FactSetOAuth2):

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.RealTimeQuotes
from fds.sdk.RealTimeQuotes.api import instrument_api
from fds.sdk.RealTimeQuotes.models import *
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
configuration = fds.sdk.RealTimeQuotes.Configuration(
    fds_oauth_client=ConfidentialClient('/path/to/app-config.json')
)

# Basic authentication: FactSetApiKey
# See https://github.com/FactSet/enterprise-sdk#api-key
# for information how to create an API key
# configuration = fds.sdk.RealTimeQuotes.Configuration(
#     username='USERNAME-SERIAL',
#     password='API-KEY'
# )

# Enter a context with an instance of the API client
with fds.sdk.RealTimeQuotes.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = instrument_api.InstrumentApi(api_client)

    # NOTE: The parameter variable defined below is just an example and may potentially contain non valid values. So please replace this with valid values.
    attributes = [
        "_attributes_example",
    ] # [str] | Limit the attributes returned in the response to the specified set. (optional)
    # NOTE: The parameter variable defined below is just an example and may potentially contain non valid values. So please replace this with valid values.
    language = "_language_example" # str |  (optional)

    try:
        # List of interest rate types.
        # example passing only required values which don't have defaults set
        # and optional values
        api_response = api_instance.get_instrument_coupon_interest_rate_type_list(attributes=attributes, language=language)

        pprint(api_response)

    except fds.sdk.RealTimeQuotes.ApiException as e:
        print("Exception when calling InstrumentApi->get_instrument_coupon_interest_rate_type_list: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **attributes** | **[str]**| Limit the attributes returned in the response to the specified set. | [optional]
 **language** | **str**|  | [optional]

### Return type

[**InlineResponse20053**](InlineResponse20053.md)

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

# **get_instrument_coupon_key_data_get**
> InlineResponse20054 get_instrument_coupon_key_data_get(identifier, identifier_type)

Interest rate details for selected periods of an interest-bearing instrument.

Interest rate details for selected periods of an interest-bearing instrument; any other instrument yields empty values.

### Example

* Basic Authentication (FactSetApiKey):
* OAuth Authentication (FactSetOAuth2):

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.RealTimeQuotes
from fds.sdk.RealTimeQuotes.api import instrument_api
from fds.sdk.RealTimeQuotes.models import *
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
configuration = fds.sdk.RealTimeQuotes.Configuration(
    fds_oauth_client=ConfidentialClient('/path/to/app-config.json')
)

# Basic authentication: FactSetApiKey
# See https://github.com/FactSet/enterprise-sdk#api-key
# for information how to create an API key
# configuration = fds.sdk.RealTimeQuotes.Configuration(
#     username='USERNAME-SERIAL',
#     password='API-KEY'
# )

# Enter a context with an instance of the API client
with fds.sdk.RealTimeQuotes.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = instrument_api.InstrumentApi(api_client)

    # NOTE: The parameter variable defined below is just an example and may potentially contain non valid values. So please replace this with valid values.
    identifier = "PQ6ZGC" # str | 
    # NOTE: The parameter variable defined below is just an example and may potentially contain non valid values. So please replace this with valid values.
    identifier_type = "idInstrument" # str | 
    # NOTE: The parameter variable defined below is just an example and may potentially contain non valid values. So please replace this with valid values.
    attributes = [
        "_attributes_example",
    ] # [str] | Limit the attributes returned in the response to the specified set. (optional)
    # NOTE: The parameter variable defined below is just an example and may potentially contain non valid values. So please replace this with valid values.
    language = "_language_example" # str |  (optional)

    try:
        # Interest rate details for selected periods of an interest-bearing instrument.
        # example passing only required values which don't have defaults set
        # and optional values
        api_response = api_instance.get_instrument_coupon_key_data_get(identifier, identifier_type, attributes=attributes, language=language)

        pprint(api_response)

    except fds.sdk.RealTimeQuotes.ApiException as e:
        print("Exception when calling InstrumentApi->get_instrument_coupon_key_data_get: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **identifier** | **str**|  |
 **identifier_type** | **str**|  |
 **attributes** | **[str]**| Limit the attributes returned in the response to the specified set. | [optional]
 **language** | **str**|  | [optional]

### Return type

[**InlineResponse20054**](InlineResponse20054.md)

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

# **get_instrument_coupon_list**
> InlineResponse20051 get_instrument_coupon_list(identifier, identifier_type)

List of coupons for an interest-bearing instrument.

List of coupons for an interest-bearing instrument; any other instrument yields empty values. The endpoint provides details regarding the coupon period, the respective interest rate, and payable amount (the latter only for instruments with a fixed nominal value). The list of coupons is generally not available for a perpetual, i.e. without a predefined maturity date, interst-bearing instrument.   If there is no entitled provider supplying a full list of coupons, the list will be synthesized from summary data available from entitled suppliers (if any). Since the exact product terms are not known, e.g. the handling of holidays and weekends, the list may be imprecise.

### Example

* Basic Authentication (FactSetApiKey):
* OAuth Authentication (FactSetOAuth2):

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.RealTimeQuotes
from fds.sdk.RealTimeQuotes.api import instrument_api
from fds.sdk.RealTimeQuotes.models import *
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
configuration = fds.sdk.RealTimeQuotes.Configuration(
    fds_oauth_client=ConfidentialClient('/path/to/app-config.json')
)

# Basic authentication: FactSetApiKey
# See https://github.com/FactSet/enterprise-sdk#api-key
# for information how to create an API key
# configuration = fds.sdk.RealTimeQuotes.Configuration(
#     username='USERNAME-SERIAL',
#     password='API-KEY'
# )

# Enter a context with an instance of the API client
with fds.sdk.RealTimeQuotes.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = instrument_api.InstrumentApi(api_client)

    # NOTE: The parameter variable defined below is just an example and may potentially contain non valid values. So please replace this with valid values.
    identifier = "PQ6ZGC" # str | 
    # NOTE: The parameter variable defined below is just an example and may potentially contain non valid values. So please replace this with valid values.
    identifier_type = "idInstrument" # str | 
    # NOTE: The parameter variable defined below is just an example and may potentially contain non valid values. So please replace this with valid values.
    attributes = [
        "_attributes_example",
    ] # [str] | Limit the attributes returned in the response to the specified set. (optional)
    # NOTE: The parameter variable defined below is just an example and may potentially contain non valid values. So please replace this with valid values.
    language = "_language_example" # str |  (optional)

    try:
        # List of coupons for an interest-bearing instrument.
        # example passing only required values which don't have defaults set
        # and optional values
        api_response = api_instance.get_instrument_coupon_list(identifier, identifier_type, attributes=attributes, language=language)

        pprint(api_response)

    except fds.sdk.RealTimeQuotes.ApiException as e:
        print("Exception when calling InstrumentApi->get_instrument_coupon_list: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **identifier** | **str**|  |
 **identifier_type** | **str**|  |
 **attributes** | **[str]**| Limit the attributes returned in the response to the specified set. | [optional]
 **language** | **str**|  | [optional]

### Return type

[**InlineResponse20051**](InlineResponse20051.md)

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

# **get_instrument_cross_reference_get_by_isin**
> InlineResponse20055 get_instrument_cross_reference_get_by_isin(isin)

Translate ISIN to instrument.

Translate a given ISIN to the respective most recent instrument identifier, retrieved from the Cross Reference Service.

### Example

* Basic Authentication (FactSetApiKey):
* OAuth Authentication (FactSetOAuth2):

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.RealTimeQuotes
from fds.sdk.RealTimeQuotes.api import instrument_api
from fds.sdk.RealTimeQuotes.models import *
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
configuration = fds.sdk.RealTimeQuotes.Configuration(
    fds_oauth_client=ConfidentialClient('/path/to/app-config.json')
)

# Basic authentication: FactSetApiKey
# See https://github.com/FactSet/enterprise-sdk#api-key
# for information how to create an API key
# configuration = fds.sdk.RealTimeQuotes.Configuration(
#     username='USERNAME-SERIAL',
#     password='API-KEY'
# )

# Enter a context with an instance of the API client
with fds.sdk.RealTimeQuotes.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = instrument_api.InstrumentApi(api_client)

    # NOTE: The parameter variable defined below is just an example and may potentially contain non valid values. So please replace this with valid values.
    isin = "isin_example" # str | 
    # NOTE: The parameter variable defined below is just an example and may potentially contain non valid values. So please replace this with valid values.
    attributes = [
        "_attributes_example",
    ] # [str] | Limit the attributes returned in the response to the specified set. (optional)

    try:
        # Translate ISIN to instrument.
        # example passing only required values which don't have defaults set
        # and optional values
        api_response = api_instance.get_instrument_cross_reference_get_by_isin(isin, attributes=attributes)

        pprint(api_response)

    except fds.sdk.RealTimeQuotes.ApiException as e:
        print("Exception when calling InstrumentApi->get_instrument_cross_reference_get_by_isin: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **isin** | **str**|  |
 **attributes** | **[str]**| Limit the attributes returned in the response to the specified set. | [optional]

### Return type

[**InlineResponse20055**](InlineResponse20055.md)

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

# **get_instrument_cross_reference_get_by_wkn**
> InlineResponse20055 get_instrument_cross_reference_get_by_wkn(wkn)

Translate WKN to instrument.

Translate a given WKN to the respective most recent instrument identifier, retrieved from the Cross Reference Service.

### Example

* Basic Authentication (FactSetApiKey):
* OAuth Authentication (FactSetOAuth2):

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.RealTimeQuotes
from fds.sdk.RealTimeQuotes.api import instrument_api
from fds.sdk.RealTimeQuotes.models import *
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
configuration = fds.sdk.RealTimeQuotes.Configuration(
    fds_oauth_client=ConfidentialClient('/path/to/app-config.json')
)

# Basic authentication: FactSetApiKey
# See https://github.com/FactSet/enterprise-sdk#api-key
# for information how to create an API key
# configuration = fds.sdk.RealTimeQuotes.Configuration(
#     username='USERNAME-SERIAL',
#     password='API-KEY'
# )

# Enter a context with an instance of the API client
with fds.sdk.RealTimeQuotes.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = instrument_api.InstrumentApi(api_client)

    # NOTE: The parameter variable defined below is just an example and may potentially contain non valid values. So please replace this with valid values.
    wkn = "8Q6ZGCKEC0L3O4GI7XHK0J" # str | 
    # NOTE: The parameter variable defined below is just an example and may potentially contain non valid values. So please replace this with valid values.
    attributes = [
        "_attributes_example",
    ] # [str] | Limit the attributes returned in the response to the specified set. (optional)

    try:
        # Translate WKN to instrument.
        # example passing only required values which don't have defaults set
        # and optional values
        api_response = api_instance.get_instrument_cross_reference_get_by_wkn(wkn, attributes=attributes)

        pprint(api_response)

    except fds.sdk.RealTimeQuotes.ApiException as e:
        print("Exception when calling InstrumentApi->get_instrument_cross_reference_get_by_wkn: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **wkn** | **str**|  |
 **attributes** | **[str]**| Limit the attributes returned in the response to the specified set. | [optional]

### Return type

[**InlineResponse20055**](InlineResponse20055.md)

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

# **get_instrument_cross_reference_history_get_by_isin**
> InlineResponse20058 get_instrument_cross_reference_history_get_by_isin(isin)

ISIN to instrument translation history.

Retrieve the complete translation history of a given ISIN to the respective instrument association from the Cross Reference Service. The results are sorted in descending order, starting with the most recent.

### Example

* Basic Authentication (FactSetApiKey):
* OAuth Authentication (FactSetOAuth2):

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.RealTimeQuotes
from fds.sdk.RealTimeQuotes.api import instrument_api
from fds.sdk.RealTimeQuotes.models import *
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
configuration = fds.sdk.RealTimeQuotes.Configuration(
    fds_oauth_client=ConfidentialClient('/path/to/app-config.json')
)

# Basic authentication: FactSetApiKey
# See https://github.com/FactSet/enterprise-sdk#api-key
# for information how to create an API key
# configuration = fds.sdk.RealTimeQuotes.Configuration(
#     username='USERNAME-SERIAL',
#     password='API-KEY'
# )

# Enter a context with an instance of the API client
with fds.sdk.RealTimeQuotes.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = instrument_api.InstrumentApi(api_client)

    # NOTE: The parameter variable defined below is just an example and may potentially contain non valid values. So please replace this with valid values.
    isin = "isin_example" # str | 
    # NOTE: The parameter variable defined below is just an example and may potentially contain non valid values. So please replace this with valid values.
    attributes = [
        "_attributes_example",
    ] # [str] | Limit the attributes returned in the response to the specified set. (optional)
    # NOTE: The parameter variable defined below is just an example and may potentially contain non valid values. So please replace this with valid values.
    pagination_offset = 0 # float | Non-negative number of entries to skip, or 0 (default). (optional) if omitted the server will use the default value of 0
    # NOTE: The parameter variable defined below is just an example and may potentially contain non valid values. So please replace this with valid values.
    pagination_limit = 10 # float | Non-negative maximum number of entries to return. (optional) if omitted the server will use the default value of 10

    try:
        # ISIN to instrument translation history.
        # example passing only required values which don't have defaults set
        # and optional values
        api_response = api_instance.get_instrument_cross_reference_history_get_by_isin(isin, attributes=attributes, pagination_offset=pagination_offset, pagination_limit=pagination_limit)

        pprint(api_response)

    except fds.sdk.RealTimeQuotes.ApiException as e:
        print("Exception when calling InstrumentApi->get_instrument_cross_reference_history_get_by_isin: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **isin** | **str**|  |
 **attributes** | **[str]**| Limit the attributes returned in the response to the specified set. | [optional]
 **pagination_offset** | **float**| Non-negative number of entries to skip, or 0 (default). | [optional] if omitted the server will use the default value of 0
 **pagination_limit** | **float**| Non-negative maximum number of entries to return. | [optional] if omitted the server will use the default value of 10

### Return type

[**InlineResponse20058**](InlineResponse20058.md)

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

# **get_instrument_cross_reference_history_get_by_wkn**
> InlineResponse20058 get_instrument_cross_reference_history_get_by_wkn(wkn)

WKN to instrument translation history.

Retrieve the complete translation history of a given WKN to the respective instrument association from the Cross Reference Service. The results are sorted in descending order, starting with the most recent.

### Example

* Basic Authentication (FactSetApiKey):
* OAuth Authentication (FactSetOAuth2):

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.RealTimeQuotes
from fds.sdk.RealTimeQuotes.api import instrument_api
from fds.sdk.RealTimeQuotes.models import *
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
configuration = fds.sdk.RealTimeQuotes.Configuration(
    fds_oauth_client=ConfidentialClient('/path/to/app-config.json')
)

# Basic authentication: FactSetApiKey
# See https://github.com/FactSet/enterprise-sdk#api-key
# for information how to create an API key
# configuration = fds.sdk.RealTimeQuotes.Configuration(
#     username='USERNAME-SERIAL',
#     password='API-KEY'
# )

# Enter a context with an instance of the API client
with fds.sdk.RealTimeQuotes.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = instrument_api.InstrumentApi(api_client)

    # NOTE: The parameter variable defined below is just an example and may potentially contain non valid values. So please replace this with valid values.
    wkn = "8Q6ZGCKEC0L3O4GI7XHK0J" # str | 
    # NOTE: The parameter variable defined below is just an example and may potentially contain non valid values. So please replace this with valid values.
    attributes = [
        "_attributes_example",
    ] # [str] | Limit the attributes returned in the response to the specified set. (optional)
    # NOTE: The parameter variable defined below is just an example and may potentially contain non valid values. So please replace this with valid values.
    pagination_offset = 0 # float | Non-negative number of entries to skip, or 0 (default). (optional) if omitted the server will use the default value of 0
    # NOTE: The parameter variable defined below is just an example and may potentially contain non valid values. So please replace this with valid values.
    pagination_limit = 10 # float | Non-negative maximum number of entries to return. (optional) if omitted the server will use the default value of 10

    try:
        # WKN to instrument translation history.
        # example passing only required values which don't have defaults set
        # and optional values
        api_response = api_instance.get_instrument_cross_reference_history_get_by_wkn(wkn, attributes=attributes, pagination_offset=pagination_offset, pagination_limit=pagination_limit)

        pprint(api_response)

    except fds.sdk.RealTimeQuotes.ApiException as e:
        print("Exception when calling InstrumentApi->get_instrument_cross_reference_history_get_by_wkn: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **wkn** | **str**|  |
 **attributes** | **[str]**| Limit the attributes returned in the response to the specified set. | [optional]
 **pagination_offset** | **float**| Non-negative number of entries to skip, or 0 (default). | [optional] if omitted the server will use the default value of 0
 **pagination_limit** | **float**| Non-negative maximum number of entries to return. | [optional] if omitted the server will use the default value of 10

### Return type

[**InlineResponse20058**](InlineResponse20058.md)

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

# **get_instrument_exchange_rate_get**
> InlineResponse20059 get_instrument_exchange_rate_get(target, source)

Retrieve an exchange rate instrument identifier.

Retrieve an exchange rate instrument identifier using the identifier of the main currencies represented by that exchange rate.    An error is returned if one of the provided parameters is invalid or if no instrument is associated with the given combination of parameters.

### Example

* Basic Authentication (FactSetApiKey):
* OAuth Authentication (FactSetOAuth2):

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.RealTimeQuotes
from fds.sdk.RealTimeQuotes.api import instrument_api
from fds.sdk.RealTimeQuotes.models import *
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
configuration = fds.sdk.RealTimeQuotes.Configuration(
    fds_oauth_client=ConfidentialClient('/path/to/app-config.json')
)

# Basic authentication: FactSetApiKey
# See https://github.com/FactSet/enterprise-sdk#api-key
# for information how to create an API key
# configuration = fds.sdk.RealTimeQuotes.Configuration(
#     username='USERNAME-SERIAL',
#     password='API-KEY'
# )

# Enter a context with an instance of the API client
with fds.sdk.RealTimeQuotes.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = instrument_api.InstrumentApi(api_client)

    # NOTE: The parameter variable defined below is just an example and may potentially contain non valid values. So please replace this with valid values.
    target = 3.14 # float | 
    # NOTE: The parameter variable defined below is just an example and may potentially contain non valid values. So please replace this with valid values.
    source = 3.14 # float | 
    # NOTE: The parameter variable defined below is just an example and may potentially contain non valid values. So please replace this with valid values.
    attributes = [
        "_attributes_example",
    ] # [str] | Limit the attributes returned in the response to the specified set. (optional)
    # NOTE: The parameter variable defined below is just an example and may potentially contain non valid values. So please replace this with valid values.
    language = "_language_example" # str |  (optional)

    try:
        # Retrieve an exchange rate instrument identifier.
        # example passing only required values which don't have defaults set
        # and optional values
        api_response = api_instance.get_instrument_exchange_rate_get(target, source, attributes=attributes, language=language)

        pprint(api_response)

    except fds.sdk.RealTimeQuotes.ApiException as e:
        print("Exception when calling InstrumentApi->get_instrument_exchange_rate_get: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **target** | **float**|  |
 **source** | **float**|  |
 **attributes** | **[str]**| Limit the attributes returned in the response to the specified set. | [optional]
 **language** | **str**|  | [optional]

### Return type

[**InlineResponse20059**](InlineResponse20059.md)

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

# **get_instrument_exchange_rate_get_by_iso_code**
> InlineResponse20059 get_instrument_exchange_rate_get_by_iso_code(target, source)

Retrieve an exchange rate instrument identifier.

Retrieve an exchange rate instrument identifier using the ISO 4217 code of the main currencies represented by that exchange rate.   An error is returned if one of the provided parameters is invalid or if no instrument is associated with the given combination of parameters.

### Example

* Basic Authentication (FactSetApiKey):
* OAuth Authentication (FactSetOAuth2):

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.RealTimeQuotes
from fds.sdk.RealTimeQuotes.api import instrument_api
from fds.sdk.RealTimeQuotes.models import *
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
configuration = fds.sdk.RealTimeQuotes.Configuration(
    fds_oauth_client=ConfidentialClient('/path/to/app-config.json')
)

# Basic authentication: FactSetApiKey
# See https://github.com/FactSet/enterprise-sdk#api-key
# for information how to create an API key
# configuration = fds.sdk.RealTimeQuotes.Configuration(
#     username='USERNAME-SERIAL',
#     password='API-KEY'
# )

# Enter a context with an instance of the API client
with fds.sdk.RealTimeQuotes.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = instrument_api.InstrumentApi(api_client)

    # NOTE: The parameter variable defined below is just an example and may potentially contain non valid values. So please replace this with valid values.
    target = "target_example" # str | 
    # NOTE: The parameter variable defined below is just an example and may potentially contain non valid values. So please replace this with valid values.
    source = "source_example" # str | 
    # NOTE: The parameter variable defined below is just an example and may potentially contain non valid values. So please replace this with valid values.
    attributes = [
        "_attributes_example",
    ] # [str] | Limit the attributes returned in the response to the specified set. (optional)
    # NOTE: The parameter variable defined below is just an example and may potentially contain non valid values. So please replace this with valid values.
    language = "_language_example" # str |  (optional)

    try:
        # Retrieve an exchange rate instrument identifier.
        # example passing only required values which don't have defaults set
        # and optional values
        api_response = api_instance.get_instrument_exchange_rate_get_by_iso_code(target, source, attributes=attributes, language=language)

        pprint(api_response)

    except fds.sdk.RealTimeQuotes.ApiException as e:
        print("Exception when calling InstrumentApi->get_instrument_exchange_rate_get_by_iso_code: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **target** | **str**|  |
 **source** | **str**|  |
 **attributes** | **[str]**| Limit the attributes returned in the response to the specified set. | [optional]
 **language** | **str**|  | [optional]

### Return type

[**InlineResponse20059**](InlineResponse20059.md)

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

# **get_instrument_get**
> InlineResponse20042 get_instrument_get(identifier, identifier_type)

Basic data for an instrument.

Basic data for an instrument.

### Example

* Basic Authentication (FactSetApiKey):
* OAuth Authentication (FactSetOAuth2):

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.RealTimeQuotes
from fds.sdk.RealTimeQuotes.api import instrument_api
from fds.sdk.RealTimeQuotes.models import *
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
configuration = fds.sdk.RealTimeQuotes.Configuration(
    fds_oauth_client=ConfidentialClient('/path/to/app-config.json')
)

# Basic authentication: FactSetApiKey
# See https://github.com/FactSet/enterprise-sdk#api-key
# for information how to create an API key
# configuration = fds.sdk.RealTimeQuotes.Configuration(
#     username='USERNAME-SERIAL',
#     password='API-KEY'
# )

# Enter a context with an instance of the API client
with fds.sdk.RealTimeQuotes.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = instrument_api.InstrumentApi(api_client)

    # NOTE: The parameter variable defined below is just an example and may potentially contain non valid values. So please replace this with valid values.
    identifier = "PQ6ZGC" # str | 
    # NOTE: The parameter variable defined below is just an example and may potentially contain non valid values. So please replace this with valid values.
    identifier_type = "idInstrument" # str | 
    # NOTE: The parameter variable defined below is just an example and may potentially contain non valid values. So please replace this with valid values.
    attributes = [
        "_attributes_example",
    ] # [str] | Limit the attributes returned in the response to the specified set. (optional)
    # NOTE: The parameter variable defined below is just an example and may potentially contain non valid values. So please replace this with valid values.
    language = "_language_example" # str |  (optional)

    try:
        # Basic data for an instrument.
        # example passing only required values which don't have defaults set
        # and optional values
        api_response = api_instance.get_instrument_get(identifier, identifier_type, attributes=attributes, language=language)

        pprint(api_response)

    except fds.sdk.RealTimeQuotes.ApiException as e:
        print("Exception when calling InstrumentApi->get_instrument_get: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **identifier** | **str**|  |
 **identifier_type** | **str**|  |
 **attributes** | **[str]**| Limit the attributes returned in the response to the specified set. | [optional]
 **language** | **str**|  | [optional]

### Return type

[**InlineResponse20042**](InlineResponse20042.md)

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

# **get_instrument_get_by_notation**
> InlineResponse20043 get_instrument_get_by_notation(id)

Basic data for an instrument.

Basic data for an instrument.

### Example

* Basic Authentication (FactSetApiKey):
* OAuth Authentication (FactSetOAuth2):

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.RealTimeQuotes
from fds.sdk.RealTimeQuotes.api import instrument_api
from fds.sdk.RealTimeQuotes.models import *
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
configuration = fds.sdk.RealTimeQuotes.Configuration(
    fds_oauth_client=ConfidentialClient('/path/to/app-config.json')
)

# Basic authentication: FactSetApiKey
# See https://github.com/FactSet/enterprise-sdk#api-key
# for information how to create an API key
# configuration = fds.sdk.RealTimeQuotes.Configuration(
#     username='USERNAME-SERIAL',
#     password='API-KEY'
# )

# Enter a context with an instance of the API client
with fds.sdk.RealTimeQuotes.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = instrument_api.InstrumentApi(api_client)

    # NOTE: The parameter variable defined below is just an example and may potentially contain non valid values. So please replace this with valid values.
    id = "id_example" # str | 
    # NOTE: The parameter variable defined below is just an example and may potentially contain non valid values. So please replace this with valid values.
    attributes = [
        "_attributes_example",
    ] # [str] | Limit the attributes returned in the response to the specified set. (optional)
    # NOTE: The parameter variable defined below is just an example and may potentially contain non valid values. So please replace this with valid values.
    language = "_language_example" # str |  (optional)

    try:
        # Basic data for an instrument.
        # example passing only required values which don't have defaults set
        # and optional values
        api_response = api_instance.get_instrument_get_by_notation(id, attributes=attributes, language=language)

        pprint(api_response)

    except fds.sdk.RealTimeQuotes.ApiException as e:
        print("Exception when calling InstrumentApi->get_instrument_get_by_notation: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **str**|  |
 **attributes** | **[str]**| Limit the attributes returned in the response to the specified set. | [optional]
 **language** | **str**|  | [optional]

### Return type

[**InlineResponse20043**](InlineResponse20043.md)

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

# **get_instrument_legal_entity_background_text_list**
> InlineResponse20060 get_instrument_legal_entity_background_text_list(identifier, identifier_type)

Role-specific background texts of legal entities related to an instrument.

Role-specific background texts of legal entities related to an instrument.

### Example

* Basic Authentication (FactSetApiKey):
* OAuth Authentication (FactSetOAuth2):

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.RealTimeQuotes
from fds.sdk.RealTimeQuotes.api import instrument_api
from fds.sdk.RealTimeQuotes.models import *
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
configuration = fds.sdk.RealTimeQuotes.Configuration(
    fds_oauth_client=ConfidentialClient('/path/to/app-config.json')
)

# Basic authentication: FactSetApiKey
# See https://github.com/FactSet/enterprise-sdk#api-key
# for information how to create an API key
# configuration = fds.sdk.RealTimeQuotes.Configuration(
#     username='USERNAME-SERIAL',
#     password='API-KEY'
# )

# Enter a context with an instance of the API client
with fds.sdk.RealTimeQuotes.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = instrument_api.InstrumentApi(api_client)

    # NOTE: The parameter variable defined below is just an example and may potentially contain non valid values. So please replace this with valid values.
    identifier = "PQ6ZGC" # str | 
    # NOTE: The parameter variable defined below is just an example and may potentially contain non valid values. So please replace this with valid values.
    identifier_type = "idInstrument" # str | 
    # NOTE: The parameter variable defined below is just an example and may potentially contain non valid values. So please replace this with valid values.
    attributes = [
        "_attributes_example",
    ] # [str] | Limit the attributes returned in the response to the specified set. (optional)
    # NOTE: The parameter variable defined below is just an example and may potentially contain non valid values. So please replace this with valid values.
    language = "_language_example" # str |  (optional)

    try:
        # Role-specific background texts of legal entities related to an instrument.
        # example passing only required values which don't have defaults set
        # and optional values
        api_response = api_instance.get_instrument_legal_entity_background_text_list(identifier, identifier_type, attributes=attributes, language=language)

        pprint(api_response)

    except fds.sdk.RealTimeQuotes.ApiException as e:
        print("Exception when calling InstrumentApi->get_instrument_legal_entity_background_text_list: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **identifier** | **str**|  |
 **identifier_type** | **str**|  |
 **attributes** | **[str]**| Limit the attributes returned in the response to the specified set. | [optional]
 **language** | **str**|  | [optional]

### Return type

[**InlineResponse20060**](InlineResponse20060.md)

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

# **get_instrument_legal_entity_compliance_property_list**
> InlineResponse20061 get_instrument_legal_entity_compliance_property_list(identifier, identifier_type)

Role-specific compliance properties of legal entities related to an instrument.

Role-specic compliance properties of legal entities related to an instrument.

### Example

* Basic Authentication (FactSetApiKey):
* OAuth Authentication (FactSetOAuth2):

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.RealTimeQuotes
from fds.sdk.RealTimeQuotes.api import instrument_api
from fds.sdk.RealTimeQuotes.models import *
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
configuration = fds.sdk.RealTimeQuotes.Configuration(
    fds_oauth_client=ConfidentialClient('/path/to/app-config.json')
)

# Basic authentication: FactSetApiKey
# See https://github.com/FactSet/enterprise-sdk#api-key
# for information how to create an API key
# configuration = fds.sdk.RealTimeQuotes.Configuration(
#     username='USERNAME-SERIAL',
#     password='API-KEY'
# )

# Enter a context with an instance of the API client
with fds.sdk.RealTimeQuotes.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = instrument_api.InstrumentApi(api_client)

    # NOTE: The parameter variable defined below is just an example and may potentially contain non valid values. So please replace this with valid values.
    identifier = "PQ6ZGC" # str | 
    # NOTE: The parameter variable defined below is just an example and may potentially contain non valid values. So please replace this with valid values.
    identifier_type = "idInstrument" # str | 
    # NOTE: The parameter variable defined below is just an example and may potentially contain non valid values. So please replace this with valid values.
    attributes = [
        "_attributes_example",
    ] # [str] | Limit the attributes returned in the response to the specified set. (optional)
    # NOTE: The parameter variable defined below is just an example and may potentially contain non valid values. So please replace this with valid values.
    language = "_language_example" # str |  (optional)

    try:
        # Role-specific compliance properties of legal entities related to an instrument.
        # example passing only required values which don't have defaults set
        # and optional values
        api_response = api_instance.get_instrument_legal_entity_compliance_property_list(identifier, identifier_type, attributes=attributes, language=language)

        pprint(api_response)

    except fds.sdk.RealTimeQuotes.ApiException as e:
        print("Exception when calling InstrumentApi->get_instrument_legal_entity_compliance_property_list: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **identifier** | **str**|  |
 **identifier_type** | **str**|  |
 **attributes** | **[str]**| Limit the attributes returned in the response to the specified set. | [optional]
 **language** | **str**|  | [optional]

### Return type

[**InlineResponse20061**](InlineResponse20061.md)

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

# **get_instrument_mifid_get**
> InlineResponse20062 get_instrument_mifid_get(identifier, identifier_type)

MiFID II data for a financial instrument.

MiFID II data for a specified financial instrument. The instruments governed by MiFID II are called \"investment products\".

### Example

* Basic Authentication (FactSetApiKey):
* OAuth Authentication (FactSetOAuth2):

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.RealTimeQuotes
from fds.sdk.RealTimeQuotes.api import instrument_api
from fds.sdk.RealTimeQuotes.models import *
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
configuration = fds.sdk.RealTimeQuotes.Configuration(
    fds_oauth_client=ConfidentialClient('/path/to/app-config.json')
)

# Basic authentication: FactSetApiKey
# See https://github.com/FactSet/enterprise-sdk#api-key
# for information how to create an API key
# configuration = fds.sdk.RealTimeQuotes.Configuration(
#     username='USERNAME-SERIAL',
#     password='API-KEY'
# )

# Enter a context with an instance of the API client
with fds.sdk.RealTimeQuotes.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = instrument_api.InstrumentApi(api_client)

    # NOTE: The parameter variable defined below is just an example and may potentially contain non valid values. So please replace this with valid values.
    identifier = "PQ6ZGC" # str | 
    # NOTE: The parameter variable defined below is just an example and may potentially contain non valid values. So please replace this with valid values.
    identifier_type = "idInstrument" # str | 
    # NOTE: The parameter variable defined below is just an example and may potentially contain non valid values. So please replace this with valid values.
    attributes = [
        "_attributes_example",
    ] # [str] | Limit the attributes returned in the response to the specified set. (optional)
    # NOTE: The parameter variable defined below is just an example and may potentially contain non valid values. So please replace this with valid values.
    language = "_language_example" # str |  (optional)

    try:
        # MiFID II data for a financial instrument.
        # example passing only required values which don't have defaults set
        # and optional values
        api_response = api_instance.get_instrument_mifid_get(identifier, identifier_type, attributes=attributes, language=language)

        pprint(api_response)

    except fds.sdk.RealTimeQuotes.ApiException as e:
        print("Exception when calling InstrumentApi->get_instrument_mifid_get: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **identifier** | **str**|  |
 **identifier_type** | **str**|  |
 **attributes** | **[str]**| Limit the attributes returned in the response to the specified set. | [optional]
 **language** | **str**|  | [optional]

### Return type

[**InlineResponse20062**](InlineResponse20062.md)

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

# **get_instrument_search_basic**
> InlineResponse20097 get_instrument_search_basic(search_value)

Basic search for instruments.

Search for instruments whose ISIN, specified NSINs, or name match the search value according to a tolerant full-text match algorithm. Better matching results appear in the response before less relevant matches.

### Example

* Basic Authentication (FactSetApiKey):
* OAuth Authentication (FactSetOAuth2):

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.RealTimeQuotes
from fds.sdk.RealTimeQuotes.api import instrument_api
from fds.sdk.RealTimeQuotes.models import *
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
configuration = fds.sdk.RealTimeQuotes.Configuration(
    fds_oauth_client=ConfidentialClient('/path/to/app-config.json')
)

# Basic authentication: FactSetApiKey
# See https://github.com/FactSet/enterprise-sdk#api-key
# for information how to create an API key
# configuration = fds.sdk.RealTimeQuotes.Configuration(
#     username='USERNAME-SERIAL',
#     password='API-KEY'
# )

# Enter a context with an instance of the API client
with fds.sdk.RealTimeQuotes.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = instrument_api.InstrumentApi(api_client)

    # NOTE: The parameter variable defined below is just an example and may potentially contain non valid values. So please replace this with valid values.
    search_value = "RyDnZVoeN782F) 9-xW)gz" # str | 
    # NOTE: The parameter variable defined below is just an example and may potentially contain non valid values. So please replace this with valid values.
    nsins = [
        "wkn",
    ] # [str] |  (optional)
    # NOTE: The parameter variable defined below is just an example and may potentially contain non valid values. So please replace this with valid values.
    asset_class = "index" # str |  (optional)
    # NOTE: The parameter variable defined below is just an example and may potentially contain non valid values. So please replace this with valid values.
    only_active = True # bool |  (optional) if omitted the server will use the default value of True
    # NOTE: The parameter variable defined below is just an example and may potentially contain non valid values. So please replace this with valid values.
    attributes = [
        "_attributes_example",
    ] # [str] | Limit the attributes returned in the response to the specified set. (optional)
    # NOTE: The parameter variable defined below is just an example and may potentially contain non valid values. So please replace this with valid values.
    language = "_language_example" # str |  (optional)
    # NOTE: The parameter variable defined below is just an example and may potentially contain non valid values. So please replace this with valid values.
    pagination_offset = 0 # float | Non-negative number of entries to skip, or 0 (default). (optional) if omitted the server will use the default value of 0
    # NOTE: The parameter variable defined below is just an example and may potentially contain non valid values. So please replace this with valid values.
    pagination_limit = 20 # float | Non-negative maximum number of entries to return. (optional) if omitted the server will use the default value of 20

    try:
        # Basic search for instruments.
        # example passing only required values which don't have defaults set
        # and optional values
        api_response = api_instance.get_instrument_search_basic(search_value, nsins=nsins, asset_class=asset_class, only_active=only_active, attributes=attributes, language=language, pagination_offset=pagination_offset, pagination_limit=pagination_limit)

        pprint(api_response)

    except fds.sdk.RealTimeQuotes.ApiException as e:
        print("Exception when calling InstrumentApi->get_instrument_search_basic: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **search_value** | **str**|  |
 **nsins** | **[str]**|  | [optional]
 **asset_class** | **str**|  | [optional]
 **only_active** | **bool**|  | [optional] if omitted the server will use the default value of True
 **attributes** | **[str]**| Limit the attributes returned in the response to the specified set. | [optional]
 **language** | **str**|  | [optional]
 **pagination_offset** | **float**| Non-negative number of entries to skip, or 0 (default). | [optional] if omitted the server will use the default value of 0
 **pagination_limit** | **float**| Non-negative maximum number of entries to return. | [optional] if omitted the server will use the default value of 20

### Return type

[**InlineResponse20097**](InlineResponse20097.md)

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

# **get_instrument_selection_list_list**
> InlineResponse20065 get_instrument_selection_list_list()

Set of custom instrument-level selection lists.

Set of custom instrument-level selection lists.

### Example

* Basic Authentication (FactSetApiKey):
* OAuth Authentication (FactSetOAuth2):

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.RealTimeQuotes
from fds.sdk.RealTimeQuotes.api import instrument_api
from fds.sdk.RealTimeQuotes.models import *
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
configuration = fds.sdk.RealTimeQuotes.Configuration(
    fds_oauth_client=ConfidentialClient('/path/to/app-config.json')
)

# Basic authentication: FactSetApiKey
# See https://github.com/FactSet/enterprise-sdk#api-key
# for information how to create an API key
# configuration = fds.sdk.RealTimeQuotes.Configuration(
#     username='USERNAME-SERIAL',
#     password='API-KEY'
# )

# Enter a context with an instance of the API client
with fds.sdk.RealTimeQuotes.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = instrument_api.InstrumentApi(api_client)

    # NOTE: The parameter variable defined below is just an example and may potentially contain non valid values. So please replace this with valid values.
    attributes = [
        "_attributes_example",
    ] # [str] | Limit the attributes returned in the response to the specified set. (optional)

    try:
        # Set of custom instrument-level selection lists.
        # example passing only required values which don't have defaults set
        # and optional values
        api_response = api_instance.get_instrument_selection_list_list(attributes=attributes)

        pprint(api_response)

    except fds.sdk.RealTimeQuotes.ApiException as e:
        print("Exception when calling InstrumentApi->get_instrument_selection_list_list: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **attributes** | **[str]**| Limit the attributes returned in the response to the specified set. | [optional]

### Return type

[**InlineResponse20065**](InlineResponse20065.md)

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

# **get_instrument_selection_list_list_by_instrument**
> InlineResponse20066 get_instrument_selection_list_list_by_instrument(identifiers, identifier_type)

For each given instrument, returns the instrument-level selection lists of which the instrument is a member.

For each given instrument, returns the instrument-level selection lists of which the instrument is a member.

### Example

* Basic Authentication (FactSetApiKey):
* OAuth Authentication (FactSetOAuth2):

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.RealTimeQuotes
from fds.sdk.RealTimeQuotes.api import instrument_api
from fds.sdk.RealTimeQuotes.models import *
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
configuration = fds.sdk.RealTimeQuotes.Configuration(
    fds_oauth_client=ConfidentialClient('/path/to/app-config.json')
)

# Basic authentication: FactSetApiKey
# See https://github.com/FactSet/enterprise-sdk#api-key
# for information how to create an API key
# configuration = fds.sdk.RealTimeQuotes.Configuration(
#     username='USERNAME-SERIAL',
#     password='API-KEY'
# )

# Enter a context with an instance of the API client
with fds.sdk.RealTimeQuotes.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = instrument_api.InstrumentApi(api_client)

    # NOTE: The parameter variable defined below is just an example and may potentially contain non valid values. So please replace this with valid values.
    identifiers = [
        "PQ6ZGC",
    ] # [str] | 
    # NOTE: The parameter variable defined below is just an example and may potentially contain non valid values. So please replace this with valid values.
    identifier_type = "idInstrument" # str | 
    # NOTE: The parameter variable defined below is just an example and may potentially contain non valid values. So please replace this with valid values.
    attributes = [
        "_attributes_example",
    ] # [str] | Limit the attributes returned in the response to the specified set. (optional)

    try:
        # For each given instrument, returns the instrument-level selection lists of which the instrument is a member.
        # example passing only required values which don't have defaults set
        # and optional values
        api_response = api_instance.get_instrument_selection_list_list_by_instrument(identifiers, identifier_type, attributes=attributes)

        pprint(api_response)

    except fds.sdk.RealTimeQuotes.ApiException as e:
        print("Exception when calling InstrumentApi->get_instrument_selection_list_list_by_instrument: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **identifiers** | **[str]**|  |
 **identifier_type** | **str**|  |
 **attributes** | **[str]**| Limit the attributes returned in the response to the specified set. | [optional]

### Return type

[**InlineResponse20066**](InlineResponse20066.md)

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

# **post_instrument_background_text_type_list**
> InlineResponse20045 post_instrument_background_text_type_list()

List of background text types for instruments.

List of background text types for instruments.

### Example

* Basic Authentication (FactSetApiKey):
* OAuth Authentication (FactSetOAuth2):

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.RealTimeQuotes
from fds.sdk.RealTimeQuotes.api import instrument_api
from fds.sdk.RealTimeQuotes.models import *
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
configuration = fds.sdk.RealTimeQuotes.Configuration(
    fds_oauth_client=ConfidentialClient('/path/to/app-config.json')
)

# Basic authentication: FactSetApiKey
# See https://github.com/FactSet/enterprise-sdk#api-key
# for information how to create an API key
# configuration = fds.sdk.RealTimeQuotes.Configuration(
#     username='USERNAME-SERIAL',
#     password='API-KEY'
# )

# Enter a context with an instance of the API client
with fds.sdk.RealTimeQuotes.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = instrument_api.InstrumentApi(api_client)

    # NOTE: The parameter variable defined below is just an example and may potentially contain non valid values. So please replace this with valid values.
    post_instrument_background_text_type_list_request = PostInstrumentBackgroundTextTypeListRequest(
        data=PostInstrumentBackgroundTextTypeListRequestData(
            filter=PostInstrumentBackgroundTextTypeListRequestDataFilter(
                ids=[
                    3.14,
                ],
            ),
        ),
        meta=PostInstrumentBackgroundTextTypeListRequestMeta(
            attributes=AttributesMember([
                "attributes_example",
            ]),
            language=LanguageMember("language_example"),
        ),
    ) # PostInstrumentBackgroundTextTypeListRequest | Request Body (optional)

    try:
        # List of background text types for instruments.
        # example passing only required values which don't have defaults set
        # and optional values
        api_response = api_instance.post_instrument_background_text_type_list(post_instrument_background_text_type_list_request=post_instrument_background_text_type_list_request)

        pprint(api_response)

    except fds.sdk.RealTimeQuotes.ApiException as e:
        print("Exception when calling InstrumentApi->post_instrument_background_text_type_list: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **post_instrument_background_text_type_list_request** | [**PostInstrumentBackgroundTextTypeListRequest**](PostInstrumentBackgroundTextTypeListRequest.md)| Request Body | [optional]

### Return type

[**InlineResponse20045**](InlineResponse20045.md)

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

# **post_instrument_benchmark_list**
> InlineResponse20046 post_instrument_benchmark_list()

List of benchmarks of a financial instrument.

Provides a list of benchmark notations for a selected financial instrument, optionally restricted to specific benchmark types.

### Example

* Basic Authentication (FactSetApiKey):
* OAuth Authentication (FactSetOAuth2):

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.RealTimeQuotes
from fds.sdk.RealTimeQuotes.api import instrument_api
from fds.sdk.RealTimeQuotes.models import *
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
configuration = fds.sdk.RealTimeQuotes.Configuration(
    fds_oauth_client=ConfidentialClient('/path/to/app-config.json')
)

# Basic authentication: FactSetApiKey
# See https://github.com/FactSet/enterprise-sdk#api-key
# for information how to create an API key
# configuration = fds.sdk.RealTimeQuotes.Configuration(
#     username='USERNAME-SERIAL',
#     password='API-KEY'
# )

# Enter a context with an instance of the API client
with fds.sdk.RealTimeQuotes.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = instrument_api.InstrumentApi(api_client)

    # NOTE: The parameter variable defined below is just an example and may potentially contain non valid values. So please replace this with valid values.
    post_instrument_benchmark_list_request = PostInstrumentBenchmarkListRequest(
        data=PostInstrumentBenchmarkListRequestData(
            identifier=PostInstrumentBenchmarkListRequestDataIdentifier(
                value="PQ6ZGC",
                type="idInstrument",
            ),
            filter=PostInstrumentBenchmarkListRequestDataFilter(
                types=[
                    3.14,
                ],
            ),
        ),
        meta=PostInstrumentBackgroundTextTypeListRequestMeta(
            attributes=AttributesMember([
                "attributes_example",
            ]),
            language=LanguageMember("language_example"),
        ),
    ) # PostInstrumentBenchmarkListRequest | Request Body (optional)

    try:
        # List of benchmarks of a financial instrument.
        # example passing only required values which don't have defaults set
        # and optional values
        api_response = api_instance.post_instrument_benchmark_list(post_instrument_benchmark_list_request=post_instrument_benchmark_list_request)

        pprint(api_response)

    except fds.sdk.RealTimeQuotes.ApiException as e:
        print("Exception when calling InstrumentApi->post_instrument_benchmark_list: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **post_instrument_benchmark_list_request** | [**PostInstrumentBenchmarkListRequest**](PostInstrumentBenchmarkListRequest.md)| Request Body | [optional]

### Return type

[**InlineResponse20046**](InlineResponse20046.md)

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

# **post_instrument_category_list**
> InlineResponse20047 post_instrument_category_list()

List of categories assigned to a specific instrument the application is entitled to see.

List of categories assigned to a specific instrument the application is entitled to see. Optionally it is possible to restrict the output to only list those for a specific category dataset.

### Example

* Basic Authentication (FactSetApiKey):
* OAuth Authentication (FactSetOAuth2):

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.RealTimeQuotes
from fds.sdk.RealTimeQuotes.api import instrument_api
from fds.sdk.RealTimeQuotes.models import *
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
configuration = fds.sdk.RealTimeQuotes.Configuration(
    fds_oauth_client=ConfidentialClient('/path/to/app-config.json')
)

# Basic authentication: FactSetApiKey
# See https://github.com/FactSet/enterprise-sdk#api-key
# for information how to create an API key
# configuration = fds.sdk.RealTimeQuotes.Configuration(
#     username='USERNAME-SERIAL',
#     password='API-KEY'
# )

# Enter a context with an instance of the API client
with fds.sdk.RealTimeQuotes.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = instrument_api.InstrumentApi(api_client)

    # NOTE: The parameter variable defined below is just an example and may potentially contain non valid values. So please replace this with valid values.
    post_instrument_category_list_request = PostInstrumentCategoryListRequest(
        data=PostInstrumentCategoryListRequestData(
            identifier=PostInstrumentBenchmarkListRequestDataIdentifier(
                value="PQ6ZGC",
                type="idInstrument",
            ),
            filter=PostInstrumentCategoryListRequestDataFilter(
                dataset=PostInstrumentCategoryListRequestDataFilterDataset(
                    id=3.14,
                ),
            ),
        ),
        meta=PostInstrumentCategoryListRequestMeta(
            attributes=AttributesMember([
                "attributes_example",
            ]),
            language=LanguageMember("language_example"),
            sort=["datasets.dataset.name"],
        ),
    ) # PostInstrumentCategoryListRequest | Request Body (optional)

    try:
        # List of categories assigned to a specific instrument the application is entitled to see.
        # example passing only required values which don't have defaults set
        # and optional values
        api_response = api_instance.post_instrument_category_list(post_instrument_category_list_request=post_instrument_category_list_request)

        pprint(api_response)

    except fds.sdk.RealTimeQuotes.ApiException as e:
        print("Exception when calling InstrumentApi->post_instrument_category_list: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **post_instrument_category_list_request** | [**PostInstrumentCategoryListRequest**](PostInstrumentCategoryListRequest.md)| Request Body | [optional]

### Return type

[**InlineResponse20047**](InlineResponse20047.md)

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

# **post_instrument_compliance_property_list**
> InlineResponse20048 post_instrument_compliance_property_list()

List of compliance properties for instruments.

List of compliance properties for instruments.

### Example

* Basic Authentication (FactSetApiKey):
* OAuth Authentication (FactSetOAuth2):

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.RealTimeQuotes
from fds.sdk.RealTimeQuotes.api import instrument_api
from fds.sdk.RealTimeQuotes.models import *
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
configuration = fds.sdk.RealTimeQuotes.Configuration(
    fds_oauth_client=ConfidentialClient('/path/to/app-config.json')
)

# Basic authentication: FactSetApiKey
# See https://github.com/FactSet/enterprise-sdk#api-key
# for information how to create an API key
# configuration = fds.sdk.RealTimeQuotes.Configuration(
#     username='USERNAME-SERIAL',
#     password='API-KEY'
# )

# Enter a context with an instance of the API client
with fds.sdk.RealTimeQuotes.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = instrument_api.InstrumentApi(api_client)

    # NOTE: The parameter variable defined below is just an example and may potentially contain non valid values. So please replace this with valid values.
    post_instrument_compliance_property_list_request = PostInstrumentCompliancePropertyListRequest(
        data=PostInstrumentCompliancePropertyListRequestData(
            filter=PostInstrumentCompliancePropertyListRequestDataFilter(
                ids=[
                    3.14,
                ],
            ),
        ),
        meta=PostInstrumentBackgroundTextTypeListRequestMeta(
            attributes=AttributesMember([
                "attributes_example",
            ]),
            language=LanguageMember("language_example"),
        ),
    ) # PostInstrumentCompliancePropertyListRequest | Request Body (optional)

    try:
        # List of compliance properties for instruments.
        # example passing only required values which don't have defaults set
        # and optional values
        api_response = api_instance.post_instrument_compliance_property_list(post_instrument_compliance_property_list_request=post_instrument_compliance_property_list_request)

        pprint(api_response)

    except fds.sdk.RealTimeQuotes.ApiException as e:
        print("Exception when calling InstrumentApi->post_instrument_compliance_property_list: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **post_instrument_compliance_property_list_request** | [**PostInstrumentCompliancePropertyListRequest**](PostInstrumentCompliancePropertyListRequest.md)| Request Body | [optional]

### Return type

[**InlineResponse20048**](InlineResponse20048.md)

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

# **post_instrument_cross_reference_list_by_isin**
> InlineResponse20056 post_instrument_cross_reference_list_by_isin(post_instrument_cross_reference_list_by_isin_request)

Translate a list of ISINs to instruments.

Translate a given list of ISINs to the respective most recent instrument identifiers, retrieved from the Cross Reference Service.

### Example

* Basic Authentication (FactSetApiKey):
* OAuth Authentication (FactSetOAuth2):

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.RealTimeQuotes
from fds.sdk.RealTimeQuotes.api import instrument_api
from fds.sdk.RealTimeQuotes.models import *
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
configuration = fds.sdk.RealTimeQuotes.Configuration(
    fds_oauth_client=ConfidentialClient('/path/to/app-config.json')
)

# Basic authentication: FactSetApiKey
# See https://github.com/FactSet/enterprise-sdk#api-key
# for information how to create an API key
# configuration = fds.sdk.RealTimeQuotes.Configuration(
#     username='USERNAME-SERIAL',
#     password='API-KEY'
# )

# Enter a context with an instance of the API client
with fds.sdk.RealTimeQuotes.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = instrument_api.InstrumentApi(api_client)

    # NOTE: The parameter variable defined below is just an example and may potentially contain non valid values. So please replace this with valid values.
    post_instrument_cross_reference_list_by_isin_request = PostInstrumentCrossReferenceListByISINRequest(
        data=PostInstrumentCrossReferenceListByISINRequestData(
            isins=[
                "isins_example",
            ],
        ),
        meta=PostBasicBackgroundTextTypeListRequestMeta(
            attributes=AttributesMember([
                "attributes_example",
            ]),
        ),
    ) # PostInstrumentCrossReferenceListByISINRequest | Request Body

    try:
        # Translate a list of ISINs to instruments.
        # example passing only required values which don't have defaults set
        api_response = api_instance.post_instrument_cross_reference_list_by_isin(post_instrument_cross_reference_list_by_isin_request)

        pprint(api_response)

    except fds.sdk.RealTimeQuotes.ApiException as e:
        print("Exception when calling InstrumentApi->post_instrument_cross_reference_list_by_isin: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **post_instrument_cross_reference_list_by_isin_request** | [**PostInstrumentCrossReferenceListByISINRequest**](PostInstrumentCrossReferenceListByISINRequest.md)| Request Body |

### Return type

[**InlineResponse20056**](InlineResponse20056.md)

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

# **post_instrument_cross_reference_list_by_wkn**
> InlineResponse20057 post_instrument_cross_reference_list_by_wkn(post_instrument_cross_reference_list_by_wkn_request)

Translate a list of WKNs to instruments.

Translate a given list of WKNs to the respective most recent instrument identifiers, retrieved from the Cross Reference Service.

### Example

* Basic Authentication (FactSetApiKey):
* OAuth Authentication (FactSetOAuth2):

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.RealTimeQuotes
from fds.sdk.RealTimeQuotes.api import instrument_api
from fds.sdk.RealTimeQuotes.models import *
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
configuration = fds.sdk.RealTimeQuotes.Configuration(
    fds_oauth_client=ConfidentialClient('/path/to/app-config.json')
)

# Basic authentication: FactSetApiKey
# See https://github.com/FactSet/enterprise-sdk#api-key
# for information how to create an API key
# configuration = fds.sdk.RealTimeQuotes.Configuration(
#     username='USERNAME-SERIAL',
#     password='API-KEY'
# )

# Enter a context with an instance of the API client
with fds.sdk.RealTimeQuotes.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = instrument_api.InstrumentApi(api_client)

    # NOTE: The parameter variable defined below is just an example and may potentially contain non valid values. So please replace this with valid values.
    post_instrument_cross_reference_list_by_wkn_request = PostInstrumentCrossReferenceListByWKNRequest(
        data=PostInstrumentCrossReferenceListByWKNRequestData(
            wkns=[
                "8Q6ZGCKEC0L3O4GI7XHK0J",
            ],
        ),
        meta=PostBasicBackgroundTextTypeListRequestMeta(
            attributes=AttributesMember([
                "attributes_example",
            ]),
        ),
    ) # PostInstrumentCrossReferenceListByWKNRequest | Request Body

    try:
        # Translate a list of WKNs to instruments.
        # example passing only required values which don't have defaults set
        api_response = api_instance.post_instrument_cross_reference_list_by_wkn(post_instrument_cross_reference_list_by_wkn_request)

        pprint(api_response)

    except fds.sdk.RealTimeQuotes.ApiException as e:
        print("Exception when calling InstrumentApi->post_instrument_cross_reference_list_by_wkn: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **post_instrument_cross_reference_list_by_wkn_request** | [**PostInstrumentCrossReferenceListByWKNRequest**](PostInstrumentCrossReferenceListByWKNRequest.md)| Request Body |

### Return type

[**InlineResponse20057**](InlineResponse20057.md)

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

# **post_instrument_notation_list**
> InlineResponse20063 post_instrument_notation_list()

List of active, entitled notations for a set of instruments.

List of active, entitled notations for a set of instruments. By default the list of notations (per instrument) is sorted descending by the trading volume, averaged over one month. All identifiers used as parameters must be valid and entitled.

### Example

* Basic Authentication (FactSetApiKey):
* OAuth Authentication (FactSetOAuth2):

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.RealTimeQuotes
from fds.sdk.RealTimeQuotes.api import instrument_api
from fds.sdk.RealTimeQuotes.models import *
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
configuration = fds.sdk.RealTimeQuotes.Configuration(
    fds_oauth_client=ConfidentialClient('/path/to/app-config.json')
)

# Basic authentication: FactSetApiKey
# See https://github.com/FactSet/enterprise-sdk#api-key
# for information how to create an API key
# configuration = fds.sdk.RealTimeQuotes.Configuration(
#     username='USERNAME-SERIAL',
#     password='API-KEY'
# )

# Enter a context with an instance of the API client
with fds.sdk.RealTimeQuotes.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = instrument_api.InstrumentApi(api_client)

    # NOTE: The parameter variable defined below is just an example and may potentially contain non valid values. So please replace this with valid values.
    post_instrument_notation_list_request = PostInstrumentNotationListRequest(
        data=PostInstrumentNotationListRequestData(
            identifier=PostInstrumentNotationListRequestDataIdentifier(
                values=[
                    "PQ6ZGC",
                ],
                type="idInstrument",
            ),
            filter=PostInstrumentNotationListRequestDataFilter(
                value_unit=PostInstrumentNotationListRequestDataFilterValueUnit(
                    selection=PostInstrumentNotationListRequestDataFilterValueUnitSelection(
                        restrict=PostInstrumentNotationListRequestDataFilterValueUnitSelectionRestrict(
                            ids=[
                                3.14,
                            ],
                        ),
                        exclude=PostInstrumentNotationListRequestDataFilterValueUnitSelectionExclude(
                            ids=[
                                3.14,
                            ],
                        ),
                    ),
                    order=PostInstrumentNotationListRequestDataFilterValueUnitOrder(
                        ids=[
                            3.14,
                        ],
                    ),
                ),
                market=PostInstrumentNotationListRequestDataFilterMarket(
                    selection=PostInstrumentNotationListRequestDataFilterMarketSelection(
                        restrict=PostInstrumentNotationListRequestDataFilterMarketSelectionRestrict(
                            ids=[
                                3.14,
                            ],
                        ),
                        exclude=PostInstrumentNotationListRequestDataFilterMarketSelectionExclude(
                            ids=[
                                3.14,
                            ],
                        ),
                        sip_only=True,
                    ),
                    order=PostInstrumentNotationListRequestDataFilterMarketOrder(
                        ids=[
                            3.14,
                        ],
                    ),
                ),
            ),
        ),
        meta=PostInstrumentNotationListRequestMeta(
            attributes=AttributesMember([
                "attributes_example",
            ]),
            language=LanguageMember("language_example"),
            sort=["notations.tradingVolume.month1.average"],
        ),
    ) # PostInstrumentNotationListRequest | Request Body (optional)

    try:
        # List of active, entitled notations for a set of instruments.
        # example passing only required values which don't have defaults set
        # and optional values
        api_response = api_instance.post_instrument_notation_list(post_instrument_notation_list_request=post_instrument_notation_list_request)

        pprint(api_response)

    except fds.sdk.RealTimeQuotes.ApiException as e:
        print("Exception when calling InstrumentApi->post_instrument_notation_list: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **post_instrument_notation_list_request** | [**PostInstrumentNotationListRequest**](PostInstrumentNotationListRequest.md)| Request Body | [optional]

### Return type

[**InlineResponse20063**](InlineResponse20063.md)

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

# **post_instrument_rating_grade_list**
> InlineResponse20064 post_instrument_rating_grade_list()

List of rating grades for a list of instruments.

List of rating grades for a list of instruments. The list can be restricted to rating grades belonging to particular rating systems.

### Example

* Basic Authentication (FactSetApiKey):
* OAuth Authentication (FactSetOAuth2):

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.RealTimeQuotes
from fds.sdk.RealTimeQuotes.api import instrument_api
from fds.sdk.RealTimeQuotes.models import *
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
configuration = fds.sdk.RealTimeQuotes.Configuration(
    fds_oauth_client=ConfidentialClient('/path/to/app-config.json')
)

# Basic authentication: FactSetApiKey
# See https://github.com/FactSet/enterprise-sdk#api-key
# for information how to create an API key
# configuration = fds.sdk.RealTimeQuotes.Configuration(
#     username='USERNAME-SERIAL',
#     password='API-KEY'
# )

# Enter a context with an instance of the API client
with fds.sdk.RealTimeQuotes.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = instrument_api.InstrumentApi(api_client)

    # NOTE: The parameter variable defined below is just an example and may potentially contain non valid values. So please replace this with valid values.
    post_instrument_rating_grade_list_request = PostInstrumentRatingGradeListRequest(
        data=PostInstrumentRatingGradeListRequestData(
            identifier=PostInstrumentNotationListRequestDataIdentifier(
                values=[
                    "PQ6ZGC",
                ],
                type="idInstrument",
            ),
            filter=PostInstrumentRatingGradeListRequestDataFilter(
                rating_system=PostInstrumentRatingGradeListRequestDataFilterRatingSystem(
                    ids=[
                        3.14,
                    ],
                ),
            ),
        ),
        meta=PostBasicBackgroundTextTypeListRequestMeta(
            attributes=AttributesMember([
                "attributes_example",
            ]),
        ),
    ) # PostInstrumentRatingGradeListRequest | Request Body (optional)

    try:
        # List of rating grades for a list of instruments.
        # example passing only required values which don't have defaults set
        # and optional values
        api_response = api_instance.post_instrument_rating_grade_list(post_instrument_rating_grade_list_request=post_instrument_rating_grade_list_request)

        pprint(api_response)

    except fds.sdk.RealTimeQuotes.ApiException as e:
        print("Exception when calling InstrumentApi->post_instrument_rating_grade_list: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **post_instrument_rating_grade_list_request** | [**PostInstrumentRatingGradeListRequest**](PostInstrumentRatingGradeListRequest.md)| Request Body | [optional]

### Return type

[**InlineResponse20064**](InlineResponse20064.md)

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

# **post_instrument_selection_list_members_list**
> InlineResponse20067 post_instrument_selection_list_members_list()

List of instruments belonging to an instrument-level selection list.

List of instruments belonging to an instrument-level selection list.

### Example

* Basic Authentication (FactSetApiKey):
* OAuth Authentication (FactSetOAuth2):

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.RealTimeQuotes
from fds.sdk.RealTimeQuotes.api import instrument_api
from fds.sdk.RealTimeQuotes.models import *
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
configuration = fds.sdk.RealTimeQuotes.Configuration(
    fds_oauth_client=ConfidentialClient('/path/to/app-config.json')
)

# Basic authentication: FactSetApiKey
# See https://github.com/FactSet/enterprise-sdk#api-key
# for information how to create an API key
# configuration = fds.sdk.RealTimeQuotes.Configuration(
#     username='USERNAME-SERIAL',
#     password='API-KEY'
# )

# Enter a context with an instance of the API client
with fds.sdk.RealTimeQuotes.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = instrument_api.InstrumentApi(api_client)

    # NOTE: The parameter variable defined below is just an example and may potentially contain non valid values. So please replace this with valid values.
    post_instrument_selection_list_members_list_request = PostInstrumentSelectionListMembersListRequest(
        data=PostInstrumentSelectionListMembersListRequestData(
            id=3.14,
            filter=PostInstrumentSelectionListMembersListRequestDataFilter(
                asset_class=PostInstrumentSelectionListMembersListRequestDataFilterAssetClass(
                    ids=[
                        3.14,
                    ],
                ),
                category=PostInstrumentSelectionListMembersListRequestDataFilterCategory(
                    restrict=PostInstrumentSelectionListMembersListRequestDataFilterCategoryRestrict(
                        ids=[
                            3.14,
                        ],
                    ),
                    exclude=PostInstrumentSelectionListMembersListRequestDataFilterCategoryExclude(
                        ids=[
                            3.14,
                        ],
                    ),
                ),
            ),
        ),
        meta=PostInstrumentSelectionListMembersListRequestMeta(
            attributes=AttributesMember([
                "attributes_example",
            ]),
            language=LanguageMember("language_example"),
            sort=["name.default.long"],
            pagination=PostBasicMarketListRequestMetaPagination(
                offset=0,
                limit=20,
            ),
        ),
    ) # PostInstrumentSelectionListMembersListRequest | Request Body (optional)

    try:
        # List of instruments belonging to an instrument-level selection list.
        # example passing only required values which don't have defaults set
        # and optional values
        api_response = api_instance.post_instrument_selection_list_members_list(post_instrument_selection_list_members_list_request=post_instrument_selection_list_members_list_request)

        pprint(api_response)

    except fds.sdk.RealTimeQuotes.ApiException as e:
        print("Exception when calling InstrumentApi->post_instrument_selection_list_members_list: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **post_instrument_selection_list_members_list_request** | [**PostInstrumentSelectionListMembersListRequest**](PostInstrumentSelectionListMembersListRequest.md)| Request Body | [optional]

### Return type

[**InlineResponse20067**](InlineResponse20067.md)

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

