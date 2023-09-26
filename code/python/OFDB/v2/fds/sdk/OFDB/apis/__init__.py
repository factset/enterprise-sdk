
# flake8: noqa

# Import all APIs into this package.
# If you have many APIs here with many many models used in each API this may
# raise a `RecursionError`.
# In order to avoid this, import only the API that you directly need like:
#
#   from .api.add_api import AddApi
#
# or import this package, but before doing it, use:
#
#   import sys
#   sys.setrecursionlimit(n)

# Import APIs into API package:
from fds.sdk.OFDB.api.add_api import AddApi
from fds.sdk.OFDB.api.create_api import CreateApi
from fds.sdk.OFDB.api.delete_api import DeleteApi
from fds.sdk.OFDB.api.get_api import GetApi
from fds.sdk.OFDB.api.long_running_api import LongRunningApi
from fds.sdk.OFDB.api.update_api import UpdateApi
