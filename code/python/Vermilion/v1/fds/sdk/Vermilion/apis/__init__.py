
# flake8: noqa

# Import all APIs into this package.
# If you have many APIs here with many many models used in each API this may
# raise a `RecursionError`.
# In order to avoid this, import only the API that you directly need like:
#
#   from .api.datasource_api import DatasourceApi
#
# or import this package, but before doing it, use:
#
#   import sys
#   sys.setrecursionlimit(n)

# Import APIs into API package:
from fds.sdk.Vermilion.api.datasource_api import DatasourceApi
from fds.sdk.Vermilion.api.entity_api import EntityApi
from fds.sdk.Vermilion.api.report_api import ReportApi
from fds.sdk.Vermilion.api.report_instance_api import ReportInstanceApi
from fds.sdk.Vermilion.api.scim_api import SCIMApi
from fds.sdk.Vermilion.api.version_api import VersionApi
