# flake8: noqa

# import all models into this package
# if you have many models here with many references from one model to another this may
# raise a RecursionError
# to avoid this, import only the models that you directly need like:
# from from fds.sdk.StandardDatafeed.model.pet import Pet
# or import this package, but before doing it, use:
# import sys
# sys.setrecursionlimit(n)

from fds.sdk.StandardDatafeed.model.error_example import ErrorExample
from fds.sdk.StandardDatafeed.model.error_response import ErrorResponse
from fds.sdk.StandardDatafeed.model.historical_file import HistoricalFile
from fds.sdk.StandardDatafeed.model.historical_file_object import HistoricalFileObject
from fds.sdk.StandardDatafeed.model.historical_file_object_object import HistoricalFileObjectObject
from fds.sdk.StandardDatafeed.model.list_file import ListFile
from fds.sdk.StandardDatafeed.model.list_file_object import ListFileObject
from fds.sdk.StandardDatafeed.model.list_file_object_object import ListFileObjectObject
from fds.sdk.StandardDatafeed.model.list_schema import ListSchema
from fds.sdk.StandardDatafeed.model.list_schema_object import ListSchemaObject
from fds.sdk.StandardDatafeed.model.meta import Meta
from fds.sdk.StandardDatafeed.model.pagination import Pagination
from fds.sdk.StandardDatafeed.model.schema_detail import SchemaDetail
from fds.sdk.StandardDatafeed.model.schema_detail_object import SchemaDetailObject
