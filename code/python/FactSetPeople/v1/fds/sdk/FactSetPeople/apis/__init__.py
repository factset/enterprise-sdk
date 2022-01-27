
# flake8: noqa

# Import all APIs into this package.
# If you have many APIs here with many many models used in each API this may
# raise a `RecursionError`.
# In order to avoid this, import only the API that you directly need like:
#
#   from .api.company_api import CompanyApi
#
# or import this package, but before doing it, use:
#
#   import sys
#   sys.setrecursionlimit(n)

# Import APIs into API package:
from fds.sdk.FactSetPeople.api.company_api import CompanyApi
from fds.sdk.FactSetPeople.api.job_history_api import JobHistoryApi
from fds.sdk.FactSetPeople.api.profiles_api import ProfilesApi
