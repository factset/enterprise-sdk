
# flake8: noqa

# Import all APIs into this package.
# If you have many APIs here with many many models used in each API this may
# raise a `RecursionError`.
# In order to avoid this, import only the API that you directly need like:
#
#   from .api.intelligent_document_service_api import IntelligentDocumentServiceApi
#
# or import this package, but before doing it, use:
#
#   import sys
#   sys.setrecursionlimit(n)

# Import APIs into API package:
from fds.sdk.VectorData.api.intelligent_document_service_api import IntelligentDocumentServiceApi
from fds.sdk.VectorData.api.vector_api import VectorApi
from fds.sdk.VectorData.api.vector_search_api import VectorSearchApi
