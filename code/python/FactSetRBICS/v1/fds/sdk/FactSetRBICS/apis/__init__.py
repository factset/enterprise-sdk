
# flake8: noqa

# Import all APIs into this package.
# If you have many APIs here with many many models used in each API this may
# raise a `RecursionError`.
# In order to avoid this, import only the API that you directly need like:
#
#   from .api.entity_api import EntityApi
#
# or import this package, but before doing it, use:
#
#   import sys
#   sys.setrecursionlimit(n)

# Import APIs into API package:
from fds.sdk.FactSetRBICS.api.entity_api import EntityApi
from fds.sdk.FactSetRBICS.api.industry_api import IndustryApi
from fds.sdk.FactSetRBICS.api.structure_api import StructureApi
from fds.sdk.FactSetRBICS.api.trade_names_api import TradeNamesApi
