# fds.sdk.InvestmentResearch.ResearchApi

All URIs are relative to *https://api.factset.com/content/investment-research/v0*

Method | HTTP request | Description
------------- | ------------- | -------------
[**get_count**](ResearchApi.md#get_count) | **POST** /count | Returns the count of documents for specified source.
[**get_investment_research_data**](ResearchApi.md#get_investment_research_data) | **POST** /search | Retrieve investment research documents and related metadata within FactSet coverage.



# **get_count**
> CountResponse get_count(count_request)

Returns the count of documents for specified source.

Returns the count of documents along with other response fields.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.InvestmentResearch
from fds.sdk.InvestmentResearch.api import research_api
from fds.sdk.InvestmentResearch.models import *
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
configuration = fds.sdk.InvestmentResearch.Configuration(
    fds_oauth_client=ConfidentialClient('/path/to/app-config.json')
)

# Basic authentication: FactSetApiKey
# See https://github.com/FactSet/enterprise-sdk#api-key
# for information how to create an API key
# configuration = fds.sdk.InvestmentResearch.Configuration(
#     username='USERNAME-SERIAL',
#     password='API-KEY'
# )

# Enter a context with an instance of the API client
with fds.sdk.InvestmentResearch.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = research_api.ResearchApi(api_client)

    # NOTE: The following variables are just an example and may contain invalid values. Please, replace these with valid values.
    count_request = CountRequest(
        data=CountRequestBody(
            ids=Ids(["MODN-US"]),
            start_date=dateutil_parser('Fri Dec 21 00:00:00 UTC 2012').date(),
            end_date=dateutil_parser('Sun Dec 23 00:00:00 UTC 2012').date(),
            start_date_relative=-1,
            end_date_relative=-1,
            sources=Sources([
                "FRC",
            ]),
            timezone="America/New_York",
            categories=Categories(["SB:ANLCH","IN:OIL"]),
            primary_id=False,
            search_text="Officer",
            contributor_id=ContributorId([20120205,21069618]),
            analyst_id=AnalystId([6885167,6885168]),
            report_foci=ReportFoci([
                "Issuer",
            ]),
            security_types=SecurityTypes(["Agencycredit","Agencypassthroughsecurities"]),
            asset_types=AssetTypes(["Agencycredit","Assetbackedcredit"]),
            asset_classes=AssetClasses([
                "Commodity",
            ]),
            coverage_actions=CoverageActions([
                "Drop",
            ]),
            compilation_indicators=True,
            disciplines=Disciplines([
                "Investment",
            ]),
            issuer_types=IssuerTypes([
                "Agency",
            ]),
            periodicities=Periodicities([
                "Annually",
            ]),
            purposes=Purposes([
                "Action",
            ]),
            rating_actions=RatingActions([
                "Affirmed",
            ]),
            research_approaches=ResearchApproaches([
                "Fundamental",
            ]),
            target_actions=TargetActions([
                "Decrease",
            ]),
            weighting_actions=WeightingActions([
                "Decrease",
            ]),
        ),
    ) # CountRequest | 

    try:
        # Returns the count of documents for specified source.
        # example passing only required values which don't have defaults set
        api_response = api_instance.get_count(count_request)

        pprint(api_response)

    except fds.sdk.InvestmentResearch.ApiException as e:
        print("Exception when calling ResearchApi->get_count: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **count_request** | [**CountRequest**](CountRequest.md)|  |

### Return type

[**CountResponse**](CountResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Success |  -  |
**400** | Bad request. |  -  |
**401** | Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the Report Issue in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. |  -  |
**403** | The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. |  -  |
**500** | Internal Server Error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_investment_research_data**
> InvestmentResearchResponse get_investment_research_data(search_request)

Retrieve investment research documents and related metadata within FactSet coverage.

The /search endpoint returns the details about research documents, including headline, source, contributors, analyst information, categories, document links, relevant IDs and publication date.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.InvestmentResearch
from fds.sdk.InvestmentResearch.api import research_api
from fds.sdk.InvestmentResearch.models import *
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
configuration = fds.sdk.InvestmentResearch.Configuration(
    fds_oauth_client=ConfidentialClient('/path/to/app-config.json')
)

# Basic authentication: FactSetApiKey
# See https://github.com/FactSet/enterprise-sdk#api-key
# for information how to create an API key
# configuration = fds.sdk.InvestmentResearch.Configuration(
#     username='USERNAME-SERIAL',
#     password='API-KEY'
# )

# Enter a context with an instance of the API client
with fds.sdk.InvestmentResearch.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = research_api.ResearchApi(api_client)

    # NOTE: The following variables are just an example and may contain invalid values. Please, replace these with valid values.
    search_request = SearchRequest(
        data=SearchRequestBody(
            ids=Ids(["MODN-US"]),
            start_date=dateutil_parser('Fri Dec 21 00:00:00 UTC 2012').date(),
            end_date=dateutil_parser('Sun Dec 23 00:00:00 UTC 2012').date(),
            start_date_relative=-1,
            end_date_relative=-1,
            sources=Sources([
                "FRC",
            ]),
            timezone="America/New_York",
            categories=Categories(["SB:ANLCH","IN:OIL"]),
            primary_id=False,
            search_text="Officer",
            contributor_id=ContributorId([20120205,21069618]),
            analyst_id=AnalystId([6885167,6885168]),
            report_foci=ReportFoci([
                "Issuer",
            ]),
            security_types=SecurityTypes(["Agencycredit","Agencypassthroughsecurities"]),
            asset_types=AssetTypes(["Agencycredit","Assetbackedcredit"]),
            asset_classes=AssetClasses([
                "Commodity",
            ]),
            coverage_actions=CoverageActions([
                "Drop",
            ]),
            compilation_indicators=True,
            disciplines=Disciplines([
                "Investment",
            ]),
            issuer_types=IssuerTypes([
                "Agency",
            ]),
            periodicities=Periodicities([
                "Annually",
            ]),
            purposes=Purposes([
                "Action",
            ]),
            rating_actions=RatingActions([
                "Affirmed",
            ]),
            research_approaches=ResearchApproaches([
                "Fundamental",
            ]),
            target_actions=TargetActions([
                "Decrease",
            ]),
            weighting_actions=WeightingActions([
                "Decrease",
            ]),
        ),
        meta=SearchRequestMeta(
            pagination=SearchRequestMetaPagination(
                limit=25,
                offset=0,
            ),
            sort=["-storyDateTime"],
        ),
    ) # SearchRequest | 

    try:
        # Retrieve investment research documents and related metadata within FactSet coverage.
        # example passing only required values which don't have defaults set
        api_response = api_instance.get_investment_research_data(search_request)

        pprint(api_response)

    except fds.sdk.InvestmentResearch.ApiException as e:
        print("Exception when calling ResearchApi->get_investment_research_data: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **search_request** | [**SearchRequest**](SearchRequest.md)|  |

### Return type

[**InvestmentResearchResponse**](InvestmentResearchResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Array of downloadable URLs consisting of investment research documents with related metadata. |  -  |
**400** | Bad request. |  -  |
**401** | Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the Report Issue in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. |  -  |
**403** | The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. |  -  |
**500** | Internal Server Error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

