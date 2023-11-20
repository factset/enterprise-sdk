# flake8: noqa

# import all models into this package
# if you have many models here with many references from one model to another this may
# raise a RecursionError
# to avoid this, import only the models that you directly need like:
# from from fds.sdk.AnalyticsDatastore.model.pet import Pet
# or import this package, but before doing it, use:
# import sys
# sys.setrecursionlimit(n)

from fds.sdk.AnalyticsDatastore.model.document_list_response import DocumentListResponse
from fds.sdk.AnalyticsDatastore.model.document_model import DocumentModel
from fds.sdk.AnalyticsDatastore.model.document_request import DocumentRequest
from fds.sdk.AnalyticsDatastore.model.document_request_data import DocumentRequestData
from fds.sdk.AnalyticsDatastore.model.meta_model import MetaModel
from fds.sdk.AnalyticsDatastore.model.meta_model_pagination import MetaModelPagination
from fds.sdk.AnalyticsDatastore.model.meta_request_model import MetaRequestModel
from fds.sdk.AnalyticsDatastore.model.meta_request_model_pagination import MetaRequestModelPagination
from fds.sdk.AnalyticsDatastore.model.product_type_list_response import ProductTypeListResponse
from fds.sdk.AnalyticsDatastore.model.string_or_number_tag_value import StringOrNumberTagValue
from fds.sdk.AnalyticsDatastore.model.tag_filter_model import TagFilterModel
from fds.sdk.AnalyticsDatastore.model.tag_filter_model_data import TagFilterModelData
from fds.sdk.AnalyticsDatastore.model.tag_list_response import TagListResponse
from fds.sdk.AnalyticsDatastore.model.tag_model import TagModel
from fds.sdk.AnalyticsDatastore.model.tag_response import TagResponse
from fds.sdk.AnalyticsDatastore.model.tag_values_list_response import TagValuesListResponse
