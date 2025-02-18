
# flake8: noqa

# Import all APIs into this package.
# If you have many APIs here with many many models used in each API this may
# raise a `RecursionError`.
# In order to avoid this, import only the API that you directly need like:
#
#   from .api.books___creation_api import BooksCreationApi
#
# or import this package, but before doing it, use:
#
#   import sys
#   sys.setrecursionlimit(n)

# Import APIs into API package:
from fds.sdk.BookBuilder.api.books___creation_api import BooksCreationApi
from fds.sdk.BookBuilder.api.books___fetch_api import BooksFetchApi
from fds.sdk.BookBuilder.api.custom_documents___fetch_api import CustomDocumentsFetchApi
from fds.sdk.BookBuilder.api.custom_documents___upload_api import CustomDocumentsUploadApi
from fds.sdk.BookBuilder.api.templates___creation_api import TemplatesCreationApi
from fds.sdk.BookBuilder.api.templates___fetch_api import TemplatesFetchApi
