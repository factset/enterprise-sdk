
# flake8: noqa

# Import all APIs into this package.
# If you have many APIs here with many many models used in each API this may
# raise a `RecursionError`.
# In order to avoid this, import only the API that you directly need like:
#
#   from .api.sasb_api import SASBApi
#
# or import this package, but before doing it, use:
#
#   import sys
#   sys.setrecursionlimit(n)

# Import APIs into API package:
from fds.sdk.FactSetESG.api.sasb_api import SASBApi
from fds.sdk.FactSetESG.api.sdg_api import SDGApi
from fds.sdk.FactSetESG.api.sfdr_api import SFDRApi
from fds.sdk.FactSetESG.api.spotlights_api import SpotlightsApi
