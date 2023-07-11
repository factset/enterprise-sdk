# flake8: noqa

# import all models into this package
# if you have many models here with many references from one model to another this may
# raise a RecursionError
# to avoid this, import only the models that you directly need like:
# from from fds.sdk.FactSetTickHistory.model.pet import Pet
# or import this package, but before doing it, use:
# import sys
# sys.setrecursionlimit(n)

from fds.sdk.FactSetTickHistory.model.error_example import ErrorExample
from fds.sdk.FactSetTickHistory.model.files import Files
from fds.sdk.FactSetTickHistory.model.get_files_response_level2 import GetFilesResponseLevel2
from fds.sdk.FactSetTickHistory.model.is_partial import IsPartial
from fds.sdk.FactSetTickHistory.model.level2_request_files_response import Level2RequestFilesResponse
from fds.sdk.FactSetTickHistory.model.meta import Meta
from fds.sdk.FactSetTickHistory.model.pagination import Pagination
from fds.sdk.FactSetTickHistory.model.status import Status
