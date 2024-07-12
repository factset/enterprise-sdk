
# flake8: noqa

# Import all APIs into this package.
# If you have many APIs here with many many models used in each API this may
# raise a `RecursionError`.
# In order to avoid this, import only the API that you directly need like:
#
#   from .api.child_orders_api import ChildOrdersApi
#
# or import this package, but before doing it, use:
#
#   import sys
#   sys.setrecursionlimit(n)

# Import APIs into API package:
from fds.sdk.FactSetTrading.api.child_orders_api import ChildOrdersApi
from fds.sdk.FactSetTrading.api.inbound_orders_api import InboundOrdersApi
from fds.sdk.FactSetTrading.api.parent_orders_api import ParentOrdersApi
