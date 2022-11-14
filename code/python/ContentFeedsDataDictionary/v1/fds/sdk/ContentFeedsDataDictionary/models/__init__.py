# flake8: noqa

# import all models into this package
# if you have many models here with many references from one model to another this may
# raise a RecursionError
# to avoid this, import only the models that you directly need like:
# from from fds.sdk.ContentFeedsDataDictionary.model.pet import Pet
# or import this package, but before doing it, use:
# import sys
# sys.setrecursionlimit(n)

from fds.sdk.ContentFeedsDataDictionary.model.api_endpoint import ApiEndpoint
from fds.sdk.ContentFeedsDataDictionary.model.basic_search_request import BasicSearchRequest
from fds.sdk.ContentFeedsDataDictionary.model.basic_search_response import BasicSearchResponse
from fds.sdk.ContentFeedsDataDictionary.model.basic_search_response_results import BasicSearchResponseResults
from fds.sdk.ContentFeedsDataDictionary.model.data_item import DataItem
from fds.sdk.ContentFeedsDataDictionary.model.navigator_sources_response import NavigatorSourcesResponse
from fds.sdk.ContentFeedsDataDictionary.model.product import Product
from fds.sdk.ContentFeedsDataDictionary.model.reference_group import ReferenceGroup
from fds.sdk.ContentFeedsDataDictionary.model.table import Table
from fds.sdk.ContentFeedsDataDictionary.model.table_code_field_info_response import TableCodeFieldInfoResponse
from fds.sdk.ContentFeedsDataDictionary.model.table_code_info import TableCodeInfo
from fds.sdk.ContentFeedsDataDictionary.model.table_field import TableField
