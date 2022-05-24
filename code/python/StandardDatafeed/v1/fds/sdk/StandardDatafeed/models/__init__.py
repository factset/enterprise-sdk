# flake8: noqa

# import all models into this package
# if you have many models here with many references from one model to another this may
# raise a RecursionError
# to avoid this, import only the models that you directly need like:
# from from fds.sdk.StandardDatafeed.model.pet import Pet
# or import this package, but before doing it, use:
# import sys
# sys.setrecursionlimit(n)

from fds.sdk.StandardDatafeed.model.data import Data
from fds.sdk.StandardDatafeed.model.list_files200_response import ListFiles200Response
from fds.sdk.StandardDatafeed.model.list_files400_response import ListFiles400Response
from fds.sdk.StandardDatafeed.model.list_schema200_response import ListSchema200Response
from fds.sdk.StandardDatafeed.model.list_schema400_response import ListSchema400Response
from fds.sdk.StandardDatafeed.model.meta import Meta
from fds.sdk.StandardDatafeed.model.pagination import Pagination
from fds.sdk.StandardDatafeed.model.partial import Partial
