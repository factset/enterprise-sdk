
# flake8: noqa

# Import all APIs into this package.
# If you have many APIs here with many many models used in each API this may
# raise a `RecursionError`.
# In order to avoid this, import only the API that you directly need like:
#
#   from .api.sdf_and_qfl_content_library_api import SDFAndQFLContentLibraryApi
#
# or import this package, but before doing it, use:
#
#   import sys
#   sys.setrecursionlimit(n)

# Import APIs into API package:
from fds.sdk.StandardDatafeed.api.sdf_and_qfl_content_library_api import SDFAndQFLContentLibraryApi
from fds.sdk.StandardDatafeed.api.schema_api import SchemaApi
