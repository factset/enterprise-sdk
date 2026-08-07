
# flake8: noqa

# Import all APIs into this package.
# If you have many APIs here with many many models used in each API this may
# raise a `RecursionError`.
# In order to avoid this, import only the API that you directly need like:
#
#   from .api.as_reported_economics_api import AsReportedEconomicsApi
#
# or import this package, but before doing it, use:
#
#   import sys
#   sys.setrecursionlimit(n)

# Import APIs into API package:
from fds.sdk.FactSetMacroeconomics.api.as_reported_economics_api import AsReportedEconomicsApi
from fds.sdk.FactSetMacroeconomics.api.economic_events_calendar_api import EconomicEventsCalendarApi
from fds.sdk.FactSetMacroeconomics.api.reference_data_api import ReferenceDataApi
