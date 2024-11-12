# fds.sdk.ProcuretoPayInvoiceandBilling.InvoiceAndBillingApi

All URIs are relative to *https://api-sandbox.factset.com/procuretopay/invoice-and-billing*

Method | HTTP request | Description
------------- | ------------- | -------------
[**get_fits_report_get**](InvoiceAndBillingApi.md#get_fits_report_get) | **GET** /getFitsReport | Returns Fits report by given FITSID
[**get_invoice_get**](InvoiceAndBillingApi.md#get_invoice_get) | **GET** /getInvoice | Returns PDF of specific invoice
[**invoice_details_get**](InvoiceAndBillingApi.md#invoice_details_get) | **GET** /invoiceDetails | Returns details on specific invoice.
[**list_invoices_get**](InvoiceAndBillingApi.md#list_invoices_get) | **GET** /listInvoices | Returns all available invoices



# **get_fits_report_get**
> GetFitsReport get_fits_report_get(fits_id)

Returns Fits report by given FITSID

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
    fits_id = "AB2C2101" # str | FITSID can be determined by concatenating the AccountNumber + two-digit year (e.g 21 for 2021) and two-digit month (e.g. 01 for January). Available AccountNumbers are available from the /listInvoices endpoint.

    try:
        # Returns Fits report by given FITSID
        # example passing only required values which don't have defaults set
        api_response = api_instance.get_fits_report_get(fits_id)

        pprint(api_response)

    except fds.sdk.ProcuretoPayInvoiceandBilling.ApiException as e:
        print("Exception when calling InvoiceAndBillingApi->get_fits_report_get: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **fits_id** | **str**| FITSID can be determined by concatenating the AccountNumber + two-digit year (e.g 21 for 2021) and two-digit month (e.g. 01 for January). Available AccountNumbers are available from the /listInvoices endpoint. |

### Return type

[**GetFitsReport**](GetFitsReport.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json; charset=utf-8, text/plain


### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  * X-DataDirect-Request-Key - FactSet&#39;s request key header. <br>  |
**401** | Unauthenticated |  * X-DataDirect-Request-Key - FactSet&#39;s request key header. <br>  |
**403** | Unauthorized |  * X-DataDirect-Request-Key - FactSet&#39;s request key header. <br>  |
**404** | Requested Resource not found |  * X-DataDirect-Request-Key - FactSet&#39;s request key header. <br>  |
**429** | Throttle Limit Reached |  * X-DataDirect-Request-Key - FactSet&#39;s request key header. <br>  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_invoice_get**
> file_type get_invoice_get(invoice_id)

Returns PDF of specific invoice

A .PDF File

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
    invoice_id = "11963874" # str | Invoice code you wish to download

    try:
        # Returns PDF of specific invoice
        # example passing only required values which don't have defaults set
        api_response = api_instance.get_invoice_get(invoice_id)

        pprint(api_response)

    except fds.sdk.ProcuretoPayInvoiceandBilling.ApiException as e:
        print("Exception when calling InvoiceAndBillingApi->get_invoice_get: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **invoice_id** | **str**| Invoice code you wish to download |

### Return type

**file_type**

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: appliction/pdf, application/json; charset=utf-8, text/plain


### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK - PDF File download offered |  * X-DataDirect-Request-Key - FactSet&#39;s request key header. <br>  |
**401** | Unauthenticated |  * X-DataDirect-Request-Key - FactSet&#39;s request key header. <br>  |
**403** | Unauthorized |  * X-DataDirect-Request-Key - FactSet&#39;s request key header. <br>  |
**404** | Requested Resource not found |  * X-DataDirect-Request-Key - FactSet&#39;s request key header. <br>  |
**429** | Throttle Limit Reached |  * X-DataDirect-Request-Key - FactSet&#39;s request key header. <br>  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **invoice_details_get**
> InvoiceDetails invoice_details_get(invoice_id)

Returns details on specific invoice.

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
    invoice_id = "11963874" # str | Invoice code to query. See /listInvoices endpoint for list of available invoices to query.

    try:
        # Returns details on specific invoice.
        # example passing only required values which don't have defaults set
        api_response = api_instance.invoice_details_get(invoice_id)

        pprint(api_response)

    except fds.sdk.ProcuretoPayInvoiceandBilling.ApiException as e:
        print("Exception when calling InvoiceAndBillingApi->invoice_details_get: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **invoice_id** | **str**| Invoice code to query. See /listInvoices endpoint for list of available invoices to query. |

### Return type

[**InvoiceDetails**](InvoiceDetails.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json; charset=utf-8, text/plain


### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  * X-DataDirect-Request-Key - FactSet&#39;s request key header. <br>  |
**401** | Unauthenticated |  * X-DataDirect-Request-Key - FactSet&#39;s request key header. <br>  |
**403** | Unauthorized |  * X-DataDirect-Request-Key - FactSet&#39;s request key header. <br>  |
**404** | Requested Resource not found |  * X-DataDirect-Request-Key - FactSet&#39;s request key header. <br>  |
**429** | Throttle Limit Reached |  * X-DataDirect-Request-Key - FactSet&#39;s request key header. <br>  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **list_invoices_get**
> ListInvoices list_invoices_get()

Returns all available invoices

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
        # Returns all available invoices
        # example, this endpoint has no required or optional parameters
        api_response = api_instance.list_invoices_get()

        pprint(api_response)

    except fds.sdk.ProcuretoPayInvoiceandBilling.ApiException as e:
        print("Exception when calling InvoiceAndBillingApi->list_invoices_get: %s\n" % e)
```


### Parameters
This endpoint does not need any parameter.

### Return type

[**ListInvoices**](ListInvoices.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json; charset=utf-8, text/plain


### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  * X-DataDirect-Request-Key - FactSet&#39;s request key header. <br>  |
**401** | Unauthenticated |  * X-DataDirect-Request-Key - FactSet&#39;s request key header. <br>  |
**403** | Unauthorized |  * X-DataDirect-Request-Key - FactSet&#39;s request key header. <br>  |
**404** | Requested Resource not found |  * X-DataDirect-Request-Key - FactSet&#39;s request key header. <br>  |
**429** | Throttle Limit Reached |  * X-DataDirect-Request-Key - FactSet&#39;s request key header. <br>  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

