
# flake8: noqa

# Import all APIs into this package.
# If you have many APIs here with many many models used in each API this may
# raise a `RecursionError`.
# In order to avoid this, import only the API that you directly need like:
#
#   from .api.groups_api import GroupsApi
#
# or import this package, but before doing it, use:
#
#   import sys
#   sys.setrecursionlimit(n)

# Import APIs into API package:
from fds.sdk.ProcuretoPaySCIM.api.groups_api import GroupsApi
from fds.sdk.ProcuretoPaySCIM.api.locations_api import LocationsApi
from fds.sdk.ProcuretoPaySCIM.api.products_api import ProductsApi
from fds.sdk.ProcuretoPaySCIM.api.schemas_api import SchemasApi
from fds.sdk.ProcuretoPaySCIM.api.server_configuration_api import ServerConfigurationApi
from fds.sdk.ProcuretoPaySCIM.api.users_api import UsersApi
from fds.sdk.ProcuretoPaySCIM.api.vermilion_groups_api import VermilionGroupsApi
from fds.sdk.ProcuretoPaySCIM.api.vermilion_users_api import VermilionUsersApi
