
# flake8: noqa

# Import all APIs into this package.
# If you have many APIs here with many many models used in each API this may
# raise a `RecursionError`.
# In order to avoid this, import only the API that you directly need like:
#
#   from .api.optimizations_api import OptimizationsApi
#
# or import this package, but before doing it, use:
#
#   import sys
#   sys.setrecursionlimit(n)

# Import APIs into API package:
from fds.sdk.AxiomaEquityOptimizer.api.optimizations_api import OptimizationsApi
from fds.sdk.AxiomaEquityOptimizer.api.strategy_documents_api import StrategyDocumentsApi
