
# flake8: noqa

# Import all APIs into this package.
# If you have many APIs here with many many models used in each API this may
# raise a `RecursionError`.
# In order to avoid this, import only the API that you directly need like:
#
#   from .api.create_api import CreateApi
#
# or import this package, but before doing it, use:
#
#   import sys
#   sys.setrecursionlimit(n)

# Import APIs into API package:
from fds.sdk.OFDB.api.create_api import CreateApi
from fds.sdk.OFDB.api.modify_api import ModifyApi
from fds.sdk.OFDB.api.view_api import ViewApi
