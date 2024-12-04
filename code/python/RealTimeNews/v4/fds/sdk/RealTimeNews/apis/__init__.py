
# flake8: noqa

# Import all APIs into this package.
# If you have many APIs here with many many models used in each API this may
# raise a `RecursionError`.
# In order to avoid this, import only the API that you directly need like:
#
#   from .api.basic_api import BasicApi
#
# or import this package, but before doing it, use:
#
#   import sys
#   sys.setrecursionlimit(n)

# Import APIs into API package:
from fds.sdk.RealTimeNews.api.basic_api import BasicApi
from fds.sdk.RealTimeNews.api.category_api import CategoryApi
from fds.sdk.RealTimeNews.api.news_api import NewsApi
