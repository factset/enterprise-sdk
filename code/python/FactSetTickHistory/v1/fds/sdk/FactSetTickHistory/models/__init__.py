# flake8: noqa

# import all models into this package
# if you have many models here with many references from one model to another this may
# raise a RecursionError
# to avoid this, import only the models that you directly need like:
# from from fds.sdk.FactSetTickHistory.model.pet import Pet
# or import this package, but before doing it, use:
# import sys
# sys.setrecursionlimit(n)

from fds.sdk.FactSetTickHistory.model.data import Data
from fds.sdk.FactSetTickHistory.model.get_files_error_detail import GetFilesErrorDetail
from fds.sdk.FactSetTickHistory.model.get_files_response import GetFilesResponse
from fds.sdk.FactSetTickHistory.model.get_files_status import GetFilesStatus
from fds.sdk.FactSetTickHistory.model.meta import Meta
from fds.sdk.FactSetTickHistory.model.pagination import Pagination
from fds.sdk.FactSetTickHistory.model.partial import Partial
from fds.sdk.FactSetTickHistory.model.request_file_error_details import RequestFileErrorDetails
from fds.sdk.FactSetTickHistory.model.request_files_response import RequestFilesResponse
from fds.sdk.FactSetTickHistory.model.request_filestatus import RequestFilestatus
