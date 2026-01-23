# fds.sdk.ProcuretoPayInvoiceandBilling.InvoiceAndBillingApi

All URIs are relative to *https://api.factset.com/procure-to-pay/invoice-and-billing/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**download_invoice**](InvoiceAndBillingApi.md#download_invoice) | **GET** /invoices/{id}/download | Get a PDF of the provided invoiceId
[**fits_report**](InvoiceAndBillingApi.md#fits_report) | **GET** /invoices/{id}/fits-report | Get FITS report
[**invoice_details**](InvoiceAndBillingApi.md#invoice_details) | **GET** /invoices/{id} | Get invoice details
[**list_accounts**](InvoiceAndBillingApi.md#list_accounts) | **GET** /accounts | Returns a list of available accounts



# **download_invoice**
> file_type download_invoice(id)

Get a PDF of the provided invoiceId

Returns and downloads .PDF invoice by provided invoiceId. <b>InvoiceId</b> is determined by concatenating the AccountId and 2-Digit date, representing year and 2-Digit month. E.G. For the December 2023 Invoice the invoiceId would be: AB2C2312

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.ProcuretoPayInvoiceandBilling
from fds.sdk.ProcuretoPayInvoiceandBilling.api import invoice_and_billing_api
from fds.sdk.ProcuretoPayInvoiceandBilling.models import *
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
configuration = fds.sdk.ProcuretoPayInvoiceandBilling.Configuration(
    fds_oauth_client=ConfidentialClient('/path/to/app-config.json')
)

# Basic authentication: FactSetApiKey
# See https://github.com/FactSet/enterprise-sdk#api-key
# for information how to create an API key
# configuration = fds.sdk.ProcuretoPayInvoiceandBilling.Configuration(
#     username='USERNAME-SERIAL',
#     password='API-KEY'
# )

# Enter a context with an instance of the API client
with fds.sdk.ProcuretoPayInvoiceandBilling.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = invoice_and_billing_api.InvoiceAndBillingApi(api_client)

    # NOTE: The following variables are just an example and may contain invalid values. Please, replace these with valid values.
    id = "AB2C2503" # str | Concatenation of AccountID and Date as YYMM

    try:
        # Get a PDF of the provided invoiceId
        # example passing only required values which don't have defaults set
        api_response = api_instance.download_invoice(id)

        pprint(api_response)

    except fds.sdk.ProcuretoPayInvoiceandBilling.ApiException as e:
        print("Exception when calling InvoiceAndBillingApi->download_invoice: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **str**| Concatenation of AccountID and Date as YYMM |

### Return type

**file_type**

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/pdf, application/json


### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Successful response |  * Content-Disposition -  <br>  * Content-Type -  <br>  |
**401** | Unauthorized - Authentication failed |  -  |
**403** | Forbidden - Insufficient permissions |  -  |
**404** | Not Found - Invoice ID does not exist |  -  |
**500** | Internal Server Error - An unexpected error occurred on the server. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **fits_report**
> ProductGroups fits_report(id)

Get FITS report

Returns machine readable FITS report by provided fitsId. <b>fitsId</b> is determined by concatenating the AccountId and 2-Digit date, representing year and 2-Digit month. E.G. For the December 2023 Invoice the fitsId would be: AB2C2312.         All prices in the report are provided without currency information. For currency details, please refer to the '/invoices/{id}' endpoint.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.ProcuretoPayInvoiceandBilling
from fds.sdk.ProcuretoPayInvoiceandBilling.api import invoice_and_billing_api
from fds.sdk.ProcuretoPayInvoiceandBilling.models import *
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
configuration = fds.sdk.ProcuretoPayInvoiceandBilling.Configuration(
    fds_oauth_client=ConfidentialClient('/path/to/app-config.json')
)

# Basic authentication: FactSetApiKey
# See https://github.com/FactSet/enterprise-sdk#api-key
# for information how to create an API key
# configuration = fds.sdk.ProcuretoPayInvoiceandBilling.Configuration(
#     username='USERNAME-SERIAL',
#     password='API-KEY'
# )

# Enter a context with an instance of the API client
with fds.sdk.ProcuretoPayInvoiceandBilling.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = invoice_and_billing_api.InvoiceAndBillingApi(api_client)

    # NOTE: The following variables are just an example and may contain invalid values. Please, replace these with valid values.
    id = "AB2C2503" # str | Concatenation of AccountID and Date as YYMM

    try:
        # Get FITS report
        # example passing only required values which don't have defaults set
        api_response = api_instance.fits_report(id)

        pprint(api_response)

    except fds.sdk.ProcuretoPayInvoiceandBilling.ApiException as e:
        print("Exception when calling InvoiceAndBillingApi->fits_report: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **str**| Concatenation of AccountID and Date as YYMM |

### Return type

[**ProductGroups**](ProductGroups.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Successful Response |  -  |
**401** | Unauthorized - Authentication failed |  -  |
**403** | Forbidden - Insufficient permissions |  -  |
**404** | Not Found - fits ID does not exist |  -  |
**500** | Internal Server Error - An unexpected error occurred on the server. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **invoice_details**
> Invoice invoice_details(id)

Get invoice details

Returns a machine readable invoice report by provided invoiceId. <b>InvoiceId</b> is determined by concatenating the AccountId and  2-Digit date, representing year and 2-Digit month. E.G. For the December 2023 Invoice the invoiceId would be: AB2C2312

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.ProcuretoPayInvoiceandBilling
from fds.sdk.ProcuretoPayInvoiceandBilling.api import invoice_and_billing_api
from fds.sdk.ProcuretoPayInvoiceandBilling.models import *
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
configuration = fds.sdk.ProcuretoPayInvoiceandBilling.Configuration(
    fds_oauth_client=ConfidentialClient('/path/to/app-config.json')
)

# Basic authentication: FactSetApiKey
# See https://github.com/FactSet/enterprise-sdk#api-key
# for information how to create an API key
# configuration = fds.sdk.ProcuretoPayInvoiceandBilling.Configuration(
#     username='USERNAME-SERIAL',
#     password='API-KEY'
# )

# Enter a context with an instance of the API client
with fds.sdk.ProcuretoPayInvoiceandBilling.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = invoice_and_billing_api.InvoiceAndBillingApi(api_client)

    # NOTE: The following variables are just an example and may contain invalid values. Please, replace these with valid values.
    id = "AB2C2503" # str | Concatenation of AccountID and Date as YYMM

    try:
        # Get invoice details
        # example passing only required values which don't have defaults set
        api_response = api_instance.invoice_details(id)

        pprint(api_response)

    except fds.sdk.ProcuretoPayInvoiceandBilling.ApiException as e:
        print("Exception when calling InvoiceAndBillingApi->invoice_details: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **str**| Concatenation of AccountID and Date as YYMM |

### Return type

[**Invoice**](Invoice.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Successful response |  -  |
**401** | Unauthorized - Authentication failed |  -  |
**403** | Forbidden - Insufficient permissions |  -  |
**404** | Not Found - Invoice ID does not exist |  -  |
**500** | Internal Server Error - An unexpected error occurred on the server. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **list_accounts**
> Accounts list_accounts()

Returns a list of available accounts

Returns a list of accounts containing information such as AccountName and AccountId.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.ProcuretoPayInvoiceandBilling
from fds.sdk.ProcuretoPayInvoiceandBilling.api import invoice_and_billing_api
from fds.sdk.ProcuretoPayInvoiceandBilling.models import *
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
configuration = fds.sdk.ProcuretoPayInvoiceandBilling.Configuration(
    fds_oauth_client=ConfidentialClient('/path/to/app-config.json')
)

# Basic authentication: FactSetApiKey
# See https://github.com/FactSet/enterprise-sdk#api-key
# for information how to create an API key
# configuration = fds.sdk.ProcuretoPayInvoiceandBilling.Configuration(
#     username='USERNAME-SERIAL',
#     password='API-KEY'
# )

# Enter a context with an instance of the API client
with fds.sdk.ProcuretoPayInvoiceandBilling.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = invoice_and_billing_api.InvoiceAndBillingApi(api_client)

    # NOTE: The following variables are just an example and may contain invalid values. Please, replace these with valid values.

    try:
        # Returns a list of available accounts
        # example, this endpoint has no required or optional parameters
        api_response = api_instance.list_accounts()

        pprint(api_response)

    except fds.sdk.ProcuretoPayInvoiceandBilling.ApiException as e:
        print("Exception when calling InvoiceAndBillingApi->list_accounts: %s\n" % e)
```


### Parameters
This endpoint does not need any parameter.

### Return type

[**Accounts**](Accounts.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Successful Response |  -  |
**401** | Unauthorized - Authentication failed |  -  |
**403** | Forbidden - Insufficient permissions |  -  |
**404** | Not Found - Accounts does not exist |  -  |
**500** | Internal Server Error - An unexpected error occurred on the server. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

