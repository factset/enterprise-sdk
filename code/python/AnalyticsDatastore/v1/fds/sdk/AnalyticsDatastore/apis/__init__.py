
# flake8: noqa

# Import all APIs into this package.
# If you have many APIs here with many many models used in each API this may
# raise a `RecursionError`.
# In order to avoid this, import only the API that you directly need like:
#
#   from .api.documents_api import DocumentsApi
#
# or import this package, but before doing it, use:
#
#   import sys
#   sys.setrecursionlimit(n)

# Import APIs into API package:
from fds.sdk.AnalyticsDatastore.api.documents_api import DocumentsApi
from fds.sdk.AnalyticsDatastore.api.mappings_api import MappingsApi
from fds.sdk.AnalyticsDatastore.api.objects_api import ObjectsApi
