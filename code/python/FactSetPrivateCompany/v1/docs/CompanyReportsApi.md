# fds.sdk.FactSetPrivateCompany.CompanyReportsApi

All URIs are relative to *https://api.factset.com/content/private-company/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**get_financials_report**](CompanyReportsApi.md#get_financials_report) | **GET** /company-reports/financial-statement | Returns Private Company Financial Data
[**get_profile_report**](CompanyReportsApi.md#get_profile_report) | **GET** /company-reports/profile | Returns Private Company Non-Periodic Data



# **get_financials_report**
> FinancialStatementsResponse get_financials_report(ids, statement_type)

Returns Private Company Financial Data

Returns financial data for specified private companies and statement type (income,  balance sheet, cash flow, and ratios) over an annual reporting period. <br/> Use the ```/universe``` endpoint to retrieve valid Private Company identifiers.<br/><br/> **Note:** Due to variations in calculation time of average exchange rates, there may be some minor differences in the values of company report financial statement attributes if you are requesting for  a currency other than local, when compared to workstation. 

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.FactSetPrivateCompany
from fds.sdk.FactSetPrivateCompany.api import company_reports_api
from fds.sdk.FactSetPrivateCompany.models import *
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
configuration = fds.sdk.FactSetPrivateCompany.Configuration(
    fds_oauth_client=ConfidentialClient('/path/to/app-config.json')
)

# Basic authentication: FactSetApiKey
# See https://github.com/FactSet/enterprise-sdk#api-key
# for information how to create an API key
# configuration = fds.sdk.FactSetPrivateCompany.Configuration(
#     username='USERNAME-SERIAL',
#     password='API-KEY'
# )

# Enter a context with an instance of the API client
with fds.sdk.FactSetPrivateCompany.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = company_reports_api.CompanyReportsApi(api_client)

    # NOTE: The following variables are just an example and may contain invalid values. Please, replace these with valid values.
    ids = ["0H3R4Y-E"] # [str] | The requested list of Factset Private Company identifiers in XXXXXX-E format <p>***ids limit** =  50 per request*</p> 
    statement_type = "BS" # str | The type of financial statement being requested
    currency = "USD" # str | Currency code for currency values. For a list of currency ISO codes, visit Online Assistant Page [OA1470](https://my.apps.factset.com/oa/pages/1470).  Giving input as \"DOC\" would give the values in reporting currency for the requested ids.  (optional) if omitted the server will use the default value of "LOCAL"
    number_annual_periods = 4 # int | The number of annual periods for the returned data which will be displayed in descending order from most recent annual period for the number of annual periods specified. </br>Within range of 1 to 100. If not specified default will be 4.       (optional) if omitted the server will use the default value of 4

    try:
        # Returns Private Company Financial Data
        # example passing only required values which don't have defaults set
        # and optional values
        api_response = api_instance.get_financials_report(ids, statement_type, currency=currency, number_annual_periods=number_annual_periods)

        pprint(api_response)

    except fds.sdk.FactSetPrivateCompany.ApiException as e:
        print("Exception when calling CompanyReportsApi->get_financials_report: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ids** | **[str]**| The requested list of Factset Private Company identifiers in XXXXXX-E format &lt;p&gt;***ids limit** &#x3D;  50 per request*&lt;/p&gt;  |
 **statement_type** | **str**| The type of financial statement being requested |
 **currency** | **str**| Currency code for currency values. For a list of currency ISO codes, visit Online Assistant Page [OA1470](https://my.apps.factset.com/oa/pages/1470).  Giving input as \&quot;DOC\&quot; would give the values in reporting currency for the requested ids.  | [optional] if omitted the server will use the default value of "LOCAL"
 **number_annual_periods** | **int**| The number of annual periods for the returned data which will be displayed in descending order from most recent annual period for the number of annual periods specified. &lt;/br&gt;Within range of 1 to 100. If not specified default will be 4.       | [optional] if omitted the server will use the default value of 4

### Return type

[**FinancialStatementsResponse**](FinancialStatementsResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Financial data items |  -  |
**400** | Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. |  -  |
**401** | Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. |  -  |
**403** | The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. |  -  |
**500** | Internal Server Error. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_profile_report**
> ProfileResponse get_profile_report(ids)

Returns Private Company Non-Periodic Data

Retrieves a comprehensive overview of key non-periodic details and information for a  specified list of identifiers. All values provided in the response are absolute. <br/> Use the ```/universe``` endpoint to retrieve valid Private Company identifiers.<br/> 

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.FactSetPrivateCompany
from fds.sdk.FactSetPrivateCompany.api import company_reports_api
from fds.sdk.FactSetPrivateCompany.models import *
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
configuration = fds.sdk.FactSetPrivateCompany.Configuration(
    fds_oauth_client=ConfidentialClient('/path/to/app-config.json')
)

# Basic authentication: FactSetApiKey
# See https://github.com/FactSet/enterprise-sdk#api-key
# for information how to create an API key
# configuration = fds.sdk.FactSetPrivateCompany.Configuration(
#     username='USERNAME-SERIAL',
#     password='API-KEY'
# )

# Enter a context with an instance of the API client
with fds.sdk.FactSetPrivateCompany.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = company_reports_api.CompanyReportsApi(api_client)

    # NOTE: The following variables are just an example and may contain invalid values. Please, replace these with valid values.
    ids = ["0H3R4Y-E"] # [str] | The requested list of Factset Private Company identifiers in XXXXXX-E format <p>***ids limit** =  50 per request*</p> 

    try:
        # Returns Private Company Non-Periodic Data
        # example passing only required values which don't have defaults set
        api_response = api_instance.get_profile_report(ids)

        pprint(api_response)

    except fds.sdk.FactSetPrivateCompany.ApiException as e:
        print("Exception when calling CompanyReportsApi->get_profile_report: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ids** | **[str]**| The requested list of Factset Private Company identifiers in XXXXXX-E format &lt;p&gt;***ids limit** &#x3D;  50 per request*&lt;/p&gt;  |

### Return type

[**ProfileResponse**](ProfileResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Non-periodic data items |  -  |
**400** | Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. |  -  |
**401** | Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. |  -  |
**403** | The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. |  -  |
**500** | Internal Server Error. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

