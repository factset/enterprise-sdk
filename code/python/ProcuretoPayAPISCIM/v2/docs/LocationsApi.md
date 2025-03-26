# fds.sdk.ProcuretoPayAPISCIM.LocationsApi

All URIs are relative to *https://api.factset.com/scim/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**create_location**](LocationsApi.md#create_location) | **POST** /Locations | Create a location.
[**get_location**](LocationsApi.md#get_location) | **GET** /Locations/{id} | Get a location.
[**get_locations**](LocationsApi.md#get_locations) | **GET** /Locations | Get a list of locations.
[**modify_location**](LocationsApi.md#modify_location) | **PATCH** /Locations/{id} | Patch a location.
[**replace_location**](LocationsApi.md#replace_location) | **PUT** /Locations/{id} | Replace a location.



# **create_location**
> LocationResource create_location(location_resource)

Create a location.

Create a location resource.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.ProcuretoPayAPISCIM
from fds.sdk.ProcuretoPayAPISCIM.api import locations_api
from fds.sdk.ProcuretoPayAPISCIM.models import *
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
configuration = fds.sdk.ProcuretoPayAPISCIM.Configuration(
    fds_oauth_client=ConfidentialClient('/path/to/app-config.json')
)

# Basic authentication: FactSetApiKey
# See https://github.com/FactSet/enterprise-sdk#api-key
# for information how to create an API key
# configuration = fds.sdk.ProcuretoPayAPISCIM.Configuration(
#     username='USERNAME-SERIAL',
#     password='API-KEY'
# )

# Enter a context with an instance of the API client
with fds.sdk.ProcuretoPayAPISCIM.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = locations_api.LocationsApi(api_client)

    # NOTE: The following variables are just an example and may contain invalid values. Please, replace these with valid values.
    location_resource = LocationResource(
        schemas=["urn:scim:schemas:extension:FactSet:Core:1.0:Location"],
        external_id="4ECB41D6-FC6D-4511-8A50-0A88D0D6EE6A",
        name="FIN Wealth Management",
        description="description_example",
        address1="601 Main Avenue",
        address2="Factset - First Floor",
        address3="address3_example",
        locality="Norwalk",
        region="Connecticut",
        postal_code="06850",
        country="United States",
        firm_description=LocationResourceFirmDescription(None),
        email_domains=["foo.com"],
        partner_asserted_entity_id="partner_asserted_entity_id_example",
        company_agreement_urls=[
            LocationResourceCompanyAgreementUrl(
                ref="https://example-corp.com/company_agreements.pdf",
            ),
        ],
        managed_locations=[
            LocationResourceReference(
                value="1598276",
                ref="https://api.factset.com/scim/v2/Locations/1598276",
                display="FIN Wealth Management",
            ),
        ],
        managing_location=LocationResourceManagingLocation(None),
        main_location=LocationResourceMainLocation(None),
    ) # LocationResource | Location resource.

    try:
        # Create a location.
        # example passing only required values which don't have defaults set
        api_response = api_instance.create_location(location_resource)

        pprint(api_response)

    except fds.sdk.ProcuretoPayAPISCIM.ApiException as e:
        print("Exception when calling LocationsApi->create_location: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **location_resource** | [**LocationResource**](LocationResource.md)| Location resource. |

### Return type

[**LocationResource**](LocationResource.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: application/scim+json
 - **Accept**: application/scim+json, application/json


### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**201** | Success. |  -  |
**400** | Provided resource contains invalid data. |  -  |
**401** | User has not been authenticated. |  -  |
**403** | User is not authorized to use this API. |  -  |
**429** | User is accessing this API too frequently. |  -  |
**500** | Internal server error. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_location**
> LocationResource get_location(id)

Get a location.

Get a specific location resource.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.ProcuretoPayAPISCIM
from fds.sdk.ProcuretoPayAPISCIM.api import locations_api
from fds.sdk.ProcuretoPayAPISCIM.models import *
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
configuration = fds.sdk.ProcuretoPayAPISCIM.Configuration(
    fds_oauth_client=ConfidentialClient('/path/to/app-config.json')
)

# Basic authentication: FactSetApiKey
# See https://github.com/FactSet/enterprise-sdk#api-key
# for information how to create an API key
# configuration = fds.sdk.ProcuretoPayAPISCIM.Configuration(
#     username='USERNAME-SERIAL',
#     password='API-KEY'
# )

# Enter a context with an instance of the API client
with fds.sdk.ProcuretoPayAPISCIM.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = locations_api.LocationsApi(api_client)

    # NOTE: The following variables are just an example and may contain invalid values. Please, replace these with valid values.
    id = "id_example" # str | ID of resource.

    try:
        # Get a location.
        # example passing only required values which don't have defaults set
        api_response = api_instance.get_location(id)

        pprint(api_response)

    except fds.sdk.ProcuretoPayAPISCIM.ApiException as e:
        print("Exception when calling LocationsApi->get_location: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **str**| ID of resource. |

### Return type

[**LocationResource**](LocationResource.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/scim+json, application/json


### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Success. |  -  |
**401** | User has not been authenticated. |  -  |
**403** | User is not authorized to use this API. |  -  |
**404** | Location not found. |  -  |
**429** | User is accessing this API too frequently. |  -  |
**500** | Internal server error. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_locations**
> LocationResourceList get_locations()

Get a list of locations.

Get a list of location resources.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.ProcuretoPayAPISCIM
from fds.sdk.ProcuretoPayAPISCIM.api import locations_api
from fds.sdk.ProcuretoPayAPISCIM.models import *
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
configuration = fds.sdk.ProcuretoPayAPISCIM.Configuration(
    fds_oauth_client=ConfidentialClient('/path/to/app-config.json')
)

# Basic authentication: FactSetApiKey
# See https://github.com/FactSet/enterprise-sdk#api-key
# for information how to create an API key
# configuration = fds.sdk.ProcuretoPayAPISCIM.Configuration(
#     username='USERNAME-SERIAL',
#     password='API-KEY'
# )

# Enter a context with an instance of the API client
with fds.sdk.ProcuretoPayAPISCIM.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = locations_api.LocationsApi(api_client)

    # NOTE: The following variables are just an example and may contain invalid values. Please, replace these with valid values.
    filter = "filter_example" # str | Resource filter string. See [RFC 7644 section 3.4.2.2](https://tools.ietf.org/html/rfc7644#section-3.4.2.2) for syntax. Note this API implementation also supports a non-standard \"re\" operator for regular expression matching against string attributes. When using the \"re\" operator, do not include slash characters as delimiters (e.g. use \"foo\" instead of \"/foo/\".) Also note the case-sensitivity of the regular expression corresponds to the \"caseExact\" characteristic of the target attribute. (optional)
    sort_by = "sortBy_example" # str | Attribute to be used for sorting resources. See [RFC 7644 section 3.4.2.3](https://tools.ietf.org/html/rfc7644#section-3.4.2.3). The attribute name must be specified in standard attribute notation (see [RFC 7644 section 3.10](https://datatracker.ietf.org/doc/html/rfc7644#section-3.10).) Use the *sortOrder* parameter to specify whether resources should be sorted in ascending or descending order. (optional)
    sort_order = "sortOrder_example" # str | The order by which resources are to be sorted. See [RFC 7644 section 3.4.2.3](https://tools.ietf.org/html/rfc7644#section-3.4.2.3). Valid values are ''ascending'' (the default value) or ''descending''. This parameter may not be used unless the *sortBy* parameter is also specified. (optional)
    start_index = 1 # int | Result start index. The one-based index of the first result to be returned in the list of resources. For example, to exclude the first two resources, use a *startIndex* value of 3. This parameter has a default value of 1. This index applies *after* any resource filtration has been applied as specified by the *filter* argument. (optional)
    count = 1 # int | Maximum resource count. The server will not return more resources than this value, although it may return fewer. (optional)
    attributes = "attributes_example" # str | Attribute whitelist filter string. A comma-separated list of resource attribute names to be returned in the response, overriding the set of attributes that would be returned by default. Attribute names must be specified in standard attribute notation (see [RFC 7644 section 3.10](https://datatracker.ietf.org/doc/html/rfc7644#section-3.10).) This parameter cannot be used with the *excludedAttributes* parameter. (optional)
    excluded_attributes = "excludedAttributes_example" # str | Attribute blacklist filter string. A comma-separated list of resource attribute names to be excluded in the response, overriding the set of attributes that would be returned by default. Attribute names must be specified in standard attribute notation (see [RFC 7644 section 3.10](https://datatracker.ietf.org/doc/html/rfc7644#section-3.10).) This parameter cannot be used with the *attributes* parameter. (optional)

    try:
        # Get a list of locations.
        # example passing only required values which don't have defaults set
        # and optional values
        api_response = api_instance.get_locations(filter=filter, sort_by=sort_by, sort_order=sort_order, start_index=start_index, count=count, attributes=attributes, excluded_attributes=excluded_attributes)

        pprint(api_response)

    except fds.sdk.ProcuretoPayAPISCIM.ApiException as e:
        print("Exception when calling LocationsApi->get_locations: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **filter** | **str**| Resource filter string. See [RFC 7644 section 3.4.2.2](https://tools.ietf.org/html/rfc7644#section-3.4.2.2) for syntax. Note this API implementation also supports a non-standard \&quot;re\&quot; operator for regular expression matching against string attributes. When using the \&quot;re\&quot; operator, do not include slash characters as delimiters (e.g. use \&quot;foo\&quot; instead of \&quot;/foo/\&quot;.) Also note the case-sensitivity of the regular expression corresponds to the \&quot;caseExact\&quot; characteristic of the target attribute. | [optional]
 **sort_by** | **str**| Attribute to be used for sorting resources. See [RFC 7644 section 3.4.2.3](https://tools.ietf.org/html/rfc7644#section-3.4.2.3). The attribute name must be specified in standard attribute notation (see [RFC 7644 section 3.10](https://datatracker.ietf.org/doc/html/rfc7644#section-3.10).) Use the *sortOrder* parameter to specify whether resources should be sorted in ascending or descending order. | [optional]
 **sort_order** | **str**| The order by which resources are to be sorted. See [RFC 7644 section 3.4.2.3](https://tools.ietf.org/html/rfc7644#section-3.4.2.3). Valid values are &#39;&#39;ascending&#39;&#39; (the default value) or &#39;&#39;descending&#39;&#39;. This parameter may not be used unless the *sortBy* parameter is also specified. | [optional]
 **start_index** | **int**| Result start index. The one-based index of the first result to be returned in the list of resources. For example, to exclude the first two resources, use a *startIndex* value of 3. This parameter has a default value of 1. This index applies *after* any resource filtration has been applied as specified by the *filter* argument. | [optional]
 **count** | **int**| Maximum resource count. The server will not return more resources than this value, although it may return fewer. | [optional]
 **attributes** | **str**| Attribute whitelist filter string. A comma-separated list of resource attribute names to be returned in the response, overriding the set of attributes that would be returned by default. Attribute names must be specified in standard attribute notation (see [RFC 7644 section 3.10](https://datatracker.ietf.org/doc/html/rfc7644#section-3.10).) This parameter cannot be used with the *excludedAttributes* parameter. | [optional]
 **excluded_attributes** | **str**| Attribute blacklist filter string. A comma-separated list of resource attribute names to be excluded in the response, overriding the set of attributes that would be returned by default. Attribute names must be specified in standard attribute notation (see [RFC 7644 section 3.10](https://datatracker.ietf.org/doc/html/rfc7644#section-3.10).) This parameter cannot be used with the *attributes* parameter. | [optional]

### Return type

[**LocationResourceList**](LocationResourceList.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/scim+json, application/json


### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Success. |  -  |
**400** | Invalid filter value provided. |  -  |
**401** | User has not been authenticated. |  -  |
**403** | User is not authorized to use this API. |  -  |
**429** | User is accessing this API too frequently. |  -  |
**500** | Internal server error. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **modify_location**
> LocationResource modify_location(id)

Patch a location.

Modify a specific location resource (i.e. add, replace, or remove attributes of a location resource.)

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.ProcuretoPayAPISCIM
from fds.sdk.ProcuretoPayAPISCIM.api import locations_api
from fds.sdk.ProcuretoPayAPISCIM.models import *
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
configuration = fds.sdk.ProcuretoPayAPISCIM.Configuration(
    fds_oauth_client=ConfidentialClient('/path/to/app-config.json')
)

# Basic authentication: FactSetApiKey
# See https://github.com/FactSet/enterprise-sdk#api-key
# for information how to create an API key
# configuration = fds.sdk.ProcuretoPayAPISCIM.Configuration(
#     username='USERNAME-SERIAL',
#     password='API-KEY'
# )

# Enter a context with an instance of the API client
with fds.sdk.ProcuretoPayAPISCIM.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = locations_api.LocationsApi(api_client)

    # NOTE: The following variables are just an example and may contain invalid values. Please, replace these with valid values.
    id = "id_example" # str | ID of resource.
    patch = Patch(
        schemas=["urn:ietf:params:scim:api:messages:2.0:PatchOp"],
        operations=[
            PatchOperation(
                op="add",
                path="path_example",
                value=PatchOperationValue(None),
            ),
        ],
    ) # Patch |  (optional)

    try:
        # Patch a location.
        # example passing only required values which don't have defaults set
        # and optional values
        api_response = api_instance.modify_location(id, patch=patch)

        pprint(api_response)

    except fds.sdk.ProcuretoPayAPISCIM.ApiException as e:
        print("Exception when calling LocationsApi->modify_location: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **str**| ID of resource. |
 **patch** | [**Patch**](Patch.md)|  | [optional]

### Return type

[**LocationResource**](LocationResource.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: application/scim+json
 - **Accept**: application/scim+json, application/json


### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Success. |  -  |
**400** | Patch request invalid. |  -  |
**401** | User has not been authenticated. |  -  |
**403** | User is not authorized to use this API. |  -  |
**429** | User is accessing this API too frequently. |  -  |
**500** | Internal server error. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **replace_location**
> LocationResource replace_location(id, location_resource)

Replace a location.

Replace a specific location resource with another provided location resource.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.ProcuretoPayAPISCIM
from fds.sdk.ProcuretoPayAPISCIM.api import locations_api
from fds.sdk.ProcuretoPayAPISCIM.models import *
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
configuration = fds.sdk.ProcuretoPayAPISCIM.Configuration(
    fds_oauth_client=ConfidentialClient('/path/to/app-config.json')
)

# Basic authentication: FactSetApiKey
# See https://github.com/FactSet/enterprise-sdk#api-key
# for information how to create an API key
# configuration = fds.sdk.ProcuretoPayAPISCIM.Configuration(
#     username='USERNAME-SERIAL',
#     password='API-KEY'
# )

# Enter a context with an instance of the API client
with fds.sdk.ProcuretoPayAPISCIM.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = locations_api.LocationsApi(api_client)

    # NOTE: The following variables are just an example and may contain invalid values. Please, replace these with valid values.
    id = "id_example" # str | ID of resource.
    location_resource = LocationResource(
        schemas=["urn:scim:schemas:extension:FactSet:Core:1.0:Location"],
        external_id="4ECB41D6-FC6D-4511-8A50-0A88D0D6EE6A",
        name="FIN Wealth Management",
        description="description_example",
        address1="601 Main Avenue",
        address2="Factset - First Floor",
        address3="address3_example",
        locality="Norwalk",
        region="Connecticut",
        postal_code="06850",
        country="United States",
        firm_description=LocationResourceFirmDescription(None),
        email_domains=["foo.com"],
        partner_asserted_entity_id="partner_asserted_entity_id_example",
        company_agreement_urls=[
            LocationResourceCompanyAgreementUrl(
                ref="https://example-corp.com/company_agreements.pdf",
            ),
        ],
        managed_locations=[
            LocationResourceReference(
                value="1598276",
                ref="https://api.factset.com/scim/v2/Locations/1598276",
                display="FIN Wealth Management",
            ),
        ],
        managing_location=LocationResourceManagingLocation(None),
        main_location=LocationResourceMainLocation(None),
    ) # LocationResource | Location resource.

    try:
        # Replace a location.
        # example passing only required values which don't have defaults set
        api_response = api_instance.replace_location(id, location_resource)

        pprint(api_response)

    except fds.sdk.ProcuretoPayAPISCIM.ApiException as e:
        print("Exception when calling LocationsApi->replace_location: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **str**| ID of resource. |
 **location_resource** | [**LocationResource**](LocationResource.md)| Location resource. |

### Return type

[**LocationResource**](LocationResource.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: application/scim+json
 - **Accept**: application/scim+json, application/json


### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Success. |  -  |
**400** | Provided resource contains invalid data. |  -  |
**401** | User has not been authenticated. |  -  |
**403** | User is not authorized to use this API. |  -  |
**404** | Location not found. |  -  |
**429** | User is accessing this API too frequently. |  -  |
**500** | Internal server error. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

