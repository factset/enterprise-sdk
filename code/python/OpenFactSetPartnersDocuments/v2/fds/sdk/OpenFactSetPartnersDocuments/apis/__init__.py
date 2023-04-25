
# flake8: noqa

# Import all APIs into this package.
# If you have many APIs here with many many models used in each API this may
# raise a `RecursionError`.
# In order to avoid this, import only the API that you directly need like:
#
#   from .api.link_up_api import LinkUpApi
#
# or import this package, but before doing it, use:
#
#   import sys
#   sys.setrecursionlimit(n)

# Import APIs into API package:
from fds.sdk.OpenFactSetPartnersDocuments.api.link_up_api import LinkUpApi
from fds.sdk.OpenFactSetPartnersDocuments.api.luxembourg_api import LuxembourgApi
from fds.sdk.OpenFactSetPartnersDocuments.api.orbit_api import OrbitApi
from fds.sdk.OpenFactSetPartnersDocuments.api.ozmosi_api import OzmosiApi
from fds.sdk.OpenFactSetPartnersDocuments.api.scripts_asia_api import ScriptsAsiaApi
