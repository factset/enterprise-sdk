
# flake8: noqa

# Import all APIs into this package.
# If you have many APIs here with many many models used in each API this may
# raise a `RecursionError`.
# In order to avoid this, import only the API that you directly need like:
#
#   from .api.branches_api import BranchesApi
#
# or import this package, but before doing it, use:
#
#   import sys
#   sys.setrecursionlimit(n)

# Import APIs into API package:
from fds.sdk.FactSetBanks.api.branches_api import BranchesApi
from fds.sdk.FactSetBanks.api.deposit_rates_api import DepositRatesApi
from fds.sdk.FactSetBanks.api.exposure_api import ExposureApi
from fds.sdk.FactSetBanks.api.filings_api import FilingsApi
from fds.sdk.FactSetBanks.api.financials_api import FinancialsApi
from fds.sdk.FactSetBanks.api.metrics_api import MetricsApi
from fds.sdk.FactSetBanks.api.specialty_finance_api import SpecialtyFinanceApi
from fds.sdk.FactSetBanks.api.ubpr_performance_api import UBPRPerformanceApi
