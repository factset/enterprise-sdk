
# flake8: noqa

# Import all APIs into this package.
# If you have many APIs here with many many models used in each API this may
# raise a `RecursionError`.
# In order to avoid this, import only the API that you directly need like:
#
#   from .api.file_manager_audit_api import FileManagerAuditApi
#
# or import this package, but before doing it, use:
#
#   import sys
#   sys.setrecursionlimit(n)

# Import APIs into API package:
from fds.sdk.ProcuretoPayAPISCIM.api.file_manager_audit_api import FileManagerAuditApi
from fds.sdk.ProcuretoPayAPISCIM.api.groups_api import GroupsApi
from fds.sdk.ProcuretoPayAPISCIM.api.locations_api import LocationsApi
from fds.sdk.ProcuretoPayAPISCIM.api.products_api import ProductsApi
from fds.sdk.ProcuretoPayAPISCIM.api.schemas_api import SchemasApi
from fds.sdk.ProcuretoPayAPISCIM.api.server_configuration_api import ServerConfigurationApi
from fds.sdk.ProcuretoPayAPISCIM.api.users_api import UsersApi
from fds.sdk.ProcuretoPayAPISCIM.api.vermilion_groups_api import VermilionGroupsApi
from fds.sdk.ProcuretoPayAPISCIM.api.vermilion_users_api import VermilionUsersApi
