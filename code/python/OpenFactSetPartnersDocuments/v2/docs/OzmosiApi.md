# fds.sdk.OpenFactSetPartnersDocuments.OzmosiApi

All URIs are relative to *https://api.factset.com/bulk-documents/ofm/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**get_ozmosi_biomarkers_daily**](OzmosiApi.md#get_ozmosi_biomarkers_daily) | **GET** /ozmosi/biomarkers/daily | Returns the daily files of Biomarkers Details from Open:FactSet Partner - Ozmosi.
[**get_ozmosi_clinical_trials_daily**](OzmosiApi.md#get_ozmosi_clinical_trials_daily) | **GET** /ozmosi/clinical-trials/daily | Returns the daily files of Clinical Trial Details from Open:FactSet Partner - Ozmosi.
[**get_ozmosi_clinical_trials_history**](OzmosiApi.md#get_ozmosi_clinical_trials_history) | **GET** /ozmosi/clinical-trials/history | Returns the history files from Open:FactSet Partner - Ozmosi
[**get_ozmosi_collaborators_daily**](OzmosiApi.md#get_ozmosi_collaborators_daily) | **GET** /ozmosi/collaborators/daily | Returns the daily files of Collaborators Details from Open:FactSet Partner - Ozmosi.
[**get_ozmosi_diseases_daily**](OzmosiApi.md#get_ozmosi_diseases_daily) | **GET** /ozmosi/diseases/daily | Returns the daily files of Diseases Details from Open:FactSet Partner- Ozmosi.
[**get_ozmosi_endpoints_daily**](OzmosiApi.md#get_ozmosi_endpoints_daily) | **GET** /ozmosi/beam-endpoints/daily | Returns the daily files of Beam Endpoints Details from Open:FactSet Partner - Ozmosi.
[**get_ozmosi_intervention_daily**](OzmosiApi.md#get_ozmosi_intervention_daily) | **GET** /ozmosi/intervention/daily | Returns the daily files of Intervention details from Open:FactSet Partner - Ozmosi.
[**get_ozmosi_orangepurple_daily**](OzmosiApi.md#get_ozmosi_orangepurple_daily) | **GET** /ozmosi/orangepurple/daily | Returns the daily files of OrangePurple Details from Open:FactSet Partner - Ozmosi.
[**get_ozmosi_primaryoutcome_daily**](OzmosiApi.md#get_ozmosi_primaryoutcome_daily) | **GET** /ozmosi/primaryoutcome/daily | Returns the daily files of PrimaryOutcome Details from Open:FactSet Partner - Ozmosi.
[**get_ozmosi_sponsors_daily**](OzmosiApi.md#get_ozmosi_sponsors_daily) | **GET** /ozmosi/sponsors/daily | Returns the daily files of Sponsors Details from Open:FactSet Partner - Ozmosi.



# **get_ozmosi_biomarkers_daily**
> BiomarkersResponse get_ozmosi_biomarkers_daily()

Returns the daily files of Biomarkers Details from Open:FactSet Partner - Ozmosi.

Returns the daily files of Biomarkers Details from Open:FactSet Partner - Ozmosi.

### Example

* Basic Authentication (FactSetApiKey):
* OAuth Authentication (FactSetOAuth2):

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.OpenFactSetPartnersDocuments
from fds.sdk.OpenFactSetPartnersDocuments.api import ozmosi_api
from fds.sdk.OpenFactSetPartnersDocuments.models import *
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
configuration = fds.sdk.OpenFactSetPartnersDocuments.Configuration(
    fds_oauth_client=ConfidentialClient('/path/to/app-config.json')
)

# Basic authentication: FactSetApiKey
# See https://github.com/FactSet/enterprise-sdk#api-key
# for information how to create an API key
# configuration = fds.sdk.OpenFactSetPartnersDocuments.Configuration(
#     username='USERNAME-SERIAL',
#     password='API-KEY'
# )

# Enter a context with an instance of the API client
with fds.sdk.OpenFactSetPartnersDocuments.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = ozmosi_api.OzmosiApi(api_client)

    # NOTE: The parameter variable defined below is just an example and may potentially contain non valid values. So please replace this with valid values.
    pagination_limit = 20 # int | Specifies the maximum number of results to return per result. (optional) if omitted the server will use the default value of 20
    # NOTE: The parameter variable defined below is just an example and may potentially contain non valid values. So please replace this with valid values.
    pagination_offset = 0 # int | Specifies the starting point for pagination. This parameter is used to identify the beginning of next set of results. Using this parameter can fetch maximum of first 10000 records. (optional) if omitted the server will use the default value of 0
    # NOTE: The parameter variable defined below is just an example and may potentially contain non valid values. So please replace this with valid values.
    clinical_trial_id = "NCT03037385_037" # str | This parameter specifies Ozmosi unique ID for each historical version of a trial. (optional)
    # NOTE: The parameter variable defined below is just an example and may potentially contain non valid values. So please replace this with valid values.
    biomarker_name = "EGFR" # str | This parameter specifies the abbreviated name of any patient biomarkers being targeted for research in the trial. (optional)
    # NOTE: The parameter variable defined below is just an example and may potentially contain non valid values. So please replace this with valid values.
    biomarker_full_name = "epidermal growth factor receptor" # str | Specifies the full name of the biomarker. (optional)

    try:
        # Returns the daily files of Biomarkers Details from Open:FactSet Partner - Ozmosi.
        # example passing only required values which don't have defaults set
        # and optional values
        api_response = api_instance.get_ozmosi_biomarkers_daily(pagination_limit=pagination_limit, pagination_offset=pagination_offset, clinical_trial_id=clinical_trial_id, biomarker_name=biomarker_name, biomarker_full_name=biomarker_full_name)

        pprint(api_response)

    except fds.sdk.OpenFactSetPartnersDocuments.ApiException as e:
        print("Exception when calling OzmosiApi->get_ozmosi_biomarkers_daily: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pagination_limit** | **int**| Specifies the maximum number of results to return per result. | [optional] if omitted the server will use the default value of 20
 **pagination_offset** | **int**| Specifies the starting point for pagination. This parameter is used to identify the beginning of next set of results. Using this parameter can fetch maximum of first 10000 records. | [optional] if omitted the server will use the default value of 0
 **clinical_trial_id** | **str**| This parameter specifies Ozmosi unique ID for each historical version of a trial. | [optional]
 **biomarker_name** | **str**| This parameter specifies the abbreviated name of any patient biomarkers being targeted for research in the trial. | [optional]
 **biomarker_full_name** | **str**| Specifies the full name of the biomarker. | [optional]

### Return type

[**BiomarkersResponse**](BiomarkersResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Download link &amp; metadata for Biomarkers Details. |  -  |
**400** | Bad request |  -  |
**401** | Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the Report Issue in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. |  -  |
**403** | The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. |  -  |
**500** | Internal Server Error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_ozmosi_clinical_trials_daily**
> DataResponse get_ozmosi_clinical_trials_daily()

Returns the daily files of Clinical Trial Details from Open:FactSet Partner - Ozmosi.

Returns the daily files of Clinical Trial Details from Open:FactSet Partner - Ozmosi.

### Example

* Basic Authentication (FactSetApiKey):
* OAuth Authentication (FactSetOAuth2):

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.OpenFactSetPartnersDocuments
from fds.sdk.OpenFactSetPartnersDocuments.api import ozmosi_api
from fds.sdk.OpenFactSetPartnersDocuments.models import *
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
configuration = fds.sdk.OpenFactSetPartnersDocuments.Configuration(
    fds_oauth_client=ConfidentialClient('/path/to/app-config.json')
)

# Basic authentication: FactSetApiKey
# See https://github.com/FactSet/enterprise-sdk#api-key
# for information how to create an API key
# configuration = fds.sdk.OpenFactSetPartnersDocuments.Configuration(
#     username='USERNAME-SERIAL',
#     password='API-KEY'
# )

# Enter a context with an instance of the API client
with fds.sdk.OpenFactSetPartnersDocuments.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = ozmosi_api.OzmosiApi(api_client)

    # NOTE: The parameter variable defined below is just an example and may potentially contain non valid values. So please replace this with valid values.
    sort = "-startDate" # str | Enables to get the data in ascending or descending order based on startTime. Results are in reverse chronological order if this parameter is not used. (optional) if omitted the server will use the default value of "-startDate"
    # NOTE: The parameter variable defined below is just an example and may potentially contain non valid values. So please replace this with valid values.
    pagination_limit = 20 # int | Specifies the maximum number of results to return per result Default value 20 and Maximum value 300 (optional) if omitted the server will use the default value of 20
    # NOTE: The parameter variable defined below is just an example and may potentially contain non valid values. So please replace this with valid values.
    pagination_offset = 0 # int | Specifies the starting point for pagination. This parameter is used to identify the beginning of next set of results. Using this parameter can fetch maximum of first 10000 records. (optional) if omitted the server will use the default value of 0
    # NOTE: The parameter variable defined below is just an example and may potentially contain non valid values. So please replace this with valid values.
    clinical_trial_id = "NCT03037385_037" # str | This parameter specifies Ozmosi unique ID for each historical version of a trial. (optional)
    # NOTE: The parameter variable defined below is just an example and may potentially contain non valid values. So please replace this with valid values.
    official_title = "A Phase 1/2 Study of the Highly-selective RET Inhibitor, BLU-667, in Patients With Thyroid Cancer, Non-Small Cell Lung Cancer (NSCLC) and Other Advanced Solid Tumors" # str | Specifies full scientific title of a trial. (optional)
    # NOTE: The parameter variable defined below is just an example and may potentially contain non valid values. So please replace this with valid values.
    trial_id = "NCT03037385" # str | This parameter specifies ID of the trial assigned by the trial registry. (optional)
    # NOTE: The parameter variable defined below is just an example and may potentially contain non valid values. So please replace this with valid values.
    date = dateutil_parser('2022-10-13 00:00:00') # datetime | Specifies the timestamp of each version of a trial in YYYY-MM-DD format. (optional)

    try:
        # Returns the daily files of Clinical Trial Details from Open:FactSet Partner - Ozmosi.
        # example passing only required values which don't have defaults set
        # and optional values
        api_response = api_instance.get_ozmosi_clinical_trials_daily(sort=sort, pagination_limit=pagination_limit, pagination_offset=pagination_offset, clinical_trial_id=clinical_trial_id, official_title=official_title, trial_id=trial_id, date=date)

        pprint(api_response)

    except fds.sdk.OpenFactSetPartnersDocuments.ApiException as e:
        print("Exception when calling OzmosiApi->get_ozmosi_clinical_trials_daily: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **sort** | **str**| Enables to get the data in ascending or descending order based on startTime. Results are in reverse chronological order if this parameter is not used. | [optional] if omitted the server will use the default value of "-startDate"
 **pagination_limit** | **int**| Specifies the maximum number of results to return per result Default value 20 and Maximum value 300 | [optional] if omitted the server will use the default value of 20
 **pagination_offset** | **int**| Specifies the starting point for pagination. This parameter is used to identify the beginning of next set of results. Using this parameter can fetch maximum of first 10000 records. | [optional] if omitted the server will use the default value of 0
 **clinical_trial_id** | **str**| This parameter specifies Ozmosi unique ID for each historical version of a trial. | [optional]
 **official_title** | **str**| Specifies full scientific title of a trial. | [optional]
 **trial_id** | **str**| This parameter specifies ID of the trial assigned by the trial registry. | [optional]
 **date** | **datetime**| Specifies the timestamp of each version of a trial in YYYY-MM-DD format. | [optional]

### Return type

[**DataResponse**](DataResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Download link &amp; metadata for Clinical Trial Details. |  -  |
**400** | Bad request |  -  |
**401** | Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the Report Issue in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. |  -  |
**403** | The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. |  -  |
**500** | Internal Server Error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_ozmosi_clinical_trials_history**
> FullHistoryResponse get_ozmosi_clinical_trials_history()

Returns the history files from Open:FactSet Partner - Ozmosi

Returns the historical files from June 23rd, 2005 to current date.

### Example

* Basic Authentication (FactSetApiKey):
* OAuth Authentication (FactSetOAuth2):

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.OpenFactSetPartnersDocuments
from fds.sdk.OpenFactSetPartnersDocuments.api import ozmosi_api
from fds.sdk.OpenFactSetPartnersDocuments.models import *
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
configuration = fds.sdk.OpenFactSetPartnersDocuments.Configuration(
    fds_oauth_client=ConfidentialClient('/path/to/app-config.json')
)

# Basic authentication: FactSetApiKey
# See https://github.com/FactSet/enterprise-sdk#api-key
# for information how to create an API key
# configuration = fds.sdk.OpenFactSetPartnersDocuments.Configuration(
#     username='USERNAME-SERIAL',
#     password='API-KEY'
# )

# Enter a context with an instance of the API client
with fds.sdk.OpenFactSetPartnersDocuments.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = ozmosi_api.OzmosiApi(api_client)

    # NOTE: The parameter variable defined below is just an example and may potentially contain non valid values. So please replace this with valid values.
    pagination_limit = 20 # int | Specifies the maximum number of results to return per result. (optional) if omitted the server will use the default value of 20
    # NOTE: The parameter variable defined below is just an example and may potentially contain non valid values. So please replace this with valid values.
    pagination_offset = 0 # int | Specifies the starting point for pagination. This parameter is used to identify the beginning of next set of results. Using this parameter can fetch maximum of first 10000 records. (optional) if omitted the server will use the default value of 0

    try:
        # Returns the history files from Open:FactSet Partner - Ozmosi
        # example passing only required values which don't have defaults set
        # and optional values
        api_response = api_instance.get_ozmosi_clinical_trials_history(pagination_limit=pagination_limit, pagination_offset=pagination_offset)

        pprint(api_response)

    except fds.sdk.OpenFactSetPartnersDocuments.ApiException as e:
        print("Exception when calling OzmosiApi->get_ozmosi_clinical_trials_history: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pagination_limit** | **int**| Specifies the maximum number of results to return per result. | [optional] if omitted the server will use the default value of 20
 **pagination_offset** | **int**| Specifies the starting point for pagination. This parameter is used to identify the beginning of next set of results. Using this parameter can fetch maximum of first 10000 records. | [optional] if omitted the server will use the default value of 0

### Return type

[**FullHistoryResponse**](FullHistoryResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Download link &amp; metadata for Ozmosi full history. |  -  |
**400** | Bad request |  -  |
**401** | Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the Report Issue in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. |  -  |
**403** | The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. |  -  |
**500** | Internal Server Error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_ozmosi_collaborators_daily**
> CollaboratorsResponse get_ozmosi_collaborators_daily()

Returns the daily files of Collaborators Details from Open:FactSet Partner - Ozmosi.

Returns the daily files of Collaborators Details from Open:FactSet Partner - Ozmosi.

### Example

* Basic Authentication (FactSetApiKey):
* OAuth Authentication (FactSetOAuth2):

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.OpenFactSetPartnersDocuments
from fds.sdk.OpenFactSetPartnersDocuments.api import ozmosi_api
from fds.sdk.OpenFactSetPartnersDocuments.models import *
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
configuration = fds.sdk.OpenFactSetPartnersDocuments.Configuration(
    fds_oauth_client=ConfidentialClient('/path/to/app-config.json')
)

# Basic authentication: FactSetApiKey
# See https://github.com/FactSet/enterprise-sdk#api-key
# for information how to create an API key
# configuration = fds.sdk.OpenFactSetPartnersDocuments.Configuration(
#     username='USERNAME-SERIAL',
#     password='API-KEY'
# )

# Enter a context with an instance of the API client
with fds.sdk.OpenFactSetPartnersDocuments.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = ozmosi_api.OzmosiApi(api_client)

    # NOTE: The parameter variable defined below is just an example and may potentially contain non valid values. So please replace this with valid values.
    pagination_limit = 20 # int | Specifies the maximum number of results to return per result. (optional) if omitted the server will use the default value of 20
    # NOTE: The parameter variable defined below is just an example and may potentially contain non valid values. So please replace this with valid values.
    pagination_offset = 0 # int | Specifies the starting point for pagination. This parameter is used to identify the beginning of next set of results. Using this parameter can fetch maximum of first 10000 records. (optional) if omitted the server will use the default value of 0
    # NOTE: The parameter variable defined below is just an example and may potentially contain non valid values. So please replace this with valid values.
    clinical_trial_id = "NCT03037385_037" # str | This parameter specifies Ozmosi unique ID for each historical version of a trial. (optional)
    # NOTE: The parameter variable defined below is just an example and may potentially contain non valid values. So please replace this with valid values.
    beam_collaborators_name = "Inventivan Pharma" # str | It specifies the cleaned name of the collaborator. (optional)
    # NOTE: The parameter variable defined below is just an example and may potentially contain non valid values. So please replace this with valid values.
    beam_collaborators_ticker = "SSNLF" # str | It specifies the Stock ticker for collaborator. (optional)

    try:
        # Returns the daily files of Collaborators Details from Open:FactSet Partner - Ozmosi.
        # example passing only required values which don't have defaults set
        # and optional values
        api_response = api_instance.get_ozmosi_collaborators_daily(pagination_limit=pagination_limit, pagination_offset=pagination_offset, clinical_trial_id=clinical_trial_id, beam_collaborators_name=beam_collaborators_name, beam_collaborators_ticker=beam_collaborators_ticker)

        pprint(api_response)

    except fds.sdk.OpenFactSetPartnersDocuments.ApiException as e:
        print("Exception when calling OzmosiApi->get_ozmosi_collaborators_daily: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pagination_limit** | **int**| Specifies the maximum number of results to return per result. | [optional] if omitted the server will use the default value of 20
 **pagination_offset** | **int**| Specifies the starting point for pagination. This parameter is used to identify the beginning of next set of results. Using this parameter can fetch maximum of first 10000 records. | [optional] if omitted the server will use the default value of 0
 **clinical_trial_id** | **str**| This parameter specifies Ozmosi unique ID for each historical version of a trial. | [optional]
 **beam_collaborators_name** | **str**| It specifies the cleaned name of the collaborator. | [optional]
 **beam_collaborators_ticker** | **str**| It specifies the Stock ticker for collaborator. | [optional]

### Return type

[**CollaboratorsResponse**](CollaboratorsResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Download link &amp; metadata for Collaborators Details.. |  -  |
**400** | Bad request |  -  |
**401** | Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the Report Issue in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. |  -  |
**403** | The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. |  -  |
**500** | Internal Server Error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_ozmosi_diseases_daily**
> DiseasesResponse get_ozmosi_diseases_daily()

Returns the daily files of Diseases Details from Open:FactSet Partner- Ozmosi.

Returns the daily files of Diseases Details from Open:FactSet Partner- Ozmosi.

### Example

* Basic Authentication (FactSetApiKey):
* OAuth Authentication (FactSetOAuth2):

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.OpenFactSetPartnersDocuments
from fds.sdk.OpenFactSetPartnersDocuments.api import ozmosi_api
from fds.sdk.OpenFactSetPartnersDocuments.models import *
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
configuration = fds.sdk.OpenFactSetPartnersDocuments.Configuration(
    fds_oauth_client=ConfidentialClient('/path/to/app-config.json')
)

# Basic authentication: FactSetApiKey
# See https://github.com/FactSet/enterprise-sdk#api-key
# for information how to create an API key
# configuration = fds.sdk.OpenFactSetPartnersDocuments.Configuration(
#     username='USERNAME-SERIAL',
#     password='API-KEY'
# )

# Enter a context with an instance of the API client
with fds.sdk.OpenFactSetPartnersDocuments.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = ozmosi_api.OzmosiApi(api_client)

    # NOTE: The parameter variable defined below is just an example and may potentially contain non valid values. So please replace this with valid values.
    pagination_limit = 20 # int | Specifies the maximum number of results to return per result. (optional) if omitted the server will use the default value of 20
    # NOTE: The parameter variable defined below is just an example and may potentially contain non valid values. So please replace this with valid values.
    pagination_offset = 0 # int | Specifies the starting point for pagination. This parameter is used to identify the beginning of next set of results. Using this parameter can fetch maximum of first 10000 records. (optional) if omitted the server will use the default value of 0
    # NOTE: The parameter variable defined below is just an example and may potentially contain non valid values. So please replace this with valid values.
    clinical_trial_id = "NCT03037385_037" # str | This parameter specifies Ozmosi unique ID for each historical version of a trial. (optional)
    # NOTE: The parameter variable defined below is just an example and may potentially contain non valid values. So please replace this with valid values.
    disease_area = "Inflammation" # str | Specifies the cleaned disease name. (optional)
    # NOTE: The parameter variable defined below is just an example and may potentially contain non valid values. So please replace this with valid values.
    sub_therapy_area = "Inflammation" # str | Specifies the Sub Therapy Area of the disease. (optional)
    # NOTE: The parameter variable defined below is just an example and may potentially contain non valid values. So please replace this with valid values.
    therapy_area = "Musculoskeletal" # str | Specifies the Therapy Area of the disease. (optional)

    try:
        # Returns the daily files of Diseases Details from Open:FactSet Partner- Ozmosi.
        # example passing only required values which don't have defaults set
        # and optional values
        api_response = api_instance.get_ozmosi_diseases_daily(pagination_limit=pagination_limit, pagination_offset=pagination_offset, clinical_trial_id=clinical_trial_id, disease_area=disease_area, sub_therapy_area=sub_therapy_area, therapy_area=therapy_area)

        pprint(api_response)

    except fds.sdk.OpenFactSetPartnersDocuments.ApiException as e:
        print("Exception when calling OzmosiApi->get_ozmosi_diseases_daily: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pagination_limit** | **int**| Specifies the maximum number of results to return per result. | [optional] if omitted the server will use the default value of 20
 **pagination_offset** | **int**| Specifies the starting point for pagination. This parameter is used to identify the beginning of next set of results. Using this parameter can fetch maximum of first 10000 records. | [optional] if omitted the server will use the default value of 0
 **clinical_trial_id** | **str**| This parameter specifies Ozmosi unique ID for each historical version of a trial. | [optional]
 **disease_area** | **str**| Specifies the cleaned disease name. | [optional]
 **sub_therapy_area** | **str**| Specifies the Sub Therapy Area of the disease. | [optional]
 **therapy_area** | **str**| Specifies the Therapy Area of the disease. | [optional]

### Return type

[**DiseasesResponse**](DiseasesResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Download link &amp; metadata for Diseases Details. |  -  |
**400** | Bad request |  -  |
**401** | Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the Report Issue in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. |  -  |
**403** | The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. |  -  |
**500** | Internal Server Error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_ozmosi_endpoints_daily**
> BeamEndpointsResponse get_ozmosi_endpoints_daily()

Returns the daily files of Beam Endpoints Details from Open:FactSet Partner - Ozmosi.

Returns the daily files of Beam Endpoints Details from Open:FactSet Partner - Ozmosi.

### Example

* Basic Authentication (FactSetApiKey):
* OAuth Authentication (FactSetOAuth2):

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.OpenFactSetPartnersDocuments
from fds.sdk.OpenFactSetPartnersDocuments.api import ozmosi_api
from fds.sdk.OpenFactSetPartnersDocuments.models import *
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
configuration = fds.sdk.OpenFactSetPartnersDocuments.Configuration(
    fds_oauth_client=ConfidentialClient('/path/to/app-config.json')
)

# Basic authentication: FactSetApiKey
# See https://github.com/FactSet/enterprise-sdk#api-key
# for information how to create an API key
# configuration = fds.sdk.OpenFactSetPartnersDocuments.Configuration(
#     username='USERNAME-SERIAL',
#     password='API-KEY'
# )

# Enter a context with an instance of the API client
with fds.sdk.OpenFactSetPartnersDocuments.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = ozmosi_api.OzmosiApi(api_client)

    # NOTE: The parameter variable defined below is just an example and may potentially contain non valid values. So please replace this with valid values.
    pagination_limit = 20 # int | Specifies the maximum number of results to return per result. (optional) if omitted the server will use the default value of 20
    # NOTE: The parameter variable defined below is just an example and may potentially contain non valid values. So please replace this with valid values.
    pagination_offset = 0 # int | Specifies the starting point for pagination. This parameter is used to identify the beginning of next set of results. Using this parameter can fetch maximum of first 10000 records. (optional) if omitted the server will use the default value of 0
    # NOTE: The parameter variable defined below is just an example and may potentially contain non valid values. So please replace this with valid values.
    clinical_trial_id = "NCT03037385_037" # str | This parameter specifies Ozmosi unique ID for each historical version of a trial. (optional)
    # NOTE: The parameter variable defined below is just an example and may potentially contain non valid values. So please replace this with valid values.
    name = "OS" # str | This parameter specifies cleaned and standardized abbreviations of primary endpoints that are common or of key interest. (optional)
    # NOTE: The parameter variable defined below is just an example and may potentially contain non valid values. So please replace this with valid values.
    full_form = "Overall Survival" # str | This parameter specifies cleaned and standardized full names of primary endpoints that are common or of key interest. (optional)

    try:
        # Returns the daily files of Beam Endpoints Details from Open:FactSet Partner - Ozmosi.
        # example passing only required values which don't have defaults set
        # and optional values
        api_response = api_instance.get_ozmosi_endpoints_daily(pagination_limit=pagination_limit, pagination_offset=pagination_offset, clinical_trial_id=clinical_trial_id, name=name, full_form=full_form)

        pprint(api_response)

    except fds.sdk.OpenFactSetPartnersDocuments.ApiException as e:
        print("Exception when calling OzmosiApi->get_ozmosi_endpoints_daily: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pagination_limit** | **int**| Specifies the maximum number of results to return per result. | [optional] if omitted the server will use the default value of 20
 **pagination_offset** | **int**| Specifies the starting point for pagination. This parameter is used to identify the beginning of next set of results. Using this parameter can fetch maximum of first 10000 records. | [optional] if omitted the server will use the default value of 0
 **clinical_trial_id** | **str**| This parameter specifies Ozmosi unique ID for each historical version of a trial. | [optional]
 **name** | **str**| This parameter specifies cleaned and standardized abbreviations of primary endpoints that are common or of key interest. | [optional]
 **full_form** | **str**| This parameter specifies cleaned and standardized full names of primary endpoints that are common or of key interest. | [optional]

### Return type

[**BeamEndpointsResponse**](BeamEndpointsResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Download link &amp; metadata for Beam Endpoint Details. |  -  |
**400** | Bad request |  -  |
**401** | Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the Report Issue in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. |  -  |
**403** | The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. |  -  |
**500** | Internal Server Error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_ozmosi_intervention_daily**
> InterventionResponse get_ozmosi_intervention_daily()

Returns the daily files of Intervention details from Open:FactSet Partner - Ozmosi.

Returns the daily files of Intervention details from Open:FactSet Partner - Ozmosi.

### Example

* Basic Authentication (FactSetApiKey):
* OAuth Authentication (FactSetOAuth2):

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.OpenFactSetPartnersDocuments
from fds.sdk.OpenFactSetPartnersDocuments.api import ozmosi_api
from fds.sdk.OpenFactSetPartnersDocuments.models import *
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
configuration = fds.sdk.OpenFactSetPartnersDocuments.Configuration(
    fds_oauth_client=ConfidentialClient('/path/to/app-config.json')
)

# Basic authentication: FactSetApiKey
# See https://github.com/FactSet/enterprise-sdk#api-key
# for information how to create an API key
# configuration = fds.sdk.OpenFactSetPartnersDocuments.Configuration(
#     username='USERNAME-SERIAL',
#     password='API-KEY'
# )

# Enter a context with an instance of the API client
with fds.sdk.OpenFactSetPartnersDocuments.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = ozmosi_api.OzmosiApi(api_client)

    # NOTE: The parameter variable defined below is just an example and may potentially contain non valid values. So please replace this with valid values.
    pagination_limit = 20 # int | Specifies the maximum number of results to return per result. (optional) if omitted the server will use the default value of 20
    # NOTE: The parameter variable defined below is just an example and may potentially contain non valid values. So please replace this with valid values.
    pagination_offset = 0 # int | Specifies the starting point for pagination. This parameter is used to identify the beginning of next set of results. Using this parameter can fetch maximum of first 10000 records. (optional) if omitted the server will use the default value of 0
    # NOTE: The parameter variable defined below is just an example and may potentially contain non valid values. So please replace this with valid values.
    clinical_trial_id = "NCT03037385_037" # str | This parameter specifies Ozmosi unique ID for each historical version of a trial. (optional)
    # NOTE: The parameter variable defined below is just an example and may potentially contain non valid values. So please replace this with valid values.
    beam_intervention_name = "Etelcalcetide" # str | This parameter specifies the name of intervention applied. (optional)
    # NOTE: The parameter variable defined below is just an example and may potentially contain non valid values. So please replace this with valid values.
    beam_intervention_desc = "Cinacalcet oral once-daily" # str | It specifies the description of intervention applied. (optional)

    try:
        # Returns the daily files of Intervention details from Open:FactSet Partner - Ozmosi.
        # example passing only required values which don't have defaults set
        # and optional values
        api_response = api_instance.get_ozmosi_intervention_daily(pagination_limit=pagination_limit, pagination_offset=pagination_offset, clinical_trial_id=clinical_trial_id, beam_intervention_name=beam_intervention_name, beam_intervention_desc=beam_intervention_desc)

        pprint(api_response)

    except fds.sdk.OpenFactSetPartnersDocuments.ApiException as e:
        print("Exception when calling OzmosiApi->get_ozmosi_intervention_daily: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pagination_limit** | **int**| Specifies the maximum number of results to return per result. | [optional] if omitted the server will use the default value of 20
 **pagination_offset** | **int**| Specifies the starting point for pagination. This parameter is used to identify the beginning of next set of results. Using this parameter can fetch maximum of first 10000 records. | [optional] if omitted the server will use the default value of 0
 **clinical_trial_id** | **str**| This parameter specifies Ozmosi unique ID for each historical version of a trial. | [optional]
 **beam_intervention_name** | **str**| This parameter specifies the name of intervention applied. | [optional]
 **beam_intervention_desc** | **str**| It specifies the description of intervention applied. | [optional]

### Return type

[**InterventionResponse**](InterventionResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Download link &amp; metadata for Intervention Details. |  -  |
**400** | Bad request |  -  |
**401** | Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the Report Issue in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. |  -  |
**403** | The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. |  -  |
**500** | Internal Server Error. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_ozmosi_orangepurple_daily**
> OrangePurpleResponse get_ozmosi_orangepurple_daily()

Returns the daily files of OrangePurple Details from Open:FactSet Partner - Ozmosi.

Returns the daily files of OrangePurple Details from Open:FaStset Partner - Ozmosi.

### Example

* Basic Authentication (FactSetApiKey):
* OAuth Authentication (FactSetOAuth2):

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.OpenFactSetPartnersDocuments
from fds.sdk.OpenFactSetPartnersDocuments.api import ozmosi_api
from fds.sdk.OpenFactSetPartnersDocuments.models import *
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
configuration = fds.sdk.OpenFactSetPartnersDocuments.Configuration(
    fds_oauth_client=ConfidentialClient('/path/to/app-config.json')
)

# Basic authentication: FactSetApiKey
# See https://github.com/FactSet/enterprise-sdk#api-key
# for information how to create an API key
# configuration = fds.sdk.OpenFactSetPartnersDocuments.Configuration(
#     username='USERNAME-SERIAL',
#     password='API-KEY'
# )

# Enter a context with an instance of the API client
with fds.sdk.OpenFactSetPartnersDocuments.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = ozmosi_api.OzmosiApi(api_client)

    # NOTE: The parameter variable defined below is just an example and may potentially contain non valid values. So please replace this with valid values.
    pagination_limit = 20 # int | Specifies the maximum number of results to return per result. (optional) if omitted the server will use the default value of 20
    # NOTE: The parameter variable defined below is just an example and may potentially contain non valid values. So please replace this with valid values.
    pagination_offset = 0 # int | Specifies the starting point for pagination. This parameter is used to identify the beginning of next set of results. Using this parameter can fetch maximum of first 10000 records. (optional) if omitted the server will use the default value of 0
    # NOTE: The parameter variable defined below is just an example and may potentially contain non valid values. So please replace this with valid values.
    clinical_trial_id = "NCT03037385_037" # str | This parameter specifies Ozmosi unique ID for each historical version of a trial. (optional)
    # NOTE: The parameter variable defined below is just an example and may potentially contain non valid values. So please replace this with valid values.
    beam_op_novel_drug = "EDP-305" # str | This parameter identifies if the trial includes a drug that is not approved by the FDA. (optional)
    # NOTE: The parameter variable defined below is just an example and may potentially contain non valid values. So please replace this with valid values.
    beam_op_novel_target = "tricalcium" # str | It lists the unapproved drug. (optional)

    try:
        # Returns the daily files of OrangePurple Details from Open:FactSet Partner - Ozmosi.
        # example passing only required values which don't have defaults set
        # and optional values
        api_response = api_instance.get_ozmosi_orangepurple_daily(pagination_limit=pagination_limit, pagination_offset=pagination_offset, clinical_trial_id=clinical_trial_id, beam_op_novel_drug=beam_op_novel_drug, beam_op_novel_target=beam_op_novel_target)

        pprint(api_response)

    except fds.sdk.OpenFactSetPartnersDocuments.ApiException as e:
        print("Exception when calling OzmosiApi->get_ozmosi_orangepurple_daily: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pagination_limit** | **int**| Specifies the maximum number of results to return per result. | [optional] if omitted the server will use the default value of 20
 **pagination_offset** | **int**| Specifies the starting point for pagination. This parameter is used to identify the beginning of next set of results. Using this parameter can fetch maximum of first 10000 records. | [optional] if omitted the server will use the default value of 0
 **clinical_trial_id** | **str**| This parameter specifies Ozmosi unique ID for each historical version of a trial. | [optional]
 **beam_op_novel_drug** | **str**| This parameter identifies if the trial includes a drug that is not approved by the FDA. | [optional]
 **beam_op_novel_target** | **str**| It lists the unapproved drug. | [optional]

### Return type

[**OrangePurpleResponse**](OrangePurpleResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Download link &amp; metadata for OrangePurple Details. |  -  |
**400** | Bad request |  -  |
**401** | Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the Report Issue in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. |  -  |
**403** | The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. |  -  |
**500** | Internal Server Error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_ozmosi_primaryoutcome_daily**
> PrimaryOutcomeResponse get_ozmosi_primaryoutcome_daily()

Returns the daily files of PrimaryOutcome Details from Open:FactSet Partner - Ozmosi.

Returns the daily files of PrimaryOutcome Details from Open:FactSet Partner - Ozmosi.

### Example

* Basic Authentication (FactSetApiKey):
* OAuth Authentication (FactSetOAuth2):

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.OpenFactSetPartnersDocuments
from fds.sdk.OpenFactSetPartnersDocuments.api import ozmosi_api
from fds.sdk.OpenFactSetPartnersDocuments.models import *
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
configuration = fds.sdk.OpenFactSetPartnersDocuments.Configuration(
    fds_oauth_client=ConfidentialClient('/path/to/app-config.json')
)

# Basic authentication: FactSetApiKey
# See https://github.com/FactSet/enterprise-sdk#api-key
# for information how to create an API key
# configuration = fds.sdk.OpenFactSetPartnersDocuments.Configuration(
#     username='USERNAME-SERIAL',
#     password='API-KEY'
# )

# Enter a context with an instance of the API client
with fds.sdk.OpenFactSetPartnersDocuments.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = ozmosi_api.OzmosiApi(api_client)

    # NOTE: The parameter variable defined below is just an example and may potentially contain non valid values. So please replace this with valid values.
    pagination_limit = 20 # int | Specifies the maximum number of results to return per result. (optional) if omitted the server will use the default value of 20
    # NOTE: The parameter variable defined below is just an example and may potentially contain non valid values. So please replace this with valid values.
    pagination_offset = 0 # int | Specifies the starting point for pagination. This parameter is used to identify the beginning of next set of results. Using this parameter can fetch maximum of first 10000 records. (optional) if omitted the server will use the default value of 0
    # NOTE: The parameter variable defined below is just an example and may potentially contain non valid values. So please replace this with valid values.
    clinical_trial_id = "NCT03037385_037" # str | This parameter specifies Ozmosi unique ID for each historical version of a trial. (optional)
    # NOTE: The parameter variable defined below is just an example and may potentially contain non valid values. So please replace this with valid values.
    primary_outcome_measure = "Percentage of Participants Achieving an American College of Rheumatology (ACR) 50 Response at Week 12." # str | It specifies the description of each primary outcome measure (or for observational studies, specific key measurement[s] or observation[s] used to describe patterns of diseases or traits or associations with exposures, risk factors or treatment). (optional)
    # NOTE: The parameter variable defined below is just an example and may potentially contain non valid values. So please replace this with valid values.
    primary_outcome_desc = "Week 12" # str | It describes the metric used to characterize the specific primary outcome measure, if not included in the primary outcome measure title. (optional)

    try:
        # Returns the daily files of PrimaryOutcome Details from Open:FactSet Partner - Ozmosi.
        # example passing only required values which don't have defaults set
        # and optional values
        api_response = api_instance.get_ozmosi_primaryoutcome_daily(pagination_limit=pagination_limit, pagination_offset=pagination_offset, clinical_trial_id=clinical_trial_id, primary_outcome_measure=primary_outcome_measure, primary_outcome_desc=primary_outcome_desc)

        pprint(api_response)

    except fds.sdk.OpenFactSetPartnersDocuments.ApiException as e:
        print("Exception when calling OzmosiApi->get_ozmosi_primaryoutcome_daily: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pagination_limit** | **int**| Specifies the maximum number of results to return per result. | [optional] if omitted the server will use the default value of 20
 **pagination_offset** | **int**| Specifies the starting point for pagination. This parameter is used to identify the beginning of next set of results. Using this parameter can fetch maximum of first 10000 records. | [optional] if omitted the server will use the default value of 0
 **clinical_trial_id** | **str**| This parameter specifies Ozmosi unique ID for each historical version of a trial. | [optional]
 **primary_outcome_measure** | **str**| It specifies the description of each primary outcome measure (or for observational studies, specific key measurement[s] or observation[s] used to describe patterns of diseases or traits or associations with exposures, risk factors or treatment). | [optional]
 **primary_outcome_desc** | **str**| It describes the metric used to characterize the specific primary outcome measure, if not included in the primary outcome measure title. | [optional]

### Return type

[**PrimaryOutcomeResponse**](PrimaryOutcomeResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Download link &amp; metadata for PrimaryOutcome Details |  -  |
**400** | Bad request |  -  |
**401** | Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the Report Issue in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. |  -  |
**403** | The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. |  -  |
**500** | Internal Server Error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_ozmosi_sponsors_daily**
> SponsorsResponse get_ozmosi_sponsors_daily()

Returns the daily files of Sponsors Details from Open:FactSet Partner - Ozmosi.

Returns the daily files of Sponsors Details from Open:FactSet Partner - Ozmosi.

### Example

* Basic Authentication (FactSetApiKey):
* OAuth Authentication (FactSetOAuth2):

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.OpenFactSetPartnersDocuments
from fds.sdk.OpenFactSetPartnersDocuments.api import ozmosi_api
from fds.sdk.OpenFactSetPartnersDocuments.models import *
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
configuration = fds.sdk.OpenFactSetPartnersDocuments.Configuration(
    fds_oauth_client=ConfidentialClient('/path/to/app-config.json')
)

# Basic authentication: FactSetApiKey
# See https://github.com/FactSet/enterprise-sdk#api-key
# for information how to create an API key
# configuration = fds.sdk.OpenFactSetPartnersDocuments.Configuration(
#     username='USERNAME-SERIAL',
#     password='API-KEY'
# )

# Enter a context with an instance of the API client
with fds.sdk.OpenFactSetPartnersDocuments.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = ozmosi_api.OzmosiApi(api_client)

    # NOTE: The parameter variable defined below is just an example and may potentially contain non valid values. So please replace this with valid values.
    pagination_limit = 20 # int | Specifies the maximum number of results to return per result. (optional) if omitted the server will use the default value of 20
    # NOTE: The parameter variable defined below is just an example and may potentially contain non valid values. So please replace this with valid values.
    pagination_offset = 0 # int | Specifies the starting point for pagination. This parameter is used to identify the beginning of next set of results. Using this parameter can fetch maximum of first 10000 records. (optional) if omitted the server will use the default value of 0
    # NOTE: The parameter variable defined below is just an example and may potentially contain non valid values. So please replace this with valid values.
    clinical_trial_id = "NCT03037385_037" # str | This parameter specifies Ozmosi unique ID for each historical version of a trial. (optional)
    # NOTE: The parameter variable defined below is just an example and may potentially contain non valid values. So please replace this with valid values.
    beam_sponsors_name = "AtriCure" # str | It specifies the cleaned name of the Sponsor. (optional)
    # NOTE: The parameter variable defined below is just an example and may potentially contain non valid values. So please replace this with valid values.
    beam_sponsors_ticker = "ATRC" # str | It specifies the stock ticker for primary sponsor. (optional)

    try:
        # Returns the daily files of Sponsors Details from Open:FactSet Partner - Ozmosi.
        # example passing only required values which don't have defaults set
        # and optional values
        api_response = api_instance.get_ozmosi_sponsors_daily(pagination_limit=pagination_limit, pagination_offset=pagination_offset, clinical_trial_id=clinical_trial_id, beam_sponsors_name=beam_sponsors_name, beam_sponsors_ticker=beam_sponsors_ticker)

        pprint(api_response)

    except fds.sdk.OpenFactSetPartnersDocuments.ApiException as e:
        print("Exception when calling OzmosiApi->get_ozmosi_sponsors_daily: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pagination_limit** | **int**| Specifies the maximum number of results to return per result. | [optional] if omitted the server will use the default value of 20
 **pagination_offset** | **int**| Specifies the starting point for pagination. This parameter is used to identify the beginning of next set of results. Using this parameter can fetch maximum of first 10000 records. | [optional] if omitted the server will use the default value of 0
 **clinical_trial_id** | **str**| This parameter specifies Ozmosi unique ID for each historical version of a trial. | [optional]
 **beam_sponsors_name** | **str**| It specifies the cleaned name of the Sponsor. | [optional]
 **beam_sponsors_ticker** | **str**| It specifies the stock ticker for primary sponsor. | [optional]

### Return type

[**SponsorsResponse**](SponsorsResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Download link &amp; metadata for Sponsors Details. |  -  |
**400** | Bad request |  -  |
**401** | Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the Report Issue in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. |  -  |
**403** | The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. |  -  |
**500** | Internal Server Error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

