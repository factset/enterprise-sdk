# fds.sdk.FactSetBanks.BranchesApi

All URIs are relative to *https://api.factset.com/content/factset-banks/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**get_branches**](BranchesApi.md#get_branches) | **POST** /branches | Returns bank branch and location data



# **get_branches**
> BranchesResponse get_branches(branches_request)

Returns bank branch and location data

Returns branch and location data for banks and financial institutions. Use the `coverage` field to specify the data source:  * **US** — FDIC-insured bank branches with branch counts and deposit market share by county, ZIP, and MSA. 85,000+ current branches across 9,000+ banks and BHCs. Sourced from the FDIC Summary of Deposits (annual) and Institutions and Locations (weekly). Current-only feed; deposit balances as of the most recent June 30. * **CREDIT_UNION** — US credit union branches and ATMs with service flags. 5,800+ credit unions, 21,000+ branches, and 17,000+ ATM addresses; reported quarterly since September 2022. * **AUSTRALIA** — Service channel locations with remoteness classifications. 149+ banks; 30,000+ branches, 47,000+ ATMs, 6,600+ other face-to-face, and 4.9M+ EFTPOS channels. Annual data as of June 30. * **GLOBAL** — Global bank branches and ATMs ex-US with country, region, city, lat/long, postal, and street details where available. 300,000+ banks, 800,000+ locations, 180+ countries. Current-only feed. 

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.FactSetBanks
from fds.sdk.FactSetBanks.api import branches_api
from fds.sdk.FactSetBanks.models import *
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
configuration = fds.sdk.FactSetBanks.Configuration(
    fds_oauth_client=ConfidentialClient('/path/to/app-config.json')
)

# Basic authentication: FactSetApiKey
# See https://github.com/FactSet/enterprise-sdk#api-key
# for information how to create an API key
# configuration = fds.sdk.FactSetBanks.Configuration(
#     username='USERNAME-SERIAL',
#     password='API-KEY'
# )

# Enter a context with an instance of the API client
with fds.sdk.FactSetBanks.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = branches_api.BranchesApi(api_client)

    # NOTE: The following variables are just an example and may contain invalid values. Please, replace these with valid values.
    branches_request = BranchesRequest(
        data=BranchesRequestData(
            ids=Ids(["000BDX-E"]),
            coverage="US",
            market_share_type="ALL",
            state_code=USStateCode("AL"),
            county_fips_codes=["36059","36103"],
            msa_codes=["35620"],
            zip_codes=["11501","11701"],
            location_names=["Nassau","Suffolk"],
            branch_types=["Full service brick and mortar branch"],
            min_total_deposits=1000,
            max_total_deposits=3.14,
            min_branch_count=1,
            max_branch_count=1,
            state_name="New South Wales",
            city="San Francisco",
            postal_code="94102",
            location_type="ALL",
            service_channel_type="ALL",
            country="CA",
            region="ON",
            is_main_office=True,
            has_drive_thru=True,
            has_member_services=True,
            has_atm=True,
        ),
        meta=RequestMeta(
            pagination=PaginationRequest(
                limit=100,
                offset=0,
            ),
        ),
    ) # BranchesRequest | 

    try:
        # Returns bank branch and location data
        # example passing only required values which don't have defaults set
        api_response = api_instance.get_branches(branches_request)

        pprint(api_response)

    except fds.sdk.FactSetBanks.ApiException as e:
        print("Exception when calling BranchesApi->get_branches: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **branches_request** | [**BranchesRequest**](BranchesRequest.md)|  |

### Return type

[**BranchesResponse**](BranchesResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Branch and location data |  -  |
**400** | Bad Request. This can occur for several reasons. Please review the \&quot;detail\&quot; for more details. |  -  |
**401** | Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. |  -  |
**403** | The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. |  -  |
**404** | The requested endpoint could not be found. |  -  |
**415** | Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. |  -  |
**422** | Unprocessable Entity. Your request data was syntactically correct but semantically invalid. Check the required parameters and their value constraints.  |  -  |
**500** | Internal Server Error. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

