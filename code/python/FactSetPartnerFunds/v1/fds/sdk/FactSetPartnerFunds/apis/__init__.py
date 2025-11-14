
# flake8: noqa

# Import all APIs into this package.
# If you have many APIs here with many many models used in each API this may
# raise a `RecursionError`.
# In order to avoid this, import only the API that you directly need like:
#
#   from .api.canadian_mutual_fund_data_from_fundata_api import CanadianMutualFundDataFromFundataApi
#
# or import this package, but before doing it, use:
#
#   import sys
#   sys.setrecursionlimit(n)

# Import APIs into API package:
from fds.sdk.FactSetPartnerFunds.api.canadian_mutual_fund_data_from_fundata_api import CanadianMutualFundDataFromFundataApi
