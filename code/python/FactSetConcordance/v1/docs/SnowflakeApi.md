# fds.sdk.FactSetConcordance.SnowflakeApi

All URIs are relative to *https://api.factset.com/content*

Method | HTTP request | Description
------------- | ------------- | -------------
[**get_snowflake_entity_match**](SnowflakeApi.md#get_snowflake_entity_match) | **GET** /factset-concordance/v1/snowflake-entity-match | Perform an entity match and return a snowflake-friendly response. 1 Name per request.
[**get_snowflake_entity_match_for_list**](SnowflakeApi.md#get_snowflake_entity_match_for_list) | **POST** /factset-concordance/v1/snowflake-entity-match | Perform an entity search and return a snowflake-friendly response. Up to 25 Names per request.


# **get_snowflake_entity_match**
> SnowflakeEntityMatchResponse get_snowflake_entity_match(name)

Perform an entity match and return a snowflake-friendly response. 1 Name per request.

Finds the best candidate entities matching the given entity name. Additional attributes can be supplied to narrow the search. *This endpoint is used natively within Snowflake and is not to be consumed directly by users. Reach out to your FactSet Account team to learn more about Concordance in Snowflake.* 

### Example

* Basic Authentication (FactSetApiKey):
* OAuth Authentication (FactSetOAuth2):

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.FactSetConcordance
from fds.sdk.FactSetConcordance.api import snowflake_api
from fds.sdk.FactSetConcordance.model.snowflake_entity_match_response import SnowflakeEntityMatchResponse
from pprint import pprint

# See configuration.py for a list of all supported configuration parameters.

# Examples for each supported authentication method are below,
# choose one that satisfies your use case.

# (Preferred) OAuth 2.0: FactSetOAuth2
# See https://github.com/FactSet/enterprise-sdk#oauth-20
# for information on how to create the app-config.json file
# See https://github.com/FactSet/enterprise-sdk-utils-python#authentication
# for more information on using the ConfidentialClient class
configuration = fds.sdk.FactSetConcordance.Configuration(
    fds_oauth_client=ConfidentialClient('/path/to/app-config.json')
)

# Basic authentication: FactSetApiKey
# See https://github.com/FactSet/enterprise-sdk#api-key
# for information how to create an API key
# configuration = fds.sdk.FactSetConcordance.Configuration(
#     username='USERNAME-SERIAL',
#     password='API-KEY'
# )

# Enter a context with an instance of the API client
with fds.sdk.FactSetConcordance.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = snowflake_api.SnowflakeApi(api_client)

    name = "FactSet" # str | Name of Entity to match.
    country = "US" # str | ISO2 country code corresponding to the entity name that is used when evaluating candidates for a match. For a list of ISO2 Country codes, visit [OA 8754](https://my.apps.factset.com/oa/pages/8754). (optional)
    state = "CT" # str | Two-character state code corresponding to the entity name that is used when evaluating candidates for a match. Currently, only US state codes are supported. (optional)
    url = "url_example" # str | URL corresponding to the entity name that is used when evaluating candidates for a match. (optional)

    try:
        # Perform an entity match and return a snowflake-friendly response. 1 Name per request.
        api_response = api_instance.get_snowflake_entity_match(name, country=country, state=state, url=url)
        pprint(api_response)

    except fds.sdk.FactSetConcordance.ApiException as e:
        print("Exception when calling SnowflakeApi->get_snowflake_entity_match: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **str**| Name of Entity to match. |
 **country** | **str**| ISO2 country code corresponding to the entity name that is used when evaluating candidates for a match. For a list of ISO2 Country codes, visit [OA 8754](https://my.apps.factset.com/oa/pages/8754). | [optional]
 **state** | **str**| Two-character state code corresponding to the entity name that is used when evaluating candidates for a match. Currently, only US state codes are supported. | [optional]
 **url** | **str**| URL corresponding to the entity name that is used when evaluating candidates for a match. | [optional]

### Return type

[**SnowflakeEntityMatchResponse**](SnowflakeEntityMatchResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Response object for the entity-match object in a snowflake friendly response model. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_snowflake_entity_match_for_list**
> SnowflakeEntityMatchResponse get_snowflake_entity_match_for_list(snowflake_entity_match_request)

Perform an entity search and return a snowflake-friendly response. Up to 25 Names per request.

Finds the best candidate entities matching the given company name. Additional attributes can be supplied to narrow the search. *This endpoint is used natively within Snowflake and is not to be consumed directly by users. Reach out to your FactSet Account team to learn more about Concordance in Snowflake.* 

### Example

* Basic Authentication (FactSetApiKey):
* OAuth Authentication (FactSetOAuth2):

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.FactSetConcordance
from fds.sdk.FactSetConcordance.api import snowflake_api
from fds.sdk.FactSetConcordance.model.snowflake_entity_match_request import SnowflakeEntityMatchRequest
from fds.sdk.FactSetConcordance.model.snowflake_entity_match_response import SnowflakeEntityMatchResponse
from pprint import pprint

# See configuration.py for a list of all supported configuration parameters.

# Examples for each supported authentication method are below,
# choose one that satisfies your use case.

# (Preferred) OAuth 2.0: FactSetOAuth2
# See https://github.com/FactSet/enterprise-sdk#oauth-20
# for information on how to create the app-config.json file
# See https://github.com/FactSet/enterprise-sdk-utils-python#authentication
# for more information on using the ConfidentialClient class
configuration = fds.sdk.FactSetConcordance.Configuration(
    fds_oauth_client=ConfidentialClient('/path/to/app-config.json')
)

# Basic authentication: FactSetApiKey
# See https://github.com/FactSet/enterprise-sdk#api-key
# for information how to create an API key
# configuration = fds.sdk.FactSetConcordance.Configuration(
#     username='USERNAME-SERIAL',
#     password='API-KEY'
# )

# Enter a context with an instance of the API client
with fds.sdk.FactSetConcordance.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = snowflake_api.SnowflakeApi(api_client)

    snowflake_entity_match_request = SnowflakeEntityMatchRequest(
        data=[0,"FactSet","US","CT","www.factset.com"],
    ) # SnowflakeEntityMatchRequest | A request to match an entity name and its attributes within Snowflake.

    try:
        # Perform an entity search and return a snowflake-friendly response. Up to 25 Names per request.
        api_response = api_instance.get_snowflake_entity_match_for_list(snowflake_entity_match_request)
        pprint(api_response)

    except fds.sdk.FactSetConcordance.ApiException as e:
        print("Exception when calling SnowflakeApi->get_snowflake_entity_match_for_list: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **snowflake_entity_match_request** | [**SnowflakeEntityMatchRequest**](SnowflakeEntityMatchRequest.md)| A request to match an entity name and its attributes within Snowflake. |

### Return type

[**SnowflakeEntityMatchResponse**](SnowflakeEntityMatchResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Response object for the entity-match object in a snowflake friendly response model. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

