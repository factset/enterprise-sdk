# fds.sdk.FactSetGeoRev.CountriesApi

All URIs are relative to *https://api.factset.com/content*

Method | HTTP request | Description
------------- | ------------- | -------------
[**get_countries**](CountriesApi.md#get_countries) | **GET** /factset-georev/v1/countries | Gets the revenue details for the requested Countries.
[**get_countries_for_list**](CountriesApi.md#get_countries_for_list) | **POST** /factset-georev/v1/countries | Gets the revenue details for the requested Countries. Use for large lists of ids.


# **get_countries**
> CountryResponse get_countries(ids)

Gets the revenue details for the requested Countries.

Gets the **Countries'** Geographic Revenue, Percents, Confidence, and Ranks for a requested list of ids and country ISO codes, for a given start-date and end-date. 300 countries are supported. Countries represent the fourth and bottom level of the GeoRev taxonomy. Visit [OA 8754](https://my.apps.factset.com/oa/pages/8754) for a list of ISO2 Country Codes. By default, the service will return all Countries for the requested security. 

### Example

* Basic Authentication (FactSetApiKey):
* OAuth Authentication (FactSetOAuth2):

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.FactSetGeoRev
from fds.sdk.FactSetGeoRev.api import countries_api
from fds.sdk.FactSetGeoRev.models import *
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
configuration = fds.sdk.FactSetGeoRev.Configuration(
    fds_oauth_client=ConfidentialClient('/path/to/app-config.json')
)

# Basic authentication: FactSetApiKey
# See https://github.com/FactSet/enterprise-sdk#api-key
# for information how to create an API key
# configuration = fds.sdk.FactSetGeoRev.Configuration(
#     username='USERNAME-SERIAL',
#     password='API-KEY'
# )

# Enter a context with an instance of the API client
with fds.sdk.FactSetGeoRev.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = countries_api.CountriesApi(api_client)

    ids = ["AAPL-USA"] # [str] | Security or Entity identifiers. FactSet Identifiers, tickers, CUSIP and SEDOL are accepted input. <p>***ids limit** =  300 per request*</p> *<p>Make note, GET Method URL request lines are also limited to a total length of 8192 bytes (8KB). In cases where the service allows for thousands of ids, which may lead to exceeding this request line limit of 8KB, its advised for any requests with large request lines to be requested through the respective \"POST\" method.</p>* 
    country_ids = ["US","CN"] # [str] | The Country ISO2 Codes representing the Country requested. By default, the service will request *ALL* Countries. To limit the Countries returned in the response, provide a comma-separated list of the ISO2 Country Codes. Visit [OA 8754](https://my.apps.factset.com/oa/pages/8754) for a full list of ISO2 codes.  (optional) if omitted the server will use the default value of ["ALL"]
    start_date = "2018-12-31" # str | The start date requested for a given date range in **YYYY-MM-DD** format. Data is available on a Fiscal Annual periodicity and updated Daily. If left blank, the API will default to latest available fiscal period. Future dates (T+1) are not accepted in this endpoint.  (optional)
    end_date = "2019-12-31" # str | The end date requested for a given date range in **YYYY-MM-DD** format. Data is available on a Fiscal Annual periodicity and updated daily. If left blank, the API will default to latest available fiscal period. Future dates (T+1) are not accepted in this endpoint.  (optional)
    frequency = "FY" # str | Controls the display frequency of the data returned.   * **D** = Daily   * **W** = Weekly, based on the last day of the week of the start date.   * **M** = Monthly, based on the last trading day of the month.   * **AM** = Monthly, based on the start date (e.g., if the start date is June 16, data is displayed for June 16, May 16, April 16 etc.).   * **CQ** = Quarterly based on the last trading day of the calendar quarter (March, June, September, or December).   * **FQ** = Fiscal Quarter of the company.   * **AY** = Actual Annual, based on the start date.   * **CY** = Calendar Annual, based on the last trading day of the calendar year.   * **FY** = Fiscal Annual, based on the last trading day of the company's fiscal year.     (optional) if omitted the server will use the default value of "FY"
    currency = "USD" # str | Currency code for adjusting the data. For a list of currency ISO codes, visit [Online Assistant Page #1470](https://oa.apps.factset.com/pages/1470). (optional)

    try:
        # Gets the revenue details for the requested Countries.
        # example passing only required values which don't have defaults set
        # and optional values
        api_response = api_instance.get_countries(ids, country_ids=country_ids, start_date=start_date, end_date=end_date, frequency=frequency, currency=currency)
        pprint(api_response)

    except fds.sdk.FactSetGeoRev.ApiException as e:
        print("Exception when calling CountriesApi->get_countries: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ids** | **[str]**| Security or Entity identifiers. FactSet Identifiers, tickers, CUSIP and SEDOL are accepted input. &lt;p&gt;***ids limit** &#x3D;  300 per request*&lt;/p&gt; *&lt;p&gt;Make note, GET Method URL request lines are also limited to a total length of 8192 bytes (8KB). In cases where the service allows for thousands of ids, which may lead to exceeding this request line limit of 8KB, its advised for any requests with large request lines to be requested through the respective \&quot;POST\&quot; method.&lt;/p&gt;*  |
 **country_ids** | **[str]**| The Country ISO2 Codes representing the Country requested. By default, the service will request *ALL* Countries. To limit the Countries returned in the response, provide a comma-separated list of the ISO2 Country Codes. Visit [OA 8754](https://my.apps.factset.com/oa/pages/8754) for a full list of ISO2 codes.  | [optional] if omitted the server will use the default value of ["ALL"]
 **start_date** | **str**| The start date requested for a given date range in **YYYY-MM-DD** format. Data is available on a Fiscal Annual periodicity and updated Daily. If left blank, the API will default to latest available fiscal period. Future dates (T+1) are not accepted in this endpoint.  | [optional]
 **end_date** | **str**| The end date requested for a given date range in **YYYY-MM-DD** format. Data is available on a Fiscal Annual periodicity and updated daily. If left blank, the API will default to latest available fiscal period. Future dates (T+1) are not accepted in this endpoint.  | [optional]
 **frequency** | **str**| Controls the display frequency of the data returned.   * **D** &#x3D; Daily   * **W** &#x3D; Weekly, based on the last day of the week of the start date.   * **M** &#x3D; Monthly, based on the last trading day of the month.   * **AM** &#x3D; Monthly, based on the start date (e.g., if the start date is June 16, data is displayed for June 16, May 16, April 16 etc.).   * **CQ** &#x3D; Quarterly based on the last trading day of the calendar quarter (March, June, September, or December).   * **FQ** &#x3D; Fiscal Quarter of the company.   * **AY** &#x3D; Actual Annual, based on the start date.   * **CY** &#x3D; Calendar Annual, based on the last trading day of the calendar year.   * **FY** &#x3D; Fiscal Annual, based on the last trading day of the company&#39;s fiscal year.     | [optional] if omitted the server will use the default value of "FY"
 **currency** | **str**| Currency code for adjusting the data. For a list of currency ISO codes, visit [Online Assistant Page #1470](https://oa.apps.factset.com/pages/1470). | [optional]

### Return type

[**CountryResponse**](CountryResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | The Country response object, including the Revenue, Percent, Certainty Ranks, Certainty Class, and other meta data. |  -  |
**400** | Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. |  -  |
**401** | Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. |  -  |
**403** | The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. |  -  |
**415** | Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. |  -  |
**500** | Internal Server Error. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_countries_for_list**
> CountryResponse get_countries_for_list(country_request)

Gets the revenue details for the requested Countries. Use for large lists of ids.

Gets the **Countries'** Geographic Revenue, Percents, Confidence, and Ranks for a requested list of ids and country ISO codes, for a given start-date and end-date. Nearly 300 countries are supported. Countries represent the fourth and bottom level of the GeoRev taxonomy. The full list of countries and their related regional mappings can be found by using the /country-mappings endpoint or visit [OA 8754](https://my.apps.factset.com/oa/pages/8754) for a list of ISO2 Country codes. 

### Example

* Basic Authentication (FactSetApiKey):
* OAuth Authentication (FactSetOAuth2):

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.FactSetGeoRev
from fds.sdk.FactSetGeoRev.api import countries_api
from fds.sdk.FactSetGeoRev.models import *
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
configuration = fds.sdk.FactSetGeoRev.Configuration(
    fds_oauth_client=ConfidentialClient('/path/to/app-config.json')
)

# Basic authentication: FactSetApiKey
# See https://github.com/FactSet/enterprise-sdk#api-key
# for information how to create an API key
# configuration = fds.sdk.FactSetGeoRev.Configuration(
#     username='USERNAME-SERIAL',
#     password='API-KEY'
# )

# Enter a context with an instance of the API client
with fds.sdk.FactSetGeoRev.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = countries_api.CountriesApi(api_client)

    country_request = CountryRequest(
        ids=Ids(["AAPL-USA"]),
        country_ids=CountryIds(["US","CN"]),
        start_date="2019-01-01",
        end_date="2019-12-31",
        frequency=Frequency("FY"),
        currency="USD",
    ) # CountryRequest | The Country request body, allowing the user to specify a list of ids, time range, and regionIds.

    try:
        # Gets the revenue details for the requested Countries. Use for large lists of ids.
        # example passing only required values which don't have defaults set
        api_response = api_instance.get_countries_for_list(country_request)
        pprint(api_response)

    except fds.sdk.FactSetGeoRev.ApiException as e:
        print("Exception when calling CountriesApi->get_countries_for_list: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **country_request** | [**CountryRequest**](CountryRequest.md)| The Country request body, allowing the user to specify a list of ids, time range, and regionIds. |

### Return type

[**CountryResponse**](CountryResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | The Country response object, including the Revenue, Percent, Certainty Ranks, Certainty Class, and other meta data. |  -  |
**400** | Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. |  -  |
**401** | Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. |  -  |
**403** | The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. |  -  |
**415** | Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. |  -  |
**500** | Internal Server Error. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

