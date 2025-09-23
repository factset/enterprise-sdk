# fds.sdk.FactSetESG.SFDRApi

All URIs are relative to *https://api.factset.com/content/factset-esg/v3*

Method | HTTP request | Description
------------- | ------------- | -------------
[**get_sfdr_pai**](SFDRApi.md#get_sfdr_pai) | **GET** /sfdr/pai | Requests Principle Adverse Impact (PAI) data to support compliant SFDR Sustainable Finance Disclosure Regulation (SFDR) reporting
[**get_sfdr_pai_for_list**](SFDRApi.md#get_sfdr_pai_for_list) | **POST** /sfdr/pai | Requests Principle Adverse Impact (PAI) data to support compliant SFDR Sustainable Finance Disclosure Regulation (SFDR) reporting



# **get_sfdr_pai**
> SfdrPaiResponse get_sfdr_pai(ids, fiscal_period_start, fiscal_period_end)

Requests Principle Adverse Impact (PAI) data to support compliant SFDR Sustainable Finance Disclosure Regulation (SFDR) reporting

SFDR Principle Adverse Impact (PAI) data is built specifically to support compliant Sustainable Finance Disclosure Regulation (SFDR) reporting. FactSet collects PAI data items from publicly available company-reported information and FactSet databases, such as FactSet Fundamentals, FactSet RBICS with Revenue and FactSet People, which are also based on company-disclosures. FactSet uses Truvalue Labs SASB Spotlights for supplemental OECD & UNGC violation checks where company reporting is sparse.  

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.FactSetESG
from fds.sdk.FactSetESG.api import sfdr_api
from fds.sdk.FactSetESG.models import *
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
configuration = fds.sdk.FactSetESG.Configuration(
    fds_oauth_client=ConfidentialClient('/path/to/app-config.json')
)

# Basic authentication: FactSetApiKey
# See https://github.com/FactSet/enterprise-sdk#api-key
# for information how to create an API key
# configuration = fds.sdk.FactSetESG.Configuration(
#     username='USERNAME-SERIAL',
#     password='API-KEY'
# )

# Enter a context with an instance of the API client
with fds.sdk.FactSetESG.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = sfdr_api.SFDRApi(api_client)

    # NOTE: The following variables are just an example and may contain invalid values. Please, replace these with valid values.
    ids = ["AAPL-USA"] # [str] | Security or Entity identifiers. FactSet Identifiers, tickers, CUSIP and SEDOL are accepted input. <p>***ids limit** =  1500 per request*</p> *<p>Make note, GET Method URL request lines are also limited to a total  length of 8192 bytes (8KB). In cases where the service allows for thousands of ids, which may lead to exceeding this request line limit of 8KB, its advised for any requests with large request lines to be requested through the respective \"POST\" method.</p>* 
    fiscal_period_start = dateutil_parser('2020-01-01').date() # date | Fiscal period start is expressed in YYYY-MM-DD formats. The input start date must be before the input end date. Future dates (T+1) are not accepted in this endpoint. 
    fiscal_period_end = dateutil_parser('2022-02-20').date() # date | Fiscal period end is expressed in YYYY-MM-DD formats. The input start date must be before the input end date. Future dates (T+1) are not accepted in this endpoint. 
    feelback = False # bool | This parameter would return the latest PAI data/s based on the indicators, date range and/or subtopics requested.   (optional) if omitted the server will use the default value of False
    currency = "USD" # str | Currency code for currency values. For a list of currency ISO codes, visit Online Assistant Page [OA1470](https://my.apps.factset.com/oa/pages/1470).  (optional) if omitted the server will use the default value of "LOCAL"
    indicators = ["Water","HumanRights"] # [str] | The indicators are the Principal Adverse Impact (PAI) metrics which consists of General, Mandatory and Additional indicators which supports the SFDR reporting.   The General indicators data can retrieved by providing the `GL001` and `GL002` subTopic codes as input. Please refer to the attached documentation for the full list of subtopics codes and their mapping with the indicators.  The data can also be requested for individual sub topic codes in addition to the indicators mentioned below -    |**SFDR PAI Indicators**|**Description**| |---|---| |**MandatoryIndicators**| Mandatory indicators are the indicators which must be reported under the EU Sustainable Finance Disclosure Regulation (SFDR).| |**AdditionalIndicators**| These are additional environmental and social indicators as mentioned in additional tables as provided in the Annex 1 table in the SFDR RTS report.| |**GHGEmissions**| This mandatory indicator includes metrics related to greenhouse emissions such as - Scope 1, 2, and 3 emissions, footprint and intensity and energy consumption from non-renewable and high climate sectors.| |**Biodiversity**| This mandatory indicator includes metrics pertaining to biodiversity and a company's impacts on biodiversity-sensitive areas.| |**Water**| This mandatory indicator includes data relating to emissions to water as made by the companies.| |**Waste**| This mandatory indicator includes data relating to hazardous waste as generated by the companies.| |**SocialEmployeeMatters**| This mandatory indicator includes employee-related metrics like gender diversity, pay gap and social-related metrics like violation of UNGC/OECD principles and exposure to controversial weapons.| |**Emissions**| This additional indicator includes metrics related to air pollutants, inorganic pollutants and ozone depleting substance. | |**EnergyPerformance**| This additional indicator includes metrics related to various sources of non-renewable energy as used by the companies. | |**WaterWasteMaterialEmissions**| This mandatory indicator includes employee-related metrics like gender diversity, pay gap and social-related metrics like violation of UNGC/OECD principles and exposure to controversial weapons.| |**AdditionalEmployeeMatters**| This additional indicator includes metrics related to workplace discrimination and safety, whistleblower mechanism and supplier code of conduct.| |**HumanRights**| This additional indicator includes metrics related to both policies and performance of a company in the areas of human rights, forced labor and human trafficking.| |**AntiCorruptionAntiBribery**| This additional indicator includes data related to company violations of anti-corruption and anti-bribery laws, and resulting fines.|  (optional) if omitted the server will use the default value of ["ALL"]
    calculation = True # bool | This parameter would return the PAI data based on the input provided. All the data for indicators or subtopics requested are returned when the input is `true` and the SFDR required metrics are only returned when the input is`false`  (optional) if omitted the server will use the default value of True

    try:
        # Requests Principle Adverse Impact (PAI) data to support compliant SFDR Sustainable Finance Disclosure Regulation (SFDR) reporting
        # example passing only required values which don't have defaults set
        # and optional values
        api_response = api_instance.get_sfdr_pai(ids, fiscal_period_start, fiscal_period_end, feelback=feelback, currency=currency, indicators=indicators, calculation=calculation)

        pprint(api_response)

    except fds.sdk.FactSetESG.ApiException as e:
        print("Exception when calling SFDRApi->get_sfdr_pai: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ids** | **[str]**| Security or Entity identifiers. FactSet Identifiers, tickers, CUSIP and SEDOL are accepted input. &lt;p&gt;***ids limit** &#x3D;  1500 per request*&lt;/p&gt; *&lt;p&gt;Make note, GET Method URL request lines are also limited to a total  length of 8192 bytes (8KB). In cases where the service allows for thousands of ids, which may lead to exceeding this request line limit of 8KB, its advised for any requests with large request lines to be requested through the respective \&quot;POST\&quot; method.&lt;/p&gt;*  |
 **fiscal_period_start** | **date**| Fiscal period start is expressed in YYYY-MM-DD formats. The input start date must be before the input end date. Future dates (T+1) are not accepted in this endpoint.  |
 **fiscal_period_end** | **date**| Fiscal period end is expressed in YYYY-MM-DD formats. The input start date must be before the input end date. Future dates (T+1) are not accepted in this endpoint.  |
 **feelback** | **bool**| This parameter would return the latest PAI data/s based on the indicators, date range and/or subtopics requested.   | [optional] if omitted the server will use the default value of False
 **currency** | **str**| Currency code for currency values. For a list of currency ISO codes, visit Online Assistant Page [OA1470](https://my.apps.factset.com/oa/pages/1470).  | [optional] if omitted the server will use the default value of "LOCAL"
 **indicators** | **[str]**| The indicators are the Principal Adverse Impact (PAI) metrics which consists of General, Mandatory and Additional indicators which supports the SFDR reporting.   The General indicators data can retrieved by providing the &#x60;GL001&#x60; and &#x60;GL002&#x60; subTopic codes as input. Please refer to the attached documentation for the full list of subtopics codes and their mapping with the indicators.  The data can also be requested for individual sub topic codes in addition to the indicators mentioned below -    |**SFDR PAI Indicators**|**Description**| |---|---| |**MandatoryIndicators**| Mandatory indicators are the indicators which must be reported under the EU Sustainable Finance Disclosure Regulation (SFDR).| |**AdditionalIndicators**| These are additional environmental and social indicators as mentioned in additional tables as provided in the Annex 1 table in the SFDR RTS report.| |**GHGEmissions**| This mandatory indicator includes metrics related to greenhouse emissions such as - Scope 1, 2, and 3 emissions, footprint and intensity and energy consumption from non-renewable and high climate sectors.| |**Biodiversity**| This mandatory indicator includes metrics pertaining to biodiversity and a company&#39;s impacts on biodiversity-sensitive areas.| |**Water**| This mandatory indicator includes data relating to emissions to water as made by the companies.| |**Waste**| This mandatory indicator includes data relating to hazardous waste as generated by the companies.| |**SocialEmployeeMatters**| This mandatory indicator includes employee-related metrics like gender diversity, pay gap and social-related metrics like violation of UNGC/OECD principles and exposure to controversial weapons.| |**Emissions**| This additional indicator includes metrics related to air pollutants, inorganic pollutants and ozone depleting substance. | |**EnergyPerformance**| This additional indicator includes metrics related to various sources of non-renewable energy as used by the companies. | |**WaterWasteMaterialEmissions**| This mandatory indicator includes employee-related metrics like gender diversity, pay gap and social-related metrics like violation of UNGC/OECD principles and exposure to controversial weapons.| |**AdditionalEmployeeMatters**| This additional indicator includes metrics related to workplace discrimination and safety, whistleblower mechanism and supplier code of conduct.| |**HumanRights**| This additional indicator includes metrics related to both policies and performance of a company in the areas of human rights, forced labor and human trafficking.| |**AntiCorruptionAntiBribery**| This additional indicator includes data related to company violations of anti-corruption and anti-bribery laws, and resulting fines.|  | [optional] if omitted the server will use the default value of ["ALL"]
 **calculation** | **bool**| This parameter would return the PAI data based on the input provided. All the data for indicators or subtopics requested are returned when the input is &#x60;true&#x60; and the SFDR required metrics are only returned when the input is&#x60;false&#x60;  | [optional] if omitted the server will use the default value of True

### Return type

[**SfdrPaiResponse**](SfdrPaiResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | The SFDR PAI response object, including the Calculation, Sub Topic Codes, Sub Topic Names, Report End Date,Reporting Period, Standardized Units and Standardized Values |  * RateLimit-Limit - The number of allowed requests in the current period. <br>  * RateLimit-Reset - The time when the current rate limit period resets, in seconds. <br>  |
**400** | Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. |  * RateLimit-Limit - The number of allowed requests in the current period. <br>  * RateLimit-Reset - The time when the current rate limit period resets, in seconds. <br>  |
**401** | Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. |  * RateLimit-Limit - The number of allowed requests in the current period. <br>  * RateLimit-Reset - The time when the current rate limit period resets, in seconds. <br>  |
**403** | The USERNAME-SERIAL used to request the endpoint is not authorized to access it. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. |  * RateLimit-Limit - The number of allowed requests in the current period. <br>  * RateLimit-Reset - The time when the current rate limit period resets, in seconds. <br>  |
**408** | Request Time-Out. This error would be returned if the request takes more than 29 seconds. |  * RateLimit-Limit - The number of allowed requests in the current period. <br>  * RateLimit-Reset - The time when the current rate limit period resets, in seconds. <br>  |
**415** | Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. |  * RateLimit-Limit - The number of allowed requests in the current period. <br>  * RateLimit-Reset - The time when the current rate limit period resets, in seconds. <br>  |
**429** | Too Many Requests. This error occurs when the rate limits for requests have been exceeded. Please wait before making more requests. |  * RateLimit-Limit - The number of allowed requests in the current period. <br>  * RateLimit-Reset - The time when the current rate limit period resets, in seconds. <br>  * Retry-After - The time, in seconds, the user agent should wait before making a follow-up request. <br>  |
**500** | Internal Server Error. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_sfdr_pai_for_list**
> SfdrPaiResponse get_sfdr_pai_for_list(sfdr_pai_request)

Requests Principle Adverse Impact (PAI) data to support compliant SFDR Sustainable Finance Disclosure Regulation (SFDR) reporting

SFDR Principle Adverse Impact (PAI) data is built specifically to support compliant Sustainable Finance Disclosure Regulation (SFDR) reporting. FactSet collects PAI data items from publicly available company-reported information and FactSet databases, such as FactSet Fundamentals, FactSet RBICS with Revenue and FactSet People, which are also based on company-disclosures. FactSet uses Truvalue Labs SASB Spotlights for supplemental OECD & UNGC violation checks where company reporting is sparse. 

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.FactSetESG
from fds.sdk.FactSetESG.api import sfdr_api
from fds.sdk.FactSetESG.models import *
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
configuration = fds.sdk.FactSetESG.Configuration(
    fds_oauth_client=ConfidentialClient('/path/to/app-config.json')
)

# Basic authentication: FactSetApiKey
# See https://github.com/FactSet/enterprise-sdk#api-key
# for information how to create an API key
# configuration = fds.sdk.FactSetESG.Configuration(
#     username='USERNAME-SERIAL',
#     password='API-KEY'
# )

# Enter a context with an instance of the API client
with fds.sdk.FactSetESG.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = sfdr_api.SFDRApi(api_client)

    # NOTE: The following variables are just an example and may contain invalid values. Please, replace these with valid values.
    sfdr_pai_request = SfdrPaiRequest(
        data=SfdrPaiRequestBody(
            ids=PaiIds(["AAPL-USA"]),
            feelback=False,
            fiscal_period_start=dateutil_parser('Wed Jan 01 00:00:00 UTC 2020').date(),
            fiscal_period_end=dateutil_parser('Sun Feb 20 00:00:00 UTC 2022').date(),
            indicators=Indicators(["Water","HumanRights"]),
            currency=Currency("USD"),
            calculation=True,
        ),
    ) # SfdrPaiRequest | The request body, allows the user to specify a list of ids, date range(Annual), and PAI Indicators

    try:
        # Requests Principle Adverse Impact (PAI) data to support compliant SFDR Sustainable Finance Disclosure Regulation (SFDR) reporting
        # example passing only required values which don't have defaults set
        api_response = api_instance.get_sfdr_pai_for_list(sfdr_pai_request)

        pprint(api_response)

    except fds.sdk.FactSetESG.ApiException as e:
        print("Exception when calling SFDRApi->get_sfdr_pai_for_list: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **sfdr_pai_request** | [**SfdrPaiRequest**](SfdrPaiRequest.md)| The request body, allows the user to specify a list of ids, date range(Annual), and PAI Indicators |

### Return type

[**SfdrPaiResponse**](SfdrPaiResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | The SFDR PAI response object, including the Calculation, SubTopic Codes, SubTopic Names, Report End Date,Reporting Period, Standardized Units and Standardized Values |  * RateLimit-Limit - The number of allowed requests in the current period. <br>  * RateLimit-Reset - The time when the current rate limit period resets, in seconds. <br>  |
**400** | Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. |  * RateLimit-Limit - The number of allowed requests in the current period. <br>  * RateLimit-Reset - The time when the current rate limit period resets, in seconds. <br>  |
**401** | Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. |  * RateLimit-Limit - The number of allowed requests in the current period. <br>  * RateLimit-Reset - The time when the current rate limit period resets, in seconds. <br>  |
**403** | The USERNAME-SERIAL used to request the endpoint is not authorized to access it. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. |  * RateLimit-Limit - The number of allowed requests in the current period. <br>  * RateLimit-Reset - The time when the current rate limit period resets, in seconds. <br>  |
**408** | Request Time-Out. This error would be returned if the request takes more than 29 seconds. |  * RateLimit-Limit - The number of allowed requests in the current period. <br>  * RateLimit-Reset - The time when the current rate limit period resets, in seconds. <br>  |
**415** | Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. |  * RateLimit-Limit - The number of allowed requests in the current period. <br>  * RateLimit-Reset - The time when the current rate limit period resets, in seconds. <br>  |
**429** | Too Many Requests. This error occurs when the rate limits for requests have been exceeded. Please wait before making more requests. |  * RateLimit-Limit - The number of allowed requests in the current period. <br>  * RateLimit-Reset - The time when the current rate limit period resets, in seconds. <br>  * Retry-After - The time, in seconds, the user agent should wait before making a follow-up request. <br>  |
**500** | Internal Server Error. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

